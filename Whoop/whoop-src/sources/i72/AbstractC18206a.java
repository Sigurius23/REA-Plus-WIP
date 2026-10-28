package i72;

import c13.AbstractC3855a;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: i72.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Li72/a;", "", "<init>", "()V", "a", "d", "c", "e", "b", "Li72/a$a;", "Li72/a$b;", "Li72/a$c;", "Li72/a$d;", "Li72/a$e;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18206a {

    /* JADX INFO: renamed from: i72.a$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Li72/a$a;", "Li72/a;", "<init>", "()V", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC18206a {

        /* JADX INFO: renamed from: a */
        public static final a f70714a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: i72.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Li72/a$b;", "Li72/a;", "<init>", "()V", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC18206a {

        /* JADX INFO: renamed from: a */
        public static final b f70715a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: i72.a$c */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Li72/a$c;", "Li72/a;", "", "openedFromSageScreen", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC18206a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean openedFromSageScreen;

        public c(boolean z4) {
            super(null);
            this.openedFromSageScreen = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getOpenedFromSageScreen() {
            return this.openedFromSageScreen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && this.openedFromSageScreen == ((c) other).openedFromSageScreen;
        }

        public int hashCode() {
            return Boolean.hashCode(this.openedFromSageScreen);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ExitCompletedFlow(openedFromSageScreen=", ")", this.openedFromSageScreen);
        }
    }

    /* JADX INFO: renamed from: i72.a$d */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Li72/a$d;", "Li72/a;", "", "openedFromSageScreen", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC18206a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final boolean openedFromSageScreen;

        public d(boolean z4) {
            super(null);
            this.openedFromSageScreen = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getOpenedFromSageScreen() {
            return this.openedFromSageScreen;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && this.openedFromSageScreen == ((d) other).openedFromSageScreen;
        }

        public int hashCode() {
            return Boolean.hashCode(this.openedFromSageScreen);
        }

        public String toString() {
            return AbstractC3855a.m11827k("ExitIncompleteFlow(openedFromSageScreen=", ")", this.openedFromSageScreen);
        }
    }

    /* JADX INFO: renamed from: i72.a$e */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Li72/a$e;", "Li72/a;", "Lcom/whoop/navigation/e;", "navigationAction", "", "popBackStack", "<init>", "(Lcom/whoop/navigation/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "b", "Z", "()Z", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class e extends AbstractC18206a {

        /* JADX INFO: renamed from: c */
        public static final int f70718c = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigationAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean popBackStack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C9598e navigationAction, boolean z4) {
            super(null);
            AbstractC22676k.m65750j(navigationAction, "navigationAction");
            this.navigationAction = navigationAction;
            this.popBackStack = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C9598e getNavigationAction() {
            return this.navigationAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getPopBackStack() {
            return this.popBackStack;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return AbstractC22676k.m65745e(this.navigationAction, eVar.navigationAction) && this.popBackStack == eVar.popBackStack;
        }

        public int hashCode() {
            return Boolean.hashCode(this.popBackStack) + (this.navigationAction.hashCode() * 31);
        }

        public String toString() {
            return "SageOnboardingNavigationAction(navigationAction=" + this.navigationAction + ", popBackStack=" + this.popBackStack + ")";
        }
    }

    public /* synthetic */ AbstractC18206a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18206a() {
    }
}
