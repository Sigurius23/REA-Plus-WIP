package ws;

import a33.C0352d;
import at.C1970n;
import at.C1971o;
import com.google.crypto.tink.internal.C5089f0;
import com.google.crypto.tink.internal.C5110q;
import p154fs.InterfaceC14734l;
import p154fs.InterfaceC14735m;
import p154fs.InterfaceC14736n;
import p505ts.C34119b;

/* JADX INFO: renamed from: ws.m */
/* JADX INFO: loaded from: classes.dex */
public final class C37591m implements InterfaceC14734l {

    /* JADX INFO: renamed from: b */
    public static final C37591m f160760b = new C37591m(0);

    /* JADX INFO: renamed from: c */
    public static final C5089f0 f160761c = new C5089f0(C5110q.class, InterfaceC14735m.class, new C34119b(22));

    /* JADX INFO: renamed from: d */
    public static final C37591m f160762d = new C37591m(1);

    /* JADX INFO: renamed from: e */
    public static final C5089f0 f160763e = new C5089f0(C5110q.class, InterfaceC14736n.class, new C34119b(23));

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f160764a;

    public /* synthetic */ C37591m(int i13) {
        this.f160764a = i13;
    }

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: a */
    public final Class mo42238a() {
        switch (this.f160764a) {
            case 0:
                return InterfaceC14735m.class;
            default:
                return InterfaceC14736n.class;
        }
    }

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: b */
    public final Class mo42239b() {
        switch (this.f160764a) {
            case 0:
                return InterfaceC14735m.class;
            default:
                return InterfaceC14736n.class;
        }
    }

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: c */
    public final Object mo42240c(C0352d c0352d) {
        switch (this.f160764a) {
            case 0:
                return new C1970n(c0352d);
            default:
                return new C1971o(c0352d);
        }
    }
}
