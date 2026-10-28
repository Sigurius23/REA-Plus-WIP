package p027b3;

import android.view.View;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import java.util.concurrent.atomic.AtomicReference;
import p000.C12473e;
import p026b2.C2319y;
import p026b2.C2320z;
import p078d1.C11462o;
import p412q3.C29892z;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b3.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2462x0 implements InterfaceC2994c0 {

    /* JADX INFO: renamed from: w */
    public final View f9610w;

    /* JADX INFO: renamed from: x */
    public final C29892z f9611x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC2994c0 f9612y;

    /* JADX INFO: renamed from: z */
    public final AtomicReference f9613z = new AtomicReference(null);

    public C2462x0(View view, C29892z c29892z, InterfaceC2994c0 interfaceC2994c0) {
        this.f9610w = view;
        this.f9611x = c29892z;
        this.f9612y = interfaceC2994c0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final void m7441a(C11462o c11462o, AbstractC32269c abstractC32269c) {
        C2457w0 c2457w0;
        if (abstractC32269c instanceof C2457w0) {
            c2457w0 = (C2457w0) abstractC32269c;
            int i13 = c2457w0.f9598y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c2457w0.f9598y = i13 - Integer.MIN_VALUE;
            } else {
                c2457w0 = new C2457w0(this, abstractC32269c);
            }
        } else {
            c2457w0 = new C2457w0(this, abstractC32269c);
        }
        Object obj = c2457w0.f9596w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c2457w0.f9598y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C2320z c2320z = new C2320z(1, c11462o, this);
            C12473e c12473e = new C12473e(this, (InterfaceC30057d) null, 14);
            c2457w0.f9598y = 1;
            if (AbstractC3006f0.m8719m(new C2319y(c2320z, this.f9613z, c12473e, (InterfaceC30057d) null), c2457w0) == enumC31071a) {
                return;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f9612y.getCoroutineContext();
    }
}
