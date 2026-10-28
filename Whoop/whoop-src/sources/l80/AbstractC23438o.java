package l80;

import androidx.core.app.NotificationCompat;
import com.whoop.activation.domain.models.ActivationFlowCtaDestinations;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import m83.C25272z;
import nh3.AbstractC26725a;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: l80.o */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m65681d2 = {"Ll80/o;", "", "<init>", "()V", "g", "k", "b", "c", "i", "a", "f", "j", "e", "d", "l", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "m", "Ll80/o$a;", "Ll80/o$b;", "Ll80/o$c;", "Ll80/o$d;", "Ll80/o$e;", "Ll80/o$f;", "Ll80/o$g;", "Ll80/o$h;", "Ll80/o$i;", "Ll80/o$j;", "Ll80/o$k;", "Ll80/o$l;", "Ll80/o$m;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23438o {

    /* JADX INFO: renamed from: l80.o$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ll80/o$a;", "Ll80/o;", "Lcom/whoop/navigation/e;", "action", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC23438o {

        /* JADX INFO: renamed from: b */
        public static final int f92868b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9598e action) {
            super(null);
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.action, ((a) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("ActivationFlowNavigationAction(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: l80.o$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Ll80/o$b;", "Ll80/o;", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "destination", "from", "<init>", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "b", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b extends AbstractC23438o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ActivationFlowDestination destination;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ActivationFlowDestination from;

        public b(ActivationFlowDestination activationFlowDestination, ActivationFlowDestination activationFlowDestination2) {
            super(null);
            this.destination = activationFlowDestination;
            this.from = activationFlowDestination2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivationFlowDestination getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ActivationFlowDestination getFrom() {
            return this.from;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return this.destination == bVar.destination && this.from == bVar.from;
        }

        public int hashCode() {
            ActivationFlowDestination activationFlowDestination = this.destination;
            int iHashCode = (activationFlowDestination == null ? 0 : activationFlowDestination.hashCode()) * 31;
            ActivationFlowDestination activationFlowDestination2 = this.from;
            return iHashCode + (activationFlowDestination2 != null ? activationFlowDestination2.hashCode() : 0);
        }

        public String toString() {
            return "GoBackToPreviousDestination(destination=" + this.destination + ", from=" + this.from + ")";
        }

        public /* synthetic */ b(ActivationFlowDestination activationFlowDestination, ActivationFlowDestination activationFlowDestination2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : activationFlowDestination, (i13 & 2) != 0 ? null : activationFlowDestination2);
        }
    }

    /* JADX INFO: renamed from: l80.o$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Ll80/o$c;", "Ll80/o;", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC23438o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String key, String value) {
            super(null);
            AbstractC22676k.m65750j(key, "key");
            AbstractC22676k.m65750j(value, "value");
            this.key = key;
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.key, cVar.key) && AbstractC22676k.m65745e(this.value, cVar.value);
        }

        public int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        public String toString() {
            return AbstractC2875y.m8300m("GoBackWithParameter(key=", this.key, ", value=", this.value, ")");
        }
    }

    /* JADX INFO: renamed from: l80.o$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ll80/o$d;", "Ll80/o;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC23438o {

        /* JADX INFO: renamed from: a */
        public static final d f92874a = new d();

        private d() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: l80.o$e */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, m65681d2 = {"Ll80/o$e;", "Ll80/o;", "", "message", "referralType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC23438o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String referralType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String message, String str) {
            super(null);
            AbstractC22676k.m65750j(message, "message");
            this.message = message;
            this.referralType = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getReferralType() {
            return this.referralType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.message, eVar.message) && AbstractC22676k.m65745e(this.referralType, eVar.referralType);
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            String str = this.referralType;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("LaunchRafShareSheet(message=", this.message, ", referralType=", this.referralType, ")");
        }
    }

    /* JADX INFO: renamed from: l80.o$f */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ll80/o$f;", "Ll80/o;", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "route", "<init>", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC23438o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ActivationFlowDestination route;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ActivationFlowDestination route) {
            super(null);
            AbstractC22676k.m65750j(route, "route");
            this.route = route;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivationFlowDestination getRoute() {
            return this.route;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && this.route == ((f) other).route;
        }

        public int hashCode() {
            return this.route.hashCode();
        }

        public String toString() {
            return "NavBackToDestination(route=" + this.route + ")";
        }
    }

    /* JADX INFO: renamed from: l80.o$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ll80/o$h;", "Ll80/o;", "Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;", "ctaDestination", "<init>", "(Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;", "()Lcom/whoop/activation/domain/models/ActivationFlowCtaDestinations;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC23438o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ActivationFlowCtaDestinations ctaDestination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ActivationFlowCtaDestinations ctaDestination) {
            super(null);
            AbstractC22676k.m65750j(ctaDestination, "ctaDestination");
            this.ctaDestination = ctaDestination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivationFlowCtaDestinations getCtaDestination() {
            return this.ctaDestination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && this.ctaDestination == ((h) other).ctaDestination;
        }

        public int hashCode() {
            return this.ctaDestination.hashCode();
        }

        public String toString() {
            return "NavToCtaDestination(ctaDestination=" + this.ctaDestination + ")";
        }
    }

    /* JADX INFO: renamed from: l80.o$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ll80/o$i;", "Ll80/o;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC23438o {

        /* JADX INFO: renamed from: a */
        public static final i f92881a = new i();

        private i() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: l80.o$j */
    @Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Ll80/o$j;", "Ll80/o;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC23438o {
    }

    /* JADX INFO: renamed from: l80.o$k */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ll80/o$k;", "Ll80/o;", "Ll80/v;", "page", "<init>", "(Ll80/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll80/v;", "()Ll80/v;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k extends AbstractC23438o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final EnumC23445v page;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(EnumC23445v page) {
            super(null);
            AbstractC22676k.m65750j(page, "page");
            this.page = page;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final EnumC23445v getPage() {
            return this.page;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && this.page == ((k) other).page;
        }

        public int hashCode() {
            return this.page.hashCode();
        }

        public String toString() {
            return "NavigateToSupport(page=" + this.page + ")";
        }

        public /* synthetic */ k(EnumC23445v enumC23445v, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? EnumC23445v.GETTING_STARTED : enumC23445v);
        }
    }

    /* JADX INFO: renamed from: l80.o$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ll80/o$l;", "Ll80/o;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC23438o {

        /* JADX INFO: renamed from: a */
        public static final l f92883a = new l();

        private l() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: l80.o$m */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Ll80/o$m;", "Ll80/o;", "", NotificationCompat.CATEGORY_EMAIL, "", "passwordNeedsReset", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m extends AbstractC23438o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String email;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean passwordNeedsReset;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String email, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(email, "email");
            this.email = email;
            this.passwordNeedsReset = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getPasswordNeedsReset() {
            return this.passwordNeedsReset;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.email, mVar.email) && this.passwordNeedsReset == mVar.passwordNeedsReset;
        }

        public int hashCode() {
            return Boolean.hashCode(this.passwordNeedsReset) + (this.email.hashCode() * 31);
        }

        public String toString() {
            return AbstractC26725a.m79503g("PostMfaSuccess(email=", this.email, ", passwordNeedsReset=", ")", this.passwordNeedsReset);
        }
    }

    public /* synthetic */ AbstractC23438o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC23438o() {
    }

    /* JADX INFO: renamed from: l80.o$g */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Ll80/o$g;", "Ll80/o;", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "route", "", "", "", "arguments", "<init>", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "b", "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "Ljava/util/Map;", "()Ljava/util/Map;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class g extends AbstractC23438o {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ActivationFlowDestination route;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Map<String, Object> arguments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ActivationFlowDestination route, Map<String, ? extends Object> arguments) {
            super(null);
            AbstractC22676k.m65750j(route, "route");
            AbstractC22676k.m65750j(arguments, "arguments");
            this.route = route;
            this.arguments = arguments;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, Object> m67992a() {
            return this.arguments;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ActivationFlowDestination getRoute() {
            return this.route;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof g)) {
                return false;
            }
            g gVar = (g) other;
            return this.route == gVar.route && AbstractC22676k.m65745e(this.arguments, gVar.arguments);
        }

        public int hashCode() {
            return this.arguments.hashCode() + (this.route.hashCode() * 31);
        }

        public String toString() {
            return "NavToActivationDestination(route=" + this.route + ", arguments=" + this.arguments + ")";
        }

        public /* synthetic */ g(ActivationFlowDestination activationFlowDestination, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(activationFlowDestination, (i13 & 2) != 0 ? C25272z.f99163w : map);
        }
    }
}
