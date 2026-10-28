package a61;

import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: a61.f */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, m65681d2 = {"La61/f;", "Lm91/u;", "Lcom/whoop/design/util/TextResource;", "value", "Lkd1/o;", "icon", "name", "Ly81/f;", "color", "<init>", "(Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ly81/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/design/util/TextResource;", "e", "()Lcom/whoop/design/util/TextResource;", "b", "Lkd1/o;", "()Lkd1/o;", "c", "d", "Ly81/f;", "()Ly81/f;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0473f implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TextResource value;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC22403o icon;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextResource name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final EnumC39333f color;

    public C0473f(TextResource value, AbstractC22403o abstractC22403o, TextResource name, EnumC39333f color) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(color, "color");
        this.value = value;
        this.icon = abstractC22403o;
        this.name = name;
        this.color = color;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC39333f getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC22403o getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final TextResource getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final TextResource getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0473f)) {
            return false;
        }
        C0473f c0473f = (C0473f) other;
        return AbstractC22676k.m65745e(this.value, c0473f.value) && AbstractC22676k.m65745e(this.icon, c0473f.icon) && AbstractC22676k.m65745e(this.name, c0473f.name) && this.color == c0473f.color;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        AbstractC22403o abstractC22403o = this.icon;
        return this.color.hashCode() + AbstractC31061c.m95625a((iHashCode + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31, this.name, 31);
    }

    public String toString() {
        return "ProgressSubtaskState(value=" + this.value + ", icon=" + this.icon + ", name=" + this.name + ", color=" + this.color + ")";
    }
}
