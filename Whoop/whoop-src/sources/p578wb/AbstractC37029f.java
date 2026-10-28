package p578wb;

import hg3.AbstractC17269i;
import p500tb.InterfaceC33689c;
import p518ub.InterfaceC34728a;

/* JADX INFO: renamed from: wb.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC37029f implements InterfaceC33689c {

    /* JADX INFO: renamed from: w */
    public final InterfaceC34728a f158415w;

    /* JADX INFO: renamed from: x */
    public final String f158416x;

    /* JADX INFO: renamed from: y */
    public boolean f158417y;

    public AbstractC37029f(InterfaceC34728a interfaceC34728a, String str) {
        this.f158415w = interfaceC34728a;
        this.f158416x = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m118836b() {
        if (this.f158417y) {
            AbstractC17269i.m48901l0(21, "statement is closed");
            throw null;
        }
    }

    @Override // p500tb.InterfaceC33689c
    public void reset() {
        m118836b();
    }

    @Override // p500tb.InterfaceC33689c
    /* JADX INFO: renamed from: w */
    public void mo5360w() {
        m118836b();
    }
}
