package mk2;

import com.whoop.domain.model.UnitSystem;
import com.whoop.trackactivity.domain.models.SessionTargets;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.OffsetDateTime;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import x90.C38098d;

/* JADX INFO: renamed from: mk2.n */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u000f\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0006\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u000f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, m65681d2 = {"Lmk2/n;", "", "<init>", "()V", "Lmk2/q;", "state", "a", "(Lmk2/q;)Lmk2/q;", "e", "f", "d", "g", "o", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "l", "m", "k", "j", "n", "b", "c", "i", "Lmk2/n$a;", "Lmk2/n$b;", "Lmk2/n$c;", "Lmk2/n$d;", "Lmk2/n$e;", "Lmk2/n$f;", "Lmk2/n$g;", "Lmk2/n$h;", "Lmk2/n$i;", "Lmk2/n$j;", "Lmk2/n$k;", "Lmk2/n$l;", "Lmk2/n$m;", "Lmk2/n$n;", "Lmk2/n$o;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
abstract class AbstractC25647n {

    /* JADX INFO: renamed from: mk2.n$a */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/n$a;", "Lmk2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC25647n {

        /* JADX INFO: renamed from: a */
        public static final a f100627a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 1085676293;
        }

        public String toString() {
            return "DiscardFailed";
        }
    }

    /* JADX INFO: renamed from: mk2.n$b */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/n$b;", "Lmk2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC25647n {

        /* JADX INFO: renamed from: a */
        public static final b f100628a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1514368327;
        }

        public String toString() {
            return "DiscardStarted";
        }
    }

    /* JADX INFO: renamed from: mk2.n$c */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/n$c;", "Lmk2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC25647n {

        /* JADX INFO: renamed from: a */
        public static final c f100629a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -534485351;
        }

        public String toString() {
            return "DiscardSucceeded";
        }
    }

    /* JADX INFO: renamed from: mk2.n$d */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/n$d;", "Lmk2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC25647n {

        /* JADX INFO: renamed from: a */
        public static final d f100630a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 1879272327;
        }

        public String toString() {
            return "HandoffFailed";
        }
    }

    /* JADX INFO: renamed from: mk2.n$e */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m65681d2 = {"Lmk2/n$e;", "Lmk2/n;", "Lmk2/p$k;", "action", "Lx90/d;", "activeSession", "Lmk2/l;", "initialTrackSessionState", "", "activityDisplayName", "Lmk2/j;", "contentType", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "<init>", "(Lmk2/p$k;Lx90/d;Lmk2/l;Ljava/lang/String;Lmk2/j;Lcom/whoop/domain/model/UnitSystem;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk2/p$k;", "b", "()Lmk2/p$k;", "Lx90/d;", "c", "()Lx90/d;", "Lmk2/l;", "f", "()Lmk2/l;", "d", "Ljava/lang/String;", "e", "Lmk2/j;", "()Lmk2/j;", "Lcom/whoop/domain/model/UnitSystem;", "g", "()Lcom/whoop/domain/model/UnitSystem;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC25647n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC25649p.k action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C38098d activeSession;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final C25645l initialTrackSessionState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final String activityDisplayName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final EnumC25643j contentType;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final UnitSystem unitSystem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC25649p.k action, C38098d c38098d, C25645l c25645l, String activityDisplayName, EnumC25643j contentType, UnitSystem unitSystem) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            AbstractC22676k.m65750j(activityDisplayName, "activityDisplayName");
            AbstractC22676k.m65750j(contentType, "contentType");
            AbstractC22676k.m65750j(unitSystem, "unitSystem");
            this.action = action;
            this.activeSession = c38098d;
            this.initialTrackSessionState = c25645l;
            this.activityDisplayName = activityDisplayName;
            this.contentType = contentType;
            this.unitSystem = unitSystem;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC25649p.k getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C38098d getActiveSession() {
            return this.activeSession;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getActivityDisplayName() {
            return this.activityDisplayName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final EnumC25643j getContentType() {
            return this.contentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.action, eVar.action) && AbstractC22676k.m65745e(this.activeSession, eVar.activeSession) && AbstractC22676k.m65745e(this.initialTrackSessionState, eVar.initialTrackSessionState) && AbstractC22676k.m65745e(this.activityDisplayName, eVar.activityDisplayName) && this.contentType == eVar.contentType && this.unitSystem == eVar.unitSystem;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final C25645l getInitialTrackSessionState() {
            return this.initialTrackSessionState;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final UnitSystem getUnitSystem() {
            return this.unitSystem;
        }

        public int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            C38098d c38098d = this.activeSession;
            int iHashCode2 = (iHashCode + (c38098d == null ? 0 : c38098d.hashCode())) * 31;
            C25645l c25645l = this.initialTrackSessionState;
            return this.unitSystem.hashCode() + ((this.contentType.hashCode() + AbstractC11266d.m30450d((iHashCode2 + (c25645l != null ? c25645l.hashCode() : 0)) * 31, 31, this.activityDisplayName)) * 31);
        }

        public String toString() {
            return "HandoffStarted(action=" + this.action + ", activeSession=" + this.activeSession + ", initialTrackSessionState=" + this.initialTrackSessionState + ", activityDisplayName=" + this.activityDisplayName + ", contentType=" + this.contentType + ", unitSystem=" + this.unitSystem + ")";
        }
    }

    /* JADX INFO: renamed from: mk2.n$f */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/n$f;", "Lmk2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC25647n {

        /* JADX INFO: renamed from: a */
        public static final f f100637a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return 1984966359;
        }

        public String toString() {
            return "HandoffSucceeded";
        }
    }

    /* JADX INFO: renamed from: mk2.n$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lmk2/n$g;", "Lmk2/n;", "Lmk2/l;", "trackSessionState", "<init>", "(Lmk2/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk2/l;", "b", "()Lmk2/l;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC25647n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C25645l trackSessionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C25645l trackSessionState) {
            super(null);
            AbstractC22676k.m65750j(trackSessionState, "trackSessionState");
            this.trackSessionState = trackSessionState;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C25645l getTrackSessionState() {
            return this.trackSessionState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.trackSessionState, ((g) other).trackSessionState);
        }

        public int hashCode() {
            return this.trackSessionState.hashCode();
        }

        public String toString() {
            return "LiveStateUpdated(trackSessionState=" + this.trackSessionState + ")";
        }
    }

    /* JADX INFO: renamed from: mk2.n$h */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/n$h;", "Lmk2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC25647n {

        /* JADX INFO: renamed from: a */
        public static final h f100639a = new h();

        private h() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof h);
        }

        public int hashCode() {
            return 272601414;
        }

        public String toString() {
            return "Loading";
        }
    }

    /* JADX INFO: renamed from: mk2.n$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lmk2/n$i;", "Lmk2/n;", "Lmk2/p$h;", "action", "<init>", "(Lmk2/p$h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk2/p$h;", "b", "()Lmk2/p$h;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC25647n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final InterfaceC25649p.h action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC25649p.h action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC25649p.h getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.action, ((i) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return "PassiveAction(action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: mk2.n$j */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\n¨\u0006\u001a"}, m65681d2 = {"Lmk2/n$j;", "Lmk2/n;", "Ljava/time/OffsetDateTime;", "startTime", "endTime", "", "activityInternalName", "<init>", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "d", "()Ljava/time/OffsetDateTime;", "b", "c", "Ljava/lang/String;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC25647n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final OffsetDateTime startTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final OffsetDateTime endTime;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityInternalName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(OffsetDateTime startTime, OffsetDateTime endTime, String activityInternalName) {
            super(null);
            AbstractC22676k.m65750j(startTime, "startTime");
            AbstractC22676k.m65750j(endTime, "endTime");
            AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
            this.startTime = startTime;
            this.endTime = endTime;
            this.activityInternalName = activityInternalName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityInternalName() {
            return this.activityInternalName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final OffsetDateTime getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final OffsetDateTime getStartTime() {
            return this.startTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.startTime, jVar.startTime) && AbstractC22676k.m65745e(this.endTime, jVar.endTime) && AbstractC22676k.m65745e(this.activityInternalName, jVar.activityInternalName);
        }

        public int hashCode() {
            return this.activityInternalName.hashCode() + ((this.endTime.hashCode() + (this.startTime.hashCode() * 31)) * 31);
        }

        public String toString() {
            OffsetDateTime offsetDateTime = this.startTime;
            OffsetDateTime offsetDateTime2 = this.endTime;
            String str = this.activityInternalName;
            StringBuilder sb4 = new StringBuilder("SaveConflict(startTime=");
            sb4.append(offsetDateTime);
            sb4.append(", endTime=");
            sb4.append(offsetDateTime2);
            sb4.append(", activityInternalName=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: mk2.n$k */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/n$k;", "Lmk2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC25647n {

        /* JADX INFO: renamed from: a */
        public static final k f100644a = new k();

        private k() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof k);
        }

        public int hashCode() {
            return 236603255;
        }

        public String toString() {
            return "SaveLost";
        }
    }

    /* JADX INFO: renamed from: mk2.n$l */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/n$l;", "Lmk2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC25647n {

        /* JADX INFO: renamed from: a */
        public static final l f100645a = new l();

        private l() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof l);
        }

        public int hashCode() {
            return -1714317039;
        }

        public String toString() {
            return "Saved";
        }
    }

    /* JADX INFO: renamed from: mk2.n$m */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/n$m;", "Lmk2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC25647n {

        /* JADX INFO: renamed from: a */
        public static final m f100646a = new m();

        private m() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof m);
        }

        public int hashCode() {
            return 1774118802;
        }

        public String toString() {
            return "SavedOffline";
        }
    }

    /* JADX INFO: renamed from: mk2.n$n */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lmk2/n$n;", "Lmk2/n;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC25647n {

        /* JADX INFO: renamed from: a */
        public static final n f100647a = new n();

        private n() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof n);
        }

        public int hashCode() {
            return -1405662214;
        }

        public String toString() {
            return "SessionEnded";
        }
    }

    /* JADX INFO: renamed from: mk2.n$o */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lmk2/n$o;", "Lmk2/n;", "Lcom/whoop/trackactivity/domain/models/SessionTargets;", "targets", "<init>", "(Lcom/whoop/trackactivity/domain/models/SessionTargets;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/trackactivity/domain/models/SessionTargets;", "b", "()Lcom/whoop/trackactivity/domain/models/SessionTargets;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o extends AbstractC25647n {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final SessionTargets targets;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(SessionTargets targets) {
            super(null);
            AbstractC22676k.m65750j(targets, "targets");
            this.targets = targets;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SessionTargets getTargets() {
            return this.targets;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof o) && AbstractC22676k.m65745e(this.targets, ((o) other).targets);
        }

        public int hashCode() {
            return this.targets.hashCode();
        }

        public String toString() {
            return "TargetsUpdated(targets=" + this.targets + ")";
        }
    }

    public /* synthetic */ AbstractC25647n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public final C25650q m75464a(C25650q state) {
        String selectedActivityInternalName;
        AbstractC22676k.m65750j(state, "state");
        if (this instanceof e) {
            e eVar = (e) this;
            C38098d activeSession = eVar.getActiveSession();
            if (activeSession == null || (selectedActivityInternalName = activeSession.getSelectedActivityInternalName()) == null) {
                selectedActivityInternalName = eVar.getAction().getSelectedActivityInternalName();
            }
            String str = selectedActivityInternalName;
            String activityDisplayName = eVar.getActivityDisplayName();
            EnumC25643j contentType = eVar.getContentType();
            C38098d activeSession2 = eVar.getActiveSession();
            return new C25650q(str, activityDisplayName, contentType, activeSession2 != null ? activeSession2.getGpsTrackingEnabled() : eVar.getAction().getGpsTrackingEnabled(), eVar.getAction().getRestoreSessionDestination(), InterfaceC25648o.c.f100651a, false, null, eVar.getInitialTrackSessionState(), null, null, eVar.getUnitSystem(), 1728, null);
        }
        if (equals(f.f100637a)) {
            return C25650q.m75484b(state, null, null, null, false, null, null, false, null, null, null, null, null, 4063, null);
        }
        if (equals(d.f100630a)) {
            return C25650q.m75484b(state, null, null, null, false, null, InterfaceC25648o.h.f100658a, false, null, null, null, null, null, 4063, null);
        }
        if (this instanceof g) {
            return C25650q.m75484b(state, null, null, null, false, null, null, false, null, ((g) this).getTrackSessionState(), null, null, null, 3839, null);
        }
        if (this instanceof o) {
            return C25650q.m75484b(state, null, null, null, false, null, null, false, null, null, ((o) this).getTargets(), null, null, 3583, null);
        }
        if (equals(h.f100639a)) {
            return C25650q.m75484b(state, null, null, null, false, null, InterfaceC25648o.c.f100651a, false, null, null, null, null, null, 4063, null);
        }
        if (equals(l.f100645a)) {
            return C25650q.m75484b(state, null, null, null, false, null, InterfaceC25648o.f.f100656a, false, null, null, null, null, null, 4063, null);
        }
        if (equals(m.f100646a)) {
            return C25650q.m75484b(state, null, null, null, false, null, InterfaceC25648o.g.f100657a, false, null, null, null, null, null, 4063, null);
        }
        if (equals(k.f100644a)) {
            return C25650q.m75484b(state, null, null, null, false, null, InterfaceC25648o.e.f100655a, false, null, null, null, null, null, 4063, null);
        }
        if (this instanceof j) {
            j jVar = (j) this;
            return C25650q.m75484b(state, null, null, null, false, null, new InterfaceC25648o.d(jVar.getStartTime(), jVar.getEndTime(), jVar.getActivityInternalName()), false, null, null, null, null, null, 4063, null);
        }
        if (equals(n.f100647a)) {
            return AbstractC25652s.m75539d(state);
        }
        if (equals(b.f100628a)) {
            return C25650q.m75484b(state, null, null, null, false, null, null, true, null, null, null, null, null, 4031, null);
        }
        if (equals(a.f100627a)) {
            return C25650q.m75484b(state, null, null, null, false, null, null, false, null, null, null, null, null, 4031, null);
        }
        if (equals(c.f100629a)) {
            return C25650q.m75484b(AbstractC25652s.m75539d(state), null, null, null, false, null, InterfaceC25648o.c.f100651a, false, null, null, null, null, null, 3999, null);
        }
        if (this instanceof i) {
            return AbstractC25652s.m75538c(state, ((i) this).getAction());
        }
        throw new NoWhenBranchMatchedException();
    }

    private AbstractC25647n() {
    }
}
