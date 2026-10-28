package wc0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsAnalyticsDomainModel;
import com.whoop.advancedlabs.domain.models.MetaData;
import com.whoop.advancedlabs.domain.models.NavigationBarModel;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.List;
import l83.C23454a0;
import md0.AbstractC25448c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import tc0.AbstractC33696b;
import vc0.AbstractC35876c;

/* JADX INFO: renamed from: wc0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lwc0/a;", "", "<init>", "()V", "Lec3/l;", "Ltc0/b;", "upstream", "Lvc0/c;", "a", "(Lec3/l;)Lec3/l;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37132a {

    /* JADX INFO: renamed from: wc0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f158853w;

        /* JADX INFO: renamed from: wc0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42583a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f158854w;

            /* JADX INFO: renamed from: wc0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.insightsdeepdive.presentation.reducers.InsightsDeepDiveViewStateReducer$reduce$$inlined$mapNotNull$1$2", m100430f = "InsightsDeepDiveViewStateReducer.kt", m100431l = {62}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42584a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f158855E;

                /* JADX INFO: renamed from: F */
                Object f158856F;

                /* JADX INFO: renamed from: G */
                Object f158857G;

                /* JADX INFO: renamed from: H */
                Object f158858H;

                /* JADX INFO: renamed from: I */
                int f158859I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f158860w;

                /* JADX INFO: renamed from: x */
                int f158861x;

                /* JADX INFO: renamed from: y */
                Object f158862y;

                public C42584a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f158860w = obj;
                    this.f158861x |= Integer.MIN_VALUE;
                    return C42583a.this.emit(null, this);
                }
            }

            public C42583a(InterfaceC13062m interfaceC13062m) {
                this.f158854w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42584a c42584a;
                Object cVar;
                AiContextMetadata aiContextMetadata;
                if (interfaceC30057d instanceof C42584a) {
                    c42584a = (C42584a) interfaceC30057d;
                    int i13 = c42584a.f158861x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42584a.f158861x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42584a = new C42584a(interfaceC30057d);
                    }
                } else {
                    c42584a = new C42584a(interfaceC30057d);
                }
                Object obj2 = c42584a.f158860w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42584a.f158861x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f158854w;
                    AbstractC33696b abstractC33696b = (AbstractC33696b) obj;
                    if (abstractC33696b instanceof AbstractC33696b.b) {
                        cVar = AbstractC35876c.b.f152763b;
                    } else if (abstractC33696b instanceof AbstractC33696b.a) {
                        cVar = AbstractC35876c.a.f152762b;
                    } else if (abstractC33696b instanceof AbstractC33696b.d) {
                        AbstractC33696b.d dVar = (AbstractC33696b.d) abstractC33696b;
                        NavigationBarModel navigationBar = dVar.getResponse().getNavigationBar();
                        List<InterfaceC25312u> listM60540g = AbstractC25448c.m74762z0().m60540g(dVar.getResponse().getSections());
                        AdvancedLabsAnalyticsDomainModel analytics = dVar.getResponse().getAnalytics();
                        MetaData metadata = dVar.getResponse().getMetadata();
                        cVar = new AbstractC35876c.c(navigationBar, listM60540g, analytics, (metadata == null || (aiContextMetadata = metadata.getAiContextMetadata()) == null) ? null : AbstractC6219a.m18523a(aiContextMetadata));
                    } else {
                        if (!(abstractC33696b instanceof AbstractC33696b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar = null;
                    }
                    if (cVar != null) {
                        c42584a.f158862y = null;
                        c42584a.f158855E = null;
                        c42584a.f158856F = null;
                        c42584a.f158857G = null;
                        c42584a.f158858H = null;
                        c42584a.f158859I = 0;
                        c42584a.f158861x = 1;
                        if (interfaceC13062m.emit(cVar, c42584a) == enumC31071a) {
                            return enumC31071a;
                        }
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
            this.f158853w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f158853w.collect(new C42583a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m119050a(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream);
    }
}
