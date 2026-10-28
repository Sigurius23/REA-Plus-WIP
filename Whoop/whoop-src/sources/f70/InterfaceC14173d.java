package f70;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.activation.domain.models.ConsentSubmission;
import com.whoop.activation.domain.models.steps.CommitmentType;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.domain.model.UnitSystem;
import d70.C11748b;
import d70.C11749c;
import d70.C11750d;
import d70.C11751e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p90.C28997e;
import r80.EnumC31059a;

/* JADX INFO: renamed from: f70.d */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u001f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u0082\u0001 !\"#$%&'()*+,-./0123456789:;<=>?@¨\u0006AÀ\u0006\u0003"}, m65681d2 = {"Lf70/d;", "", "y", "c", "x", "a", "o", "p", "q", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "t", "a0", "b0", "z", "c0", "f", "e", "d", "b", "s", "r", "j", "v", "u", "k", "n", "m", "l", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "d0", "e0", "Lf70/d$a;", "Lf70/d$b;", "Lf70/d$c;", "Lf70/d$d;", "Lf70/d$e;", "Lf70/d$f;", "Lf70/d$x;", "Lf70/d$y$a;", "Lf70/d$y$b;", "Lf70/d$y$c;", "Lf70/d$y$d;", "Lf70/d$y$e;", "Lf70/d$y$f;", "Lf70/d$y$g;", "Lf70/d$y$h;", "Lf70/d$y$i;", "Lf70/d$y$j;", "Lf70/d$y$k;", "Lf70/d$y$l;", "Lf70/d$y$m;", "Lf70/d$y$n;", "Lf70/d$y$o;", "Lf70/d$y$p;", "Lf70/d$y$q;", "Lf70/d$y$r;", "Lf70/d$y$s;", "Lf70/d$z;", "Lf70/d$a0;", "Lf70/d$b0;", "Lf70/d$c0;", "Lf70/d$d0;", "Lf70/d$e0;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14173d {

    /* JADX INFO: renamed from: f70.d$a */
    @Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lf70/d$a;", "Lf70/d;", "Lf70/d$g;", "Lf70/d$h;", "Lf70/d$i;", "Lf70/d$j;", "Lf70/d$k;", "Lf70/d$l;", "Lf70/d$m;", "Lf70/d$n;", "Lf70/d$o;", "Lf70/d$p;", "Lf70/d$q;", "Lf70/d$r;", "Lf70/d$s;", "Lf70/d$t;", "Lf70/d$u;", "Lf70/d$v;", "Lf70/d$w;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a extends InterfaceC14173d {
    }

    /* JADX INFO: renamed from: f70.d$a0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$a0;", "Lf70/d;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements InterfaceC14173d {

        /* JADX INFO: renamed from: a */
        public static final a0 f51109a = new a0();

        private a0() {
        }
    }

    /* JADX INFO: renamed from: f70.d$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$b;", "Lf70/d;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC14173d {

        /* JADX INFO: renamed from: a */
        public static final b f51110a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: f70.d$b0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$b0;", "Lf70/d;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements InterfaceC14173d {

        /* JADX INFO: renamed from: a */
        public static final b0 f51111a = new b0();

        private b0() {
        }
    }

    /* JADX INFO: renamed from: f70.d$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$c;", "Lf70/d;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC14173d {

        /* JADX INFO: renamed from: a */
        public static final c f51112a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: f70.d$c0 */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lf70/d$c0;", "Lf70/d;", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentDestination", "<init>", "(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c0 implements InterfaceC14173d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ActivationFlowDestination currentDestination;

        public c0(ActivationFlowDestination currentDestination) {
            AbstractC22676k.m65750j(currentDestination, "currentDestination");
            this.currentDestination = currentDestination;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivationFlowDestination getCurrentDestination() {
            return this.currentDestination;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c0) && this.currentDestination == ((c0) other).currentDestination;
        }

        public int hashCode() {
            return this.currentDestination.hashCode();
        }

        public String toString() {
            return "PreviousScreen(currentDestination=" + this.currentDestination + ")";
        }
    }

    /* JADX INFO: renamed from: f70.d$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$d;", "Lf70/d;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC14173d {

        /* JADX INFO: renamed from: a */
        public static final d f51114a = new d();

        private d() {
        }
    }

    /* JADX INFO: renamed from: f70.d$d0 */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lf70/d$d0;", "Lf70/d;", "", "shouldDismissError", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d0 implements InterfaceC14173d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean shouldDismissError;

        public d0(boolean z4) {
            this.shouldDismissError = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getShouldDismissError() {
            return this.shouldDismissError;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d0) && this.shouldDismissError == ((d0) other).shouldDismissError;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldDismissError);
        }

        public String toString() {
            return AbstractC3855a.m11827k("SetDismissErrorState(shouldDismissError=", ")", this.shouldDismissError);
        }
    }

    /* JADX INFO: renamed from: f70.d$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$e;", "Lf70/d;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC14173d {

        /* JADX INFO: renamed from: a */
        public static final e f51116a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: f70.d$e0 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$e0;", "Lf70/d;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e0 implements InterfaceC14173d {

        /* JADX INFO: renamed from: a */
        public static final e0 f51117a = new e0();

        private e0() {
        }
    }

    /* JADX INFO: renamed from: f70.d$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lf70/d$f;", "Lf70/d;", "", "type", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f implements InterfaceC14173d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String type;

        public f(String type) {
            AbstractC22676k.m65750j(type, "type");
            this.type = type;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.type, ((f) other).type);
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DismissLoginError(type=", this.type, ")");
        }
    }

    /* JADX INFO: renamed from: f70.d$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$g;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements a {

        /* JADX INFO: renamed from: a */
        public static final g f51119a = new g();

        private g() {
        }
    }

    /* JADX INFO: renamed from: f70.d$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$h;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements a {

        /* JADX INFO: renamed from: a */
        public static final h f51120a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: f70.d$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$i;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements a {

        /* JADX INFO: renamed from: a */
        public static final i f51121a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: f70.d$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$j;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements a {

        /* JADX INFO: renamed from: a */
        public static final j f51122a = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: f70.d$k */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lf70/d$k;", "Lf70/d$a;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class k implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        public k(String str) {
            this.source = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof k) && AbstractC22676k.m65745e(this.source, ((k) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("FetchAfterActivationFinalScreens(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: f70.d$l */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$l;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements a {

        /* JADX INFO: renamed from: a */
        public static final l f51124a = new l();

        private l() {
        }
    }

    /* JADX INFO: renamed from: f70.d$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$m;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements a {

        /* JADX INFO: renamed from: a */
        public static final m f51125a = new m();

        private m() {
        }
    }

    /* JADX INFO: renamed from: f70.d$n */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$n;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements a {

        /* JADX INFO: renamed from: a */
        public static final n f51126a = new n();

        private n() {
        }
    }

    /* JADX INFO: renamed from: f70.d$o */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$o;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements a {

        /* JADX INFO: renamed from: a */
        public static final o f51127a = new o();

        private o() {
        }
    }

    /* JADX INFO: renamed from: f70.d$p */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$p;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements a {

        /* JADX INFO: renamed from: a */
        public static final p f51128a = new p();

        private p() {
        }
    }

    /* JADX INFO: renamed from: f70.d$q */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$q;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements a {

        /* JADX INFO: renamed from: a */
        public static final q f51129a = new q();

        private q() {
        }
    }

    /* JADX INFO: renamed from: f70.d$r */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$r;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements a {

        /* JADX INFO: renamed from: a */
        public static final r f51130a = new r();

        private r() {
        }
    }

    /* JADX INFO: renamed from: f70.d$s */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$s;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements a {

        /* JADX INFO: renamed from: a */
        public static final s f51131a = new s();

        private s() {
        }
    }

    /* JADX INFO: renamed from: f70.d$t */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$t;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements a {

        /* JADX INFO: renamed from: a */
        public static final t f51132a = new t();

        private t() {
        }
    }

    /* JADX INFO: renamed from: f70.d$u */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$u;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements a {

        /* JADX INFO: renamed from: a */
        public static final u f51133a = new u();

        private u() {
        }
    }

    /* JADX INFO: renamed from: f70.d$v */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$v;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements a {

        /* JADX INFO: renamed from: a */
        public static final v f51134a = new v();

        private v() {
        }
    }

    /* JADX INFO: renamed from: f70.d$w */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lf70/d$w;", "Lf70/d$a;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements a {

        /* JADX INFO: renamed from: a */
        public static final w f51135a = new w();

        private w() {
        }
    }

    /* JADX INFO: renamed from: f70.d$x */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lf70/d$x;", "Lf70/d;", "Ld70/c;", NotificationCompat.CATEGORY_EMAIL, "", "fromPostPairing", "<init>", "(Ld70/c;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/c;", "()Ld70/c;", "b", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class x implements InterfaceC14173d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C11749c email;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean fromPostPairing;

        public x(C11749c email, boolean z4) {
            AbstractC22676k.m65750j(email, "email");
            this.email = email;
            this.fromPostPairing = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C11749c getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getFromPostPairing() {
            return this.fromPostPairing;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof x)) {
                return false;
            }
            x xVar = (x) other;
            return AbstractC22676k.m65745e(this.email, xVar.email) && this.fromPostPairing == xVar.fromPostPairing;
        }

        public int hashCode() {
            return Boolean.hashCode(this.fromPostPairing) + (this.email.hashCode() * 31);
        }

        public String toString() {
            return "ForgotPassword(email=" + this.email + ", fromPostPairing=" + this.fromPostPairing + ")";
        }
    }

    /* JADX INFO: renamed from: f70.d$y */
    @Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, m65681d2 = {"Lf70/d$y;", "", "<init>", "()V", "f", "k", "j", "e", "n", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "o", "c", "m", "l", "p", "s", "b", "q", "a", "r", "i", "Lf70/d$y$a;", "Lf70/d$y$b;", "Lf70/d$y$c;", "Lf70/d$y$d;", "Lf70/d$y$e;", "Lf70/d$y$f;", "Lf70/d$y$g;", "Lf70/d$y$h;", "Lf70/d$y$i;", "Lf70/d$y$j;", "Lf70/d$y$k;", "Lf70/d$y$l;", "Lf70/d$y$m;", "Lf70/d$y$n;", "Lf70/d$y$o;", "Lf70/d$y$p;", "Lf70/d$y$q;", "Lf70/d$y$r;", "Lf70/d$y$s;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class y {

        /* JADX INFO: renamed from: f70.d$y$a */
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lf70/d$y$a;", "Lf70/d;", "Lf70/d$y;", "<init>", "()V", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a */
            public static final a f51138a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: f70.d$y$b */
        @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lf70/d$y$b;", "Lf70/d$y;", "Lf70/d;", "", "centimeters", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "<init>", "(ILcom/whoop/domain/model/UnitSystem;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/domain/model/UnitSystem;", "()Lcom/whoop/domain/model/UnitSystem;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int centimeters;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final UnitSystem unitSystem;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i13, UnitSystem unitSystem) {
                super(null);
                AbstractC22676k.m65750j(unitSystem, "unitSystem");
                this.centimeters = i13;
                this.unitSystem = unitSystem;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getCentimeters() {
                return this.centimeters;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final UnitSystem getUnitSystem() {
                return this.unitSystem;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof b)) {
                    return false;
                }
                b bVar = (b) other;
                return this.centimeters == bVar.centimeters && this.unitSystem == bVar.unitSystem;
            }

            public int hashCode() {
                return this.unitSystem.hashCode() + (Integer.hashCode(this.centimeters) * 31);
            }

            public String toString() {
                return "HeightSubmitted(centimeters=" + this.centimeters + ", unitSystem=" + this.unitSystem + ")";
            }
        }

        /* JADX INFO: renamed from: f70.d$y$c */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lf70/d$y$c;", "Lf70/d$y;", "Lf70/d;", "Lr80/a;", "billingFrequency", "<init>", "(Lr80/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lr80/a;", "()Lr80/a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final EnumC31059a billingFrequency;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(EnumC31059a billingFrequency) {
                super(null);
                AbstractC22676k.m65750j(billingFrequency, "billingFrequency");
                this.billingFrequency = billingFrequency;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final EnumC31059a getBillingFrequency() {
                return this.billingFrequency;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && this.billingFrequency == ((c) other).billingFrequency;
            }

            public int hashCode() {
                return this.billingFrequency.hashCode();
            }

            public String toString() {
                return "OnBillingFrequencySelected(billingFrequency=" + this.billingFrequency + ")";
            }
        }

        /* JADX INFO: renamed from: f70.d$y$d */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lf70/d$y$d;", "Lf70/d$y;", "Lf70/d;", "Ld70/b;", "birthday", "<init>", "(Ld70/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/b;", "()Ld70/b;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C11748b birthday;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C11748b birthday) {
                super(null);
                AbstractC22676k.m65750j(birthday, "birthday");
                this.birthday = birthday;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C11748b getBirthday() {
                return this.birthday;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof d) && AbstractC22676k.m65745e(this.birthday, ((d) other).birthday);
            }

            public int hashCode() {
                return this.birthday.hashCode();
            }

            public String toString() {
                return "OnBirthdaySubmitted(birthday=" + this.birthday + ")";
            }
        }

        /* JADX INFO: renamed from: f70.d$y$e */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lf70/d$y$e;", "Lf70/d$y;", "Lf70/d;", "", "country", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String country;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String country) {
                super(null);
                AbstractC22676k.m65750j(country, "country");
                this.country = country;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCountry() {
                return this.country;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof e) && AbstractC22676k.m65745e(this.country, ((e) other).country);
            }

            public int hashCode() {
                return this.country.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("OnCountrySubmitted(country=", this.country, ")");
            }
        }

        /* JADX INFO: renamed from: f70.d$y$f */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lf70/d$y$f;", "Lf70/d$y;", "Lf70/d;", "Ld70/c;", NotificationCompat.CATEGORY_EMAIL, "<init>", "(Ld70/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/c;", "()Ld70/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class f extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C11749c email;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(C11749c email) {
                super(null);
                AbstractC22676k.m65750j(email, "email");
                this.email = email;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C11749c getEmail() {
                return this.email;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof f) && AbstractC22676k.m65745e(this.email, ((f) other).email);
            }

            public int hashCode() {
                return this.email.hashCode();
            }

            public String toString() {
                return "OnEmailSubmitted(email=" + this.email + ")";
            }
        }

        /* JADX INFO: renamed from: f70.d$y$g */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lf70/d$y$g;", "Lf70/d$y;", "Lf70/d;", "", "type", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String type;

            public g(String str) {
                super(null);
                this.type = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof g) && AbstractC22676k.m65745e(this.type, ((g) other).type);
            }

            public int hashCode() {
                String str = this.type;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("OnGenderBaselineSubmitted(type=", this.type, ")");
            }
        }

        /* JADX INFO: renamed from: f70.d$y$h */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lf70/d$y$h;", "Lf70/d$y;", "Lf70/d;", "", "type", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class h extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String type) {
                super(null);
                AbstractC22676k.m65750j(type, "type");
                this.type = type;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof h) && AbstractC22676k.m65745e(this.type, ((h) other).type);
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("OnGenderSubmitted(type=", this.type, ")");
            }
        }

        /* JADX INFO: renamed from: f70.d$y$i */
        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lf70/d$y$i;", "Lf70/d$y;", "Lf70/d;", "", "optedIn", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class i extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean optedIn;

            public i(boolean z4) {
                super(null);
                this.optedIn = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getOptedIn() {
                return this.optedIn;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof i) && this.optedIn == ((i) other).optedIn;
            }

            public int hashCode() {
                return Boolean.hashCode(this.optedIn);
            }

            public String toString() {
                return AbstractC3855a.m11827k("OnMarketingOptInChanged(optedIn=", ")", this.optedIn);
            }
        }

        /* JADX INFO: renamed from: f70.d$y$j */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lf70/d$y$j;", "Lf70/d$y;", "Lf70/d;", "Ld70/d;", "firstName", "lastName", "", "userName", "<init>", "(Ld70/d;Ld70/d;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/d;", "()Ld70/d;", "b", "c", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class j extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C11750d firstName;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final C11750d lastName;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String userName;

            public j(C11750d c11750d, C11750d c11750d2, String str) {
                super(null);
                this.firstName = c11750d;
                this.lastName = c11750d2;
                this.userName = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C11750d getFirstName() {
                return this.firstName;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final C11750d getLastName() {
                return this.lastName;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getUserName() {
                return this.userName;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof j)) {
                    return false;
                }
                j jVar = (j) other;
                return AbstractC22676k.m65745e(this.firstName, jVar.firstName) && AbstractC22676k.m65745e(this.lastName, jVar.lastName) && AbstractC22676k.m65745e(this.userName, jVar.userName);
            }

            public int hashCode() {
                C11750d c11750d = this.firstName;
                int iHashCode = (c11750d == null ? 0 : c11750d.hashCode()) * 31;
                C11750d c11750d2 = this.lastName;
                int iHashCode2 = (iHashCode + (c11750d2 == null ? 0 : c11750d2.hashCode())) * 31;
                String str = this.userName;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public String toString() {
                C11750d c11750d = this.firstName;
                C11750d c11750d2 = this.lastName;
                String str = this.userName;
                StringBuilder sb4 = new StringBuilder("OnNameInfoSubmitted(firstName=");
                sb4.append(c11750d);
                sb4.append(", lastName=");
                sb4.append(c11750d2);
                sb4.append(", userName=");
                return AbstractC25012a.m73376i(str, ")", sb4);
            }
        }

        /* JADX INFO: renamed from: f70.d$y$k */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lf70/d$y$k;", "Lf70/d$y;", "Lf70/d;", "Ld70/e;", "password", "", "filledViaCredentialManager", "<init>", "(Ld70/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ld70/e;", "b", "()Ld70/e;", "Z", "()Z", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class k extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C11751e password;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final boolean filledViaCredentialManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(C11751e password, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(password, "password");
                this.password = password;
                this.filledViaCredentialManager = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getFilledViaCredentialManager() {
                return this.filledViaCredentialManager;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final C11751e getPassword() {
                return this.password;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof k)) {
                    return false;
                }
                k kVar = (k) other;
                return AbstractC22676k.m65745e(this.password, kVar.password) && this.filledViaCredentialManager == kVar.filledViaCredentialManager;
            }

            public int hashCode() {
                return Boolean.hashCode(this.filledViaCredentialManager) + (this.password.hashCode() * 31);
            }

            public String toString() {
                return "OnPasswordSubmitted(password=" + this.password + ", filledViaCredentialManager=" + this.filledViaCredentialManager + ")";
            }
        }

        /* JADX INFO: renamed from: f70.d$y$l */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, m65681d2 = {"Lf70/d$y$l;", "Lf70/d$y;", "Lf70/d;", "", "paymentMethodIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class l extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int paymentMethodIndex;

            public l(int i13) {
                super(null);
                this.paymentMethodIndex = i13;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getPaymentMethodIndex() {
                return this.paymentMethodIndex;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof l) && this.paymentMethodIndex == ((l) other).paymentMethodIndex;
            }

            public int hashCode() {
                return Integer.hashCode(this.paymentMethodIndex);
            }

            public String toString() {
                return AbstractC2875y.m8296i(this.paymentMethodIndex, "OnPaymentMethodSelected(paymentMethodIndex=", ")");
            }
        }

        /* JADX INFO: renamed from: f70.d$y$m */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lf70/d$y$m;", "Lf70/d$y;", "Lf70/d;", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "commitmentType", "<init>", "(Lcom/whoop/activation/domain/models/steps/CommitmentType;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/activation/domain/models/steps/CommitmentType;", "()Lcom/whoop/activation/domain/models/steps/CommitmentType;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class m extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final CommitmentType commitmentType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(CommitmentType commitmentType) {
                super(null);
                AbstractC22676k.m65750j(commitmentType, "commitmentType");
                this.commitmentType = commitmentType;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CommitmentType getCommitmentType() {
                return this.commitmentType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof m) && this.commitmentType == ((m) other).commitmentType;
            }

            public int hashCode() {
                return this.commitmentType.hashCode();
            }

            public String toString() {
                return "OnSelectedCommitmentType(commitmentType=" + this.commitmentType + ")";
            }
        }

        /* JADX INFO: renamed from: f70.d$y$n */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lf70/d$y$n;", "Lf70/d$y;", "Lf70/d;", "", "state", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class n extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(String state) {
                super(null);
                AbstractC22676k.m65750j(state, "state");
                this.state = state;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getState() {
                return this.state;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof n) && AbstractC22676k.m65745e(this.state, ((n) other).state);
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("OnStateSubmitted(state=", this.state, ")");
            }
        }

        /* JADX INFO: renamed from: f70.d$y$o */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lf70/d$y$o;", "Lf70/d$y;", "Lf70/d;", "", "stripeToken", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class o extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String stripeToken;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public o(String stripeToken) {
                super(null);
                AbstractC22676k.m65750j(stripeToken, "stripeToken");
                this.stripeToken = stripeToken;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getStripeToken() {
                return this.stripeToken;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof o) && AbstractC22676k.m65745e(this.stripeToken, ((o) other).stripeToken);
            }

            public int hashCode() {
                return this.stripeToken.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("OnStripeTokenCreated(stripeToken=", this.stripeToken, ")");
            }
        }

        /* JADX INFO: renamed from: f70.d$y$p */
        @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lf70/d$y$p;", "Lf70/d$y;", "Lf70/d;", "", "consentsAccepted", "marketingOptIn", "recommendationOptIn", "", "Lcom/whoop/activation/domain/models/ConsentSubmission;", "consentSubmissions", "<init>", "(ZZZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class p extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean consentsAccepted;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final boolean marketingOptIn;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final boolean recommendationOptIn;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final List<ConsentSubmission> consentSubmissions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public p(boolean z4, boolean z13, boolean z14, List<ConsentSubmission> consentSubmissions) {
                super(null);
                AbstractC22676k.m65750j(consentSubmissions, "consentSubmissions");
                this.consentsAccepted = z4;
                this.marketingOptIn = z13;
                this.recommendationOptIn = z14;
                this.consentSubmissions = consentSubmissions;
            }

            /* JADX INFO: renamed from: a */
            public final List<ConsentSubmission> m40393a() {
                return this.consentSubmissions;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getConsentsAccepted() {
                return this.consentsAccepted;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getMarketingOptIn() {
                return this.marketingOptIn;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getRecommendationOptIn() {
                return this.recommendationOptIn;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof p)) {
                    return false;
                }
                p pVar = (p) other;
                return this.consentsAccepted == pVar.consentsAccepted && this.marketingOptIn == pVar.marketingOptIn && this.recommendationOptIn == pVar.recommendationOptIn && AbstractC22676k.m65745e(this.consentSubmissions, pVar.consentSubmissions);
            }

            public int hashCode() {
                return this.consentSubmissions.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.consentsAccepted) * 31, 31, this.marketingOptIn), 31, this.recommendationOptIn);
            }

            public String toString() {
                boolean z4 = this.consentsAccepted;
                boolean z13 = this.marketingOptIn;
                boolean z14 = this.recommendationOptIn;
                List<ConsentSubmission> list = this.consentSubmissions;
                StringBuilder sbM32002u = AbstractC11895b.m32002u("OnTermsSubmitted(consentsAccepted=", ", marketingOptIn=", ", recommendationOptIn=", z4, z13);
                sbM32002u.append(z14);
                sbM32002u.append(", consentSubmissions=");
                sbM32002u.append(list);
                sbM32002u.append(")");
                return sbM32002u.toString();
            }
        }

        /* JADX INFO: renamed from: f70.d$y$q */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, m65681d2 = {"Lf70/d$y$q;", "Lf70/d$y;", "Lf70/d;", "", "selectedRafCodesAmount", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class q extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int selectedRafCodesAmount;

            public q(int i13) {
                super(null);
                this.selectedRafCodesAmount = i13;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getSelectedRafCodesAmount() {
                return this.selectedRafCodesAmount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof q) && this.selectedRafCodesAmount == ((q) other).selectedRafCodesAmount;
            }

            public int hashCode() {
                return Integer.hashCode(this.selectedRafCodesAmount);
            }

            public String toString() {
                return AbstractC2875y.m8296i(this.selectedRafCodesAmount, "RafCodesSelected(selectedRafCodesAmount=", ")");
            }
        }

        /* JADX INFO: renamed from: f70.d$y$r */
        @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lf70/d$y$r;", "Lf70/d$y;", "Lf70/d;", "Lp90/e;", "card", "<init>", "(Lp90/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp90/e;", "()Lp90/e;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class r extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final C28997e card;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(C28997e card) {
                super(null);
                AbstractC22676k.m65750j(card, "card");
                this.card = card;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final C28997e getCard() {
                return this.card;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof r) && AbstractC22676k.m65745e(this.card, ((r) other).card);
            }

            public int hashCode() {
                return this.card.hashCode();
            }

            public String toString() {
                return "StoreCardInMemberInfo(card=" + this.card + ")";
            }
        }

        /* JADX INFO: renamed from: f70.d$y$s */
        @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lf70/d$y$s;", "Lf70/d$y;", "Lf70/d;", "", "pounds", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "<init>", "(ILcom/whoop/domain/model/UnitSystem;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/whoop/domain/model/UnitSystem;", "()Lcom/whoop/domain/model/UnitSystem;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class s extends y implements InterfaceC14173d {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int pounds;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final UnitSystem unitSystem;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public s(int i13, UnitSystem unitSystem) {
                super(null);
                AbstractC22676k.m65750j(unitSystem, "unitSystem");
                this.pounds = i13;
                this.unitSystem = unitSystem;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getPounds() {
                return this.pounds;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final UnitSystem getUnitSystem() {
                return this.unitSystem;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof s)) {
                    return false;
                }
                s sVar = (s) other;
                return this.pounds == sVar.pounds && this.unitSystem == sVar.unitSystem;
            }

            public int hashCode() {
                return this.unitSystem.hashCode() + (Integer.hashCode(this.pounds) * 31);
            }

            public String toString() {
                return "WeightSubmitted(pounds=" + this.pounds + ", unitSystem=" + this.unitSystem + ")";
            }
        }

        public /* synthetic */ y(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private y() {
        }
    }

    /* JADX INFO: renamed from: f70.d$z */
    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lf70/d$z;", "Lf70/d;", "", "isSkipAction", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "currentDestination", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "<init>", "(ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "()Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "()Lcom/whoop/activation/iajf/domain/SignUpSource;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class z implements InterfaceC14173d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean isSkipAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final ActivationFlowDestination currentDestination;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final SignUpSource signUpSource;

        public z(boolean z4, ActivationFlowDestination activationFlowDestination, SignUpSource signUpSource) {
            AbstractC22676k.m65750j(signUpSource, "signUpSource");
            this.isSkipAction = z4;
            this.currentDestination = activationFlowDestination;
            this.signUpSource = signUpSource;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivationFlowDestination getCurrentDestination() {
            return this.currentDestination;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SignUpSource getSignUpSource() {
            return this.signUpSource;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsSkipAction() {
            return this.isSkipAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof z)) {
                return false;
            }
            z zVar = (z) other;
            return this.isSkipAction == zVar.isSkipAction && this.currentDestination == zVar.currentDestination && this.signUpSource == zVar.signUpSource;
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.isSkipAction) * 31;
            ActivationFlowDestination activationFlowDestination = this.currentDestination;
            return this.signUpSource.hashCode() + ((iHashCode + (activationFlowDestination == null ? 0 : activationFlowDestination.hashCode())) * 31);
        }

        public String toString() {
            return "NextBffScreen(isSkipAction=" + this.isSkipAction + ", currentDestination=" + this.currentDestination + ", signUpSource=" + this.signUpSource + ")";
        }
    }
}
