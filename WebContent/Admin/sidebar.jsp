<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="app-sidebar sidebar-shadow">
                <div class="app-header__logo">
                    <div class="logo-src"></div>
                    <div class="header__pane ml-auto">
                        <div>
                            <button type="button" class="hamburger close-sidebar-btn hamburger--elastic" data-class="closed-sidebar">
                                <span class="hamburger-box">
                                    <span class="hamburger-inner"></span>
                                </span>
                            </button>
                        </div>
                    </div>
                </div>
                <div class="app-header__mobile-menu">
                    <div>
                        <button type="button" class="hamburger hamburger--elastic mobile-toggle-nav">
                            <span class="hamburger-box">
                                <span class="hamburger-inner"></span>
                            </span>
                        </button>
                    </div>
                </div>
                <div class="app-header__menu">
                    <span>
                        <button type="button" class="btn-icon btn-icon-only btn btn-primary btn-sm mobile-toggle-header-nav">
                            <span class="btn-icon-wrapper">
                                <i class="fa fa-ellipsis-v fa-w-6"></i>
                            </span>
                        </button>
                    </span>
                </div>    <div class="scrollbar-sidebar">
                    <div class="app-sidebar__inner">
                        <ul class="vertical-nav-menu">
                            <li  class="mm-active"      >
                                <a href="#">
                                    <i class="metismenu-icon pe-7s-home"></i>Acceuil
                                </a>
                                
                            </li>
                            <li>
                                <a href="#">
                                    <i class="metismenu-icon pe-7s-pin"></i>Plans
                                    <i class="metismenu-state-icon pe-7s-angle-down caret-left"></i>
                                </a>
                                <ul  
                                      
                                    >
                                    <li>
                                        <a href="/salleSport/listPlan" >
                                            <i class="metismenu-icon"></i> Liste Plans
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/salleSport/createPlan" >
                                            <i class="metismenu-icon"></i>Crée Plan
                                        </a>
                                    </li>
                                    
                                </ul>
                            </li>
                            
                            <li>
                                <a href="#">
                                    <i class="metismenu-icon pe-7s-more"></i>Catégories
                                    <i class="metismenu-state-icon pe-7s-angle-down caret-left"></i>
                                </a>
                                <ul  
                                      
                                    >
                                    <li>
                                        <a href="/salleSport/listeCategorie" >
                                            <i class="metismenu-icon"></i> Liste Catégories
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/salleSport/createCategorie" >
                                            <i class="metismenu-icon"></i>Crée Catégorie
                                        </a>
                                    </li>
                                    
                                </ul>
                            </li>
                            
                            <li>
                                <a href="/salleSport/listeGerant">
                                    <i class="metismenu-icon pe-7s-users"></i>Gérants
                                </a>
                                
                            </li>
                            <li>
                                <a href="#">
                                    <i class="metismenu-icon pe-7s-sun"></i>Espaces Sportif
                                    <i class="metismenu-state-icon pe-7s-angle-down caret-left"></i>
                                </a>
                                <ul  
                                      
                                    >
                                    <li>
                                        <a href="/salleSport/listeEspaceAdmin" >
                                            <i class="metismenu-icon"></i> Liste Espaces
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/salleSport/createEspaceAdmin" >
                                            <i class="metismenu-icon"></i>Crée Espace
                                        </a>
                                    </li>
                                    
                                </ul>
                            </li>
                             <li>
                                <a href="/salleSport/listeTerrainAdmin">
                                    <i class="metismenu-icon pe-7s-ball"></i>Terrain
                                  
                                </a>
                               
                            </li>
                            <li>
                                <a href="/salleSport/listeTournoiAdmin">
                                    <i class="metismenu-icon pe-7s-cup"></i>Tournoi
                                  
                                </a>
                               
                            </li>
                            
                        </ul>
                    </div>
                </div>
            </div>