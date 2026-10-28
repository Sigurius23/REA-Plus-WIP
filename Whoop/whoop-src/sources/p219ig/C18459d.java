package p219ig;

import p078d1.C11457j;
import p194hg.C17249j;
import p194hg.InterfaceC17252m;
import p194hg.InterfaceC17253n;
import p647yf.C39498k;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ig.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C18459d implements InterfaceC17252m {

    /* JADX INFO: renamed from: w */
    public final C39498k f71883w;

    /* JADX INFO: renamed from: x */
    public final String f71884x;

    public C18459d(C39498k c39498k, String prefix) {
        AbstractC22676k.m65750j(prefix, "prefix");
        this.f71883w = c39498k;
        this.f71884x = prefix;
    }

    @Override // p194hg.InterfaceC17252m
    /* JADX INFO: renamed from: e */
    public final InterfaceC17253n mo48823e(C17249j c17249j) {
        return new C11457j(this, c17249j, this.f71884x);
    }
}
