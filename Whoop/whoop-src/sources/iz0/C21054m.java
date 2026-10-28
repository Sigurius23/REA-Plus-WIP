package iz0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p294l3.C23285v0;
import p319m4.AbstractC25012a;
import p392p3.C28776n;
import p392p3.C28780r;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: iz0.m */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J¦\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0011HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b,\u0010+R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b/\u0010!R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b.\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\b7\u00109R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u0010+R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b4\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b1\u0010<\u001a\u0004\b?\u0010>R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\b3\u0010AR\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b=\u0010@\u001a\u0004\b5\u0010AR\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b:\u0010>¨\u0006B"}, m65681d2 = {"Liz0/m;", "", "Ll3/v0;", "textStyle", "Li2/x;", "textColor", "linkColor", "blockQuoteLineColor", "Lp3/r;", "strongEmphasisFontWeight", "strongEmphasisColor", "Lp3/n;", "emphasisFontStyle", "emphasisColor", "Liz0/a;", "headingStyles", "tableBorderColor", "Ly3/f;", "tableCellPadding", "tableCellWidth", "", "enableHorizontalScrollOnTable", "enableMailtoAction", "paragraphSpacing", "<init>", "(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZF)Liz0/m;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ll3/v0;", "q", "()Ll3/v0;", "b", "J", "p", "()J", "c", "i", "d", "e", "Lp3/r;", "l", "()Lp3/r;", "f", "k", "g", "I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Liz0/a;", "()Liz0/a;", "j", "m", "F", "n", "()F", "o", "Z", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21054m {

    /* JADX INFO: renamed from: p */
    public static final int f79836p = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23285v0 textStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long textColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long linkColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final long blockQuoteLineColor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C28780r strongEmphasisFontWeight;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long strongEmphasisColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int emphasisFontStyle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final long emphasisColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C21042a headingStyles;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final long tableBorderColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float tableCellPadding;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final float tableCellWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final boolean enableHorizontalScrollOnTable;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean enableMailtoAction;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final float paragraphSpacing;

    public /* synthetic */ C21054m(C23285v0 c23285v0, long j7, long j13, long j14, C28780r c28780r, long j15, int i13, long j16, C21042a c21042a, long j17, float f13, float f14, boolean z4, boolean z13, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(c23285v0, j7, j13, j14, c28780r, j15, i13, j16, c21042a, j17, f13, f14, z4, z13, f15);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C21054m m58881b(C21054m c21054m, C23285v0 c23285v0, long j7, long j13, long j14, C28780r c28780r, long j15, int i13, long j16, C21042a c21042a, long j17, float f13, float f14, boolean z4, boolean z13, float f15, int i14, Object obj) {
        C23285v0 c23285v1 = (i14 & 1) != 0 ? c21054m.textStyle : c23285v0;
        long j18 = (i14 & 2) != 0 ? c21054m.textColor : j7;
        long j19 = (i14 & 4) != 0 ? c21054m.linkColor : j13;
        long j24 = (i14 & 8) != 0 ? c21054m.blockQuoteLineColor : j14;
        C28780r c28780r2 = (i14 & 16) != 0 ? c21054m.strongEmphasisFontWeight : c28780r;
        long j25 = (i14 & 32) != 0 ? c21054m.strongEmphasisColor : j15;
        int i15 = (i14 & 64) != 0 ? c21054m.emphasisFontStyle : i13;
        long j26 = (i14 & 128) != 0 ? c21054m.emphasisColor : j16;
        C21042a c21042a2 = (i14 & 256) != 0 ? c21054m.headingStyles : c21042a;
        C23285v0 c23285v2 = c23285v1;
        long j27 = j18;
        long j28 = (i14 & 512) != 0 ? c21054m.tableBorderColor : j17;
        return c21054m.m58882a(c23285v2, j27, j19, j24, c28780r2, j25, i15, j26, c21042a2, j28, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c21054m.tableCellPadding : f13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c21054m.tableCellWidth : f14, (i14 & 4096) != 0 ? c21054m.enableHorizontalScrollOnTable : z4, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c21054m.enableMailtoAction : z13, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c21054m.paragraphSpacing : f15);
    }

    /* JADX INFO: renamed from: a */
    public final C21054m m58882a(C23285v0 textStyle, long textColor, long linkColor, long blockQuoteLineColor, C28780r strongEmphasisFontWeight, long strongEmphasisColor, int emphasisFontStyle, long emphasisColor, C21042a headingStyles, long tableBorderColor, float tableCellPadding, float tableCellWidth, boolean enableHorizontalScrollOnTable, boolean enableMailtoAction, float paragraphSpacing) {
        AbstractC22676k.m65750j(textStyle, "textStyle");
        AbstractC22676k.m65750j(strongEmphasisFontWeight, "strongEmphasisFontWeight");
        AbstractC22676k.m65750j(headingStyles, "headingStyles");
        return new C21054m(textStyle, textColor, linkColor, blockQuoteLineColor, strongEmphasisFontWeight, strongEmphasisColor, emphasisFontStyle, emphasisColor, headingStyles, tableBorderColor, tableCellPadding, tableCellWidth, enableHorizontalScrollOnTable, enableMailtoAction, paragraphSpacing, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getBlockQuoteLineColor() {
        return this.blockQuoteLineColor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getEmphasisColor() {
        return this.emphasisColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getEmphasisFontStyle() {
        return this.emphasisFontStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21054m)) {
            return false;
        }
        C21054m c21054m = (C21054m) other;
        return AbstractC22676k.m65745e(this.textStyle, c21054m.textStyle) && C17919x.m51542d(this.textColor, c21054m.textColor) && C17919x.m51542d(this.linkColor, c21054m.linkColor) && C17919x.m51542d(this.blockQuoteLineColor, c21054m.blockQuoteLineColor) && AbstractC22676k.m65745e(this.strongEmphasisFontWeight, c21054m.strongEmphasisFontWeight) && C17919x.m51542d(this.strongEmphasisColor, c21054m.strongEmphasisColor) && this.emphasisFontStyle == c21054m.emphasisFontStyle && C17919x.m51542d(this.emphasisColor, c21054m.emphasisColor) && AbstractC22676k.m65745e(this.headingStyles, c21054m.headingStyles) && C17919x.m51542d(this.tableBorderColor, c21054m.tableBorderColor) && C39174f.m124782b(this.tableCellPadding, c21054m.tableCellPadding) && C39174f.m124782b(this.tableCellWidth, c21054m.tableCellWidth) && this.enableHorizontalScrollOnTable == c21054m.enableHorizontalScrollOnTable && this.enableMailtoAction == c21054m.enableMailtoAction && C39174f.m124782b(this.paragraphSpacing, c21054m.paragraphSpacing);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getEnableHorizontalScrollOnTable() {
        return this.enableHorizontalScrollOnTable;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getEnableMailtoAction() {
        return this.enableMailtoAction;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C21042a getHeadingStyles() {
        return this.headingStyles;
    }

    public int hashCode() {
        int iHashCode = this.textStyle.hashCode() * 31;
        long j7 = this.textColor;
        int i13 = C17919x.f69638o;
        return Float.hashCode(this.paragraphSpacing) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.tableCellWidth, AbstractC11266d.m30447a(this.tableCellPadding, AbstractC11266d.m30451e((this.headingStyles.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.emphasisFontStyle, AbstractC11266d.m30451e((AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(iHashCode, j7, 31), this.linkColor, 31), this.blockQuoteLineColor, 31) + this.strongEmphasisFontWeight.f116547w) * 31, this.strongEmphasisColor, 31), 31), this.emphasisColor, 31)) * 31, this.tableBorderColor, 31), 31), 31), 31, this.enableHorizontalScrollOnTable), 31, this.enableMailtoAction);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getLinkColor() {
        return this.linkColor;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getParagraphSpacing() {
        return this.paragraphSpacing;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getStrongEmphasisColor() {
        return this.strongEmphasisColor;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C28780r getStrongEmphasisFontWeight() {
        return this.strongEmphasisFontWeight;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getTableBorderColor() {
        return this.tableBorderColor;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getTableCellPadding() {
        return this.tableCellPadding;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final float getTableCellWidth() {
        return this.tableCellWidth;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final C23285v0 getTextStyle() {
        return this.textStyle;
    }

    public String toString() {
        C23285v0 c23285v0 = this.textStyle;
        String strM51548j = C17919x.m51548j(this.textColor);
        String strM51548j2 = C17919x.m51548j(this.linkColor);
        String strM51548j3 = C17919x.m51548j(this.blockQuoteLineColor);
        C28780r c28780r = this.strongEmphasisFontWeight;
        String strM51548j4 = C17919x.m51548j(this.strongEmphasisColor);
        String strM87530a = C28776n.m87530a(this.emphasisFontStyle);
        String strM51548j5 = C17919x.m51548j(this.emphasisColor);
        C21042a c21042a = this.headingStyles;
        String strM51548j6 = C17919x.m51548j(this.tableBorderColor);
        String strM124783c = C39174f.m124783c(this.tableCellPadding);
        String strM124783c2 = C39174f.m124783c(this.tableCellWidth);
        boolean z4 = this.enableHorizontalScrollOnTable;
        boolean z13 = this.enableMailtoAction;
        String strM124783c3 = C39174f.m124783c(this.paragraphSpacing);
        StringBuilder sb4 = new StringBuilder("WhoopMarkdownStyles(textStyle=");
        sb4.append(c23285v0);
        sb4.append(", textColor=");
        sb4.append(strM51548j);
        sb4.append(", linkColor=");
        AbstractC11266d.m30444B(sb4, strM51548j2, ", blockQuoteLineColor=", strM51548j3, ", strongEmphasisFontWeight=");
        sb4.append(c28780r);
        sb4.append(", strongEmphasisColor=");
        sb4.append(strM51548j4);
        sb4.append(", emphasisFontStyle=");
        AbstractC11266d.m30444B(sb4, strM87530a, ", emphasisColor=", strM51548j5, ", headingStyles=");
        sb4.append(c21042a);
        sb4.append(", tableBorderColor=");
        sb4.append(strM51548j6);
        sb4.append(", tableCellPadding=");
        AbstractC11266d.m30444B(sb4, strM124783c, ", tableCellWidth=", strM124783c2, ", enableHorizontalScrollOnTable=");
        AbstractC38963t7.m124392v(sb4, z4, ", enableMailtoAction=", z13, ", paragraphSpacing=");
        return AbstractC25012a.m73376i(strM124783c3, ")", sb4);
    }

    private C21054m(C23285v0 textStyle, long j7, long j13, long j14, C28780r strongEmphasisFontWeight, long j15, int i13, long j16, C21042a headingStyles, long j17, float f13, float f14, boolean z4, boolean z13, float f15) {
        AbstractC22676k.m65750j(textStyle, "textStyle");
        AbstractC22676k.m65750j(strongEmphasisFontWeight, "strongEmphasisFontWeight");
        AbstractC22676k.m65750j(headingStyles, "headingStyles");
        this.textStyle = textStyle;
        this.textColor = j7;
        this.linkColor = j13;
        this.blockQuoteLineColor = j14;
        this.strongEmphasisFontWeight = strongEmphasisFontWeight;
        this.strongEmphasisColor = j15;
        this.emphasisFontStyle = i13;
        this.emphasisColor = j16;
        this.headingStyles = headingStyles;
        this.tableBorderColor = j17;
        this.tableCellPadding = f13;
        this.tableCellWidth = f14;
        this.enableHorizontalScrollOnTable = z4;
        this.enableMailtoAction = z13;
        this.paragraphSpacing = f15;
    }
}
