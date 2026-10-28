package n72;

import c41.C4092p2;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.UnknownDesignModel;
import com.whoop.sage.domain.models.LockedContent;
import com.whoop.sage.domain.models.MetaData;
import com.whoop.sage.domain.models.SageBottomSheetModel;
import com.whoop.sage.domain.models.SageResponse;
import com.whoop.sage.domain.models.Section;
import com.whoop.sage.domain.models.UnlockedContent;
import d72.AbstractC11761b;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m72.AbstractC25208g;
import m72.C25202a;
import m72.C25204c;
import m72.C25205d;
import m72.C25210i;
import m72.EnumC25203b;
import m72.EnumC25209h;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import y71.C39282o;

/* JADX INFO: renamed from: n72.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Ln72/d;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lcom/whoop/sage/domain/models/SageResponse;", "response", "Ln72/d$a;", "accumulation", "c", "(Lcom/whoop/sage/domain/models/SageResponse;Ln72/d$a;)Ln72/d$a;", "Lcom/whoop/sage/domain/models/SageBottomSheetModel;", "model", "Lm72/d;", "e", "(Lcom/whoop/sage/domain/models/SageBottomSheetModel;)Lm72/d;", "", "hasNavigatedToOnboarding", "Lm72/g$c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/sage/domain/models/SageResponse;Z)Lm72/g$c;", "viewState", "", "id", "d", "(Lm72/g$c;Ljava/lang/String;)Lm72/g$c;", "item", "g", "(Ljava/lang/Object;Ljava/lang/String;)Z", "Lec3/l;", "Ld72/b;", "upstream", "Lm72/g;", "f", "(Lec3/l;)Lec3/l;", "Ljb1/a;", "a", "Ljb1/a;", "designSystemReducer", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26441d {

    /* JADX INFO: renamed from: b */
    public static final int f105022b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designSystemReducer;

    /* JADX INFO: renamed from: n72.d$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ln72/d$a;", "", "Lm72/g;", "sageViewState", "", "hasNavigatedToOnboarding", "<init>", "(Lm72/g;Z)V", "a", "(Lm72/g;Z)Ln72/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lm72/g;", "d", "()Lm72/g;", "b", "Z", "c", "()Z", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC25208g sageViewState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean hasNavigatedToOnboarding;

        public a(AbstractC25208g sageViewState, boolean z4) {
            AbstractC22676k.m65750j(sageViewState, "sageViewState");
            this.sageViewState = sageViewState;
            this.hasNavigatedToOnboarding = z4;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m78287b(a aVar, AbstractC25208g abstractC25208g, boolean z4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC25208g = aVar.sageViewState;
            }
            if ((i13 & 2) != 0) {
                z4 = aVar.hasNavigatedToOnboarding;
            }
            return aVar.m78288a(abstractC25208g, z4);
        }

        /* JADX INFO: renamed from: a */
        public final a m78288a(AbstractC25208g sageViewState, boolean hasNavigatedToOnboarding) {
            AbstractC22676k.m65750j(sageViewState, "sageViewState");
            return new a(sageViewState, hasNavigatedToOnboarding);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getHasNavigatedToOnboarding() {
            return this.hasNavigatedToOnboarding;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AbstractC25208g getSageViewState() {
            return this.sageViewState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.sageViewState, aVar.sageViewState) && this.hasNavigatedToOnboarding == aVar.hasNavigatedToOnboarding;
        }

        public int hashCode() {
            return Boolean.hashCode(this.hasNavigatedToOnboarding) + (this.sageViewState.hashCode() * 31);
        }

        public String toString() {
            return "SageViewStateAccumulation(sageViewState=" + this.sageViewState + ", hasNavigatedToOnboarding=" + this.hasNavigatedToOnboarding + ")";
        }
    }

    /* JADX INFO: renamed from: n72.d$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f105026w;

        /* JADX INFO: renamed from: n72.d$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f105027w;

            /* JADX INFO: renamed from: n72.d$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sage.presentation.reducers.SageViewStateReducer$reduce$$inlined$map$1$2", m100430f = "SageViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42041a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f105028E;

                /* JADX INFO: renamed from: F */
                Object f105029F;

                /* JADX INFO: renamed from: G */
                Object f105030G;

                /* JADX INFO: renamed from: H */
                int f105031H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f105032w;

                /* JADX INFO: renamed from: x */
                int f105033x;

                /* JADX INFO: renamed from: y */
                Object f105034y;

                public C42041a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f105032w = obj;
                    this.f105033x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f105027w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42041a c42041a;
                if (interfaceC30057d instanceof C42041a) {
                    c42041a = (C42041a) interfaceC30057d;
                    int i13 = c42041a.f105033x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42041a.f105033x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42041a = new C42041a(interfaceC30057d);
                    }
                } else {
                    c42041a = new C42041a(interfaceC30057d);
                }
                Object obj2 = c42041a.f105032w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42041a.f105033x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f105027w;
                    AbstractC25208g sageViewState = ((a) obj).getSageViewState();
                    c42041a.f105034y = null;
                    c42041a.f105028E = null;
                    c42041a.f105029F = null;
                    c42041a.f105030G = null;
                    c42041a.f105031H = 0;
                    c42041a.f105033x = 1;
                    if (interfaceC13062m.emit(sageViewState, c42041a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f105026w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f105026w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: n72.d$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.presentation.reducers.SageViewStateReducer$reduce$1", m100430f = "SageViewStateReducer.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ln72/d$a;", "accumulation", "Ld72/b;", "domainResult", "<anonymous>", "(Ln72/d$a;Ld72/b;)Ln72/d$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f105036w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f105037x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f105038y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, AbstractC11761b abstractC11761b, InterfaceC30057d<? super a> interfaceC30057d) {
            c cVar = C26441d.this.new c(interfaceC30057d);
            cVar.f105037x = aVar;
            cVar.f105038y = abstractC11761b;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVarM78287b;
            a aVar = (a) this.f105037x;
            AbstractC11761b abstractC11761b = (AbstractC11761b) this.f105038y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f105036w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (abstractC11761b instanceof AbstractC11761b.c) {
                return a.m78287b(aVar, AbstractC25208g.a.f99003b, false, 2, null);
            }
            if (abstractC11761b instanceof AbstractC11761b.f) {
                return C26441d.this.m78281c(((AbstractC11761b.f) abstractC11761b).getResponse(), aVar);
            }
            if (abstractC11761b instanceof AbstractC11761b.d) {
                return a.m78287b(aVar, null, true, 1, null);
            }
            if (!(abstractC11761b instanceof AbstractC11761b.e)) {
                if (abstractC11761b instanceof AbstractC11761b.a) {
                    return C26441d.this.m78281c(((AbstractC11761b.a) abstractC11761b).getResponse(), aVar);
                }
                if (!(abstractC11761b instanceof AbstractC11761b.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC25208g sageViewState = aVar.getSageViewState();
                AbstractC25208g.c cVar = sageViewState instanceof AbstractC25208g.c ? (AbstractC25208g.c) sageViewState : null;
                if (cVar != null && (aVarM78287b = a.m78287b(aVar, C26441d.this.m78282d(cVar, ((AbstractC11761b.b) abstractC11761b).getDismissalId()), false, 2, null)) != null) {
                    return aVarM78287b;
                }
            }
            return aVar;
        }
    }

    public C26441d(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.designSystemReducer = AbstractC26440c.m78271f(featureFlagChecker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public final a m78281c(SageResponse response, a accumulation) {
        AbstractC25208g.c cVarM78285h = m78285h(response, accumulation.getHasNavigatedToOnboarding());
        String navigationTitle = response.getNavigationTitle();
        TagModel navigationTag = response.getNavigationTag();
        InterfaceC25312u interfaceC25312uM60541h = navigationTag != null ? this.designSystemReducer.m60541h(navigationTag) : null;
        return accumulation.m78288a(new AbstractC25208g.c(navigationTitle, interfaceC25312uM60541h instanceof C17750h1 ? (C17750h1) interfaceC25312uM60541h : null, cVarM78285h.getContent(), cVarM78285h.getLockedContent(), cVarM78285h.getHasNavigatedToOnboarding(), cVarM78285h.getSageBottomSheetState()), accumulation.getHasNavigatedToOnboarding() || cVarM78285h.getHasNavigatedToOnboarding());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final AbstractC25208g.c m78282d(AbstractC25208g.c viewState, String id4) {
        List arrayList;
        List<C25210i> listM73797e;
        C25202a content = viewState.getContent();
        if (content == null || (listM73797e = content.m73797e()) == null) {
            arrayList = C25271y.f99162w;
        } else {
            arrayList = new ArrayList();
            for (C25210i c25210i : listM73797e) {
                List<InterfaceC25312u> listM73831c = c25210i.m73831c();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listM73831c) {
                    if (!m78284g((InterfaceC25312u) obj, id4)) {
                        arrayList2.add(obj);
                    }
                }
                C25210i c25210iM73829b = (!arrayList2.isEmpty() || c25210i.m73831c().isEmpty()) ? C25210i.m73829b(c25210i, null, null, null, arrayList2, 7, null) : null;
                if (c25210iM73829b != null) {
                    arrayList.add(c25210iM73829b);
                }
            }
        }
        List list = arrayList;
        C25202a content2 = viewState.getContent();
        return AbstractC25208g.c.m73819c(viewState, null, null, content2 != null ? C25202a.m73793b(content2, false, list, null, 5, null) : null, null, false, null, 59, null);
    }

    /* JADX INFO: renamed from: e */
    private final C25205d m78283e(SageBottomSheetModel model) {
        EnumC16313m0 enumC16313m0;
        if (model == null) {
            return null;
        }
        String icon = model.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.WHOOP_LOGO;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        EnumC16313m0 enumC16313m2 = enumC16313m0 == null ? enumC16313m1 : enumC16313m0;
        String title = model.getTitle();
        String description = model.getDescription();
        TagModel tag = model.getTag();
        InterfaceC25312u interfaceC25312uM60541h = tag != null ? this.designSystemReducer.m60541h(tag) : null;
        return new C25205d(enumC16313m2, title, description, interfaceC25312uM60541h instanceof C17750h1 ? (C17750h1) interfaceC25312uM60541h : null, model.getButtonText(), model.getNavigation());
    }

    /* JADX INFO: renamed from: g */
    private final boolean m78284g(Object item, String id4) {
        return (item instanceof C4092p2) && AbstractC22676k.m65745e(((C4092p2) item).getComponentDismissalId(), id4);
    }

    /* JADX INFO: renamed from: h */
    private final AbstractC25208g.c m78285h(SageResponse response, boolean hasNavigatedToOnboarding) {
        C25204c c25204c;
        C25202a c25202a;
        AiContextMetadata aiContextMetadata;
        EnumC25209h enumC25209hValueOf;
        EnumC25203b enumC25203b;
        AbstractC17911t abstractC17911tM43972A;
        LockedContent lockedContent = response.getLockedContent();
        if (lockedContent != null) {
            String buttonStyle = lockedContent.getButtonStyle();
            EnumC25203b enumC25203b2 = EnumC25203b.DEFAULT;
            EnumC25203b[] enumC25203bArrValues = EnumC25203b.values();
            int length = enumC25203bArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC25203b = null;
                    break;
                }
                enumC25203b = enumC25203bArrValues[i13];
                if (AbstractC22676k.m65745e(enumC25203b.name(), buttonStyle)) {
                    break;
                }
                i13++;
            }
            if (enumC25203b != null) {
                enumC25203b2 = enumC25203b;
            }
            if (enumC25203b2 == EnumC25203b.DEFAULT) {
                C17909s c17909s = AbstractC17911t.f69612b;
                long j7 = C17919x.f69629f;
                abstractC17911tM43972A = C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(j7)), 0L, 0L, 14);
            } else {
                abstractC17911tM43972A = AbstractC15673b0.m43972A();
            }
            c25204c = new C25204c(AbstractC22404p.m64503l(lockedContent.getLockedIcon()), lockedContent.getHeaderTextDisplay(), lockedContent.getDescriptionDisplay(), abstractC17911tM43972A, lockedContent.getButtonTextDisplay(), lockedContent.getButtonDestination());
        } else {
            c25204c = null;
        }
        C25205d c25205dM78283e = m78283e(response.getNavigationTagDialogContent());
        String navigationTitle = response.getNavigationTitle();
        TagModel navigationTag = response.getNavigationTag();
        InterfaceC25312u interfaceC25312uM60541h = navigationTag != null ? this.designSystemReducer.m60541h(navigationTag) : null;
        C17750h1 c17750h1 = interfaceC25312uM60541h instanceof C17750h1 ? (C17750h1) interfaceC25312uM60541h : null;
        UnlockedContent unlockedContent = response.getUnlockedContent();
        if (unlockedContent != null) {
            boolean hasOnboarded = unlockedContent.getHasOnboarded();
            List<Section> sections = unlockedContent.getSections();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
            for (Section section : sections) {
                String titleDisplay = section.getTitleDisplay();
                String titleStyle = section.getTitleStyle();
                if (titleStyle == null || (enumC25209hValueOf = EnumC25209h.valueOf(titleStyle)) == null) {
                    enumC25209hValueOf = EnumC25209h.LARGE;
                }
                String subtitleDisplay = section.getSubtitleDisplay();
                List<DesignSystemModel> items = section.getItems();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : items) {
                    if (!(((DesignSystemModel) obj) instanceof UnknownDesignModel)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    InterfaceC25312u interfaceC25312uM60541h2 = this.designSystemReducer.m60541h((DesignSystemModel) it.next());
                    if (interfaceC25312uM60541h2 instanceof C39282o) {
                        C39282o c39282o = (C39282o) interfaceC25312uM60541h2;
                        interfaceC25312uM60541h2 = c39282o.m125211a((32735 & 1) != 0 ? c39282o.androidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String : null, (32735 & 2) != 0 ? c39282o.title : null, (32735 & 4) != 0 ? c39282o.titleColor : null, (32735 & 8) != 0 ? c39282o.enabled : false, (32735 & 16) != 0 ? c39282o.selected : false, (32735 & 32) != 0 ? c39282o.alignment : null, (32735 & 64) != 0 ? c39282o.shouldApplyCardGradient : false, (32735 & 128) != 0 ? c39282o.background : null, (32735 & 256) != 0 ? c39282o.border : null, (32735 & 512) != 0 ? c39282o.destination : null, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c39282o.showCaretIcon : false, (32735 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c39282o.menuItemStyle : null, (32735 & 4096) != 0 ? c39282o.trackingId : null, (32735 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c39282o.genericInteraction : null, (32735 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c39282o.analyticEvent : null);
                    }
                    arrayList3.add(interfaceC25312uM60541h2);
                }
                arrayList.add(new C25210i(titleDisplay, enumC25209hValueOf, subtitleDisplay, arrayList3));
            }
            MetaData metadata = response.getMetadata();
            c25202a = new C25202a(hasOnboarded, arrayList, (metadata == null || (aiContextMetadata = metadata.getAiContextMetadata()) == null) ? null : AbstractC6219a.m18523a(aiContextMetadata));
        } else {
            c25202a = null;
        }
        return new AbstractC25208g.c(navigationTitle, c17750h1, c25202a, c25204c, hasNavigatedToOnboarding, c25205dM78283e);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m78286f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(new C13060l1(new a(AbstractC25208g.b.f99004b, false), upstream, new c(null)));
    }
}
