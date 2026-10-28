package io.getstream.android.push.permissions;

import a13.C0151i;
import android.app.Application;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import p644yb.InterfaceC39377b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/android/push/permissions/PushPermissionsInitializer;", "Lyb/b;", "Ll83/a0;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "stream-android-push-permissions_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class PushPermissionsInitializer implements InterfaceC39377b {
    @Override // p644yb.InterfaceC39377b
    public /* bridge */ /* synthetic */ Object create(Context context) {
        m134217create(context);
        return C23454a0.f92919a;
    }

    @Override // p644yb.InterfaceC39377b
    public List<Class<? extends InterfaceC39377b>> dependencies() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: create, reason: collision with other method in class */
    public void m134217create(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65748h(applicationContext, "null cannot be cast to non-null type android.app.Application");
        C0151i.f468E.m56534q((Application) applicationContext);
    }
}
