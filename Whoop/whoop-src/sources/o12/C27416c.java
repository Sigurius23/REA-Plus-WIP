package o12;

import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.commons.Status;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.CustomizeBottomSheetModel;
import com.whoop.design.models.items.CustomizeBottomSheetSelectorModel;
import com.whoop.educationModels.FeatureEducationButtonDto;
import com.whoop.educationModels.FeatureEducationDto;
import com.whoop.educationModels.FeatureEducationScreenDto;
import com.whoop.onboarding.story.domain.network.C9615a;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sw0.AbstractC33051h;
import sw0.C33050g;
import sw0.C33052i;
import sw0.C33053j;
import z82.C40191e;

/* JADX INFO: renamed from: o12.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001;B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\f*\u00020\f2\u0006\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\f*\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\f*\u00020\f2\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010\u001aJ\u001b\u0010!\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0014\u0010#\u001a\u00020\f*\u00020\fH\u0082@¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\f*\u00020\f2\u0006\u0010'\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010\u001eJ\u001c\u0010*\u001a\u00020\f*\u00020\f2\u0006\u0010)\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020\u001b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b-\u0010.J)\u00102\u001a\u00020,2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001b2\b\u00101\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b2\u00103J1\u00104\u001a\u00020,2\u0006\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u001b2\b\u00101\u001a\u0004\u0018\u00010\n2\u0006\u0010'\u001a\u00020\u001bH\u0002¢\u0006\u0004\b4\u00105J!\u00109\u001a\b\u0012\u0004\u0012\u00020\f062\f\u00108\u001a\b\u0012\u0004\u0012\u00020706¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006E"}, m65681d2 = {"Lo12/c;", "", "Lcom/whoop/onboarding/story/domain/network/a;", "repository", "Lz82/e;", "eventDispatcher", "Lfi0/a;", "analytics", "<init>", "(Lcom/whoop/onboarding/story/domain/network/a;Lz82/e;Lfi0/a;)V", "", "type", "Lo12/h;", "s", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/commons/Resource;", "Lcom/whoop/educationModels/FeatureEducationDto;", "story", "Lsw0/g;", "q", "(Lcom/whoop/data/remote/commons/Resource;)Lsw0/g;", "", "r", "(Lcom/whoop/data/remote/commons/Resource;)Ljava/util/List;", "query", "p", "(Lo12/h;Ljava/lang/String;)Lo12/h;", "", "category", "i", "(Lo12/h;I)Lo12/h;", "id", "k", "o", "(Lsw0/g;Ljava/lang/String;)Lsw0/g;", "n", "(Lo12/h;Lq83/d;)Ljava/lang/Object;", "m", "(Lo12/h;)Lo12/h;", "sessionLength", "l", "featureEducationId", "j", "(Lo12/h;ILq83/d;)Ljava/lang/Object;", "Ll83/a0;", "u", "(ILcom/whoop/educationModels/FeatureEducationDto;)V", "oldPageNumber", "newPageNumber", "screenName", "v", "(IILjava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(IILjava/lang/String;I)V", "Lec3/l;", "Lo12/a;", "upstream", "t", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/onboarding/story/domain/network/a;", "b", "Lz82/e;", "c", "Lfi0/a;", "d", "Lo12/h;", "initialAcc", "e", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27416c {

    /* JADX INFO: renamed from: e */
    private static final a f110396e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f110397f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C9615a repository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27421h initialAcc;

    /* JADX INFO: renamed from: o12.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lo12/c$a;", "", "<init>", "()V", "", "DEVICE_SETUP_STORY", "I", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: o12.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.OnboardingStoryInteractor", m100430f = "OnboardingStoryInteractor.kt", m100431l = {145}, m100432m = "handleCompleteOnboarding", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f110402E;

        /* JADX INFO: renamed from: w */
        Object f110403w;

        /* JADX INFO: renamed from: x */
        int f110404x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f110405y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f110405y = obj;
            this.f110402E |= Integer.MIN_VALUE;
            return C27416c.this.m82795j(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: o12.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.OnboardingStoryInteractor", m100430f = "OnboardingStoryInteractor.kt", m100431l = {105, 107}, m100432m = "handleSaveCustomBehaviorApiCall", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f110407E;

        /* JADX INFO: renamed from: w */
        Object f110408w;

        /* JADX INFO: renamed from: x */
        Object f110409x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f110410y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f110410y = obj;
            this.f110407E |= Integer.MIN_VALUE;
            return C27416c.this.m82799n(null, this);
        }
    }

    /* JADX INFO: renamed from: o12.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.OnboardingStoryInteractor", m100430f = "OnboardingStoryInteractor.kt", m100431l = {42}, m100432m = "initializeStory", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f110412w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f110413x;

        /* JADX INFO: renamed from: z */
        int f110415z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f110413x = obj;
            this.f110415z |= Integer.MIN_VALUE;
            return C27416c.this.m82804s(null, this);
        }
    }

    /* JADX INFO: renamed from: o12.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.OnboardingStoryInteractor$interact$1", m100430f = "OnboardingStoryInteractor.kt", m100431l = {29, 32, 34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lo12/h;", "acc", "Lo12/a;", "domainAction", "<anonymous>", "(Lo12/h;Lo12/a;)Lo12/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f110416w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f110417x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f110418y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C27421h c27421h, AbstractC27414a abstractC27414a, InterfaceC30057d<? super C27421h> interfaceC30057d) {
            e eVar = C27416c.this.new e(interfaceC30057d);
            eVar.f110417x = c27421h;
            eVar.f110418y = abstractC27414a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (r8 == r2) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
        
            if (r8 == r2) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
        
            if (r8 == r2) goto L42;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o12.C27416c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C27416c(C9615a repository, C40191e eventDispatcher, InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.repository = repository;
        this.eventDispatcher = eventDispatcher;
        this.analytics = analytics;
        this.initialAcc = new C27421h(AbstractC27415b.c.f110395a, 0, null, null, null, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C27421h m82794i(C27421h c27421h, int i13) {
        if (c27421h.getCustomizeBottomSheetDomainState() != null) {
            return C27421h.m82840b(c27421h, null, 0, null, null, C33050g.m104626b(c27421h.getCustomizeBottomSheetDomainState(), null, null, null, null, c27421h.getCustomizeBottomSheetDomainState().m104629d().get(i13), null, null, null, null, null, null, null, 4079, null), 15, null);
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m82795j(C27421h c27421h, int i13, InterfaceC30057d<? super C27421h> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f110402E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f110402E = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f110405y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = bVar.f110402E;
        if (i15 != 0) {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C27421h c27421h2 = (C27421h) bVar.f110403w;
            AbstractC34132o.m107864I(obj);
            return c27421h2;
        }
        AbstractC34132o.m107864I(obj);
        m82805u(i13, c27421h.getStory());
        C9615a c9615a = this.repository;
        bVar.f110403w = c27421h;
        bVar.f110404x = i13;
        bVar.f110402E = 1;
        return c9615a.m23157f(i13, bVar) == enumC31071a ? enumC31071a : c27421h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final C27421h m82796k(C27421h c27421h, String str) {
        if (c27421h.getCustomizeBottomSheetDomainState() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        List<String> listM82845f = c27421h.m82845f();
        if (listM82845f.contains(str)) {
            listM82845f.remove(str);
        } else {
            listM82845f.add(str);
        }
        return C27421h.m82840b(c27421h, null, 0, null, c27421h.m82845f(), m82800o(c27421h.getCustomizeBottomSheetDomainState(), str), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final C27421h m82797l(C27421h c27421h, int i13) {
        FeatureEducationType type;
        List<FeatureEducationScreenDto> screens;
        FeatureEducationDto story = c27421h.getStory();
        String strName = null;
        if (((story == null || (screens = story.getScreens()) == null) ? null : Integer.valueOf(screens.size())) == null) {
            return new C27421h(AbstractC27415b.b.f110394a, 0, null, null, null, 30, null);
        }
        int size = c27421h.getStory().getScreens().size() - 1;
        int pageNumber = c27421h.getPageNumber() + 1;
        int i14 = pageNumber > size ? size : pageNumber;
        C27421h c27421hM82840b = C27421h.m82840b(c27421h, AbstractC27415b.a.f110393a, i14, c27421h.getStory(), null, null, 24, null);
        int pageNumber2 = c27421h.getPageNumber();
        FeatureEducationDto story2 = c27421hM82840b.getStory();
        if (story2 != null && (type = story2.getType()) != null) {
            strName = type.name();
        }
        m82807w(pageNumber2, i14, strName, i13);
        return c27421hM82840b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final C27421h m82798m(C27421h c27421h) {
        FeatureEducationType type;
        int pageNumber = c27421h.getPageNumber() - 1;
        if (pageNumber < 0) {
            pageNumber = 0;
        }
        int i13 = pageNumber;
        C27421h c27421hM82840b = C27421h.m82840b(c27421h, AbstractC27415b.a.f110393a, i13, c27421h.getStory(), null, null, 24, null);
        int pageNumber2 = c27421h.getPageNumber();
        FeatureEducationDto story = c27421hM82840b.getStory();
        m82806v(pageNumber2, i13, (story == null || (type = story.getType()) == null) ? null : type.name());
        return c27421hM82840b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m82799n(C27421h c27421h, InterfaceC30057d<? super C27421h> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f110407E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f110407E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f110410y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = cVar.f110407E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            List<String> listM82845f = c27421h.m82845f();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM82845f, 10));
            Iterator<T> it = listM82845f.iterator();
            while (it.hasNext()) {
                arrayList.add(new Integer(Integer.parseInt((String) it.next())));
            }
            C9615a c9615a = this.repository;
            ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList);
            cVar.f110408w = c27421h;
            cVar.f110409x = null;
            cVar.f110407E = 1;
            if (c9615a.m23159i(arrayList2, cVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C27421h c27421h2 = (C27421h) cVar.f110408w;
            AbstractC34132o.m107864I(obj);
            return c27421h2;
        }
        c27421h = (C27421h) cVar.f110408w;
        AbstractC34132o.m107864I(obj);
        cVar.f110408w = c27421h;
        cVar.f110409x = null;
        cVar.f110407E = 2;
        return m82804s("SAVE_JOURNAL", cVar) == obj2 ? obj2 : c27421h;
    }

    /* JADX INFO: renamed from: o */
    private final C33050g m82800o(C33050g c33050g, String str) {
        List<C33052i> listM104635j = c33050g.m104635j();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM104635j, 10));
        for (C33052i c33052i : listM104635j) {
            List<C33053j> listM104651f = c33052i.m104651f();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM104651f, 10));
            for (C33053j c33053jM104653d : listM104651f) {
                if (AbstractC22676k.m65745e(c33053jM104653d.getId(), str)) {
                    boolean isSelected = c33053jM104653d.getIsSelected();
                    c33053jM104653d = c33053jM104653d.m104653d((65531 & 1) != 0 ? c33053jM104653d.id : null, (65531 & 2) != 0 ? c33053jM104653d.title : null, (65531 & 4) != 0 ? c33053jM104653d.isSelected : !isSelected, (65531 & 8) != 0 ? c33053jM104653d.sortPriority : 0, (65531 & 16) != 0 ? c33053jM104653d.selectedValue : !isSelected ? 1 : null, (65531 & 32) != 0 ? c33053jM104653d.categories : null, (65531 & 64) != 0 ? c33053jM104653d.iconUrl : null, (65531 & 128) != 0 ? c33053jM104653d.subtitle : null, (65531 & 256) != 0 ? c33053jM104653d.avoidanceText : null, (65531 & 512) != 0 ? c33053jM104653d.trend : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33053jM104653d.style : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33053jM104653d.dayOptions : null, (65531 & 4096) != 0 ? c33053jM104653d.bottomSheetInfo : null, (65531 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33053jM104653d.weeklyPlanGoal : false, (65531 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33053jM104653d.tag : null, (65531 & 32768) != 0 ? c33053jM104653d.isCustom : false);
                }
                arrayList2.add(c33053jM104653d);
            }
            arrayList.add(C33052i.m104646b(c33052i, null, 0, arrayList2, null, 11, null));
        }
        return C33050g.m104626b(c33050g, null, null, null, null, null, arrayList, null, null, null, null, null, null, 4063, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final C27421h m82801p(C27421h c27421h, String str) {
        if (c27421h.getCustomizeBottomSheetDomainState() != null) {
            return C27421h.m82840b(c27421h, null, 0, null, null, C33050g.m104626b(c27421h.getCustomizeBottomSheetDomainState(), null, str, null, null, null, null, null, null, null, null, null, null, 4093, null), 15, null);
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: renamed from: q */
    private final C33050g m82802q(Resource<FeatureEducationDto> story) {
        CustomizeBottomSheetModel customizeBottomSheetModel;
        CustomizeBottomSheetSelectorModel bottomSheet;
        List<FeatureEducationScreenDto> screens;
        FeatureEducationScreenDto featureEducationScreenDto;
        FeatureEducationButtonDto ctaButton;
        List<DesignSystemModel> items;
        FeatureEducationDto data = story.getData();
        if (data == null || (screens = data.getScreens()) == null || (featureEducationScreenDto = (FeatureEducationScreenDto) AbstractC25265s.m74112P0(screens)) == null || (ctaButton = featureEducationScreenDto.getCtaButton()) == null || (items = ctaButton.getItems()) == null) {
            customizeBottomSheetModel = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : items) {
                if (obj instanceof CustomizeBottomSheetModel) {
                    arrayList.add(obj);
                }
            }
            customizeBottomSheetModel = (CustomizeBottomSheetModel) AbstractC25265s.m74100H0(arrayList);
        }
        if (customizeBottomSheetModel == null || (bottomSheet = customizeBottomSheetModel.getBottomSheet()) == null) {
            return null;
        }
        return AbstractC33051h.m104643d(bottomSheet, customizeBottomSheetModel.getSearchText(), customizeBottomSheetModel.getSelectedIds());
    }

    /* JADX INFO: renamed from: r */
    private final List<String> m82803r(Resource<FeatureEducationDto> story) {
        List<FeatureEducationScreenDto> screens;
        FeatureEducationScreenDto featureEducationScreenDto;
        FeatureEducationButtonDto ctaButton;
        List<DesignSystemModel> items;
        FeatureEducationDto data = story.getData();
        if (data != null && (screens = data.getScreens()) != null && (featureEducationScreenDto = (FeatureEducationScreenDto) AbstractC25265s.m74112P0(screens)) != null && (ctaButton = featureEducationScreenDto.getCtaButton()) != null && (items = ctaButton.getItems()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : items) {
                if (obj instanceof CustomizeBottomSheetModel) {
                    arrayList.add(obj);
                }
            }
            CustomizeBottomSheetModel customizeBottomSheetModel = (CustomizeBottomSheetModel) AbstractC25265s.m74100H0(arrayList);
            if (customizeBottomSheetModel != null) {
                return AbstractC25265s.m74097F1(customizeBottomSheetModel.getSelectedIds());
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m82804s(String str, InterfaceC30057d<? super C27421h> interfaceC30057d) {
        d dVar;
        FeatureEducationType type;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f110415z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f110415z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM23158g = dVar.f110413x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f110415z;
        String strName = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM23158g);
            C9615a c9615a = this.repository;
            dVar.f110412w = null;
            dVar.f110415z = 1;
            objM23158g = c9615a.m23158g(str, dVar);
            if (objM23158g == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM23158g);
        }
        Resource<FeatureEducationDto> resource = (Resource) objM23158g;
        if (resource.getStatus() != Status.SUCCESS) {
            return new C27421h(AbstractC27415b.b.f110394a, 0, null, null, null, 30, null);
        }
        C27421h c27421h = new C27421h(AbstractC27415b.a.f110393a, 0, resource.getData(), m82803r(resource), m82802q(resource));
        int pageNumber = c27421h.getPageNumber();
        FeatureEducationDto story = c27421h.getStory();
        if (story != null && (type = story.getType()) != null) {
            strName = type.name();
        }
        m82806v(-1, pageNumber, strName);
        return c27421h;
    }

    /* JADX INFO: renamed from: u */
    private final void m82805u(int featureEducationId, FeatureEducationDto story) {
        FeatureEducationType type;
        String strName;
        if (featureEducationId == 509) {
            InterfaceC14515a.m41418i(this.analytics, null, null, null, "Continue", null, AbstractC31061c.m95645u("Screen", "Pairing: Connecting device"), 23, null);
        } else {
            if (story == null || (type = story.getType()) == null || (strName = type.name()) == null) {
                return;
            }
            InterfaceC14515a.m41418i(this.analytics, "Onboarding", null, null, strName.concat(" - Completed"), null, null, 54, null);
        }
    }

    /* JADX INFO: renamed from: v */
    private final void m82806v(int oldPageNumber, int newPageNumber, String screenName) {
        if (newPageNumber != oldPageNumber) {
            this.eventDispatcher.m128993I(screenName, Integer.valueOf(newPageNumber));
        }
    }

    /* JADX INFO: renamed from: w */
    private final void m82807w(int oldPageNumber, int newPageNumber, String screenName, int sessionLength) {
        if (newPageNumber != oldPageNumber) {
            this.eventDispatcher.m128995J(oldPageNumber, newPageNumber, screenName, String.valueOf(sessionLength));
        }
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC13058l m82808t(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(this.initialAcc, upstream, new e(null));
    }
}
