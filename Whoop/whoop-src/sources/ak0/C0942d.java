package ak0;

import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import zj0.C40727h;

/* JADX INFO: renamed from: ak0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m65681d2 = {"Lak0/d;", "Lzj0/h;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "f", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0942d extends C40727h {

    /* JADX INFO: renamed from: f */
    private static final a f3439f = new a(null);

    /* JADX INFO: renamed from: ak0.d$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lak0/d$a;", "", "<init>", "()V", "", "OFFSET_PATTERN", "I", "PATTERN_LENGTH", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0942d(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
    }
}
