import logo from './logo.svg';
import './App.css';
import {x, y} from './variaveis.js';
import Titulo from './Titulo';
import MeuComponente from './dica1';
import MeuSite from './dica2';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Titulo texto="Texto através do atributo"></Titulo>
        <p>
          iniciando com react! fácil não é... {x}<br/>
          {y}
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        <p>
          <MeuComponente></MeuComponente>
        </p>

        <p>
          <MeuSite></MeuSite>
        </p>

      </header>
    </div>
  );
}
        //pode passar também atributos através do props
export default App;
