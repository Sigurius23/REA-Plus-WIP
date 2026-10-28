package zj0;

import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import tt0.AbstractC34157b;
import wj0.AbstractC37317a;

/* JADX INFO: renamed from: zj0.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\b¨\u0006 "}, m65681d2 = {"Lzj0/l;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "", "f", "I", "getRevision", "()I", "revision", "Lzj0/a;", "g", "Lzj0/a;", "getStatus$connectivity_release", "()Lzj0/a;", NotificationCompat.CATEGORY_STATUS, StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getAdvertisingNameLength", "advertisingNameLength", "", "Y", "()Z", "isAdvertisingNameSet", "X", "advertisingName", "i", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40739l extends C40727h {

    /* JADX INFO: renamed from: i */
    private static final a f175651i = new a(null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int revision;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final EnumC40706a status;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int advertisingNameLength;

    /* JADX INFO: renamed from: zj0.l$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m65681d2 = {"Lzj0/l$a;", "", "<init>", "()V", "", "NAME_PADDING", "I", "OFFSET_REVISION", "OFFSET_STATUS", "OFFSET_SIZE", "OFFSET_NAME", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40739l(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        this.revision = AbstractC37317a.m119536a(byteBufferM132194S.get(0));
        EnumC40706a.Companion companion = EnumC40706a.INSTANCE;
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        this.status = companion.m132178a(byteBufferM132194S2.get(1));
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        this.advertisingNameLength = AbstractC37317a.m119536a(byteBufferM132194S3.get(2));
    }

    /* JADX INFO: renamed from: Y */
    private final boolean m132228Y() {
        return this.status == EnumC40706a.SET;
    }

    /* JADX INFO: renamed from: X */
    public final String m132229X() {
        if (!m132228Y()) {
            return null;
        }
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byte[] bArrArray = byteBufferM132194S.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        return AbstractC34157b.m107935b(bArrArray, 8);
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        int i13 = this.revision;
        EnumC40706a enumC40706a = this.status;
        int i14 = this.advertisingNameLength;
        String strM132229X = m132229X();
        boolean zM132228Y = m132228Y();
        StringBuilder sb4 = new StringBuilder("Revision: ");
        sb4.append(i13);
        sb4.append(" - Status: ");
        sb4.append(enumC40706a);
        sb4.append(" - Length: ");
        AbstractC11895b.m31979B(i14, " - Name: ", strM132229X, " - isSet: ", sb4);
        sb4.append(zM132228Y);
        return sb4.toString();
    }
}
