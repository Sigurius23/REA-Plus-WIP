package x22;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.Action;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import nh3.AbstractC26725a;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: x22.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0003\u0018\u0019\u001a¨\u0006\u001bÀ\u0006\u0003"}, m65681d2 = {"Lx22/a;", "", "v", "t", "o", "g", "e", "s", "r", "u", "d", "n", "j", "b", "m", "a", "l", "p", "c", "q", "k", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Lx22/a$a;", "Lx22/a$n;", "Lx22/a$v;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC37862a {

    /* JADX INFO: renamed from: x22.a$a */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lx22/a$a;", "Lx22/a;", "Lx22/a$c;", "Lx22/a$f;", "Lx22/a$h;", "Lx22/a$i;", "Lx22/a$k;", "Lx22/a$l;", "Lx22/a$m;", "Lx22/a$p;", "Lx22/a$q;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a extends InterfaceC37862a {
    }

    /* JADX INFO: renamed from: x22.a$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lx22/a$b;", "Lx22/a$n;", "Lcom/whoop/navigation/e;", "navAction", "<init>", "(Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class b implements n {

        /* JADX INFO: renamed from: b */
        public static final int f162085b = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navAction;

        public b(C9598e navAction) {
            AbstractC22676k.m65750j(navAction, "navAction");
            this.navAction = navAction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavAction() {
            return this.navAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && AbstractC22676k.m65745e(this.navAction, ((b) other).navAction);
        }

        public int hashCode() {
            return this.navAction.hashCode();
        }

        public String toString() {
            return AbstractC33745d.m106650i("BackendDrivenNavigation(navAction=", this.navAction, ")");
        }
    }

    /* JADX INFO: renamed from: x22.a$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx22/a$c;", "Lx22/a$a;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements a {

        /* JADX INFO: renamed from: a */
        public static final c f162087a = new c();

        private c() {
        }
    }

    /* JADX INFO: renamed from: x22.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lx22/a$d;", "Lx22/a$v;", "", "paymentMethodId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String paymentMethodId;

        public d(String paymentMethodId) {
            AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
            this.paymentMethodId = paymentMethodId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.paymentMethodId, ((d) other).paymentMethodId);
        }

        public int hashCode() {
            return this.paymentMethodId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("DefaultPaymentMethodSucceeded(paymentMethodId=", this.paymentMethodId, ")");
        }
    }

    /* JADX INFO: renamed from: x22.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx22/a$e;", "Lx22/a$v;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements v {

        /* JADX INFO: renamed from: a */
        public static final e f162089a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: x22.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx22/a$f;", "Lx22/a$a;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements a {

        /* JADX INFO: renamed from: a */
        public static final f f162090a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: x22.a$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx22/a$g;", "Lx22/a$v;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements v {

        /* JADX INFO: renamed from: a */
        public static final g f162091a = new g();

        private g() {
        }
    }

    /* JADX INFO: renamed from: x22.a$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx22/a$h;", "Lx22/a$a;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements a {

        /* JADX INFO: renamed from: a */
        public static final h f162092a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: x22.a$i */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx22/a$i;", "Lx22/a$a;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements a {

        /* JADX INFO: renamed from: a */
        public static final i f162093a = new i();

        private i() {
        }
    }

    /* JADX INFO: renamed from: x22.a$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx22/a$j;", "Lx22/a$n;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements n {

        /* JADX INFO: renamed from: a */
        public static final j f162094a = new j();

        private j() {
        }
    }

    /* JADX INFO: renamed from: x22.a$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx22/a$k;", "Lx22/a$a;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements a {

        /* JADX INFO: renamed from: a */
        public static final k f162095a = new k();

        private k() {
        }
    }

    /* JADX INFO: renamed from: x22.a$l */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lx22/a$l;", "Lx22/a$a;", "", "source", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String source;

        public l(String source) {
            AbstractC22676k.m65750j(source, "source");
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof l) && AbstractC22676k.m65745e(this.source, ((l) other).source);
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("InitializeAnalytics(source=", this.source, ")");
        }
    }

    /* JADX INFO: renamed from: x22.a$m */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lx22/a$m;", "", "Lx22/a$a;", NotificationCompat.CATEGORY_EVENT, "Lm91/u;", "element", "<init>", "(Ljava/lang/Object;Lm91/u;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "b", "Lm91/u;", "getElement", "()Lm91/u;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class m implements InterfaceC37862a, a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Object event;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final InterfaceC25312u element;

        public m(Object event, InterfaceC25312u element) {
            AbstractC22676k.m65750j(event, "event");
            AbstractC22676k.m65750j(element, "element");
            this.event = event;
            this.element = element;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getEvent() {
            return this.event;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof m)) {
                return false;
            }
            m mVar = (m) other;
            return AbstractC22676k.m65745e(this.event, mVar.event) && AbstractC22676k.m65745e(this.element, mVar.element);
        }

        public int hashCode() {
            return this.element.hashCode() + (this.event.hashCode() * 31);
        }

        public String toString() {
            return AbstractC33745d.m106652k("ItemClicked(event=", this.event, ", element=", this.element, ")");
        }
    }

    /* JADX INFO: renamed from: x22.a$n */
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Lx22/a$n;", "Lx22/a;", "Lx22/a$b;", "Lx22/a$j;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface n extends InterfaceC37862a {
    }

    /* JADX INFO: renamed from: x22.a$o */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx22/a$o;", "Lx22/a$v;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements v {

        /* JADX INFO: renamed from: a */
        public static final o f162099a = new o();

        private o() {
        }
    }

    /* JADX INFO: renamed from: x22.a$p */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lx22/a$p;", "Lx22/a$a;", "", "", "properties", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class p implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, String> properties;

        public p(Map<String, String> properties) {
            AbstractC22676k.m65750j(properties, "properties");
            this.properties = properties;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m121412a() {
            return this.properties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof p) && AbstractC22676k.m65745e(this.properties, ((p) other).properties);
        }

        public int hashCode() {
            return this.properties.hashCode();
        }

        public String toString() {
            return AbstractC26725a.m79504h("PaymentMethodManagementScreenViewedAnalyticEvent(properties=", ")", this.properties);
        }
    }

    /* JADX INFO: renamed from: x22.a$q */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R%\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lx22/a$q;", "Lx22/a$a;", "", "", "properties", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class q implements a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Map<String, String> properties;

        public q(Map<String, String> map) {
            this.properties = map;
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m121413a() {
            return this.properties;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof q) && AbstractC22676k.m65745e(this.properties, ((q) other).properties);
        }

        public int hashCode() {
            Map<String, String> map = this.properties;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        public String toString() {
            return AbstractC26725a.m79504h("PaymentMethodSettingsTileClicked(properties=", ")", this.properties);
        }
    }

    /* JADX INFO: renamed from: x22.a$r */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lx22/a$r;", "Lx22/a$v;", "", "paymentMethodId", "postalCode", "screenName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class r implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String paymentMethodId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String postalCode;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String screenName;

        public r(String paymentMethodId, String str, String screenName) {
            AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
            AbstractC22676k.m65750j(screenName, "screenName");
            this.paymentMethodId = paymentMethodId;
            this.postalCode = str;
            this.screenName = screenName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPaymentMethodId() {
            return this.paymentMethodId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getScreenName() {
            return this.screenName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof r)) {
                return false;
            }
            r rVar = (r) other;
            return AbstractC22676k.m65745e(this.paymentMethodId, rVar.paymentMethodId) && AbstractC22676k.m65745e(this.postalCode, rVar.postalCode) && AbstractC22676k.m65745e(this.screenName, rVar.screenName);
        }

        public int hashCode() {
            int iHashCode = this.paymentMethodId.hashCode() * 31;
            String str = this.postalCode;
            return this.screenName.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            return AbstractC25012a.m73376i(this.screenName, ")", AbstractC11895b.m32001t("PaymentSheetCompleted(paymentMethodId=", this.paymentMethodId, ", postalCode=", this.postalCode, ", screenName="));
        }
    }

    /* JADX INFO: renamed from: x22.a$s */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lx22/a$s;", "Lx22/a$v;", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "<init>", "(Lcom/whoop/whoopaction/domain/models/Action;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whoopaction/domain/models/Action;", "()Lcom/whoop/whoopaction/domain/models/Action;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class s implements v {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Action action;

        public s(Action action) {
            AbstractC22676k.m65750j(action, "action");
            this.action = action;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof s) && AbstractC22676k.m65745e(this.action, ((s) other).action);
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        public String toString() {
            return AbstractC11478a.m30856h("PerformAction(action=", this.action, ")");
        }
    }

    /* JADX INFO: renamed from: x22.a$t */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx22/a$t;", "Lx22/a$v;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements v {

        /* JADX INFO: renamed from: a */
        public static final t f162106a = new t();

        private t() {
        }
    }

    /* JADX INFO: renamed from: x22.a$u */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lx22/a$u;", "Lx22/a$v;", "<init>", "()V", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements v {

        /* JADX INFO: renamed from: a */
        public static final u f162107a = new u();

        private u() {
        }
    }

    /* JADX INFO: renamed from: x22.a$v */
    @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lx22/a$v;", "Lx22/a;", "Lx22/a$d;", "Lx22/a$e;", "Lx22/a$g;", "Lx22/a$o;", "Lx22/a$r;", "Lx22/a$s;", "Lx22/a$t;", "Lx22/a$u;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface v extends InterfaceC37862a {
    }
}
