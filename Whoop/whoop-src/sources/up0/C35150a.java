package up0;

import android.content.Context;
import p218ic.AbstractC18377p0;
import p249jc.C21596v;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import vp0.InterfaceC36263a;

/* JADX INFO: renamed from: up0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lup0/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "Lic/p0;", "b", "Lic/p0;", "workManagerInstance", "Lvp0/a;", "c", "Lvp0/a;", "logger", "commons_release"}, m65682k = 1, m65683mv = {1, 5, 1}, m65685xi = 48)
public final class C35150a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC18377p0 workManagerInstance;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC36263a logger;

    public C35150a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.workManagerInstance = C21596v.m60637g(context);
        this.logger = InterfaceC36263a.INSTANCE.m115719a("WorkManagerUtil");
    }
}
