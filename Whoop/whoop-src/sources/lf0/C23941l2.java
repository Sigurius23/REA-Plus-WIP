package lf0;

import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lf0.l2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, m65681d2 = {"Llf0/l2;", "Lm91/u;", "Lkd1/o;", "imageUrl", "", "label", "title", "<init>", "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Ljava/lang/String;", "c", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C23941l2 implements InterfaceC25312u {

    /* JADX INFO: renamed from: d */
    public static final int f94590d = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o imageUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String title;

    public C23941l2(AbstractC22403o imageUrl, String label, String title) {
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(title, "title");
        this.imageUrl = imageUrl;
        this.label = label;
        this.title = title;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C23941l2)) {
            return false;
        }
        C23941l2 c23941l2 = (C23941l2) other;
        return AbstractC22676k.m65745e(this.imageUrl, c23941l2.imageUrl) && AbstractC22676k.m65745e(this.label, c23941l2.label) && AbstractC22676k.m65745e(this.title, c23941l2.title);
    }

    public int hashCode() {
        return this.title.hashCode() + AbstractC11266d.m30450d(this.imageUrl.hashCode() * 31, 31, this.label);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.imageUrl;
        String str = this.label;
        String str2 = this.title;
        StringBuilder sb4 = new StringBuilder("TestTileState(imageUrl=");
        sb4.append(abstractC22403o);
        sb4.append(", label=");
        sb4.append(str);
        sb4.append(", title=");
        return AbstractC25012a.m73376i(str2, ")", sb4);
    }
}
