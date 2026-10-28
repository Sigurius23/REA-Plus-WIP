package j02;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.whoop.p069ui.home.redesign.view.MainActivity;
import hi0.AbstractC17307e;
import hi0.AbstractC17309g;
import hj0.C17358q;
import m02.InterfaceC24882a;
import p114eb.C12966j0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j02.c0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lj02/c0;", "Lm02/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Ll83/a0;", "b", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "deepLinkUri", "a", "(Landroid/content/Context;Landroid/net/Uri;)V", "Landroid/os/Bundle;", "arguments", "Landroid/app/PendingIntent;", "c", "(Landroid/content/Context;Landroid/os/Bundle;)Landroid/app/PendingIntent;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21135c0 implements InterfaceC24882a {
    @Override // m02.InterfaceC24882a
    /* JADX INFO: renamed from: a */
    public void mo58971a(Context context, Uri deepLinkUri) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(deepLinkUri, "deepLinkUri");
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setData(deepLinkUri);
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    @Override // m02.InterfaceC24882a
    /* JADX INFO: renamed from: b */
    public void mo58972b(Context context) {
        AbstractC22676k.m65750j(context, "context");
        new C17358q(context, (Class<?>) MainActivity.class).m49145b().m49144a().m49146c().m49154m();
    }

    @Override // m02.InterfaceC24882a
    /* JADX INFO: renamed from: c */
    public PendingIntent mo58973c(Context context, Bundle arguments) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(arguments, "arguments");
        C12966j0 c12966j0 = new C12966j0(context);
        c12966j0.f44783b.setComponent(new ComponentName(context, (Class<?>) MainActivity.class));
        c12966j0.m36448g(AbstractC17309g.f66902a);
        C12966j0.m36442f(c12966j0, AbstractC17307e.f66712c0);
        c12966j0.m36447e(arguments);
        return c12966j0.m36444b();
    }
}
