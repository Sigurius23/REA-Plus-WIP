package f70;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.activation.domain.models.ActivationFlowCountry;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.iajf.domain.SignUpSource;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25265s;
import m83.C25271y;
import n70.C26418e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: f70.i0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u0014\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lf70/i0;", "", "<init>", "()V", "Lf70/e$b;", "prevDomainResult", "Lf70/e;", "fetchResult", "Lf70/q0;", "memberInfoAfterEmailCheck", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "b", "(Lf70/e$b;Lf70/e;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lf70/e$b;", "Lec3/m;", "collector", "Lkotlin/Function1;", "Lq83/d;", "fetch", "Lf70/f;", "a", "(Lec3/m;Lf70/e$b;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14185i0 {

    /* JADX INFO: renamed from: f70.i0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFSecondBatchMerger", m100430f = "IAJFSecondBatchMerger.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 81}, m100432m = "fetchV2SecondBatchAndMerge", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f51370F;

        /* JADX INFO: renamed from: w */
        Object f51371w;

        /* JADX INFO: renamed from: x */
        Object f51372x;

        /* JADX INFO: renamed from: y */
        Object f51373y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f51374z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51374z = obj;
            this.f51370F |= Integer.MIN_VALUE;
            return C14185i0.this.m40488a(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.i0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFSecondBatchMerger$fetchV2SecondBatchAndMerge$fetchResult$1", m100430f = "IAJFSecondBatchMerger.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lf70/e;", "<anonymous>", "(Lbc3/c0;)Lf70/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f51375w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f51376x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f51376x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f51376x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51375w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            Function1 function1 = this.f51376x;
            this.f51375w = 1;
            Object objInvoke = function1.invoke(this);
            return objInvoke == enumC31071a ? enumC31071a : objInvoke;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        if (r0 == r3) goto L22;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40488a(ec3.InterfaceC13062m r31, f70.InterfaceC14176e.b r32, p715kotlin.jvm.functions.Function1 r33, q83.InterfaceC30057d<? super f70.C14178f> r34) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14185i0.m40488a(ec3.m, f70.e$b, kotlin.jvm.functions.Function1, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX INFO: renamed from: b */
    public final InterfaceC14176e.b m40489b(InterfaceC14176e.b prevDomainResult, InterfaceC14176e fetchResult, C14201q0 memberInfoAfterEmailCheck, SignUpSource signUpSource) {
        List<ActivationFlowCountry> listM40419d;
        AbstractC22676k.m65750j(prevDomainResult, "prevDomainResult");
        AbstractC22676k.m65750j(fetchResult, "fetchResult");
        AbstractC22676k.m65750j(memberInfoAfterEmailCheck, "memberInfoAfterEmailCheck");
        AbstractC22676k.m65750j(signUpSource, "signUpSource");
        InterfaceC14176e.b bVar = fetchResult instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) fetchResult : null;
        List<ActivationFlowStepModel> listM40428m = prevDomainResult.m40428m();
        List<ActivationFlowStepModel> list = C25271y.f99162w;
        if (listM40428m == null) {
            listM40428m = list;
        }
        List<ActivationFlowStepModel> list2 = listM40428m;
        List<ActivationFlowStepModel> listM40428m2 = bVar != null ? bVar.m40428m() : null;
        if (listM40428m2 != null) {
            list = listM40428m2;
        }
        ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(list2, list);
        if (arrayListM74129g1.isEmpty()) {
            return InterfaceC14176e.b.m40416b(prevDomainResult, null, null, null, memberInfoAfterEmailCheck, null, false, null, false, null, false, false, null, null, signUpSource, null, null, null, 122871, null);
        }
        if (bVar == null) {
            return InterfaceC14176e.b.m40416b(prevDomainResult, arrayListM74129g1, C26418e.m78162b(prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), 0, arrayListM74129g1.size(), 0, null, null, 29, null), null, memberInfoAfterEmailCheck, null, false, null, false, null, false, false, null, null, signUpSource, null, null, null, 122868, null);
        }
        int currentStepIndex = prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex() + 1;
        int iM118951C = AbstractC37056f.m118951C(arrayListM74129g1);
        int i13 = currentStepIndex > iM118951C ? iM118951C : currentStepIndex;
        List<ActivationFlowCountry> listM40419d2 = bVar.m40419d();
        if (listM40419d2 == null) {
            listM40419d = prevDomainResult.m40419d();
        } else {
            listM40419d = listM40419d2.isEmpty() ? null : listM40419d2;
            if (listM40419d == null) {
                listM40419d = prevDomainResult.m40419d();
            }
        }
        return InterfaceC14176e.b.m40416b(bVar, arrayListM74129g1, C26418e.m78162b(bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String(), i13, arrayListM74129g1.size(), prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getPreviousFlowStepTotal(), prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentDestination(), null, 16, null), listM40419d, memberInfoAfterEmailCheck, null, false, null, false, null, false, false, null, null, signUpSource, null, null, null, 122864, null);
    }
}
