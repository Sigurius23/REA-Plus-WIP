package p506tu;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tu.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Ltu/c;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "z", "E", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final class EnumC34176c {

    /* JADX INFO: renamed from: E */
    @SerializedName("glyphs")
    public static final EnumC34176c f143340E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC34176c[] f143341F;

    /* JADX INFO: renamed from: w */
    @SerializedName("style")
    public static final EnumC34176c f143342w;

    /* JADX INFO: renamed from: x */
    @SerializedName("sprite")
    public static final EnumC34176c f143343x;

    /* JADX INFO: renamed from: y */
    @SerializedName("source")
    public static final EnumC34176c f143344y;

    /* JADX INFO: renamed from: z */
    @SerializedName("tile")
    public static final EnumC34176c f143345z;

    static {
        EnumC34176c enumC34176c = new EnumC34176c("STYLE", 0);
        f143342w = enumC34176c;
        EnumC34176c enumC34176c2 = new EnumC34176c("SPRITE", 1);
        f143343x = enumC34176c2;
        EnumC34176c enumC34176c3 = new EnumC34176c("SOURCE", 2);
        f143344y = enumC34176c3;
        EnumC34176c enumC34176c4 = new EnumC34176c("TILE", 3);
        f143345z = enumC34176c4;
        EnumC34176c enumC34176c5 = new EnumC34176c("GLYPHS", 4);
        f143340E = enumC34176c5;
        f143341F = new EnumC34176c[]{enumC34176c, enumC34176c2, enumC34176c3, enumC34176c4, enumC34176c5};
    }

    public static EnumC34176c valueOf(String str) {
        return (EnumC34176c) Enum.valueOf(EnumC34176c.class, str);
    }

    public static EnumC34176c[] values() {
        return (EnumC34176c[]) f143341F.clone();
    }
}
