package aws.smithy.kotlin.runtime.time;

import p477s2.AbstractC32072d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/smithy/kotlin/runtime/time/IncompleteException;", "Laws/smithy/kotlin/runtime/time/ParseException;", "runtime-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class IncompleteException extends ParseException {

    /* JADX INFO: renamed from: x */
    public final AbstractC32072d f8405x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncompleteException(String input, AbstractC32072d abstractC32072d) {
        super(input, abstractC32072d.toString(), input.length() - 1);
        AbstractC22676k.m65750j(input, "input");
        this.f8405x = abstractC32072d;
    }
}
