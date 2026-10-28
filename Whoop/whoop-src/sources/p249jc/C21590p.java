package p249jc;

import android.content.Context;
import p518ub.AbstractC34729b;
import p518ub.C34730c;
import p518ub.InterfaceC34731d;
import p518ub.InterfaceC34732e;
import p549vb.C35864i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jc.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21590p implements InterfaceC34731d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Context f82793w;

    public /* synthetic */ C21590p(Context context) {
        this.f82793w = context;
    }

    @Override // p518ub.InterfaceC34731d
    /* JADX INFO: renamed from: a */
    public InterfaceC34732e mo60609a(C34730c c34730c) {
        String str = c34730c.f146272b;
        AbstractC34729b callback = c34730c.f146273c;
        AbstractC22676k.m65750j(callback, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new C35864i(this.f82793w, str, callback, true, true);
    }
}
