package i60;

import b60.AbstractC2745a;
import c60.C4269b;
import c60.C4271d;
import com.whoop.access.careupdateentrypointtile.models.CareUpdateEntrypointTileModel;
import com.whoop.access.circumference.models.CircumferenceModel;
import com.whoop.access.labsummary.models.LabSummaryModel;
import com.whoop.access.labsummary.models.LabSummaryRow;
import com.whoop.access.measurementprogress.models.MeasurementProgressModel;
import com.whoop.access.programgoaltile.models.ProgramGoalTileModel;
import com.whoop.design.models.DesignSystemModel;
import ga1.C15621b;
import h01.C16554u;
import hu1.C17650g;
import i50.AbstractC18103a;
import j50.C21329a;
import j50.C21332d;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l50.AbstractC23350a;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m50.C25075a;
import m50.C25078d;
import m83.AbstractC25267u;
import p50.C28849a;
import p50.C28851c;
import p50.C28852d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23723u4;
import p716lb1.C23743y0;
import p716lb1.C23749z0;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import r50.AbstractC30932a;
import s50.C32199a;
import s50.C32202d;

/* JADX INFO: renamed from: i60.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u001b\u0010\u000f\u001a\u00020\n8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/access/labsummary/models/LabSummaryRow;", "Lp50/c;", "C", "(Lcom/whoop/access/labsummary/models/LabSummaryRow;)Lp50/c;", "Ljb1/a;", "a", "Ljb1/a;", "getAccessDesignItemReducer", "()Ljb1/a;", "accessDesignItemReducer", "Llb1/y0;", "b", "Ll83/h;", "A", "()Llb1/y0;", "accessDesignModelMapper", "Lm91/p;", "c", "Lm91/p;", "B", "()Lm91/p;", "accessItemViewFactory", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18151a {

    /* JADX INFO: renamed from: a */
    private static final C21535a f70447a = AbstractC21537c.m60554d(new C16554u(9));

    /* JADX INFO: renamed from: b */
    private static final InterfaceC23462h f70448b = AbstractC30060g.m92088H(new C15621b(17));

    /* JADX INFO: renamed from: c */
    private static final C25307p f70449c = Function1.m74306g(new C16554u(13));

    /* JADX INFO: renamed from: i60.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f70450w;

        public a(p715kotlin.jvm.functions.Function1 function1) {
            this.f70450w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70450w.invoke((CareUpdateEntrypointTileModel) it);
        }
    }

    /* JADX INFO: renamed from: i60.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f70451w;

        public b(p715kotlin.jvm.functions.Function1 function1) {
            this.f70451w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70451w.invoke((LabSummaryModel) it);
        }
    }

    /* JADX INFO: renamed from: i60.a$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f70452w;

        public c(p715kotlin.jvm.functions.Function1 function1) {
            this.f70452w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70452w.invoke((CircumferenceModel) it);
        }
    }

    /* JADX INFO: renamed from: i60.a$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f70453w;

        public d(p715kotlin.jvm.functions.Function1 function1) {
            this.f70453w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70453w.invoke((MeasurementProgressModel) it);
        }
    }

    /* JADX INFO: renamed from: i60.a$e */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f70454w;

        public e(p715kotlin.jvm.functions.Function1 function1) {
            this.f70454w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f70454w.invoke((ProgramGoalTileModel) it);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final C23743y0 m52085A() {
        return (C23743y0) f70448b.getValue();
    }

    /* JADX INFO: renamed from: B */
    public static final C25307p m52086B() {
        return f70449c;
    }

    /* JADX INFO: renamed from: C */
    private static final C28851c m52087C(LabSummaryRow labSummaryRow) {
        return new C28851c(AbstractC23723u4.m69556f(labSummaryRow.getLabel()), AbstractC23723u4.m69556f(labSummaryRow.getValue()), AbstractC23723u4.m69556f(labSummaryRow.getUnit()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m52101n(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C16554u(14));
        designItemReducer.m60547b(new C16554u(15));
        designItemReducer.m60547b(new C16554u(16));
        designItemReducer.m60547b(new C16554u(17));
        designItemReducer.m60547b(new C16554u(18));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m52102o(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CareUpdateEntrypointTileModel.class), new a(new C16554u(10)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C21332d m52103p(CareUpdateEntrypointTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC18103a.m51958a(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m52104q(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(LabSummaryModel.class), new b(new C16554u(19)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C28852d m52105r(LabSummaryModel model) {
        AbstractC22676k.m65750j(model, "model");
        List<LabSummaryRow> rows = model.getRows();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(rows, 10));
        Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            arrayList.add(m52087C((LabSummaryRow) it.next()));
        }
        return new C28852d(arrayList, f70447a.m60540g(model.getItems()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m52106s(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(CircumferenceModel.class), new c(new C16554u(11)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C25078d m52107t(CircumferenceModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC23350a.m67599c(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m52108u(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MeasurementProgressModel.class), new d(new C16554u(12)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C32202d m52109v(MeasurementProgressModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC30932a.m95141a(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m52110w(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ProgramGoalTileModel.class), new e(new C17650g(23)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C4271d m52111x(ProgramGoalTileModel model) {
        AbstractC22676k.m65750j(model, "model");
        return AbstractC2745a.m7763a(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23743y0 m52112y() {
        return f70447a.getModelMapper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m52113z(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C21332d.class), new C21329a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C28852d.class), new C28849a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C25078d.class), new C25075a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C32202d.class), new C32199a());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C4271d.class), new C4269b());
        return C23454a0.f92919a;
    }
}
