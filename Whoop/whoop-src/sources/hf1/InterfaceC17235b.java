package hf1;

import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: hf1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000eH¦@¢\u0006\u0004\b\u000f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, m65681d2 = {"Lhf1/b;", "", "Lhf1/a;", "experiment", "", "isAuthenticated", "", "e", "(Lhf1/a;ZLq83/d;)Ljava/lang/Object;", "f", "(Lhf1/a;Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "b", "(Lq83/d;)Ljava/lang/Object;", "", "c", "", "cacheTtlSeconds", "shouldBucketUser", "a", "(Lhf1/a;JZZLq83/d;)Ljava/lang/Object;", "experiments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC17235b {
    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m48741d(InterfaceC17235b interfaceC17235b, InterfaceC17234a interfaceC17234a, long j7, boolean z4, boolean z13, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVariant");
        }
        if ((i13 & 2) != 0) {
            j7 = 86400;
        }
        long j13 = j7;
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        boolean z14 = z4;
        if ((i13 & 8) != 0) {
            z13 = true;
        }
        return interfaceC17235b.mo48742a(interfaceC17234a, j13, z14, z13, interfaceC30057d);
    }

    /* JADX INFO: renamed from: a */
    Object mo48742a(InterfaceC17234a interfaceC17234a, long j7, boolean z4, boolean z13, InterfaceC30057d<? super String> interfaceC30057d);

    /* JADX INFO: renamed from: b */
    Object mo48743b(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    /* JADX INFO: renamed from: c */
    Object mo48744c(InterfaceC30057d<? super Map<String, String>> interfaceC30057d);

    @InterfaceC23457c
    /* JADX INFO: renamed from: e */
    Object mo48745e(InterfaceC17234a interfaceC17234a, boolean z4, InterfaceC30057d<? super String> interfaceC30057d);

    /* JADX INFO: renamed from: f */
    Object mo48746f(InterfaceC17234a interfaceC17234a, InterfaceC30057d<? super String> interfaceC30057d);
}
