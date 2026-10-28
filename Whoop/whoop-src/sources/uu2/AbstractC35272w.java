package uu2;

import a81.AbstractC0564o;
import a81.InterfaceC0569t;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.input.nestedscroll.AbstractC1129a;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.C1601k1;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2646w1;
import b91.EnumC2888c;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.weightlifting.StrengthTrainerDestination;
import cu2.AbstractC11128h;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import dp0.AbstractC12252h;
import dp0.InterfaceC12251g;
import e51.AbstractC12736l;
import e51.C12738n;
import ep0.C13404j;
import eu2.AbstractC13653j;
import fi0.InterfaceC14515a;
import gb1.AbstractC15673b0;
import gf1.C15784c;
import gf1.C15791j;
import io.sentry.config.AbstractC20301a;
import j02.InterfaceC21159o0;
import j93.InterfaceC21461d;
import java.util.Map;
import jf3.C21647a;
import l51.AbstractC23354d;
import l51.AbstractC23355e;
import l51.C23351a;
import l51.C23356f;
import l51.C23357g;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ov2.C28398b;
import ov2.C28401e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p163g1.C15092n6;
import p163g1.EnumC15030h6;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p315m0.AbstractC24868a;
import p329n0.C26068u;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import p72.C28958a;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;
import p733ry2.C31915d;
import p733ry2.C31918g;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p739ui0.C35015q;
import pf3.C29155a;
import pp2.C29440d;
import q12.C29802c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qi0.C30406a;
import r83.EnumC31071a;
import re1.C31324k;
import s32.C32110b;
import s32.C32115g;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import se.AbstractC32416g;
import uk2.C35051a;
import ut2.C35231a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import xf3.C38266c;
import yv2.AbstractC39811e;

