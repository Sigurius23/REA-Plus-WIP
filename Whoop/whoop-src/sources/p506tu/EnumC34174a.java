package p506tu;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tu.a */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Ltu/a;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "z", "E", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final class EnumC34174a {

    /* JADX INFO: renamed from: E */
    @SerializedName("file-system")
    public static final EnumC34174a f143332E;

    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ EnumC34174a[] f143333F;

    /* JADX INFO: renamed from: w */
    @SerializedName("resource-loader")
    public static final EnumC34174a f143334w;

    /* JADX INFO: renamed from: x */
    @SerializedName("network")
    public static final EnumC34174a f143335x;

    /* JADX INFO: renamed from: y */
    @SerializedName("database")
    public static final EnumC34174a f143336y;

    /* JADX INFO: renamed from: z */
    @SerializedName("asset")
    public static final EnumC34174a f143337z;

    static {
        EnumC34174a enumC34174a = new EnumC34174a("RESOURCE_LOADER", 0);
        f143334w = enumC34174a;
        EnumC34174a enumC34174a2 = new EnumC34174a("NETWORK", 1);
        f143335x = enumC34174a2;
        EnumC34174a enumC34174a3 = new EnumC34174a("DATABASE", 2);
        f143336y = enumC34174a3;
        EnumC34174a enumC34174a4 = new EnumC34174a("ASSET", 3);
        f143337z = enumC34174a4;
        EnumC34174a enumC34174a5 = new EnumC34174a("FILE_SYSTEM", 4);
        f143332E = enumC34174a5;
        f143333F = new EnumC34174a[]{enumC34174a, enumC34174a2, enumC34174a3, enumC34174a4, enumC34174a5};
    }

    public static EnumC34174a valueOf(String str) {
        return (EnumC34174a) Enum.valueOf(EnumC34174a.class, str);
    }

    public static EnumC34174a[] values() {
        return (EnumC34174a[]) f143333F.clone();
    }
}
