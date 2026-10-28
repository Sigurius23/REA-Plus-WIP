package zp1;

import ad3.AbstractC0757c;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsSegmentModel;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.GenericSymptomsScreenResponse;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.SegmentControlDisplay;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import h51.C16934f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import to1.AbstractC34019l;
import wp1.AbstractC37498b;
import yp1.AbstractC39703b;

/* JADX INFO: renamed from: zp1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lzp1/c;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lad3/c;", "json", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lad3/c;)V", "", "selectedSegmentId", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;", "response", "Lyp1/b;", "g", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;)Lyp1/b;", "Lec3/l;", "Lwp1/b;", "upstream", "f", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Lad3/c;", "Ljb1/a;", "c", "Ljb1/a;", "designItemReducer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40942c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21535a designItemReducer;

    /* JADX INFO: renamed from: zp1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return C16934f.m47677b((C16934f) it, null, null, null, null, null, null, false, false, null, null, null, null, false, 8063, null);
        }
    }

    /* JADX INFO: renamed from: zp1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f176629w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C40942c f176630x;

        /* JADX INFO: renamed from: zp1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f176631w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C40942c f176632x;

            /* JADX INFO: renamed from: zp1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.symptompatterns.presentation.reducers.SymptomPatternsViewStateReducer$reduce$$inlined$map$1$2", m100430f = "SymptomPatternsViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42771a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f176633E;

                /* JADX INFO: renamed from: F */
                Object f176634F;

                /* JADX INFO: renamed from: G */
                Object f176635G;

                /* JADX INFO: renamed from: H */
                int f176636H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f176637w;

                /* JADX INFO: renamed from: x */
                int f176638x;

                /* JADX INFO: renamed from: y */
                Object f176639y;

                public C42771a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f176637w = obj;
                    this.f176638x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C40942c c40942c) {
                this.f176631w = interfaceC13062m;
                this.f176632x = c40942c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42771a c42771a;
                Object objM132854g;
                if (interfaceC30057d instanceof C42771a) {
                    c42771a = (C42771a) interfaceC30057d;
                    int i13 = c42771a.f176638x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42771a.f176638x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42771a = new C42771a(interfaceC30057d);
                    }
                } else {
                    c42771a = new C42771a(interfaceC30057d);
                }
                Object obj2 = c42771a.f176637w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42771a.f176638x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f176631w;
                    AbstractC37498b abstractC37498b = (AbstractC37498b) obj;
                    if (AbstractC22676k.m65745e(abstractC37498b, AbstractC37498b.b.f160385a)) {
                        objM132854g = AbstractC39703b.b.f170891b;
                    } else if (abstractC37498b instanceof AbstractC37498b.a) {
                        objM132854g = new AbstractC39703b.a(((AbstractC37498b.a) abstractC37498b).getError());
                    } else {
                        if (!(abstractC37498b instanceof AbstractC37498b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC37498b.c cVar = (AbstractC37498b.c) abstractC37498b;
                        objM132854g = this.f176632x.m132854g(cVar.getSelectedSegmentId(), cVar.getResponse());
                    }
                    c42771a.f176639y = null;
                    c42771a.f176633E = null;
                    c42771a.f176634F = null;
                    c42771a.f176635G = null;
                    c42771a.f176636H = 0;
                    c42771a.f176638x = 1;
                    if (interfaceC13062m.emit(objM132854g, c42771a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C40942c c40942c) {
            this.f176629w = interfaceC13058l;
            this.f176630x = c40942c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f176629w.collect(new a(interfaceC13062m, this.f176630x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C40942c(FeatureFlagChecker featureFlagChecker, AbstractC0757c json) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(json, "json");
        this.featureFlagChecker = featureFlagChecker;
        this.json = json;
        this.designItemReducer = AbstractC21537c.m60554d(new C40941b(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m132852d(C40942c c40942c, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C40941b(c40942c, 1));
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C16934f.class), new a());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m132853e(C40942c c40942c, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        AbstractC34019l.m107569y(addModelMapper, c40942c.json, null, c40942c.featureFlagChecker.isFeatureEnabled("hormonal-insights-updates"), null, false, 26, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final AbstractC39703b m132854g(String selectedSegmentId, GenericSymptomsScreenResponse response) {
        List<DesignSystemModel> tiles;
        if (selectedSegmentId == null) {
            SegmentControlDisplay segmentControlDisplay = (SegmentControlDisplay) AbstractC25265s.m74100H0(response.getSegmentedControlDisplays());
            selectedSegmentId = segmentControlDisplay != null ? segmentControlDisplay.getId() : null;
            if (selectedSegmentId == null && (selectedSegmentId = (String) AbstractC25265s.m74098G0(response.getSegments().keySet())) == null) {
                selectedSegmentId = "";
            }
        }
        SymptomsSegmentModel symptomsSegmentModel = response.getSegments().get(selectedSegmentId);
        if (symptomsSegmentModel == null || (tiles = symptomsSegmentModel.getTiles()) == null) {
            tiles = C25271y.f99162w;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(response.getNavigationTitle());
        List<SegmentControlDisplay> segmentedControlDisplays = response.getSegmentedControlDisplays();
        List<DesignSystemModel> list = tiles;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.designItemReducer.m60541h((DesignSystemModel) it.next()));
        }
        return new AbstractC39703b.c(textResourceM21278l, segmentedControlDisplays, selectedSegmentId, arrayList);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m132855f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(upstream, this);
    }
}
