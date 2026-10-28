package vk0;

import l83.C23468n;
import p715kotlin.Metadata;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: vk0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lvk0/i;", "", "Lvk0/g;", "task", "Lkotlin/time/Duration;", "timeout", "", "dualResponse", "Ll83/n;", "Lzj0/h;", "i", "(Lvk0/g;JZLq83/d;)Ljava/lang/Object;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC36083i {
    /* JADX INFO: renamed from: r0 */
    static /* synthetic */ Object m114608r0(InterfaceC36083i interfaceC36083i, InterfaceC36081g interfaceC36081g, long j7, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendTaskAndAwaitResponse-JXpvp54");
        }
        if ((i13 & 2) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            j7 = DurationKt.toDuration(5, DurationUnit.SECONDS);
        }
        long j13 = j7;
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return interfaceC36083i.mo79830i(interfaceC36081g, j13, z4, interfaceC30057d);
    }

    /* JADX INFO: renamed from: i */
    Object mo79830i(InterfaceC36081g interfaceC36081g, long j7, boolean z4, InterfaceC30057d<? super C23468n> interfaceC30057d);
}
