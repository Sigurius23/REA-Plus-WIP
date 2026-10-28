package com.whoop.p069ui.drawer.strapsettings.connectstrap;

import android.content.Context;
import androidx.lifecycle.InterfaceC1633v0;
import l83.InterfaceC23459e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;
import qm2.C30498o;

/* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Landroid/content/Context;", "context", "Lqm2/o;", "a", "(Landroid/content/Context;)Lqm2/o;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC10531a {

    /* JADX INFO: renamed from: com.whoop.ui.drawer.strapsettings.connectstrap.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC1633v0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f31911w;

        public a(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f31911w = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1633v0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f31911w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1633v0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31911w.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final C30498o m27136a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return new C30498o(context, (Class<?>) BleChooseStrapActivity.class);
    }
}
