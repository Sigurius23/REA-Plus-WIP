package p506tu;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tu.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m65681d2 = {"Ltu/d;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final class EnumC34177d {

    /* JADX INFO: renamed from: w */
    @SerializedName("partial")
    public static final EnumC34177d f143346w;

    /* JADX INFO: renamed from: x */
    @SerializedName("full")
    public static final EnumC34177d f143347x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC34177d[] f143348y;

    static {
        EnumC34177d enumC34177d = new EnumC34177d("PARTIAL", 0);
        f143346w = enumC34177d;
        EnumC34177d enumC34177d2 = new EnumC34177d("FULL", 1);
        f143347x = enumC34177d2;
        f143348y = new EnumC34177d[]{enumC34177d, enumC34177d2};
    }

    public static EnumC34177d valueOf(String str) {
        return (EnumC34177d) Enum.valueOf(EnumC34177d.class, str);
    }

    public static EnumC34177d[] values() {
        return (EnumC34177d[]) f143348y.clone();
    }
}
