package p197hj;

import ad3.AbstractC0770m;
import ad3.C0775r;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.RunnableC1283d;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Nudge;
import com.google.crypto.tink.internal.C5101l0;
import io.sentry.RunnableC20277c7;
import l83.C23454a0;
import p000.AbstractC11266d;
import p009a8.RunnableC0533c;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11894a;
import p222ij.AbstractC18591q;
import p281kj.C22508c;
import p281kj.C22509d;
import p281kj.C22510e;
import p281kj.C22512g;
import p585wj.AbstractC37316b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: hj.q */
/* JADX INFO: loaded from: classes.dex */
public final class C17334q extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f67135w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4861a f67136x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17334q(C4861a c4861a, int i13) {
        super(1);
        this.f67135w = i13;
        this.f67136x = c4861a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0149  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Handler handler;
        Handler handler2;
        C17334q c17334q;
        Object objM1831b;
        Integer numM125932Q;
        switch (this.f67135w) {
            case 0:
                C22512g tapData = (C22512g) obj;
                AbstractC22676k.m65750j(tapData, "tapData");
                C4861a c4861a = this.f67136x;
                C22510e c22510e = (C22510e) c4861a.f20271l.getValue();
                c22510e.getClass();
                long jM65012a = tapData.m65012a();
                long j7 = c22510e.f88224c;
                long j13 = jM65012a - j7;
                if (j7 > 0) {
                    if (j13 <= 1000) {
                        float f13 = c22510e.f88225d;
                        float f14 = c22510e.f88226e;
                        float fM65013b = f13 - tapData.m65013b();
                        float fM65014c = f14 - tapData.m65014c();
                        if (((float) Math.sqrt((fM65014c * fM65014c) + (fM65013b * fM65013b))) > 50.0f) {
                            c22510e.m65011a();
                        }
                    } else {
                        c22510e.m65011a();
                    }
                }
                c22510e.f88223b++;
                c22510e.f88224c = tapData.m65012a();
                c22510e.f88225d = tapData.m65013b();
                c22510e.f88226e = tapData.m65014c();
                int i13 = c22510e.f88223b;
                if (i13 >= 4) {
                    if (i13 >= 4 && (c17334q = c22510e.f88222a) != null) {
                        c17334q.invoke(Integer.valueOf(i13));
                    }
                    c22510e.m65011a();
                } else {
                    RunnableC20277c7 runnableC20277c7 = c22510e.f88228g;
                    if (runnableC20277c7 != null && (handler = c22510e.f88227f) != null) {
                        handler.removeCallbacks(runnableC20277c7);
                    }
                    c22510e.f88227f = null;
                    c22510e.f88228g = null;
                    Handler handler3 = new Handler(Looper.getMainLooper());
                    c22510e.f88227f = handler3;
                    RunnableC20277c7 runnableC20277c8 = new RunnableC20277c7(c22510e, 22);
                    c22510e.f88228g = runnableC20277c8;
                    handler3.postDelayed(runnableC20277c8, 1000L);
                }
                C22509d c22509d = (C22509d) c4861a.f20272m.getValue();
                if (c22509d.f88217b) {
                    RunnableC20277c7 runnableC20277c9 = c22509d.f88219d;
                    if (runnableC20277c9 != null && (handler2 = c22509d.f88218c) != null) {
                        handler2.removeCallbacks(runnableC20277c9);
                    }
                    c22509d.f88218c = null;
                    c22509d.f88219d = null;
                    Handler handler4 = new Handler(Looper.getMainLooper());
                    c22509d.f88218c = handler4;
                    RunnableC20277c7 runnableC20277c10 = new RunnableC20277c7(c22509d, 21);
                    c22509d.f88219d = runnableC20277c10;
                    handler4.postDelayed(runnableC20277c10, 5000L);
                }
                C22508c c22508c = (C22508c) C4861a.f20258n.getValue();
                c22508c.getClass();
                Activity activityM49083a = C17338u.f67142w.m49083a();
                if (activityM49083a != null) {
                    activityM49083a.runOnUiThread(new RunnableC1283d(activityM49083a, c22508c, tapData, 14));
                }
                return C23454a0.f92919a;
            case 1:
                C4861a.f20259o.m16031I(AbstractC2875y.m8296i(((Number) obj).intValue(), "Rage tap detected (", " taps)"));
                new Handler(Looper.getMainLooper()).post(new RunnableC17335r(this.f67136x, 0));
                return C23454a0.f92919a;
            case 2:
                String identifier = (String) obj;
                AbstractC22676k.m65750j(identifier, "identifier");
                new Handler(Looper.getMainLooper()).post(new RunnableC17322e(this.f67136x, identifier, 1));
                return C23454a0.f92919a;
            case 3:
                Object[] args = (Object[]) obj;
                AbstractC22676k.m65750j(args, "args");
                if (args.length < 2) {
                    return Boolean.FALSE;
                }
                String string = args[0].toString();
                try {
                    C0775r c0775r = AbstractC37316b.f159546a;
                    c0775r.getClass();
                    objM1831b = c0775r.m1831b(Nudge.Companion.serializer(), string);
                    break;
                } catch (Exception e5) {
                    C4861a.f20259o.m16067m0(AbstractC2875y.m8298k(e5, new StringBuilder("Failed to deserialize from JSON string: ")));
                    objM1831b = null;
                }
                Nudge nudge = (Nudge) objM1831b;
                if (nudge != null && (numM125932Q = AbstractC39421y.m125932Q(args[1].toString())) != null) {
                    int iIntValue = numM125932Q.intValue();
                    C5101l0 c5101l0 = C4861a.f20259o;
                    StringBuilder sbM30466t = AbstractC11266d.m30466t(iIntValue, "Closing step ", " of nudge ");
                    sbM30466t.append(nudge.getVariantId());
                    c5101l0.m16031I(sbM30466t.toString());
                    try {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0533c(24, this.f67136x, nudge));
                        return Boolean.TRUE;
                    } catch (Exception unused) {
                        return Boolean.FALSE;
                    }
                }
                return Boolean.FALSE;
            default:
                Object[] args2 = (Object[]) obj;
                AbstractC22676k.m65750j(args2, "args");
                return Boolean.valueOf(AbstractC11894a.m31945M(this.f67136x, AbstractC0770m.m1847i(AbstractC18591q.f72618a.m1835f(args2[0].toString()))));
        }
    }
}
