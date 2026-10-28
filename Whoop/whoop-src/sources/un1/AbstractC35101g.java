package un1;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import bp0.C3520h;
import c41.C4061l;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import h01.C16547n;
import h01.InterfaceC16556w;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p077d0.C11347e2;
import p077d0.C11377m0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p411q2.InterfaceC29805a;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.C39178j;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p741vn1.AbstractC36203g;
import p741vn1.AbstractC36212p;
import p741vn1.EnumC36197a;
import p741vn1.EnumC36205i;
import p741vn1.Function0;
import pj2.C29308g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s52.C32223d;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import to1.C34015h;
import un0.C35093a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: un1.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009f\u0001\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00072\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u001c²\u0006\u000e\u0010\u0014\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lvn1/g$c;", "viewState", "", "hasAiCoach", "Lkotlin/Function0;", "Ll83/a0;", "onShimmerFinished", "Lkotlin/Function1;", "onAllCardsDismissed", "Lkotlin/Function2;", "", "Lvn1/a;", "onReadCard", "", "onViewEvent", "hideReplayButton", "Lvn1/i;", "changeNotificationCardDismissAnimation", "n", "(Lvn1/g$c;ZLc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "shouldPlayAnimation", "Lun1/h;", "transitionState", "", "rotation", "replayButtonOffsetPercent", "Ly3/f;", "counterPadding", "home-notifications-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35101g {

    /* JADX INFO: renamed from: un1.g$a */
    @InterfaceC32271e(m100429c = "com.whoop.homenotificationscenter.view.NotificationCardSuccessStateKt$NotificationCardSuccessState$7$1", m100430f = "NotificationCardSuccessState.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f148952E;

        /* JADX INFO: renamed from: w */
        int f148953w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC36203g.c f148954x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f148955y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f148956z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC36203g.c cVar, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f148954x = cVar;
            this.f148955y = interfaceC4339a;
            this.f148956z = function1;
            this.f148952E = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f148954x, this.f148955y, this.f148956z, this.f148952E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f148953w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC36203g.c cVar = this.f148954x;
            InterfaceC4339a interfaceC4339a = this.f148955y;
            Function1 function1 = this.f148956z;
            InterfaceC28601c1 interfaceC28601c1 = this.f148952E;
            if (cVar.getCardStackSize() > 0) {
                interfaceC4339a.invoke();
                AbstractC35101g.m111025H(interfaceC28601c1, true);
            }
            if (!AbstractC35101g.m111024G(interfaceC28601c1) && cVar.getCardStackSize() == 0) {
                function1.invoke(Boolean.FALSE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m111018A(AbstractC36203g.c cVar, Function1 function1, InterfaceC4351m interfaceC4351m, InterfaceC29805a interfaceC29805a) {
        InterfaceC16556w interfaceC16556wM115208c = cVar.getCardToDisplay();
        if (interfaceC16556wM115208c != null) {
            function1.invoke(EnumC36205i.LEFT_SWIPE);
            interfaceC4351m.invoke(interfaceC16556wM115208c.getId(), EnumC36197a.TAP);
            interfaceC29805a.mo7428a(0);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m111019B(String str, EnumC36197a enumC36197a) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(enumC36197a, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m111020C(AbstractC36203g.c cVar, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, InterfaceC4339a interfaceC4339a2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m111041n(cVar, z4, interfaceC4339a, function1, interfaceC4351m, function2, interfaceC4339a2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m111021D(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m111022E() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m111023F(EnumC36205i enumC36205i) {
        AbstractC22676k.m65750j(enumC36205i, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final boolean m111024G(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m111025H(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0148  */
    /* JADX WARN: Code duplicated, block: B:111:0x014b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0151  */
    /* JADX WARN: Code duplicated, block: B:115:0x015e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x0168  */
    /* JADX WARN: Code duplicated, block: B:121:0x0174  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code duplicated, block: B:125:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:0x018d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0195  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:150:0x0212  */
    /* JADX WARN: Code duplicated, block: B:152:0x0217  */
    /* JADX WARN: Code duplicated, block: B:155:0x022f  */
    /* JADX WARN: Code duplicated, block: B:158:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x026c  */
    /* JADX WARN: Code duplicated, block: B:166:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:170:0x0301  */
    /* JADX WARN: Code duplicated, block: B:171:0x0305  */
    /* JADX WARN: Code duplicated, block: B:174:0x0318  */
    /* JADX WARN: Code duplicated, block: B:176:0x0326  */
    /* JADX WARN: Code duplicated, block: B:179:0x0334  */
    /* JADX WARN: Code duplicated, block: B:187:0x0384  */
    /* JADX WARN: Code duplicated, block: B:190:0x03fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:191:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:194:0x0415  */
    /* JADX WARN: Code duplicated, block: B:196:0x0419  */
    /* JADX WARN: Code duplicated, block: B:199:0x0441  */
    /* JADX WARN: Code duplicated, block: B:200:0x0443  */
    /* JADX WARN: Code duplicated, block: B:203:0x0449  */
    /* JADX WARN: Code duplicated, block: B:204:0x044c  */
    /* JADX WARN: Code duplicated, block: B:207:0x045b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:210:0x0462  */
    /* JADX WARN: Code duplicated, block: B:212:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:215:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    /* JADX INFO: renamed from: n */
    public static final void m111041n(AbstractC36203g.c viewState, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, InterfaceC4339a interfaceC4339a2, Function1 function3, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        InterfaceC4339a interfaceC4339a3;
        int i17;
        int i18;
        int i19;
        int i24;
        InterfaceC4351m interfaceC4351m2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        boolean z14;
        Function1 function4;
        boolean z15;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a4;
        InterfaceC4351m interfaceC4351m3;
        Function1 function5;
        InterfaceC4339a interfaceC4339a5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4351m interfaceC4351m4;
        Function1 function7;
        InterfaceC4339a interfaceC4339a6;
        Function1 function8;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC29805a interfaceC29805a;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objM87133R3;
        AbstractC36203g.c cVar;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC28601c1 interfaceC28601c3;
        EnumC35102h enumC35102hM111044q;
        EnumC35102h enumC35102h;
        float f13;
        float f14;
        int i36;
        InterfaceC4351m interfaceC4351m5;
        Object objM87133R4;
        Object objM87133R5;
        final InterfaceC28670t2 interfaceC28670t2M30588b;
        final float fMo743q0;
        float f15;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q2;
        int i37;
        C28655q c28655q3;
        Function1 function9;
        boolean zM87147d;
        Object objM87133R6;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean zM87157i;
        Object objM87133R7;
        Function1 function10;
        Object objM87133R8;
        Object objM87133R9;
        Object objM87133R10;
        Object objM87133R11;
        Object objM87133R12;
        Object objM87133R13;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(1340480317);
        if ((i13 & 6) == 0) {
            i15 = (c28655q4.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i38 = i14 & 2;
        if (i38 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q4.m87155h(z13) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a3 = interfaceC4339a;
                    if (c28655q4.m87157i(interfaceC4339a3)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        if (c28655q4.m87157i(function1)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            interfaceC4351m2 = interfaceC4351m;
                            if (c28655q4.m87157i(interfaceC4351m2)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 32;
                        if (i26 != 0) {
                            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q4.m87157i(function2)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                        i28 = i14 & 64;
                        if (i28 != 0) {
                            i15 |= 1572864;
                        } else if ((i13 & 1572864) == 0) {
                            if (c28655q4.m87157i(interfaceC4339a2)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                        i34 = i14 & 128;
                        if (i34 != 0) {
                            i15 |= 12582912;
                        } else if ((i13 & 12582912) == 0) {
                            if (c28655q4.m87157i(function3)) {
                                i35 = 8388608;
                            } else {
                                i35 = 4194304;
                            }
                            i15 |= i35;
                        }
                        if ((i15 & 4793491) != 4793490) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q4.m87135U(i15 & 1, z14)) {
                            if (i38 != 0) {
                                z13 = false;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i16 != 0) {
                                objM87133R13 = c28655q4.m87133R();
                                if (objM87133R13 == c28676v0) {
                                    objM87133R13 = new C32223d(29);
                                    c28655q4.m87172p0(objM87133R13);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                            }
                            if (i18 != 0) {
                                objM87133R12 = c28655q4.m87133R();
                                if (objM87133R12 == c28676v0) {
                                    objM87133R12 = new C34015h(19);
                                    c28655q4.m87172p0(objM87133R12);
                                }
                                function4 = (Function1) objM87133R12;
                            } else {
                                function4 = function1;
                            }
                            if (i24 != 0) {
                                objM87133R11 = c28655q4.m87133R();
                                if (objM87133R11 == c28676v0) {
                                    objM87133R11 = new C35093a(3);
                                    c28655q4.m87172p0(objM87133R11);
                                }
                                interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                            } else {
                                interfaceC4351m4 = interfaceC4351m2;
                            }
                            if (i26 != 0) {
                                objM87133R10 = c28655q4.m87133R();
                                if (objM87133R10 == c28676v0) {
                                    objM87133R10 = new C34015h(20);
                                    c28655q4.m87172p0(objM87133R10);
                                }
                                function7 = (Function1) objM87133R10;
                            } else {
                                function7 = function2;
                            }
                            if (i28 != 0) {
                                objM87133R9 = c28655q4.m87133R();
                                if (objM87133R9 == c28676v0) {
                                    objM87133R9 = new C35100f(0);
                                    c28655q4.m87172p0(objM87133R9);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                            } else {
                                interfaceC4339a6 = interfaceC4339a2;
                            }
                            if (i34 != 0) {
                                objM87133R8 = c28655q4.m87133R();
                                if (objM87133R8 == c28676v0) {
                                    objM87133R8 = new C34015h(21);
                                    c28655q4.m87172p0(objM87133R8);
                                }
                                function8 = (Function1) objM87133R8;
                            } else {
                                function8 = function3;
                            }
                            objM87133R = c28655q4.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q4.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            objM87133R2 = c28655q4.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                                c28655q4.m87172p0(objM87133R2);
                            }
                            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                            interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                            boolean zM87157i2 = c28655q4.m87157i(viewState);
                            if ((i15 & 3670016) == 1048576) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            boolean z26 = zM87157i2 | z16;
                            if ((i15 & 7168) == 2048) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            z18 = z26 | z17;
                            objM87133R3 = c28655q4.m87133R();
                            if (!z18 || objM87133R3 == c28676v0) {
                                InterfaceC4339a interfaceC4339a8 = interfaceC4339a6;
                                objM87133R3 = new a(viewState, interfaceC4339a8, function4, interfaceC28601c1, null);
                                cVar = viewState;
                                interfaceC4339a7 = interfaceC4339a8;
                                interfaceC28601c3 = interfaceC28601c1;
                                c28655q4.m87172p0(objM87133R3);
                            } else {
                                cVar = viewState;
                                interfaceC4339a7 = interfaceC4339a6;
                                interfaceC28601c3 = interfaceC28601c1;
                            }
                            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                            enumC35102hM111044q = m111044q(interfaceC28601c2);
                            enumC35102h = EnumC35102h.NORMAL;
                            f13 = 0.0f;
                            if (enumC35102hM111044q == enumC35102h) {
                                f14 = 0.0f;
                            } else {
                                f14 = -90.0f;
                            }
                            i36 = i15;
                            interfaceC4351m5 = interfaceC4351m4;
                            boolean z27 = z13;
                            Function1 function11 = function7;
                            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(500, 0, null, 6);
                            objM87133R4 = c28655q4.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                                c28655q4.m87172p0(objM87133R4);
                            }
                            InterfaceC28670t2 interfaceC28670t2M30588b2 = AbstractC11352g.m30588b(f14, c11347e2M30574v, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                            if (m111044q(interfaceC28601c2) != enumC35102h && z27) {
                                f13 = 1.0f;
                            }
                            C11347e2 c11347e2M30574v2 = AbstractC11348f.m30574v(500, 0, null, 6);
                            objM87133R5 = c28655q4.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                                c28655q4.m87172p0(objM87133R5);
                            }
                            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v2, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                            fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                            if (cVar.getCardStackSize() > 0) {
                                f15 = 1 * 8;
                            } else {
                                f15 = 8 * 0;
                            }
                            InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                            C2314t c2314t = C2314t.f9131w;
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            InterfaceC4339a interfaceC4339a9 = interfaceC4339a3;
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                            iHashCode = Long.hashCode(c28655q4.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3409f);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q4.m87158i0();
                            InterfaceC28601c1 interfaceC28601c4 = interfaceC28601c3;
                            if (c28655q4.f115903S) {
                                c28655q4.m87163l(c0213j);
                            } else {
                                c28655q4.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N);
                            if (cVar.getCardStackSize() == 0 || !m111024G(interfaceC28601c4)) {
                                c28655q4.m87150e0(2074981695);
                                c28655q4.m87173q(false);
                                c28655q2 = c28655q4;
                            } else {
                                c28655q4.m87150e0(2074480053);
                                c28655q2 = c28655q4;
                                AbstractC1090b.m3351f(m111044q(interfaceC28601c2) == enumC35102h, null, null, AbstractC3788w0.m11578f(AbstractC11348f.m30574v(500, 0, null, 6), 2), null, AbstractC37817c.m121344e(1839298486, c28655q4, new C3520h(4, function4, interfaceC28601c2)), c28655q2, 199680, 22);
                                c28655q2.m87173q(false);
                            }
                            i37 = i36 & 57344;
                            c28655q3 = c28655q2;
                            function9 = function8;
                            AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function11, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                            Modifier modifierM3398t = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a), 0.0f, 11);
                            zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                            objM87133R6 = c28655q3.m87133R();
                            if (zM87147d || objM87133R6 == c28676v0) {
                                objM87133R6 = new Function1() { // from class: un1.e
                                    @Override // p715kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                                    }
                                };
                                c28655q3.m87172p0(objM87133R6);
                            }
                            Modifier modifierM3390l = AbstractC1099a.m3390l(modifierM3398t, (Function1) objM87133R6);
                            int iM115207b = cVar.getCardStackSize();
                            if (m111044q(interfaceC28601c2) == enumC35102h) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            boolean zM115214i = cVar.getIsUpdating();
                            boolean zM111024G = m111024G(interfaceC28601c4);
                            float fM111047t = m111047t(interfaceC28670t2M30588b2);
                            boolean zM115213h = cVar.getPlayShimmer();
                            boolean zM115209d = cVar.getHighlightCounter();
                            EnumC35102h enumC35102hM111044q2 = m111044q(interfaceC28601c2);
                            boolean zM87157i3 = c28655q3.m87157i(cVar);
                            if ((i36 & 29360128) == 8388608) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            boolean z28 = zM87157i3 | z24;
                            if (i37 == 16384) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            zM87157i = z28 | z25 | c28655q3.m87157i(interfaceC29805a);
                            objM87133R7 = c28655q3.m87133R();
                            if (!zM87157i || objM87133R7 == c28676v0) {
                                objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                                function10 = function9;
                                interfaceC4351m3 = interfaceC4351m5;
                                c28655q3.m87172p0(objM87133R7);
                            } else {
                                function10 = function9;
                                interfaceC4351m3 = interfaceC4351m5;
                            }
                            AbstractC35097c.m111000c(modifierM3390l, iM115207b, z19, fM111047t, zM115214i, zM111024G, zM115213h, zM115209d, enumC35102hM111044q2, interfaceC4339a9, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                            c28655q3.m87173q(true);
                            function6 = function10;
                            c28655q = c28655q3;
                            interfaceC4339a5 = interfaceC4339a7;
                            z15 = z27;
                            interfaceC4339a4 = interfaceC4339a9;
                            function5 = function11;
                        } else {
                            c28655q4.m87138X();
                            function4 = function1;
                            z15 = z13;
                            c28655q = c28655q4;
                            interfaceC4339a4 = interfaceC4339a3;
                            interfaceC4351m3 = interfaceC4351m2;
                            function5 = function2;
                            interfaceC4339a5 = interfaceC4339a2;
                            function6 = function3;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
                        }
                    }
                    i15 |= 24576;
                    interfaceC4351m2 = interfaceC4351m;
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q4.m87157i(function2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q4.m87157i(interfaceC4339a2)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 128;
                    if (i34 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q4.m87157i(function3)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        if (i38 != 0) {
                            z13 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R13 = c28655q4.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C32223d(29);
                                c28655q4.m87172p0(objM87133R13);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                        }
                        if (i18 != 0) {
                            objM87133R12 = c28655q4.m87133R();
                            if (objM87133R12 == c28676v0) {
                                objM87133R12 = new C34015h(19);
                                c28655q4.m87172p0(objM87133R12);
                            }
                            function4 = (Function1) objM87133R12;
                        } else {
                            function4 = function1;
                        }
                        if (i24 != 0) {
                            objM87133R11 = c28655q4.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C35093a(3);
                                c28655q4.m87172p0(objM87133R11);
                            }
                            interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                        } else {
                            interfaceC4351m4 = interfaceC4351m2;
                        }
                        if (i26 != 0) {
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C34015h(20);
                                c28655q4.m87172p0(objM87133R10);
                            }
                            function7 = (Function1) objM87133R10;
                        } else {
                            function7 = function2;
                        }
                        if (i28 != 0) {
                            objM87133R9 = c28655q4.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C35100f(0);
                                c28655q4.m87172p0(objM87133R9);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                        } else {
                            interfaceC4339a6 = interfaceC4339a2;
                        }
                        if (i34 != 0) {
                            objM87133R8 = c28655q4.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C34015h(21);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            function8 = (Function1) objM87133R8;
                        } else {
                            function8 = function3;
                        }
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                        boolean zM87157i4 = c28655q4.m87157i(viewState);
                        if ((i15 & 3670016) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z29 = zM87157i4 | z16;
                        if ((i15 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z29 | z17;
                        objM87133R3 = c28655q4.m87133R();
                        if (z18) {
                            InterfaceC4339a interfaceC4339a10 = interfaceC4339a6;
                            objM87133R3 = new a(viewState, interfaceC4339a10, function4, interfaceC28601c1, null);
                            cVar = viewState;
                            interfaceC4339a7 = interfaceC4339a10;
                            interfaceC28601c3 = interfaceC28601c1;
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            InterfaceC4339a interfaceC4339a11 = interfaceC4339a6;
                            objM87133R3 = new a(viewState, interfaceC4339a11, function4, interfaceC28601c1, null);
                            cVar = viewState;
                            interfaceC4339a7 = interfaceC4339a11;
                            interfaceC28601c3 = interfaceC28601c1;
                            c28655q4.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                        enumC35102hM111044q = m111044q(interfaceC28601c2);
                        enumC35102h = EnumC35102h.NORMAL;
                        f13 = 0.0f;
                        if (enumC35102hM111044q == enumC35102h) {
                            f14 = 0.0f;
                        } else {
                            f14 = -90.0f;
                        }
                        i36 = i15;
                        interfaceC4351m5 = interfaceC4351m4;
                        boolean z210 = z13;
                        Function1 function12 = function7;
                        C11347e2 c11347e2M30574v3 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        InterfaceC28670t2 interfaceC28670t2M30588b3 = AbstractC11352g.m30588b(f14, c11347e2M30574v3, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                        if (m111044q(interfaceC28601c2) != enumC35102h) {
                            f13 = 1.0f;
                        }
                        C11347e2 c11347e2M30574v4 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v4, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                        fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                        if (cVar.getCardStackSize() > 0) {
                            f15 = 1 * 8;
                        } else {
                            f15 = 8 * 0;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                        C2314t c2314t2 = C2314t.f9131w;
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                        InterfaceC4339a interfaceC4339a12 = interfaceC4339a3;
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3409f2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        InterfaceC28601c1 interfaceC28601c5 = interfaceC28601c3;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N2);
                        if (cVar.getCardStackSize() == 0) {
                            c28655q4.m87150e0(2074981695);
                            c28655q4.m87173q(false);
                            c28655q2 = c28655q4;
                        } else {
                            c28655q4.m87150e0(2074981695);
                            c28655q4.m87173q(false);
                            c28655q2 = c28655q4;
                        }
                        i37 = i36 & 57344;
                        c28655q3 = c28655q2;
                        function9 = function8;
                        AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function12, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a2), 0.0f, 11);
                        zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                        objM87133R6 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R6 = new Function1() { // from class: un1.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                                }
                            };
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new Function1() { // from class: un1.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                                }
                            };
                            c28655q3.m87172p0(objM87133R6);
                        }
                        Modifier modifierM3390l2 = AbstractC1099a.m3390l(modifierM3398t2, (Function1) objM87133R6);
                        int iM115207b2 = cVar.getCardStackSize();
                        if (m111044q(interfaceC28601c2) == enumC35102h) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean zM115214i2 = cVar.getIsUpdating();
                        boolean zM111024G2 = m111024G(interfaceC28601c5);
                        float fM111047t2 = m111047t(interfaceC28670t2M30588b3);
                        boolean zM115213h2 = cVar.getPlayShimmer();
                        boolean zM115209d2 = cVar.getHighlightCounter();
                        EnumC35102h enumC35102hM111044q3 = m111044q(interfaceC28601c2);
                        boolean zM87157i5 = c28655q3.m87157i(cVar);
                        if ((i36 & 29360128) == 8388608) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z211 = zM87157i5 | z24;
                        if (i37 == 16384) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zM87157i = z211 | z25 | c28655q3.m87157i(interfaceC29805a);
                        objM87133R7 = c28655q3.m87133R();
                        if (zM87157i) {
                            objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                            function10 = function9;
                            interfaceC4351m3 = interfaceC4351m5;
                            c28655q3.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                            function10 = function9;
                            interfaceC4351m3 = interfaceC4351m5;
                            c28655q3.m87172p0(objM87133R7);
                        }
                        AbstractC35097c.m111000c(modifierM3390l2, iM115207b2, z19, fM111047t2, zM115214i2, zM111024G2, zM115213h2, zM115209d2, enumC35102hM111044q3, interfaceC4339a12, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                        c28655q3.m87173q(true);
                        function6 = function10;
                        c28655q = c28655q3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z15 = z210;
                        interfaceC4339a4 = interfaceC4339a12;
                        function5 = function12;
                    } else {
                        c28655q4.m87138X();
                        function4 = function1;
                        z15 = z13;
                        c28655q = c28655q4;
                        interfaceC4339a4 = interfaceC4339a3;
                        interfaceC4351m3 = interfaceC4351m2;
                        function5 = function2;
                        interfaceC4339a5 = interfaceC4339a2;
                        function6 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
                    }
                }
                i15 |= 3072;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4351m2 = interfaceC4351m;
                        if (c28655q4.m87157i(interfaceC4351m2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q4.m87157i(function2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q4.m87157i(interfaceC4339a2)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 128;
                    if (i34 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q4.m87157i(function3)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        if (i38 != 0) {
                            z13 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R13 = c28655q4.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C32223d(29);
                                c28655q4.m87172p0(objM87133R13);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                        }
                        if (i18 != 0) {
                            objM87133R12 = c28655q4.m87133R();
                            if (objM87133R12 == c28676v0) {
                                objM87133R12 = new C34015h(19);
                                c28655q4.m87172p0(objM87133R12);
                            }
                            function4 = (Function1) objM87133R12;
                        } else {
                            function4 = function1;
                        }
                        if (i24 != 0) {
                            objM87133R11 = c28655q4.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C35093a(3);
                                c28655q4.m87172p0(objM87133R11);
                            }
                            interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                        } else {
                            interfaceC4351m4 = interfaceC4351m2;
                        }
                        if (i26 != 0) {
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C34015h(20);
                                c28655q4.m87172p0(objM87133R10);
                            }
                            function7 = (Function1) objM87133R10;
                        } else {
                            function7 = function2;
                        }
                        if (i28 != 0) {
                            objM87133R9 = c28655q4.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C35100f(0);
                                c28655q4.m87172p0(objM87133R9);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                        } else {
                            interfaceC4339a6 = interfaceC4339a2;
                        }
                        if (i34 != 0) {
                            objM87133R8 = c28655q4.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C34015h(21);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            function8 = (Function1) objM87133R8;
                        } else {
                            function8 = function3;
                        }
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                        boolean zM87157i6 = c28655q4.m87157i(viewState);
                        if ((i15 & 3670016) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z212 = zM87157i6 | z16;
                        if ((i15 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z212 | z17;
                        objM87133R3 = c28655q4.m87133R();
                        if (z18) {
                            InterfaceC4339a interfaceC4339a13 = interfaceC4339a6;
                            objM87133R3 = new a(viewState, interfaceC4339a13, function4, interfaceC28601c1, null);
                            cVar = viewState;
                            interfaceC4339a7 = interfaceC4339a13;
                            interfaceC28601c3 = interfaceC28601c1;
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            InterfaceC4339a interfaceC4339a14 = interfaceC4339a6;
                            objM87133R3 = new a(viewState, interfaceC4339a14, function4, interfaceC28601c1, null);
                            cVar = viewState;
                            interfaceC4339a7 = interfaceC4339a14;
                            interfaceC28601c3 = interfaceC28601c1;
                            c28655q4.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                        enumC35102hM111044q = m111044q(interfaceC28601c2);
                        enumC35102h = EnumC35102h.NORMAL;
                        f13 = 0.0f;
                        if (enumC35102hM111044q == enumC35102h) {
                            f14 = 0.0f;
                        } else {
                            f14 = -90.0f;
                        }
                        i36 = i15;
                        interfaceC4351m5 = interfaceC4351m4;
                        boolean z213 = z13;
                        Function1 function13 = function7;
                        C11347e2 c11347e2M30574v5 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        InterfaceC28670t2 interfaceC28670t2M30588b4 = AbstractC11352g.m30588b(f14, c11347e2M30574v5, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                        if (m111044q(interfaceC28601c2) != enumC35102h) {
                            f13 = 1.0f;
                        }
                        C11347e2 c11347e2M30574v6 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v6, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                        fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                        if (cVar.getCardStackSize() > 0) {
                            f15 = 1 * 8;
                        } else {
                            f15 = 8 * 0;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30587a3 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                        C2314t c2314t3 = C2314t.f9131w;
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                        InterfaceC4339a interfaceC4339a15 = interfaceC4339a3;
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, modifierM3409f3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        InterfaceC28601c1 interfaceC28601c6 = interfaceC28601c3;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N3);
                        if (cVar.getCardStackSize() == 0) {
                            c28655q4.m87150e0(2074981695);
                            c28655q4.m87173q(false);
                            c28655q2 = c28655q4;
                        } else {
                            c28655q4.m87150e0(2074981695);
                            c28655q4.m87173q(false);
                            c28655q2 = c28655q4;
                        }
                        i37 = i36 & 57344;
                        c28655q3 = c28655q2;
                        function9 = function8;
                        AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function13, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t3, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a3), 0.0f, 11);
                        zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                        objM87133R6 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R6 = new Function1() { // from class: un1.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                                }
                            };
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new Function1() { // from class: un1.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                                }
                            };
                            c28655q3.m87172p0(objM87133R6);
                        }
                        Modifier modifierM3390l3 = AbstractC1099a.m3390l(modifierM3398t3, (Function1) objM87133R6);
                        int iM115207b3 = cVar.getCardStackSize();
                        if (m111044q(interfaceC28601c2) == enumC35102h) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean zM115214i3 = cVar.getIsUpdating();
                        boolean zM111024G3 = m111024G(interfaceC28601c6);
                        float fM111047t3 = m111047t(interfaceC28670t2M30588b4);
                        boolean zM115213h3 = cVar.getPlayShimmer();
                        boolean zM115209d3 = cVar.getHighlightCounter();
                        EnumC35102h enumC35102hM111044q4 = m111044q(interfaceC28601c2);
                        boolean zM87157i7 = c28655q3.m87157i(cVar);
                        if ((i36 & 29360128) == 8388608) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z214 = zM87157i7 | z24;
                        if (i37 == 16384) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zM87157i = z214 | z25 | c28655q3.m87157i(interfaceC29805a);
                        objM87133R7 = c28655q3.m87133R();
                        if (zM87157i) {
                            objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                            function10 = function9;
                            interfaceC4351m3 = interfaceC4351m5;
                            c28655q3.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                            function10 = function9;
                            interfaceC4351m3 = interfaceC4351m5;
                            c28655q3.m87172p0(objM87133R7);
                        }
                        AbstractC35097c.m111000c(modifierM3390l3, iM115207b3, z19, fM111047t3, zM115214i3, zM111024G3, zM115213h3, zM115209d3, enumC35102hM111044q4, interfaceC4339a15, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                        c28655q3.m87173q(true);
                        function6 = function10;
                        c28655q = c28655q3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z15 = z213;
                        interfaceC4339a4 = interfaceC4339a15;
                        function5 = function13;
                    } else {
                        c28655q4.m87138X();
                        function4 = function1;
                        z15 = z13;
                        c28655q = c28655q4;
                        interfaceC4339a4 = interfaceC4339a3;
                        interfaceC4351m3 = interfaceC4351m2;
                        function5 = function2;
                        interfaceC4339a5 = interfaceC4339a2;
                        function6 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
                    }
                }
                i15 |= 24576;
                interfaceC4351m2 = interfaceC4351m;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q4.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i15 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    if (i38 != 0) {
                        z13 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C32223d(29);
                            c28655q4.m87172p0(objM87133R13);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                    }
                    if (i18 != 0) {
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C34015h(19);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        function4 = (Function1) objM87133R12;
                    } else {
                        function4 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R11 = c28655q4.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35093a(3);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i26 != 0) {
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C34015h(20);
                            c28655q4.m87172p0(objM87133R10);
                        }
                        function7 = (Function1) objM87133R10;
                    } else {
                        function7 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R9 = c28655q4.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C35100f(0);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                    } else {
                        interfaceC4339a6 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R8 = c28655q4.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C34015h(21);
                            c28655q4.m87172p0(objM87133R8);
                        }
                        function8 = (Function1) objM87133R8;
                    } else {
                        function8 = function3;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                    boolean zM87157i8 = c28655q4.m87157i(viewState);
                    if ((i15 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z215 = zM87157i8 | z16;
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z215 | z17;
                    objM87133R3 = c28655q4.m87133R();
                    if (z18) {
                        InterfaceC4339a interfaceC4339a16 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a16, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a16;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        InterfaceC4339a interfaceC4339a17 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a17, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a17;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                    enumC35102hM111044q = m111044q(interfaceC28601c2);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM111044q == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i36 = i15;
                    interfaceC4351m5 = interfaceC4351m4;
                    boolean z216 = z13;
                    Function1 function14 = function7;
                    C11347e2 c11347e2M30574v7 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b5 = AbstractC11352g.m30588b(f14, c11347e2M30574v7, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                    if (m111044q(interfaceC28601c2) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v8 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v8, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                    if (cVar.getCardStackSize() > 0) {
                        f15 = 1 * 8;
                    } else {
                        f15 = 8 * 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a4 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                    C2314t c2314t4 = C2314t.f9131w;
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t4);
                    InterfaceC4339a interfaceC4339a18 = interfaceC4339a3;
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, modifierM3409f4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c3;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N4);
                    if (cVar.getCardStackSize() == 0) {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    } else {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    }
                    i37 = i36 & 57344;
                    c28655q3 = c28655q2;
                    function9 = function8;
                    AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function14, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t4, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a4), 0.0f, 11);
                    zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                    objM87133R6 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    }
                    Modifier modifierM3390l4 = AbstractC1099a.m3390l(modifierM3398t4, (Function1) objM87133R6);
                    int iM115207b4 = cVar.getCardStackSize();
                    if (m111044q(interfaceC28601c2) == enumC35102h) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean zM115214i4 = cVar.getIsUpdating();
                    boolean zM111024G4 = m111024G(interfaceC28601c7);
                    float fM111047t4 = m111047t(interfaceC28670t2M30588b5);
                    boolean zM115213h4 = cVar.getPlayShimmer();
                    boolean zM115209d4 = cVar.getHighlightCounter();
                    EnumC35102h enumC35102hM111044q5 = m111044q(interfaceC28601c2);
                    boolean zM87157i9 = c28655q3.m87157i(cVar);
                    if ((i36 & 29360128) == 8388608) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z217 = zM87157i9 | z24;
                    if (i37 == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z217 | z25 | c28655q3.m87157i(interfaceC29805a);
                    objM87133R7 = c28655q3.m87133R();
                    if (zM87157i) {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    }
                    AbstractC35097c.m111000c(modifierM3390l4, iM115207b4, z19, fM111047t4, zM115214i4, zM111024G4, zM115213h4, zM115209d4, enumC35102hM111044q5, interfaceC4339a18, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                    c28655q3.m87173q(true);
                    function6 = function10;
                    c28655q = c28655q3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z15 = z216;
                    interfaceC4339a4 = interfaceC4339a18;
                    function5 = function14;
                } else {
                    c28655q4.m87138X();
                    function4 = function1;
                    z15 = z13;
                    c28655q = c28655q4;
                    interfaceC4339a4 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                    function5 = function2;
                    interfaceC4339a5 = interfaceC4339a2;
                    function6 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
                }
            }
            i15 |= 384;
            interfaceC4339a3 = interfaceC4339a;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q4.m87157i(function1)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4351m2 = interfaceC4351m;
                        if (c28655q4.m87157i(interfaceC4351m2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q4.m87157i(function2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q4.m87157i(interfaceC4339a2)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 128;
                    if (i34 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q4.m87157i(function3)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        if (i38 != 0) {
                            z13 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R13 = c28655q4.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C32223d(29);
                                c28655q4.m87172p0(objM87133R13);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                        }
                        if (i18 != 0) {
                            objM87133R12 = c28655q4.m87133R();
                            if (objM87133R12 == c28676v0) {
                                objM87133R12 = new C34015h(19);
                                c28655q4.m87172p0(objM87133R12);
                            }
                            function4 = (Function1) objM87133R12;
                        } else {
                            function4 = function1;
                        }
                        if (i24 != 0) {
                            objM87133R11 = c28655q4.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C35093a(3);
                                c28655q4.m87172p0(objM87133R11);
                            }
                            interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                        } else {
                            interfaceC4351m4 = interfaceC4351m2;
                        }
                        if (i26 != 0) {
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C34015h(20);
                                c28655q4.m87172p0(objM87133R10);
                            }
                            function7 = (Function1) objM87133R10;
                        } else {
                            function7 = function2;
                        }
                        if (i28 != 0) {
                            objM87133R9 = c28655q4.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C35100f(0);
                                c28655q4.m87172p0(objM87133R9);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                        } else {
                            interfaceC4339a6 = interfaceC4339a2;
                        }
                        if (i34 != 0) {
                            objM87133R8 = c28655q4.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C34015h(21);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            function8 = (Function1) objM87133R8;
                        } else {
                            function8 = function3;
                        }
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                        boolean zM87157i10 = c28655q4.m87157i(viewState);
                        if ((i15 & 3670016) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z218 = zM87157i10 | z16;
                        if ((i15 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z218 | z17;
                        objM87133R3 = c28655q4.m87133R();
                        if (z18) {
                            InterfaceC4339a interfaceC4339a19 = interfaceC4339a6;
                            objM87133R3 = new a(viewState, interfaceC4339a19, function4, interfaceC28601c1, null);
                            cVar = viewState;
                            interfaceC4339a7 = interfaceC4339a19;
                            interfaceC28601c3 = interfaceC28601c1;
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            InterfaceC4339a interfaceC4339a110 = interfaceC4339a6;
                            objM87133R3 = new a(viewState, interfaceC4339a110, function4, interfaceC28601c1, null);
                            cVar = viewState;
                            interfaceC4339a7 = interfaceC4339a110;
                            interfaceC28601c3 = interfaceC28601c1;
                            c28655q4.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                        enumC35102hM111044q = m111044q(interfaceC28601c2);
                        enumC35102h = EnumC35102h.NORMAL;
                        f13 = 0.0f;
                        if (enumC35102hM111044q == enumC35102h) {
                            f14 = 0.0f;
                        } else {
                            f14 = -90.0f;
                        }
                        i36 = i15;
                        interfaceC4351m5 = interfaceC4351m4;
                        boolean z219 = z13;
                        Function1 function15 = function7;
                        C11347e2 c11347e2M30574v9 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        InterfaceC28670t2 interfaceC28670t2M30588b6 = AbstractC11352g.m30588b(f14, c11347e2M30574v9, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                        if (m111044q(interfaceC28601c2) != enumC35102h) {
                            f13 = 1.0f;
                        }
                        C11347e2 c11347e2M30574v10 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v10, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                        fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                        if (cVar.getCardStackSize() > 0) {
                            f15 = 1 * 8;
                        } else {
                            f15 = 8 * 0;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30587a5 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                        C2314t c2314t5 = C2314t.f9131w;
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t5);
                        InterfaceC4339a interfaceC4339a111 = interfaceC4339a3;
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q4.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q4, modifierM3409f5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        InterfaceC28601c1 interfaceC28601c8 = interfaceC28601c3;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N5);
                        if (cVar.getCardStackSize() == 0) {
                            c28655q4.m87150e0(2074981695);
                            c28655q4.m87173q(false);
                            c28655q2 = c28655q4;
                        } else {
                            c28655q4.m87150e0(2074981695);
                            c28655q4.m87173q(false);
                            c28655q2 = c28655q4;
                        }
                        i37 = i36 & 57344;
                        c28655q3 = c28655q2;
                        function9 = function8;
                        AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function15, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                        Modifier modifierM3398t5 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t5, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a5), 0.0f, 11);
                        zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                        objM87133R6 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R6 = new Function1() { // from class: un1.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                                }
                            };
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new Function1() { // from class: un1.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                                }
                            };
                            c28655q3.m87172p0(objM87133R6);
                        }
                        Modifier modifierM3390l5 = AbstractC1099a.m3390l(modifierM3398t5, (Function1) objM87133R6);
                        int iM115207b5 = cVar.getCardStackSize();
                        if (m111044q(interfaceC28601c2) == enumC35102h) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean zM115214i5 = cVar.getIsUpdating();
                        boolean zM111024G5 = m111024G(interfaceC28601c8);
                        float fM111047t5 = m111047t(interfaceC28670t2M30588b6);
                        boolean zM115213h5 = cVar.getPlayShimmer();
                        boolean zM115209d5 = cVar.getHighlightCounter();
                        EnumC35102h enumC35102hM111044q6 = m111044q(interfaceC28601c2);
                        boolean zM87157i11 = c28655q3.m87157i(cVar);
                        if ((i36 & 29360128) == 8388608) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z2110 = zM87157i11 | z24;
                        if (i37 == 16384) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zM87157i = z2110 | z25 | c28655q3.m87157i(interfaceC29805a);
                        objM87133R7 = c28655q3.m87133R();
                        if (zM87157i) {
                            objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                            function10 = function9;
                            interfaceC4351m3 = interfaceC4351m5;
                            c28655q3.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                            function10 = function9;
                            interfaceC4351m3 = interfaceC4351m5;
                            c28655q3.m87172p0(objM87133R7);
                        }
                        AbstractC35097c.m111000c(modifierM3390l5, iM115207b5, z19, fM111047t5, zM115214i5, zM111024G5, zM115213h5, zM115209d5, enumC35102hM111044q6, interfaceC4339a111, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                        c28655q3.m87173q(true);
                        function6 = function10;
                        c28655q = c28655q3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z15 = z219;
                        interfaceC4339a4 = interfaceC4339a111;
                        function5 = function15;
                    } else {
                        c28655q4.m87138X();
                        function4 = function1;
                        z15 = z13;
                        c28655q = c28655q4;
                        interfaceC4339a4 = interfaceC4339a3;
                        interfaceC4351m3 = interfaceC4351m2;
                        function5 = function2;
                        interfaceC4339a5 = interfaceC4339a2;
                        function6 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
                    }
                }
                i15 |= 24576;
                interfaceC4351m2 = interfaceC4351m;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q4.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i15 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    if (i38 != 0) {
                        z13 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C32223d(29);
                            c28655q4.m87172p0(objM87133R13);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                    }
                    if (i18 != 0) {
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C34015h(19);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        function4 = (Function1) objM87133R12;
                    } else {
                        function4 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R11 = c28655q4.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35093a(3);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i26 != 0) {
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C34015h(20);
                            c28655q4.m87172p0(objM87133R10);
                        }
                        function7 = (Function1) objM87133R10;
                    } else {
                        function7 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R9 = c28655q4.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C35100f(0);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                    } else {
                        interfaceC4339a6 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R8 = c28655q4.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C34015h(21);
                            c28655q4.m87172p0(objM87133R8);
                        }
                        function8 = (Function1) objM87133R8;
                    } else {
                        function8 = function3;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                    boolean zM87157i12 = c28655q4.m87157i(viewState);
                    if ((i15 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z2111 = zM87157i12 | z16;
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z2111 | z17;
                    objM87133R3 = c28655q4.m87133R();
                    if (z18) {
                        InterfaceC4339a interfaceC4339a112 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a112, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a112;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        InterfaceC4339a interfaceC4339a113 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a113, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a113;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                    enumC35102hM111044q = m111044q(interfaceC28601c2);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM111044q == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i36 = i15;
                    interfaceC4351m5 = interfaceC4351m4;
                    boolean z2112 = z13;
                    Function1 function16 = function7;
                    C11347e2 c11347e2M30574v11 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b7 = AbstractC11352g.m30588b(f14, c11347e2M30574v11, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                    if (m111044q(interfaceC28601c2) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v12 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v12, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                    if (cVar.getCardStackSize() > 0) {
                        f15 = 1 * 8;
                    } else {
                        f15 = 8 * 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a6 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                    C2314t c2314t6 = C2314t.f9131w;
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t6);
                    InterfaceC4339a interfaceC4339a114 = interfaceC4339a3;
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q4.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q4, modifierM3409f6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    InterfaceC28601c1 interfaceC28601c9 = interfaceC28601c3;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N6);
                    if (cVar.getCardStackSize() == 0) {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    } else {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    }
                    i37 = i36 & 57344;
                    c28655q3 = c28655q2;
                    function9 = function8;
                    AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function16, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t6, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a6), 0.0f, 11);
                    zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                    objM87133R6 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    }
                    Modifier modifierM3390l6 = AbstractC1099a.m3390l(modifierM3398t6, (Function1) objM87133R6);
                    int iM115207b6 = cVar.getCardStackSize();
                    if (m111044q(interfaceC28601c2) == enumC35102h) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean zM115214i6 = cVar.getIsUpdating();
                    boolean zM111024G6 = m111024G(interfaceC28601c9);
                    float fM111047t6 = m111047t(interfaceC28670t2M30588b7);
                    boolean zM115213h6 = cVar.getPlayShimmer();
                    boolean zM115209d6 = cVar.getHighlightCounter();
                    EnumC35102h enumC35102hM111044q7 = m111044q(interfaceC28601c2);
                    boolean zM87157i13 = c28655q3.m87157i(cVar);
                    if ((i36 & 29360128) == 8388608) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z2113 = zM87157i13 | z24;
                    if (i37 == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z2113 | z25 | c28655q3.m87157i(interfaceC29805a);
                    objM87133R7 = c28655q3.m87133R();
                    if (zM87157i) {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    }
                    AbstractC35097c.m111000c(modifierM3390l6, iM115207b6, z19, fM111047t6, zM115214i6, zM111024G6, zM115213h6, zM115209d6, enumC35102hM111044q7, interfaceC4339a114, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                    c28655q3.m87173q(true);
                    function6 = function10;
                    c28655q = c28655q3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z15 = z2112;
                    interfaceC4339a4 = interfaceC4339a114;
                    function5 = function16;
                } else {
                    c28655q4.m87138X();
                    function4 = function1;
                    z15 = z13;
                    c28655q = c28655q4;
                    interfaceC4339a4 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                    function5 = function2;
                    interfaceC4339a5 = interfaceC4339a2;
                    function6 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
                }
            }
            i15 |= 3072;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4351m2 = interfaceC4351m;
                    if (c28655q4.m87157i(interfaceC4351m2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q4.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i15 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    if (i38 != 0) {
                        z13 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C32223d(29);
                            c28655q4.m87172p0(objM87133R13);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                    }
                    if (i18 != 0) {
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C34015h(19);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        function4 = (Function1) objM87133R12;
                    } else {
                        function4 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R11 = c28655q4.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35093a(3);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i26 != 0) {
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C34015h(20);
                            c28655q4.m87172p0(objM87133R10);
                        }
                        function7 = (Function1) objM87133R10;
                    } else {
                        function7 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R9 = c28655q4.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C35100f(0);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                    } else {
                        interfaceC4339a6 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R8 = c28655q4.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C34015h(21);
                            c28655q4.m87172p0(objM87133R8);
                        }
                        function8 = (Function1) objM87133R8;
                    } else {
                        function8 = function3;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                    boolean zM87157i14 = c28655q4.m87157i(viewState);
                    if ((i15 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z2114 = zM87157i14 | z16;
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z2114 | z17;
                    objM87133R3 = c28655q4.m87133R();
                    if (z18) {
                        InterfaceC4339a interfaceC4339a115 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a115, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a115;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        InterfaceC4339a interfaceC4339a116 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a116, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a116;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                    enumC35102hM111044q = m111044q(interfaceC28601c2);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM111044q == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i36 = i15;
                    interfaceC4351m5 = interfaceC4351m4;
                    boolean z2115 = z13;
                    Function1 function17 = function7;
                    C11347e2 c11347e2M30574v13 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b8 = AbstractC11352g.m30588b(f14, c11347e2M30574v13, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                    if (m111044q(interfaceC28601c2) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v14 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v14, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                    if (cVar.getCardStackSize() > 0) {
                        f15 = 1 * 8;
                    } else {
                        f15 = 8 * 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a7 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                    C2314t c2314t7 = C2314t.f9131w;
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t7);
                    InterfaceC4339a interfaceC4339a117 = interfaceC4339a3;
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q4.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q4, modifierM3409f7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    InterfaceC28601c1 interfaceC28601c10 = interfaceC28601c3;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N7);
                    if (cVar.getCardStackSize() == 0) {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    } else {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    }
                    i37 = i36 & 57344;
                    c28655q3 = c28655q2;
                    function9 = function8;
                    AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function17, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                    Modifier modifierM3398t7 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t7, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a7), 0.0f, 11);
                    zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                    objM87133R6 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    }
                    Modifier modifierM3390l7 = AbstractC1099a.m3390l(modifierM3398t7, (Function1) objM87133R6);
                    int iM115207b7 = cVar.getCardStackSize();
                    if (m111044q(interfaceC28601c2) == enumC35102h) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean zM115214i7 = cVar.getIsUpdating();
                    boolean zM111024G7 = m111024G(interfaceC28601c10);
                    float fM111047t7 = m111047t(interfaceC28670t2M30588b8);
                    boolean zM115213h7 = cVar.getPlayShimmer();
                    boolean zM115209d7 = cVar.getHighlightCounter();
                    EnumC35102h enumC35102hM111044q8 = m111044q(interfaceC28601c2);
                    boolean zM87157i15 = c28655q3.m87157i(cVar);
                    if ((i36 & 29360128) == 8388608) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z2116 = zM87157i15 | z24;
                    if (i37 == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z2116 | z25 | c28655q3.m87157i(interfaceC29805a);
                    objM87133R7 = c28655q3.m87133R();
                    if (zM87157i) {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    }
                    AbstractC35097c.m111000c(modifierM3390l7, iM115207b7, z19, fM111047t7, zM115214i7, zM111024G7, zM115213h7, zM115209d7, enumC35102hM111044q8, interfaceC4339a117, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                    c28655q3.m87173q(true);
                    function6 = function10;
                    c28655q = c28655q3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z15 = z2115;
                    interfaceC4339a4 = interfaceC4339a117;
                    function5 = function17;
                } else {
                    c28655q4.m87138X();
                    function4 = function1;
                    z15 = z13;
                    c28655q = c28655q4;
                    interfaceC4339a4 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                    function5 = function2;
                    interfaceC4339a5 = interfaceC4339a2;
                    function6 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4351m2 = interfaceC4351m;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87157i(function2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q4.m87157i(interfaceC4339a2)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
            i34 = i14 & 128;
            if (i34 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q4.m87157i(function3)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i15 |= i35;
            }
            if ((i15 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                if (i38 != 0) {
                    z13 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C32223d(29);
                        c28655q4.m87172p0(objM87133R13);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                }
                if (i18 != 0) {
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C34015h(19);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    function4 = (Function1) objM87133R12;
                } else {
                    function4 = function1;
                }
                if (i24 != 0) {
                    objM87133R11 = c28655q4.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35093a(3);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i26 != 0) {
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C34015h(20);
                        c28655q4.m87172p0(objM87133R10);
                    }
                    function7 = (Function1) objM87133R10;
                } else {
                    function7 = function2;
                }
                if (i28 != 0) {
                    objM87133R9 = c28655q4.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C35100f(0);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                } else {
                    interfaceC4339a6 = interfaceC4339a2;
                }
                if (i34 != 0) {
                    objM87133R8 = c28655q4.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C34015h(21);
                        c28655q4.m87172p0(objM87133R8);
                    }
                    function8 = (Function1) objM87133R8;
                } else {
                    function8 = function3;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                    c28655q4.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                boolean zM87157i16 = c28655q4.m87157i(viewState);
                if ((i15 & 3670016) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z2117 = zM87157i16 | z16;
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z2117 | z17;
                objM87133R3 = c28655q4.m87133R();
                if (z18) {
                    InterfaceC4339a interfaceC4339a118 = interfaceC4339a6;
                    objM87133R3 = new a(viewState, interfaceC4339a118, function4, interfaceC28601c1, null);
                    cVar = viewState;
                    interfaceC4339a7 = interfaceC4339a118;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q4.m87172p0(objM87133R3);
                } else {
                    InterfaceC4339a interfaceC4339a119 = interfaceC4339a6;
                    objM87133R3 = new a(viewState, interfaceC4339a119, function4, interfaceC28601c1, null);
                    cVar = viewState;
                    interfaceC4339a7 = interfaceC4339a119;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q4.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                enumC35102hM111044q = m111044q(interfaceC28601c2);
                enumC35102h = EnumC35102h.NORMAL;
                f13 = 0.0f;
                if (enumC35102hM111044q == enumC35102h) {
                    f14 = 0.0f;
                } else {
                    f14 = -90.0f;
                }
                i36 = i15;
                interfaceC4351m5 = interfaceC4351m4;
                boolean z2118 = z13;
                Function1 function18 = function7;
                C11347e2 c11347e2M30574v15 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R4 = c28655q4.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                    c28655q4.m87172p0(objM87133R4);
                }
                InterfaceC28670t2 interfaceC28670t2M30588b9 = AbstractC11352g.m30588b(f14, c11347e2M30574v15, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                if (m111044q(interfaceC28601c2) != enumC35102h) {
                    f13 = 1.0f;
                }
                C11347e2 c11347e2M30574v16 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                    c28655q4.m87172p0(objM87133R5);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v16, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                if (cVar.getCardStackSize() > 0) {
                    f15 = 1 * 8;
                } else {
                    f15 = 8 * 0;
                }
                InterfaceC28670t2 interfaceC28670t2M30587a8 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                C2314t c2314t8 = C2314t.f9131w;
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t8);
                InterfaceC4339a interfaceC4339a1110 = interfaceC4339a3;
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q4.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q4, modifierM3409f8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                InterfaceC28601c1 interfaceC28601c11 = interfaceC28601c3;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N8);
                if (cVar.getCardStackSize() == 0) {
                    c28655q4.m87150e0(2074981695);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                } else {
                    c28655q4.m87150e0(2074981695);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                }
                i37 = i36 & 57344;
                c28655q3 = c28655q2;
                function9 = function8;
                AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function18, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                Modifier modifierM3398t8 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t8, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a8), 0.0f, 11);
                zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                objM87133R6 = c28655q3.m87133R();
                if (zM87147d) {
                    objM87133R6 = new Function1() { // from class: un1.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                        }
                    };
                    c28655q3.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new Function1() { // from class: un1.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                        }
                    };
                    c28655q3.m87172p0(objM87133R6);
                }
                Modifier modifierM3390l8 = AbstractC1099a.m3390l(modifierM3398t8, (Function1) objM87133R6);
                int iM115207b8 = cVar.getCardStackSize();
                if (m111044q(interfaceC28601c2) == enumC35102h) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean zM115214i8 = cVar.getIsUpdating();
                boolean zM111024G8 = m111024G(interfaceC28601c11);
                float fM111047t8 = m111047t(interfaceC28670t2M30588b9);
                boolean zM115213h8 = cVar.getPlayShimmer();
                boolean zM115209d8 = cVar.getHighlightCounter();
                EnumC35102h enumC35102hM111044q9 = m111044q(interfaceC28601c2);
                boolean zM87157i17 = c28655q3.m87157i(cVar);
                if ((i36 & 29360128) == 8388608) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z2119 = zM87157i17 | z24;
                if (i37 == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM87157i = z2119 | z25 | c28655q3.m87157i(interfaceC29805a);
                objM87133R7 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                    function10 = function9;
                    interfaceC4351m3 = interfaceC4351m5;
                    c28655q3.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                    function10 = function9;
                    interfaceC4351m3 = interfaceC4351m5;
                    c28655q3.m87172p0(objM87133R7);
                }
                AbstractC35097c.m111000c(modifierM3390l8, iM115207b8, z19, fM111047t8, zM115214i8, zM111024G8, zM115213h8, zM115209d8, enumC35102hM111044q9, interfaceC4339a1110, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                c28655q3.m87173q(true);
                function6 = function10;
                c28655q = c28655q3;
                interfaceC4339a5 = interfaceC4339a7;
                z15 = z2118;
                interfaceC4339a4 = interfaceC4339a1110;
                function5 = function18;
            } else {
                c28655q4.m87138X();
                function4 = function1;
                z15 = z13;
                c28655q = c28655q4;
                interfaceC4339a4 = interfaceC4339a3;
                interfaceC4351m3 = interfaceC4351m2;
                function5 = function2;
                interfaceC4339a5 = interfaceC4339a2;
                function6 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
            }
        }
        i15 |= 48;
        z13 = z4;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                if (c28655q4.m87157i(interfaceC4339a3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q4.m87157i(function1)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4351m2 = interfaceC4351m;
                        if (c28655q4.m87157i(interfaceC4351m2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q4.m87157i(function2)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q4.m87157i(interfaceC4339a2)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                    i34 = i14 & 128;
                    if (i34 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q4.m87157i(function3)) {
                            i35 = 8388608;
                        } else {
                            i35 = 4194304;
                        }
                        i15 |= i35;
                    }
                    if ((i15 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q4.m87135U(i15 & 1, z14)) {
                        if (i38 != 0) {
                            z13 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R13 = c28655q4.m87133R();
                            if (objM87133R13 == c28676v0) {
                                objM87133R13 = new C32223d(29);
                                c28655q4.m87172p0(objM87133R13);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                        }
                        if (i18 != 0) {
                            objM87133R12 = c28655q4.m87133R();
                            if (objM87133R12 == c28676v0) {
                                objM87133R12 = new C34015h(19);
                                c28655q4.m87172p0(objM87133R12);
                            }
                            function4 = (Function1) objM87133R12;
                        } else {
                            function4 = function1;
                        }
                        if (i24 != 0) {
                            objM87133R11 = c28655q4.m87133R();
                            if (objM87133R11 == c28676v0) {
                                objM87133R11 = new C35093a(3);
                                c28655q4.m87172p0(objM87133R11);
                            }
                            interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                        } else {
                            interfaceC4351m4 = interfaceC4351m2;
                        }
                        if (i26 != 0) {
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == c28676v0) {
                                objM87133R10 = new C34015h(20);
                                c28655q4.m87172p0(objM87133R10);
                            }
                            function7 = (Function1) objM87133R10;
                        } else {
                            function7 = function2;
                        }
                        if (i28 != 0) {
                            objM87133R9 = c28655q4.m87133R();
                            if (objM87133R9 == c28676v0) {
                                objM87133R9 = new C35100f(0);
                                c28655q4.m87172p0(objM87133R9);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                        } else {
                            interfaceC4339a6 = interfaceC4339a2;
                        }
                        if (i34 != 0) {
                            objM87133R8 = c28655q4.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C34015h(21);
                                c28655q4.m87172p0(objM87133R8);
                            }
                            function8 = (Function1) objM87133R8;
                        } else {
                            function8 = function3;
                        }
                        objM87133R = c28655q4.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q4.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        objM87133R2 = c28655q4.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                            c28655q4.m87172p0(objM87133R2);
                        }
                        interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                        boolean zM87157i18 = c28655q4.m87157i(viewState);
                        if ((i15 & 3670016) == 1048576) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean z21110 = zM87157i18 | z16;
                        if ((i15 & 7168) == 2048) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = z21110 | z17;
                        objM87133R3 = c28655q4.m87133R();
                        if (z18) {
                            InterfaceC4339a interfaceC4339a1111 = interfaceC4339a6;
                            objM87133R3 = new a(viewState, interfaceC4339a1111, function4, interfaceC28601c1, null);
                            cVar = viewState;
                            interfaceC4339a7 = interfaceC4339a1111;
                            interfaceC28601c3 = interfaceC28601c1;
                            c28655q4.m87172p0(objM87133R3);
                        } else {
                            InterfaceC4339a interfaceC4339a1112 = interfaceC4339a6;
                            objM87133R3 = new a(viewState, interfaceC4339a1112, function4, interfaceC28601c1, null);
                            cVar = viewState;
                            interfaceC4339a7 = interfaceC4339a1112;
                            interfaceC28601c3 = interfaceC28601c1;
                            c28655q4.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                        enumC35102hM111044q = m111044q(interfaceC28601c2);
                        enumC35102h = EnumC35102h.NORMAL;
                        f13 = 0.0f;
                        if (enumC35102hM111044q == enumC35102h) {
                            f14 = 0.0f;
                        } else {
                            f14 = -90.0f;
                        }
                        i36 = i15;
                        interfaceC4351m5 = interfaceC4351m4;
                        boolean z21111 = z13;
                        Function1 function19 = function7;
                        C11347e2 c11347e2M30574v17 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R4 = c28655q4.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                            c28655q4.m87172p0(objM87133R4);
                        }
                        InterfaceC28670t2 interfaceC28670t2M30588b10 = AbstractC11352g.m30588b(f14, c11347e2M30574v17, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                        if (m111044q(interfaceC28601c2) != enumC35102h) {
                            f13 = 1.0f;
                        }
                        C11347e2 c11347e2M30574v18 = AbstractC11348f.m30574v(500, 0, null, 6);
                        objM87133R5 = c28655q4.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                            c28655q4.m87172p0(objM87133R5);
                        }
                        interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v18, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                        fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                        if (cVar.getCardStackSize() > 0) {
                            f15 = 1 * 8;
                        } else {
                            f15 = 8 * 0;
                        }
                        InterfaceC28670t2 interfaceC28670t2M30587a9 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                        C2314t c2314t9 = C2314t.f9131w;
                        Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t9);
                        InterfaceC4339a interfaceC4339a1113 = interfaceC4339a3;
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iHashCode = Long.hashCode(c28655q4.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q4.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q4, modifierM3409f9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q4.m87158i0();
                        InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c3;
                        if (c28655q4.f115903S) {
                            c28655q4.m87163l(c0213j);
                        } else {
                            c28655q4.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        if (c28655q4.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N9);
                        if (cVar.getCardStackSize() == 0) {
                            c28655q4.m87150e0(2074981695);
                            c28655q4.m87173q(false);
                            c28655q2 = c28655q4;
                        } else {
                            c28655q4.m87150e0(2074981695);
                            c28655q4.m87173q(false);
                            c28655q2 = c28655q4;
                        }
                        i37 = i36 & 57344;
                        c28655q3 = c28655q2;
                        function9 = function8;
                        AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function19, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                        Modifier modifierM3398t9 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t9, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a9), 0.0f, 11);
                        zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                        objM87133R6 = c28655q3.m87133R();
                        if (zM87147d) {
                            objM87133R6 = new Function1() { // from class: un1.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                                }
                            };
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new Function1() { // from class: un1.e
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                                }
                            };
                            c28655q3.m87172p0(objM87133R6);
                        }
                        Modifier modifierM3390l9 = AbstractC1099a.m3390l(modifierM3398t9, (Function1) objM87133R6);
                        int iM115207b9 = cVar.getCardStackSize();
                        if (m111044q(interfaceC28601c2) == enumC35102h) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean zM115214i9 = cVar.getIsUpdating();
                        boolean zM111024G9 = m111024G(interfaceC28601c12);
                        float fM111047t9 = m111047t(interfaceC28670t2M30588b10);
                        boolean zM115213h9 = cVar.getPlayShimmer();
                        boolean zM115209d9 = cVar.getHighlightCounter();
                        EnumC35102h enumC35102hM111044q10 = m111044q(interfaceC28601c2);
                        boolean zM87157i19 = c28655q3.m87157i(cVar);
                        if ((i36 & 29360128) == 8388608) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        boolean z21112 = zM87157i19 | z24;
                        if (i37 == 16384) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zM87157i = z21112 | z25 | c28655q3.m87157i(interfaceC29805a);
                        objM87133R7 = c28655q3.m87133R();
                        if (zM87157i) {
                            objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                            function10 = function9;
                            interfaceC4351m3 = interfaceC4351m5;
                            c28655q3.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                            function10 = function9;
                            interfaceC4351m3 = interfaceC4351m5;
                            c28655q3.m87172p0(objM87133R7);
                        }
                        AbstractC35097c.m111000c(modifierM3390l9, iM115207b9, z19, fM111047t9, zM115214i9, zM111024G9, zM115213h9, zM115209d9, enumC35102hM111044q10, interfaceC4339a1113, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                        c28655q3.m87173q(true);
                        function6 = function10;
                        c28655q = c28655q3;
                        interfaceC4339a5 = interfaceC4339a7;
                        z15 = z21111;
                        interfaceC4339a4 = interfaceC4339a1113;
                        function5 = function19;
                    } else {
                        c28655q4.m87138X();
                        function4 = function1;
                        z15 = z13;
                        c28655q = c28655q4;
                        interfaceC4339a4 = interfaceC4339a3;
                        interfaceC4351m3 = interfaceC4351m2;
                        function5 = function2;
                        interfaceC4339a5 = interfaceC4339a2;
                        function6 = function3;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
                    }
                }
                i15 |= 24576;
                interfaceC4351m2 = interfaceC4351m;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q4.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i15 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    if (i38 != 0) {
                        z13 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C32223d(29);
                            c28655q4.m87172p0(objM87133R13);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                    }
                    if (i18 != 0) {
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C34015h(19);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        function4 = (Function1) objM87133R12;
                    } else {
                        function4 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R11 = c28655q4.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35093a(3);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i26 != 0) {
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C34015h(20);
                            c28655q4.m87172p0(objM87133R10);
                        }
                        function7 = (Function1) objM87133R10;
                    } else {
                        function7 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R9 = c28655q4.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C35100f(0);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                    } else {
                        interfaceC4339a6 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R8 = c28655q4.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C34015h(21);
                            c28655q4.m87172p0(objM87133R8);
                        }
                        function8 = (Function1) objM87133R8;
                    } else {
                        function8 = function3;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                    boolean zM87157i110 = c28655q4.m87157i(viewState);
                    if ((i15 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z21113 = zM87157i110 | z16;
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z21113 | z17;
                    objM87133R3 = c28655q4.m87133R();
                    if (z18) {
                        InterfaceC4339a interfaceC4339a1114 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a1114, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a1114;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        InterfaceC4339a interfaceC4339a1115 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a1115, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a1115;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                    enumC35102hM111044q = m111044q(interfaceC28601c2);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM111044q == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i36 = i15;
                    interfaceC4351m5 = interfaceC4351m4;
                    boolean z21114 = z13;
                    Function1 function110 = function7;
                    C11347e2 c11347e2M30574v19 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b11 = AbstractC11352g.m30588b(f14, c11347e2M30574v19, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                    if (m111044q(interfaceC28601c2) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v110 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v110, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                    if (cVar.getCardStackSize() > 0) {
                        f15 = 1 * 8;
                    } else {
                        f15 = 8 * 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a10 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                    C2314t c2314t10 = C2314t.f9131w;
                    Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t10);
                    InterfaceC4339a interfaceC4339a1116 = interfaceC4339a3;
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q4.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q4, modifierM3409f10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c3;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N10);
                    if (cVar.getCardStackSize() == 0) {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    } else {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    }
                    i37 = i36 & 57344;
                    c28655q3 = c28655q2;
                    function9 = function8;
                    AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function110, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                    Modifier modifierM3398t10 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t10, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a10), 0.0f, 11);
                    zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                    objM87133R6 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    }
                    Modifier modifierM3390l10 = AbstractC1099a.m3390l(modifierM3398t10, (Function1) objM87133R6);
                    int iM115207b10 = cVar.getCardStackSize();
                    if (m111044q(interfaceC28601c2) == enumC35102h) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean zM115214i10 = cVar.getIsUpdating();
                    boolean zM111024G10 = m111024G(interfaceC28601c13);
                    float fM111047t10 = m111047t(interfaceC28670t2M30588b11);
                    boolean zM115213h10 = cVar.getPlayShimmer();
                    boolean zM115209d10 = cVar.getHighlightCounter();
                    EnumC35102h enumC35102hM111044q11 = m111044q(interfaceC28601c2);
                    boolean zM87157i111 = c28655q3.m87157i(cVar);
                    if ((i36 & 29360128) == 8388608) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z21115 = zM87157i111 | z24;
                    if (i37 == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z21115 | z25 | c28655q3.m87157i(interfaceC29805a);
                    objM87133R7 = c28655q3.m87133R();
                    if (zM87157i) {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    }
                    AbstractC35097c.m111000c(modifierM3390l10, iM115207b10, z19, fM111047t10, zM115214i10, zM111024G10, zM115213h10, zM115209d10, enumC35102hM111044q11, interfaceC4339a1116, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                    c28655q3.m87173q(true);
                    function6 = function10;
                    c28655q = c28655q3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z15 = z21114;
                    interfaceC4339a4 = interfaceC4339a1116;
                    function5 = function110;
                } else {
                    c28655q4.m87138X();
                    function4 = function1;
                    z15 = z13;
                    c28655q = c28655q4;
                    interfaceC4339a4 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                    function5 = function2;
                    interfaceC4339a5 = interfaceC4339a2;
                    function6 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
                }
            }
            i15 |= 3072;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4351m2 = interfaceC4351m;
                    if (c28655q4.m87157i(interfaceC4351m2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q4.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i15 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    if (i38 != 0) {
                        z13 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C32223d(29);
                            c28655q4.m87172p0(objM87133R13);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                    }
                    if (i18 != 0) {
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C34015h(19);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        function4 = (Function1) objM87133R12;
                    } else {
                        function4 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R11 = c28655q4.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35093a(3);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i26 != 0) {
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C34015h(20);
                            c28655q4.m87172p0(objM87133R10);
                        }
                        function7 = (Function1) objM87133R10;
                    } else {
                        function7 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R9 = c28655q4.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C35100f(0);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                    } else {
                        interfaceC4339a6 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R8 = c28655q4.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C34015h(21);
                            c28655q4.m87172p0(objM87133R8);
                        }
                        function8 = (Function1) objM87133R8;
                    } else {
                        function8 = function3;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                    boolean zM87157i112 = c28655q4.m87157i(viewState);
                    if ((i15 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z21116 = zM87157i112 | z16;
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z21116 | z17;
                    objM87133R3 = c28655q4.m87133R();
                    if (z18) {
                        InterfaceC4339a interfaceC4339a1117 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a1117, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a1117;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        InterfaceC4339a interfaceC4339a1118 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a1118, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a1118;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                    enumC35102hM111044q = m111044q(interfaceC28601c2);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM111044q == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i36 = i15;
                    interfaceC4351m5 = interfaceC4351m4;
                    boolean z21117 = z13;
                    Function1 function111 = function7;
                    C11347e2 c11347e2M30574v111 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b12 = AbstractC11352g.m30588b(f14, c11347e2M30574v111, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                    if (m111044q(interfaceC28601c2) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v112 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v112, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                    if (cVar.getCardStackSize() > 0) {
                        f15 = 1 * 8;
                    } else {
                        f15 = 8 * 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a11 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                    C2314t c2314t11 = C2314t.f9131w;
                    Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t11);
                    InterfaceC4339a interfaceC4339a1119 = interfaceC4339a3;
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q4.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q4, modifierM3409f11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c3;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m11);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N11);
                    if (cVar.getCardStackSize() == 0) {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    } else {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    }
                    i37 = i36 & 57344;
                    c28655q3 = c28655q2;
                    function9 = function8;
                    AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function111, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                    Modifier modifierM3398t11 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t11, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a11), 0.0f, 11);
                    zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                    objM87133R6 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    }
                    Modifier modifierM3390l11 = AbstractC1099a.m3390l(modifierM3398t11, (Function1) objM87133R6);
                    int iM115207b11 = cVar.getCardStackSize();
                    if (m111044q(interfaceC28601c2) == enumC35102h) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean zM115214i11 = cVar.getIsUpdating();
                    boolean zM111024G11 = m111024G(interfaceC28601c14);
                    float fM111047t11 = m111047t(interfaceC28670t2M30588b12);
                    boolean zM115213h11 = cVar.getPlayShimmer();
                    boolean zM115209d11 = cVar.getHighlightCounter();
                    EnumC35102h enumC35102hM111044q12 = m111044q(interfaceC28601c2);
                    boolean zM87157i113 = c28655q3.m87157i(cVar);
                    if ((i36 & 29360128) == 8388608) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z21118 = zM87157i113 | z24;
                    if (i37 == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z21118 | z25 | c28655q3.m87157i(interfaceC29805a);
                    objM87133R7 = c28655q3.m87133R();
                    if (zM87157i) {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    }
                    AbstractC35097c.m111000c(modifierM3390l11, iM115207b11, z19, fM111047t11, zM115214i11, zM111024G11, zM115213h11, zM115209d11, enumC35102hM111044q12, interfaceC4339a1119, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                    c28655q3.m87173q(true);
                    function6 = function10;
                    c28655q = c28655q3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z15 = z21117;
                    interfaceC4339a4 = interfaceC4339a1119;
                    function5 = function111;
                } else {
                    c28655q4.m87138X();
                    function4 = function1;
                    z15 = z13;
                    c28655q = c28655q4;
                    interfaceC4339a4 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                    function5 = function2;
                    interfaceC4339a5 = interfaceC4339a2;
                    function6 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4351m2 = interfaceC4351m;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87157i(function2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q4.m87157i(interfaceC4339a2)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
            i34 = i14 & 128;
            if (i34 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q4.m87157i(function3)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i15 |= i35;
            }
            if ((i15 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                if (i38 != 0) {
                    z13 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C32223d(29);
                        c28655q4.m87172p0(objM87133R13);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                }
                if (i18 != 0) {
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C34015h(19);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    function4 = (Function1) objM87133R12;
                } else {
                    function4 = function1;
                }
                if (i24 != 0) {
                    objM87133R11 = c28655q4.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35093a(3);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i26 != 0) {
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C34015h(20);
                        c28655q4.m87172p0(objM87133R10);
                    }
                    function7 = (Function1) objM87133R10;
                } else {
                    function7 = function2;
                }
                if (i28 != 0) {
                    objM87133R9 = c28655q4.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C35100f(0);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                } else {
                    interfaceC4339a6 = interfaceC4339a2;
                }
                if (i34 != 0) {
                    objM87133R8 = c28655q4.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C34015h(21);
                        c28655q4.m87172p0(objM87133R8);
                    }
                    function8 = (Function1) objM87133R8;
                } else {
                    function8 = function3;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                    c28655q4.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                boolean zM87157i114 = c28655q4.m87157i(viewState);
                if ((i15 & 3670016) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z21119 = zM87157i114 | z16;
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z21119 | z17;
                objM87133R3 = c28655q4.m87133R();
                if (z18) {
                    InterfaceC4339a interfaceC4339a11110 = interfaceC4339a6;
                    objM87133R3 = new a(viewState, interfaceC4339a11110, function4, interfaceC28601c1, null);
                    cVar = viewState;
                    interfaceC4339a7 = interfaceC4339a11110;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q4.m87172p0(objM87133R3);
                } else {
                    InterfaceC4339a interfaceC4339a11111 = interfaceC4339a6;
                    objM87133R3 = new a(viewState, interfaceC4339a11111, function4, interfaceC28601c1, null);
                    cVar = viewState;
                    interfaceC4339a7 = interfaceC4339a11111;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q4.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                enumC35102hM111044q = m111044q(interfaceC28601c2);
                enumC35102h = EnumC35102h.NORMAL;
                f13 = 0.0f;
                if (enumC35102hM111044q == enumC35102h) {
                    f14 = 0.0f;
                } else {
                    f14 = -90.0f;
                }
                i36 = i15;
                interfaceC4351m5 = interfaceC4351m4;
                boolean z211110 = z13;
                Function1 function112 = function7;
                C11347e2 c11347e2M30574v113 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R4 = c28655q4.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                    c28655q4.m87172p0(objM87133R4);
                }
                InterfaceC28670t2 interfaceC28670t2M30588b13 = AbstractC11352g.m30588b(f14, c11347e2M30574v113, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                if (m111044q(interfaceC28601c2) != enumC35102h) {
                    f13 = 1.0f;
                }
                C11347e2 c11347e2M30574v114 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                    c28655q4.m87172p0(objM87133R5);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v114, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                if (cVar.getCardStackSize() > 0) {
                    f15 = 1 * 8;
                } else {
                    f15 = 8 * 0;
                }
                InterfaceC28670t2 interfaceC28670t2M30587a12 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                C2314t c2314t12 = C2314t.f9131w;
                Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t12);
                InterfaceC4339a interfaceC4339a11112 = interfaceC4339a3;
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q4.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q4, modifierM3409f12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c3;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N12);
                if (cVar.getCardStackSize() == 0) {
                    c28655q4.m87150e0(2074981695);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                } else {
                    c28655q4.m87150e0(2074981695);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                }
                i37 = i36 & 57344;
                c28655q3 = c28655q2;
                function9 = function8;
                AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function112, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                Modifier modifierM3398t12 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t12, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a12), 0.0f, 11);
                zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                objM87133R6 = c28655q3.m87133R();
                if (zM87147d) {
                    objM87133R6 = new Function1() { // from class: un1.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                        }
                    };
                    c28655q3.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new Function1() { // from class: un1.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                        }
                    };
                    c28655q3.m87172p0(objM87133R6);
                }
                Modifier modifierM3390l12 = AbstractC1099a.m3390l(modifierM3398t12, (Function1) objM87133R6);
                int iM115207b12 = cVar.getCardStackSize();
                if (m111044q(interfaceC28601c2) == enumC35102h) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean zM115214i12 = cVar.getIsUpdating();
                boolean zM111024G12 = m111024G(interfaceC28601c15);
                float fM111047t12 = m111047t(interfaceC28670t2M30588b13);
                boolean zM115213h12 = cVar.getPlayShimmer();
                boolean zM115209d12 = cVar.getHighlightCounter();
                EnumC35102h enumC35102hM111044q13 = m111044q(interfaceC28601c2);
                boolean zM87157i115 = c28655q3.m87157i(cVar);
                if ((i36 & 29360128) == 8388608) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z211111 = zM87157i115 | z24;
                if (i37 == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM87157i = z211111 | z25 | c28655q3.m87157i(interfaceC29805a);
                objM87133R7 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                    function10 = function9;
                    interfaceC4351m3 = interfaceC4351m5;
                    c28655q3.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                    function10 = function9;
                    interfaceC4351m3 = interfaceC4351m5;
                    c28655q3.m87172p0(objM87133R7);
                }
                AbstractC35097c.m111000c(modifierM3390l12, iM115207b12, z19, fM111047t12, zM115214i12, zM111024G12, zM115213h12, zM115209d12, enumC35102hM111044q13, interfaceC4339a11112, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                c28655q3.m87173q(true);
                function6 = function10;
                c28655q = c28655q3;
                interfaceC4339a5 = interfaceC4339a7;
                z15 = z211110;
                interfaceC4339a4 = interfaceC4339a11112;
                function5 = function112;
            } else {
                c28655q4.m87138X();
                function4 = function1;
                z15 = z13;
                c28655q = c28655q4;
                interfaceC4339a4 = interfaceC4339a3;
                interfaceC4351m3 = interfaceC4351m2;
                function5 = function2;
                interfaceC4339a5 = interfaceC4339a2;
                function6 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
            }
        }
        i15 |= 384;
        interfaceC4339a3 = interfaceC4339a;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q4.m87157i(function1)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4351m2 = interfaceC4351m;
                    if (c28655q4.m87157i(interfaceC4351m2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q4.m87157i(function2)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q4.m87157i(interfaceC4339a2)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
                i34 = i14 & 128;
                if (i34 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q4.m87157i(function3)) {
                        i35 = 8388608;
                    } else {
                        i35 = 4194304;
                    }
                    i15 |= i35;
                }
                if ((i15 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q4.m87135U(i15 & 1, z14)) {
                    if (i38 != 0) {
                        z13 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R13 = c28655q4.m87133R();
                        if (objM87133R13 == c28676v0) {
                            objM87133R13 = new C32223d(29);
                            c28655q4.m87172p0(objM87133R13);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                    }
                    if (i18 != 0) {
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == c28676v0) {
                            objM87133R12 = new C34015h(19);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        function4 = (Function1) objM87133R12;
                    } else {
                        function4 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R11 = c28655q4.m87133R();
                        if (objM87133R11 == c28676v0) {
                            objM87133R11 = new C35093a(3);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i26 != 0) {
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == c28676v0) {
                            objM87133R10 = new C34015h(20);
                            c28655q4.m87172p0(objM87133R10);
                        }
                        function7 = (Function1) objM87133R10;
                    } else {
                        function7 = function2;
                    }
                    if (i28 != 0) {
                        objM87133R9 = c28655q4.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C35100f(0);
                            c28655q4.m87172p0(objM87133R9);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                    } else {
                        interfaceC4339a6 = interfaceC4339a2;
                    }
                    if (i34 != 0) {
                        objM87133R8 = c28655q4.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C34015h(21);
                            c28655q4.m87172p0(objM87133R8);
                        }
                        function8 = (Function1) objM87133R8;
                    } else {
                        function8 = function3;
                    }
                    objM87133R = c28655q4.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q4.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                    boolean zM87157i116 = c28655q4.m87157i(viewState);
                    if ((i15 & 3670016) == 1048576) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z211112 = zM87157i116 | z16;
                    if ((i15 & 7168) == 2048) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z211112 | z17;
                    objM87133R3 = c28655q4.m87133R();
                    if (z18) {
                        InterfaceC4339a interfaceC4339a11113 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a11113, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a11113;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    } else {
                        InterfaceC4339a interfaceC4339a11114 = interfaceC4339a6;
                        objM87133R3 = new a(viewState, interfaceC4339a11114, function4, interfaceC28601c1, null);
                        cVar = viewState;
                        interfaceC4339a7 = interfaceC4339a11114;
                        interfaceC28601c3 = interfaceC28601c1;
                        c28655q4.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                    enumC35102hM111044q = m111044q(interfaceC28601c2);
                    enumC35102h = EnumC35102h.NORMAL;
                    f13 = 0.0f;
                    if (enumC35102hM111044q == enumC35102h) {
                        f14 = 0.0f;
                    } else {
                        f14 = -90.0f;
                    }
                    i36 = i15;
                    interfaceC4351m5 = interfaceC4351m4;
                    boolean z211113 = z13;
                    Function1 function113 = function7;
                    C11347e2 c11347e2M30574v115 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R4 = c28655q4.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                        c28655q4.m87172p0(objM87133R4);
                    }
                    InterfaceC28670t2 interfaceC28670t2M30588b14 = AbstractC11352g.m30588b(f14, c11347e2M30574v115, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                    if (m111044q(interfaceC28601c2) != enumC35102h) {
                        f13 = 1.0f;
                    }
                    C11347e2 c11347e2M30574v116 = AbstractC11348f.m30574v(500, 0, null, 6);
                    objM87133R5 = c28655q4.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                        c28655q4.m87172p0(objM87133R5);
                    }
                    interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v116, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                    fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                    if (cVar.getCardStackSize() > 0) {
                        f15 = 1 * 8;
                    } else {
                        f15 = 8 * 0;
                    }
                    InterfaceC28670t2 interfaceC28670t2M30587a13 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                    C2314t c2314t13 = C2314t.f9131w;
                    Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t13);
                    InterfaceC4339a interfaceC4339a11115 = interfaceC4339a3;
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q4.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q4.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q4, modifierM3409f13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q4.m87158i0();
                    InterfaceC28601c1 interfaceC28601c16 = interfaceC28601c3;
                    if (c28655q4.f115903S) {
                        c28655q4.m87163l(c0213j);
                    } else {
                        c28655q4.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d13);
                    AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q4.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N13);
                    if (cVar.getCardStackSize() == 0) {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    } else {
                        c28655q4.m87150e0(2074981695);
                        c28655q4.m87173q(false);
                        c28655q2 = c28655q4;
                    }
                    i37 = i36 & 57344;
                    c28655q3 = c28655q2;
                    function9 = function8;
                    AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function113, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                    Modifier modifierM3398t13 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t13, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a13), 0.0f, 11);
                    zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                    objM87133R6 = c28655q3.m87133R();
                    if (zM87147d) {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new Function1() { // from class: un1.e
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                            }
                        };
                        c28655q3.m87172p0(objM87133R6);
                    }
                    Modifier modifierM3390l13 = AbstractC1099a.m3390l(modifierM3398t13, (Function1) objM87133R6);
                    int iM115207b13 = cVar.getCardStackSize();
                    if (m111044q(interfaceC28601c2) == enumC35102h) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean zM115214i13 = cVar.getIsUpdating();
                    boolean zM111024G13 = m111024G(interfaceC28601c16);
                    float fM111047t13 = m111047t(interfaceC28670t2M30588b14);
                    boolean zM115213h13 = cVar.getPlayShimmer();
                    boolean zM115209d13 = cVar.getHighlightCounter();
                    EnumC35102h enumC35102hM111044q14 = m111044q(interfaceC28601c2);
                    boolean zM87157i117 = c28655q3.m87157i(cVar);
                    if ((i36 & 29360128) == 8388608) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean z211114 = zM87157i117 | z24;
                    if (i37 == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z211114 | z25 | c28655q3.m87157i(interfaceC29805a);
                    objM87133R7 = c28655q3.m87133R();
                    if (zM87157i) {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                        function10 = function9;
                        interfaceC4351m3 = interfaceC4351m5;
                        c28655q3.m87172p0(objM87133R7);
                    }
                    AbstractC35097c.m111000c(modifierM3390l13, iM115207b13, z19, fM111047t13, zM115214i13, zM111024G13, zM115213h13, zM115209d13, enumC35102hM111044q14, interfaceC4339a11115, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                    c28655q3.m87173q(true);
                    function6 = function10;
                    c28655q = c28655q3;
                    interfaceC4339a5 = interfaceC4339a7;
                    z15 = z211113;
                    interfaceC4339a4 = interfaceC4339a11115;
                    function5 = function113;
                } else {
                    c28655q4.m87138X();
                    function4 = function1;
                    z15 = z13;
                    c28655q = c28655q4;
                    interfaceC4339a4 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                    function5 = function2;
                    interfaceC4339a5 = interfaceC4339a2;
                    function6 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4351m2 = interfaceC4351m;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87157i(function2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q4.m87157i(interfaceC4339a2)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
            i34 = i14 & 128;
            if (i34 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q4.m87157i(function3)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i15 |= i35;
            }
            if ((i15 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                if (i38 != 0) {
                    z13 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C32223d(29);
                        c28655q4.m87172p0(objM87133R13);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                }
                if (i18 != 0) {
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C34015h(19);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    function4 = (Function1) objM87133R12;
                } else {
                    function4 = function1;
                }
                if (i24 != 0) {
                    objM87133R11 = c28655q4.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35093a(3);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i26 != 0) {
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C34015h(20);
                        c28655q4.m87172p0(objM87133R10);
                    }
                    function7 = (Function1) objM87133R10;
                } else {
                    function7 = function2;
                }
                if (i28 != 0) {
                    objM87133R9 = c28655q4.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C35100f(0);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                } else {
                    interfaceC4339a6 = interfaceC4339a2;
                }
                if (i34 != 0) {
                    objM87133R8 = c28655q4.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C34015h(21);
                        c28655q4.m87172p0(objM87133R8);
                    }
                    function8 = (Function1) objM87133R8;
                } else {
                    function8 = function3;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                    c28655q4.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                boolean zM87157i118 = c28655q4.m87157i(viewState);
                if ((i15 & 3670016) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z211115 = zM87157i118 | z16;
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z211115 | z17;
                objM87133R3 = c28655q4.m87133R();
                if (z18) {
                    InterfaceC4339a interfaceC4339a11116 = interfaceC4339a6;
                    objM87133R3 = new a(viewState, interfaceC4339a11116, function4, interfaceC28601c1, null);
                    cVar = viewState;
                    interfaceC4339a7 = interfaceC4339a11116;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q4.m87172p0(objM87133R3);
                } else {
                    InterfaceC4339a interfaceC4339a11117 = interfaceC4339a6;
                    objM87133R3 = new a(viewState, interfaceC4339a11117, function4, interfaceC28601c1, null);
                    cVar = viewState;
                    interfaceC4339a7 = interfaceC4339a11117;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q4.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                enumC35102hM111044q = m111044q(interfaceC28601c2);
                enumC35102h = EnumC35102h.NORMAL;
                f13 = 0.0f;
                if (enumC35102hM111044q == enumC35102h) {
                    f14 = 0.0f;
                } else {
                    f14 = -90.0f;
                }
                i36 = i15;
                interfaceC4351m5 = interfaceC4351m4;
                boolean z211116 = z13;
                Function1 function114 = function7;
                C11347e2 c11347e2M30574v117 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R4 = c28655q4.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                    c28655q4.m87172p0(objM87133R4);
                }
                InterfaceC28670t2 interfaceC28670t2M30588b15 = AbstractC11352g.m30588b(f14, c11347e2M30574v117, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                if (m111044q(interfaceC28601c2) != enumC35102h) {
                    f13 = 1.0f;
                }
                C11347e2 c11347e2M30574v118 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                    c28655q4.m87172p0(objM87133R5);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v118, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                if (cVar.getCardStackSize() > 0) {
                    f15 = 1 * 8;
                } else {
                    f15 = 8 * 0;
                }
                InterfaceC28670t2 interfaceC28670t2M30587a14 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                C2314t c2314t14 = C2314t.f9131w;
                Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t14);
                InterfaceC4339a interfaceC4339a11118 = interfaceC4339a3;
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q4.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q4, modifierM3409f14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                InterfaceC28601c1 interfaceC28601c17 = interfaceC28601c3;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N14);
                if (cVar.getCardStackSize() == 0) {
                    c28655q4.m87150e0(2074981695);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                } else {
                    c28655q4.m87150e0(2074981695);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                }
                i37 = i36 & 57344;
                c28655q3 = c28655q2;
                function9 = function8;
                AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function114, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                Modifier modifierM3398t14 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t14, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a14), 0.0f, 11);
                zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                objM87133R6 = c28655q3.m87133R();
                if (zM87147d) {
                    objM87133R6 = new Function1() { // from class: un1.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                        }
                    };
                    c28655q3.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new Function1() { // from class: un1.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                        }
                    };
                    c28655q3.m87172p0(objM87133R6);
                }
                Modifier modifierM3390l14 = AbstractC1099a.m3390l(modifierM3398t14, (Function1) objM87133R6);
                int iM115207b14 = cVar.getCardStackSize();
                if (m111044q(interfaceC28601c2) == enumC35102h) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean zM115214i14 = cVar.getIsUpdating();
                boolean zM111024G14 = m111024G(interfaceC28601c17);
                float fM111047t14 = m111047t(interfaceC28670t2M30588b15);
                boolean zM115213h14 = cVar.getPlayShimmer();
                boolean zM115209d14 = cVar.getHighlightCounter();
                EnumC35102h enumC35102hM111044q15 = m111044q(interfaceC28601c2);
                boolean zM87157i119 = c28655q3.m87157i(cVar);
                if ((i36 & 29360128) == 8388608) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z211117 = zM87157i119 | z24;
                if (i37 == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM87157i = z211117 | z25 | c28655q3.m87157i(interfaceC29805a);
                objM87133R7 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                    function10 = function9;
                    interfaceC4351m3 = interfaceC4351m5;
                    c28655q3.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                    function10 = function9;
                    interfaceC4351m3 = interfaceC4351m5;
                    c28655q3.m87172p0(objM87133R7);
                }
                AbstractC35097c.m111000c(modifierM3390l14, iM115207b14, z19, fM111047t14, zM115214i14, zM111024G14, zM115213h14, zM115209d14, enumC35102hM111044q15, interfaceC4339a11118, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                c28655q3.m87173q(true);
                function6 = function10;
                c28655q = c28655q3;
                interfaceC4339a5 = interfaceC4339a7;
                z15 = z211116;
                interfaceC4339a4 = interfaceC4339a11118;
                function5 = function114;
            } else {
                c28655q4.m87138X();
                function4 = function1;
                z15 = z13;
                c28655q = c28655q4;
                interfaceC4339a4 = interfaceC4339a3;
                interfaceC4351m3 = interfaceC4351m2;
                function5 = function2;
                interfaceC4339a5 = interfaceC4339a2;
                function6 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
            }
        }
        i15 |= 3072;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                if (c28655q4.m87157i(interfaceC4351m2)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q4.m87157i(function2)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q4.m87157i(interfaceC4339a2)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
            i34 = i14 & 128;
            if (i34 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q4.m87157i(function3)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i15 |= i35;
            }
            if ((i15 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z14)) {
                if (i38 != 0) {
                    z13 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R13 = c28655q4.m87133R();
                    if (objM87133R13 == c28676v0) {
                        objM87133R13 = new C32223d(29);
                        c28655q4.m87172p0(objM87133R13);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
                }
                if (i18 != 0) {
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == c28676v0) {
                        objM87133R12 = new C34015h(19);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    function4 = (Function1) objM87133R12;
                } else {
                    function4 = function1;
                }
                if (i24 != 0) {
                    objM87133R11 = c28655q4.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C35093a(3);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i26 != 0) {
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = new C34015h(20);
                        c28655q4.m87172p0(objM87133R10);
                    }
                    function7 = (Function1) objM87133R10;
                } else {
                    function7 = function2;
                }
                if (i28 != 0) {
                    objM87133R9 = c28655q4.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C35100f(0);
                        c28655q4.m87172p0(objM87133R9);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
                } else {
                    interfaceC4339a6 = interfaceC4339a2;
                }
                if (i34 != 0) {
                    objM87133R8 = c28655q4.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C34015h(21);
                        c28655q4.m87172p0(objM87133R8);
                    }
                    function8 = (Function1) objM87133R8;
                } else {
                    function8 = function3;
                }
                objM87133R = c28655q4.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q4.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                    c28655q4.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                boolean zM87157i1110 = c28655q4.m87157i(viewState);
                if ((i15 & 3670016) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z211118 = zM87157i1110 | z16;
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z211118 | z17;
                objM87133R3 = c28655q4.m87133R();
                if (z18) {
                    InterfaceC4339a interfaceC4339a11119 = interfaceC4339a6;
                    objM87133R3 = new a(viewState, interfaceC4339a11119, function4, interfaceC28601c1, null);
                    cVar = viewState;
                    interfaceC4339a7 = interfaceC4339a11119;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q4.m87172p0(objM87133R3);
                } else {
                    InterfaceC4339a interfaceC4339a111110 = interfaceC4339a6;
                    objM87133R3 = new a(viewState, interfaceC4339a111110, function4, interfaceC28601c1, null);
                    cVar = viewState;
                    interfaceC4339a7 = interfaceC4339a111110;
                    interfaceC28601c3 = interfaceC28601c1;
                    c28655q4.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
                enumC35102hM111044q = m111044q(interfaceC28601c2);
                enumC35102h = EnumC35102h.NORMAL;
                f13 = 0.0f;
                if (enumC35102hM111044q == enumC35102h) {
                    f14 = 0.0f;
                } else {
                    f14 = -90.0f;
                }
                i36 = i15;
                interfaceC4351m5 = interfaceC4351m4;
                boolean z211119 = z13;
                Function1 function115 = function7;
                C11347e2 c11347e2M30574v119 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R4 = c28655q4.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                    c28655q4.m87172p0(objM87133R4);
                }
                InterfaceC28670t2 interfaceC28670t2M30588b16 = AbstractC11352g.m30588b(f14, c11347e2M30574v119, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
                if (m111044q(interfaceC28601c2) != enumC35102h) {
                    f13 = 1.0f;
                }
                C11347e2 c11347e2M30574v1110 = AbstractC11348f.m30574v(500, 0, null, 6);
                objM87133R5 = c28655q4.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                    c28655q4.m87172p0(objM87133R5);
                }
                interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v1110, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
                fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
                if (cVar.getCardStackSize() > 0) {
                    f15 = 1 * 8;
                } else {
                    f15 = 8 * 0;
                }
                InterfaceC28670t2 interfaceC28670t2M30587a15 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
                C2314t c2314t15 = C2314t.f9131w;
                Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t15);
                InterfaceC4339a interfaceC4339a111111 = interfaceC4339a3;
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q4.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q4, modifierM3409f15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q4.m87158i0();
                InterfaceC28601c1 interfaceC28601c18 = interfaceC28601c3;
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(c0213j);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d15);
                AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q4.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N15);
                if (cVar.getCardStackSize() == 0) {
                    c28655q4.m87150e0(2074981695);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                } else {
                    c28655q4.m87150e0(2074981695);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                }
                i37 = i36 & 57344;
                c28655q3 = c28655q2;
                function9 = function8;
                AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function115, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
                Modifier modifierM3398t15 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t15, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a15), 0.0f, 11);
                zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
                objM87133R6 = c28655q3.m87133R();
                if (zM87147d) {
                    objM87133R6 = new Function1() { // from class: un1.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                        }
                    };
                    c28655q3.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new Function1() { // from class: un1.e
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                        }
                    };
                    c28655q3.m87172p0(objM87133R6);
                }
                Modifier modifierM3390l15 = AbstractC1099a.m3390l(modifierM3398t15, (Function1) objM87133R6);
                int iM115207b15 = cVar.getCardStackSize();
                if (m111044q(interfaceC28601c2) == enumC35102h) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean zM115214i15 = cVar.getIsUpdating();
                boolean zM111024G15 = m111024G(interfaceC28601c18);
                float fM111047t15 = m111047t(interfaceC28670t2M30588b16);
                boolean zM115213h15 = cVar.getPlayShimmer();
                boolean zM115209d15 = cVar.getHighlightCounter();
                EnumC35102h enumC35102hM111044q16 = m111044q(interfaceC28601c2);
                boolean zM87157i1111 = c28655q3.m87157i(cVar);
                if ((i36 & 29360128) == 8388608) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean z2111110 = zM87157i1111 | z24;
                if (i37 == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM87157i = z2111110 | z25 | c28655q3.m87157i(interfaceC29805a);
                objM87133R7 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                    function10 = function9;
                    interfaceC4351m3 = interfaceC4351m5;
                    c28655q3.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                    function10 = function9;
                    interfaceC4351m3 = interfaceC4351m5;
                    c28655q3.m87172p0(objM87133R7);
                }
                AbstractC35097c.m111000c(modifierM3390l15, iM115207b15, z19, fM111047t15, zM115214i15, zM111024G15, zM115213h15, zM115209d15, enumC35102hM111044q16, interfaceC4339a111111, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                c28655q3.m87173q(true);
                function6 = function10;
                c28655q = c28655q3;
                interfaceC4339a5 = interfaceC4339a7;
                z15 = z211119;
                interfaceC4339a4 = interfaceC4339a111111;
                function5 = function115;
            } else {
                c28655q4.m87138X();
                function4 = function1;
                z15 = z13;
                c28655q = c28655q4;
                interfaceC4339a4 = interfaceC4339a3;
                interfaceC4351m3 = interfaceC4351m2;
                function5 = function2;
                interfaceC4339a5 = interfaceC4339a2;
                function6 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4351m2 = interfaceC4351m;
        i26 = i14 & 32;
        if (i26 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q4.m87157i(function2)) {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i27;
        }
        i28 = i14 & 64;
        if (i28 != 0) {
            i15 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q4.m87157i(interfaceC4339a2)) {
                i29 = 1048576;
            } else {
                i29 = 524288;
            }
            i15 |= i29;
        }
        i34 = i14 & 128;
        if (i34 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q4.m87157i(function3)) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i15 |= i35;
        }
        if ((i15 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z14)) {
            if (i38 != 0) {
                z13 = false;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R13 = c28655q4.m87133R();
                if (objM87133R13 == c28676v0) {
                    objM87133R13 = new C32223d(29);
                    c28655q4.m87172p0(objM87133R13);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R13;
            }
            if (i18 != 0) {
                objM87133R12 = c28655q4.m87133R();
                if (objM87133R12 == c28676v0) {
                    objM87133R12 = new C34015h(19);
                    c28655q4.m87172p0(objM87133R12);
                }
                function4 = (Function1) objM87133R12;
            } else {
                function4 = function1;
            }
            if (i24 != 0) {
                objM87133R11 = c28655q4.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C35093a(3);
                    c28655q4.m87172p0(objM87133R11);
                }
                interfaceC4351m4 = (InterfaceC4351m) objM87133R11;
            } else {
                interfaceC4351m4 = interfaceC4351m2;
            }
            if (i26 != 0) {
                objM87133R10 = c28655q4.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = new C34015h(20);
                    c28655q4.m87172p0(objM87133R10);
                }
                function7 = (Function1) objM87133R10;
            } else {
                function7 = function2;
            }
            if (i28 != 0) {
                objM87133R9 = c28655q4.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C35100f(0);
                    c28655q4.m87172p0(objM87133R9);
                }
                interfaceC4339a6 = (InterfaceC4339a) objM87133R9;
            } else {
                interfaceC4339a6 = interfaceC4339a2;
            }
            if (i34 != 0) {
                objM87133R8 = c28655q4.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C34015h(21);
                    c28655q4.m87172p0(objM87133R8);
                }
                function8 = (Function1) objM87133R8;
            } else {
                function8 = function3;
            }
            objM87133R = c28655q4.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q4.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q4.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(EnumC35102h.NORMAL);
                c28655q4.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
            boolean zM87157i1112 = c28655q4.m87157i(viewState);
            if ((i15 & 3670016) == 1048576) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z2111111 = zM87157i1112 | z16;
            if ((i15 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z2111111 | z17;
            objM87133R3 = c28655q4.m87133R();
            if (z18) {
                InterfaceC4339a interfaceC4339a111112 = interfaceC4339a6;
                objM87133R3 = new a(viewState, interfaceC4339a111112, function4, interfaceC28601c1, null);
                cVar = viewState;
                interfaceC4339a7 = interfaceC4339a111112;
                interfaceC28601c3 = interfaceC28601c1;
                c28655q4.m87172p0(objM87133R3);
            } else {
                InterfaceC4339a interfaceC4339a111113 = interfaceC4339a6;
                objM87133R3 = new a(viewState, interfaceC4339a111113, function4, interfaceC28601c1, null);
                cVar = viewState;
                interfaceC4339a7 = interfaceC4339a111113;
                interfaceC28601c3 = interfaceC28601c1;
                c28655q4.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q4, (InterfaceC4351m) objM87133R3, cVar);
            enumC35102hM111044q = m111044q(interfaceC28601c2);
            enumC35102h = EnumC35102h.NORMAL;
            f13 = 0.0f;
            if (enumC35102hM111044q == enumC35102h) {
                f14 = 0.0f;
            } else {
                f14 = -90.0f;
            }
            i36 = i15;
            interfaceC4351m5 = interfaceC4351m4;
            boolean z2111112 = z13;
            Function1 function116 = function7;
            C11347e2 c11347e2M30574v1111 = AbstractC11348f.m30574v(500, 0, null, 6);
            objM87133R4 = c28655q4.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C16547n(3, interfaceC28601c2, interfaceC28601c3);
                c28655q4.m87172p0(objM87133R4);
            }
            InterfaceC28670t2 interfaceC28670t2M30588b17 = AbstractC11352g.m30588b(f14, c11347e2M30574v1111, "itemRotationAnimation", (Function1) objM87133R4, c28655q4, 27696, 4);
            if (m111044q(interfaceC28601c2) != enumC35102h) {
                f13 = 1.0f;
            }
            C11347e2 c11347e2M30574v1112 = AbstractC11348f.m30574v(500, 0, null, 6);
            objM87133R5 = c28655q4.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C16547n(4, interfaceC28601c3, interfaceC28601c2);
                c28655q4.m87172p0(objM87133R5);
            }
            interfaceC28670t2M30588b = AbstractC11352g.m30588b(f13, c11347e2M30574v1112, "replayButtonOffsetAnimation", (Function1) objM87133R5, c28655q4, 27696, 4);
            fMo743q0 = ((InterfaceC39171c) c28655q4.m87161k(AbstractC2453v1.f9569h)).mo743q0(35 * 4);
            if (cVar.getCardStackSize() > 0) {
                f15 = 1 * 8;
            } else {
                f15 = 8 * 0;
            }
            InterfaceC28670t2 interfaceC28670t2M30587a16 = AbstractC11352g.m30587a(f15, null, "counterPaddingAnimation", c28655q4, 384, 10);
            C2314t c2314t16 = C2314t.f9131w;
            Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t16);
            InterfaceC4339a interfaceC4339a111114 = interfaceC4339a3;
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q4.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q4, modifierM3409f16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q4.m87158i0();
            InterfaceC28601c1 interfaceC28601c19 = interfaceC28601c3;
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f729g, interfaceC39127r0M66763d16);
            AbstractC28683x.m87239G(c28655q4, C0217k.f728f, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q4, C0217k.f726d, modifierM118962N16);
            if (cVar.getCardStackSize() == 0) {
                c28655q4.m87150e0(2074981695);
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            } else {
                c28655q4.m87150e0(2074981695);
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            i37 = i36 & 57344;
            c28655q3 = c28655q2;
            function9 = function8;
            AbstractC36212p.m115248n(cVar.getCardToDisplay(), cVar.getNextCard(), cVar.getCardStackSize(), function116, interfaceC4351m5, cVar.getNotificationCardDismissAnimation(), function9, c28655q3, ((i36 >> 6) & 7168) | i37 | ((i36 >> 3) & 3670016), 0);
            Modifier modifierM3398t16 = AbstractC1099a.m3398t(C1100b.f4583a.mo3400a(c2314t16, C2299e.f9116y), 0.0f, 0.0f, m111050w(interfaceC28670t2M30587a16), 0.0f, 11);
            zM87147d = c28655q3.m87147d(fMo743q0) | c28655q3.m87153g(interfaceC28670t2M30588b);
            objM87133R6 = c28655q3.m87133R();
            if (zM87147d) {
                objM87133R6 = new Function1() { // from class: un1.e
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                    }
                };
                c28655q3.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new Function1() { // from class: un1.e
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC35101g.m111053z(fMo743q0, interfaceC28670t2M30588b, (InterfaceC39171c) obj);
                    }
                };
                c28655q3.m87172p0(objM87133R6);
            }
            Modifier modifierM3390l16 = AbstractC1099a.m3390l(modifierM3398t16, (Function1) objM87133R6);
            int iM115207b16 = cVar.getCardStackSize();
            if (m111044q(interfaceC28601c2) == enumC35102h) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean zM115214i16 = cVar.getIsUpdating();
            boolean zM111024G16 = m111024G(interfaceC28601c19);
            float fM111047t16 = m111047t(interfaceC28670t2M30588b17);
            boolean zM115213h16 = cVar.getPlayShimmer();
            boolean zM115209d16 = cVar.getHighlightCounter();
            EnumC35102h enumC35102hM111044q17 = m111044q(interfaceC28601c2);
            boolean zM87157i1113 = c28655q3.m87157i(cVar);
            if ((i36 & 29360128) == 8388608) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean z2111113 = zM87157i1113 | z24;
            if (i37 == 16384) {
                z25 = true;
            } else {
                z25 = false;
            }
            zM87157i = z2111113 | z25 | c28655q3.m87157i(interfaceC29805a);
            objM87133R7 = c28655q3.m87133R();
            if (zM87157i) {
                objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                function10 = function9;
                interfaceC4351m3 = interfaceC4351m5;
                c28655q3.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C11377m0(cVar, function9, interfaceC4351m5, interfaceC29805a, 3);
                function10 = function9;
                interfaceC4351m3 = interfaceC4351m5;
                c28655q3.m87172p0(objM87133R7);
            }
            AbstractC35097c.m111000c(modifierM3390l16, iM115207b16, z19, fM111047t16, zM115214i16, zM111024G16, zM115213h16, zM115209d16, enumC35102hM111044q17, interfaceC4339a111114, null, (InterfaceC4339a) objM87133R7, c28655q3, (i36 << 21) & 1879048192, 0, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
            c28655q3.m87173q(true);
            function6 = function10;
            c28655q = c28655q3;
            interfaceC4339a5 = interfaceC4339a7;
            z15 = z2111112;
            interfaceC4339a4 = interfaceC4339a111114;
            function5 = function116;
        } else {
            c28655q4.m87138X();
            function4 = function1;
            z15 = z13;
            c28655q = c28655q4;
            interfaceC4339a4 = interfaceC4339a3;
            interfaceC4351m3 = interfaceC4351m2;
            function5 = function2;
            interfaceC4339a5 = interfaceC4339a2;
            function6 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4061l(viewState, z15, interfaceC4339a4, function4, interfaceC4351m3, function5, interfaceC4339a5, function6, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m111042o() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m111043p(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final EnumC35102h m111044q(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC35102h) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: r */
    private static final void m111045r(InterfaceC28601c1 interfaceC28601c1, EnumC35102h enumC35102h) {
        interfaceC28601c1.setValue(enumC35102h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m111046s(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, float f13) {
        m111045r(interfaceC28601c1, EnumC35102h.NORMAL);
        m111025H(interfaceC28601c2, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final float m111047t(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m111048u(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, float f13) {
        m111025H(interfaceC28601c1, false);
        m111045r(interfaceC28601c2, EnumC35102h.NORMAL);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final float m111049v(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: w */
    private static final float m111050w(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m111051x(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C29308g(function1, interfaceC28601c1, 6);
            c28655q.m87172p0(objM87133R);
        }
        Function0.m115217c((InterfaceC4339a) objM87133R, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m111052y(Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        m111045r(interfaceC28601c1, EnumC35102h.REPLAY);
        function1.invoke(Boolean.TRUE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C39178j m111053z(float f13, InterfaceC28670t2 interfaceC28670t2, InterfaceC39171c offset) {
        AbstractC22676k.m65750j(offset, "$this$offset");
        offset.getDensity();
        return new C39178j((((long) 0) << 32) | (((long) AbstractC12889b.m36258X((f13 * m111049v(interfaceC28670t2)) + offset.mo743q0(1 * 8))) & 4294967295L));
    }
}
