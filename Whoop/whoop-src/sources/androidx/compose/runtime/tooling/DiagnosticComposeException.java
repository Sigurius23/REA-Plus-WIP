package androidx.compose.runtime.tooling;

import java.util.List;
import m83.AbstractC25265s;
import m83.C25253j0;
import n83.C26460c;
import p004a2.C0153b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class DiagnosticComposeException extends RuntimeException {

    /* JADX INFO: renamed from: w */
    public final List f4771w;

    public DiagnosticComposeException(List list) {
        this.f4771w = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb4 = new StringBuilder("Composition stack when thrown:\n");
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        C25253j0 c25253j0M74143q0 = AbstractC25265s.m74143q0(this.f4771w);
        if (c25253j0M74143q0.mo73980a() > 0) {
            ((C0153b) c25253j0M74143q0.get(0)).getClass();
            throw null;
        }
        C25253j0 c25253j0M74143q1 = AbstractC25265s.m74143q0(AbstractC37056f.m118988k(c26460cM119000x));
        int iMo73980a = c25253j0M74143q1.mo73980a();
        for (int i13 = 0; i13 < iMo73980a; i13++) {
            sb4.append("\tat " + ((String) c25253j0M74143q1.get(i13)));
            sb4.append('\n');
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
