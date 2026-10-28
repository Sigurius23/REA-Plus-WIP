package zu2;

import p715kotlin.Metadata;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: zu2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"", "Lzu2/f;", "b", "(Ljava/lang/String;)Lzu2/f;", "workoutNameValidity", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC41158e {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final EnumC41159f m133712b(String str) {
        if (str.length() > 30) {
            return EnumC41159f.TooLong;
        }
        return AbstractC39414r.m125890i0(str) ? EnumC41159f.Blank : EnumC41159f.Valid;
    }
}
