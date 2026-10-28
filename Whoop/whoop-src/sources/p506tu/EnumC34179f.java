package p506tu;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tu.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m65681d2 = {"Ltu/f;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final class EnumC34179f {

    /* JADX INFO: renamed from: w */
    @SerializedName("regular")
    public static final EnumC34179f f143353w;

    /* JADX INFO: renamed from: x */
    @SerializedName("low")
    public static final EnumC34179f f143354x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC34179f[] f143355y;

    static {
        EnumC34179f enumC34179f = new EnumC34179f("REGULAR", 0);
        f143353w = enumC34179f;
        EnumC34179f enumC34179f2 = new EnumC34179f("LOW", 1);
        f143354x = enumC34179f2;
        f143355y = new EnumC34179f[]{enumC34179f, enumC34179f2};
    }

    public static EnumC34179f valueOf(String str) {
        return (EnumC34179f) Enum.valueOf(EnumC34179f.class, str);
    }

    public static EnumC34179f[] values() {
        return (EnumC34179f[]) f143355y.clone();
    }
}
