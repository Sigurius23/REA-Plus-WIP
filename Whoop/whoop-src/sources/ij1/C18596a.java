package ij1;

import android.content.Context;
import p030b7.C2772a;
import p030b7.InterfaceC2773b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ij1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lij1/a;", "", "Landroid/content/Context;", "context", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Ltr2/n;)V", "Lb7/b;", "a", "()Lb7/b;", "", "b", "()Z", "c", "Landroid/content/Context;", "Ltr2/n;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18596a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C18596a(Context context, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2773b m53813a() {
        if (!m53814b() && !m53815c()) {
            try {
                return C2772a.m7834a(InterfaceC2773b.f10911a, this.context);
            } catch (IllegalStateException e5) {
                this.logger.mo85230v("Google Health Connect Client not available", e5, new AbstractC30556a.a[0]);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m53814b() {
        return C2772a.m7836c(InterfaceC2773b.f10911a, this.context) == 1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m53815c() {
        return C2772a.m7836c(InterfaceC2773b.f10911a, this.context) == 2;
    }
}
