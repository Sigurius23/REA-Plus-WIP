package it2;

import ad3.AbstractC0757c;
import ad3.C0764g;
import ad3.C0775r;
import android.os.Bundle;
import com.mapbox.common.HttpHeaders;
import com.whoop.navigation.ActivityGoalModel;
import com.whoop.navigation.BehaviorGoalModel;
import com.whoop.navigation.InitialSelectionModel;
import com.whoop.navigation.TargetGoalModel;
import com.whoop.weeklyplan.hubandspoke.domain.api.Activity;
import com.whoop.weeklyplan.hubandspoke.domain.api.Behavior;
import com.whoop.weeklyplan.hubandspoke.domain.api.Goal;
import com.whoop.weeklyplan.hubandspoke.domain.api.InitialSelection;
import io2.C20756e;
import j02.AbstractC21168t;
import j02.EnumC21172v;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: it2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Landroid/os/Bundle;", "Lit2/a;", "b", "(Landroid/os/Bundle;)Lit2/a;", "Lcom/whoop/navigation/InitialSelectionModel;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "e", "(Lcom/whoop/navigation/InitialSelectionModel;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;", "", "initialSelectionJson", "c", "(Ljava/lang/String;)Lcom/whoop/navigation/InitialSelectionModel;", "f", "(Ljava/lang/String;)Ljava/lang/String;", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20932b {
    /* JADX INFO: renamed from: b */
    public static final C20931a m58112b(Bundle bundle) {
        String string = bundle != null ? bundle.getString("initialSelection") : null;
        String string2 = bundle != null ? bundle.getString("source") : null;
        String string3 = bundle != null ? bundle.getString("presetPlanCategory") : null;
        String strM58116f = m58116f(bundle != null ? bundle.getString("planTitle") : null);
        String strM58116f2 = m58116f(bundle != null ? bundle.getString("description") : null);
        String strM58116f3 = m58116f(bundle != null ? bundle.getString("explanationTitle") : null);
        String strM58116f4 = m58116f(bundle != null ? bundle.getString("explanation") : null);
        String string4 = bundle != null ? bundle.getString("templateId") : null;
        String string5 = bundle != null ? bundle.getString("category") : null;
        String string6 = bundle != null ? bundle.getString("carouselPlacement") : null;
        EnumC21172v enumC21172vM59412a = AbstractC21168t.m59412a(bundle != null ? bundle.getString("dismissalType") : null);
        String string7 = bundle != null ? bundle.getString("planName") : null;
        if (string7 == null) {
            string7 = "";
        }
        boolean z4 = bundle != null ? bundle.getBoolean("locked") : false;
        boolean z13 = bundle != null ? bundle.getBoolean("noPlanShowMetricSelection") : false;
        String string8 = bundle != null ? bundle.getString("analyticsSource") : null;
        if (string8 == null) {
            string8 = "";
        }
        InitialSelectionModel initialSelectionModelM58113c = m58113c(string);
        return new C20931a(string7, z4, z13, string8, initialSelectionModelM58113c != null ? m58115e(initialSelectionModelM58113c) : null, bundle != null ? bundle.getString(HttpHeaders.DATE) : null, string2, string3, strM58116f, strM58116f2, strM58116f3, strM58116f4, string4, string5, string6, enumC21172vM59412a);
    }

    /* JADX INFO: renamed from: c */
    public static final InitialSelectionModel m58113c(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        C0775r c0775rM107878b = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C20756e(9));
        try {
            try {
                return (InitialSelectionModel) c0775rM107878b.m1831b(InitialSelectionModel.INSTANCE.serializer(), str);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            byte[] bArrDecode = Base64.getDecoder().decode(str);
            AbstractC22676k.m65749i(bArrDecode, "decode(...)");
            return (InitialSelectionModel) c0775rM107878b.m1831b(InitialSelectionModel.INSTANCE.serializer(), new String(bArrDecode, AbstractC39397a.f169546a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m58114d(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2776c = true;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final InitialSelection m58115e(InitialSelectionModel initialSelectionModel) {
        AbstractC22676k.m65750j(initialSelectionModel, "<this>");
        List<TargetGoalModel> targetGoals = initialSelectionModel.getTargetGoals();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(targetGoals, 10));
        for (TargetGoalModel targetGoalModel : targetGoals) {
            arrayList.add(new Goal(targetGoalModel.getGoalTypeId(), targetGoalModel.getTarget(), targetGoalModel.getType()));
        }
        List<ActivityGoalModel> activityGoals = initialSelectionModel.getActivityGoals();
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(activityGoals, 10));
        for (ActivityGoalModel activityGoalModel : activityGoals) {
            arrayList2.add(new Activity(activityGoalModel.getActivityType(), activityGoalModel.getDays()));
        }
        List<BehaviorGoalModel> behaviorGoals = initialSelectionModel.getBehaviorGoals();
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(behaviorGoals, 10));
        for (BehaviorGoalModel behaviorGoalModel : behaviorGoals) {
            arrayList3.add(new Behavior(behaviorGoalModel.getBehaviorTrackerId(), behaviorGoalModel.getDays(), behaviorGoalModel.getAvoid()));
        }
        return new InitialSelection(arrayList, arrayList2, arrayList3);
    }

    /* JADX INFO: renamed from: f */
    private static final String m58116f(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        try {
            return URLDecoder.decode(AbstractC39421y.m125926K(AbstractC39421y.m125926K(str, "%", "%25", false), "++", "%20%2B", false), "UTF-8");
        } catch (Exception unused) {
            return str;
        }
    }
}
