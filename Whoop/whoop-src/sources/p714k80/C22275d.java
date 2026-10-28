package p714k80;

import androidx.work.impl.WorkDatabase;
import bc3.AbstractC3069w1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.activation.view.ActivationFragment;
import hc3.C17183p;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.ObjectSerializer;
import l83.C23454a0;
import l83.C23468n;
import nc.AbstractC26558b;
import nc.C26557a;
import nm1.AbstractC26843h;
import nm1.C26844i;
import ny0.C27246d;
import ny0.C27256h;
import p002a0.C0059w0;
import p027b3.RunnableC2411n;
import p114eb.AbstractC12979o0;
import p114eb.C12991u0;
import p185h6.RunnableC16957l;
import p249jc.AbstractC21585k;
import p249jc.C21596v;
import p390p1.C28679w;
import p505ts.AbstractC34132o;
import p524ui.InterfaceC34984l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25305n;
import p741vn1.AbstractC36212p;
import t92.AbstractC33664b;
import ug.AbstractC34924m;
import v41.AbstractC35684p;
import w61.AbstractC36862b;
import y61.C39260a;

/* JADX INFO: renamed from: k80.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22275d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f86938w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f86939x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f86940y;

    public /* synthetic */ C22275d(int i13, Object obj, Object obj2) {
        this.f86938w = i13;
        this.f86939x = obj;
        this.f86940y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7 A[LOOP:0: B:17:0x0072->B:27:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x00aa A[SYNTHETIC] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        Object objM107888l;
        switch (this.f86938w) {
            case 0:
                return ActivationFragment.m17202Z((C12991u0) this.f86939x, (ActivationFragment) this.f86940y);
            case 1:
                return EnumSerializer.descriptor_delegate$lambda$0((EnumSerializer) this.f86939x, (String) this.f86940y);
            case 2:
                return ObjectSerializer.descriptor_delegate$lambda$1((String) this.f86939x, (ObjectSerializer) this.f86940y);
            case 3:
                AbstractC26558b abstractC26558b = (AbstractC26558b) this.f86939x;
                C26557a c26557a = (C26557a) this.f86940y;
                AbstractC12979o0 abstractC12979o0 = abstractC26558b.f105572a;
                abstractC12979o0.getClass();
                synchronized (abstractC12979o0.f44829c) {
                    if (((LinkedHashSet) abstractC12979o0.f44830d).remove(c26557a) && ((LinkedHashSet) abstractC12979o0.f44830d).isEmpty()) {
                        abstractC12979o0.mo36478f();
                    }
                    break;
                }
                return C23454a0.f92919a;
            case 4:
                return AbstractC26843h.m80109i((Function1) this.f86939x, (C26844i) this.f86940y);
            case 5:
                return C27246d.m82106h((C27256h) this.f86939x, (Function1) this.f86940y);
            case 6:
                try {
                    AbstractC3069w1 abstractC3069w1Mo48537a = ((MainDispatcherFactory) this.f86939x).mo48537a((ArrayList) this.f86940y);
                    if (!(abstractC3069w1Mo48537a.mo8825s() instanceof C17183p)) {
                        return abstractC3069w1Mo48537a;
                    }
                    try {
                        abstractC3069w1Mo48537a.dispatch(abstractC3069w1Mo48537a, new RunnableC2411n(1));
                        objM107888l = C23454a0.f92919a;
                        break;
                    } catch (Throwable th3) {
                        objM107888l = AbstractC34132o.m107888l(th3);
                    }
                    AbstractC34924m.m110151l(C23468n.m68037a(objM107888l));
                    throw null;
                } catch (Throwable th4) {
                    AbstractC34924m.m110151l(th4);
                    throw null;
                }
            case 7:
                C0059w0 c0059w0 = (C0059w0) this.f86939x;
                C28679w c28679w = (C28679w) this.f86940y;
                Object[] objArr = c0059w0.f178b;
                long[] jArr = c0059w0.f177a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j7 = jArr[i13];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((255 & j7) < 128) {
                                    c28679w.m87232z(objArr[(i13 << 3) + i15]);
                                }
                                j7 >>= 8;
                            }
                            if (i14 == 8) {
                                if (i13 != length) {
                                    i13++;
                                }
                            }
                        } else if (i13 != length) {
                            i13++;
                        }
                    }
                }
                return C23454a0.f92919a;
            case 8:
                String str = (String) this.f86939x;
                C21596v c21596v = (C21596v) this.f86940y;
                WorkDatabase workDatabase = c21596v.f82807c;
                AbstractC22676k.m65749i(workDatabase, "getWorkDatabase(...)");
                workDatabase.runInTransaction(new RunnableC16957l(workDatabase, str, c21596v, 6));
                AbstractC21585k.m60632b(c21596v.f82806b, workDatabase, c21596v.f82809e);
                return C23454a0.f92919a;
            case 9:
                return AbstractC33664b.m106369x1((AbstractC33664b) this.f86939x, (Class) this.f86940y);
            case 10:
                return Float.valueOf(AbstractC35684p.m113055p((Float) this.f86939x, (InterfaceC34984l) this.f86940y));
            case 11:
                return AbstractC36212p.m115258x((InterfaceC4351m) this.f86939x, (InterfaceC25305n) this.f86940y);
            default:
                return AbstractC36862b.m118226f((C39260a) this.f86939x, (Function1) this.f86940y);
        }
    }

    public /* synthetic */ C22275d(MainDispatcherFactory mainDispatcherFactory, ArrayList arrayList, TestMainDispatcherFactory testMainDispatcherFactory) {
        this.f86938w = 6;
        this.f86939x = mainDispatcherFactory;
        this.f86940y = arrayList;
    }
}
