package ur1;

import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import sr1.AbstractC32913e;
import sr1.C32910b;
import sw0.C33050g;
import sw0.C33052i;
import sw0.C33053j;
import wr2.AbstractC37575c;
import yr1.C39730a;

/* JADX INFO: renamed from: ur1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Lur1/c;", "Lod1/g;", "Lur1/b;", "Lur1/n;", "Lyr1/a;", "journalAnalyticsHelper", "<init>", "(Lyr1/a;)V", "Lsr1/e$e;", "domainState", "Ll83/a0;", "e", "(Lsr1/e$e;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "", "categoryIndex", "Lsr1/e;", "c", "(Lsr1/e$e;I)Lsr1/e;", "", "id", "d", "(Lsr1/e$e;Ljava/lang/String;)Lsr1/e;", "query", "f", "a", "Lyr1/a;", "", "b", "Ljava/util/List;", "lastSavedSelection", "journal_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35186c implements InterfaceC27844g<AbstractC35185b, AbstractC35197n> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C39730a journalAnalyticsHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private List<String> lastSavedSelection;

    /* JADX INFO: renamed from: ur1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f149387w;

        /* JADX INFO: renamed from: ur1.c$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42491a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f149388w;

            /* JADX INFO: renamed from: ur1.c$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.journal.interactors.v2.CustomizeJournalInteractor$interact$$inlined$map$1$2", m100430f = "CustomizeJournalInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42492a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f149389E;

                /* JADX INFO: renamed from: F */
                Object f149390F;

                /* JADX INFO: renamed from: G */
                Object f149391G;

                /* JADX INFO: renamed from: H */
                int f149392H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f149393w;

                /* JADX INFO: renamed from: x */
                int f149394x;

                /* JADX INFO: renamed from: y */
                Object f149395y;

                public C42492a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f149393w = obj;
                    this.f149394x |= Integer.MIN_VALUE;
                    return C42491a.this.emit(null, this);
                }
            }

            public C42491a(InterfaceC13062m interfaceC13062m) {
                this.f149388w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42492a c42492a;
                Object a0Var;
                if (interfaceC30057d instanceof C42492a) {
                    c42492a = (C42492a) interfaceC30057d;
                    int i13 = c42492a.f149394x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42492a.f149394x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42492a = new C42492a(interfaceC30057d);
                    }
                } else {
                    c42492a = new C42492a(interfaceC30057d);
                }
                Object obj2 = c42492a.f149393w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42492a.f149394x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f149388w;
                    AbstractC35185b abstractC35185b = (AbstractC35185b) obj;
                    if (abstractC35185b instanceof AbstractC35185b.a) {
                        a0Var = new AbstractC35197n.b(((AbstractC35185b.a) abstractC35185b).getCategoryIndex());
                    } else if (abstractC35185b instanceof AbstractC35185b.b) {
                        a0Var = new AbstractC35197n.u(((AbstractC35185b.b) abstractC35185b).getId());
                    } else {
                        if (!(abstractC35185b instanceof AbstractC35185b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a0Var = new AbstractC35197n.a0(((AbstractC35185b.c) abstractC35185b).getQuery());
                    }
                    c42492a.f149395y = null;
                    c42492a.f149389E = null;
                    c42492a.f149390F = null;
                    c42492a.f149391G = null;
                    c42492a.f149392H = 0;
                    c42492a.f149394x = 1;
                    if (interfaceC13062m.emit(a0Var, c42492a) == enumC31071a) {
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
            this.f149387w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f149387w.collect(new C42491a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C35186c(C39730a journalAnalyticsHelper) {
        AbstractC22676k.m65750j(journalAnalyticsHelper, "journalAnalyticsHelper");
        this.journalAnalyticsHelper = journalAnalyticsHelper;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC32913e m111390c(AbstractC32913e.e domainState, int categoryIndex) {
        List<String> listM104629d;
        AbstractC22676k.m65750j(domainState, "domainState");
        C33050g bottomSheet = domainState.getCustomizeJournalDomainState().getBottomSheet();
        C33050g c33050gM104626b = null;
        String str = (bottomSheet == null || (listM104629d = bottomSheet.m104629d()) == null) ? null : listM104629d.get(categoryIndex);
        C32910b customizeJournalDomainState = domainState.getCustomizeJournalDomainState();
        C33050g bottomSheet2 = domainState.getCustomizeJournalDomainState().getBottomSheet();
        if (bottomSheet2 != null) {
            if (str == null) {
                str = "";
            }
            c33050gM104626b = C33050g.m104626b(bottomSheet2, null, null, null, null, str, null, null, null, null, null, null, null, 4079, null);
        }
        return AbstractC32913e.e.m103333b(domainState, null, null, null, null, null, null, false, false, null, null, null, 0L, false, null, null, null, null, C32910b.m103306b(customizeJournalDomainState, false, false, null, c33050gM104626b, 7, null), null, false, false, null, null, 8257535, null);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC32913e m111391d(AbstractC32913e.e domainState, String id4) {
        List arrayList;
        List<C33052i> listM104635j;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(id4, "id");
        C33050g bottomSheet = domainState.getCustomizeJournalDomainState().getBottomSheet();
        C33050g c33050gM104626b = null;
        if (bottomSheet == null || (listM104635j = bottomSheet.m104635j()) == null) {
            arrayList = null;
        } else {
            List<C33052i> list = listM104635j;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (C33052i c33052i : list) {
                List<C33053j> listM104651f = c33052i.m104651f();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM104651f, 10));
                for (C33053j c33053jM104653d : listM104651f) {
                    if (AbstractC22676k.m65745e(c33053jM104653d.getId(), id4)) {
                        if (!c33053jM104653d.getIsSelected()) {
                            this.journalAnalyticsHelper.m127138q(domainState.getCustomizeJournalDomainState().getBottomSheet().getSearchQuery());
                        }
                        c33053jM104653d = c33053jM104653d.m104653d((65531 & 1) != 0 ? c33053jM104653d.id : null, (65531 & 2) != 0 ? c33053jM104653d.title : null, (65531 & 4) != 0 ? c33053jM104653d.isSelected : !c33053jM104653d.getIsSelected(), (65531 & 8) != 0 ? c33053jM104653d.sortPriority : 0, (65531 & 16) != 0 ? c33053jM104653d.selectedValue : null, (65531 & 32) != 0 ? c33053jM104653d.categories : null, (65531 & 64) != 0 ? c33053jM104653d.iconUrl : null, (65531 & 128) != 0 ? c33053jM104653d.subtitle : null, (65531 & 256) != 0 ? c33053jM104653d.avoidanceText : null, (65531 & 512) != 0 ? c33053jM104653d.trend : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c33053jM104653d.style : null, (65531 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c33053jM104653d.dayOptions : null, (65531 & 4096) != 0 ? c33053jM104653d.bottomSheetInfo : null, (65531 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c33053jM104653d.weeklyPlanGoal : false, (65531 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? c33053jM104653d.tag : null, (65531 & 32768) != 0 ? c33053jM104653d.isCustom : false);
                    }
                    arrayList2.add(c33053jM104653d);
                }
                arrayList.add(C33052i.m104646b(c33052i, null, 0, arrayList2, null, 11, null));
            }
        }
        C32910b customizeJournalDomainState = domainState.getCustomizeJournalDomainState();
        C33050g bottomSheet2 = domainState.getCustomizeJournalDomainState().getBottomSheet();
        if (bottomSheet2 != null) {
            if (arrayList == null) {
                arrayList = C25271y.f99162w;
            }
            c33050gM104626b = C33050g.m104626b(bottomSheet2, null, null, null, null, null, arrayList, null, null, null, null, null, null, 4063, null);
        }
        return AbstractC32913e.e.m103333b(domainState, null, null, null, null, null, null, false, false, null, null, null, 0L, false, null, null, null, null, C32910b.m103306b(customizeJournalDomainState, false, false, null, c33050gM104626b, 7, null), null, false, false, null, null, 8257535, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m111392e(AbstractC32913e.e domainState) {
        AbstractC22676k.m65750j(domainState, "domainState");
        C33050g bottomSheet = domainState.getCustomizeJournalDomainState().getBottomSheet();
        if (bottomSheet == null) {
            return;
        }
        List<C33052i> listM104635j = bottomSheet.m104635j();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM104635j.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((C33052i) it.next()).m104651f());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C33053j) obj).getIsSelected()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((C33053j) it3.next()).getId());
        }
        if (arrayList3.equals(this.lastSavedSelection)) {
            return;
        }
        this.lastSavedSelection = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            C33053j c33053j = (C33053j) obj2;
            if (c33053j.getIsCustom() && bottomSheet.m104636k().contains(c33053j.getId()) && !c33053j.getIsSelected()) {
                arrayList4.add(obj2);
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            this.journalAnalyticsHelper.m127139r(((C33053j) it4.next()).getId());
        }
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC32913e m111393f(AbstractC32913e.e domainState, String query) {
        List arrayList;
        List<C33052i> listM104635j;
        AbstractC22676k.m65750j(domainState, "domainState");
        AbstractC22676k.m65750j(query, "query");
        C33050g bottomSheet = domainState.getCustomizeJournalDomainState().getBottomSheet();
        if (bottomSheet == null || (listM104635j = bottomSheet.m104635j()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator<T> it = listM104635j.iterator();
            while (it.hasNext()) {
                AbstractC25265s.m74141p0(arrayList, ((C33052i) it.next()).m104651f());
            }
        }
        if (arrayList == null) {
            arrayList = C25271y.f99162w;
        }
        C32910b customizeJournalDomainState = domainState.getCustomizeJournalDomainState();
        String str = AbstractC37575c.m120636o(arrayList, query, null, 2, null).isEmpty() ? query : null;
        C33050g bottomSheet2 = domainState.getCustomizeJournalDomainState().getBottomSheet();
        return AbstractC32913e.e.m103333b(domainState, null, null, null, null, null, null, false, false, null, null, null, 0L, false, null, null, null, null, C32910b.m103306b(customizeJournalDomainState, false, false, str, bottomSheet2 != null ? C33050g.m104626b(bottomSheet2, null, query, null, null, null, null, null, null, null, null, null, null, 4093, null) : null, 3, null), null, false, false, null, null, 8257535, null);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream);
    }
}
