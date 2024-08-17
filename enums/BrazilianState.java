package enums;

import java.util.List;

public enum BrazilianState {
  ACRE("Acre", "AC"),
  ALAGOAS("Alagoas", "AL"),
  AMAPA("Amapá", "AP"),
  AMAZONAS("Amazonas", "AM"),
  BAHIA("Bahia", "BA"),
  CEARA("Ceará", "CE"),
  DISTRITO_FEDERAL("Distrito Federal", "DF"),
  ESPIRITO_SANTO("Espírito Santo", "ES"),
  GOIAS("Goiás", "GO"),
  MARANHAO("Maranhão", "MA"),
  MATO_GROSSO("Mato Grosso", "MT"),
  MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"),
  MINAS_GERAIS("Minas Gerais", "MG"),
  PARA("Para", "PA"),
  PARAIBA("Paraíba", "PB"),
  PARANA("Paraná", "PR"),
  PERNAMBUCO("Pernambuco", "PE"),
  PIAUI("Piauí", "PI"),
  RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
  RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"),
  RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"),
  RONDONIA("Rondônia", "RO"),
  RORAIMA("Roraima", "RR"),
  SANTA_CATARINA("Santa Catarina", "SC"),
  SAO_PAULO("São Paulo", "SP"),
  SERGIPE("Sergipe", "SE"),
  TOCANTINS("Tocantins", "TO");

  private String name;
  private String abbreviation;

  BrazilianState(String name, String abbreviation) {
    this.name = name;
    this.abbreviation = abbreviation;
  }

  public String getName() {
    return this.name;
  }

  public String getAbbreviation() {
    return this.abbreviation;
  }

  public static List<BrazilianState> getStates() {
    return List.of(BrazilianState.values());
  }

  public static BrazilianState getStateByAbbreviation(String abbreviation) {
    for (BrazilianState state : BrazilianState.values()) {
      if (state.getAbbreviation().equals(abbreviation)) {
        return state;
      }
    }
    return null;
  }
}
