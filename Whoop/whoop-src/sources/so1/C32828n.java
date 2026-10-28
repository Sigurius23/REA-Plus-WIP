package so1;

import com.whoop.navigation.C9598e;
import gz0.EnumC16313m0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: so1.n */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lso1/n;", "", "Lcom/whoop/navigation/e;", "buttonDestination", "Lgz0/m0;", "buttonIcon", "<init>", "(Lcom/whoop/navigation/e;Lgz0/m0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "b", "Lgz0/m0;", "()Lgz0/m0;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C32828n {

    /* JADX INFO: renamed from: c */
    public static final int f136764c = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C9598e buttonDestination;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC16313m0 buttonIcon;

    public C32828n(C9598e buttonDestination, EnumC16313m0 buttonIcon) {
        AbstractC22676k.m65750j(buttonDestination, "buttonDestination");
        AbstractC22676k.m65750j(buttonIcon, "buttonIcon");
        this.buttonDestination = buttonDestination;
        this.buttonIcon = buttonIcon;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getButtonDestination() {
        return this.buttonDestination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC16313m0 getButtonIcon() {
        return this.buttonIcon;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C32828n)) {
            return false;
        }
        C32828n c32828n = (C32828n) other;
        return AbstractC22676k.m65745e(this.buttonDestination, c32828n.buttonDestination) && this.buttonIcon == c32828n.buttonIcon;
    }

    public int hashCode() {
        return this.buttonIcon.hashCode() + (this.buttonDestination.hashCode() * 31);
    }

    public String toString() {
        return "InfoButtonViewState(buttonDestination=" + this.buttonDestination + ", buttonIcon=" + this.buttonIcon + ")";
    }
}
