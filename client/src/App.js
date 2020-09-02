import React , {useEffect, useState} from 'react';
import './App.css';
import axios from 'axios';

function App() {
  const [books, setBooks] = useState(null);
  async function getBooks() {
    try{
      const res = await axios.get("http://localhost:8181/book/listall");
      setBooks(res.data)
    }catch(e){
      console.error(e, e.message);
    }
  }
  
  useEffect( ()=> {
    getBooks();

  }, [] ) // [] prevents the app to continue to refresh

  const [input, setInput] = useState(null);

  function handleChange(e) {
    const { id, value } = e.target;
    setInput({...input, [id]:value })
    console.log("coming from handle change",input)
  }

  async function handleSubmit(e) {
    e.preventDefault();

    try {
      await axios.post("http://localhost:8181/book", input);

    }catch(e) {
      console.error(e, e.message)
    }
    getBooks()
  }

  return (
    <div className="App">
        <form 
          className="form-container" 
          onChange={(e) => handleChange(e)}
          onSubmit={(e) => handleSubmit(e)}
        >
          <label> 
            title: <input type="text"  id="title" />
          </label>
          <label> 
            author: <input type="text" id="author"/>
          </label>
          <label> 
            plot summary: <input type="text" id="plotSummary"/>
          </label>
          <label> 
            publishing house: <input type="text"  id="publishingHouse"/>
          </label>
          <label> 
            genre: <input type="text" id="genre"/>
          </label>
          <label> 
            cover image: <input type="text" id="coverImg"/>
          </label>
          <label> 
            price: <input type="text" id="price" />
          </label>

          <input type="submit" value="Create New Book"  />
        </form>

        <h3>Books:</h3> 
        {books ?  books.map(book => <Book book={book} />) : "Loading ..."  }

    </div>
  );
}

function Book (props) {
  return(
    <div>
      <h1> The title of the book is: { props.book.title} </h1>
    </div>
  )
}

export default App;
