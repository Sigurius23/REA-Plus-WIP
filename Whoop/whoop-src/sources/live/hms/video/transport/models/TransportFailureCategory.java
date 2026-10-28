package live.hms.video.transport.models;

import ge3.AbstractC15751g;
import java.util.HashMap;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 live.hms.video.transport.models.TransportFailureCategory, still in use, count: 1, list:
  (r0v0 live.hms.video.transport.models.TransportFailureCategory) from 0x004a: CONSTRUCTOR 
  (r0v0 live.hms.video.transport.models.TransportFailureCategory)
  (wrap live.hms.video.transport.models.TransportFailureCategory[]:0x0046: NEW_ARRAY (0 int) A[WRAPPED] type: live.hms.video.transport.models.TransportFailureCategory[])
 A[MD:(java.lang.Object, java.lang.Object):void (m), WRAPPED] call: l83.k.<init>(java.lang.Object, java.lang.Object):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m65681d2 = {"Llive/hms/video/transport/models/TransportFailureCategory;", "", "<init>", "(Ljava/lang/String;I)V", "ConnectFailed", "SignalDisconnect", "JoinAPIFailed", "PublishIceConnectionFailed", "SubscribeIceConnectionFailed", "Companion", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class TransportFailureCategory {
    ConnectFailed,
    SignalDisconnect,
    JoinAPIFailed,
    PublishIceConnectionFailed,
    SubscribeIceConnectionFailed;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final HashMap<TransportFailureCategory, TransportFailureCategory[]> dependencies;

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Llive/hms/video/transport/models/TransportFailureCategory$Companion;", "", "<init>", "()V", "dependencies", "Ljava/util/HashMap;", "Llive/hms/video/transport/models/TransportFailureCategory;", "", "getDependencies", "()Ljava/util/HashMap;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HashMap<TransportFailureCategory, TransportFailureCategory[]> getDependencies() {
            return TransportFailureCategory.dependencies;
        }

        private Companion() {
        }
    }

    static {
        TransportFailureCategory transportFailureCategory = SignalDisconnect;
        TransportFailureCategory[] transportFailureCategoryArrValues = values();
        $ENTRIES = AbstractC15751g.m44468u(transportFailureCategoryArrValues);
        INSTANCE = new Companion(null);
        dependencies = AbstractC25247g0.m73987V(new C23465k(transportFailureCategory, new TransportFailureCategory[0]), new C23465k(transportFailureCategory, new TransportFailureCategory[0]), new C23465k(transportFailureCategory, new TransportFailureCategory[]{transportFailureCategory}), new C23465k(transportFailureCategory, new TransportFailureCategory[]{transportFailureCategory}), new C23465k(transportFailureCategory, new TransportFailureCategory[]{transportFailureCategory}));
    }

    private TransportFailureCategory() {
        super(str, i);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static TransportFailureCategory valueOf(String str) {
        return (TransportFailureCategory) Enum.valueOf(TransportFailureCategory.class, str);
    }

    public static TransportFailureCategory[] values() {
        return (TransportFailureCategory[]) $VALUES.clone();
    }
}
