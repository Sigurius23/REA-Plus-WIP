package hk0;

import java.nio.ByteBuffer;
import lt0.InterfaceC24729f;
import lt0.InterfaceC24730g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hk0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lhk0/d;", "Lhk0/b;", "Llt0/f;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "Llt0/g;", "g", "()Llt0/g;", "formatRevision", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17369d extends C17367b implements InterfaceC24729f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC17369d(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
    }

    @Override // lt0.InterfaceC24729f
    /* JADX INFO: renamed from: g */
    public InterfaceC24730g mo49181g() {
        return new InterfaceC24730g.c(m49178V());
    }
}
