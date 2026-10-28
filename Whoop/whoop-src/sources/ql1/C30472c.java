package ql1;

import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13075p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ql1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lql1/c;", "", "<init>", "()V", "", "dismissedDate", "Ll83/a0;", "a", "(Ljava/lang/String;)V", "Lec3/p1;", "Lec3/p1;", "dismissStatus", "Lec3/f2;", "b", "Lec3/f2;", "()Lec3/f2;", "observeAlertIsDismissed", "connectivity-common-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30472c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC13075p1 dismissStatus;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13037f2 observeAlertIsDismissed;

    public C30472c() {
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c("");
        this.dismissStatus = c13045h2M36593c;
        this.observeAlertIsDismissed = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    /* JADX INFO: renamed from: a */
    public final void m93245a(String dismissedDate) {
        C13045h2 c13045h2;
        Object value;
        AbstractC22676k.m65750j(dismissedDate, "dismissedDate");
        InterfaceC13075p1 interfaceC13075p1 = this.dismissStatus;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
        } while (!c13045h2.m36569i(value, dismissedDate));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC13037f2 getObserveAlertIsDismissed() {
        return this.observeAlertIsDismissed;
    }
}
