package zp2;

import com.whoop.user.journey.model.HeaderContentModel;
import com.whoop.user.journey.model.UserJourneyContentModel;
import com.whoop.user.journey.model.UserJourneyContentModelV2;
import com.whoop.user.journey.model.UserJourneyContentState;
import com.whoop.user.journey.model.UserJourneySection;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kz0.C22920a;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: zp2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001'B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00192\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J#\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Lzp2/f;", "Lod1/g;", "Lzp2/e;", "Lzp2/c;", "Lzp2/d;", "contentInteractor", "Lzp2/j;", "progressInteractor", "Lzp2/b;", "timeCapsuleRepository", "<init>", "(Lzp2/d;Lzp2/j;Lzp2/b;)V", "result", "", "year", "i", "(Lzp2/c;ILq83/d;)Ljava/lang/Object;", "Lzp2/e$e;", "action", "j", "(Lzp2/c;Lzp2/e$e;Lq83/d;)Ljava/lang/Object;", "", "Lkz0/a;", "sections", "stepIndex", "Ll83/k;", "f", "(Ljava/util/List;I)Ll83/k;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lzp2/c;Lzp2/e;)Lzp2/c;", "Lzp2/k;", "currentState", "Lzp2/h;", "g", "(Lzp2/e;Lzp2/k;)Lzp2/h;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lzp2/d;", "b", "Lzp2/j;", "c", "Lzp2/b;", "d", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40948f implements InterfaceC27844g<AbstractC40947e, AbstractC40945c> {

    /* JADX INFO: renamed from: e */
    public static final int f176692e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C40946d contentInteractor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C40952j progressInteractor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C40944b timeCapsuleRepository;

    /* JADX INFO: renamed from: zp2.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.UserJourneyDomainCombiner", m100430f = "UserJourneyDomainCombiner.kt", m100431l = {37}, m100432m = "handleRefresh", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f176696E;

        /* JADX INFO: renamed from: w */
        Object f176697w;

        /* JADX INFO: renamed from: x */
        int f176698x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f176699y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176699y = obj;
            this.f176696E |= Integer.MIN_VALUE;
            return C40948f.this.m132877i(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: zp2.f$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.UserJourneyDomainCombiner", m100430f = "UserJourneyDomainCombiner.kt", m100431l = {115}, m100432m = "handleTimeCapsuleSubmit", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f176701E;

        /* JADX INFO: renamed from: w */
        Object f176702w;

        /* JADX INFO: renamed from: x */
        Object f176703x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f176704y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f176704y = obj;
            this.f176701E |= Integer.MIN_VALUE;
            return C40948f.this.m132878j(null, null, this);
        }
    }

    /* JADX INFO: renamed from: zp2.f$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.domain.UserJourneyDomainCombiner$interact$1", m100430f = "UserJourneyDomainCombiner.kt", m100431l = {27, 30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lzp2/c;", "result", "Lzp2/e;", "action", "<anonymous>", "(Lzp2/c;Lzp2/e;)Lzp2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f176706w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f176707x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f176708y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC40945c abstractC40945c, AbstractC40947e abstractC40947e, InterfaceC30057d<? super AbstractC40945c> interfaceC30057d) {
            d dVar = C40948f.this.new d(interfaceC30057d);
            dVar.f176707x = abstractC40945c;
            dVar.f176708y = abstractC40947e;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            if (r7 == r2) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        
            if (r7 == r2) goto L25;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f176707x
                zp2.c r0 = (zp2.AbstractC40945c) r0
                java.lang.Object r1 = r6.f176708y
                zp2.e r1 = (zp2.AbstractC40947e) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r6.f176706w
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L24
                if (r3 == r5) goto L20
                if (r3 != r4) goto L18
                p505ts.AbstractC34132o.m107864I(r7)
                goto L60
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L48
            L24:
                p505ts.AbstractC34132o.m107864I(r7)
                boolean r7 = r1 instanceof zp2.AbstractC40947e.c
                if (r7 == 0) goto L2e
                zp2.c$b r7 = zp2.AbstractC40945c.b.f176670a
                return r7
            L2e:
                boolean r7 = r1 instanceof zp2.AbstractC40947e.d
                r3 = 0
                if (r7 == 0) goto L4b
                zp2.f r7 = zp2.C40948f.this
                zp2.e$d r1 = (zp2.AbstractC40947e.d) r1
                int r1 = r1.getYear()
                r6.f176707x = r3
                r6.f176708y = r3
                r6.f176706w = r5
                java.lang.Object r7 = zp2.C40948f.m132872d(r7, r0, r1, r6)
                if (r7 != r2) goto L48
                goto L5f
            L48:
                zp2.c r7 = (zp2.AbstractC40945c) r7
                return r7
            L4b:
                boolean r7 = r1 instanceof zp2.AbstractC40947e.e
                if (r7 == 0) goto L63
                zp2.f r7 = zp2.C40948f.this
                zp2.e$e r1 = (zp2.AbstractC40947e.e) r1
                r6.f176707x = r3
                r6.f176708y = r3
                r6.f176706w = r4
                java.lang.Object r7 = zp2.C40948f.m132873e(r7, r0, r1, r6)
                if (r7 != r2) goto L60
            L5f:
                return r2
            L60:
                zp2.c r7 = (zp2.AbstractC40945c) r7
                return r7
            L63:
                zp2.f r7 = zp2.C40948f.this
                zp2.c r7 = zp2.C40948f.m132871c(r7, r0, r1)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zp2.C40948f.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C40948f(C40946d contentInteractor, C40952j progressInteractor, C40944b timeCapsuleRepository) {
        AbstractC22676k.m65750j(contentInteractor, "contentInteractor");
        AbstractC22676k.m65750j(progressInteractor, "progressInteractor");
        AbstractC22676k.m65750j(timeCapsuleRepository, "timeCapsuleRepository");
        this.contentInteractor = contentInteractor;
        this.progressInteractor = progressInteractor;
        this.timeCapsuleRepository = timeCapsuleRepository;
    }

    /* JADX INFO: renamed from: f */
    private final C23465k m132874f(List<C22920a> sections, int stepIndex) {
        int i13 = 0;
        if (sections.isEmpty()) {
            return new C23465k(0, 0);
        }
        int totalSteps = 0;
        for (C22920a c22920a : sections) {
            int i14 = i13 + 1;
            if (stepIndex < c22920a.getTotalSteps() + totalSteps) {
                return new C23465k(Integer.valueOf(i13), Integer.valueOf(stepIndex - totalSteps));
            }
            totalSteps += c22920a.getTotalSteps();
            i13 = i14;
        }
        return new C23465k(Integer.valueOf(sections.size() - 1), Integer.valueOf(((C22920a) AbstractC25265s.m74112P0(sections)).getTotalSteps() - 1));
    }

    /* JADX INFO: renamed from: g */
    private final C40950h m132875g(AbstractC40947e action, C40953k currentState) {
        if (action instanceof AbstractC40947e.b) {
            return new C40950h(EnumC40951i.FORWARD, currentState, ((AbstractC40947e.b) action).getYear());
        }
        if (action instanceof AbstractC40947e.a) {
            return new C40950h(EnumC40951i.BACK, currentState, ((AbstractC40947e.a) action).getYear());
        }
        throw new IllegalStateException("This method should only be responsible for forward and backward events");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final AbstractC40945c m132876h(AbstractC40945c result, AbstractC40947e action) {
        if ((result instanceof AbstractC40945c.c ? (AbstractC40945c.c) result : null) == null) {
            throw new IllegalArgumentException("Tried to navigate User Journey without content");
        }
        AbstractC40945c.c cVar = (AbstractC40945c.c) result;
        C40953k c40953kM132895d = this.progressInteractor.m132895d(m132875g(action, cVar.getDomainState().getProgressResult()));
        InterfaceC40949g domainState = cVar.getDomainState();
        if (domainState instanceof InterfaceC40949g.a) {
            return new AbstractC40945c.c(new InterfaceC40949g.a(c40953kM132895d, ((InterfaceC40949g.a) domainState).getContentModel()));
        }
        if (!(domainState instanceof InterfaceC40949g.b)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC40949g.b bVar = (InterfaceC40949g.b) domainState;
        return new AbstractC40945c.c(new InterfaceC40949g.b(c40953kM132895d, bVar.getContentModelV2(), bVar.getSubmittedTimeCapsuleText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m132877i(AbstractC40945c abstractC40945c, int i13, InterfaceC30057d<? super AbstractC40945c> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f176696E;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f176696E = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM132865b = bVar.f176699y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = bVar.f176696E;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM132865b);
            C40946d c40946d = this.contentInteractor;
            bVar.f176697w = abstractC40945c;
            bVar.f176698x = i13;
            bVar.f176696E = 1;
            objM132865b = c40946d.m132865b(i13, bVar);
            if (objM132865b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC40945c = (AbstractC40945c) bVar.f176697w;
            AbstractC34132o.m107864I(objM132865b);
        }
        UserJourneyContentState userJourneyContentState = (UserJourneyContentState) objM132865b;
        if (userJourneyContentState.isError()) {
            return AbstractC40945c.a.f176669a;
        }
        String submittedTimeCapsuleText = null;
        if (userJourneyContentState instanceof UserJourneyContentState.UserJourneyContentStateV1) {
            UserJourneyContentModel model = ((UserJourneyContentState.UserJourneyContentStateV1) userJourneyContentState).getModel();
            if (model == null) {
                model = new UserJourneyContentModel((List) null, (HeaderContentModel) null, 3, (DefaultConstructorMarker) null);
            }
            return new AbstractC40945c.c(new InterfaceC40949g.a(new C40953k(abstractC40945c instanceof AbstractC40945c.c ? ((AbstractC40945c.c) abstractC40945c).getDomainState().getProgressResult().getCurrentStepIndex() : 0, model.getSteps().size(), null), model));
        }
        if (!(userJourneyContentState instanceof UserJourneyContentState.UserJourneyContentStateV2)) {
            throw new NoWhenBranchMatchedException();
        }
        UserJourneyContentModelV2 model2 = ((UserJourneyContentState.UserJourneyContentStateV2) userJourneyContentState).getModel();
        if (model2 == null) {
            return AbstractC40945c.a.f176669a;
        }
        Iterator<T> it = model2.getSections().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((UserJourneySection) it.next()).getSteps().size();
        }
        boolean z4 = abstractC40945c instanceof AbstractC40945c.c;
        int currentStepIndex = z4 ? ((AbstractC40945c.c) abstractC40945c).getDomainState().getProgressResult().getCurrentStepIndex() : 0;
        List<UserJourneySection> sections = model2.getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it3 = sections.iterator();
        while (it3.hasNext()) {
            arrayList.add(new C22920a(((UserJourneySection) it3.next()).getSteps().size(), 0));
        }
        C23465k c23465kM132874f = m132874f(arrayList, currentStepIndex);
        int iIntValue = ((Number) c23465kM132874f.f92937w).intValue();
        int iIntValue2 = ((Number) c23465kM132874f.f92938x).intValue();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        int i16 = 0;
        for (Object obj : arrayList) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C22920a c22920aM66640b = (C22920a) obj;
            if (i16 < iIntValue) {
                c22920aM66640b = C22920a.m66640b(c22920aM66640b, 0, c22920aM66640b.getTotalSteps(), 1, null);
            } else if (i16 == iIntValue) {
                c22920aM66640b = C22920a.m66640b(c22920aM66640b, 0, iIntValue2, 1, null);
            }
            arrayList2.add(c22920aM66640b);
            i16 = i17;
        }
        C40943a c40943a = new C40943a(arrayList2, iIntValue, iIntValue2);
        if (z4) {
            AbstractC40945c.c cVar = (AbstractC40945c.c) abstractC40945c;
            if (cVar.getDomainState() instanceof InterfaceC40949g.b) {
                submittedTimeCapsuleText = ((InterfaceC40949g.b) cVar.getDomainState()).getSubmittedTimeCapsuleText();
            }
        }
        return new AbstractC40945c.c(new InterfaceC40949g.b(new C40953k(currentStepIndex, size, c40943a), model2, submittedTimeCapsuleText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m132878j(AbstractC40945c abstractC40945c, AbstractC40947e.e eVar, InterfaceC30057d<? super AbstractC40945c> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f176701E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f176701E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f176704y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f176701E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (AbstractC39414r.m125890i0(eVar.getText())) {
                return abstractC40945c;
            }
            C40944b c40944b = this.timeCapsuleRepository;
            int year = eVar.getYear();
            String text = eVar.getText();
            cVar.f176702w = abstractC40945c;
            cVar.f176703x = eVar;
            cVar.f176701E = 1;
            if (c40944b.m132861b(year, text, cVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (AbstractC40947e.e) cVar.f176703x;
            abstractC40945c = (AbstractC40945c) cVar.f176702w;
            AbstractC34132o.m107864I(obj);
        }
        AbstractC40945c.c cVar2 = abstractC40945c instanceof AbstractC40945c.c ? (AbstractC40945c.c) abstractC40945c : null;
        if (cVar2 == null) {
            return abstractC40945c;
        }
        InterfaceC40949g domainState = cVar2.getDomainState();
        return domainState instanceof InterfaceC40949g.b ? new AbstractC40945c.c(InterfaceC40949g.b.m132882c((InterfaceC40949g.b) domainState, null, null, eVar.getText(), 3, null)) : cVar2;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC40945c.b.f176670a, upstream, new d(null));
    }
}
