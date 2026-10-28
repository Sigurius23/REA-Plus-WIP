package zs2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.SliderContent;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import com.whoop.weeklyplan.customizeplan.domain.api.WeeklyPlanCustomizationScreenModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import ot2.AbstractC28353v;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: zs2.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lzs2/o;", "Lzs2/f;", "Lzs2/g;", "rangeContentReducer", "Lzs2/h;", "recommendedRangeMapper", "<init>", "(Lzs2/g;Lzs2/h;)V", "Ly81/f;", "j", "()Ly81/f;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;", "model", "", "saveValue", "Ll83/k;", "Lcom/whoop/design/util/TextResource;", "k", "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;D)Ll83/k;", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "c", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41091o extends AbstractC41082f {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TargetGoalType screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41091o(C41083g rangeContentReducer, C41084h recommendedRangeMapper) {
        super(rangeContentReducer, recommendedRangeMapper);
        AbstractC22676k.m65750j(rangeContentReducer, "rangeContentReducer");
        AbstractC22676k.m65750j(recommendedRangeMapper, "recommendedRangeMapper");
        this.screen = TargetGoalType.STRENGTH_TRAINING_TIME;
    }

    @Override // zs2.AbstractC41082f
    /* JADX INFO: renamed from: h, reason: from getter */
    public TargetGoalType getScreen() {
        return this.screen;
    }

    @Override // zs2.AbstractC41082f
    /* JADX INFO: renamed from: j */
    public EnumC39333f mo133393j() {
        return EnumC39333f.STRAIN;
    }

    @Override // zs2.AbstractC41082f
    /* JADX INFO: renamed from: k */
    public C23465k mo133394k(WeeklyPlanCustomizationScreenModel model, double saveValue) {
        String valueUnits;
        AbstractC22676k.m65750j(model, "model");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC28353v.m86025b(String.valueOf(saveValue), getScreen()));
        SliderContent slider = model.getSlider();
        return new C23465k(textResourceM21278l, (slider == null || (valueUnits = slider.getValueUnits()) == null) ? null : AbstractC8693b.m21278l(valueUnits));
    }
}
