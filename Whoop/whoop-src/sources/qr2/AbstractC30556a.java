package qr2;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: qr2.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC30556a {
    public final Set<a> tags;
    public final long timestamp;

    /* JADX INFO: renamed from: qr2.a$a */
    public enum a {
        APPLICATION,
        BLUETOOTH,
        IO,
        CHATTY,
        STATE_MACHINE,
        REAL_TIME,
        HISTORY,
        BIOTELEMETRY
    }

    public AbstractC30556a(long j7, a... aVarArr) {
        EnumSet enumSetNoneOf = EnumSet.noneOf(a.class);
        this.tags = enumSetNoneOf;
        this.timestamp = j7;
        Collections.addAll(enumSetNoneOf, aVarArr);
    }
}
