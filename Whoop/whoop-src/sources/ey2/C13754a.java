package ey2;

import dy2.AbstractC12452b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fy2.InterfaceC14880b;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ey2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Ley2/a;", "", "<init>", "()V", "Lec3/l;", "Ldy2/b;", "domainStateFlow", "Lfy2/b;", "a", "(Lec3/l;)Lec3/l;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13754a {

    /* JADX INFO: renamed from: ey2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f49051w;

        /* JADX INFO: renamed from: ey2.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41574a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f49052w;

            /* JADX INFO: renamed from: ey2.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignschedule.reducer.CampaignScheduleViewStateReducer$reduce$$inlined$map$1$2", m100430f = "CampaignScheduleViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41575a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f49053E;

                /* JADX INFO: renamed from: F */
                Object f49054F;

                /* JADX INFO: renamed from: G */
                Object f49055G;

                /* JADX INFO: renamed from: H */
                int f49056H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f49057w;

                /* JADX INFO: renamed from: x */
                int f49058x;

                /* JADX INFO: renamed from: y */
                Object f49059y;

                public C41575a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f49057w = obj;
                    this.f49058x |= Integer.MIN_VALUE;
                    return C41574a.this.emit(null, this);
                }
            }

            public C41574a(InterfaceC13062m interfaceC13062m) {
                this.f49052w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41575a c41575a;
                if (interfaceC30057d instanceof C41575a) {
                    c41575a = (C41575a) interfaceC30057d;
                    int i13 = c41575a.f49058x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41575a.f49058x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41575a = new C41575a(interfaceC30057d);
                    }
                } else {
                    c41575a = new C41575a(interfaceC30057d);
                }
                Object obj2 = c41575a.f49057w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41575a.f49058x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f49052w;
                    InterfaceC14880b viewState = ((C13756c) obj).getViewState();
                    c41575a.f49059y = null;
                    c41575a.f49053E = null;
                    c41575a.f49054F = null;
                    c41575a.f49055G = null;
                    c41575a.f49056H = 0;
                    c41575a.f49058x = 1;
                    if (interfaceC13062m.emit(viewState, c41575a) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public a(InterfaceC13058l interfaceC13058l) {
            this.f49051w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f49051w.collect(new C41574a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ey2.a$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignschedule.reducer.CampaignScheduleViewStateReducer$reduce$1", m100430f = "CampaignScheduleViewStateReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ley2/c;", "accumulator", "Ldy2/b;", "currentDomainState", "<anonymous>", "(Ley2/c;Ldy2/b;)Ley2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f49061w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f49062x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f49063y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C13756c c13756c, AbstractC12452b abstractC12452b, InterfaceC30057d<? super C13756c> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f49062x = c13756c;
            bVar.f49063y = abstractC12452b;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C13756c c13756c = (C13756c) this.f49062x;
            AbstractC12452b abstractC12452b = (AbstractC12452b) this.f49063y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f49061w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(abstractC12452b, AbstractC12452b.c.f42505a)) {
                return C13756c.m39102b(c13756c, InterfaceC14880b.c.f55531a, null, 2, null);
            }
            if (abstractC12452b instanceof AbstractC12452b.a) {
                AbstractC12452b.a aVar = (AbstractC12452b.a) abstractC12452b;
                return c13756c.m39103a(AbstractC13755b.m39095b(aVar.getCampaignScheduleScreen()), AbstractC13755b.m39095b(aVar.getCampaignScheduleScreen()));
            }
            if (abstractC12452b instanceof AbstractC12452b.b) {
                return C13756c.m39102b(c13756c, new InterfaceC14880b.a(((AbstractC12452b.b) abstractC12452b).getCampaignId()), null, 2, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m39092a(InterfaceC13058l domainStateFlow) {
        AbstractC22676k.m65750j(domainStateFlow, "domainStateFlow");
        return AbstractC13091v.m36610t(new a(new C13060l1(new C13756c(InterfaceC14880b.c.f55531a, null, 2, null), domainStateFlow, new b(null))));
    }
}
