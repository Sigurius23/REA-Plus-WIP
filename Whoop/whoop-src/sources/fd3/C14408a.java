package fd3;

import ad3.C0783z;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c31.EnumC3919c;
import ce0.AbstractC4489d;
import com.whoop.bot.models.feedback.FeedbackReason;
import com.whoop.universalcheckout.features.cart.view.UniversalCartDialogFragment;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import com.whoop.whooplabs.data.domain.OptionSelection;
import com.whoop.whooplabs.data.domain.ProtocolStep;
import com.whoop.whooplabs.data.domain.ProtocolStepConfig;
import com.whoop.whooplabs.data.room.entity.LastKnownStrapInfo;
import com.whoop.whooplabs.data.room.entity.WhoopLabsStudyTag;
import e32.C12618e;
import ep2.C13431c;
import fe0.AbstractC14415e;
import fj1.AbstractC14531b;
import fj1.C14532c;
import fx2.C14855g;
import fz0.AbstractC14888c;
import fz0.C14889d;
import g11.AbstractC15219c;
import g11.C15220d;
import g31.C15297a;
import g31.C15300d;
import g32.AbstractC15311k;
import g32.C15313m;
import g40.C15344e2;
import g40.C15430u2;
import g40.C15454z1;
import g40.InterfaceC15391m3;
import gh0.AbstractC15850e;
import gp2.AbstractC16070e;
import h20.AbstractC16632b4;
import java.time.LocalDate;
import java.util.Map;
import l83.C23454a0;
import live.hms.video.connection.stats.clientside.manager.StatsSamplingManager;
import p042c2.EnumC3869n;
import p077d0.C11368k;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15180w4;
import p163g1.C14951a4;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p180h0.AbstractC16412k1;
import p180h0.C16360a3;
import p180h0.C16372c3;
import p180h0.C16379d4;
import p180h0.C16381e0;
import p180h0.C16396h0;
import p180h0.C16407j1;
import p180h0.C16410k;
import p180h0.C16422m1;
import p180h0.C16430o;
import p180h0.C16465v;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16356a;
import p180h0.InterfaceC16392g1;
import p181h2.C16617b;
import p208i2.C17919x;
import p270k2.C22134h;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.C22958g0;
import p291l0.C22966i0;
import p291l0.InterfaceC22940b2;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p445r0.InterfaceC30833a;
import p446r1.C30849c;
import p500tb.InterfaceC33687a;
import p635y2.InterfaceC39147y;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22663d0;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: fd3.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C14408a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52554w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f52555x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f52556y;

    public /* synthetic */ C14408a(int i13, Object obj, Object obj2) {
        this.f52554w = i13;
        this.f52555x = obj;
        this.f52556y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f52554w;
        int i14 = 0;
        InterfaceC30057d interfaceC30057d = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f52556y;
        Object obj3 = this.f52555x;
        switch (i13) {
            case 0:
                return StatsSamplingManager.collectSubscribeStats$lambda$10$lambda$9((StatsSamplingManager) obj3, (Map) obj2, (String) obj);
            case 1:
                return AbstractC14415e.m41074O((AbstractC4489d.c) obj3, (Function1) obj2, (EnumC3919c) obj);
            case 2:
                return AbstractC14531b.m41473f((C14532c) obj3, (Function1) obj2, (Modifier) obj);
            case 3:
                return ((C14855g) obj3).m42827T0((ProtocolStep) obj2, (InterfaceC33687a) obj);
            case 4:
                return ((C14855g) obj3).m42823R0((ProtocolStepConfig) obj2, (InterfaceC33687a) obj);
            case 5:
                return ((C14855g) obj3).m42835X0((LastKnownStrapInfo) obj2, (InterfaceC33687a) obj);
            case 6:
                return ((C14855g) obj3).m42829U0((LabsCampaign) obj2, (InterfaceC33687a) obj);
            case 7:
                return ((C14855g) obj3).m42839Z0((WhoopLabsStudyTag) obj2, (InterfaceC33687a) obj);
            case 8:
                return ((C14855g) obj3).m42825S0((OptionSelection) obj2, (InterfaceC33687a) obj);
            case 9:
                return AbstractC14888c.m42962h((C14889d) obj3, (InterfaceC28601c1) obj2, (InterfaceC39171c) obj);
            case 10:
                InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) obj3;
                InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) obj2;
                InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                float fMo743q0 = interfaceC22131e.mo743q0(AbstractC15180w4.f56978f);
                float f13 = fMo743q0 / 2;
                InterfaceC22131e.m63379M(interfaceC22131e, ((C17919x) interfaceC28670t2.getValue()).f69639a, interfaceC22131e.mo743q0(AbstractC15180w4.f56976d) - f13, 0L, 0.0f, new C22135i(fMo743q0, 0.0f, 0, 0, null, 30), 108);
                if (Float.compare(((C39174f) interfaceC28670t3.getValue()).f168413w, 0) > 0) {
                    InterfaceC22131e.m63379M(interfaceC22131e, ((C17919x) interfaceC28670t2.getValue()).f69639a, interfaceC22131e.mo743q0(((C39174f) interfaceC28670t3.getValue()).f168413w) - f13, 0L, 0.0f, C22134h.f85857a, 108);
                }
                return c23454a0;
            case 11:
                ((C14951a4) obj3).f55782a.setValue(new C22958g0((C22966i0) obj2, (InterfaceC22940b2) obj));
                return c23454a0;
            case 12:
                return AbstractC15219c.m43241H((Function1) obj3, (C15220d) obj2, (LocalDate) obj);
            case 13:
                return C15297a.m43414d((Function1) obj3, (C15300d) obj2, ((Integer) obj).intValue());
            case 14:
                return AbstractC15311k.m43463I((C12618e) obj3, (C15313m) obj2, (AbstractC16632b4) obj);
            case 15:
                C22659b0 c22659b0 = (C22659b0) obj3;
                C22665e0 c22665e0 = (C22665e0) obj2;
                InterfaceC39147y layoutCoordinates = (InterfaceC39147y) obj;
                AbstractC22676k.m65750j(layoutCoordinates, "layoutCoordinates");
                if (!c22659b0.f89329w) {
                    c22665e0.f89334w += (int) (layoutCoordinates.mo3541n() & 4294967295L);
                    c22659b0.f89329w = true;
                }
                return c23454a0;
            case 16:
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj3;
                InterfaceC30833a interfaceC30833a = (InterfaceC30833a) obj2;
                InterfaceC15250v it = (InterfaceC15250v) obj;
                AbstractC22676k.m65750j(it, "it");
                if (((EnumC15251w) it).m43354b()) {
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C15344e2(interfaceC30833a, interfaceC30057d, i14), 3);
                }
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C15454z1 c15454z1 = (C15454z1) obj3;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj2;
                InterfaceC15250v it3 = (InterfaceC15250v) obj;
                AbstractC22676k.m65750j(it3, "it");
                EnumC15251w enumC15251w = (EnumC15251w) it3;
                if (((Boolean) interfaceC28601c1.getValue()).booleanValue() != enumC15251w.m43354b()) {
                    AbstractC13673n.m38550B(enumC15251w.m43354b(), c15454z1.f58053h, null);
                }
                interfaceC28601c1.setValue(Boolean.valueOf(enumC15251w.m43354b()));
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((Boolean) obj).getClass();
                AbstractC13673n.m38550B(!((Boolean) ((InterfaceC28601c1) obj2).getValue()).booleanValue(), ((C15430u2) obj3).f58000b, null);
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                InterfaceC15391m3 interfaceC15391m3 = (InterfaceC15391m3) obj3;
                Function1 function1 = (Function1) obj2;
                String it4 = (String) obj;
                AbstractC22676k.m65750j(it4, "it");
                EnumC3869n enumC3869nMo43565k = interfaceC15391m3.mo43565k();
                if (enumC3869nMo43565k != null) {
                    function1.invoke(enumC3869nMo43565k.name());
                }
                interfaceC15391m3.mo43571q(it4);
                return c23454a0;
            case 20:
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) obj3;
                InterfaceC15391m3 interfaceC15391m4 = (InterfaceC15391m3) obj2;
                InterfaceC15250v it5 = (InterfaceC15250v) obj;
                AbstractC22676k.m65750j(it5, "it");
                EnumC15251w enumC15251w2 = (EnumC15251w) it5;
                if (((Boolean) interfaceC28601c2.getValue()).booleanValue() != enumC15251w2.m43354b()) {
                    interfaceC15391m4.mo43562g(enumC15251w2.m43354b());
                }
                interfaceC28601c2.setValue(Boolean.valueOf(enumC15251w2.m43354b()));
                return c23454a0;
            case 21:
                return AbstractC15850e.m44710F((Function1) obj3, (FeedbackReason) obj2, ((Boolean) obj).booleanValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return UniversalCartDialogFragment.m27678a0((UniversalCartDialogFragment) obj3, (InterfaceC28670t2) obj2, obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC16070e.m45392l((C13431c.d) obj3, (Function1) obj2, (InterfaceC26064q) obj);
            case 24:
                C16410k c16410k = (C16410k) obj3;
                InterfaceC16356a interfaceC16356a = (InterfaceC16356a) obj2;
                long j7 = ((C16396h0) obj).f63037a;
                long jM47193i = c16410k.m46595k1() ? C16617b.m47193i(-1.0f, j7) : C16617b.m47193i(1.0f, j7);
                ((C16430o) interfaceC16356a).m46600b(c16410k.f63069Z.m46614d(Float.intBitsToFloat((int) (c16410k.f63070a0 == EnumC16377d2.f62971w ? jM47193i & 4294967295L : jM47193i >> 32))), 0.0f);
                return c23454a0;
            case 25:
                ((C30849c) ((C0783z) obj3).f2818x).m94893k((C16465v) obj2);
                return c23454a0;
            case 26:
                InterfaceC16392g1 interfaceC16392g1 = (InterfaceC16392g1) obj3;
                C16422m1 c16422m1 = (C16422m1) obj2;
                long j13 = ((C16396h0) obj).f63037a;
                long jM47193i2 = c16422m1.f63119e0 ? C16617b.m47193i(-1.0f, j13) : C16617b.m47193i(1.0f, j13);
                EnumC16377d2 enumC16377d2 = c16422m1.f63115a0;
                C16407j1 c16407j1 = AbstractC16412k1.f63074a;
                interfaceC16392g1.mo29024a(Float.intBitsToFloat((int) (enumC16377d2 == EnumC16377d2.f62971w ? jM47193i2 & 4294967295L : jM47193i2 >> 32)));
                return c23454a0;
            case 27:
                C16360a3 c16360a3 = (C16360a3) obj3;
                long j14 = ((C16396h0) obj).f63037a;
                c16360a3.m46563a(1, ((C16372c3) obj2).f62939d == EnumC16377d2.f62972x ? C16617b.m47185a(0.0f, 0.0f, j14, 1) : C16617b.m47185a(0.0f, 0.0f, j14, 2));
                return c23454a0;
            case 28:
                C22663d0 c22663d0 = (C22663d0) obj3;
                C11368k c11368k = (C11368k) obj;
                ((C16381e0) obj2).f62982a.f63002a.invoke(Float.valueOf(c22663d0.f89331w != 0.0f ? ((Number) c11368k.f36440e.getValue()).floatValue() / c22663d0.f89331w : 1.0f), new C16617b(0L), Float.valueOf(0.0f));
                c22663d0.f89331w = ((Number) c11368k.f36440e.getValue()).floatValue();
                return c23454a0;
            default:
                C16379d4 c16379d4 = (C16379d4) obj3;
                ((Long) obj).longValue();
                float f14 = c16379d4.f62979e;
                c16379d4.f62979e = 0.0f;
                ((Function1) obj2).invoke(Float.valueOf(f14));
                return c23454a0;
        }
    }
}
