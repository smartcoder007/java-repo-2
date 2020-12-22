import React from "react";
import { BrowserRouter } from "react-router-dom";
import { RouterConfig } from "./navigation/RouterConfig";
import { Header } from "./components/Header";
import { Footer } from "./components/Footer";
import { Provider } from "react-redux";

import { store } from "./redux/store";

const App = () => {
  return (
    <Provider store={store}>
      <Header></Header>
      <BrowserRouter>
        <RouterConfig></RouterConfig>
      </BrowserRouter>
      <Footer></Footer>
    </Provider>
  );
};

export default App;
