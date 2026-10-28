package p502ti;

import p078d1.C11457j;
import p119ej.C13224a;
import p584wi.C37302b;

/* JADX INFO: renamed from: ti.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C33833p extends AbstractC33827j {
    @Override // p502ti.AbstractC33821d
    /* JADX INFO: renamed from: f */
    public final Object mo106982f(C13224a c13224a, float f13) {
        Object obj;
        Object obj2 = c13224a.f45816b;
        C11457j c11457j = this.f141649e;
        if (c11457j == null) {
            return (f13 != 1.0f || (obj = c13224a.f45817c) == null) ? (C37302b) obj2 : (C37302b) obj;
        }
        float f14 = c13224a.f45821g;
        Float f15 = c13224a.f45822h;
        float fFloatValue = f15 == null ? Float.MAX_VALUE : f15.floatValue();
        C37302b c37302b = (C37302b) obj2;
        Object obj3 = c13224a.f45817c;
        return (C37302b) c11457j.m30731A(f14, fFloatValue, c37302b, obj3 == null ? c37302b : (C37302b) obj3, f13, m106979c(), this.f141648d);
    }
}
