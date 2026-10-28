package xt2;

import au2.C2079d;
import au2.C2080e;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.data.remote.domain.dto.CircularProgressStyle;
import com.whoop.data.remote.domain.response.journal.CircularProgressIndicator;
import com.whoop.data.remote.domain.response.journal.CurrentProgressPercentage;
import com.whoop.data.remote.domain.response.journal.CurrentProgressSteps;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.weeklyplan.domain.models.ButtonInfo;
import com.whoop.weeklyplan.weeklyplan.domain.models.ChallengeProgressBar;
import com.whoop.weeklyplan.weeklyplan.domain.models.NewSummary;
import com.whoop.weeklyplan.weeklyplan.domain.models.NewSummaryItem;
import com.whoop.weeklyplan.weeklyplan.domain.models.ProgressBarModel;
import gz0.EnumC16313m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import m83.AbstractC25267u;
import p000.C12476e0;
import p01.C28582b;
import p01.EnumC28588h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import tt2.AbstractC34167e;
import wt2.AbstractC37630k;
import wt2.C37620a;
import wt2.C37622c;
import wt2.C37627h;
import wt2.EnumC37632m;

/* JADX INFO: renamed from: xt2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lxt2/a;", "", "<init>", "()V", "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;", "item", "", "isCompleted", "Lau2/e;", "c", "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;Z)Lau2/e;", "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;", "circularProgressIndicator", "Lp01/b;", "b", "(Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)Lp01/b;", "Ltt2/e;", "domainResult", "Lwt2/k;", "a", "(Ltt2/e;)Lwt2/k;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38647a {
    /* JADX INFO: renamed from: b */
    private final C28582b m123870b(CircularProgressIndicator circularProgressIndicator) {
        String textDisplay;
        CurrentProgressSteps currentProgressSteps = circularProgressIndicator.getCurrentProgressSteps();
        int totalSteps = currentProgressSteps != null ? currentProgressSteps.getTotalSteps() : 0;
        CurrentProgressSteps currentProgressSteps2 = circularProgressIndicator.getCurrentProgressSteps();
        int currentStep = currentProgressSteps2 != null ? currentProgressSteps2.getCurrentStep() : 0;
        CurrentProgressPercentage currentProgressPercentage = circularProgressIndicator.getCurrentProgressPercentage();
        float percentage = (currentProgressPercentage != null ? (float) currentProgressPercentage.getPercentage() : 0.0f) / 100.0f;
        CurrentProgressSteps currentProgressSteps3 = circularProgressIndicator.getCurrentProgressSteps();
        if (currentProgressSteps3 == null || (textDisplay = currentProgressSteps3.getTextDisplay()) == null) {
            CurrentProgressPercentage currentProgressPercentage2 = circularProgressIndicator.getCurrentProgressPercentage();
            textDisplay = currentProgressPercentage2 != null ? currentProgressPercentage2.getTextDisplay() : null;
        }
        return new C28582b(totalSteps, currentStep, percentage, textDisplay, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, circularProgressIndicator.getCurrentProgressPercentage() != null ? EnumC28588h.PERCENTAGE : EnumC28588h.STEPS, null, 786416, null);
    }

    /* JADX INFO: renamed from: c */
    private final C2080e m123871c(NewSummaryItem item, boolean isCompleted) {
        return new C2080e(AbstractC8693b.m21278l(item.getTitle()), isCompleted ? EnumC39333f.ACCENT_ACTION : EnumC39333f.BRAND_WHITE, m123870b(item.getCircularProgressIndicator()));
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC37630k m123872a(AbstractC34167e domainResult) {
        EnumC37632m enumC37632m;
        C2079d c2079d;
        C12476e0 c12476e0;
        C37620a c37620a;
        C37620a c37620a2;
        String overrideImage;
        ChallengeProgressBar challengeProgressBar;
        ProgressBarModel progressBar;
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC34167e.a) {
            return new AbstractC37630k.a(((AbstractC34167e.a) domainResult).getPlanId());
        }
        if (domainResult.equals(AbstractC34167e.b.f143255a)) {
            return AbstractC37630k.b.f161052a;
        }
        if (!(domainResult instanceof AbstractC34167e.c)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC34167e.c cVar = (AbstractC34167e.c) domainResult;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(cVar.getResult().getTitleDisplay());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(cVar.getResult().getSubtitleDisplay());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(cVar.getResult().getHeaderDisplay().getDisplay());
        String strName = cVar.getResult().getHeaderDisplay().getStyle().name();
        EnumC37632m enumC37632m2 = EnumC37632m.NONE;
        EnumC37632m[] enumC37632mArrValues = EnumC37632m.values();
        int length = enumC37632mArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC37632m = null;
                break;
            }
            enumC37632m = enumC37632mArrValues[i13];
            if (AbstractC22676k.m65745e(enumC37632m.name(), strName)) {
                break;
            }
            i13++;
        }
        if (enumC37632m != null) {
            enumC37632m2 = enumC37632m;
        }
        C37627h c37627h = new C37627h(textResourceM21278l3, enumC37632m2);
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(cVar.getResult().getDescriptionDisplay());
        NewSummary summaryV2 = cVar.getResult().getSummaryV2();
        if (summaryV2 != null) {
            List<NewSummaryItem> items = summaryV2.getItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : items) {
                NewSummaryItem newSummaryItem = (NewSummaryItem) obj;
                CurrentProgressSteps currentProgressSteps = newSummaryItem.getCircularProgressIndicator().getCurrentProgressSteps();
                CircularProgressStyle style = currentProgressSteps != null ? currentProgressSteps.getStyle() : null;
                CircularProgressStyle circularProgressStyle = CircularProgressStyle.WEEKLY_PLAN_IN_PROGRESS;
                if (style != circularProgressStyle) {
                    CurrentProgressPercentage currentProgressPercentage = newSummaryItem.getCircularProgressIndicator().getCurrentProgressPercentage();
                    if ((currentProgressPercentage != null ? currentProgressPercentage.getStyle() : null) == circularProgressStyle) {
                    }
                }
                arrayList.add(obj);
            }
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(m123871c((NewSummaryItem) it.next(), false));
            }
            List<NewSummaryItem> items2 = summaryV2.getItems();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : items2) {
                NewSummaryItem newSummaryItem2 = (NewSummaryItem) obj2;
                CurrentProgressSteps currentProgressSteps2 = newSummaryItem2.getCircularProgressIndicator().getCurrentProgressSteps();
                CircularProgressStyle style2 = currentProgressSteps2 != null ? currentProgressSteps2.getStyle() : null;
                CircularProgressStyle circularProgressStyle2 = CircularProgressStyle.WEEKLY_PLAN_COMPLETE;
                if (style2 != circularProgressStyle2) {
                    CurrentProgressPercentage currentProgressPercentage2 = newSummaryItem2.getCircularProgressIndicator().getCurrentProgressPercentage();
                    if ((currentProgressPercentage2 != null ? currentProgressPercentage2.getStyle() : null) == circularProgressStyle2) {
                    }
                }
                arrayList3.add(obj2);
            }
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(m123871c((NewSummaryItem) it3.next(), true));
            }
            c2079d = new C2079d(null, arrayList2, arrayList4);
        } else {
            c2079d = null;
        }
        NewSummary summaryV3 = cVar.getResult().getSummaryV2();
        if (summaryV3 == null || (progressBar = summaryV3.getProgressBar()) == null) {
            c12476e0 = null;
        } else {
            float percentValue = progressBar.getPercentValue();
            String percentSymbol = progressBar.getPercentSymbol();
            if (percentSymbol == null) {
                percentSymbol = "%";
            }
            c12476e0 = new C12476e0(percentValue, progressBar.getPercentSubtitle(), percentSymbol);
        }
        ButtonInfo primaryButton = cVar.getResult().getPrimaryButton();
        if (primaryButton != null) {
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(primaryButton.getTitleDisplay());
            String icon = primaryButton.getIcon();
            c37620a = new C37620a(textResourceM21278l5, icon != null ? EnumC16313m0.valueOf(icon) : null, primaryButton.getDestination(), primaryButton.getEnabled());
        } else {
            c37620a = null;
        }
        ButtonInfo secondaryButton = cVar.getResult().getSecondaryButton();
        if (secondaryButton != null) {
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(secondaryButton.getTitleDisplay());
            String icon2 = cVar.getResult().getSecondaryButton().getIcon();
            c37620a2 = new C37620a(textResourceM21278l6, icon2 != null ? EnumC16313m0.valueOf(icon2) : null, secondaryButton.getDestination(), secondaryButton.getEnabled());
        } else {
            c37620a2 = null;
        }
        NewSummary summaryV4 = cVar.getResult().getSummaryV2();
        C37622c c37622c = (summaryV4 == null || (challengeProgressBar = summaryV4.getChallengeProgressBar()) == null) ? null : new C37622c(AbstractC8693b.m21278l(challengeProgressBar.getTitle()), AbstractC8693b.m21278l(challengeProgressBar.getRightLabel()), challengeProgressBar.getPercentValue());
        NewSummary summaryV5 = cVar.getResult().getSummaryV2();
        AbstractC22403o.c cVar2 = (summaryV5 == null || (overrideImage = summaryV5.getOverrideImage()) == null) ? null : new AbstractC22403o.c(overrideImage, 0, 0, 0, 14, null);
        AiContextMetadata aiContextMetadata = cVar.getAiContextMetadata();
        return new AbstractC37630k.c(textResourceM21278l, textResourceM21278l2, c37627h, textResourceM21278l4, c2079d, c37620a, c37620a2, c12476e0, c37622c, cVar2, aiContextMetadata != null ? AbstractC6219a.m18523a(aiContextMetadata) : null);
    }
}
