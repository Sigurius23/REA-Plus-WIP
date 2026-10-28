package kotlinx.datetime;

import i93.InterfaceC18281g;
import pc3.AbstractC29100v;

/* JADX INFO: renamed from: kotlinx.datetime.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C22728i extends AbstractC29100v implements InterfaceC18281g {

    /* JADX INFO: renamed from: z */
    public static final C22728i f89404z = new C22728i(new YearMonth(0, 2), new YearMonth(0, 1));

    @Override // i93.InterfaceC18281g
    /* JADX INFO: renamed from: d */
    public final Comparable mo52651d() {
        return this.f117696y;
    }

    @Override // i93.InterfaceC18281g
    public final Comparable getStart() {
        return this.f117695x;
    }

    @Override // java.util.Collection, i93.InterfaceC18281g
    public final boolean isEmpty() {
        return this.f117695x.compareTo(this.f117696y) > 0;
    }

    public final String toString() {
        return this.f117695x + ".." + this.f117696y;
    }
}
