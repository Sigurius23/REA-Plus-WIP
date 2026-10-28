package q11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import com.stripe.android.core.model.Country;
import com.stripe.android.view.CountryTextInputLayout;
import com.whoop.advancedlabs.actionplan.view.ActionPlanFragment;
import com.whoop.domain.model.teams.share.SelectTeam;
import dp0.InterfaceC12251g;
import eq0.AbstractC13552x1;
import j93.AbstractC21478l0;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25247g0;
import nh1.C26723d;
import oe0.AbstractC27870e;
import og0.C27917c;
import p002a0.C0022g;
import p088dc.AbstractC11895b;
import p134f2.C14015d;
import p208i2.AbstractC17911t;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.EnumC18346a;
import p218ic.EnumC18371m0;
import p329n0.InterfaceC26064q;
import p390p1.C28624i0;
import p390p1.InterfaceC28601c1;
import p412q3.C29860a;
import p412q3.C29868e;
import p412q3.C29870f;
import p412q3.C29872g;
import p412q3.C29875i;
import p412q3.C29876j;
import p412q3.C29888v;
import p412q3.C29889w;
import p412q3.C29890x;
import p412q3.InterfaceC29874h;
import p420qc.C30191a;
import p420qc.C30193c;
import p420qc.C30203m;
import p420qc.C30204n;
import p420qc.C30206p;
import p420qc.C30211u;
import p459rf.C31341l;
import p490t0.C33252i;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.AbstractC30613s;
import p730qt2.C30612r;
import p733ry2.AbstractC31917f;
import pa0.C29036a;
import pb0.C29051b;
import pf.AbstractC29125c;
import pu2.C29553a;
import q32.C29952d;
import q81.AbstractC30049g;
import q81.C30050h;
import qa0.InterfaceC30109a;
import qb0.AbstractC30180b;
import qc0.C30216c;
import qe0.AbstractC30302c;
import qg0.AbstractC30343d;
import qh1.AbstractC30368c;
import qq0.C30547c;
import qs1.AbstractC30574a;
import qu2.AbstractC30640h;
import qx0.AbstractC30751g;
import qx0.AbstractC30752h;
import qx0.C30753i;
import r71.AbstractC31052b;
import r71.C31053c;
import rf2.C31361c;
import rk2.C31500d;
import rk2.C31501e;
import rp2.AbstractC31644d;
import rp2.C31642b;
import rq0.C31696t0;
import rs2.AbstractC31797c;
import rz0.AbstractC31926e;
import s31.AbstractC32106c;
import s31.C32108e;
import s32.AbstractC32111c;
import sc0.AbstractC32359g;
import sf2.C32448a;
import ud3.C34850x0;

