package ik1;

import com.whoop.navigation.C9598e;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ik1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lik1/i;", "", "", "navigationTitle", "navigationSubtitle", "Lcom/whoop/navigation/e;", "rightButtonNavigationAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C18612i {

    /* JADX INFO: renamed from: d */
    public static final int f72772d = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String navigationTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String navigationSubtitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e rightButtonNavigationAction;

    public C18612i(String navigationTitle, String str, C9598e rightButtonNavigationAction) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(rightButtonNavigationAction, "rightButtonNavigationAction");
        this.navigationTitle = navigationTitle;
        this.navigationSubtitle = str;
        this.rightButtonNavigationAction = rightButtonNavigationAction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNavigationSubtitle() {
        return this.navigationSubtitle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C9598e getRightButtonNavigationAction() {
        return this.rightButtonNavigationAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C18612i)) {
            return false;
        }
        C18612i c18612i = (C18612i) other;
        return AbstractC22676k.m65745e(this.navigationTitle, c18612i.navigationTitle) && AbstractC22676k.m65745e(this.navigationSubtitle, c18612i.navigationSubtitle) && AbstractC22676k.m65745e(this.rightButtonNavigationAction, c18612i.rightButtonNavigationAction);
    }

    public int hashCode() {
        int iHashCode = this.navigationTitle.hashCode() * 31;
        String str = this.navigationSubtitle;
        return this.rightButtonNavigationAction.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.navigationSubtitle;
        return AbstractC33745d.m106656o(AbstractC11895b.m32001t("NavigationViewState(navigationTitle=", str, ", navigationSubtitle=", str2, ", rightButtonNavigationAction="), this.rightButtonNavigationAction, ")");
    }
}
