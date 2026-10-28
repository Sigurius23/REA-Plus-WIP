package aws.smithy.kotlin.runtime;

import java.util.Iterator;
import m83.AbstractC25265s;
import n83.C26460c;
import p501te.C33736a;
import p501te.C33740e;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Laws/smithy/kotlin/runtime/ServiceException;", "Laws/smithy/kotlin/runtime/SdkBaseException;", "<init>", "()V", "te/f", "runtime-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class ServiceException extends SdkBaseException {

    /* JADX INFO: renamed from: x */
    public final C33740e f8400x;

    public ServiceException() {
        this.f8400x = new C33740e();
    }

    @Override // aws.smithy.kotlin.runtime.SdkBaseException
    /* JADX INFO: renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
    public C33740e getF8399w() {
        return this.f8400x;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        String message = super.getMessage();
        if (message == null) {
            message = getF8399w().m106625f();
        }
        if (message == null) {
            String strM106624e = getF8399w().m106624e();
            if (strM106624e != null) {
                c26460cM119000x.add("Service returned error code ".concat(strM106624e));
            }
            c26460cM119000x.add("Error type: " + getF8399w().m106626g());
            c26460cM119000x.add("Protocol response: " + getF8399w().m106627h().mo106619a());
        } else {
            c26460cM119000x.add(message);
        }
        String strM106628i = getF8399w().m106628i();
        if (strM106628i != null) {
            c26460cM119000x.add("Request ID: ".concat(strM106628i));
        }
        Iterator it = getF8399w().m106621b().iterator();
        while (it.hasNext()) {
            c26460cM119000x.add(((C33736a) it.next()).m106618a());
        }
        return AbstractC25265s.m74110N0(AbstractC37056f.m118988k(c26460cM119000x), null, null, null, null, 63);
    }

    public ServiceException(String str) {
        super(str);
        this.f8400x = new C33740e();
    }

    public ServiceException(Exception exc, String str) {
        super(str, exc);
        this.f8400x = new C33740e();
    }
}
