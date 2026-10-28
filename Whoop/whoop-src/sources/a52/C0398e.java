package a52;

import java.nio.ByteBuffer;
import lt0.AbstractC24727d;
import lt0.EnumC24733j;
import lt0.EnumC24735l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import st0.EnumC32978v;
import uk0.C35048b;
import xj0.AbstractC38334b;

/* JADX INFO: renamed from: a52.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m65681d2 = {"La52/e;", "Lxj0/b;", "", "index", "", "data", "<init>", "(J[B)V", "i", "a", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0398e extends AbstractC38334b {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a52.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"La52/e$a;", "", "<init>", "()V", "", "index", "", "data", "Ljava/nio/ByteBuffer;", "b", "(J[B)Ljava/nio/ByteBuffer;", "", "DATA_LENGTH", "S", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final ByteBuffer m1096b(long index, byte[] data) {
            ByteBuffer byteBufferPut = ByteBuffer.allocate(data.length + 7).order(AbstractC24727d.m72403a()).put(EnumC24733j.REVISION_1.getValue()).putInt(C35048b.f148538a.m110785c(index)).putShort((short) data.length).put(data);
            byteBufferPut.rewind();
            return byteBufferPut;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0398e(long j7, byte[] data) {
        super(EnumC24735l.PUFFIN_LOAD_FW_DATA, INSTANCE.m1096b(j7, data), EnumC32978v.PUFFIN);
        AbstractC22676k.m65750j(data, "data");
    }
}
