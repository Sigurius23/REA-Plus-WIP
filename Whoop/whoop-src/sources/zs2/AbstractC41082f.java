package zs2;

import androidx.core.app.NotificationCompat;
import bu2.C3643d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContent;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.UUID;
import ks2.AbstractC22822a;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import ot2.AbstractC28353v;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import ws2.C37615g;
import ys2.AbstractC39758e;
import ys2.C39755b;
import ys2.C39759f;

/* JADX INFO: renamed from: zs2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lzs2/f;", "Lzs2/p;", "Lzs2/g;", "rangeContentReducer", "Lzs2/h;", "recommendedRangeMapper", "<init>", "(Lzs2/g;Lzs2/h;)V", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "model", "", "saveValue", "Lbu2/d;", "f", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;D)Lbu2/d;", "value", "Ll83/k;", "Lcom/whoop/design/util/TextResource;", "g", "(D)Ll83/k;", "Ljava/util/UUID;", "planId", "Lws2/g;", NotificationCompat.CATEGORY_PROGRESS, "", "showLoading", "Lys2/e;", "i", "(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lws2/g;Z)Lys2/e;", "Ly81/f;", "j", "()Ly81/f;", "k", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;D)Ll83/k;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41082f extends AbstractC41092p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC41082f(C41083g rangeContentReducer, C41084h recommendedRangeMapper) {
        super(rangeContentReducer, recommendedRangeMapper);
        AbstractC22676k.m65750j(rangeContentReducer, "rangeContentReducer");
        AbstractC22676k.m65750j(recommendedRangeMapper, "recommendedRangeMapper");
    }

    /* JADX INFO: renamed from: f */
    private final C3643d m133390f(WeeklyPlanCustomizationScreenModel model, double saveValue) {
        C23465k c23465kMo133394k = mo133394k(model, saveValue);
        return m133418a(model, saveValue, (TextResource) c23465kMo133394k.f92937w, (TextResource) c23465kMo133394k.f92938x, mo133393j());
    }

    /* JADX INFO: renamed from: g */
    private final C23465k m133391g(double value) {
        return value >= 60.0d ? new C23465k(AbstractC8693b.m21278l(AbstractC28353v.m86025b(String.valueOf(value), mo133389h())), AbstractC8693b.m21277k(AbstractC22822a.f89940l)) : new C23465k(AbstractC8693b.m21278l(String.valueOf((int) value)), AbstractC8693b.m21277k(AbstractC22822a.f89941m));
    }

    /* JADX INFO: renamed from: h */
    public abstract TargetGoalType mo133389h();

    /* JADX INFO: renamed from: i */
    public final AbstractC39758e m133392i(UUID planId, WeeklyPlanCustomizationScreenModel model, C37615g progress, boolean showLoading) {
        AbstractC22676k.m65750j(planId, "planId");
        AbstractC22676k.m65750j(model, "model");
        AbstractC22676k.m65750j(progress, "progress");
        C39759f c39759fM133421d = m133421d(model);
        SliderContent slider = model.getSlider();
        double dM133419b = m133419b(model, slider != null ? (float) slider.getValue() : 0.0f);
        C3643d c3643dM133390f = m133390f(model, dM133419b);
        C39755b c39755bM133420c = m133420c(model, showLoading);
        String string = planId.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return new AbstractC39758e.k(string, mo133389h(), c39759fM133421d, c3643dM133390f, c39755bM133420c, dM133419b, progress);
    }

    /* JADX INFO: renamed from: j */
    public EnumC39333f mo133393j() {
        return mo133389h() == TargetGoalType.HR_ZONES_ONE_TO_THREE ? EnumC39333f.STRAIN_ZONE_2 : EnumC39333f.STRAIN_ZONE_4;
    }

    /* JADX INFO: renamed from: k */
    public C23465k mo133394k(WeeklyPlanCustomizationScreenModel model, double saveValue) {
        AbstractC22676k.m65750j(model, "model");
        return m133391g(saveValue);
    }
}
