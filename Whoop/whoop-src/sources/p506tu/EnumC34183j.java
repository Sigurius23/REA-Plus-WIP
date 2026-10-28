package p506tu;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tu.j */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Ltu/j;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "z", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final class EnumC34183j {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC34183j[] f143382E;

    /* JADX INFO: renamed from: w */
    @SerializedName("network")
    public static final EnumC34183j f143383w;

    /* JADX INFO: renamed from: x */
    @SerializedName("cache")
    public static final EnumC34183j f143384x;

    /* JADX INFO: renamed from: y */
    @SerializedName("tile-store")
    public static final EnumC34183j f143385y;

    /* JADX INFO: renamed from: z */
    @SerializedName("local-file")
    public static final EnumC34183j f143386z;

    static {
        EnumC34183j enumC34183j = new EnumC34183j("NETWORK", 0);
        f143383w = enumC34183j;
        EnumC34183j enumC34183j2 = new EnumC34183j("CACHE", 1);
        f143384x = enumC34183j2;
        EnumC34183j enumC34183j3 = new EnumC34183j("TILE_STORE", 2);
        f143385y = enumC34183j3;
        EnumC34183j enumC34183j4 = new EnumC34183j("LOCAL_FILE", 3);
        f143386z = enumC34183j4;
        f143382E = new EnumC34183j[]{enumC34183j, enumC34183j2, enumC34183j3, enumC34183j4};
    }

    public static EnumC34183j valueOf(String str) {
        return (EnumC34183j) Enum.valueOf(EnumC34183j.class, str);
    }

    public static EnumC34183j[] values() {
        return (EnumC34183j[]) f143382E.clone();
    }
}
