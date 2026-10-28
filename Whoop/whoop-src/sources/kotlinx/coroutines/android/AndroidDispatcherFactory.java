package kotlinx.coroutines.android;

import android.os.Looper;
import bc3.AbstractC3069w1;
import cc3.AbstractC4420c;
import cc3.C4419b;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "<init>", "()V", "kotlinx-coroutines-android"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* JADX INFO: renamed from: a */
    public final AbstractC3069w1 mo48537a(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C4419b(AbstractC4420c.m13865a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* JADX INFO: renamed from: b */
    public final int mo48538b() {
        return 1073741823;
    }
}
