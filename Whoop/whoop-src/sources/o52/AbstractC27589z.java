package o52;

import com.whoop.data.remote.domain.dto.CycleMetadataDto;
import com.whoop.data.remote.domain.dto.CycleMetadataResponseDto;
import com.whoop.data.remote.domain.dto.SleepDataDto;
import com.whoop.data.remote.domain.dto.StrainDataDto;
import m02.C24884c;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: o52.z */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;", "currentCycleMetadata", "Lm02/c;", "a", "(Lcom/whoop/data/remote/domain/dto/CycleMetadataResponseDto;)Lm02/c;", "realtime-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27589z {
    /* JADX INFO: renamed from: a */
    public static final C24884c m83343a(CycleMetadataResponseDto cycleMetadataResponseDto) {
        if (cycleMetadataResponseDto == null) {
            return null;
        }
        CycleMetadataDto cycleMetadata = cycleMetadataResponseDto.getCycleMetadata();
        long cycleId = cycleMetadata.getCycleId();
        StrainDataDto strain = cycleMetadata.getStrain();
        Double dValueOf = strain != null ? Double.valueOf(strain.getScaledStrain()) : null;
        SleepDataDto sleep = cycleMetadata.getSleep();
        return new C24884c(cycleId, "", "", dValueOf, sleep != null ? sleep.getRecoveryScore() : 0, 0L, false, 0);
    }
}
