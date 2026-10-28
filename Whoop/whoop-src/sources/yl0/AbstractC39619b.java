package yl0;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d13.AbstractC11478a;
import gy0.AbstractC16277f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Locale;
import l83.C23454a0;
import no0.C26949h;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p292l1.AbstractC23141n2;
import p292l1.C23196w3;
import p292l1.EnumC23202x3;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p579wc.C37082e1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32676t1;
import qz0.AbstractC30784c;
import qz0.AbstractC30787f;
import v41.AbstractC35662e;
import v41.C35666g;
import vv2.C36537c;
import w71.C36887i;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import yc2.C39434a;
import yk2.C39611k;

/* JADX INFO: renamed from: yl0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lyl0/c;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "Lkotlin/Function1;", "", "onSave", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lyl0/c;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "showKeyboard", "k", "(Lyl0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "text", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39619b {
    /* JADX INFO: renamed from: h */
    public static final void m126607h(C39620c state, InterfaceC4339a onDismiss, Function1 onSave, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(onSave, "onSave");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1528651367);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onDismiss) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onSave) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C23196w3 c23196w3M67125g = AbstractC23141n2.m67125g(6, null, c28655q, 2);
            AbstractC35662e.m112943g(null, c23196w3M67125g, new C35666g(AbstractC11478a.m30853e(Locale.ROOT, state.getTitle(), "toUpperCase(...)"), null, null, null, null, 0.0f, 0.0f, 126, null), null, null, null, onDismiss, null, false, null, null, false, AbstractC37817c.m121344e(1325401715, c28655q, new C26949h(state, c23196w3M67125g, onSave, 29)), c28655q, ((i14 << 15) & 3670016) | (C35666g.f151591h << 6), 384, 4025);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(state, onDismiss, onSave, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m126608i(C39620c c39620c, C23196w3 c23196w3, Function1 function1, InterfaceC23013y BottomSheetM3, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheetM3, "$this$BottomSheetM3");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m126610k(c39620c, c23196w3.m67151c() == EnumC23202x3.f91821x, function1, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m126609j(C39620c c39620c, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m126607h(c39620c, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX WARN: Code duplicated, block: B:50:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:59:0x016f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0172  */
    /* JADX WARN: Code duplicated, block: B:62:0x017e  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0284  */
    /* JADX WARN: Code duplicated, block: B:88:0x0295  */
    /* JADX WARN: Code duplicated, block: B:89:0x0297  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final void m126610k(C39620c state, boolean z4, Function1 onSave, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        C28655q c28655q;
        Function1 function1;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        Locale localeM126693e;
        boolean zM87153g;
        Object objM87133R;
        C28676v0 c28676v0;
        Double dM126624g;
        String strM126689a;
        InterfaceC28601c1 interfaceC28601c1;
        Double dM126695g;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        String strM126623f;
        AbstractC30784c.c cVar;
        int i16;
        Object objM87133R2;
        boolean z17;
        boolean zM87153g2;
        Object objM87133R3;
        Object objM87133R4;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objM87133R5;
        int i17;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onSave, "onSave");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(171655314);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q2.m87155h(z13) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(onSave)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                Locale locale = ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
                AbstractC22676k.m65749i(locale, "get(...)");
                localeM126693e = AbstractC39633p.m126693e(locale);
                zM87153g = c28655q2.m87153g(state.getValue()) | c28655q2.m87149e(state.getDecimalPlaces()) | c28655q2.m87153g(localeM126693e);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    dM126624g = state.getValue();
                    if (dM126624g != null) {
                        strM126689a = AbstractC39633p.m126689a(dM126624g.doubleValue(), state.getDecimalPlaces(), localeM126693e);
                    } else {
                        strM126689a = null;
                    }
                    if (strM126689a == null) {
                        strM126689a = "";
                    }
                    objM87133R = AbstractC28683x.m87272z(strM126689a);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                boolean zM126691c = AbstractC39633p.m126691c(m126611l(interfaceC28601c1), state.getMin(), state.getMax(), localeM126693e);
                dM126695g = AbstractC39633p.m126695g(m126611l(interfaceC28601c1), localeM126693e);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                TextResource textResourceM21278l = AbstractC8693b.m21278l(m126611l(interfaceC28601c1));
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(state.getQuestion());
                strM126623f = state.getUnit();
                if (strM126623f.length() <= 0) {
                    strM126623f = null;
                }
                if (strM126623f != null) {
                    cVar = new AbstractC30784c.c(AbstractC8693b.m21278l(strM126623f), null, 2, 0 == true ? 1 : 0);
                } else {
                    cVar = null;
                }
                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC37336b.f159634N, new TextResource.AbstractC8690d.b(Double.valueOf(state.getMin())), new TextResource.AbstractC8690d.b(Double.valueOf(state.getMax())));
                if (state.getDecimalPlaces() > 0) {
                    i16 = 9;
                } else {
                    i16 = 3;
                }
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C39434a(12);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                if ((i15 & 14) == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g2 = z17 | c28655q2.m87153g(localeM126693e) | c28655q2.m87153g(interfaceC28601c1);
                objM87133R3 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C37082e1(state, localeM126693e, interfaceC28601c1, 16);
                    c28655q2.m87172p0(objM87133R3);
                }
                Function1 function2 = (Function1) objM87133R3;
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C39611k(2);
                    c28655q2.m87172p0(objM87133R4);
                }
                Function1 function3 = (Function1) objM87133R4;
                int i19 = TextResource.$stable;
                int i24 = (i19 << 9) | (i19 << 3) | 6 | (AbstractC30784c.c.f126792d << 21);
                int i25 = TextResource.C8688b.f25889c;
                AbstractC30787f.m94664c(modifierM3409f2, textResourceM21278l, null, textResourceM21278l2, null, null, null, cVar, c8688b, zM126691c, null, false, i16, 0, 0, z16, null, false, false, null, null, null, null, null, null, false, interfaceC4339a, function2, function3, c28655q2, i24 | (i25 << 24), (i15 << 12) & 458752, 102236160, 67071092);
                boolean z25 = z16;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                if (dM126695g != null || zM126691c) {
                    z18 = false;
                } else {
                    z18 = true;
                }
                TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC16277f.f62216A2);
                boolean zM87153g3 = c28655q2.m87153g(dM126695g);
                if ((i15 & 896) == 256) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zM87153g3 | z19;
                objM87133R5 = c28655q2.m87133R();
                if (!z24 || objM87133R5 == c28676v0) {
                    function1 = onSave;
                    objM87133R5 = new C36887i(dM126695g, function1);
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    function1 = onSave;
                }
                AbstractC27292z.m82343j(modifierM3409f3, z18, false, null, null, null, c8688bM21277k, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R5, c28655q2, (i25 << 18) | 6, 0, 8124);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                z15 = z25;
            } else {
                c28655q = c28655q2;
                function1 = onSave;
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32676t1(state, z15, function1, i13, i14, 8);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87157i(onSave)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z14)) {
            if (i18 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            Locale locale2 = ((Configuration) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4975a)).getLocales().get(0);
            AbstractC22676k.m65749i(locale2, "get(...)");
            localeM126693e = AbstractC39633p.m126693e(locale2);
            zM87153g = c28655q2.m87153g(state.getValue()) | c28655q2.m87149e(state.getDecimalPlaces()) | c28655q2.m87153g(localeM126693e);
            objM87133R = c28655q2.m87133R();
            c28676v0 = C28635l.f115821a;
            if (zM87153g) {
                dM126624g = state.getValue();
                if (dM126624g != null) {
                    strM126689a = AbstractC39633p.m126689a(dM126624g.doubleValue(), state.getDecimalPlaces(), localeM126693e);
                } else {
                    strM126689a = null;
                }
                if (strM126689a == null) {
                    strM126689a = "";
                }
                objM87133R = AbstractC28683x.m87272z(strM126689a);
                c28655q2.m87172p0(objM87133R);
            } else {
                dM126624g = state.getValue();
                if (dM126624g != null) {
                    strM126689a = AbstractC39633p.m126689a(dM126624g.doubleValue(), state.getDecimalPlaces(), localeM126693e);
                } else {
                    strM126689a = null;
                }
                if (strM126689a == null) {
                    strM126689a = "";
                }
                objM87133R = AbstractC28683x.m87272z(strM126689a);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            boolean zM126691c2 = AbstractC39633p.m126691c(m126611l(interfaceC28601c1), state.getMin(), state.getMax(), localeM126693e);
            dM126695g = AbstractC39633p.m126695g(m126611l(interfaceC28601c1), localeM126693e);
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q2, 6);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t2);
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(m126611l(interfaceC28601c1));
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l(state.getQuestion());
            strM126623f = state.getUnit();
            if (strM126623f.length() <= 0) {
                strM126623f = null;
            }
            if (strM126623f != null) {
                cVar = new AbstractC30784c.c(AbstractC8693b.m21278l(strM126623f), null, 2, 0 == true ? 1 : 0);
            } else {
                cVar = null;
            }
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC37336b.f159634N, new TextResource.AbstractC8690d.b(Double.valueOf(state.getMin())), new TextResource.AbstractC8690d.b(Double.valueOf(state.getMax())));
            if (state.getDecimalPlaces() > 0) {
                i16 = 9;
            } else {
                i16 = 3;
            }
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C39434a(12);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            if ((i15 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87153g2 = z17 | c28655q2.m87153g(localeM126693e) | c28655q2.m87153g(interfaceC28601c1);
            objM87133R3 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R3 = new C37082e1(state, localeM126693e, interfaceC28601c1, 16);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C37082e1(state, localeM126693e, interfaceC28601c1, 16);
                c28655q2.m87172p0(objM87133R3);
            }
            Function1 function4 = (Function1) objM87133R3;
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C39611k(2);
                c28655q2.m87172p0(objM87133R4);
            }
            Function1 function5 = (Function1) objM87133R4;
            int i110 = TextResource.$stable;
            int i26 = (i110 << 9) | (i110 << 3) | 6 | (AbstractC30784c.c.f126792d << 21);
            int i27 = TextResource.C8688b.f25889c;
            AbstractC30787f.m94664c(modifierM3409f5, textResourceM21278l3, null, textResourceM21278l4, null, null, null, cVar, c8688b2, zM126691c2, null, false, i16, 0, 0, z16, null, false, false, null, null, null, null, null, null, false, interfaceC4339a2, function4, function5, c28655q2, i26 | (i27 << 24), (i15 << 12) & 458752, 102236160, 67071092);
            boolean z26 = z16;
            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t2);
            if (dM126695g != null) {
                z18 = false;
            } else {
                z18 = false;
            }
            TextResource.C8688b c8688bM21277k2 = AbstractC8693b.m21277k(AbstractC16277f.f62216A2);
            boolean zM87153g4 = c28655q2.m87153g(dM126695g);
            if ((i15 & 896) == 256) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = zM87153g4 | z19;
            objM87133R5 = c28655q2.m87133R();
            if (z24) {
                function1 = onSave;
                objM87133R5 = new C36887i(dM126695g, function1);
                c28655q2.m87172p0(objM87133R5);
            } else {
                function1 = onSave;
                objM87133R5 = new C36887i(dM126695g, function1);
                c28655q2.m87172p0(objM87133R5);
            }
            AbstractC27292z.m82343j(modifierM3409f6, z18, false, null, null, null, c8688bM21277k2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R5, c28655q2, (i27 << 18) | 6, 0, 8124);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            z15 = z26;
        } else {
            c28655q = c28655q2;
            function1 = onSave;
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(state, z15, function1, i13, i14, 8);
        }
    }

    /* JADX INFO: renamed from: l */
    private static final String m126611l(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: m */
    private static final void m126612m(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m126613n() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m126614o(C39620c c39620c, Locale locale, InterfaceC28601c1 interfaceC28601c1, String newText) {
        AbstractC22676k.m65750j(newText, "newText");
        if (AbstractC39633p.m126690b(newText, c39620c.getDecimalPlaces(), locale)) {
            m126612m(interfaceC28601c1, newText);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m126615p(Double d3) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m126616q(Double d3, Function1 function1) {
        if (d3 != null) {
            function1.invoke(d3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m126617r(C39620c c39620c, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m126610k(c39620c, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
