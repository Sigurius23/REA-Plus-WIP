package nn2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import j81.C21421e;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p635y2.C39102j;
import p635y2.InterfaceC39105k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: nn2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\n\u001a\u00020\t*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ll0/u;", "Lkd1/o;", "image", "", "stackedImages", "Landroidx/compose/ui/Modifier;", "modifier", "Ly2/k;", "contentScale", "Ll83/a0;", "b", "(Ll0/u;Lkd1/o;Ljava/util/List;Landroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26867a {
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5 A[LOOP:0: B:62:0x00af->B:64:0x00b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m80219b(InterfaceC23001u interfaceC23001u, AbstractC22403o abstractC22403o, List<? extends AbstractC22403o> list, Modifier modifier, InterfaceC39105k interfaceC39105k, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        InterfaceC39105k interfaceC39105k2;
        int i17;
        boolean z4;
        Modifier modifier3;
        InterfaceC39105k interfaceC39105k3;
        C28677v1 c28677v1M87180u;
        List<? extends AbstractC22403o> listM118960L;
        Iterator<T> it;
        AbstractC22676k.m65750j(interfaceC23001u, "<this>");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(373379913);
        if ((i13 & 48) == 0) {
            i15 = ((i13 & 64) == 0 ? c28655q.m87153g(abstractC22403o) : c28655q.m87157i(abstractC22403o) ? 32 : 16) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(list) ? 256 : 128;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 3072) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC39105k2 = interfaceC39105k;
                    if (c28655q.m87153g(interfaceC39105k2)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                if ((i15 & 9361) != 9360) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i16 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                    } else {
                        interfaceC39105k3 = interfaceC39105k2;
                    }
                    if (list == null) {
                        listM118960L = AbstractC37056f.m118960L(abstractC22403o);
                    } else {
                        if (list.isEmpty()) {
                            listM118960L = null;
                        } else {
                            listM118960L = list;
                        }
                        if (listM118960L == null) {
                            listM118960L = AbstractC37056f.m118960L(abstractC22403o);
                        }
                    }
                    it = listM118960L.iterator();
                    while (it.hasNext()) {
                        C28655q c28655q2 = c28655q;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i((AbstractC22403o) it.next(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, modifier3, null, interfaceC39105k3, 0.0f, null, c28655q2, ((i15 >> 3) & 896) | 48 | (57344 & i15), 104);
                        c28655q = c28655q2;
                    }
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC39105k3 = interfaceC39105k2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21421e((Object) interfaceC23001u, (Object) abstractC22403o, (Object) list, modifier3, (Object) interfaceC39105k3, i13, i14, 7);
                }
            }
            i15 |= 24576;
            interfaceC39105k2 = interfaceC39105k;
            if ((i15 & 9361) != 9360) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    interfaceC39105k3 = C39102j.f168200b;
                } else {
                    interfaceC39105k3 = interfaceC39105k2;
                }
                if (list == null) {
                    listM118960L = AbstractC37056f.m118960L(abstractC22403o);
                } else {
                    if (list.isEmpty()) {
                        listM118960L = list;
                    } else {
                        listM118960L = null;
                    }
                    if (listM118960L == null) {
                        listM118960L = AbstractC37056f.m118960L(abstractC22403o);
                    }
                }
                it = listM118960L.iterator();
                while (it.hasNext()) {
                    C28655q c28655q3 = c28655q;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i((AbstractC22403o) it.next(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, modifier3, null, interfaceC39105k3, 0.0f, null, c28655q3, ((i15 >> 3) & 896) | 48 | (57344 & i15), 104);
                    c28655q = c28655q3;
                }
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC39105k3 = interfaceC39105k2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e((Object) interfaceC23001u, (Object) abstractC22403o, (Object) list, modifier3, (Object) interfaceC39105k3, i13, i14, 7);
            }
        }
        i15 |= 3072;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC39105k2 = interfaceC39105k;
                if (c28655q.m87153g(interfaceC39105k2)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            if ((i15 & 9361) != 9360) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i16 != 0) {
                    interfaceC39105k3 = C39102j.f168200b;
                } else {
                    interfaceC39105k3 = interfaceC39105k2;
                }
                if (list == null) {
                    listM118960L = AbstractC37056f.m118960L(abstractC22403o);
                } else {
                    if (list.isEmpty()) {
                        listM118960L = list;
                    } else {
                        listM118960L = null;
                    }
                    if (listM118960L == null) {
                        listM118960L = AbstractC37056f.m118960L(abstractC22403o);
                    }
                }
                it = listM118960L.iterator();
                while (it.hasNext()) {
                    C28655q c28655q4 = c28655q;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i((AbstractC22403o) it.next(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, modifier3, null, interfaceC39105k3, 0.0f, null, c28655q4, ((i15 >> 3) & 896) | 48 | (57344 & i15), 104);
                    c28655q = c28655q4;
                }
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC39105k3 = interfaceC39105k2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21421e((Object) interfaceC23001u, (Object) abstractC22403o, (Object) list, modifier3, (Object) interfaceC39105k3, i13, i14, 7);
            }
        }
        i15 |= 24576;
        interfaceC39105k2 = interfaceC39105k;
        if ((i15 & 9361) != 9360) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i16 != 0) {
                interfaceC39105k3 = C39102j.f168200b;
            } else {
                interfaceC39105k3 = interfaceC39105k2;
            }
            if (list == null) {
                listM118960L = AbstractC37056f.m118960L(abstractC22403o);
            } else {
                if (list.isEmpty()) {
                    listM118960L = list;
                } else {
                    listM118960L = null;
                }
                if (listM118960L == null) {
                    listM118960L = AbstractC37056f.m118960L(abstractC22403o);
                }
            }
            it = listM118960L.iterator();
            while (it.hasNext()) {
                C28655q c28655q5 = c28655q;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i((AbstractC22403o) it.next(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, modifier3, null, interfaceC39105k3, 0.0f, null, c28655q5, ((i15 >> 3) & 896) | 48 | (57344 & i15), 104);
                c28655q = c28655q5;
            }
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC39105k3 = interfaceC39105k2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21421e((Object) interfaceC23001u, (Object) abstractC22403o, (Object) list, modifier3, (Object) interfaceC39105k3, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m80220c(InterfaceC23001u interfaceC23001u, AbstractC22403o abstractC22403o, List list, Modifier modifier, InterfaceC39105k interfaceC39105k, int i13, int i14, Composer composer, int i15) {
        m80219b(interfaceC23001u, abstractC22403o, list, modifier, interfaceC39105k, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
