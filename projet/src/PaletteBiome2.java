import java.awt.Color;
import java.util.List;

public class PaletteBiome2 {
    List<Color> biome;
    
    // Définition des couleurs des biomes
    private static final Color TUNDRA = new Color(71, 70, 61);
    private static final Color TAIGA = new Color(43, 50, 35);
    private static final Color FORET_TEMPEREE = new Color(59, 66, 43);
    private static final Color FORET_TROPICALE = new Color(46, 64, 34);
    private static final Color SAVANE = new Color(84, 106, 70);
    private static final Color PRAIRIE = new Color(104, 95, 82);
    private static final Color DESERT = new Color(152, 140, 120);
    private static final Color GLACIER = new Color(200, 200, 200);
    private static final Color EAU_PEU_PROFONDE = new Color(49, 83, 100);
    private static final Color EAU_PROFONDE = new Color(12, 31, 47);
    private static final Color PLAGE = new Color(240, 230, 140);
    private static final Color MANGROVE = new Color(34, 139, 34);
    private static final Color MARAIS = new Color(85, 107, 47);
    private static final Color FORET_TROPICALE_HUMIDE = new Color(60, 179, 113);
    private static final Color FORET_BOREALE = new Color(173, 216, 230);
    private static final Color BOIS = new Color(165, 42, 42);
    private static final Color CULTURE = new Color(255, 255, 0);
    private static final Color VILLE = new Color(128, 0, 0);

    // Palette par défaut avec toutes les couleurs définies
    final static PaletteBiome DEFAULT = new PaletteBiome(List.of(
            TUNDRA,
            TAIGA,
            FORET_TEMPEREE,
            FORET_TROPICALE,
            SAVANE,
            PRAIRIE,
            DESERT,
            GLACIER,
            EAU_PEU_PROFONDE,
            EAU_PROFONDE,
            PLAGE,
            MANGROVE,
            MARAIS,
            FORET_TROPICALE_HUMIDE,
            FORET_BOREALE,
            BOIS,
            CULTURE,
            VILLE
    ));

    public PaletteBiome2(List<Color> biomes) {
        this.biome = biomes;
    }
}