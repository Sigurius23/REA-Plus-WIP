package o52;

import com.whoop.data.remote.domain.dto.CycleMetadataResponseDto;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p92.C29021j;

/* JADX INFO: renamed from: o52.t0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lo52/t0;", "", "Lp92/j;", "strainRecoveryMapper", "Lo52/v0;", "strainCoachStates", "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "cycleMetadata", "<init>", "(Lp92/j;Lo52/v0;Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp92/j;", "c", "()Lp92/j;", "b", "Lo52/v0;", "()Lo52/v0;", "Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "()Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "realtime-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C27580t0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29021j strainRecoveryMapper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC27584v0 strainCoachStates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final CycleMetadataResponseDto cycleMetadata;

    public C27580t0(C29021j c29021j, EnumC27584v0 strainCoachStates, CycleMetadataResponseDto cycleMetadataResponseDto) {
        AbstractC22676k.m65750j(strainCoachStates, "strainCoachStates");
        this.strainRecoveryMapper = c29021j;
        this.strainCoachStates = strainCoachStates;
        this.cycleMetadata = cycleMetadataResponseDto;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final CycleMetadataResponseDto getCycleMetadata() {
        return this.cycleMetadata;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC27584v0 getStrainCoachStates() {
        return this.strainCoachStates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C29021j getStrainRecoveryMapper() {
        return this.strainRecoveryMapper;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C27580t0)) {
            return false;
        }
        C27580t0 c27580t0 = (C27580t0) other;
        return AbstractC22676k.m65745e(this.strainRecoveryMapper, c27580t0.strainRecoveryMapper) && this.strainCoachStates == c27580t0.strainCoachStates && AbstractC22676k.m65745e(this.cycleMetadata, c27580t0.cycleMetadata);
    }

    public int hashCode() {
        C29021j c29021j = this.strainRecoveryMapper;
        int iHashCode = (this.strainCoachStates.hashCode() + ((c29021j == null ? 0 : c29021j.hashCode()) * 31)) * 31;
        CycleMetadataResponseDto cycleMetadataResponseDto = this.cycleMetadata;
        return iHashCode + (cycleMetadataResponseDto != null ? cycleMetadataResponseDto.hashCode() : 0);
    }

    public String toString() {
        return "StartActivityViewModelEvent(strainRecoveryMapper=" + this.strainRecoveryMapper + ", strainCoachStates=" + this.strainCoachStates + ", cycleMetadata=" + this.cycleMetadata + ")";
    }

    public /* synthetic */ C27580t0(C29021j c29021j, EnumC27584v0 enumC27584v0, CycleMetadataResponseDto cycleMetadataResponseDto, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c29021j, enumC27584v0, (i13 & 4) != 0 ? null : cycleMetadataResponseDto);
    }
}
