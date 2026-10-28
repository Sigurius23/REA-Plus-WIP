package eu;

import android.os.Parcel;
import android.os.RemoteException;
import bc3.C3023j1;
import bc3.C3033m;
import bc3.InterfaceC3027k1;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import e10.C12554k0;
import ge3.AbstractC15751g;
import l83.C23454a0;
import p026b2.C2320z;
import p072cp.InterfaceC10934a;
import p309lo.C24560r;
import p375op.AbstractC28076h;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p505ts.AbstractC34132o;
import p529uo.AbstractC35135w;
import p530up.BinderC35149e;
import p530up.C35145a;
import p530up.C35146b;
import p558vp.C36261e;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s30.AbstractC32103e;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: eu.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C13612g {

    /* JADX INFO: renamed from: h */
    public static final C28539n0 f48186h = new C28539n0(10, C13602b.f48128x, C13604c.f48149x);

    /* JADX INFO: renamed from: a */
    public final C28633k1 f48187a;

    /* JADX INFO: renamed from: b */
    public final C28633k1 f48188b;

    /* JADX INFO: renamed from: c */
    public final C28633k1 f48189c;

    /* JADX INFO: renamed from: d */
    public final Object f48190d;

    /* JADX INFO: renamed from: e */
    public C35146b f48191e;

    /* JADX INFO: renamed from: f */
    public InterfaceC13606d f48192f;

    /* JADX INFO: renamed from: g */
    public InterfaceC3027k1 f48193g;

    public C13612g(CameraPosition position) {
        AbstractC22676k.m65750j(position, "position");
        this.f48187a = AbstractC28683x.m87272z(Boolean.FALSE);
        this.f48188b = AbstractC28683x.m87272z(EnumC13600a.NO_MOVEMENT_YET);
        this.f48189c = AbstractC28683x.m87272z(position);
        this.f48190d = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static final void m38429a(C13612g c13612g, C35146b c35146b, C35145a c35145a, int i13, C3033m c3033m) {
        c13612g.getClass();
        C13610f c13610f = new C13610f(c3033m, 0);
        if (i13 == Integer.MAX_VALUE) {
            c35146b.getClass();
            try {
                AbstractC35135w.m111095g(c35145a, "CameraUpdate must not be null.");
                C36261e c36261e = c35146b.f149130a;
                InterfaceC10934a interfaceC10934a = c35145a.f149129a;
                BinderC35149e binderC35149e = new BinderC35149e(c13610f);
                Parcel parcelM57322k0 = c36261e.m57322k0();
                AbstractC28076h.m84852d(parcelM57322k0, interfaceC10934a);
                AbstractC28076h.m84852d(parcelM57322k0, binderC35149e);
                c36261e.m57323l0(parcelM57322k0, 6);
            } catch (RemoteException e5) {
                throw new RuntimeRemoteException(e5);
            }
        } else {
            c35146b.getClass();
            try {
                AbstractC35135w.m111095g(c35145a, "CameraUpdate must not be null.");
                C36261e c36261e2 = c35146b.f149130a;
                InterfaceC10934a interfaceC10934a2 = c35145a.f149129a;
                BinderC35149e binderC35149e2 = new BinderC35149e(c13610f);
                Parcel parcelM57322k1 = c36261e2.m57322k0();
                AbstractC28076h.m84852d(parcelM57322k1, interfaceC10934a2);
                parcelM57322k1.writeInt(i13);
                AbstractC28076h.m84852d(parcelM57322k1, binderC35149e2);
                c36261e2.m57323l0(parcelM57322k1, 7);
            } catch (RemoteException e13) {
                throw new RuntimeRemoteException(e13);
            }
        }
        C12554k0 c12554k0 = new C12554k0(c35146b, 6);
        InterfaceC13606d interfaceC13606d = c13612g.f48192f;
        if (interfaceC13606d != null) {
            interfaceC13606d.mo35231d();
        }
        c13612g.f48192f = c12554k0;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009a A[Catch: all -> 0x00a4, TryCatch #1 {, blocks: (B:38:0x0096, B:40:0x009a, B:42:0x00a0), top: B:69:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #1 {, blocks: (B:38:0x0096, B:40:0x009a, B:42:0x00a0), top: B:69:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[Catch: all -> 0x00c6, TryCatch #2 {, blocks: (B:57:0x00b8, B:59:0x00bc, B:61:0x00c2), top: B:71:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2 A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #2 {, blocks: (B:57:0x00b8, B:59:0x00bc, B:61:0x00c2), top: B:71:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m38430b(C35145a c35145a, int i13, AbstractC32269c abstractC32269c) throws Throwable {
        C13608e c13608e;
        Throwable th3;
        InterfaceC3027k1 interfaceC3027k1;
        C13612g c13612g;
        C35146b c35146b;
        C35146b c35146b2;
        if (abstractC32269c instanceof C13608e) {
            c13608e = (C13608e) abstractC32269c;
            int i14 = c13608e.f48166E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c13608e.f48166E = i14 - Integer.MIN_VALUE;
            } else {
                c13608e = new C13608e(this, abstractC32269c);
            }
        } else {
            c13608e = new C13608e(this, abstractC32269c);
        }
        Object obj = c13608e.f48169y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c13608e.f48166E;
        if (i15 != 0) {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC3027k1 = c13608e.f48168x;
            c13612g = c13608e.f48167w;
            try {
                AbstractC34132o.m107864I(obj);
                synchronized (c13612g.f48190d) {
                    if (interfaceC3027k1 != null) {
                        if (c13612g.f48193g == interfaceC3027k1) {
                            c13612g.f48193g = null;
                            c35146b2 = c13612g.f48191e;
                            if (c35146b2 != null) {
                                c35146b2.m111149d();
                            }
                        }
                    }
                }
                return C23454a0.f92919a;
            } catch (Throwable th4) {
                th3 = th4;
                synchronized (c13612g.f48190d) {
                    if (interfaceC3027k1 != null) {
                        if (c13612g.f48193g == interfaceC3027k1) {
                            c13612g.f48193g = null;
                            c35146b = c13612g.f48191e;
                            if (c35146b != null) {
                                c35146b.m111149d();
                            }
                        }
                    }
                    throw th3;
                }
            }
        }
        AbstractC34132o.m107864I(obj);
        InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) c13608e.getContext().get(C3023j1.f12041w);
        try {
            c13608e.f48167w = this;
            c13608e.f48168x = interfaceC3027k2;
            c13608e.f48166E = 1;
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c13608e));
            c3033m.m8774s();
            synchronized (this.f48190d) {
                try {
                    this.f48193g = interfaceC3027k2;
                    C35146b c35146b3 = this.f48191e;
                    if (c35146b3 == null) {
                        C24560r c24560r = new C24560r();
                        c24560r.f95855y = c3033m;
                        c24560r.f95856z = this;
                        c24560r.f95853w = c35145a;
                        c24560r.f95854x = i13;
                        InterfaceC13606d interfaceC13606d = this.f48192f;
                        if (interfaceC13606d != null) {
                            interfaceC13606d.mo35231d();
                        }
                        this.f48192f = c24560r;
                        c3033m.m8776u(new C2320z(9, this, c24560r));
                    } else {
                        m38429a(this, c35146b3, c35145a, i13, c3033m);
                    }
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            if (c3033m.m8773r() == enumC31071a) {
                return enumC31071a;
            }
            c13612g = this;
            interfaceC3027k1 = interfaceC3027k2;
            synchronized (c13612g.f48190d) {
                if (interfaceC3027k1 != null) {
                    if (c13612g.f48193g == interfaceC3027k1) {
                        c13612g.f48193g = null;
                        c35146b2 = c13612g.f48191e;
                        if (c35146b2 != null) {
                            c35146b2.m111149d();
                        }
                    }
                }
                return C23454a0.f92919a;
            }
        } catch (Throwable th6) {
            th3 = th6;
            interfaceC3027k1 = interfaceC3027k2;
            c13612g = this;
            synchronized (c13612g.f48190d) {
                if (interfaceC3027k1 != null) {
                    if (c13612g.f48193g == interfaceC3027k1) {
                        c13612g.f48193g = null;
                        c35146b = c13612g.f48191e;
                        if (c35146b != null) {
                            c35146b.m111149d();
                        }
                    }
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m38431c(C35146b c35146b) {
        synchronized (this.f48190d) {
            try {
                C35146b c35146b2 = this.f48191e;
                if (c35146b2 == null && c35146b == null) {
                    return;
                }
                if (c35146b2 != null && c35146b != null) {
                    throw new IllegalStateException("CameraPositionState may only be associated with one GoogleMap at a time");
                }
                this.f48191e = c35146b;
                if (c35146b == null) {
                    this.f48187a.setValue(Boolean.FALSE);
                } else {
                    c35146b.m111148c(AbstractC32103e.m99889k((CameraPosition) this.f48189c.getValue()));
                }
                InterfaceC13606d interfaceC13606d = this.f48192f;
                if (interfaceC13606d != null) {
                    this.f48192f = null;
                    interfaceC13606d.mo35232f(c35146b);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m38432d(CameraPosition cameraPosition) {
        synchronized (this.f48190d) {
            C35146b c35146b = this.f48191e;
            if (c35146b == null) {
                this.f48189c.setValue(cameraPosition);
            } else {
                c35146b.m111148c(AbstractC32103e.m99889k(cameraPosition));
            }
        }
    }

    public /* synthetic */ C13612g() {
        this(new CameraPosition(new LatLng(0.0d, 0.0d), 0.0f, 0.0f, 0.0f));
    }
}
