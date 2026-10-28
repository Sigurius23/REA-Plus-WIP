package ke0;

import c31.C3927k;
import com.whoop.advancedlabs.domain.models.SchedulingButton;
import com.whoop.advancedlabs.domain.models.SchedulingStepScreenModel;
import com.whoop.design.models.DesignSystemModel;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import he0.AbstractC17210b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.C21535a;
import je0.AbstractC21620c;
import l83.C23454a0;
import m83.AbstractC25267u;
import md0.AbstractC25448c;
import nd0.C26574a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ke0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lke0/a;", "", "Ljb1/a;", "designSystemReducer", "Lnd0/a;", "schedulingButtonStateFactory", "<init>", "(Ljb1/a;Lnd0/a;)V", "Lec3/l;", "Lhe0/b;", "upstream", "Lje0/c;", "c", "(Lec3/l;)Lec3/l;", "a", "Ljb1/a;", "b", "Lnd0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22417a {

    /* JADX INFO: renamed from: c */
    public static final int f87697c = C21535a.f82608c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21535a designSystemReducer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C26574a schedulingButtonStateFactory;

    /* JADX INFO: renamed from: ke0.a$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87700w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22417a f87701x;

        /* JADX INFO: renamed from: ke0.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41890a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87702w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22417a f87703x;

            /* JADX INFO: renamed from: ke0.a$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingstep.presentation.reducers.SchedulingStepViewStateReducer$reduce$$inlined$map$1$2", m100430f = "SchedulingStepViewStateReducer.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41891a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87704E;

                /* JADX INFO: renamed from: F */
                Object f87705F;

                /* JADX INFO: renamed from: G */
                Object f87706G;

                /* JADX INFO: renamed from: H */
                int f87707H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87708w;

                /* JADX INFO: renamed from: x */
                int f87709x;

                /* JADX INFO: renamed from: y */
                Object f87710y;

                public C41891a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87708w = obj;
                    this.f87709x |= Integer.MIN_VALUE;
                    return C41890a.this.emit(null, this);
                }
            }

            public C41890a(InterfaceC13062m interfaceC13062m, C22417a c22417a) {
                this.f87702w = interfaceC13062m;
                this.f87703x = c22417a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41891a c41891a;
                Object cVar;
                if (interfaceC30057d instanceof C41891a) {
                    c41891a = (C41891a) interfaceC30057d;
                    int i13 = c41891a.f87709x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41891a.f87709x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41891a = new C41891a(interfaceC30057d);
                    }
                } else {
                    c41891a = new C41891a(interfaceC30057d);
                }
                Object obj2 = c41891a.f87708w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41891a.f87709x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87702w;
                    AbstractC17210b abstractC17210b = (AbstractC17210b) obj;
                    if (abstractC17210b instanceof AbstractC17210b.a) {
                        cVar = AbstractC21620c.a.f82981b;
                    } else {
                        if (!(abstractC17210b instanceof AbstractC17210b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SchedulingStepScreenModel stepScreenModel = ((AbstractC17210b.b) abstractC17210b).getStepScreenModel();
                        String title = stepScreenModel.getTitle();
                        String subtitle = stepScreenModel.getSubtitle();
                        List<DesignSystemModel> items = stepScreenModel.getItems();
                        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
                        Iterator<T> it = items.iterator();
                        while (it.hasNext()) {
                            arrayList.add(this.f87703x.designSystemReducer.m60541h((DesignSystemModel) it.next()));
                        }
                        C26574a c26574a = this.f87703x.schedulingButtonStateFactory;
                        SchedulingButton button = stepScreenModel.getButton();
                        String textDisplay = button != null ? button.getTextDisplay() : null;
                        SchedulingButton button2 = stepScreenModel.getButton();
                        C3927k c3927kM78748a = c26574a.m78748a(textDisplay, button2 != null ? button2.getProgress() : null, true);
                        SchedulingButton button3 = stepScreenModel.getButton();
                        cVar = new AbstractC21620c.c(title, subtitle, arrayList, c3927kM78748a, button3 != null ? button3.getDestination() : null);
                    }
                    c41891a.f87710y = null;
                    c41891a.f87704E = null;
                    c41891a.f87705F = null;
                    c41891a.f87706G = null;
                    c41891a.f87707H = 0;
                    c41891a.f87709x = 1;
                    if (interfaceC13062m.emit(cVar, c41891a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C22417a c22417a) {
            this.f87700w = interfaceC13058l;
            this.f87701x = c22417a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87700w.collect(new C41890a(interfaceC13062m, this.f87701x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C22417a(C21535a designSystemReducer, C26574a schedulingButtonStateFactory) {
        AbstractC22676k.m65750j(designSystemReducer, "designSystemReducer");
        AbstractC22676k.m65750j(schedulingButtonStateFactory, "schedulingButtonStateFactory");
        this.designSystemReducer = designSystemReducer;
        this.schedulingButtonStateFactory = schedulingButtonStateFactory;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m64553c(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new a(upstream, this);
    }

    public /* synthetic */ C22417a(C21535a c21535a, C26574a c26574a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? AbstractC25448c.m74762z0() : c21535a, c26574a);
    }
}
