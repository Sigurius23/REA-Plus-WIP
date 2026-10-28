package ek0;

import java.nio.ByteBuffer;
import kk0.C22538a;
import kk0.C22539b;
import ot0.C28323a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;

/* JADX INFO: renamed from: ek0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m65681d2 = {"Lek0/b;", "Lot0/a;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "Lkk0/a;", "b", "()Lkk0/a;", "batteryLevel", "Lkk0/b;", "T", "()Lkk0/b;", "external5VStatus", "e", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13273b extends C28323a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13273b(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
    }

    /* JADX INFO: renamed from: T */
    public final C22539b m37320T() {
        C22539b c22539b = new C22539b();
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        c22539b.m65155l(byteBufferM85784Q.get(10));
        return c22539b;
    }

    /* JADX INFO: renamed from: b */
    public final C22538a m37321b() {
        C22538a.Companion companion = C22538a.INSTANCE;
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        return companion.m65142a(C35048b.m110783d(byteBufferM85784Q.getInt(1)));
    }
}
