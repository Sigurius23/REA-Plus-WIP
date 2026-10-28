package zt2;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import y71.C39274g;

/* JADX INFO: renamed from: zt2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, m65681d2 = {"Lzt2/b;", "Lm91/u;", "Ly71/g;", "leftIcon", "Lcom/whoop/design/util/TextResource;", "title", "rightIcon", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ly71/g;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/navigation/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly71/g;", "b", "()Ly71/g;", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "c", "d", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41133b implements InterfaceC25312u {

    /* JADX INFO: renamed from: e */
    public static final int f177342e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39274g leftIcon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39274g rightIcon;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C9598e destination;

    static {
        int i13 = C9598e.f28134d;
        int i14 = C39274g.f168929c;
        f177342e = i13 | i14 | TextResource.$stable | i14;
    }

    public C41133b(C39274g leftIcon, TextResource title, C39274g rightIcon, C9598e destination) {
        AbstractC22676k.m65750j(leftIcon, "leftIcon");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(rightIcon, "rightIcon");
        AbstractC22676k.m65750j(destination, "destination");
        this.leftIcon = leftIcon;
        this.title = title;
        this.rightIcon = rightIcon;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C39274g getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C39274g getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41133b)) {
            return false;
        }
        C41133b c41133b = (C41133b) other;
        return AbstractC22676k.m65745e(this.leftIcon, c41133b.leftIcon) && AbstractC22676k.m65745e(this.title, c41133b.title) && AbstractC22676k.m65745e(this.rightIcon, c41133b.rightIcon) && AbstractC22676k.m65745e(this.destination, c41133b.destination);
    }

    public int hashCode() {
        return this.destination.hashCode() + ((this.rightIcon.hashCode() + AbstractC31061c.m95625a(this.leftIcon.hashCode() * 31, this.title, 31)) * 31);
    }

    public String toString() {
        return "AddGoalCardItemState(leftIcon=" + this.leftIcon + ", title=" + this.title + ", rightIcon=" + this.rightIcon + ", destination=" + this.destination + ")";
    }
}
