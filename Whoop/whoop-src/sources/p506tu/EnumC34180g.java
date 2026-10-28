package p506tu;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tu.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Ltu/g;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "z", "E", "F", "G", "H", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final class EnumC34180g {

    /* JADX INFO: renamed from: E */
    @SerializedName("glyphs")
    public static final EnumC34180g f143356E;

    /* JADX INFO: renamed from: F */
    @SerializedName("sprite-image")
    public static final EnumC34180g f143357F;

    /* JADX INFO: renamed from: G */
    @SerializedName("sprite-json")
    public static final EnumC34180g f143358G;

    /* JADX INFO: renamed from: H */
    @SerializedName("image")
    public static final EnumC34180g f143359H;

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ EnumC34180g[] f143360I;

    /* JADX INFO: renamed from: w */
    @SerializedName("unknown")
    public static final EnumC34180g f143361w;

    /* JADX INFO: renamed from: x */
    @SerializedName("style")
    public static final EnumC34180g f143362x;

    /* JADX INFO: renamed from: y */
    @SerializedName("source")
    public static final EnumC34180g f143363y;

    /* JADX INFO: renamed from: z */
    @SerializedName("tile")
    public static final EnumC34180g f143364z;

    static {
        EnumC34180g enumC34180g = new EnumC34180g("UNKNOWN", 0);
        f143361w = enumC34180g;
        EnumC34180g enumC34180g2 = new EnumC34180g("STYLE", 1);
        f143362x = enumC34180g2;
        EnumC34180g enumC34180g3 = new EnumC34180g("SOURCE", 2);
        f143363y = enumC34180g3;
        EnumC34180g enumC34180g4 = new EnumC34180g("TILE", 3);
        f143364z = enumC34180g4;
        EnumC34180g enumC34180g5 = new EnumC34180g("GLYPHS", 4);
        f143356E = enumC34180g5;
        EnumC34180g enumC34180g6 = new EnumC34180g("SPRITE_IMAGE", 5);
        f143357F = enumC34180g6;
        EnumC34180g enumC34180g7 = new EnumC34180g("SPRITE_JSON", 6);
        f143358G = enumC34180g7;
        EnumC34180g enumC34180g8 = new EnumC34180g("IMAGE", 7);
        f143359H = enumC34180g8;
        f143360I = new EnumC34180g[]{enumC34180g, enumC34180g2, enumC34180g3, enumC34180g4, enumC34180g5, enumC34180g6, enumC34180g7, enumC34180g8};
    }

    public static EnumC34180g valueOf(String str) {
        return (EnumC34180g) Enum.valueOf(EnumC34180g.class, str);
    }

    public static EnumC34180g[] values() {
        return (EnumC34180g[]) f143360I.clone();
    }
}
