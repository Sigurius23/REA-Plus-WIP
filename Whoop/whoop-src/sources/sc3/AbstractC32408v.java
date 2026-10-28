package sc3;

import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import tc3.C33699a;
import uc3.C34774l;

/* JADX INFO: renamed from: sc3.v */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC32408v implements InterfaceC32396j {

    /* JADX INFO: renamed from: a */
    public final C32407u f134158a;

    /* JADX INFO: renamed from: b */
    public final int f134159b;

    /* JADX INFO: renamed from: c */
    public final Integer f134160c;

    /* JADX INFO: renamed from: d */
    public final int f134161d;

    public AbstractC32408v(C32407u field, int i13, Integer num) {
        AbstractC22676k.m65750j(field, "field");
        this.f134158a = field;
        this.f134159b = i13;
        this.f134160c = num;
        int i14 = field.f134157e;
        this.f134161d = i14;
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "The minimum number of digits (", ") is negative").toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i14 + ") is less than the minimum number of digits (" + i13 + ')').toString());
        }
        if (num == null || num.intValue() > i13) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i13 + ')').toString());
    }

    @Override // sc3.InterfaceC32396j
    /* JADX INFO: renamed from: a */
    public final C33699a mo92507a() {
        C32404r c32404r = this.f134158a.f134153a;
        C33699a c33699a = new C33699a();
        int i13 = this.f134159b;
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "The minimum number of digits (", ") is negative").toString());
        }
        if (i13 <= 9) {
            return this.f134160c != null ? new C33699a() : c33699a;
        }
        throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "The minimum number of digits (", ") exceeds the length of an Int").toString());
    }

    @Override // sc3.InterfaceC32396j
    /* JADX INFO: renamed from: b */
    public final C34774l mo92508b() {
        Integer numValueOf = Integer.valueOf(this.f134159b);
        Integer numValueOf2 = Integer.valueOf(this.f134161d);
        C32407u c32407u = this.f134158a;
        return AbstractC32398l.m100977j(numValueOf, numValueOf2, this.f134160c, c32407u.f134153a, c32407u.f134154b, false);
    }

    @Override // sc3.InterfaceC32396j
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC32387a mo92509c() {
        return this.f134158a;
    }
}
