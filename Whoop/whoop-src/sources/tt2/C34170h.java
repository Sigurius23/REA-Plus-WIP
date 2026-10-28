package tt2;

import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: tt2.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ltt2/h;", "", "<init>", "()V", "Lec3/l;", "Ltt2/j;", "weeklyPlanDomainResult", "Ltt2/b;", "presetsDomainResult", "Ltt2/g;", "a", "(Lec3/l;Lec3/l;)Lec3/l;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34170h {

    /* JADX INFO: renamed from: tt2.h$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.domain.WeeklyPlanCombiner$combineState$1", m100430f = "WeeklyPlanCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Ltt2/j;", "domainResult", "Ltt2/b;", "presetResult", "Ltt2/g;", "<anonymous>", "(Ltt2/j;Ltt2/b;)Ltt2/g;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f143286w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f143287x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143288y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC34172j abstractC34172j, AbstractC34164b abstractC34164b, InterfaceC30057d<? super C34169g> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f143287x = abstractC34172j;
            aVar.f143288y = abstractC34164b;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC34172j abstractC34172j = (AbstractC34172j) this.f143287x;
            AbstractC34164b abstractC34164b = (AbstractC34164b) this.f143288y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f143286w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C34169g(abstractC34172j, abstractC34164b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m107981a(InterfaceC13058l weeklyPlanDomainResult, InterfaceC13058l presetsDomainResult) {
        AbstractC22676k.m65750j(weeklyPlanDomainResult, "weeklyPlanDomainResult");
        AbstractC22676k.m65750j(presetsDomainResult, "presetsDomainResult");
        return new C13060l1(weeklyPlanDomainResult, presetsDomainResult, new a(null), 1);
    }
}