/* JADX INFO: renamed from: q11.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C29793c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121812w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f121813x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f121814y;

    public /* synthetic */ C29793c(int i13, Object obj, Object obj2) {
        this.f121812w = i13;
        this.f121813x = obj;
        this.f121814y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        String strConcat;
        StringBuilder sb4;
        int i13;
        int i14 = this.f121812w;
        int i15 = 1;
        int i16 = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f121814y;
        Object obj3 = this.f121813x;
        switch (i14) {
            case 0:
                return AbstractC29794d.m91254h((Function1) obj3, (C29795e) obj2, obj);
            case 1:
                C29875i c29875i = (C29875i) obj2;
                InterfaceC29874h interfaceC29874h = (InterfaceC29874h) obj;
                String str = ((InterfaceC29874h) obj3) == interfaceC29874h ? " > " : "   ";
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                c29875i.getClass();
                if (!(interfaceC29874h instanceof C29860a)) {
                    if (interfaceC29874h instanceof C29889w) {
                        sb4 = new StringBuilder("SetComposingTextCommand(text.length=");
                        C29889w c29889w = (C29889w) interfaceC29874h;
                        sb4.append(c29889w.f122120a.f92135x.length());
                        sb4.append(", newCursorPosition=");
                        i13 = c29889w.f122121b;
                    } else if (interfaceC29874h instanceof C29888v) {
                        strConcat = ((C29888v) interfaceC29874h).toString();
                    } else if (interfaceC29874h instanceof C29870f) {
                        strConcat = ((C29870f) interfaceC29874h).toString();
                    } else if (interfaceC29874h instanceof C29872g) {
                        strConcat = ((C29872g) interfaceC29874h).toString();
                    } else if (interfaceC29874h instanceof C29890x) {
                        strConcat = ((C29890x) interfaceC29874h).toString();
                    } else if (interfaceC29874h instanceof C29876j) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (interfaceC29874h instanceof C29868e) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(interfaceC29874h.getClass()).getSimpleName();
                        if (simpleName == null) {
                            simpleName = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(simpleName);
                    }
                    sb5.append(strConcat);
                    return sb5.toString();
                }
                sb4 = new StringBuilder("CommitTextCommand(text.length=");
                C29860a c29860a = (C29860a) interfaceC29874h;
                sb4.append(c29860a.f122038a.f92135x.length());
                sb4.append(", newCursorPosition=");
                i13 = c29860a.f122039b;
                strConcat = AbstractC11895b.m31999r(sb4, i13, ')');
                sb5.append(strConcat);
                return sb5.toString();
            case 2:
                return AbstractC30049g.m92023K((C30050h) obj3, (InterfaceC28601c1) obj2, ((Integer) obj).intValue());
            case 3:
                return AbstractC30180b.m92387n((Function1) obj3, (C29051b) obj2, ((Boolean) obj).booleanValue());
            case 4:
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection, "_connection");
                ((C30193c) obj3).f123589b.insert(_connection, (C30191a) obj2);
                return c23454a0;
            case 5:
                InterfaceC33687a _connection2 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection2, "_connection");
                ((C30204n) obj3).f123612b.insert(_connection2, (C30203m) obj2);
                return c23454a0;
            case 6:
                String str2 = (String) obj3;
                C30211u c30211u = (C30211u) obj2;
                InterfaceC33687a _connection3 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection3, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection3.mo68212g1("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    interfaceC33689cMo68212g1.mo5354L(1, str2);
                    C0022g c0022g = new C0022g(0);
                    C0022g c0022g2 = new C0022g(0);
                    while (interfaceC33689cMo68212g1.mo5355e1()) {
                        String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(0);
                        if (!c0022g.containsKey(strMo5353J0)) {
                            c0022g.put(strMo5353J0, new ArrayList());
                        }
                        String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(0);
                        if (!c0022g2.containsKey(strMo5353J1)) {
                            c0022g2.put(strMo5353J1, new ArrayList());
                        }
                    }
                    interfaceC33689cMo68212g1.reset();
                    c30211u.m92431b(_connection3, c0022g);
                    c30211u.m92430a(_connection3, c0022g2);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC33689cMo68212g1.mo5355e1()) {
                        String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(i16);
                        EnumC18371m0 enumC18371m0M60407M = AbstractC21478l0.m60407M((int) interfaceC33689cMo68212g1.getLong(i15));
                        byte[] blob = interfaceC33689cMo68212g1.getBlob(2);
                        C18358g c18358g = C18358g.f71479b;
                        C18358g c18358gM88543t = AbstractC29125c.m88543t(blob);
                        int i17 = (int) interfaceC33689cMo68212g1.getLong(3);
                        int i18 = (int) interfaceC33689cMo68212g1.getLong(4);
                        long j7 = interfaceC33689cMo68212g1.getLong(14);
                        long j13 = interfaceC33689cMo68212g1.getLong(15);
                        long j14 = interfaceC33689cMo68212g1.getLong(16);
                        C0022g c0022g3 = c0022g;
                        EnumC18346a enumC18346aM60404J = AbstractC21478l0.m60404J((int) interfaceC33689cMo68212g1.getLong(17));
                        long j15 = interfaceC33689cMo68212g1.getLong(18);
                        long j16 = interfaceC33689cMo68212g1.getLong(19);
                        int i19 = (int) interfaceC33689cMo68212g1.getLong(20);
                        long j17 = interfaceC33689cMo68212g1.getLong(21);
                        int i24 = (int) interfaceC33689cMo68212g1.getLong(22);
                        C18354e c18354e = new C18354e(AbstractC21478l0.m60434g0(interfaceC33689cMo68212g1.getBlob(6)), AbstractC21478l0.m60405K((int) interfaceC33689cMo68212g1.getLong(5)), ((int) interfaceC33689cMo68212g1.getLong(7)) != 0, ((int) interfaceC33689cMo68212g1.getLong(8)) != 0, ((int) interfaceC33689cMo68212g1.getLong(9)) != 0, ((int) interfaceC33689cMo68212g1.getLong(10)) != 0, interfaceC33689cMo68212g1.getLong(11), interfaceC33689cMo68212g1.getLong(12), AbstractC21478l0.m60442m(interfaceC33689cMo68212g1.getBlob(13)));
                        Object objM73986U = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(0), c0022g3);
                        AbstractC22676k.m65749i(objM73986U, "getValue(...)");
                        Object objM73986U2 = AbstractC25247g0.m73986U(interfaceC33689cMo68212g1.mo5353J0(0), c0022g2);
                        AbstractC22676k.m65749i(objM73986U2, "getValue(...)");
                        arrayList.add(new C30206p(strMo5353J2, enumC18371m0M60407M, c18358gM88543t, j7, j13, j14, c18354e, i17, enumC18346aM60404J, j15, j16, i19, i18, j17, i24, (List) objM73986U, (List) objM73986U2));
                        c0022g = c0022g3;
                        i16 = 0;
                        i15 = 1;
                        break;
                    }
                    return arrayList;
                } finally {
                    interfaceC33689cMo68212g1.close();
                }
            case 7:
                return AbstractC30302c.m92644y((AbstractC27870e.c) obj2, (Function1) obj3, ((Boolean) obj).booleanValue());
            case 8:
                return AbstractC30343d.m92720k((C27917c.d) obj2, (Function1) obj3, (InterfaceC26064q) obj);
            case 9:
                return AbstractC30368c.m92844d((Function1) obj3, (C26723d) obj2, ((Integer) obj).intValue());
            case 10:
                return C30547c.m93639c((Function1) obj3, (SelectTeam) obj2, (View) obj);
            case 11:
                return AbstractC30574a.m93742H((List) obj3, (InterfaceC4339a) obj2, (InterfaceC26064q) obj);
            case 12:
                return AbstractC30613s.m93971q((Function1) obj3, (C30612r) obj2, obj);
            case 13:
                return AbstractC30640h.m94139k0((C29553a) obj2, (Function1) obj3, ((Boolean) obj).booleanValue());
            case 14:
                return AbstractC30751g.m94464s((AbstractC30752h.c) obj3, (C30753i) obj2, (InterfaceC26064q) obj);
            case 15:
                return AbstractC31052b.m95588o((C31053c) obj2, (Function1) obj3, (InterfaceC26064q) obj);
            case 16:
                C31341l c31341l = (C31341l) obj3;
                C34850x0 c34850x0 = (C34850x0) obj2;
                if (((Throwable) obj) != null) {
                    c31341l.m96421a();
                }
                c34850x0.f146778G.close();
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return ((C31361c) obj3).m96454v((C32448a) obj2, (InterfaceC33687a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C31500d) obj3).m97058l((C31501e) obj2, (InterfaceC33687a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC31644d.m97801f((Function1) obj3, (C31642b) obj2, ((Boolean) obj).booleanValue());
            case 20:
                return C31696t0.m98218P0((C31696t0) obj3, (AbstractC13552x1) obj2, ((Integer) obj).intValue());
            case 21:
                return AbstractC31797c.m98791z((InterfaceC2994c0) obj3, (InterfaceC12251g) obj2, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC31917f.m99352j((InterfaceC1585g0) obj3, (InterfaceC28601c1) obj2, (C28624i0) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC31926e.m99382q((C33252i) obj3, (AbstractC17911t) obj2, (C14015d) obj);
            case 24:
                return AbstractC32106c.m99907g((C32108e) obj2, (Function1) obj3, (Modifier) obj);
            case 25:
                return AbstractC32111c.m99950s((Function1) obj3, (C29952d.b) obj2, obj);
            case 26:
                ViewGroup it = (ViewGroup) obj;
                InterfaceC21493z[] interfaceC21493zArr = CountryTextInputLayout.f22528k1;
                AbstractC22676k.m65750j(it, "it");
                View viewInflate = LayoutInflater.from((Context) obj3).inflate(((CountryTextInputLayout) obj2).f22530e1, it, false);
                AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                return (TextView) viewInflate;
            case 27:
                CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) obj3;
                String str3 = (String) obj2;
                Country country = (Country) obj;
                InterfaceC21493z[] interfaceC21493zArr2 = CountryTextInputLayout.f22528k1;
                countryTextInputLayout.setSelectedCountryCode$payments_core_release(country != null ? country.getCode() : null);
                if (country != null) {
                    countryTextInputLayout.setError(null);
                    countryTextInputLayout.setErrorEnabled(false);
                } else {
                    countryTextInputLayout.setError(str3);
                    countryTextInputLayout.setErrorEnabled(true);
                }
                return c23454a0;
            case 28:
                return ActionPlanFragment.m17261I((C29036a) obj3, (ActionPlanFragment) obj2, (InterfaceC30109a) obj);
            default:
                return AbstractC32359g.m100756o((Function1) obj3, (C30216c.c) obj2, (EnumC3919c) obj);
        }
    }

    public /* synthetic */ C29793c(Object obj, Function1 function1, int i13) {
        this.f121812w = i13;
        this.f121814y = obj;
        this.f121813x = function1;
    }
}
