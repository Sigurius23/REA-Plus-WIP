package yi1;

import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: yi1.l */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJD\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u001f\u0010\u0012¨\u0006\""}, m65681d2 = {"Lyi1/l;", "", "Lcom/whoop/design/util/TextResource;", "leftTitle", "rightTitle", "Lcom/whoop/navigation/e;", "rightTitleDestination", "", "rightTitleMaxLines", "rightTileIcon", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;II)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;II)Lyi1/l;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "e", "Lcom/whoop/navigation/e;", "f", "()Lcom/whoop/navigation/e;", "d", "I", "getRightTitleMaxLines", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39578l {

    /* JADX INFO: renamed from: f */
    public static final int f170304f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource leftTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource rightTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C9598e rightTitleDestination;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int rightTitleMaxLines;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int rightTileIcon;

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        f170304f = i13 | i14 | i14;
    }

    public C39578l(TextResource leftTitle, TextResource rightTitle, C9598e c9598e, int i13, int i14) {
        AbstractC22676k.m65750j(leftTitle, "leftTitle");
        AbstractC22676k.m65750j(rightTitle, "rightTitle");
        this.leftTitle = leftTitle;
        this.rightTitle = rightTitle;
        this.rightTitleDestination = c9598e;
        this.rightTitleMaxLines = i13;
        this.rightTileIcon = i14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C39578l m126451b(C39578l c39578l, TextResource textResource, TextResource textResource2, C9598e c9598e, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            textResource = c39578l.leftTitle;
        }
        if ((i15 & 2) != 0) {
            textResource2 = c39578l.rightTitle;
        }
        if ((i15 & 4) != 0) {
            c9598e = c39578l.rightTitleDestination;
        }
        if ((i15 & 8) != 0) {
            i13 = c39578l.rightTitleMaxLines;
        }
        if ((i15 & 16) != 0) {
            i14 = c39578l.rightTileIcon;
        }
        int i16 = i14;
        C9598e c9598e2 = c9598e;
        return c39578l.m126452a(textResource, textResource2, c9598e2, i13, i16);
    }

    /* JADX INFO: renamed from: a */
    public final C39578l m126452a(TextResource leftTitle, TextResource rightTitle, C9598e rightTitleDestination, int rightTitleMaxLines, int rightTileIcon) {
        AbstractC22676k.m65750j(leftTitle, "leftTitle");
        AbstractC22676k.m65750j(rightTitle, "rightTitle");
        return new C39578l(leftTitle, rightTitle, rightTitleDestination, rightTitleMaxLines, rightTileIcon);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLeftTitle() {
        return this.leftTitle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRightTileIcon() {
        return this.rightTileIcon;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getRightTitle() {
        return this.rightTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39578l)) {
            return false;
        }
        C39578l c39578l = (C39578l) other;
        return AbstractC22676k.m65745e(this.leftTitle, c39578l.leftTitle) && AbstractC22676k.m65745e(this.rightTitle, c39578l.rightTitle) && AbstractC22676k.m65745e(this.rightTitleDestination, c39578l.rightTitleDestination) && this.rightTitleMaxLines == c39578l.rightTitleMaxLines && this.rightTileIcon == c39578l.rightTileIcon;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C9598e getRightTitleDestination() {
        return this.rightTitleDestination;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.leftTitle.hashCode() * 31, this.rightTitle, 31);
        C9598e c9598e = this.rightTitleDestination;
        return Integer.hashCode(this.rightTileIcon) + AbstractC11266d.m30448b(this.rightTitleMaxLines, (iM95625a + (c9598e == null ? 0 : c9598e.hashCode())) * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.leftTitle;
        TextResource textResource2 = this.rightTitle;
        C9598e c9598e = this.rightTitleDestination;
        int i13 = this.rightTitleMaxLines;
        int i14 = this.rightTileIcon;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("SectionHeaderViewState(leftTitle=", textResource, ", rightTitle=", textResource2, ", rightTitleDestination=");
        sbM106658q.append(c9598e);
        sbM106658q.append(", rightTitleMaxLines=");
        sbM106658q.append(i13);
        sbM106658q.append(", rightTileIcon=");
        return AbstractC18489d0.m53371l(sbM106658q, i14, ")");
    }
}
