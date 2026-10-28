package ak0;

import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import jk0.EnumC21749c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wj0.AbstractC37317a;
import zj0.C40727h;

/* JADX INFO: renamed from: ak0.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m65681d2 = {"Lak0/e;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "", "a0", "()I", "revision", "Z", "location", "X", "confidence", "b0", NotificationCompat.CATEGORY_STATUS, "Ljk0/c;", "Y", "()Ljk0/c;", "garmentDeviceLocation", "f", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class GetBodyLocationResponsePacket extends C40727h {

    /* JADX INFO: renamed from: f */
    private static final a f3440f = new a(null);

    /* JADX INFO: renamed from: ak0.e$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, m65681d2 = {"Lak0/e$a;", "", "<init>", "()V", "", "OFFSET_REVISION", "I", "OFFSET_LOCATION", "OFFSET_CONFIDENCE", "OFFSET_STATUS", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBodyLocationResponsePacket(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
    }

    /* JADX INFO: renamed from: X */
    public final int m2375X() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return AbstractC37317a.m119536a(byteBufferM132194S.get(2));
    }

    /* JADX INFO: renamed from: Y */
    public final EnumC21749c m2376Y() {
        return EnumC21749c.INSTANCE.m61367a(m2377Z());
    }

    /* JADX INFO: renamed from: Z */
    public final int m2377Z() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return AbstractC37317a.m119536a(byteBufferM132194S.get(1));
    }

    /* JADX INFO: renamed from: a0 */
    public final int m2378a0() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return AbstractC37317a.m119536a(byteBufferM132194S.get(0));
    }

    /* JADX INFO: renamed from: b0 */
    public final int m2379b0() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return AbstractC37317a.m119536a(byteBufferM132194S.get(3));
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        return super.toString() + "GetBodyLocationResponsePacket(revision=" + m2378a0() + ", location=" + m2377Z() + ", confidence=" + m2375X() + ", status=" + m2379b0() + ", garmentDeviceLocation=" + m2376Y() + ")";
    }
}
