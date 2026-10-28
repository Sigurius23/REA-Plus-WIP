package yd0;

import com.whoop.advancedlabs.domain.models.AdvancedLabsSectionModel;
import com.whoop.advancedlabs.domain.models.SchedulePrimerHeaderModel;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import kd1.AbstractC22403o;
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
import vd0.AbstractC35905b;
import xd0.AbstractC38201e;
import xd0.C38197a;
import xd0.C38198b;

/* JADX INFO: renamed from: yd0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lyd0/a;", "", "Ljb1/a;", "reducer", "<init>", "(Ljb1/a;)V", "Lvd0/b$b;", "Lxd0/e$c;", "d", "(Lvd0/b$b;)Lxd0/e$c;", "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;", "Lxd0/b;", "c", "(Lcom/whoop/advancedlabs/domain/models/SchedulePrimerHeaderModel;)Lxd0/b;", "Lec3/l;", "Lvd0/b;", "upstream", "Lxd0/e;", "b", "(Lec3/l;)Lec3/l;", "a", "Ljb1/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39456a {

    /* JADX INFO: renamed from: b */
    public static final int f169765b = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a reducer;

    /* JADX INFO: renamed from: yd0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f169767w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C39456a f169768x;

        /* JADX INFO: renamed from: yd0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42688a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f169769w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39456a f169770x;

            /* JADX INFO: renamed from: yd0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.scheduleprimer.presentation.reducers.SchedulePrimerViewStateReducer$reduce$$inlined$map$1$2", m100430f = "SchedulePrimerViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42689a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f169771E;

                /* JADX INFO: renamed from: F */
                Object f169772F;

                /* JADX INFO: renamed from: G */
                Object f169773G;

                /* JADX INFO: renamed from: H */
                int f169774H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f169775w;

                /* JADX INFO: renamed from: x */
                int f169776x;

                /* JADX INFO: renamed from: y */
                Object f169777y;

                public C42689a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f169775w = obj;
                    this.f169776x |= Integer.MIN_VALUE;
                    return C42688a.this.emit(null, this);
                }
            }

            public C42688a(InterfaceC13062m interfaceC13062m, C39456a c39456a) {
                this.f169769w = interfaceC13062m;
                this.f169770x = c39456a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42689a c42689a;
                Object objM126003d;
                if (interfaceC30057d instanceof C42689a) {
                    c42689a = (C42689a) interfaceC30057d;
                    int i13 = c42689a.f169776x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42689a.f169776x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42689a = new C42689a(interfaceC30057d);
                    }
                } else {
                    c42689a = new C42689a(interfaceC30057d);
                }
                Object obj2 = c42689a.f169775w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42689a.f169776x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f169769w;
                    AbstractC35905b abstractC35905b = (AbstractC35905b) obj;
                    if (abstractC35905b instanceof AbstractC35905b.a) {
                        objM126003d = AbstractC38201e.a.f163591b;
                    } else {
                        if (!(abstractC35905b instanceof AbstractC35905b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        objM126003d = this.f169770x.m126003d((AbstractC35905b.b) abstractC35905b);
                    }
                    c42689a.f169777y = null;
                    c42689a.f169771E = null;
                    c42689a.f169772F = null;
                    c42689a.f169773G = null;
                    c42689a.f169774H = 0;
                    c42689a.f169776x = 1;
                    if (interfaceC13062m.emit(objM126003d, c42689a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C39456a c39456a) {
            this.f169767w = interfaceC13058l;
            this.f169768x = c39456a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f169767w.collect(new C42688a(interfaceC13062m, this.f169768x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C39456a(C21535a reducer) {
        AbstractC22676k.m65750j(reducer, "reducer");
        this.reducer = reducer;
    }

    /* JADX INFO: renamed from: c */
    private final C38198b m126002c(SchedulePrimerHeaderModel schedulePrimerHeaderModel) {
        return new C38198b(schedulePrimerHeaderModel.getTitle(), schedulePrimerHeaderModel.getBody());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final AbstractC38201e.c m126003d(AbstractC35905b.b bVar) {
        String navigationTitle = bVar.getResponse().getNavigationBar().getNavigationTitle();
        C38198b c38198bM126002c = m126002c(bVar.getResponse().getHeader());
        List<AdvancedLabsSectionModel> sections = bVar.getResponse().getSections();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(this.reducer.m60541h((AdvancedLabsSectionModel) it.next()));
        }
        return new AbstractC38201e.c(navigationTitle, new AbstractC22403o.c(bVar.getResponse().getHeader().getBackgroundImageUrl(), 0, 0, 0, 14, null), c38198bM126002c, new C38197a(bVar.getResponse().getFooter().getButtonTitle(), bVar.getResponse().getFooter().getNavigation()), bVar.getResponse().getLabel(), arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13058l m126004b(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }

    public /* synthetic */ C39456a(C21535a c21535a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC25448c.m74762z0() : c21535a);
    }
}
