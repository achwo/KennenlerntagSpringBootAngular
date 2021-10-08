import './App.css';
import { useState } from 'react';
import Chart from './Chart/Chart';


function App() {

  const [firstMeasurement, setFirstMeasurement] = useState('')
  const [secondMeasurement, setSecondMeasurement] = useState('')
  const [thirdMeasurement, setThirdMeasurement] = useState('')

  const sendMeasurement = event => {

    event.preventDefault();

    const url = '/measurement';
    const requestOptions = {
      method: 'POST',
      headers: { 'Content-Type': 'application/json'},
      body: JSON.stringify([firstMeasurement, secondMeasurement, thirdMeasurement])
    };

    fetch(url, requestOptions);
  }

  return (
    <div>
    <form onSubmit={sendMeasurement} >
        <div>
          <input required onChange={event => setFirstMeasurement(event.target.value)} value={firstMeasurement} placeholder="Wert 1 *"/>
        </div>
        <div>
          <input required onChange={event => setSecondMeasurement(event.target.value)} value={secondMeasurement} placeholder="Wert 2 *"/>
        </div>
        <div>
            <input required onChange={event => setThirdMeasurement(event.target.value)} value={thirdMeasurement} placeholder="Wert 3 *"/>
        </div>
        <button id="submit" type="submit" value="Absenden">Absenden</button>
      </form>
      <Chart />   
    </div>
  );
}

export default App;
