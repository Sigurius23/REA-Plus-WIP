package xq2;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: xq2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Lxq2/k;", "", "Lkd1/o;", "leftImage", "Lcom/whoop/design/util/TextResource;", "leftText", "rightImage", "rightText", "<init>", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "c", "d", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C38573k {

    /* JADX INFO: renamed from: e */
    public static final int f166009e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o leftImage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource leftText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC22403o rightImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource rightText;

    static {
        int i13 = TextResource.$stable;
        int i14 = AbstractC22403o.f87638a;
        f166009e = i13 | i13 | i14 | i14;
    }

    public C38573k(AbstractC22403o abstractC22403o, TextResource leftText, AbstractC22403o abstractC22403o2, TextResource rightText) {
        AbstractC22676k.m65750j(leftText, "leftText");
        AbstractC22676k.m65750j(rightText, "rightText");
        this.leftImage = abstractC22403o;
        this.leftText = leftText;
        this.rightImage = abstractC22403o2;
        this.rightText = rightText;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getLeftImage() {
        return this.leftImage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getLeftText() {
        return this.leftText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getRightImage() {
        return this.rightImage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final TextResource getRightText() {
        return this.rightText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C38573k)) {
            return false;
        }
        C38573k c38573k = (C38573k) other;
        return AbstractC22676k.m65745e(this.leftImage, c38573k.leftImage) && AbstractC22676k.m65745e(this.leftText, c38573k.leftText) && AbstractC22676k.m65745e(this.rightImage, c38573k.rightImage) && AbstractC22676k.m65745e(this.rightText, c38573k.rightText);
    }

    public int hashCode() {
        AbstractC22403o abstractC22403o = this.leftImage;
        int iM95625a = AbstractC31061c.m95625a((abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31, this.leftText, 31);
        AbstractC22403o abstractC22403o2 = this.rightImage;
        return this.rightText.hashCode() + ((iM95625a + (abstractC22403o2 != null ? abstractC22403o2.hashCode() : 0)) * 31);
    }

    public String toString() {
        AbstractC22403o abstractC22403o = this.leftImage;
        TextResource textResource = this.leftText;
        AbstractC22403o abstractC22403o2 = this.rightImage;
        TextResource textResource2 = this.rightText;
        StringBuilder sbM114683k = AbstractC36095b.m114683k("ComparisonHeaderState(leftImage=", textResource, abstractC22403o, ", leftText=", ", rightImage=");
        sbM114683k.append(abstractC22403o2);
        sbM114683k.append(", rightText=");
        sbM114683k.append(textResource2);
        sbM114683k.append(")");
        return sbM114683k.toString();
    }
}
