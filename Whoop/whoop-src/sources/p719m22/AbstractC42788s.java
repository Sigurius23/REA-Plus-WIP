package p719m22;

import a22.AbstractC0172a;
import a22.AbstractC0173b;
import am2.C1018g;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c41.C4006d0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import hy0.AbstractC17746g1;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import k71.C22241a0;
import kotlin.C1992c;
import l83.C23454a0;
import ny0.AbstractC27271o0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11348f;
import p077d0.C11344e;
import p077d0.C11347e2;
import p180h0.AbstractC16486z0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28690z0;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34452c0;
import p512u2.C34472r;
import p512u2.InterfaceC34476v;
import p571w3.C36775k;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39180l;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p723o22.AbstractC27468b;
import p723o22.Function0;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: m22.s, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\u0005\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\u0007\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\r\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onBackClicked", "notYourDeviceClicked", "onTriggerConnecting", "u", "(Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "l", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "dragPercentage", "Landroidx/compose/ui/Modifier;", "modifier", "s", "(FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "j", "(FLc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "z", "(Landroidx/compose/runtime/Composer;I)V", "boxHeight", "pairing-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC42788s {

    /* JADX INFO: renamed from: m22.s$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28690z0 f97697E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC4339a f97698F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC2994c0 f97699w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C11344e f97700x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f97701y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28690z0 f97702z;

        /* JADX INFO: renamed from: m22.s$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.pairing.ui.view.SingleDevicePairingScreenKt$Content$1$2$2$1$1$1", m100430f = "SingleDevicePairingScreen.kt", m100431l = {134}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41982a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28690z0 f97703E;

            /* JADX INFO: renamed from: w */
            int f97704w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11344e f97705x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ float f97706y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28690z0 f97707z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41982a(C11344e c11344e, float f13, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, InterfaceC30057d<? super C41982a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f97705x = c11344e;
                this.f97706y = f13;
                this.f97707z = interfaceC28690z0;
                this.f97703E = interfaceC28690z1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: h */
            public static final C23454a0 m73260h(float f13, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, C11344e c11344e) {
                AbstractC42788s.m73242n(interfaceC28690z1, (((Number) c11344e.m30549e()).floatValue() / (AbstractC42788s.m73243o(interfaceC28690z0) - f13)) * 100.0f);
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41982a(this.f97705x, this.f97706y, this.f97707z, this.f97703E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41982a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f97704w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11344e c11344e = this.f97705x;
                    Float f13 = new Float(0.0f);
                    C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(500, 0, null, 6);
                    final float f14 = this.f97706y;
                    final InterfaceC28690z0 interfaceC28690z0 = this.f97707z;
                    final InterfaceC28690z0 interfaceC28690z1 = this.f97703E;
                    Function1 function1 = new Function1() { // from class: m22.r
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return AbstractC42788s.a.C41982a.m73260h(f14, interfaceC28690z0, interfaceC28690z1, (C11344e) obj2);
                        }
                    };
                    this.f97704w = 1;
                    if (C11344e.m30547d(c11344e, f13, c11347e2M30574v, function1, this, 4) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: m22.s$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.pairing.ui.view.SingleDevicePairingScreenKt$Content$1$2$2$1$2$1", m100430f = "SingleDevicePairingScreen.kt", m100431l = {151}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f97708w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C11344e f97709x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ float f97710y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C11344e c11344e, float f13, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f97709x = c11344e;
                this.f97710y = f13;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f97709x, this.f97710y, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f97708w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C11344e c11344e = this.f97709x;
                    Float f13 = new Float(this.f97710y);
                    this.f97708w = 1;
                    if (c11344e.m30551g(f13, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC2994c0 interfaceC2994c0, C11344e c11344e, float f13, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, InterfaceC4339a interfaceC4339a) {
            this.f97699w = interfaceC2994c0;
            this.f97700x = c11344e;
            this.f97701y = f13;
            this.f97702z = interfaceC28690z0;
            this.f97697E = interfaceC28690z1;
            this.f97698F = interfaceC4339a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final C23454a0 m73257c(InterfaceC2994c0 interfaceC2994c0, C11344e c11344e, float f13, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C41982a(c11344e, f13, interfaceC28690z0, interfaceC28690z1, null), 3);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public static final C23454a0 m73258d(float f13, C11344e c11344e, InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, InterfaceC28690z0 interfaceC28690z0, InterfaceC28690z0 interfaceC28690z1, C34472r change, float f14) {
            AbstractC22676k.m65750j(change, "change");
            change.m108946a();
            float fM73243o = AbstractC42788s.m73243o(interfaceC28690z0) - f13;
            float fM36283m = AbstractC12889b.m36283m(((Number) c11344e.m30549e()).floatValue() + f14, 0.0f, fM73243o);
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(c11344e, fM36283m, null), 3);
            AbstractC42788s.m73242n(interfaceC28690z1, (fM36283m / fM73243o) * 100.0f);
            if (AbstractC42788s.m73241m(interfaceC28690z1) > 90.0f) {
                interfaceC4339a.invoke();
            }
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            final InterfaceC2994c0 interfaceC2994c0 = this.f97699w;
            final C11344e c11344e = this.f97700x;
            final float f13 = this.f97701y;
            final InterfaceC28690z0 interfaceC28690z0 = this.f97702z;
            final InterfaceC28690z0 interfaceC28690z1 = this.f97697E;
            InterfaceC4339a interfaceC4339a = new InterfaceC4339a() { // from class: m22.p
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    return AbstractC42788s.a.m73257c(interfaceC2994c0, c11344e, f13, interfaceC28690z0, interfaceC28690z1);
                }
            };
            final InterfaceC4339a interfaceC4339a2 = this.f97698F;
            Object objM46660i = AbstractC16486z0.m46660i(interfaceC34476v, null, interfaceC4339a, new InterfaceC4351m() { // from class: m22.q
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    return AbstractC42788s.a.m73258d(f13, c11344e, interfaceC2994c0, interfaceC4339a2, interfaceC28690z0, interfaceC28690z1, (C34472r) obj, fFloatValue);
                }
            }, interfaceC30057d, 5);
            return objM46660i == EnumC31071a.f128113w ? objM46660i : C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m73225A(int i13, Composer composer, int i14) {
        m73254z(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0203  */
    /* JADX WARN: Code duplicated, block: B:61:0x020e  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    private static final void m73238j(float f13, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1425008784);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3392n = AbstractC1099a.m3392n(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, (float) (((double) f13) * 0.5d), 1);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3392n);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                c28655q2.m87158i0();
                int i17 = i15;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                Modifier modifierM107879c = AbstractC34132o.m107879c(f13, c2314t);
                C2307m c2307m = C2299e.f9102E;
                C1100b c1100b = C1100b.f4583a;
                Modifier modifierMo3400a = c1100b.mo3400a(modifierM107879c, c2307m);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f555v);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C2886a c2886aM8419Q = c38072d.m121952e(c28655q2, i18).getT4();
                long jM125382b1 = c38072d.m121949b(c28655q2, i18).getWhite50();
                int i19 = C2886a.f11498d << 18;
                Modifier modifier5 = modifier4;
                AbstractC30795n.m94707h(strM92103Y, modifierMo3400a, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8419Q, null, c28655q2, 0, i19, 196600);
                float f14 = 1.0f - (f13 / 100.0f);
                AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f553t), c1100b.mo3400a(AbstractC34132o.m107879c(f14, c2314t), c2307m), c38072d.m121949b(c28655q2, i18).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getT4(), null, c28655q2, 0, i19, 196600);
                c28655q2.m87173q(true);
                float f15 = 4;
                AbstractC11266d.m30469w(3, f15, c2314t, c28655q2);
                AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, AbstractC34132o.m107879c(f14, c2314t)), false, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f554u)), null, null, null, null, null, false, null, interfaceC4339a, c28655q2, TextResource.$stable << 6, (i17 >> 3) & 14, MessageListItemViewType.POLL);
                c28655q = c28655q2;
                AbstractC25012a.m73388u(6, f15, c2314t, c28655q, true);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4006d0(f13, interfaceC4339a, modifier3, i13, i14, 5);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3392n2 = AbstractC1099a.m3392n(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, (float) (((double) f13) * 0.5d), 1);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3392n2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            c28655q2.m87158i0();
            int i110 = i15;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            Modifier modifierM107879c2 = AbstractC34132o.m107879c(f13, c2314t);
            C2307m c2307m2 = C2299e.f9102E;
            C1100b c1100b2 = C1100b.f4583a;
            Modifier modifierMo3400a2 = c1100b2.mo3400a(modifierM107879c2, c2307m2);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f555v);
            C38072d c38072d2 = C38072d.f163053a;
            int i111 = C38072d.f163054b;
            C2886a c2886aM8419Q2 = c38072d2.m121952e(c28655q2, i111).getT4();
            long jM125382b2 = c38072d2.m121949b(c28655q2, i111).getWhite50();
            int i112 = C2886a.f11498d << 18;
            Modifier modifier6 = modifier4;
            AbstractC30795n.m94707h(strM92103Y2, modifierMo3400a2, jM125382b2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8419Q2, null, c28655q2, 0, i112, 196600);
            float f16 = 1.0f - (f13 / 100.0f);
            AbstractC30795n.m94707h(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f553t), c1100b2.mo3400a(AbstractC34132o.m107879c(f16, c2314t), c2307m2), c38072d2.m121949b(c28655q2, i111).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i111).getT4(), null, c28655q2, 0, i112, 196600);
            c28655q2.m87173q(true);
            float f17 = 4;
            AbstractC11266d.m30469w(3, f17, c2314t, c28655q2);
            AbstractC27271o0.m82253b(AbstractC1102d.m3409f(1.0f, AbstractC34132o.m107879c(f16, c2314t)), false, AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC0173b.f554u)), null, null, null, null, null, false, null, interfaceC4339a, c28655q2, TextResource.$stable << 6, (i110 >> 3) & 14, MessageListItemViewType.POLL);
            c28655q = c28655q2;
            AbstractC25012a.m73388u(6, f17, c2314t, c28655q, true);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4006d0(f13, interfaceC4339a, modifier3, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m73239k(float f13, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m73238j(f13, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

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
    /* JADX INFO: renamed from: l */
    private static final void m73240l(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        char c3;
        Object aVar;
        InterfaceC28690z0 interfaceC28690z0;
        int i15;
        InterfaceC4339a interfaceC4339a3 = interfaceC4339a;
        InterfaceC4339a interfaceC4339a4 = interfaceC4339a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-455506826);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(interfaceC4339a3) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z1 = (InterfaceC28690z0) objM87133R;
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC11266d.m30468v(0.0f, c28655q);
            }
            InterfaceC28690z0 interfaceC28690z2 = (InterfaceC28690z0) objM87133R3;
            float fMo743q0 = interfaceC39171c.mo743q0(345);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC11348f.m30553a(0.0f);
                c28655q.m87172p0(objM87133R4);
            }
            C11344e c11344e = (C11344e) objM87133R4;
            float f13 = 2;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3396r(c2314t, 8 * f13, 0.0f, 2));
            int i16 = i14;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
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
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h("WHOOP 4.0", null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getT2(), null, c28655q, 6, C2886a.f11498d << 18, 196090);
            float f14 = 4;
            AbstractC11266d.m30469w(1, f14, c2314t, c28655q);
            m73254z(c28655q, 0);
            AbstractC11266d.m30469w(6, f14, c2314t, c28655q);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C24959n(interfaceC28690z2, 0);
                c28655q.m87172p0(objM87133R5);
            }
            Modifier modifierM3502b = AbstractC1132b.m3502b(modifierM3407d2, (Function1) objM87133R5);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3502b);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            boolean zM87147d = c28655q.m87147d(((Number) c11344e.m30549e()).floatValue()) | c28655q.m87147d(m73243o(interfaceC28690z2));
            Object objM87133R6 = c28655q.m87133R();
            if (zM87147d || objM87133R6 == c28676v0) {
                c3 = 0;
                float fFloatValue = (1.0f - ((((Number) c11344e.m30549e()).floatValue() / (m73243o(interfaceC28690z2) - fMo743q0)) * 0.5f)) * fMo743q0;
                float f15 = fMo743q0 / f13;
                if (fFloatValue < f15) {
                    fFloatValue = f15;
                }
                objM87133R6 = Float.valueOf(fFloatValue);
                c28655q.m87172p0(objM87133R6);
            } else {
                c3 = 0;
            }
            Modifier modifierM3411h = AbstractC1102d.m3411h(interfaceC39171c.mo734f0(((Number) objM87133R6).floatValue()), c2314t);
            C2307m c2307m = C2299e.f9115x;
            C1100b c1100b = C1100b.f4583a;
            Modifier modifierM7154a = AbstractC2294a.m7154a(2.0f, AbstractC1099a.m3392n(c1100b.mo3400a(modifierM3411h, c2307m), 0.0f, ((Number) c11344e.m30549e()).floatValue() / interfaceC39171c.getDensity(), 1));
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c11344e) | c28655q.m87147d(fMo743q0) | ((i16 & 112) == 32);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i || objM87133R7 == c28676v0) {
                interfaceC28690z0 = interfaceC28690z1;
                i15 = 0;
                interfaceC4339a4 = interfaceC4339a2;
                aVar = new a(interfaceC2994c0, c11344e, fMo743q0, interfaceC28690z2, interfaceC28690z0, interfaceC4339a4);
                c28655q.m87172p0(aVar);
            } else {
                interfaceC4339a4 = interfaceC4339a2;
                aVar = objM87133R7;
                interfaceC28690z0 = interfaceC28690z1;
                i15 = 0;
            }
            int i18 = i15;
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC0172a.f528h, c28655q, i15), null, AbstractC34452c0.m108903b(modifierM7154a, C23454a0.f92919a, (PointerInputEventHandler) aVar), null, C39102j.f168201c, 0.0f, null, c28655q, 24624, 104);
            m73247s(m73241m(interfaceC28690z0), AbstractC2294a.m7154a(c3, c1100b.mo3400a(c2314t, c2307m)), c28655q, i18, i18);
            C2307m c2307m2 = C2299e.f9105H;
            c28655q = c28655q;
            interfaceC4339a3 = interfaceC4339a;
            m73238j(m73241m(interfaceC28690z0), interfaceC4339a3, c1100b.mo3400a(c2314t, c2307m2), c28655q, (i16 << 3) & 112, 0);
            AbstractC27468b.m82891c(m73241m(interfaceC28690z0), AbstractC2294a.m7154a(0.0f, c1100b.mo3400a(c2314t, c2307m2)), c28655q, i18, i18);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1018g(interfaceC4339a3, interfaceC4339a4, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final float m73241m(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m73242n(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final float m73243o(InterfaceC28690z0 interfaceC28690z0) {
        return ((C28617g1) interfaceC28690z0).m87022x();
    }

    /* JADX INFO: renamed from: p */
    private static final void m73244p(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m73245q(InterfaceC28690z0 interfaceC28690z0, C39180l c39180l) {
        m73244p(interfaceC28690z0, ((int) (c39180l.f168422a & 4294967295L)) * 1.1f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m73246r(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m73240l(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m73247s(float f13, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-864926507);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC0172a.f523c, c28655q, 0), null, AbstractC34132o.m107879c(1.0f - (f13 / 100.0f), AbstractC1099a.m3392n(AbstractC1102d.m3411h(263, modifier), 0.0f, 200, 1)), null, C39102j.f168201c, 0.0f, null, c28655q, 24624, 104);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24960o(f13, modifier2, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m73248t(float f13, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m73247s(f13, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0139  */
    /* JADX WARN: Code duplicated, block: B:72:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x014a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:79:0x016e  */
    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public static final void m73249u(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, Composer composer, int i13, int i14) {
        InterfaceC4339a interfaceC4339a4;
        int i15;
        InterfaceC4339a interfaceC4339a5;
        int i16;
        InterfaceC4339a interfaceC4339a6;
        int i17;
        boolean z4;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        InterfaceC4339a interfaceC4339a9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a10;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(120404685);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            interfaceC4339a4 = interfaceC4339a;
        } else if ((i13 & 6) == 0) {
            interfaceC4339a4 = interfaceC4339a;
            i15 = (c28655q.m87157i(interfaceC4339a4) ? 4 : 2) | i13;
        } else {
            interfaceC4339a4 = interfaceC4339a;
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a5 = interfaceC4339a2;
                i15 |= c28655q.m87157i(interfaceC4339a5) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a6 = interfaceC4339a3;
                    if (c28655q.m87157i(interfaceC4339a6)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C24958m(0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                    } else {
                        interfaceC4339a7 = interfaceC4339a4;
                    }
                    if (i19 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24958m(1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a8 = interfaceC4339a5;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24958m(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a10 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a10 = interfaceC4339a6;
                    }
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(c2314t)));
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66723l);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Function0.m82899b(interfaceC4339a7, c28655q, i15 & 14);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    m73240l(interfaceC4339a8, interfaceC4339a10, c28655q, (i15 >> 3) & 126);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    interfaceC4339a9 = interfaceC4339a10;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4339a8 = interfaceC4339a5;
                    interfaceC4339a9 = interfaceC4339a6;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C1992c(interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 2);
                }
            }
            i15 |= 384;
            interfaceC4339a6 = interfaceC4339a3;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C24958m(0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a7 = interfaceC4339a4;
                }
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24958m(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a8 = interfaceC4339a5;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C24958m(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a10 = interfaceC4339a6;
                }
                C2314t c2314t2 = C2314t.f9131w;
                Modifier modifierM66723l2 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(c2314t2)));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66723l2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i5 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
                C0209i c0209i6 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i7 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
                Function0.m82899b(interfaceC4339a7, c28655q, i15 & 14);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
                m73240l(interfaceC4339a8, interfaceC4339a10, c28655q, (i15 >> 3) & 126);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a9 = interfaceC4339a10;
            } else {
                c28655q.m87138X();
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
                interfaceC4339a9 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C1992c(interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 2);
            }
        }
        i15 |= 48;
        interfaceC4339a5 = interfaceC4339a2;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a6 = interfaceC4339a3;
                if (c28655q.m87157i(interfaceC4339a6)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C24958m(0);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a7 = interfaceC4339a4;
                }
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24958m(1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a8 = interfaceC4339a5;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C24958m(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a10 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a10 = interfaceC4339a6;
                }
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM66723l3 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(c2314t3)));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM66723l3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i8 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i8, c23010xM66775a3);
                C0209i c0209i9 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m5);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N5);
                Function0.m82899b(interfaceC4339a7, c28655q, i15 & 14);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t3);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i9, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, modifierM118962N6);
                m73240l(interfaceC4339a8, interfaceC4339a10, c28655q, (i15 >> 3) & 126);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a9 = interfaceC4339a10;
            } else {
                c28655q.m87138X();
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4339a8 = interfaceC4339a5;
                interfaceC4339a9 = interfaceC4339a6;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C1992c(interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 2);
            }
        }
        i15 |= 384;
        interfaceC4339a6 = interfaceC4339a3;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C24958m(0);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a7 = interfaceC4339a4;
            }
            if (i19 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C24958m(1);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a8 = interfaceC4339a5;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C24958m(2);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a10 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a10 = interfaceC4339a6;
            }
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM66723l4 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(c2314t4)));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM66723l4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i11 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i11, c23010xM66775a4);
            C0209i c0209i12 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m7);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i13 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
            Function0.m82899b(interfaceC4339a7, c28655q, i15 & 14);
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t4);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i12, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N8);
            m73240l(interfaceC4339a8, interfaceC4339a10, c28655q, (i15 >> 3) & 126);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            interfaceC4339a9 = interfaceC4339a10;
        } else {
            c28655q.m87138X();
            interfaceC4339a7 = interfaceC4339a4;
            interfaceC4339a8 = interfaceC4339a5;
            interfaceC4339a9 = interfaceC4339a6;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1992c(interfaceC4339a7, interfaceC4339a8, interfaceC4339a9, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m73250v() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m73251w() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m73252x() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m73253y(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, int i14, Composer composer, int i15) {
        m73249u(interfaceC4339a, interfaceC4339a2, interfaceC4339a3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    private static final void m73254z(Composer composer, int i13) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(700801790);
        if (c28655q2.m87135U(i13 & 1, i13 != 0)) {
            c28655q = c28655q2;
            AbstractC17746g1.m50874j(AbstractC8693b.m21278l("W // 4A0054321"), 0L, null, 0L, null, false, null, null, 0.0f, null, null, 0.0f, 0.0f, new C39274g(C38072d.f163053a.m121951d().getVarious().getEducation(), null, 2, 0 == true ? 1 : 0), null, 0.0f, null, null, null, 0, 0, null, null, c28655q, TextResource.$stable, C39274g.f168929c << 9, 0, 8380414);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22241a0(i13, 27);
        }
    }
}
