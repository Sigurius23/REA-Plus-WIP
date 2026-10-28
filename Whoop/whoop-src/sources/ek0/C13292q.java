package ek0;

import java.nio.ByteBuffer;
import ot0.C28323a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wj0.AbstractC37317a;

/* JADX INFO: renamed from: ek0.q */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lek0/q;", "Lot0/a;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "e", "I", "T", "()I", "revision", "Lek0/r;", "f", "Lek0/r;", "U", "()Lek0/r;", "terminationCode", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13292q extends C28323a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int revision;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final EnumC13293r terminationCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13292q(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        this.revision = AbstractC37317a.m119536a(byteBufferM85784Q.get(0));
        EnumC13293r.Companion companion = EnumC13293r.INSTANCE;
        ByteBuffer byteBufferM85784Q2 = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q2);
        this.terminationCode = companion.m37339a(AbstractC37317a.m119536a(byteBufferM85784Q2.get(1)));
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final int getRevision() {
        return this.revision;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final EnumC13293r getTerminationCode() {
        return this.terminationCode;
    }
}
