package p716lb1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.PhaseModel;
import com.whoop.design.models.items.TimedContentModel;
import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k41.C22187a;
import k41.C22190d;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: lb1.b5 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\"\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/models/items/TimedContentModel;", "Lk41/d;", "g", "(Lcom/whoop/design/models/items/TimedContentModel;)Lk41/d;", "Ltr2/n;", "a", "Ltr2/n;", "logger", "Llb1/y0;", "b", "Llb1/y0;", "d", "()Llb1/y0;", "timedContentMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23600b5 {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC34116n f93688a = InterfaceC34116n.INSTANCE.m107848a("TimedContentMapper");

    /* JADX INFO: renamed from: b */
    private static final C23743y0 f93689b = Function1.m68251a(new C23753z4(1));

    /* JADX INFO: renamed from: lb1.b5$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93690w;

        public a(Function1 function1) {
            this.f93690w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93690w.invoke((TimedContentModel) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C23743y0 m68550d() {
        return f93689b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m68551e(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TimedContentModel.class), new a(new C23753z4(2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C22190d m68552f(TimedContentModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68553g(model);
    }

    /* JADX INFO: renamed from: g */
    private static final C22190d m68553g(TimedContentModel timedContentModel) {
        Instant instant;
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C23751z2(24));
        List<PhaseModel> phases = timedContentModel.getPhases();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(phases, 10));
        for (PhaseModel phaseModel : phases) {
            String until = phaseModel.getUntil();
            C25306o c25306oM60542i = null;
            if (until != null) {
                try {
                    instant = Instant.parse(until);
                } catch (DateTimeParseException e5) {
                    f93688a.mo85213c("Failed to parse timed content phase until: ".concat(until), e5, new AbstractC30556a.a[0]);
                    instant = null;
                }
            } else {
                instant = null;
            }
            DesignSystemModel item = phaseModel.getItem();
            if (item != null) {
                c25306oM60542i = c21535aM60554d.m60542i(item);
            }
            arrayList.add(new C22187a(instant, c25306oM60542i));
        }
        return new C22190d(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m68554h(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60548c(C23596b1.f93677a.m68522a());
        return C23454a0.f92919a;
    }
}
