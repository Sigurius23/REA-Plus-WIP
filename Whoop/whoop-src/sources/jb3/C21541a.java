package jb3;

import c93.InterfaceC4339a;
import j93.InterfaceC21493z;
import java.util.Iterator;
import java.util.List;
import kb3.C22340i;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import pf.AbstractC29125c;
import s93.AbstractC32306h;
import s93.InterfaceC32300b;
import s93.InterfaceC32307i;
import va3.C35847e;

/* JADX INFO: renamed from: jb3.a */
/* JADX INFO: loaded from: classes5.dex */
public class C21541a implements InterfaceC32307i {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ InterfaceC21493z[] f82613x = {AbstractC22671h0.f89337a.property1(new C22693x(C21541a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: w */
    public final C22340i f82614w;

    public C21541a(InterfaceC22345n storageManager, InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(storageManager, "storageManager");
        this.f82614w = new C22340i((C22342k) storageManager, interfaceC4339a);
    }

    @Override // s93.InterfaceC32307i
    /* JADX INFO: renamed from: J */
    public final /* bridge */ boolean mo52688J(C35847e c35847e) {
        return AbstractC32306h.m100567p(this, c35847e);
    }

    @Override // s93.InterfaceC32307i
    /* JADX INFO: renamed from: T */
    public final /* bridge */ InterfaceC32300b mo52689T(C35847e c35847e) {
        return AbstractC32306h.m100565n(this, c35847e);
    }

    @Override // s93.InterfaceC32307i
    public boolean isEmpty() {
        return ((List) AbstractC29125c.m88494C(this.f82614w, f82613x[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) AbstractC29125c.m88494C(this.f82614w, f82613x[0])).iterator();
    }
}
