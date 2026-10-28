package mb0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.advancedlabs.domain.models.MetaData;
import com.whoop.advancedlabs.domain.models.NavigationBarModel;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ep0.C13404j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb0.AbstractC21533b;
import l83.C23454a0;
import lb0.AbstractC23586c;
import m83.AbstractC25267u;
import md0.AbstractC25448c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: mb0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lmb0/a;", "", "<init>", "()V", "Lec3/l;", "Ljb0/b;", "upstream", "Llb0/c;", "a", "(Lec3/l;)Lec3/l;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25381a {

    /* JADX INFO: renamed from: mb0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f99455w;

        /* JADX INFO: renamed from: mb0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41988a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f99456w;

            /* JADX INFO: renamed from: mb0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.clinicalinsights.presentation.reducers.ClinicalInsightsViewStateReducer$reduce$$inlined$map$1$2", m100430f = "ClinicalInsightsViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41989a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f99457E;

                /* JADX INFO: renamed from: F */
                Object f99458F;

                /* JADX INFO: renamed from: G */
                Object f99459G;

                /* JADX INFO: renamed from: H */
                int f99460H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f99461w;

                /* JADX INFO: renamed from: x */
                int f99462x;

                /* JADX INFO: renamed from: y */
                Object f99463y;

                public C41989a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f99461w = obj;
                    this.f99462x |= Integer.MIN_VALUE;
                    return C41988a.this.emit(null, this);
                }
            }

            public C41988a(InterfaceC13062m interfaceC13062m) {
                this.f99456w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41989a c41989a;
                Object cVar;
                AiContextMetadata aiContextMetadata;
                if (interfaceC30057d instanceof C41989a) {
                    c41989a = (C41989a) interfaceC30057d;
                    int i13 = c41989a.f99462x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41989a.f99462x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41989a = new C41989a(interfaceC30057d);
                    }
                } else {
                    c41989a = new C41989a(interfaceC30057d);
                }
                Object obj2 = c41989a.f99461w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41989a.f99462x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f99456w;
                    AbstractC21533b abstractC21533b = (AbstractC21533b) obj;
                    if (abstractC21533b instanceof AbstractC21533b.b) {
                        cVar = AbstractC23586c.b.f93556b;
                    } else if (abstractC21533b instanceof AbstractC21533b.a) {
                        cVar = AbstractC23586c.a.f93555b;
                    } else {
                        if (!(abstractC21533b instanceof AbstractC21533b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC21533b.c cVar2 = (AbstractC21533b.c) abstractC21533b;
                        MetaData metadata = cVar2.getResponse().getMetadata();
                        C13404j c13404jM18523a = (metadata == null || (aiContextMetadata = metadata.getAiContextMetadata()) == null) ? null : AbstractC6219a.m18523a(aiContextMetadata);
                        NavigationBarModel navigationBar = cVar2.getResponse().getNavigationBar();
                        List<AdvancedLabsSectionModel> sections = cVar2.getResponse().getSections();
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
                        Iterator<T> it = sections.iterator();
                        while (it.hasNext()) {
                            arrayList.add(AbstractC25448c.m74762z0().m60541h((AdvancedLabsSectionModel) it.next()));
                        }
                        cVar = new AbstractC23586c.c(c13404jM18523a, navigationBar, arrayList, cVar2.getResponse().getAnalytics());
                    }
                    c41989a.f99463y = null;
                    c41989a.f99457E = null;
                    c41989a.f99458F = null;
                    c41989a.f99459G = null;
                    c41989a.f99460H = 0;
                    c41989a.f99462x = 1;
                    if (interfaceC13062m.emit(cVar, c41989a) == enumC31071a) {
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
            this.f99455w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f99455w.collect(new C41988a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13058l m74423a(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream);
    }
}
