const url = 'http://localhost:8080/api/books';
const data = {
  id: 1,
  title: 'Book Title',
  author: 'Author Name'
};

fetch(url, {
  method: 'POST',
  headers: {
    'Content-Type': 'application/json'
  },
  body: JSON.stringify(data)
})
  .then(response => response.json())
  .then(book => {
    // Handle the response from the server
    console.log('New Book:', book);
  })
  .catch(error => {
    // Handle any errors that occurred during the request
    console.error('Error:', error);
  });
