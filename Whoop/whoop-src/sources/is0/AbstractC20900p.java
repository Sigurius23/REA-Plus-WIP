package is0;

import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.C19072b;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11348f;
import p163g1.C15043i8;
import p163g1.C15197y1;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15241m;
import p180h0.AbstractC16434o3;
import p181h2.C16617b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p510u0.C34348q0;
import p510u0.InterfaceC34345p0;
import p512u2.AbstractC34452c0;
import p512u2.InterfaceC34476v;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.InterfaceC30057d;
import qz0.AbstractC30784c;
import qz0.AbstractC30792k;
import qz0.AbstractC30795n;
import qz0.C30793l;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32417h;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: is0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001ag\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001aA\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\"\u001a\u0010$\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006(²\u0006\f\u0010%\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010&\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"", "slot", "", "E", "(I)Ljava/lang/String;", "Landroidx/compose/ui/Modifier;", "modifier", "Lis0/s0;", "viewState", "", "contentAlpha", "", "isExpanded", "Ly3/f;", "contentInsetHorizontal", "contentInsetBottom", "Lis0/a0;", "controls", "Lkotlin/Function1;", "Lis0/r0;", "Ll83/a0;", "onEvent", "Lj0/i;", "interactionSource", "m", "(Landroidx/compose/ui/Modifier;Lis0/s0;FZFFLis0/a0;Lkotlin/jvm/functions/Function1;Lj0/i;Landroidx/compose/runtime/Composer;II)V", "emoji", "isSending", "Lkotlin/Function0;", "onClick", "j", "(ILjava/lang/String;FZLc93/a;Landroidx/compose/runtime/Composer;II)V", "a", "F", "getQUICK_REACTION_CHIP_SIZE", "()F", "QUICK_REACTION_CHIP_SIZE", "focused", "hadFocus", "wasFocusable", "community-reactions-arch-mini_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20900p {

    /* JADX INFO: renamed from: a */
    private static final float f78708a = 12 * 4;

    /* JADX INFO: renamed from: is0.p$a */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsBarInputRowKt$ReactionsBarInputRow$2$1", m100430f = "ReactionsBarInputRow.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f78709E;

        /* JADX INFO: renamed from: w */
        int f78710w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C20907s0 f78711x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C20871a0 f78712y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f78713z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20907s0 c20907s0, C20871a0 c20871a0, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78711x = c20907s0;
            this.f78712y = c20871a0;
            this.f78713z = interfaceC28670t2;
            this.f78709E = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f78711x, this.f78712y, this.f78713z, this.f78709E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f78710w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC20900p.m57866u(this.f78713z) && !this.f78711x.getIsLoading()) {
                AbstractC20900p.m57868w(this.f78709E, true);
                this.f78712y.getOnFocused().invoke();
            } else if (!AbstractC20900p.m57866u(this.f78713z) && AbstractC20900p.m57867v(this.f78709E)) {
                AbstractC20900p.m57868w(this.f78709E, false);
                this.f78712y.getOnUnfocused().invoke();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: is0.p$b */
    @InterfaceC32271e(m100429c = "com.whoop.communityreactions.view.ReactionsBarInputRowKt$ReactionsBarInputRow$3$1", m100430f = "ReactionsBarInputRow.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78714w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C20871a0 f78715x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC15237i f78716y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f78717z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C20871a0 c20871a0, InterfaceC15237i interfaceC15237i, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78715x = c20871a0;
            this.f78716y = interfaceC15237i;
            this.f78717z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f78715x, this.f78716y, this.f78717z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f78714w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f78715x.getCanFocus() && AbstractC20900p.m57869x(this.f78717z)) {
                ((C15240l) this.f78716y).m43339b(true);
            }
            AbstractC20900p.m57870y(this.f78717z, this.f78715x.getCanFocus());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: is0.p$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f78718w = new c();

        /* JADX INFO: renamed from: a */
        public final long m57872a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m57872a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: is0.p$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f78719w = new d();

        /* JADX INFO: renamed from: a */
        public final long m57873a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m57873a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: is0.p$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements PointerInputEventHandler {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C20871a0 f78720w;

        public e(C20871a0 c20871a0) {
            this.f78720w = c20871a0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public static final C23454a0 m57875b(C20871a0 c20871a0, C16617b c16617b) {
            c20871a0.getOnExpandWithKeyboard().invoke();
            return C23454a0.f92919a;
        }

        @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
        public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C20902q(this.f78720w, 0), interfaceC30057d, 7);
            return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: E */
    public static final String m57845E(int i13) {
        return AbstractC2875y.m8295h(i13, "ReactionsQuickReaction_");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x0106  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0135  */
    /* JADX WARN: Code duplicated, block: B:73:0x0141  */
    /* JADX WARN: Code duplicated, block: B:75:0x0149  */
    /* JADX WARN: Code duplicated, block: B:76:0x014d  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    private static final void m57855j(int i13, String str, float f13, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i14, int i15) {
        int i16;
        int i17;
        float f14;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        InterfaceC4339a interfaceC4339a4;
        C2314t c2314t;
        C38072d c38072d;
        int i18;
        Modifier modifierM3362g;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f15;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(766271555);
        if ((i14 & 6) == 0) {
            i16 = i13;
            i17 = (c28655q2.m87149e(i16) ? 4 : 2) | i14;
        } else {
            i16 = i13;
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            f14 = f13;
            i17 |= c28655q2.m87147d(f14) ? 256 : 128;
        } else {
            f14 = f13;
        }
        if ((i14 & 3072) == 0) {
            i17 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i15 & 16;
        if (i19 == 0) {
            if ((i14 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i17 |= c28655q2.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i17 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i17 & 1, z13)) {
                if (i19 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C20886i(2);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                String strM57845E = m57845E(i16);
                c2314t = C2314t.f9131w;
                float f16 = 4;
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(f78708a, AbstractC1136a.m3599a(c2314t, strM57845E)), f16, f16);
                c38072d = C38072d.f163053a;
                i18 = C38072d.f163054b;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q2, i18).getWhite10(), AbstractC17918w0.f69621a);
                if (str == null) {
                    modifierM3362g = c2314t;
                } else {
                    modifierM3362g = AbstractC1092a.m3362g(c2314t, !z4, null, new C18027i(0), interfaceC4339a4, 10);
                }
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                Modifier modifierMo3471e = modifierM3358c.mo3471e(modifierM3362g);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                if (str == null) {
                    c28655q2.m87150e0(1578190568);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                } else {
                    c28655q2.m87150e0(1578190569);
                    if (z4) {
                        f15 = 0.4f;
                    } else {
                        f15 = f14;
                    }
                    AbstractC30795n.m94707h(str, AbstractC34132o.m107879c(f15, c2314t), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196604);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20898o(i13, str, f13, z4, interfaceC4339a3, i14, i15);
            }
        }
        i17 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i17 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i17 & 1, z13)) {
            if (i19 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C20886i(2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            String strM57845E2 = m57845E(i16);
            c2314t = C2314t.f9131w;
            float f17 = 4;
            Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(f78708a, AbstractC1136a.m3599a(c2314t, strM57845E2)), f17, f17);
            c38072d = C38072d.f163053a;
            i18 = C38072d.f163054b;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM53364e2, c38072d.m121949b(c28655q2, i18).getWhite10(), AbstractC17918w0.f69621a);
            if (str == null) {
                modifierM3362g = c2314t;
            } else {
                modifierM3362g = AbstractC1092a.m3362g(c2314t, !z4, null, new C18027i(0), interfaceC4339a4, 10);
            }
            InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
            Modifier modifierMo3471e2 = modifierM3358c2.mo3471e(modifierM3362g);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            if (str == null) {
                c28655q2.m87150e0(1578190568);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(1578190569);
                if (z4) {
                    f15 = 0.4f;
                } else {
                    f15 = f14;
                }
                AbstractC30795n.m94707h(str, AbstractC34132o.m107879c(f15, c2314t), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB1(), null, c28655q2, 0, C2886a.f11498d << 18, 196604);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20898o(i13, str, f13, z4, interfaceC4339a3, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m57856k() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m57857l(int i13, String str, float f13, boolean z4, InterfaceC4339a interfaceC4339a, int i14, int i15, Composer composer, int i16) {
        m57855j(i13, str, f13, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m */
    public static final void m57858m(Modifier modifier, final C20907s0 viewState, final float f13, final boolean z4, final float f14, final float f15, final C20871a0 controls, Function1 onEvent, InterfaceC21083i interfaceC21083i, Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        final InterfaceC21083i interfaceC21083i2;
        final Modifier modifier3;
        C28655q c28655q;
        InterfaceC21083i interfaceC21083i3;
        Object aVar;
        Object obj;
        int i16;
        final C20907s0 c20907s0;
        C20871a0 c20871a0;
        Object obj2;
        C2314t c2314t;
        boolean z13;
        Modifier modifierM3360e;
        final C20871a0 c20871a1;
        Object obj3;
        Object obj4;
        int i17;
        AbstractC30784c.a aVar2;
        boolean z14;
        C0209i c0209i;
        boolean z15;
        C28655q c28655q2;
        boolean z16;
        C28655q c28655q3;
        Object obj5;
        InterfaceC39332e interfaceC39332eM125323a;
        Object obj6;
        Object obj7;
        Object objM30453g;
        float f16 = f13;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(controls, "controls");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(74283023);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q4.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q4.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q4.m87147d(f16) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q4.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q4.m87147d(f14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q4.m87147d(f15) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c28655q4.m87153g(controls) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q4.m87157i(onEvent) ? 8388608 : 4194304;
        }
        int i19 = i14 & 256;
        if (i19 != 0) {
            i15 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            i15 |= c28655q4.m87153g(interfaceC21083i) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if (c28655q4.m87135U(i15 & 1, (i15 & 38347923) != 38347922)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i18 != 0 ? c2314t2 : modifier2;
            Object obj8 = C28635l.f115821a;
            if (i19 != 0) {
                Object objM87133R = c28655q4.m87133R();
                if (objM87133R == obj8) {
                    objM30453g = objM87133R;
                    objM30453g = AbstractC11266d.m30453g(c28655q4);
                }
                objM30453g = objM87133R;
                interfaceC21083i3 = (InterfaceC21083i) objM30453g;
            } else {
                interfaceC21083i3 = interfaceC21083i;
            }
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q4.m87161k(AbstractC2453v1.f9570i);
            Object objM87133R2 = c28655q4.m87133R();
            Object objM30453g2 = objM87133R2;
            if (objM87133R2 == obj8) {
                objM30453g2 = AbstractC11266d.m30453g(c28655q4);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM30453g2;
            int i24 = i15;
            InterfaceC28601c1 interfaceC28601c1M101215x = AbstractC32417h.m101215x(interfaceC21083i3, c28655q4, (i15 >> 24) & 14);
            boolean z17 = z4 && m57866u(interfaceC28601c1M101215x) && !viewState.getIsLoading();
            InterfaceC21083i interfaceC21083i5 = interfaceC21083i3;
            Object objM87133R3 = c28655q4.m87133R();
            Object obj9 = objM87133R3;
            if (objM87133R3 == obj8) {
                Object objM87272z = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87272z);
                obj9 = objM87272z;
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj9;
            Boolean boolValueOf = Boolean.valueOf(m57866u(interfaceC28601c1M101215x));
            int i25 = i24 & 3670016;
            boolean zM87153g = c28655q4.m87153g(interfaceC28601c1M101215x) | c28655q4.m87157i(viewState) | (i25 == 1048576);
            Object objM87133R4 = c28655q4.m87133R();
            if (zM87153g || objM87133R4 == obj8) {
                obj = obj8;
                i16 = i25;
                c20907s0 = viewState;
                c20871a0 = controls;
                aVar = new a(c20907s0, c20871a0, interfaceC28601c1M101215x, interfaceC28601c1, null);
                c28655q4.m87172p0(aVar);
            } else {
                c20871a0 = controls;
                obj = obj8;
                aVar = objM87133R4;
                i16 = i25;
                c20907s0 = viewState;
            }
            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) aVar, boolValueOf);
            Object objM87133R5 = c28655q4.m87133R();
            Object obj10 = objM87133R5;
            if (objM87133R5 == obj) {
                Object objM87272z2 = AbstractC28683x.m87272z(Boolean.valueOf(c20871a0.getCanFocus()));
                c28655q4.m87172p0(objM87272z2);
                obj10 = objM87272z2;
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) obj10;
            Boolean boolValueOf2 = Boolean.valueOf(c20871a0.getCanFocus());
            boolean zM87157i = (i16 == 1048576) | c28655q4.m87157i(r60);
            Object objM87133R6 = c28655q4.m87133R();
            Object obj11 = objM87133R6;
            if (zM87157i || objM87133R6 == obj) {
                Object bVar = new b(c20871a0, interfaceC15237i, interfaceC28601c2, null);
                c28655q4.m87172p0(bVar);
                obj11 = bVar;
            }
            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) obj11, boolValueOf2);
            Modifier modifierM3413j = AbstractC1102d.m3413j(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, modifier4), f14, 0.0f, f14, f15, 2), f78708a, 0.0f, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q4, 48);
            Object obj12 = obj;
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3413j);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N);
            boolean z18 = (c20871a0.getCanFocus() || c20907s0.getIsLoading()) ? false : true;
            Modifier modifier5 = modifier4;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3599a = AbstractC1136a.m3599a(new LayoutWeightElement(1.0f, true), "ReactionsBarInput");
            if (z18) {
                c28655q4.m87150e0(985183301);
                boolean z19 = i16 == 1048576;
                Object objM87133R7 = c28655q4.m87133R();
                if (z19) {
                    obj2 = obj12;
                } else {
                    obj2 = obj12;
                    if (objM87133R7 != obj2) {
                        z13 = false;
                        obj7 = objM87133R7;
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj7;
                    c2314t = c2314t2;
                    modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i4, null, false, null, interfaceC4339a2, 28);
                    c28655q4.m87173q(z13);
                }
                z13 = false;
                Object c20890k = new C20890k(c20871a0, false ? 1 : 0);
                c28655q4.m87172p0(c20890k);
                obj7 = c20890k;
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) obj7;
                c2314t = c2314t2;
                modifierM3360e = AbstractC1092a.m3360e(c2314t, interfaceC21083i4, null, false, null, interfaceC4339a3, 28);
                c28655q4.m87173q(z13);
            } else {
                obj2 = obj12;
                z18 = z18;
                c2314t = c2314t2;
                z13 = false;
                c28655q4.m87150e0(985423551);
                c28655q4.m87173q(false);
                modifierM3360e = c2314t;
            }
            Modifier modifierMo3471e = modifierM3599a.mo3471e(modifierM3360e);
            C2307m c2307m = C2299e.f9114w;
            int i26 = i24;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, z13);
            int iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierMo3471e);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N2);
            boolean z24 = z17 && !AbstractC39414r.m125890i0(controls.getDraft());
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            boolean zM87157i2 = (i16 == 1048576) | c28655q4.m87157i(c20907s0);
            Object objM87133R8 = c28655q4.m87133R();
            if (zM87157i2 || objM87133R8 == obj2) {
                c20871a1 = controls;
                Object obj13 = new Function1() { // from class: is0.l
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj14) {
                        return AbstractC20900p.m57860o(c20871a1, c20907s0, (InterfaceC15241m) obj14);
                    }
                };
                c28655q4.m87172p0(obj13);
                obj3 = obj13;
            } else {
                c20871a1 = controls;
                obj3 = objM87133R8;
            }
            Modifier modifierM3482a = AbstractC1126a.m3482a(modifierM3409f, (Function1) obj3);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c20871a1.getDraft());
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            boolean z25 = i16 == 1048576;
            Object objM87133R9 = c28655q4.m87133R();
            if (z25 || objM87133R9 == obj2) {
                Object c20902q = new C20902q(c20871a1, 1);
                c28655q4.m87172p0(c20902q);
                obj4 = c20902q;
            } else {
                obj4 = objM87133R9;
            }
            C34348q0 c34348q0 = new C34348q0(null, null, null, (Function1) obj4, 31);
            boolean z26 = c20871a1.getCanFocus() && c20871a1.getOpenKeyboardOnFocus();
            boolean z27 = !c20871a1.getEditable() || c20907s0.getIsLoading();
            float f17 = 4;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f17);
            C15043i8 c15043i8 = C15043i8.f56313a;
            C38072d c38072d = C38072d.f163053a;
            int i27 = C38072d.f163054b;
            C2314t c2314t3 = c2314t;
            Object obj14 = obj2;
            C15197y1 c15197y1M43130h = C15043i8.m43130h(c38072d.m121949b(c28655q4, i27).getBrandWhite(), 0L, c38072d.m121949b(c28655q4, i27).getBlack30(), c38072d.m121949b(c28655q4, i27).getBrandWhite(), 0L, c38072d.m121949b(c28655q4, i27).getWhite20(), c38072d.m121949b(c28655q4, i27).getWhite40(), 0L, 0L, 0L, 0L, 0L, 0L, c28655q4, 2097042);
            float f18 = ((float) 1.5d) * 8;
            float fM94699i = C30793l.f126917a.m94699i();
            C22976l1 c22976l1 = new C22976l1(f18, fM94699i, f18, fM94699i);
            if (z17) {
                c28655q4.m87150e0(-1280930142);
                int iM46410z = c38072d.m121951d().getGrowth().getSend();
                C39174f c39174f = new C39174f(f17 * f17);
                if (z24) {
                    c28655q4.m87150e0(-872598436);
                    Object objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == obj14) {
                        obj6 = objM87133R10;
                        Object obj15 = c.f78718w;
                        c28655q4.m87172p0(obj15);
                        obj6 = obj15;
                    }
                    obj6 = objM87133R10;
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) obj6);
                } else {
                    c28655q4.m87150e0(-872597509);
                    Object objM87133R11 = c28655q4.m87133R();
                    if (objM87133R11 == obj14) {
                        obj5 = objM87133R11;
                        Object obj16 = d.f78719w;
                        c28655q4.m87172p0(obj16);
                        obj5 = obj16;
                    }
                    obj5 = objM87133R11;
                    interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) obj5);
                }
                i17 = 0;
                c28655q4.m87173q(false);
                AbstractC30784c.a aVar3 = new AbstractC30784c.a(iM46410z, c39174f, interfaceC39332eM125323a, null, 8, null);
                c28655q4.m87173q(false);
                aVar2 = aVar3;
            } else {
                i17 = 0;
                c28655q4.m87150e0(-1280650863);
                c28655q4.m87173q(false);
                aVar2 = null;
            }
            boolean z28 = z26;
            Function1 onDraftChanged = c20871a1.getOnDraftChanged();
            C37816b c37816bM121344e = AbstractC37817c.m121344e(2073096201, c28655q4, new C20894m(f16, c20907s0, i17));
            boolean zM87155h = c28655q4.m87155h(z24) | (i16 == 1048576);
            Object objM87133R12 = c28655q4.m87133R();
            Object obj17 = objM87133R12;
            if (zM87155h || objM87133R12 == obj14) {
                Object c19072b = new C19072b(z24, c20871a1, 1);
                c28655q4.m87172p0(c19072b);
                obj17 = c19072b;
            }
            int i28 = TextResource.$stable;
            AbstractC30792k.m94678l(modifierM3482a, textResourceM21278l, null, null, null, null, c37816bM121344e, aVar2, textResourceM21267a, false, false, null, 0L, false, 1, 0, 4, z28, null, false, false, 4, z27, interfaceC21083i5, null, c33252iM105489e, c15197y1M43130h, c22976l1, null, c34348q0, (InterfaceC4339a) obj17, onDraftChanged, c28655q4, (i28 << 24) | (i28 << 3) | 1572864 | (AbstractC30784c.a.f126785f << 21), 1597440, ((i26 >> 15) & 7168) | 54, 0, 286047804, 0);
            if (z18) {
                c28655q4.m87150e0(-1280422207);
                Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t3);
                InterfaceC4339a onExpandWithKeyboard = c20871a1.getOnExpandWithKeyboard();
                boolean z29 = i16 == 1048576;
                Object objM87133R13 = c28655q4.m87133R();
                Object obj18 = objM87133R13;
                if (z29 || objM87133R13 == obj14) {
                    Object eVar = new e(c20871a1);
                    c28655q4.m87172p0(eVar);
                    obj18 = eVar;
                }
                Modifier modifierM108903b = AbstractC34452c0.m108903b(modifierMo3401b, onExpandWithKeyboard, (PointerInputEventHandler) obj18);
                z14 = 0;
                AbstractC22989q.m66760a(modifierM108903b, c28655q4, 0);
                c28655q4.m87173q(false);
            } else {
                z14 = 0;
                c28655q4.m87150e0(-1280118531);
                c28655q4.m87173q(false);
            }
            c28655q4.m87173q(true);
            Modifier modifierM3355a = AbstractC1091c.m3355a(c2314t3, AbstractC11348f.m30574v(300, z14, null, 6), 2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z14);
            int iHashCode3 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3355a);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i2, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N3);
            if (z17) {
                onEvent = onEvent;
                C28655q c28655q5 = c28655q4;
                z15 = true;
                c28655q5.m87150e0(1856135956);
                c28655q5.m87173q(z14);
                c28655q2 = c28655q5;
            } else {
                c28655q4.m87150e0(1854766531);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t3, f18, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f18), C2299e.f9107J, c28655q4, 6);
                int iHashCode4 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3398t);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m4);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N4);
                if (c20907s0.getIsLoading()) {
                    c28655q4.m87150e0(-2093787221);
                    int i29 = 0;
                    while (i29 < 2) {
                        int i34 = i26;
                        m57855j(i29, null, f16, false, null, c28655q4, (i34 & 896) | 3120, 16);
                        i29++;
                        f16 = f13;
                        i26 = i34;
                    }
                    C28655q c28655q6 = c28655q4;
                    z16 = false;
                    z15 = true;
                    c28655q6.m87173q(false);
                    c28655q3 = c28655q6;
                } else {
                    C28655q c28655q7 = c28655q4;
                    z16 = false;
                    z15 = true;
                    boolean z34 = true;
                    c28655q7.m87150e0(-2093529952);
                    int i35 = 0;
                    for (Object obj19 : AbstractC25265s.m74156w1(viewState.m57909f(), 2)) {
                        int i36 = i35 + 1;
                        if (i35 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        C20874c c20874c = (C20874c) obj19;
                        String strM57680a = c20874c.getEmoji();
                        boolean zM57682c = c20874c.getIsSending();
                        boolean zM87157i3 = ((29360128 & i26) == 8388608) | c28655q7.m87157i(c20874c);
                        Object objM87133R14 = c28655q7.m87133R();
                        if (zM87157i3 || objM87133R14 == obj14) {
                            objM87133R14 = new C20887i0(z34 ? 1 : 0, onEvent, c20874c);
                            c28655q7.m87172p0(objM87133R14);
                        }
                        m57855j(i35, strM57680a, f13, zM57682c, (InterfaceC4339a) objM87133R14, c28655q7, i26 & 896, 0);
                        i35 = i36;
                        obj14 = obj14;
                    }
                    c28655q7.m87173q(false);
                    c28655q3 = c28655q7;
                }
                c28655q3.m87173q(z15);
                c28655q3.m87173q(z16);
                c28655q2 = c28655q3;
            }
            c28655q2.m87173q(z15);
            c28655q2.m87173q(z15);
            interfaceC21083i2 = interfaceC21083i5;
            modifier3 = modifier5;
            c28655q = c28655q2;
        } else {
            onEvent = onEvent;
            C28655q c28655q8 = c28655q4;
            c28655q8.m87138X();
            interfaceC21083i2 = interfaceC21083i;
            modifier3 = modifier2;
            c28655q = c28655q8;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final Function1 function1 = onEvent;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: is0.n
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj20, Object obj21) {
                    int iIntValue = ((Integer) obj21).intValue();
                    return AbstractC20900p.m57865t(modifier3, viewState, f13, z4, f14, f15, controls, function1, interfaceC21083i2, i13, i14, (Composer) obj20, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m57859n(C20871a0 c20871a0) {
        c20871a0.getOnExpandWithKeyboard().invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m57860o(C20871a0 c20871a0, C20907s0 c20907s0, InterfaceC15241m focusProperties) {
        AbstractC22676k.m65750j(focusProperties, "$this$focusProperties");
        focusProperties.mo534b(c20871a0.getCanFocus() && !c20907s0.getIsLoading());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m57861p(C20871a0 c20871a0, InterfaceC34345p0 KeyboardActions) {
        AbstractC22676k.m65750j(KeyboardActions, "$this$KeyboardActions");
        c20871a0.getOnSubmit().invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m57862q(float f13, C20907s0 c20907s0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM107879c = AbstractC34132o.m107879c(f13, C2314t.f9131w);
            String strM21274h = AbstractC8693b.m21274h(c20907s0.getPlaceholder(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, modifierM107879c, c38072d.m121949b(c28655q, i14).getWhite20(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m57863r(boolean z4, C20871a0 c20871a0) {
        if (z4) {
            c20871a0.getOnSubmit().invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m57864s(Function1 function1, C20874c c20874c) {
        function1.invoke(new AbstractC20905r0.h(c20874c.getEmoji(), c20874c.getInteraction()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m57865t(Modifier modifier, C20907s0 c20907s0, float f13, boolean z4, float f14, float f15, C20871a0 c20871a0, Function1 function1, InterfaceC21083i interfaceC21083i, int i13, int i14, Composer composer, int i15) {
        m57858m(modifier, c20907s0, f13, z4, f14, f15, c20871a0, function1, interfaceC21083i, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final boolean m57866u(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final boolean m57867v(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m57868w(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final boolean m57869x(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m57870y(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }
}
