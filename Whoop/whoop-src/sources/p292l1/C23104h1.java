package p292l1;

import i93.C18284j;
import java.time.LocalDate;
import java.util.Locale;
import p316m1.C24916n;
import p316m1.C24919q;
import p316m1.C24920r;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;

/* JADX INFO: renamed from: l1.h1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23104h1 implements InterfaceC23098g1 {

    /* JADX INFO: renamed from: a */
    public final C18284j f91239a;

    /* JADX INFO: renamed from: b */
    public final Locale f91240b;

    /* JADX INFO: renamed from: c */
    public final C24919q f91241c;

    /* JADX INFO: renamed from: d */
    public final C28633k1 f91242d;

    /* JADX INFO: renamed from: e */
    public final C28633k1 f91243e;

    /* JADX INFO: renamed from: f */
    public final C28633k1 f91244f;

    /* JADX INFO: renamed from: g */
    public final C28633k1 f91245g;

    public C23104h1(Long l7, Long l12, C18284j c18284j, int i13, InterfaceC23142n3 interfaceC23142n3, Locale locale) {
        C24920r c24920rM73022e;
        this.f91239a = c18284j;
        this.f91240b = locale;
        C24919q c24919q = new C24919q(locale);
        this.f91241c = c24919q;
        this.f91242d = AbstractC28683x.m87272z(interfaceC23142n3);
        if (l12 != null) {
            c24920rM73022e = c24919q.mo73018a(l12.longValue());
            if (!c18284j.m52655e(c24920rM73022e.f97599a)) {
                C24916n c24916nMo73019b = c24919q.mo73019b();
                c24920rM73022e = c24919q.m73022e(LocalDate.of(c24916nMo73019b.f97589w, c24916nMo73019b.f97590x, 1));
            }
        } else {
            C24916n c24916nMo73019b2 = c24919q.mo73019b();
            c24920rM73022e = c24919q.m73022e(LocalDate.of(c24916nMo73019b2.f97589w, c24916nMo73019b2.f97590x, 1));
        }
        this.f91243e = AbstractC28683x.m87272z(c24920rM73022e);
        C24916n c24916n = null;
        if (l7 != null) {
            C24916n c24916nM73021d = this.f91241c.m73021d(l7.longValue());
            if (c18284j.m52655e(c24916nM73021d.f97589w)) {
                c24916n = c24916nM73021d;
            }
        }
        this.f91244f = AbstractC28683x.m87272z(c24916n);
        this.f91245g = AbstractC28683x.m87272z(new C23122k1(i13));
    }

    /* JADX INFO: renamed from: a */
    public final int m67084a() {
        return ((C23122k1) this.f91245g.getValue()).f91354a;
    }

    /* JADX INFO: renamed from: b */
    public final Long m67085b() {
        C24916n c24916n = (C24916n) this.f91244f.getValue();
        if (c24916n != null) {
            return Long.valueOf(c24916n.f97592z);
        }
        return null;
    }
}
