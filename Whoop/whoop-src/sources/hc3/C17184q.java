package hc3;

import bc3.AbstractC3069w1;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: renamed from: hc3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C17184q implements MainDispatcherFactory {

    /* JADX INFO: renamed from: a */
    public static final C17184q f66000a = new C17184q();

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* JADX INFO: renamed from: a */
    public final AbstractC3069w1 mo48537a(List list) {
        return new C17183p();
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* JADX INFO: renamed from: b */
    public final int mo48538b() {
        return -1;
    }
}
