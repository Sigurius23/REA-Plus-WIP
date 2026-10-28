package zs2;

import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import live.hms.video.media.tracks.HMSTrackSource;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: zs2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lzs2/d;", "Lzs2/f;", "Lzs2/g;", "rangeContentReducer", "Lzs2/h;", "recommendedRangeMapper", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", HMSTrackSource.SCREEN, "<init>", "(Lzs2/g;Lzs2/h;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V", "c", "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41080d extends AbstractC41082f {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TargetGoalType screen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41080d(C41083g rangeContentReducer, C41084h recommendedRangeMapper, TargetGoalType screen) {
        super(rangeContentReducer, recommendedRangeMapper);
        AbstractC22676k.m65750j(rangeContentReducer, "rangeContentReducer");
        AbstractC22676k.m65750j(recommendedRangeMapper, "recommendedRangeMapper");
        AbstractC22676k.m65750j(screen, "screen");
        this.screen = screen;
    }

    @Override // zs2.AbstractC41082f
    /* JADX INFO: renamed from: h, reason: from getter */
    public TargetGoalType getScreen() {
        return this.screen;
    }

    public /* synthetic */ C41080d(C41083g c41083g, C41084h c41084h, TargetGoalType targetGoalType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c41083g, c41084h, (i13 & 4) != 0 ? TargetGoalType.HR_ZONES_FOUR_TO_FIVE : targetGoalType);
    }
}
