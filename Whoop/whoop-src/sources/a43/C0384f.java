package a43;

import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.AbstractC3069w1;
import c53.C4255a;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import l83.C23470p;
import m83.C25235a0;
import p000.C12473e;
import p003a1.C0109h;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import t33.AbstractC33529a;

/* JADX INFO: renamed from: a43.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C0384f implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E */
    public Object f1325E;

    /* JADX INFO: renamed from: F */
    public final AtomicBoolean f1326F;

    /* JADX INFO: renamed from: w */
    public final C4255a f1327w;

    /* JADX INFO: renamed from: x */
    public final AbstractC1638x f1328x;

    /* JADX INFO: renamed from: y */
    public final C23470p f1329y;

    /* JADX INFO: renamed from: z */
    public boolean f1330z;

    public C0384f(C4255a c4255a, AbstractC1638x lifecycle) {
        AbstractC22676k.m65750j(lifecycle, "lifecycle");
        this.f1327w = c4255a;
        this.f1328x = lifecycle;
        this.f1329y = AbstractC1772c1.m5382S(this, "Video:LifecycleObserver");
        this.f1325E = C25235a0.f99113w;
        this.f1326F = new AtomicBoolean(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: a */
    public final Object m1051a(InterfaceC0380b interfaceC0380b, AbstractC32269c abstractC32269c) {
        Object objM8705K;
        LinkedHashSet linkedHashSetM34604y = AbstractC12350b.m34604y(interfaceC0380b, this.f1325E);
        this.f1325E = linkedHashSetM34604y;
        return (linkedHashSetM34604y.isEmpty() && this.f1326F.compareAndSet(true, false) && (objM8705K = AbstractC3006f0.m8705K(AbstractC33529a.f139956a, new C0382d(this, null, 0), abstractC32269c)) == EnumC31071a.f128113w) ? objM8705K : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: b */
    public final Object m1052b(InterfaceC0380b interfaceC0380b, AbstractC32269c abstractC32269c) {
        C0383e c0383e;
        C0384f c0384f;
        if (abstractC32269c instanceof C0383e) {
            c0383e = (C0383e) abstractC32269c;
            int i13 = c0383e.f1320E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0383e.f1320E = i13 - Integer.MIN_VALUE;
            } else {
                c0383e = new C0383e(this, abstractC32269c);
            }
        } else {
            c0383e = new C0383e(this, abstractC32269c);
        }
        Object obj = c0383e.f1323y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0383e.f1320E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (this.f1326F.compareAndSet(false, true)) {
                this.f1330z = false;
                AbstractC3069w1 abstractC3069w1 = AbstractC33529a.f139956a;
                C0382d c0382d = new C0382d(this, null, 1);
                c0383e.f1321w = this;
                c0383e.f1322x = interfaceC0380b;
                c0383e.f1320E = 1;
                if (AbstractC3006f0.m8705K(abstractC3069w1, c0382d, c0383e) == enumC31071a) {
                    return enumC31071a;
                }
            }
            c0384f = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0380b = c0383e.f1322x;
            c0384f = c0383e.f1321w;
            AbstractC34132o.m107864I(obj);
        }
        c0384f.f1325E = AbstractC12350b.m34555D(interfaceC0380b, c0384f.f1325E);
        return C23454a0.f92919a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        C2345k c2345k = (C2345k) this.f1329y.getValue();
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345k.f9273a;
        InterfaceC30057d interfaceC30057d = null;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[onResume] owner: " + owner + ", recurringResumeEvent: " + this.f1330z, null);
        }
        if (this.f1330z) {
            AbstractC3006f0.m8732z(this.f1327w, null, null, new C12473e(this, interfaceC30057d, 6), 3);
        }
        this.f1330z = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        AbstractC3006f0.m8732z(this.f1327w, null, null, new C0109h(this, owner, (InterfaceC30057d) null, 4), 3);
    }
}
