package p013ah;

import java.util.Objects;

/* JADX INFO: renamed from: ah.k */
/* JADX INFO: loaded from: classes6.dex */
public class C0876k extends AbstractC0869d {

    /* JADX INFO: renamed from: d */
    public static final C0876k f3174d = new C0876k(EnumC0877l.f3178G);

    /* JADX INFO: renamed from: c */
    public final EnumC0877l f3175c;

    public C0876k(EnumC0877l enumC0877l) {
        super(9);
        this.f3175c = enumC0877l;
    }

    @Override // p013ah.AbstractC0869d
    public boolean equals(Object obj) {
        if (obj instanceof C0876k) {
            C0876k c0876k = (C0876k) obj;
            if (super.equals(obj) && this.f3175c == c0876k.f3175c) {
                return true;
            }
        }
        return false;
    }

    @Override // p013ah.AbstractC0869d
    public int hashCode() {
        return super.hashCode() ^ Objects.hashCode(this.f3175c);
    }

    public String toString() {
        return this.f3175c.name();
    }
}
