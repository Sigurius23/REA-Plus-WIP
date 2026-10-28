package pe0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsPaginatedTestHistory;
import com.whoop.advancedlabs.domain.models.AdvancedLabsTestHistorySection;
import com.whoop.advancedlabs.domain.models.NavigationButtonModel;
import com.whoop.advancedlabs.domain.models.TestHistoryResponse;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DividerModel;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gz0.EnumC16313m0;
import hy0.C17736e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import l83.C23454a0;
import m83.AbstractC25267u;
import md0.AbstractC25448c;
import me0.AbstractC25470b;
import oe0.AbstractC27870e;
import oe0.C27866a;
import oe0.C27867b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import te0.C33742a;

/* JADX INFO: renamed from: pe0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lpe0/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;", "", "isLoadingMore", "Loe0/e$c;", "d", "(Lcom/whoop/advancedlabs/domain/models/TestHistoryResponse;Z)Loe0/e$c;", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;", "Loe0/a;", "c", "(Lcom/whoop/advancedlabs/domain/models/AdvancedLabsPaginatedTestHistory;)Loe0/a;", "Lec3/l;", "Lme0/b;", "upstream", "Loe0/e;", "b", "(Lec3/l;)Lec3/l;", "a", "Ljb1/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29114a {

    /* JADX INFO: renamed from: b */
    public static final int f117839b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: pe0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f117841w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29114a f117842x;

        /* JADX INFO: renamed from: pe0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42160a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f117843w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29114a f117844x;

            /* JADX INFO: renamed from: pe0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testhistory.presentation.reducers.TestHistoryViewStateReducer$reduce$$inlined$map$1$2", m100430f = "TestHistoryViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42161a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f117845E;

                /* JADX INFO: renamed from: F */
                Object f117846F;

                /* JADX INFO: renamed from: G */
                Object f117847G;

                /* JADX INFO: renamed from: H */
                int f117848H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f117849w;

                /* JADX INFO: renamed from: x */
                int f117850x;

                /* JADX INFO: renamed from: y */
                Object f117851y;

                public C42161a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f117849w = obj;
                    this.f117850x |= Integer.MIN_VALUE;
                    return C42160a.this.emit(null, this);
                }
            }

            public C42160a(InterfaceC13062m interfaceC13062m, C29114a c29114a) {
                this.f117843w = interfaceC13062m;
                this.f117844x = c29114a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42161a c42161a;
                Object objM88473d;
                if (interfaceC30057d instanceof C42161a) {
                    c42161a = (C42161a) interfaceC30057d;
                    int i13 = c42161a.f117850x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42161a.f117850x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42161a = new C42161a(interfaceC30057d);
                    }
                } else {
                    c42161a = new C42161a(interfaceC30057d);
                }
                Object obj2 = c42161a.f117849w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42161a.f117850x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f117843w;
                    AbstractC25470b abstractC25470b = (AbstractC25470b) obj;
                    if (abstractC25470b instanceof AbstractC25470b.b) {
                        objM88473d = AbstractC27870e.b.f112333b;
                    } else if (abstractC25470b instanceof AbstractC25470b.a) {
                        objM88473d = AbstractC27870e.a.f112332b;
                    } else if (abstractC25470b instanceof AbstractC25470b.d) {
                        objM88473d = this.f117844x.m88473d(((AbstractC25470b.d) abstractC25470b).getResponse(), false);
                    } else {
                        if (!(abstractC25470b instanceof AbstractC25470b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM88473d = this.f117844x.m88473d(((AbstractC25470b.c) abstractC25470b).getResponse(), true);
                    }
                    c42161a.f117851y = null;
                    c42161a.f117845E = null;
                    c42161a.f117846F = null;
                    c42161a.f117847G = null;
                    c42161a.f117848H = 0;
                    c42161a.f117850x = 1;
                    if (interfaceC13062m.emit(objM88473d, c42161a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C29114a c29114a) {
            this.f117841w = interfaceC13058l;
            this.f117842x = c29114a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f117841w.collect(new C42160a(interfaceC13062m, this.f117842x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C29114a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: c */
    private final C27866a m88472c(AdvancedLabsPaginatedTestHistory advancedLabsPaginatedTestHistory) {
        List<AdvancedLabsTestHistorySection> sections = advancedLabsPaginatedTestHistory.getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        for (AdvancedLabsTestHistorySection advancedLabsTestHistorySection : sections) {
            String id4 = advancedLabsTestHistorySection.getId();
            DividerModel sectionHeader = advancedLabsTestHistorySection.getSectionHeader();
            InterfaceC25312u interfaceC25312uM60541h = sectionHeader != null ? this.reducer.m60541h(sectionHeader) : null;
            C17736e c17736e = interfaceC25312uM60541h instanceof C17736e ? (C17736e) interfaceC25312uM60541h : null;
            List<DesignSystemModel> items = advancedLabsTestHistorySection.getItems();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items, 10));
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.reducer.m60541h((DesignSystemModel) it.next()));
            }
            arrayList.add(new C27867b(id4, c17736e, arrayList2));
        }
        return new C27866a(arrayList, advancedLabsPaginatedTestHistory.getNextToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final AbstractC27870e.c m88473d(TestHistoryResponse testHistoryResponse, boolean z4) {
        EnumC16313m0 enumC16313m0;
        String icon;
        String navigationTitle = testHistoryResponse.getNavigationBar().getNavigationTitle();
        NavigationButtonModel navigationRightButton = testHistoryResponse.getNavigationBar().getNavigationRightButton();
        if (navigationRightButton != null && (icon = navigationRightButton.getIcon()) != null) {
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
        } else {
            enumC16313m0 = null;
            break;
        }
        NavigationButtonModel navigationRightButton2 = testHistoryResponse.getNavigationBar().getNavigationRightButton();
        return new AbstractC27870e.c(new C33742a(navigationTitle, enumC16313m0, navigationRightButton2 != null ? navigationRightButton2.getDestination() : null), testHistoryResponse.getTitle(), testHistoryResponse.getSubtitle(), m88472c(testHistoryResponse.getPaginatedRecords()), z4, testHistoryResponse.getPaginatedRecords().getAnalytics());
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m88474b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }

    public /* synthetic */ C29114a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC25448c.m74762z0() : c21535a);
    }
}
