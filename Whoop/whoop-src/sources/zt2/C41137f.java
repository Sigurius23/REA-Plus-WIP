package zt2;

import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: zt2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lzt2/f;", "Lm91/u;", "Lkd1/o;", "backgroundImg", "", "displayDivider", "<init>", "(Lkd1/o;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Z", "()Z", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C41137f implements InterfaceC25312u {

    /* JADX INFO: renamed from: c */
    public static final int f177352c = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o backgroundImg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean displayDivider;

    public C41137f(AbstractC22403o backgroundImg, boolean z4) {
        AbstractC22676k.m65750j(backgroundImg, "backgroundImg");
        this.backgroundImg = backgroundImg;
        this.displayDivider = z4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getBackgroundImg() {
        return this.backgroundImg;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDisplayDivider() {
        return this.displayDivider;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C41137f)) {
            return false;
        }
        C41137f c41137f = (C41137f) other;
        return AbstractC22676k.m65745e(this.backgroundImg, c41137f.backgroundImg) && this.displayDivider == c41137f.displayDivider;
    }

    public int hashCode() {
        return Boolean.hashCode(this.displayDivider) + (this.backgroundImg.hashCode() * 31);
    }

    public String toString() {
        return "DividerWithImageItemState(backgroundImg=" + this.backgroundImg + ", displayDivider=" + this.displayDivider + ")";
    }

    public /* synthetic */ C41137f(AbstractC22403o abstractC22403o, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC22403o, (i13 & 2) != 0 ? true : z4);
    }
}
