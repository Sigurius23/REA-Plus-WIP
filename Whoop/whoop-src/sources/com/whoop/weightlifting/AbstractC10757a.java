package com.whoop.weightlifting;

import a80.C0542f;
import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import bv2.AbstractC3676c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.view.edit.C9790n;
import com.whoop.profile.view.edit.form.C9779c;
import com.whoop.weightlifting.AbstractC10757a;
import cu2.C11121a;
import cu2.C11132l;
import cu2.C11133m;
import cu2.C11134n;
import cu2.C11135o;
import cu2.C11138r;
import cu2.C11139s;
import cu2.C11140t;
import dp0.AbstractC12252h;
import dp0.InterfaceC12251g;
import e93.AbstractC12889b;
import ev2.AbstractC13712u;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import hv2.AbstractC17687i;
import hv2.C17679a;
import in2.InterfaceC18732d;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kotlin.C2026r;
import kv2.AbstractC22846b;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.C22931l;
import p114eb.AbstractC12939a0;
import p114eb.AbstractC12964i1;
import p114eb.C12970k1;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p114eb.C12999y0;
import p249jc.AbstractC21598x;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qu2.AbstractC30640h;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sv2.AbstractC33042e;
import tu2.AbstractC34197b;
import uu2.AbstractC35261l;
import uu2.AbstractC35272w;
import vf3.InterfaceC35951a;
import vv2.AbstractC36539e;
import vv2.C36535a;
import xf3.C38266c;
import yu2.AbstractC39795e;
import yu2.C39791a;

