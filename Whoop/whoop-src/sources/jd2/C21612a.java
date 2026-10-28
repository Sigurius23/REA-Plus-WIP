package jd2;

import java.util.List;
import n21.AbstractC26189c;
import p270k2.InterfaceC22131e;
import p353o0.InterfaceC27335s;
import p715kotlin.jvm.functions.Function1;
import wo1.AbstractC37467p0;

/* JADX INFO: renamed from: jd2.a */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C21612a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82951w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f82952x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f82953y;

    public /* synthetic */ C21612a(List list, int i13, long j7) {
        this.f82951w = i13;
        this.f82952x = list;
        this.f82953y = j7;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f82951w) {
            case 0:
                return AbstractC21613b.m60787k(this.f82952x, this.f82953y, (InterfaceC22131e) obj);
            case 1:
                return AbstractC26189c.m77743h(this.f82952x, this.f82953y, (InterfaceC27335s) obj);
            default:
                return AbstractC37467p0.m120084p(this.f82952x, this.f82953y, (InterfaceC22131e) obj);
        }
    }
}
