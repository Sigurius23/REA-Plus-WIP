package pc3;

import d93.InterfaceC11820a;
import i93.C18286l;
import java.util.Iterator;
import kotlinx.datetime.AbstractC22727h;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.YearMonth;

/* JADX INFO: renamed from: pc3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C29087i implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117681w;

    /* JADX INFO: renamed from: x */
    public final C18286l f117682x;

    public /* synthetic */ C29087i(C18286l c18286l, int i13) {
        this.f117681w = i13;
        this.f117682x = c18286l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f117681w) {
            case 0:
                break;
        }
        return this.f117682x.f71146y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f117681w) {
            case 0:
                C29084f c29084f = LocalDate.Companion;
                long jNextLong = this.f117682x.nextLong();
                c29084f.getClass();
                return C29084f.m88408a(jNextLong);
            default:
                return AbstractC22727h.m65801a(YearMonth.Companion, this.f117682x.nextLong());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f117681w) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
