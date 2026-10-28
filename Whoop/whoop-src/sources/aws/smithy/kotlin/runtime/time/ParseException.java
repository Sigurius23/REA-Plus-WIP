package aws.smithy.kotlin.runtime.time;

import aws.smithy.kotlin.runtime.SdkBaseException;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Laws/smithy/kotlin/runtime/time/ParseException;", "Laws/smithy/kotlin/runtime/SdkBaseException;", "runtime-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class ParseException extends SdkBaseException {
    public ParseException(String input, String message, int i13) {
        AbstractC22676k.m65750j(input, "input");
        AbstractC22676k.m65750j(message, "message");
        StringBuilder sb4 = new StringBuilder("parse `");
        AbstractC11266d.m30470x(i13, input, "`: error at ", ": ", sb4);
        sb4.append(message);
        super(sb4.toString());
    }
}
