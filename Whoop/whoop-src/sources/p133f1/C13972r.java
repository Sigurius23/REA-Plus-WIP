package p133f1;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import p088dc.AbstractC11895b;
import p294l3.C23277r0;

/* JADX INFO: renamed from: f1.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C13972r {

    /* JADX INFO: renamed from: a */
    public final long f49815a;

    /* JADX INFO: renamed from: b */
    public final int f49816b;

    /* JADX INFO: renamed from: c */
    public final int f49817c;

    /* JADX INFO: renamed from: d */
    public final int f49818d;

    /* JADX INFO: renamed from: e */
    public final int f49819e;

    /* JADX INFO: renamed from: f */
    public final C23277r0 f49820f;

    public C13972r(long j7, int i13, int i14, int i15, int i16, C23277r0 c23277r0) {
        this.f49815a = j7;
        this.f49816b = i13;
        this.f49817c = i14;
        this.f49818d = i15;
        this.f49819e = i16;
        this.f49820f = c23277r0;
    }

    /* JADX INFO: renamed from: a */
    public final C13978t m39768a(int i13) {
        return new C13978t(AbstractC13994y0.m39833v(this.f49820f, i13), i13, this.f49815a);
    }

    /* JADX INFO: renamed from: b */
    public final EnumC13939g m39769b() {
        int i13 = this.f49817c;
        int i14 = this.f49818d;
        if (i13 < i14) {
            return EnumC13939g.f49691x;
        }
        return i13 > i14 ? EnumC13939g.f49690w : EnumC13939g.f49692y;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("SelectionInfo(id=");
        sb4.append(this.f49815a);
        sb4.append(", range=(");
        int i13 = this.f49817c;
        sb4.append(i13);
        sb4.append('-');
        C23277r0 c23277r0 = this.f49820f;
        sb4.append(AbstractC13994y0.m39833v(c23277r0, i13));
        sb4.append(DateTimeRange.lowerUpperDelimiter);
        int i14 = this.f49818d;
        sb4.append(i14);
        sb4.append('-');
        sb4.append(AbstractC13994y0.m39833v(c23277r0, i14));
        sb4.append("), prevOffset=");
        return AbstractC11895b.m31999r(sb4, this.f49819e, ')');
    }
}
