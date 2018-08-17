package avfont.com.aviator.aviatorfontlib;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

import java.io.IOException;

/**
 * Created by Aviator on 4/22/2018. [Tranquilizer]
 */

@SuppressWarnings("ALL")
public final class AvFonts implements FontNames {

    public AvFonts() {
    }


    public static String[] GetFonts(Context context) {
        try {
            String[] s = context.getAssets().list("fonts/");
            if (s != null) {
                if (s.length > 0) {
                    return s;
                }
            }
            return AllFontNames;
        } catch (IOException e) {
            return AllFontNames;
        }
    }

    public static Typeface GetFont(String ttf, Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/" + ttf);
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Alarabiya(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Alarabiya.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface AlMajd(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/ALMajd.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Almohannad(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Almohannad.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface AndroidInsomniaRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Android Insomnia Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface AndroidClock(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/AndroidClock.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Bauhaus(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Bauhaus.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface BowBabyFlo(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/BowBabyFlo.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface CarroisGothicSCRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/CarroisGothicSC-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Cheri(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Cheri.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Comfortaa(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Comfortaa.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface CutiveMono(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/CutiveMono.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface DancingScriptBold(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/DancingScript-Bold.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface DroidSans(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/DroidSans.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface DroidSansBold(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/DroidSans-Bold.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface DroidSansFallback(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/DroidSansFallback.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface DroidSansMono(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/DroidSansMono.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface eightyshades(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/eightyshades.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface FreeSansBold(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/FreeSansBold.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface HappyGiraffe(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/HappyGiraffe.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Iphone(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Iphone.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Mobily(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Mobily.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Motlabold(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Motla_bold.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Nekar(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Nekar.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansAvestanRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansAvestan-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansBamumRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansBamum-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansBatakRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansBatak-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansBrahmiRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansBrahmi-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansCarianRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansCarian-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansChamBold(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansCham-Bold.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansChamRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansCham-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansCherokeeRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansCherokee-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansCopticRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansCoptic-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansCuneiformRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansCuneiform-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansCypriotRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansCypriot-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansEgyptianHieroglyphsRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansEgyptianHieroglyphs-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansImperialAramaicRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansImperialAramaic-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansInscriptionalPahlaviRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansInscriptionalPahlavi-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansInscriptionalParthianRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansInscriptionalParthian-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansJavaneseRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansJavanese-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansKaithiRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansKaithi-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansKayahLiRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansKayahLi-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansLepchaRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansLepcha-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansLinearBRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansLinearB-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansLisuRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansLisu-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansLycianRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansLycian-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansLydianRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansLydian-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansMandaicRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansMandaic-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansMeeteiMayekRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansMeeteiMayek-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansOlChikiRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansOlChiki-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansOldSouthArabianRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansOldSouthArabian-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansRejangRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansRejang-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansSamaritanRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansSamaritan-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansSaurashtraRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansSaurashtra-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansSundaneseRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansSundanese-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansSymbolsRegularSubsetted(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansSymbols-Regular-Subsetted.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansSyriacEasternRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansSyriacEastern-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansSyriacEstrangelaRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansSyriacEstrangela-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansSyriacWesternRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansSyriacWestern-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansTaiThamRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansTaiTham-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansTaiVietRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansTaiViet-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSansVaiRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSansVai-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSerifBold(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSerif-Bold.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSerifBoldItalic(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSerif-BoldItalic.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSerifItalic(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSerif-Italic.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface NotoSerifRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/NotoSerif-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface nucleooutline(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/nucleo-outline.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface orange_juice(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/orange_juice.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Passing_Notes(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Passing_Notes.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }


    public static Typeface ProductSans(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/ProductSans.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Rekaa(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Rekaa.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoBlack(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Black.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoBlackItalic(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-BlackItalic.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoBold(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Bold.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoCondensedBold(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/RobotoCondensed-Bold.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoBoldItalic(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-BoldItalic.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoCondensedBoldItalic(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/RobotoCondensed-BoldItalic.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoCondensedItalic(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/RobotoCondensed-Italic.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoCondensedLight(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/RobotoCondensed-Light.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoCondensedLightItalic(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/RobotoCondensed-LightItalic.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoCondensedRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/RobotoCondensed-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoItalic(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Italic.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoLight(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Light.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoLightItalic(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-LightItalic.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoMedium(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoMediumItalic(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-MediumItalic.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoThin(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Thin.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RobotoThinItalic(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-ThinItalic.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface solid_3d(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/solid_3d.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Transformers(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Transformers.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface woodcutter_carnage(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/woodcutter_carnage.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface youngonesRSRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/youngones_RS-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Zaman(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Zaman.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface LoveYaLikeASister(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/LoveYaLikeASister.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Reckoner_Bold(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Reckoner_Bold.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface Reckoner(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Reckoner.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface RalewayLight(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Raleway-Light.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    public static Typeface QuicksandRegular(Context context) {
        if (context != null) {
            try {
                return Typeface.createFromAsset(context.getAssets(), "fonts/Quicksand-Regular.ttf");
            } catch (Exception e) {
                return new TextView(context).getTypeface();
            }
        } else {
            return null;
        }
    }

    @Override
    public String[] FontsNames(Context context) {
        return GetFonts(context);
    }
}
