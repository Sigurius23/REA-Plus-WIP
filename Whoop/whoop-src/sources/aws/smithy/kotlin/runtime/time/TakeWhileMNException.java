package aws.smithy.kotlin.runtime.time;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/smithy/kotlin/runtime/time/TakeWhileMNException;", "Laws/smithy/kotlin/runtime/time/ParseException;", "runtime-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TakeWhileMNException extends ParseException {

    /* JADX INFO: renamed from: x */
    public final int f8406x;

    /* JADX INFO: renamed from: y */
    public final int f8407y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeWhileMNException(String input, int i13, int i14, int i15) {
        super(input, "expected at least " + i14 + " matches of predicate; only matched " + i15, i13);
        AbstractC22676k.m65750j(input, "input");
        this.f8406x = i14;
        this.f8407y = i15;
    }
}
