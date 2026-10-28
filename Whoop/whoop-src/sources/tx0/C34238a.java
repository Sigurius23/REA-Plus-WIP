package tx0;

import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import aws.smithy.kotlin.runtime.time.ParseException;
import c93.InterfaceC4351m;
import com.stripe.android.core.model.Country;
import com.whoop.advancedlabs.rafReceiver.view.RafReceiverFragment;
import com.whoop.advancedlabs.testresults.view.TestResultsFragment;
import com.whoop.advancedlabsjoin.feature.join.view.AdvancedLabsJoinFragment;
import com.whoop.archv2.feature.domain.C6010p;
import com.whoop.archv2.feature.view.GenericFragment;
import com.whoop.debug.lottietester.LottieTesterFragment;
import com.whoop.debug.share.ShareDebugFragment;
import com.whoop.debug.whoopble.WhoopBleDebugFragment;
import com.whoop.hormonalinsights.menstrualcycleinsights.view.LogCalendarFragment;
import com.whoop.hormonalinsights.menstrualcycleinsights.view.MciCyclesFragment;
import com.whoop.hormonalinsights.menstrualcycleinsights.view.MciOverviewFragment;
import com.whoop.hormonalinsights.menstrualcycleinsights.view.PhaseCoachingFragment;
import com.whoop.membership.dunning.DunningBottomSheetFragment;
import com.whoop.nativestore.home.view.NativeStoreFragment;
import com.whoop.settings.journalv2.JournalSettingsFragmentV2;
import com.whoop.sleep.coach.alarmWarning.view.TurnoffAlarmWarningFragment;
import com.whoop.weeklyplan.challengelanding.view.ChallengeLandingFragment;
import java.text.Collator;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p133f1.AbstractC13929c1;
import p133f1.C13977s1;
import p133f1.InterfaceC13922a1;
import p181h2.C16617b;
import p335n6.InterfaceC26398o;
import p390p1.AbstractC28683x;
import p460rg.AbstractC31366a;
import p477s2.AbstractC32076h;
import p510u0.AbstractC34339n0;
import p510u0.C34352r1;
import p510u0.InterfaceC34310d1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p739ui0.AbstractC35012n;
import td2.C33711b;
import tz0.AbstractC34277b;
import tz0.C34278c;
import ud2.AbstractC34793b;
import ug.C34917f;
import uq2.AbstractC35170g;
import uq2.AbstractC35171h;
import uq2.C35165b;
import uq2.C35167d;
import v20.C35578r;
import vq2.AbstractC36290g;
import vq2.C36286c;

/* JADX INFO: renamed from: tx0.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C34238a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143619w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f143620x;

    public /* synthetic */ C34238a(Object obj, int i13) {
        this.f143619w = i13;
        this.f143620x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x017a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x017b  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C34917f c34917f;
        switch (this.f143619w) {
            case 0:
                return LottieTesterFragment.m20080B((LottieTesterFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC34277b.m108545h((C34278c) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                Long l7 = (Long) obj2;
                if (AbstractC13929c1.m39697a((InterfaceC13922a1) this.f143620x, l7.longValue())) {
                    return l7;
                }
                return null;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC34339n0.m108629g((C13977s1) this.f143620x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 4:
                ((InterfaceC34310d1) this.f143620x).mo35185d(((C16617b) obj2).f63937a);
                return C23454a0.f92919a;
            case 5:
                ((Integer) obj2).getClass();
                ((C34352r1) this.f143620x).m108657a((Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 6:
                return JournalSettingsFragmentV2.m25428P((JournalSettingsFragmentV2) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 7:
                return RafReceiverFragment.m17510H((RafReceiverFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 8:
                return AbstractC34793b.m109805d((C33711b) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 9:
                return AdvancedLabsJoinFragment.m17700D((AdvancedLabsJoinFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 10:
                InterfaceC4351m[] interfaceC4351mArr = (InterfaceC4351m[]) this.f143620x;
                String str = (String) obj;
                Integer num = (Integer) obj2;
                int iIntValue = num.intValue();
                AbstractC22676k.m65750j(str, "str");
                for (InterfaceC4351m interfaceC4351m : interfaceC4351mArr) {
                    try {
                        c34917f = (C34917f) interfaceC4351m.invoke(str, num);
                        if (c34917f != null) {
                            return c34917f;
                        }
                        throw new ParseException(str, "no alternatives matched", iIntValue);
                    } catch (ParseException unused) {
                    }
                }
                c34917f = null;
                if (c34917f != null) {
                    return c34917f;
                }
                throw new ParseException(str, "no alternatives matched", iIntValue);
            case 11:
                return GenericFragment.m18065P((GenericFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 12:
                return AbstractC35012n.m110569E((InterfaceC23462h) this.f143620x, (C6010p) obj, (String) obj2);
            case 13:
                return AbstractC35170g.m111296g((C35165b) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 14:
                return AbstractC35171h.m111308d((C35167d) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 15:
                return ShareDebugFragment.m20088B((ShareDebugFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 16:
                return NativeStoreFragment.m22941M((NativeStoreFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                AbstractC31366a.m96462b((C35578r) this.f143620x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                AbstractC32076h.m99771d((InterfaceC26398o) this.f143620x, (Composer) obj, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return TestResultsFragment.m17620M((TestResultsFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 20:
                return TurnoffAlarmWarningFragment.m25918G((TurnoffAlarmWarningFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 21:
                return LogCalendarFragment.m21992K((LogCalendarFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return MciCyclesFragment.m22003E((MciCyclesFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return MciOverviewFragment.m22021L((MciOverviewFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 24:
                return PhaseCoachingFragment.m22037K((PhaseCoachingFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 25:
                return AbstractC36290g.m116018d((C36286c) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 26:
                return ChallengeLandingFragment.m27852J((ChallengeLandingFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 27:
                return DunningBottomSheetFragment.m22626M((DunningBottomSheetFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            case 28:
                return WhoopBleDebugFragment.m20094B((WhoopBleDebugFragment) this.f143620x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return Integer.valueOf(((Collator) this.f143620x).compare(((Country) obj).getName(), ((Country) obj2).getName()));
        }
    }

    public /* synthetic */ C34238a(Object obj, int i13, int i14) {
        this.f143619w = i14;
        this.f143620x = obj;
    }
}
