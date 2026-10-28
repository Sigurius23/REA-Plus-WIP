package p506tu;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tu.l */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m65681d2 = {"Ltu/l;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final class EnumC34185l {

    /* JADX INFO: renamed from: w */
    @SerializedName("style")
    public static final EnumC34185l f143390w;

    /* JADX INFO: renamed from: x */
    @SerializedName("sprite")
    public static final EnumC34185l f143391x;

    /* JADX INFO: renamed from: y */
    @SerializedName("sources")
    public static final EnumC34185l f143392y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ EnumC34185l[] f143393z;

    static {
        EnumC34185l enumC34185l = new EnumC34185l("STYLE", 0);
        f143390w = enumC34185l;
        EnumC34185l enumC34185l2 = new EnumC34185l("SPRITE", 1);
        f143391x = enumC34185l2;
        EnumC34185l enumC34185l3 = new EnumC34185l("SOURCES", 2);
        f143392y = enumC34185l3;
        f143393z = new EnumC34185l[]{enumC34185l, enumC34185l2, enumC34185l3};
    }

    public static EnumC34185l valueOf(String str) {
        return (EnumC34185l) Enum.valueOf(EnumC34185l.class, str);
    }

    public static EnumC34185l[] values() {
        return (EnumC34185l[]) f143393z.clone();
    }
}
