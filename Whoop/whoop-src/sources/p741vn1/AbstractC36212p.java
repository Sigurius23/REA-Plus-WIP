package p741vn1;

import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bp0.C3529q;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.C3756l0;
import p040c0.InterfaceC3764o;
import p040c0.InterfaceC3770q;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p459rf.C31345p;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p714k80.C22275d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25305n;
import p734sl0.C32627j2;
import p736sz0.C33209p1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vb1.C35868a;
import ve0.C35926d;
import vk1.C36087a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: vn1.p */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008b\u0001\u0010\u0010\u001a\u00020\b2\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u0017\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001d²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lm91/n;", "", "card", "nextCard", "", "stackSize", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Lkotlin/Function2;", "Lvn1/a;", "onReadCard", "Lvn1/i;", "notificationCardDismissAnimation", "changeNotificationCardDismissAnimation", "n", "(Lm91/n;Lm91/n;ILkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "l", "(Lm91/n;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Li2/x;", "color", "A", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "", "animate", "Ly3/f;", "animatedPadding", "home-notifications-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36212p {

    /* JADX INFO: renamed from: vn1.p$a */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.view.cards.NotificationCardStackKt$NotificationCardStack$4$1", m100430f = "NotificationCardStack.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155033w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f155034x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f155035y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155034x = i13;
            this.f155035y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f155034x, this.f155035y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f155033w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC36212p.m115254t(this.f155035y, this.f155034x < 2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vn1.p$b */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.view.cards.NotificationCardStackKt$NotificationCardStack$5$1", m100430f = "NotificationCardStack.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155036w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ EnumC36205i f155037x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f155038y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC36205i enumC36205i, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155037x = enumC36205i;
            this.f155038y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f155037x, this.f155038y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155036w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                EnumC36205i enumC36205i = this.f155037x;
                if (enumC36205i == EnumC36205i.LEFT_SWIPE || enumC36205i == EnumC36205i.SCALE_OUT) {
                    this.f155036w = 1;
                    if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f155038y.invoke(EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    public static final Modifier m115232A(Modifier cardStackModifier, long j7) {
        AbstractC22676k.m65750j(cardStackModifier, "$this$cardStackModifier");
        return AbstractC1125a.m3480c(AbstractC1127a.m3486a(AbstractC1102d.m3413j(cardStackModifier, 0.0f, 30 * 4, 1), new C35926d(13)), new C33209p1(j7, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m115233B(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.getDensity();
        c17920x0.m51550E(c17920x0.getDensity() * 3 * 4);
        c17920x0.m51560p(0.92f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m115234C(long j7, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.getDensity();
        float fMo743q0 = c0238p0.mo743q0(3 * 4);
        c0238p0.m728a();
        InterfaceC22131e.m63374D(drawWithContent, j7, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), null, 0.0f, 246);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m115246l(InterfaceC25305n<String> nextCard, Composer composer, int i13) {
        int i14;
        InterfaceC25305n<String> interfaceC25305n;
        AbstractC22676k.m65750j(nextCard, "nextCard");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1630403359);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(nextCard) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM115232A = m115232A(C2314t.f9131w, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack10());
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM115232A);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            interfaceC25305n = nextCard;
            AbstractC25303l.m74291r(interfaceC25305n, null, null, null, c28655q, i14 & 14, 14);
            c28655q.m87173q(true);
        } else {
            interfaceC25305n = nextCard;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(interfaceC25305n, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m115247m(InterfaceC25305n interfaceC25305n, int i13, Composer composer, int i14) {
        m115246l(interfaceC25305n, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x012c  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0172  */
    /* JADX WARN: Code duplicated, block: B:114:0x0174  */
    /* JADX WARN: Code duplicated, block: B:117:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x017d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0191  */
    /* JADX WARN: Code duplicated, block: B:122:0x0193  */
    /* JADX WARN: Code duplicated, block: B:125:0x019b  */
    /* JADX WARN: Code duplicated, block: B:126:0x019d  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:137:0x0200  */
    /* JADX WARN: Code duplicated, block: B:139:0x020e  */
    /* JADX WARN: Code duplicated, block: B:142:0x0218  */
    /* JADX WARN: Code duplicated, block: B:143:0x0226  */
    /* JADX WARN: Code duplicated, block: B:145:0x024e  */
    /* JADX WARN: Code duplicated, block: B:147:0x025f  */
    /* JADX WARN: Code duplicated, block: B:149:0x0267  */
    /* JADX WARN: Code duplicated, block: B:150:0x0269  */
    /* JADX WARN: Code duplicated, block: B:153:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x0272  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087 A[PHI: r14
      0x0087: PHI (r14v16 int) = (r14v0 int), (r14v5 int), (r14v6 int) binds: [B:51:0x0085, B:61:0x009d, B:60:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0090  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00db  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0112  */
    /* JADX INFO: renamed from: n */
    public static final void m115248n(final InterfaceC25305n<String> interfaceC25305n, InterfaceC25305n<String> interfaceC25305n2, final int i13, Function1 function1, InterfaceC4351m interfaceC4351m, EnumC36205i enumC36205i, Function1 function2, Composer composer, final int i14, final int i15) {
        int i16;
        InterfaceC25305n<String> interfaceC25305n3;
        int i17;
        Function1 function3;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int iOrdinal;
        int i27;
        Function1 function4;
        int i28;
        boolean z4;
        final InterfaceC4351m interfaceC4351m2;
        final InterfaceC25305n<String> interfaceC25305n4;
        final Function1 function5;
        C28655q c28655q;
        final Function1 function6;
        final EnumC36205i enumC36205i2;
        C28677v1 c28677v1M87180u;
        InterfaceC25305n<String> interfaceC25305n5;
        C28676v0 c28676v0;
        InterfaceC4351m interfaceC4351m3;
        EnumC36205i enumC36205i3;
        Function1 function7;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int i29;
        float f13;
        int i34;
        Function1 function8;
        InterfaceC4351m interfaceC4351m4;
        boolean z13;
        Object objM87133R2;
        int i35;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function9;
        boolean z17;
        boolean z18;
        Object objM87133R4;
        final Function1 function10;
        final InterfaceC4351m interfaceC4351m5;
        C28655q c28655q2;
        EnumC36205i enumC36205i4;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        int i36;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-71622508);
        if ((i14 & 6) == 0) {
            i16 = (c28655q3.m87157i(interfaceC25305n) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i37 = i15 & 2;
        if (i37 == 0) {
            if ((i14 & 48) == 0) {
                interfaceC25305n3 = interfaceC25305n2;
                i16 |= c28655q3.m87157i(interfaceC25305n3) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (c28655q3.m87149e(i13)) {
                    i36 = 256;
                } else {
                    i36 = 128;
                }
                i16 |= i36;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    function3 = function1;
                    if (c28655q3.m87157i(function3)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 16;
                if (i19 != 0) {
                    if ((i14 & 24576) == 0) {
                        if (c28655q3.m87157i(interfaceC4351m)) {
                            i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i24 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 32;
                    i26 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    if (i25 == 0) {
                        i16 |= i26;
                    } else if ((196608 & i14) == 0) {
                        if (enumC36205i == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = enumC36205i.ordinal();
                        }
                        if (c28655q3.m87149e(iOrdinal)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 64;
                    if (i27 != 0) {
                        i16 |= 1572864;
                        function4 = function2;
                    } else {
                        function4 = function2;
                        if ((i14 & 1572864) == 0) {
                            if (c28655q3.m87157i(function4)) {
                                i28 = 1048576;
                            } else {
                                i28 = 524288;
                            }
                            i16 |= i28;
                        }
                    }
                    if ((i16 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q3.m87135U(i16 & 1, z4)) {
                        if (i37 != 0) {
                            interfaceC25305n5 = null;
                        } else {
                            interfaceC25305n5 = interfaceC25305n3;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i17 != 0) {
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C35868a(5);
                                c28655q3.m87172p0(objM87133R7);
                            }
                            function3 = (Function1) objM87133R7;
                        }
                        if (i19 != 0) {
                            objM87133R6 = c28655q3.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C36087a(3);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            interfaceC4351m3 = (InterfaceC4351m) objM87133R6;
                        } else {
                            interfaceC4351m3 = interfaceC4351m;
                        }
                        if (i25 != 0) {
                            enumC36205i3 = EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT;
                        } else {
                            enumC36205i3 = enumC36205i;
                        }
                        if (i27 != 0) {
                            objM87133R5 = c28655q3.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C35868a(6);
                                c28655q3.m87172p0(objM87133R5);
                            }
                            function7 = (Function1) objM87133R5;
                        } else {
                            function7 = function4;
                        }
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        if (m115253s(interfaceC28601c1)) {
                            f13 = 0;
                            i29 = 4;
                        } else {
                            i29 = 4;
                            f13 = 3;
                        }
                        i34 = i16;
                        function8 = function3;
                        interfaceC4351m4 = interfaceC4351m3;
                        InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(f13 * i29, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                        Integer numValueOf = Integer.valueOf(i13);
                        if ((i34 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q3.m87133R();
                        if (z13 || objM87133R2 == c28676v0) {
                            objM87133R2 = new a(i13, interfaceC28601c1, null);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf);
                        i35 = 458752 & i34;
                        if (i35 == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((3670016 & i34) == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R3 = c28655q3.m87133R();
                        if (z16 || objM87133R3 == c28676v0) {
                            objM87133R3 = new b(enumC36205i3, function7, null);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i3);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m115255u(interfaceC28670t2M30587a), 7);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9105H, false);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                        if (interfaceC25305n5 == null) {
                            c28655q3.m87150e0(23829927);
                            z17 = false;
                            c28655q3.m87173q(false);
                            function9 = function7;
                        } else {
                            c28655q3.m87150e0(23829928);
                            function9 = function7;
                            AbstractC1089a.m3344b(interfaceC25305n5, null, null, null, "animate_card", null, C36201e.f154999a.m115202b(), c28655q3, 1597440, 46);
                            z17 = false;
                            c28655q3.m87173q(false);
                        }
                        if (interfaceC25305n == null) {
                            c28655q3.m87150e0(24095411);
                            c28655q3.m87173q(z17);
                            enumC36205i4 = enumC36205i3;
                            c28655q2 = c28655q3;
                            function10 = function8;
                            interfaceC4351m5 = interfaceC4351m4;
                        } else {
                            c28655q3.m87150e0(24095412);
                            if (i35 == 131072) {
                                z18 = true;
                            } else {
                                z18 = z17;
                            }
                            objM87133R4 = c28655q3.m87133R();
                            if (z18 || objM87133R4 == c28676v0) {
                                objM87133R4 = new C31345p(enumC36205i3, 5);
                                c28655q3.m87172p0(objM87133R4);
                            }
                            Function1 function11 = (Function1) objM87133R4;
                            function10 = function8;
                            interfaceC4351m5 = interfaceC4351m4;
                            C37816b c37816bM121344e = AbstractC37817c.m121344e(-494158469, c28655q3, new InterfaceC4352n() { // from class: vn1.o
                                @Override // c93.InterfaceC4352n
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return AbstractC36212p.m115257w(interfaceC25305n, interfaceC4351m5, function10, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                                }
                            });
                            c28655q2 = c28655q3;
                            enumC36205i4 = enumC36205i3;
                            AbstractC1089a.m3344b(interfaceC25305n, null, function11, null, "animated_dismiss", null, c37816bM121344e, c28655q2, 1597440, 42);
                            c28655q2.m87173q(z17);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        interfaceC25305n4 = interfaceC25305n5;
                        function5 = function10;
                        interfaceC4351m2 = interfaceC4351m5;
                        enumC36205i2 = enumC36205i4;
                        function6 = function9;
                    } else {
                        c28655q3.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC25305n4 = interfaceC25305n3;
                        function5 = function3;
                        c28655q = c28655q3;
                        function6 = function4;
                        enumC36205i2 = enumC36205i;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vn1.n
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC36212p.m115251q(interfaceC25305n, interfaceC25305n4, i13, function5, interfaceC4351m2, enumC36205i2, function6, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 24576;
                i25 = i15 & 32;
                i26 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if (i25 == 0) {
                    i16 |= i26;
                } else if ((196608 & i14) == 0) {
                    if (enumC36205i == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36205i.ordinal();
                    }
                    if (c28655q3.m87149e(iOrdinal)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q3.m87157i(function4)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i16 |= i28;
                    }
                }
                if ((i16 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i16 & 1, z4)) {
                    if (i37 != 0) {
                        interfaceC25305n5 = null;
                    } else {
                        interfaceC25305n5 = interfaceC25305n3;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i17 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C35868a(5);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        function3 = (Function1) objM87133R7;
                    }
                    if (i19 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C36087a(3);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R6;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i25 != 0) {
                        enumC36205i3 = EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT;
                    } else {
                        enumC36205i3 = enumC36205i;
                    }
                    if (i27 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C35868a(6);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function4;
                    }
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    if (m115253s(interfaceC28601c1)) {
                        f13 = 0;
                        i29 = 4;
                    } else {
                        i29 = 4;
                        f13 = 3;
                    }
                    i34 = i16;
                    function8 = function3;
                    interfaceC4351m4 = interfaceC4351m3;
                    InterfaceC28670t2 interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(f13 * i29, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                    Integer numValueOf2 = Integer.valueOf(i13);
                    if ((i34 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf2);
                    i35 = 458752 & i34;
                    if (i35 == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((3670016 & i34) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R3 = c28655q3.m87133R();
                    if (z16) {
                        objM87133R3 = new b(enumC36205i3, function7, null);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(enumC36205i3, function7, null);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i3);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m115255u(interfaceC28670t2M30587a2), 7);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3398t2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
                    if (interfaceC25305n5 == null) {
                        c28655q3.m87150e0(23829927);
                        z17 = false;
                        c28655q3.m87173q(false);
                        function9 = function7;
                    } else {
                        c28655q3.m87150e0(23829928);
                        function9 = function7;
                        AbstractC1089a.m3344b(interfaceC25305n5, null, null, null, "animate_card", null, C36201e.f154999a.m115202b(), c28655q3, 1597440, 46);
                        z17 = false;
                        c28655q3.m87173q(false);
                    }
                    if (interfaceC25305n == null) {
                        c28655q3.m87150e0(24095411);
                        c28655q3.m87173q(z17);
                        enumC36205i4 = enumC36205i3;
                        c28655q2 = c28655q3;
                        function10 = function8;
                        interfaceC4351m5 = interfaceC4351m4;
                    } else {
                        c28655q3.m87150e0(24095412);
                        if (i35 == 131072) {
                            z18 = true;
                        } else {
                            z18 = z17;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z18) {
                            objM87133R4 = new C31345p(enumC36205i3, 5);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C31345p(enumC36205i3, 5);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        Function1 function12 = (Function1) objM87133R4;
                        function10 = function8;
                        interfaceC4351m5 = interfaceC4351m4;
                        C37816b c37816bM121344e2 = AbstractC37817c.m121344e(-494158469, c28655q3, new InterfaceC4352n() { // from class: vn1.o
                            @Override // c93.InterfaceC4352n
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                int iIntValue = ((Integer) obj4).intValue();
                                return AbstractC36212p.m115257w(interfaceC25305n, interfaceC4351m5, function10, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                            }
                        });
                        c28655q2 = c28655q3;
                        enumC36205i4 = enumC36205i3;
                        AbstractC1089a.m3344b(interfaceC25305n, null, function12, null, "animated_dismiss", null, c37816bM121344e2, c28655q2, 1597440, 42);
                        c28655q2.m87173q(z17);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC25305n4 = interfaceC25305n5;
                    function5 = function10;
                    interfaceC4351m2 = interfaceC4351m5;
                    enumC36205i2 = enumC36205i4;
                    function6 = function9;
                } else {
                    c28655q3.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC25305n4 = interfaceC25305n3;
                    function5 = function3;
                    c28655q = c28655q3;
                    function6 = function4;
                    enumC36205i2 = enumC36205i;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vn1.n
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC36212p.m115251q(interfaceC25305n, interfaceC25305n4, i13, function5, interfaceC4351m2, enumC36205i2, function6, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 3072;
            function3 = function1;
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    if (c28655q3.m87157i(interfaceC4351m)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 32;
                i26 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if (i25 == 0) {
                    i16 |= i26;
                } else if ((196608 & i14) == 0) {
                    if (enumC36205i == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36205i.ordinal();
                    }
                    if (c28655q3.m87149e(iOrdinal)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q3.m87157i(function4)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i16 |= i28;
                    }
                }
                if ((i16 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i16 & 1, z4)) {
                    if (i37 != 0) {
                        interfaceC25305n5 = null;
                    } else {
                        interfaceC25305n5 = interfaceC25305n3;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i17 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C35868a(5);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        function3 = (Function1) objM87133R7;
                    }
                    if (i19 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C36087a(3);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R6;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i25 != 0) {
                        enumC36205i3 = EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT;
                    } else {
                        enumC36205i3 = enumC36205i;
                    }
                    if (i27 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C35868a(6);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function4;
                    }
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    if (m115253s(interfaceC28601c1)) {
                        f13 = 0;
                        i29 = 4;
                    } else {
                        i29 = 4;
                        f13 = 3;
                    }
                    i34 = i16;
                    function8 = function3;
                    interfaceC4351m4 = interfaceC4351m3;
                    InterfaceC28670t2 interfaceC28670t2M30587a3 = AbstractC11352g.m30587a(f13 * i29, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                    Integer numValueOf3 = Integer.valueOf(i13);
                    if ((i34 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf3);
                    i35 = 458752 & i34;
                    if (i35 == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((3670016 & i34) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R3 = c28655q3.m87133R();
                    if (z16) {
                        objM87133R3 = new b(enumC36205i3, function7, null);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(enumC36205i3, function7, null);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i3);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m115255u(interfaceC28670t2M30587a3), 7);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3398t3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N3);
                    if (interfaceC25305n5 == null) {
                        c28655q3.m87150e0(23829927);
                        z17 = false;
                        c28655q3.m87173q(false);
                        function9 = function7;
                    } else {
                        c28655q3.m87150e0(23829928);
                        function9 = function7;
                        AbstractC1089a.m3344b(interfaceC25305n5, null, null, null, "animate_card", null, C36201e.f154999a.m115202b(), c28655q3, 1597440, 46);
                        z17 = false;
                        c28655q3.m87173q(false);
                    }
                    if (interfaceC25305n == null) {
                        c28655q3.m87150e0(24095411);
                        c28655q3.m87173q(z17);
                        enumC36205i4 = enumC36205i3;
                        c28655q2 = c28655q3;
                        function10 = function8;
                        interfaceC4351m5 = interfaceC4351m4;
                    } else {
                        c28655q3.m87150e0(24095412);
                        if (i35 == 131072) {
                            z18 = true;
                        } else {
                            z18 = z17;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z18) {
                            objM87133R4 = new C31345p(enumC36205i3, 5);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C31345p(enumC36205i3, 5);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        Function1 function13 = (Function1) objM87133R4;
                        function10 = function8;
                        interfaceC4351m5 = interfaceC4351m4;
                        C37816b c37816bM121344e3 = AbstractC37817c.m121344e(-494158469, c28655q3, new InterfaceC4352n() { // from class: vn1.o
                            @Override // c93.InterfaceC4352n
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                int iIntValue = ((Integer) obj4).intValue();
                                return AbstractC36212p.m115257w(interfaceC25305n, interfaceC4351m5, function10, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                            }
                        });
                        c28655q2 = c28655q3;
                        enumC36205i4 = enumC36205i3;
                        AbstractC1089a.m3344b(interfaceC25305n, null, function13, null, "animated_dismiss", null, c37816bM121344e3, c28655q2, 1597440, 42);
                        c28655q2.m87173q(z17);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC25305n4 = interfaceC25305n5;
                    function5 = function10;
                    interfaceC4351m2 = interfaceC4351m5;
                    enumC36205i2 = enumC36205i4;
                    function6 = function9;
                } else {
                    c28655q3.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC25305n4 = interfaceC25305n3;
                    function5 = function3;
                    c28655q = c28655q3;
                    function6 = function4;
                    enumC36205i2 = enumC36205i;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vn1.n
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC36212p.m115251q(interfaceC25305n, interfaceC25305n4, i13, function5, interfaceC4351m2, enumC36205i2, function6, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            i25 = i15 & 32;
            i26 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i25 == 0) {
                i16 |= i26;
            } else if ((196608 & i14) == 0) {
                if (enumC36205i == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC36205i.ordinal();
                }
                if (c28655q3.m87149e(iOrdinal)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i26;
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i14 & 1572864) == 0) {
                    if (c28655q3.m87157i(function4)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
            }
            if ((i16 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i16 & 1, z4)) {
                if (i37 != 0) {
                    interfaceC25305n5 = null;
                } else {
                    interfaceC25305n5 = interfaceC25305n3;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C35868a(5);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                }
                if (i19 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C36087a(3);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R6;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                if (i25 != 0) {
                    enumC36205i3 = EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT;
                } else {
                    enumC36205i3 = enumC36205i;
                }
                if (i27 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C35868a(6);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function4;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (m115253s(interfaceC28601c1)) {
                    f13 = 0;
                    i29 = 4;
                } else {
                    i29 = 4;
                    f13 = 3;
                }
                i34 = i16;
                function8 = function3;
                interfaceC4351m4 = interfaceC4351m3;
                InterfaceC28670t2 interfaceC28670t2M30587a4 = AbstractC11352g.m30587a(f13 * i29, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                Integer numValueOf4 = Integer.valueOf(i13);
                if ((i34 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q3.m87133R();
                if (z13) {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf4);
                i35 = 458752 & i34;
                if (i35 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((3670016 & i34) == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R3 = c28655q3.m87133R();
                if (z16) {
                    objM87133R3 = new b(enumC36205i3, function7, null);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(enumC36205i3, function7, null);
                    c28655q3.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i3);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m115255u(interfaceC28670t2M30587a4), 7);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM3398t4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N4);
                if (interfaceC25305n5 == null) {
                    c28655q3.m87150e0(23829927);
                    z17 = false;
                    c28655q3.m87173q(false);
                    function9 = function7;
                } else {
                    c28655q3.m87150e0(23829928);
                    function9 = function7;
                    AbstractC1089a.m3344b(interfaceC25305n5, null, null, null, "animate_card", null, C36201e.f154999a.m115202b(), c28655q3, 1597440, 46);
                    z17 = false;
                    c28655q3.m87173q(false);
                }
                if (interfaceC25305n == null) {
                    c28655q3.m87150e0(24095411);
                    c28655q3.m87173q(z17);
                    enumC36205i4 = enumC36205i3;
                    c28655q2 = c28655q3;
                    function10 = function8;
                    interfaceC4351m5 = interfaceC4351m4;
                } else {
                    c28655q3.m87150e0(24095412);
                    if (i35 == 131072) {
                        z18 = true;
                    } else {
                        z18 = z17;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z18) {
                        objM87133R4 = new C31345p(enumC36205i3, 5);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C31345p(enumC36205i3, 5);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Function1 function14 = (Function1) objM87133R4;
                    function10 = function8;
                    interfaceC4351m5 = interfaceC4351m4;
                    C37816b c37816bM121344e4 = AbstractC37817c.m121344e(-494158469, c28655q3, new InterfaceC4352n() { // from class: vn1.o
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC36212p.m115257w(interfaceC25305n, interfaceC4351m5, function10, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                        }
                    });
                    c28655q2 = c28655q3;
                    enumC36205i4 = enumC36205i3;
                    AbstractC1089a.m3344b(interfaceC25305n, null, function14, null, "animated_dismiss", null, c37816bM121344e4, c28655q2, 1597440, 42);
                    c28655q2.m87173q(z17);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                interfaceC25305n4 = interfaceC25305n5;
                function5 = function10;
                interfaceC4351m2 = interfaceC4351m5;
                enumC36205i2 = enumC36205i4;
                function6 = function9;
            } else {
                c28655q3.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC25305n4 = interfaceC25305n3;
                function5 = function3;
                c28655q = c28655q3;
                function6 = function4;
                enumC36205i2 = enumC36205i;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vn1.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36212p.m115251q(interfaceC25305n, interfaceC25305n4, i13, function5, interfaceC4351m2, enumC36205i2, function6, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 48;
        interfaceC25305n3 = interfaceC25305n2;
        if ((i14 & 384) == 0) {
            if (c28655q3.m87149e(i13)) {
                i36 = 256;
            } else {
                i36 = 128;
            }
            i16 |= i36;
        }
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                function3 = function1;
                if (c28655q3.m87157i(function3)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i18;
            }
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i14 & 24576) == 0) {
                    if (c28655q3.m87157i(interfaceC4351m)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 32;
                i26 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
                if (i25 == 0) {
                    i16 |= i26;
                } else if ((196608 & i14) == 0) {
                    if (enumC36205i == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36205i.ordinal();
                    }
                    if (c28655q3.m87149e(iOrdinal)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    function4 = function2;
                } else {
                    function4 = function2;
                    if ((i14 & 1572864) == 0) {
                        if (c28655q3.m87157i(function4)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i16 |= i28;
                    }
                }
                if ((i16 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i16 & 1, z4)) {
                    if (i37 != 0) {
                        interfaceC25305n5 = null;
                    } else {
                        interfaceC25305n5 = interfaceC25305n3;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i17 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C35868a(5);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        function3 = (Function1) objM87133R7;
                    }
                    if (i19 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C36087a(3);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R6;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i25 != 0) {
                        enumC36205i3 = EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT;
                    } else {
                        enumC36205i3 = enumC36205i;
                    }
                    if (i27 != 0) {
                        objM87133R5 = c28655q3.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C35868a(6);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function7 = (Function1) objM87133R5;
                    } else {
                        function7 = function4;
                    }
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    if (m115253s(interfaceC28601c1)) {
                        f13 = 0;
                        i29 = 4;
                    } else {
                        i29 = 4;
                        f13 = 3;
                    }
                    i34 = i16;
                    function8 = function3;
                    interfaceC4351m4 = interfaceC4351m3;
                    InterfaceC28670t2 interfaceC28670t2M30587a5 = AbstractC11352g.m30587a(f13 * i29, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                    Integer numValueOf5 = Integer.valueOf(i13);
                    if ((i34 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q3.m87133R();
                    if (z13) {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf5);
                    i35 = 458752 & i34;
                    if (i35 == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((3670016 & i34) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R3 = c28655q3.m87133R();
                    if (z16) {
                        objM87133R3 = new b(enumC36205i3, function7, null);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(enumC36205i3, function7, null);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i3);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m115255u(interfaceC28670t2M30587a5), 7);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3398t5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N5);
                    if (interfaceC25305n5 == null) {
                        c28655q3.m87150e0(23829927);
                        z17 = false;
                        c28655q3.m87173q(false);
                        function9 = function7;
                    } else {
                        c28655q3.m87150e0(23829928);
                        function9 = function7;
                        AbstractC1089a.m3344b(interfaceC25305n5, null, null, null, "animate_card", null, C36201e.f154999a.m115202b(), c28655q3, 1597440, 46);
                        z17 = false;
                        c28655q3.m87173q(false);
                    }
                    if (interfaceC25305n == null) {
                        c28655q3.m87150e0(24095411);
                        c28655q3.m87173q(z17);
                        enumC36205i4 = enumC36205i3;
                        c28655q2 = c28655q3;
                        function10 = function8;
                        interfaceC4351m5 = interfaceC4351m4;
                    } else {
                        c28655q3.m87150e0(24095412);
                        if (i35 == 131072) {
                            z18 = true;
                        } else {
                            z18 = z17;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z18) {
                            objM87133R4 = new C31345p(enumC36205i3, 5);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C31345p(enumC36205i3, 5);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        Function1 function15 = (Function1) objM87133R4;
                        function10 = function8;
                        interfaceC4351m5 = interfaceC4351m4;
                        C37816b c37816bM121344e5 = AbstractC37817c.m121344e(-494158469, c28655q3, new InterfaceC4352n() { // from class: vn1.o
                            @Override // c93.InterfaceC4352n
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                int iIntValue = ((Integer) obj4).intValue();
                                return AbstractC36212p.m115257w(interfaceC25305n, interfaceC4351m5, function10, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                            }
                        });
                        c28655q2 = c28655q3;
                        enumC36205i4 = enumC36205i3;
                        AbstractC1089a.m3344b(interfaceC25305n, null, function15, null, "animated_dismiss", null, c37816bM121344e5, c28655q2, 1597440, 42);
                        c28655q2.m87173q(z17);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC25305n4 = interfaceC25305n5;
                    function5 = function10;
                    interfaceC4351m2 = interfaceC4351m5;
                    enumC36205i2 = enumC36205i4;
                    function6 = function9;
                } else {
                    c28655q3.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC25305n4 = interfaceC25305n3;
                    function5 = function3;
                    c28655q = c28655q3;
                    function6 = function4;
                    enumC36205i2 = enumC36205i;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vn1.n
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC36212p.m115251q(interfaceC25305n, interfaceC25305n4, i13, function5, interfaceC4351m2, enumC36205i2, function6, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            i25 = i15 & 32;
            i26 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i25 == 0) {
                i16 |= i26;
            } else if ((196608 & i14) == 0) {
                if (enumC36205i == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC36205i.ordinal();
                }
                if (c28655q3.m87149e(iOrdinal)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i26;
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i14 & 1572864) == 0) {
                    if (c28655q3.m87157i(function4)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
            }
            if ((i16 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i16 & 1, z4)) {
                if (i37 != 0) {
                    interfaceC25305n5 = null;
                } else {
                    interfaceC25305n5 = interfaceC25305n3;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C35868a(5);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                }
                if (i19 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C36087a(3);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R6;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                if (i25 != 0) {
                    enumC36205i3 = EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT;
                } else {
                    enumC36205i3 = enumC36205i;
                }
                if (i27 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C35868a(6);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function4;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (m115253s(interfaceC28601c1)) {
                    f13 = 0;
                    i29 = 4;
                } else {
                    i29 = 4;
                    f13 = 3;
                }
                i34 = i16;
                function8 = function3;
                interfaceC4351m4 = interfaceC4351m3;
                InterfaceC28670t2 interfaceC28670t2M30587a6 = AbstractC11352g.m30587a(f13 * i29, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                Integer numValueOf6 = Integer.valueOf(i13);
                if ((i34 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q3.m87133R();
                if (z13) {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf6);
                i35 = 458752 & i34;
                if (i35 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((3670016 & i34) == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R3 = c28655q3.m87133R();
                if (z16) {
                    objM87133R3 = new b(enumC36205i3, function7, null);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(enumC36205i3, function7, null);
                    c28655q3.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i3);
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m115255u(interfaceC28670t2M30587a6), 7);
                InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifierM3398t6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d6);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N6);
                if (interfaceC25305n5 == null) {
                    c28655q3.m87150e0(23829927);
                    z17 = false;
                    c28655q3.m87173q(false);
                    function9 = function7;
                } else {
                    c28655q3.m87150e0(23829928);
                    function9 = function7;
                    AbstractC1089a.m3344b(interfaceC25305n5, null, null, null, "animate_card", null, C36201e.f154999a.m115202b(), c28655q3, 1597440, 46);
                    z17 = false;
                    c28655q3.m87173q(false);
                }
                if (interfaceC25305n == null) {
                    c28655q3.m87150e0(24095411);
                    c28655q3.m87173q(z17);
                    enumC36205i4 = enumC36205i3;
                    c28655q2 = c28655q3;
                    function10 = function8;
                    interfaceC4351m5 = interfaceC4351m4;
                } else {
                    c28655q3.m87150e0(24095412);
                    if (i35 == 131072) {
                        z18 = true;
                    } else {
                        z18 = z17;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z18) {
                        objM87133R4 = new C31345p(enumC36205i3, 5);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C31345p(enumC36205i3, 5);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Function1 function16 = (Function1) objM87133R4;
                    function10 = function8;
                    interfaceC4351m5 = interfaceC4351m4;
                    C37816b c37816bM121344e6 = AbstractC37817c.m121344e(-494158469, c28655q3, new InterfaceC4352n() { // from class: vn1.o
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC36212p.m115257w(interfaceC25305n, interfaceC4351m5, function10, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                        }
                    });
                    c28655q2 = c28655q3;
                    enumC36205i4 = enumC36205i3;
                    AbstractC1089a.m3344b(interfaceC25305n, null, function16, null, "animated_dismiss", null, c37816bM121344e6, c28655q2, 1597440, 42);
                    c28655q2.m87173q(z17);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                interfaceC25305n4 = interfaceC25305n5;
                function5 = function10;
                interfaceC4351m2 = interfaceC4351m5;
                enumC36205i2 = enumC36205i4;
                function6 = function9;
            } else {
                c28655q3.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC25305n4 = interfaceC25305n3;
                function5 = function3;
                c28655q = c28655q3;
                function6 = function4;
                enumC36205i2 = enumC36205i;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vn1.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36212p.m115251q(interfaceC25305n, interfaceC25305n4, i13, function5, interfaceC4351m2, enumC36205i2, function6, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        function3 = function1;
        i19 = i15 & 16;
        if (i19 != 0) {
            if ((i14 & 24576) == 0) {
                if (c28655q3.m87157i(interfaceC4351m)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i24;
            }
            i25 = i15 & 32;
            i26 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i25 == 0) {
                i16 |= i26;
            } else if ((196608 & i14) == 0) {
                if (enumC36205i == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC36205i.ordinal();
                }
                if (c28655q3.m87149e(iOrdinal)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i26;
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                function4 = function2;
            } else {
                function4 = function2;
                if ((i14 & 1572864) == 0) {
                    if (c28655q3.m87157i(function4)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
            }
            if ((i16 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i16 & 1, z4)) {
                if (i37 != 0) {
                    interfaceC25305n5 = null;
                } else {
                    interfaceC25305n5 = interfaceC25305n3;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C35868a(5);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                }
                if (i19 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C36087a(3);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R6;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                if (i25 != 0) {
                    enumC36205i3 = EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT;
                } else {
                    enumC36205i3 = enumC36205i;
                }
                if (i27 != 0) {
                    objM87133R5 = c28655q3.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C35868a(6);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function7 = (Function1) objM87133R5;
                } else {
                    function7 = function4;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (m115253s(interfaceC28601c1)) {
                    f13 = 0;
                    i29 = 4;
                } else {
                    i29 = 4;
                    f13 = 3;
                }
                i34 = i16;
                function8 = function3;
                interfaceC4351m4 = interfaceC4351m3;
                InterfaceC28670t2 interfaceC28670t2M30587a7 = AbstractC11352g.m30587a(f13 * i29, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                Integer numValueOf7 = Integer.valueOf(i13);
                if ((i34 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q3.m87133R();
                if (z13) {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf7);
                i35 = 458752 & i34;
                if (i35 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((3670016 & i34) == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R3 = c28655q3.m87133R();
                if (z16) {
                    objM87133R3 = new b(enumC36205i3, function7, null);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(enumC36205i3, function7, null);
                    c28655q3.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i3);
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m115255u(interfaceC28670t2M30587a7), 7);
                InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9105H, false);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, modifierM3398t7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d7);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N7);
                if (interfaceC25305n5 == null) {
                    c28655q3.m87150e0(23829927);
                    z17 = false;
                    c28655q3.m87173q(false);
                    function9 = function7;
                } else {
                    c28655q3.m87150e0(23829928);
                    function9 = function7;
                    AbstractC1089a.m3344b(interfaceC25305n5, null, null, null, "animate_card", null, C36201e.f154999a.m115202b(), c28655q3, 1597440, 46);
                    z17 = false;
                    c28655q3.m87173q(false);
                }
                if (interfaceC25305n == null) {
                    c28655q3.m87150e0(24095411);
                    c28655q3.m87173q(z17);
                    enumC36205i4 = enumC36205i3;
                    c28655q2 = c28655q3;
                    function10 = function8;
                    interfaceC4351m5 = interfaceC4351m4;
                } else {
                    c28655q3.m87150e0(24095412);
                    if (i35 == 131072) {
                        z18 = true;
                    } else {
                        z18 = z17;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z18) {
                        objM87133R4 = new C31345p(enumC36205i3, 5);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C31345p(enumC36205i3, 5);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    Function1 function17 = (Function1) objM87133R4;
                    function10 = function8;
                    interfaceC4351m5 = interfaceC4351m4;
                    C37816b c37816bM121344e7 = AbstractC37817c.m121344e(-494158469, c28655q3, new InterfaceC4352n() { // from class: vn1.o
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC36212p.m115257w(interfaceC25305n, interfaceC4351m5, function10, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                        }
                    });
                    c28655q2 = c28655q3;
                    enumC36205i4 = enumC36205i3;
                    AbstractC1089a.m3344b(interfaceC25305n, null, function17, null, "animated_dismiss", null, c37816bM121344e7, c28655q2, 1597440, 42);
                    c28655q2.m87173q(z17);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                interfaceC25305n4 = interfaceC25305n5;
                function5 = function10;
                interfaceC4351m2 = interfaceC4351m5;
                enumC36205i2 = enumC36205i4;
                function6 = function9;
            } else {
                c28655q3.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC25305n4 = interfaceC25305n3;
                function5 = function3;
                c28655q = c28655q3;
                function6 = function4;
                enumC36205i2 = enumC36205i;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vn1.n
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC36212p.m115251q(interfaceC25305n, interfaceC25305n4, i13, function5, interfaceC4351m2, enumC36205i2, function6, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        i25 = i15 & 32;
        i26 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if (i25 == 0) {
            i16 |= i26;
        } else if ((196608 & i14) == 0) {
            if (enumC36205i == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC36205i.ordinal();
            }
            if (c28655q3.m87149e(iOrdinal)) {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i26;
        }
        i27 = i15 & 64;
        if (i27 != 0) {
            i16 |= 1572864;
            function4 = function2;
        } else {
            function4 = function2;
            if ((i14 & 1572864) == 0) {
                if (c28655q3.m87157i(function4)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i16 |= i28;
            }
        }
        if ((i16 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i16 & 1, z4)) {
            if (i37 != 0) {
                interfaceC25305n5 = null;
            } else {
                interfaceC25305n5 = interfaceC25305n3;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C35868a(5);
                    c28655q3.m87172p0(objM87133R7);
                }
                function3 = (Function1) objM87133R7;
            }
            if (i19 != 0) {
                objM87133R6 = c28655q3.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C36087a(3);
                    c28655q3.m87172p0(objM87133R6);
                }
                interfaceC4351m3 = (InterfaceC4351m) objM87133R6;
            } else {
                interfaceC4351m3 = interfaceC4351m;
            }
            if (i25 != 0) {
                enumC36205i3 = EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT;
            } else {
                enumC36205i3 = enumC36205i;
            }
            if (i27 != 0) {
                objM87133R5 = c28655q3.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C35868a(6);
                    c28655q3.m87172p0(objM87133R5);
                }
                function7 = (Function1) objM87133R5;
            } else {
                function7 = function4;
            }
            objM87133R = c28655q3.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (m115253s(interfaceC28601c1)) {
                f13 = 0;
                i29 = 4;
            } else {
                i29 = 4;
                f13 = 3;
            }
            i34 = i16;
            function8 = function3;
            interfaceC4351m4 = interfaceC4351m3;
            InterfaceC28670t2 interfaceC28670t2M30587a8 = AbstractC11352g.m30587a(f13 * i29, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
            Integer numValueOf8 = Integer.valueOf(i13);
            if ((i34 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R2 = c28655q3.m87133R();
            if (z13) {
                objM87133R2 = new a(i13, interfaceC28601c1, null);
                c28655q3.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(i13, interfaceC28601c1, null);
                c28655q3.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf8);
            i35 = 458752 & i34;
            if (i35 == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((3670016 & i34) == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z14 | z15;
            objM87133R3 = c28655q3.m87133R();
            if (z16) {
                objM87133R3 = new b(enumC36205i3, function7, null);
                c28655q3.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new b(enumC36205i3, function7, null);
                c28655q3.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i3);
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m115255u(interfaceC28670t2M30587a8), 7);
            InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9105H, false);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM3398t8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d8);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N8);
            if (interfaceC25305n5 == null) {
                c28655q3.m87150e0(23829927);
                z17 = false;
                c28655q3.m87173q(false);
                function9 = function7;
            } else {
                c28655q3.m87150e0(23829928);
                function9 = function7;
                AbstractC1089a.m3344b(interfaceC25305n5, null, null, null, "animate_card", null, C36201e.f154999a.m115202b(), c28655q3, 1597440, 46);
                z17 = false;
                c28655q3.m87173q(false);
            }
            if (interfaceC25305n == null) {
                c28655q3.m87150e0(24095411);
                c28655q3.m87173q(z17);
                enumC36205i4 = enumC36205i3;
                c28655q2 = c28655q3;
                function10 = function8;
                interfaceC4351m5 = interfaceC4351m4;
            } else {
                c28655q3.m87150e0(24095412);
                if (i35 == 131072) {
                    z18 = true;
                } else {
                    z18 = z17;
                }
                objM87133R4 = c28655q3.m87133R();
                if (z18) {
                    objM87133R4 = new C31345p(enumC36205i3, 5);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C31345p(enumC36205i3, 5);
                    c28655q3.m87172p0(objM87133R4);
                }
                Function1 function18 = (Function1) objM87133R4;
                function10 = function8;
                interfaceC4351m5 = interfaceC4351m4;
                C37816b c37816bM121344e8 = AbstractC37817c.m121344e(-494158469, c28655q3, new InterfaceC4352n() { // from class: vn1.o
                    @Override // c93.InterfaceC4352n
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC36212p.m115257w(interfaceC25305n, interfaceC4351m5, function10, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                    }
                });
                c28655q2 = c28655q3;
                enumC36205i4 = enumC36205i3;
                AbstractC1089a.m3344b(interfaceC25305n, null, function18, null, "animated_dismiss", null, c37816bM121344e8, c28655q2, 1597440, 42);
                c28655q2.m87173q(z17);
            }
            c28655q2.m87173q(true);
            c28655q = c28655q2;
            interfaceC25305n4 = interfaceC25305n5;
            function5 = function10;
            interfaceC4351m2 = interfaceC4351m5;
            enumC36205i2 = enumC36205i4;
            function6 = function9;
        } else {
            c28655q3.m87138X();
            interfaceC4351m2 = interfaceC4351m;
            interfaceC25305n4 = interfaceC25305n3;
            function5 = function3;
            c28655q = c28655q3;
            function6 = function4;
            enumC36205i2 = enumC36205i;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: vn1.n
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC36212p.m115251q(interfaceC25305n, interfaceC25305n4, i13, function5, interfaceC4351m2, enumC36205i2, function6, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m115249o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m115250p(String str, EnumC36197a enumC36197a) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(enumC36197a, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m115251q(InterfaceC25305n interfaceC25305n, InterfaceC25305n interfaceC25305n2, int i13, Function1 function1, InterfaceC4351m interfaceC4351m, EnumC36205i enumC36205i, Function1 function2, int i14, int i15, Composer composer, int i16) {
        m115248n(interfaceC25305n, interfaceC25305n2, i13, function1, interfaceC4351m, enumC36205i, function2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m115252r(EnumC36205i enumC36205i) {
        AbstractC22676k.m65750j(enumC36205i, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final boolean m115253s(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final void m115254t(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: u */
    private static final float m115255u(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C3756l0 m115256v(EnumC36205i enumC36205i, InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        return C36206j.f155016a.m115220a(AnimatedContent, enumC36205i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m115257w(InterfaceC25305n interfaceC25305n, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC3764o AnimatedContent, InterfaceC25305n animatedCard, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        AbstractC22676k.m65750j(animatedCard, "animatedCard");
        String str = (String) animatedCard.getStateUpdateKey();
        boolean zM65745e = AbstractC22676k.m65745e(animatedCard.getStateUpdateKey(), interfaceC25305n.getStateUpdateKey());
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(interfaceC4351m) | c28655q.m87157i(animatedCard);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C22275d(11, interfaceC4351m, animatedCard);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC36215s.m115274g(str, zM65745e, (InterfaceC4339a) objM87133R, null, AbstractC37817c.m121344e(1377355547, c28655q, new C3529q(5, animatedCard, function1)), c28655q, 24576, 8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m115258x(InterfaceC4351m interfaceC4351m, InterfaceC25305n interfaceC25305n) {
        interfaceC4351m.invoke(interfaceC25305n.getStateUpdateKey(), EnumC36197a.SWIPE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m115259y(InterfaceC25305n interfaceC25305n, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC25303l.m74291r(interfaceC25305n, null, null, function1, c28655q, 0, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
