package p716lb1;

import c41.C4103r;
import com.whoop.design.models.ActivityTileSelectionState;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ActivityTileSelectionItemModel;
import com.whoop.design.models.items.During;
import com.whoop.design.util.TextResource;
import com.whoop.service.network.model.cycles.Period;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: lb1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;", "Lc41/r;", "f", "(Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;)Lc41/r;", "Llb1/y0;", "a", "Llb1/y0;", "e", "()Llb1/y0;", "activityTileSelectionItemMapper", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23601c {

    /* JADX INFO: renamed from: a */
    private static final C23743y0 f93691a = Function1.m68251a(new C23587a(2));

    /* JADX INFO: renamed from: lb1.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f93692w;

        public a(Function1 function1) {
            this.f93692w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f93692w.invoke((ActivityTileSelectionItemModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m68558c(C23749z0 designModelMapper) {
        AbstractC22676k.m65750j(designModelMapper, "$this$designModelMapper");
        designModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(ActivityTileSelectionItemModel.class), new a(new C23587a(3)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C4103r m68559d(ActivityTileSelectionItemModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m68561f(model);
    }

    /* JADX INFO: renamed from: e */
    public static final C23743y0 m68560e() {
        return f93691a;
    }

    /* JADX INFO: renamed from: f */
    public static final C4103r m68561f(ActivityTileSelectionItemModel activityTileSelectionItemModel) {
        AbstractC22676k.m65750j(activityTileSelectionItemModel, "<this>");
        boolean z4 = activityTileSelectionItemModel.getSelectableState().getState() == ActivityTileSelectionState.SELECTABLE && activityTileSelectionItemModel.getSelectableState().isSelected();
        TextResource title = activityTileSelectionItemModel.getActivity().getTitle();
        TextResource scoreDisplay = activityTileSelectionItemModel.getActivity().getScoreDisplay();
        TextResource startTimeText = activityTileSelectionItemModel.getActivity().getStartTimeText();
        TextResource endTimeText = activityTileSelectionItemModel.getActivity().getEndTimeText();
        String iconUrl = activityTileSelectionItemModel.getActivity().getIconUrl();
        if (iconUrl.length() <= 0) {
            iconUrl = null;
        }
        AbstractC22403o abstractC22403oM64503l = iconUrl != null ? AbstractC22404p.m64503l(iconUrl) : null;
        String activityV2Id = activityTileSelectionItemModel.getActivity().getActivityV2Id();
        boolean zIsGpsEnabled = activityTileSelectionItemModel.getActivity().isGpsEnabled();
        During during = activityTileSelectionItemModel.getActivity().getDuring();
        Period period = during != null ? new Period(during.getLowerEndpoint(), during.getUpperEndpoint()) : null;
        During during2 = activityTileSelectionItemModel.getActivity().getDuring();
        String lowerEndpoint = during2 != null ? during2.getLowerEndpoint() : null;
        During during3 = activityTileSelectionItemModel.getActivity().getDuring();
        return new C4103r(title, scoreDisplay, startTimeText, endTimeText, abstractC22403oM64503l, activityV2Id, zIsGpsEnabled, period, lowerEndpoint, during3 != null ? during3.getUpperEndpoint() : null, activityTileSelectionItemModel.getSelectableState().getState(), z4, activityTileSelectionItemModel.getActivity().getInternalName());
    }
}
