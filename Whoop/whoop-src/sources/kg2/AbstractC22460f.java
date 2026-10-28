package kg2;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.startactivity.goals.StartActivityTargetsMiniArch;
import com.whoop.startactivity.goals.TargetsScoreType;
import ih0.AbstractC18489d0;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25265s;
import n83.C26460c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25292c0;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;
import wg2.C37265a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: kg2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;", "", "e", "(Lcom/whoop/startactivity/goals/StartActivityTargetsMiniArch;)Ljava/lang/String;", "Ljb1/a;", "a", "Ljb1/a;", "d", "()Ljb1/a;", "startActivityTargetsMiniArchDesignItemReducer", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22460f {

    /* JADX INFO: renamed from: a */
    private static final C21535a f87978a = AbstractC21537c.m60554d(new C22459e(0));

    /* JADX INFO: renamed from: kg2.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f87979w;

        public a(Function1 function1) {
            this.f87979w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f87979w.invoke((StartActivityTargetsMiniArch) it);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C21535a m64870d() {
        return f87978a;
    }

    /* JADX INFO: renamed from: e */
    private static final String m64871e(StartActivityTargetsMiniArch startActivityTargetsMiniArch) {
        String path = startActivityTargetsMiniArch.getPath();
        if (path != null) {
            if (AbstractC39414r.m125890i0(path)) {
                path = null;
            }
            if (path != null) {
                C26460c c26460cM119000x = AbstractC37056f.m119000x();
                String activityType = startActivityTargetsMiniArch.getActivityType();
                if (activityType != null) {
                    String str = AbstractC39414r.m125890i0(activityType) ? null : activityType;
                    if (str != null) {
                        c26460cM119000x.add("activityType=".concat(str));
                    }
                }
                Boolean gpsEnabled = startActivityTargetsMiniArch.getGpsEnabled();
                if (gpsEnabled != null) {
                    c26460cM119000x.add("gpsEnabled=" + gpsEnabled.booleanValue());
                }
                TargetsScoreType scoreType = startActivityTargetsMiniArch.getScoreType();
                if (scoreType != null) {
                    c26460cM119000x.add("scoreType=" + scoreType.name());
                }
                C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
                if (c26460cM118988k.isEmpty()) {
                    return path;
                }
                return AbstractC25265s.m74110N0(c26460cM118988k, "&", path.concat(AbstractC39414r.m125876U(path, "?", false) ? "&" : "?"), null, null, 60);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m64872f(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C22459e(1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m64873g(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(StartActivityTargetsMiniArch.class), new a(new C22459e(2)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC25312u m64874h(StartActivityTargetsMiniArch model) {
        String id4;
        AbstractC22676k.m65750j(model, "model");
        String strM64871e = m64871e(model);
        if (strM64871e == null) {
            return new C25292c0(0.0f, 0.0f, 3, null);
        }
        String activityType = model.getActivityType();
        if (activityType == null) {
            id4 = model.getId();
        } else {
            String str = AbstractC39414r.m125890i0(activityType) ? null : activityType;
            if (str == null || (id4 = AbstractC18489d0.m53370k(model.getId(), ":", str)) == null) {
                id4 = model.getId();
            }
        }
        return new C37265a(id4, strM64871e, model.getShowLoading());
    }
}
