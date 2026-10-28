package rm1;

import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.C3756l0;
import p040c0.InterfaceC3764o;
import p040c0.InterfaceC3770q;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p710im1.AbstractC18667e0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25305n;
import p730qt2.C30599e;
import p741vn1.AbstractC36215s;
import p741vn1.C36206j;
import p741vn1.EnumC36197a;
import p741vn1.EnumC36205i;
import pf.C29124b;
import pp2.C29451o;
import q83.InterfaceC30057d;
import r61.C30985h;
import r83.EnumC31071a;
import re1.C31314a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: rm1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0093\u0001\u0010\u0012\u001a\u00020\n2\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0017²\u0006\u000e\u0010\u0014\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, m65681d2 = {"Lm91/n;", "", "card", "nextCard", "", "stackSize", "", "shouldMakeCardSwipeToDismiss", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Lkotlin/Function2;", "Lvn1/a;", "onReadCard", "Lvn1/i;", "notificationCardDismissAnimation", "changeNotificationCardDismissAnimation", "i", "(Lm91/n;Lm91/n;IZLkotlin/jvm/functions/Function1;Lc93/m;Lvn1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "animate", "Ly3/f;", "animatedPadding", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31592f {

    /* JADX INFO: renamed from: rm1.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayonetransition.DayOneNotificationCardStackKt$DayOneNotificationCardStack$4$1", m100430f = "DayOneNotificationCardStack.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130550w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ int f130551x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f130552y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i13, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130551x = i13;
            this.f130552y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f130551x, this.f130552y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f130550w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC31592f.m97391o(this.f130552y, this.f130551x < 2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rm1.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayonetransition.DayOneNotificationCardStackKt$DayOneNotificationCardStack$5$1", m100430f = "DayOneNotificationCardStack.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f130553w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ EnumC36205i f130554x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f130555y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC36205i enumC36205i, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f130554x = enumC36205i;
            this.f130555y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f130554x, this.f130555y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f130553w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                EnumC36205i enumC36205i = this.f130554x;
                if (enumC36205i == EnumC36205i.LEFT_SWIPE || enumC36205i == EnumC36205i.SCALE_OUT) {
                    this.f130553w = 1;
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
            this.f130555y.invoke(EnumC36205i.FADE_IN_PLUS_SCALE_IN_WITHOUT_EXIT);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:110:0x0142  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:116:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0161  */
    /* JADX WARN: Code duplicated, block: B:121:0x019a  */
    /* JADX WARN: Code duplicated, block: B:122:0x019c  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:130:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:141:0x0211  */
    /* JADX WARN: Code duplicated, block: B:142:0x0215  */
    /* JADX WARN: Code duplicated, block: B:145:0x0228  */
    /* JADX WARN: Code duplicated, block: B:147:0x0236  */
    /* JADX WARN: Code duplicated, block: B:150:0x0240  */
    /* JADX WARN: Code duplicated, block: B:151:0x024e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0277  */
    /* JADX WARN: Code duplicated, block: B:155:0x0288  */
    /* JADX WARN: Code duplicated, block: B:157:0x0290  */
    /* JADX WARN: Code duplicated, block: B:158:0x0292  */
    /* JADX WARN: Code duplicated, block: B:161:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x029b  */
    /* JADX WARN: Code duplicated, block: B:165:0x02de  */
    /* JADX WARN: Code duplicated, block: B:168:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0101  */
    /* JADX WARN: Code duplicated, block: B:97:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x0116  */
    /* JADX INFO: renamed from: i */
    public static final void m97385i(final InterfaceC25305n<String> interfaceC25305n, InterfaceC25305n<String> interfaceC25305n2, final int i13, final boolean z4, Function1 function1, InterfaceC4351m interfaceC4351m, EnumC36205i enumC36205i, Function1 function2, Composer composer, final int i14, final int i15) {
        int i16;
        InterfaceC25305n<String> interfaceC25305n3;
        int i17;
        Function1 function3;
        int i18;
        int i19;
        int i24;
        int i25;
        int iOrdinal;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z13;
        final Function1 function4;
        final InterfaceC25305n<String> interfaceC25305n4;
        final Function1 function5;
        C28655q c28655q;
        final InterfaceC4351m interfaceC4351m2;
        final EnumC36205i enumC36205i2;
        C28677v1 c28677v1M87180u;
        InterfaceC25305n<String> interfaceC25305n5;
        C28676v0 c28676v0;
        final InterfaceC4351m interfaceC4351m3;
        EnumC36205i enumC36205i3;
        Function1 function6;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int i34;
        float f13;
        Function1 function7;
        EnumC36205i enumC36205i4;
        InterfaceC25305n<String> interfaceC25305n6;
        boolean z14;
        Object objM87133R2;
        int i35;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objM87133R3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC25305n<String> interfaceC25305n7;
        Function1 function8;
        boolean z18;
        boolean z19;
        Object objM87133R4;
        final Function1 function9;
        InterfaceC4351m interfaceC4351m4;
        C28655q c28655q2;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        int i36;
        int i37;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1291779835);
        if ((i14 & 6) == 0) {
            i16 = (c28655q3.m87157i(interfaceC25305n) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i38 = i15 & 2;
        if (i38 == 0) {
            if ((i14 & 48) == 0) {
                interfaceC25305n3 = interfaceC25305n2;
                i16 |= c28655q3.m87157i(interfaceC25305n3) ? 32 : 16;
            }
            if ((i14 & 384) == 0) {
                if (c28655q3.m87149e(i13)) {
                    i37 = 256;
                } else {
                    i37 = 128;
                }
                i16 |= i37;
            }
            if ((i14 & 3072) == 0) {
                if (c28655q3.m87155h(z4)) {
                    i36 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i36 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i36;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    function3 = function1;
                    if (c28655q3.m87157i(function3)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 32;
                if (i19 != 0) {
                    if ((196608 & i14) == 0) {
                        if (c28655q3.m87157i(interfaceC4351m)) {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 64;
                    if (i25 != 0) {
                        i16 |= 1572864;
                    } else if ((i14 & 1572864) == 0) {
                        if (enumC36205i == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = enumC36205i.ordinal();
                        }
                        if (c28655q3.m87149e(iOrdinal)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 128;
                    if (i27 != 0) {
                        i16 |= 12582912;
                    } else if ((i14 & 12582912) == 0) {
                        if (c28655q3.m87157i(function2)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i16 |= i28;
                    }
                    i29 = i16;
                    if ((i16 & 4793491) != 4793490) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q3.m87135U(i29 & 1, z13)) {
                        if (i38 != 0) {
                            interfaceC25305n5 = null;
                        } else {
                            interfaceC25305n5 = interfaceC25305n3;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i17 != 0) {
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C30985h(26);
                                c28655q3.m87172p0(objM87133R7);
                            }
                            function3 = (Function1) objM87133R7;
                        }
                        if (i19 != 0) {
                            objM87133R6 = c28655q3.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C31314a(6);
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
                                objM87133R5 = new C30985h(27);
                                c28655q3.m87172p0(objM87133R5);
                            }
                            function6 = (Function1) objM87133R5;
                        } else {
                            function6 = function2;
                        }
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        if (m97390n(interfaceC28601c1)) {
                            f13 = 0;
                            i34 = 4;
                        } else {
                            i34 = 4;
                            f13 = 3;
                        }
                        function7 = function3;
                        enumC36205i4 = enumC36205i3;
                        interfaceC25305n6 = interfaceC25305n5;
                        InterfaceC28670t2 interfaceC28670t2M30587a = AbstractC11352g.m30587a(f13 * i34, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                        Integer numValueOf = Integer.valueOf(i13);
                        if ((i29 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q3.m87133R();
                        if (z14 || objM87133R2 == c28676v0) {
                            objM87133R2 = new a(i13, interfaceC28601c1, null);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf);
                        i35 = 3670016 & i29;
                        if (i35 == 1048576) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if ((29360128 & i29) == 8388608) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z15 | z16;
                        objM87133R3 = c28655q3.m87133R();
                        if (z17 || objM87133R3 == c28676v0) {
                            objM87133R3 = new b(enumC36205i4, function6, null);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i4);
                        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m97392p(interfaceC28670t2M30587a), 7);
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
                        if (interfaceC25305n6 == null) {
                            c28655q3.m87150e0(-1358939936);
                            z18 = false;
                            c28655q3.m87173q(false);
                            interfaceC25305n7 = interfaceC25305n6;
                            function8 = function6;
                        } else {
                            c28655q3.m87150e0(-1358939935);
                            interfaceC25305n7 = interfaceC25305n6;
                            function8 = function6;
                            AbstractC1089a.m3344b(interfaceC25305n7, null, null, null, "animate_card", null, C31588b.f130534a.m97376b(), c28655q3, 1597440, 46);
                            z18 = false;
                            c28655q3.m87173q(false);
                        }
                        if (interfaceC25305n == null) {
                            c28655q3.m87150e0(-1358671631);
                            c28655q3.m87173q(z18);
                            c28655q2 = c28655q3;
                            interfaceC4351m4 = interfaceC4351m3;
                            function9 = function7;
                        } else {
                            c28655q3.m87150e0(-1358671630);
                            if (i35 == 1048576) {
                                z19 = true;
                            } else {
                                z19 = z18;
                            }
                            objM87133R4 = c28655q3.m87133R();
                            if (z19 || objM87133R4 == c28676v0) {
                                objM87133R4 = new C29124b(enumC36205i4, 26);
                                c28655q3.m87172p0(objM87133R4);
                            }
                            function9 = function7;
                            C37816b c37816bM121344e = AbstractC37817c.m121344e(-1946125982, c28655q3, new InterfaceC4352n() { // from class: rm1.d
                                @Override // c93.InterfaceC4352n
                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                    int iIntValue = ((Integer) obj4).intValue();
                                    return AbstractC31592f.m97394r(z4, interfaceC25305n, interfaceC4351m3, function9, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                                }
                            });
                            interfaceC4351m4 = interfaceC4351m3;
                            c28655q2 = c28655q3;
                            AbstractC1089a.m3344b(interfaceC25305n, null, (Function1) objM87133R4, null, "animated_dismiss", null, c37816bM121344e, c28655q2, 1597440, 42);
                            c28655q2.m87173q(z18);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        function4 = function8;
                        function5 = function9;
                        interfaceC25305n4 = interfaceC25305n7;
                        interfaceC4351m2 = interfaceC4351m4;
                        enumC36205i2 = enumC36205i4;
                    } else {
                        c28655q3.m87138X();
                        function4 = function2;
                        interfaceC25305n4 = interfaceC25305n3;
                        function5 = function3;
                        c28655q = c28655q3;
                        interfaceC4351m2 = interfaceC4351m;
                        enumC36205i2 = enumC36205i;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rm1.e
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC31592f.m97388l(interfaceC25305n, interfaceC25305n4, i13, z4, function5, interfaceC4351m2, enumC36205i2, function4, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if (enumC36205i == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36205i.ordinal();
                    }
                    if (c28655q3.m87149e(iOrdinal)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (c28655q3.m87157i(function2)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
                i29 = i16;
                if ((i16 & 4793491) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q3.m87135U(i29 & 1, z13)) {
                    if (i38 != 0) {
                        interfaceC25305n5 = null;
                    } else {
                        interfaceC25305n5 = interfaceC25305n3;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i17 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C30985h(26);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        function3 = (Function1) objM87133R7;
                    }
                    if (i19 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C31314a(6);
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
                            objM87133R5 = new C30985h(27);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function6 = (Function1) objM87133R5;
                    } else {
                        function6 = function2;
                    }
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    if (m97390n(interfaceC28601c1)) {
                        f13 = 0;
                        i34 = 4;
                    } else {
                        i34 = 4;
                        f13 = 3;
                    }
                    function7 = function3;
                    enumC36205i4 = enumC36205i3;
                    interfaceC25305n6 = interfaceC25305n5;
                    InterfaceC28670t2 interfaceC28670t2M30587a2 = AbstractC11352g.m30587a(f13 * i34, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                    Integer numValueOf2 = Integer.valueOf(i13);
                    if ((i29 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q3.m87133R();
                    if (z14) {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf2);
                    i35 = 3670016 & i29;
                    if (i35 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((29360128 & i29) == 8388608) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z15 | z16;
                    objM87133R3 = c28655q3.m87133R();
                    if (z17) {
                        objM87133R3 = new b(enumC36205i4, function6, null);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(enumC36205i4, function6, null);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i4);
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m97392p(interfaceC28670t2M30587a2), 7);
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
                    if (interfaceC25305n6 == null) {
                        c28655q3.m87150e0(-1358939936);
                        z18 = false;
                        c28655q3.m87173q(false);
                        interfaceC25305n7 = interfaceC25305n6;
                        function8 = function6;
                    } else {
                        c28655q3.m87150e0(-1358939935);
                        interfaceC25305n7 = interfaceC25305n6;
                        function8 = function6;
                        AbstractC1089a.m3344b(interfaceC25305n7, null, null, null, "animate_card", null, C31588b.f130534a.m97376b(), c28655q3, 1597440, 46);
                        z18 = false;
                        c28655q3.m87173q(false);
                    }
                    if (interfaceC25305n == null) {
                        c28655q3.m87150e0(-1358671631);
                        c28655q3.m87173q(z18);
                        c28655q2 = c28655q3;
                        interfaceC4351m4 = interfaceC4351m3;
                        function9 = function7;
                    } else {
                        c28655q3.m87150e0(-1358671630);
                        if (i35 == 1048576) {
                            z19 = true;
                        } else {
                            z19 = z18;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z19) {
                            objM87133R4 = new C29124b(enumC36205i4, 26);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C29124b(enumC36205i4, 26);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        function9 = function7;
                        C37816b c37816bM121344e2 = AbstractC37817c.m121344e(-1946125982, c28655q3, new InterfaceC4352n() { // from class: rm1.d
                            @Override // c93.InterfaceC4352n
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                int iIntValue = ((Integer) obj4).intValue();
                                return AbstractC31592f.m97394r(z4, interfaceC25305n, interfaceC4351m3, function9, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                            }
                        });
                        interfaceC4351m4 = interfaceC4351m3;
                        c28655q2 = c28655q3;
                        AbstractC1089a.m3344b(interfaceC25305n, null, (Function1) objM87133R4, null, "animated_dismiss", null, c37816bM121344e2, c28655q2, 1597440, 42);
                        c28655q2.m87173q(z18);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    function4 = function8;
                    function5 = function9;
                    interfaceC25305n4 = interfaceC25305n7;
                    interfaceC4351m2 = interfaceC4351m4;
                    enumC36205i2 = enumC36205i4;
                } else {
                    c28655q3.m87138X();
                    function4 = function2;
                    interfaceC25305n4 = interfaceC25305n3;
                    function5 = function3;
                    c28655q = c28655q3;
                    interfaceC4351m2 = interfaceC4351m;
                    enumC36205i2 = enumC36205i;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rm1.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC31592f.m97388l(interfaceC25305n, interfaceC25305n4, i13, z4, function5, interfaceC4351m2, enumC36205i2, function4, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            function3 = function1;
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((196608 & i14) == 0) {
                    if (c28655q3.m87157i(interfaceC4351m)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if (enumC36205i == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36205i.ordinal();
                    }
                    if (c28655q3.m87149e(iOrdinal)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (c28655q3.m87157i(function2)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
                i29 = i16;
                if ((i16 & 4793491) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q3.m87135U(i29 & 1, z13)) {
                    if (i38 != 0) {
                        interfaceC25305n5 = null;
                    } else {
                        interfaceC25305n5 = interfaceC25305n3;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i17 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C30985h(26);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        function3 = (Function1) objM87133R7;
                    }
                    if (i19 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C31314a(6);
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
                            objM87133R5 = new C30985h(27);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function6 = (Function1) objM87133R5;
                    } else {
                        function6 = function2;
                    }
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    if (m97390n(interfaceC28601c1)) {
                        f13 = 0;
                        i34 = 4;
                    } else {
                        i34 = 4;
                        f13 = 3;
                    }
                    function7 = function3;
                    enumC36205i4 = enumC36205i3;
                    interfaceC25305n6 = interfaceC25305n5;
                    InterfaceC28670t2 interfaceC28670t2M30587a3 = AbstractC11352g.m30587a(f13 * i34, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                    Integer numValueOf3 = Integer.valueOf(i13);
                    if ((i29 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q3.m87133R();
                    if (z14) {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf3);
                    i35 = 3670016 & i29;
                    if (i35 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((29360128 & i29) == 8388608) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z15 | z16;
                    objM87133R3 = c28655q3.m87133R();
                    if (z17) {
                        objM87133R3 = new b(enumC36205i4, function6, null);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(enumC36205i4, function6, null);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i4);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m97392p(interfaceC28670t2M30587a3), 7);
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
                    if (interfaceC25305n6 == null) {
                        c28655q3.m87150e0(-1358939936);
                        z18 = false;
                        c28655q3.m87173q(false);
                        interfaceC25305n7 = interfaceC25305n6;
                        function8 = function6;
                    } else {
                        c28655q3.m87150e0(-1358939935);
                        interfaceC25305n7 = interfaceC25305n6;
                        function8 = function6;
                        AbstractC1089a.m3344b(interfaceC25305n7, null, null, null, "animate_card", null, C31588b.f130534a.m97376b(), c28655q3, 1597440, 46);
                        z18 = false;
                        c28655q3.m87173q(false);
                    }
                    if (interfaceC25305n == null) {
                        c28655q3.m87150e0(-1358671631);
                        c28655q3.m87173q(z18);
                        c28655q2 = c28655q3;
                        interfaceC4351m4 = interfaceC4351m3;
                        function9 = function7;
                    } else {
                        c28655q3.m87150e0(-1358671630);
                        if (i35 == 1048576) {
                            z19 = true;
                        } else {
                            z19 = z18;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z19) {
                            objM87133R4 = new C29124b(enumC36205i4, 26);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C29124b(enumC36205i4, 26);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        function9 = function7;
                        C37816b c37816bM121344e3 = AbstractC37817c.m121344e(-1946125982, c28655q3, new InterfaceC4352n() { // from class: rm1.d
                            @Override // c93.InterfaceC4352n
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                int iIntValue = ((Integer) obj4).intValue();
                                return AbstractC31592f.m97394r(z4, interfaceC25305n, interfaceC4351m3, function9, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                            }
                        });
                        interfaceC4351m4 = interfaceC4351m3;
                        c28655q2 = c28655q3;
                        AbstractC1089a.m3344b(interfaceC25305n, null, (Function1) objM87133R4, null, "animated_dismiss", null, c37816bM121344e3, c28655q2, 1597440, 42);
                        c28655q2.m87173q(z18);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    function4 = function8;
                    function5 = function9;
                    interfaceC25305n4 = interfaceC25305n7;
                    interfaceC4351m2 = interfaceC4351m4;
                    enumC36205i2 = enumC36205i4;
                } else {
                    c28655q3.m87138X();
                    function4 = function2;
                    interfaceC25305n4 = interfaceC25305n3;
                    function5 = function3;
                    c28655q = c28655q3;
                    interfaceC4351m2 = interfaceC4351m;
                    enumC36205i2 = enumC36205i;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rm1.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC31592f.m97388l(interfaceC25305n, interfaceC25305n4, i13, z4, function5, interfaceC4351m2, enumC36205i2, function4, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (enumC36205i == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC36205i.ordinal();
                }
                if (c28655q3.m87149e(iOrdinal)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (c28655q3.m87157i(function2)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i16 |= i28;
            }
            i29 = i16;
            if ((i16 & 4793491) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i29 & 1, z13)) {
                if (i38 != 0) {
                    interfaceC25305n5 = null;
                } else {
                    interfaceC25305n5 = interfaceC25305n3;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C30985h(26);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                }
                if (i19 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C31314a(6);
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
                        objM87133R5 = new C30985h(27);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function6 = (Function1) objM87133R5;
                } else {
                    function6 = function2;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (m97390n(interfaceC28601c1)) {
                    f13 = 0;
                    i34 = 4;
                } else {
                    i34 = 4;
                    f13 = 3;
                }
                function7 = function3;
                enumC36205i4 = enumC36205i3;
                interfaceC25305n6 = interfaceC25305n5;
                InterfaceC28670t2 interfaceC28670t2M30587a4 = AbstractC11352g.m30587a(f13 * i34, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                Integer numValueOf4 = Integer.valueOf(i13);
                if ((i29 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q3.m87133R();
                if (z14) {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf4);
                i35 = 3670016 & i29;
                if (i35 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((29360128 & i29) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objM87133R3 = c28655q3.m87133R();
                if (z17) {
                    objM87133R3 = new b(enumC36205i4, function6, null);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(enumC36205i4, function6, null);
                    c28655q3.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i4);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m97392p(interfaceC28670t2M30587a4), 7);
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
                if (interfaceC25305n6 == null) {
                    c28655q3.m87150e0(-1358939936);
                    z18 = false;
                    c28655q3.m87173q(false);
                    interfaceC25305n7 = interfaceC25305n6;
                    function8 = function6;
                } else {
                    c28655q3.m87150e0(-1358939935);
                    interfaceC25305n7 = interfaceC25305n6;
                    function8 = function6;
                    AbstractC1089a.m3344b(interfaceC25305n7, null, null, null, "animate_card", null, C31588b.f130534a.m97376b(), c28655q3, 1597440, 46);
                    z18 = false;
                    c28655q3.m87173q(false);
                }
                if (interfaceC25305n == null) {
                    c28655q3.m87150e0(-1358671631);
                    c28655q3.m87173q(z18);
                    c28655q2 = c28655q3;
                    interfaceC4351m4 = interfaceC4351m3;
                    function9 = function7;
                } else {
                    c28655q3.m87150e0(-1358671630);
                    if (i35 == 1048576) {
                        z19 = true;
                    } else {
                        z19 = z18;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z19) {
                        objM87133R4 = new C29124b(enumC36205i4, 26);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C29124b(enumC36205i4, 26);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function9 = function7;
                    C37816b c37816bM121344e4 = AbstractC37817c.m121344e(-1946125982, c28655q3, new InterfaceC4352n() { // from class: rm1.d
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC31592f.m97394r(z4, interfaceC25305n, interfaceC4351m3, function9, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                        }
                    });
                    interfaceC4351m4 = interfaceC4351m3;
                    c28655q2 = c28655q3;
                    AbstractC1089a.m3344b(interfaceC25305n, null, (Function1) objM87133R4, null, "animated_dismiss", null, c37816bM121344e4, c28655q2, 1597440, 42);
                    c28655q2.m87173q(z18);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                function4 = function8;
                function5 = function9;
                interfaceC25305n4 = interfaceC25305n7;
                interfaceC4351m2 = interfaceC4351m4;
                enumC36205i2 = enumC36205i4;
            } else {
                c28655q3.m87138X();
                function4 = function2;
                interfaceC25305n4 = interfaceC25305n3;
                function5 = function3;
                c28655q = c28655q3;
                interfaceC4351m2 = interfaceC4351m;
                enumC36205i2 = enumC36205i;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rm1.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC31592f.m97388l(interfaceC25305n, interfaceC25305n4, i13, z4, function5, interfaceC4351m2, enumC36205i2, function4, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 48;
        interfaceC25305n3 = interfaceC25305n2;
        if ((i14 & 384) == 0) {
            if (c28655q3.m87149e(i13)) {
                i37 = 256;
            } else {
                i37 = 128;
            }
            i16 |= i37;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q3.m87155h(z4)) {
                i36 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i36 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 |= i36;
        }
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                function3 = function1;
                if (c28655q3.m87157i(function3)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i18;
            }
            i19 = i15 & 32;
            if (i19 != 0) {
                if ((196608 & i14) == 0) {
                    if (c28655q3.m87157i(interfaceC4351m)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 64;
                if (i25 != 0) {
                    i16 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if (enumC36205i == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC36205i.ordinal();
                    }
                    if (c28655q3.m87149e(iOrdinal)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 128;
                if (i27 != 0) {
                    i16 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    if (c28655q3.m87157i(function2)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i16 |= i28;
                }
                i29 = i16;
                if ((i16 & 4793491) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q3.m87135U(i29 & 1, z13)) {
                    if (i38 != 0) {
                        interfaceC25305n5 = null;
                    } else {
                        interfaceC25305n5 = interfaceC25305n3;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i17 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C30985h(26);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        function3 = (Function1) objM87133R7;
                    }
                    if (i19 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C31314a(6);
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
                            objM87133R5 = new C30985h(27);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        function6 = (Function1) objM87133R5;
                    } else {
                        function6 = function2;
                    }
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    if (m97390n(interfaceC28601c1)) {
                        f13 = 0;
                        i34 = 4;
                    } else {
                        i34 = 4;
                        f13 = 3;
                    }
                    function7 = function3;
                    enumC36205i4 = enumC36205i3;
                    interfaceC25305n6 = interfaceC25305n5;
                    InterfaceC28670t2 interfaceC28670t2M30587a5 = AbstractC11352g.m30587a(f13 * i34, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                    Integer numValueOf5 = Integer.valueOf(i13);
                    if ((i29 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q3.m87133R();
                    if (z14) {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new a(i13, interfaceC28601c1, null);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf5);
                    i35 = 3670016 & i29;
                    if (i35 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((29360128 & i29) == 8388608) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z15 | z16;
                    objM87133R3 = c28655q3.m87133R();
                    if (z17) {
                        objM87133R3 = new b(enumC36205i4, function6, null);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new b(enumC36205i4, function6, null);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i4);
                    Modifier modifierM3398t5 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m97392p(interfaceC28670t2M30587a5), 7);
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
                    if (interfaceC25305n6 == null) {
                        c28655q3.m87150e0(-1358939936);
                        z18 = false;
                        c28655q3.m87173q(false);
                        interfaceC25305n7 = interfaceC25305n6;
                        function8 = function6;
                    } else {
                        c28655q3.m87150e0(-1358939935);
                        interfaceC25305n7 = interfaceC25305n6;
                        function8 = function6;
                        AbstractC1089a.m3344b(interfaceC25305n7, null, null, null, "animate_card", null, C31588b.f130534a.m97376b(), c28655q3, 1597440, 46);
                        z18 = false;
                        c28655q3.m87173q(false);
                    }
                    if (interfaceC25305n == null) {
                        c28655q3.m87150e0(-1358671631);
                        c28655q3.m87173q(z18);
                        c28655q2 = c28655q3;
                        interfaceC4351m4 = interfaceC4351m3;
                        function9 = function7;
                    } else {
                        c28655q3.m87150e0(-1358671630);
                        if (i35 == 1048576) {
                            z19 = true;
                        } else {
                            z19 = z18;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z19) {
                            objM87133R4 = new C29124b(enumC36205i4, 26);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C29124b(enumC36205i4, 26);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        function9 = function7;
                        C37816b c37816bM121344e5 = AbstractC37817c.m121344e(-1946125982, c28655q3, new InterfaceC4352n() { // from class: rm1.d
                            @Override // c93.InterfaceC4352n
                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                int iIntValue = ((Integer) obj4).intValue();
                                return AbstractC31592f.m97394r(z4, interfaceC25305n, interfaceC4351m3, function9, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                            }
                        });
                        interfaceC4351m4 = interfaceC4351m3;
                        c28655q2 = c28655q3;
                        AbstractC1089a.m3344b(interfaceC25305n, null, (Function1) objM87133R4, null, "animated_dismiss", null, c37816bM121344e5, c28655q2, 1597440, 42);
                        c28655q2.m87173q(z18);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    function4 = function8;
                    function5 = function9;
                    interfaceC25305n4 = interfaceC25305n7;
                    interfaceC4351m2 = interfaceC4351m4;
                    enumC36205i2 = enumC36205i4;
                } else {
                    c28655q3.m87138X();
                    function4 = function2;
                    interfaceC25305n4 = interfaceC25305n3;
                    function5 = function3;
                    c28655q = c28655q3;
                    interfaceC4351m2 = interfaceC4351m;
                    enumC36205i2 = enumC36205i;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rm1.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC31592f.m97388l(interfaceC25305n, interfaceC25305n4, i13, z4, function5, interfaceC4351m2, enumC36205i2, function4, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (enumC36205i == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC36205i.ordinal();
                }
                if (c28655q3.m87149e(iOrdinal)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (c28655q3.m87157i(function2)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i16 |= i28;
            }
            i29 = i16;
            if ((i16 & 4793491) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i29 & 1, z13)) {
                if (i38 != 0) {
                    interfaceC25305n5 = null;
                } else {
                    interfaceC25305n5 = interfaceC25305n3;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C30985h(26);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                }
                if (i19 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C31314a(6);
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
                        objM87133R5 = new C30985h(27);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function6 = (Function1) objM87133R5;
                } else {
                    function6 = function2;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (m97390n(interfaceC28601c1)) {
                    f13 = 0;
                    i34 = 4;
                } else {
                    i34 = 4;
                    f13 = 3;
                }
                function7 = function3;
                enumC36205i4 = enumC36205i3;
                interfaceC25305n6 = interfaceC25305n5;
                InterfaceC28670t2 interfaceC28670t2M30587a6 = AbstractC11352g.m30587a(f13 * i34, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                Integer numValueOf6 = Integer.valueOf(i13);
                if ((i29 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q3.m87133R();
                if (z14) {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf6);
                i35 = 3670016 & i29;
                if (i35 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((29360128 & i29) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objM87133R3 = c28655q3.m87133R();
                if (z17) {
                    objM87133R3 = new b(enumC36205i4, function6, null);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(enumC36205i4, function6, null);
                    c28655q3.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i4);
                Modifier modifierM3398t6 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m97392p(interfaceC28670t2M30587a6), 7);
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
                if (interfaceC25305n6 == null) {
                    c28655q3.m87150e0(-1358939936);
                    z18 = false;
                    c28655q3.m87173q(false);
                    interfaceC25305n7 = interfaceC25305n6;
                    function8 = function6;
                } else {
                    c28655q3.m87150e0(-1358939935);
                    interfaceC25305n7 = interfaceC25305n6;
                    function8 = function6;
                    AbstractC1089a.m3344b(interfaceC25305n7, null, null, null, "animate_card", null, C31588b.f130534a.m97376b(), c28655q3, 1597440, 46);
                    z18 = false;
                    c28655q3.m87173q(false);
                }
                if (interfaceC25305n == null) {
                    c28655q3.m87150e0(-1358671631);
                    c28655q3.m87173q(z18);
                    c28655q2 = c28655q3;
                    interfaceC4351m4 = interfaceC4351m3;
                    function9 = function7;
                } else {
                    c28655q3.m87150e0(-1358671630);
                    if (i35 == 1048576) {
                        z19 = true;
                    } else {
                        z19 = z18;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z19) {
                        objM87133R4 = new C29124b(enumC36205i4, 26);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C29124b(enumC36205i4, 26);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function9 = function7;
                    C37816b c37816bM121344e6 = AbstractC37817c.m121344e(-1946125982, c28655q3, new InterfaceC4352n() { // from class: rm1.d
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC31592f.m97394r(z4, interfaceC25305n, interfaceC4351m3, function9, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                        }
                    });
                    interfaceC4351m4 = interfaceC4351m3;
                    c28655q2 = c28655q3;
                    AbstractC1089a.m3344b(interfaceC25305n, null, (Function1) objM87133R4, null, "animated_dismiss", null, c37816bM121344e6, c28655q2, 1597440, 42);
                    c28655q2.m87173q(z18);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                function4 = function8;
                function5 = function9;
                interfaceC25305n4 = interfaceC25305n7;
                interfaceC4351m2 = interfaceC4351m4;
                enumC36205i2 = enumC36205i4;
            } else {
                c28655q3.m87138X();
                function4 = function2;
                interfaceC25305n4 = interfaceC25305n3;
                function5 = function3;
                c28655q = c28655q3;
                interfaceC4351m2 = interfaceC4351m;
                enumC36205i2 = enumC36205i;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rm1.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC31592f.m97388l(interfaceC25305n, interfaceC25305n4, i13, z4, function5, interfaceC4351m2, enumC36205i2, function4, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        function3 = function1;
        i19 = i15 & 32;
        if (i19 != 0) {
            if ((196608 & i14) == 0) {
                if (c28655q3.m87157i(interfaceC4351m)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i24;
            }
            i25 = i15 & 64;
            if (i25 != 0) {
                i16 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if (enumC36205i == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC36205i.ordinal();
                }
                if (c28655q3.m87149e(iOrdinal)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i16 |= i26;
            }
            i27 = i15 & 128;
            if (i27 != 0) {
                i16 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                if (c28655q3.m87157i(function2)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i16 |= i28;
            }
            i29 = i16;
            if ((i16 & 4793491) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i29 & 1, z13)) {
                if (i38 != 0) {
                    interfaceC25305n5 = null;
                } else {
                    interfaceC25305n5 = interfaceC25305n3;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C30985h(26);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                }
                if (i19 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C31314a(6);
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
                        objM87133R5 = new C30985h(27);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    function6 = (Function1) objM87133R5;
                } else {
                    function6 = function2;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (m97390n(interfaceC28601c1)) {
                    f13 = 0;
                    i34 = 4;
                } else {
                    i34 = 4;
                    f13 = 3;
                }
                function7 = function3;
                enumC36205i4 = enumC36205i3;
                interfaceC25305n6 = interfaceC25305n5;
                InterfaceC28670t2 interfaceC28670t2M30587a7 = AbstractC11352g.m30587a(f13 * i34, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
                Integer numValueOf7 = Integer.valueOf(i13);
                if ((i29 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q3.m87133R();
                if (z14) {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new a(i13, interfaceC28601c1, null);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf7);
                i35 = 3670016 & i29;
                if (i35 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((29360128 & i29) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z15 | z16;
                objM87133R3 = c28655q3.m87133R();
                if (z17) {
                    objM87133R3 = new b(enumC36205i4, function6, null);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new b(enumC36205i4, function6, null);
                    c28655q3.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i4);
                Modifier modifierM3398t7 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m97392p(interfaceC28670t2M30587a7), 7);
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
                if (interfaceC25305n6 == null) {
                    c28655q3.m87150e0(-1358939936);
                    z18 = false;
                    c28655q3.m87173q(false);
                    interfaceC25305n7 = interfaceC25305n6;
                    function8 = function6;
                } else {
                    c28655q3.m87150e0(-1358939935);
                    interfaceC25305n7 = interfaceC25305n6;
                    function8 = function6;
                    AbstractC1089a.m3344b(interfaceC25305n7, null, null, null, "animate_card", null, C31588b.f130534a.m97376b(), c28655q3, 1597440, 46);
                    z18 = false;
                    c28655q3.m87173q(false);
                }
                if (interfaceC25305n == null) {
                    c28655q3.m87150e0(-1358671631);
                    c28655q3.m87173q(z18);
                    c28655q2 = c28655q3;
                    interfaceC4351m4 = interfaceC4351m3;
                    function9 = function7;
                } else {
                    c28655q3.m87150e0(-1358671630);
                    if (i35 == 1048576) {
                        z19 = true;
                    } else {
                        z19 = z18;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z19) {
                        objM87133R4 = new C29124b(enumC36205i4, 26);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C29124b(enumC36205i4, 26);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    function9 = function7;
                    C37816b c37816bM121344e7 = AbstractC37817c.m121344e(-1946125982, c28655q3, new InterfaceC4352n() { // from class: rm1.d
                        @Override // c93.InterfaceC4352n
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int iIntValue = ((Integer) obj4).intValue();
                            return AbstractC31592f.m97394r(z4, interfaceC25305n, interfaceC4351m3, function9, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                        }
                    });
                    interfaceC4351m4 = interfaceC4351m3;
                    c28655q2 = c28655q3;
                    AbstractC1089a.m3344b(interfaceC25305n, null, (Function1) objM87133R4, null, "animated_dismiss", null, c37816bM121344e7, c28655q2, 1597440, 42);
                    c28655q2.m87173q(z18);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                function4 = function8;
                function5 = function9;
                interfaceC25305n4 = interfaceC25305n7;
                interfaceC4351m2 = interfaceC4351m4;
                enumC36205i2 = enumC36205i4;
            } else {
                c28655q3.m87138X();
                function4 = function2;
                interfaceC25305n4 = interfaceC25305n3;
                function5 = function3;
                c28655q = c28655q3;
                interfaceC4351m2 = interfaceC4351m;
                enumC36205i2 = enumC36205i;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rm1.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC31592f.m97388l(interfaceC25305n, interfaceC25305n4, i13, z4, function5, interfaceC4351m2, enumC36205i2, function4, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i25 = i15 & 64;
        if (i25 != 0) {
            i16 |= 1572864;
        } else if ((i14 & 1572864) == 0) {
            if (enumC36205i == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC36205i.ordinal();
            }
            if (c28655q3.m87149e(iOrdinal)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i16 |= i26;
        }
        i27 = i15 & 128;
        if (i27 != 0) {
            i16 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            if (c28655q3.m87157i(function2)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i16 |= i28;
        }
        i29 = i16;
        if ((i16 & 4793491) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q3.m87135U(i29 & 1, z13)) {
            if (i38 != 0) {
                interfaceC25305n5 = null;
            } else {
                interfaceC25305n5 = interfaceC25305n3;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C30985h(26);
                    c28655q3.m87172p0(objM87133R7);
                }
                function3 = (Function1) objM87133R7;
            }
            if (i19 != 0) {
                objM87133R6 = c28655q3.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C31314a(6);
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
                    objM87133R5 = new C30985h(27);
                    c28655q3.m87172p0(objM87133R5);
                }
                function6 = (Function1) objM87133R5;
            } else {
                function6 = function2;
            }
            objM87133R = c28655q3.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (m97390n(interfaceC28601c1)) {
                f13 = 0;
                i34 = 4;
            } else {
                i34 = 4;
                f13 = 3;
            }
            function7 = function3;
            enumC36205i4 = enumC36205i3;
            interfaceC25305n6 = interfaceC25305n5;
            InterfaceC28670t2 interfaceC28670t2M30587a8 = AbstractC11352g.m30587a(f13 * i34, AbstractC11348f.m30574v(500, 0, null, 6), "animate_padding", c28655q3, 432, 8);
            Integer numValueOf8 = Integer.valueOf(i13);
            if ((i29 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R2 = c28655q3.m87133R();
            if (z14) {
                objM87133R2 = new a(i13, interfaceC28601c1, null);
                c28655q3.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(i13, interfaceC28601c1, null);
                c28655q3.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, numValueOf8);
            i35 = 3670016 & i29;
            if (i35 == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((29360128 & i29) == 8388608) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = z15 | z16;
            objM87133R3 = c28655q3.m87133R();
            if (z17) {
                objM87133R3 = new b(enumC36205i4, function6, null);
                c28655q3.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new b(enumC36205i4, function6, null);
                c28655q3.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, enumC36205i4);
            Modifier modifierM3398t8 = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, m97392p(interfaceC28670t2M30587a8), 7);
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
            if (interfaceC25305n6 == null) {
                c28655q3.m87150e0(-1358939936);
                z18 = false;
                c28655q3.m87173q(false);
                interfaceC25305n7 = interfaceC25305n6;
                function8 = function6;
            } else {
                c28655q3.m87150e0(-1358939935);
                interfaceC25305n7 = interfaceC25305n6;
                function8 = function6;
                AbstractC1089a.m3344b(interfaceC25305n7, null, null, null, "animate_card", null, C31588b.f130534a.m97376b(), c28655q3, 1597440, 46);
                z18 = false;
                c28655q3.m87173q(false);
            }
            if (interfaceC25305n == null) {
                c28655q3.m87150e0(-1358671631);
                c28655q3.m87173q(z18);
                c28655q2 = c28655q3;
                interfaceC4351m4 = interfaceC4351m3;
                function9 = function7;
            } else {
                c28655q3.m87150e0(-1358671630);
                if (i35 == 1048576) {
                    z19 = true;
                } else {
                    z19 = z18;
                }
                objM87133R4 = c28655q3.m87133R();
                if (z19) {
                    objM87133R4 = new C29124b(enumC36205i4, 26);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C29124b(enumC36205i4, 26);
                    c28655q3.m87172p0(objM87133R4);
                }
                function9 = function7;
                C37816b c37816bM121344e8 = AbstractC37817c.m121344e(-1946125982, c28655q3, new InterfaceC4352n() { // from class: rm1.d
                    @Override // c93.InterfaceC4352n
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int iIntValue = ((Integer) obj4).intValue();
                        return AbstractC31592f.m97394r(z4, interfaceC25305n, interfaceC4351m3, function9, (InterfaceC3764o) obj, (InterfaceC25305n) obj2, (Composer) obj3, iIntValue);
                    }
                });
                interfaceC4351m4 = interfaceC4351m3;
                c28655q2 = c28655q3;
                AbstractC1089a.m3344b(interfaceC25305n, null, (Function1) objM87133R4, null, "animated_dismiss", null, c37816bM121344e8, c28655q2, 1597440, 42);
                c28655q2.m87173q(z18);
            }
            c28655q2.m87173q(true);
            c28655q = c28655q2;
            function4 = function8;
            function5 = function9;
            interfaceC25305n4 = interfaceC25305n7;
            interfaceC4351m2 = interfaceC4351m4;
            enumC36205i2 = enumC36205i4;
        } else {
            c28655q3.m87138X();
            function4 = function2;
            interfaceC25305n4 = interfaceC25305n3;
            function5 = function3;
            c28655q = c28655q3;
            interfaceC4351m2 = interfaceC4351m;
            enumC36205i2 = enumC36205i;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: rm1.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC31592f.m97388l(interfaceC25305n, interfaceC25305n4, i13, z4, function5, interfaceC4351m2, enumC36205i2, function4, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m97386j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m97387k(String str, EnumC36197a enumC36197a) {
        AbstractC22676k.m65750j(str, "<unused var>");
        AbstractC22676k.m65750j(enumC36197a, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m97388l(InterfaceC25305n interfaceC25305n, InterfaceC25305n interfaceC25305n2, int i13, boolean z4, Function1 function1, InterfaceC4351m interfaceC4351m, EnumC36205i enumC36205i, Function1 function2, int i14, int i15, Composer composer, int i16) {
        m97385i(interfaceC25305n, interfaceC25305n2, i13, z4, function1, interfaceC4351m, enumC36205i, function2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m97389m(EnumC36205i enumC36205i) {
        AbstractC22676k.m65750j(enumC36205i, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final boolean m97390n(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m97391o(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: p */
    private static final float m97392p(InterfaceC28670t2 interfaceC28670t2) {
        return ((C39174f) interfaceC28670t2.getValue()).f168413w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C3756l0 m97393q(EnumC36205i enumC36205i, InterfaceC3770q AnimatedContent) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        return C36206j.f155016a.m115220a(AnimatedContent, enumC36205i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m97394r(boolean z4, InterfaceC25305n interfaceC25305n, InterfaceC4351m interfaceC4351m, Function1 function1, InterfaceC3764o AnimatedContent, InterfaceC25305n animatedCard, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
        AbstractC22676k.m65750j(animatedCard, "animatedCard");
        String str = (String) animatedCard.getId();
        boolean z13 = z4 && AbstractC22676k.m65745e(animatedCard.getId(), interfaceC25305n.getId());
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(interfaceC4351m) | c28655q.m87157i(animatedCard);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C30599e(17, interfaceC4351m, animatedCard);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC36215s.m115274g(str, z13, (InterfaceC4339a) objM87133R, null, AbstractC37817c.m121344e(-1121185022, c28655q, new C29451o(7, animatedCard, function1)), c28655q, 24576, 8);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m97395s(InterfaceC4351m interfaceC4351m, InterfaceC25305n interfaceC25305n) {
        interfaceC4351m.invoke(interfaceC25305n.getId(), EnumC36197a.SWIPE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m97396t(InterfaceC25305n interfaceC25305n, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC25303l.m74291r(interfaceC25305n, AbstractC18667e0.m54175b(), null, function1, c28655q, C25307p.f99300b << 3, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
