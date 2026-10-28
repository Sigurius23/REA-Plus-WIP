package lj1;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

/* JADX INFO: renamed from: lj1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C24473a implements TemporalQuery {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95459a;

    @Override // java.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        switch (this.f95459a) {
            case 0:
                return Instant.from(temporalAccessor);
            case 1:
                return ZoneOffset.from(temporalAccessor);
            default:
                return ZonedDateTime.from(temporalAccessor);
        }
    }
}
