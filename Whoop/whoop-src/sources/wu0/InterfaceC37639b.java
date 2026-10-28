package wu0;

import ec3.InterfaceC13058l;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: wu0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lwu0/b;", "", "", "withDelay", "Lec3/l;", "Ljk0/a;", "b", "(Z)Lec3/l;", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC37639b {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ InterfaceC13058l m120962a(InterfaceC37639b interfaceC37639b, boolean z4, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: strapBodyStatusFlow");
        }
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        return interfaceC37639b.mo120963b(z4);
    }

    /* JADX INFO: renamed from: b */
    InterfaceC13058l mo120963b(boolean withDelay);
}
