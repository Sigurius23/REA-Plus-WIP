package y21;

import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import org.joda.time.DateTimeConstants;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y21.l */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Ly21/l;", "", "<init>", "()V", "", "", "", "values", "b", "(Ljava/util/Map;)I", "totalSeconds", "a", "(I)Ljava/util/Map;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39165l {

    /* JADX INFO: renamed from: a */
    public static final C39165l f168401a = new C39165l();

    private C39165l() {
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, Integer> m124742a(int totalSeconds) {
        return AbstractC25247g0.m73990Y(new C23465k("hours", Integer.valueOf(totalSeconds / DateTimeConstants.SECONDS_PER_HOUR)), new C23465k("minutes", Integer.valueOf((totalSeconds % DateTimeConstants.SECONDS_PER_HOUR) / 60)), new C23465k("seconds", Integer.valueOf(totalSeconds % 60)));
    }

    /* JADX INFO: renamed from: b */
    public final int m124743b(Map<String, Integer> values) {
        AbstractC22676k.m65750j(values, "values");
        Integer num = values.get("hours");
        int iIntValue = (num != null ? num.intValue() : 0) * DateTimeConstants.SECONDS_PER_HOUR;
        Integer num2 = values.get("minutes");
        int iIntValue2 = ((num2 != null ? num2.intValue() : 0) * 60) + iIntValue;
        Integer num3 = values.get("seconds");
        return iIntValue2 + (num3 != null ? num3.intValue() : 0);
    }
}
