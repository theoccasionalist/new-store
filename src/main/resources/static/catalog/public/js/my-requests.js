//const xhr = new XMLHttpRequest();
//xhr.onreadystatechange = function() {
//	if (xhr.readyState === 4 && xhr.status === 200) {
//		const res = JSON.parse(xhr.responseText)
//		const productsContainer = document.querySelector('#products-container')
//
//		for (let product of res) {
//			const productContainer = document.createElement('div')
//			const productLink = document.createElement('a')
//			productLink.setAttribute('href', '/catalog/product.html');
//			productLink.innerText = product.name
//			productContainer.appendChild(productLink)
//			productsContainer.appendChild(productContainer)
//		}
//	}
//}
//xhr.open('GET', '/products', true)
//xhr.send()

const productAddButton = document.querySelector('.add-product button'),
	productAddInput = document.querySelector('.add-product input'),
	productsList = document.querySelector('.products-list ul')
const xhr = new XMLHttpRequest()
xhr.onreadystatechange = function() {
	if (xhr.readyState === 4 && xhr.status === 200) {
		const res = xhr.responseText
		productsList.innerHTML = res
	}
}

productAddButton.addEventListener('click', function() {
	postProducts(productAddInput.value)
})

function getProducts() {
	xhr.open('GET', '/api/products', true)
	xhr.send()
}
function postProducts(productName) {
	xhr.open('POST', '/products/' + productName, true)
	xhr.send()
}