package eu;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import e10.C12554k0;
import hb3.AbstractC17104a0;
import java.util.ArrayList;
import java.util.Iterator;
import p002a0.C0006a1;
import p375op.AbstractC28076h;
import p530up.BinderC35149e;
import p530up.C35146b;
import p530up.C35147c;
import p558vp.C36261e;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eu.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C13635v extends AbstractC17104a0 {

    /* JADX INFO: renamed from: E */
    public final C35146b f48320E;

    /* JADX INFO: renamed from: F */
    public final ArrayList f48321F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13635v(C35146b map, C35147c mapView) {
        super(C13638y.f48329a);
        AbstractC22676k.m65750j(map, "map");
        AbstractC22676k.m65750j(mapView, "mapView");
        this.f48320E = map;
        this.f48321F = new ArrayList();
        C13634u c13634u = new C13634u(this);
        C36261e c36261e = map.f149130a;
        try {
            BinderC35149e binderC35149e = new BinderC35149e(c13634u);
            Parcel parcelM57322k0 = c36261e.m57322k0();
            AbstractC28076h.m84852d(parcelM57322k0, binderC35149e);
            c36261e.m57323l0(parcelM57322k0, 89);
            try {
                BinderC35149e binderC35149e2 = new BinderC35149e(new C13634u(this), (byte) 0, false);
                Parcel parcelM57322k1 = c36261e.m57322k0();
                AbstractC28076h.m84852d(parcelM57322k1, binderC35149e2);
                c36261e.m57323l0(parcelM57322k1, 83);
                try {
                    BinderC35149e binderC35149e3 = new BinderC35149e(new C13634u(this), (byte) 0, (byte) 0);
                    Parcel parcelM57322k2 = c36261e.m57322k0();
                    AbstractC28076h.m84852d(parcelM57322k2, binderC35149e3);
                    c36261e.m57323l0(parcelM57322k2, 85);
                    try {
                        BinderC35149e binderC35149e4 = new BinderC35149e(new C13634u(this), (byte) 0, (char) 0);
                        Parcel parcelM57322k3 = c36261e.m57322k0();
                        AbstractC28076h.m84852d(parcelM57322k3, binderC35149e4);
                        c36261e.m57323l0(parcelM57322k3, 87);
                        try {
                            BinderC35149e binderC35149e5 = new BinderC35149e(new C13634u(this), (byte) 0);
                            Parcel parcelM57322k4 = c36261e.m57322k0();
                            AbstractC28076h.m84852d(parcelM57322k4, binderC35149e5);
                            c36261e.m57323l0(parcelM57322k4, 30);
                            try {
                                BinderC35149e binderC35149e6 = new BinderC35149e(new C13634u(this), (char) 0);
                                Parcel parcelM57322k5 = c36261e.m57322k0();
                                AbstractC28076h.m84852d(parcelM57322k5, binderC35149e6);
                                c36261e.m57323l0(parcelM57322k5, 32);
                                try {
                                    BinderC35149e binderC35149e7 = new BinderC35149e(new C13634u(this), (short) 0);
                                    Parcel parcelM57322k6 = c36261e.m57322k0();
                                    AbstractC28076h.m84852d(parcelM57322k6, binderC35149e7);
                                    c36261e.m57323l0(parcelM57322k6, 86);
                                    try {
                                        BinderC35149e binderC35149e8 = new BinderC35149e(new C13634u(this), 0);
                                        Parcel parcelM57322k7 = c36261e.m57322k0();
                                        AbstractC28076h.m84852d(parcelM57322k7, binderC35149e8);
                                        c36261e.m57323l0(parcelM57322k7, 84);
                                        try {
                                            BinderC35149e binderC35149e9 = new BinderC35149e(new C12554k0(this, 7));
                                            Parcel parcelM57322k8 = c36261e.m57322k0();
                                            AbstractC28076h.m84852d(parcelM57322k8, binderC35149e9);
                                            c36261e.m57323l0(parcelM57322k8, 31);
                                            try {
                                                BinderC35149e binderC35149e10 = new BinderC35149e(new C38445a(mapView, new C0006a1(this, 20)));
                                                Parcel parcelM57322k9 = c36261e.m57322k0();
                                                AbstractC28076h.m84852d(parcelM57322k9, binderC35149e10);
                                                c36261e.m57323l0(parcelM57322k9, 33);
                                            } catch (RemoteException e5) {
                                                throw new RuntimeRemoteException(e5);
                                            }
                                        } catch (RemoteException e13) {
                                            throw new RuntimeRemoteException(e13);
                                        }
                                    } catch (RemoteException e14) {
                                        throw new RuntimeRemoteException(e14);
                                    }
                                } catch (RemoteException e15) {
                                    throw new RuntimeRemoteException(e15);
                                }
                            } catch (RemoteException e16) {
                                throw new RuntimeRemoteException(e16);
                            }
                        } catch (RemoteException e17) {
                            throw new RuntimeRemoteException(e17);
                        }
                    } catch (RemoteException e18) {
                        throw new RuntimeRemoteException(e18);
                    }
                } catch (RemoteException e19) {
                    throw new RuntimeRemoteException(e19);
                }
            } catch (RemoteException e22) {
                throw new RuntimeRemoteException(e22);
            }
        } catch (RemoteException e24) {
            throw new RuntimeRemoteException(e24);
        }
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: e */
    public final void mo700e(int i13, int i14, int i15) {
        AbstractC17104a0.m48351c(this.f48321F, i13, i14, i15);
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: f */
    public final void mo701f(int i13, int i14) {
        ArrayList arrayList;
        int i15 = 0;
        while (true) {
            arrayList = this.f48321F;
            if (i15 >= i14) {
                break;
            }
            ((InterfaceC13637x) arrayList.get(i13 + i15)).mo38427c();
            i15++;
        }
        if (i14 == 1) {
            arrayList.remove(i13);
        } else {
            arrayList.subList(i13, i14 + i13).clear();
        }
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: g */
    public final void mo702g(int i13, Object obj) {
        InterfaceC13637x instance = (InterfaceC13637x) obj;
        AbstractC22676k.m65750j(instance, "instance");
    }

    @Override // hb3.AbstractC17104a0
    /* JADX INFO: renamed from: j */
    public final void mo752j() {
        C35146b c35146b = this.f48320E;
        c35146b.getClass();
        try {
            C36261e c36261e = c35146b.f149130a;
            c36261e.m57323l0(c36261e.m57322k0(), 14);
            ArrayList arrayList = this.f48321F;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC13637x) it.next()).mo38426b();
            }
            arrayList.clear();
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    @Override // p390p1.InterfaceC28599c
    /* JADX INFO: renamed from: k */
    public final void mo705k(int i13, Object obj) {
        InterfaceC13637x instance = (InterfaceC13637x) obj;
        AbstractC22676k.m65750j(instance, "instance");
        this.f48321F.add(i13, instance);
        instance.mo38425a();
    }
}
