package nj2;

import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import l83.C23465k;
import o81.C27656a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import v41.AbstractC35679m0;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: nj2.k */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b*\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R)\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e0\r8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b&\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b.\u00108R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b,\u00109\u001a\u0004\b3\u0010:R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b6\u0010:R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b;\u0010>R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b<\u0010A¨\u0006B"}, m65681d2 = {"Lnj2/k;", "", "Lv41/r0;", "animation", "Lv41/m0;", "clipSpec", "Lcom/whoop/design/util/TextResource;", "title", "button", "", "repeatCount", "sessionDoneText", "overlay", "", "Ll83/k;", "Ly81/f;", "bottomDisplay", "Lnj2/i;", "finishDialog", "", "showHoldingFrame", "showSessionFinished", "Lo81/a;", "toolbarSubtitle", "totalInterventionLengthInSeconds", "<init>", "(Lv41/r0;Lv41/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lnj2/i;ZZLo81/a;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lv41/r0;", "()Lv41/r0;", "b", "Lv41/m0;", "d", "()Lv41/m0;", "c", "Lcom/whoop/design/util/TextResource;", "j", "()Lcom/whoop/design/util/TextResource;", "e", "I", "g", "f", "getSessionDoneText", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ljava/util/List;", "()Ljava/util/List;", "i", "Lnj2/i;", "()Lnj2/i;", "Z", "()Z", "k", "l", "Lo81/a;", "()Lo81/a;", "m", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26764k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC35689r0 animation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC35679m0 clipSpec;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource button;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int repeatCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final TextResource sessionDoneText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final TextResource overlay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<C23465k> bottomDisplay;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C26762i finishDialog;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean showHoldingFrame;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean showSessionFinished;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C27656a toolbarSubtitle;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final Integer totalInterventionLengthInSeconds;

    /* JADX WARN: Multi-variable type inference failed */
    public C26764k(InterfaceC35689r0 animation, AbstractC35679m0 clipSpec, TextResource title, TextResource button, int i13, TextResource sessionDoneText, TextResource overlay, List<? extends C23465k> bottomDisplay, C26762i c26762i, boolean z4, boolean z13, C27656a c27656a, Integer num) {
        AbstractC22676k.m65750j(animation, "animation");
        AbstractC22676k.m65750j(clipSpec, "clipSpec");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(sessionDoneText, "sessionDoneText");
        AbstractC22676k.m65750j(overlay, "overlay");
        AbstractC22676k.m65750j(bottomDisplay, "bottomDisplay");
        this.animation = animation;
        this.clipSpec = clipSpec;
        this.title = title;
        this.button = button;
        this.repeatCount = i13;
        this.sessionDoneText = sessionDoneText;
        this.overlay = overlay;
        this.bottomDisplay = bottomDisplay;
        this.finishDialog = c26762i;
        this.showHoldingFrame = z4;
        this.showSessionFinished = z13;
        this.toolbarSubtitle = c27656a;
        this.totalInterventionLengthInSeconds = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC35689r0 getAnimation() {
        return this.animation;
    }

    /* JADX INFO: renamed from: b */
    public final List<C23465k> m79680b() {
        return this.bottomDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC35679m0 getClipSpec() {
        return this.clipSpec;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C26762i getFinishDialog() {
        return this.finishDialog;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26764k)) {
            return false;
        }
        C26764k c26764k = (C26764k) other;
        return AbstractC22676k.m65745e(this.animation, c26764k.animation) && AbstractC22676k.m65745e(this.clipSpec, c26764k.clipSpec) && AbstractC22676k.m65745e(this.title, c26764k.title) && AbstractC22676k.m65745e(this.button, c26764k.button) && this.repeatCount == c26764k.repeatCount && AbstractC22676k.m65745e(this.sessionDoneText, c26764k.sessionDoneText) && AbstractC22676k.m65745e(this.overlay, c26764k.overlay) && AbstractC22676k.m65745e(this.bottomDisplay, c26764k.bottomDisplay) && AbstractC22676k.m65745e(this.finishDialog, c26764k.finishDialog) && this.showHoldingFrame == c26764k.showHoldingFrame && this.showSessionFinished == c26764k.showSessionFinished && AbstractC22676k.m65745e(this.toolbarSubtitle, c26764k.toolbarSubtitle) && AbstractC22676k.m65745e(this.totalInterventionLengthInSeconds, c26764k.totalInterventionLengthInSeconds);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final TextResource getOverlay() {
        return this.overlay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRepeatCount() {
        return this.repeatCount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getShowHoldingFrame() {
        return this.showHoldingFrame;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11266d.m30448b(this.repeatCount, AbstractC31061c.m95625a(AbstractC31061c.m95625a((this.clipSpec.hashCode() + (this.animation.hashCode() * 31)) * 31, this.title, 31), this.button, 31), 31), this.sessionDoneText, 31), this.overlay, 31), 31, this.bottomDisplay);
        C26762i c26762i = this.finishDialog;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM31983b + (c26762i == null ? 0 : c26762i.hashCode())) * 31, 31, this.showHoldingFrame), 31, this.showSessionFinished);
        C27656a c27656a = this.toolbarSubtitle;
        int iHashCode = (iM8289b + (c27656a == null ? 0 : c27656a.hashCode())) * 31;
        Integer num = this.totalInterventionLengthInSeconds;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getShowSessionFinished() {
        return this.showSessionFinished;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final C27656a getToolbarSubtitle() {
        return this.toolbarSubtitle;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Integer getTotalInterventionLengthInSeconds() {
        return this.totalInterventionLengthInSeconds;
    }

    public String toString() {
        InterfaceC35689r0 interfaceC35689r0 = this.animation;
        AbstractC35679m0 abstractC35679m0 = this.clipSpec;
        TextResource textResource = this.title;
        TextResource textResource2 = this.button;
        int i13 = this.repeatCount;
        TextResource textResource3 = this.sessionDoneText;
        TextResource textResource4 = this.overlay;
        List<C23465k> list = this.bottomDisplay;
        C26762i c26762i = this.finishDialog;
        boolean z4 = this.showHoldingFrame;
        boolean z13 = this.showSessionFinished;
        C27656a c27656a = this.toolbarSubtitle;
        Integer num = this.totalInterventionLengthInSeconds;
        StringBuilder sb4 = new StringBuilder("StressInterventionViewState(animation=");
        sb4.append(interfaceC35689r0);
        sb4.append(", clipSpec=");
        sb4.append(abstractC35679m0);
        sb4.append(", title=");
        AbstractC30007c.m91855y(sb4, textResource, ", button=", textResource2, ", repeatCount=");
        sb4.append(i13);
        sb4.append(", sessionDoneText=");
        sb4.append(textResource3);
        sb4.append(", overlay=");
        AbstractC21702c.m61143n(textResource4, ", bottomDisplay=", ", finishDialog=", sb4, list);
        sb4.append(c26762i);
        sb4.append(", showHoldingFrame=");
        sb4.append(z4);
        sb4.append(", showSessionFinished=");
        sb4.append(z13);
        sb4.append(", toolbarSubtitle=");
        sb4.append(c27656a);
        sb4.append(", totalInterventionLengthInSeconds=");
        return AbstractC11478a.m30859k(sb4, num, ")");
    }
}
