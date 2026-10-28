package kotlinx.datetime;

import i93.InterfaceC18281g;
import pc3.AbstractC29086h;

/* JADX INFO: renamed from: kotlinx.datetime.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C22726g extends AbstractC29086h implements InterfaceC18281g {

    /* JADX INFO: renamed from: z */
    public static final C22726g f89403z = new C22726g(new LocalDate(1970, 1, 2), new LocalDate(1970, 1, 1));

    @Override // i93.InterfaceC18281g
    /* JADX INFO: renamed from: d */
    public final Comparable mo52651d() {
        return this.f117680y;
    }

    @Override // i93.InterfaceC18281g
    public final Comparable getStart() {
        return this.f117679x;
    }

    @Override // java.util.Collection, i93.InterfaceC18281g
    public final boolean isEmpty() {
        return this.f117679x.compareTo(this.f117680y) > 0;
    }

    public final String toString() {
        return this.f117679x + ".." + this.f117680y;
    }
}
