package zo1;

import com.whoop.hormonalinsights.onboarding.domain.models.ContraceptionType;
import com.whoop.hormonalinsights.onboarding.domain.models.MciDateInputScreen;
import com.whoop.hormonalinsights.onboarding.domain.models.MciInterest;
import com.whoop.hormonalinsights.onboarding.domain.models.MciOnboardingRequest;
import com.whoop.hormonalinsights.onboarding.domain.models.MciOnboardingResponse;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreen;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenContent;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zo1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lzo1/e;", "", "<init>", "()V", "Lzo1/b;", "saveRequest", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;", "a", "(Lzo1/b;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingRequest;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;", "mciOnboardingResponse", "", "", "b", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciOnboardingResponse;)Ljava/util/List;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40928e {
    /* JADX INFO: renamed from: a */
    public final MciOnboardingRequest m132786a(C40925b saveRequest) {
        MciInterest mciInterest;
        String strName;
        String strName2;
        AbstractC22676k.m65750j(saveRequest, "saveRequest");
        Integer cycleLength = saveRequest.getCycleLength();
        List<String> listM132742g = saveRequest.m132742g();
        C25271y c25271y = C25271y.f99162w;
        List<String> list = listM132742g == null ? c25271y : listM132742g;
        List<String> listM132743h = saveRequest.m132743h();
        List<String> list2 = listM132743h == null ? c25271y : listM132743h;
        MciInterest interest = saveRequest.getInterest();
        ContraceptionType contraceptionType = null;
        if (interest == null || (strName2 = interest.name()) == null) {
            mciInterest = null;
            break;
        }
        MciInterest[] mciInterestArrValues = MciInterest.values();
        int length = mciInterestArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                mciInterest = null;
                break;
            }
            mciInterest = mciInterestArrValues[i13];
            if (AbstractC22676k.m65745e(mciInterest.name(), strName2)) {
                break;
            }
            i13++;
        }
        ContraceptionType contraceptionType2 = saveRequest.getContraceptionType();
        if (contraceptionType2 != null && (strName = contraceptionType2.name()) != null) {
            for (ContraceptionType contraceptionType3 : ContraceptionType.values()) {
                if (AbstractC22676k.m65745e(contraceptionType3.name(), strName)) {
                    contraceptionType = contraceptionType3;
                    break;
                }
            }
        }
        List<String> listM132744i = saveRequest.m132744i();
        List<String> list3 = listM132744i == null ? c25271y : listM132744i;
        List<String> listM132740e = saveRequest.m132740e();
        return new MciOnboardingRequest(mciInterest, contraceptionType, cycleLength, list, list2, list3, listM132740e == null ? c25271y : listM132740e);
    }

    /* JADX INFO: renamed from: b */
    public final List<String> m132787b(MciOnboardingResponse mciOnboardingResponse) {
        Object next;
        List<String> selectedDays;
        if (mciOnboardingResponse == null) {
            return null;
        }
        Iterator<T> it = mciOnboardingResponse.getScreens().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((HormonalScreen) next).getId() != HormonalScreenId.MENSTRUAL_CYCLE_LAST_PERIOD);
        HormonalScreen hormonalScreen = (HormonalScreen) next;
        if (hormonalScreen == null) {
            return null;
        }
        HormonalScreenContent content = hormonalScreen.getContent();
        if (!(content instanceof MciDateInputScreen) || (selectedDays = ((MciDateInputScreen) content).getSelectedDays()) == null) {
            return null;
        }
        return AbstractC25265s.m74159y0(selectedDays);
    }
}
