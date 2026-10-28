package com.whoop.initializer;

import android.content.Context;
import android.util.Log;
import java.util.List;
import m83.C25271y;
import p098dt.C12355g;
import p098dt.C12357i;
import p644yb.InterfaceC39377b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/initializer/FirebaseInitializer;", "Lyb/b;", "Ldt/g;", "<init>", "()V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Ldt/g;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class FirebaseInitializer implements InterfaceC39377b {
    @Override // p644yb.InterfaceC39377b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C12355g create(Context context) {
        C12355g c12355gM34609e;
        AbstractC22676k.m65750j(context, "context");
        synchronized (C12355g.f41517j) {
            try {
                if (C12355g.f41518k.containsKey("[DEFAULT]")) {
                    c12355gM34609e = C12355g.m34608b();
                } else {
                    C12357i c12357iM34613a = C12357i.m34613a(context);
                    if (c12357iM34613a == null) {
                        Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                        c12355gM34609e = null;
                    } else {
                        c12355gM34609e = C12355g.m34609e(context, c12357iM34613a);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (c12355gM34609e != null) {
            return c12355gM34609e;
        }
        throw new IllegalArgumentException("FirebaseApp.initializeApp returned null");
    }

    @Override // p644yb.InterfaceC39377b
    public List<Class<? extends InterfaceC39377b>> dependencies() {
        return C25271y.f99162w;
    }
}
