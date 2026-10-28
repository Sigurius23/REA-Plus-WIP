package eu;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.whoop.integrations.view.IntegrationsFragment;
import com.whoop.membership.extensions.view.MembershipExtensionsFragment;
import js2.AbstractC21931i;
import l83.InterfaceC23462h;
import p072cp.C10936c;
import p072cp.C10938e;
import p127ev.C13668i;
import p184h5.C16894n;
import p184h5.InterfaceC16897o;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p530up.C35147c;
import p558vp.C36262f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import q81.AbstractC30043a;
import q81.C30044b;

/* JADX INFO: renamed from: eu.k */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C13620k implements InterfaceC1577e0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48240w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f48241x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f48242y;

    public /* synthetic */ C13620k(int i13, Object obj, Object obj2) {
        this.f48240w = i13;
        this.f48241x = obj;
        this.f48242y = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC1577e0
    /* JADX INFO: renamed from: h */
    public final void mo4080h(InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        switch (this.f48240w) {
            case 0:
                InterfaceC28601c1 previousState = (InterfaceC28601c1) this.f48241x;
                C35147c this_lifecycleObserver = (C35147c) this.f48242y;
                AbstractC22676k.m65750j(previousState, "$previousState");
                AbstractC22676k.m65750j(this_lifecycleObserver, "$this_lifecycleObserver");
                C13668i c13668i = this_lifecycleObserver.f149132w;
                AbstractC22676k.m65750j(interfaceC1585g0, "<anonymous parameter 0>");
                AbstractC22676k.m65750j(event, "event");
                event.m5039a();
                switch (AbstractC13631r.f48316a[event.ordinal()]) {
                    case 1:
                        if (previousState.getValue() != EnumC1632v.ON_STOP) {
                            Bundle bundle = new Bundle();
                            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
                            try {
                                c13668i.getClass();
                                c13668i.m38543o(bundle, new C10936c(c13668i, bundle));
                                if (((C29938w0) c13668i.f48454a) == null) {
                                    C13668i.m38529l(this_lifecycleObserver);
                                }
                                StrictMode.setThreadPolicy(threadPolicy);
                            } catch (Throwable th3) {
                                StrictMode.setThreadPolicy(threadPolicy);
                                throw th3;
                            }
                        }
                        break;
                    case 2:
                        c13668i.getClass();
                        c13668i.m38543o(null, new C10938e(c13668i, 0));
                        break;
                    case 3:
                        c13668i.getClass();
                        c13668i.m38543o(null, new C10938e(c13668i, 1));
                        break;
                    case 4:
                        C29938w0 c29938w0 = (C29938w0) c13668i.f48454a;
                        if (c29938w0 == null) {
                            c13668i.m38542n(5);
                        } else {
                            try {
                                C36262f c36262f = (C36262f) c29938w0.f122261y;
                                c36262f.m57323l0(c36262f.m57322k0(), 4);
                            } catch (RemoteException e5) {
                                throw new RuntimeRemoteException(e5);
                            }
                        }
                        break;
                    case 5:
                        C29938w0 c29938w1 = (C29938w0) c13668i.f48454a;
                        if (c29938w1 == null) {
                            c13668i.m38542n(4);
                        } else {
                            try {
                                C36262f c36262f2 = (C36262f) c29938w1.f122261y;
                                c36262f2.m57323l0(c36262f2.m57322k0(), 13);
                            } catch (RemoteException e13) {
                                throw new RuntimeRemoteException(e13);
                            }
                        }
                        break;
                    case 6:
                        C29938w0 c29938w2 = (C29938w0) c13668i.f48454a;
                        if (c29938w2 == null) {
                            c13668i.m38542n(1);
                        } else {
                            try {
                                C36262f c36262f3 = (C36262f) c29938w2.f122261y;
                                c36262f3.m57323l0(c36262f3.m57322k0(), 5);
                            } catch (RemoteException e14) {
                                throw new RuntimeRemoteException(e14);
                            }
                        }
                        break;
                    default:
                        throw new IllegalStateException();
                }
                previousState.setValue(event);
                return;
            case 1:
                C16894n c16894n = (C16894n) this.f48241x;
                InterfaceC16897o interfaceC16897o = (InterfaceC16897o) this.f48242y;
                c16894n.getClass();
                if (event == EnumC1632v.ON_DESTROY) {
                    c16894n.m47564b(interfaceC16897o);
                    return;
                }
                return;
            case 2:
                IntegrationsFragment.m22263W((IntegrationsFragment) this.f48241x, (InterfaceC28670t2) this.f48242y, interfaceC1585g0, event);
                return;
            case 3:
                AbstractC21931i.m62481u((InterfaceC28670t2) this.f48241x, (InterfaceC28670t2) this.f48242y, interfaceC1585g0, event);
                return;
            case 4:
                AbstractC21931i.m62483w((Context) this.f48241x, (InterfaceC23462h) this.f48242y, interfaceC1585g0, event);
                return;
            case 5:
                MembershipExtensionsFragment.m22702u0((MembershipExtensionsFragment) this.f48241x, (InterfaceC28670t2) this.f48242y, interfaceC1585g0, event);
                return;
            default:
                AbstractC30043a.m91997q((C30044b) this.f48242y, (InterfaceC28601c1) this.f48241x, interfaceC1585g0, event);
                return;
        }
    }

    public /* synthetic */ C13620k(C30044b c30044b, InterfaceC28601c1 interfaceC28601c1) {
        this.f48240w = 6;
        this.f48242y = c30044b;
        this.f48241x = interfaceC28601c1;
    }
}
