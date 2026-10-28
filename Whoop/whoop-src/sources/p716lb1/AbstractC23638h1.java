package p716lb1;

import com.whoop.design.models.celebration.AnimationModeModel;
import com.whoop.design.models.celebration.SlotConfigModel;
import com.whoop.design.models.celebration.SlotGroupModel;
import com.whoop.design.models.celebration.SlotOptionsModel;
import i51.AbstractC18125v;
import i51.C18126w;
import i51.EnumC18104a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb1.h1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotConfigModel;", "Li51/v;", "b", "(Lcom/whoop/design/models/celebration/SlotConfigModel;)Li51/v;", "Lcom/whoop/design/models/celebration/AnimationModeModel;", "Li51/a;", "a", "(Lcom/whoop/design/models/celebration/AnimationModeModel;)Li51/a;", "Lcom/whoop/design/models/celebration/SlotGroupModel;", "Li51/w;", "c", "(Lcom/whoop/design/models/celebration/SlotGroupModel;)Li51/w;", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23638h1 {

    /* JADX INFO: renamed from: lb1.h1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f93782a;

        static {
            int[] iArr = new int[AnimationModeModel.values().length];
            try {
                iArr[AnimationModeModel.LOOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationModeModel.PLAY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimationModeModel.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f93782a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC18104a m68827a(AnimationModeModel animationModeModel) {
        AbstractC22676k.m65750j(animationModeModel, "<this>");
        int i13 = a.f93782a[animationModeModel.ordinal()];
        if (i13 == 1) {
            return EnumC18104a.LOOP;
        }
        if (i13 == 2) {
            return EnumC18104a.PLAY_ONCE;
        }
        if (i13 == 3) {
            return EnumC18104a.OFF;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC18125v m68828b(SlotConfigModel slotConfigModel) {
        AbstractC22676k.m65750j(slotConfigModel, "<this>");
        SlotOptionsModel options = slotConfigModel.getOptions();
        if (options instanceof SlotOptionsModel.CumulativeOptionsModel) {
            SlotOptionsModel.CumulativeOptionsModel cumulativeOptionsModel = (SlotOptionsModel.CumulativeOptionsModel) options;
            return new AbstractC18125v.a(cumulativeOptionsModel.getMax(), cumulativeOptionsModel.getSelected(), cumulativeOptionsModel.getLayerPattern(), cumulativeOptionsModel.getBaseLayers());
        }
        if (options instanceof SlotOptionsModel.ExclusiveOptionsModel) {
            SlotOptionsModel.ExclusiveOptionsModel exclusiveOptionsModel = (SlotOptionsModel.ExclusiveOptionsModel) options;
            return new AbstractC18125v.b(exclusiveOptionsModel.getMax(), exclusiveOptionsModel.getSelected(), exclusiveOptionsModel.getLayerPattern());
        }
        if (options instanceof SlotOptionsModel.BooleanOptionsModel) {
            SlotOptionsModel.BooleanOptionsModel booleanOptionsModel = (SlotOptionsModel.BooleanOptionsModel) options;
            return new AbstractC18125v.d(booleanOptionsModel.getLayers(), booleanOptionsModel.getValue());
        }
        if (!(options instanceof SlotOptionsModel.GroupedCumulativeOptionsModel)) {
            if (options instanceof SlotOptionsModel.UnknownOptionsModel) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String name = slotConfigModel.getName();
        SlotOptionsModel.GroupedCumulativeOptionsModel groupedCumulativeOptionsModel = (SlotOptionsModel.GroupedCumulativeOptionsModel) options;
        int selectedGroup = groupedCumulativeOptionsModel.getSelectedGroup();
        int selectedLevel = groupedCumulativeOptionsModel.getSelectedLevel();
        List<SlotGroupModel> groups = groupedCumulativeOptionsModel.getGroups();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(groups, 10));
        Iterator<T> it = groups.iterator();
        while (it.hasNext()) {
            arrayList.add(m68829c((SlotGroupModel) it.next()));
        }
        return new AbstractC18125v.c(name, selectedGroup, selectedLevel, arrayList);
    }

    /* JADX INFO: renamed from: c */
    public static final C18126w m68829c(SlotGroupModel slotGroupModel) {
        AbstractC22676k.m65750j(slotGroupModel, "<this>");
        return new C18126w(slotGroupModel.getId(), slotGroupModel.getMax(), slotGroupModel.getLayerPattern(), slotGroupModel.getIndicatorLayers(), slotGroupModel.getWrapperLayers());
    }
}
