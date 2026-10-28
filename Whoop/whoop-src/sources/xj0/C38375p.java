package xj0;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24728e;
import lt0.EnumC24733j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;

/* JADX INFO: renamed from: xj0.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m65681d2 = {"Lxj0/p;", "Lxj0/b;", "Llt0/j;", "revision", "Lst0/v;", "deviceType", "<init>", "(Llt0/j;Lst0/v;)V", "", "i", "Z", "p", "()Z", "dualResponse", "j", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38375p extends AbstractC38334b {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean dualResponse;

    /* JADX INFO: renamed from: xj0.p$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lxj0/p$a;", "", "<init>", "()V", "Llt0/j;", "revision", "Ljava/nio/ByteBuffer;", "b", "(Llt0/j;)Ljava/nio/ByteBuffer;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final ByteBuffer m122934b(EnumC24733j revision) {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(1).order(AbstractC24727d.m72403a());
            byteBufferOrder.put(revision.getValue());
            byteBufferOrder.rewind();
            return byteBufferOrder;
        }

        private Companion() {
        }
    }

    public /* synthetic */ C38375p(EnumC24733j enumC24733j, EnumC32978v enumC32978v, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC24733j.REVISION_1 : enumC24733j, (i13 & 2) != 0 ? EnumC32978v.GEN_4 : enumC32978v);
    }

    @Override // xj0.AbstractC38334b, vk0.InterfaceC36081g
    /* JADX INFO: renamed from: p, reason: from getter */
    public boolean getDualResponse() {
        return this.dualResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38375p(EnumC24733j revision, EnumC32978v deviceType) {
        super(EnumC24728e.GET_HELLO, INSTANCE.m122934b(revision), deviceType);
        AbstractC22676k.m65750j(revision, "revision");
        AbstractC22676k.m65750j(deviceType, "deviceType");
        this.dualResponse = true;
    }
}
