package c41;

import android.content.Context;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.C3033m;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.whoop.activation.view.ActivationFragment;
import com.whoop.design.util.TextResource;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import dc3.C11923h;
import fc3.C14389t;
import hc3.C17188u;
import ht2.AbstractC17633e;
import ht2.C17629a;
import io.getstream.chat.android.client.notifications.handler.NotificationConfig;
import io.getstream.chat.android.client.notifications.handler.NotificationHandlerFactory;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import ly0.AbstractC24801e;
import m83.AbstractC25265s;
import m83.C25262p;
import p002a0.AbstractC0018e1;
import p002a0.C0059w0;
import p026b2.InterfaceC2302h;
import p077d0.C11373l0;
import p180h0.C16463u2;
import p180h0.C16473w2;
import p390p1.AbstractC28659r;
import p390p1.AbstractC28683x;
import p390p1.C28594a2;
import p390p1.C28677v1;
import p390p1.C28688y1;
import p390p1.EnumC28681w1;
import p390p1.InterfaceC28623i;
import p446r1.C30851e;
import p602x1.C37822h;
import p636y3.C39178j;
import p636y3.C39180l;
import p636y3.EnumC39181m;
import p668z1.AbstractC39948a0;
import p668z1.C39973v;
import p715kotlin.KotlinNothingValueException;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import sr2.C32930l;
import uf3.C34911a;
import wb3.AbstractC37056f;
import xf3.C38266c;

