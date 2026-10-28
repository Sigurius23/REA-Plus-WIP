package m32;

import androidx.lifecycle.DefaultLifecycleObserver;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: m32.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lm32/c;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "shouldResetResumed", "Lm32/e;", "x", "(ZLq83/d;)Ljava/lang/Object;", "essentials_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC25007c extends DefaultLifecycleObserver {
    /* JADX INFO: renamed from: s */
    static /* synthetic */ Object m73347s(InterfaceC25007c interfaceC25007c, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPermission");
        }
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return interfaceC25007c.mo73348x(z4, interfaceC30057d);
    }

    /* JADX INFO: renamed from: x */
    Object mo73348x(boolean z4, InterfaceC30057d<? super EnumC25009e> interfaceC30057d);
}
