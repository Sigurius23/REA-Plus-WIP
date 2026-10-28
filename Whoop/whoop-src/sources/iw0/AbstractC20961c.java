package iw0;

import com.whoop.core.details.network.model.CardModel;
import com.whoop.core.details.network.model.ExerciseCardGroupModel;
import com.whoop.core.details.network.model.HeartRateTimelineModel;
import com.whoop.core.details.network.model.ItemModel;
import com.whoop.core.details.network.model.StatRowModel;
import com.whoop.core.details.network.model.WeightliftingExercisesModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.AbstractC16315n0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import o11.C27411q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33210q;
import p745y81.EnumC39333f;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: iw0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\n\u001a\u00020\t*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\r*\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aI\u0010\u001e\u001a\u00020\u001d*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010!\u001a\u00020 *\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010&\u001a\u00020#*\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010%\u001a\u0013\u0010'\u001a\u00020#*\u00020\u0000H\u0000¢\u0006\u0004\b'\u0010%\u001a\u0017\u0010)\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b)\u0010*¨\u0006+"}, m65681d2 = {"Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;", "Liw0/e0;", "f", "(Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;)Liw0/e0;", "Lcom/whoop/core/details/network/model/CardModel;", "", "v1VolumeTitleDisplay", "", "hasIntensityCopy", "Liw0/b;", "b", "(Lcom/whoop/core/details/network/model/CardModel;Ljava/lang/String;Z)Liw0/b;", "Lcom/whoop/core/details/network/model/ExerciseCardGroupModel;", "Liw0/y;", "c", "(Lcom/whoop/core/details/network/model/ExerciseCardGroupModel;Ljava/lang/String;Z)Liw0/y;", "", "Lcom/whoop/core/details/network/model/HeartRateTimelineModel;", "data", "", "Liw0/i0;", "a", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/core/details/network/model/ItemModel;", "tonnageTitleDisplay", "tonnageUnitsDisplay", "intensityTitleDisplay", "intensityUnitsDisplay", "isFullWorkoutSummary", "Liw0/z;", "d", "(Lcom/whoop/core/details/network/model/ItemModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Liw0/z;", "Liw0/d0;", "e", "(Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;)Liw0/d0;", "Lsz0/q;", "g", "(Lcom/whoop/core/details/network/model/WeightliftingExercisesModel;)Lsz0/q;", "i", "j", "Lcom/whoop/design/util/TextResource;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20961c {
    /* JADX INFO: renamed from: a */
    public static final List<C20974i0> m58234a(List<HeartRateTimelineModel> data) {
        AbstractC22676k.m65750j(data, "data");
        ArrayList arrayList = new ArrayList();
        for (HeartRateTimelineModel heartRateTimelineModel : data) {
            arrayList.add(new C20974i0(heartRateTimelineModel.getEndPercentage(), heartRateTimelineModel.getStartPercentage(), heartRateTimelineModel.getStartTimeInMillis(), heartRateTimelineModel.getEndTimeInMillis()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX INFO: renamed from: b */
    public static final C20959b m58235b(CardModel cardModel, String str, boolean z4) {
        TextResource textResourceM21278l;
        TextResource textResourceM21278l2;
        TextResource textResourceM21278l3;
        TextResource textResourceM21278l4;
        AbstractC22676k.m65750j(cardModel, "<this>");
        TextResource textResourceM58241h = m58241h(cardModel.getBottomStats().getIntensityDisplay());
        String intensityLabel = cardModel.getIntensityLabel();
        if (intensityLabel == null) {
            textResourceM21278l = null;
        } else {
            if (AbstractC39414r.m125890i0(intensityLabel)) {
                intensityLabel = null;
            }
            if (intensityLabel != null) {
                textResourceM21278l = AbstractC8693b.m21278l(intensityLabel);
            } else {
                textResourceM21278l = null;
            }
        }
        boolean z13 = (!z4 || textResourceM58241h == null || textResourceM21278l == null) ? false : true;
        String exerciseId = cardModel.getExerciseId();
        String repsDisplay = cardModel.getBottomStats().getRepsDisplay();
        if (repsDisplay == null || (textResourceM21278l2 = AbstractC8693b.m21278l(repsDisplay)) == null) {
            textResourceM21278l2 = AbstractC8693b.m21278l(cardModel.getBottomStats().getVolumeDisplay());
        }
        TextResource textResourceM21278l5 = AbstractC8693b.m21278l(cardModel.getBottomStats().getTonnageDisplay());
        if (!z13) {
            textResourceM58241h = null;
        }
        C20957a c20957a = new C20957a(textResourceM21278l2, textResourceM21278l5, textResourceM58241h);
        List<StatRowModel> statRows = cardModel.getStatRows();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(statRows, 10));
        for (StatRowModel statRowModel : statRows) {
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(statRowModel.getAvgHrDisplay());
            String repsDisplay2 = statRowModel.getRepsDisplay();
            if (repsDisplay2 == null || (textResourceM21278l4 = AbstractC8693b.m21278l(repsDisplay2)) == null) {
                textResourceM21278l4 = AbstractC8693b.m21278l(statRowModel.getVolumeDisplay());
            }
            arrayList.add(new C27411q(textResourceM21278l6, textResourceM21278l4, AbstractC8693b.m21278l(statRowModel.getWeightDisplay()), z4 ? m58241h(statRowModel.getIntensityDisplay()) : null, AbstractC16315n0.m46376a(statRowModel.getAchievementIcon())));
        }
        TextResource textResourceM21278l7 = AbstractC8693b.m21278l(cardModel.getTitleDisplay());
        String imageUrl = cardModel.getImageUrl();
        String volumeTitleDisplay = cardModel.getVolumeTitleDisplay();
        if (volumeTitleDisplay == null || (textResourceM21278l3 = AbstractC8693b.m21278l(volumeTitleDisplay)) == null) {
            textResourceM21278l3 = AbstractC8693b.m21278l(str);
        }
        TextResource textResource = textResourceM21278l3;
        TextResource textResourceM21278l8 = AbstractC8693b.m21278l(cardModel.getTotalsLabel());
        String weightLabel = cardModel.getWeightLabel();
        return new C20959b(exerciseId, c20957a, arrayList, textResourceM21278l7, imageUrl, textResource, textResourceM21278l8, weightLabel != null ? AbstractC8693b.m21278l(weightLabel) : null, z13 ? textResourceM21278l : null, AbstractC16315n0.m46376a(cardModel.getEndIcon()));
    }

    /* JADX INFO: renamed from: c */
    public static final C20993y m58236c(ExerciseCardGroupModel exerciseCardGroupModel, String str, boolean z4) {
        AbstractC22676k.m65750j(exerciseCardGroupModel, "<this>");
        List<CardModel> cards = exerciseCardGroupModel.getCards();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(cards, 10));
        Iterator<T> it = cards.iterator();
        while (it.hasNext()) {
            arrayList.add(m58235b((CardModel) it.next(), str, z4));
        }
        return new C20993y(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static final C20994z m58237d(ItemModel itemModel, String tonnageTitleDisplay, String tonnageUnitsDisplay, String str, String str2, String str3, boolean z4) {
        TextResource textResourceM21278l;
        TextResource textResourceM21278l2;
        AbstractC22676k.m65750j(itemModel, "<this>");
        AbstractC22676k.m65750j(tonnageTitleDisplay, "tonnageTitleDisplay");
        AbstractC22676k.m65750j(tonnageUnitsDisplay, "tonnageUnitsDisplay");
        List<String> achievementIcons = itemModel.getAchievementIcons();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = achievementIcons.iterator();
        while (it.hasNext()) {
            Integer numM46376a = AbstractC16315n0.m46376a((String) it.next());
            if (numM46376a != null) {
                arrayList.add(numM46376a);
            }
        }
        Integer numM46376a2 = AbstractC16315n0.m46376a(itemModel.getEndIcon());
        String exerciseId = itemModel.getExerciseId();
        List<C20974i0> listM58234a = m58234a(itemModel.getHeartRateTimeline());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(itemModel.getTitleDisplay());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(itemModel.getSubtitleDisplay());
        String imageUrl = itemModel.getImageUrl();
        C33210q c33210q = new C33210q(null, AbstractC8693b.m21278l(itemModel.getTonnageDisplay()), null, AbstractC8693b.m21278l(tonnageUnitsDisplay), null, null, AbstractC8693b.m21278l(tonnageTitleDisplay), false, null, null, null, false, 4021, null);
        String intensityDisplay = itemModel.getIntensityDisplay();
        C33210q c33210q2 = (intensityDisplay == null || AbstractC39414r.m125890i0(intensityDisplay) || str2 == null || AbstractC39414r.m125890i0(str2) || str3 == null || AbstractC39414r.m125890i0(str3)) ? null : new C33210q(null, AbstractC8693b.m21278l(itemModel.getIntensityDisplay()), null, AbstractC8693b.m21278l(str3), null, null, AbstractC8693b.m21278l(str2), false, null, null, null, false, 4021, null);
        String repsDisplay = itemModel.getRepsDisplay();
        if (repsDisplay == null || (textResourceM21278l = AbstractC8693b.m21278l(repsDisplay)) == null) {
            textResourceM21278l = AbstractC8693b.m21278l(itemModel.getVolumeDisplay());
        }
        TextResource textResource = textResourceM21278l;
        String volumeTitleDisplay = itemModel.getVolumeTitleDisplay();
        if (volumeTitleDisplay == null || (textResourceM21278l2 = AbstractC8693b.m21278l(volumeTitleDisplay)) == null) {
            textResourceM21278l2 = AbstractC8693b.m21278l(str);
        }
        return new C20994z(arrayList, numM46376a2, exerciseId, listM58234a, textResourceM21278l4, textResourceM21278l3, c33210q, c33210q2, new C33210q(null, textResource, null, null, null, null, textResourceM21278l2, false, null, null, null, false, 4029, null), z4, imageUrl);
    }

    /* JADX INFO: renamed from: e */
    public static final C20964d0 m58238e(WeightliftingExercisesModel weightliftingExercisesModel) {
        boolean z4;
        AbstractC22676k.m65750j(weightliftingExercisesModel, "<this>");
        String oneRepMaxIntensityTitleDisplay = weightliftingExercisesModel.getExerciseSummary().getOneRepMaxIntensityTitleDisplay();
        if (oneRepMaxIntensityTitleDisplay == null || AbstractC39414r.m125890i0(oneRepMaxIntensityTitleDisplay)) {
            oneRepMaxIntensityTitleDisplay = null;
        }
        String oneRepMaxIntensityUnitDisplay = weightliftingExercisesModel.getExerciseSummary().getOneRepMaxIntensityUnitDisplay();
        if (oneRepMaxIntensityUnitDisplay == null || AbstractC39414r.m125890i0(oneRepMaxIntensityUnitDisplay)) {
            oneRepMaxIntensityUnitDisplay = null;
        }
        boolean z13 = (oneRepMaxIntensityTitleDisplay == null || oneRepMaxIntensityUnitDisplay == null) ? false : true;
        List<ExerciseCardGroupModel> exerciseCardGroups = weightliftingExercisesModel.getExerciseSummary().getExerciseCardGroups();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(exerciseCardGroups, 10));
        Iterator<T> it = exerciseCardGroups.iterator();
        while (it.hasNext()) {
            arrayList.add(m58236c((ExerciseCardGroupModel) it.next(), weightliftingExercisesModel.getExerciseSummary().getRepsTitleDisplay(), z13));
        }
        if (arrayList.isEmpty()) {
            z4 = false;
        } else {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    List<C20959b> listM58483a = ((C20993y) it3.next()).m58483a();
                    if (!(listM58483a instanceof Collection) || !listM58483a.isEmpty()) {
                        Iterator<T> it4 = listM58483a.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                C20959b c20959b = (C20959b) it4.next();
                                if (c20959b.getBottomStats().getIntensityDisplay() == null) {
                                    List<C27411q> listM58229f = c20959b.m58229f();
                                    if (!(listM58229f instanceof Collection) || !listM58229f.isEmpty()) {
                                        Iterator<T> it5 = listM58229f.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                continue;
                                            } else if (((C27411q) it5.next()).getIntensityDisplay() != null) {
                                            }
                                        }
                                    }
                                }
                                z4 = true;
                            } else {
                                continue;
                            }
                        }
                    }
                } else {
                    z4 = false;
                }
            }
        }
        return new C20964d0(m58243j(weightliftingExercisesModel), m58240g(weightliftingExercisesModel), m58242i(weightliftingExercisesModel), arrayList, AbstractC8693b.m21278l(weightliftingExercisesModel.getExerciseSummary().getAvgHrTitleDisplay()), AbstractC8693b.m21278l(weightliftingExercisesModel.getExerciseSummary().getHrUnitsDisplay()), AbstractC8693b.m21278l(weightliftingExercisesModel.getExerciseSummary().getRepsTitleDisplay()), AbstractC8693b.m21278l(weightliftingExercisesModel.getExerciseSummary().getTitleDisplay()), AbstractC8693b.m21278l(weightliftingExercisesModel.getTonnageUnitsDisplay()), AbstractC8693b.m21278l(weightliftingExercisesModel.getExerciseSummary().getWeightTitleDisplay()), z13 ? oneRepMaxIntensityTitleDisplay != null ? AbstractC8693b.m21278l(oneRepMaxIntensityTitleDisplay) : null : null, z13 ? oneRepMaxIntensityUnitDisplay != null ? AbstractC8693b.m21278l(oneRepMaxIntensityUnitDisplay) : null : null, z4);
    }

    /* JADX INFO: renamed from: f */
    public static final C20966e0 m58239f(WeightliftingExercisesModel weightliftingExercisesModel) {
        AbstractC22676k.m65750j(weightliftingExercisesModel, "<this>");
        List<ItemModel> items = weightliftingExercisesModel.getExerciseSummaryCarousel().getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        int i13 = 0;
        for (Object obj : items) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(m58237d((ItemModel) obj, weightliftingExercisesModel.getTonnageTitleDisplay(), weightliftingExercisesModel.getTonnageUnitsDisplay(), weightliftingExercisesModel.getRepsTitleDisplay(), weightliftingExercisesModel.getIntensityTitleDisplay(), weightliftingExercisesModel.getIntensityUnitsDisplay(), i13 == 0));
            i13 = i14;
        }
        return new C20966e0(arrayList, weightliftingExercisesModel.getExerciseSummaryCarousel().getTotalNumberOfItems());
    }

    /* JADX INFO: renamed from: g */
    public static final C33210q m58240g(WeightliftingExercisesModel weightliftingExercisesModel) {
        AbstractC22676k.m65750j(weightliftingExercisesModel, "<this>");
        String mskIntensityPercentValueDisplay = weightliftingExercisesModel.getExerciseSummary().getMskIntensityPercentValueDisplay();
        if (AbstractC39414r.m125890i0(mskIntensityPercentValueDisplay)) {
            mskIntensityPercentValueDisplay = null;
        }
        if (mskIntensityPercentValueDisplay == null) {
            return null;
        }
        String mskIntensityPercentTitleDisplay = weightliftingExercisesModel.getExerciseSummary().getMskIntensityPercentTitleDisplay();
        if (AbstractC39414r.m125890i0(mskIntensityPercentTitleDisplay)) {
            mskIntensityPercentTitleDisplay = null;
        }
        if (mskIntensityPercentTitleDisplay == null) {
            return null;
        }
        return new C33210q(null, AbstractC8693b.m21278l(mskIntensityPercentValueDisplay), null, null, null, null, AbstractC8693b.m21278l(mskIntensityPercentTitleDisplay), false, null, null, null, false, 4029, null);
    }

    /* JADX INFO: renamed from: h */
    public static final TextResource m58241h(String str) {
        if (str == null || AbstractC39414r.m125890i0(str) || AbstractC22676k.m65745e(str, "--")) {
            str = null;
        }
        if (str != null) {
            return AbstractC8693b.m21278l(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final C33210q m58242i(WeightliftingExercisesModel weightliftingExercisesModel) {
        AbstractC22676k.m65750j(weightliftingExercisesModel, "<this>");
        return new C33210q(null, AbstractC8693b.m21278l(weightliftingExercisesModel.getExerciseSummary().getRepsDisplay()), null, null, null, null, AbstractC8693b.m21278l(weightliftingExercisesModel.getExerciseSummary().getRepsTitleDisplay()), false, null, null, null, false, 4029, null);
    }

    /* JADX INFO: renamed from: j */
    public static final C33210q m58243j(WeightliftingExercisesModel weightliftingExercisesModel) {
        AbstractC22676k.m65750j(weightliftingExercisesModel, "<this>");
        return new C33210q(null, AbstractC8693b.m21278l(weightliftingExercisesModel.getExerciseSummary().getTonnageDisplay()), null, AbstractC8693b.m21278l(weightliftingExercisesModel.getTonnageUnitsDisplay()), null, null, AbstractC8693b.m21278l(weightliftingExercisesModel.getTonnageTitleDisplay()), false, EnumC39333f.STRAIN, null, null, false, 3765, null);
    }
}
