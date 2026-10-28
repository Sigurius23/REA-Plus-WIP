package p72;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import hg3.AbstractC17269i;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import java.io.IOException;
import l83.C23454a0;
import m72.C25205d;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.AbstractC27292z;
import ny0.C27270o;
import org.xmlpull.v1.XmlPullParserException;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28329e;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p72.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ae\u0010\f\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lm72/d;", "state", "Lg1/y3;", "modalBottomSheetState", "Lkotlin/Function0;", "Ll83/a0;", "onDismiss", "onHideRequest", "Lkotlin/Function1;", "Lcom/whoop/navigation/e;", "onNavigationAction", "bodyContent", "e", "(Lm72/d;Lg1/y3;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;II)V", "sage_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28959b {

    /* JADX INFO: renamed from: p72.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.sage.view.components.SageBottomSheetKt$SageBottomSheet$1$1", m100430f = "SageBottomSheet.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f117124w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f117125x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f117126y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117125x = c15199y3;
            this.f117126y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f117125x, this.f117126y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f117124w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f117125x.m43221b() == EnumC15209z3.f57106w) {
                this.f117126y.invoke();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df A[PHI: r5 r8
      0x00df: PHI (r5v18 int) = (r5v12 int), (r5v9 int), (r5v20 int) binds: [B:77:0x00ea, B:71:0x00db, B:72:0x00dd] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r8v11 c93.a) = (r8v6 c93.a), (r8v4 c93.a), (r8v4 c93.a) binds: [B:77:0x00ea, B:71:0x00db, B:72:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x0107  */
    /* JADX WARN: Code duplicated, block: B:90:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0116  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0198  */
    /* JADX INFO: renamed from: e */
    public static final void m87962e(C25205d c25205d, C15199y3 modalBottomSheetState, InterfaceC4339a onDismiss, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4351m bodyContent, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        int i16;
        InterfaceC4339a interfaceC4339a4;
        Function1 function4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        int i17;
        int i18;
        AbstractC22676k.m65750j(modalBottomSheetState, "modalBottomSheetState");
        AbstractC22676k.m65750j(onDismiss, "onDismiss");
        AbstractC22676k.m65750j(bodyContent, "bodyContent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(966020358);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(c25205d) : c28655q2.m87157i(c25205d) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(modalBottomSheetState) : c28655q2.m87157i(modalBottomSheetState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onDismiss) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i18;
            } else {
                interfaceC4339a2 = interfaceC4339a;
            }
            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i18;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        int i19 = i14 & 16;
        if (i19 == 0) {
            if ((i13 & 24576) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i13) == 0) {
                if (c28655q2.m87157i(bodyContent)) {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i17;
            }
            if ((74899 & i15) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i13 & 1) != 0 || c28655q2.m87118C()) {
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                        interfaceC4339a2 = onDismiss;
                    }
                    if (i19 != 0) {
                        i16 = i15;
                        interfaceC4339a4 = interfaceC4339a2;
                        function4 = null;
                    }
                    c28655q2.m87175r();
                    EnumC15209z3 enumC15209z3M43221b = modalBottomSheetState.m43221b();
                    if ((i16 & 112) != 32 || ((i16 & 64) != 0 && c28655q2.m87157i(modalBottomSheetState))) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = z13 | ((i16 & 896) == 256);
                    objM87133R = c28655q2.m87133R();
                    if (z14 || objM87133R == C28635l.f115821a) {
                        objM87133R = new a(modalBottomSheetState, onDismiss, null);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, enumC15209z3M43221b);
                    float f13 = 3 * 4;
                    c28655q = c28655q2;
                    AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(modalBottomSheetState), EnumC39333f.BLACK_90, null, null, AbstractC33253j.m105491g(f13, f13, 0.0f, 0.0f, 12), AbstractC37817c.m121344e(703248692, c28655q2, new C26949h((Object) c25205d, function4, (Object) interfaceC4339a4, 6)), true, null, null, null, false, null, bodyContent, c28655q, (C35666g.f151591h << 3) | 113249280 | (AbstractC35664f.a.f151587c << 6), (i16 >> 3) & 57344, 15921);
                    interfaceC4339a3 = interfaceC4339a4;
                    function3 = function4;
                } else {
                    c28655q2.m87138X();
                    if ((i14 & 8) != 0) {
                        i15 &= -7169;
                    }
                }
                i16 = i15;
                interfaceC4339a4 = interfaceC4339a2;
                function4 = function2;
                c28655q2.m87175r();
                EnumC15209z3 enumC15209z3M43221b2 = modalBottomSheetState.m43221b();
                if ((i16 & 112) != 32) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                z14 = z13 | ((i16 & 896) == 256);
                objM87133R = c28655q2.m87133R();
                if (z14) {
                    objM87133R = new a(modalBottomSheetState, onDismiss, null);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new a(modalBottomSheetState, onDismiss, null);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, enumC15209z3M43221b2);
                float f14 = 3 * 4;
                c28655q = c28655q2;
                AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(modalBottomSheetState), EnumC39333f.BLACK_90, null, null, AbstractC33253j.m105491g(f14, f14, 0.0f, 0.0f, 12), AbstractC37817c.m121344e(703248692, c28655q2, new C26949h((Object) c25205d, function4, (Object) interfaceC4339a4, 6)), true, null, null, null, false, null, bodyContent, c28655q, (C35666g.f151591h << 3) | 113249280 | (AbstractC35664f.a.f151587c << 6), (i16 >> 3) & 57344, 15921);
                interfaceC4339a3 = interfaceC4339a4;
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28958a(c25205d, modalBottomSheetState, onDismiss, interfaceC4339a3, function3, bodyContent, i13, i14, 0);
            }
        }
        i15 |= 24576;
        function2 = function1;
        if ((196608 & i13) == 0) {
            if (c28655q2.m87157i(bodyContent)) {
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i17;
        }
        if ((74899 & i15) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    interfaceC4339a2 = onDismiss;
                }
                if (i19 != 0) {
                    i16 = i15;
                    interfaceC4339a4 = interfaceC4339a2;
                    function4 = null;
                } else {
                    i16 = i15;
                    interfaceC4339a4 = interfaceC4339a2;
                    function4 = function2;
                }
            } else {
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    interfaceC4339a2 = onDismiss;
                }
                if (i19 != 0) {
                    i16 = i15;
                    interfaceC4339a4 = interfaceC4339a2;
                    function4 = null;
                } else {
                    i16 = i15;
                    interfaceC4339a4 = interfaceC4339a2;
                    function4 = function2;
                }
            }
            c28655q2.m87175r();
            EnumC15209z3 enumC15209z3M43221b3 = modalBottomSheetState.m43221b();
            if ((i16 & 112) != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = z13 | ((i16 & 896) == 256);
            objM87133R = c28655q2.m87133R();
            if (z14) {
                objM87133R = new a(modalBottomSheetState, onDismiss, null);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new a(modalBottomSheetState, onDismiss, null);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R, enumC15209z3M43221b3);
            float f15 = 3 * 4;
            c28655q = c28655q2;
            AbstractC35660d.m112871m(null, new C35666g(null, null, null, null, null, 0.0f, 0.0f, 127, null), new AbstractC35664f.a(modalBottomSheetState), EnumC39333f.BLACK_90, null, null, AbstractC33253j.m105491g(f15, f15, 0.0f, 0.0f, 12), AbstractC37817c.m121344e(703248692, c28655q2, new C26949h((Object) c25205d, function4, (Object) interfaceC4339a4, 6)), true, null, null, null, false, null, bodyContent, c28655q, (C35666g.f151591h << 3) | 113249280 | (AbstractC35664f.a.f151587c << 6), (i16 >> 3) & 57344, 15921);
            interfaceC4339a3 = interfaceC4339a4;
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a(c25205d, modalBottomSheetState, onDismiss, interfaceC4339a3, function3, bodyContent, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m87963f(C25205d c25205d, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC23013y BottomSheet, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C2314t c2314t;
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BottomSheet) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (c25205d == null) {
            c28655q.m87150e0(-368547511);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-368547510);
            float f13 = 8;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66779c = ((C23016z) BottomSheet).m66779c(AbstractC1099a.m3396r(c2314t2, f13, 0.0f, 2), false, 1.0f);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66779c);
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
            AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
            C27270o c27270o = new C27270o(bVar, AbstractC16319p0.m46430a().getTinyIcons().getCross(), null, null, null, false, false, false, 0.0f, false, 1020, null);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K);
            Modifier modifierM3419p = AbstractC1102d.m3419p(bVar.getImageSize(), new HorizontalAlignElement(c2305k));
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C28329e(interfaceC4339a, 4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM3419p, null, (InterfaceC4339a) objM87133R, c28655q, C27270o.f109105k, 8);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(15, c2314t2));
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c25205d.getIcon().toWhoopIcon(), c28655q, 6);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f14 = 4;
            AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC13673n.m38560g(c2305k, AbstractC1102d.m3419p(f13 * f14, c2314t2)), c38072d.m121949b(c28655q, i15).getWhite50(), c28655q, 48, 0);
            String strM73809f = c25205d.getTitle();
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i15).getH4();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            float f15 = 2 * f13;
            Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, 0.0f, f15, 0.0f, 0.0f, 13)));
            C36775k c36775k = new C36775k(5);
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM73809f, modifierM38560g, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i16, 196088);
            C17750h1 c17750h1M73808e = c25205d.getTag();
            if (c17750h1M73808e == null) {
                c28655q.m87150e0(-121795695);
                c28655q.m87173q(false);
                c2314t = c2314t2;
            } else {
                AbstractC33745d.m106667z(c28655q, -121795694, c2314t2, f14, c28655q);
                c2314t = c2314t2;
                Modifier modifierM38560g2 = AbstractC13673n.m38560g(c2305k, AbstractC1099a.m3398t(c2314t2, 0.0f, 1 * f13, 0.0f, 0.0f, 13));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM38560g2);
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
                AbstractC17746g1.m50872h(c17750h1M73808e, null, null, c28655q, C17750h1.f69012w, 6);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(16, c2314t));
            AbstractC30795n.m94707h(c25205d.getDescription(), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i16, 196090);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            float f16 = 3 * f13;
            Modifier modifierM91835e = AbstractC30007c.m91835e(c2314t, f16, c28655q, c2314t, 1.0f);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(c25205d.getButtonText());
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i15).getBrandWhite(), c38072d.m121949b(c28655q, i15).getBrandBlack(), 0L, 0L, c28655q, 0, 12);
            C13825t c13825tM48880a = AbstractC17269i.m48880a(0 * f13, c38072d.m121949b(c28655q, i15).getBrandWhite());
            boolean zM87157i = c28655q.m87157i(c25205d) | c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C28448b(14, c25205d, function1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27292z.m82343j(modifierM91835e, false, false, null, null, null, textResourceM21278l, c15077m1M43196a, null, c13825tM48880a, 0.0f, null, null, (InterfaceC4339a) objM87133R2, c28655q, (TextResource.$stable << 18) | 6, 0, 7486);
            AbstractC30007c.m91851u(c2314t, f16, c28655q, false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m87964g(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m87965h(C25205d c25205d, Function1 function1) {
        if (c25205d.getNavigationAction() != null && function1 != null) {
            function1.invoke(c25205d.getNavigationAction());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m87966i(C25205d c25205d, C15199y3 c15199y3, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function1, InterfaceC4351m interfaceC4351m, int i13, int i14, Composer composer, int i15) {
        m87962e(c25205d, c15199y3, interfaceC4339a, interfaceC4339a2, function1, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
