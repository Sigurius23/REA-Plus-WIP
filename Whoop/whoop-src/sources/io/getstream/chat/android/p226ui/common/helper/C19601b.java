package io.getstream.chat.android.p226ui.common.helper;

import android.content.Context;
import c93.InterfaceC4339a;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.common.helper.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19601b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74468w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f74469x;

    public /* synthetic */ C19601b(Object obj, int i13) {
        this.f74468w = i13;
        this.f74469x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f74468w) {
            case 0:
                return DefaultDateFormatter.DefaultDateContext.m55071a((DefaultDateFormatter.DefaultDateContext) this.f74469x);
            default:
                return CopyToClipboardHandlerImpl._init_$lambda$0((Context) this.f74469x);
        }
    }
}
