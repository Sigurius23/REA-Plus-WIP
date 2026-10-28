package p401pj;

import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import androidx.fragment.app.RunnableC1283d;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.quickjs.wrapper.QuickJSContext;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import n20.C26175j;
import p043c4.C3967k;
import p222ij.C18587m;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p525uj.C35035m;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: pj.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C29288v extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC28601c1 f118519E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Nudge f118520F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Context f118521G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C35035m f118522H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC28601c1 f118523I;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f118524w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Rect f118525x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C4861a f118526y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f118527z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29288v(Rect rect, C4861a c4861a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Nudge nudge, Context context, C35035m c35035m, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f118525x = rect;
        this.f118526y = c4861a;
        this.f118527z = interfaceC28601c1;
        this.f118519E = interfaceC28601c2;
        this.f118520F = nudge;
        this.f118521G = context;
        this.f118522H = c35035m;
        this.f118523I = interfaceC28601c3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C29288v c29288v = new C29288v(this.f118525x, this.f118526y, this.f118527z, this.f118519E, this.f118520F, this.f118521G, this.f118522H, this.f118523I, interfaceC30057d);
        c29288v.f118524w = obj;
        return c29288v;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Exception {
        C29288v c29288v = (C29288v) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c29288v.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Exception {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f118524w;
        Rect rect = this.f118525x;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C4861a c4861a = this.f118526y;
        InterfaceC28601c1 interfaceC28601c1 = this.f118519E;
        if (rect == null) {
            this.f118527z.setValue(null);
            InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC28601c1.getValue();
            if (interfaceC3027k1 != null) {
                interfaceC3027k1.cancel((CancellationException) null);
            }
            interfaceC28601c1.setValue(AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C26175j(c4861a, this.f118520F, (InterfaceC30057d) null, 15), 3));
            return c23454a0;
        }
        InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) interfaceC28601c1.getValue();
        if (interfaceC3027k2 != null) {
            interfaceC3027k2.cancel((CancellationException) null);
        }
        C18587m c18587m = c4861a.f20263d;
        C3967k c3967k = new C3967k(this.f118521G, this.f118522H, this.f118525x, this.f118523I, this.f118527z, 3);
        c18587m.getClass();
        QuickJSContext quickJSContextM53802b = c18587m.m53802b();
        if (quickJSContextM53802b != null) {
            if (AbstractC22676k.m65745e(Looper.myLooper(), c18587m.f72605c.getLooper())) {
                c3967k.invoke(quickJSContextM53802b);
                return c23454a0;
            }
            AtomicReference atomicReference = new AtomicReference();
            c18587m.f72606d.post(new RunnableC1283d(c3967k, quickJSContextM53802b, atomicReference, 10));
            try {
                Exception exc = (Exception) atomicReference.get();
                if (exc != null) {
                    throw exc;
                }
            } catch (InterruptedException e5) {
                C4861a.f20259o.m16032K("Interrupted while waiting for evaluation", e5);
                return c23454a0;
            }
        }
        return c23454a0;
    }
}
