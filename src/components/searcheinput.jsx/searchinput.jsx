function SearchInput(props) {
    const onChange = props.onChange;
  
    return (
      <div className="mb-3">
        <label className="form-label">Search products</label>
        <input
          type="text"
          className="form-control"
          onChange={onChange}
        />
      </div>
    )
  }
  
  export default SearchInput;