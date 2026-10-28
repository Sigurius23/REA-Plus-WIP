package g21;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bf0.C3195g;
import c93.InterfaceC4353o;
import d21.C11506d;
import f31.AbstractC14046c;
import f31.C14044a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27278s;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC22965i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38070b;
import x81.C38072d;
import y00.AbstractC38963t7;
import y71.C39274g;

/* JADX INFO: renamed from: g21.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"", "", "icons", "initialSelectedIndex", "", "enabled", "Ll0/i;", "horizontalArrangement", "Lkotlin/Function1;", "Ll83/a0;", "selectedIconIndex", "d", "(Ljava/util/List;Ljava/lang/Integer;ZLl0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "index", "Li2/x;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(ILandroidx/compose/runtime/Composer;I)J", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15280b {
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x011b  */
    /* JADX WARN: Code duplicated, block: B:82:0x011f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0132  */
    /* JADX WARN: Code duplicated, block: B:87:0x0140  */
    /* JADX WARN: Code duplicated, block: B:89:0x0178  */
    /* JADX WARN: Code duplicated, block: B:92:0x0185  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m43374d(List<Integer> list, Integer num, boolean z4, InterfaceC22965i interfaceC22965i, final Function1 selectedIconIndex, Composer composer, int i13, int i14) {
        final List<Integer> listM118959K;
        int i15;
        Integer num2;
        int i16;
        boolean z13;
        int i17;
        int i18;
        InterfaceC22965i interfaceC22965iM66746i;
        int i19;
        boolean z14;
        Integer num3;
        boolean z15;
        List<Integer> list2;
        InterfaceC22965i interfaceC22965i2;
        C28677v1 c28677v1M87180u;
        Integer num4;
        final boolean z16;
        Integer num5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i24;
        AbstractC22676k.m65750j(selectedIconIndex, "selectedIconIndex");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1162266847);
        if ((i13 & 6) == 0) {
            if ((i14 & 1) == 0) {
                listM118959K = list;
                int i25 = c28655q.m87157i(listM118959K) ? 4 : 2;
                i15 = i25 | i13;
            } else {
                listM118959K = list;
            }
            i15 = i25 | i13;
        } else {
            listM118959K = list;
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                num2 = num;
                i15 |= c28655q.m87153g(num2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z13 = z4;
                    if (c28655q.m87155h(z13)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        interfaceC22965iM66746i = interfaceC22965i;
                        if (c28655q.m87153g(interfaceC22965iM66746i)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87157i(selectedIconIndex)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i24;
                    }
                    if ((i15 & 9363) != 9362) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        c28655q.m87140Z();
                        if ((i13 & 1) != 0 || c28655q.m87118C()) {
                            if ((i14 & 1) != 0) {
                                C38072d c38072d = C38072d.f163053a;
                                listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d), Integer.valueOf(c38072d.m121951d().getAction().getCheckMark()));
                                i15 &= -15;
                            }
                            if (i26 != 0) {
                                num4 = null;
                            } else {
                                num4 = num2;
                            }
                            if (i16 != 0) {
                                z13 = true;
                            }
                            if (i18 != 0) {
                                interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                            }
                            z16 = z13;
                            num5 = num4;
                        } else {
                            c28655q.m87138X();
                            if ((i14 & 1) != 0) {
                                i15 &= -15;
                            }
                            z16 = z13;
                            num5 = num2;
                        }
                        c28655q.m87175r();
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(listM118959K)), num5, null, interfaceC22965iM66746i, null, AbstractC37817c.m121344e(1813726745, c28655q, new InterfaceC4353o() { // from class: g21.a
                            @Override // c93.InterfaceC4353o
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj5).intValue();
                                return AbstractC15280b.m43375e(listM118959K, z16, selectedIconIndex, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                            }
                        }), c28655q, (i15 & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i15 & 7168), 20);
                        c28655q.m87173q(true);
                        z15 = z16;
                        num3 = num5;
                        interfaceC22965i2 = interfaceC22965iM66746i;
                        list2 = listM118959K;
                    } else {
                        c28655q.m87138X();
                        num3 = num2;
                        z15 = z13;
                        list2 = listM118959K;
                        interfaceC22965i2 = interfaceC22965iM66746i;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C3195g((Object) list2, (Object) num3, z15, (Object) interfaceC22965i2, selectedIconIndex, i13, i14, 9);
                    }
                }
                i15 |= 3072;
                interfaceC22965iM66746i = interfaceC22965i;
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(selectedIconIndex)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i24;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if ((i14 & 1) != 0) {
                            C38072d c38072d2 = C38072d.f163053a;
                            listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d2), Integer.valueOf(c38072d2.m121951d().getAction().getCheckMark()));
                            i15 &= -15;
                        }
                        if (i26 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                        }
                        z16 = z13;
                        num5 = num4;
                    } else {
                        if ((i14 & 1) != 0) {
                            C38072d c38072d3 = C38072d.f163053a;
                            listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d3), Integer.valueOf(c38072d3.m121951d().getAction().getCheckMark()));
                            i15 &= -15;
                        }
                        if (i26 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                        }
                        z16 = z13;
                        num5 = num4;
                    }
                    c28655q.m87175r();
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(listM118959K)), num5, null, interfaceC22965iM66746i, null, AbstractC37817c.m121344e(1813726745, c28655q, new InterfaceC4353o() { // from class: g21.a
                        @Override // c93.InterfaceC4353o
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            int iIntValue = ((Integer) obj5).intValue();
                            return AbstractC15280b.m43375e(listM118959K, z16, selectedIconIndex, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                        }
                    }), c28655q, (i15 & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i15 & 7168), 20);
                    c28655q.m87173q(true);
                    z15 = z16;
                    num3 = num5;
                    interfaceC22965i2 = interfaceC22965iM66746i;
                    list2 = listM118959K;
                } else {
                    c28655q.m87138X();
                    num3 = num2;
                    z15 = z13;
                    list2 = listM118959K;
                    interfaceC22965i2 = interfaceC22965iM66746i;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3195g((Object) list2, (Object) num3, z15, (Object) interfaceC22965i2, selectedIconIndex, i13, i14, 9);
                }
            }
            i15 |= 384;
            z13 = z4;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC22965iM66746i = interfaceC22965i;
                    if (c28655q.m87153g(interfaceC22965iM66746i)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(selectedIconIndex)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i24;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if ((i14 & 1) != 0) {
                            C38072d c38072d4 = C38072d.f163053a;
                            listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d4), Integer.valueOf(c38072d4.m121951d().getAction().getCheckMark()));
                            i15 &= -15;
                        }
                        if (i26 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                        }
                        z16 = z13;
                        num5 = num4;
                    } else {
                        if ((i14 & 1) != 0) {
                            C38072d c38072d5 = C38072d.f163053a;
                            listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d5), Integer.valueOf(c38072d5.m121951d().getAction().getCheckMark()));
                            i15 &= -15;
                        }
                        if (i26 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                        }
                        z16 = z13;
                        num5 = num4;
                    }
                    c28655q.m87175r();
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(listM118959K)), num5, null, interfaceC22965iM66746i, null, AbstractC37817c.m121344e(1813726745, c28655q, new InterfaceC4353o() { // from class: g21.a
                        @Override // c93.InterfaceC4353o
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            int iIntValue = ((Integer) obj5).intValue();
                            return AbstractC15280b.m43375e(listM118959K, z16, selectedIconIndex, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                        }
                    }), c28655q, (i15 & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i15 & 7168), 20);
                    c28655q.m87173q(true);
                    z15 = z16;
                    num3 = num5;
                    interfaceC22965i2 = interfaceC22965iM66746i;
                    list2 = listM118959K;
                } else {
                    c28655q.m87138X();
                    num3 = num2;
                    z15 = z13;
                    list2 = listM118959K;
                    interfaceC22965i2 = interfaceC22965iM66746i;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3195g((Object) list2, (Object) num3, z15, (Object) interfaceC22965i2, selectedIconIndex, i13, i14, 9);
                }
            }
            i15 |= 3072;
            interfaceC22965iM66746i = interfaceC22965i;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(selectedIconIndex)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 1) != 0) {
                        C38072d c38072d6 = C38072d.f163053a;
                        listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d6), Integer.valueOf(c38072d6.m121951d().getAction().getCheckMark()));
                        i15 &= -15;
                    }
                    if (i26 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                    }
                    z16 = z13;
                    num5 = num4;
                } else {
                    if ((i14 & 1) != 0) {
                        C38072d c38072d7 = C38072d.f163053a;
                        listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d7), Integer.valueOf(c38072d7.m121951d().getAction().getCheckMark()));
                        i15 &= -15;
                    }
                    if (i26 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                    }
                    z16 = z13;
                    num5 = num4;
                }
                c28655q.m87175r();
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(listM118959K)), num5, null, interfaceC22965iM66746i, null, AbstractC37817c.m121344e(1813726745, c28655q, new InterfaceC4353o() { // from class: g21.a
                    @Override // c93.InterfaceC4353o
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return AbstractC15280b.m43375e(listM118959K, z16, selectedIconIndex, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                    }
                }), c28655q, (i15 & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i15 & 7168), 20);
                c28655q.m87173q(true);
                z15 = z16;
                num3 = num5;
                interfaceC22965i2 = interfaceC22965iM66746i;
                list2 = listM118959K;
            } else {
                c28655q.m87138X();
                num3 = num2;
                z15 = z13;
                list2 = listM118959K;
                interfaceC22965i2 = interfaceC22965iM66746i;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g((Object) list2, (Object) num3, z15, (Object) interfaceC22965i2, selectedIconIndex, i13, i14, 9);
            }
        }
        i15 |= 48;
        num2 = num;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                if (c28655q.m87155h(z13)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC22965iM66746i = interfaceC22965i;
                    if (c28655q.m87153g(interfaceC22965iM66746i)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(selectedIconIndex)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i24;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0) {
                        if ((i14 & 1) != 0) {
                            C38072d c38072d8 = C38072d.f163053a;
                            listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d8), Integer.valueOf(c38072d8.m121951d().getAction().getCheckMark()));
                            i15 &= -15;
                        }
                        if (i26 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                        }
                        z16 = z13;
                        num5 = num4;
                    } else {
                        if ((i14 & 1) != 0) {
                            C38072d c38072d9 = C38072d.f163053a;
                            listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d9), Integer.valueOf(c38072d9.m121951d().getAction().getCheckMark()));
                            i15 &= -15;
                        }
                        if (i26 != 0) {
                            num4 = null;
                        } else {
                            num4 = num2;
                        }
                        if (i16 != 0) {
                            z13 = true;
                        }
                        if (i18 != 0) {
                            interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                        }
                        z16 = z13;
                        num5 = num4;
                    }
                    c28655q.m87175r();
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(listM118959K)), num5, null, interfaceC22965iM66746i, null, AbstractC37817c.m121344e(1813726745, c28655q, new InterfaceC4353o() { // from class: g21.a
                        @Override // c93.InterfaceC4353o
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                            int iIntValue = ((Integer) obj5).intValue();
                            return AbstractC15280b.m43375e(listM118959K, z16, selectedIconIndex, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                        }
                    }), c28655q, (i15 & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i15 & 7168), 20);
                    c28655q.m87173q(true);
                    z15 = z16;
                    num3 = num5;
                    interfaceC22965i2 = interfaceC22965iM66746i;
                    list2 = listM118959K;
                } else {
                    c28655q.m87138X();
                    num3 = num2;
                    z15 = z13;
                    list2 = listM118959K;
                    interfaceC22965i2 = interfaceC22965iM66746i;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3195g((Object) list2, (Object) num3, z15, (Object) interfaceC22965i2, selectedIconIndex, i13, i14, 9);
                }
            }
            i15 |= 3072;
            interfaceC22965iM66746i = interfaceC22965i;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(selectedIconIndex)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 1) != 0) {
                        C38072d c38072d10 = C38072d.f163053a;
                        listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d10), Integer.valueOf(c38072d10.m121951d().getAction().getCheckMark()));
                        i15 &= -15;
                    }
                    if (i26 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                    }
                    z16 = z13;
                    num5 = num4;
                } else {
                    if ((i14 & 1) != 0) {
                        C38072d c38072d11 = C38072d.f163053a;
                        listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d11), Integer.valueOf(c38072d11.m121951d().getAction().getCheckMark()));
                        i15 &= -15;
                    }
                    if (i26 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                    }
                    z16 = z13;
                    num5 = num4;
                }
                c28655q.m87175r();
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(listM118959K)), num5, null, interfaceC22965iM66746i, null, AbstractC37817c.m121344e(1813726745, c28655q, new InterfaceC4353o() { // from class: g21.a
                    @Override // c93.InterfaceC4353o
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return AbstractC15280b.m43375e(listM118959K, z16, selectedIconIndex, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                    }
                }), c28655q, (i15 & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i15 & 7168), 20);
                c28655q.m87173q(true);
                z15 = z16;
                num3 = num5;
                interfaceC22965i2 = interfaceC22965iM66746i;
                list2 = listM118959K;
            } else {
                c28655q.m87138X();
                num3 = num2;
                z15 = z13;
                list2 = listM118959K;
                interfaceC22965i2 = interfaceC22965iM66746i;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g((Object) list2, (Object) num3, z15, (Object) interfaceC22965i2, selectedIconIndex, i13, i14, 9);
            }
        }
        i15 |= 384;
        z13 = z4;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC22965iM66746i = interfaceC22965i;
                if (c28655q.m87153g(interfaceC22965iM66746i)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(selectedIconIndex)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i24;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 1) != 0) {
                        C38072d c38072d12 = C38072d.f163053a;
                        listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d12), Integer.valueOf(c38072d12.m121951d().getAction().getCheckMark()));
                        i15 &= -15;
                    }
                    if (i26 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                    }
                    z16 = z13;
                    num5 = num4;
                } else {
                    if ((i14 & 1) != 0) {
                        C38072d c38072d13 = C38072d.f163053a;
                        listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d13), Integer.valueOf(c38072d13.m121951d().getAction().getCheckMark()));
                        i15 &= -15;
                    }
                    if (i26 != 0) {
                        num4 = null;
                    } else {
                        num4 = num2;
                    }
                    if (i16 != 0) {
                        z13 = true;
                    }
                    if (i18 != 0) {
                        interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                    }
                    z16 = z13;
                    num5 = num4;
                }
                c28655q.m87175r();
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(listM118959K)), num5, null, interfaceC22965iM66746i, null, AbstractC37817c.m121344e(1813726745, c28655q, new InterfaceC4353o() { // from class: g21.a
                    @Override // c93.InterfaceC4353o
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        int iIntValue = ((Integer) obj5).intValue();
                        return AbstractC15280b.m43375e(listM118959K, z16, selectedIconIndex, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                    }
                }), c28655q, (i15 & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i15 & 7168), 20);
                c28655q.m87173q(true);
                z15 = z16;
                num3 = num5;
                interfaceC22965i2 = interfaceC22965iM66746i;
                list2 = listM118959K;
            } else {
                c28655q.m87138X();
                num3 = num2;
                z15 = z13;
                list2 = listM118959K;
                interfaceC22965i2 = interfaceC22965iM66746i;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g((Object) list2, (Object) num3, z15, (Object) interfaceC22965i2, selectedIconIndex, i13, i14, 9);
            }
        }
        i15 |= 3072;
        interfaceC22965iM66746i = interfaceC22965i;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(selectedIconIndex)) {
                i24 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i24 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i24;
        }
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 1) != 0) {
                    C38072d c38072d14 = C38072d.f163053a;
                    listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d14), Integer.valueOf(c38072d14.m121951d().getAction().getCheckMark()));
                    i15 &= -15;
                }
                if (i26 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if (i18 != 0) {
                    interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                }
                z16 = z13;
                num5 = num4;
            } else {
                if ((i14 & 1) != 0) {
                    C38072d c38072d15 = C38072d.f163053a;
                    listM118959K = AbstractC37056f.m118959K(AbstractC38963t7.m124375e(c38072d15), Integer.valueOf(c38072d15.m121951d().getAction().getCheckMark()));
                    i15 &= -15;
                }
                if (i26 != 0) {
                    num4 = null;
                } else {
                    num4 = num2;
                }
                if (i16 != 0) {
                    z13 = true;
                }
                if (i18 != 0) {
                    interfaceC22965iM66746i = AbstractC22977m.m66746i(1 * 4);
                }
                z16 = z13;
                num5 = num4;
            }
            c28655q.m87175r();
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            AbstractC14046c.m39965e(AbstractC25265s.m74093D1(AbstractC37056f.m118950B(listM118959K)), num5, null, interfaceC22965iM66746i, null, AbstractC37817c.m121344e(1813726745, c28655q, new InterfaceC4353o() { // from class: g21.a
                @Override // c93.InterfaceC4353o
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj5).intValue();
                    return AbstractC15280b.m43375e(listM118959K, z16, selectedIconIndex, (InterfaceC1103a) obj, ((Integer) obj2).intValue(), (C14044a) obj3, (Composer) obj4, iIntValue);
                }
            }), c28655q, (i15 & 112) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i15 & 7168), 20);
            c28655q.m87173q(true);
            z15 = z16;
            num3 = num5;
            interfaceC22965i2 = interfaceC22965iM66746i;
            list2 = listM118959K;
        } else {
            c28655q.m87138X();
            num3 = num2;
            z15 = z13;
            list2 = listM118959K;
            interfaceC22965i2 = interfaceC22965iM66746i;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g((Object) list2, (Object) num3, z15, (Object) interfaceC22965i2, selectedIconIndex, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m43375e(List list, boolean z4, Function1 function1, InterfaceC1103a RadioGroup, int i13, C14044a state, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(RadioGroup, "$this$RadioGroup");
        AbstractC22676k.m65750j(state, "state");
        if ((i14 & 48) == 0) {
            i15 = (((C28655q) composer).m87149e(i13) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= ((C28655q) composer).m87153g(state) ? 256 : 128;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 1169) != 1168)) {
            C39274g c39274g = new C39274g(((Number) list.get(i13)).intValue(), null, 2, null);
            long jM43378h = m43378h(i13, c28655q, (i15 >> 3) & 14);
            boolean isSelected = state.getIsSelected();
            boolean zM87153g = c28655q.m87153g(function1) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C11506d(function1, i13, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27278s.m82282c(c39274g, jM43378h, z4, isSelected, (Function1) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m43376f(Function1 function1, int i13, boolean z4) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m43377g(List list, Integer num, boolean z4, InterfaceC22965i interfaceC22965i, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m43374d(list, num, z4, interfaceC22965i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final long m43378h(int i13, Composer composer, int i14) {
        if (i13 != 0) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-196546712);
            long affirmative = C38070b.f163049a.m121943a(c28655q, 6).getAffirmative();
            c28655q.m87173q(false);
            return affirmative;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-196500181);
        long negative = C38070b.f163049a.m121943a(c28655q2, 6).getNegative();
        c28655q2.m87173q(false);
        return negative;
    }
}
