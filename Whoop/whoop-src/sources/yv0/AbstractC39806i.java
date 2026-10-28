package yv0;

import com.whoop.core.details.activitytargets.ActivityTarget;
import com.whoop.core.details.activitytargets.ActivityTargetType;
import com.whoop.core.details.activitytargets.ActivityTargetZone;
import com.whoop.core.details.activitytargets.ActivityTargetsModel;
import com.whoop.design.models.DesignSystemModel;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import yk2.C39611k;

/* JADX INFO: renamed from: yv0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/core/details/activitytargets/ActivityTarget;", "Lyv0/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e;", "Lyv0/e$b;", "j", "(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e$b;", "Lyv0/e$a;", "k", "(Lcom/whoop/core/details/activitytargets/ActivityTarget;)Lyv0/e$a;", "Lcom/whoop/core/details/activitytargets/ActivityTargetZone;", "Lyv0/f;", "i", "(Lcom/whoop/core/details/activitytargets/ActivityTargetZone;)Lyv0/f;", "Ljb1/a;", "a", "Ljb1/a;", "g", "()Ljb1/a;", "activityTargetsDesignItemReducer", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39806i {

    /* JADX INFO: renamed from: a */
    private static final C21535a f171542a = AbstractC21537c.m60554d(new C39611k(28));

    /* JADX INFO: renamed from: yv0.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f171543a;

        static {
            int[] iArr = new int[ActivityTargetType.values().length];
            try {
                iArr[ActivityTargetType.HR_ZONES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityTargetType.DURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityTargetType.STRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivityTargetType.DISTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f171543a = iArr;
        }
    }

    /* JADX INFO: renamed from: yv0.i$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f171544w;

        public b(Function1 function1) {
            this.f171544w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f171544w.invoke((ActivityTargetsModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m127602d(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C39611k(29));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m127603e(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ActivityTargetsModel.class), new b(new C39805h(0)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C39804g m127604f(ActivityTargetsModel model) {
        AbstractC22676k.m65750j(model, "model");
        String title = model.getTitle();
        List<ActivityTarget> targets = model.getTargets();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = targets.iterator();
        while (it.hasNext()) {
            InterfaceC39802e interfaceC39802eM127606h = m127606h((ActivityTarget) it.next());
            if (interfaceC39802eM127606h != null) {
                arrayList.add(interfaceC39802eM127606h);
            }
        }
        return new C39804g(title, arrayList);
    }

    /* JADX INFO: renamed from: g */
    public static final C21535a m127605g() {
        return f171542a;
    }

    /* JADX INFO: renamed from: h */
    private static final InterfaceC39802e m127606h(ActivityTarget activityTarget) {
        int i13 = a.f171543a[activityTarget.getType().ordinal()];
        if (i13 == 1) {
            return m127608j(activityTarget);
        }
        if (i13 == 2 || i13 == 3 || i13 == 4) {
            return m127609k(activityTarget);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    private static final C39803f m127607i(ActivityTargetZone activityTargetZone) {
        return new C39803f(activityTargetZone.getLabel(), activityTargetZone.getValue(), activityTargetZone.getTarget(), activityTargetZone.getColor(), activityTargetZone.isCompleted());
    }

    /* JADX INFO: renamed from: j */
    private static final InterfaceC39802e.b m127608j(ActivityTarget activityTarget) {
        List<ActivityTargetZone> zones = activityTarget.getZones();
        if (zones == null) {
            return null;
        }
        String title = activityTarget.getTitle();
        EnumC16313m0 icon = activityTarget.getIcon();
        List<ActivityTargetZone> list = zones;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m127607i((ActivityTargetZone) it.next()));
        }
        return new InterfaceC39802e.b(title, icon, arrayList);
    }

    /* JADX INFO: renamed from: k */
    private static final InterfaceC39802e.a m127609k(ActivityTarget activityTarget) {
        String target;
        Boolean boolIsCompleted;
        String value = activityTarget.getValue();
        if (value == null || (target = activityTarget.getTarget()) == null || (boolIsCompleted = activityTarget.isCompleted()) == null) {
            return null;
        }
        return new InterfaceC39802e.a(activityTarget.getTitle(), activityTarget.getIcon(), value, target, boolIsCompleted.booleanValue());
    }
}
