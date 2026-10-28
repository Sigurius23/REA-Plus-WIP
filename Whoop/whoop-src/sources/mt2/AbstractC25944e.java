package mt2;

import a81.C0563n;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2646w1;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.hubandspoke.navigation.HubAndSpokeNavDestination;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import hh0.C17284d;
import js2.C21930h;
import l83.C23454a0;
import mq2.C25888a;
import no.nordicsemi.android.dfu.DfuBaseService;
import nt2.AbstractC27131a;
import nt2.C27133c;
import ot2.AbstractC28344m;
import ot2.C28347p;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p702ch0.C4614e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pt2.AbstractC29517a0;
import pt2.AbstractC29527i;
import pt2.AbstractC29530l;
import pt2.AbstractC29540v;
import pt2.AbstractC29543y;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: mt2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lnt2/c;", "viewModel", "Lot2/m;", "viewState", "Leb/u0;", "navController", "Lmt2/f;", "navigationRouter", "", "showMetricSelection", "Lcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;", "startDestination", "Lkotlin/Function0;", "Ll83/a0;", "onExit", "onSave", "t", "(Lnt2/c;Lot2/m;Leb/u0;Lmt2/f;ZLcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lmt2/g;", "navigationEvent", "isCustomized", "N", "(Lmt2/g;Ljava/lang/Boolean;Z)Z", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25944e {

    /* JADX INFO: renamed from: mt2.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.navigation.HubAndSpokeNavHostKt$HubAndSpokeNavHost$4$1", m100430f = "HubAndSpokeNavHost.kt", m100431l = {94}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102473w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f102474x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f102475y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C25945f f102476z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, InterfaceC28601c1 interfaceC28601c1, C25945f c25945f, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102474x = z4;
            this.f102475y = interfaceC28601c1;
            this.f102476z = c25945f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f102474x, this.f102475y, this.f102476z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102473w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f102474x && !((Boolean) this.f102475y.getValue()).booleanValue()) {
                    this.f102475y.setValue(Boolean.TRUE);
                    this.f102473w = 1;
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
            this.f102476z.m76783a(AbstractC25946g.e.f102486a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m76743A(AbstractC28344m abstractC28344m, C27133c c27133c, boolean z4, InterfaceC4339a interfaceC4339a, C25945f c25945f, C12982q it, Composer composer, int i13) {
        AbstractC28344m abstractC28344m2;
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c27133c);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C25940a(c27133c, 2);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        boolean zM87153g = c28655q.m87153g(abstractC28344m) | c28655q.m87155h(z4) | c28655q.m87153g(interfaceC4339a) | c28655q.m87157i(c25945f);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            abstractC28344m2 = abstractC28344m;
            C4614e c4614e = new C4614e(abstractC28344m2, z4, interfaceC4339a, c25945f, 10);
            c28655q.m87172p0(c4614e);
            objM87133R2 = c4614e;
        } else {
            abstractC28344m2 = abstractC28344m;
        }
        AbstractC29543y.m90484t(abstractC28344m2, function1, (Function1) objM87133R2, c28655q, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m76744B(C27133c c27133c, AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        c27133c.m81595n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m76745C(AbstractC28344m abstractC28344m, boolean z4, InterfaceC4339a interfaceC4339a, C25945f c25945f, AbstractC25946g it) {
        C28347p c28347pM85969c;
        AbstractC22676k.m65750j(it, "it");
        Boolean boolValueOf = null;
        AbstractC28344m.i iVar = abstractC28344m instanceof AbstractC28344m.i ? (AbstractC28344m.i) abstractC28344m : null;
        if (iVar != null && (c28347pM85969c = iVar.getInitialScreen()) != null) {
            boolValueOf = Boolean.valueOf(c28347pM85969c.getIsCustomized());
        }
        if (m76756N(it, boolValueOf, z4)) {
            interfaceC4339a.invoke();
        } else {
            c25945f.m76783a(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m76746D(AbstractC28344m abstractC28344m, C27133c c27133c, C25945f c25945f, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c27133c);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C25940a(c27133c, 3);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(c25945f);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C25941b(c25945f, 2);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC29517a0.m90203i(abstractC28344m, function1, (Function1) objM87133R2, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m76747E(C27133c c27133c, AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        c27133c.m81595n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m76748F(C25945f c25945f, AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        c25945f.m76783a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m76749G(AbstractC28344m abstractC28344m, C27133c c27133c, C25945f c25945f, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c27133c);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C25940a(c27133c, 0);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(c25945f);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C25941b(c25945f, 0);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC29527i.m90230B(abstractC28344m, function1, (Function1) objM87133R2, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m76750H(C27133c c27133c, AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        c27133c.m81595n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m76751I(C25945f c25945f, AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        c25945f.m76783a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m76752J(AbstractC28344m abstractC28344m, C27133c c27133c, C25945f c25945f, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c27133c);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C25940a(c27133c, 1);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(c25945f);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C25941b(c25945f, 1);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC29530l.m90344x(abstractC28344m, function1, (Function1) objM87133R2, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m76753K(C27133c c27133c, AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        c27133c.m81595n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m76754L(C25945f c25945f, AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        c25945f.m76783a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m76755M(C27133c c27133c, AbstractC28344m abstractC28344m, C12991u0 c12991u0, C25945f c25945f, boolean z4, HubAndSpokeNavDestination hubAndSpokeNavDestination, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m76776t(c27133c, abstractC28344m, c12991u0, c25945f, z4, hubAndSpokeNavDestination, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final boolean m76756N(AbstractC25946g abstractC25946g, Boolean bool, boolean z4) {
        return AbstractC22676k.m65745e(abstractC25946g, new AbstractC25946g.b(TargetGoalType.METRIC)) && AbstractC22676k.m65745e(bool, Boolean.FALSE) && z4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:103:0x014f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0152  */
    /* JADX WARN: Code duplicated, block: B:107:0x0163  */
    /* JADX WARN: Code duplicated, block: B:108:0x0166  */
    /* JADX WARN: Code duplicated, block: B:112:0x0171  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x0115  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x012f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0132  */
    /* JADX WARN: Code duplicated, block: B:99:0x0141  */
    /* JADX INFO: renamed from: t */
    public static final void m76776t(C27133c viewModel, AbstractC28344m viewState, C12991u0 navController, C25945f navigationRouter, boolean z4, HubAndSpokeNavDestination hubAndSpokeNavDestination, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a3;
        int i16;
        InterfaceC4339a interfaceC4339a4;
        int i17;
        int i18;
        boolean z13;
        boolean z14;
        C28655q c28655q;
        C25945f c25945f;
        HubAndSpokeNavDestination hubAndSpokeNavDestination2;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a7;
        boolean z15;
        boolean z16;
        boolean z17;
        int i19;
        boolean z18;
        boolean z19;
        Object c25942c;
        C28676v0 c28676v1;
        InterfaceC4339a interfaceC4339a8;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87157i;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(navigationRouter, "navigationRouter");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1168389044);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(navController) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(navigationRouter) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i24 = i14 & 32;
        int i25 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if (i24 != 0) {
            i15 |= i25;
        } else if ((196608 & i13) == 0) {
            i25 = c28655q2.m87149e(hubAndSpokeNavDestination == null ? -1 : hubAndSpokeNavDestination.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i15 |= i25;
        }
        int i26 = i14 & 64;
        if (i26 == 0) {
            if ((1572864 & i13) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a3) ? 1048576 : 524288;
            }
            i16 = i14 & 128;
            if (i16 != 0) {
                i15 |= 12582912;
                interfaceC4339a4 = interfaceC4339a2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(interfaceC4339a4)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i15 |= i17;
                }
            }
            i18 = i15;
            if ((i18 & 4793491) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z13)) {
                if (i24 != 0) {
                    hubAndSpokeNavDestination2 = HubAndSpokeNavDestination.MAIN_SCREEN;
                } else {
                    hubAndSpokeNavDestination2 = hubAndSpokeNavDestination;
                }
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C25888a(9);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R4;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C25888a(10);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                }
                String strName = hubAndSpokeNavDestination2.name();
                if ((i18 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM87157i2 = z15 | c28655q2.m87157i(viewModel);
                if ((i18 & 3670016) == 1048576) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z24 = zM87157i2 | z16;
                if ((i18 & 29360128) == 8388608) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zM87157i3 = z24 | z17 | c28655q2.m87157i(navigationRouter);
                i19 = i18 & 57344;
                if (i19 == 16384) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i3 | z18;
                Object objM87133R5 = c28655q2.m87133R();
                if (!z19 || objM87133R5 == c28676v0) {
                    InterfaceC4339a interfaceC4339a9 = interfaceC4339a4;
                    c28676v1 = c28676v0;
                    c25942c = new C25942c(viewState, viewModel, interfaceC4339a7, interfaceC4339a9, navigationRouter, z4);
                    interfaceC4339a8 = interfaceC4339a9;
                    c28655q2.m87172p0(c25942c);
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                    c28676v1 = c28676v0;
                    c25942c = objM87133R5;
                }
                c28655q = c28655q2;
                AbstractC17269i.m48888e(navController, strName, null, (Function1) c25942c, c28655q, (i18 >> 6) & 14);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v1) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                zM87157i = (i19 == 16384) | c28655q.m87157i(c25945f);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v1) {
                    objM87133R2 = new a(z4, interfaceC28601c1, navigationRouter, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
                interfaceC4339a6 = interfaceC4339a7;
                interfaceC4339a5 = interfaceC4339a8;
            } else {
                z14 = z4;
                c28655q = c28655q2;
                c25945f = navigationRouter;
                c28655q.m87138X();
                hubAndSpokeNavDestination2 = hubAndSpokeNavDestination;
                interfaceC4339a5 = interfaceC4339a4;
                interfaceC4339a6 = interfaceC4339a3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2646w1(viewModel, viewState, navController, c25945f, z14, hubAndSpokeNavDestination2, interfaceC4339a6, interfaceC4339a5, i13, i14);
            }
        }
        i15 |= 1572864;
        interfaceC4339a3 = interfaceC4339a;
        i16 = i14 & 128;
        if (i16 != 0) {
            i15 |= 12582912;
            interfaceC4339a4 = interfaceC4339a2;
        } else {
            interfaceC4339a4 = interfaceC4339a2;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(interfaceC4339a4)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i15 |= i17;
            }
        }
        i18 = i15;
        if ((i18 & 4793491) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z13)) {
            if (i24 != 0) {
                hubAndSpokeNavDestination2 = HubAndSpokeNavDestination.MAIN_SCREEN;
            } else {
                hubAndSpokeNavDestination2 = hubAndSpokeNavDestination;
            }
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C25888a(9);
                    c28655q2.m87172p0(objM87133R4);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R4;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C25888a(10);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            }
            String strName2 = hubAndSpokeNavDestination2.name();
            if ((i18 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zM87157i4 = z15 | c28655q2.m87157i(viewModel);
            if ((i18 & 3670016) == 1048576) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z25 = zM87157i4 | z16;
            if ((i18 & 29360128) == 8388608) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zM87157i5 = z25 | z17 | c28655q2.m87157i(navigationRouter);
            i19 = i18 & 57344;
            if (i19 == 16384) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zM87157i5 | z18;
            Object objM87133R6 = c28655q2.m87133R();
            if (z19) {
                InterfaceC4339a interfaceC4339a10 = interfaceC4339a4;
                c28676v1 = c28676v0;
                c25942c = new C25942c(viewState, viewModel, interfaceC4339a7, interfaceC4339a10, navigationRouter, z4);
                interfaceC4339a8 = interfaceC4339a10;
                c28655q2.m87172p0(c25942c);
            } else {
                InterfaceC4339a interfaceC4339a11 = interfaceC4339a4;
                c28676v1 = c28676v0;
                c25942c = new C25942c(viewState, viewModel, interfaceC4339a7, interfaceC4339a11, navigationRouter, z4);
                interfaceC4339a8 = interfaceC4339a11;
                c28655q2.m87172p0(c25942c);
            }
            c28655q = c28655q2;
            AbstractC17269i.m48888e(navController, strName2, null, (Function1) c25942c, c28655q, (i18 >> 6) & 14);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v1) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            zM87157i = (i19 == 16384) | c28655q.m87157i(c25945f);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(z4, interfaceC28601c1, navigationRouter, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(z4, interfaceC28601c1, navigationRouter, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            interfaceC4339a6 = interfaceC4339a7;
            interfaceC4339a5 = interfaceC4339a8;
        } else {
            z14 = z4;
            c28655q = c28655q2;
            c25945f = navigationRouter;
            c28655q.m87138X();
            hubAndSpokeNavDestination2 = hubAndSpokeNavDestination;
            interfaceC4339a5 = interfaceC4339a4;
            interfaceC4339a6 = interfaceC4339a3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2646w1(viewModel, viewState, navController, c25945f, z14, hubAndSpokeNavDestination2, interfaceC4339a6, interfaceC4339a5, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m76777u() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m76778v() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m76779w(final AbstractC28344m abstractC28344m, final C27133c c27133c, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, final C25945f c25945f, boolean z4, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "MAIN_SCREEN", null, new C37816b(new C0563n(abstractC28344m, c27133c, interfaceC4339a, interfaceC4339a2, c25945f, 11), true, 265018663), 6);
        AbstractC12889b.m36291u(NavHost, "CONTRIBUTOR_SELECTION", null, new C37816b(new C17284d(2, abstractC28344m, c27133c, interfaceC4339a, c25945f, z4), true, 1813363088), 6);
        final int i13 = 0;
        AbstractC12889b.m36291u(NavHost, "SLIDER_CUSTOMIZATION", null, new C37816b(new Function3() { // from class: mt2.d
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i13) {
                    case 0:
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC25944e.m76746D(abstractC28344m, c27133c, c25945f, (C12982q) obj, (Composer) obj2, iIntValue);
                    case 1:
                        int iIntValue2 = ((Integer) obj3).intValue();
                        return AbstractC25944e.m76749G(abstractC28344m, c27133c, c25945f, (C12982q) obj, (Composer) obj2, iIntValue2);
                    default:
                        int iIntValue3 = ((Integer) obj3).intValue();
                        return AbstractC25944e.m76752J(abstractC28344m, c27133c, c25945f, (C12982q) obj, (Composer) obj2, iIntValue3);
                }
            }
        }, true, -1428567441), 6);
        final int i14 = 1;
        AbstractC12889b.m36291u(NavHost, "ACTIVITY_SELECTION", null, new C37816b(new Function3() { // from class: mt2.d
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i14) {
                    case 0:
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC25944e.m76746D(abstractC28344m, c27133c, c25945f, (C12982q) obj, (Composer) obj2, iIntValue);
                    case 1:
                        int iIntValue2 = ((Integer) obj3).intValue();
                        return AbstractC25944e.m76749G(abstractC28344m, c27133c, c25945f, (C12982q) obj, (Composer) obj2, iIntValue2);
                    default:
                        int iIntValue3 = ((Integer) obj3).intValue();
                        return AbstractC25944e.m76752J(abstractC28344m, c27133c, c25945f, (C12982q) obj, (Composer) obj2, iIntValue3);
                }
            }
        }, true, -375530674), 6);
        final int i15 = 2;
        AbstractC12889b.m36291u(NavHost, "BEHAVIOR_SELECTION", null, new C37816b(new Function3() { // from class: mt2.d
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                switch (i15) {
                    case 0:
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC25944e.m76746D(abstractC28344m, c27133c, c25945f, (C12982q) obj, (Composer) obj2, iIntValue);
                    case 1:
                        int iIntValue2 = ((Integer) obj3).intValue();
                        return AbstractC25944e.m76749G(abstractC28344m, c27133c, c25945f, (C12982q) obj, (Composer) obj2, iIntValue2);
                    default:
                        int iIntValue3 = ((Integer) obj3).intValue();
                        return AbstractC25944e.m76752J(abstractC28344m, c27133c, c25945f, (C12982q) obj, (Composer) obj2, iIntValue3);
                }
            }
        }, true, 677506093), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m76780x(AbstractC28344m abstractC28344m, C27133c c27133c, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C25945f c25945f, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c27133c);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C25940a(c27133c, 4);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function1 = (Function1) objM87133R;
        boolean zM87153g = c28655q.m87153g(interfaceC4339a) | c28655q.m87153g(interfaceC4339a2) | c28655q.m87157i(c25945f);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g || objM87133R2 == c28676v0) {
            objM87133R2 = new C21930h(interfaceC4339a, interfaceC4339a2, c25945f, 23);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC29540v.m90405Y(abstractC28344m, false, false, function1, (Function1) objM87133R2, c28655q, 0, 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m76781y(C27133c c27133c, AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        c27133c.m81595n(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m76782z(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, C25945f c25945f, AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC25946g.b) {
            interfaceC4339a.invoke();
        } else if ((it instanceof AbstractC25946g.f) || (it instanceof AbstractC25946g.d)) {
            interfaceC4339a2.invoke();
        } else {
            c25945f.m76783a(it);
        }
        return C23454a0.f92919a;
    }
}
