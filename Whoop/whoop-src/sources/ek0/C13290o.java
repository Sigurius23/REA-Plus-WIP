package ek0;

import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import java.util.Iterator;
import lt0.AbstractC24727d;
import ot0.C28323a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import uk0.C35048b;
import va3.AbstractC35846d;

/* JADX INFO: renamed from: ek0.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, m65681d2 = {"Lek0/o;", "Lot0/a;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "toString", "()Ljava/lang/String;", "kotlin.jvm.PlatformType", "e", "Ljava/nio/ByteBuffer;", "cachedPayload", "", "f", "I", "getRevision", "()I", "revision", "g", "getEventIdRaw", "eventIdRaw", "Lek0/o$b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lek0/o$b;", "T", "()Lek0/o$b;", "genericEventId", "i", "a", "b", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13290o extends C28323a {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ByteBuffer cachedPayload;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int revision;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int eventIdRaw;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final b genericEventId;

    /* JADX INFO: renamed from: ek0.o$b */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lek0/o$b;", "", "", "intValue", "<init>", "(Ljava/lang/String;II)V", "I", "getIntValue", "()I", "Companion", "a", "DORSET_DETECTED", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        DORSET_DETECTED(6);

        private final int intValue;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: ek0.o$b$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lek0/o$b$a;", "", "<init>", "()V", "", "value", "Lek0/o$b;", "a", "(I)Lek0/o$b;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m37336a(int value) {
                Object next;
                Iterator<E> it = b.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (((b) next).getIntValue() == value) {
                        return (b) next;
                    }
                }
                next = null;
                return (b) next;
            }

            private Companion() {
            }
        }

        b(int i13) {
            this.intValue = i13;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final int getIntValue() {
            return this.intValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13290o(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
        ByteBuffer byteBufferM85784Q = m85784Q();
        AbstractC22676k.m65747g(byteBufferM85784Q);
        ByteBuffer byteBufferOrder = byteBufferM85784Q.duplicate().order(AbstractC24727d.m72403a());
        this.cachedPayload = byteBufferOrder;
        this.revision = C35048b.m110782b(byteBufferOrder.get(0));
        int iM110786e = C35048b.f148538a.m110786e(byteBufferOrder.getShort(1));
        this.eventIdRaw = iM110786e;
        this.genericEventId = b.INSTANCE.m37336a(iM110786e);
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final b getGenericEventId() {
        return this.genericEventId;
    }

    @Override // ot0.C28323a, lt0.AbstractC24726c
    public String toString() {
        int i13 = this.revision;
        Object objConcat = this.genericEventId;
        if (objConcat == null) {
            int i14 = this.eventIdRaw;
            AbstractC35846d.m113779c(16);
            String string = Integer.toString(i14, 16);
            AbstractC22676k.m65749i(string, "toString(...)");
            objConcat = "0x".concat(string);
        }
        return "GenericFirmwareEventPacket(revision=" + i13 + ", eventId=" + objConcat + ")";
    }
}
