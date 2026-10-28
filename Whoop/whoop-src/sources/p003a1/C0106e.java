package p003a1;

import a20.C0170j;
import a30.C0274a0;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1640x1;
import androidx.room.C1778e;
import bc3.AbstractC3006f0;
import be.C3158k;
import bz.C3702a;
import bz.EnumC3703b;
import d30.C11552o;
import e10.C12541e;
import e10.C12543f;
import e10.C12545g;
import e10.C12547h;
import e10.C12559n;
import e10.C12568r0;
import e10.C12575v;
import e10.C12577w;
import e10.InterfaceC12549i;
import e10.InterfaceC12578x;
import e30.AbstractC12605c;
import ec3.C13045h2;
import g40.C15336d0;
import g40.C15389m1;
import g40.C15454z1;
import h20.C16657g;
import h20.C16687l;
import h20.C16776z4;
import k20.C22136a;
import k20.C22139d;
import k20.C22144i;
import k20.C22147l;
import k20.C22149n;
import kz.AbstractC22917n;
import l83.C23454a0;
import p000.C12473e;
import p005a3.AbstractC0201g;
import p025b1.AbstractC2218i;
import p025b1.InterfaceC2216g;
import p031b9.AbstractC2875y;
import p033bk.C3337e;
import p181h2.C16617b;
import p266jz.AbstractC22067o;
import p568w0.C36625a;
import p664yy.InterfaceC39847a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q20.AbstractC29840y;
import q83.InterfaceC30057d;
import tg.C33775g;
import tg.InterfaceC33773e;
import y00.EnumC38853i;

