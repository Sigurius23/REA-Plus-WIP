package lf1;

import com.whoop.data.repositories.FeatureFlagChecker;
import hf1.InterfaceC17235b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: lf1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Llf1/f;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lhf1/b;", "experimentsChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;)V", "", "a", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Lhf1/b;", "experiments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23996f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC17235b experimentsChecker;

    /* JADX INFO: renamed from: lf1.f$a */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.experiments.experiments.ExerciseDetailsV2ExperimentHelper", m100430f = "ExerciseDetailsV2ExperimentHelper.kt", m100431l = {15}, m100432m = "isExerciseDetailsV2ExperimentEnabled", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f94733w;

        /* JADX INFO: renamed from: y */
        int f94735y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f94733w = obj;
            this.f94735y |= Integer.MIN_VALUE;
            return C23996f.this.m70811a(this);
        }
    }

    public C23996f(FeatureFlagChecker featureFlagChecker, InterfaceC17235b experimentsChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(experimentsChecker, "experimentsChecker");
        this.featureFlagChecker = featureFlagChecker;
        this.experimentsChecker = experimentsChecker;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: a */
    public final Object m70811a(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f94735y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f94735y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM48741d = aVar2.f94733w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f94735y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM48741d);
            if (!this.featureFlagChecker.isFeatureEnabled("exercise-details-v2")) {
                return Boolean.FALSE;
            }
            InterfaceC17235b interfaceC17235b = this.experimentsChecker;
            C23995e c23995e = new C23995e(null, null, null, null, 15, null);
            aVar2.f94735y = 1;
            objM48741d = InterfaceC17235b.m48741d(interfaceC17235b, c23995e, 0L, true, false, aVar2, 10, null);
            if (objM48741d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM48741d);
        }
        return Boolean.valueOf(AbstractC22676k.m65745e(objM48741d, "test"));
    }
}
