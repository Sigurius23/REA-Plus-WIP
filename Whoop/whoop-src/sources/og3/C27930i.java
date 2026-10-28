package og3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: renamed from: og3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C27930i extends AbstractC27931j {
    @Override // og3.AbstractC27931j
    /* JADX INFO: renamed from: a */
    public final void mo76789a() {
        try {
            Iterator it = Arrays.asList(new C27925d[0]).iterator();
            while (it.hasNext()) {
                try {
                    C27925d.m84273c((C27925d) it.next());
                } catch (ServiceConfigurationError e5) {
                    if (!(e5.getCause() instanceof SecurityException)) {
                        throw e5;
                    }
                }
            }
        } catch (Throwable th3) {
            throw new ServiceConfigurationError(th3.getMessage(), th3);
        }
    }
}
