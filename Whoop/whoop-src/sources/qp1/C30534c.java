package qp1;

import c93.InterfaceC4351m;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: qp1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lqp1/c;", "", "<init>", "()V", "Lec3/l;", "Lqp1/e;", "hormonalDomainState", "Lqp1/a;", "fertilityDomainState", "Lqp1/b;", "a", "(Lec3/l;Lec3/l;)Lec3/l;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30534c {

    /* JADX INFO: renamed from: qp1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalInsightsSettingsDomainCombiner$combineState$1", m100430f = "HormonalInsightsSettingsDomainCombiner.kt", m100431l = {14}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lqp1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125547w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f125548x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f125548x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f125548x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125547w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f125548x = null;
                this.f125547w = 1;
                if (interfaceC13062m.emit(null, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qp1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.settings.domain.HormonalInsightsSettingsDomainCombiner$combineState$2", m100430f = "HormonalInsightsSettingsDomainCombiner.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lqp1/e;", "hormonal", "Lqp1/a;", "fertility", "Lqp1/b;", "<anonymous>", "(Lqp1/e;Lqp1/a;)Lqp1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f125549w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f125550x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f125551y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC30536e abstractC30536e, AbstractC30532a abstractC30532a, InterfaceC30057d<? super C30533b> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f125550x = abstractC30536e;
            bVar.f125551y = abstractC30532a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC30536e abstractC30536e = (AbstractC30536e) this.f125550x;
            AbstractC30532a abstractC30532a = (AbstractC30532a) this.f125551y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f125549w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C30533b(abstractC30536e, abstractC30532a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m93597a(InterfaceC13058l hormonalDomainState, InterfaceC13058l fertilityDomainState) {
        AbstractC22676k.m65750j(hormonalDomainState, "hormonalDomainState");
        AbstractC22676k.m65750j(fertilityDomainState, "fertilityDomainState");
        return new C13060l1(hormonalDomainState, new C13015a0(new a(null), fertilityDomainState), new b(null), 1);
    }
}
