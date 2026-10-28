package n51;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import bc3.InterfaceC2994c0;
import bf0.C3195g;
import c93.InterfaceC4351m;
import l83.C23454a0;
import mx1.C26009o;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: n51.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\u0013\u001a\u00020\u0006*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015²\u0006\u000e\u0010\u0010\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ln51/h;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Ln51/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ll0/y;", "Ln51/a;", "entrance", "", "index", "", "started", "Lm91/u;", "item", "f", "(Ll0/y;Ln51/a;IZLm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26300g {

    /* JADX INFO: renamed from: n51.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f104525a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f104526b;

        static {
            int[] iArr = new int[EnumC26295b.values().length];
            try {
                iArr[EnumC26295b.APPEAR_FROM_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f104525a = iArr;
            int[] iArr2 = new int[EnumC26296c.values().length];
            try {
                iArr2[EnumC26296c.STAGGERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f104526b = iArr2;
        }
    }

    /* JADX INFO: renamed from: n51.g$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.organism.column.ColumnKt$WhoopColumn$3$1", m100430f = "Column.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f104527w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f104528x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f104528x = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f104528x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f104527w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC26300g.m78047m(this.f104528x, true);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f */
    private static final void m78040f(InterfaceC23013y interfaceC23013y, C26294a c26294a, int i13, boolean z4, InterfaceC25312u interfaceC25312u, Function1 function1, Composer composer, int i14) {
        int i15;
        C26294a c26294a2;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1167535419);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC23013y) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            c26294a2 = c26294a;
            i15 |= c28655q.m87153g(c26294a2) ? 32 : 16;
        } else {
            c26294a2 = c26294a;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z13 = z4;
            i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            z13 = z4;
        }
        if ((i14 & 24576) == 0) {
            i15 |= (32768 & i14) == 0 ? c28655q.m87153g(interfaceC25312u) : c28655q.m87157i(interfaceC25312u) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i14) == 0) {
            i15 |= c28655q.m87157i(function1) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            if (a.f104526b[c26294a2.getType().ordinal()] != 1) {
                throw AbstractC11895b.m32003v(-1015067554, c28655q, false);
            }
            c28655q.m87150e0(-1402262743);
            if (a.f104525a[c26294a2.getAnimation().ordinal()] != 1) {
                throw AbstractC11895b.m32003v(-1015065607, c28655q, false);
            }
            c28655q.m87150e0(-1015060130);
            AbstractC1090b.m3350e(interfaceC23013y, z13, null, AbstractC3788w0.m11577e(AbstractC11348f.m30574v(500, (i13 * 500) + AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, null, 4), 2), null, null, AbstractC37817c.m121344e(1578357901, c28655q, new C26299f(interfaceC25312u, function1, 0)), c28655q, (i15 & 14) | 1572864 | ((i15 >> 6) & 112), 26);
            c28655q.m87173q(false);
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(interfaceC23013y, c26294a2, i13, z4, interfaceC25312u, function1, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m78041g(InterfaceC25312u interfaceC25312u, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC25303l.m74291r(interfaceC25312u, null, null, function1, composer, 0, 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m78042h(InterfaceC23013y interfaceC23013y, C26294a c26294a, int i13, boolean z4, InterfaceC25312u interfaceC25312u, Function1 function1, int i14, Composer composer, int i15) {
        m78040f(interfaceC23013y, c26294a, i13, z4, interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x012e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX WARN: Code duplicated, block: B:77:0x0153  */
    /* JADX WARN: Code duplicated, block: B:81:0x0173  */
    /* JADX WARN: Code duplicated, block: B:83:0x017b  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01df A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ba A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m78043i(Modifier modifier, final C26301h state, Function1 function1, Composer composer, final int i13, final int i14) {
        final Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        final Function1 function3;
        C28677v1 c28677v1M87180u;
        InterfaceC4351m interfaceC4351m;
        C28676v0 c28676v0;
        final Function1 function4;
        C26294a c26294aM78050a;
        boolean zM87153g;
        Object objM87133R;
        boolean z13;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        int i17;
        int i18;
        InterfaceC25312u interfaceC25312u;
        C26294a c26294a;
        boolean zM87153g2;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1574307374);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i19 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26009o(20);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                if (state.m78052c().isEmpty()) {
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        return;
                    }
                    final int i25 = 0;
                    interfaceC4351m = new InterfaceC4351m() { // from class: n51.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i25) {
                                case 0:
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC26300g.m78045k(modifier2, state, function4, i13, i14, (Composer) obj, iIntValue);
                                default:
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    return AbstractC26300g.m78048n(modifier2, state, function4, i13, i14, (Composer) obj, iIntValue2);
                            }
                        }
                    };
                } else {
                    Modifier modifier3 = modifier2;
                    c26294aM78050a = state.getEntrance();
                    zM87153g = c28655q.m87153g(c26294aM78050a);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        if (c26294aM78050a == null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = AbstractC31061c.m95647w(z13, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    if (c26294aM78050a != null) {
                        c28655q.m87150e0(-851474023);
                        zM87153g2 = c28655q.m87153g(interfaceC28601c1);
                        objM87133R2 = c28655q.m87133R();
                        if (zM87153g2 || objM87133R2 == c28676v0) {
                            objM87133R2 = new b(interfaceC28601c1, null);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c26294aM78050a);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-851417324);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier3), null, 3);
                    C22949e c22949e = AbstractC22977m.f90650a;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(state.getSpacing()), state.getHorizontalAlignment(), c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3427x);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    c28655q.m87150e0(-357862435);
                    function5 = function4;
                    i17 = 0;
                    for (Object obj : state.m78052c()) {
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        interfaceC25312u = (InterfaceC25312u) obj;
                        if (c26294aM78050a == null) {
                            c28655q.m87150e0(1683991142);
                            AbstractC25303l.m74291r(interfaceC25312u, null, null, function5, c28655q, (i16 << 3) & 7168, 6);
                            c28655q.m87173q(false);
                            c26294a = c26294aM78050a;
                        } else {
                            c28655q.m87150e0(1684083863);
                            Function1 function6 = function5;
                            C28655q c28655q2 = c28655q;
                            c26294a = c26294aM78050a;
                            m78040f(C23016z.f90757a, c26294a, i17, m78046l(interfaceC28601c1), interfaceC25312u, function6, c28655q2, ((i16 << 9) & 458752) | 6);
                            function5 = function6;
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                        }
                        c26294aM78050a = c26294a;
                        i17 = i18;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier2 = modifier3;
                }
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
            c28655q.m87138X();
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                final int i26 = 1;
                interfaceC4351m = new InterfaceC4351m() { // from class: n51.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i26) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC26300g.m78045k(modifier2, state, function3, i13, i14, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC26300g.m78048n(modifier2, state, function3, i13, i14, (Composer) obj2, iIntValue2);
                        }
                    }
                };
                c28677v1M87180u.f115982d = interfaceC4351m;
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i19 != 0) {
                modifier2 = C2314t.f9131w;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26009o(20);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            if (state.m78052c().isEmpty()) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    return;
                }
                final int i27 = 0;
                interfaceC4351m = new InterfaceC4351m() { // from class: n51.e
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        switch (i27) {
                            case 0:
                                int iIntValue = ((Integer) obj3).intValue();
                                return AbstractC26300g.m78045k(modifier2, state, function4, i13, i14, (Composer) obj2, iIntValue);
                            default:
                                int iIntValue2 = ((Integer) obj3).intValue();
                                return AbstractC26300g.m78048n(modifier2, state, function4, i13, i14, (Composer) obj2, iIntValue2);
                        }
                    }
                };
            } else {
                Modifier modifier4 = modifier2;
                c26294aM78050a = state.getEntrance();
                zM87153g = c28655q.m87153g(c26294aM78050a);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    if (c26294aM78050a == null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = AbstractC31061c.m95647w(z13, c28655q);
                } else {
                    if (c26294aM78050a == null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = AbstractC31061c.m95647w(z13, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                if (c26294aM78050a != null) {
                    c28655q.m87150e0(-851474023);
                    zM87153g2 = c28655q.m87153g(interfaceC28601c1);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R2 = new b(interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new b(interfaceC28601c1, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c26294aM78050a);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-851417324);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3427x2 = AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier4), null, 3);
                C22949e c22949e2 = AbstractC22977m.f90650a;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(state.getSpacing()), state.getHorizontalAlignment(), c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3427x2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                c28655q.m87150e0(-357862435);
                function5 = function4;
                i17 = 0;
                while (r0.hasNext()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    interfaceC25312u = (InterfaceC25312u) obj;
                    if (c26294aM78050a == null) {
                        c28655q.m87150e0(1683991142);
                        AbstractC25303l.m74291r(interfaceC25312u, null, null, function5, c28655q, (i16 << 3) & 7168, 6);
                        c28655q.m87173q(false);
                        c26294a = c26294aM78050a;
                    } else {
                        c28655q.m87150e0(1684083863);
                        Function1 function7 = function5;
                        C28655q c28655q3 = c28655q;
                        c26294a = c26294aM78050a;
                        m78040f(C23016z.f90757a, c26294a, i17, m78046l(interfaceC28601c1), interfaceC25312u, function7, c28655q3, ((i16 << 9) & 458752) | 6);
                        function5 = function7;
                        c28655q = c28655q3;
                        c28655q.m87173q(false);
                    }
                    c26294aM78050a = c26294a;
                    i17 = i18;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                function3 = function5;
                modifier2 = modifier4;
            }
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
        c28655q.m87138X();
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final int i28 = 1;
            interfaceC4351m = new InterfaceC4351m() { // from class: n51.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i28) {
                        case 0:
                            int iIntValue = ((Integer) obj3).intValue();
                            return AbstractC26300g.m78045k(modifier2, state, function3, i13, i14, (Composer) obj2, iIntValue);
                        default:
                            int iIntValue2 = ((Integer) obj3).intValue();
                            return AbstractC26300g.m78048n(modifier2, state, function3, i13, i14, (Composer) obj2, iIntValue2);
                    }
                }
            };
            c28677v1M87180u.f115982d = interfaceC4351m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m78044j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m78045k(Modifier modifier, C26301h c26301h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m78043i(modifier, c26301h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final boolean m78046l(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m78047m(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m78048n(Modifier modifier, C26301h c26301h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m78043i(modifier, c26301h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
