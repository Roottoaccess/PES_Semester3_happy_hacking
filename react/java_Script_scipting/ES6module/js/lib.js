function display(message){ // JSX concept.... Java Script XML
    const el = document.createElement('div');
    el.innerText = message;
    document.body.appendChild(el);
}
export {display};