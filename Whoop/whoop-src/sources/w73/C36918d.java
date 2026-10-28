package w73;

import l73.AbstractC23412c;
import l73.InterfaceC23413d;
import q30.C29934u0;
import q73.EnumC30025d;

/* JADX INFO: renamed from: w73.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C36918d extends AbstractC23412c {

    /* JADX INFO: renamed from: w */
    public final AbstractC23412c[] f157971w;

    /* JADX INFO: renamed from: x */
    public final C29934u0 f157972x;

    /* JADX INFO: renamed from: y */
    public final int f157973y;

    public C36918d(AbstractC23412c[] abstractC23412cArr, C29934u0 c29934u0, int i13) {
        this.f157971w = abstractC23412cArr;
        this.f157972x = c29934u0;
        this.f157973y = i13;
    }

    @Override // l73.AbstractC23412c
    /* JADX INFO: renamed from: d */
    public final void mo43873d(InterfaceC23413d interfaceC23413d) {
        AbstractC23412c[] abstractC23412cArr = this.f157971w;
        int length = abstractC23412cArr.length;
        if (length == 0) {
            interfaceC23413d.mo13591b(EnumC30025d.f122538w);
            interfaceC23413d.onComplete();
            return;
        }
        C36917c c36917c = new C36917c(interfaceC23413d, this.f157972x, length, this.f157973y);
        C36916b[] c36916bArr = c36917c.f157969y;
        int length2 = c36916bArr.length;
        c36917c.f157967w.mo13591b(c36917c);
        for (int i13 = 0; i13 < length2 && !c36917c.f157963G && !c36917c.f157962F; i13++) {
            abstractC23412cArr[i13].m67905c(c36916bArr[i13]);
        }
    }
}
