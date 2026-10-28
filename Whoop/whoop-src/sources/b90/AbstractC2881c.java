package b90;

import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b72.C2783a;
import bc3.InterfaceC2994c0;
import c31.C3927k;
import c31.EnumC3920d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4356r;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import d70.C11751e;
import f70.C14201q0;
import f80.AbstractC14243b;
import f80.C14242a;
import f80.C14245d;
import f80.C14246e;
import fy1.AbstractC14874j;
import g80.C15565f;
import g80.C15566g;
import h80.InterfaceC17002b;
import j80.InterfaceC21413a;
import java.util.List;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.C27314o;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p714k80.AbstractC22289r;
import p714k80.AbstractC22290s;
import p714k80.Function0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q80.AbstractC30037i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.C38072d;

/* JADX INFO: renamed from: b90.c */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aÃ\u0001\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\b2T\u0010\u0016\u001aP\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0010H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001c²\u0006\u000e\u0010\u001a\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lg80/f;", "viewState", "Lf80/a;", "credentialHelper", "Lf80/d;", "passwordManagerTracker", "Lf80/e;", "saveCredentialOnAdvance", "Lkotlin/Function1;", "Lj80/b;", "Ll83/a0;", "onViewEvent", "Ll80/o;", "onNavigationEvent", "Lh80/b;", "onAnalyticsEvent", "Lkotlin/Function8;", "Lm91/u;", "Lp90/e;", "Lc31/k;", "Lg80/g;", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "handleProgressButtonClick", "e", "(Lg80/f;Lf80/a;Lf80/d;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;II)V", "", "hasAttemptedCredential", "hasExistingCredential", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2881c {

    /* JADX INFO: renamed from: b90.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.enterpassword.EnterYourPasswordScreenContainerKt$EnterYourPasswordScreenContainer$2$1", m100430f = "EnterYourPasswordScreenContainer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f11450w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f11451x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f11451x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f11451x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f11450w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f11451x.invoke(InterfaceC21413a.r.f82134a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b90.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.enterpassword.EnterYourPasswordScreenContainerKt$EnterYourPasswordScreenContainer$3$1", m100430f = "EnterYourPasswordScreenContainer.kt", m100431l = {71}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C14245d f11452E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Function1 f11453F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f11454G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f11455H;

        /* JADX INFO: renamed from: w */
        int f11456w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f11457x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14242a f11458y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Context f11459z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, C14242a c14242a, Context context, C14245d c14245d, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f11457x = z4;
            this.f11458y = c14242a;
            this.f11459z = context;
            this.f11452E = c14245d;
            this.f11453F = function1;
            this.f11454G = interfaceC28601c1;
            this.f11455H = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f11457x, this.f11458y, this.f11459z, this.f11452E, this.f11453F, this.f11454G, this.f11455H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f11456w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f11457x && !AbstractC2881c.m8334i(this.f11454G)) {
                    AbstractC2881c.m8335j(this.f11454G, true);
                    C14242a c14242a = this.f11458y;
                    Context context = this.f11459z;
                    this.f11456w = 1;
                    obj = c14242a.m40699a(context, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC14243b abstractC14243b = (AbstractC14243b) obj;
            this.f11452E.m40706d(abstractC14243b);
            if (abstractC14243b instanceof AbstractC14243b.b) {
                AbstractC2881c.m8337l(this.f11455H, true);
                this.f11453F.invoke(new InterfaceC21413a.u0(new C11751e(((AbstractC14243b.b) abstractC14243b).getPassword()), true));
                this.f11453F.invoke(new InterfaceC21413a.o0(true));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: b90.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.enterpassword.EnterYourPasswordScreenContainerKt$EnterYourPasswordScreenContainer$6$1", m100430f = "EnterYourPasswordScreenContainer.kt", m100431l = {111}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lm91/u;", "currentScreen", "Lf70/q0;", "memberInfo", "Ll83/a0;", "<anonymous>", "(Lm91/u;Lf70/q0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Context f11460E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f11461F;

        /* JADX INFO: renamed from: w */
        int f11462w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f11463x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f11464y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C14246e f11465z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C14246e c14246e, Context context, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f11465z = c14246e;
            this.f11460E = context;
            this.f11461F = interfaceC28601c1;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC25312u interfaceC25312u, C14201q0 c14201q0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(this.f11465z, this.f11460E, this.f11461F, interfaceC30057d);
            cVar.f11463x = interfaceC25312u;
            cVar.f11464y = c14201q0;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f11463x;
            C14201q0 c14201q0 = (C14201q0) this.f11464y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f11462w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C14246e c14246e = this.f11465z;
                Context context = this.f11460E;
                boolean zM8336k = AbstractC2881c.m8336k(this.f11461F);
                this.f11463x = null;
                this.f11464y = null;
                this.f11462w = 1;
                if (c14246e.m40711a(context, interfaceC25312u, c14201q0, zM8336k, this) == enumC31071a) {
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

    /* JADX WARN: Code duplicated, block: B:100:0x019e  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:109:0x01da  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:115:0x0206  */
    /* JADX WARN: Code duplicated, block: B:116:0x0209  */
    /* JADX WARN: Code duplicated, block: B:120:0x0214  */
    /* JADX WARN: Code duplicated, block: B:124:0x0225  */
    /* JADX WARN: Code duplicated, block: B:128:0x022f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0246  */
    /* JADX WARN: Code duplicated, block: B:133:0x0252  */
    /* JADX WARN: Code duplicated, block: B:134:0x0262  */
    /* JADX WARN: Code duplicated, block: B:136:0x026c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0271  */
    /* JADX WARN: Code duplicated, block: B:139:0x0274  */
    /* JADX WARN: Code duplicated, block: B:142:0x0295  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:149:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:78:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x014d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0152  */
    /* JADX WARN: Code duplicated, block: B:90:0x015f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0188  */
    /* JADX WARN: Code duplicated, block: B:94:0x018b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r11v1, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v4, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r11v5, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
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
    /* JADX INFO: renamed from: e */
    public static final void m8330e(C15565f viewState, C14242a credentialHelper, C14245d passwordManagerTracker, C14246e saveCredentialOnAdvance, Function1 function1, Function1 onNavigationEvent, Function1 function2, InterfaceC4356r handleProgressButtonClick, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        boolean z4;
        ?? r14;
        C28677v1 c28677v1M87180u;
        Object obj;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Context context;
        boolean zIsFeatureEnabled;
        int i17;
        boolean z13;
        Object objM87133R3;
        boolean z14;
        boolean z15;
        Object bVar;
        int i18;
        ?? r15;
        InterfaceC28601c1 interfaceC28601c3;
        C15566g bffScreenContainerState;
        EnumC3920d state;
        C15566g bffScreenContainerState2;
        List<InterfaceC25312u> listM43839h;
        Function1 function5;
        boolean zM87157i;
        Object objM87133R4;
        ?? r16;
        int i19;
        ?? r10;
        Object objM87133R5;
        ?? r17;
        Object objM87133R6;
        C3927k progressButtonState;
        Object objM87133R7;
        int i24;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(credentialHelper, "credentialHelper");
        AbstractC22676k.m65750j(passwordManagerTracker, "passwordManagerTracker");
        AbstractC22676k.m65750j(saveCredentialOnAdvance, "saveCredentialOnAdvance");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(handleProgressButtonClick, "handleProgressButtonClick");
        ?? r18 = (C28655q) composer;
        r18.m87154g0(181393268);
        if ((i13 & 6) == 0) {
            i15 = (r18.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= r18.m87157i(credentialHelper) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= r18.m87157i(passwordManagerTracker) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= r18.m87157i(saveCredentialOnAdvance) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= r18.m87157i(onViewEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= r18.m87157i(onNavigationEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i25 = i14 & 64;
        if (i25 == 0) {
            if ((1572864 & i13) == 0) {
                function3 = function2;
                i15 |= r18.m87157i(function3) ? 1048576 : 524288;
            }
            if ((12582912 & i13) == 0) {
                if (r18.m87157i(handleProgressButtonClick)) {
                    i24 = 8388608;
                } else {
                    i24 = 4194304;
                }
                i15 |= i24;
            }
            i16 = i15;
            if ((i16 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (r18.m87135U(i16 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i25 != 0) {
                    objM87133R7 = r18.m87133R();
                    if (objM87133R7 == obj) {
                        objM87133R7 = new C2783a(5);
                        r18.m87172p0(objM87133R7);
                    }
                    function4 = (Function1) objM87133R7;
                } else {
                    function4 = function3;
                }
                objM87133R = r18.m87133R();
                if (objM87133R == obj) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    r18.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = r18.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    r18.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                context = (Context) r18.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                zIsFeatureEnabled = C38072d.f163053a.m121950c(r18, C38072d.f163054b).isFeatureEnabled(OnboardingFeatureFlag.CREDENTIAL_MANAGER_ANDROID);
                AbstractC14874j.m42904c(viewState.getActivationState(), "activation_enter_password", r18, 48);
                i17 = i16 & 57344;
                if (i17 == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R3 = r18.m87133R();
                if (z13 || objM87133R3 == obj) {
                    objM87133R3 = new a(onViewEvent, null);
                    r18.m87172p0(objM87133R3);
                }
                C23454a0 c23454a0 = C23454a0.f92919a;
                AbstractC28683x.m87253g(r18, (InterfaceC4351m) objM87133R3, c23454a0);
                boolean zM87155h = r18.m87155h(zIsFeatureEnabled) | r18.m87157i(credentialHelper) | r18.m87157i(context) | r18.m87157i(passwordManagerTracker);
                if (i17 == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | zM87155h;
                Object objM87133R8 = r18.m87133R();
                if (!z15 || objM87133R8 == obj) {
                    i18 = i17;
                    r15 = 0;
                    interfaceC28601c3 = interfaceC28601c2;
                    bVar = new b(zIsFeatureEnabled, credentialHelper, context, passwordManagerTracker, onViewEvent, interfaceC28601c1, interfaceC28601c3, null);
                    context = context;
                    onViewEvent = onViewEvent;
                    r18.m87172p0(bVar);
                } else {
                    interfaceC28601c3 = interfaceC28601c2;
                    i18 = i17;
                    bVar = objM87133R8;
                    r15 = 0;
                }
                AbstractC28683x.m87253g(r18, (InterfaceC4351m) bVar, c23454a0);
                bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
                if (bffScreenContainerState != null || (progressButtonState = bffScreenContainerState.getProgressButtonState()) == null) {
                    state = null;
                } else {
                    state = progressButtonState.getState();
                }
                if (state == EnumC3920d.LOADING) {
                    r18.m87150e0(820175145);
                    AbstractC22290s.m64039c(r18, r15);
                    r18.m87173q(r15);
                } else {
                    r18.m87150e0(820210702);
                    r18.m87173q(r15);
                }
                if (viewState.getActivationState().getIsFullScreenError()) {
                    r18.m87150e0(820285288);
                    i19 = i18;
                    if (i19 == 16384) {
                        r10 = 1;
                    } else {
                        r10 = r15;
                    }
                    objM87133R5 = r18.m87133R();
                    if (r10 == 0 || objM87133R5 == obj) {
                        objM87133R5 = new C27314o(onViewEvent, 14);
                        r18.m87172p0(objM87133R5);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R5;
                    r17 = i19 != 16384 ? r15 : 1;
                    objM87133R6 = r18.m87133R();
                    if (r17 == 0 || objM87133R6 == obj) {
                        objM87133R6 = new C27314o(onViewEvent, 15);
                        r18.m87172p0(objM87133R6);
                    }
                    Function0.m64022b(interfaceC4339a, (InterfaceC4339a) objM87133R6, r18, r15);
                    r18.m87173q(r15);
                } else {
                    if (viewState.getActivationState().getIsFullScreenLoading()) {
                        r18.m87150e0(820566923);
                        AbstractC22290s.m64039c(r18, r15);
                        AbstractC22289r.m64035b(r18, r15);
                        r18.m87173q(r15);
                    } else {
                        bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                        if (bffScreenContainerState2 != null) {
                            listM43839h = bffScreenContainerState2.m43839h();
                        } else {
                            listM43839h = null;
                        }
                        if (listM43839h != null) {
                            r18.m87150e0(820739655);
                            C15566g bffScreenContainerState3 = viewState.getActivationState().getBffScreenContainerState();
                            ActivationFlowDestination activationFlowDestination = ActivationFlowDestination.ENTER_YOUR_PASSWORD;
                            zM87157i = r18.m87157i(saveCredentialOnAdvance) | r18.m87157i(context);
                            objM87133R4 = r18.m87133R();
                            if (zM87157i || objM87133R4 == obj) {
                                objM87133R4 = new c(saveCredentialOnAdvance, context, interfaceC28601c3, null);
                                r18.m87172p0(objM87133R4);
                            }
                            int i26 = i16 >> 3;
                            ?? r19 = r18;
                            function5 = function4;
                            AbstractC30037i.m91955m(bffScreenContainerState3, activationFlowDestination, null, onViewEvent, onNavigationEvent, null, function5, (Function3) objM87133R4, handleProgressButtonClick, r19, (i26 & 57344) | (i26 & 7168) | 48 | (i16 & 3670016) | (234881024 & (i16 << 3)), 36);
                            r19.m87173q(r15);
                            r16 = r19;
                        } else {
                            ?? r110 = r18;
                            function5 = function4;
                            r110.m87150e0(821644142);
                            r110.m87173q(r15);
                            r16 = r110;
                        }
                    }
                    function3 = function5;
                    r14 = r16;
                }
                r16 = r18;
                function5 = function4;
                function3 = function5;
                r14 = r16;
            } else {
                ?? r111 = r18;
                r111.m87138X();
                r14 = r111;
            }
            c28677v1M87180u = r14.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2880b(viewState, credentialHelper, passwordManagerTracker, saveCredentialOnAdvance, function1, onNavigationEvent, function3, handleProgressButtonClick, i13, i14, 0);
            }
        }
        i15 |= 1572864;
        function3 = function2;
        if ((12582912 & i13) == 0) {
            if (r18.m87157i(handleProgressButtonClick)) {
                i24 = 8388608;
            } else {
                i24 = 4194304;
            }
            i15 |= i24;
        }
        i16 = i15;
        if ((i16 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (r18.m87135U(i16 & 1, z4)) {
            obj = C28635l.f115821a;
            if (i25 != 0) {
                objM87133R7 = r18.m87133R();
                if (objM87133R7 == obj) {
                    objM87133R7 = new C2783a(5);
                    r18.m87172p0(objM87133R7);
                }
                function4 = (Function1) objM87133R7;
            } else {
                function4 = function3;
            }
            objM87133R = r18.m87133R();
            if (objM87133R == obj) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                r18.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = r18.m87133R();
            if (objM87133R2 == obj) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                r18.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            context = (Context) r18.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            zIsFeatureEnabled = C38072d.f163053a.m121950c(r18, C38072d.f163054b).isFeatureEnabled(OnboardingFeatureFlag.CREDENTIAL_MANAGER_ANDROID);
            AbstractC14874j.m42904c(viewState.getActivationState(), "activation_enter_password", r18, 48);
            i17 = i16 & 57344;
            if (i17 == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R3 = r18.m87133R();
            if (z13) {
                objM87133R3 = new a(onViewEvent, null);
                r18.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new a(onViewEvent, null);
                r18.m87172p0(objM87133R3);
            }
            C23454a0 c23454a1 = C23454a0.f92919a;
            AbstractC28683x.m87253g(r18, (InterfaceC4351m) objM87133R3, c23454a1);
            boolean zM87155h2 = r18.m87155h(zIsFeatureEnabled) | r18.m87157i(credentialHelper) | r18.m87157i(context) | r18.m87157i(passwordManagerTracker);
            if (i17 == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | zM87155h2;
            Object objM87133R9 = r18.m87133R();
            if (z15) {
                i18 = i17;
                r15 = 0;
                interfaceC28601c3 = interfaceC28601c2;
                bVar = new b(zIsFeatureEnabled, credentialHelper, context, passwordManagerTracker, onViewEvent, interfaceC28601c1, interfaceC28601c3, null);
                context = context;
                onViewEvent = onViewEvent;
                r18.m87172p0(bVar);
            } else {
                i18 = i17;
                r15 = 0;
                interfaceC28601c3 = interfaceC28601c2;
                bVar = new b(zIsFeatureEnabled, credentialHelper, context, passwordManagerTracker, onViewEvent, interfaceC28601c1, interfaceC28601c3, null);
                context = context;
                onViewEvent = onViewEvent;
                r18.m87172p0(bVar);
            }
            AbstractC28683x.m87253g(r18, (InterfaceC4351m) bVar, c23454a1);
            bffScreenContainerState = viewState.getActivationState().getBffScreenContainerState();
            if (bffScreenContainerState != null) {
                state = null;
            } else {
                state = null;
            }
            if (state == EnumC3920d.LOADING) {
                r18.m87150e0(820175145);
                AbstractC22290s.m64039c(r18, r15);
                r18.m87173q(r15);
            } else {
                r18.m87150e0(820210702);
                r18.m87173q(r15);
            }
            if (viewState.getActivationState().getIsFullScreenError()) {
                r18.m87150e0(820285288);
                i19 = i18;
                if (i19 == 16384) {
                    r10 = 1;
                } else {
                    r10 = r15;
                }
                objM87133R5 = r18.m87133R();
                if (r10 == 0) {
                    objM87133R5 = new C27314o(onViewEvent, 14);
                    r18.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C27314o(onViewEvent, 14);
                    r18.m87172p0(objM87133R5);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R5;
                if (i19 != 16384) {
                }
                objM87133R6 = r18.m87133R();
                if (r17 == 0) {
                    objM87133R6 = new C27314o(onViewEvent, 15);
                    r18.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C27314o(onViewEvent, 15);
                    r18.m87172p0(objM87133R6);
                }
                Function0.m64022b(interfaceC4339a2, (InterfaceC4339a) objM87133R6, r18, r15);
                r18.m87173q(r15);
            } else {
                if (viewState.getActivationState().getIsFullScreenLoading()) {
                    r18.m87150e0(820566923);
                    AbstractC22290s.m64039c(r18, r15);
                    AbstractC22289r.m64035b(r18, r15);
                    r18.m87173q(r15);
                } else {
                    bffScreenContainerState2 = viewState.getActivationState().getBffScreenContainerState();
                    if (bffScreenContainerState2 != null) {
                        listM43839h = bffScreenContainerState2.m43839h();
                    } else {
                        listM43839h = null;
                    }
                    if (listM43839h != null) {
                        r18.m87150e0(820739655);
                        C15566g bffScreenContainerState4 = viewState.getActivationState().getBffScreenContainerState();
                        ActivationFlowDestination activationFlowDestination2 = ActivationFlowDestination.ENTER_YOUR_PASSWORD;
                        zM87157i = r18.m87157i(saveCredentialOnAdvance) | r18.m87157i(context);
                        objM87133R4 = r18.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new c(saveCredentialOnAdvance, context, interfaceC28601c3, null);
                            r18.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new c(saveCredentialOnAdvance, context, interfaceC28601c3, null);
                            r18.m87172p0(objM87133R4);
                        }
                        int i27 = i16 >> 3;
                        ?? r112 = r18;
                        function5 = function4;
                        AbstractC30037i.m91955m(bffScreenContainerState4, activationFlowDestination2, null, onViewEvent, onNavigationEvent, null, function5, (Function3) objM87133R4, handleProgressButtonClick, r112, (i27 & 57344) | (i27 & 7168) | 48 | (i16 & 3670016) | (234881024 & (i16 << 3)), 36);
                        r112.m87173q(r15);
                        r16 = r112;
                    } else {
                        ?? r113 = r18;
                        function5 = function4;
                        r113.m87150e0(821644142);
                        r113.m87173q(r15);
                        r16 = r113;
                    }
                }
                function3 = function5;
                r14 = r16;
            }
            r16 = r18;
            function5 = function4;
            function3 = function5;
            r14 = r16;
        } else {
            ?? r114 = r18;
            r114.m87138X();
            r14 = r114;
        }
        c28677v1M87180u = r14.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2880b(viewState, credentialHelper, passwordManagerTracker, saveCredentialOnAdvance, function1, onNavigationEvent, function3, handleProgressButtonClick, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m8331f(InterfaceC17002b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m8332g(Function1 function1) {
        function1.invoke(InterfaceC21413a.r.f82134a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m8333h(C15565f c15565f, C14242a c14242a, C14245d c14245d, C14246e c14246e, Function1 function1, Function1 function2, Function1 function3, InterfaceC4356r interfaceC4356r, int i13, int i14, Composer composer, int i15) {
        m8330e(c15565f, c14242a, c14245d, c14246e, function1, function2, function3, interfaceC4356r, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final boolean m8334i(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final void m8335j(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final boolean m8336k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m8337l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m8338m(Function1 function1) {
        function1.invoke(InterfaceC21413a.r.f82134a);
        return C23454a0.f92919a;
    }
}
