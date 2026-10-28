package c43;

import io.getstream.android.video.generated.models.QueryCallsResponse;
import java.util.ArrayList;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c43.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C4197m {

    /* JADX INFO: renamed from: a */
    public final ArrayList f17049a;

    /* JADX INFO: renamed from: b */
    public final QueryCallsResponse f17050b;

    /* JADX INFO: renamed from: c */
    public final String f17051c;

    /* JADX INFO: renamed from: d */
    public final String f17052d;

    public C4197m(ArrayList arrayList, QueryCallsResponse original, String str, String str2) {
        AbstractC22676k.m65750j(original, "original");
        this.f17049a = arrayList;
        this.f17050b = original;
        this.f17051c = str;
        this.f17052d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4197m)) {
            return false;
        }
        C4197m c4197m = (C4197m) obj;
        return this.f17049a.equals(c4197m.f17049a) && AbstractC22676k.m65745e(this.f17050b, c4197m.f17050b) && AbstractC22676k.m65745e(this.f17051c, c4197m.f17051c) && AbstractC22676k.m65745e(this.f17052d, c4197m.f17052d);
    }

    public final int hashCode() {
        int iHashCode = (this.f17050b.hashCode() + (this.f17049a.hashCode() * 31)) * 31;
        String str = this.f17051c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17052d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("QueriedCalls(calls=");
        sb4.append(this.f17049a);
        sb4.append(", original=");
        sb4.append(this.f17050b);
        sb4.append(", next=");
        return AbstractC11266d.m30464r(sb4, this.f17051c, ", prev=", this.f17052d, ")");
    }
}
