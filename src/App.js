import React, { useState, useEffect} from 'react';
import './App.css';
import SearchInput from './components/searcheinput.jsx/searchinput';
import ProductsList from './components/products-list/ProductsList';
import Spinner from './components/spinner/Spinner';
import { useEffect } from 'react';

function App () {
  const [products, setProducts] = useState[];
  const [isLoading, setIsLoading] = useState(true);
  const [search, searchinput] = useState('');

  

  

  useEffect (() => {
    fetch('https://api.escuelajs.co/api/v1/products')
      .then(response => response.json())
      .then(data => {
          setProducts: (data);
          setIsLoading (false);
        });
      });
  }

  useEffect(() => {
      console.log ('Updating');
    }, [product]);

    useEffect (()=> {
      return function () {
        console.log ('Unmount');
      }
    }, []);
    
    const searcheinput = () => {
      setProduct(product);
    }

    if(isLoading) {
      return <Spinner />
    }

  const product (events) => {
    return (
      <div className="app">
        <div className="container mt-5">
          <div className="mb-3">
            <label className="form-label">Search products</label>
            <input type="text" className="form-control" />
          </div>
          {this.state.isLoading ? (
            <Spinner />
          ) : (
            <ProductsList products={product} />
          )}
        </div>
      </div >
    );
  }


export default App;
