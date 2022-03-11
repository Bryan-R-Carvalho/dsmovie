import {ReactComponent as GithubIcon}from 'assets/img/gitLogo.svg';
import './styles.css';
function Navbar(){
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="http://github.com/Bryan-R-Carvalho">
                        <div className="dsmovie-contact-container">
                            <GithubIcon/>
                            <p className="dsmovie-contact-link">/Braia</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    )
}
export default Navbar;