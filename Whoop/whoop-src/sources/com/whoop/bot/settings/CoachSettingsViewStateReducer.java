package com.whoop.bot.settings;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wk0.AbstractC37336b;
import x81.C38072d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;", "", "featureFlagChecker", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "reduce", "Lcom/whoop/bot/settings/CoachSettingsViewState;", "state", "Lcom/whoop/bot/settings/CoachSettingsDomainState;", "reduceSuccess", "Lcom/whoop/bot/settings/CoachSettingsViewState$Success;", "data", "Lcom/whoop/bot/settings/CoachSettingsResponse;", "settingItemMapper", "Lcom/whoop/bot/settings/SettingItem;", "coachSettingItem", "Lcom/whoop/bot/settings/CoachSettingItem;", "footerMapper", "Lcom/whoop/bot/settings/SettingFooter;", "coachSettingsFooter", "Lcom/whoop/bot/settings/CoachSettingsFooter;", "iconKeyToResourceId", "", "key", "", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CoachSettingsViewStateReducer {
    public static final int $stable = 8;
    private final FeatureFlagChecker featureFlagChecker;

    public CoachSettingsViewStateReducer(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
    }

    private final SettingFooter footerMapper(CoachSettingsFooter coachSettingsFooter) {
        return new SettingFooter(AbstractC8693b.m21278l(coachSettingsFooter.getTitle()), AbstractC8693b.m21278l(coachSettingsFooter.getBody()), AbstractC8693b.m21278l(coachSettingsFooter.getCtaTitle()), iconKeyToResourceId(coachSettingsFooter.getCtaIcon()), coachSettingsFooter.getCtaUrlLink());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    private final int iconKeyToResourceId(String key) {
        for (EnumC16313m0 enumC16313m0 : EnumC16313m0.values()) {
            if (AbstractC22676k.m65745e(enumC16313m0.name(), key)) {
                return enumC16313m0 != null ? enumC16313m0.toWhoopIcon() : AbstractC18489d0.m53359E(C38072d.f163053a);
            }
        }
        enumC16313m0 = null;
        if (enumC16313m0 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [m83.y] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    private final CoachSettingsViewState.Success reduceSuccess(CoachSettingsResponse data) {
        ?? arrayList;
        CoachSettingItem coachSettingItem;
        CoachSettingItem coachSettingItem2;
        Object next;
        String settingKey;
        Object next2;
        Object next3;
        List<CoachSettingItem> settings = data.getSettings();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : settings) {
            if (AbstractC22676k.m65745e(((CoachSettingItem) obj).getSettingKey(), "WHOOP_COACH")) {
                arrayList2.add(obj);
            }
        }
        if (this.featureFlagChecker.isFeatureEnabled("coach-tos-update-ai-opt-out")) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(settingItemMapper((CoachSettingItem) it.next()));
            }
        } else {
            arrayList = C25271y.f99162w;
        }
        List<CoachSettingItem> settings2 = data.getSettings();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : settings2) {
            if (AbstractC22676k.m65745e(((CoachSettingItem) obj2).getSettingKey(), "WHOOP_COACH_MEMORY")) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(settingItemMapper((CoachSettingItem) it3.next()));
        }
        List<CoachSettingItem> settings3 = data.getSettings();
        if (this.featureFlagChecker.isFeatureEnabled("coach-tos-update-ai-opt-out")) {
            settings3 = null;
        }
        if (settings3 != null) {
            Iterator it4 = settings3.iterator();
            do {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
            } while (!AbstractC22676k.m65745e(((CoachSettingItem) next3).getSettingKey(), "WHOOP_COACH_DATA"));
            coachSettingItem = (CoachSettingItem) next3;
        } else {
            coachSettingItem = null;
        }
        List<CoachSettingItem> settings4 = data.getSettings();
        if (this.featureFlagChecker.isFeatureEnabled("coach-tos-update-ai-opt-out")) {
            settings4 = null;
        }
        if (settings4 != null) {
            Iterator it5 = settings4.iterator();
            do {
                if (!it5.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it5.next();
            } while (!AbstractC22676k.m65745e(((CoachSettingItem) next2).getSettingKey(), "WHOOP_COACH_CONCISE"));
            coachSettingItem2 = (CoachSettingItem) next2;
        } else {
            coachSettingItem2 = null;
        }
        Iterator it6 = data.getSettings().iterator();
        do {
            if (!it6.hasNext()) {
                next = null;
                break;
            }
            next = it6.next();
        } while (!AbstractC22676k.m65745e(((CoachSettingItem) next).getSettingKey(), "WHOOP_COACH_RECOMMENDED_ACTIVITIES"));
        CoachSettingItem coachSettingItem3 = (CoachSettingItem) next;
        CoachSettingsDisplayState coachSettingsDisplayState = new CoachSettingsDisplayState(AbstractC8693b.m21278l(data.getTitle()), AbstractC25265s.m74129g1((Collection) arrayList, arrayList4), footerMapper(data.getFooter()));
        CoachSettingsCoachingModeState coachSettingsCoachingModeState = coachSettingItem != null ? new CoachSettingsCoachingModeState(AbstractC8693b.m21277k(AbstractC37336b.f159625I0), coachSettingItem.getActive() ? CoachingMode.CUSTOMIZED : CoachingMode.EDUCATION, !coachSettingItem.getDisabled()) : null;
        CoachSettingsConciseState coachSettingsConciseState = coachSettingItem2 != null ? new CoachSettingsConciseState(AbstractC8693b.m21277k(AbstractC37336b.f159673i), coachSettingItem2.getActive() ? ConcisenessMode.CONDENSED : ConcisenessMode.DEFAULT, !coachSettingItem2.getDisabled()) : null;
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC37336b.f159700v0);
        TextResource textResourceM21278l = AbstractC8693b.m21278l(coachSettingItem3 != null ? coachSettingItem3.getBody() : null);
        RecommendedActivitiesMode recommendedActivitiesMode = (coachSettingItem3 == null || !coachSettingItem3.getActive()) ? RecommendedActivitiesMode.OFF : RecommendedActivitiesMode.ON;
        boolean z4 = (coachSettingItem3 == null || coachSettingItem3.getDisabled()) ? false : true;
        if (coachSettingItem3 == null || (settingKey = coachSettingItem3.getSettingKey()) == null) {
            settingKey = "";
        }
        return new CoachSettingsViewState.Success(coachSettingsDisplayState, coachSettingsCoachingModeState, coachSettingsConciseState, new CoachSettingsRecommendedActivitiesState(c8688bM21277k, textResourceM21278l, recommendedActivitiesMode, z4, settingKey));
    }

    private final SettingItem settingItemMapper(CoachSettingItem coachSettingItem) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(coachSettingItem.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(coachSettingItem.getBody());
        String tag = coachSettingItem.getTag();
        return new SettingItem(textResourceM21278l, tag != null ? AbstractC8693b.m21278l(tag) : null, textResourceM21278l2, !coachSettingItem.getDisabled(), coachSettingItem.getActive(), coachSettingItem.getSettingKey());
    }

    public final CoachSettingsViewState reduce(CoachSettingsDomainState state) {
        AbstractC22676k.m65750j(state, "state");
        if (state instanceof CoachSettingsDomainState.Success) {
            return reduceSuccess(((CoachSettingsDomainState.Success) state).getResponse());
        }
        if (state.equals(CoachSettingsDomainState.Error.INSTANCE)) {
            return CoachSettingsViewState.Error.INSTANCE;
        }
        if (state.equals(CoachSettingsDomainState.Loading.INSTANCE)) {
            return CoachSettingsViewState.Loading.INSTANCE;
        }
        if (state.equals(CoachSettingsDomainState.Saved.INSTANCE)) {
            return CoachSettingsViewState.Saved.INSTANCE;
        }
        if (state.equals(CoachSettingsDomainState.Saving.INSTANCE)) {
            return CoachSettingsViewState.Saving.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
