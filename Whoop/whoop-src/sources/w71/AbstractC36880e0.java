package w71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17763k2;
import i93.C18279e;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p023ay.C2124a0;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.AbstractC39330c;
import qz0.AbstractC30795n;
import s90.C32290f;
import uz1.C35429g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: w71.e0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001ae\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00108\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "timeString", "", "curTime", "startTime", "endTime", "question", "context", "", "isSubQuestion", "enabled", "Lkotlin/Function1;", "Ll83/a0;", "selectedTime", "e", "(Lcom/whoop/design/util/TextResource;JJJLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "positionWhileDragging", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36880e0 {
    /* JADX INFO: renamed from: e */
    public static final void m118300e(final TextResource timeString, final long j7, final long j13, final long j14, final TextResource question, final TextResource context, boolean z4, boolean z13, Function1 function1, Composer composer, final int i13, final int i14) {
        int i15;
        long j15;
        boolean z14;
        final boolean z15;
        final boolean z16 = z13;
        final Function1 selectedTime = function1;
        AbstractC22676k.m65750j(timeString, "timeString");
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(selectedTime, "selectedTime");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(635818876);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(timeString) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            j15 = j13;
            i15 |= c28655q.m87151f(j15) ? 256 : 128;
        } else {
            j15 = j13;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87151f(j14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87153g(question) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87153g(context) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i16 = i14 & 64;
        if (i16 != 0) {
            i15 |= 1572864;
            z14 = z4;
        } else {
            z14 = z4;
            if ((i13 & 1572864) == 0) {
                i15 |= c28655q.m87155h(z14) ? 1048576 : 524288;
            }
        }
        if ((i13 & 12582912) == 0) {
            i15 |= c28655q.m87155h(z16) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= c28655q.m87157i(selectedTime) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 38347923) != 38347922)) {
            if (i16 != 0) {
                z14 = false;
            }
            C36876c0 c36876c0 = new C36876c0(j7, j15, j14);
            C36875c c36875c = C36875c.f157714a;
            float fM118270b = z14 ? c36875c.m118270b() : c36875c.m118269a();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), fM118270b, 0.0f, 0.0f, 0.0f, 14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            boolean z17 = z14;
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (2.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC36907z.m118520c(question, context, AbstractC8693b.m21274h(context, c28655q, (i17 >> 15) & 14).length() > 0, null, c28655q, (i17 >> 12) & 126, 8);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(C2299e.f9112O);
            String strM21274h = AbstractC8693b.m21274h(timeString, c28655q, i17 & 14);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, horizontalAlignElement, c38072d.m121949b(c28655q, 6).getRecovery(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196600);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), fM118270b, 0.0f, 2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q, 6);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            z16 = z13;
            selectedTime = function1;
            AbstractC39330c.m125320b(c38072d.m121949b(c28655q, 6).getRecovery(), 0L, 0L, 0L, AbstractC37817c.m121344e(627532478, c28655q, new C2124a0(c36876c0, z16, selectedTime, interfaceC28601c1)), c28655q, 24576, 14);
            c28655q.m87173q(true);
            z15 = z17;
        } else {
            c28655q.m87138X();
            z15 = z14;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: w71.d0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC36880e0.m118306k(timeString, j7, j13, j14, question, context, z15, z16, selectedTime, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: f */
    private static final Float m118301f(InterfaceC28601c1 interfaceC28601c1) {
        return (Float) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: g */
    private static final void m118302g(InterfaceC28601c1 interfaceC28601c1, Float f13) {
        interfaceC28601c1.setValue(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m118303h(C36876c0 c36876c0, boolean z4, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Float fM118301f = m118301f(interfaceC28601c1);
            float fFloatValue = fM118301f != null ? fM118301f.floatValue() : c36876c0.m118271a();
            C18279e c18279e = new C18279e(0.0f, c36876c0.getTicks() - 1);
            int iM118273c = (int) (c36876c0.getTicks() - ((long) 2));
            int i14 = iM118273c < 0 ? 0 : iM118273c;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C35429g(11, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(c36876c0);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C32290f(function1, c36876c0, interfaceC28601c1, 27);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC17763k2.m50956d(C2314t.f9131w, z4, fFloatValue, c18279e, i14, interfaceC4339a, (Function1) objM87133R2, c28655q, 196614, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m118304i(InterfaceC28601c1 interfaceC28601c1) {
        m118302g(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m118305j(Function1 function1, C36876c0 c36876c0, InterfaceC28601c1 interfaceC28601c1, float f13) {
        m118302g(interfaceC28601c1, Float.valueOf(f13));
        function1.invoke(Long.valueOf(c36876c0.m118272b(f13)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m118306k(TextResource textResource, long j7, long j13, long j14, TextResource textResource2, TextResource textResource3, boolean z4, boolean z13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m118300e(textResource, j7, j13, j14, textResource2, textResource3, z4, z13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
