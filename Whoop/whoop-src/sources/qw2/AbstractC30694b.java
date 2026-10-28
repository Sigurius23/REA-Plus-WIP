package qw2;

import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.LoadingTreatment;
import com.whoop.whoopaction.domain.models.PermissionType;
import com.whoop.whoopaction.domain.models.PickMediaSource;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21166s;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: qw2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000e\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"¨\u0006#"}, m65681d2 = {"Lqw2/b;", "", "<init>", "()V", "Lcom/whoop/whoopaction/domain/models/Action;", "a", "()Lcom/whoop/whoopaction/domain/models/Action;", "action", "c", "i", "n", "f", "g", "d", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "m", "l", "k", "j", "Lqw2/b$a;", "Lqw2/b$b;", "Lqw2/b$c;", "Lqw2/b$d;", "Lqw2/b$e;", "Lqw2/b$f;", "Lqw2/b$g;", "Lqw2/b$h;", "Lqw2/b$i;", "Lqw2/b$j;", "Lqw2/b$k;", "Lqw2/b$l;", "Lqw2/b$m;", "Lqw2/b$n;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30694b {

    /* JADX INFO: renamed from: qw2.b$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\n¨\u0006\u0019"}, m65681d2 = {"Lqw2/b$a;", "Lqw2/b;", "", "message", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "displayMessage", "<init>", "(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC30694b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Action action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String displayMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message, Action action, String str) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
            this.action = action;
            this.displayMessage = str;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDisplayMessage() {
            return this.displayMessage;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.message, aVar.message) && AbstractC22676k.m65745e(this.action, aVar.action) && AbstractC22676k.m65745e(this.displayMessage, aVar.displayMessage);
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Action action = this.action;
            int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
            String str = this.displayMessage;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            String str = this.message;
            Action action = this.action;
            String str2 = this.displayMessage;
            StringBuilder sb4 = new StringBuilder("Error(message=");
            sb4.append(str);
            sb4.append(", action=");
            sb4.append(action);
            sb4.append(", displayMessage=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }

        public /* synthetic */ a(String str, Action action, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : action, (i13 & 4) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: qw2.b$b */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lqw2/b$b;", "Lqw2/b;", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/models/GenericInteraction;", "b", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC30694b {

        /* JADX INFO: renamed from: c */
        public static final int f126321c = GenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final GenericInteraction interaction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(GenericInteraction interaction, Action action) {
            super(null);
            AbstractC22676k.m65750j(interaction, "interaction");
            AbstractC22676k.m65750j(action, "action");
            this.interaction = interaction;
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final GenericInteraction getInteraction() {
            return this.interaction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return AbstractC22676k.m65745e(this.interaction, bVar.interaction) && AbstractC22676k.m65745e(this.action, bVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.interaction.hashCode() * 31);
        }

        public String toString() {
            return "Interaction(interaction=" + this.interaction + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: qw2.b$c */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lqw2/b$c;", "Lqw2/b;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "treatment", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/LoadingTreatment;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "b", "Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "()Lcom/whoop/whoopaction/domain/models/LoadingTreatment;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC30694b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final LoadingTreatment treatment;

        public c(Action action, LoadingTreatment loadingTreatment) {
            super(null);
            this.action = action;
            this.treatment = loadingTreatment;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LoadingTreatment getTreatment() {
            return this.treatment;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.action, cVar.action) && AbstractC22676k.m65745e(this.treatment, cVar.treatment);
        }

        public int hashCode() {
            Action action = this.action;
            int iHashCode = (action == null ? 0 : action.hashCode()) * 31;
            LoadingTreatment loadingTreatment = this.treatment;
            return iHashCode + (loadingTreatment != null ? loadingTreatment.hashCode() : 0);
        }

        public String toString() {
            return "Loading(action=" + this.action + ", treatment=" + this.treatment + ")";
        }

        public /* synthetic */ c(Action action, LoadingTreatment loadingTreatment, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : action, (i13 & 2) != 0 ? null : loadingTreatment);
        }
    }

    /* JADX INFO: renamed from: qw2.b$d */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lqw2/b$d;", "Lqw2/b;", "Lcom/whoop/navigation/e;", "destination", "Lj02/s;", "dismissEvent", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/navigation/e;Lj02/s;Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "b", "()Lcom/whoop/navigation/e;", "Lj02/s;", "c", "()Lj02/s;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC30694b {

        /* JADX INFO: renamed from: d */
        public static final int f126326d = C21166s.f80697d | C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e destination;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final C21166s dismissEvent;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9598e destination, C21166s c21166s, Action action) {
            super(null);
            AbstractC22676k.m65750j(destination, "destination");
            AbstractC22676k.m65750j(action, "action");
            this.destination = destination;
            this.dismissEvent = c21166s;
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C21166s getDismissEvent() {
            return this.dismissEvent;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return AbstractC22676k.m65745e(this.destination, dVar.destination) && AbstractC22676k.m65745e(this.dismissEvent, dVar.dismissEvent) && AbstractC22676k.m65745e(this.action, dVar.action);
        }

        public int hashCode() {
            int iHashCode = this.destination.hashCode() * 31;
            C21166s c21166s = this.dismissEvent;
            return this.action.hashCode() + ((iHashCode + (c21166s == null ? 0 : c21166s.hashCode())) * 31);
        }

        public String toString() {
            return "NavigateTo(destination=" + this.destination + ", dismissEvent=" + this.dismissEvent + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: qw2.b$e */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, m65681d2 = {"Lqw2/b$e;", "Lqw2/b;", "", "stateKey", "Lcom/whoop/whoopaction/domain/models/PickMediaSource;", "source", "Lcom/whoop/navigation/models/GenericInteraction;", "onSuccess", "onError", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/PickMediaSource;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lcom/whoop/whoopaction/domain/models/PickMediaSource;", "d", "()Lcom/whoop/whoopaction/domain/models/PickMediaSource;", "c", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC30694b {

        /* JADX INFO: renamed from: f */
        public static final int f126330f = GenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String stateKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final PickMediaSource source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final GenericInteraction onSuccess;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final GenericInteraction onError;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String stateKey, PickMediaSource source, GenericInteraction genericInteraction, GenericInteraction genericInteraction2, Action action) {
            super(null);
            AbstractC22676k.m65750j(stateKey, "stateKey");
            AbstractC22676k.m65750j(source, "source");
            AbstractC22676k.m65750j(action, "action");
            this.stateKey = stateKey;
            this.source = source;
            this.onSuccess = genericInteraction;
            this.onError = genericInteraction2;
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final GenericInteraction getOnError() {
            return this.onError;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final GenericInteraction getOnSuccess() {
            return this.onSuccess;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final PickMediaSource getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getStateKey() {
            return this.stateKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.stateKey, eVar.stateKey) && this.source == eVar.source && AbstractC22676k.m65745e(this.onSuccess, eVar.onSuccess) && AbstractC22676k.m65745e(this.onError, eVar.onError) && AbstractC22676k.m65745e(this.action, eVar.action);
        }

        public int hashCode() {
            int iHashCode = (this.source.hashCode() + (this.stateKey.hashCode() * 31)) * 31;
            GenericInteraction genericInteraction = this.onSuccess;
            int iHashCode2 = (iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
            GenericInteraction genericInteraction2 = this.onError;
            return this.action.hashCode() + ((iHashCode2 + (genericInteraction2 != null ? genericInteraction2.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "PickMedia(stateKey=" + this.stateKey + ", source=" + this.source + ", onSuccess=" + this.onSuccess + ", onError=" + this.onError + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: qw2.b$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqw2/b$f;", "Lqw2/b;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC30694b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Action action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.action, ((f) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC11478a.m30856h("Refresh(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: qw2.b$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqw2/b$g;", "Lqw2/b;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC30694b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Action action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof g) && AbstractC22676k.m65745e(this.action, ((g) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC11478a.m30856h("Reload(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: qw2.b$h */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lqw2/b$h;", "Lqw2/b;", "Lcom/whoop/whoopaction/domain/models/PermissionType;", "permission", "Lcom/whoop/navigation/models/GenericInteraction;", "onSuccess", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/PermissionType;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/PermissionType;", "c", "()Lcom/whoop/whoopaction/domain/models/PermissionType;", "b", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC30694b {

        /* JADX INFO: renamed from: d */
        public static final int f126338d = GenericInteraction.$stable;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final PermissionType permission;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final GenericInteraction onSuccess;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(PermissionType permission, GenericInteraction genericInteraction, Action action) {
            super(null);
            AbstractC22676k.m65750j(permission, "permission");
            AbstractC22676k.m65750j(action, "action");
            this.permission = permission;
            this.onSuccess = genericInteraction;
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final GenericInteraction getOnSuccess() {
            return this.onSuccess;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final PermissionType getPermission() {
            return this.permission;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof h)) {
                return false;
            }
            h hVar = (h) other;
            return this.permission == hVar.permission && AbstractC22676k.m65745e(this.onSuccess, hVar.onSuccess) && AbstractC22676k.m65745e(this.action, hVar.action);
        }

        public int hashCode() {
            int iHashCode = this.permission.hashCode() * 31;
            GenericInteraction genericInteraction = this.onSuccess;
            return this.action.hashCode() + ((iHashCode + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31);
        }

        public String toString() {
            return "RequestPermission(permission=" + this.permission + ", onSuccess=" + this.onSuccess + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: qw2.b$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqw2/b$i;", "Lqw2/b;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC30694b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Action action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
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
            return AbstractC11478a.m30856h("Saving(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: qw2.b$j */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lqw2/b$j;", "Lqw2/b;", "", "key", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j extends AbstractC30694b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String key, Action action) {
            super(null);
            AbstractC22676k.m65750j(key, "key");
            AbstractC22676k.m65750j(action, "action");
            this.key = key;
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof j)) {
                return false;
            }
            j jVar = (j) other;
            return AbstractC22676k.m65745e(this.key, jVar.key) && AbstractC22676k.m65745e(this.action, jVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.key.hashCode() * 31);
        }

        public String toString() {
            return "StateKeyPopped(key=" + this.key + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: qw2.b$k */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lqw2/b$k;", "Lqw2/b;", "", "key", "Lkotlinx/serialization/json/JsonElement;", "value", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Lcom/whoop/whoopaction/domain/models/Action;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lkotlinx/serialization/json/JsonElement;", "c", "()Lkotlinx/serialization/json/JsonElement;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC30694b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final JsonElement value;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String key, JsonElement value, Action action) {
            super(null);
            AbstractC22676k.m65750j(key, "key");
            AbstractC22676k.m65750j(value, "value");
            AbstractC22676k.m65750j(action, "action");
            this.key = key;
            this.value = value;
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final JsonElement getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof k)) {
                return false;
            }
            k kVar = (k) other;
            return AbstractC22676k.m65745e(this.key, kVar.key) && AbstractC22676k.m65745e(this.value, kVar.value) && AbstractC22676k.m65745e(this.action, kVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + ((this.value.hashCode() + (this.key.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "StateKeyPushed(key=" + this.key + ", value=" + this.value + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: qw2.b$l */
    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lqw2/b$l;", "Lqw2/b;", "", "", "keys", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Ljava/util/Set;Lcom/whoop/whoopaction/domain/models/Action;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l extends AbstractC30694b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Set<String> keys;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Set<String> keys, Action action) {
            super(null);
            AbstractC22676k.m65750j(keys, "keys");
            AbstractC22676k.m65750j(action, "action");
            this.keys = keys;
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b */
        public final Set<String> m94332b() {
            return this.keys;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof l)) {
                return false;
            }
            l lVar = (l) other;
            return AbstractC22676k.m65745e(this.keys, lVar.keys) && AbstractC22676k.m65745e(this.action, lVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.keys.hashCode() * 31);
        }

        public String toString() {
            return "StateKeysCleared(keys=" + this.keys + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: qw2.b$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lqw2/b$m;", "Lqw2/b;", "", "", "", "state", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Ljava/util/Map;Lcom/whoop/whoopaction/domain/models/Action;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC30694b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, Object> state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Map<String, ? extends Object> state, Action action) {
            super(null);
            AbstractC22676k.m65750j(state, "state");
            AbstractC22676k.m65750j(action, "action");
            this.state = state;
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b */
        public final Map<String, Object> m94333b() {
            return this.state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.state, mVar.state) && AbstractC22676k.m65745e(this.action, mVar.action);
        }

        public int hashCode() {
            return this.action.hashCode() + (this.state.hashCode() * 31);
        }

        public String toString() {
            return "StateUpdated(state=" + this.state + ", action=" + this.action + ")";
        }
    }

    /* JADX INFO: renamed from: qw2.b$n */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lqw2/b$n;", "Lqw2/b;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "whoop-action_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n extends AbstractC30694b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Action action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        @Override // qw2.AbstractC30694b
        /* JADX INFO: renamed from: a, reason: from getter */
        public Action getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof n) && AbstractC22676k.m65745e(this.action, ((n) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC11478a.m30856h("Success(action=", this.action, ")");
        }
    }

    public /* synthetic */ AbstractC30694b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract Action getAction();

    private AbstractC30694b() {
    }
}
