package io.getstream.chat.android.p226ui.utils;

import android.view.View;
import ax.InterfaceC2116a;
import ax.InterfaceC2117b;
import cx.C11167c;
import cx.C11168d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.utils.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19905d implements InterfaceC2116a, InterfaceC2117b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ View f74835w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PermissionChecker f74836x;

    public /* synthetic */ C19905d(View view, PermissionChecker permissionChecker) {
        this.f74835w = view;
        this.f74836x = permissionChecker;
    }

    @Override // ax.InterfaceC2116a
    /* JADX INFO: renamed from: a */
    public void mo6682a(C11167c c11167c, List list) {
        PermissionChecker.checkStoragePermissions$lambda$0(this.f74835w, this.f74836x, c11167c, list);
    }

    @Override // ax.InterfaceC2117b
    /* JADX INFO: renamed from: e */
    public void mo6683e(C11168d c11168d, ArrayList arrayList) {
        PermissionChecker.checkStoragePermissions$lambda$1(this.f74835w, this.f74836x, c11168d, arrayList);
    }
}
