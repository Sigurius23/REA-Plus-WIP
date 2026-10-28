package jc0;

import com.whoop.advancedlabs.feature.hormonalcontext.domain.models.HormonalContextScreenId;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: jc0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "Lcom/whoop/advancedlabs/feature/hormonalcontext/domain/models/HormonalContextScreenId;", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21603c {

    /* JADX INFO: renamed from: jc0.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f82900a;

        static {
            int[] iArr = new int[HormonalContextScreenId.values().length];
            try {
                iArr[HormonalContextScreenId.LIFE_STAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HormonalContextScreenId.CONTRACEPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HormonalContextScreenId.TEST_PERIOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HormonalContextScreenId.LAST_PERIOD_DATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HormonalContextScreenId.CALCULATED_CYCLE_PHASE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HormonalContextScreenId.CHANGE_CYCLE_PHASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HormonalContextScreenId.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f82900a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final String m60735b(List<? extends HormonalContextScreenId> list) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            switch (a.f82900a[((HormonalContextScreenId) it.next()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    str = "hormonal";
                    break;
                case 5:
                case 6:
                    str = SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE;
                    break;
                case 7:
                    str = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return AbstractC25265s.m74110N0(AbstractC25265s.m74103I1(arrayList), ",", null, null, null, 62);
    }
}
