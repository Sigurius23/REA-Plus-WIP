package io1;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.anchorSelector.AnchorSectionModel;
import com.whoop.design.models.anchorSelector.AnchorSelectorModel;
import com.whoop.design.models.items.SelectableCellListModel;
import com.whoop.design.models.items.SelectableCellModel;
import com.whoop.design.models.items.TrackedBehaviorModel;
import com.whoop.design.models.items.TrackerInputModel;
import com.whoop.hormonalinsights.logsymptoms.domain.models.LogSymptomsResponse;
import com.whoop.hormonalinsights.logsymptoms.domain.models.SymptomTrackerInput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: io1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a#\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;", "Ll83/k;", "", "c", "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)Ll83/k;", "", "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;", "d", "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)Ljava/util/List;", "", "behaviorTrackerId", "", "isSelected", "magnitudeInputValue", "", "timeInputValue", "e", "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20747h {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23465k m57104c(LogSymptomsResponse logSymptomsResponse) {
        Object next;
        Object next2;
        Iterator<T> it = logSymptomsResponse.getCategorySelector().getItems().iterator();
        String id4 = null;
        String id5 = null;
        while (it.hasNext()) {
            List<DesignSystemModel> items = ((AnchorSectionModel) it.next()).getItems();
            ArrayList<SelectableCellListModel> arrayList = new ArrayList();
            for (Object obj : items) {
                if (obj instanceof SelectableCellListModel) {
                    arrayList.add(obj);
                }
            }
            for (SelectableCellListModel selectableCellListModel : arrayList) {
                String id6 = selectableCellListModel.getId();
                if (AbstractC22676k.m65745e(id6, "menstruation")) {
                    Iterator<T> it3 = selectableCellListModel.getCells().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!((SelectableCellModel) next).getSelected());
                    SelectableCellModel selectableCellModel = (SelectableCellModel) next;
                    id4 = selectableCellModel != null ? selectableCellModel.getId() : null;
                } else if (AbstractC22676k.m65745e(id6, "cervical_mucus")) {
                    Iterator<T> it4 = selectableCellListModel.getCells().iterator();
                    do {
                        if (!it4.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it4.next();
                    } while (!((SelectableCellModel) next2).getSelected());
                    SelectableCellModel selectableCellModel2 = (SelectableCellModel) next2;
                    id5 = selectableCellModel2 != null ? selectableCellModel2.getId() : null;
                }
            }
        }
        return new C23465k(id4, id5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final List<SymptomTrackerInput> m57105d(LogSymptomsResponse logSymptomsResponse) {
        List<AnchorSectionModel> items = logSymptomsResponse.getCategorySelector().getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            List<DesignSystemModel> items2 = ((AnchorSectionModel) it.next()).getItems();
            ArrayList<TrackedBehaviorModel> arrayList2 = new ArrayList();
            for (Object obj : items2) {
                if (obj instanceof TrackedBehaviorModel) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            for (TrackedBehaviorModel trackedBehaviorModel : arrayList2) {
                TrackerInputModel trackerInput = trackedBehaviorModel.getTrackerInput();
                Boolean answeredYes = trackerInput != null ? trackerInput.getAnsweredYes() : null;
                int id4 = trackedBehaviorModel.getBehaviorTracker().getId();
                List<Integer> suggestedTrackerIds = logSymptomsResponse.getSuggestedTrackerIds();
                boolean z4 = suggestedTrackerIds != null && suggestedTrackerIds.contains(Integer.valueOf(id4));
                arrayList3.add(AbstractC22676k.m65745e(answeredYes, Boolean.TRUE) ? new SymptomTrackerInput(trackerInput.getAnsweredYes(), Integer.valueOf(id4), trackerInput.getTimeInputValue(), trackerInput.getTimeInputLabel(), trackerInput.getMagnitudeInputLabel(), trackerInput.getMagnitudeInputValue(), z4) : new SymptomTrackerInput((Boolean) null, Integer.valueOf(id4), (Long) null, (String) null, (String) null, (Double) null, z4, 61, (DefaultConstructorMarker) null));
            }
            AbstractC25265s.m74141p0(arrayList, arrayList3);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX INFO: renamed from: e */
    private static final LogSymptomsResponse m57106e(LogSymptomsResponse logSymptomsResponse, int i13, Boolean bool, Integer num, Long l7) {
        Double dValueOf;
        TrackerInputModel trackerInputModel;
        List<AnchorSectionModel> items = logSymptomsResponse.getCategorySelector().getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        for (AnchorSectionModel anchorSectionModel : items) {
            List<DesignSystemModel> items2 = anchorSectionModel.getItems();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(items2, 10));
            for (Object objCopy$default : items2) {
                if (objCopy$default instanceof TrackedBehaviorModel) {
                    TrackedBehaviorModel trackedBehaviorModel = (TrackedBehaviorModel) objCopy$default;
                    if (trackedBehaviorModel.getBehaviorTracker().getId() == i13) {
                        TrackerInputModel trackerInput = trackedBehaviorModel.getTrackerInput();
                        if (trackerInput == null) {
                            if (num != null) {
                                dValueOf = Double.valueOf(num.intValue());
                            } else {
                                dValueOf = null;
                            }
                            trackerInputModel = new TrackerInputModel(i13, null, l7, null, dValueOf, bool, null);
                        } else {
                            TrackerInputModel trackerInputModelCopy$default = TrackerInputModel.copy$default(trackerInput, 0, null, l7 == null ? trackerInput.getTimeInputValue() : l7, null, num != null ? Double.valueOf(num.intValue()) : trackerInput.getMagnitudeInputValue(), bool == null ? trackerInput.getAnsweredYes() : bool, null, 75, null);
                            if (trackerInputModelCopy$default == null) {
                                if (num != null) {
                                    dValueOf = Double.valueOf(num.intValue());
                                } else {
                                    dValueOf = null;
                                }
                                trackerInputModel = new TrackerInputModel(i13, null, l7, null, dValueOf, bool, null);
                            } else {
                                trackerInputModel = trackerInputModelCopy$default;
                            }
                        }
                        objCopy$default = TrackedBehaviorModel.copy$default(trackedBehaviorModel, null, trackerInputModel, null, null, null, false, null, null, null, 509, null);
                    }
                }
                arrayList2.add(objCopy$default);
            }
            arrayList.add(AnchorSectionModel.copy$default(anchorSectionModel, null, null, arrayList2, null, null, null, null, null, null, null, 1019, null));
        }
        return LogSymptomsResponse.copy$default(logSymptomsResponse, null, null, AnchorSelectorModel.copy$default(logSymptomsResponse.getCategorySelector(), null, arrayList, null, null, null, false, null, null, 253, null), null, null, null, 59, null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ LogSymptomsResponse m57107f(LogSymptomsResponse logSymptomsResponse, int i13, Boolean bool, Integer num, Long l7, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            bool = null;
        }
        if ((i14 & 4) != 0) {
            num = null;
        }
        if ((i14 & 8) != 0) {
            l7 = null;
        }
        return m57106e(logSymptomsResponse, i13, bool, num, l7);
    }
}