/* JADX INFO: renamed from: uu2.w */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001aw\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0083\u0001\u0010#\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b#\u0010$\u001a+\u0010&\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020%2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0010H\u0003¢\u0006\u0004\b&\u0010'\"\u001f\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00067²\u0006\f\u00103\u001a\u0002028\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\u000e\u00104\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00106\u001a\u0004\u0018\u0001058\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;", "navArgs", "Leb/a0;", "navController", "globalNavController", "Lj02/o0;", "appNavigator", "Lfi0/a;", "analytics", "Lkotlin/Function0;", "Ll83/a0;", "onGoBack", "J", "(Lcom/whoop/weightlifting/StrengthTrainerDestination$e$a;Leb/a0;Leb/a0;Lj02/o0;Lfi0/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Luu2/y;", "viewState", "Lkotlin/Function1;", "Luu2/p;", "onEvent", "Lcom/whoop/navigation/e;", "onNavigationAction", "", "showSelectExerciseCta", "onSelectExercise", "Landroidx/compose/ui/Modifier;", "modifier", "Lqi0/a;", "actionRouter", "analyticsWriter", "V", "(Luu2/y;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLc93/a;Landroidx/compose/ui/Modifier;Lqi0/a;Lfi0/a;Landroidx/compose/runtime/Composer;II)V", "Luu2/o;", "content", "deleteCustomExerciseFailed", "dismissPresentedModal", "u", "(Luu2/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLc93/a;ZZLqi0/a;Lfi0/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Luu2/j0;", "D", "(Luu2/j0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lp1/t1;", "a", "Lp1/t1;", "getLocalExerciseDetailsGenericActionRouter", "()Lp1/t1;", "LocalExerciseDetailsGenericActionRouter", "Lm91/p;", "b", "Lm91/p;", "exerciseDetailsV2ItemFactory", "Luu2/x;", "viewModel", "deleteBackNavConsumed", "Lcom/whoop/design/models/modal/AnyModal;", "presentedModal", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35272w {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f150088a = new C28674u2(new C35231a(9));

    /* JADX INFO: renamed from: b */
    private static final C25307p f150089b = Function1.m74306g(new C35051a(16));

    /* JADX INFO: renamed from: uu2.w$a */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2ScreenKt$ExerciseDetailsV2ContentScreen$1$1", m100430f = "ExerciseDetailsV2Screen.kt", m100431l = {239}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150090w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f150091x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15092n6 f150092y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f150093z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, C15092n6 c15092n6, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150091x = z4;
            this.f150092y = c15092n6;
            this.f150093z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f150091x, this.f150092y, this.f150093z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150090w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (this.f150091x) {
                    C15092n6 c15092n6 = this.f150092y;
                    String str = this.f150093z;
                    this.f150090w = 1;
                    if (c15092n6.m43161a(str, EnumC15030h6.f56261w, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: uu2.w$b */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2ScreenKt$ExerciseDetailsV2ContentScreen$2$1", m100430f = "ExerciseDetailsV2Screen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150094w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f150095x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f150096y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150095x = z4;
            this.f150096y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f150095x, this.f150096y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150094w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f150095x) {
                AbstractC35272w.m111920x(this.f150096y, null);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uu2.w$c */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2ScreenKt$ExerciseDetailsV2FullScreenModal$1$4$1", m100430f = "ExerciseDetailsV2Screen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150097w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35258j0 f150098x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f150099y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C35258j0 c35258j0, p715kotlin.jvm.functions.Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150098x = c35258j0;
            this.f150099y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f150098x, this.f150099y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150097w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC35243c interfaceC35243cM111736h = this.f150098x.getFollowUpEvent();
            if (interfaceC35243cM111736h != null) {
                AbstractC35272w.m111870E(this.f150099y, interfaceC35243cM111736h);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uu2.w$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f150100w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f150101x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f150102y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f150103z;

        /* JADX INFO: renamed from: uu2.w$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f150104w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f150104w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f150104w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f150100w = c38266c;
            this.f150101x = interfaceC35951a;
            this.f150102y = interfaceC4339a;
            this.f150103z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, uu2.x] */
        @Override // c93.InterfaceC4339a
        public final C35273x invoke() {
            return AbstractC21598x.m60668X(this.f150100w, this.f150101x, new a(this.f150103z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35273x.class), null, this.f150102y);
        }
    }

    /* JADX INFO: renamed from: uu2.w$e */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2ScreenKt$ExerciseDetailsV2Screen$3$1", m100430f = "ExerciseDetailsV2Screen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC23462h f150105E;

        /* JADX INFO: renamed from: w */
        int f150106w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f150107x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ StrengthTrainerDestination.C10742e.a f150108y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f150109z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(StrengthTrainerDestination.C10742e.a aVar, InterfaceC4339a interfaceC4339a, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150108y = aVar;
            this.f150109z = interfaceC4339a;
            this.f150105E = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f150108y, this.f150109z, this.f150105E, interfaceC30057d);
            eVar.f150107x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150106w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String exerciseId = this.f150108y.getExerciseId();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (exerciseId == null) {
                this.f150109z.invoke();
                return c23454a0;
            }
            AbstractC35272w.m111881P(this.f150105E).m111927n(new InterfaceC35265p.d(exerciseId, this.f150108y.getEntryPointType(), this.f150108y.getAnalyticsEntryPoint()));
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: uu2.w$f */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2ScreenKt$ExerciseDetailsV2Screen$4$1", m100430f = "ExerciseDetailsV2Screen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150110w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC12939a0 f150111x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ StrengthTrainerDestination.C10742e.a f150112y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f150113z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC12939a0 abstractC12939a0, StrengthTrainerDestination.C10742e.a aVar, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150111x = abstractC12939a0;
            this.f150112y = aVar;
            this.f150113z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f150111x, this.f150112y, this.f150113z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C1601k1 c1601k1M36480b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150110w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12982q c12982qM36393h = this.f150111x.m36393h();
            if (c12982qM36393h != null && (c1601k1M36480b = c12982qM36393h.m36480b()) != null) {
                StrengthTrainerDestination.C10742e.a aVar = this.f150112y;
                InterfaceC23462h interfaceC23462h = this.f150113z;
                String str = (String) c1601k1M36480b.m5001b("exerciseDetailsRefresh");
                if (str != null) {
                    AbstractC35272w.m111881P(interfaceC23462h).m111927n(new InterfaceC35265p.d(str, aVar.getEntryPointType(), aVar.getAnalyticsEntryPoint()));
                    c1601k1M36480b.m5003d("exerciseDetailsRefresh");
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: uu2.w$g */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.builder.details.ExerciseDetailsV2ScreenKt$ExerciseDetailsV2Screen$5$1", m100430f = "ExerciseDetailsV2Screen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150114w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f150115x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f150116y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f150117z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p715kotlin.jvm.functions.Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150115x = function1;
            this.f150116y = interfaceC28670t2;
            this.f150117z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f150115x, this.f150116y, this.f150117z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f150114w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AbstractC35272w.m111882Q(this.f150116y).getNavigateBackAfterSuccessfulDelete()) {
                AbstractC35272w.m111878M(this.f150117z, false);
            } else if (!AbstractC35272w.m111886U(this.f150117z)) {
                AbstractC35272w.m111878M(this.f150117z, true);
                this.f150115x.invoke(InterfaceC35265p.c.f150047a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m111866A(C30406a c30406a, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, p715kotlin.jvm.functions.Function1 function3, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof GenericInteraction) {
            C35266q.f150053a.m111850j(c30406a, event, function1, function2, function3);
        } else if (event instanceof C9598e) {
            function3.invoke(event);
        } else if (event instanceof C23351a) {
            function2.invoke(InterfaceC35265p.c.f150047a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m111867B(C30406a c30406a, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, p715kotlin.jvm.functions.Function1 function3, Object it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC35268s.m111865g(it, c30406a, function1, function2, function3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m111868C(C30406a c30406a, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, p715kotlin.jvm.functions.Function1 function3, InterfaceC0569t it) {
        AbstractC22676k.m65750j(it, "it");
        C35266q.f150053a.m111845c(it, c30406a, function1, function2, function3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final void m111869D(C35258j0 c35258j0, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13) {
        int i14;
        p715kotlin.jvm.functions.Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-170964225);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c35258j0) : c28655q.m87157i(c35258j0) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = c35258j0.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-632866613);
                TextResource textResourceMo105309c = c35258j0.getType().getTitle();
                boolean z13 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c35258j0))) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C35255i(c35258j0, function1, 3);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceMo105309c, 0L, (InterfaceC4339a) objM87133R, 2, null), c35258j0.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                function2 = function1;
            } else {
                c28655q.m87150e0(-632535595);
                int i15 = i14;
                AbstractC33208p0 abstractC33208p0M111743o = c35258j0.getType();
                TextResource textResourceM111742n = c35258j0.getSupportText();
                TextResource textResourceM111737i = c35258j0.getPrimaryButtonText();
                TextResource textResourceM111739k = c35258j0.getSecondaryButtonText();
                boolean zM111741m = c35258j0.getShowSecondaryButton();
                int i16 = i15 & 112;
                boolean zM87157i = c28655q.m87157i(c35258j0) | (i16 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C35255i(c35258j0, function1, 4);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean zM87157i2 = c28655q.m87157i(c35258j0) | (i16 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C35255i(c35258j0, function1, 5);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                int i17 = AbstractC33208p0.f138461d;
                int i18 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M111743o, textResourceM111742n, null, textResourceM111737i, interfaceC4339a, zM111741m, false, textResourceM111739k, interfaceC4339a2, null, false, false, c28655q, i17 | (i18 << 3) | (i18 << 9) | (i18 << 21), 0, 3652);
                InterfaceC35243c interfaceC35243cM111736h = c35258j0.getFollowUpEvent();
                boolean zM87157i3 = c28655q.m87157i(c35258j0) | (i16 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i3 || objM87133R4 == c28676v0) {
                    function2 = function1;
                    objM87133R4 = new c(c35258j0, function2, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    function2 = function1;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, interfaceC35243cM111736h);
                c28655q.m87173q(false);
            }
        } else {
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35257j(c35258j0, function2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m111870E(p715kotlin.jvm.functions.Function1 function1, InterfaceC35243c interfaceC35243c) {
        InterfaceC35265p interfaceC35265pM111675a = AbstractC35245d.m111675a(interfaceC35243c);
        if (interfaceC35265pM111675a != null) {
            function1.invoke(interfaceC35265pM111675a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m111871F(C35258j0 c35258j0, p715kotlin.jvm.functions.Function1 function1) {
        InterfaceC35243c interfaceC35243cM111738j = c35258j0.getPrimaryClickEvent();
        if (interfaceC35243cM111738j != null) {
            m111870E(function1, interfaceC35243cM111738j);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m111872G(C35258j0 c35258j0, p715kotlin.jvm.functions.Function1 function1) {
        InterfaceC35243c interfaceC35243cM111738j = c35258j0.getPrimaryClickEvent();
        if (interfaceC35243cM111738j != null) {
            m111870E(function1, interfaceC35243cM111738j);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m111873H(C35258j0 c35258j0, p715kotlin.jvm.functions.Function1 function1) {
        InterfaceC35243c interfaceC35243cM111740l = c35258j0.getSecondaryClickEvent();
        if (interfaceC35243cM111740l != null) {
            m111870E(function1, interfaceC35243cM111740l);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m111874I(C35258j0 c35258j0, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m111869D(c35258j0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:115:0x0202  */
    /* JADX WARN: Code duplicated, block: B:116:0x0204  */
    /* JADX WARN: Code duplicated, block: B:120:0x020e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0222  */
    /* JADX WARN: Code duplicated, block: B:126:0x0236  */
    /* JADX WARN: Code duplicated, block: B:128:0x024d  */
    /* JADX WARN: Code duplicated, block: B:133:0x026d  */
    /* JADX WARN: Code duplicated, block: B:136:0x028c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0292  */
    /* JADX WARN: Code duplicated, block: B:142:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:158:0x0313  */
    /* JADX WARN: Code duplicated, block: B:161:0x032f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0365  */
    /* JADX WARN: Code duplicated, block: B:175:0x038d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0391  */
    /* JADX WARN: Code duplicated, block: B:178:0x0394  */
    /* JADX WARN: Code duplicated, block: B:182:0x03a4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J */
    public static final void m111875J(StrengthTrainerDestination.C10742e.a navArgs, AbstractC12939a0 navController, AbstractC12939a0 globalNavController, InterfaceC21159o0 appNavigator, InterfaceC14515a analytics, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        AbstractC12939a0 abstractC12939a0;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q;
        boolean z4;
        Object obj;
        int i16;
        boolean z13;
        boolean zM87157i;
        Object obj2;
        boolean z14;
        boolean z15;
        Object obj3;
        Object objM87133R;
        Object obj4;
        InterfaceC2994c0 interfaceC2994c0;
        C30406a c30406a;
        boolean z16;
        InterfaceC12251g interfaceC12251g;
        boolean zM87157i2;
        Object objM87133R2;
        InterfaceC4339a interfaceC4339a4;
        InterfaceC28601c1 interfaceC28601c1;
        int i17;
        p715kotlin.jvm.functions.Function1 function1;
        int i18;
        Object objM87133R3;
        InterfaceC4339a interfaceC4339a5;
        p715kotlin.jvm.functions.Function1 function2;
        Object objM87133R4;
        Object obj5;
        InterfaceC28601c1 interfaceC28601c2;
        boolean zM87153g;
        Object obj6;
        int i19;
        int i24;
        int i25;
        Object obj7;
        String exerciseId;
        C35953c c35953c;
        C26669a c26669a;
        C38266c c38266c;
        boolean zM87153g2;
        Object objM87133R5;
        int i26;
        AbstractC22676k.m65750j(navArgs, "navArgs");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        AbstractC22676k.m65750j(appNavigator, "appNavigator");
        AbstractC22676k.m65750j(analytics, "analytics");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-496888850);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(navArgs) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(navController) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(globalNavController) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(appNavigator) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(analytics) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((i14 & 32) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i26 = 131072;
                }
                i15 |= i26;
            } else {
                interfaceC4339a2 = interfaceC4339a;
            }
            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i15 |= i26;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if (c28655q2.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            c28655q2.m87140Z();
            int i27 = i13 & 1;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i27 != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
                if ((i14 & 32) != 0) {
                    i15 &= -458753;
                }
            } else if ((i14 & 32) != 0) {
                boolean zM87157i3 = ((i15 & 14) == 4) | c28655q2.m87157i(navController) | c28655q2.m87157i(globalNavController);
                Object objM87133R6 = c28655q2.m87133R();
                Object obj8 = objM87133R6;
                if (zM87157i3 || objM87133R6 == c28676v0) {
                    C31324k c31324k = new C31324k(navArgs, navController, globalNavController, 10);
                    c28655q2.m87172p0(c31324k);
                    obj8 = c31324k;
                }
                interfaceC4339a2 = (InterfaceC4339a) obj8;
                i15 &= -458753;
            }
            int i28 = i15;
            InterfaceC4339a interfaceC4339a6 = interfaceC4339a2;
            c28655q2.m87175r();
            int i29 = (i28 & 458752) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
            boolean z17 = (i29 > 131072 && c28655q2.m87153g(interfaceC4339a6)) || (i28 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072;
            Object objM87133R7 = c28655q2.m87133R();
            Object obj9 = objM87133R7;
            if (z17 || objM87133R7 == c28676v0) {
                C31918g c31918g = new C31918g(interfaceC4339a6, 9);
                c28655q2.m87172p0(c31918g);
                obj9 = c31918g;
            }
            AbstractC20301a.m56332c((InterfaceC4339a) obj9, false, c28655q2, 0, 1);
            c28655q2.m87152f0(-1688186518);
            C26669a c26669a2 = C29155a.f118017b;
            if (c26669a2 == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c2 = c26669a2.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q2, -1688186210, c28655q2, false, -3686552);
            boolean zM87153g3 = c28655q2.m87153g(null) | c28655q2.m87153g(null);
            Object objM87133R8 = c28655q2.m87133R();
            if (zM87153g3 || objM87133R8 == c28676v0) {
                InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(c38266c2, null, null, c21647aM114690r));
                c28655q2.m87172p0(interfaceC23462hM92087G);
                z4 = false;
                obj = interfaceC23462hM92087G;
            } else {
                z4 = false;
                obj = objM87133R8;
            }
            c28655q2.m87173q(z4);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) obj;
            c28655q2.m87173q(z4);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m111881P(interfaceC23462h).getViewState(), new C35274y(C35258j0.INSTANCE.m111746c(), null, false, false, false, 30, null), null, c28655q2, 0, 2);
            String exerciseId2 = navArgs.getExerciseId();
            Boolean boolValueOf = Boolean.valueOf(navArgs.getShowCTA());
            int i34 = i28 & 14;
            boolean z18 = i34 == 4;
            if (i29 <= 131072 || !c28655q2.m87153g(interfaceC4339a6)) {
                i16 = i29;
                if ((i28 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                    z13 = false;
                }
                zM87157i = z18 | z13 | c28655q2.m87157i(interfaceC23462h);
                Object objM87133R9 = c28655q2.m87133R();
                obj2 = objM87133R9;
                if (zM87157i || objM87133R9 == c28676v0) {
                    e eVar = new e(navArgs, interfaceC4339a6, interfaceC23462h, null);
                    c28655q2.m87172p0(eVar);
                    obj2 = eVar;
                }
                AbstractC28683x.m87254h(exerciseId2, boolValueOf, (InterfaceC4351m) obj2, c28655q2);
                C12982q c12982qM36393h = navController.m36393h();
                boolean zM87157i4 = c28655q2.m87157i(navController) | c28655q2.m87157i(interfaceC23462h);
                if (i34 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i4 | z14;
                Object objM87133R10 = c28655q2.m87133R();
                obj3 = objM87133R10;
                if (z15 || objM87133R10 == c28676v0) {
                    f fVar = new f(navController, navArgs, interfaceC23462h, null);
                    c28655q2.m87172p0(fVar);
                    obj3 = fVar;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj3, c12982qM36393h);
                objM87133R = c28655q2.m87133R();
                obj4 = objM87133R;
                if (objM87133R == c28676v0) {
                    InterfaceC2994c0 interfaceC2994c0M87262p = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(interfaceC2994c0M87262p);
                    obj4 = interfaceC2994c0M87262p;
                }
                interfaceC2994c0 = (InterfaceC2994c0) obj4;
                c30406a = (C30406a) c28655q2.m87161k(f150088a);
                if (c30406a == null) {
                    c28655q2.m87150e0(-768751802);
                    c35953c = new C35953c("weightlifting-generic-action-router");
                    c28655q2.m87152f0(-909571169);
                    c26669a = C29155a.f118017b;
                    if (c26669a != null) {
                        throw new IllegalStateException("KoinApplication has not been started");
                    }
                    c38266c = c26669a.f106046a.f159364d;
                    c28655q2.m87152f0(-3686552);
                    zM87153g2 = c28655q2.m87153g(c35953c) | c28655q2.m87153g(null);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87153g2 || objM87133R5 == c28676v0) {
                        Object objM122602a = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30406a.class), c35953c);
                        c28655q2.m87172p0(objM122602a);
                        objM87133R5 = objM122602a;
                    }
                    z16 = false;
                    c28655q2.m87173q(false);
                    c28655q2.m87173q(false);
                    c30406a = (C30406a) objM87133R5;
                } else {
                    z16 = false;
                    c28655q2.m87150e0(-768753755);
                }
                c28655q2.m87173q(z16);
                interfaceC12251g = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
                zM87157i2 = c28655q2.m87157i(appNavigator) | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(analytics) | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R2 = c28655q2.m87133R();
                if (!zM87157i2 || objM87133R2 == c28676v0) {
                    interfaceC4339a4 = interfaceC4339a6;
                    interfaceC28601c1 = interfaceC28601c1M87260n;
                    i17 = 0;
                    C29440d c29440d = new C29440d(appNavigator, interfaceC12251g, interfaceC2994c0, analytics, interfaceC28601c1);
                    c28655q2.m87172p0(c29440d);
                    objM87133R2 = c29440d;
                } else {
                    interfaceC4339a4 = interfaceC4339a6;
                    interfaceC28601c1 = interfaceC28601c1M87260n;
                    i17 = 0;
                }
                function1 = (p715kotlin.jvm.functions.Function1) objM87133R2;
                i18 = (c28655q2.m87153g(function1) ? 1 : 0) | (c28655q2.m87157i(interfaceC23462h) ? 1 : 0) | (((i16 > 131072 || !c28655q2.m87153g(interfaceC4339a4)) && (i28 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) ? i17 : 1) | (c28655q2.m87157i(navController) ? 1 : 0);
                objM87133R3 = c28655q2.m87133R();
                if (i18 == 0 || objM87133R3 == c28676v0) {
                    InterfaceC4339a interfaceC4339a7 = interfaceC4339a4;
                    C31915d c31915d = new C31915d(function1, (Object) interfaceC4339a7, (Object) navController, (Object) interfaceC23462h, 13);
                    interfaceC4339a5 = interfaceC4339a7;
                    abstractC12939a0 = navController;
                    c28655q2.m87172p0(c31915d);
                    objM87133R3 = c31915d;
                } else {
                    abstractC12939a0 = navController;
                    interfaceC4339a5 = interfaceC4339a4;
                }
                function2 = (p715kotlin.jvm.functions.Function1) objM87133R3;
                Object[] objArr = new Object[i17];
                objM87133R4 = c28655q2.m87133R();
                obj5 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C35231a c35231a = new C35231a(10);
                    c28655q2.m87172p0(c35231a);
                    obj5 = c35231a;
                }
                interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) obj5, c28655q2, 48);
                Boolean boolValueOf2 = Boolean.valueOf(m111882Q(interfaceC28601c1).getNavigateBackAfterSuccessfulDelete());
                zM87153g = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87153g(function2);
                Object objM87133R11 = c28655q2.m87133R();
                obj6 = objM87133R11;
                if (zM87153g || objM87133R11 == c28676v0) {
                    g gVar = new g(function2, interfaceC28601c1, interfaceC28601c2, null);
                    c28655q2.m87172p0(gVar);
                    obj6 = gVar;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj6, boolValueOf2);
                C35274y c35274yM111882Q = m111882Q(interfaceC28601c1);
                if (navArgs.getShowCTA() || (exerciseId = navArgs.getExerciseId()) == null || exerciseId.length() == 0) {
                    i19 = i17;
                } else {
                    i19 = 1;
                }
                if (i34 == 4) {
                    i24 = 1;
                } else {
                    i24 = i17;
                }
                i25 = i24 | (c28655q2.m87157i(abstractC12939a0) ? 1 : 0);
                Object objM87133R12 = c28655q2.m87133R();
                obj7 = objM87133R12;
                if (i25 == 0 || objM87133R12 == c28676v0) {
                    C35015q c35015q = new C35015q(2, navArgs, abstractC12939a0);
                    c28655q2.m87172p0(c35015q);
                    obj7 = c35015q;
                }
                C28655q c28655q3 = c28655q2;
                m111887V(c35274yM111882Q, function2, function1, i19, (InterfaceC4339a) obj7, null, c30406a, analytics, c28655q3, (C30406a.f124781d << 18) | ((i28 << 9) & 29360128), 32);
                interfaceC4339a3 = interfaceC4339a5;
                c28655q = c28655q3;
            } else {
                i16 = i29;
            }
            z13 = true;
            zM87157i = z18 | z13 | c28655q2.m87157i(interfaceC23462h);
            Object objM87133R13 = c28655q2.m87133R();
            obj2 = objM87133R13;
            if (zM87157i) {
                e eVar2 = new e(navArgs, interfaceC4339a6, interfaceC23462h, null);
                c28655q2.m87172p0(eVar2);
                obj2 = eVar2;
            } else {
                e eVar3 = new e(navArgs, interfaceC4339a6, interfaceC23462h, null);
                c28655q2.m87172p0(eVar3);
                obj2 = eVar3;
            }
            AbstractC28683x.m87254h(exerciseId2, boolValueOf, (InterfaceC4351m) obj2, c28655q2);
            C12982q c12982qM36393h2 = navController.m36393h();
            boolean zM87157i5 = c28655q2.m87157i(navController) | c28655q2.m87157i(interfaceC23462h);
            if (i34 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i5 | z14;
            Object objM87133R14 = c28655q2.m87133R();
            obj3 = objM87133R14;
            if (z15) {
                f fVar2 = new f(navController, navArgs, interfaceC23462h, null);
                c28655q2.m87172p0(fVar2);
                obj3 = fVar2;
            } else {
                f fVar3 = new f(navController, navArgs, interfaceC23462h, null);
                c28655q2.m87172p0(fVar3);
                obj3 = fVar3;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj3, c12982qM36393h2);
            objM87133R = c28655q2.m87133R();
            obj4 = objM87133R;
            if (objM87133R == c28676v0) {
                InterfaceC2994c0 interfaceC2994c0M87262p2 = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(interfaceC2994c0M87262p2);
                obj4 = interfaceC2994c0M87262p2;
            }
            interfaceC2994c0 = (InterfaceC2994c0) obj4;
            c30406a = (C30406a) c28655q2.m87161k(f150088a);
            if (c30406a == null) {
                c28655q2.m87150e0(-768751802);
                c35953c = new C35953c("weightlifting-generic-action-router");
                c28655q2.m87152f0(-909571169);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c28655q2.m87152f0(-3686552);
                zM87153g2 = c28655q2.m87153g(c35953c) | c28655q2.m87153g(null);
                objM87133R5 = c28655q2.m87133R();
                if (zM87153g2) {
                    Object objM122602a2 = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30406a.class), c35953c);
                    c28655q2.m87172p0(objM122602a2);
                    objM87133R5 = objM122602a2;
                } else {
                    Object objM122602a3 = c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30406a.class), c35953c);
                    c28655q2.m87172p0(objM122602a3);
                    objM87133R5 = objM122602a3;
                }
                z16 = false;
                c28655q2.m87173q(false);
                c28655q2.m87173q(false);
                c30406a = (C30406a) objM87133R5;
            } else {
                z16 = false;
                c28655q2.m87150e0(-768753755);
            }
            c28655q2.m87173q(z16);
            interfaceC12251g = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
            zM87157i2 = c28655q2.m87157i(appNavigator) | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(analytics) | c28655q2.m87153g(interfaceC28601c1M87260n);
            objM87133R2 = c28655q2.m87133R();
            if (zM87157i2) {
                interfaceC4339a4 = interfaceC4339a6;
                interfaceC28601c1 = interfaceC28601c1M87260n;
                i17 = 0;
                C29440d c29440d2 = new C29440d(appNavigator, interfaceC12251g, interfaceC2994c0, analytics, interfaceC28601c1);
                c28655q2.m87172p0(c29440d2);
                objM87133R2 = c29440d2;
            } else {
                interfaceC4339a4 = interfaceC4339a6;
                interfaceC28601c1 = interfaceC28601c1M87260n;
                i17 = 0;
                C29440d c29440d3 = new C29440d(appNavigator, interfaceC12251g, interfaceC2994c0, analytics, interfaceC28601c1);
                c28655q2.m87172p0(c29440d3);
                objM87133R2 = c29440d3;
            }
            function1 = (p715kotlin.jvm.functions.Function1) objM87133R2;
            i18 = (c28655q2.m87153g(function1) ? 1 : 0) | (c28655q2.m87157i(interfaceC23462h) ? 1 : 0) | (((i16 > 131072 || !c28655q2.m87153g(interfaceC4339a4)) && (i28 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) ? i17 : 1) | (c28655q2.m87157i(navController) ? 1 : 0);
            objM87133R3 = c28655q2.m87133R();
            if (i18 == 0) {
                InterfaceC4339a interfaceC4339a8 = interfaceC4339a4;
                C31915d c31915d2 = new C31915d(function1, (Object) interfaceC4339a8, (Object) navController, (Object) interfaceC23462h, 13);
                interfaceC4339a5 = interfaceC4339a8;
                abstractC12939a0 = navController;
                c28655q2.m87172p0(c31915d2);
                objM87133R3 = c31915d2;
            } else {
                InterfaceC4339a interfaceC4339a9 = interfaceC4339a4;
                C31915d c31915d3 = new C31915d(function1, (Object) interfaceC4339a9, (Object) navController, (Object) interfaceC23462h, 13);
                interfaceC4339a5 = interfaceC4339a9;
                abstractC12939a0 = navController;
                c28655q2.m87172p0(c31915d3);
                objM87133R3 = c31915d3;
            }
            function2 = (p715kotlin.jvm.functions.Function1) objM87133R3;
            Object[] objArr2 = new Object[i17];
            objM87133R4 = c28655q2.m87133R();
            obj5 = objM87133R4;
            if (objM87133R4 == c28676v0) {
                C35231a c35231a2 = new C35231a(10);
                c28655q2.m87172p0(c35231a2);
                obj5 = c35231a2;
            }
            interfaceC28601c2 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) obj5, c28655q2, 48);
            Boolean boolValueOf3 = Boolean.valueOf(m111882Q(interfaceC28601c1).getNavigateBackAfterSuccessfulDelete());
            zM87153g = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c2) | c28655q2.m87153g(function2);
            Object objM87133R15 = c28655q2.m87133R();
            obj6 = objM87133R15;
            if (zM87153g) {
                g gVar2 = new g(function2, interfaceC28601c1, interfaceC28601c2, null);
                c28655q2.m87172p0(gVar2);
                obj6 = gVar2;
            } else {
                g gVar3 = new g(function2, interfaceC28601c1, interfaceC28601c2, null);
                c28655q2.m87172p0(gVar3);
                obj6 = gVar3;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) obj6, boolValueOf3);
            C35274y c35274yM111882Q2 = m111882Q(interfaceC28601c1);
            if (navArgs.getShowCTA()) {
                i19 = i17;
            } else {
                i19 = i17;
            }
            if (i34 == 4) {
                i24 = 1;
            } else {
                i24 = i17;
            }
            i25 = i24 | (c28655q2.m87157i(abstractC12939a0) ? 1 : 0);
            Object objM87133R16 = c28655q2.m87133R();
            obj7 = objM87133R16;
            if (i25 == 0) {
                C35015q c35015q2 = new C35015q(2, navArgs, abstractC12939a0);
                c28655q2.m87172p0(c35015q2);
                obj7 = c35015q2;
            } else {
                C35015q c35015q3 = new C35015q(2, navArgs, abstractC12939a0);
                c28655q2.m87172p0(c35015q3);
                obj7 = c35015q3;
            }
            C28655q c28655q4 = c28655q2;
            m111887V(c35274yM111882Q2, function2, function1, i19, (InterfaceC4339a) obj7, null, c30406a, analytics, c28655q4, (C30406a.f124781d << 18) | ((i28 << 9) & 29360128), 32);
            interfaceC4339a3 = interfaceC4339a5;
            c28655q = c28655q4;
        } else {
            abstractC12939a0 = navController;
            c28655q2.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28958a((Object) navArgs, (Object) abstractC12939a0, (Object) globalNavController, (Object) appNavigator, (Object) analytics, interfaceC4339a3, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m111876K(StrengthTrainerDestination.C10742e.a aVar, AbstractC12939a0 abstractC12939a0, AbstractC12939a0 abstractC12939a1) {
        AbstractC35268s.m111861c(aVar.getEntryPointType(), abstractC12939a0, abstractC12939a1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m111877L(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m111878M(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m111879N(StrengthTrainerDestination.C10742e.a aVar, AbstractC12939a0 abstractC12939a0) {
        String exerciseId = aVar.getExerciseId();
        if (exerciseId != null) {
            StrengthTrainerDestination.C10745h.f32788a.m28109i(abstractC12939a0, exerciseId);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m111880O(StrengthTrainerDestination.C10742e.a aVar, AbstractC12939a0 abstractC12939a0, AbstractC12939a0 abstractC12939a1, InterfaceC21159o0 interfaceC21159o0, InterfaceC14515a interfaceC14515a, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m111875J(aVar, abstractC12939a0, abstractC12939a1, interfaceC21159o0, interfaceC14515a, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C35273x m111881P(InterfaceC23462h interfaceC23462h) {
        return (C35273x) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C35274y m111882Q(InterfaceC28670t2 interfaceC28670t2) {
        return (C35274y) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m111883R(InterfaceC21159o0 interfaceC21159o0, InterfaceC12251g interfaceC12251g, InterfaceC2994c0 interfaceC2994c0, InterfaceC14515a interfaceC14515a, InterfaceC28670t2 interfaceC28670t2, C9598e action) {
        AbstractC22676k.m65750j(action, "action");
        C35264o c35264oM111928a = m111882Q(interfaceC28670t2).getContent();
        AbstractC35268s.m111862d(action, interfaceC21159o0, interfaceC12251g, interfaceC2994c0, interfaceC14515a, c35264oM111928a != null ? c35264oM111928a.getAnalyticsContext() : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m111884S(p715kotlin.jvm.functions.Function1 function1, InterfaceC4339a interfaceC4339a, AbstractC12939a0 abstractC12939a0, InterfaceC23462h interfaceC23462h, InterfaceC35265p event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC35265p.a) {
            function1.invoke(((InterfaceC35265p.a) event).getDestination());
        } else if (event instanceof InterfaceC35265p.g) {
            m111881P(interfaceC23462h).m111927n((InterfaceC35265p.g) event);
        } else if (event.equals(InterfaceC35265p.c.f150047a)) {
            interfaceC4339a.invoke();
        } else {
            if (!(event instanceof InterfaceC35265p.e)) {
                throw new NoWhenBranchMatchedException();
            }
            StrengthTrainerDestination.C10739b.f32758a.m28040f(abstractC12939a0, ((InterfaceC35265p.e) event).getExerciseId(), "edit");
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final InterfaceC28601c1 m111885T() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final boolean m111886U(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0171  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2 A[PHI: r11
      0x00a2: PHI (r11v13 int) = (r11v0 int), (r11v6 int), (r11v7 int) binds: [B:51:0x00a0, B:61:0x00ba, B:60:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:94:0x011e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0157  */
    /* JADX WARN: Code duplicated, block: B:97:0x0164  */
    /* JADX INFO: renamed from: V */
    public static final void m111887V(C35274y viewState, p715kotlin.jvm.functions.Function1 onEvent, p715kotlin.jvm.functions.Function1 onNavigationAction, boolean z4, InterfaceC4339a onSelectExercise, Modifier modifier, C30406a c30406a, InterfaceC14515a interfaceC14515a, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        int i17;
        boolean zM87157i;
        int i18;
        InterfaceC14515a interfaceC14515a2;
        int i19;
        boolean z13;
        C30406a c30406a2;
        Modifier modifier3;
        InterfaceC14515a interfaceC14515a3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C30406a c30406a3;
        InterfaceC14515a interfaceC14515a4;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        AbstractC22676k.m65750j(onNavigationAction, "onNavigationAction");
        AbstractC22676k.m65750j(onSelectExercise, "onSelectExercise");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-39360427);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onNavigationAction) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(onSelectExercise) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i24 = i14 & 32;
        if (i24 == 0) {
            if ((196608 & i13) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 = i14 & 64;
            i17 = 1572864;
            if (i16 == 0) {
                i15 |= i17;
            } else if ((1572864 & i13) == 0) {
                if ((2097152 & i13) == 0) {
                    zM87157i = c28655q.m87153g(c30406a);
                } else {
                    zM87157i = c28655q.m87157i(c30406a);
                }
                if (zM87157i) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            i18 = i14 & 128;
            if (i18 != 0) {
                if ((12582912 & i13) == 0) {
                    interfaceC14515a2 = interfaceC14515a;
                    if (c28655q.m87157i(interfaceC14515a2)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i15 |= i19;
                }
                if ((4793491 & i15) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    if (i24 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i16 != 0) {
                        c30406a3 = null;
                    } else {
                        c30406a3 = c30406a;
                    }
                    if (i18 != 0) {
                        interfaceC14515a4 = null;
                    } else {
                        interfaceC14515a4 = interfaceC14515a2;
                    }
                    if (viewState.getFullScreenModal() != null) {
                        c28655q.m87150e0(829349263);
                        m111869D(viewState.getFullScreenModal(), onEvent, c28655q, i15 & 112);
                        c28655q.m87173q(false);
                    } else if (viewState.getContent() != null) {
                        c28655q.m87150e0(-59833091);
                        C35264o c35264oM111928a = viewState.getContent();
                        boolean zM111929b = viewState.getDeleteCustomExerciseFailed();
                        boolean zM111930c = viewState.getDismissPresentedModal();
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, modifier4);
                        int i25 = (65520 & i15) | (C30406a.f124781d << 21);
                        int i26 = i15 << 3;
                        m111917u(c35264oM111928a, onEvent, onNavigationAction, z4, onSelectExercise, zM111929b, zM111930c, c30406a3, interfaceC14515a4, modifierM3407d, c28655q, i25 | (29360128 & i26) | (i26 & 234881024), 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(829373785);
                        c28655q.m87173q(false);
                    }
                    modifier3 = modifier4;
                    c30406a2 = c30406a3;
                    interfaceC14515a3 = interfaceC14515a4;
                } else {
                    c28655q.m87138X();
                    c30406a2 = c30406a;
                    modifier3 = modifier2;
                    interfaceC14515a3 = interfaceC14515a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2646w1(viewState, onEvent, onNavigationAction, z4, onSelectExercise, modifier3, c30406a2, interfaceC14515a3, i13, i14);
                }
            }
            i15 |= 12582912;
            interfaceC14515a2 = interfaceC14515a;
            if ((4793491 & i15) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    c30406a3 = null;
                } else {
                    c30406a3 = c30406a;
                }
                if (i18 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(829349263);
                    m111869D(viewState.getFullScreenModal(), onEvent, c28655q, i15 & 112);
                    c28655q.m87173q(false);
                } else if (viewState.getContent() != null) {
                    c28655q.m87150e0(-59833091);
                    C35264o c35264oM111928a2 = viewState.getContent();
                    boolean zM111929b2 = viewState.getDeleteCustomExerciseFailed();
                    boolean zM111930c2 = viewState.getDismissPresentedModal();
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, modifier4);
                    int i27 = (65520 & i15) | (C30406a.f124781d << 21);
                    int i28 = i15 << 3;
                    m111917u(c35264oM111928a2, onEvent, onNavigationAction, z4, onSelectExercise, zM111929b2, zM111930c2, c30406a3, interfaceC14515a4, modifierM3407d2, c28655q, i27 | (29360128 & i28) | (i28 & 234881024), 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(829373785);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier4;
                c30406a2 = c30406a3;
                interfaceC14515a3 = interfaceC14515a4;
            } else {
                c28655q.m87138X();
                c30406a2 = c30406a;
                modifier3 = modifier2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2646w1(viewState, onEvent, onNavigationAction, z4, onSelectExercise, modifier3, c30406a2, interfaceC14515a3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        modifier2 = modifier;
        i16 = i14 & 64;
        i17 = 1572864;
        if (i16 == 0) {
            i15 |= i17;
        } else if ((1572864 & i13) == 0) {
            if ((2097152 & i13) == 0) {
                zM87157i = c28655q.m87153g(c30406a);
            } else {
                zM87157i = c28655q.m87157i(c30406a);
            }
            if (zM87157i) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i15 |= i17;
        }
        i18 = i14 & 128;
        if (i18 != 0) {
            if ((12582912 & i13) == 0) {
                interfaceC14515a2 = interfaceC14515a;
                if (c28655q.m87157i(interfaceC14515a2)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i15 |= i19;
            }
            if ((4793491 & i15) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                if (i24 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i16 != 0) {
                    c30406a3 = null;
                } else {
                    c30406a3 = c30406a;
                }
                if (i18 != 0) {
                    interfaceC14515a4 = null;
                } else {
                    interfaceC14515a4 = interfaceC14515a2;
                }
                if (viewState.getFullScreenModal() != null) {
                    c28655q.m87150e0(829349263);
                    m111869D(viewState.getFullScreenModal(), onEvent, c28655q, i15 & 112);
                    c28655q.m87173q(false);
                } else if (viewState.getContent() != null) {
                    c28655q.m87150e0(-59833091);
                    C35264o c35264oM111928a3 = viewState.getContent();
                    boolean zM111929b3 = viewState.getDeleteCustomExerciseFailed();
                    boolean zM111930c3 = viewState.getDismissPresentedModal();
                    Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, modifier4);
                    int i29 = (65520 & i15) | (C30406a.f124781d << 21);
                    int i210 = i15 << 3;
                    m111917u(c35264oM111928a3, onEvent, onNavigationAction, z4, onSelectExercise, zM111929b3, zM111930c3, c30406a3, interfaceC14515a4, modifierM3407d3, c28655q, i29 | (29360128 & i210) | (i210 & 234881024), 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(829373785);
                    c28655q.m87173q(false);
                }
                modifier3 = modifier4;
                c30406a2 = c30406a3;
                interfaceC14515a3 = interfaceC14515a4;
            } else {
                c28655q.m87138X();
                c30406a2 = c30406a;
                modifier3 = modifier2;
                interfaceC14515a3 = interfaceC14515a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2646w1(viewState, onEvent, onNavigationAction, z4, onSelectExercise, modifier3, c30406a2, interfaceC14515a3, i13, i14);
            }
        }
        i15 |= 12582912;
        interfaceC14515a2 = interfaceC14515a;
        if ((4793491 & i15) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            if (i24 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i16 != 0) {
                c30406a3 = null;
            } else {
                c30406a3 = c30406a;
            }
            if (i18 != 0) {
                interfaceC14515a4 = null;
            } else {
                interfaceC14515a4 = interfaceC14515a2;
            }
            if (viewState.getFullScreenModal() != null) {
                c28655q.m87150e0(829349263);
                m111869D(viewState.getFullScreenModal(), onEvent, c28655q, i15 & 112);
                c28655q.m87173q(false);
            } else if (viewState.getContent() != null) {
                c28655q.m87150e0(-59833091);
                C35264o c35264oM111928a4 = viewState.getContent();
                boolean zM111929b4 = viewState.getDeleteCustomExerciseFailed();
                boolean zM111930c4 = viewState.getDismissPresentedModal();
                Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, modifier4);
                int i211 = (65520 & i15) | (C30406a.f124781d << 21);
                int i212 = i15 << 3;
                m111917u(c35264oM111928a4, onEvent, onNavigationAction, z4, onSelectExercise, zM111929b4, zM111930c4, c30406a3, interfaceC14515a4, modifierM3407d4, c28655q, i211 | (29360128 & i212) | (i212 & 234881024), 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(829373785);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
            c30406a2 = c30406a3;
            interfaceC14515a3 = interfaceC14515a4;
        } else {
            c28655q.m87138X();
            c30406a2 = c30406a;
            modifier3 = modifier2;
            interfaceC14515a3 = interfaceC14515a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2646w1(viewState, onEvent, onNavigationAction, z4, onSelectExercise, modifier3, c30406a2, interfaceC14515a3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m111888W(C35274y c35274y, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, C30406a c30406a, InterfaceC14515a interfaceC14515a, int i13, int i14, Composer composer, int i15) {
        m111887V(c35274y, function1, function2, z4, interfaceC4339a, modifier, c30406a, interfaceC14515a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C30406a m111889X() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m111901e0(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C15791j.class), new C15784c());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C32115g.class), new C32110b());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C28401e.class), new C28398b());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C35254h0.class), new C35244c0());
        designItemViewFactory.m74323b(AbstractC39811e.m127635f());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m111917u(final C35264o c35264o, final p715kotlin.jvm.functions.Function1 function1, final p715kotlin.jvm.functions.Function1 function2, final boolean z4, final InterfaceC4339a interfaceC4339a, final boolean z13, final boolean z14, final C30406a c30406a, final InterfaceC14515a interfaceC14515a, Modifier modifier, Composer composer, final int i13, final int i14) {
        C35264o c35264o2;
        int i15;
        Modifier modifier2;
        C28655q c28655q;
        final Modifier modifier3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(985100360);
        if ((i13 & 6) == 0) {
            c35264o2 = c35264o;
            i15 = (c28655q2.m87157i(c35264o2) ? 4 : 2) | i13;
        } else {
            c35264o2 = c35264o;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(function2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q2.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q2.m87155h(z14) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= (16777216 & i13) == 0 ? c28655q2.m87153g(c30406a) : c28655q2.m87157i(c30406a) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= c28655q2.m87157i(interfaceC14515a) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i16 = i14 & 512;
        if (i16 != 0) {
            i15 |= 805306368;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i13 & 805306368) == 0) {
                i15 |= c28655q2.m87153g(modifier2) ? 536870912 : 268435456;
            }
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 306783379) != 306783378)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            TextResource textResourceM67633d = c35264o2.getHeader().getSubtitle();
            EnumC2888c enumC2888cM67641p = c35264o2.getHeader().getSubtitleStyle();
            boolean zM87149e = c28655q2.m87149e(enumC2888cM67641p == null ? -1 : enumC2888cM67641p.ordinal()) | c28655q2.m87153g(textResourceM67633d) | c28655q2.m87155h(c35264o2.getHeader().getSubtitleStickOnScroll());
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87149e || objM87133R == c28676v0) {
                objM87133R = new C39174f(C23357g.INSTANCE.m67647e(c35264o.getHeader().getSubtitle(), c35264o.getHeader().getSubtitleStyle(), c35264o.getHeader().getSubtitleStickOnScroll()));
                c28655q2.m87172p0(objM87133R);
            }
            C23356f c23356fM67620b = AbstractC23355e.m67620b(null, ((C39174f) objM87133R).f168413w, c28655q2, 0, 1);
            boolean zM87153g = c28655q2.m87153g(c35264o.getHeader()) | c28655q2.m87147d(c23356fM67620b.m67622b());
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = c23356fM67620b.m67621a(c35264o.getHeader());
                c28655q2.m87172p0(objM87133R2);
            }
            C23357g c23357g = (C23357g) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C29802c(17, interfaceC28601c1);
                c28655q2.m87172p0(objM87133R4);
            }
            p715kotlin.jvm.functions.Function1 function3 = (p715kotlin.jvm.functions.Function1) objM87133R4;
            Object objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C15092n6();
                c28655q2.m87172p0(objM87133R5);
            }
            C15092n6 c15092n6 = (C15092n6) objM87133R5;
            String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC11128h.f35502r0);
            Boolean boolValueOf = Boolean.valueOf(z13);
            boolean zM87153g2 = ((i15 & 458752) == 131072) | c28655q2.m87153g(strM92103Y);
            Object objM87133R6 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R6 == c28676v0) {
                objM87133R6 = new a(z13, c15092n6, strM92103Y, null);
                c28655q2.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87254h(boolValueOf, strM92103Y, (InterfaceC4351m) objM87133R6, c28655q2);
            Boolean boolValueOf2 = Boolean.valueOf(z14);
            boolean z15 = (i15 & 3670016) == 1048576;
            Object objM87133R7 = c28655q2.m87133R();
            if (z15 || objM87133R7 == c28676v0) {
                objM87133R7 = new b(z14, interfaceC28601c1, null);
                c28655q2.m87172p0(objM87133R7);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, boolValueOf2);
            Modifier modifier5 = modifier4;
            Modifier modifierM34129b = AbstractC12250f.m34129b(AbstractC1102d.m3407d(1.0f, modifier4), c35264o.getScreenContextMetadata(), false, c28655q2, C13404j.f46947x << 3, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM34129b);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            c28655q = c28655q2;
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC25303l.m74272C().mo86977a(f150089b), AbstractC35249f.m111700c().mo86977a(new C35247e(c35264o.getAnalyticsContext().getExerciseName(), c35264o.getAnalyticsContext().getExerciseType()))}, AbstractC37817c.m121344e(1917349134, c28655q, new C35269t(c30406a, function1, function2, interfaceC14515a, c35264o, c23356fM67620b, z4, interfaceC4339a, c23357g, function3, interfaceC28601c1)), c28655q, 56);
            AbstractC32416g.m101151h(c15092n6, C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H), null, c28655q, 6, 4);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: uu2.u
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC35272w.m111918v(c35264o, function1, function2, z4, interfaceC4339a, z13, z14, c30406a, interfaceC14515a, modifier3, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m111918v(C35264o c35264o, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, boolean z4, InterfaceC4339a interfaceC4339a, boolean z13, boolean z14, C30406a c30406a, InterfaceC14515a interfaceC14515a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m111917u(c35264o, function1, function2, z4, interfaceC4339a, z13, z14, c30406a, interfaceC14515a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final AnyModal m111919w(InterfaceC28601c1 interfaceC28601c1) {
        return (AnyModal) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m111920x(InterfaceC28601c1 interfaceC28601c1, AnyModal anyModal) {
        interfaceC28601c1.setValue(anyModal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m111921y(InterfaceC28601c1 interfaceC28601c1, AnyModal anyModal) {
        m111920x(interfaceC28601c1, anyModal);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m111922z(final C30406a c30406a, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, InterfaceC14515a interfaceC14515a, C35264o c35264o, C23356f c23356f, boolean z4, InterfaceC4339a interfaceC4339a, C23357g c23357g, final p715kotlin.jvm.functions.Function1 function3, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28676v0 c28676v0;
        final p715kotlin.jvm.functions.Function1 function4 = function1;
        final p715kotlin.jvm.functions.Function1 function5 = function2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
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
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC22989q.m66760a(AbstractC34132o.m107879c(c23356f.m67622b(), AbstractC1092a.m3357b(C1100b.f4583a.mo3401b(c2314t), AbstractC23354d.m67617o(), null, 0.0f, 6)), c28655q, 0);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            boolean zM87157i = c28655q.m87157i(c30406a) | c28655q.m87153g(function4) | c28655q.m87153g(function5);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v1) {
                final int i14 = 0;
                p715kotlin.jvm.functions.Function1 function6 = new p715kotlin.jvm.functions.Function1() { // from class: uu2.v
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return AbstractC35272w.m111866A(c30406a, function3, function4, function5, obj);
                            case 1:
                                return AbstractC35272w.m111867B(c30406a, function3, function4, function5, obj);
                            default:
                                return AbstractC35272w.m111868C(c30406a, function3, function4, function5, (InterfaceC0569t) obj);
                        }
                    }
                };
                c28655q.m87172p0(function6);
                objM87133R = function6;
            }
            AbstractC23354d.m67609g(modifierM3409f2, c23357g, (p715kotlin.jvm.functions.Function1) objM87133R, null, false, c28655q, (C23357g.f92580k << 3) | 24582, 8);
            c28655q.m87173q(true);
            C12738n c12738nM111831b = c35264o.getAnchorSelector();
            C26068u c26068uM67623c = c23356f.getListState();
            InterfaceC22973k1 interfaceC22973k1M34113f = AbstractC12248d.m34113f(c35264o.getScreenContextMetadata(), AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, 4 * 8, 7), false, c28655q, C13404j.f46947x | 48, 4);
            C28655q c28655q2 = c28655q;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3495a = AbstractC1129a.m3495a(new LayoutWeightElement(1.0f, true), c23356f.getNestedScrollConnection(), null);
            boolean zM87157i2 = c28655q2.m87157i(c30406a) | c28655q2.m87153g(function5) | c28655q2.m87153g(function4);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v1) {
                final int i15 = 1;
                c28676v0 = c28676v1;
                p715kotlin.jvm.functions.Function1 function7 = new p715kotlin.jvm.functions.Function1() { // from class: uu2.v
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return AbstractC35272w.m111866A(c30406a, function3, function5, function4, obj);
                            case 1:
                                return AbstractC35272w.m111867B(c30406a, function3, function5, function4, obj);
                            default:
                                return AbstractC35272w.m111868C(c30406a, function3, function5, function4, (InterfaceC0569t) obj);
                        }
                    }
                };
                function5 = function5;
                function4 = function4;
                c28655q2.m87172p0(function7);
                objM87133R2 = function7;
            } else {
                c28676v0 = c28676v1;
            }
            AbstractC12736l.m35622i(modifierM3495a, c12738nM111831b, interfaceC22973k1M34113f, c26068uM67623c, (p715kotlin.jvm.functions.Function1) objM87133R2, c28655q2, C12738n.f43579f << 3, 0);
            if (z4) {
                c28655q2.m87150e0(-362463368);
                AbstractC13653j.m38495g(AbstractC22953f.m66722k(c2314t), AbstractC30060g.m92103Y(c28655q2, AbstractC11128h.f35379D), false, null, false, false, interfaceC4339a, c28655q2, 0, 60);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-362224482);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            AnyModal anyModalM111919w = m111919w(interfaceC28601c1);
            boolean zM87157i3 = c28655q2.m87157i(c30406a) | c28655q2.m87153g(function4) | c28655q2.m87153g(function5);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i16 = 2;
                p715kotlin.jvm.functions.Function1 function8 = new p715kotlin.jvm.functions.Function1() { // from class: uu2.v
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return AbstractC35272w.m111866A(c30406a, function3, function4, function5, obj);
                            case 1:
                                return AbstractC35272w.m111867B(c30406a, function3, function4, function5, obj);
                            default:
                                return AbstractC35272w.m111868C(c30406a, function3, function4, function5, (InterfaceC0569t) obj);
                        }
                    }
                };
                c28655q2.m87172p0(function8);
                objM87133R3 = function8;
            }
            AbstractC0564o.m1394P(anyModalM111919w, (p715kotlin.jvm.functions.Function1) objM87133R3, null, interfaceC14515a, null, null, c28655q2, 196608 | AnyModal.$stable, 20);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
