package p013ah;

/* JADX INFO: renamed from: ah.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC0868c extends AbstractC0869d {

    /* JADX INFO: renamed from: c */
    public boolean f3160c;

    public AbstractC0868c(int i13) {
        super(i13);
        this.f3160c = false;
    }

    @Override // p013ah.AbstractC0869d
    public boolean equals(Object obj) {
        if (obj instanceof AbstractC0868c) {
            return super.equals(obj) && this.f3160c == ((AbstractC0868c) obj).f3160c;
        }
        return false;
    }

    @Override // p013ah.AbstractC0869d
    public int hashCode() {
        return super.hashCode() ^ Boolean.valueOf(this.f3160c).hashCode();
    }
}
