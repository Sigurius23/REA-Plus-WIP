package n51;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n51.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Ln51/a;", "", "Ln51/c;", "type", "Ln51/b;", "animation", "<init>", "(Ln51/c;Ln51/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln51/c;", "b", "()Ln51/c;", "Ln51/b;", "()Ln51/b;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26294a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC26296c type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC26295b animation;

    public C26294a(EnumC26296c type, EnumC26295b animation) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(animation, "animation");
        this.type = type;
        this.animation = animation;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC26295b getAnimation() {
        return this.animation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC26296c getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26294a)) {
            return false;
        }
        C26294a c26294a = (C26294a) other;
        return this.type == c26294a.type && this.animation == c26294a.animation;
    }

    public int hashCode() {
        return this.animation.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "ColumnEntrance(type=" + this.type + ", animation=" + this.animation + ")";
    }
}
