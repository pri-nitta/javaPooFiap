import React, {Component} from 'react';

class MeuComponente extends Component{
    render(){
        let f = <a href="http://www.urbanaflor.com.br">Urbana Flor</a>;
        let i = <a href="https://www.instagram.com/urbanaflor_/">Urbana Flor</a>;

        return <div>
            <div>Site da {f}</div>
            <div>Instagram da {i}</div>
        </div>;
    }
}
export default MeuComponente;