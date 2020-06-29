import React from 'react' ;
import ReactDom from 'react-dom' ;
import './index.css' ;

import App from './Category' ;

import * as serviceWorker from './serviceWorker' ;

ReactDom.render(<Category />, document.getElementById('root'));



serviceWorker.unregister();




