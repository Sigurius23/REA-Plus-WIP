package fk0;

import ge3.AbstractC15751g;
import java.nio.ByteBuffer;
import lt0.AbstractC24726c;
import lt0.AbstractC24727d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import uk0.C35048b;

/* JADX INFO: renamed from: fk0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, m65681d2 = {"Lfk0/g;", "Llt0/c;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "Q", "()Ljava/nio/ByteBuffer;", "c", "Ljava/nio/ByteBuffer;", "dataBuffer", "d", "b", "a", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14551g extends AbstractC24726c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private ByteBuffer dataBuffer;

    /* JADX INFO: renamed from: fk0.g$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\n¨\u0006\u0011"}, m65681d2 = {"Lfk0/g$a;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "payload", "", "a", "(Ljava/nio/ByteBuffer;)Ljava/lang/Integer;", "LENGTH_METADATA_EVENT_TYPE", "I", "LENGTH_TIMESTAMP", "LENGTH_LENGTH", "OFFSET_METADATA_EVENT_TYPE", "OFFSET_TIMESTAMP", "OFFSET_LENGTH", "OFFSET_EVENT_DATA", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Integer m41570a(ByteBuffer payload) {
            if (payload == null || payload.limit() <= 3) {
                return null;
            }
            return Integer.valueOf(C35048b.f148538a.m110786e(payload.getShort(2)));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: fk0.g$b */
    /* JADX INFO: loaded from: classes.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m65681d2 = {"Lfk0/g$b;", "", "", "intValue", "<init>", "(Ljava/lang/String;II)V", "I", "getIntValue", "()I", "Companion", "a", "HISTORY_START", "HISTORY_END", "HISTORY_COMPLETE", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        HISTORY_START(1),
        HISTORY_END(2),
        HISTORY_COMPLETE(3);

        private final int intValue;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: fk0.g$b$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lfk0/g$b$a;", "", "<init>", "()V", "", "value", "Lfk0/g$b;", "a", "(I)Lfk0/g$b;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:11:0x0018  */
            /* JADX INFO: renamed from: a */
            public final b m41571a(int value) throws IllegalArgumentException {
                for (b bVar : b.values()) {
                    if (bVar.getIntValue() == value) {
                        if (bVar != null) {
                            return bVar;
                        }
                        throw new IllegalArgumentException(AbstractC2875y.m8296i(value, "Value ", " is not a valid MetadataType"));
                    }
                }
                bVar = null;
                if (bVar != null) {
                    return bVar;
                }
                throw new IllegalArgumentException(AbstractC2875y.m8296i(value, "Value ", " is not a valid MetadataType"));
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
    public AbstractC14551g(ByteBuffer payload) {
        super(payload);
        AbstractC22676k.m65750j(payload, "payload");
    }

    /* JADX INFO: renamed from: Q */
    public final ByteBuffer m41569Q() {
        if (this.dataBuffer == null && getPayload().limit() >= 12) {
            getPayload().position(12);
            this.dataBuffer = getPayload().slice().order(AbstractC24727d.m72403a());
            getPayload().rewind();
        }
        return this.dataBuffer;
    }
}
