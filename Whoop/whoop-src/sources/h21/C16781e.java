package h21;

import kd1.AbstractC22403o;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: h21.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, m65681d2 = {"Lh21/e;", "Lm91/u;", "", "id", "Lkd1/o;", "imageSource", "label", "", "cardWidth", "cardHeight", "<init>", "(Ljava/lang/String;Lkd1/o;Ljava/lang/String;FF)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lkd1/o;", "c", "()Lkd1/o;", "e", "d", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C16781e implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o imageSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float cardWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float cardHeight;

    public C16781e(String id4, AbstractC22403o imageSource, String str, float f13, float f14) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(imageSource, "imageSource");
        this.id = id4;
        this.imageSource = imageSource;
        this.label = str;
        this.cardWidth = f13;
        this.cardHeight = f14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getCardHeight() {
        return this.cardHeight;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getCardWidth() {
        return this.cardWidth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getImageSource() {
        return this.imageSource;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C16781e)) {
            return false;
        }
        C16781e c16781e = (C16781e) other;
        return AbstractC22676k.m65745e(this.id, c16781e.id) && AbstractC22676k.m65745e(this.imageSource, c16781e.imageSource) && AbstractC22676k.m65745e(this.label, c16781e.label) && Float.compare(this.cardWidth, c16781e.cardWidth) == 0 && Float.compare(this.cardHeight, c16781e.cardHeight) == 0;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iM91833c = AbstractC30007c.m91833c(this.imageSource, this.id.hashCode() * 31, 31);
        String str = this.label;
        return Float.hashCode(this.cardHeight) + AbstractC11266d.m30447a(this.cardWidth, (iM91833c + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public String toString() {
        String str = this.id;
        AbstractC22403o abstractC22403o = this.imageSource;
        String str2 = this.label;
        float f13 = this.cardWidth;
        float f14 = this.cardHeight;
        StringBuilder sb4 = new StringBuilder("ImageCardState(id=");
        sb4.append(str);
        sb4.append(", imageSource=");
        sb4.append(abstractC22403o);
        sb4.append(", label=");
        sb4.append(str2);
        sb4.append(", cardWidth=");
        sb4.append(f13);
        sb4.append(", cardHeight=");
        return AbstractC30007c.m91837g(f14, ")", sb4);
    }

    public /* synthetic */ C16781e(String str, AbstractC22403o abstractC22403o, String str2, float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, abstractC22403o, str2, (i13 & 8) != 0 ? 24.0f : f13, (i13 & 16) != 0 ? 15.0f : f14);
    }
}
