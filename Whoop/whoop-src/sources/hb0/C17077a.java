package hb0;

import com.whoop.advancedlabs.domain.models.MetaData;
import com.whoop.advancedlabs.domain.models.NavigationButtonModel;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.design.models.DesignSystemModel;
import eb0.AbstractC13003b;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ep0.C13404j;
import gb0.AbstractC15668c;
import gb0.C15669d;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import l83.C23454a0;
import m83.AbstractC25267u;
import md0.AbstractC25448c;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: hb0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lhb0/a;", "", "Ljb1/a;", "designSystemReducer", "<init>", "(Ljb1/a;)V", "Lec3/l;", "Leb0/b;", "upstream", "Lgb0/c;", "b", "(Lec3/l;)Lec3/l;", "a", "Ljb1/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17077a {

    /* JADX INFO: renamed from: b */
    public static final int f65620b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designSystemReducer;

    /* JADX INFO: renamed from: hb0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f65622w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C17077a f65623x;

        /* JADX INFO: renamed from: hb0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41687a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f65624w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C17077a f65625x;

            /* JADX INFO: renamed from: hb0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkersummary.presentation.reducers.BiomarkerSummaryViewStateReducer$reduce$$inlined$map$1$2", m100430f = "BiomarkerSummaryViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41688a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f65626E;

                /* JADX INFO: renamed from: F */
                Object f65627F;

                /* JADX INFO: renamed from: G */
                Object f65628G;

                /* JADX INFO: renamed from: H */
                int f65629H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f65630w;

                /* JADX INFO: renamed from: x */
                int f65631x;

                /* JADX INFO: renamed from: y */
                Object f65632y;

                public C41688a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f65630w = obj;
                    this.f65631x |= Integer.MIN_VALUE;
                    return C41687a.this.emit(null, this);
                }
            }

            public C41687a(InterfaceC13062m interfaceC13062m, C17077a c17077a) {
                this.f65624w = interfaceC13062m;
                this.f65625x = c17077a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41688a c41688a;
                C15669d c15669d;
                Object cVar;
                EnumC16313m0 enumC16313m0;
                AiContextMetadata aiContextMetadata;
                if (interfaceC30057d instanceof C41688a) {
                    c41688a = (C41688a) interfaceC30057d;
                    int i13 = c41688a.f65631x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41688a.f65631x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41688a = new C41688a(interfaceC30057d);
                    }
                } else {
                    c41688a = new C41688a(interfaceC30057d);
                }
                Object obj2 = c41688a.f65630w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41688a.f65631x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f65624w;
                    AbstractC13003b abstractC13003b = (AbstractC13003b) obj;
                    if (abstractC13003b instanceof AbstractC13003b.a) {
                        cVar = AbstractC15668c.a.f58815b;
                    } else {
                        if (!(abstractC13003b instanceof AbstractC13003b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC13003b.b bVar = (AbstractC13003b.b) abstractC13003b;
                        MetaData metadata = bVar.getResponse().getMetadata();
                        C13404j c13404jM18523a = (metadata == null || (aiContextMetadata = metadata.getAiContextMetadata()) == null) ? null : AbstractC6219a.m18523a(aiContextMetadata);
                        String navigationTitle = bVar.getResponse().getNavigationBar().getNavigationTitle();
                        NavigationButtonModel navigationRightButton = bVar.getResponse().getNavigationBar().getNavigationRightButton();
                        if (navigationRightButton != null) {
                            String icon = navigationRightButton.getIcon();
                            EnumC16313m0 enumC16313m1 = EnumC16313m0.DOWNLOAD;
                            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
                            int length = enumC16313m0ArrValues.length;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= length) {
                                    enumC16313m0 = null;
                                    break;
                                }
                                enumC16313m0 = enumC16313m0ArrValues[i15];
                                if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                                    break;
                                }
                                i15++;
                            }
                            if (enumC16313m0 != null) {
                                enumC16313m1 = enumC16313m0;
                            }
                            c15669d = new C15669d(enumC16313m1);
                        } else {
                            c15669d = null;
                        }
                        List<DesignSystemModel> items = bVar.getResponse().getItems();
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
                        Iterator<T> it = items.iterator();
                        while (it.hasNext()) {
                            arrayList.add(this.f65625x.designSystemReducer.m60541h((DesignSystemModel) it.next()));
                        }
                        cVar = new AbstractC15668c.c(c13404jM18523a, navigationTitle, c15669d, arrayList, bVar.getResponse().getAnalytics());
                    }
                    c41688a.f65632y = null;
                    c41688a.f65626E = null;
                    c41688a.f65627F = null;
                    c41688a.f65628G = null;
                    c41688a.f65629H = 0;
                    c41688a.f65631x = 1;
                    if (interfaceC13062m.emit(cVar, c41688a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C17077a c17077a) {
            this.f65622w = interfaceC13058l;
            this.f65623x = c17077a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f65622w.collect(new C41687a(interfaceC13062m, this.f65623x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C17077a(C21535a designSystemReducer) {
        AbstractC22676k.m65750j(designSystemReducer, "designSystemReducer");
        this.designSystemReducer = designSystemReducer;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m48201b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }

    public /* synthetic */ C17077a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC25448c.m74762z0() : c21535a);
    }
}
