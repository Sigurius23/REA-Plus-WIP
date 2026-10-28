package mt0;

import java.nio.ByteBuffer;
import lt0.C24725b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mt0.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lmt0/g;", "Llt0/b;", "Ljava/nio/ByteBuffer;", "rawData", "payload", "<init>", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V", "s", "Ljava/nio/ByteBuffer;", "b0", "()Ljava/nio/ByteBuffer;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25937g extends C24725b {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final ByteBuffer rawData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25937g(ByteBuffer rawData, ByteBuffer payload) {
        super(payload, rawData);
        AbstractC22676k.m65750j(rawData, "rawData");
        AbstractC22676k.m65750j(payload, "payload");
        this.rawData = rawData;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final ByteBuffer getRawData() {
        return this.rawData;
    }
}
