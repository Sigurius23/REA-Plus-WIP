package b01;

import com.whoop.navigation.C9598e;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b01.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lb01/d;", "", "", "text", "Lcom/whoop/navigation/e;", "navigationAction", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C2183d {

    /* JADX INFO: renamed from: c */
    public static final int f8669c = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C9598e navigationAction;

    public C2183d(String text, C9598e navigationAction) {
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(navigationAction, "navigationAction");
        this.text = text;
        this.navigationAction = navigationAction;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getNavigationAction() {
        return this.navigationAction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2183d)) {
            return false;
        }
        C2183d c2183d = (C2183d) other;
        return AbstractC22676k.m65745e(this.text, c2183d.text) && AbstractC22676k.m65745e(this.navigationAction, c2183d.navigationAction);
    }

    public int hashCode() {
        return this.navigationAction.hashCode() + (this.text.hashCode() * 31);
    }

    public String toString() {
        return AbstractC26725a.m79502f("BiomarkerListCtaViewState(text=", this.text, ", navigationAction=", this.navigationAction, ")");
    }
}
