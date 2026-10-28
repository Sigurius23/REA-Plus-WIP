package tr1;

import or2.C28205u0;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: tr1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "timeString", "", "a", "(Ljava/lang/String;)Ljava/lang/Long;", "journal_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34100d {
    /* JADX INFO: renamed from: a */
    public static final Long m107799a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return Long.valueOf(C28205u0.INSTANCE.m85384a().parseDateTime(str).toDateTime().getMillis());
    }
}
