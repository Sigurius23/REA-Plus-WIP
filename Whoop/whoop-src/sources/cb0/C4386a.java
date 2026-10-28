package cb0;

import a01.EnumC0093m;
import bb0.AbstractC2924d;
import bb0.C2921a;
import com.whoop.advancedlabs.domain.models.AdvancedLabsAnalyticsDomainModel;
import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.advancedlabs.domain.models.BiomarkerDetailsHeader;
import com.whoop.advancedlabs.domain.models.MetaData;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ep0.C13404j;
import f01.C13890q;
import g61.C15529b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j61.C21374h;
import j71.C21395c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jb1.C21535a;
import kf0.C22436k;
import l83.C23454a0;
import lf0.C23973u;
import m83.AbstractC25267u;
import md0.AbstractC25448c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p181h2.C16618c;
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
import za0.AbstractC40223c;

/* JADX INFO: renamed from: cb0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\"B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\n*\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lcb0/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lza0/c$d;", "", "", "dismissedCardIds", "Lbb0/d$c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lza0/c$d;Ljava/util/Set;)Lbb0/d$c;", "Lza0/c$a;", "i", "(Lza0/c$a;Ljava/util/Set;)Lbb0/d$c;", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;", "Lbb0/a;", "g", "(Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;)Lbb0/a;", "Lm91/u;", "itemViewState", "", "isDateSelectorLoading", "d", "(Lm91/u;Z)Lm91/u;", "c", "(Lm91/u;Ljava/util/Set;)Lm91/u;", "Lec3/l;", "Lza0/c;", "upstream", "Lbb0/d;", "f", "(Lec3/l;)Lec3/l;", "a", "Ljb1/a;", "b", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4386a {

    /* JADX INFO: renamed from: c */
    public static final int f17713c = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: cb0.a$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f17715w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4386a f17716x;

        /* JADX INFO: renamed from: cb0.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f17717w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4386a f17718x;

            /* JADX INFO: renamed from: cb0.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.presentation.reducers.BiomarkerDetailsViewStateReducer$reduce$$inlined$map$1$2", m100430f = "BiomarkerDetailsViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41337a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f17719E;

                /* JADX INFO: renamed from: F */
                Object f17720F;

                /* JADX INFO: renamed from: G */
                Object f17721G;

                /* JADX INFO: renamed from: H */
                int f17722H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f17723w;

                /* JADX INFO: renamed from: x */
                int f17724x;

                /* JADX INFO: renamed from: y */
                Object f17725y;

                public C41337a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f17723w = obj;
                    this.f17724x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C4386a c4386a) {
                this.f17717w = interfaceC13062m;
                this.f17718x = c4386a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41337a c41337a;
                Object objM13771h;
                if (interfaceC30057d instanceof C41337a) {
                    c41337a = (C41337a) interfaceC30057d;
                    int i13 = c41337a.f17724x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41337a.f17724x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41337a = new C41337a(interfaceC30057d);
                    }
                } else {
                    c41337a = new C41337a(interfaceC30057d);
                }
                Object obj2 = c41337a.f17723w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41337a.f17724x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f17717w;
                    AbstractC40223c abstractC40223c = (AbstractC40223c) obj;
                    if (abstractC40223c instanceof AbstractC40223c.c) {
                        objM13771h = AbstractC2924d.b.f11783b;
                    } else if (abstractC40223c instanceof AbstractC40223c.a) {
                        AbstractC40223c.a aVar = (AbstractC40223c.a) abstractC40223c;
                        objM13771h = this.f17718x.m13772i(aVar, aVar.m129122c());
                    } else if (abstractC40223c instanceof AbstractC40223c.b) {
                        objM13771h = AbstractC2924d.a.f11782b;
                    } else {
                        if (!(abstractC40223c instanceof AbstractC40223c.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC40223c.d dVar = (AbstractC40223c.d) abstractC40223c;
                        objM13771h = this.f17718x.m13771h(dVar, dVar.m129126d());
                    }
                    c41337a.f17725y = null;
                    c41337a.f17719E = null;
                    c41337a.f17720F = null;
                    c41337a.f17721G = null;
                    c41337a.f17722H = 0;
                    c41337a.f17724x = 1;
                    if (interfaceC13062m.emit(objM13771h, c41337a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C4386a c4386a) {
            this.f17715w = interfaceC13058l;
            this.f17716x = c4386a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f17715w.collect(new a(interfaceC13062m, this.f17716x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C4386a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC25312u m13767c(InterfaceC25312u itemViewState, Set<String> dismissedCardIds) {
        if (itemViewState instanceof C13890q) {
            C13890q c13890q = (C13890q) itemViewState;
            if (dismissedCardIds.contains(c13890q.getId())) {
                return null;
            }
            return c13890q;
        }
        if (!(itemViewState instanceof C22436k)) {
            return itemViewState;
        }
        C22436k c22436k = (C22436k) itemViewState;
        List<InterfaceC25312u> listM64734e = c22436k.m64734e();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listM64734e.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM13767c = m13767c((InterfaceC25312u) it.next(), dismissedCardIds);
            if (interfaceC25312uM13767c != null) {
                arrayList.add(interfaceC25312uM13767c);
            }
        }
        return C22436k.m64731b(c22436k, null, null, null, arrayList, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    private final InterfaceC25312u m13768d(InterfaceC25312u itemViewState, boolean isDateSelectorLoading) {
        if (itemViewState instanceof C23973u) {
            C23973u c23973u = (C23973u) itemViewState;
            C21395c graph = c23973u.getGraph();
            Object objM60092b = null;
            if (graph != null) {
                C21374h plane = c23973u.getGraph().getPlane();
                C16618c c16618cM47195b = C16618c.m47195b(c23973u.getGraph().getPlane().getInsets(), 0.025f, 0.0f, 0.0f, 14);
                C15529b startVerticalAxis = c23973u.getGraph().getPlane().getStartVerticalAxis();
                objM60092b = C21395c.m60092b(graph, plane.m59985a((8187 & 1) != 0 ? plane.startVerticalAxis : startVerticalAxis != null ? C15529b.m43718b(startVerticalAxis, 0.075f, null, 0.0f, null, null, false, null, null, 254, null) : null, (8187 & 2) != 0 ? plane.endVerticalAxis : null, (8187 & 4) != 0 ? plane.bottomHorizontalAxis : null, (8187 & 8) != 0 ? plane.topHorizontalAxis : null, (8187 & 16) != 0 ? plane.insets : c16618cM47195b, (8187 & 32) != 0 ? plane.lines : null, (8187 & 64) != 0 ? plane.graphAnnotations : null, (8187 & 128) != 0 ? plane.accessibilityState : null, (8187 & 256) != 0 ? plane.scrubberEnabled : false, (8187 & 512) != 0 ? plane.clickable : false, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? plane.buttons : null, (8187 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? plane.longPressTimeoutMillis : 0L, (8187 & 4096) != 0 ? plane.horizontalGridLinePadding : 0.0f), null, null, null, 14, null);
            }
            return C23973u.m70716b(c23973u, null, null, isDateSelectorLoading, objM60092b, null, null, null, null, 243, null);
        }
        if (!(itemViewState instanceof C22436k)) {
            return itemViewState;
        }
        C22436k c22436k = (C22436k) itemViewState;
        List<InterfaceC25312u> listM64734e = c22436k.m64734e();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM64734e, 10));
        Iterator<T> it = listM64734e.iterator();
        while (it.hasNext()) {
            arrayList.add(m13768d((InterfaceC25312u) it.next(), isDateSelectorLoading));
        }
        return C22436k.m64731b(c22436k, null, null, null, arrayList, 7, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC25312u m13769e(C4386a c4386a, InterfaceC25312u interfaceC25312u, boolean z4, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return c4386a.m13768d(interfaceC25312u, z4);
    }

    /* JADX INFO: renamed from: g */
    private final C2921a m13770g(BiomarkerDetailsHeader biomarkerDetailsHeader) {
        return new C2921a(biomarkerDetailsHeader.getTitle(), biomarkerDetailsHeader.getSubtitle(), biomarkerDetailsHeader.getPills());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final AbstractC2924d.c m13771h(AbstractC40223c.d dVar, Set<String> set) {
        int i13;
        C13404j c13404jM18523a;
        EnumC0093m enumC0093m;
        AiContextMetadata aiContextMetadata;
        String biomarkerId = dVar.getBiomarkerId();
        String navigationTitle = dVar.getResponse().getNavigationTitle();
        C2921a c2921aM13770g = m13770g(dVar.getResponse().getHeader());
        List<AdvancedLabsSectionModel> sections = dVar.getResponse().getSections();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (true) {
            i13 = 0;
            c13404jM18523a = null;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC25312u interfaceC25312uM13767c = m13767c(m13769e(this, this.reducer.m60541h((AdvancedLabsSectionModel) it.next()), false, 2, null), set);
            if (interfaceC25312uM13767c != null) {
                arrayList.add(interfaceC25312uM13767c);
            }
        }
        AdvancedLabsAnalyticsDomainModel analytics = dVar.getResponse().getAnalytics();
        String status = dVar.getResponse().getStatus();
        EnumC0093m enumC0093m2 = EnumC0093m.UNAVAILABLE;
        EnumC0093m[] enumC0093mArrValues = EnumC0093m.values();
        int length = enumC0093mArrValues.length;
        while (true) {
            if (i13 >= length) {
                enumC0093m = null;
                break;
            }
            enumC0093m = enumC0093mArrValues[i13];
            if (AbstractC22676k.m65745e(enumC0093m.name(), status)) {
                break;
            }
            i13++;
        }
        EnumC0093m enumC0093m3 = enumC0093m == null ? enumC0093m2 : enumC0093m;
        MetaData metadata = dVar.getResponse().getMetadata();
        if (metadata != null && (aiContextMetadata = metadata.getAiContextMetadata()) != null) {
            c13404jM18523a = AbstractC6219a.m18523a(aiContextMetadata);
        }
        return new AbstractC2924d.c(biomarkerId, navigationTitle, c2921aM13770g, arrayList, analytics, enumC0093m3, c13404jM18523a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final AbstractC2924d.c m13772i(AbstractC40223c.a aVar, Set<String> set) {
        C13404j c13404jM18523a;
        EnumC0093m enumC0093m;
        AiContextMetadata aiContextMetadata;
        String biomarkerId = aVar.getBiomarkerId();
        String navigationTitle = aVar.getCurrentResponse().getNavigationTitle();
        C2921a c2921aM13770g = m13770g(aVar.getCurrentResponse().getHeader());
        List<AdvancedLabsSectionModel> sections = aVar.getCurrentResponse().getSections();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            InterfaceC25312u interfaceC25312uM13767c = m13767c(m13768d(this.reducer.m60541h((AdvancedLabsSectionModel) it.next()), true), set);
            if (interfaceC25312uM13767c != null) {
                arrayList.add(interfaceC25312uM13767c);
            }
        }
        AdvancedLabsAnalyticsDomainModel analytics = aVar.getCurrentResponse().getAnalytics();
        String status = aVar.getCurrentResponse().getStatus();
        EnumC0093m enumC0093m2 = EnumC0093m.UNAVAILABLE;
        EnumC0093m[] enumC0093mArrValues = EnumC0093m.values();
        int length = enumC0093mArrValues.length;
        int i13 = 0;
        while (true) {
            c13404jM18523a = null;
            if (i13 >= length) {
                enumC0093m = null;
                break;
            }
            enumC0093m = enumC0093mArrValues[i13];
            if (AbstractC22676k.m65745e(enumC0093m.name(), status)) {
                break;
            }
            i13++;
        }
        EnumC0093m enumC0093m3 = enumC0093m == null ? enumC0093m2 : enumC0093m;
        MetaData metadata = aVar.getCurrentResponse().getMetadata();
        if (metadata != null && (aiContextMetadata = metadata.getAiContextMetadata()) != null) {
            c13404jM18523a = AbstractC6219a.m18523a(aiContextMetadata);
        }
        return new AbstractC2924d.c(biomarkerId, navigationTitle, c2921aM13770g, arrayList, analytics, enumC0093m3, c13404jM18523a);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m13773f(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new b(upstream, this);
    }

    public /* synthetic */ C4386a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC25448c.m74762z0() : c21535a);
    }
}
