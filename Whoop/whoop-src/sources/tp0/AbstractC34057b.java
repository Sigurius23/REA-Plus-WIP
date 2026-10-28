package tp0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15686n;
import j11.AbstractC21215r;
import kotlin.C2026r;
import l41.AbstractC23332d;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27283u0;
import ny0.AbstractC27285v0;
import ny0.EnumC27251e1;
import or2.C28205u0;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15002f0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
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
import p717lq2.C24678j;
import pp2.C29451o;
import qz0.AbstractC30795n;
import s90.C32290f;
import sp0.C32864d;
import wb3.AbstractC37056f;
import x81.C38072d;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: tp0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aq\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "isDateExpanded", "Lkotlin/Function0;", "Ll83/a0;", "onDateButtonClicked", "isTimeExpanded", "onTimeButtonClicked", "Lsp0/d;", "viewState", "Lor2/u0;", "localizedDateTimeFormatter", "Lzr2/a;", "dateAndTimeProvider", "Lkotlin/Function1;", "Lorg/joda/time/LocalDateTime;", "onDateTimeChange", "e", "(Landroidx/compose/ui/Modifier;ZLc93/a;ZLc93/a;Lsp0/d;Lor2/u0;Lzr2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "add-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34057b {
    /* JADX INFO: renamed from: e */
    public static final void m107634e(Modifier modifier, boolean z4, InterfaceC4339a onDateButtonClicked, boolean z13, InterfaceC4339a onTimeButtonClicked, C32864d viewState, C28205u0 localizedDateTimeFormatter, InterfaceC41070a dateAndTimeProvider, Function1 onDateTimeChange, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        AbstractC22676k.m65750j(onDateButtonClicked, "onDateButtonClicked");
        AbstractC22676k.m65750j(onTimeButtonClicked, "onTimeButtonClicked");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(onDateTimeChange, "onDateTimeChange");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1147754521);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            z14 = z4;
            i15 |= c28655q.m87155h(z14) ? 32 : 16;
        } else {
            z14 = z4;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onDateButtonClicked) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onTimeButtonClicked) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q.m87157i(viewState) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= (2097152 & i13) == 0 ? c28655q.m87153g(localizedDateTimeFormatter) : c28655q.m87157i(localizedDateTimeFormatter) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q.m87157i(dateAndTimeProvider) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= c28655q.m87157i(onDateTimeChange) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 38347923) != 38347922)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            float f13 = 1 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(modifier4, f13, 0.0f, 0.0f, 0.0f, 14);
            Modifier modifier5 = modifier4;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM103137e = viewState.getSelectedTimeTitleDisplay();
            int i18 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM103137e, c28655q, i18);
            C38072d c38072d = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            Modifier modifierM3429z = AbstractC1102d.m3429z(c2314t, null, 3);
            String strM21274h2 = AbstractC8693b.m21274h(viewState.getFormattedDateDisplay(), c28655q, i18);
            EnumC27251e1 enumC27251e1 = EnumC27251e1.FLEXIBLE;
            AbstractC27285v0.d dVar = new AbstractC27285v0.d(enumC27251e1, null, 2, null);
            int i24 = (AbstractC27285v0.d.f109209f << 12) | 6;
            AbstractC27283u0.m82318q(modifierM3429z, strM21274h2, null, null, dVar, z14, false, 0.0f, null, onDateButtonClicked, c28655q, ((i17 << 21) & 1879048192) | i24 | ((i17 << 12) & 458752), 460);
            int i25 = i17 >> 3;
            AbstractC15002f0.m43105a(z4, onDateButtonClicked, null, 0L, null, null, AbstractC37817c.m121344e(1826178490, c28655q, new C2026r(viewState, dateAndTimeProvider, onDateTimeChange, onDateButtonClicked, 22)), c28655q, (i25 & 14) | 1572864 | (i25 & 112), 60);
            c28655q = c28655q;
            c28655q.m87173q(true);
            AbstractC27283u0.m82318q(AbstractC1102d.m3429z(c2314t, null, 3), AbstractC8693b.m21274h(viewState.getFormattedTimeDisplay(), c28655q, i18), null, null, new AbstractC27285v0.d(enumC27251e1, null, 2, null), z13, false, 0.0f, null, onTimeButtonClicked, c28655q, i24 | ((i17 << 6) & 458752) | ((i17 << 15) & 1879048192), 460);
            c28655q.m87173q(true);
            if (z13) {
                c28655q.m87150e0(-1124836453);
                LocalTime localTime = viewState.getCurrentValue().toLocalTime();
                boolean zM85383l = localizedDateTimeFormatter.m85383l();
                Modifier modifierM44128d = AbstractC15686n.m44128d(c2314t, c28655q, 6);
                boolean zM87157i = c28655q.m87157i(viewState) | ((i17 & 234881024) == 67108864);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C29451o(onDateTimeChange, viewState, 11);
                    c28655q.m87172p0(objM87133R);
                }
                z15 = true;
                AbstractC23332d.m67560g(null, zM85383l, localTime, false, null, 0L, modifierM44128d, false, (InterfaceC4351m) objM87133R, c28655q, 3072, 177);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                z15 = true;
                c28655q.m87150e0(-1124447899);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z15);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24678j(modifier3, z4, onDateButtonClicked, z13, onTimeButtonClicked, viewState, localizedDateTimeFormatter, dateAndTimeProvider, onDateTimeChange, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m107635f(C32864d c32864d, InterfaceC41070a interfaceC41070a, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC23013y DropdownMenu, Composer composer, int i13) {
        AbstractC22676k.m65750j(DropdownMenu, "$this$DropdownMenu");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            LocalDate localDate = c32864d.getInitialValue().toLocalDate();
            AbstractC22676k.m65749i(localDate, "toLocalDate(...)");
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c32864d) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C32290f(function1, c32864d, interfaceC4339a, 10);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21215r.m59512d(localDate, 5, interfaceC41070a, (Function1) objM87133R, c28655q, 48, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m107636g(Function1 function1, C32864d c32864d, InterfaceC4339a interfaceC4339a, LocalDate it) {
        AbstractC22676k.m65750j(it, "it");
        LocalDateTime localDateTime = it.toLocalDateTime(c32864d.getCurrentValue().toLocalTime());
        AbstractC22676k.m65749i(localDateTime, "toLocalDateTime(...)");
        function1.invoke(localDateTime);
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m107637h(Function1 function1, C32864d c32864d, int i13, int i14) {
        LocalDateTime localDateTimeWithMinuteOfHour = c32864d.getCurrentValue().withHourOfDay(i13).withMinuteOfHour(i14);
        AbstractC22676k.m65749i(localDateTimeWithMinuteOfHour, "withMinuteOfHour(...)");
        function1.invoke(localDateTimeWithMinuteOfHour);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m107638i(Modifier modifier, boolean z4, InterfaceC4339a interfaceC4339a, boolean z13, InterfaceC4339a interfaceC4339a2, C32864d c32864d, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m107634e(modifier, z4, interfaceC4339a, z13, interfaceC4339a2, c32864d, c28205u0, interfaceC41070a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
