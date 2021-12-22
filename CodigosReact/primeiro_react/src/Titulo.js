import React, {Component} from "react";

//function Titulo(){
//return<h1>Esse é meu título</h1>
//}

//export default Titulo;

//retorna uma função html, vira uma tag html

class Titulo extends Component{
    constructor(props){
        super(props);
        //this.elementoH1 = React.createRef();
        //referencia para o H1

        this.state = {
            texto: "Meu texto padrão estado"
        }
    }
//componentDidMount(){
    //função eh chamada qndo o componente aparece na tela
  //  this.elementoH1.current.innerHTML = "outro texto";
//}

    render(){
        return(
            //<h1 ref={this.elementoH1}>Texto de exemplo</h1>
            <h1>{this.state.texto}</h1>
        )
    }
} 
export default Titulo;

//permite criar variaveis no componente, mais complexo