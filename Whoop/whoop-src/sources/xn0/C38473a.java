package xn0;

import androidx.core.app.FrameMetricsAggregator;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wn0.AbstractC37410a;
import wn0.AbstractC37412c;
import wn0.AbstractC37415f;
import wn0.C37411b;
import wn0.C37413d;

/* JADX INFO: renamed from: xn0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m65681d2 = {"Lxn0/a;", "Lod1/g;", "Lxn0/b;", "Lxn0/c;", "Lwn0/d;", "passwordResetSubmissionHandler", "Lwn0/b;", "passwordRequirementsFetcher", "Lxn0/d;", "sendNewResetLinkHandler", "Ltr2/n;", "logger", "<init>", "(Lwn0/d;Lwn0/b;Lxn0/d;Ltr2/n;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lwn0/d;", "b", "Lwn0/b;", "c", "Lxn0/d;", "d", "Ltr2/n;", "e", "Lxn0/c;", "initialDomainResult", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38473a implements InterfaceC27844g<AbstractC38474b, C38475c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C37413d passwordResetSubmissionHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C37411b passwordRequirementsFetcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C38476d sendNewResetLinkHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C38475c initialDomainResult;

    /* JADX INFO: renamed from: xn0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lxn0/a$a;", "", "<init>", "()V", "i", "g", "f", "j", "b", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "d", "a", "Lxn0/a$a$a;", "Lxn0/a$a$b;", "Lxn0/a$a$c;", "Lxn0/a$a$d;", "Lxn0/a$a$e;", "Lxn0/a$a$f;", "Lxn0/a$a$g;", "Lxn0/a$a$h;", "Lxn0/a$a$i;", "Lxn0/a$a$j;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: xn0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lxn0/a$a$a;", "Lxn0/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42659a extends a {

            /* JADX INFO: renamed from: a */
            public static final C42659a f164781a = new C42659a();

            private C42659a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C42659a);
            }

            public int hashCode() {
                return 750559478;
            }

            public String toString() {
                return "ConfirmExit";
            }
        }

        /* JADX INFO: renamed from: xn0.a$a$b */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lxn0/a$a$b;", "Lxn0/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a */
            public static final b f164782a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 127657894;
            }

            public String toString() {
                return "DismissError";
            }
        }

        /* JADX INFO: renamed from: xn0.a$a$c */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lxn0/a$a$c;", "Lxn0/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a */
            public static final c f164783a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 1587974440;
            }

            public String toString() {
                return "DismissExitDialog";
            }
        }

        /* JADX INFO: renamed from: xn0.a$a$d */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lxn0/a$a$d;", "Lxn0/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: a */
            public static final d f164784a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -590304777;
            }

            public String toString() {
                return "GoBack";
            }
        }

        /* JADX INFO: renamed from: xn0.a$a$e */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxn0/a$a$e;", "Lxn0/a$a;", "Lxn0/e;", "result", "<init>", "(Lxn0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxn0/e;", "()Lxn0/e;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC38477e result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(AbstractC38477e result) {
                super(null);
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC38477e getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof e) && AbstractC22676k.m65745e(this.result, ((e) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "NewLinkResult(result=" + this.result + ")";
            }
        }

        /* JADX INFO: renamed from: xn0.a$a$f */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lxn0/a$a$f;", "Lxn0/a$a;", "", "password", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class f extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String password;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String password) {
                super(null);
                AbstractC22676k.m65750j(password, "password");
                this.password = password;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getPassword() {
                return this.password;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof f) && AbstractC22676k.m65745e(this.password, ((f) other).password);
            }

            public int hashCode() {
                return this.password.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("PasswordUpdated(password=", this.password, ")");
            }
        }

        /* JADX INFO: renamed from: xn0.a$a$g */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxn0/a$a$g;", "Lxn0/a$a;", "Lwn0/a;", "result", "<init>", "(Lwn0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwn0/a;", "()Lwn0/a;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC37410a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(AbstractC37410a result) {
                super(null);
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC37410a getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof g) && AbstractC22676k.m65745e(this.result, ((g) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "RequirementsFetched(result=" + this.result + ")";
            }
        }

        /* JADX INFO: renamed from: xn0.a$a$h */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lxn0/a$a$h;", "Lxn0/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class h extends a {

            /* JADX INFO: renamed from: a */
            public static final h f164788a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return 1935409899;
            }

            public String toString() {
                return "ShowExitDialog";
            }
        }

        /* JADX INFO: renamed from: xn0.a$a$i */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lxn0/a$a$i;", "Lxn0/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class i extends a {

            /* JADX INFO: renamed from: a */
            public static final i f164789a = new i();

            private i() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return 1131390071;
            }

            public String toString() {
                return "ShowLoading";
            }
        }

        /* JADX INFO: renamed from: xn0.a$a$j */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lxn0/a$a$j;", "Lxn0/a$a;", "Lwn0/f;", "result", "<init>", "(Lwn0/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwn0/f;", "()Lwn0/f;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class j extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC37415f result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(AbstractC37415f result) {
                super(null);
                AbstractC22676k.m65750j(result, "result");
                this.result = result;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AbstractC37415f getResult() {
                return this.result;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof j) && AbstractC22676k.m65745e(this.result, ((j) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "SubmitResult(result=" + this.result + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: xn0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.reset.PasswordResetInteractor$interact$$inlined$flatMapLatest$1", m100430f = "PasswordResetInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f164791w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f164792x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f164793y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C38473a f164794z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C38473a c38473a) {
            super(3, interfaceC30057d);
            this.f164794z = c38473a;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC38474b abstractC38474b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f164794z);
            bVar.f164792x = interfaceC13062m;
            bVar.f164793y = abstractC38474b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            InterfaceC13058l c13084s1;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164791w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f164792x;
                AbstractC38474b abstractC38474b = (AbstractC38474b) this.f164793y;
                if (abstractC38474b instanceof AbstractC38474b.e) {
                    c0456u = new C13084s1(this.f164794z.new c(null));
                } else {
                    if (abstractC38474b instanceof AbstractC38474b.h) {
                        c13084s1 = new C0456u(new a.f(((AbstractC38474b.h) abstractC38474b).getPassword()), 1);
                    } else if (abstractC38474b instanceof AbstractC38474b.g) {
                        c13084s1 = new C13084s1(this.f164794z.new d(abstractC38474b, null));
                    } else if (abstractC38474b instanceof AbstractC38474b.c) {
                        c0456u = new C0456u(a.b.f164782a, 1);
                    } else if (abstractC38474b instanceof AbstractC38474b.f) {
                        c13084s1 = new C13084s1(this.f164794z.new e(abstractC38474b, null));
                    } else if (abstractC38474b instanceof AbstractC38474b.d) {
                        c0456u = new C0456u(a.c.f164783a, 1);
                    } else if (abstractC38474b instanceof AbstractC38474b.a) {
                        c0456u = ((AbstractC38474b.a) abstractC38474b).getIsExpired() ? new C0456u(a.d.f164784a, 1) : new C0456u(a.h.f164788a, 1);
                    } else {
                        if (!(abstractC38474b instanceof AbstractC38474b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u = new C0456u(a.C42659a.f164781a, 1);
                    }
                    c0456u = c13084s1;
                }
                this.f164792x = null;
                this.f164793y = null;
                this.f164791w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC38474b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: xn0.a$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.reset.PasswordResetInteractor$interact$1$1", m100430f = "PasswordResetInteractor.kt", m100431l = {50, 51, 52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lxn0/a$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f164795w;

        /* JADX INFO: renamed from: x */
        int f164796x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f164797y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C38473a.this.new c(interfaceC30057d);
            cVar.f164797y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
        
            if (r0.emit(r2, r6) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f164797y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f164796x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 == r5) goto L27
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                java.lang.Object r0 = r6.f164795w
                wn0.a r0 = (wn0.AbstractC37410a) r0
                p505ts.AbstractC34132o.m107864I(r7)
                goto L61
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L4c
            L27:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L3b
            L2b:
                p505ts.AbstractC34132o.m107864I(r7)
                xn0.a$a$i r7 = xn0.C38473a.a.i.f164789a
                r6.f164797y = r0
                r6.f164796x = r5
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L3b
                goto L60
            L3b:
                xn0.a r7 = xn0.C38473a.this
                wn0.b r7 = xn0.C38473a.m123267c(r7)
                r6.f164797y = r0
                r6.f164796x = r4
                java.lang.Object r7 = r7.m119771b(r6)
                if (r7 != r1) goto L4c
                goto L60
            L4c:
                wn0.a r7 = (wn0.AbstractC37410a) r7
                xn0.a$a$g r2 = new xn0.a$a$g
                r2.<init>(r7)
                r7 = 0
                r6.f164797y = r7
                r6.f164795w = r7
                r6.f164796x = r3
                java.lang.Object r7 = r0.emit(r2, r6)
                if (r7 != r1) goto L61
            L60:
                return r1
            L61:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: xn0.C38473a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: xn0.a$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.reset.PasswordResetInteractor$interact$1$2", m100430f = "PasswordResetInteractor.kt", m100431l = {62, 63, 69}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lxn0/a$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC38474b f164799E;

        /* JADX INFO: renamed from: w */
        Object f164800w;

        /* JADX INFO: renamed from: x */
        int f164801x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f164802y;

        /* JADX INFO: renamed from: xn0.a$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.reset.PasswordResetInteractor$interact$1$2$result$1", m100430f = "PasswordResetInteractor.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lwn0/f;", "<anonymous>", "(Lbc3/c0;)Lwn0/f;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f164804w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38473a f164805x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC38474b f164806y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C38473a c38473a, AbstractC38474b abstractC38474b, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f164805x = c38473a;
                this.f164806y = abstractC38474b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f164805x, this.f164806y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC37415f> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f164804w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C37413d c37413d = this.f164805x.passwordResetSubmissionHandler;
                String token = ((AbstractC38474b.g) this.f164806y).getToken();
                String newPassword = ((AbstractC38474b.g) this.f164806y).getNewPassword();
                this.f164804w = 1;
                Object objM119774c = c37413d.m119774c(token, newPassword, this);
                return objM119774c == enumC31071a ? enumC31071a : objM119774c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC38474b abstractC38474b, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f164799E = abstractC38474b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C38473a.this.new d(this.f164799E, interfaceC30057d);
            dVar.f164802y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f164802y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f164801x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L24
                if (r2 != r3) goto L1c
                java.lang.Object r0 = r7.f164800w
                wn0.f r0 = (wn0.AbstractC37415f) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L66
            L1c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L24:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L52
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3c
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                xn0.a$a$i r8 = xn0.C38473a.a.i.f164789a
                r7.f164802y = r0
                r7.f164801x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L3c
                goto L65
            L3c:
                xn0.a$d$a r8 = new xn0.a$d$a
                xn0.a r2 = xn0.C38473a.this
                xn0.b r5 = r7.f164799E
                r8.<init>(r2, r5, r6)
                r7.f164802y = r0
                r7.f164801x = r4
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = or2.AbstractC28190p0.m85321a(r4, r8, r7)
                if (r8 != r1) goto L52
                goto L65
            L52:
                wn0.f r8 = (wn0.AbstractC37415f) r8
                xn0.a$a$j r2 = new xn0.a$a$j
                r2.<init>(r8)
                r7.f164802y = r6
                r7.f164800w = r6
                r7.f164801x = r3
                java.lang.Object r8 = r0.emit(r2, r7)
                if (r8 != r1) goto L66
            L65:
                return r1
            L66:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xn0.C38473a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: xn0.a$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.reset.PasswordResetInteractor$interact$1$3", m100430f = "PasswordResetInteractor.kt", m100431l = {79, 80, 86}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lxn0/a$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC38474b f164807E;

        /* JADX INFO: renamed from: w */
        Object f164808w;

        /* JADX INFO: renamed from: x */
        int f164809x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f164810y;

        /* JADX INFO: renamed from: xn0.a$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.reset.PasswordResetInteractor$interact$1$3$result$1", m100430f = "PasswordResetInteractor.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lxn0/e;", "<anonymous>", "(Lbc3/c0;)Lxn0/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f164812w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38473a f164813x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC38474b f164814y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C38473a c38473a, AbstractC38474b abstractC38474b, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f164813x = c38473a;
                this.f164814y = abstractC38474b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f164813x, this.f164814y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC38477e> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f164812w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C38476d c38476d = this.f164813x.sendNewResetLinkHandler;
                String expiredToken = ((AbstractC38474b.f) this.f164814y).getExpiredToken();
                String str = ((AbstractC38474b.f) this.f164814y).getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String();
                this.f164812w = 1;
                Object objM123293b = c38476d.m123293b(expiredToken, str, this);
                return objM123293b == enumC31071a ? enumC31071a : objM123293b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC38474b abstractC38474b, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f164807E = abstractC38474b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = C38473a.this.new e(this.f164807E, interfaceC30057d);
            eVar.f164810y = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f164810y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f164809x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L24
                if (r2 != r3) goto L1c
                java.lang.Object r0 = r7.f164808w
                xn0.e r0 = (xn0.AbstractC38477e) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto L66
            L1c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L24:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L52
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L3c
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                xn0.a$a$i r8 = xn0.C38473a.a.i.f164789a
                r7.f164810y = r0
                r7.f164809x = r5
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L3c
                goto L65
            L3c:
                xn0.a$e$a r8 = new xn0.a$e$a
                xn0.a r2 = xn0.C38473a.this
                xn0.b r5 = r7.f164807E
                r8.<init>(r2, r5, r6)
                r7.f164810y = r0
                r7.f164809x = r4
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = or2.AbstractC28190p0.m85321a(r4, r8, r7)
                if (r8 != r1) goto L52
                goto L65
            L52:
                xn0.e r8 = (xn0.AbstractC38477e) r8
                xn0.a$a$e r2 = new xn0.a$a$e
                r2.<init>(r8)
                r7.f164810y = r6
                r7.f164808w = r6
                r7.f164809x = r3
                java.lang.Object r8 = r0.emit(r2, r7)
                if (r8 != r1) goto L66
            L65:
                return r1
            L66:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: xn0.C38473a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: xn0.a$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.interactors.reset.PasswordResetInteractor$interact$2", m100430f = "PasswordResetInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lxn0/c;", "currentResult", "Lxn0/a$a;", "internalAction", "<anonymous>", "(Lxn0/c;Lxn0/a$a;)Lxn0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f164815w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f164816x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f164817y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C38475c c38475c, a aVar, InterfaceC30057d<? super C38475c> interfaceC30057d) {
            f fVar = new f(interfaceC30057d);
            fVar.f164816x = c38475c;
            fVar.f164817y = aVar;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C38475c c38475c = (C38475c) this.f164816x;
            a aVar = (a) this.f164817y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f164815w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (aVar instanceof a.i) {
                return C38475c.m123281b(c38475c, null, null, null, false, true, null, null, false, false, false, false, 2031, null);
            }
            if (aVar instanceof a.g) {
                a.g gVar = (a.g) aVar;
                AbstractC37410a result = gVar.getResult();
                if (result instanceof AbstractC37410a.b) {
                    return C38475c.m123281b(c38475c, null, ((AbstractC37410a.b) gVar.getResult()).m119769a(), null, false, false, null, null, false, false, false, false, 1997, null);
                }
                if (result instanceof AbstractC37410a.a) {
                    return C38475c.m123281b(c38475c, null, null, null, false, false, ((AbstractC37410a.a) gVar.getResult()).getError(), null, false, false, false, false, 1999, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (aVar instanceof a.f) {
                return C38475c.m123281b(c38475c, ((a.f) aVar).getPassword(), null, null, false, false, null, null, false, false, false, false, 2046, null);
            }
            if (aVar instanceof a.j) {
                a.j jVar = (a.j) aVar;
                AbstractC37415f result2 = jVar.getResult();
                if (result2 instanceof AbstractC37415f.b) {
                    return C38475c.m123281b(c38475c, null, null, null, false, false, null, null, true, false, false, false, 1839, null);
                }
                if (result2 instanceof AbstractC37415f.a) {
                    return C38475c.m123281b(c38475c, null, null, null, false, false, null, ((AbstractC37415f.a) jVar.getResult()).getError(), false, false, false, false, 1967, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (aVar instanceof a.b) {
                return C38475c.m123281b(c38475c, null, null, null, false, false, null, null, false, false, false, false, 1951, null);
            }
            if (aVar instanceof a.e) {
                AbstractC38477e result3 = ((a.e) aVar).getResult();
                if (result3 instanceof AbstractC38477e.b) {
                    return C38475c.m123281b(c38475c, null, null, null, false, false, null, null, false, true, false, false, 1775, null);
                }
                if (result3 instanceof AbstractC38477e.a) {
                    return C38475c.m123281b(c38475c, null, null, null, false, false, new AbstractC37412c.b("Failed to send new reset link", true), null, false, false, false, false, 1999, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (aVar instanceof a.h) {
                return C38475c.m123281b(c38475c, null, null, null, false, false, null, null, false, false, true, false, 1535, null);
            }
            if (aVar instanceof a.c) {
                return C38475c.m123281b(c38475c, null, null, null, false, false, null, null, false, false, false, false, 1535, null);
            }
            if (aVar instanceof a.d) {
                return C38475c.m123281b(c38475c, null, null, null, false, false, null, null, false, false, false, true, 1023, null);
            }
            if (aVar instanceof a.C42659a) {
                return C38475c.m123281b(c38475c, null, null, null, false, false, null, null, false, false, false, true, FrameMetricsAggregator.EVERY_DURATION, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public C38473a(C37413d passwordResetSubmissionHandler, C37411b passwordRequirementsFetcher, C38476d sendNewResetLinkHandler, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(passwordResetSubmissionHandler, "passwordResetSubmissionHandler");
        AbstractC22676k.m65750j(passwordRequirementsFetcher, "passwordRequirementsFetcher");
        AbstractC22676k.m65750j(sendNewResetLinkHandler, "sendNewResetLinkHandler");
        AbstractC22676k.m65750j(logger, "logger");
        this.passwordResetSubmissionHandler = passwordResetSubmissionHandler;
        this.passwordRequirementsFetcher = passwordRequirementsFetcher;
        this.sendNewResetLinkHandler = sendNewResetLinkHandler;
        this.logger = logger;
        this.initialDomainResult = new C38475c(null, null, null, false, false, null, null, false, false, false, false, 2047, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(this.initialDomainResult, AbstractC13091v.m36590P(upstream, new b(null, this)), new f(null));
    }

    public /* synthetic */ C38473a(C37413d c37413d, C37411b c37411b, C38476d c38476d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c37413d, c37411b, c38476d, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PasswordResetInteractor") : interfaceC34116n);
    }
}
