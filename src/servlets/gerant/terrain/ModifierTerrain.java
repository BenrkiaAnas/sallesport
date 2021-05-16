package servlets.gerant.terrain;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.TerrainRepository;
import entities.Terrain;

/**
 * Servlet implementation class ModifierTerrain
 */
@WebServlet("/modifierTerrain")
public class ModifierTerrain extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierTerrain() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long id = Long.parseLong(request.getParameter("update"));
		
		TerrainRepository repository = new TerrainRepository();
		Terrain terrain =repository.find(id);	
		request.setAttribute("terrain", terrain);
		request.getRequestDispatcher("Gerant/Terrain/modifier.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		TerrainRepository terrains = new TerrainRepository();		
		Long id = Long.parseLong(request.getParameter("update"));		
		Terrain terrain = terrains.find(id);
		String nom = request.getParameter("nom");
		Double prix = Double.parseDouble(request.getParameter("prix"));
		String image = terrain.getImg_ter();
		String statut = request.getParameter("statut");
		Part part = request.getPart("file");
		String filename = part.getSubmittedFileName(); 
		
try (PrintWriter out = response.getWriter()) {
			
			
			if(filename != "")
			{
				//String path = getServletContext().getRealPath("/"+"images"+File.separator+filename);
				String path = System.getenv("HOMEDRIVE")+System.getenv("HOMEPATH")+File.separator+"eclipse"+File.separator+"salleSport"+File.separator+"WebContent"+File.separator+"images"+File.separator+filename;
				InputStream ins = part.getInputStream();
				uploadFile(ins, path);
				System.out.println();
				
			}
			else {
				
				filename = image;
				
			}
			
			terrain.setNom_ter(nom);
			terrain.setPrix(prix);
			System.out.println(filename);
			if(statut == null)
			{
				terrain.setStatut(0l);
			}else {
				terrain.setStatut(1l);
			}
			
			terrain.setImg_ter(filename);
			terrains.edit(terrain);
			
			
			System.out.println("hna");
			System.out.println(request.getContextPath());
			response.sendRedirect(request.getContextPath() + "/listeTerrain");
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	public boolean uploadFile(InputStream is, String path)
	{
		boolean test = false;
		
		try {
			byte[] byt = new byte[is.available()];
			is.read();
			FileOutputStream fops = new FileOutputStream(path);
			fops.write(byt);
			fops.flush();
			fops.close();
			
			test = true;
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		return test;

			
			
		}

}
