package zq0;

import android.view.Window;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zq0.r */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lzq0/r;", "", "<init>", "()V", "Landroid/view/Window;", "window", "Ll83/a0;", "a", "(Landroid/view/Window;)V", "b", "", "I", "blockingCallers", "community-everyday-stats_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40977r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int blockingCallers;

    /* JADX INFO: renamed from: a */
    public final void m133054a(Window window) {
        AbstractC22676k.m65750j(window, "window");
        int i13 = this.blockingCallers + 1;
        this.blockingCallers = i13;
        if (i13 == 1) {
            window.addFlags(DfuBaseService.ERROR_REMOTE_MASK);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m133055b(Window window) {
        AbstractC22676k.m65750j(window, "window");
        int i13 = this.blockingCallers - 1;
        this.blockingCallers = i13;
        if (i13 == 0) {
            window.clearFlags(DfuBaseService.ERROR_REMOTE_MASK);
        }
    }
}