/* JADX INFO: renamed from: com.whoop.weightlifting.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0087\u0001\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00002\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001f\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0019*\u00020\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \" \u0010%\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002²\u0006\f\u0010(\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, m65681d2 = {"", "startDestinationRoute", "deepLinkRoute", "Leb/u0;", "strengthTrainerNavController", "Leb/a0;", "globalNavController", "Lj02/o0;", "appNavigator", "Lfi0/a;", "analytics", "Lrr2/c;", "crashReporter", "Lin2/d;", "dispatcherFactory", "Landroidx/lifecycle/g0;", "lifecycleOwner", "", "processingEndWorkoutAction", "openTab", "Lkotlin/Function0;", "Ll83/a0;", "onEndWorkoutActionProcessed", "s", "(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lrr2/c;Lin2/d;Landroidx/lifecycle/g0;ZLjava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;III)V", "ARGS", "Leb/s0;", "Lcom/whoop/weightlifting/StrengthTrainerDestination;", "destination", "Lkotlin/Function1;", "content", "N", "(Leb/s0;Lcom/whoop/weightlifting/StrengthTrainerDestination;Lkotlin/jvm/functions/Function3;)V", "Leb/q;", "Lcu2/a;", "a", "Lkotlin/jvm/functions/Function1;", "noNavArgs", "Lcu2/t;", "sharedViewModel", "isExerciseDetailsV2ExperimentEnabled", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10757a {

    /* JADX INFO: renamed from: a */
    private static final Function1 f32831a = new C9779c(23);

    /* JADX INFO: renamed from: com.whoop.weightlifting.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f32832w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32833x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32834y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f32835z;

        /* JADX INFO: renamed from: com.whoop.weightlifting.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41433a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f32836w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41433a(C21647a c21647a) {
                super(0);
                this.f32836w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f32836w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f32832w = c38266c;
            this.f32833x = interfaceC35951a;
            this.f32834y = interfaceC4339a;
            this.f32835z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, cu2.t] */
        @Override // c93.InterfaceC4339a
        public final C11140t invoke() {
            return AbstractC21598x.m60668X(this.f32832w, this.f32833x, new C41433a(this.f32835z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11140t.class), null, this.f32834y);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.StrengthTrainerNavGraphKt$StrengthTrainerNavGraph$3$1", m100430f = "StrengthTrainerNavGraph.kt", m100431l = {86}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32837w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12991u0 f32838x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f32839y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C12991u0 c12991u0, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32838x = c12991u0;
            this.f32839y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f32838x, this.f32839y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32837w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11140t c11140tM28173u = AbstractC10757a.m28173u(this.f32839y);
                this.f32837w = 1;
                obj = c11140tM28173u.m30107p(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                StrengthTrainerDestination.C10738a.f32750a.m28027o(this.f32838x);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.StrengthTrainerNavGraphKt$StrengthTrainerNavGraph$4$1$1$1$1", m100430f = "StrengthTrainerNavGraph.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32840w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f32841x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f32842y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C12991u0 f32843z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, C12991u0 c12991u0, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32841x = str;
            this.f32842y = str2;
            this.f32843z = c12991u0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final C23454a0 m28182j(C12999y0 c12999y0) {
            c12999y0.m36510b("deepLinkEntry", new C10758b(2));
            c12999y0.f44915b = true;
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final C23454a0 m28183k(C12970k1 c12970k1) {
            c12970k1.f44796a = true;
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public static final C23454a0 m28184l(C12999y0 c12999y0) {
            c12999y0.f44915b = true;
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f32841x, this.f32842y, this.f32843z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32840w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String str = this.f32841x;
            if (str == null) {
                str = this.f32842y;
            }
            this.f32843z.m36408w(StrengthTrainerDestination.C10747j.f32796a.getRoute(), new C10758b(0));
            this.f32843z.m36408w(str, new C10758b(1));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.a$d */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/weightlifting/a$d", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC1585g0 f32844a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1577e0 f32845b;

        public d(InterfaceC1585g0 interfaceC1585g0, InterfaceC1577e0 interfaceC1577e0) {
            this.f32844a = interfaceC1585g0;
            this.f32845b = interfaceC1577e0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f32844a.getLifecycle().mo4988d(this.f32845b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m28137A(C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, String str, InterfaceC14515a interfaceC14515a, InterfaceC31766c interfaceC31766c, InterfaceC18732d interfaceC18732d, InterfaceC21159o0 interfaceC21159o0, StrengthTrainerDestination.C10747j.a it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC33042e.m104464N0(c12991u0, abstractC12939a0, str, interfaceC14515a, interfaceC31766c, interfaceC18732d, interfaceC21159o0, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m28138B(C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, InterfaceC14515a interfaceC14515a, InterfaceC28670t2 interfaceC28670t2, C12982q entry, Composer composer, int i13) {
        AbstractC22676k.m65750j(entry, "entry");
        AbstractC17687i.m50470M((StrengthTrainerDestination.C10739b.a) StrengthTrainerDestination.C10739b.f32758a.getNavArgsFactory().invoke(entry), entry.m36480b(), (String) entry.m36480b().m5001b("linkedExerciseId"), new C17679a(c12991u0, abstractC12939a0, m28174v(interfaceC28670t2)), interfaceC14515a, composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m28139C(C12991u0 c12991u0, StrengthTrainerDestination.C10743f.a navArgs, Composer composer, int i13) {
        AbstractC22676k.m65750j(navArgs, "navArgs");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(navArgs) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC3676c.m11374j(navArgs, c12991u0, c28655q, i13 & 14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m28140D(C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, InterfaceC28670t2 interfaceC28670t2, StrengthTrainerDestination.C10745h.a navArgs, Composer composer, int i13) {
        AbstractC22676k.m65750j(navArgs, "navArgs");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(navArgs) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC13712u.m38748O0(navArgs, c12991u0, abstractC12939a0, m28174v(interfaceC28670t2), c28655q, i13 & 14, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m28141E(C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, InterfaceC21159o0 interfaceC21159o0, InterfaceC14515a interfaceC14515a, StrengthTrainerDestination.C10742e.a navArgs, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(navArgs, "navArgs");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(navArgs) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (navArgs.getIsExerciseDetailsV2ExperimentEnabled()) {
            c28655q.m87150e0(-1238082196);
            AbstractC35272w.m111875J(navArgs, c12991u0, abstractC12939a0, interfaceC21159o0, interfaceC14515a, null, c28655q, i14 & 14, 32);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1237748822);
            AbstractC35261l.m111759D(navArgs, c12991u0, abstractC12939a0, c28655q, i14 & 14);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m28142F(C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, InterfaceC21159o0 interfaceC21159o0, InterfaceC28670t2 interfaceC28670t2, StrengthTrainerDestination.C10741d.a navArgs, Composer composer, int i13) {
        AbstractC22676k.m65750j(navArgs, "navArgs");
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C39791a(c12991u0, abstractC12939a0, interfaceC21159o0);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC39795e.m127573x(navArgs, (C39791a) objM87133R, m28174v(interfaceC28670t2), c28655q, i13 & 14, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m28143G(C12991u0 c12991u0, InterfaceC28670t2 interfaceC28670t2, StrengthTrainerDestination.C10746i.a navArgs, Composer composer, int i13) {
        AbstractC22676k.m65750j(navArgs, "navArgs");
        if ((i13 & 6) == 0) {
            i13 |= ((C28655q) composer).m87153g(navArgs) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 19) != 18)) {
            AbstractC22846b.m66242E(navArgs, c12991u0, m28174v(interfaceC28670t2), c28655q, i13 & 14, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m28144H(C12991u0 c12991u0, C11121a it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC34197b.m108087m(c12991u0, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m28145I(C12991u0 c12991u0, InterfaceC21159o0 interfaceC21159o0, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC23462h interfaceC23462h, InterfaceC28670t2 interfaceC28670t2, StrengthTrainerDestination.C10738a.a navArgs, Composer composer, int i13) {
        AbstractC22676k.m65750j(navArgs, "navArgs");
        AbstractC30640h.m94145n0(navArgs, m28173u(interfaceC23462h), c12991u0, interfaceC21159o0, z4, interfaceC4339a, m28174v(interfaceC28670t2), composer, i13 & 14, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m28146J(InterfaceC14515a interfaceC14515a, C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, InterfaceC21159o0 interfaceC21159o0, StrengthTrainerDestination.C10744g.a navArgs, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(navArgs, "navArgs");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(navArgs) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            InterfaceC12251g interfaceC12251g = (InterfaceC12251g) c28655q.m87161k(AbstractC12252h.m34153c());
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                C36535a c36535a = new C36535a(c12991u0, abstractC12939a0, context, interfaceC14515a, interfaceC21159o0, interfaceC12251g, null, 64, null);
                c28655q.m87172p0(c36535a);
                objM87133R = c36535a;
            }
            AbstractC36539e.m117133x(navArgs, interfaceC14515a, (C36535a) objM87133R, c28655q, i14 & 14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m28147K(String str, String str2, C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, InterfaceC21159o0 interfaceC21159o0, InterfaceC14515a interfaceC14515a, InterfaceC31766c interfaceC31766c, InterfaceC18732d interfaceC18732d, InterfaceC1585g0 interfaceC1585g0, boolean z4, String str3, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15, Composer composer, int i16) {
        m28171s(str, str2, c12991u0, abstractC12939a0, interfaceC21159o0, interfaceC14515a, interfaceC31766c, interfaceC18732d, interfaceC1585g0, z4, str3, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final <ARGS> void m28150N(C12987s0 c12987s0, StrengthTrainerDestination<ARGS> strengthTrainerDestination, Function3 function3) {
        AbstractC12889b.m36291u(c12987s0, strengthTrainerDestination.getRoute(), strengthTrainerDestination.getArguments(), new C37816b(new C22931l(14, function3, strengthTrainerDestination), true, 1899348146), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m28151O(Function3 function3, StrengthTrainerDestination strengthTrainerDestination, C12982q navBackStackEntry, Composer composer, int i13) {
        AbstractC22676k.m65750j(navBackStackEntry, "navBackStackEntry");
        function3.invoke(strengthTrainerDestination.getNavArgsFactory().invoke(navBackStackEntry), composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C11121a m28152P(C12982q it) {
        AbstractC22676k.m65750j(it, "it");
        return C11121a.f35343a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x013e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:111:0x0156  */
    /* JADX WARN: Code duplicated, block: B:115:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x0171  */
    /* JADX WARN: Code duplicated, block: B:122:0x017b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x01be  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:162:0x0204  */
    /* JADX WARN: Code duplicated, block: B:164:0x0213  */
    /* JADX WARN: Code duplicated, block: B:167:0x0229  */
    /* JADX WARN: Code duplicated, block: B:169:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x0254  */
    /* JADX WARN: Code duplicated, block: B:175:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x028f  */
    /* JADX WARN: Code duplicated, block: B:179:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:184:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:187:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:188:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:191:0x02da  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:200:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:203:0x0322  */
    /* JADX WARN: Code duplicated, block: B:204:0x0325  */
    /* JADX WARN: Code duplicated, block: B:208:0x032e  */
    /* JADX WARN: Code duplicated, block: B:211:0x0338 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x033a  */
    /* JADX WARN: Code duplicated, block: B:217:0x037f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0387  */
    /* JADX WARN: Code duplicated, block: B:222:0x039d  */
    /* JADX WARN: Code duplicated, block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x008d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    /* JADX INFO: renamed from: s */
    public static final void m28171s(String str, String str2, C12991u0 c12991u0, final AbstractC12939a0 globalNavController, final InterfaceC21159o0 appNavigator, final InterfaceC14515a analytics, final InterfaceC31766c crashReporter, final InterfaceC18732d dispatcherFactory, InterfaceC1585g0 interfaceC1585g0, boolean z4, String str3, InterfaceC4339a interfaceC4339a, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        String str4;
        InterfaceC1585g0 interfaceC1585g1;
        int i17;
        boolean z13;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z14;
        final String str5;
        final C12991u0 c12991u1;
        C28655q c28655q;
        final InterfaceC1585g0 interfaceC1585g2;
        final boolean z15;
        final String str6;
        final InterfaceC4339a interfaceC4339a2;
        final String str7;
        C28677v1 c28677v1M87180u;
        int i28;
        C28676v0 c28676v0;
        String route;
        final C12991u0 c12991u0M44439S;
        InterfaceC1585g0 interfaceC1585g3;
        String str8;
        String str9;
        int i29;
        InterfaceC1585g0 interfaceC1585g4;
        String str10;
        Object objM87133R;
        boolean z16;
        InterfaceC4339a interfaceC4339a3;
        final String str11;
        C26669a c26669a;
        C38266c c38266c;
        boolean z17;
        InterfaceC4339a interfaceC4339a4;
        final String str12;
        C21647a c21647aM114690r;
        boolean zM87153g;
        Object objM87133R2;
        final InterfaceC23462h interfaceC23462h;
        final InterfaceC28601c1 interfaceC28601c1M87261o;
        boolean zM87157i;
        Object objM87133R3;
        boolean zM87157i2;
        Object objM87133R4;
        String str13;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objM87133R5;
        final boolean z26;
        C28655q c28655q2;
        String str14;
        String str15;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        AbstractC22676k.m65750j(appNavigator, "appNavigator");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1966128648);
        if ((i13 & 6) == 0) {
            i16 = (((i15 & 1) == 0 && c28655q3.m87153g(str)) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        int i44 = i15 & 2;
        if (i44 == 0) {
            if ((i13 & 48) == 0) {
                str4 = str2;
                i16 |= c28655q3.m87153g(str4) ? 32 : 16;
            }
            if ((i13 & 384) != 0) {
                i16 |= ((i15 & 4) == 0 || !c28655q3.m87157i(c12991u0)) ? 128 : 256;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q3.m87157i(globalNavController)) {
                    i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i39;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q3.m87157i(appNavigator)) {
                    i38 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i38 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i38;
            }
            if ((196608 & i13) == 0) {
                if (c28655q3.m87157i(analytics)) {
                    i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i37;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q3.m87157i(crashReporter)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i16 |= i36;
            }
            if ((12582912 & i13) == 0) {
                if (c28655q3.m87157i(dispatcherFactory)) {
                    i35 = 8388608;
                } else {
                    i35 = 4194304;
                }
                i16 |= i35;
            }
            if ((100663296 & i13) == 0) {
                if ((i15 & 256) == 0) {
                    interfaceC1585g1 = interfaceC1585g0;
                    if (c28655q3.m87157i(interfaceC1585g1)) {
                        i34 = 67108864;
                    }
                    i16 |= i34;
                } else {
                    interfaceC1585g1 = interfaceC1585g0;
                }
                i34 = AndroidSDKConstants.FLAG_MUTABLE;
                i16 |= i34;
            } else {
                interfaceC1585g1 = interfaceC1585g0;
            }
            i17 = i15 & 512;
            if (i17 != 0) {
                i16 |= 805306368;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & 805306368) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i16 |= i18;
                }
            }
            i19 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i19 != 0) {
                i24 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q3.m87153g(str3)) {
                    i25 = 4;
                } else {
                    i25 = 2;
                }
                i24 = i14 | i25;
            } else {
                i24 = i14;
            }
            i26 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i26 != 0) {
                if ((i14 & 48) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a)) {
                        i27 = 32;
                    } else {
                        i27 = 16;
                    }
                    i24 |= i27;
                }
                if ((i16 & 306783379) == 306783378 || (i24 & 19) != 18) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q3.m87135U(i16 & 1, z14)) {
                    c28655q3.m87140Z();
                    i28 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0 || c28655q3.m87118C()) {
                        if ((i15 & 1) != 0) {
                            route = StrengthTrainerDestination.C10747j.f32796a.getRoute();
                            i16 &= -15;
                        } else {
                            route = str;
                        }
                        if (i44 != 0) {
                            str4 = null;
                        }
                        if ((i15 & 4) != 0) {
                            c12991u0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], c28655q3);
                            i16 &= -897;
                        } else {
                            c12991u0M44439S = c12991u0;
                        }
                        if ((i15 & 256) != 0) {
                            interfaceC1585g3 = (InterfaceC1585g0) c28655q3.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                            i16 &= -234881025;
                        } else {
                            interfaceC1585g3 = interfaceC1585g1;
                        }
                        if (i17 != 0) {
                            z13 = false;
                        }
                        if (i19 != 0) {
                            str8 = null;
                        } else {
                            str8 = str3;
                        }
                        str9 = route;
                        if (i26 != 0) {
                            objM87133R = c28655q3.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C11132l(0);
                                c28655q3.m87172p0(objM87133R);
                            }
                            c12991u0M44439S = c12991u0M44439S;
                            i29 = i16;
                            interfaceC1585g4 = interfaceC1585g3;
                            str10 = str8;
                            z16 = z13;
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            route = str9;
                        } else {
                            i29 = i16;
                            interfaceC1585g4 = interfaceC1585g3;
                            str10 = str8;
                        }
                        c28655q3.m87175r();
                        str11 = str10;
                        c28655q3.m87152f0(-1688186518);
                        c26669a = C29155a.f118017b;
                        if (c26669a == null) {
                            throw new IllegalStateException("KoinApplication has not been started");
                        }
                        c38266c = c26669a.f106046a.f159364d;
                        z17 = z16;
                        interfaceC4339a4 = interfaceC4339a3;
                        str12 = str4;
                        c21647aM114690r = AbstractC36095b.m114690r(c28655q3, -1688186210, c28655q3, false, -3686552);
                        zM87153g = c28655q3.m87153g(null) | c28655q3.m87153g(null);
                        objM87133R2 = c28655q3.m87133R();
                        if (zM87153g || objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                            c28655q3.m87172p0(objM87133R2);
                        }
                        c28655q3.m87173q(false);
                        interfaceC23462h = (InterfaceC23462h) objM87133R2;
                        c28655q3.m87173q(false);
                        interfaceC28601c1M87261o = AbstractC28683x.m87261o(m28173u(interfaceC23462h).getIsExerciseDetailsV2ExperimentEnabled(), c28655q3, 0);
                        AbstractC1638x lifecycle = interfaceC1585g4.getLifecycle();
                        zM87157i = c28655q3.m87157i(interfaceC23462h) | c28655q3.m87157i(interfaceC1585g4);
                        objM87133R3 = c28655q3.m87133R();
                        if (zM87157i || objM87133R3 == c28676v0) {
                            objM87133R3 = new C9790n(4, interfaceC1585g4, interfaceC23462h);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        AbstractC28683x.m87251e(lifecycle, (Function1) objM87133R3, c28655q3);
                        C11140t c11140tM28173u = m28173u(interfaceC23462h);
                        zM87157i2 = c28655q3.m87157i(interfaceC23462h) | c28655q3.m87157i(c12991u0M44439S);
                        objM87133R4 = c28655q3.m87133R();
                        if (zM87157i2 || objM87133R4 == c28676v0) {
                            objM87133R4 = new b(c12991u0M44439S, interfaceC23462h, null);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R4, c11140tM28173u);
                        if (str12 != null) {
                            str13 = "deepLinkEntry";
                        } else {
                            str13 = route;
                        }
                        if ((i29 & 112) == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        InterfaceC1585g0 interfaceC1585g5 = interfaceC1585g4;
                        boolean zM87157i3 = z18 | ((((i29 & 14) ^ 6) <= 4 && c28655q3.m87153g(route)) || (i29 & 6) == 4) | c28655q3.m87157i(c12991u0M44439S) | c28655q3.m87157i(globalNavController);
                        if ((i24 & 14) == 4) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        boolean zM87157i4 = z19 | zM87157i3 | c28655q3.m87157i(analytics) | c28655q3.m87157i(crashReporter) | c28655q3.m87157i(dispatcherFactory) | c28655q3.m87157i(appNavigator) | c28655q3.m87153g(interfaceC28601c1M87261o) | c28655q3.m87157i(interfaceC23462h);
                        if ((i29 & 1879048192) == 536870912) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = zM87157i4 | z24 | ((i24 & 112) == 32);
                        objM87133R5 = c28655q3.m87133R();
                        if (!z25 || objM87133R5 == c28676v0) {
                            interfaceC4339a2 = interfaceC4339a4;
                            z26 = z17;
                            c28655q2 = c28655q3;
                            final String str16 = route;
                            Function1 function1 = new Function1() { // from class: cu2.p
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AbstractC10757a.m28177y(str12, str16, c12991u0M44439S, globalNavController, str11, analytics, crashReporter, dispatcherFactory, appNavigator, interfaceC28601c1M87261o, z26, interfaceC4339a2, interfaceC23462h, (C12987s0) obj);
                                }
                            };
                            str4 = str12;
                            str14 = str16;
                            str15 = str11;
                            c28655q2.m87172p0(function1);
                            objM87133R5 = function1;
                        } else {
                            str15 = str11;
                            z26 = z17;
                            interfaceC4339a2 = interfaceC4339a4;
                            str4 = str12;
                            str14 = route;
                            c28655q2 = c28655q3;
                        }
                        c28655q = c28655q2;
                        AbstractC17269i.m48888e(c12991u0M44439S, str13, null, (Function1) objM87133R5, c28655q, (i29 >> 6) & 14);
                        c12991u1 = c12991u0M44439S;
                        str5 = str14;
                        z15 = z26;
                        interfaceC1585g2 = interfaceC1585g5;
                        str6 = str15;
                    } else {
                        c28655q3.m87138X();
                        if ((i15 & 1) != 0) {
                            i16 &= -15;
                        }
                        if ((i15 & 4) != 0) {
                            i16 &= -897;
                        }
                        if ((i15 & 256) != 0) {
                            i16 &= -234881025;
                        }
                        route = str;
                        c12991u0M44439S = c12991u0;
                        str10 = str3;
                        i29 = i16;
                        interfaceC1585g4 = interfaceC1585g1;
                    }
                    z16 = z13;
                    interfaceC4339a3 = interfaceC4339a;
                    c28655q3.m87175r();
                    str11 = str10;
                    c28655q3.m87152f0(-1688186518);
                    c26669a = C29155a.f118017b;
                    if (c26669a == null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c = c26669a.f106046a.f159364d;
                    z17 = z16;
                    interfaceC4339a4 = interfaceC4339a3;
                    str12 = str4;
                    c21647aM114690r = AbstractC36095b.m114690r(c28655q3, -1688186210, c28655q3, false, -3686552);
                    zM87153g = c28655q3.m87153g(null) | c28655q3.m87153g(null);
                    objM87133R2 = c28655q3.m87133R();
                    if (zM87153g) {
                        objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                        c28655q3.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                        c28655q3.m87172p0(objM87133R2);
                    }
                    c28655q3.m87173q(false);
                    interfaceC23462h = (InterfaceC23462h) objM87133R2;
                    c28655q3.m87173q(false);
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(m28173u(interfaceC23462h).getIsExerciseDetailsV2ExperimentEnabled(), c28655q3, 0);
                    AbstractC1638x lifecycle2 = interfaceC1585g4.getLifecycle();
                    zM87157i = c28655q3.m87157i(interfaceC23462h) | c28655q3.m87157i(interfaceC1585g4);
                    objM87133R3 = c28655q3.m87133R();
                    if (zM87157i) {
                        objM87133R3 = new C9790n(4, interfaceC1585g4, interfaceC23462h);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C9790n(4, interfaceC1585g4, interfaceC23462h);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87251e(lifecycle2, (Function1) objM87133R3, c28655q3);
                    C11140t c11140tM28173u2 = m28173u(interfaceC23462h);
                    zM87157i2 = c28655q3.m87157i(interfaceC23462h) | c28655q3.m87157i(c12991u0M44439S);
                    objM87133R4 = c28655q3.m87133R();
                    if (zM87157i2) {
                        objM87133R4 = new b(c12991u0M44439S, interfaceC23462h, null);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new b(c12991u0M44439S, interfaceC23462h, null);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R4, c11140tM28173u2);
                    if (str12 != null) {
                        str13 = "deepLinkEntry";
                    } else {
                        str13 = route;
                    }
                    if ((i29 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    InterfaceC1585g0 interfaceC1585g6 = interfaceC1585g4;
                    boolean zM87157i5 = z18 | ((((i29 & 14) ^ 6) <= 4 && c28655q3.m87153g(route)) || (i29 & 6) == 4) | c28655q3.m87157i(c12991u0M44439S) | c28655q3.m87157i(globalNavController);
                    if ((i24 & 14) == 4) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    boolean zM87157i6 = z19 | zM87157i5 | c28655q3.m87157i(analytics) | c28655q3.m87157i(crashReporter) | c28655q3.m87157i(dispatcherFactory) | c28655q3.m87157i(appNavigator) | c28655q3.m87153g(interfaceC28601c1M87261o) | c28655q3.m87157i(interfaceC23462h);
                    if ((i29 & 1879048192) == 536870912) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = zM87157i6 | z24 | ((i24 & 112) == 32);
                    objM87133R5 = c28655q3.m87133R();
                    if (z25) {
                        interfaceC4339a2 = interfaceC4339a4;
                        z26 = z17;
                        c28655q2 = c28655q3;
                        final String str17 = route;
                        Function1 function2 = new Function1() { // from class: cu2.p
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC10757a.m28177y(str12, str17, c12991u0M44439S, globalNavController, str11, analytics, crashReporter, dispatcherFactory, appNavigator, interfaceC28601c1M87261o, z26, interfaceC4339a2, interfaceC23462h, (C12987s0) obj);
                            }
                        };
                        str4 = str12;
                        str14 = str17;
                        str15 = str11;
                        c28655q2.m87172p0(function2);
                        objM87133R5 = function2;
                    } else {
                        interfaceC4339a2 = interfaceC4339a4;
                        z26 = z17;
                        c28655q2 = c28655q3;
                        final String str18 = route;
                        Function1 function3 = new Function1() { // from class: cu2.p
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return AbstractC10757a.m28177y(str12, str18, c12991u0M44439S, globalNavController, str11, analytics, crashReporter, dispatcherFactory, appNavigator, interfaceC28601c1M87261o, z26, interfaceC4339a2, interfaceC23462h, (C12987s0) obj);
                            }
                        };
                        str4 = str12;
                        str14 = str18;
                        str15 = str11;
                        c28655q2.m87172p0(function3);
                        objM87133R5 = function3;
                    }
                    c28655q = c28655q2;
                    AbstractC17269i.m48888e(c12991u0M44439S, str13, null, (Function1) objM87133R5, c28655q, (i29 >> 6) & 14);
                    c12991u1 = c12991u0M44439S;
                    str5 = str14;
                    z15 = z26;
                    interfaceC1585g2 = interfaceC1585g6;
                    str6 = str15;
                } else {
                    c28655q3.m87138X();
                    str5 = str;
                    c12991u1 = c12991u0;
                    c28655q = c28655q3;
                    interfaceC1585g2 = interfaceC1585g1;
                    z15 = z13;
                    str6 = str3;
                    interfaceC4339a2 = interfaceC4339a;
                }
                str7 = str4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cu2.q
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC10757a.m28147K(str5, str7, c12991u1, globalNavController, appNavigator, analytics, crashReporter, dispatcherFactory, interfaceC1585g2, z15, str6, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i24 |= 48;
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q3.m87135U(i16 & 1, z14)) {
                c28655q3.m87140Z();
                i28 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    if ((i15 & 1) != 0) {
                        route = StrengthTrainerDestination.C10747j.f32796a.getRoute();
                        i16 &= -15;
                    } else {
                        route = str;
                    }
                    if (i44 != 0) {
                        str4 = null;
                    }
                    if ((i15 & 4) != 0) {
                        c12991u0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], c28655q3);
                        i16 &= -897;
                    } else {
                        c12991u0M44439S = c12991u0;
                    }
                    if ((i15 & 256) != 0) {
                        interfaceC1585g3 = (InterfaceC1585g0) c28655q3.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        i16 &= -234881025;
                    } else {
                        interfaceC1585g3 = interfaceC1585g1;
                    }
                    if (i17 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        str8 = null;
                    } else {
                        str8 = str3;
                    }
                    str9 = route;
                    if (i26 != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C11132l(0);
                            c28655q3.m87172p0(objM87133R);
                        }
                        c12991u0M44439S = c12991u0M44439S;
                        i29 = i16;
                        interfaceC1585g4 = interfaceC1585g3;
                        str10 = str8;
                        z16 = z13;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        route = str9;
                    } else {
                        i29 = i16;
                        interfaceC1585g4 = interfaceC1585g3;
                        str10 = str8;
                        z16 = z13;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                } else {
                    if ((i15 & 1) != 0) {
                        route = StrengthTrainerDestination.C10747j.f32796a.getRoute();
                        i16 &= -15;
                    } else {
                        route = str;
                    }
                    if (i44 != 0) {
                        str4 = null;
                    }
                    if ((i15 & 4) != 0) {
                        c12991u0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], c28655q3);
                        i16 &= -897;
                    } else {
                        c12991u0M44439S = c12991u0;
                    }
                    if ((i15 & 256) != 0) {
                        interfaceC1585g3 = (InterfaceC1585g0) c28655q3.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        i16 &= -234881025;
                    } else {
                        interfaceC1585g3 = interfaceC1585g1;
                    }
                    if (i17 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        str8 = null;
                    } else {
                        str8 = str3;
                    }
                    str9 = route;
                    if (i26 != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C11132l(0);
                            c28655q3.m87172p0(objM87133R);
                        }
                        c12991u0M44439S = c12991u0M44439S;
                        i29 = i16;
                        interfaceC1585g4 = interfaceC1585g3;
                        str10 = str8;
                        z16 = z13;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        route = str9;
                    } else {
                        i29 = i16;
                        interfaceC1585g4 = interfaceC1585g3;
                        str10 = str8;
                        z16 = z13;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                }
                c28655q3.m87175r();
                str11 = str10;
                c28655q3.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a == null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                z17 = z16;
                interfaceC4339a4 = interfaceC4339a3;
                str12 = str4;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q3, -1688186210, c28655q3, false, -3686552);
                zM87153g = c28655q3.m87153g(null) | c28655q3.m87153g(null);
                objM87133R2 = c28655q3.m87133R();
                if (zM87153g) {
                    objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q3.m87172p0(objM87133R2);
                }
                c28655q3.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R2;
                c28655q3.m87173q(false);
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(m28173u(interfaceC23462h).getIsExerciseDetailsV2ExperimentEnabled(), c28655q3, 0);
                AbstractC1638x lifecycle3 = interfaceC1585g4.getLifecycle();
                zM87157i = c28655q3.m87157i(interfaceC23462h) | c28655q3.m87157i(interfaceC1585g4);
                objM87133R3 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C9790n(4, interfaceC1585g4, interfaceC23462h);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C9790n(4, interfaceC1585g4, interfaceC23462h);
                    c28655q3.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87251e(lifecycle3, (Function1) objM87133R3, c28655q3);
                C11140t c11140tM28173u3 = m28173u(interfaceC23462h);
                zM87157i2 = c28655q3.m87157i(interfaceC23462h) | c28655q3.m87157i(c12991u0M44439S);
                objM87133R4 = c28655q3.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new b(c12991u0M44439S, interfaceC23462h, null);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new b(c12991u0M44439S, interfaceC23462h, null);
                    c28655q3.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R4, c11140tM28173u3);
                if (str12 != null) {
                    str13 = "deepLinkEntry";
                } else {
                    str13 = route;
                }
                if ((i29 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                InterfaceC1585g0 interfaceC1585g7 = interfaceC1585g4;
                boolean zM87157i7 = z18 | ((((i29 & 14) ^ 6) <= 4 && c28655q3.m87153g(route)) || (i29 & 6) == 4) | c28655q3.m87157i(c12991u0M44439S) | c28655q3.m87157i(globalNavController);
                if ((i24 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean zM87157i8 = z19 | zM87157i7 | c28655q3.m87157i(analytics) | c28655q3.m87157i(crashReporter) | c28655q3.m87157i(dispatcherFactory) | c28655q3.m87157i(appNavigator) | c28655q3.m87153g(interfaceC28601c1M87261o) | c28655q3.m87157i(interfaceC23462h);
                if ((i29 & 1879048192) == 536870912) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87157i8 | z24 | ((i24 & 112) == 32);
                objM87133R5 = c28655q3.m87133R();
                if (z25) {
                    interfaceC4339a2 = interfaceC4339a4;
                    z26 = z17;
                    c28655q2 = c28655q3;
                    final String str19 = route;
                    Function1 function4 = new Function1() { // from class: cu2.p
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC10757a.m28177y(str12, str19, c12991u0M44439S, globalNavController, str11, analytics, crashReporter, dispatcherFactory, appNavigator, interfaceC28601c1M87261o, z26, interfaceC4339a2, interfaceC23462h, (C12987s0) obj);
                        }
                    };
                    str4 = str12;
                    str14 = str19;
                    str15 = str11;
                    c28655q2.m87172p0(function4);
                    objM87133R5 = function4;
                } else {
                    interfaceC4339a2 = interfaceC4339a4;
                    z26 = z17;
                    c28655q2 = c28655q3;
                    final String str110 = route;
                    Function1 function5 = new Function1() { // from class: cu2.p
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC10757a.m28177y(str12, str110, c12991u0M44439S, globalNavController, str11, analytics, crashReporter, dispatcherFactory, appNavigator, interfaceC28601c1M87261o, z26, interfaceC4339a2, interfaceC23462h, (C12987s0) obj);
                        }
                    };
                    str4 = str12;
                    str14 = str110;
                    str15 = str11;
                    c28655q2.m87172p0(function5);
                    objM87133R5 = function5;
                }
                c28655q = c28655q2;
                AbstractC17269i.m48888e(c12991u0M44439S, str13, null, (Function1) objM87133R5, c28655q, (i29 >> 6) & 14);
                c12991u1 = c12991u0M44439S;
                str5 = str14;
                z15 = z26;
                interfaceC1585g2 = interfaceC1585g7;
                str6 = str15;
            } else {
                c28655q3.m87138X();
                str5 = str;
                c12991u1 = c12991u0;
                c28655q = c28655q3;
                interfaceC1585g2 = interfaceC1585g1;
                z15 = z13;
                str6 = str3;
                interfaceC4339a2 = interfaceC4339a;
            }
            str7 = str4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cu2.q
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC10757a.m28147K(str5, str7, c12991u1, globalNavController, appNavigator, analytics, crashReporter, dispatcherFactory, interfaceC1585g2, z15, str6, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 48;
        str4 = str2;
        if ((i13 & 384) != 0) {
            i16 |= ((i15 & 4) == 0 || !c28655q3.m87157i(c12991u0)) ? 128 : 256;
        }
        if ((i13 & 3072) == 0) {
            if (c28655q3.m87157i(globalNavController)) {
                i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i39 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 |= i39;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q3.m87157i(appNavigator)) {
                i38 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i38 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i16 |= i38;
        }
        if ((196608 & i13) == 0) {
            if (c28655q3.m87157i(analytics)) {
                i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i37 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 |= i37;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q3.m87157i(crashReporter)) {
                i36 = 1048576;
            } else {
                i36 = 524288;
            }
            i16 |= i36;
        }
        if ((12582912 & i13) == 0) {
            if (c28655q3.m87157i(dispatcherFactory)) {
                i35 = 8388608;
            } else {
                i35 = 4194304;
            }
            i16 |= i35;
        }
        if ((100663296 & i13) == 0) {
            if ((i15 & 256) == 0) {
                interfaceC1585g1 = interfaceC1585g0;
                if (c28655q3.m87157i(interfaceC1585g1)) {
                    i34 = 67108864;
                }
                i16 |= i34;
            } else {
                interfaceC1585g1 = interfaceC1585g0;
            }
            i34 = AndroidSDKConstants.FLAG_MUTABLE;
            i16 |= i34;
        } else {
            interfaceC1585g1 = interfaceC1585g0;
        }
        i17 = i15 & 512;
        if (i17 != 0) {
            i16 |= 805306368;
            z13 = z4;
        } else {
            z13 = z4;
            if ((i13 & 805306368) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i16 |= i18;
            }
        }
        i19 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i19 != 0) {
            i24 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q3.m87153g(str3)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i24 = i14 | i25;
        } else {
            i24 = i14;
        }
        i26 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i26 != 0) {
            if ((i14 & 48) == 0) {
                if (c28655q3.m87157i(interfaceC4339a)) {
                    i27 = 32;
                } else {
                    i27 = 16;
                }
                i24 |= i27;
            }
            if ((i16 & 306783379) == 306783378) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (c28655q3.m87135U(i16 & 1, z14)) {
                c28655q3.m87140Z();
                i28 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    if ((i15 & 1) != 0) {
                        route = StrengthTrainerDestination.C10747j.f32796a.getRoute();
                        i16 &= -15;
                    } else {
                        route = str;
                    }
                    if (i44 != 0) {
                        str4 = null;
                    }
                    if ((i15 & 4) != 0) {
                        c12991u0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], c28655q3);
                        i16 &= -897;
                    } else {
                        c12991u0M44439S = c12991u0;
                    }
                    if ((i15 & 256) != 0) {
                        interfaceC1585g3 = (InterfaceC1585g0) c28655q3.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        i16 &= -234881025;
                    } else {
                        interfaceC1585g3 = interfaceC1585g1;
                    }
                    if (i17 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        str8 = null;
                    } else {
                        str8 = str3;
                    }
                    str9 = route;
                    if (i26 != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C11132l(0);
                            c28655q3.m87172p0(objM87133R);
                        }
                        c12991u0M44439S = c12991u0M44439S;
                        i29 = i16;
                        interfaceC1585g4 = interfaceC1585g3;
                        str10 = str8;
                        z16 = z13;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        route = str9;
                    } else {
                        i29 = i16;
                        interfaceC1585g4 = interfaceC1585g3;
                        str10 = str8;
                        z16 = z13;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                } else {
                    if ((i15 & 1) != 0) {
                        route = StrengthTrainerDestination.C10747j.f32796a.getRoute();
                        i16 &= -15;
                    } else {
                        route = str;
                    }
                    if (i44 != 0) {
                        str4 = null;
                    }
                    if ((i15 & 4) != 0) {
                        c12991u0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], c28655q3);
                        i16 &= -897;
                    } else {
                        c12991u0M44439S = c12991u0;
                    }
                    if ((i15 & 256) != 0) {
                        interfaceC1585g3 = (InterfaceC1585g0) c28655q3.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                        i16 &= -234881025;
                    } else {
                        interfaceC1585g3 = interfaceC1585g1;
                    }
                    if (i17 != 0) {
                        z13 = false;
                    }
                    if (i19 != 0) {
                        str8 = null;
                    } else {
                        str8 = str3;
                    }
                    str9 = route;
                    if (i26 != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C11132l(0);
                            c28655q3.m87172p0(objM87133R);
                        }
                        c12991u0M44439S = c12991u0M44439S;
                        i29 = i16;
                        interfaceC1585g4 = interfaceC1585g3;
                        str10 = str8;
                        z16 = z13;
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        route = str9;
                    } else {
                        i29 = i16;
                        interfaceC1585g4 = interfaceC1585g3;
                        str10 = str8;
                        z16 = z13;
                        interfaceC4339a3 = interfaceC4339a;
                    }
                }
                c28655q3.m87175r();
                str11 = str10;
                c28655q3.m87152f0(-1688186518);
                c26669a = C29155a.f118017b;
                if (c26669a == null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                z17 = z16;
                interfaceC4339a4 = interfaceC4339a3;
                str12 = str4;
                c21647aM114690r = AbstractC36095b.m114690r(c28655q3, -1688186210, c28655q3, false, -3686552);
                zM87153g = c28655q3.m87153g(null) | c28655q3.m87153g(null);
                objM87133R2 = c28655q3.m87133R();
                if (zM87153g) {
                    objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q3.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                    c28655q3.m87172p0(objM87133R2);
                }
                c28655q3.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R2;
                c28655q3.m87173q(false);
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(m28173u(interfaceC23462h).getIsExerciseDetailsV2ExperimentEnabled(), c28655q3, 0);
                AbstractC1638x lifecycle4 = interfaceC1585g4.getLifecycle();
                zM87157i = c28655q3.m87157i(interfaceC23462h) | c28655q3.m87157i(interfaceC1585g4);
                objM87133R3 = c28655q3.m87133R();
                if (zM87157i) {
                    objM87133R3 = new C9790n(4, interfaceC1585g4, interfaceC23462h);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C9790n(4, interfaceC1585g4, interfaceC23462h);
                    c28655q3.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87251e(lifecycle4, (Function1) objM87133R3, c28655q3);
                C11140t c11140tM28173u4 = m28173u(interfaceC23462h);
                zM87157i2 = c28655q3.m87157i(interfaceC23462h) | c28655q3.m87157i(c12991u0M44439S);
                objM87133R4 = c28655q3.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new b(c12991u0M44439S, interfaceC23462h, null);
                    c28655q3.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new b(c12991u0M44439S, interfaceC23462h, null);
                    c28655q3.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R4, c11140tM28173u4);
                if (str12 != null) {
                    str13 = "deepLinkEntry";
                } else {
                    str13 = route;
                }
                if ((i29 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                InterfaceC1585g0 interfaceC1585g8 = interfaceC1585g4;
                boolean zM87157i9 = z18 | ((((i29 & 14) ^ 6) <= 4 && c28655q3.m87153g(route)) || (i29 & 6) == 4) | c28655q3.m87157i(c12991u0M44439S) | c28655q3.m87157i(globalNavController);
                if ((i24 & 14) == 4) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                boolean zM87157i10 = z19 | zM87157i9 | c28655q3.m87157i(analytics) | c28655q3.m87157i(crashReporter) | c28655q3.m87157i(dispatcherFactory) | c28655q3.m87157i(appNavigator) | c28655q3.m87153g(interfaceC28601c1M87261o) | c28655q3.m87157i(interfaceC23462h);
                if ((i29 & 1879048192) == 536870912) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                z25 = zM87157i10 | z24 | ((i24 & 112) == 32);
                objM87133R5 = c28655q3.m87133R();
                if (z25) {
                    interfaceC4339a2 = interfaceC4339a4;
                    z26 = z17;
                    c28655q2 = c28655q3;
                    final String str111 = route;
                    Function1 function6 = new Function1() { // from class: cu2.p
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC10757a.m28177y(str12, str111, c12991u0M44439S, globalNavController, str11, analytics, crashReporter, dispatcherFactory, appNavigator, interfaceC28601c1M87261o, z26, interfaceC4339a2, interfaceC23462h, (C12987s0) obj);
                        }
                    };
                    str4 = str12;
                    str14 = str111;
                    str15 = str11;
                    c28655q2.m87172p0(function6);
                    objM87133R5 = function6;
                } else {
                    interfaceC4339a2 = interfaceC4339a4;
                    z26 = z17;
                    c28655q2 = c28655q3;
                    final String str112 = route;
                    Function1 function7 = new Function1() { // from class: cu2.p
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC10757a.m28177y(str12, str112, c12991u0M44439S, globalNavController, str11, analytics, crashReporter, dispatcherFactory, appNavigator, interfaceC28601c1M87261o, z26, interfaceC4339a2, interfaceC23462h, (C12987s0) obj);
                        }
                    };
                    str4 = str12;
                    str14 = str112;
                    str15 = str11;
                    c28655q2.m87172p0(function7);
                    objM87133R5 = function7;
                }
                c28655q = c28655q2;
                AbstractC17269i.m48888e(c12991u0M44439S, str13, null, (Function1) objM87133R5, c28655q, (i29 >> 6) & 14);
                c12991u1 = c12991u0M44439S;
                str5 = str14;
                z15 = z26;
                interfaceC1585g2 = interfaceC1585g8;
                str6 = str15;
            } else {
                c28655q3.m87138X();
                str5 = str;
                c12991u1 = c12991u0;
                c28655q = c28655q3;
                interfaceC1585g2 = interfaceC1585g1;
                z15 = z13;
                str6 = str3;
                interfaceC4339a2 = interfaceC4339a;
            }
            str7 = str4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cu2.q
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC10757a.m28147K(str5, str7, c12991u1, globalNavController, appNavigator, analytics, crashReporter, dispatcherFactory, interfaceC1585g2, z15, str6, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i24 |= 48;
        if ((i16 & 306783379) == 306783378) {
            z14 = true;
        } else {
            z14 = true;
        }
        if (c28655q3.m87135U(i16 & 1, z14)) {
            c28655q3.m87140Z();
            i28 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                if ((i15 & 1) != 0) {
                    route = StrengthTrainerDestination.C10747j.f32796a.getRoute();
                    i16 &= -15;
                } else {
                    route = str;
                }
                if (i44 != 0) {
                    str4 = null;
                }
                if ((i15 & 4) != 0) {
                    c12991u0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], c28655q3);
                    i16 &= -897;
                } else {
                    c12991u0M44439S = c12991u0;
                }
                if ((i15 & 256) != 0) {
                    interfaceC1585g3 = (InterfaceC1585g0) c28655q3.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    i16 &= -234881025;
                } else {
                    interfaceC1585g3 = interfaceC1585g1;
                }
                if (i17 != 0) {
                    z13 = false;
                }
                if (i19 != 0) {
                    str8 = null;
                } else {
                    str8 = str3;
                }
                str9 = route;
                if (i26 != 0) {
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C11132l(0);
                        c28655q3.m87172p0(objM87133R);
                    }
                    c12991u0M44439S = c12991u0M44439S;
                    i29 = i16;
                    interfaceC1585g4 = interfaceC1585g3;
                    str10 = str8;
                    z16 = z13;
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    route = str9;
                } else {
                    i29 = i16;
                    interfaceC1585g4 = interfaceC1585g3;
                    str10 = str8;
                    z16 = z13;
                    interfaceC4339a3 = interfaceC4339a;
                }
            } else {
                if ((i15 & 1) != 0) {
                    route = StrengthTrainerDestination.C10747j.f32796a.getRoute();
                    i16 &= -15;
                } else {
                    route = str;
                }
                if (i44 != 0) {
                    str4 = null;
                }
                if ((i15 & 4) != 0) {
                    c12991u0M44439S = AbstractC15751g.m44439S(new AbstractC12964i1[0], c28655q3);
                    i16 &= -897;
                } else {
                    c12991u0M44439S = c12991u0;
                }
                if ((i15 & 256) != 0) {
                    interfaceC1585g3 = (InterfaceC1585g0) c28655q3.m87161k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
                    i16 &= -234881025;
                } else {
                    interfaceC1585g3 = interfaceC1585g1;
                }
                if (i17 != 0) {
                    z13 = false;
                }
                if (i19 != 0) {
                    str8 = null;
                } else {
                    str8 = str3;
                }
                str9 = route;
                if (i26 != 0) {
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C11132l(0);
                        c28655q3.m87172p0(objM87133R);
                    }
                    c12991u0M44439S = c12991u0M44439S;
                    i29 = i16;
                    interfaceC1585g4 = interfaceC1585g3;
                    str10 = str8;
                    z16 = z13;
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    route = str9;
                } else {
                    i29 = i16;
                    interfaceC1585g4 = interfaceC1585g3;
                    str10 = str8;
                    z16 = z13;
                    interfaceC4339a3 = interfaceC4339a;
                }
            }
            c28655q3.m87175r();
            str11 = str10;
            c28655q3.m87152f0(-1688186518);
            c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            z17 = z16;
            interfaceC4339a4 = interfaceC4339a3;
            str12 = str4;
            c21647aM114690r = AbstractC36095b.m114690r(c28655q3, -1688186210, c28655q3, false, -3686552);
            zM87153g = c28655q3.m87153g(null) | c28655q3.m87153g(null);
            objM87133R2 = c28655q3.m87133R();
            if (zM87153g) {
                objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q3.m87172p0(objM87133R2);
            } else {
                objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q3.m87172p0(objM87133R2);
            }
            c28655q3.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) objM87133R2;
            c28655q3.m87173q(false);
            interfaceC28601c1M87261o = AbstractC28683x.m87261o(m28173u(interfaceC23462h).getIsExerciseDetailsV2ExperimentEnabled(), c28655q3, 0);
            AbstractC1638x lifecycle5 = interfaceC1585g4.getLifecycle();
            zM87157i = c28655q3.m87157i(interfaceC23462h) | c28655q3.m87157i(interfaceC1585g4);
            objM87133R3 = c28655q3.m87133R();
            if (zM87157i) {
                objM87133R3 = new C9790n(4, interfaceC1585g4, interfaceC23462h);
                c28655q3.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C9790n(4, interfaceC1585g4, interfaceC23462h);
                c28655q3.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87251e(lifecycle5, (Function1) objM87133R3, c28655q3);
            C11140t c11140tM28173u5 = m28173u(interfaceC23462h);
            zM87157i2 = c28655q3.m87157i(interfaceC23462h) | c28655q3.m87157i(c12991u0M44439S);
            objM87133R4 = c28655q3.m87133R();
            if (zM87157i2) {
                objM87133R4 = new b(c12991u0M44439S, interfaceC23462h, null);
                c28655q3.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new b(c12991u0M44439S, interfaceC23462h, null);
                c28655q3.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R4, c11140tM28173u5);
            if (str12 != null) {
                str13 = "deepLinkEntry";
            } else {
                str13 = route;
            }
            if ((i29 & 112) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            InterfaceC1585g0 interfaceC1585g9 = interfaceC1585g4;
            boolean zM87157i11 = z18 | ((((i29 & 14) ^ 6) <= 4 && c28655q3.m87153g(route)) || (i29 & 6) == 4) | c28655q3.m87157i(c12991u0M44439S) | c28655q3.m87157i(globalNavController);
            if ((i24 & 14) == 4) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean zM87157i12 = z19 | zM87157i11 | c28655q3.m87157i(analytics) | c28655q3.m87157i(crashReporter) | c28655q3.m87157i(dispatcherFactory) | c28655q3.m87157i(appNavigator) | c28655q3.m87153g(interfaceC28601c1M87261o) | c28655q3.m87157i(interfaceC23462h);
            if ((i29 & 1879048192) == 536870912) {
                z24 = true;
            } else {
                z24 = false;
            }
            z25 = zM87157i12 | z24 | ((i24 & 112) == 32);
            objM87133R5 = c28655q3.m87133R();
            if (z25) {
                interfaceC4339a2 = interfaceC4339a4;
                z26 = z17;
                c28655q2 = c28655q3;
                final String str113 = route;
                Function1 function8 = new Function1() { // from class: cu2.p
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC10757a.m28177y(str12, str113, c12991u0M44439S, globalNavController, str11, analytics, crashReporter, dispatcherFactory, appNavigator, interfaceC28601c1M87261o, z26, interfaceC4339a2, interfaceC23462h, (C12987s0) obj);
                    }
                };
                str4 = str12;
                str14 = str113;
                str15 = str11;
                c28655q2.m87172p0(function8);
                objM87133R5 = function8;
            } else {
                interfaceC4339a2 = interfaceC4339a4;
                z26 = z17;
                c28655q2 = c28655q3;
                final String str114 = route;
                Function1 function9 = new Function1() { // from class: cu2.p
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC10757a.m28177y(str12, str114, c12991u0M44439S, globalNavController, str11, analytics, crashReporter, dispatcherFactory, appNavigator, interfaceC28601c1M87261o, z26, interfaceC4339a2, interfaceC23462h, (C12987s0) obj);
                    }
                };
                str4 = str12;
                str14 = str114;
                str15 = str11;
                c28655q2.m87172p0(function9);
                objM87133R5 = function9;
            }
            c28655q = c28655q2;
            AbstractC17269i.m48888e(c12991u0M44439S, str13, null, (Function1) objM87133R5, c28655q, (i29 >> 6) & 14);
            c12991u1 = c12991u0M44439S;
            str5 = str14;
            z15 = z26;
            interfaceC1585g2 = interfaceC1585g9;
            str6 = str15;
        } else {
            c28655q3.m87138X();
            str5 = str;
            c12991u1 = c12991u0;
            c28655q = c28655q3;
            interfaceC1585g2 = interfaceC1585g1;
            z15 = z13;
            str6 = str3;
            interfaceC4339a2 = interfaceC4339a;
        }
        str7 = str4;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: cu2.q
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC10757a.m28147K(str5, str7, c12991u1, globalNavController, appNavigator, analytics, crashReporter, dispatcherFactory, interfaceC1585g2, z15, str6, interfaceC4339a2, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m28172t() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C11140t m28173u(InterfaceC23462h interfaceC23462h) {
        return (C11140t) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: v */
    private static final boolean m28174v(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final InterfaceC28620h0 m28175w(InterfaceC1585g0 interfaceC1585g0, InterfaceC23462h interfaceC23462h, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C11138r c11138r = new C11138r(interfaceC23462h, 0);
        interfaceC1585g0.getLifecycle().mo4986a(c11138r);
        return new d(interfaceC1585g0, c11138r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m28176x(InterfaceC23462h interfaceC23462h, InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<unused var>");
        AbstractC22676k.m65750j(event, "event");
        if (event == EnumC1632v.ON_START) {
            m28173u(interfaceC23462h).m30106o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m28177y(String str, String str2, C12991u0 c12991u0, AbstractC12939a0 abstractC12939a0, String str3, InterfaceC14515a interfaceC14515a, InterfaceC31766c interfaceC31766c, InterfaceC18732d interfaceC18732d, InterfaceC21159o0 interfaceC21159o0, InterfaceC28670t2 interfaceC28670t2, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC23462h interfaceC23462h, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "deepLinkEntry", null, new C37816b(new C0542f(str, str2, c12991u0, 10), true, -1708304643), 6);
        m28150N(NavHost, StrengthTrainerDestination.C10747j.f32796a, new C37816b(new C11139s(c12991u0, abstractC12939a0, str3, interfaceC14515a, interfaceC31766c, interfaceC18732d, interfaceC21159o0, 0), true, -1427718554));
        m28150N(NavHost, StrengthTrainerDestination.C10743f.f32781a, new C37816b(new C11134n(c12991u0, 1), true, -979602969));
        m28150N(NavHost, StrengthTrainerDestination.C10745h.f32788a, new C37816b(new C0542f(c12991u0, abstractC12939a0, interfaceC28670t2, 9), true, -531487384));
        m28150N(NavHost, StrengthTrainerDestination.C10742e.f32774a, new C37816b(new C11133m(c12991u0, abstractC12939a0, interfaceC21159o0, interfaceC14515a), true, -83371799));
        m28150N(NavHost, StrengthTrainerDestination.C10741d.f32764a, new C37816b(new C2026r(c12991u0, abstractC12939a0, interfaceC21159o0, interfaceC28670t2, 3), true, 364743786));
        m28150N(NavHost, StrengthTrainerDestination.C10746i.f32793a, new C37816b(new C22931l(13, c12991u0, interfaceC28670t2), true, 812859371));
        m28150N(NavHost, StrengthTrainerDestination.C10740c.f32762a, new C37816b(new C11134n(c12991u0, 0), true, -512904893));
        m28150N(NavHost, StrengthTrainerDestination.C10738a.f32750a, new C37816b(new C11135o(c12991u0, interfaceC21159o0, z4, interfaceC4339a, interfaceC23462h, interfaceC28670t2), true, 1709090541));
        m28150N(NavHost, StrengthTrainerDestination.C10744g.f32784a, new C37816b(new C11133m(interfaceC14515a, c12991u0, abstractC12939a0, interfaceC21159o0), true, -2137761170));
        StrengthTrainerDestination.C10739b c10739b = StrengthTrainerDestination.C10739b.f32758a;
        AbstractC12889b.m36291u(NavHost, c10739b.getRoute(), c10739b.getArguments(), new C37816b(new C2026r(c12991u0, abstractC12939a0, interfaceC14515a, interfaceC28670t2, 4), true, 416691770), 4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m28178z(String str, String str2, C12991u0 c12991u0, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(str) | c28655q.m87153g(str2) | c28655q.m87157i(c12991u0);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new c(str, str2, c12991u0, null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87254h(str, str2, (InterfaceC4351m) objM87133R, c28655q);
        return C23454a0.f92919a;
    }
}
