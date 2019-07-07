package b_22_06.libraryCatalog;

public class Testare {
    public static void main(String[] args) {
        // TODO Auto-generated metho
        Nuvele nuvele = new Nuvele("Neamul Soimarestilor");
        nuvele.adaugaCarti("Ion");
        nuvele.adaugaCarti("Cel mai iubit dintre pamanteni");
        nuvele.adaugaCarti("Halkidiki");

        AlbumeArta albume = new AlbumeArta("Picasso");
        albume.adaugaCarti("Rembrandt");
        albume.adaugaCarti("Hagi");
        albume.adaugaCarti("Caracuda");

        albume.stergeCarti("Picasso");



    }
}
