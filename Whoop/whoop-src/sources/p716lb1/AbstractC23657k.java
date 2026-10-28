package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.AnimatedSequenceModel;
import com.whoop.design.models.items.AnimatedSequenceStepModel;
import i51.EnumC18104a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l60.C23374a;
import l83.C23454a0;
import m83.AbstractC25267u;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import v41.InterfaceC35689r0;
import wz0.AbstractC37777d;
import wz0.C37778e;
import wz0.C37779f;

/* JADX INFO: renamed from: lb1.k */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/AnimatedSequenceModel;", "Lwz0/e;", "g", "(Lcom/whoop/design/models/items/AnimatedSequenceModel;)Lwz0/e;", "Llb1/y0;", "a", "Llb1/y0;", "f", "()Llb1/y0;", "animatedSequenceMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23657k {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93824a = Function1.m68251a(new C23374a(27));

    /* JADX INFO: renamed from: lb1.k$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93825w;

        public a(Function1 function1) {
            this.f93825w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93825w.invoke((AnimatedSequenceModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m68941d(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(AnimatedSequenceModel.class), new a(new C23374a(28)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C37778e m68942e(AnimatedSequenceModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68944g(model);
    }

    /* JADX INFO: renamed from: f */
    public static final C23743y0 m68943f() {
        return f93824a;
    }

    /* JADX INFO: renamed from: g */
    private static final C37778e m68944g(AnimatedSequenceModel animatedSequenceModel) {
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23374a(29));
        List<AnimatedSequenceStepModel> steps = animatedSequenceModel.getSteps();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(steps, 10));
        Iterator<T> it = steps.iterator();
        while (true) {
            C25306o c25306oM60542i = null;
            if (!it.hasNext()) {
                break;
            }
            AnimatedSequenceStepModel animatedSequenceStepModel = (AnimatedSequenceStepModel) it.next();
            InterfaceC35689r0.e eVarM113134a = InterfaceC35689r0.e.m113134a(InterfaceC35689r0.e.m113135b(animatedSequenceStepModel.getLottieUrl()));
            DesignSystemModel content = animatedSequenceStepModel.getContent();
            if (content != null) {
                c25306oM60542i = c21535aM60554d.m60542i(content);
            }
            arrayList.add(new C37779f(eVarM113134a, c25306oM60542i, animatedSequenceStepModel.getMinDurationMs(), animatedSequenceStepModel.getOnStepCompleteInteraction()));
        }
        EnumC18104a enumC18104aM68827a = AbstractC23638h1.m68827a(animatedSequenceModel.getRepeatMode());
        Float height = animatedSequenceModel.getHeight();
        float fFloatValue = height != null ? height.floatValue() : AbstractC37777d.m121197R();
        Float width = animatedSequenceModel.getWidth();
        return new C37778e(arrayList, enumC18104aM68827a, fFloatValue, width != null ? new C39174f(width.floatValue()) : null, animatedSequenceModel.getOnCompleteInteraction(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m68945h(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }
}
