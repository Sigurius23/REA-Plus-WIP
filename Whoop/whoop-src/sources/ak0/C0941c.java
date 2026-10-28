package ak0;

import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tt0.AbstractC34157b;
import wj0.AbstractC37317a;
import zj0.C40727h;

/* JADX INFO: renamed from: ak0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\t8F¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u000bR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00178F¢\u0006\f\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, m65681d2 = {"Lak0/c;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "", "Z", "()I", "revision", "Lak0/a;", "a0", "()Lak0/a;", NotificationCompat.CATEGORY_STATUS, "Y", "getAdvertisingNameLength$annotations", "()V", "advertisingNameLength", "X", "advertisingName", "", "b0", "()Z", "isAdvertisingNameSet$annotations", "isAdvertisingNameSet", "f", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0941c extends C40727h {

    /* JADX INFO: renamed from: f */
    private static final a f3438f = new a(null);

    /* JADX INFO: renamed from: ak0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m65681d2 = {"Lak0/c$a;", "", "<init>", "()V", "", "NAME_PADDING", "I", "OFFSET_REVISION", "OFFSET_STATUS", "OFFSET_SIZE", "OFFSET_NAME", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0941c(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
    }

    /* JADX INFO: renamed from: X */
    public final String m2370X() {
        if (!m2374b0()) {
            return null;
        }
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byte[] bArrArray = byteBufferM132194S.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        return AbstractC34157b.m107935b(bArrArray, 8);
    }

    /* JADX INFO: renamed from: Y */
    public final int m2371Y() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return AbstractC37317a.m119536a(byteBufferM132194S.get(2));
    }

    /* JADX INFO: renamed from: Z */
    public final int m2372Z() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return AbstractC37317a.m119536a(byteBufferM132194S.get(0));
    }

    /* JADX INFO: renamed from: a0 */
    public final EnumC0939a m2373a0() {
        EnumC0939a.Companion companion = EnumC0939a.INSTANCE;
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return companion.m2368a(byteBufferM132194S.get(1));
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m2374b0() {
        return m2373a0() == EnumC0939a.SET;
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        int iM2372Z = m2372Z();
        EnumC0939a enumC0939aM2373a0 = m2373a0();
        int iM2371Y = m2371Y();
        String strM2370X = m2370X();
        boolean zM2374b0 = m2374b0();
        StringBuilder sb4 = new StringBuilder("Revision: ");
        sb4.append(iM2372Z);
        sb4.append(" - Status: ");
        sb4.append(enumC0939aM2373a0);
        sb4.append(" - Length: ");
        AbstractC11895b.m31979B(iM2371Y, " - Name: ", strM2370X, " - isSet: ", sb4);
        sb4.append(zM2374b0);
        return sb4.toString();
    }
}
