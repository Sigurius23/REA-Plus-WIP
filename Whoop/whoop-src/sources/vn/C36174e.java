package vn;

import java.util.Arrays;
import no.nordicsemi.android.dfu.DfuBaseService;
import p097ds.AbstractC12313p;
import p528un.AbstractC35090a;

/* JADX INFO: renamed from: vn.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C36174e extends AbstractC35090a {

    /* JADX INFO: renamed from: j */
    public byte[] f154755j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f154756k;

    /* JADX INFO: renamed from: l */
    public byte[] f154757l;

    @Override // p284ko.InterfaceC22607a0
    /* JADX INFO: renamed from: b */
    public final void mo65549b() {
        try {
            this.f148921i.mo65551z(this.f148914b);
            int i13 = 0;
            int i14 = 0;
            while (i13 != -1 && !this.f154756k) {
                byte[] bArr = this.f154755j;
                if (bArr.length < i14 + DfuBaseService.ERROR_CONNECTION_MASK) {
                    this.f154755j = Arrays.copyOf(bArr, bArr.length + DfuBaseService.ERROR_CONNECTION_MASK);
                }
                i13 = this.f148921i.read(this.f154755j, i14, DfuBaseService.ERROR_CONNECTION_MASK);
                if (i13 != -1) {
                    i14 += i13;
                }
            }
            if (!this.f154756k) {
                this.f154757l = Arrays.copyOf(this.f154755j, i14);
            }
        } finally {
            AbstractC12313p.m34305w(this.f148921i);
        }
    }

    @Override // p284ko.InterfaceC22607a0
    /* JADX INFO: renamed from: c */
    public final void mo65550c() {
        this.f154756k = true;
    }
}
