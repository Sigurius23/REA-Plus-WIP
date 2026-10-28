package mc;

import android.net.ConnectivityManager;
import ec3.AbstractC13091v;
import ec3.C13022c;
import g20.C15270p;
import nc.InterfaceC26560d;
import p218ic.C18354e;
import p420qc.C30207q;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: mc.d */
/* JADX INFO: loaded from: classes.dex */
public final class C25407d implements InterfaceC26560d {

    /* JADX INFO: renamed from: a */
    public final ConnectivityManager f99503a;

    public C25407d(ConnectivityManager connectivityManager) {
        this.f99503a = connectivityManager;
    }

    @Override // nc.InterfaceC26560d
    /* JADX INFO: renamed from: a */
    public final C13022c mo74594a(C18354e constraints) {
        AbstractC22676k.m65750j(constraints, "constraints");
        return AbstractC13091v.m36600j(new C15270p(constraints, this, (InterfaceC30057d) null, 27));
    }

    @Override // nc.InterfaceC26560d
    /* JADX INFO: renamed from: b */
    public final boolean mo74595b(C30207q workSpec) {
        AbstractC22676k.m65750j(workSpec, "workSpec");
        return workSpec.f123643j.m52856a() != null;
    }
}
