package or2;

import android.content.Context;
import android.net.Uri;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lor2/a;", "", "Landroid/content/Context;", "context", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Ltr2/n;)V", "Landroid/net/Uri;", "uri", "", "a", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/Context;", "b", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28143a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C28143a(Context context, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final String m85156a(Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        try {
            return this.context.getContentResolver().getType(uri);
        } catch (Exception e5) {
            this.logger.mo85230v(AbstractC31061c.m95637m(uri, "Failed to get MIME type for Uri: "), e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    public /* synthetic */ C28143a(Context context, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AndroidUriUtils") : interfaceC34116n);
    }
}
