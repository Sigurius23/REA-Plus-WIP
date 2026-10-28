package eu;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import e10.C12554k0;
import p375op.AbstractC28076h;
import p530up.BinderC35149e;
import p530up.C35146b;
import p558vp.C36261e;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: eu.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C13603b0 implements InterfaceC13637x {

    /* JADX INFO: renamed from: a */
    public final C35146b f48132a;

    /* JADX INFO: renamed from: b */
    public C13636w f48133b;

    /* JADX INFO: renamed from: c */
    public InterfaceC39171c f48134c;

    /* JADX INFO: renamed from: d */
    public EnumC39181m f48135d;

    /* JADX INFO: renamed from: e */
    public C13612g f48136e;

    public C13603b0(C35146b map, C13612g cameraPositionState, C13636w clickListeners, InterfaceC39171c density, EnumC39181m layoutDirection) {
        AbstractC22676k.m65750j(map, "map");
        AbstractC22676k.m65750j(cameraPositionState, "cameraPositionState");
        AbstractC22676k.m65750j(clickListeners, "clickListeners");
        AbstractC22676k.m65750j(density, "density");
        AbstractC22676k.m65750j(layoutDirection, "layoutDirection");
        this.f48132a = map;
        this.f48133b = clickListeners;
        this.f48134c = density;
        this.f48135d = layoutDirection;
        cameraPositionState.m38431c(map);
        this.f48136e = cameraPositionState;
    }

    @Override // eu.InterfaceC13637x
    /* JADX INFO: renamed from: a */
    public final void mo38425a() {
        C13601a0 c13601a0 = new C13601a0(this);
        C35146b c35146b = this.f48132a;
        C36261e c36261e = c35146b.f149130a;
        C36261e c36261e2 = c35146b.f149130a;
        try {
            BinderC35149e binderC35149e = new BinderC35149e(c13601a0);
            Parcel parcelM57322k0 = c36261e.m57322k0();
            AbstractC28076h.m84852d(parcelM57322k0, binderC35149e);
            c36261e.m57323l0(parcelM57322k0, 99);
            try {
                BinderC35149e binderC35149e2 = new BinderC35149e(new C13601a0(this), (byte) 0, 0);
                Parcel parcelM57322k1 = c36261e2.m57322k0();
                AbstractC28076h.m84852d(parcelM57322k1, binderC35149e2);
                c36261e2.m57323l0(parcelM57322k1, 98);
                try {
                    BinderC35149e binderC35149e3 = new BinderC35149e(new C13601a0(this), (byte) 0, (byte) 0);
                    Parcel parcelM57322k2 = c36261e2.m57322k0();
                    AbstractC28076h.m84852d(parcelM57322k2, binderC35149e3);
                    c36261e2.m57323l0(parcelM57322k2, 96);
                    try {
                        BinderC35149e binderC35149e4 = new BinderC35149e(new C13601a0(this), (byte) 0, (char) 0);
                        Parcel parcelM57322k3 = c36261e2.m57322k0();
                        AbstractC28076h.m84852d(parcelM57322k3, binderC35149e4);
                        c36261e2.m57323l0(parcelM57322k3, 97);
                        try {
                            BinderC35149e binderC35149e5 = new BinderC35149e(new C13601a0(this), (byte) 0, (short) 0);
                            Parcel parcelM57322k4 = c36261e2.m57322k0();
                            AbstractC28076h.m84852d(parcelM57322k4, binderC35149e5);
                            c36261e2.m57323l0(parcelM57322k4, 28);
                            try {
                                BinderC35149e binderC35149e6 = new BinderC35149e(new C13601a0(this), (byte) 0);
                                Parcel parcelM57322k5 = c36261e2.m57322k0();
                                AbstractC28076h.m84852d(parcelM57322k5, binderC35149e6);
                                c36261e2.m57323l0(parcelM57322k5, 29);
                                try {
                                    BinderC35149e binderC35149e7 = new BinderC35149e(new C13601a0(this), (short) 0);
                                    Parcel parcelM57322k6 = c36261e2.m57322k0();
                                    AbstractC28076h.m84852d(parcelM57322k6, binderC35149e7);
                                    c36261e2.m57323l0(parcelM57322k6, 42);
                                    try {
                                        BinderC35149e binderC35149e8 = new BinderC35149e(new C13601a0(this), (char) 0);
                                        Parcel parcelM57322k7 = c36261e2.m57322k0();
                                        AbstractC28076h.m84852d(parcelM57322k7, binderC35149e8);
                                        c36261e2.m57323l0(parcelM57322k7, 37);
                                        try {
                                            BinderC35149e binderC35149e9 = new BinderC35149e(new C13601a0(this), 0);
                                            Parcel parcelM57322k8 = c36261e2.m57322k0();
                                            AbstractC28076h.m84852d(parcelM57322k8, binderC35149e9);
                                            c36261e2.m57323l0(parcelM57322k8, 107);
                                            try {
                                                BinderC35149e binderC35149e10 = new BinderC35149e(new C13601a0(this), (byte) 0, false);
                                                Parcel parcelM57322k9 = c36261e2.m57322k0();
                                                AbstractC28076h.m84852d(parcelM57322k9, binderC35149e10);
                                                c36261e2.m57323l0(parcelM57322k9, 80);
                                                try {
                                                    BinderC35149e binderC35149e11 = new BinderC35149e(new C12554k0(this, 8), (byte) 0);
                                                    Parcel parcelM57322k10 = c36261e2.m57322k0();
                                                    AbstractC28076h.m84852d(parcelM57322k10, binderC35149e11);
                                                    c36261e2.m57323l0(parcelM57322k10, 45);
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
        } catch (RemoteException e25) {
            throw new RuntimeRemoteException(e25);
        }
    }

    @Override // eu.InterfaceC13637x
    /* JADX INFO: renamed from: b */
    public final void mo38426b() {
        this.f48136e.m38431c(null);
    }

    @Override // eu.InterfaceC13637x
    /* JADX INFO: renamed from: c */
    public final void mo38427c() {
        this.f48136e.m38431c(null);
    }
}
