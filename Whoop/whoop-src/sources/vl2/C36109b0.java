package vl2;

import com.mapbox.common.HttpHeaders;
import java.time.LocalDateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: vl2.b0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lvl2/b0;", "", "", "vo2Max", "", "source", "Ljava/time/LocalDateTime;", HttpHeaders.DATE, "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/LocalDateTime;)V", "a", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/time/LocalDateTime;)Lvl2/b0;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "d", "c", "Ljava/time/LocalDateTime;", "()Ljava/time/LocalDateTime;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C36109b0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Integer vo2Max;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LocalDateTime date;

    public C36109b0(Integer num, String str, LocalDateTime localDateTime) {
        this.vo2Max = num;
        this.source = str;
        this.date = localDateTime;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C36109b0 m114756b(C36109b0 c36109b0, Integer num, String str, LocalDateTime localDateTime, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = c36109b0.vo2Max;
        }
        if ((i13 & 2) != 0) {
            str = c36109b0.source;
        }
        if ((i13 & 4) != 0) {
            localDateTime = c36109b0.date;
        }
        return c36109b0.m114757a(num, str, localDateTime);
    }

    /* JADX INFO: renamed from: a */
    public final C36109b0 m114757a(Integer vo2Max, String source, LocalDateTime date) {
        return new C36109b0(vo2Max, source, date);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getVo2Max() {
        return this.vo2Max;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C36109b0)) {
            return false;
        }
        C36109b0 c36109b0 = (C36109b0) other;
        return AbstractC22676k.m65745e(this.vo2Max, c36109b0.vo2Max) && AbstractC22676k.m65745e(this.source, c36109b0.source) && AbstractC22676k.m65745e(this.date, c36109b0.date);
    }

    public int hashCode() {
        Integer num = this.vo2Max;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.source;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDateTime localDateTime = this.date;
        return iHashCode2 + (localDateTime != null ? localDateTime.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.vo2Max;
        String str = this.source;
        LocalDateTime localDateTime = this.date;
        StringBuilder sbM95643s = AbstractC31061c.m95643s("Vo2MenuSheetUpdatedData(vo2Max=", ", source=", num, str, ", date=");
        sbM95643s.append(localDateTime);
        sbM95643s.append(")");
        return sbM95643s.toString();
    }

    public /* synthetic */ C36109b0(Integer num, String str, LocalDateTime localDateTime, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : localDateTime);
    }
}
