package bs1;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.calendar.CalendarDateModel;
import g51.C15493c;
import h91.C17027b;
import hy0.EnumC17753i0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kb1.AbstractC22328h;
import kb1.C22325e;
import kotlin.C2014l;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C26047n;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p163g1.AbstractC15170v4;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p238j0.C21084j;
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
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v81.AbstractC35798c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: bs1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aK\u0010\f\u001a\u00020\u00072\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lh91/b;", "Lcom/whoop/design/models/calendar/CalendarDateModel;", "Lcom/whoop/design/domain/calendar/CalendarDomainState;", "calendarDomainState", "", "showCalendar", "Lkotlin/Function0;", "Ll83/a0;", "hideCalendar", "Lkotlin/Function1;", "", "onEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lh91/b;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3587f {
    /* JADX INFO: renamed from: h */
    public static final void m10937h(C17027b<CalendarDateModel> calendarDomainState, boolean z4, InterfaceC4339a hideCalendar, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(calendarDomainState, "calendarDomainState");
        AbstractC22676k.m65750j(hideCalendar, "hideCalendar");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(860228289);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(calendarDomainState) : c28655q.m87157i(calendarDomainState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(hideCalendar) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            boolean zM87153g = c28655q.m87153g(interfaceC39171c);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C3578a(interfaceC39171c, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC1090b.m3351f(z4, null, AbstractC3788w0.m11588p(null, (Function1) objM87133R, 1).m11562a(AbstractC3788w0.m11576d(null, null, 13)).m11562a(AbstractC3788w0.m11577e(null, 1)), AbstractC3788w0.m11592t(3, null).m11563a(AbstractC3788w0.m11584l(null, null, null, 15)).m11563a(AbstractC3788w0.m11578f(null, 3)), null, AbstractC37817c.m121344e(939829657, c28655q, new C3580b(hideCalendar, calendarDomainState, onEvent, 0)), c28655q, ((i14 >> 3) & 14) | 199680, 18);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3582c(calendarDomainState, z4, hideCalendar, onEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final int m10938i(InterfaceC39171c interfaceC39171c, int i13) {
        return -interfaceC39171c.mo724F(40);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m10939j(InterfaceC4339a interfaceC4339a, C17027b c17027b, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1136a.m3599a(c2314t, "JournalCalendarTag"));
        C38072d c38072d = C38072d.f163053a;
        int i14 = C38072d.f163054b;
        long jM125422u = c38072d.m121949b(composer, i14).getBlack70();
        C17916v0 c17916v0 = AbstractC17918w0.f69621a;
        Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3407d, jM125422u, c17916v0);
        C21084j c21084j = new C21084j();
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(interfaceC4339a);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C3584d(interfaceC4339a, 0);
            c28655q.m87172p0(objM87133R);
        }
        Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3358c, c21084j, null, false, null, (InterfaceC4339a) objM87133R, 28);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
        Modifier modifierM3358c2 = AbstractC1092a.m3358c(c2314t, c38072d.m121949b(c28655q, i14).getBackgroundDarkAlt(), c17916v0);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
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
        EnumC17753i0 enumC17753i0 = EnumC17753i0.JOURNAL;
        int iM48082j = c17027b.getMonthOffset();
        boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87153g(interfaceC4339a);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C2014l(function1, interfaceC4339a, 2);
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function2 = (Function1) objM87133R2;
        boolean zM87153g3 = c28655q.m87153g(function1);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C3586e(function1, 0);
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function3 = (Function1) objM87133R3;
        Object objM87133R4 = c28655q.m87133R();
        if (objM87133R4 == c28676v0) {
            objM87133R4 = new C26047n(21);
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC35798c.m113506j(null, 0, iM48082j, 0.0f, function2, function3, enumC17753i0, c17027b, (InterfaceC4351m) objM87133R4, c28655q, (C17027b.f65485k << 21) | 102236160, 11);
        if (c17027b.getIsLoading()) {
            c28655q.m87150e0(1309880371);
            AbstractC15170v4.m43203c(AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i14).getStrain(), C17919x.m51541c(0.1f, c38072d.m121949b(c28655q, i14).getStrain()), c28655q, 6);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1310151373);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m10940k(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m10941l(Function1 function1, InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof C22325e) {
            C22325e c22325e = (C22325e) it;
            Object objM64155g = c22325e.m64155g();
            CalendarDateModel calendarDateModel = objM64155g instanceof CalendarDateModel ? (CalendarDateModel) objM64155g : null;
            Long cycleId = calendarDateModel != null ? calendarDateModel.getCycleId() : null;
            String string = c22325e.getCom.mapbox.common.HttpHeaders.DATE java.lang.String().toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            function1.invoke(new AbstractC3588g.b(cycleId, string));
        }
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m10942m(Function1 function1, int i13) {
        function1.invoke(new AbstractC3588g.a(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C15493c m10943n(C17027b calendar, int i13) {
        AbstractC22676k.m65750j(calendar, "calendar");
        return AbstractC22328h.m64210c(calendar, i13, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m10944o(C17027b c17027b, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m10937h(c17027b, z4, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
