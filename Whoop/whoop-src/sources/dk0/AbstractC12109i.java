package dk0;

import ge3.AbstractC15751g;
import java.nio.ByteBuffer;
import java.util.HashMap;
import l83.InterfaceC23462h;
import lt0.AbstractC24726c;
import lt0.AbstractC24727d;
import p007a6.C0438l0;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import uk0.C35048b;

/* JADX INFO: renamed from: dk0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001b\u0010\n\u001a\u00020\u00028DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m65681d2 = {"Ldk0/i;", "Llt0/c;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "c", "Ll83/h;", "R", "()Ljava/nio/ByteBuffer;", "metadataPayload", "d", "b", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12109i extends AbstractC24726c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC23462h metadataPayload;

    /* JADX INFO: renamed from: dk0.i$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, m65681d2 = {"Ldk0/i$a;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "payload", "", "a", "(Ljava/nio/ByteBuffer;)Ljava/lang/Short;", "", "OFFSET_METADATA_TYPE", "I", "OFFSET_TIMESTAMP", "OFFSET_DATA", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Short m33454a(ByteBuffer payload) {
            if (payload == null || payload.limit() <= 2) {
                return null;
            }
            return Short.valueOf(C35048b.m110782b(payload.get(2)));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: dk0.i$b */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Ldk0/i$b;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "", "shortValue", "S", "getShortValue", "()S", "Companion", "a", "HISTORY_START", "HISTORY_END", "HISTORY_COMPLETE", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        HISTORY_START(1),
        HISTORY_END(2),
        HISTORY_COMPLETE(3);

        private final short shortValue;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final HashMap<Short, b> map = new HashMap<>();

        /* JADX INFO: renamed from: dk0.i$b$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ldk0/i$b$a;", "", "<init>", "()V", "", "value", "Ldk0/i$b;", "a", "(S)Ldk0/i$b;", "Ljava/util/HashMap;", "map", "Ljava/util/HashMap;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m33455a(short value) throws IllegalArgumentException {
                b bVar = (b) b.map.get(Short.valueOf(value));
                if (bVar != null) {
                    return bVar;
                }
                throw new IllegalArgumentException(AbstractC2875y.m8296i(value, "Value ", " is not a valid MetadataType"));
            }

            private Companion() {
            }
        }

        static {
            for (b bVar : values()) {
                map.put(Short.valueOf(bVar.shortValue), bVar);
            }
        }

        b(int i13) {
            this.shortValue = (short) i13;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final short getShortValue() {
            return this.shortValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12109i(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
        this.metadataPayload = AbstractC30060g.m92088H(new C0438l0(payload, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final ByteBuffer m33452S(ByteBuffer byteBuffer) {
        byteBuffer.position(9);
        ByteBuffer byteBufferOrder = byteBuffer.slice().order(AbstractC24727d.m72403a());
        byteBuffer.rewind();
        return byteBufferOrder;
    }

    /* JADX INFO: renamed from: R */
    public final ByteBuffer m33453R() {
        Object value = this.metadataPayload.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (ByteBuffer) value;
    }
}
