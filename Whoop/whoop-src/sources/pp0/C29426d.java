package pp0;

import android.content.Context;
import bc3.AbstractC3006f0;
import bh.C3247j;
import bh.InterfaceC3242e;
import mh.C25540h;
import mh.C25542j;
import mh.EnumC25534b;
import p000.C12473e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: pp0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lpp0/d;", "", "Landroid/content/Context;", "context", "Lbh/e;", "imageLoader", "<init>", "(Landroid/content/Context;Lbh/e;)V", "", "iconUrl", "Ll83/a0;", "a", "(Ljava/lang/String;)V", "Landroid/content/Context;", "b", "Lbh/e;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29426d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC3242e imageLoader;

    public C29426d(Context context, InterfaceC3242e imageLoader) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(imageLoader, "imageLoader");
        this.context = context;
        this.imageLoader = imageLoader;
    }

    /* JADX INFO: renamed from: a */
    public final void m89701a(String iconUrl) {
        AbstractC22676k.m65750j(iconUrl, "iconUrl");
        C25540h c25540h = new C25540h(this.context);
        c25540h.f100079c = iconUrl;
        c25540h.f100092p = EnumC25534b.ENABLED;
        C25542j c25542jM75117a = c25540h.m75117a();
        C3247j c3247j = (C3247j) this.imageLoader;
        AbstractC3006f0.m8711e(c3247j.f12731f, null, new C12473e(c3247j, c25542jM75117a, (InterfaceC30057d) null, 22), 3);
    }
}