/* JADX INFO: renamed from: c41.l3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4065l3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16516w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f16517x;

    public /* synthetic */ C4065l3(C11373l0 c11373l0, int i13) {
        this.f16516w = 1;
        this.f16517x = c11373l0;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:155:0x02eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:184:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x01aa A[Catch: all -> 0x019d, LOOP:5: B:78:0x016e->B:95:0x01aa, LOOP_END, TryCatch #0 {all -> 0x019d, blocks: (B:71:0x014b, B:73:0x015b, B:75:0x0161, B:78:0x016e, B:80:0x017a, B:82:0x0184, B:84:0x018a, B:86:0x0193, B:91:0x019f, B:92:0x01a2, B:95:0x01aa, B:105:0x01d0, B:96:0x01ae, B:97:0x01b4, B:99:0x01ba, B:101:0x01c2, B:104:0x01cc), top: B:165:0x014b }] */
    /* JADX WARN: Instruction removed from duplicated block: B:158:0x02f2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        char c3;
        Collection collectionM74129g1;
        Object objM87291w = null;
        char c7 = 7;
        switch (this.f16516w) {
            case 0:
                return AbstractC4072m3.m12492l((C4044i3) this.f16517x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                ((Integer) obj2).getClass();
                ((C11373l0) this.f16517x).m30603a((Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 2:
                C14389t c14389t = (C14389t) this.f16517x;
                int iIntValue = ((Integer) obj).intValue();
                InterfaceC30061h interfaceC30061h = (InterfaceC30061h) obj2;
                InterfaceC30062i key = interfaceC30061h.getKey();
                InterfaceC30061h interfaceC30061h2 = c14389t.f52529x.get(key);
                if (key == C3023j1.f12041w) {
                    InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) interfaceC30061h2;
                    for (InterfaceC3027k1 parent = (InterfaceC3027k1) interfaceC30061h; parent != null; parent = ((C17188u) parent).getParent()) {
                        if (parent == interfaceC3027k1 || !(parent instanceof C17188u)) {
                            objM87291w = parent;
                            if (objM87291w == interfaceC3027k1) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objM87291w + ", expected child of " + interfaceC3027k1 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (interfaceC3027k1 != null) {
                                iIntValue++;
                            }
                        }
                    }
                    if (objM87291w == interfaceC3027k1) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objM87291w + ", expected child of " + interfaceC3027k1 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                    if (interfaceC3027k1 != null) {
                        iIntValue++;
                    }
                } else if (interfaceC30061h != interfaceC30061h2) {
                    iIntValue = Integer.MIN_VALUE;
                } else {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 3:
                C16473w2 c16473w2 = (C16473w2) this.f16517x;
                AbstractC3006f0.m8732z(c16473w2.m7158L0(), null, null, new C16463u2(c16473w2, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null, 0), 3);
                return Boolean.TRUE;
            case 4:
                return AbstractC17633e.m50200H((C17629a) this.f16517x, (Composer) obj, ((Integer) obj2).intValue());
            case 5:
                return NotificationHandlerFactory.getDefaultNewMessageIntentFun$lambda$6((Context) this.f16517x, (Message) obj, (Channel) obj2);
            case 6:
                return NotificationHandlerFactory.m54882a((NotificationConfig) this.f16517x, (User) obj, (Message) obj2);
            case 7:
                return ActivationFragment.m17201Y((ActivationFragment) this.f16517x, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return new C39178j(((InterfaceC2302h) this.f16517x).mo7156a(0L, ((C39180l) obj).f168422a, (EnumC39181m) obj2));
            case 9:
                return AbstractC24801e.m72692l((TextResource) this.f16517x, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                C37822h c37822h = (C37822h) this.f16517x;
                ((Integer) obj).getClass();
                if (obj2 instanceof InterfaceC28623i) {
                    InterfaceC28623i interfaceC28623i = (InterfaceC28623i) obj2;
                    C0059w0 c0059w0 = c37822h.f161975h;
                    if (c0059w0 == null) {
                        C0059w0 c0059w1 = AbstractC0018e1.f44a;
                        c0059w0 = new C0059w0();
                        c37822h.f161975h = c0059w0;
                    }
                    c0059w0.m146k(interfaceC28623i);
                    c37822h.f161973f.m94885b(interfaceC28623i);
                }
                if (obj2 instanceof C28594a2) {
                    c37822h.m121354e((C28594a2) obj2);
                }
                if (obj2 instanceof C28677v1) {
                    ((C28677v1) obj2).m87203d();
                }
                return C23454a0.f92919a;
            case 11:
                C28688y1 c28688y1 = (C28688y1) this.f16517x;
                Set set = (Set) obj;
                synchronized (c28688y1.f116037c) {
                    try {
                        if (((EnumC28681w1) c28688y1.f116055u.getValue()).compareTo(EnumC28681w1.f116011E) >= 0) {
                            C0059w0 c0059w2 = c28688y1.f116042h;
                            if (set instanceof C30851e) {
                                C0059w0 c0059w3 = ((C30851e) set).f127230w;
                                Object[] objArr = c0059w3.f178b;
                                long[] jArr = c0059w3.f177a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i13 = 0;
                                    while (true) {
                                        long j7 = jArr[i13];
                                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                                            for (int i15 = 0; i15 < i14; i15++) {
                                                if ((j7 & 255) < 128) {
                                                    Object obj3 = objArr[(i13 << 3) + i15];
                                                    if (!(obj3 instanceof AbstractC39948a0) || ((AbstractC39948a0) obj3).m128128k(1)) {
                                                        c0059w2.m136a(obj3);
                                                    }
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
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof AbstractC39948a0) || ((AbstractC39948a0) obj4).m128128k(1)) {
                                        c0059w2.m136a(obj4);
                                    }
                                }
                            }
                            objM87291w = c28688y1.m87291w();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                if (objM87291w != null) {
                    ((C3033m) objM87291w).resumeWith(C23454a0.f92919a);
                }
                return C23454a0.f92919a;
            case 12:
                C11923h c11923h = (C11923h) this.f16517x;
                Set set2 = (Set) obj;
                if (set2 instanceof C30851e) {
                    C0059w0 c0059w4 = ((C30851e) set2).f127230w;
                    Object[] objArr2 = c0059w4.f178b;
                    long[] jArr2 = c0059w4.f177a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i16 = 0;
                        while (true) {
                            long j13 = jArr2[i16];
                            if ((((~j13) << c7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                int i18 = 0;
                                while (true) {
                                    if (i18 < i17) {
                                        if ((j13 & 255) < 128) {
                                            Object obj5 = objArr2[(i16 << 3) + i18];
                                            if (!(obj5 instanceof AbstractC39948a0) || ((AbstractC39948a0) obj5).m128128k(4)) {
                                            }
                                        }
                                        j13 >>= 8;
                                        i18++;
                                        c7 = c7;
                                    } else {
                                        c3 = c7;
                                        if (i17 == 8) {
                                        }
                                    }
                                }
                            } else {
                                c3 = c7;
                            }
                            if (i16 != length2) {
                                i16++;
                                c7 = c3;
                            }
                        }
                        c11923h.mo32218s(set2);
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj6 : set3) {
                            if (!(obj6 instanceof AbstractC39948a0) || ((AbstractC39948a0) obj6).m128128k(4)) {
                                c11923h.mo32218s(set2);
                            }
                        }
                    }
                }
                return C23454a0.f92919a;
            case 13:
                return C32930l.m103811c((C32930l) this.f16517x, (C38266c) obj, (C34911a) obj2);
            case 14:
                return MainActivity.m27267R0((MainActivity) this.f16517x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                C39973v c39973v = (C39973v) this.f16517x;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = c39973v.f172495b;
                while (true) {
                    Object obj7 = atomicReference.get();
                    if (obj7 == null) {
                        collectionM74129g1 = collection;
                    } else if (obj7 instanceof Set) {
                        collectionM74129g1 = AbstractC37056f.m118959K(obj7, collection);
                    } else {
                        if (!(obj7 instanceof List)) {
                            AbstractC28659r.m87193d("Unexpected notification");
                            throw new KotlinNothingValueException();
                        }
                        collectionM74129g1 = AbstractC25265s.m74129g1((Collection) obj7, AbstractC37056f.m118958J(collection));
                    }
                    do {
                        if (atomicReference.compareAndSet(obj7, collectionM74129g1)) {
                            if (c39973v.m128203c()) {
                                c39973v.f172494a.invoke(new C25262p(c39973v, 28));
                            }
                            return C23454a0.f92919a;
                        }
                    } while (atomicReference.get() == obj7);
                }
                break;
        }
    }

    public /* synthetic */ C4065l3(Object obj, int i13) {
        this.f16516w = i13;
        this.f16517x = obj;
    }
}
