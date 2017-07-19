# IMDB_Movies
Netmodule, presenter injection using Dagger, MVP and RxJava</br>

AIM: To inject RequestInterface in Interactor_Impl class</br>

1 Create Netmodule to return retrofit object</br>
2 Create AppModule </br>
3 Create Netcomponents and AppComponent</br>
4 Create APIModule to return RequestInterface object</br>
5 Create APIComponent</br>
6 Inject both components in Application class</br>
7 Create a method within Interface</br>
</br>
public void initiateInjectionGraph(APIComponent apiComponent);</br>
</br>
8 Overide this method in Interactor_Impl class; </br>
 @Override</br>
    public void initiateInjectionGraph(APIComponent apiComponent) {</br>
        apiComponent.inject(this);</br>
    }</br>
    </br>
8 Create a method in Presenter_Impl class to call interactor injection</br>

  public void injectForData(APIComponent apiComponent) {</br>
        movieList_interactor.initiateInjectionGraph(apiComponent);</br>
    }</br>
</br>
9 Call the injection from the Activity/ Fragment</br>
 private void setInjections() {</br>
        APIComponent apiComponent = ((MyMoviesApp)getActivity().getApplication()).getApiComponent();</br>
        presenter_movieList.injectForData(apiComponent);</br>
    }</br>
</br>
10 Inject the RequestInterface in the Interactor_impl class</br>
