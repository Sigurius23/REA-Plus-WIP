package io.sentry;

import com.whoop.service.network.model.UserSessionDto;
import io.sentry.protocol.C20501v;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.w6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20621w6 {

    /* JADX INFO: renamed from: a */
    public final C20501v f77165a;

    /* JADX INFO: renamed from: b */
    public final C20353h7 f77166b;

    /* JADX INFO: renamed from: c */
    public final Boolean f77167c;

    static {
        Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    }

    public C20621w6(C20501v c20501v, C20353h7 c20353h7, Boolean bool) {
        this.f77165a = c20501v;
        this.f77166b = c20353h7;
        this.f77167c = bool;
    }

    /* JADX INFO: renamed from: a */
    public final String m56759a() {
        C20353h7 c20353h7 = this.f77166b;
        C20501v c20501v = this.f77165a;
        Boolean bool = this.f77167c;
        if (bool == null) {
            return c20501v + "-" + c20353h7;
        }
        return c20501v + "-" + c20353h7 + "-" + (bool.booleanValue() ? UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE : UserSessionDto.NEEDS_PROFILE_COMPLETION_FALSE);
    }
}
