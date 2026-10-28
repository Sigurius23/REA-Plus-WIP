package io.sentry;

import io.sentry.protocol.C20501v;
import io.sentry.util.AbstractC20591m;
import io.sentry.util.InterfaceC20583e;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.g7 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20344g7 implements InterfaceC20583e, InterfaceC20320e4 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f76366w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f76367x;

    public /* synthetic */ C20344g7(C20501v c20501v, String str) {
        this.f76366w = 2;
        this.f76367x = str;
    }

    @Override // io.sentry.InterfaceC20320e4
    /* JADX INFO: renamed from: h */
    public void mo11182h(InterfaceC20259b1 interfaceC20259b1) {
        interfaceC20259b1.mo56186H(this.f76367x);
    }

    @Override // io.sentry.util.InterfaceC20583e
    /* JADX INFO: renamed from: j */
    public Object mo19991j() {
        int i13 = this.f76366w;
        String str = this.f76367x;
        switch (i13) {
            case 0:
                return str;
            default:
                Charset charset = AbstractC20591m.f77097a;
                if (str.equals("0000-0000")) {
                    str = "00000000-0000-0000-0000-000000000000";
                }
                return str.replace("-", "");
        }
    }

    public /* synthetic */ C20344g7(String str, int i13) {
        this.f76366w = i13;
        this.f76367x = str;
    }
}
