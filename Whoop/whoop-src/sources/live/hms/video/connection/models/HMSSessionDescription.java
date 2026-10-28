package live.hms.video.connection.models;

import com.google.gson.annotations.SerializedName;
import ge3.AbstractC15751g;
import hms.webrtc.SessionDescription;
import l83.C23454a0;
import live.hms.video.utils.HMSLogger;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001c"}, m65681d2 = {"Llive/hms/video/connection/models/HMSSessionDescription;", "", "type", "Llive/hms/video/connection/models/HMSSessionDescription$Type;", "description", "", "sfuNodeId", "<init>", "(Llive/hms/video/connection/models/HMSSessionDescription$Type;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Llive/hms/video/connection/models/HMSSessionDescription$Type;", "getDescription", "()Ljava/lang/String;", "getSfuNodeId", "native", "Lhms/webrtc/SessionDescription;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Type", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSSessionDescription {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "HMSSessionDescription";

    @SerializedName("sdp")
    private final String description;

    @SerializedName("sfu_node_id")
    private final String sfuNodeId;

    @SerializedName("type")
    private final Type type;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"Llive/hms/video/connection/models/HMSSessionDescription$Companion;", "", "<init>", "()V", "TAG", "", "from", "Llive/hms/video/connection/models/HMSSessionDescription;", "src", "Lhms/webrtc/SessionDescription;", "nodeID", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {

        @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SessionDescription.Type.values().length];
                try {
                    iArr[SessionDescription.Type.OFFER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SessionDescription.Type.PRANSWER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SessionDescription.Type.ANSWER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ HMSSessionDescription from$default(Companion companion, SessionDescription sessionDescription, String str, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = null;
            }
            return companion.from(sessionDescription, str);
        }

        public final HMSSessionDescription from(SessionDescription src, String nodeID) {
            Object obj;
            AbstractC22676k.m65750j(src, "src");
            SessionDescription.Type type = src.type;
            AbstractC22676k.m65747g(type);
            int i13 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i13 == 1) {
                obj = Type.OFFER;
            } else if (i13 == 2) {
                obj = Type.PRANSWER;
            } else if (i13 != 3) {
                HMSLogger.m71137e(HMSSessionDescription.TAG, " Received unexpected SDP of type ROLLBACK");
                obj = C23454a0.f92919a;
            } else {
                obj = Type.ANSWER;
            }
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type live.hms.video.connection.models.HMSSessionDescription.Type");
            String description = src.description;
            AbstractC22676k.m65749i(description, "description");
            return new HMSSessionDescription((Type) obj, description, nodeID);
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m65681d2 = {"Llive/hms/video/connection/models/HMSSessionDescription$Type;", "", "<init>", "(Ljava/lang/String;I)V", "OFFER", "PRANSWER", "ANSWER", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public enum Type {
        OFFER,
        PRANSWER,
        ANSWER;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.OFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.PRANSWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.ANSWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HMSSessionDescription(Type type, String description, String str) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(description, "description");
        this.type = type;
        this.description = description;
        this.sfuNodeId = str;
    }

    public static /* synthetic */ HMSSessionDescription copy$default(HMSSessionDescription hMSSessionDescription, Type type, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            type = hMSSessionDescription.type;
        }
        if ((i13 & 2) != 0) {
            str = hMSSessionDescription.description;
        }
        if ((i13 & 4) != 0) {
            str2 = hMSSessionDescription.sfuNodeId;
        }
        return hMSSessionDescription.copy(type, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSfuNodeId() {
        return this.sfuNodeId;
    }

    public final HMSSessionDescription copy(Type type, String description, String sfuNodeId) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(description, "description");
        return new HMSSessionDescription(type, description, sfuNodeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSSessionDescription)) {
            return false;
        }
        HMSSessionDescription hMSSessionDescription = (HMSSessionDescription) other;
        return this.type == hMSSessionDescription.type && AbstractC22676k.m65745e(this.description, hMSSessionDescription.description) && AbstractC22676k.m65745e(this.sfuNodeId, hMSSessionDescription.sfuNodeId);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getSfuNodeId() {
        return this.sfuNodeId;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.type.hashCode() * 31, 31, this.description);
        String str = this.sfuNodeId;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public final SessionDescription m134454native() {
        SessionDescription.Type type;
        int i13 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i13 == 1) {
            type = SessionDescription.Type.OFFER;
        } else if (i13 == 2) {
            type = SessionDescription.Type.PRANSWER;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            type = SessionDescription.Type.ANSWER;
        }
        return new SessionDescription(type, this.description);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("HMSSessionDescription(type=");
        sb4.append(this.type);
        sb4.append(", description=");
        sb4.append(this.description);
        sb4.append(", sfuNodeId=");
        return AbstractC25012a.m73377j(sb4, this.sfuNodeId, ')');
    }

    public /* synthetic */ HMSSessionDescription(Type type, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, str, (i13 & 4) != 0 ? null : str2);
    }
}
