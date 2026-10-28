package m01;

import a80.C0542f;
import a80.C0545i;
import android.content.Context;
import android.os.Build;
import android.os.Vibrator;
import android.os.VibratorManager;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b30.C2609r;
import b91.C2886a;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import i51.C18106c;
import i51.C18112i;
import i51.C18118o;
import i51.EnumC18105b;
import i51.EnumC18116m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import js2.C21927e;
import l72.C23401h;
import l72.C23407n;
import l80.C23434k;
import l83.C23454a0;
import lf0.C23956p1;
import live.hms.video.factories.C24148c;
import lt2.C24738a;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p181h2.C16617b;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: m01.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u0013\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001aM\u0010\u0015\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a+\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00172\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#¨\u0006(²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010&\u001a\u00020%8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u00020%8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Li51/o;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "p", "(Landroidx/compose/ui/Modifier;Li51/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lh2/b;", "onMediaPositioned", "I", "(Li51/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "Lm91/u;", "items", "Li51/m;", "alignment", "K", "(Ljava/util/List;Li51/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "C", "(Ljava/util/List;Li51/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Li51/c;", "y", "(Li51/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "M", "Ly2/y;", "coordinates", "R", "(Ly2/y;)J", "Landroid/content/Context;", "context", "Landroid/os/Vibrator;", "S", "(Landroid/content/Context;)Landroid/os/Vibrator;", "confettiOrigin", "", "triggerConfetti", "hasCapturedPosition", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24876d {

    /* JADX INFO: renamed from: m01.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.celebrationoverlay.CelebrationOverlayKt$CelebrationOverlay$2$1", m100430f = "CelebrationOverlay.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f97453w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Context f97454x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f97455y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f97456z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, boolean z4, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f97454x = context;
            this.f97455y = z4;
            this.f97456z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f97454x, this.f97455y, this.f97456z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f97453w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f97453w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            new C24873a(AbstractC24876d.m72923S(this.f97454x)).m72904a();
            if (this.f97455y) {
                AbstractC24876d.m72945v(this.f97456z, true);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: m01.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97457a;

        static {
            int[] iArr = new int[EnumC18116m.values().length];
            try {
                iArr[EnumC18116m.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC18116m.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC18116m.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f97457a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m72905A(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m72906B(C18106c c18106c, Function1 function1, int i13, Composer composer, int i14) {
        m72948y(c18106c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m72907C(List<? extends InterfaceC25312u> list, EnumC18116m enumC18116m, Function1 function1, Function1 function2, Composer composer, int i13) {
        Function1 function3;
        C2305k c2305k;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(511509489);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC18116m.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            function3 = function1;
            i14 |= c28655q.m87157i(function3) ? 256 : 128;
        } else {
            function3 = function1;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            char c3 = 3;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * 8);
            int i15 = b.f97457a[enumC18116m.ordinal()];
            if (i15 == 1) {
                c2305k = C2299e.f9110M;
            } else if (i15 == 2) {
                c2305k = C2299e.f9111N;
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c2305k = C2299e.f9112O;
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(1166752007);
            for (InterfaceC25312u interfaceC25312u : list) {
                AbstractC25303l.m74291r(interfaceC25312u, null, new C0542f((Object) interfaceC25312u, function2, (Object) interfaceC28601c1, 27), function3, c28655q, (i14 << 3) & 7168, 2);
                c3 = c3;
                function3 = function1;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23956p1(list, enumC18116m, function1, function2, i13);
        }
    }

    /* JADX INFO: renamed from: D */
    private static final boolean m72908D(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: E */
    private static final void m72909E(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Modifier m72910F(InterfaceC25312u interfaceC25312u, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC25312u it, Composer composer, int i13) {
        Modifier modifierM3394p;
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1789126777);
        boolean z4 = interfaceC25312u instanceof C18112i;
        C2314t c2314t = C2314t.f9131w;
        if (!z4 || m72908D(interfaceC28601c1)) {
            c28655q.m87150e0(-667986209);
            c28655q.m87173q(false);
            modifierM3394p = AbstractC1099a.m3394p(1 * 4, c2314t);
        } else {
            c28655q.m87150e0(-668237588);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2609r(function1, interfaceC28601c1, 20);
                c28655q.m87172p0(objM87133R);
            }
            modifierM3394p = AbstractC1131a.m3500d(c2314t, (Function1) objM87133R);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(false);
        return modifierM3394p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m72911G(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        m72909E(interfaceC28601c1, true);
        function1.invoke(new C16617b(m72922R(coordinates)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m72912H(List list, EnumC18116m enumC18116m, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m72907C(list, enumC18116m, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
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
    /* JADX INFO: renamed from: I */
    private static final void m72913I(C18118o c18118o, Function1 function1, Function1 function2, Composer composer, int i13) {
        int i14;
        Function1 function3;
        C28655q c28655q;
        boolean z4;
        C2305k c2305k;
        int i15;
        int i16;
        int i17;
        int i18;
        ?? r10;
        boolean z13;
        C28655q c28655q2;
        int i19;
        C28655q c28655q3;
        C28655q c28655q4;
        Float fValueOf = Float.valueOf(1.5f);
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(-520590339);
        if ((i13 & 6) == 0) {
            i14 = (c28655q5.m87157i(c18118o) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q5.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            function3 = function2;
            i14 |= c28655q5.m87157i(function3) ? 256 : 128;
        } else {
            function3 = function2;
        }
        if (c28655q5.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            float f14 = f13 * f13;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f14, f14);
            float f15 = 8;
            float f16 = 2 * f15;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f16);
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k2, c28655q5, 6);
            int iHashCode = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N);
            if (c18118o.m52019h().isEmpty()) {
                c28655q5.m87150e0(-308855409);
                c28655q5.m87173q(false);
            } else {
                c28655q5.m87150e0(-309034155);
                m72915K(c18118o.m52019h(), c18118o.getAlignment(), function1, c28655q5, (i14 << 3) & 896);
                c28655q5.m87173q(false);
            }
            if (c18118o.m52017f().isEmpty()) {
                z4 = false;
                c28655q5.m87150e0(-308527057);
                c28655q5.m87173q(false);
            } else {
                c28655q5.m87150e0(-308755775);
                m72907C(c18118o.m52017f(), c18118o.getAlignment(), function1, function3, c28655q5, (i14 << 3) & 8064);
                z4 = false;
                c28655q5.m87173q(false);
            }
            if (c18118o.getTitle() == null && c18118o.getSubtitle() == null) {
                c28655q5.m87150e0(-306097649);
                c28655q5.m87173q(z4);
                c28655q4 = c28655q5;
                z13 = true;
            } else {
                c28655q5.m87150e0(-308318520);
                float f17 = 1 * f15;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f17, 0.0f, f16, 5);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode2 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, modifierM3398t);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(interfaceC4339a);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N2);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f17);
                EnumC18116m enumC18116mM52012a = c18118o.getAlignment();
                int[] iArr = b.f97457a;
                int i24 = iArr[enumC18116mM52012a.ordinal()];
                if (i24 == 1) {
                    c2305k = c2305k2;
                } else if (i24 == 2) {
                    c2305k = C2299e.f9111N;
                } else {
                    if (i24 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c2305k = C2299e.f9112O;
                }
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k, c28655q5, 6);
                int iHashCode3 = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q5.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q5, modifierM3409f);
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(interfaceC4339a);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N3);
                TextResource textResourceM52018g = c18118o.getTitle();
                if (textResourceM52018g == null) {
                    c28655q5.m87150e0(335102730);
                    c28655q5.m87173q(false);
                    c28655q2 = c28655q5;
                    i18 = 3;
                    i15 = 2;
                    r10 = 0;
                    z13 = true;
                } else {
                    c28655q5.m87150e0(335102731);
                    String strM21274h = AbstractC8693b.m21274h(textResourceM52018g, c28655q5, 0);
                    C38072d c38072d = C38072d.f163053a;
                    C2886a c2886aM8417O = c38072d.m121952e(c28655q5, 6).getT2();
                    long jM125430y = c38072d.m121949b(c28655q5, 6).getBrandWhite();
                    int i25 = iArr[c18118o.getAlignment().ordinal()];
                    if (i25 != 1) {
                        i15 = 2;
                        if (i25 != 2) {
                            i16 = 3;
                            if (i25 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i17 = 6;
                        } else {
                            i16 = 3;
                            i17 = 3;
                        }
                    } else {
                        i15 = 2;
                        i16 = 3;
                        i17 = 5;
                    }
                    i18 = i16;
                    r10 = 0;
                    z13 = true;
                    AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, new C36775k(i17), 0L, 2, false, 2, 0, null, c2886aM8417O, fValueOf, c28655q5, 0, 12586032, 54778);
                    C28655q c28655q6 = c28655q5;
                    c28655q6.m87173q(false);
                    c28655q2 = c28655q6;
                }
                TextResource textResourceM52015d = c18118o.getSubtitle();
                if (textResourceM52015d == null) {
                    c28655q2.m87150e0(335954703);
                    c28655q2.m87173q(r10);
                    c28655q3 = c28655q2;
                } else {
                    c28655q2.m87150e0(335954704);
                    String strM21274h2 = AbstractC8693b.m21274h(textResourceM52015d, c28655q2, r10);
                    C38072d c38072d2 = C38072d.f163053a;
                    C2886a c2886aM8420a = c38072d2.m121952e(c28655q2, 6).getB1();
                    long jM125385c1 = c38072d2.m121949b(c28655q2, 6).getWhite70();
                    int i26 = iArr[c18118o.getAlignment().ordinal()];
                    if (i26 == z13) {
                        i19 = 5;
                    } else if (i26 == i15) {
                        i19 = i18;
                    } else {
                        if (i26 != i18) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i19 = 6;
                    }
                    C28655q c28655q7 = c28655q2;
                    AbstractC30795n.m94707h(strM21274h2, null, jM125385c1, 0L, null, null, null, 0L, null, new C36775k(i19), 0L, 0, false, 0, 0, null, c2886aM8420a, fValueOf, c28655q7, 0, 12582912, 65018);
                    C28655q c28655q8 = c28655q7;
                    c28655q8.m87173q(r10);
                    c28655q3 = c28655q8;
                }
                AbstractC25012a.m73392y(c28655q3, z13, z13, r10);
                c28655q4 = c28655q3;
            }
            c28655q4.m87173q(z13);
            c28655q = c28655q4;
        } else {
            C28655q c28655q9 = c28655q5;
            c28655q9.m87138X();
            c28655q = c28655q9;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(c18118o, function1, function2, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m72914J(C18118o c18118o, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m72913I(c18118o, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final void m72915K(List<? extends InterfaceC25312u> list, EnumC18116m enumC18116m, Function1 function1, Composer composer, int i13) {
        int i14;
        C2305k c2305k;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(234645192);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC18116m.ordinal()) ? 32 : 16;
        }
        Function1 function2 = function1;
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * 8);
            int i15 = b.f97457a[enumC18116m.ordinal()];
            if (i15 == 1) {
                c2305k = C2299e.f9110M;
            } else if (i15 == 2) {
                c2305k = C2299e.f9111N;
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c2305k = C2299e.f9112O;
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(1124588486);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function2, c28655q, (i14 << 3) & 7168, 6);
                function2 = function1;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(list, enumC18116m, function1, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m72916L(List list, EnumC18116m enumC18116m, Function1 function1, int i13, Composer composer, int i14) {
        m72915K(list, enumC18116m, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: M */
    private static final void m72917M(C18106c c18106c, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1750390070);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(c18106c) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 6 * f13, 7));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(734728000);
            for (InterfaceC25312u interfaceC25312u : c18106c.m51959a()) {
                boolean z4 = interfaceC25312u instanceof C27256h;
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z4) {
                    c28655q.m87150e0(849505413);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C27256h c27256h = (C27256h) interfaceC25312u;
                    boolean zM87157i = c28655q.m87157i(interfaceC25312u) | ((i15 & 112) == 32);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C0545i(function1, c27256h, 7);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27249e.m82121d(modifierM3409f2, c27256h, null, (InterfaceC4339a) objM87133R, c28655q, 6, 4);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(849809058);
                    boolean z13 = (i15 & 112) == 32;
                    Object objM87133R2 = c28655q.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C23434k(function1, 11);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R2, c28655q, 0, 6);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24874b(c18106c, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m72918N(Function1 function1, InterfaceC25312u interfaceC25312u) {
        function1.invoke(interfaceC25312u);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m72919O(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m72920P(C18106c c18106c, Function1 function1, int i13, Composer composer, int i14) {
        m72917M(c18106c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    public static final long m72922R(InterfaceC39147y coordinates) {
        AbstractC22676k.m65750j(coordinates, "coordinates");
        long jMo3523Z = coordinates.mo3523Z(0L);
        long jMo3541n = coordinates.mo3541n();
        float fIntBitsToFloat = (((int) (jMo3541n >> 32)) / 2.0f) + Float.intBitsToFloat((int) (jMo3523Z >> 32));
        return (((long) Float.floatToRawIntBits((((int) (jMo3541n & 4294967295L)) / 2.0f) + Float.intBitsToFloat((int) (jMo3523Z & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: S */
    public static final Vibrator m72923S(Context context) {
        AbstractC22676k.m65750j(context, "context");
        if (Build.VERSION.SDK_INT < 31) {
            Object systemService = context.getSystemService("vibrator");
            if (systemService instanceof Vibrator) {
                return (Vibrator) systemService;
            }
            return null;
        }
        Object systemService2 = context.getSystemService("vibrator_manager");
        VibratorManager vibratorManagerM71061g = C24148c.m71064j(systemService2) ? C24148c.m71061g(systemService2) : null;
        if (vibratorManagerM71061g != null) {
            return vibratorManagerM71061g.getDefaultVibrator();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0291  */
    /* JADX WARN: Code duplicated, block: B:102:0x0295  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:107:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:110:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:118:0x0308  */
    /* JADX WARN: Code duplicated, block: B:120:0x032c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0351  */
    /* JADX WARN: Code duplicated, block: B:125:0x0364  */
    /* JADX WARN: Code duplicated, block: B:128:0x036e  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ce A[LOOP:0: B:54:0x00c8->B:56:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0118  */
    /* JADX WARN: Code duplicated, block: B:65:0x0156  */
    /* JADX WARN: Code duplicated, block: B:66:0x015a  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0180  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0217  */
    /* JADX WARN: Code duplicated, block: B:90:0x021b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0228  */
    /* JADX WARN: Code duplicated, block: B:95:0x0236  */
    /* JADX WARN: Code duplicated, block: B:98:0x0242  */
    /* JADX INFO: renamed from: p */
    public static final void m72939p(Modifier modifier, C18118o viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        ArrayList arrayList;
        Iterator<T> it;
        InterfaceC28601c1 interfaceC28601c3;
        boolean zIsEmpty;
        boolean z13;
        Context context;
        boolean zM87157i;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c4;
        int iHashCode;
        C0213j c0213j;
        InterfaceC28601c1 interfaceC28601c5;
        C0209i c0209i;
        ArrayList arrayList2;
        int iHashCode2;
        int iHashCode3;
        Object objM87133R4;
        int i16;
        int iHashCode4;
        boolean z14;
        boolean z15;
        C16617b c16617bM72942s;
        Object objM87133R5;
        boolean z16;
        Object objM87133R6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(212748997);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C24875c(0);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function4 = (Function1) objM87133R6;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                c28655q.m87150e0(-1706633693);
                List<InterfaceC39332e> listM52016e = viewState.m52016e();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM52016e, 10));
                it = listM52016e.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C17919x(((InterfaceC39332e) it.next()).mo134584toComposableColorWaAFU9c(c28655q, 0)));
                    interfaceC28601c2 = interfaceC28601c2;
                }
                interfaceC28601c3 = interfaceC28601c2;
                c28655q.m87173q(false);
                zIsEmpty = viewState.m52016e().isEmpty();
                z13 = !zIsEmpty;
                context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
                Boolean boolValueOf = Boolean.valueOf(z13);
                zM87157i = c28655q.m87157i(context) | c28655q.m87155h(z13);
                objM87133R3 = c28655q.m87133R();
                if (!zM87157i || objM87133R3 == c28676v0) {
                    interfaceC28601c4 = interfaceC28601c3;
                    objM87133R3 = new a(context, z13, interfaceC28601c4, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    interfaceC28601c4 = interfaceC28601c3;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, boolValueOf);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC22953f.m66723l(modifier2));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                interfaceC28601c5 = interfaceC28601c4;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    arrayList2 = arrayList;
                } else {
                    arrayList2 = arrayList;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                    C22957g c22957g = AbstractC22977m.f90652c;
                    C2305k c2305k = C2299e.f9110M;
                    Modifier modifier3 = modifier2;
                    int i19 = i15;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k, c28655q, 6);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C21927e(12, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R4);
                    }
                    int i24 = i19 >> 3;
                    int i25 = (i24 & 14) | 384;
                    i16 = i24 & 112;
                    m72913I(viewState, function4, (Function1) objM87133R4, c28655q, i25 | i16);
                    c28655q.m87173q(true);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 5 * 4, 0.0f, 2);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                    if (viewState.getButtonSection().getConfiguration() == EnumC18105b.HORIZONTAL) {
                        c28655q.m87150e0(-216884177);
                        m72948y(viewState.getButtonSection(), function4, c28655q, i16);
                        z14 = false;
                        c28655q.m87173q(false);
                    } else {
                        z14 = false;
                        c28655q.m87150e0(-216682863);
                        m72917M(viewState.getButtonSection(), function4, c28655q, i16);
                        c28655q.m87173q(false);
                    }
                    z15 = true;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (zIsEmpty) {
                        z15 = true;
                        function4 = function4;
                        c28655q.m87150e0(-1902251593);
                        c28655q.m87173q(z14);
                    } else {
                        c28655q.m87150e0(1739743115);
                        c16617bM72942s = m72942s(interfaceC28601c1);
                        if (c16617bM72942s == null) {
                            c28655q.m87150e0(-1902538282);
                            c28655q.m87173q(z14);
                            z16 = z14;
                        } else {
                            c28655q.m87150e0(-1902538281);
                            long j7 = c16617bM72942s.f63937a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                            boolean zM72944u = m72944u(interfaceC28601c5);
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C24738a(5);
                                c28655q.m87172p0(objM87133R5);
                            }
                            z16 = z14;
                            AbstractC24879g.m72953d(null, fIntBitsToFloat, fIntBitsToFloat2, arrayList2, 0, zM72944u, (InterfaceC4339a) objM87133R5, c28655q, 1572864, 17);
                            c28655q.m87173q(z16);
                        }
                        c28655q.m87173q(z16);
                    }
                    c28655q.m87173q(z15);
                    function3 = function4;
                    modifier2 = modifier3;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t);
                C22957g c22957g2 = AbstractC22977m.f90652c;
                C2305k c2305k2 = C2299e.f9110M;
                Modifier modifier4 = modifier2;
                int i110 = i15;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3407d3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N5);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k2, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N6);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C21927e(12, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R4);
                }
                int i26 = i110 >> 3;
                int i27 = (i26 & 14) | 384;
                i16 = i26 & 112;
                m72913I(viewState, function4, (Function1) objM87133R4, c28655q, i27 | i16);
                c28655q.m87173q(true);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 5 * 4, 0.0f, 2);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 0);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m7);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N7);
                if (viewState.getButtonSection().getConfiguration() == EnumC18105b.HORIZONTAL) {
                    c28655q.m87150e0(-216884177);
                    m72948y(viewState.getButtonSection(), function4, c28655q, i16);
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    z14 = false;
                    c28655q.m87150e0(-216682863);
                    m72917M(viewState.getButtonSection(), function4, c28655q, i16);
                    c28655q.m87173q(false);
                }
                z15 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (zIsEmpty) {
                    c28655q.m87150e0(1739743115);
                    c16617bM72942s = m72942s(interfaceC28601c1);
                    if (c16617bM72942s == null) {
                        c28655q.m87150e0(-1902538282);
                        c28655q.m87173q(z14);
                        z16 = z14;
                    } else {
                        c28655q.m87150e0(-1902538281);
                        long j13 = c16617bM72942s.f63937a;
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j13 >> 32));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j13 & 4294967295L));
                        boolean zM72944u2 = m72944u(interfaceC28601c5);
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C24738a(5);
                            c28655q.m87172p0(objM87133R5);
                        }
                        z16 = z14;
                        AbstractC24879g.m72953d(null, fIntBitsToFloat3, fIntBitsToFloat4, arrayList2, 0, zM72944u2, (InterfaceC4339a) objM87133R5, c28655q, 1572864, 17);
                        c28655q.m87173q(z16);
                    }
                    c28655q.m87173q(z16);
                } else {
                    z15 = true;
                    function4 = function4;
                    c28655q.m87150e0(-1902251593);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z15);
                function3 = function4;
                modifier2 = modifier4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 26, (Object) modifier2, (Object) viewState, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C24875c(0);
                    c28655q.m87172p0(objM87133R6);
                }
                function4 = (Function1) objM87133R6;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            c28655q.m87150e0(-1706633693);
            List<InterfaceC39332e> listM52016e2 = viewState.m52016e();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM52016e2, 10));
            it = listM52016e2.iterator();
            while (it.hasNext()) {
                arrayList.add(new C17919x(((InterfaceC39332e) it.next()).mo134584toComposableColorWaAFU9c(c28655q, 0)));
                interfaceC28601c2 = interfaceC28601c2;
            }
            interfaceC28601c3 = interfaceC28601c2;
            c28655q.m87173q(false);
            zIsEmpty = viewState.m52016e().isEmpty();
            z13 = !zIsEmpty;
            context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Boolean boolValueOf2 = Boolean.valueOf(z13);
            zM87157i = c28655q.m87157i(context) | c28655q.m87155h(z13);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                interfaceC28601c4 = interfaceC28601c3;
                objM87133R3 = new a(context, z13, interfaceC28601c4, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                interfaceC28601c4 = interfaceC28601c3;
                objM87133R3 = new a(context, z13, interfaceC28601c4, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, boolValueOf2);
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, AbstractC22953f.m66723l(modifier2));
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            interfaceC28601c5 = interfaceC28601c4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC39127r0M66763d2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                arrayList2 = arrayList;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N8);
                Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, c2314t);
                C22957g c22957g3 = AbstractC22977m.f90652c;
                C2305k c2305k3 = C2299e.f9110M;
                Modifier modifier5 = modifier2;
                int i111 = i15;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3407d5);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N9);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM92116f2 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k3, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM92116f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m10);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N10);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C21927e(12, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R4);
                }
                int i28 = i111 >> 3;
                int i29 = (i28 & 14) | 384;
                i16 = i28 & 112;
                m72913I(viewState, function4, (Function1) objM87133R4, c28655q, i29 | i16);
                c28655q.m87173q(true);
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 5 * 4, 0.0f, 2);
                C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k3, c28655q, 0);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a9);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N11);
                if (viewState.getButtonSection().getConfiguration() == EnumC18105b.HORIZONTAL) {
                    c28655q.m87150e0(-216884177);
                    m72948y(viewState.getButtonSection(), function4, c28655q, i16);
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    z14 = false;
                    c28655q.m87150e0(-216682863);
                    m72917M(viewState.getButtonSection(), function4, c28655q, i16);
                    c28655q.m87173q(false);
                }
                z15 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (zIsEmpty) {
                    c28655q.m87150e0(1739743115);
                    c16617bM72942s = m72942s(interfaceC28601c1);
                    if (c16617bM72942s == null) {
                        c28655q.m87150e0(-1902538282);
                        c28655q.m87173q(z14);
                        z16 = z14;
                    } else {
                        c28655q.m87150e0(-1902538281);
                        long j14 = c16617bM72942s.f63937a;
                        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (j14 >> 32));
                        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (j14 & 4294967295L));
                        boolean zM72944u3 = m72944u(interfaceC28601c5);
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C24738a(5);
                            c28655q.m87172p0(objM87133R5);
                        }
                        z16 = z14;
                        AbstractC24879g.m72953d(null, fIntBitsToFloat5, fIntBitsToFloat6, arrayList2, 0, zM72944u3, (InterfaceC4339a) objM87133R5, c28655q, 1572864, 17);
                        c28655q.m87173q(z16);
                    }
                    c28655q.m87173q(z16);
                } else {
                    z15 = true;
                    function4 = function4;
                    c28655q.m87150e0(-1902251593);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(z15);
                function3 = function4;
                modifier2 = modifier5;
            } else {
                arrayList2 = arrayList;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N8);
            Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, c2314t);
            C22957g c22957g4 = AbstractC22977m.f90652c;
            C2305k c2305k4 = C2299e.f9110M;
            Modifier modifier6 = modifier2;
            int i112 = i15;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3407d6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a10);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N12);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM92116f3 = AbstractC30060g.m92116f0(AbstractC38963t7.m124374d(1.0f, 1.0f, true), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k4, c28655q, 6);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM92116f3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a11);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m13);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N13);
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C21927e(12, interfaceC28601c1);
                c28655q.m87172p0(objM87133R4);
            }
            int i210 = i112 >> 3;
            int i211 = (i210 & 14) | 384;
            i16 = i210 & 112;
            m72913I(viewState, function4, (Function1) objM87133R4, c28655q, i211 | i16);
            c28655q.m87173q(true);
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 5 * 4, 0.0f, 2);
            C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k4, c28655q, 0);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a12);
            AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m14);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N14);
            if (viewState.getButtonSection().getConfiguration() == EnumC18105b.HORIZONTAL) {
                c28655q.m87150e0(-216884177);
                m72948y(viewState.getButtonSection(), function4, c28655q, i16);
                z14 = false;
                c28655q.m87173q(false);
            } else {
                z14 = false;
                c28655q.m87150e0(-216682863);
                m72917M(viewState.getButtonSection(), function4, c28655q, i16);
                c28655q.m87173q(false);
            }
            z15 = true;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (zIsEmpty) {
                c28655q.m87150e0(1739743115);
                c16617bM72942s = m72942s(interfaceC28601c1);
                if (c16617bM72942s == null) {
                    c28655q.m87150e0(-1902538282);
                    c28655q.m87173q(z14);
                    z16 = z14;
                } else {
                    c28655q.m87150e0(-1902538281);
                    long j15 = c16617bM72942s.f63937a;
                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (j15 >> 32));
                    float fIntBitsToFloat8 = Float.intBitsToFloat((int) (j15 & 4294967295L));
                    boolean zM72944u4 = m72944u(interfaceC28601c5);
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C24738a(5);
                        c28655q.m87172p0(objM87133R5);
                    }
                    z16 = z14;
                    AbstractC24879g.m72953d(null, fIntBitsToFloat7, fIntBitsToFloat8, arrayList2, 0, zM72944u4, (InterfaceC4339a) objM87133R5, c28655q, 1572864, 17);
                    c28655q.m87173q(z16);
                }
                c28655q.m87173q(z16);
            } else {
                z15 = true;
                function4 = function4;
                c28655q.m87150e0(-1902251593);
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(z15);
            function3 = function4;
            modifier2 = modifier6;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 26, (Object) modifier2, (Object) viewState, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m72940q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m72941r(Modifier modifier, C18118o c18118o, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m72939p(modifier, c18118o, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final C16617b m72942s(InterfaceC28601c1 interfaceC28601c1) {
        return (C16617b) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: t */
    private static final void m72943t(InterfaceC28601c1 interfaceC28601c1, C16617b c16617b) {
        interfaceC28601c1.setValue(c16617b);
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m72944u(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final void m72945v(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m72946w(InterfaceC28601c1 interfaceC28601c1, C16617b c16617b) {
        m72943t(interfaceC28601c1, c16617b);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m72947x() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m72948y(C18106c c18106c, Function1 function1, Composer composer, int i13) {
        int i14;
        C2314t c2314t;
        float f13;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1142351012);
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(c18106c) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i16 = i15;
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            List<InterfaceC25312u> listM51959a = c18106c.m51959a();
            ArrayList<C27256h> arrayList = new ArrayList();
            for (Object obj : listM51959a) {
                if (obj instanceof C27256h) {
                    arrayList.add(obj);
                }
            }
            List<InterfaceC25312u> listM51959a2 = c18106c.m51959a();
            ArrayList<InterfaceC25312u> arrayList2 = new ArrayList();
            for (Object obj2 : listM51959a2) {
                if (!(((InterfaceC25312u) obj2) instanceof C27256h)) {
                    arrayList2.add(obj2);
                }
            }
            float f14 = 8;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, 6 * f14, 7));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f14), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            boolean zIsEmpty = arrayList.isEmpty();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zIsEmpty) {
                i14 = 3;
                c2314t = c2314t2;
                f13 = 1.0f;
                c28655q.m87150e0(487031312);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(486482581);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(3 * 4), C2299e.f9108K, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c28655q.m87150e0(773703290);
                for (C27256h c27256h : arrayList) {
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    boolean zM87157i = ((i16 & 112) == 32) | c28655q.m87157i(c27256h);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C0545i(function1, c27256h, 8);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27249e.m82121d(layoutWeightElement, c27256h, null, (InterfaceC4339a) objM87133R, c28655q, 0, 4);
                }
                c2314t = c2314t2;
                i14 = 3;
                f13 = 1.0f;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            }
            if (arrayList2.isEmpty()) {
                z4 = true;
                c28655q.m87150e0(487579888);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(487085934);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(f13, c2314t);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(i14 * 4), C2299e.f9111N, c28655q, 54);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                C0209i c0209i5 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                c28655q.m87150e0(435590566);
                for (InterfaceC25312u interfaceC25312u : arrayList2) {
                    boolean z13 = (i16 & 112) == 32;
                    Object objM87133R2 = c28655q.m87133R();
                    if (z13 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C23434k(function1, 12);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R2, c28655q, 0, 6);
                }
                z4 = true;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24874b(c18106c, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m72949z(Function1 function1, C27256h c27256h) {
        function1.invoke(c27256h);
        return C23454a0.f92919a;
    }
}
