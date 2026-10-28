package p506tu;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tu.k */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, m65681d2 = {"Ltu/k;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final class EnumC34184k {

    /* JADX INFO: renamed from: w */
    @SerializedName("metadata")
    public static final EnumC34184k f143387w;

    /* JADX INFO: renamed from: x */
    @SerializedName("tile")
    public static final EnumC34184k f143388x;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ EnumC34184k[] f143389y;

    static {
        EnumC34184k enumC34184k = new EnumC34184k("METADATA", 0);
        f143387w = enumC34184k;
        EnumC34184k enumC34184k2 = new EnumC34184k("TILE", 1);
        f143388x = enumC34184k2;
        f143389y = new EnumC34184k[]{enumC34184k, enumC34184k2};
    }

    public static EnumC34184k valueOf(String str) {
        return (EnumC34184k) Enum.valueOf(EnumC34184k.class, str);
    }

    public static EnumC34184k[] values() {
        return (EnumC34184k[]) f143389y.clone();
    }
}
