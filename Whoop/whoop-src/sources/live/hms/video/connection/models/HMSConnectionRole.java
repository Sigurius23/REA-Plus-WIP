package live.hms.video.connection.models;

import ge3.AbstractC15751g;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m65681d2 = {"Llive/hms/video/connection/models/HMSConnectionRole;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PUBLISH", "SUBSCRIBE", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public enum HMSConnectionRole {
    PUBLISH(0),
    SUBSCRIBE(1);

    private final int value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/connection/models/HMSConnectionRole$Companion;", "", "<init>", "()V", "from", "Llive/hms/video/connection/models/HMSConnectionRole;", "value", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HMSConnectionRole from(int value) {
            if (value != 0 && value != 1) {
                throw new IllegalArgumentException("HMSConnection Role can either be 0 or 1");
            }
            if (value == 0) {
                return HMSConnectionRole.PUBLISH;
            }
            if (value == 1) {
                return HMSConnectionRole.SUBSCRIBE;
            }
            throw new IllegalStateException(AbstractC2875y.m8296i(value, "value=", " expected to be either 0 or 1"));
        }

        private Companion() {
        }
    }

    HMSConnectionRole(int i13) {
        this.value = i13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
