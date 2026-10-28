package zj0;

import java.nio.ByteBuffer;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;

/* JADX INFO: renamed from: zj0.q */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\r¨\u0006\u0013"}, m65681d2 = {"Lzj0/q;", "Lzj0/h;", "Lzj0/i;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "index", "", "X", "(I)J", "q", "()J", "writePage", "e", "trimPage", "t", "totalPages", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40750q extends C40727h implements InterfaceC40730i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40750q(ByteBuffer payload) {
        super(payload, null, 2, null);
        AbstractC22676k.m65750j(payload, "payload");
    }

    /* JADX INFO: renamed from: X */
    private final long m132242X(int index) {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return C35048b.m110783d(byteBufferM132194S.getInt((index * 4) + 1));
    }

    @Override // zj0.InterfaceC40730i
    /* JADX INFO: renamed from: D */
    public /* bridge */ long mo132202D() {
        return super.mo132202D();
    }

    @Override // zj0.InterfaceC40730i
    /* JADX INFO: renamed from: e */
    public long mo132203e() {
        return m132242X(3);
    }

    @Override // zj0.InterfaceC40730i
    /* JADX INFO: renamed from: q */
    public long mo132204q() {
        return m132242X(2);
    }

    @Override // zj0.InterfaceC40730i
    /* JADX INFO: renamed from: t */
    public long mo132205t() {
        return m132242X(5);
    }
}
