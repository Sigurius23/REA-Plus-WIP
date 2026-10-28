package ws;

import gs.AbstractC16123b;
import java.security.spec.ECPoint;
import p075ct.C11105a;

/* JADX INFO: renamed from: ws.e */
/* JADX INFO: loaded from: classes.dex */
public final class C37583e extends AbstractC16123b {

    /* JADX INFO: renamed from: b */
    public final C37581c f160720b;

    /* JADX INFO: renamed from: c */
    public final ECPoint f160721c;

    /* JADX INFO: renamed from: d */
    public final C11105a f160722d;

    /* JADX INFO: renamed from: e */
    public final Integer f160723e;

    public C37583e(C37581c c37581c, ECPoint eCPoint, C11105a c11105a, Integer num) {
        super(6);
        this.f160720b = c37581c;
        this.f160721c = eCPoint;
        this.f160722d = c11105a;
        this.f160723e = num;
    }

    @Override // gs.AbstractC16123b
    /* JADX INFO: renamed from: V */
    public final C11105a mo45678V() {
        return this.f160722d;
    }

    @Override // gs.AbstractC16123b, p505ts.AbstractC34132o
    /* JADX INFO: renamed from: z */
    public final Integer mo16076z() {
        return this.f160723e;
    }
}
