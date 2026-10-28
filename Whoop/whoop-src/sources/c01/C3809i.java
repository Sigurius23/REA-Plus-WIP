package c01;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import r80.AbstractC31061c;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: c01.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lc01/i;", "", "Ly81/e;", "color", "", "percentage", "Lcom/whoop/design/util/TextResource;", "bottomDisplay", "label", "<init>", "(Ly81/e;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/e;", "b", "()Ly81/e;", "F", "d", "()F", "c", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3809i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float percentage;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource bottomDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource label;

    public C3809i(InterfaceC39332e color, float f13, TextResource bottomDisplay, TextResource label) {
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(bottomDisplay, "bottomDisplay");
        AbstractC22676k.m65750j(label, "label");
        this.color = color;
        this.percentage = f13;
        this.bottomDisplay = bottomDisplay;
        this.label = label;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextResource getBottomDisplay() {
        return this.bottomDisplay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC39332e getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3809i)) {
            return false;
        }
        C3809i c3809i = (C3809i) other;
        return AbstractC22676k.m65745e(this.color, c3809i.color) && Float.compare(this.percentage, c3809i.percentage) == 0 && AbstractC22676k.m65745e(this.bottomDisplay, c3809i.bottomDisplay) && AbstractC22676k.m65745e(this.label, c3809i.label);
    }

    public int hashCode() {
        return this.label.hashCode() + AbstractC31061c.m95625a(AbstractC11266d.m30447a(this.percentage, this.color.hashCode() * 31, 31), this.bottomDisplay, 31);
    }

    public String toString() {
        InterfaceC39332e interfaceC39332e = this.color;
        float f13 = this.percentage;
        TextResource textResource = this.bottomDisplay;
        TextResource textResource2 = this.label;
        StringBuilder sb4 = new StringBuilder("ConfigurableBar(color=");
        sb4.append(interfaceC39332e);
        sb4.append(", percentage=");
        sb4.append(f13);
        sb4.append(", bottomDisplay=");
        return AbstractC33745d.m106655n(sb4, textResource, ", label=", textResource2, ")");
    }
}
