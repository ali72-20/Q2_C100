package solid.depndancy_inversions;

public class Repo {
    private LocalDataBaseServices localDataBaseServices;
    private RemoteDataBaseServices remoteDataBaseServices;

    public Repo(LocalDataBaseServices localDataBaseServices, RemoteDataBaseServices remoteDataBaseServices){
        this.remoteDataBaseServices = remoteDataBaseServices;
        this.localDataBaseServices = localDataBaseServices;
    }
}
