package j02;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import iz0.C21045d;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: j02.w0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lj02/w0;", "Lj02/k0;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "Landroid/content/Intent;", "intentFactory", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Ltr2/n;)V", "Lj02/m0;", "navigationScreen", "Lj02/j0;", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Landroid/content/Context;", "b", "Lkotlin/jvm/functions/Function1;", "c", "Ltr2/n;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21175w0 implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Function1 intentFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C21175w0(Context context, Function1 intentFactory, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intentFactory, "intentFactory");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.intentFactory = intentFactory;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final Intent m59417b(String url) {
        AbstractC22676k.m65750j(url, "url");
        Intent intentAddFlags = new Intent("android.intent.action.VIEW", Uri.parse(url)).addFlags(268435456);
        AbstractC22676k.m65749i(intentAddFlags, "addFlags(...)");
        return intentAddFlags;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (!(navigationScreen instanceof AbstractC21155m0.h5)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.h5 h5Var = (AbstractC21155m0.h5) navigationScreen;
        if (AbstractC39414r.m125890i0(h5Var.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String())) {
            this.logger.mo85226q("URLNavigationScreen received with blank url; dropping", new AbstractC30556a.a[0]);
            return InterfaceC21149j0.d.f80241a;
        }
        try {
            this.context.startActivity((Intent) this.intentFactory.invoke(((AbstractC21155m0.h5) navigationScreen).getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String()));
            return InterfaceC21149j0.a.f80236a;
        } catch (ActivityNotFoundException e5) {
            this.logger.mo85230v(AbstractC11266d.m30461o("No activity handles ", h5Var.getIo.getstream.chat.android.client.api.QueryParams.URL java.lang.String()), e5, new AbstractC30556a.a[0]);
            return InterfaceC21149j0.d.f80241a;
        }
    }

    public /* synthetic */ C21175w0(Context context, Function1 function1, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? new C21045d(12) : function1, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("URLNavigationProvider") : interfaceC34116n);
    }
}
