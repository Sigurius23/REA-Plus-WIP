package y01;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23465k;
import p208i2.C17919x;
import p319m4.AbstractC25012a;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y01.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b\u001e\u0010!R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b&\u0010*¨\u0006+"}, m65681d2 = {"Ly01/c;", "Lm91/u;", "Ll83/k;", "", "breakDown", "Lcom/whoop/design/util/TextResource;", "startLabel", "endLabel", "startValue", "endValue", "Ly81/e;", "fillColor", "Ly3/f;", "height", "<init>", "(Ll83/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll83/k;", "()Ll83/k;", "b", "Lcom/whoop/design/util/TextResource;", "g", "()Lcom/whoop/design/util/TextResource;", "c", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "e", "f", "Ly81/e;", "()Ly81/e;", "F", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C39020c implements InterfaceC25312u {

    /* JADX INFO: renamed from: h */
    public static final int f167936h = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23465k breakDown;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextResource startLabel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource endLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource startValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextResource endValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC39332e fillColor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: y01.c$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f167944w = new a();

        /* JADX INFO: renamed from: a */
        public final long m124430a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getStrain();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m124430a((C39336i) obj));
        }
    }

    public /* synthetic */ C39020c(C23465k c23465k, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c23465k, textResource, textResource2, textResource3, textResource4, interfaceC39332e, f13);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C23465k getBreakDown() {
        return this.breakDown;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getEndLabel() {
        return this.endLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getEndValue() {
        return this.endValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final InterfaceC39332e getFillColor() {
        return this.fillColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C39020c)) {
            return false;
        }
        C39020c c39020c = (C39020c) other;
        return AbstractC22676k.m65745e(this.breakDown, c39020c.breakDown) && AbstractC22676k.m65745e(this.startLabel, c39020c.startLabel) && AbstractC22676k.m65745e(this.endLabel, c39020c.endLabel) && AbstractC22676k.m65745e(this.startValue, c39020c.startValue) && AbstractC22676k.m65745e(this.endValue, c39020c.endValue) && AbstractC22676k.m65745e(this.fillColor, c39020c.fillColor) && C39174f.m124782b(this.height, c39020c.height);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final TextResource getStartLabel() {
        return this.startLabel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final TextResource getStartValue() {
        return this.startValue;
    }

    public int hashCode() {
        return Float.hashCode(this.height) + AbstractC33745d.m106648g(this.fillColor, AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.breakDown.hashCode() * 31, this.startLabel, 31), this.endLabel, 31), this.startValue, 31), this.endValue, 31), 31);
    }

    public String toString() {
        C23465k c23465k = this.breakDown;
        TextResource textResource = this.startLabel;
        TextResource textResource2 = this.endLabel;
        TextResource textResource3 = this.startValue;
        TextResource textResource4 = this.endValue;
        InterfaceC39332e interfaceC39332e = this.fillColor;
        String strM124783c = C39174f.m124783c(this.height);
        StringBuilder sb4 = new StringBuilder("ComparisonBarState(breakDown=");
        sb4.append(c23465k);
        sb4.append(", startLabel=");
        sb4.append(textResource);
        sb4.append(", endLabel=");
        AbstractC30007c.m91855y(sb4, textResource2, ", startValue=", textResource3, ", endValue=");
        sb4.append(textResource4);
        sb4.append(", fillColor=");
        sb4.append(interfaceC39332e);
        sb4.append(", height=");
        return AbstractC25012a.m73376i(strM124783c, ")", sb4);
    }

    private C39020c(C23465k breakDown, TextResource startLabel, TextResource endLabel, TextResource startValue, TextResource endValue, InterfaceC39332e fillColor, float f13) {
        AbstractC22676k.m65750j(breakDown, "breakDown");
        AbstractC22676k.m65750j(startLabel, "startLabel");
        AbstractC22676k.m65750j(endLabel, "endLabel");
        AbstractC22676k.m65750j(startValue, "startValue");
        AbstractC22676k.m65750j(endValue, "endValue");
        AbstractC22676k.m65750j(fillColor, "fillColor");
        this.breakDown = breakDown;
        this.startLabel = startLabel;
        this.endLabel = endLabel;
        this.startValue = startValue;
        this.endValue = endValue;
        this.fillColor = fillColor;
        this.height = f13;
    }

    public C39020c(C23465k c23465k, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, InterfaceC39332e interfaceC39332e, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c23465k, textResource, textResource2, textResource3, textResource4, (i13 & 32) != 0 ? p745y81.Function1.m125323a(a.f167944w) : interfaceC39332e, (i13 & 64) != 0 ? 7 * 4 : f13, null);
    }
}
