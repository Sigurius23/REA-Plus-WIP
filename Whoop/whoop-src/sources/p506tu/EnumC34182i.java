package p506tu;

import com.google.gson.annotations.SerializedName;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tu.i */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Ltu/i;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "x", "y", "z", "E", "F", "G", "sdk-base_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@InterfaceC23457c
public final class EnumC34182i {

    /* JADX INFO: renamed from: E */
    @SerializedName("rate-limit")
    public static final EnumC34182i f143374E;

    /* JADX INFO: renamed from: F */
    @SerializedName("in-offline-mode")
    public static final EnumC34182i f143375F;

    /* JADX INFO: renamed from: G */
    @SerializedName("other")
    public static final EnumC34182i f143376G;

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ EnumC34182i[] f143377H;

    /* JADX INFO: renamed from: w */
    @SerializedName("success")
    public static final EnumC34182i f143378w;

    /* JADX INFO: renamed from: x */
    @SerializedName("not-found")
    public static final EnumC34182i f143379x;

    /* JADX INFO: renamed from: y */
    @SerializedName("server")
    public static final EnumC34182i f143380y;

    /* JADX INFO: renamed from: z */
    @SerializedName("connection")
    public static final EnumC34182i f143381z;

    static {
        EnumC34182i enumC34182i = new EnumC34182i("SUCCESS", 0);
        f143378w = enumC34182i;
        EnumC34182i enumC34182i2 = new EnumC34182i("NOT_FOUND", 1);
        f143379x = enumC34182i2;
        EnumC34182i enumC34182i3 = new EnumC34182i("SERVER", 2);
        f143380y = enumC34182i3;
        EnumC34182i enumC34182i4 = new EnumC34182i("CONNECTION", 3);
        f143381z = enumC34182i4;
        EnumC34182i enumC34182i5 = new EnumC34182i("RATE_LIMIT", 4);
        f143374E = enumC34182i5;
        EnumC34182i enumC34182i6 = new EnumC34182i("IN_OFFLINE_MODE", 5);
        f143375F = enumC34182i6;
        EnumC34182i enumC34182i7 = new EnumC34182i("OTHER", 6);
        f143376G = enumC34182i7;
        f143377H = new EnumC34182i[]{enumC34182i, enumC34182i2, enumC34182i3, enumC34182i4, enumC34182i5, enumC34182i6, enumC34182i7};
    }

    public static EnumC34182i valueOf(String str) {
        return (EnumC34182i) Enum.valueOf(EnumC34182i.class, str);
    }

    public static EnumC34182i[] values() {
        return (EnumC34182i[]) f143377H.clone();
    }
}
