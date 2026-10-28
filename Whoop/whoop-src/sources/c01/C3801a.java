package c01;

import com.whoop.design.util.TextResource;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.InterfaceC39332e;

/* JADX INFO: renamed from: c01.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u001c\u0010\u001f¨\u0006 "}, m65681d2 = {"Lc01/a;", "", "Ly81/e;", "color", "", "opacity", "", "amount", "Lcom/whoop/design/util/TextResource;", "label", "<init>", "(Ly81/e;FILcom/whoop/design/util/TextResource;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly81/e;", "b", "()Ly81/e;", "F", "d", "()F", "c", "I", "Lcom/whoop/design/util/TextResource;", "()Lcom/whoop/design/util/TextResource;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C3801a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39332e color;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float opacity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final TextResource label;

    public C3801a(InterfaceC39332e color, float f13, int i13, TextResource label) {
        AbstractC22676k.m65750j(color, "color");
        AbstractC22676k.m65750j(label, "label");
        this.color = color;
        this.opacity = f13;
        this.amount = i13;
        this.label = label;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAmount() {
        return this.amount;
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
    public final float getOpacity() {
        return this.opacity;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3801a)) {
            return false;
        }
        C3801a c3801a = (C3801a) other;
        return AbstractC22676k.m65745e(this.color, c3801a.color) && Float.compare(this.opacity, c3801a.opacity) == 0 && this.amount == c3801a.amount && AbstractC22676k.m65745e(this.label, c3801a.label);
    }

    public int hashCode() {
        return this.label.hashCode() + AbstractC11266d.m30448b(this.amount, AbstractC11266d.m30447a(this.opacity, this.color.hashCode() * 31, 31), 31);
    }

    public String toString() {
        return "Bar(color=" + this.color + ", opacity=" + this.opacity + ", amount=" + this.amount + ", label=" + this.label + ")";
    }

    public /* synthetic */ C3801a(InterfaceC39332e interfaceC39332e, float f13, int i13, TextResource textResource, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC39332e, (i14 & 2) != 0 ? 1.0f : f13, (i14 & 4) != 0 ? 0 : i13, textResource);
    }
}
