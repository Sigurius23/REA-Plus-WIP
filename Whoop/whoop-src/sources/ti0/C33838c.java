package ti0;

import kd1.AbstractC22403o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ti0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lti0/c;", "", "Lkd1/o;", "image", "Lti0/l;", "theme", "<init>", "(Lkd1/o;Lti0/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkd1/o;", "()Lkd1/o;", "b", "Lti0/l;", "()Lti0/l;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33838c {

    /* JADX INFO: renamed from: c */
    public static final int f141704c = AbstractC22403o.f87638a;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC33847l theme;

    public C33838c(AbstractC22403o abstractC22403o, EnumC33847l theme) {
        AbstractC22676k.m65750j(theme, "theme");
        this.image = abstractC22403o;
        this.theme = theme;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC33847l getTheme() {
        return this.theme;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33838c)) {
            return false;
        }
        C33838c c33838c = (C33838c) other;
        return AbstractC22676k.m65745e(this.image, c33838c.image) && this.theme == c33838c.theme;
    }

    public int hashCode() {
        AbstractC22403o abstractC22403o = this.image;
        return this.theme.hashCode() + ((abstractC22403o == null ? 0 : abstractC22403o.hashCode()) * 31);
    }

    public String toString() {
        return "BackgroundState(image=" + this.image + ", theme=" + this.theme + ")";
    }

    public /* synthetic */ C33838c(AbstractC22403o abstractC22403o, EnumC33847l enumC33847l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : abstractC22403o, (i13 & 2) != 0 ? EnumC33847l.DARK : enumC33847l);
    }
}
