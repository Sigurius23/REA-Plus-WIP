package u61;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import p031b9.AbstractC2875y;
import p208i2.C17919x;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: u61.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lu61/d;", "", "Lcom/whoop/design/util/TextResource;", "label", "Ly81/e;", "color", "", "labelBackground", "drawLabelBelow", "<init>", "(Lcom/whoop/design/util/TextResource;Ly81/e;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "c", "()Lcom/whoop/design/util/TextResource;", "b", "Ly81/e;", "()Ly81/e;", "Z", "d", "()Z", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34555d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource label;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean labelBackground;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean drawLabelBelow;

    /* JADX INFO: renamed from: u61.d$a */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f145421w = new a();

        /* JADX INFO: renamed from: a */
        public final long m109245a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m109245a((C39336i) obj));
        }
    }

    public C34555d(TextResource label, InterfaceC39332e color, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(color, "color");
        this.label = label;
        this.color = color;
        this.labelBackground = z4;
        this.drawLabelBelow = z13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDrawLabelBelow() {
        return this.drawLabelBelow;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getLabelBackground() {
        return this.labelBackground;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34555d)) {
            return false;
        }
        C34555d c34555d = (C34555d) other;
        return AbstractC22676k.m65745e(this.label, c34555d.label) && AbstractC22676k.m65745e(this.color, c34555d.color) && this.labelBackground == c34555d.labelBackground && this.drawLabelBelow == c34555d.drawLabelBelow;
    }

    public int hashCode() {
        return Boolean.hashCode(this.drawLabelBelow) + AbstractC2875y.m8289b(AbstractC33745d.m106648g(this.color, this.label.hashCode() * 31, 31), 31, this.labelBackground);
    }

    public String toString() {
        TextResource textResource = this.label;
        InterfaceC39332e interfaceC39332e = this.color;
        boolean z4 = this.labelBackground;
        boolean z13 = this.drawLabelBelow;
        StringBuilder sb4 = new StringBuilder("PointLabelState(label=");
        sb4.append(textResource);
        sb4.append(", color=");
        sb4.append(interfaceC39332e);
        sb4.append(", labelBackground=");
        return AbstractC36095b.m114682j(sb4, z4, ", drawLabelBelow=", z13, ")");
    }

    public /* synthetic */ C34555d(TextResource textResource, InterfaceC39332e interfaceC39332e, boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? p745y81.Function1.m125323a(a.f145421w) : interfaceC39332e, (i13 & 4) != 0 ? true : z4, (i13 & 8) != 0 ? false : z13);
    }
}
