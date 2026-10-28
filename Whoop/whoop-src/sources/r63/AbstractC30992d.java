package r63;

import b83.C2807c;
import hc3.C17191x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import o63.C27615f;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import q83.InterfaceC30063j;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: r63.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC30992d {
    private volatile /* synthetic */ Object _interceptors;

    /* JADX INFO: renamed from: a */
    public final ArrayList f127964a;

    /* JADX INFO: renamed from: b */
    public int f127965b;

    /* JADX INFO: renamed from: c */
    public boolean f127966c;

    /* JADX INFO: renamed from: d */
    public C17191x f127967d;

    public AbstractC30992d(C17191x... c17191xArr) {
        new C27615f();
        this.f127964a = AbstractC37056f.m118964P(Arrays.copyOf(c17191xArr, c17191xArr.length));
        this._interceptors = null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f A[LOOP:2: B:33:0x007d->B:34:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x008b A[LOOP:1: B:26:0x005b->B:36:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x008e A[EDGE_INSN: B:48:0x008e->B:37:0x008e BREAK  A[LOOP:1: B:26:0x005b->B:36:0x008b], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final Object m95529a(Object context, Object subject, AbstractC32269c abstractC32269c) {
        ArrayList arrayList;
        int iM118951C;
        int i13;
        Object obj;
        C30991c c30991c;
        List list;
        int size;
        int i14;
        int iM118951C2;
        InterfaceC30063j coroutineContext = abstractC32269c.getContext();
        if (((List) this._interceptors) == null) {
            int i15 = this.f127965b;
            if (i15 == 0) {
                this._interceptors = C25271y.f99162w;
                this.f127966c = false;
                this.f127967d = null;
            } else {
                ArrayList arrayList2 = this.f127964a;
                if (i15 != 1 || (iM118951C2 = AbstractC37056f.m118951C(arrayList2)) < 0) {
                    arrayList = new ArrayList();
                    iM118951C = AbstractC37056f.m118951C(arrayList2);
                    if (iM118951C >= 0) {
                        i13 = 0;
                        while (true) {
                            obj = arrayList2.get(i13);
                            if (obj instanceof C30991c) {
                                c30991c = (C30991c) obj;
                            } else {
                                c30991c = null;
                            }
                            if (c30991c != null) {
                                list = c30991c.f127962c;
                                arrayList.ensureCapacity(list.size() + arrayList.size());
                                size = list.size();
                                for (i14 = 0; i14 < size; i14++) {
                                    arrayList.add(list.get(i14));
                                }
                            }
                            if (i13 != iM118951C) {
                                break;
                            }
                            i13++;
                        }
                    }
                    this._interceptors = arrayList;
                    this.f127966c = false;
                    this.f127967d = null;
                } else {
                    int i16 = 0;
                    while (true) {
                        Object obj2 = arrayList2.get(i16);
                        C30991c c30991c2 = obj2 instanceof C30991c ? (C30991c) obj2 : null;
                        if (c30991c2 != null && !c30991c2.f127962c.isEmpty()) {
                            List list2 = c30991c2.f127962c;
                            c30991c2.f127963d = true;
                            this._interceptors = list2;
                            this.f127966c = false;
                            this.f127967d = c30991c2.f127960a;
                        } else if (i16 != iM118951C2) {
                            i16++;
                        } else {
                            arrayList = new ArrayList();
                            iM118951C = AbstractC37056f.m118951C(arrayList2);
                            if (iM118951C >= 0) {
                                i13 = 0;
                                while (true) {
                                    obj = arrayList2.get(i13);
                                    if (obj instanceof C30991c) {
                                        c30991c = (C30991c) obj;
                                    } else {
                                        c30991c = null;
                                    }
                                    if (c30991c != null) {
                                        list = c30991c.f127962c;
                                        arrayList.ensureCapacity(list.size() + arrayList.size());
                                        size = list.size();
                                        while (i14 < size) {
                                            arrayList.add(list.get(i14));
                                        }
                                    }
                                    if (i13 != iM118951C) {
                                        break;
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            this._interceptors = arrayList;
                            this.f127966c = false;
                            this.f127967d = null;
                        }
                    }
                }
            }
        }
        this.f127966c = true;
        List list3 = (List) this._interceptors;
        AbstractC22676k.m65747g(list3);
        boolean zMo35807d = mo35807d();
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(subject, "subject");
        AbstractC22676k.m65750j(coroutineContext, "coroutineContext");
        return ((AbstractC30994f.f127969a || zMo35807d) ? new C30990b(context, list3, subject, coroutineContext) : new C30999k(subject, context, list3)).mo95523a(subject, abstractC32269c);
    }

    /* JADX INFO: renamed from: b */
    public final C30991c m95530b(C17191x c17191x) {
        ArrayList arrayList = this.f127964a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj == c17191x) {
                C30991c c30991c = new C30991c(c17191x, C30996h.f127971d);
                arrayList.set(i13, c30991c);
                return c30991c;
            }
            if (obj instanceof C30991c) {
                C30991c c30991c2 = (C30991c) obj;
                if (c30991c2.f127960a == c17191x) {
                    return c30991c2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m95531c(C17191x c17191x) {
        ArrayList arrayList = this.f127964a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj == c17191x || ((obj instanceof C30991c) && ((C30991c) obj).f127960a == c17191x)) {
                return i13;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo35807d();

    /* JADX INFO: renamed from: e */
    public final boolean m95532e(C17191x c17191x) {
        ArrayList arrayList = this.f127964a;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            Object obj = arrayList.get(i13);
            if (obj == c17191x) {
                return true;
            }
            if ((obj instanceof C30991c) && ((C30991c) obj).f127960a == c17191x) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m95533f(C17191x phase, Function3 function3) {
        AbstractC22676k.m65750j(phase, "phase");
        C30991c c30991cM95530b = m95530b(phase);
        if (c30991cM95530b == null) {
            throw new C2807c("Phase " + phase + " was not registered for this pipeline");
        }
        AbstractC22681m0.m65774e(3, function3);
        List list = (List) this._interceptors;
        if (!this.f127964a.isEmpty() && list != null && !this.f127966c && AbstractC22681m0.m65776g(list)) {
            if (AbstractC22676k.m65745e(this.f127967d, phase)) {
                list.add(function3);
            } else if (phase.equals(AbstractC25265s.m74112P0(this.f127964a)) || m95531c(phase) == AbstractC37056f.m118951C(this.f127964a)) {
                C30991c c30991cM95530b2 = m95530b(phase);
                AbstractC22676k.m65747g(c30991cM95530b2);
                c30991cM95530b2.m95528a(function3);
                list.add(function3);
            }
            this.f127965b++;
            return;
        }
        c30991cM95530b.m95528a(function3);
        this.f127965b++;
        this._interceptors = null;
        this.f127966c = false;
        this.f127967d = null;
    }
}
