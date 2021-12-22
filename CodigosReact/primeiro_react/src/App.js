import logo from './logo.svg';
import './App.css';
import {x, y} from './variaveis.js';
import Titulo from './Titulo';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Titulo texto="Texto através do atributo"></Titulo>
        //pode passar também atributos através do props
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
      </header>
    </div>
  );
}

export default App;
