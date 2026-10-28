package hk0;

import com.mapbox.maps.MapboxMap;
import h02.C16587n0;
import ih0.AbstractC18489d0;
import java.nio.ByteBuffer;
import l83.InterfaceC23462h;
import lt0.AbstractC24727d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: hk0.m */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0014\u001a\u00020\u00028DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m65681d2 = {"Lhk0/m;", "Lhk0/b;", "Ljava/nio/ByteBuffer;", "buffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "d0", "()Z", "", MapboxMap.QFE_OFFSET, "Z", "(I)Ljava/nio/ByteBuffer;", "", "toString", "()Ljava/lang/String;", "e", "Ll83/h;", "a0", "()Ljava/nio/ByteBuffer;", "metadataPayload", "Lhk0/n;", "b0", "()Lhk0/n;", "subtype", "f", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17378m extends C17367b {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC23462h metadataPayload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC17378m(ByteBuffer buffer) {
        super(buffer);
        AbstractC22676k.m65750j(buffer, "buffer");
        this.metadataPayload = AbstractC30060g.m92088H(new C16587n0(buffer, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final ByteBuffer m49205c0(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(21);
        return byteBufferDuplicate.slice().order(AbstractC24727d.m72403a());
    }

    /* JADX INFO: renamed from: Z */
    public final ByteBuffer m49206Z(int offset) {
        ByteBuffer byteBufferOrder = m49207a0().duplicate().order(AbstractC24727d.m72403a());
        byteBufferOrder.position(offset);
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: a0 */
    public final ByteBuffer m49207a0() {
        Object value = this.metadataPayload.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (ByteBuffer) value;
    }

    /* JADX INFO: renamed from: b0 */
    public abstract EnumC17379n mo49186b0();

    /* JADX INFO: renamed from: d0 */
    public boolean mo49188d0() {
        return getPayload().limit() >= 21;
    }

    @Override // hk0.C17367b, lt0.AbstractC24726c
    public String toString() {
        return AbstractC18489d0.m53370k(getPacketName(), " - ", m72401O());
    }
}
