package zk0;

import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: zk0.i0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018JÄ\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b7\u0010&R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b8\u0010&R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b9\u0010&R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b:\u0010&R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b;\u0010&R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b+\u0010&R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b1\u0010&R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010$\u001a\u0004\b/\u0010&R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b-\u0010&R\u0011\u0010>\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u0010&R\u0011\u0010?\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b=\u0010&R\u0011\u0010@\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b<\u0010&¨\u0006A"}, m65681d2 = {"Lzk0/i0;", "", "Ly3/f;", "h1SpacingTop", "h1SpacingBottom", "h2SpacingTop", "h2SpacingBottom", "h3SpacingTop", "h3SpacingBottom", "paragraphSpacing", "", "linkUnderline", "blockQuoteBorderWidth", "listIndent", "", "fontSize", "lineHeightPercent", "firstLineHeightPercent", "bottomMarginMultiplier", "dividerHeight", "dividerOpacity", "dividerMarginTop", "dividerMarginBottom", "<init>", "(FFFFFFFZFFFFFFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "(FFFFFFFZFFFFFFFFFF)Lzk0/i0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "j", "()F", "b", "i", "c", "l", "d", "k", "e", "n", "f", "m", "g", "getParagraphSpacing-D9Ej5fM", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "o", "()Z", "p", "getFontSize", "getLineHeightPercent", "getFirstLineHeightPercent", "getBottomMarginMultiplier", "q", "r", "firstLineExtraMargin", "paragraphTopMargin", "paragraphBottomMargin", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40819i0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float h1SpacingTop;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float h1SpacingBottom;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float h2SpacingTop;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float h2SpacingBottom;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final float h3SpacingTop;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final float h3SpacingBottom;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float paragraphSpacing;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean linkUnderline;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float blockQuoteBorderWidth;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final float listIndent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final float fontSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final float lineHeightPercent;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final float firstLineHeightPercent;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final float bottomMarginMultiplier;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final float dividerHeight;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final float dividerOpacity;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final float dividerMarginTop;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final float dividerMarginBottom;

    public /* synthetic */ C40819i0(float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z4, float f24, float f25, float f26, float f27, float f28, float f29, float f34, float f35, float f36, float f37, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, f16, f17, f18, f19, z4, f24, f25, f26, f27, f28, f29, f34, f35, f36, f37);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C40819i0 m132311b(C40819i0 c40819i0, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z4, float f24, float f25, float f26, float f27, float f28, float f29, float f34, float f35, float f36, float f37, int i13, Object obj) {
        float f38;
        float f39;
        float f43 = (i13 & 1) != 0 ? c40819i0.h1SpacingTop : f13;
        float f44 = (i13 & 2) != 0 ? c40819i0.h1SpacingBottom : f14;
        float f45 = (i13 & 4) != 0 ? c40819i0.h2SpacingTop : f15;
        float f46 = (i13 & 8) != 0 ? c40819i0.h2SpacingBottom : f16;
        float f47 = (i13 & 16) != 0 ? c40819i0.h3SpacingTop : f17;
        float f48 = (i13 & 32) != 0 ? c40819i0.h3SpacingBottom : f18;
        float f49 = (i13 & 64) != 0 ? c40819i0.paragraphSpacing : f19;
        boolean z13 = (i13 & 128) != 0 ? c40819i0.linkUnderline : z4;
        float f54 = (i13 & 256) != 0 ? c40819i0.blockQuoteBorderWidth : f24;
        float f55 = (i13 & 512) != 0 ? c40819i0.listIndent : f25;
        float f56 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c40819i0.fontSize : f26;
        float f57 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c40819i0.lineHeightPercent : f27;
        float f58 = (i13 & 4096) != 0 ? c40819i0.firstLineHeightPercent : f28;
        float f59 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c40819i0.bottomMarginMultiplier : f29;
        float f64 = f43;
        float f65 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c40819i0.dividerHeight : f34;
        float f66 = (i13 & 32768) != 0 ? c40819i0.dividerOpacity : f35;
        float f67 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? c40819i0.dividerMarginTop : f36;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0) {
            f39 = f67;
            f38 = c40819i0.dividerMarginBottom;
        } else {
            f38 = f37;
            f39 = f67;
        }
        return c40819i0.m132312a(f64, f44, f45, f46, f47, f48, f49, z13, f54, f55, f56, f57, f58, f59, f65, f66, f39, f38);
    }

    /* JADX INFO: renamed from: a */
    public final C40819i0 m132312a(float h1SpacingTop, float h1SpacingBottom, float h2SpacingTop, float h2SpacingBottom, float h3SpacingTop, float h3SpacingBottom, float paragraphSpacing, boolean linkUnderline, float blockQuoteBorderWidth, float listIndent, float fontSize, float lineHeightPercent, float firstLineHeightPercent, float bottomMarginMultiplier, float dividerHeight, float dividerOpacity, float dividerMarginTop, float dividerMarginBottom) {
        return new C40819i0(h1SpacingTop, h1SpacingBottom, h2SpacingTop, h2SpacingBottom, h3SpacingTop, h3SpacingBottom, paragraphSpacing, linkUnderline, blockQuoteBorderWidth, listIndent, fontSize, lineHeightPercent, firstLineHeightPercent, bottomMarginMultiplier, dividerHeight, dividerOpacity, dividerMarginTop, dividerMarginBottom, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getBlockQuoteBorderWidth() {
        return this.blockQuoteBorderWidth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getDividerHeight() {
        return this.dividerHeight;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getDividerMarginBottom() {
        return this.dividerMarginBottom;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40819i0)) {
            return false;
        }
        C40819i0 c40819i0 = (C40819i0) other;
        return C39174f.m124782b(this.h1SpacingTop, c40819i0.h1SpacingTop) && C39174f.m124782b(this.h1SpacingBottom, c40819i0.h1SpacingBottom) && C39174f.m124782b(this.h2SpacingTop, c40819i0.h2SpacingTop) && C39174f.m124782b(this.h2SpacingBottom, c40819i0.h2SpacingBottom) && C39174f.m124782b(this.h3SpacingTop, c40819i0.h3SpacingTop) && C39174f.m124782b(this.h3SpacingBottom, c40819i0.h3SpacingBottom) && C39174f.m124782b(this.paragraphSpacing, c40819i0.paragraphSpacing) && this.linkUnderline == c40819i0.linkUnderline && C39174f.m124782b(this.blockQuoteBorderWidth, c40819i0.blockQuoteBorderWidth) && C39174f.m124782b(this.listIndent, c40819i0.listIndent) && Float.compare(this.fontSize, c40819i0.fontSize) == 0 && Float.compare(this.lineHeightPercent, c40819i0.lineHeightPercent) == 0 && Float.compare(this.firstLineHeightPercent, c40819i0.firstLineHeightPercent) == 0 && Float.compare(this.bottomMarginMultiplier, c40819i0.bottomMarginMultiplier) == 0 && C39174f.m124782b(this.dividerHeight, c40819i0.dividerHeight) && Float.compare(this.dividerOpacity, c40819i0.dividerOpacity) == 0 && C39174f.m124782b(this.dividerMarginTop, c40819i0.dividerMarginTop) && C39174f.m124782b(this.dividerMarginBottom, c40819i0.dividerMarginBottom);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getDividerMarginTop() {
        return this.dividerMarginTop;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getDividerOpacity() {
        return this.dividerOpacity;
    }

    /* JADX INFO: renamed from: h */
    public final float m132318h() {
        return ((this.firstLineHeightPercent - this.lineHeightPercent) / 100.0f) * this.fontSize;
    }

    public int hashCode() {
        return Float.hashCode(this.dividerMarginBottom) + AbstractC11266d.m30447a(this.dividerMarginTop, AbstractC11266d.m30447a(this.dividerOpacity, AbstractC11266d.m30447a(this.dividerHeight, AbstractC11266d.m30447a(this.bottomMarginMultiplier, AbstractC11266d.m30447a(this.firstLineHeightPercent, AbstractC11266d.m30447a(this.lineHeightPercent, AbstractC11266d.m30447a(this.fontSize, AbstractC11266d.m30447a(this.listIndent, AbstractC11266d.m30447a(this.blockQuoteBorderWidth, AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.paragraphSpacing, AbstractC11266d.m30447a(this.h3SpacingBottom, AbstractC11266d.m30447a(this.h3SpacingTop, AbstractC11266d.m30447a(this.h2SpacingBottom, AbstractC11266d.m30447a(this.h2SpacingTop, AbstractC11266d.m30447a(this.h1SpacingBottom, Float.hashCode(this.h1SpacingTop) * 31, 31), 31), 31), 31), 31), 31), 31, this.linkUnderline), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getH1SpacingBottom() {
        return this.h1SpacingBottom;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getH1SpacingTop() {
        return this.h1SpacingTop;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getH2SpacingBottom() {
        return this.h2SpacingBottom;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getH2SpacingTop() {
        return this.h2SpacingTop;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getH3SpacingBottom() {
        return this.h3SpacingBottom;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getH3SpacingTop() {
        return this.h3SpacingTop;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getLinkUnderline() {
        return this.linkUnderline;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final float getListIndent() {
        return this.listIndent;
    }

    /* JADX INFO: renamed from: q */
    public final float m132327q() {
        return m132328r() * this.bottomMarginMultiplier;
    }

    /* JADX INFO: renamed from: r */
    public final float m132328r() {
        return m132318h() + this.paragraphSpacing;
    }

    public String toString() {
        String strM124783c = C39174f.m124783c(this.h1SpacingTop);
        String strM124783c2 = C39174f.m124783c(this.h1SpacingBottom);
        String strM124783c3 = C39174f.m124783c(this.h2SpacingTop);
        String strM124783c4 = C39174f.m124783c(this.h2SpacingBottom);
        String strM124783c5 = C39174f.m124783c(this.h3SpacingTop);
        String strM124783c6 = C39174f.m124783c(this.h3SpacingBottom);
        String strM124783c7 = C39174f.m124783c(this.paragraphSpacing);
        boolean z4 = this.linkUnderline;
        String strM124783c8 = C39174f.m124783c(this.blockQuoteBorderWidth);
        String strM124783c9 = C39174f.m124783c(this.listIndent);
        float f13 = this.fontSize;
        float f14 = this.lineHeightPercent;
        float f15 = this.firstLineHeightPercent;
        float f16 = this.bottomMarginMultiplier;
        String strM124783c10 = C39174f.m124783c(this.dividerHeight);
        float f17 = this.dividerOpacity;
        String strM124783c11 = C39174f.m124783c(this.dividerMarginTop);
        String strM124783c12 = C39174f.m124783c(this.dividerMarginBottom);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BotMarkdownSpacing(h1SpacingTop=", strM124783c, ", h1SpacingBottom=", strM124783c2, ", h2SpacingTop=");
        AbstractC11266d.m30444B(sbM32001t, strM124783c3, ", h2SpacingBottom=", strM124783c4, ", h3SpacingTop=");
        AbstractC11266d.m30444B(sbM32001t, strM124783c5, ", h3SpacingBottom=", strM124783c6, ", paragraphSpacing=");
        AbstractC38963t7.m124390t(sbM32001t, strM124783c7, ", linkUnderline=", z4, ", blockQuoteBorderWidth=");
        AbstractC11266d.m30444B(sbM32001t, strM124783c8, ", listIndent=", strM124783c9, ", fontSize=");
        AbstractC30802r.m94772u(sbM32001t, f13, ", lineHeightPercent=", f14, ", firstLineHeightPercent=");
        AbstractC30802r.m94772u(sbM32001t, f15, ", bottomMarginMultiplier=", f16, ", dividerHeight=");
        sbM32001t.append(strM124783c10);
        sbM32001t.append(", dividerOpacity=");
        sbM32001t.append(f17);
        sbM32001t.append(", dividerMarginTop=");
        return AbstractC11266d.m30464r(sbM32001t, strM124783c11, ", dividerMarginBottom=", strM124783c12, ")");
    }

    private C40819i0(float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z4, float f24, float f25, float f26, float f27, float f28, float f29, float f34, float f35, float f36, float f37) {
        this.h1SpacingTop = f13;
        this.h1SpacingBottom = f14;
        this.h2SpacingTop = f15;
        this.h2SpacingBottom = f16;
        this.h3SpacingTop = f17;
        this.h3SpacingBottom = f18;
        this.paragraphSpacing = f19;
        this.linkUnderline = z4;
        this.blockQuoteBorderWidth = f24;
        this.listIndent = f25;
        this.fontSize = f26;
        this.lineHeightPercent = f27;
        this.firstLineHeightPercent = f28;
        this.bottomMarginMultiplier = f29;
        this.dividerHeight = f34;
        this.dividerOpacity = f35;
        this.dividerMarginTop = f36;
        this.dividerMarginBottom = f37;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C40819i0(float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z4, float f24, float f25, float f26, float f27, float f28, float f29, float f34, float f35, float f36, float f37, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        float f38 = (i13 & 1) != 0 ? 16 : f13;
        float f39 = (i13 & 2) != 0 ? 8 : f14;
        float f43 = (i13 & 4) != 0 ? 14 : f15;
        float f44 = (i13 & 8) != 0 ? 6 : f16;
        float f45 = (i13 & 16) != 0 ? 12 : f17;
        float f46 = (i13 & 32) != 0 ? 4 : f18;
        float f47 = (i13 & 64) != 0 ? 8 : f19;
        boolean z13 = (i13 & 128) != 0 ? true : z4;
        float f48 = (i13 & 256) != 0 ? 4 : f24;
        float f49 = (i13 & 512) != 0 ? 0 : f25;
        float f54 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 16.0f : f26;
        float f55 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? 145.0f : f27;
        float f56 = (i13 & 4096) != 0 ? 180.0f : f28;
        float f57 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? 1.5f : f29;
        float f58 = f38;
        float f59 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? 0 : f34;
        float f64 = f59;
        float f65 = f39;
        float f66 = f47;
        float f67 = f43;
        float f68 = f44;
        float f69 = f45;
        float f74 = f46;
        float f75 = f48;
        boolean z14 = z13;
        float f76 = f49;
        float f77 = f54;
        float f78 = f55;
        float f79 = f56;
        this(f58, f65, f67, f68, f69, f74, f66, z14, f75, f76, f77, f78, f79, f57, f64, (32768 & i13) != 0 ? 0.0f : f35, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? 16 : f36, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? 16 : f37, null);
    }
}
