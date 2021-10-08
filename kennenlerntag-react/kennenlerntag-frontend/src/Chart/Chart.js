import { useEffect, useState } from 'react';
import React from 'react';
import { Chart as ReactChart } from 'react-charts';

function Chart() {

  const [fetchedResponse, setFetchedResponse] = useState(null);

  useEffect(() => {
    const url = '/measurement';
    const requestOptions = {
      method: 'GET',
      headers: { 'Content-Type': 'application/json'}
    };

     fetch(url, requestOptions)
    .then(response => response.json())
    .then(jsonResponse => setFetchedResponse(jsonResponse));
  })

  const data = [
      {
          label: 'Asthma Werte',
          data: fetchedResponse
      }
  ]

  const primaryAxis = React.useMemo(
      () => ({
        getValue: datum => datum.createdAt
          }),[]
  )

  const secondaryAxes = React.useMemo(
    () => [{
        getValue: datum => Math.max(...datum.measuredValues.map(({measuredValue}) => measuredValue))
    }],[]
)

  if(fetchedResponse == null) {
        return ""
  }

  return (
    <ReactChart options={{
        data,
        primaryAxis,
        secondaryAxes
    }} />
  );
}

export default Chart;