/* JADX INFO: renamed from: a1.e */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0106e extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f332w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0106e(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f332w = i15;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC12578x c12559n;
        switch (this.f332w) {
            case 0:
                long j7 = ((C16617b) obj).f63937a;
                C0110i c0110i = (C0110i) this.receiver;
                c0110i.getClass();
                InterfaceC2216g interfaceC2216g = (InterfaceC2216g) AbstractC0201g.m506f(c0110i, AbstractC2218i.f8839a);
                if (interfaceC2216g != null) {
                    AbstractC3006f0.m8732z(c0110i.m7158L0(), null, null, new C0109h(c0110i, interfaceC2216g, new C0108g(c0110i, j7), null, 0), 3);
                }
                return C23454a0.f92919a;
            case 1:
                ((C36625a) this.receiver).f156940b.m98a((Function1) obj);
                return C23454a0.f92919a;
            case 2:
                AbstractC22917n p13 = (AbstractC22917n) obj;
                AbstractC22676k.m65750j(p13, "p0");
                C0170j c0170j = (C0170j) this.receiver;
                c0170j.getClass();
                c0170j.f507F.m5004e(Boolean.FALSE, "key_has_launched");
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c0170j), null, null, new C12473e(p13, c0170j, (InterfaceC30057d) null, 3), 3);
                return C23454a0.f92919a;
            case 3:
                AbstractC22067o p14 = (AbstractC22067o) obj;
                AbstractC22676k.m65750j(p14, "p0");
                C0170j c0170j2 = (C0170j) this.receiver;
                c0170j2.getClass();
                c0170j2.f507F.m5004e(Boolean.FALSE, "key_has_launched");
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c0170j2), null, null, new C12473e(p14, c0170j2, (InterfaceC30057d) null, 2), 3);
                return C23454a0.f92919a;
            case 4:
                Throwable p15 = (Throwable) obj;
                AbstractC22676k.m65750j(p15, "p0");
                C0274a0 c0274a0 = (C0274a0) this.receiver;
                c0274a0.f942f.m94512b("Failure loading PaymentSheetState", p15);
                C22136a c22136a = c0274a0.f943g;
                c22136a.getClass();
                c22136a.m63389h(new C22149n(((C3702a) c22136a.f85867e).m11527a(EnumC3703b.f15151w), p15, 5), null);
                return C23454a0.f92919a;
            case 5:
                String p16 = (String) obj;
                AbstractC22676k.m65750j(p16, "p0");
                return ((C16657g) this.receiver).m47226a(p16);
            case 6:
                String p17 = (String) obj;
                AbstractC22676k.m65750j(p17, "p0");
                return ((C16657g) this.receiver).m47227b(p17);
            case 7:
                String p18 = (String) obj;
                AbstractC22676k.m65750j(p18, "p0");
                ((C22139d) this.receiver).m63402b(p18);
                return C23454a0.f92919a;
            case 8:
                String p19 = (String) obj;
                AbstractC22676k.m65750j(p19, "p0");
                ((C22136a) this.receiver).m63398r(p19);
                return C23454a0.f92919a;
            case 9:
                C16687l p24 = (C16687l) obj;
                AbstractC22676k.m65750j(p24, "p0");
                ((C16776z4) this.receiver).m47285f(p24);
                return C23454a0.f92919a;
            case 10:
                return ((C3158k) this.receiver).m9057d((InterfaceC30057d) obj);
            case 11:
                long jLongValue = ((Number) obj).longValue();
                C3337e c3337e = (C3337e) this.receiver;
                synchronized (c3337e) {
                    c3337e.m9641J(jLongValue, "events");
                }
                return C23454a0.f92919a;
            case 12:
                long jLongValue2 = ((Number) obj).longValue();
                C3337e c3337e2 = (C3337e) this.receiver;
                synchronized (c3337e2) {
                    c3337e2.m9641J(jLongValue2, "identifys");
                }
                return C23454a0.f92919a;
            case 13:
                long jLongValue3 = ((Number) obj).longValue();
                C3337e c3337e3 = (C3337e) this.receiver;
                synchronized (c3337e3) {
                    if (c3337e3.f12955z >= 4) {
                        c3337e3.m9641J(jLongValue3, "identify_interceptor");
                    }
                }
                return C23454a0.f92919a;
            case 14:
                String p25 = (String) obj;
                AbstractC22676k.m65750j(p25, "p0");
                C22136a c22136a2 = (C22136a) this.receiver;
                c22136a2.getClass();
                C22136a.m63387i(c22136a2, new C22144i(p25));
                return C23454a0.f92919a;
            case 15:
                EnumC38853i p26 = (EnumC38853i) obj;
                AbstractC22676k.m65750j(p26, "p0");
                C22136a c22136a3 = (C22136a) this.receiver;
                c22136a3.getClass();
                C22136a.m63387i(c22136a3, new C22147l(p26));
                return C23454a0.f92919a;
            case 16:
                InterfaceC39847a p27 = (InterfaceC39847a) obj;
                AbstractC22676k.m65750j(p27, "p0");
                C22136a c22136a4 = (C22136a) this.receiver;
                c22136a4.getClass();
                AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(c22136a4.f85869g), null, null, new C1778e(c22136a4, p27, null, 18), 3);
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                String p28 = (String) obj;
                AbstractC22676k.m65750j(p28, "p0");
                return ((InterfaceC33773e) this.receiver).m106778c(p28);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                String p29 = (String) obj;
                AbstractC22676k.m65750j(p29, "p0");
                return ((InterfaceC33773e) this.receiver).m106778c(p29);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String p32 = (String) obj;
                AbstractC22676k.m65750j(p32, "p0");
                return ((InterfaceC33773e) this.receiver).m106778c(p32);
            case 20:
                String p34 = (String) obj;
                AbstractC22676k.m65750j(p34, "p0");
                return ((InterfaceC33773e) this.receiver).m106779d(p34);
            case 21:
                ((AbstractC12605c) this.receiver).m35340z((AbstractC29840y) obj);
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                String p35 = (String) obj;
                AbstractC22676k.m65750j(p35, "p0");
                ((C22136a) this.receiver).m63398r(p35);
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                String p36 = (String) obj;
                AbstractC22676k.m65750j(p36, "p0");
                ((C22136a) this.receiver).m63395o(p36);
                return C23454a0.f92919a;
            case 24:
                String p37 = (String) obj;
                AbstractC22676k.m65750j(p37, "p0");
                ((C22139d) this.receiver).m63402b(p37);
                return C23454a0.f92919a;
            case 25:
                InterfaceC12549i p38 = (InterfaceC12549i) obj;
                AbstractC22676k.m65750j(p38, "p0");
                C12568r0 c12568r0 = (C12568r0) this.receiver;
                if (p38 instanceof C12545g) {
                    c12568r0.f42915c.m5003d("AwaitingConfirmationResult");
                    AbstractC3006f0.m8732z(c12568r0.f42914b, null, null, new C11552o(c12568r0, p38, null, 6), 3);
                } else {
                    c12568r0.getClass();
                    if (p38 instanceof C12547h) {
                        C12547h c12547h = (C12547h) p38;
                        c12559n = new C12577w(c12547h.f42862a, c12547h.f42863b, c12547h.f42864c);
                    } else if (p38 instanceof C12543f) {
                        C12543f c12543f = (C12543f) p38;
                        c12559n = new C12575v(c12543f.f42854a, c12543f.f42855b, c12543f.f42856c);
                    } else {
                        if (!(p38 instanceof C12541e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c12559n = new C12559n(((C12541e) p38).f42851a);
                    }
                    c12568r0.m35249e(c12559n);
                }
                return C23454a0.f92919a;
            case 26:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                C15336d0 c15336d0 = (C15336d0) this.receiver;
                if (!c15336d0.f57627b) {
                    c15336d0.f57627b = true;
                }
                C13045h2 c13045h2 = c15336d0.f57628c;
                c13045h2.getClass();
                c13045h2.m36571k(null, bool);
                return C23454a0.f92919a;
            case 27:
                String p39 = (String) obj;
                AbstractC22676k.m65750j(p39, "p0");
                C15389m1 c15389m1 = (C15389m1) this.receiver;
                c15389m1.getClass();
                String strM8299l = AbstractC2875y.m8299l(c15389m1.f57833a, p39);
                c15389m1.f57833a = strM8299l;
                if (strM8299l.length() == 6) {
                    c15389m1.m43596a(0, c15389m1.f57833a);
                    c15389m1.f57833a = "";
                }
                return C23454a0.f92919a;
            case 28:
                String p44 = (String) obj;
                AbstractC22676k.m65750j(p44, "p0");
                ((C15454z1) this.receiver).m43615v(p44);
                return C23454a0.f92919a;
            default:
                String p45 = (String) obj;
                AbstractC22676k.m65750j(p45, "p0");
                ((C15454z1) this.receiver).m43615v(p45);
                return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0106e(C33775g c33775g, int i13) {
        super(1, 0, InterfaceC33773e.class, c33775g, "encodableFromDecoded", "encodableFromDecoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;");
        this.f332w = i13;
        switch (i13) {
            case 20:
                super(1, 0, InterfaceC33773e.class, c33775g, "encodableFromEncoded", "encodableFromEncoded(Ljava/lang/String;)Laws/smithy/kotlin/runtime/text/encoding/Encodable;");
                break;
            default:
                break;
        }
    }
}
