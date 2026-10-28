package ly0;

import b91.AbstractC2890e;
import b91.C2886a;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: ly0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m65681d2 = {"Lly0/f;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "currentStatText", "historicStatText", "Lly0/a;", "arrowStatIconState", "Lb91/a;", "currentStatTextStyle", "", "isEndAligned", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lly0/a;Lb91/a;Z)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lly0/a;Lb91/a;Z)Lly0/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "g", "c", "Lly0/a;", "()Lly0/a;", "d", "Lb91/a;", "f", "()Lb91/a;", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24802f implements InterfaceC25312u {

    /* JADX INFO: renamed from: f */
    public static final int f97092f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource currentStatText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource historicStatText;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C24797a arrowStatIconState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C2886a currentStatTextStyle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isEndAligned;

    public C24802f(TextResource currentStatText, TextResource historicStatText, C24797a c24797a, C2886a currentStatTextStyle, boolean z4) {
        AbstractC22676k.m65750j(currentStatText, "currentStatText");
        AbstractC22676k.m65750j(historicStatText, "historicStatText");
        AbstractC22676k.m65750j(currentStatTextStyle, "currentStatTextStyle");
        this.currentStatText = currentStatText;
        this.historicStatText = historicStatText;
        this.arrowStatIconState = c24797a;
        this.currentStatTextStyle = currentStatTextStyle;
        this.isEndAligned = z4;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C24802f m72702b(C24802f c24802f, TextResource textResource, TextResource textResource2, C24797a c24797a, C2886a c2886a, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = c24802f.currentStatText;
        }
        if ((i13 & 2) != 0) {
            textResource2 = c24802f.historicStatText;
        }
        if ((i13 & 4) != 0) {
            c24797a = c24802f.arrowStatIconState;
        }
        if ((i13 & 8) != 0) {
            c2886a = c24802f.currentStatTextStyle;
        }
        if ((i13 & 16) != 0) {
            z4 = c24802f.isEndAligned;
        }
        boolean z13 = z4;
        C24797a c24797a2 = c24797a;
        return c24802f.m72703a(textResource, textResource2, c24797a2, c2886a, z13);
    }

    /* JADX INFO: renamed from: a */
    public final C24802f m72703a(TextResource currentStatText, TextResource historicStatText, C24797a arrowStatIconState, C2886a currentStatTextStyle, boolean isEndAligned) {
        AbstractC22676k.m65750j(currentStatText, "currentStatText");
        AbstractC22676k.m65750j(historicStatText, "historicStatText");
        AbstractC22676k.m65750j(currentStatTextStyle, "currentStatTextStyle");
        return new C24802f(currentStatText, historicStatText, arrowStatIconState, currentStatTextStyle, isEndAligned);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C24797a getArrowStatIconState() {
        return this.arrowStatIconState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getCurrentStatText() {
        return this.currentStatText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24802f)) {
            return false;
        }
        C24802f c24802f = (C24802f) other;
        return AbstractC22676k.m65745e(this.currentStatText, c24802f.currentStatText) && AbstractC22676k.m65745e(this.historicStatText, c24802f.historicStatText) && AbstractC22676k.m65745e(this.arrowStatIconState, c24802f.arrowStatIconState) && AbstractC22676k.m65745e(this.currentStatTextStyle, c24802f.currentStatTextStyle) && this.isEndAligned == c24802f.isEndAligned;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C2886a getCurrentStatTextStyle() {
        return this.currentStatTextStyle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getHistoricStatText() {
        return this.historicStatText;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsEndAligned() {
        return this.isEndAligned;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.currentStatText.hashCode() * 31, this.historicStatText, 31);
        C24797a c24797a = this.arrowStatIconState;
        return Boolean.hashCode(this.isEndAligned) + AbstractC11895b.m31984c(this.currentStatTextStyle, (iM95625a + (c24797a == null ? 0 : c24797a.hashCode())) * 31, 31);
    }

    public String toString() {
        TextResource textResource = this.currentStatText;
        TextResource textResource2 = this.historicStatText;
        C24797a c24797a = this.arrowStatIconState;
        C2886a c2886a = this.currentStatTextStyle;
        boolean z4 = this.isEndAligned;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ArrowStatState(currentStatText=", textResource, ", historicStatText=", textResource2, ", arrowStatIconState=");
        sbM106658q.append(c24797a);
        sbM106658q.append(", currentStatTextStyle=");
        sbM106658q.append(c2886a);
        sbM106658q.append(", isEndAligned=");
        return AbstractC18489d0.m53372m(sbM106658q, z4, ")");
    }

    public /* synthetic */ C24802f(TextResource textResource, TextResource textResource2, C24797a c24797a, C2886a c2886a, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(textResource, textResource2, c24797a, (i13 & 8) != 0 ? AbstractC2890e.m8450e().getN5() : c2886a, z4);
    }
}
