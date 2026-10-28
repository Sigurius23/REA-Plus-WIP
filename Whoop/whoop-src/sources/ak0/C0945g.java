package ak0;

import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wj0.AbstractC37317a;
import zj0.C40727h;

/* JADX INFO: renamed from: ak0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lak0/g;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "f", "I", "statusMessageOffset", "Lak0/f;", "X", "()Lak0/f;", "statusMessage", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0945g extends C40727h {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int statusMessageOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0945g(ByteBuffer payload) {
        super(payload, null, 2, 0 == true ? 1 : 0);
        AbstractC22676k.m65750j(payload, "payload");
    }

    /* JADX INFO: renamed from: X */
    public final EnumC0944f m2381X() {
        EnumC0944f.Companion companion = EnumC0944f.INSTANCE;
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return companion.m2380a(AbstractC37317a.m119536a(byteBufferM132194S.get(this.statusMessageOffset)));
    }
}
