package kw2;

import com.whoop.navigation.C9598e;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kw2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lkw2/b;", "", "b", "a", "Lkw2/b$a;", "Lkw2/b$b;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC22873b {

    /* JADX INFO: renamed from: kw2.b$a */
    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u001b"}, m65681d2 = {"Lkw2/b$a;", "Lkw2/b;", "Lcom/whoop/navigation/e;", "navigationAction", "", "isMilestone", "", "milestoneId", "<init>", "(Lcom/whoop/navigation/e;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "b", "()Lcom/whoop/navigation/e;", "Z", "c", "()Z", "Ljava/lang/String;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements InterfaceC22873b {

        /* JADX INFO: renamed from: d */
        public static final int f90142d = C9598e.f28134d;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final C9598e navigationAction;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isMilestone;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String milestoneId;

        public a(C9598e navigationAction, boolean z4, String milestoneId) {
            AbstractC22676k.m65750j(navigationAction, "navigationAction");
            AbstractC22676k.m65750j(milestoneId, "milestoneId");
            this.navigationAction = navigationAction;
            this.isMilestone = z4;
            this.milestoneId = milestoneId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMilestoneId() {
            return this.milestoneId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C9598e getNavigationAction() {
            return this.navigationAction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsMilestone() {
            return this.isMilestone;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.navigationAction, aVar.navigationAction) && this.isMilestone == aVar.isMilestone && AbstractC22676k.m65745e(this.milestoneId, aVar.milestoneId);
        }

        public int hashCode() {
            return this.milestoneId.hashCode() + AbstractC2875y.m8289b(this.navigationAction.hashCode() * 31, 31, this.isMilestone);
        }

        public String toString() {
            C9598e c9598e = this.navigationAction;
            boolean z4 = this.isMilestone;
            String str = this.milestoneId;
            StringBuilder sb4 = new StringBuilder("BackendDrivenNavigation(navigationAction=");
            sb4.append(c9598e);
            sb4.append(", isMilestone=");
            sb4.append(z4);
            sb4.append(", milestoneId=");
            return AbstractC25012a.m73376i(str, ")", sb4);
        }
    }

    /* JADX INFO: renamed from: kw2.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkw2/b$b;", "Lkw2/b;", "<init>", "()V", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC22873b {

        /* JADX INFO: renamed from: a */
        public static final b f90146a = new b();

        private b() {
        }
    }
}
