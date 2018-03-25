const button = document.getElementById('button');
const add = document.getElementById('add');

button.addEventListener('click', function() {
	const p = document.createElement("p");
	const text = document.createTextNode("Item Added To Cart");
	p.appendChild(text);
	add.appendChild(p);
});