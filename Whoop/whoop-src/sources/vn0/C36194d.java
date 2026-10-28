package vn0;

import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import dj0.C12066b;
import dj0.C12067c;
import dj0.C12068d;
import dj0.InterfaceC12069e;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.InterfaceC27844g;
import or2.AbstractC28153d;
import or2.AbstractC28190p0;
import or2.C28156e;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wn0.AbstractC37410a;
import wn0.C37411b;
import y92.C39352a;

/* JADX INFO: renamed from: vn0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B9\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001f\u001a\u00020\u00032\u0012\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#JG\u0010(\u001a,\u0012(\u0012&\u0012\f\u0012\n '*\u0004\u0018\u00010\u001d0\u001d '*\u0012\u0012\f\u0012\n '*\u0004\u0018\u00010\u001d0\u001d\u0018\u00010\u001c0\u001c0&2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001d0$H\u0002¢\u0006\u0004\b(\u0010)J#\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006="}, m65681d2 = {"Lvn0/d;", "Lod1/g;", "Lvn0/b;", "Lvn0/c;", "Ldj0/b;", "cognitoAuthApi", "Lor2/e;", "authAnalyticHelper", "Ly92/a;", "authManager", "Lwn0/b;", "passwordRequirementsFetcher", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Ldj0/b;Lor2/e;Ly92/a;Lwn0/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "", "oldPassword", "newPassword", "confirmPassword", "currentDomainResult", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvn0/c;Lq83/d;)Ljava/lang/Object;", "n", "(Ljava/lang/String;Ljava/lang/String;Lvn0/c;Lq83/d;)Ljava/lang/Object;", "Lu02/a$b;", "Lpg3/v0;", "Ll83/a0;", "response", "l", "(Lu02/a$b;Lvn0/c;)Lvn0/c;", "Lvn0/f;", "o", "(Ljava/lang/String;Ljava/lang/String;)Lvn0/f;", "Ldj0/e;", "result", "Lu02/a;", "kotlin.jvm.PlatformType", "k", "(Ldj0/e;)Lu02/a;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Ldj0/b;", "b", "Lor2/e;", "c", "Ly92/a;", "d", "Lwn0/b;", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "f", "Ltr2/n;", "g", "Lvn0/c;", "initialDomainResult", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36194d implements InterfaceC27844g<AbstractC36192b, C36193c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C12066b cognitoAuthApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28156e authAnalyticHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C37411b passwordRequirementsFetcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C36193c initialDomainResult;

    /* JADX INFO: renamed from: vn0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m65681d2 = {"Lvn0/d$a;", "", "<init>", "()V", "f", "g", "e", "d", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "c", "Lvn0/d$a$a;", "Lvn0/d$a$b;", "Lvn0/d$a$c;", "Lvn0/d$a$d;", "Lvn0/d$a$e;", "Lvn0/d$a$f;", "Lvn0/d$a$g;", "Lvn0/d$a$h;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: vn0.d$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lvn0/d$a$a;", "Lvn0/d$a;", "", "isVisible", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42555a extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final boolean isVisible;

            public C42555a(boolean z4) {
                super(null);
                this.isVisible = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getIsVisible() {
                return this.isVisible;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof C42555a) && this.isVisible == ((C42555a) other).isVisible;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isVisible);
            }

            public String toString() {
                return AbstractC3855a.m11827k("ChangePasswordVisibility(isVisible=", ")", this.isVisible);
            }
        }

        /* JADX INFO: renamed from: vn0.d$a$b */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lvn0/d$a$b;", "Lvn0/d$a;", "", "password", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String password;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String password) {
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
                return (other instanceof b) && AbstractC22676k.m65745e(this.password, ((b) other).password);
            }

            public int hashCode() {
                return this.password.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("ConfirmPasswordUpdated(password=", this.password, ")");
            }
        }

        /* JADX INFO: renamed from: vn0.d$a$c */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lvn0/d$a$c;", "Lvn0/d$a;", "<init>", "()V", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: a */
            public static final c f154959a = new c();

            private c() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: vn0.d$a$d */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lvn0/d$a$d;", "Lvn0/d$a;", "", "password", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String password;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String password) {
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
                return (other instanceof d) && AbstractC22676k.m65745e(this.password, ((d) other).password);
            }

            public int hashCode() {
                return this.password.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("NewPasswordUpdated(password=", this.password, ")");
            }
        }

        /* JADX INFO: renamed from: vn0.d$a$e */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lvn0/d$a$e;", "Lvn0/d$a;", "Lwn0/a;", "result", "<init>", "(Lwn0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwn0/a;", "()Lwn0/a;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final AbstractC37410a result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(AbstractC37410a result) {
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
                return (other instanceof e) && AbstractC22676k.m65745e(this.result, ((e) other).result);
            }

            public int hashCode() {
                return this.result.hashCode();
            }

            public String toString() {
                return "RequirementsFetched(result=" + this.result + ")";
            }
        }

        /* JADX INFO: renamed from: vn0.d$a$f */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lvn0/d$a$f;", "Lvn0/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class f extends a {

            /* JADX INFO: renamed from: a */
            public static final f f154962a = new f();

            private f() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public int hashCode() {
                return -492542426;
            }

            public String toString() {
                return "ShowLoadingRequirements";
            }
        }

        /* JADX INFO: renamed from: vn0.d$a$g */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lvn0/d$a$g;", "Lvn0/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g extends a {

            /* JADX INFO: renamed from: a */
            public static final g f154963a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return -817038021;
            }

            public String toString() {
                return "ShowSavingPassword";
            }
        }

        /* JADX INFO: renamed from: vn0.d$a$h */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, m65681d2 = {"Lvn0/d$a$h;", "Lvn0/d$a;", "", "oldPassword", "newPassword", "confirmPassword", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class h extends a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String oldPassword;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String newPassword;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String confirmPassword;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String oldPassword, String newPassword, String confirmPassword) {
                super(null);
                AbstractC22676k.m65750j(oldPassword, "oldPassword");
                AbstractC22676k.m65750j(newPassword, "newPassword");
                AbstractC22676k.m65750j(confirmPassword, "confirmPassword");
                this.oldPassword = oldPassword;
                this.newPassword = newPassword;
                this.confirmPassword = confirmPassword;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getConfirmPassword() {
                return this.confirmPassword;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getNewPassword() {
                return this.newPassword;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getOldPassword() {
                return this.oldPassword;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof h)) {
                    return false;
                }
                h hVar = (h) other;
                return AbstractC22676k.m65745e(this.oldPassword, hVar.oldPassword) && AbstractC22676k.m65745e(this.newPassword, hVar.newPassword) && AbstractC22676k.m65745e(this.confirmPassword, hVar.confirmPassword);
            }

            public int hashCode() {
                return this.confirmPassword.hashCode() + AbstractC11266d.m30450d(this.oldPassword.hashCode() * 31, 31, this.newPassword);
            }

            public String toString() {
                return AbstractC25012a.m73376i(this.confirmPassword, ")", AbstractC11895b.m32001t("SubmitPassword(oldPassword=", this.oldPassword, ", newPassword=", this.newPassword, ", confirmPassword="));
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: vn0.d$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.ChangePasswordInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ChangePasswordInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f154967w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f154968x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f154969y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36194d f154970z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C36194d c36194d) {
            super(3, interfaceC30057d);
            this.f154970z = c36194d;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC36192b abstractC36192b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f154970z);
            bVar.f154968x = interfaceC13062m;
            bVar.f154969y = abstractC36192b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            InterfaceC13058l c0456u2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154967w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f154968x;
                AbstractC36192b abstractC36192b = (AbstractC36192b) this.f154969y;
                if (abstractC36192b instanceof AbstractC36192b.c) {
                    c0456u = new C13084s1(this.f154970z.new c(null));
                } else {
                    if (abstractC36192b instanceof AbstractC36192b.f) {
                        c0456u2 = new C0456u(new a.d(((AbstractC36192b.f) abstractC36192b).getPassword()), 1);
                    } else if (abstractC36192b instanceof AbstractC36192b.e) {
                        c0456u2 = new C0456u(new a.b(((AbstractC36192b.e) abstractC36192b).getPassword()), 1);
                    } else if (abstractC36192b instanceof AbstractC36192b.d) {
                        c0456u2 = new C13084s1(new d(abstractC36192b, null));
                    } else if (abstractC36192b instanceof AbstractC36192b.a) {
                        c0456u2 = new C0456u(new a.C42555a(((AbstractC36192b.a) abstractC36192b).getIsVisible()), 1);
                    } else {
                        if (!(abstractC36192b instanceof AbstractC36192b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u = new C0456u(a.c.f154959a, 1);
                    }
                    c0456u = c0456u2;
                }
                this.f154968x = null;
                this.f154969y = null;
                this.f154967w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC36192b) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: vn0.d$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.ChangePasswordInteractor$interact$1$1", m100430f = "ChangePasswordInteractor.kt", m100431l = {62, 63, 64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvn0/d$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f154971w;

        /* JADX INFO: renamed from: x */
        int f154972x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f154973y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C36194d.this.new c(interfaceC30057d);
            cVar.f154973y = obj;
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
                java.lang.Object r0 = r6.f154973y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f154972x
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L2b
                if (r2 == r5) goto L27
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                java.lang.Object r0 = r6.f154971w
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
                vn0.d$a$f r7 = vn0.C36194d.a.f.f154962a
                r6.f154973y = r0
                r6.f154972x = r5
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L3b
                goto L60
            L3b:
                vn0.d r7 = vn0.C36194d.this
                wn0.b r7 = vn0.C36194d.m115173h(r7)
                r6.f154973y = r0
                r6.f154972x = r4
                java.lang.Object r7 = r7.m119771b(r6)
                if (r7 != r1) goto L4c
                goto L60
            L4c:
                wn0.a r7 = (wn0.AbstractC37410a) r7
                vn0.d$a$e r2 = new vn0.d$a$e
                r2.<init>(r7)
                r7 = 0
                r6.f154973y = r7
                r6.f154971w = r7
                r6.f154972x = r3
                java.lang.Object r7 = r0.emit(r2, r6)
                if (r7 != r1) goto L61
            L60:
                return r1
            L61:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: vn0.C36194d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vn0.d$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.ChangePasswordInteractor$interact$1$2", m100430f = "ChangePasswordInteractor.kt", m100431l = {78, 79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvn0/d$a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f154975w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f154976x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC36192b f154977y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC36192b abstractC36192b, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154977y = abstractC36192b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(this.f154977y, interfaceC30057d);
            dVar.f154976x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f154976x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r6.f154975w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r7)
                goto L59
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                vn0.d$a$g r7 = vn0.C36194d.a.g.f154963a
                r6.f154976x = r0
                r6.f154975w = r4
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L30
                goto L58
            L30:
                vn0.d$a$h r7 = new vn0.d$a$h
                vn0.b r2 = r6.f154977y
                vn0.b$d r2 = (vn0.AbstractC36192b.d) r2
                java.lang.String r2 = r2.getOldPassword()
                vn0.b r4 = r6.f154977y
                vn0.b$d r4 = (vn0.AbstractC36192b.d) r4
                java.lang.String r4 = r4.getNewPassword()
                vn0.b r5 = r6.f154977y
                vn0.b$d r5 = (vn0.AbstractC36192b.d) r5
                java.lang.String r5 = r5.getConfirmPassword()
                r7.<init>(r2, r4, r5)
                r2 = 0
                r6.f154976x = r2
                r6.f154975w = r3
                java.lang.Object r7 = r0.emit(r7, r6)
                if (r7 != r1) goto L59
            L58:
                return r1
            L59:
                l83.a0 r7 = l83.C23454a0.f92919a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: vn0.C36194d.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: vn0.d$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.ChangePasswordInteractor$interact$2", m100430f = "ChangePasswordInteractor.kt", m100431l = {139}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lvn0/c;", "currentDomainResult", "Lvn0/d$a;", "internalAction", "<anonymous>", "(Lvn0/c;Lvn0/d$a;)Lvn0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f154978w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f154979x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f154980y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C36193c c36193c, a aVar, InterfaceC30057d<? super C36193c> interfaceC30057d) {
            e eVar = C36194d.this.new e(interfaceC30057d);
            eVar.f154979x = c36193c;
            eVar.f154980y = aVar;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Object objM115178m;
            C36193c c36193c = (C36193c) this.f154979x;
            a aVar = (a) this.f154980y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154978w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (aVar instanceof a.f) {
                    return C36193c.m115151b(c36193c, true, false, false, false, null, null, null, null, null, null, null, null, null, 8190, null);
                }
                if (aVar instanceof a.g) {
                    return c36193c.m115166p();
                }
                if (aVar instanceof a.e) {
                    a.e eVar = (a.e) aVar;
                    AbstractC37410a result = eVar.getResult();
                    if (result instanceof AbstractC37410a.b) {
                        return C36193c.m115151b(c36193c, false, false, false, false, null, null, null, null, null, null, null, ((AbstractC37410a.b) eVar.getResult()).m119769a(), null, 2046, null);
                    }
                    if (result instanceof AbstractC37410a.a) {
                        return C36193c.m115151b(c36193c, false, false, false, false, null, null, null, null, null, null, null, null, ((AbstractC37410a.a) eVar.getResult()).getError(), 4094, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (aVar instanceof a.d) {
                    return C36193c.m115151b(c36193c, false, false, false, false, null, null, null, ((a.d) aVar).getPassword(), null, null, null, null, null, 8063, null);
                }
                if (aVar instanceof a.b) {
                    return C36193c.m115151b(c36193c, false, false, false, false, null, null, null, null, ((a.b) aVar).getPassword(), null, null, null, null, 7935, null);
                }
                if (!(aVar instanceof a.h)) {
                    if (aVar instanceof a.C42555a) {
                        return C36193c.m115151b(c36193c, false, false, false, ((a.C42555a) aVar).getIsVisible(), null, null, null, null, null, null, null, null, null, 8183, null);
                    }
                    if (aVar instanceof a.c) {
                        return C36193c.m115151b(c36193c, false, false, false, false, null, null, null, null, null, null, null, null, null, 3071, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                C36194d c36194d = C36194d.this;
                a.h hVar = (a.h) aVar;
                String oldPassword = hVar.getOldPassword();
                String newPassword = hVar.getNewPassword();
                String confirmPassword = hVar.getConfirmPassword();
                this.f154979x = null;
                this.f154980y = null;
                this.f154978w = 1;
                objM115178m = c36194d.m115178m(oldPassword, newPassword, confirmPassword, c36193c, this);
                if (objM115178m == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM115178m = obj;
            }
            return (C36193c) objM115178m;
        }
    }

    /* JADX INFO: renamed from: vn0.d$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.ChangePasswordInteractor$interact$3", m100430f = "ChangePasswordInteractor.kt", m100431l = {159}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lvn0/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f154982w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f154983x;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C36194d.this.new f(interfaceC30057d);
            fVar.f154983x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f154983x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f154982w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C36193c c36193c = C36194d.this.initialDomainResult;
                this.f154983x = null;
                this.f154982w = 1;
                if (interfaceC13062m.emit(c36193c, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: vn0.d$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.changepassword.domain.ChangePasswordInteractor$submitChangePassword$2", m100430f = "ChangePasswordInteractor.kt", m100431l = {183, 191}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lvn0/c;", "<anonymous>", "(Lbc3/c0;)Lvn0/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f154985E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f154986F;

        /* JADX INFO: renamed from: w */
        Object f154987w;

        /* JADX INFO: renamed from: x */
        int f154988x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C36193c f154990z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C36193c c36193c, String str, String str2, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f154990z = c36193c;
            this.f154985E = str;
            this.f154986F = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36194d.this.new g(this.f154990z, this.f154985E, this.f154986F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C36193c> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        
            if (r9 == r0) goto L22;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r8.f154988x
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r8.f154987w
                java.lang.String r0 = (java.lang.String) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L78
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L33
            L21:
                p505ts.AbstractC34132o.m107864I(r9)
                vn0.d r9 = vn0.C36194d.this
                y92.a r9 = vn0.C36194d.m115170e(r9)
                r8.f154988x = r4
                java.lang.Object r9 = r9.m125478a(r8)
                if (r9 != r0) goto L33
                goto L77
            L33:
                com.whoop.domain.model.AuthMaterial r9 = (com.whoop.domain.model.AuthMaterial) r9
                r1 = 0
                if (r9 == 0) goto L3d
                java.lang.String r9 = r9.getAccessToken()
                goto L3e
            L3d:
                r9 = r1
            L3e:
                if (r9 != 0) goto L63
                vn0.d r9 = vn0.C36194d.this
                or2.e r9 = vn0.C36194d.m115169d(r9)
                or2.d$a r0 = new or2.d$a
                r0.<init>(r3)
                r9.m85206c(r0)
                u02.a$b$b r9 = new u02.a$b$b
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = ""
                r9.<init>(r0, r1, r3)
                vn0.d r0 = vn0.C36194d.this
                vn0.c r1 = r8.f154990z
                vn0.c r9 = vn0.C36194d.m115174i(r0, r9, r1)
                return r9
            L63:
                vn0.d r5 = vn0.C36194d.this
                dj0.b r5 = vn0.C36194d.m115171f(r5)
                java.lang.String r6 = r8.f154985E
                java.lang.String r7 = r8.f154986F
                r8.f154987w = r1
                r8.f154988x = r2
                java.lang.Object r9 = r5.m33308q(r9, r6, r7, r8)
                if (r9 != r0) goto L78
            L77:
                return r0
            L78:
                dj0.e r9 = (dj0.InterfaceC12069e) r9
                vn0.d r0 = vn0.C36194d.this
                u02.a r9 = vn0.C36194d.m115168c(r0, r9)
                boolean r0 = r9 instanceof u02.InterfaceC34385a.c
                if (r0 == 0) goto L99
                vn0.d r9 = vn0.C36194d.this
                or2.e r9 = vn0.C36194d.m115169d(r9)
                or2.d$a r0 = new or2.d$a
                r0.<init>(r4)
                r9.m85206c(r0)
                vn0.c r9 = r8.f154990z
                vn0.c r9 = r9.m115167q()
                return r9
            L99:
                boolean r0 = r9 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto Lb6
                vn0.d r0 = vn0.C36194d.this
                or2.e r0 = vn0.C36194d.m115169d(r0)
                or2.d$a r1 = new or2.d$a
                r1.<init>(r3)
                r0.m85206c(r1)
                vn0.d r0 = vn0.C36194d.this
                u02.a$b r9 = (u02.InterfaceC34385a.b) r9
                vn0.c r1 = r8.f154990z
                vn0.c r9 = vn0.C36194d.m115174i(r0, r9, r1)
                return r9
            Lb6:
                kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: vn0.C36194d.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C36194d(C12066b cognitoAuthApi, C28156e authAnalyticHelper, C39352a authManager, C37411b passwordRequirementsFetcher, FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(cognitoAuthApi, "cognitoAuthApi");
        AbstractC22676k.m65750j(authAnalyticHelper, "authAnalyticHelper");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(passwordRequirementsFetcher, "passwordRequirementsFetcher");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.cognitoAuthApi = cognitoAuthApi;
        this.authAnalyticHelper = authAnalyticHelper;
        this.authManager = authManager;
        this.passwordRequirementsFetcher = passwordRequirementsFetcher;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
        this.initialDomainResult = new C36193c(false, false, false, false, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final InterfaceC34385a<C29218v0<C23454a0>> m115176k(InterfaceC12069e<C23454a0> result) {
        if (result instanceof C12067c) {
            C12067c c12067c = (C12067c) result;
            return new InterfaceC34385a.b.a(c12067c.getException(), c12067c.getMessage(), c12067c.getStatusCode(), false);
        }
        if (result instanceof C12068d) {
            C12068d c12068d = (C12068d) result;
            return new InterfaceC34385a.b.C42432b(c12068d.getException(), c12068d.getMessage(), false);
        }
        if (result instanceof InterfaceC12069e.a) {
            return new InterfaceC34385a.c(C29218v0.m88725c(C23454a0.f92919a));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final C36193c m115177l(InterfaceC34385a.b<C29218v0<C23454a0>> response, C36193c currentDomainResult) {
        EnumC36191a enumC36191a;
        if (response instanceof InterfaceC34385a.b.C42432b) {
            enumC36191a = EnumC36191a.GENERIC_ERROR;
        } else {
            if (!(response instanceof InterfaceC34385a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC34385a.b.a aVar = (InterfaceC34385a.b.a) response;
            int errorCode = aVar.getErrorCode();
            if (errorCode != 403) {
                if (errorCode != 409) {
                    enumC36191a = errorCode != 422 ? EnumC36191a.GENERIC_ERROR : EnumC36191a.NEW_PASSWORD_TOO_SHORT;
                } else {
                    enumC36191a = EnumC36191a.OLD_PASSWORD_CANNOT_BE_NEW_PASSWORD;
                }
            } else if (this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.PASSWORD_RESET_FLOW)) {
                String errorMessage = aVar.getErrorMessage();
                if (AbstractC22676k.m65745e(errorMessage, "Invalid proposed password")) {
                    enumC36191a = EnumC36191a.OLD_PASSWORD_CANNOT_BE_NEW_PASSWORD;
                } else {
                    enumC36191a = AbstractC22676k.m65745e(errorMessage, "Incorrect password") ? EnumC36191a.CURRENT_PASSWORD_INCORRECT : EnumC36191a.GENERIC_ERROR;
                }
            } else {
                enumC36191a = EnumC36191a.CURRENT_PASSWORD_INCORRECT;
            }
        }
        return currentDomainResult.m115164n(enumC36191a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final Object m115178m(String str, String str2, String str3, C36193c c36193c, InterfaceC30057d<? super C36193c> interfaceC30057d) {
        EnumC36196f enumC36196fM115180o = m115180o(str2, str3);
        if (enumC36196fM115180o != EnumC36196f.VALID) {
            this.authAnalyticHelper.m85206c(new AbstractC28153d.b(false));
            return c36193c.m115165o(enumC36196fM115180o);
        }
        this.authAnalyticHelper.m85206c(new AbstractC28153d.b(true));
        return m115179n(str, str2, c36193c, interfaceC30057d);
    }

    /* JADX INFO: renamed from: n */
    private final Object m115179n(String str, String str2, C36193c c36193c, InterfaceC30057d<? super C36193c> interfaceC30057d) {
        return AbstractC28190p0.m85321a(1000L, new g(c36193c, str, str2, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: o */
    private final EnumC36196f m115180o(String newPassword, String confirmPassword) {
        if (newPassword.length() < 12) {
            return EnumC36196f.NEW_PASSWORD_TOO_SHORT;
        }
        return !newPassword.equals(confirmPassword) ? EnumC36196f.PASSWORDS_DO_NOT_MATCH : EnumC36196f.VALID;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13015a0(new f(null), new C13060l1(this.initialDomainResult, AbstractC13091v.m36590P(upstream, new b(null, this)), new e(null)));
    }

    public /* synthetic */ C36194d(C12066b c12066b, C28156e c28156e, C39352a c39352a, C37411b c37411b, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12066b, c28156e, c39352a, c37411b, featureFlagChecker, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ChangePasswordInteractor") : interfaceC34116n);
    }
}
