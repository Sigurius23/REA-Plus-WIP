package ck1;

import a61.C0468a;
import a81.C0555f;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bs1.C3603v;
import c93.InterfaceC4339a;
import cj0.C4744f;
import cj2.C4769a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import java.io.File;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import uj1.AbstractC35037a;
import v41.AbstractC35661d0;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: ck1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aU\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lck1/k;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onBackClick", "Lkotlin/Function1;", "Ljava/io/File;", "onShareClick", "", "onError", "g", "(Lck1/k;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "health-monitor_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4787j {
    /* JADX WARN: Code duplicated, block: B:100:0x0224  */
    /* JADX WARN: Code duplicated, block: B:102:0x0232  */
    /* JADX WARN: Code duplicated, block: B:105:0x023e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0273  */
    /* JADX WARN: Code duplicated, block: B:109:0x0276  */
    /* JADX WARN: Code duplicated, block: B:111:0x0293  */
    /* JADX WARN: Code duplicated, block: B:112:0x0295  */
    /* JADX WARN: Code duplicated, block: B:115:0x029c  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:127:0x0305  */
    /* JADX WARN: Code duplicated, block: B:130:0x0350  */
    /* JADX WARN: Code duplicated, block: B:132:0x0358  */
    /* JADX WARN: Code duplicated, block: B:135:0x0367  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0110  */
    /* JADX WARN: Code duplicated, block: B:73:0x0123  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:80:0x0162  */
    /* JADX WARN: Code duplicated, block: B:81:0x017e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:96:0x0213  */
    /* JADX WARN: Code duplicated, block: B:97:0x0217  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static final void m15113g(AbstractC4788k viewState, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        Function1 function3;
        int i19;
        boolean z4;
        AbstractC4788k abstractC4788k;
        InterfaceC4339a interfaceC4339a2;
        Function1 function4;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a3;
        Function1 function6;
        int i24;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C38072d c38072d;
        boolean z13;
        C39274g c39274g;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        Function1 function7;
        int i25;
        int iHashCode2;
        AbstractC4788k.a aVar;
        TextResource c8688b;
        int i26;
        boolean z17;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object[] objArr;
        Object[] objArr2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(174624020);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i27 = i14 & 2;
        if (i27 == 0) {
            if ((i13 & 48) == 0) {
                i15 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function3 = function2;
                        if (c28655q.m87157i(function3)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i27 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4744f(7);
                                c28655q.m87172p0(objM87133R5);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i16 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4769a(12);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function6 = (Function1) objM87133R4;
                        } else {
                            function6 = function1;
                        }
                        if (i18 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4769a(13);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function3 = (Function1) objM87133R3;
                        }
                        i24 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "healthcare_health_monitor_share_report", c28655q, i24 | 48);
                        c2314t = C2314t.f9131w;
                        Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        C0209i c0209i4 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q, c0209i4, c23010xM66775a);
                        c0209i = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m);
                        c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S) {
                            c0209i3 = c0209i;
                        } else {
                            c0209i3 = c0209i;
                            if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                            interfaceC4339a2 = interfaceC4339a3;
                            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                            c38072d = C38072d.f163053a;
                            C39274g c39274g2 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                            z13 = viewState instanceof AbstractC4788k.c;
                            if (z13) {
                                c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                            } else {
                                c39274g = null;
                            }
                            AbstractC6721d.a aVar2 = new AbstractC6721d.a(c8688b2, null, c39274g2, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                            if (i24 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i15 & 896) == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objM87133R = c28655q.m87133R();
                            if (z16 || objM87133R == c28676v0) {
                                objM87133R = new C3603v(viewState, function6, 18);
                                c28655q.m87172p0(objM87133R);
                            }
                            function7 = function3;
                            Function1 function8 = function6;
                            i25 = i15;
                            C0209i c0209i6 = c0209i3;
                            AbstractC6719b.m20143d(null, aVar2, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode2 = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m2);
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                            }
                            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                            abstractC4788k = viewState;
                            if (abstractC4788k instanceof AbstractC4788k.b) {
                                c28655q.m87150e0(-1036476487);
                                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                                function5 = function7;
                            } else if (z13) {
                                c28655q.m87150e0(-1036139393);
                                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                                String absolutePath = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                                if ((i25 & 7168) == 2048) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (!z17 || objM87133R2 == c28676v0) {
                                    function5 = function7;
                                    objM87133R2 = new C0468a(function5, 20);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    function5 = function7;
                                }
                                AbstractC35661d0.m112931y(modifierM3407d2, absolutePath, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            } else {
                                function5 = function7;
                                if (abstractC4788k instanceof AbstractC4788k.a) {
                                    throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                                }
                                c28655q.m87150e0(-1035652569);
                                objArr2 = 0;
                                objArr = 0;
                                Object[] objArr3 = 0;
                                Object[] objArr4 = 0;
                                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                                aVar = (AbstractC4788k.a) abstractC4788k;
                                if (aVar.getMessage() != null) {
                                    c8688b = new TextResource.C8691e(aVar.getMessage());
                                    i26 = 2;
                                } else {
                                    i26 = 2;
                                    c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                                }
                                AbstractC33199m0.m105214F(bVar, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr4 == true ? 1 : 0, i26, objArr3 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                                c28655q = c28655q;
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            c28655q.m87173q(true);
                            function4 = function8;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                        C0209i c0209i7 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
                        interfaceC4339a2 = interfaceC4339a3;
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                        c38072d = C38072d.f163053a;
                        C39274g c39274g3 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                        z13 = viewState instanceof AbstractC4788k.c;
                        if (z13) {
                            c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                        } else {
                            c39274g = null;
                        }
                        AbstractC6721d.a aVar3 = new AbstractC6721d.a(c8688b3, null, c39274g3, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                        if (i24 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            objM87133R = new C3603v(viewState, function6, 18);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C3603v(viewState, function6, 18);
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = function3;
                        Function1 function9 = function6;
                        i25 = i15;
                        C0209i c0209i8 = c0209i3;
                        AbstractC6719b.m20143d(null, aVar3, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                        Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                        abstractC4788k = viewState;
                        if (abstractC4788k instanceof AbstractC4788k.b) {
                            c28655q.m87150e0(-1036476487);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function5 = function7;
                        } else if (z13) {
                            c28655q.m87150e0(-1036139393);
                            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t);
                            String absolutePath2 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                            if ((i25 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                function5 = function7;
                                objM87133R2 = new C0468a(function5, 20);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                function5 = function7;
                                objM87133R2 = new C0468a(function5, 20);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC35661d0.m112931y(modifierM3407d4, absolutePath2, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function5 = function7;
                            if (abstractC4788k instanceof AbstractC4788k.a) {
                                throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                            }
                            c28655q.m87150e0(-1035652569);
                            objArr2 = 0;
                            objArr = 0;
                            Object[] objArr5 = 0;
                            Object[] objArr6 = 0;
                            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                            aVar = (AbstractC4788k.a) abstractC4788k;
                            if (aVar.getMessage() != null) {
                                c8688b = new TextResource.C8691e(aVar.getMessage());
                                i26 = 2;
                            } else {
                                i26 = 2;
                                c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                            }
                            AbstractC33199m0.m105214F(bVar2, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr6 == true ? 1 : 0, i26, objArr5 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        function4 = function9;
                    } else {
                        abstractC4788k = viewState;
                        c28655q.m87138X();
                        interfaceC4339a2 = interfaceC4339a;
                        function4 = function1;
                        function5 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C0555f((Object) abstractC4788k, (Object) interfaceC4339a2, function4, (Object) function5, i13, i14, 13);
                    }
                }
                i15 |= 3072;
                function3 = function2;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4744f(7);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4769a(12);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function3 = (Function1) objM87133R3;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_health_monitor_share_report", c28655q, i24 | 48);
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM66722k2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i9 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i9, c23010xM66775a2);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m4);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i10 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N4);
                        interfaceC4339a2 = interfaceC4339a3;
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                        c38072d = C38072d.f163053a;
                        C39274g c39274g4 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                        z13 = viewState instanceof AbstractC4788k.c;
                        if (z13) {
                            c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                        } else {
                            c39274g = null;
                        }
                        AbstractC6721d.a aVar4 = new AbstractC6721d.a(c8688b4, null, c39274g4, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                        if (i24 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            objM87133R = new C3603v(viewState, function6, 18);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C3603v(viewState, function6, 18);
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = function3;
                        Function1 function10 = function6;
                        i25 = i15;
                        C0209i c0209i11 = c0209i3;
                        AbstractC6719b.m20143d(null, aVar4, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                        Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d5);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m5);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                        abstractC4788k = viewState;
                        if (abstractC4788k instanceof AbstractC4788k.b) {
                            c28655q.m87150e0(-1036476487);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function5 = function7;
                        } else if (z13) {
                            c28655q.m87150e0(-1036139393);
                            Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, c2314t);
                            String absolutePath3 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                            if ((i25 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                function5 = function7;
                                objM87133R2 = new C0468a(function5, 20);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                function5 = function7;
                                objM87133R2 = new C0468a(function5, 20);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC35661d0.m112931y(modifierM3407d6, absolutePath3, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function5 = function7;
                            if (abstractC4788k instanceof AbstractC4788k.a) {
                                throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                            }
                            c28655q.m87150e0(-1035652569);
                            objArr2 = 0;
                            objArr = 0;
                            Object[] objArr7 = 0;
                            Object[] objArr8 = 0;
                            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                            aVar = (AbstractC4788k.a) abstractC4788k;
                            if (aVar.getMessage() != null) {
                                c8688b = new TextResource.C8691e(aVar.getMessage());
                                i26 = 2;
                            } else {
                                i26 = 2;
                                c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                            }
                            AbstractC33199m0.m105214F(bVar3, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr8 == true ? 1 : 0, i26, objArr7 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        function4 = function10;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N4);
                    interfaceC4339a2 = interfaceC4339a3;
                    TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                    c38072d = C38072d.f163053a;
                    C39274g c39274g5 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                    z13 = viewState instanceof AbstractC4788k.c;
                    if (z13) {
                        c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                    } else {
                        c39274g = null;
                    }
                    AbstractC6721d.a aVar5 = new AbstractC6721d.a(c8688b5, null, c39274g5, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    if (i24 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = function3;
                    Function1 function11 = function6;
                    i25 = i15;
                    C0209i c0209i13 = c0209i3;
                    AbstractC6719b.m20143d(null, aVar5, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                    Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d7);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, c0209i13, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N6);
                    abstractC4788k = viewState;
                    if (abstractC4788k instanceof AbstractC4788k.b) {
                        c28655q.m87150e0(-1036476487);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function5 = function7;
                    } else if (z13) {
                        c28655q.m87150e0(-1036139393);
                        Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, c2314t);
                        String absolutePath4 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                        if ((i25 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC35661d0.m112931y(modifierM3407d8, absolutePath4, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function5 = function7;
                        if (abstractC4788k instanceof AbstractC4788k.a) {
                            throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                        }
                        c28655q.m87150e0(-1035652569);
                        objArr2 = 0;
                        objArr = 0;
                        Object[] objArr9 = 0;
                        Object[] objArr10 = 0;
                        AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                        aVar = (AbstractC4788k.a) abstractC4788k;
                        if (aVar.getMessage() != null) {
                            c8688b = new TextResource.C8691e(aVar.getMessage());
                            i26 = 2;
                        } else {
                            i26 = 2;
                            c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                        }
                        AbstractC33199m0.m105214F(bVar4, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr10 == true ? 1 : 0, i26, objArr9 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function4 = function11;
                } else {
                    abstractC4788k = viewState;
                    c28655q.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    function4 = function1;
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) abstractC4788k, (Object) interfaceC4339a2, function4, (Object) function5, i13, i14, 13);
                }
            }
            i15 |= 384;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function3 = function2;
                    if (c28655q.m87157i(function3)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4744f(7);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4769a(12);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function3 = (Function1) objM87133R3;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_health_monitor_share_report", c28655q, i24 | 48);
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66722k3 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM66722k3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i14, c23010xM66775a3);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m7);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i15 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N7);
                        interfaceC4339a2 = interfaceC4339a3;
                        TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                        c38072d = C38072d.f163053a;
                        C39274g c39274g6 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                        z13 = viewState instanceof AbstractC4788k.c;
                        if (z13) {
                            c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                        } else {
                            c39274g = null;
                        }
                        AbstractC6721d.a aVar6 = new AbstractC6721d.a(c8688b6, null, c39274g6, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                        if (i24 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            objM87133R = new C3603v(viewState, function6, 18);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C3603v(viewState, function6, 18);
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = function3;
                        Function1 function12 = function6;
                        i25 = i15;
                        C0209i c0209i16 = c0209i3;
                        AbstractC6719b.m20143d(null, aVar6, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                        Modifier modifierM3407d9 = AbstractC1102d.m3407d(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d9);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q, c0209i16, interfaceC28653p1M87165m8);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i15, modifierM118962N8);
                        abstractC4788k = viewState;
                        if (abstractC4788k instanceof AbstractC4788k.b) {
                            c28655q.m87150e0(-1036476487);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function5 = function7;
                        } else if (z13) {
                            c28655q.m87150e0(-1036139393);
                            Modifier modifierM3407d10 = AbstractC1102d.m3407d(1.0f, c2314t);
                            String absolutePath5 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                            if ((i25 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                function5 = function7;
                                objM87133R2 = new C0468a(function5, 20);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                function5 = function7;
                                objM87133R2 = new C0468a(function5, 20);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC35661d0.m112931y(modifierM3407d10, absolutePath5, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function5 = function7;
                            if (abstractC4788k instanceof AbstractC4788k.a) {
                                throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                            }
                            c28655q.m87150e0(-1035652569);
                            objArr2 = 0;
                            objArr = 0;
                            Object[] objArr11 = 0;
                            Object[] objArr12 = 0;
                            AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                            aVar = (AbstractC4788k.a) abstractC4788k;
                            if (aVar.getMessage() != null) {
                                c8688b = new TextResource.C8691e(aVar.getMessage());
                                i26 = 2;
                            } else {
                                i26 = 2;
                                c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                            }
                            AbstractC33199m0.m105214F(bVar5, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr12 == true ? 1 : 0, i26, objArr11 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        function4 = function12;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    C0209i c0209i17 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N7);
                    interfaceC4339a2 = interfaceC4339a3;
                    TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                    c38072d = C38072d.f163053a;
                    C39274g c39274g7 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                    z13 = viewState instanceof AbstractC4788k.c;
                    if (z13) {
                        c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                    } else {
                        c39274g = null;
                    }
                    AbstractC6721d.a aVar7 = new AbstractC6721d.a(c8688b7, null, c39274g7, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    if (i24 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = function3;
                    Function1 function13 = function6;
                    i25 = i15;
                    C0209i c0209i18 = c0209i3;
                    AbstractC6719b.m20143d(null, aVar7, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                    Modifier modifierM3407d11 = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                    Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3407d11);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i14, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, c0209i18, interfaceC28653p1M87165m9);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N9);
                    abstractC4788k = viewState;
                    if (abstractC4788k instanceof AbstractC4788k.b) {
                        c28655q.m87150e0(-1036476487);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function5 = function7;
                    } else if (z13) {
                        c28655q.m87150e0(-1036139393);
                        Modifier modifierM3407d12 = AbstractC1102d.m3407d(1.0f, c2314t);
                        String absolutePath6 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                        if ((i25 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC35661d0.m112931y(modifierM3407d12, absolutePath6, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function5 = function7;
                        if (abstractC4788k instanceof AbstractC4788k.a) {
                            throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                        }
                        c28655q.m87150e0(-1035652569);
                        objArr2 = 0;
                        objArr = 0;
                        Object[] objArr13 = 0;
                        Object[] objArr14 = 0;
                        AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                        aVar = (AbstractC4788k.a) abstractC4788k;
                        if (aVar.getMessage() != null) {
                            c8688b = new TextResource.C8691e(aVar.getMessage());
                            i26 = 2;
                        } else {
                            i26 = 2;
                            c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                        }
                        AbstractC33199m0.m105214F(bVar6, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr14 == true ? 1 : 0, i26, objArr13 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function4 = function13;
                } else {
                    abstractC4788k = viewState;
                    c28655q.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    function4 = function1;
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) abstractC4788k, (Object) interfaceC4339a2, function4, (Object) function5, i13, i14, 13);
                }
            }
            i15 |= 3072;
            function3 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4744f(7);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4769a(12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4769a(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_health_monitor_share_report", c28655q, i24 | 48);
                c2314t = C2314t.f9131w;
                Modifier modifierM66722k4 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM66722k4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i19 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i19, c23010xM66775a4);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m10);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N10);
                    interfaceC4339a2 = interfaceC4339a3;
                    TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                    c38072d = C38072d.f163053a;
                    C39274g c39274g8 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                    z13 = viewState instanceof AbstractC4788k.c;
                    if (z13) {
                        c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                    } else {
                        c39274g = null;
                    }
                    AbstractC6721d.a aVar8 = new AbstractC6721d.a(c8688b8, null, c39274g8, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    if (i24 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = function3;
                    Function1 function14 = function6;
                    i25 = i15;
                    C0209i c0209i111 = c0209i3;
                    AbstractC6719b.m20143d(null, aVar8, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                    Modifier modifierM3407d13 = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3407d13);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q, c0209i111, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i110, modifierM118962N11);
                    abstractC4788k = viewState;
                    if (abstractC4788k instanceof AbstractC4788k.b) {
                        c28655q.m87150e0(-1036476487);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function5 = function7;
                    } else if (z13) {
                        c28655q.m87150e0(-1036139393);
                        Modifier modifierM3407d14 = AbstractC1102d.m3407d(1.0f, c2314t);
                        String absolutePath7 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                        if ((i25 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC35661d0.m112931y(modifierM3407d14, absolutePath7, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function5 = function7;
                        if (abstractC4788k instanceof AbstractC4788k.a) {
                            throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                        }
                        c28655q.m87150e0(-1035652569);
                        objArr2 = 0;
                        objArr = 0;
                        Object[] objArr15 = 0;
                        Object[] objArr16 = 0;
                        AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                        aVar = (AbstractC4788k.a) abstractC4788k;
                        if (aVar.getMessage() != null) {
                            c8688b = new TextResource.C8691e(aVar.getMessage());
                            i26 = 2;
                        } else {
                            i26 = 2;
                            c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                        }
                        AbstractC33199m0.m105214F(bVar7, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr16 == true ? 1 : 0, i26, objArr15 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function4 = function14;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                C0209i c0209i112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N10);
                interfaceC4339a2 = interfaceC4339a3;
                TextResource.C8688b c8688b9 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                c38072d = C38072d.f163053a;
                C39274g c39274g9 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                z13 = viewState instanceof AbstractC4788k.c;
                if (z13) {
                    c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                } else {
                    c39274g = null;
                }
                AbstractC6721d.a aVar9 = new AbstractC6721d.a(c8688b9, null, c39274g9, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                if (i24 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R = c28655q.m87133R();
                if (z16) {
                    objM87133R = new C3603v(viewState, function6, 18);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3603v(viewState, function6, 18);
                    c28655q.m87172p0(objM87133R);
                }
                function7 = function3;
                Function1 function15 = function6;
                i25 = i15;
                C0209i c0209i113 = c0209i3;
                AbstractC6719b.m20143d(null, aVar9, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                Modifier modifierM3407d15 = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3407d15);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i19, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, c0209i113, interfaceC28653p1M87165m12);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i112, modifierM118962N12);
                abstractC4788k = viewState;
                if (abstractC4788k instanceof AbstractC4788k.b) {
                    c28655q.m87150e0(-1036476487);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    function5 = function7;
                } else if (z13) {
                    c28655q.m87150e0(-1036139393);
                    Modifier modifierM3407d16 = AbstractC1102d.m3407d(1.0f, c2314t);
                    String absolutePath8 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                    if ((i25 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        function5 = function7;
                        objM87133R2 = new C0468a(function5, 20);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function5 = function7;
                        objM87133R2 = new C0468a(function5, 20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC35661d0.m112931y(modifierM3407d16, absolutePath8, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function5 = function7;
                    if (abstractC4788k instanceof AbstractC4788k.a) {
                        throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                    }
                    c28655q.m87150e0(-1035652569);
                    objArr2 = 0;
                    objArr = 0;
                    Object[] objArr17 = 0;
                    Object[] objArr18 = 0;
                    AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                    aVar = (AbstractC4788k.a) abstractC4788k;
                    if (aVar.getMessage() != null) {
                        c8688b = new TextResource.C8691e(aVar.getMessage());
                        i26 = 2;
                    } else {
                        i26 = 2;
                        c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                    }
                    AbstractC33199m0.m105214F(bVar8, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr18 == true ? 1 : 0, i26, objArr17 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function4 = function15;
            } else {
                abstractC4788k = viewState;
                c28655q.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                function4 = function1;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) abstractC4788k, (Object) interfaceC4339a2, function4, (Object) function5, i13, i14, 13);
            }
        }
        i15 |= 48;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(function1)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function3 = function2;
                    if (c28655q.m87157i(function3)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4744f(7);
                            c28655q.m87172p0(objM87133R5);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4769a(12);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function1;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4769a(13);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function3 = (Function1) objM87133R3;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "healthcare_health_monitor_share_report", c28655q, i24 | 48);
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66722k5 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM66722k5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i114 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i114, c23010xM66775a5);
                    c0209i = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m13);
                    c0209i2 = C0217k.f732j;
                    if (c28655q.f115903S) {
                        c0209i3 = c0209i;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i115 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N13);
                        interfaceC4339a2 = interfaceC4339a3;
                        TextResource.C8688b c8688b10 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                        c38072d = C38072d.f163053a;
                        C39274g c39274g10 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                        z13 = viewState instanceof AbstractC4788k.c;
                        if (z13) {
                            c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                        } else {
                            c39274g = null;
                        }
                        AbstractC6721d.a aVar10 = new AbstractC6721d.a(c8688b10, null, c39274g10, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                        if (i24 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            objM87133R = new C3603v(viewState, function6, 18);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C3603v(viewState, function6, 18);
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = function3;
                        Function1 function16 = function6;
                        i25 = i15;
                        C0209i c0209i116 = c0209i3;
                        AbstractC6719b.m20143d(null, aVar10, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                        Modifier modifierM3407d17 = AbstractC1102d.m3407d(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                        Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3407d17);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q, c0209i116, interfaceC28653p1M87165m14);
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i115, modifierM118962N14);
                        abstractC4788k = viewState;
                        if (abstractC4788k instanceof AbstractC4788k.b) {
                            c28655q.m87150e0(-1036476487);
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                            function5 = function7;
                        } else if (z13) {
                            c28655q.m87150e0(-1036139393);
                            Modifier modifierM3407d18 = AbstractC1102d.m3407d(1.0f, c2314t);
                            String absolutePath9 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                            if ((i25 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z17) {
                                function5 = function7;
                                objM87133R2 = new C0468a(function5, 20);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                function5 = function7;
                                objM87133R2 = new C0468a(function5, 20);
                                c28655q.m87172p0(objM87133R2);
                            }
                            AbstractC35661d0.m112931y(modifierM3407d18, absolutePath9, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        } else {
                            function5 = function7;
                            if (abstractC4788k instanceof AbstractC4788k.a) {
                                throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                            }
                            c28655q.m87150e0(-1035652569);
                            objArr2 = 0;
                            objArr = 0;
                            Object[] objArr19 = 0;
                            Object[] objArr110 = 0;
                            AbstractC33208p0.b bVar9 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                            aVar = (AbstractC4788k.a) abstractC4788k;
                            if (aVar.getMessage() != null) {
                                c8688b = new TextResource.C8691e(aVar.getMessage());
                                i26 = 2;
                            } else {
                                i26 = 2;
                                c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                            }
                            AbstractC33199m0.m105214F(bVar9, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr110 == true ? 1 : 0, i26, objArr19 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                            c28655q = c28655q;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        function4 = function16;
                    } else {
                        c0209i3 = c0209i;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                    C0209i c0209i117 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N13);
                    interfaceC4339a2 = interfaceC4339a3;
                    TextResource.C8688b c8688b11 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                    c38072d = C38072d.f163053a;
                    C39274g c39274g11 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                    z13 = viewState instanceof AbstractC4788k.c;
                    if (z13) {
                        c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                    } else {
                        c39274g = null;
                    }
                    AbstractC6721d.a aVar11 = new AbstractC6721d.a(c8688b11, null, c39274g11, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    if (i24 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = function3;
                    Function1 function17 = function6;
                    i25 = i15;
                    C0209i c0209i118 = c0209i3;
                    AbstractC6719b.m20143d(null, aVar11, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                    Modifier modifierM3407d19 = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3407d19);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i114, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q, c0209i118, interfaceC28653p1M87165m15);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i117, modifierM118962N15);
                    abstractC4788k = viewState;
                    if (abstractC4788k instanceof AbstractC4788k.b) {
                        c28655q.m87150e0(-1036476487);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function5 = function7;
                    } else if (z13) {
                        c28655q.m87150e0(-1036139393);
                        Modifier modifierM3407d110 = AbstractC1102d.m3407d(1.0f, c2314t);
                        String absolutePath10 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                        if ((i25 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC35661d0.m112931y(modifierM3407d110, absolutePath10, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function5 = function7;
                        if (abstractC4788k instanceof AbstractC4788k.a) {
                            throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                        }
                        c28655q.m87150e0(-1035652569);
                        objArr2 = 0;
                        objArr = 0;
                        Object[] objArr111 = 0;
                        Object[] objArr112 = 0;
                        AbstractC33208p0.b bVar10 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                        aVar = (AbstractC4788k.a) abstractC4788k;
                        if (aVar.getMessage() != null) {
                            c8688b = new TextResource.C8691e(aVar.getMessage());
                            i26 = 2;
                        } else {
                            i26 = 2;
                            c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                        }
                        AbstractC33199m0.m105214F(bVar10, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr112 == true ? 1 : 0, i26, objArr111 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function4 = function17;
                } else {
                    abstractC4788k = viewState;
                    c28655q.m87138X();
                    interfaceC4339a2 = interfaceC4339a;
                    function4 = function1;
                    function5 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C0555f((Object) abstractC4788k, (Object) interfaceC4339a2, function4, (Object) function5, i13, i14, 13);
                }
            }
            i15 |= 3072;
            function3 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4744f(7);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4769a(12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4769a(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_health_monitor_share_report", c28655q, i24 | 48);
                c2314t = C2314t.f9131w;
                Modifier modifierM66722k6 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM66722k6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i119 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i119, c23010xM66775a6);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m16);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N16);
                    interfaceC4339a2 = interfaceC4339a3;
                    TextResource.C8688b c8688b12 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                    c38072d = C38072d.f163053a;
                    C39274g c39274g12 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                    z13 = viewState instanceof AbstractC4788k.c;
                    if (z13) {
                        c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                    } else {
                        c39274g = null;
                    }
                    AbstractC6721d.a aVar12 = new AbstractC6721d.a(c8688b12, null, c39274g12, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    if (i24 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = function3;
                    Function1 function18 = function6;
                    i25 = i15;
                    C0209i c0209i1111 = c0209i3;
                    AbstractC6719b.m20143d(null, aVar12, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                    Modifier modifierM3407d111 = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3407d111);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i119, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q, c0209i1111, interfaceC28653p1M87165m17);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1110, modifierM118962N17);
                    abstractC4788k = viewState;
                    if (abstractC4788k instanceof AbstractC4788k.b) {
                        c28655q.m87150e0(-1036476487);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function5 = function7;
                    } else if (z13) {
                        c28655q.m87150e0(-1036139393);
                        Modifier modifierM3407d112 = AbstractC1102d.m3407d(1.0f, c2314t);
                        String absolutePath11 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                        if ((i25 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC35661d0.m112931y(modifierM3407d112, absolutePath11, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function5 = function7;
                        if (abstractC4788k instanceof AbstractC4788k.a) {
                            throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                        }
                        c28655q.m87150e0(-1035652569);
                        objArr2 = 0;
                        objArr = 0;
                        Object[] objArr113 = 0;
                        Object[] objArr114 = 0;
                        AbstractC33208p0.b bVar11 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                        aVar = (AbstractC4788k.a) abstractC4788k;
                        if (aVar.getMessage() != null) {
                            c8688b = new TextResource.C8691e(aVar.getMessage());
                            i26 = 2;
                        } else {
                            i26 = 2;
                            c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                        }
                        AbstractC33199m0.m105214F(bVar11, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr114 == true ? 1 : 0, i26, objArr113 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function4 = function18;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                C0209i c0209i1112 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N16);
                interfaceC4339a2 = interfaceC4339a3;
                TextResource.C8688b c8688b13 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                c38072d = C38072d.f163053a;
                C39274g c39274g13 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                z13 = viewState instanceof AbstractC4788k.c;
                if (z13) {
                    c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                } else {
                    c39274g = null;
                }
                AbstractC6721d.a aVar13 = new AbstractC6721d.a(c8688b13, null, c39274g13, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                if (i24 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R = c28655q.m87133R();
                if (z16) {
                    objM87133R = new C3603v(viewState, function6, 18);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3603v(viewState, function6, 18);
                    c28655q.m87172p0(objM87133R);
                }
                function7 = function3;
                Function1 function19 = function6;
                i25 = i15;
                C0209i c0209i1113 = c0209i3;
                AbstractC6719b.m20143d(null, aVar13, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                Modifier modifierM3407d113 = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3407d113);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i119, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q, c0209i1113, interfaceC28653p1M87165m18);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1112, modifierM118962N18);
                abstractC4788k = viewState;
                if (abstractC4788k instanceof AbstractC4788k.b) {
                    c28655q.m87150e0(-1036476487);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    function5 = function7;
                } else if (z13) {
                    c28655q.m87150e0(-1036139393);
                    Modifier modifierM3407d114 = AbstractC1102d.m3407d(1.0f, c2314t);
                    String absolutePath12 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                    if ((i25 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        function5 = function7;
                        objM87133R2 = new C0468a(function5, 20);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function5 = function7;
                        objM87133R2 = new C0468a(function5, 20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC35661d0.m112931y(modifierM3407d114, absolutePath12, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function5 = function7;
                    if (abstractC4788k instanceof AbstractC4788k.a) {
                        throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                    }
                    c28655q.m87150e0(-1035652569);
                    objArr2 = 0;
                    objArr = 0;
                    Object[] objArr115 = 0;
                    Object[] objArr116 = 0;
                    AbstractC33208p0.b bVar12 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                    aVar = (AbstractC4788k.a) abstractC4788k;
                    if (aVar.getMessage() != null) {
                        c8688b = new TextResource.C8691e(aVar.getMessage());
                        i26 = 2;
                    } else {
                        i26 = 2;
                        c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                    }
                    AbstractC33199m0.m105214F(bVar12, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr116 == true ? 1 : 0, i26, objArr115 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function4 = function19;
            } else {
                abstractC4788k = viewState;
                c28655q.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                function4 = function1;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) abstractC4788k, (Object) interfaceC4339a2, function4, (Object) function5, i13, i14, 13);
            }
        }
        i15 |= 384;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function3 = function2;
                if (c28655q.m87157i(function3)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4744f(7);
                        c28655q.m87172p0(objM87133R5);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4769a(12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function1;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4769a(13);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "healthcare_health_monitor_share_report", c28655q, i24 | 48);
                c2314t = C2314t.f9131w;
                Modifier modifierM66722k7 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM66722k7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i1114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i1114, c23010xM66775a7);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m19);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S) {
                    c0209i3 = c0209i;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N19);
                    interfaceC4339a2 = interfaceC4339a3;
                    TextResource.C8688b c8688b14 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                    c38072d = C38072d.f163053a;
                    C39274g c39274g14 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                    z13 = viewState instanceof AbstractC4788k.c;
                    if (z13) {
                        c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                    } else {
                        c39274g = null;
                    }
                    AbstractC6721d.a aVar14 = new AbstractC6721d.a(c8688b14, null, c39274g14, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                    if (i24 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C3603v(viewState, function6, 18);
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = function3;
                    Function1 function110 = function6;
                    i25 = i15;
                    C0209i c0209i1116 = c0209i3;
                    AbstractC6719b.m20143d(null, aVar14, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                    Modifier modifierM3407d115 = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3407d115);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC39127r0M66763d13);
                    AbstractC28683x.m87239G(c28655q, c0209i1116, interfaceC28653p1M87165m110);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i1115, modifierM118962N110);
                    abstractC4788k = viewState;
                    if (abstractC4788k instanceof AbstractC4788k.b) {
                        c28655q.m87150e0(-1036476487);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                        function5 = function7;
                    } else if (z13) {
                        c28655q.m87150e0(-1036139393);
                        Modifier modifierM3407d116 = AbstractC1102d.m3407d(1.0f, c2314t);
                        String absolutePath13 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                        if ((i25 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z17) {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            function5 = function7;
                            objM87133R2 = new C0468a(function5, 20);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC35661d0.m112931y(modifierM3407d116, absolutePath13, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        function5 = function7;
                        if (abstractC4788k instanceof AbstractC4788k.a) {
                            throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                        }
                        c28655q.m87150e0(-1035652569);
                        objArr2 = 0;
                        objArr = 0;
                        Object[] objArr117 = 0;
                        Object[] objArr118 = 0;
                        AbstractC33208p0.b bVar13 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                        aVar = (AbstractC4788k.a) abstractC4788k;
                        if (aVar.getMessage() != null) {
                            c8688b = new TextResource.C8691e(aVar.getMessage());
                            i26 = 2;
                        } else {
                            i26 = 2;
                            c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                        }
                        AbstractC33199m0.m105214F(bVar13, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr118 == true ? 1 : 0, i26, objArr117 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    function4 = function110;
                } else {
                    c0209i3 = c0209i;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                C0209i c0209i1117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N19);
                interfaceC4339a2 = interfaceC4339a3;
                TextResource.C8688b c8688b15 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                c38072d = C38072d.f163053a;
                C39274g c39274g15 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                z13 = viewState instanceof AbstractC4788k.c;
                if (z13) {
                    c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                } else {
                    c39274g = null;
                }
                AbstractC6721d.a aVar15 = new AbstractC6721d.a(c8688b15, null, c39274g15, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                if (i24 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R = c28655q.m87133R();
                if (z16) {
                    objM87133R = new C3603v(viewState, function6, 18);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3603v(viewState, function6, 18);
                    c28655q.m87172p0(objM87133R);
                }
                function7 = function3;
                Function1 function111 = function6;
                i25 = i15;
                C0209i c0209i1118 = c0209i3;
                AbstractC6719b.m20143d(null, aVar15, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                Modifier modifierM3407d117 = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM3407d117);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1114, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q, c0209i1118, interfaceC28653p1M87165m111);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i1117, modifierM118962N111);
                abstractC4788k = viewState;
                if (abstractC4788k instanceof AbstractC4788k.b) {
                    c28655q.m87150e0(-1036476487);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    function5 = function7;
                } else if (z13) {
                    c28655q.m87150e0(-1036139393);
                    Modifier modifierM3407d118 = AbstractC1102d.m3407d(1.0f, c2314t);
                    String absolutePath14 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                    if ((i25 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        function5 = function7;
                        objM87133R2 = new C0468a(function5, 20);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function5 = function7;
                        objM87133R2 = new C0468a(function5, 20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC35661d0.m112931y(modifierM3407d118, absolutePath14, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function5 = function7;
                    if (abstractC4788k instanceof AbstractC4788k.a) {
                        throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                    }
                    c28655q.m87150e0(-1035652569);
                    objArr2 = 0;
                    objArr = 0;
                    Object[] objArr119 = 0;
                    Object[] objArr1110 = 0;
                    AbstractC33208p0.b bVar14 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                    aVar = (AbstractC4788k.a) abstractC4788k;
                    if (aVar.getMessage() != null) {
                        c8688b = new TextResource.C8691e(aVar.getMessage());
                        i26 = 2;
                    } else {
                        i26 = 2;
                        c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                    }
                    AbstractC33199m0.m105214F(bVar14, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr1110 == true ? 1 : 0, i26, objArr119 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function4 = function111;
            } else {
                abstractC4788k = viewState;
                c28655q.m87138X();
                interfaceC4339a2 = interfaceC4339a;
                function4 = function1;
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0555f((Object) abstractC4788k, (Object) interfaceC4339a2, function4, (Object) function5, i13, i14, 13);
            }
        }
        i15 |= 3072;
        function3 = function2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i27 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C4744f(7);
                    c28655q.m87172p0(objM87133R5);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R5;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C4769a(12);
                    c28655q.m87172p0(objM87133R4);
                }
                function6 = (Function1) objM87133R4;
            } else {
                function6 = function1;
            }
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C4769a(13);
                    c28655q.m87172p0(objM87133R3);
                }
                function3 = (Function1) objM87133R3;
            }
            i24 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "healthcare_health_monitor_share_report", c28655q, i24 | 48);
            c2314t = C2314t.f9131w;
            Modifier modifierM66722k8 = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
            Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM66722k8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i1119 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i1119, c23010xM66775a8);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m112);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                c0209i3 = c0209i;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i11110 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N112);
                interfaceC4339a2 = interfaceC4339a3;
                TextResource.C8688b c8688b16 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
                c38072d = C38072d.f163053a;
                C39274g c39274g16 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
                z13 = viewState instanceof AbstractC4788k.c;
                if (z13) {
                    c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
                } else {
                    c39274g = null;
                }
                AbstractC6721d.a aVar16 = new AbstractC6721d.a(c8688b16, null, c39274g16, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
                if (i24 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R = c28655q.m87133R();
                if (z16) {
                    objM87133R = new C3603v(viewState, function6, 18);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C3603v(viewState, function6, 18);
                    c28655q.m87172p0(objM87133R);
                }
                function7 = function3;
                Function1 function112 = function6;
                i25 = i15;
                C0209i c0209i11111 = c0209i3;
                AbstractC6719b.m20143d(null, aVar16, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
                Modifier modifierM3407d119 = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3407d119);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC39127r0M66763d15);
                AbstractC28683x.m87239G(c28655q, c0209i11111, interfaceC28653p1M87165m113);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, c0209i11110, modifierM118962N113);
                abstractC4788k = viewState;
                if (abstractC4788k instanceof AbstractC4788k.b) {
                    c28655q.m87150e0(-1036476487);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                    function5 = function7;
                } else if (z13) {
                    c28655q.m87150e0(-1036139393);
                    Modifier modifierM3407d1110 = AbstractC1102d.m3407d(1.0f, c2314t);
                    String absolutePath15 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                    if ((i25 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z17) {
                        function5 = function7;
                        objM87133R2 = new C0468a(function5, 20);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function5 = function7;
                        objM87133R2 = new C0468a(function5, 20);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC35661d0.m112931y(modifierM3407d1110, absolutePath15, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    function5 = function7;
                    if (abstractC4788k instanceof AbstractC4788k.a) {
                        throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                    }
                    c28655q.m87150e0(-1035652569);
                    objArr2 = 0;
                    objArr = 0;
                    Object[] objArr1111 = 0;
                    Object[] objArr1112 = 0;
                    AbstractC33208p0.b bVar15 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                    aVar = (AbstractC4788k.a) abstractC4788k;
                    if (aVar.getMessage() != null) {
                        c8688b = new TextResource.C8691e(aVar.getMessage());
                        i26 = 2;
                    } else {
                        i26 = 2;
                        c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                    }
                    AbstractC33199m0.m105214F(bVar15, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr1112 == true ? 1 : 0, i26, objArr1111 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function4 = function112;
            } else {
                c0209i3 = c0209i;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            C0209i c0209i11112 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i11112, modifierM118962N112);
            interfaceC4339a2 = interfaceC4339a3;
            TextResource.C8688b c8688b17 = new TextResource.C8688b(AbstractC35037a.f148474c, null, 2, 0 == true ? 1 : 0);
            c38072d = C38072d.f163053a;
            C39274g c39274g17 = new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21277k(AbstractC16277f.f62253K));
            z13 = viewState instanceof AbstractC4788k.c;
            if (z13) {
                c39274g = new C39274g(c38072d.m121951d().getVarious().getShare(), AbstractC8693b.m21277k(AbstractC16277f.f62337i2));
            } else {
                c39274g = null;
            }
            AbstractC6721d.a aVar17 = new AbstractC6721d.a(c8688b17, null, c39274g17, c39274g, null, null, false, null, null, null, null, null, null, null, null, 32754, null);
            if (i24 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((i15 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z14 | z15;
            objM87133R = c28655q.m87133R();
            if (z16) {
                objM87133R = new C3603v(viewState, function6, 18);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3603v(viewState, function6, 18);
                c28655q.m87172p0(objM87133R);
            }
            function7 = function3;
            Function1 function113 = function6;
            i25 = i15;
            C0209i c0209i11113 = c0209i3;
            AbstractC6719b.m20143d(null, aVar17, null, interfaceC4339a2, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 37);
            Modifier modifierM3407d1111 = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
            Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3407d1111);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i1119, interfaceC39127r0M66763d16);
            AbstractC28683x.m87239G(c28655q, c0209i11113, interfaceC28653p1M87165m114);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, c0209i11112, modifierM118962N114);
            abstractC4788k = viewState;
            if (abstractC4788k instanceof AbstractC4788k.b) {
                c28655q.m87150e0(-1036476487);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
                c28655q = c28655q;
                c28655q.m87173q(false);
                function5 = function7;
            } else if (z13) {
                c28655q.m87150e0(-1036139393);
                Modifier modifierM3407d1112 = AbstractC1102d.m3407d(1.0f, c2314t);
                String absolutePath16 = ((AbstractC4788k.c) abstractC4788k).getFile().getAbsolutePath();
                if ((i25 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z17) {
                    function5 = function7;
                    objM87133R2 = new C0468a(function5, 20);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function5 = function7;
                    objM87133R2 = new C0468a(function5, 20);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC35661d0.m112931y(modifierM3407d1112, absolutePath16, null, null, (Function1) objM87133R2, true, false, false, false, 0, null, c28655q, 100859910, 0, 1740);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                function5 = function7;
                if (abstractC4788k instanceof AbstractC4788k.a) {
                    throw AbstractC11895b.m32003v(-1696003988, c28655q, false);
                }
                c28655q.m87150e0(-1035652569);
                objArr2 = 0;
                objArr = 0;
                Object[] objArr1113 = 0;
                Object[] objArr1114 = 0;
                AbstractC33208p0.b bVar16 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC35037a.f148472a, null, 2, 0 == true ? 1 : 0), false, null, 6, null);
                aVar = (AbstractC4788k.a) abstractC4788k;
                if (aVar.getMessage() != null) {
                    c8688b = new TextResource.C8691e(aVar.getMessage());
                    i26 = 2;
                } else {
                    i26 = 2;
                    c8688b = new TextResource.C8688b(AbstractC35037a.f148473b, objArr == true ? 1 : 0, i26, objArr2 == true ? 1 : 0);
                }
                AbstractC33199m0.m105214F(bVar16, c8688b, null, new TextResource.C8688b(AbstractC35037a.f148475d, objArr1114 == true ? 1 : 0, i26, objArr1113 == true ? 1 : 0), interfaceC4339a2, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i25 << 9) & 57344), 0, 4068);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function4 = function113;
        } else {
            abstractC4788k = viewState;
            c28655q.m87138X();
            interfaceC4339a2 = interfaceC4339a;
            function4 = function1;
            function5 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0555f((Object) abstractC4788k, (Object) interfaceC4339a2, function4, (Object) function5, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m15114h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m15115i(File it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m15116j(String str) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m15117k(AbstractC4788k abstractC4788k, Function1 function1) {
        if (abstractC4788k instanceof AbstractC4788k.c) {
            function1.invoke(((AbstractC4788k.c) abstractC4788k).getFile());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m15118l(Function1 function1, Throwable exception) {
        AbstractC22676k.m65750j(exception, "exception");
        function1.invoke(exception.getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m15119m(AbstractC4788k abstractC4788k, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m15113g(abstractC4788k, interfaceC4339a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
