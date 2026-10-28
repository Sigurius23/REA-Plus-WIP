package cp0;

import am2.C1008b;
import android.content.Context;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import l83.C23454a0;
import p000.AbstractC11266d;
import p179h.AbstractC16349g;
import p179h.C16351i;
import p294l3.C23254g;
import p390p1.AbstractC28683x;
import p390p1.C28617g1;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p390p1.InterfaceC28690z0;
import p412q3.C29891y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.EnumC32692x1;
import q83.InterfaceC30057d;
import ql0.AbstractC30467b;
import ql0.C30469d;
import ql0.InterfaceC30468c;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: cp0.a0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a}\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001e²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u001a\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00068\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u00068\nX\u008a\u0084\u0002"}, m65681d2 = {"", "conversationKey", "Lql0/c;", "speechRecognitionManager", "Lcp0/w;", "voiceLaunchRequest", "Lkotlin/Function1;", "", "Ll83/a0;", "onVoiceLaunchConsumed", "Lq3/y;", "draftInput", "onDraftInputChanged", "Lkotlin/Function0;", "", "canSendVoiceResult", "sendVoiceResult", "Lcp0/x;", "l", "(Ljava/lang/String;Lql0/c;Lcp0/w;Lkotlin/jvm/functions/Function1;Lq3/y;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcp0/x;", "Ltr2/n;", "a", "Ltr2/n;", "coachDrawerVoiceLogger", "ownedSpeechRecognitionManager", "autoSendAfterPermission", "currentDraftInput", "currentOnDraftInputChanged", "currentCanSendVoiceResult", "currentSendVoiceResult", "coach-everywhere_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10942a0 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f33837a = InterfaceC34116n.INSTANCE.m107848a("CoachDrawerVoice");

    /* JADX INFO: renamed from: cp0.a0$a */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachDrawerVoiceSessionKt$rememberCoachDrawerVoiceSession$2$1", m100430f = "CoachDrawerVoiceSession.kt", m100431l = {155}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C11006w f33838E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Function1 f33839F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f33840G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C16351i f33841H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC30468c f33842I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ Context f33843J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ InterfaceC28601c1 f33844K;

        /* JADX INFO: renamed from: L */
        final /* synthetic */ InterfaceC28601c1 f33845L;

        /* JADX INFO: renamed from: M */
        final /* synthetic */ InterfaceC28670t2 f33846M;

        /* JADX INFO: renamed from: N */
        final /* synthetic */ InterfaceC28670t2 f33847N;

        /* JADX INFO: renamed from: O */
        final /* synthetic */ InterfaceC28670t2 f33848O;

        /* JADX INFO: renamed from: P */
        final /* synthetic */ InterfaceC28690z0 f33849P;

        /* JADX INFO: renamed from: w */
        Object f33850w;

        /* JADX INFO: renamed from: x */
        Object f33851x;

        /* JADX INFO: renamed from: y */
        int f33852y;

        /* JADX INFO: renamed from: z */
        int f33853z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C11006w c11006w, Function1 function1, InterfaceC28601c1 interfaceC28601c1, C16351i c16351i, InterfaceC30468c interfaceC30468c, Context context, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28690z0 interfaceC28690z0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33838E = c11006w;
            this.f33839F = function1;
            this.f33840G = interfaceC28601c1;
            this.f33841H = c16351i;
            this.f33842I = interfaceC30468c;
            this.f33843J = context;
            this.f33844K = interfaceC28601c2;
            this.f33845L = interfaceC28601c3;
            this.f33846M = interfaceC28670t2;
            this.f33847N = interfaceC28670t3;
            this.f33848O = interfaceC28670t4;
            this.f33849P = interfaceC28690z0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f33838E, this.f33839F, this.f33840G, this.f33841H, this.f33842I, this.f33843J, this.f33844K, this.f33845L, this.f33846M, this.f33847N, this.f33848O, this.f33849P, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C11006w c11006w;
            Function1 function1;
            C11006w c11006w2;
            Function1 function2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33853z;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                c11006w = this.f33838E;
                if (c11006w != null) {
                    function1 = this.f33839F;
                    InterfaceC28601c1 interfaceC28601c1 = this.f33840G;
                    C16351i c16351i = this.f33841H;
                    InterfaceC30468c interfaceC30468c = this.f33842I;
                    Context context = this.f33843J;
                    InterfaceC28601c1 interfaceC28601c2 = this.f33844K;
                    InterfaceC28601c1 interfaceC28601c3 = this.f33845L;
                    InterfaceC28670t2 interfaceC28670t2 = this.f33846M;
                    InterfaceC28670t2 interfaceC28670t3 = this.f33847N;
                    InterfaceC28670t2 interfaceC28670t4 = this.f33848O;
                    InterfaceC28690z0 interfaceC28690z0 = this.f33849P;
                    if (c11006w.getAutoLaunch() == EnumC32692x1.VOICE) {
                        this.f33850w = function1;
                        this.f33851x = c11006w;
                        this.f33852y = 0;
                        this.f33853z = 1;
                        if (AbstractC10942a0.m29007m(interfaceC28601c1, c16351i, interfaceC30468c, context, interfaceC28601c2, interfaceC28601c3, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28690z0, true, this) == enumC31071a) {
                            return enumC31071a;
                        }
                        c11006w2 = c11006w;
                        function2 = function1;
                    }
                    function1.invoke(new Integer(c11006w.getId()));
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11006w2 = (C11006w) this.f33851x;
            function2 = (Function1) this.f33850w;
            AbstractC34132o.m107864I(obj);
            c11006w = c11006w2;
            function1 = function2;
            function1.invoke(new Integer(c11006w.getId()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: cp0.a0$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"cp0/a0$b", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC30468c f33854a;

        public b(InterfaceC30468c interfaceC30468c) {
            this.f33854a = interfaceC30468c;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            InterfaceC30468c interfaceC30468c = this.f33854a;
            if (interfaceC30468c != null) {
                interfaceC30468c.mo93228a();
            }
        }
    }

    /* JADX INFO: renamed from: cp0.a0$c */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachDrawerVoiceSessionKt$rememberCoachDrawerVoiceSession$permissionLauncher$1$1$1", m100430f = "CoachDrawerVoiceSession.kt", m100431l = {123}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f33855E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f33856F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28670t2 f33857G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28670t2 f33858H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC28670t2 f33859I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ InterfaceC28690z0 f33860J;

        /* JADX INFO: renamed from: w */
        int f33861w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC30468c f33862x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Context f33863y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f33864z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30468c interfaceC30468c, Context context, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28690z0 interfaceC28690z0, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f33862x = interfaceC30468c;
            this.f33863y = context;
            this.f33864z = interfaceC28601c1;
            this.f33855E = interfaceC28601c2;
            this.f33856F = interfaceC28601c3;
            this.f33857G = interfaceC28670t2;
            this.f33858H = interfaceC28670t3;
            this.f33859I = interfaceC28670t4;
            this.f33860J = interfaceC28690z0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f33862x, this.f33863y, this.f33864z, this.f33855E, this.f33856F, this.f33857G, this.f33858H, this.f33859I, this.f33860J, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33861w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC28601c1 interfaceC28601c1 = this.f33856F;
                InterfaceC28670t2 interfaceC28670t2 = this.f33857G;
                InterfaceC28670t2 interfaceC28670t3 = this.f33858H;
                InterfaceC28670t2 interfaceC28670t4 = this.f33859I;
                InterfaceC28690z0 interfaceC28690z0 = this.f33860J;
                InterfaceC30468c interfaceC30468cM29008n = AbstractC10942a0.m29008n(this.f33862x, this.f33863y, this.f33864z);
                boolean zM29017w = AbstractC10942a0.m29017w(this.f33855E);
                this.f33861w = 1;
                if (AbstractC10942a0.m29020z(interfaceC28601c1, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28690z0, interfaceC30468cM29008n, zM29017w, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: cp0.a0$d */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.view.composables.CoachDrawerVoiceSessionKt", m100430f = "CoachDrawerVoiceSession.kt", m100431l = {91}, m100432m = "rememberCoachDrawerVoiceSession$startListening", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f33865E;

        /* JADX INFO: renamed from: F */
        Object f33866F;

        /* JADX INFO: renamed from: G */
        boolean f33867G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f33868H;

        /* JADX INFO: renamed from: I */
        int f33869I;

        /* JADX INFO: renamed from: w */
        Object f33870w;

        /* JADX INFO: renamed from: x */
        Object f33871x;

        /* JADX INFO: renamed from: y */
        Object f33872y;

        /* JADX INFO: renamed from: z */
        Object f33873z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f33868H = obj;
            this.f33869I |= Integer.MIN_VALUE;
            return AbstractC10942a0.m29020z(null, null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m28991A(InterfaceC28601c1 interfaceC28601c1, boolean z4, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, C29891y result) {
        AbstractC22676k.m65750j(result, "result");
        C23254g c23254g = result.f122125a;
        m29010p(interfaceC28670t2).invoke(result);
        interfaceC28601c1.setValue(Boolean.FALSE);
        if (z4 && !AbstractC39414r.m125890i0(c23254g.f92135x) && ((Boolean) m29011q(interfaceC28670t3).invoke()).booleanValue()) {
            m29012r(interfaceC28670t4).invoke(c23254g.f92135x);
            m29010p(interfaceC28670t2).invoke(new C29891y(7, (String) null, 0L));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m28992B(InterfaceC28670t2 interfaceC28670t2, C29891y partial) {
        AbstractC22676k.m65750j(partial, "partial");
        m29010p(interfaceC28670t2).invoke(partial);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m28993C(InterfaceC28601c1 interfaceC28601c1, AbstractC30467b error) {
        AbstractC22676k.m65750j(error, "error");
        f33837a.mo85228t("Speech recognition error: " + error, new AbstractC30556a.a[0]);
        interfaceC28601c1.setValue(Boolean.FALSE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m28994D(InterfaceC28690z0 interfaceC28690z0, float f13) {
        ((C28617g1) interfaceC28690z0).m87023y(f13);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0251  */
    /* JADX WARN: Code duplicated, block: B:105:0x025a  */
    /* JADX WARN: Code duplicated, block: B:106:0x025d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0265 A[PHI: r12 r19
      0x0265: PHI (r12v30 kotlin.jvm.functions.Function1) = (r12v25 kotlin.jvm.functions.Function1), (r12v31 kotlin.jvm.functions.Function1) binds: [B:108:0x0263, B:105:0x025a] A[DONT_GENERATE, DONT_INLINE]
      0x0265: PHI (r19v4 p1.c1) = (r19v2 p1.c1), (r19v6 p1.c1) binds: [B:108:0x0263, B:105:0x025a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:110:0x0268  */
    /* JADX WARN: Code duplicated, block: B:113:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x0283  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:129:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100 A[PHI: r17
      0x0100: PHI (r17v2 int) = (r17v0 int), (r17v4 int) binds: [B:63:0x00fe, B:61:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0103  */
    /* JADX WARN: Code duplicated, block: B:68:0x010a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x010c  */
    /* JADX WARN: Code duplicated, block: B:72:0x012e  */
    /* JADX WARN: Code duplicated, block: B:74:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x018d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:82:0x01db  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:92:0x0202  */
    /* JADX WARN: Code duplicated, block: B:95:0x020b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0211  */
    /* JADX WARN: Code duplicated, block: B:99:0x0214  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX INFO: renamed from: l */
    public static final C11008x m29006l(String conversationKey, InterfaceC30468c interfaceC30468c, C11006w c11006w, Function1 onVoiceLaunchConsumed, C29891y draftInput, Function1 onDraftInputChanged, InterfaceC4339a canSendVoiceResult, Function1 sendVoiceResult, Composer composer, int i13) {
        InterfaceC28601c1 interfaceC28601c1;
        boolean z4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c2;
        boolean z13;
        Object objM87133R2;
        InterfaceC28690z0 interfaceC28690z0;
        int i14;
        boolean z14;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        InterfaceC28601c1 interfaceC28601c1M87238F2;
        InterfaceC28601c1 interfaceC28601c1M87238F3;
        InterfaceC28601c1 interfaceC28601c1M87238F4;
        InterfaceC28601c1 interfaceC28601c4;
        InterfaceC28601c1 interfaceC28601c5;
        InterfaceC28601c1 interfaceC28601c6;
        InterfaceC28601c1 interfaceC28601c7;
        InterfaceC28601c1 interfaceC28601c8;
        C16351i c16351i;
        boolean zM87157i;
        Object objM87133R4;
        Object obj;
        boolean z15;
        Function1 function1;
        InterfaceC28601c1 interfaceC28601c9;
        boolean z16;
        boolean z17;
        Object aVar;
        boolean z18;
        InterfaceC28601c1 interfaceC28601c10;
        InterfaceC28601c1 interfaceC28601c11;
        InterfaceC28601c1 interfaceC28601c12;
        C28655q c28655q;
        Object obj2;
        boolean zM87153g;
        Object objM87133R5;
        Object obj3;
        boolean zM87153g2;
        Object objM87133R6;
        ?? r14;
        InterfaceC13037f2 interfaceC13037f2Mo93229b;
        InterfaceC30468c interfaceC30468c2 = interfaceC30468c;
        AbstractC22676k.m65750j(conversationKey, "conversationKey");
        AbstractC22676k.m65750j(onVoiceLaunchConsumed, "onVoiceLaunchConsumed");
        AbstractC22676k.m65750j(draftInput, "draftInput");
        AbstractC22676k.m65750j(onDraftInputChanged, "onDraftInputChanged");
        AbstractC22676k.m65750j(canSendVoiceResult, "canSendVoiceResult");
        AbstractC22676k.m65750j(sendVoiceResult, "sendVoiceResult");
        C28655q c28655q2 = (C28655q) composer;
        Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        Object objM87133R7 = c28655q2.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R7 == c28676v0) {
            objM87133R7 = AbstractC28683x.m87262p(c28655q2);
            c28655q2.m87172p0(objM87133R7);
        }
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R7;
        int i15 = (i13 & 14) ^ 6;
        boolean z19 = true;
        boolean z24 = (i15 > 4 && c28655q2.m87153g(conversationKey)) || (i13 & 6) == 4;
        Object objM87133R8 = c28655q2.m87133R();
        if (z24 || objM87133R8 == c28676v0) {
            objM87133R8 = AbstractC28683x.m87272z(null);
            c28655q2.m87172p0(objM87133R8);
        }
        InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) objM87133R8;
        InterfaceC30468c interfaceC30468cM29009o = interfaceC30468c2 == null ? m29009o(interfaceC28601c13) : interfaceC30468c2;
        Object objM87133R9 = c28655q2.m87133R();
        if (objM87133R9 == c28676v0) {
            objM87133R9 = AbstractC13091v.m36593c(Boolean.FALSE);
            c28655q2.m87172p0(objM87133R9);
        }
        InterfaceC13037f2 interfaceC13037f2 = (InterfaceC13075p1) objM87133R9;
        if (interfaceC30468cM29009o != null && (interfaceC13037f2Mo93229b = interfaceC30468cM29009o.getIsListening()) != null) {
            interfaceC13037f2 = interfaceC13037f2Mo93229b;
        }
        InterfaceC28601c1 interfaceC28601c1M87261o = AbstractC28683x.m87261o(interfaceC13037f2, c28655q2, 0);
        if (i15 <= 4 || !c28655q2.m87153g(conversationKey)) {
            interfaceC28601c1 = interfaceC28601c1M87261o;
            if ((i13 & 6) != 4) {
                z4 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            z13 = (i15 <= 4 && c28655q2.m87153g(conversationKey)) || (i13 & 6) == 4;
            objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30468v(0.0f, c28655q2);
            }
            interfaceC28690z0 = (InterfaceC28690z0) objM87133R2;
            if (i15 > 4 || !c28655q2.m87153g(conversationKey)) {
                i14 = i15;
                if ((i13 & 6) != 4) {
                    z14 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z14 || objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(draftInput, c28655q2);
                interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(onDraftInputChanged, c28655q2);
                interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(canSendVoiceResult, c28655q2);
                interfaceC28601c1M87238F4 = AbstractC28683x.m87238F(sendVoiceResult, c28655q2);
                if (AbstractC16349g.m46560a(c28655q2) != null) {
                    c28655q2.m87150e0(1455133808);
                    ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
                    zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28690z0) | c28655q2.m87157i(interfaceC30468c2) | c28655q2.m87153g(interfaceC28601c13) | c28655q2.m87157i(context) | c28655q2.m87153g(interfaceC28601c3);
                    objM87133R6 = c28655q2.m87133R();
                    if (!zM87153g2 || objM87133R6 == c28676v0) {
                        r14 = 0;
                        interfaceC28601c7 = interfaceC28601c2;
                        objM87133R6 = new C11010y(interfaceC28601c7, interfaceC2994c0, interfaceC30468c2, context, interfaceC28601c13, interfaceC28601c3, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4, interfaceC28690z0);
                        interfaceC30468c2 = interfaceC30468c2;
                        interfaceC28601c6 = interfaceC28601c1M87238F4;
                        interfaceC28601c8 = interfaceC28601c1M87238F2;
                        interfaceC28601c5 = interfaceC28601c13;
                        interfaceC28601c4 = interfaceC28601c1M87238F3;
                        interfaceC28601c3 = interfaceC28601c3;
                        context = context;
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        interfaceC28601c5 = interfaceC28601c13;
                        interfaceC28601c6 = interfaceC28601c1M87238F4;
                        r14 = 0;
                        interfaceC28601c8 = interfaceC28601c1M87238F2;
                        interfaceC28601c4 = interfaceC28601c1M87238F3;
                        interfaceC28601c7 = interfaceC28601c2;
                    }
                    C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission, (Function1) objM87133R6, c28655q2, r14);
                    c28655q2.m87173q(r14);
                    c16351i = c16351iM118972a0;
                } else {
                    interfaceC28601c4 = interfaceC28601c1M87238F3;
                    c28676v0 = c28676v0;
                    interfaceC28601c5 = interfaceC28601c13;
                    interfaceC28601c6 = interfaceC28601c1M87238F4;
                    interfaceC28601c7 = interfaceC28601c2;
                    interfaceC30468cM29009o = interfaceC30468cM29009o;
                    interfaceC28601c1 = interfaceC28601c1;
                    interfaceC28601c8 = interfaceC28601c1M87238F2;
                    c28655q2.m87150e0(1455599738);
                    c28655q2.m87173q(false);
                    c16351i = null;
                }
                zM87157i = c28655q2.m87157i(interfaceC30468cM29009o);
                objM87133R4 = c28655q2.m87133R();
                if (!zM87157i) {
                    obj = c28676v0;
                    if (objM87133R4 == obj) {
                    }
                    AbstractC28683x.m87251e(interfaceC30468cM29009o, (Function1) objM87133R4, c28655q2);
                    Integer numValueOf = c11006w != null ? Integer.valueOf(c11006w.getId()) : null;
                    if (((i13 & 896) ^ 384) <= 256 && c28655q2.m87153g(c11006w)) {
                        z15 = true;
                    } else if ((i13 & 384) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean zM87157i2 = z15 | c28655q2.m87157i(interfaceC30468c2) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87157i(context) | c28655q2.m87153g(interfaceC28601c7) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c8) | c28655q2.m87153g(interfaceC28601c4) | c28655q2.m87153g(interfaceC28601c6) | c28655q2.m87153g(interfaceC28690z0);
                    if (((i13 & 7168) ^ 3072) > 2048) {
                        function1 = onVoiceLaunchConsumed;
                        if (!c28655q2.m87153g(function1)) {
                            interfaceC28601c9 = interfaceC28601c7;
                        }
                        z16 = true;
                        z17 = zM87157i2 | z16;
                        Object objM87133R10 = c28655q2.m87133R();
                        if (!z17 || objM87133R10 == obj) {
                            C28655q c28655q3 = c28655q2;
                            z18 = false;
                            InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c4;
                            Function1 function2 = function1;
                            interfaceC28601c10 = interfaceC28601c6;
                            InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c9;
                            aVar = new a(c11006w, function2, interfaceC28601c15, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c14, interfaceC28601c10, interfaceC28690z0, null);
                            interfaceC28601c11 = interfaceC28601c15;
                            interfaceC28601c12 = interfaceC28601c14;
                            interfaceC28690z0 = interfaceC28690z0;
                            c28655q3.m87172p0(aVar);
                            c28655q = c28655q3;
                        } else {
                            aVar = objM87133R10;
                            interfaceC28601c12 = interfaceC28601c4;
                            interfaceC28601c10 = interfaceC28601c6;
                            c28655q = c28655q2;
                            interfaceC28601c11 = interfaceC28601c9;
                            z18 = false;
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
                        if ((i14 > 4 || !c28655q.m87153g(conversationKey)) && (i13 & 6) != 4) {
                        }
                        obj2 = interfaceC30468cM29009o;
                        zM87153g = z19 | c28655q.m87153g(obj2);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g || objM87133R5 == obj3) {
                            obj3 = obj;
                            objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                            c28655q.m87172p0(objM87133R5);
                        }
                        obj3 = obj;
                        return (C11008x) objM87133R5;
                    }
                    function1 = onVoiceLaunchConsumed;
                    interfaceC28601c9 = interfaceC28601c7;
                    if ((i13 & 3072) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = zM87157i2 | z16;
                    Object objM87133R11 = c28655q2.m87133R();
                    if (z17) {
                        C28655q c28655q4 = c28655q2;
                        z18 = false;
                        InterfaceC28601c1 interfaceC28601c16 = interfaceC28601c4;
                        Function1 function3 = function1;
                        interfaceC28601c10 = interfaceC28601c6;
                        InterfaceC28601c1 interfaceC28601c17 = interfaceC28601c9;
                        aVar = new a(c11006w, function3, interfaceC28601c17, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c16, interfaceC28601c10, interfaceC28690z0, null);
                        interfaceC28601c11 = interfaceC28601c17;
                        interfaceC28601c12 = interfaceC28601c16;
                        interfaceC28690z0 = interfaceC28690z0;
                        c28655q4.m87172p0(aVar);
                        c28655q = c28655q4;
                    } else {
                        C28655q c28655q5 = c28655q2;
                        z18 = false;
                        InterfaceC28601c1 interfaceC28601c18 = interfaceC28601c4;
                        Function1 function4 = function1;
                        interfaceC28601c10 = interfaceC28601c6;
                        InterfaceC28601c1 interfaceC28601c19 = interfaceC28601c9;
                        aVar = new a(c11006w, function4, interfaceC28601c19, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c18, interfaceC28601c10, interfaceC28690z0, null);
                        interfaceC28601c11 = interfaceC28601c19;
                        interfaceC28601c12 = interfaceC28601c18;
                        interfaceC28690z0 = interfaceC28690z0;
                        c28655q5.m87172p0(aVar);
                        c28655q = c28655q5;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
                    z19 = i14 > 4 ? z18 : z18;
                    obj2 = interfaceC30468cM29009o;
                    zM87153g = z19 | c28655q.m87153g(obj2);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g) {
                        obj3 = obj;
                        objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        obj3 = obj;
                        objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                        c28655q.m87172p0(objM87133R5);
                    }
                    obj3 = obj;
                    return (C11008x) objM87133R5;
                }
                obj = c28676v0;
                objM87133R4 = new C11007w0(interfaceC30468cM29009o, 2);
                c28655q2.m87172p0(objM87133R4);
                AbstractC28683x.m87251e(interfaceC30468cM29009o, (Function1) objM87133R4, c28655q2);
                if (c11006w != null) {
                }
                if (((i13 & 896) ^ 384) <= 256) {
                }
                if ((i13 & 384) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM87157i3 = z15 | c28655q2.m87157i(interfaceC30468c2) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87157i(context) | c28655q2.m87153g(interfaceC28601c7) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c8) | c28655q2.m87153g(interfaceC28601c4) | c28655q2.m87153g(interfaceC28601c6) | c28655q2.m87153g(interfaceC28690z0);
                if (((i13 & 7168) ^ 3072) > 2048) {
                    function1 = onVoiceLaunchConsumed;
                    if (!c28655q2.m87153g(function1)) {
                        interfaceC28601c9 = interfaceC28601c7;
                    }
                    z16 = true;
                    z17 = zM87157i3 | z16;
                    Object objM87133R12 = c28655q2.m87133R();
                    if (z17) {
                        C28655q c28655q6 = c28655q2;
                        z18 = false;
                        InterfaceC28601c1 interfaceC28601c110 = interfaceC28601c4;
                        Function1 function5 = function1;
                        interfaceC28601c10 = interfaceC28601c6;
                        InterfaceC28601c1 interfaceC28601c111 = interfaceC28601c9;
                        aVar = new a(c11006w, function5, interfaceC28601c111, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c110, interfaceC28601c10, interfaceC28690z0, null);
                        interfaceC28601c11 = interfaceC28601c111;
                        interfaceC28601c12 = interfaceC28601c110;
                        interfaceC28690z0 = interfaceC28690z0;
                        c28655q6.m87172p0(aVar);
                        c28655q = c28655q6;
                    } else {
                        C28655q c28655q7 = c28655q2;
                        z18 = false;
                        InterfaceC28601c1 interfaceC28601c112 = interfaceC28601c4;
                        Function1 function6 = function1;
                        interfaceC28601c10 = interfaceC28601c6;
                        InterfaceC28601c1 interfaceC28601c113 = interfaceC28601c9;
                        aVar = new a(c11006w, function6, interfaceC28601c113, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c112, interfaceC28601c10, interfaceC28690z0, null);
                        interfaceC28601c11 = interfaceC28601c113;
                        interfaceC28601c12 = interfaceC28601c112;
                        interfaceC28690z0 = interfaceC28690z0;
                        c28655q7.m87172p0(aVar);
                        c28655q = c28655q7;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
                    if (i14 > 4) {
                    }
                    obj2 = interfaceC30468cM29009o;
                    zM87153g = z19 | c28655q.m87153g(obj2);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g) {
                        obj3 = obj;
                        objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        obj3 = obj;
                        objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                        c28655q.m87172p0(objM87133R5);
                    }
                    obj3 = obj;
                    return (C11008x) objM87133R5;
                }
                function1 = onVoiceLaunchConsumed;
                interfaceC28601c9 = interfaceC28601c7;
                if ((i13 & 3072) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i3 | z16;
                Object objM87133R13 = c28655q2.m87133R();
                if (z17) {
                    C28655q c28655q8 = c28655q2;
                    z18 = false;
                    InterfaceC28601c1 interfaceC28601c114 = interfaceC28601c4;
                    Function1 function7 = function1;
                    interfaceC28601c10 = interfaceC28601c6;
                    InterfaceC28601c1 interfaceC28601c115 = interfaceC28601c9;
                    aVar = new a(c11006w, function7, interfaceC28601c115, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c114, interfaceC28601c10, interfaceC28690z0, null);
                    interfaceC28601c11 = interfaceC28601c115;
                    interfaceC28601c12 = interfaceC28601c114;
                    interfaceC28690z0 = interfaceC28690z0;
                    c28655q8.m87172p0(aVar);
                    c28655q = c28655q8;
                } else {
                    C28655q c28655q9 = c28655q2;
                    z18 = false;
                    InterfaceC28601c1 interfaceC28601c116 = interfaceC28601c4;
                    Function1 function8 = function1;
                    interfaceC28601c10 = interfaceC28601c6;
                    InterfaceC28601c1 interfaceC28601c117 = interfaceC28601c9;
                    aVar = new a(c11006w, function8, interfaceC28601c117, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c116, interfaceC28601c10, interfaceC28690z0, null);
                    interfaceC28601c11 = interfaceC28601c117;
                    interfaceC28601c12 = interfaceC28601c116;
                    interfaceC28690z0 = interfaceC28690z0;
                    c28655q9.m87172p0(aVar);
                    c28655q = c28655q9;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
                if (i14 > 4) {
                }
                obj2 = interfaceC30468cM29009o;
                zM87153g = z19 | c28655q.m87153g(obj2);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g) {
                    obj3 = obj;
                    objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                    c28655q.m87172p0(objM87133R5);
                } else {
                    obj3 = obj;
                    objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                    c28655q.m87172p0(objM87133R5);
                }
                obj3 = obj;
                return (C11008x) objM87133R5;
            }
            i14 = i15;
            z14 = true;
            objM87133R3 = c28655q2.m87133R();
            if (z14) {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(draftInput, c28655q2);
            interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(onDraftInputChanged, c28655q2);
            interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(canSendVoiceResult, c28655q2);
            interfaceC28601c1M87238F4 = AbstractC28683x.m87238F(sendVoiceResult, c28655q2);
            if (AbstractC16349g.m46560a(c28655q2) != null) {
                c28655q2.m87150e0(1455133808);
                ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission2 = new ActivityResultContracts$RequestPermission();
                zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28690z0) | c28655q2.m87157i(interfaceC30468c2) | c28655q2.m87153g(interfaceC28601c13) | c28655q2.m87157i(context) | c28655q2.m87153g(interfaceC28601c3);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g2) {
                    r14 = 0;
                    interfaceC28601c7 = interfaceC28601c2;
                    objM87133R6 = new C11010y(interfaceC28601c7, interfaceC2994c0, interfaceC30468c2, context, interfaceC28601c13, interfaceC28601c3, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4, interfaceC28690z0);
                    interfaceC30468c2 = interfaceC30468c2;
                    interfaceC28601c6 = interfaceC28601c1M87238F4;
                    interfaceC28601c8 = interfaceC28601c1M87238F2;
                    interfaceC28601c5 = interfaceC28601c13;
                    interfaceC28601c4 = interfaceC28601c1M87238F3;
                    interfaceC28601c3 = interfaceC28601c3;
                    context = context;
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    r14 = 0;
                    interfaceC28601c7 = interfaceC28601c2;
                    objM87133R6 = new C11010y(interfaceC28601c7, interfaceC2994c0, interfaceC30468c2, context, interfaceC28601c13, interfaceC28601c3, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4, interfaceC28690z0);
                    interfaceC30468c2 = interfaceC30468c2;
                    interfaceC28601c6 = interfaceC28601c1M87238F4;
                    interfaceC28601c8 = interfaceC28601c1M87238F2;
                    interfaceC28601c5 = interfaceC28601c13;
                    interfaceC28601c4 = interfaceC28601c1M87238F3;
                    interfaceC28601c3 = interfaceC28601c3;
                    context = context;
                    c28655q2.m87172p0(objM87133R6);
                }
                C16351i c16351iM118972a1 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission2, (Function1) objM87133R6, c28655q2, r14);
                c28655q2.m87173q(r14);
                c16351i = c16351iM118972a1;
            } else {
                interfaceC28601c4 = interfaceC28601c1M87238F3;
                c28676v0 = c28676v0;
                interfaceC28601c5 = interfaceC28601c13;
                interfaceC28601c6 = interfaceC28601c1M87238F4;
                interfaceC28601c7 = interfaceC28601c2;
                interfaceC30468cM29009o = interfaceC30468cM29009o;
                interfaceC28601c1 = interfaceC28601c1;
                interfaceC28601c8 = interfaceC28601c1M87238F2;
                c28655q2.m87150e0(1455599738);
                c28655q2.m87173q(false);
                c16351i = null;
            }
            zM87157i = c28655q2.m87157i(interfaceC30468cM29009o);
            objM87133R4 = c28655q2.m87133R();
            if (!zM87157i) {
                obj = c28676v0;
                if (objM87133R4 == obj) {
                }
                AbstractC28683x.m87251e(interfaceC30468cM29009o, (Function1) objM87133R4, c28655q2);
                if (c11006w != null) {
                }
                if (((i13 & 896) ^ 384) <= 256) {
                }
                if ((i13 & 384) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zM87157i4 = z15 | c28655q2.m87157i(interfaceC30468c2) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87157i(context) | c28655q2.m87153g(interfaceC28601c7) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c8) | c28655q2.m87153g(interfaceC28601c4) | c28655q2.m87153g(interfaceC28601c6) | c28655q2.m87153g(interfaceC28690z0);
                if (((i13 & 7168) ^ 3072) > 2048) {
                    function1 = onVoiceLaunchConsumed;
                    if (!c28655q2.m87153g(function1)) {
                        interfaceC28601c9 = interfaceC28601c7;
                    }
                    z16 = true;
                    z17 = zM87157i4 | z16;
                    Object objM87133R14 = c28655q2.m87133R();
                    if (z17) {
                        C28655q c28655q10 = c28655q2;
                        z18 = false;
                        InterfaceC28601c1 interfaceC28601c118 = interfaceC28601c4;
                        Function1 function9 = function1;
                        interfaceC28601c10 = interfaceC28601c6;
                        InterfaceC28601c1 interfaceC28601c119 = interfaceC28601c9;
                        aVar = new a(c11006w, function9, interfaceC28601c119, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c118, interfaceC28601c10, interfaceC28690z0, null);
                        interfaceC28601c11 = interfaceC28601c119;
                        interfaceC28601c12 = interfaceC28601c118;
                        interfaceC28690z0 = interfaceC28690z0;
                        c28655q10.m87172p0(aVar);
                        c28655q = c28655q10;
                    } else {
                        C28655q c28655q11 = c28655q2;
                        z18 = false;
                        InterfaceC28601c1 interfaceC28601c1110 = interfaceC28601c4;
                        Function1 function10 = function1;
                        interfaceC28601c10 = interfaceC28601c6;
                        InterfaceC28601c1 interfaceC28601c1111 = interfaceC28601c9;
                        aVar = new a(c11006w, function10, interfaceC28601c1111, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c1110, interfaceC28601c10, interfaceC28690z0, null);
                        interfaceC28601c11 = interfaceC28601c1111;
                        interfaceC28601c12 = interfaceC28601c1110;
                        interfaceC28690z0 = interfaceC28690z0;
                        c28655q11.m87172p0(aVar);
                        c28655q = c28655q11;
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
                    if (i14 > 4) {
                    }
                    obj2 = interfaceC30468cM29009o;
                    zM87153g = z19 | c28655q.m87153g(obj2);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g) {
                        obj3 = obj;
                        objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        obj3 = obj;
                        objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                        c28655q.m87172p0(objM87133R5);
                    }
                    obj3 = obj;
                    return (C11008x) objM87133R5;
                }
                function1 = onVoiceLaunchConsumed;
                interfaceC28601c9 = interfaceC28601c7;
                if ((i13 & 3072) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zM87157i4 | z16;
                Object objM87133R15 = c28655q2.m87133R();
                if (z17) {
                    C28655q c28655q12 = c28655q2;
                    z18 = false;
                    InterfaceC28601c1 interfaceC28601c1112 = interfaceC28601c4;
                    Function1 function11 = function1;
                    interfaceC28601c10 = interfaceC28601c6;
                    InterfaceC28601c1 interfaceC28601c1113 = interfaceC28601c9;
                    aVar = new a(c11006w, function11, interfaceC28601c1113, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c1112, interfaceC28601c10, interfaceC28690z0, null);
                    interfaceC28601c11 = interfaceC28601c1113;
                    interfaceC28601c12 = interfaceC28601c1112;
                    interfaceC28690z0 = interfaceC28690z0;
                    c28655q12.m87172p0(aVar);
                    c28655q = c28655q12;
                } else {
                    C28655q c28655q13 = c28655q2;
                    z18 = false;
                    InterfaceC28601c1 interfaceC28601c1114 = interfaceC28601c4;
                    Function1 function12 = function1;
                    interfaceC28601c10 = interfaceC28601c6;
                    InterfaceC28601c1 interfaceC28601c1115 = interfaceC28601c9;
                    aVar = new a(c11006w, function12, interfaceC28601c1115, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c1114, interfaceC28601c10, interfaceC28690z0, null);
                    interfaceC28601c11 = interfaceC28601c1115;
                    interfaceC28601c12 = interfaceC28601c1114;
                    interfaceC28690z0 = interfaceC28690z0;
                    c28655q13.m87172p0(aVar);
                    c28655q = c28655q13;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
                if (i14 > 4) {
                }
                obj2 = interfaceC30468cM29009o;
                zM87153g = z19 | c28655q.m87153g(obj2);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g) {
                    obj3 = obj;
                    objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                    c28655q.m87172p0(objM87133R5);
                } else {
                    obj3 = obj;
                    objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                    c28655q.m87172p0(objM87133R5);
                }
                obj3 = obj;
                return (C11008x) objM87133R5;
            }
            obj = c28676v0;
            objM87133R4 = new C11007w0(interfaceC30468cM29009o, 2);
            c28655q2.m87172p0(objM87133R4);
            AbstractC28683x.m87251e(interfaceC30468cM29009o, (Function1) objM87133R4, c28655q2);
            if (c11006w != null) {
            }
            if (((i13 & 896) ^ 384) <= 256) {
            }
            if ((i13 & 384) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zM87157i5 = z15 | c28655q2.m87157i(interfaceC30468c2) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87157i(context) | c28655q2.m87153g(interfaceC28601c7) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c8) | c28655q2.m87153g(interfaceC28601c4) | c28655q2.m87153g(interfaceC28601c6) | c28655q2.m87153g(interfaceC28690z0);
            if (((i13 & 7168) ^ 3072) > 2048) {
                function1 = onVoiceLaunchConsumed;
                if (!c28655q2.m87153g(function1)) {
                    interfaceC28601c9 = interfaceC28601c7;
                }
                z16 = true;
                z17 = zM87157i5 | z16;
                Object objM87133R16 = c28655q2.m87133R();
                if (z17) {
                    C28655q c28655q14 = c28655q2;
                    z18 = false;
                    InterfaceC28601c1 interfaceC28601c1116 = interfaceC28601c4;
                    Function1 function13 = function1;
                    interfaceC28601c10 = interfaceC28601c6;
                    InterfaceC28601c1 interfaceC28601c1117 = interfaceC28601c9;
                    aVar = new a(c11006w, function13, interfaceC28601c1117, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c1116, interfaceC28601c10, interfaceC28690z0, null);
                    interfaceC28601c11 = interfaceC28601c1117;
                    interfaceC28601c12 = interfaceC28601c1116;
                    interfaceC28690z0 = interfaceC28690z0;
                    c28655q14.m87172p0(aVar);
                    c28655q = c28655q14;
                } else {
                    C28655q c28655q15 = c28655q2;
                    z18 = false;
                    InterfaceC28601c1 interfaceC28601c1118 = interfaceC28601c4;
                    Function1 function14 = function1;
                    interfaceC28601c10 = interfaceC28601c6;
                    InterfaceC28601c1 interfaceC28601c1119 = interfaceC28601c9;
                    aVar = new a(c11006w, function14, interfaceC28601c1119, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c1118, interfaceC28601c10, interfaceC28690z0, null);
                    interfaceC28601c11 = interfaceC28601c1119;
                    interfaceC28601c12 = interfaceC28601c1118;
                    interfaceC28690z0 = interfaceC28690z0;
                    c28655q15.m87172p0(aVar);
                    c28655q = c28655q15;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
                if (i14 > 4) {
                }
                obj2 = interfaceC30468cM29009o;
                zM87153g = z19 | c28655q.m87153g(obj2);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g) {
                    obj3 = obj;
                    objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                    c28655q.m87172p0(objM87133R5);
                } else {
                    obj3 = obj;
                    objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                    c28655q.m87172p0(objM87133R5);
                }
                obj3 = obj;
                return (C11008x) objM87133R5;
            }
            function1 = onVoiceLaunchConsumed;
            interfaceC28601c9 = interfaceC28601c7;
            if ((i13 & 3072) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zM87157i5 | z16;
            Object objM87133R17 = c28655q2.m87133R();
            if (z17) {
                C28655q c28655q16 = c28655q2;
                z18 = false;
                InterfaceC28601c1 interfaceC28601c11110 = interfaceC28601c4;
                Function1 function15 = function1;
                interfaceC28601c10 = interfaceC28601c6;
                InterfaceC28601c1 interfaceC28601c11111 = interfaceC28601c9;
                aVar = new a(c11006w, function15, interfaceC28601c11111, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c11110, interfaceC28601c10, interfaceC28690z0, null);
                interfaceC28601c11 = interfaceC28601c11111;
                interfaceC28601c12 = interfaceC28601c11110;
                interfaceC28690z0 = interfaceC28690z0;
                c28655q16.m87172p0(aVar);
                c28655q = c28655q16;
            } else {
                C28655q c28655q17 = c28655q2;
                z18 = false;
                InterfaceC28601c1 interfaceC28601c11112 = interfaceC28601c4;
                Function1 function16 = function1;
                interfaceC28601c10 = interfaceC28601c6;
                InterfaceC28601c1 interfaceC28601c11113 = interfaceC28601c9;
                aVar = new a(c11006w, function16, interfaceC28601c11113, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c11112, interfaceC28601c10, interfaceC28690z0, null);
                interfaceC28601c11 = interfaceC28601c11113;
                interfaceC28601c12 = interfaceC28601c11112;
                interfaceC28690z0 = interfaceC28690z0;
                c28655q17.m87172p0(aVar);
                c28655q = c28655q17;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
            if (i14 > 4) {
            }
            obj2 = interfaceC30468cM29009o;
            zM87153g = z19 | c28655q.m87153g(obj2);
            objM87133R5 = c28655q.m87133R();
            if (zM87153g) {
                obj3 = obj;
                objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                c28655q.m87172p0(objM87133R5);
            } else {
                obj3 = obj;
                objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                c28655q.m87172p0(objM87133R5);
            }
            obj3 = obj;
            return (C11008x) objM87133R5;
        }
        interfaceC28601c1 = interfaceC28601c1M87261o;
        z4 = true;
        objM87133R = c28655q2.m87133R();
        if (z4) {
            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
            c28655q2.m87172p0(objM87133R);
        } else {
            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
            c28655q2.m87172p0(objM87133R);
        }
        interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
        if (i15 <= 4) {
        }
        objM87133R2 = c28655q2.m87133R();
        if (z13) {
            objM87133R2 = AbstractC11266d.m30468v(0.0f, c28655q2);
        } else {
            objM87133R2 = AbstractC11266d.m30468v(0.0f, c28655q2);
        }
        interfaceC28690z0 = (InterfaceC28690z0) objM87133R2;
        if (i15 > 4) {
            i14 = i15;
            if ((i13 & 6) != 4) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            i14 = i15;
            if ((i13 & 6) != 4) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        objM87133R3 = c28655q2.m87133R();
        if (z14) {
            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
            c28655q2.m87172p0(objM87133R3);
        } else {
            objM87133R3 = AbstractC28683x.m87272z(Boolean.FALSE);
            c28655q2.m87172p0(objM87133R3);
        }
        interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
        interfaceC28601c1M87238F = AbstractC28683x.m87238F(draftInput, c28655q2);
        interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(onDraftInputChanged, c28655q2);
        interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(canSendVoiceResult, c28655q2);
        interfaceC28601c1M87238F4 = AbstractC28683x.m87238F(sendVoiceResult, c28655q2);
        if (AbstractC16349g.m46560a(c28655q2) != null) {
            c28655q2.m87150e0(1455133808);
            ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission3 = new ActivityResultContracts$RequestPermission();
            zM87153g2 = c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87153g(interfaceC28601c1M87238F2) | c28655q2.m87153g(interfaceC28601c1M87238F3) | c28655q2.m87153g(interfaceC28601c1M87238F4) | c28655q2.m87153g(interfaceC28690z0) | c28655q2.m87157i(interfaceC30468c2) | c28655q2.m87153g(interfaceC28601c13) | c28655q2.m87157i(context) | c28655q2.m87153g(interfaceC28601c3);
            objM87133R6 = c28655q2.m87133R();
            if (zM87153g2) {
                r14 = 0;
                interfaceC28601c7 = interfaceC28601c2;
                objM87133R6 = new C11010y(interfaceC28601c7, interfaceC2994c0, interfaceC30468c2, context, interfaceC28601c13, interfaceC28601c3, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4, interfaceC28690z0);
                interfaceC30468c2 = interfaceC30468c2;
                interfaceC28601c6 = interfaceC28601c1M87238F4;
                interfaceC28601c8 = interfaceC28601c1M87238F2;
                interfaceC28601c5 = interfaceC28601c13;
                interfaceC28601c4 = interfaceC28601c1M87238F3;
                interfaceC28601c3 = interfaceC28601c3;
                context = context;
                c28655q2.m87172p0(objM87133R6);
            } else {
                r14 = 0;
                interfaceC28601c7 = interfaceC28601c2;
                objM87133R6 = new C11010y(interfaceC28601c7, interfaceC2994c0, interfaceC30468c2, context, interfaceC28601c13, interfaceC28601c3, interfaceC28601c1M87238F2, interfaceC28601c1M87238F3, interfaceC28601c1M87238F4, interfaceC28690z0);
                interfaceC30468c2 = interfaceC30468c2;
                interfaceC28601c6 = interfaceC28601c1M87238F4;
                interfaceC28601c8 = interfaceC28601c1M87238F2;
                interfaceC28601c5 = interfaceC28601c13;
                interfaceC28601c4 = interfaceC28601c1M87238F3;
                interfaceC28601c3 = interfaceC28601c3;
                context = context;
                c28655q2.m87172p0(objM87133R6);
            }
            C16351i c16351iM118972a2 = AbstractC37056f.m118972a0(activityResultContracts$RequestPermission3, (Function1) objM87133R6, c28655q2, r14);
            c28655q2.m87173q(r14);
            c16351i = c16351iM118972a2;
        } else {
            interfaceC28601c4 = interfaceC28601c1M87238F3;
            c28676v0 = c28676v0;
            interfaceC28601c5 = interfaceC28601c13;
            interfaceC28601c6 = interfaceC28601c1M87238F4;
            interfaceC28601c7 = interfaceC28601c2;
            interfaceC30468cM29009o = interfaceC30468cM29009o;
            interfaceC28601c1 = interfaceC28601c1;
            interfaceC28601c8 = interfaceC28601c1M87238F2;
            c28655q2.m87150e0(1455599738);
            c28655q2.m87173q(false);
            c16351i = null;
        }
        zM87157i = c28655q2.m87157i(interfaceC30468cM29009o);
        objM87133R4 = c28655q2.m87133R();
        if (!zM87157i) {
            obj = c28676v0;
            if (objM87133R4 == obj) {
            }
            AbstractC28683x.m87251e(interfaceC30468cM29009o, (Function1) objM87133R4, c28655q2);
            if (c11006w != null) {
            }
            if (((i13 & 896) ^ 384) <= 256) {
            }
            if ((i13 & 384) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zM87157i6 = z15 | c28655q2.m87157i(interfaceC30468c2) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87157i(context) | c28655q2.m87153g(interfaceC28601c7) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c8) | c28655q2.m87153g(interfaceC28601c4) | c28655q2.m87153g(interfaceC28601c6) | c28655q2.m87153g(interfaceC28690z0);
            if (((i13 & 7168) ^ 3072) > 2048) {
                function1 = onVoiceLaunchConsumed;
                if (!c28655q2.m87153g(function1)) {
                    interfaceC28601c9 = interfaceC28601c7;
                }
                z16 = true;
                z17 = zM87157i6 | z16;
                Object objM87133R18 = c28655q2.m87133R();
                if (z17) {
                    C28655q c28655q18 = c28655q2;
                    z18 = false;
                    InterfaceC28601c1 interfaceC28601c11114 = interfaceC28601c4;
                    Function1 function17 = function1;
                    interfaceC28601c10 = interfaceC28601c6;
                    InterfaceC28601c1 interfaceC28601c11115 = interfaceC28601c9;
                    aVar = new a(c11006w, function17, interfaceC28601c11115, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c11114, interfaceC28601c10, interfaceC28690z0, null);
                    interfaceC28601c11 = interfaceC28601c11115;
                    interfaceC28601c12 = interfaceC28601c11114;
                    interfaceC28690z0 = interfaceC28690z0;
                    c28655q18.m87172p0(aVar);
                    c28655q = c28655q18;
                } else {
                    C28655q c28655q19 = c28655q2;
                    z18 = false;
                    InterfaceC28601c1 interfaceC28601c11116 = interfaceC28601c4;
                    Function1 function18 = function1;
                    interfaceC28601c10 = interfaceC28601c6;
                    InterfaceC28601c1 interfaceC28601c11117 = interfaceC28601c9;
                    aVar = new a(c11006w, function18, interfaceC28601c11117, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c11116, interfaceC28601c10, interfaceC28690z0, null);
                    interfaceC28601c11 = interfaceC28601c11117;
                    interfaceC28601c12 = interfaceC28601c11116;
                    interfaceC28690z0 = interfaceC28690z0;
                    c28655q19.m87172p0(aVar);
                    c28655q = c28655q19;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
                if (i14 > 4) {
                }
                obj2 = interfaceC30468cM29009o;
                zM87153g = z19 | c28655q.m87153g(obj2);
                objM87133R5 = c28655q.m87133R();
                if (zM87153g) {
                    obj3 = obj;
                    objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                    c28655q.m87172p0(objM87133R5);
                } else {
                    obj3 = obj;
                    objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                    c28655q.m87172p0(objM87133R5);
                }
                obj3 = obj;
                return (C11008x) objM87133R5;
            }
            function1 = onVoiceLaunchConsumed;
            interfaceC28601c9 = interfaceC28601c7;
            if ((i13 & 3072) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zM87157i6 | z16;
            Object objM87133R19 = c28655q2.m87133R();
            if (z17) {
                C28655q c28655q110 = c28655q2;
                z18 = false;
                InterfaceC28601c1 interfaceC28601c11118 = interfaceC28601c4;
                Function1 function19 = function1;
                interfaceC28601c10 = interfaceC28601c6;
                InterfaceC28601c1 interfaceC28601c11119 = interfaceC28601c9;
                aVar = new a(c11006w, function19, interfaceC28601c11119, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c11118, interfaceC28601c10, interfaceC28690z0, null);
                interfaceC28601c11 = interfaceC28601c11119;
                interfaceC28601c12 = interfaceC28601c11118;
                interfaceC28690z0 = interfaceC28690z0;
                c28655q110.m87172p0(aVar);
                c28655q = c28655q110;
            } else {
                C28655q c28655q111 = c28655q2;
                z18 = false;
                InterfaceC28601c1 interfaceC28601c111110 = interfaceC28601c4;
                Function1 function110 = function1;
                interfaceC28601c10 = interfaceC28601c6;
                InterfaceC28601c1 interfaceC28601c111111 = interfaceC28601c9;
                aVar = new a(c11006w, function110, interfaceC28601c111111, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c111110, interfaceC28601c10, interfaceC28690z0, null);
                interfaceC28601c11 = interfaceC28601c111111;
                interfaceC28601c12 = interfaceC28601c111110;
                interfaceC28690z0 = interfaceC28690z0;
                c28655q111.m87172p0(aVar);
                c28655q = c28655q111;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
            if (i14 > 4) {
            }
            obj2 = interfaceC30468cM29009o;
            zM87153g = z19 | c28655q.m87153g(obj2);
            objM87133R5 = c28655q.m87133R();
            if (zM87153g) {
                obj3 = obj;
                objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                c28655q.m87172p0(objM87133R5);
            } else {
                obj3 = obj;
                objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                c28655q.m87172p0(objM87133R5);
            }
            obj3 = obj;
            return (C11008x) objM87133R5;
        }
        obj = c28676v0;
        objM87133R4 = new C11007w0(interfaceC30468cM29009o, 2);
        c28655q2.m87172p0(objM87133R4);
        AbstractC28683x.m87251e(interfaceC30468cM29009o, (Function1) objM87133R4, c28655q2);
        if (c11006w != null) {
        }
        if (((i13 & 896) ^ 384) <= 256) {
        }
        if ((i13 & 384) == 256) {
            z15 = true;
        } else {
            z15 = false;
        }
        boolean zM87157i7 = z15 | c28655q2.m87157i(interfaceC30468c2) | c28655q2.m87153g(interfaceC28601c5) | c28655q2.m87157i(context) | c28655q2.m87153g(interfaceC28601c7) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87157i(c16351i) | c28655q2.m87153g(interfaceC28601c8) | c28655q2.m87153g(interfaceC28601c4) | c28655q2.m87153g(interfaceC28601c6) | c28655q2.m87153g(interfaceC28690z0);
        if (((i13 & 7168) ^ 3072) > 2048) {
            function1 = onVoiceLaunchConsumed;
            if (!c28655q2.m87153g(function1)) {
                interfaceC28601c9 = interfaceC28601c7;
            }
            z16 = true;
            z17 = zM87157i7 | z16;
            Object objM87133R110 = c28655q2.m87133R();
            if (z17) {
                C28655q c28655q112 = c28655q2;
                z18 = false;
                InterfaceC28601c1 interfaceC28601c111112 = interfaceC28601c4;
                Function1 function111 = function1;
                interfaceC28601c10 = interfaceC28601c6;
                InterfaceC28601c1 interfaceC28601c111113 = interfaceC28601c9;
                aVar = new a(c11006w, function111, interfaceC28601c111113, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c111112, interfaceC28601c10, interfaceC28690z0, null);
                interfaceC28601c11 = interfaceC28601c111113;
                interfaceC28601c12 = interfaceC28601c111112;
                interfaceC28690z0 = interfaceC28690z0;
                c28655q112.m87172p0(aVar);
                c28655q = c28655q112;
            } else {
                C28655q c28655q113 = c28655q2;
                z18 = false;
                InterfaceC28601c1 interfaceC28601c111114 = interfaceC28601c4;
                Function1 function112 = function1;
                interfaceC28601c10 = interfaceC28601c6;
                InterfaceC28601c1 interfaceC28601c111115 = interfaceC28601c9;
                aVar = new a(c11006w, function112, interfaceC28601c111115, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c111114, interfaceC28601c10, interfaceC28690z0, null);
                interfaceC28601c11 = interfaceC28601c111115;
                interfaceC28601c12 = interfaceC28601c111114;
                interfaceC28690z0 = interfaceC28690z0;
                c28655q113.m87172p0(aVar);
                c28655q = c28655q113;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
            if (i14 > 4) {
            }
            obj2 = interfaceC30468cM29009o;
            zM87153g = z19 | c28655q.m87153g(obj2);
            objM87133R5 = c28655q.m87133R();
            if (zM87153g) {
                obj3 = obj;
                objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                c28655q.m87172p0(objM87133R5);
            } else {
                obj3 = obj;
                objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
                c28655q.m87172p0(objM87133R5);
            }
            obj3 = obj;
            return (C11008x) objM87133R5;
        }
        function1 = onVoiceLaunchConsumed;
        interfaceC28601c9 = interfaceC28601c7;
        if ((i13 & 3072) == 2048) {
            z16 = true;
        } else {
            z16 = false;
        }
        z17 = zM87157i7 | z16;
        Object objM87133R111 = c28655q2.m87133R();
        if (z17) {
            C28655q c28655q114 = c28655q2;
            z18 = false;
            InterfaceC28601c1 interfaceC28601c111116 = interfaceC28601c4;
            Function1 function113 = function1;
            interfaceC28601c10 = interfaceC28601c6;
            InterfaceC28601c1 interfaceC28601c111117 = interfaceC28601c9;
            aVar = new a(c11006w, function113, interfaceC28601c111117, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c111116, interfaceC28601c10, interfaceC28690z0, null);
            interfaceC28601c11 = interfaceC28601c111117;
            interfaceC28601c12 = interfaceC28601c111116;
            interfaceC28690z0 = interfaceC28690z0;
            c28655q114.m87172p0(aVar);
            c28655q = c28655q114;
        } else {
            C28655q c28655q115 = c28655q2;
            z18 = false;
            InterfaceC28601c1 interfaceC28601c111118 = interfaceC28601c4;
            Function1 function114 = function1;
            interfaceC28601c10 = interfaceC28601c6;
            InterfaceC28601c1 interfaceC28601c111119 = interfaceC28601c9;
            aVar = new a(c11006w, function114, interfaceC28601c111119, c16351i, interfaceC30468c2, context, interfaceC28601c5, interfaceC28601c3, interfaceC28601c8, interfaceC28601c111118, interfaceC28601c10, interfaceC28690z0, null);
            interfaceC28601c11 = interfaceC28601c111119;
            interfaceC28601c12 = interfaceC28601c111118;
            interfaceC28690z0 = interfaceC28690z0;
            c28655q115.m87172p0(aVar);
            c28655q = c28655q115;
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) aVar, numValueOf);
        if (i14 > 4) {
        }
        obj2 = interfaceC30468cM29009o;
        zM87153g = z19 | c28655q.m87153g(obj2);
        objM87133R5 = c28655q.m87133R();
        if (zM87153g) {
            obj3 = obj;
            objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
            c28655q.m87172p0(objM87133R5);
        } else {
            obj3 = obj;
            objM87133R5 = new C11008x(interfaceC28601c11, interfaceC28601c1, interfaceC28690z0, new C1008b(obj2, (Object) interfaceC28601c11, (Object) interfaceC28601c1M87238F, (Object) interfaceC28601c12, (Object) interfaceC28601c10, (Object) interfaceC28601c8, 3));
            c28655q.m87172p0(objM87133R5);
        }
        obj3 = obj;
        return (C11008x) objM87133R5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Object m29007m(InterfaceC28601c1 interfaceC28601c1, C16351i c16351i, InterfaceC30468c interfaceC30468c, Context context, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28690z0 interfaceC28690z0, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        InterfaceC30468c interfaceC30468cM29008n = m29008n(interfaceC30468c, context, interfaceC28601c2);
        boolean zIsAvailable = interfaceC30468cM29008n.isAvailable();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zIsAvailable) {
            f33837a.mo85228t("Speech recognition not available", new AbstractC30556a.a[0]);
            interfaceC28601c1.setValue(Boolean.FALSE);
            return c23454a0;
        }
        if (interfaceC30468cM29008n.mo93230c()) {
            Object objM29020z = m29020z(interfaceC28601c1, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28690z0, interfaceC30468cM29008n, z4, interfaceC30057d);
            return objM29020z == EnumC31071a.f128113w ? objM29020z : c23454a0;
        }
        interfaceC28601c1.setValue(Boolean.TRUE);
        m29018x(interfaceC28601c3, z4);
        if (c16351i != null) {
            c16351i.mo4052a("android.permission.RECORD_AUDIO", null);
        } else {
            interfaceC28601c1.setValue(Boolean.FALSE);
        }
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final InterfaceC30468c m29008n(InterfaceC30468c interfaceC30468c, Context context, InterfaceC28601c1 interfaceC28601c1) {
        if (interfaceC30468c != null) {
            return interfaceC30468c;
        }
        InterfaceC30468c interfaceC30468cM29009o = m29009o(interfaceC28601c1);
        if (interfaceC30468cM29009o != null) {
            return interfaceC30468cM29009o;
        }
        InterfaceC30468c interfaceC30468cM93232a = C30469d.f125195w.m93232a(context);
        m29014t(interfaceC28601c1, interfaceC30468cM93232a);
        return interfaceC30468cM93232a;
    }

    /* JADX INFO: renamed from: o */
    private static final InterfaceC30468c m29009o(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC30468c) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: p */
    private static final Function1 m29010p(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: q */
    private static final InterfaceC4339a m29011q(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC4339a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: r */
    private static final Function1 m29012r(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m29013s(InterfaceC28601c1 interfaceC28601c1, InterfaceC2994c0 interfaceC2994c0, InterfaceC30468c interfaceC30468c, Context context, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28690z0 interfaceC28690z0, boolean z4) {
        interfaceC28601c1.setValue(Boolean.FALSE);
        if (z4) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(interfaceC30468c, context, interfaceC28601c2, interfaceC28601c3, interfaceC28601c1, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, interfaceC28690z0, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m29014t(InterfaceC28601c1 interfaceC28601c1, InterfaceC30468c interfaceC30468c) {
        interfaceC28601c1.setValue(interfaceC30468c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final InterfaceC28620h0 m29015u(InterfaceC30468c interfaceC30468c, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new b(interfaceC30468c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m29016v(InterfaceC30468c interfaceC30468c, InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28670t2 interfaceC28670t5, boolean z4) {
        if (interfaceC30468c != null) {
            interfaceC30468c.stopListening();
        }
        interfaceC28601c1.setValue(Boolean.FALSE);
        boolean z13 = z4 && !AbstractC39414r.m125890i0(m29019y(interfaceC28670t2).f122125a.f92135x);
        if (z13 && ((Boolean) m29011q(interfaceC28670t3).invoke()).booleanValue()) {
            m29012r(interfaceC28670t4).invoke(m29019y(interfaceC28670t2).f122125a.f92135x);
            m29010p(interfaceC28670t5).invoke(new C29891y(7, (String) null, 0L));
        } else if (!z13) {
            m29010p(interfaceC28670t5).invoke(new C29891y(7, (String) null, 0L));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final boolean m29017w(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: x */
    private static final void m29018x(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: y */
    private static final C29891y m29019y(InterfaceC28670t2 interfaceC28670t2) {
        return (C29891y) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: z */
    public static final Object m29020z(InterfaceC28601c1 interfaceC28601c1, InterfaceC28670t2 interfaceC28670t2, InterfaceC28670t2 interfaceC28670t3, InterfaceC28670t2 interfaceC28670t4, InterfaceC28690z0 interfaceC28690z0, InterfaceC30468c interfaceC30468c, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        d dVar;
        InterfaceC28601c1 interfaceC28601c2;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f33869I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f33869I = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f33868H;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = dVar2.f33869I;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!((Boolean) interfaceC28601c1.getValue()).booleanValue() && !((Boolean) interfaceC30468c.getIsListening().getValue()).booleanValue()) {
                interfaceC28601c1.setValue(Boolean.TRUE);
                try {
                    Function1 c11012z = new C11012z(0, interfaceC28601c1, interfaceC28670t2, interfaceC28670t3, interfaceC28670t4, z4);
                    Function1 c11007w0 = new C11007w0(interfaceC28670t2, 3);
                    Function1 c10972k0 = new C10972k0(1, interfaceC28601c1);
                    Function1 c10975l0 = new C10975l0(interfaceC28690z0, 2);
                    dVar2.f33870w = interfaceC28601c1;
                    dVar2.f33871x = null;
                    dVar2.f33872y = null;
                    dVar2.f33873z = null;
                    dVar2.f33865E = null;
                    dVar2.f33866F = null;
                    dVar2.f33867G = z4;
                    dVar2.f33869I = 1;
                    if (interfaceC30468c.mo93231d(c11012z, c11007w0, c10972k0, c10975l0, dVar2) == obj2) {
                        return obj2;
                    }
                } catch (RuntimeException e5) {
                    e = e5;
                    interfaceC28601c2 = interfaceC28601c1;
                    f33837a.mo85228t(AbstractC11266d.m30461o("Unable to start speech recognition: ", e.getMessage()), new AbstractC30556a.a[0]);
                    interfaceC28601c2.setValue(Boolean.FALSE);
                }
            }
            return c23454a0;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        interfaceC28601c2 = (InterfaceC28601c1) dVar2.f33870w;
        try {
            AbstractC34132o.m107864I(obj);
            return c23454a0;
        } catch (RuntimeException e13) {
            e = e13;
        }
        f33837a.mo85228t(AbstractC11266d.m30461o("Unable to start speech recognition: ", e.getMessage()), new AbstractC30556a.a[0]);
        interfaceC28601c2.setValue(Boolean.FALSE);
        return c23454a0;
    }
}
