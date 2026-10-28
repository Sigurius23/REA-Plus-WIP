package p436qs;

import a33.C0352d;
import com.google.crypto.tink.internal.C5089f0;
import com.google.crypto.tink.internal.C5110q;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import p154fs.InterfaceC14732j;
import p154fs.InterfaceC14734l;
import p380os.C28301a;

/* JADX INFO: renamed from: qs.g */
/* JADX INFO: loaded from: classes.dex */
public final class C30563g implements InterfaceC14734l {

    /* JADX INFO: renamed from: b */
    public static final C30563g f125764b = new C30563g(0);

    /* JADX INFO: renamed from: c */
    public static final C30563g f125765c = new C30563g(1);

    /* JADX INFO: renamed from: d */
    public static final C5089f0 f125766d = new C5089f0(C5110q.class, InterfaceC14732j.class, new C28301a(13));

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125767a;

    public /* synthetic */ C30563g(int i13) {
        this.f125767a = i13;
    }

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: a */
    public final Class mo42238a() {
        switch (this.f125767a) {
            case 0:
                return InterfaceC30561e.class;
            default:
                return InterfaceC14732j.class;
        }
    }

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: b */
    public final Class mo42239b() {
        switch (this.f125767a) {
            case 0:
                return InterfaceC30561e.class;
            default:
                return InterfaceC14732j.class;
        }
    }

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: c */
    public final Object mo42240c(C0352d c0352d) throws GeneralSecurityException {
        switch (this.f125767a) {
            case 0:
                if (c0352d.m948u() == null) {
                    throw new GeneralSecurityException("no primary in primitive set");
                }
                Iterator it = c0352d.m942o().iterator();
                while (it.hasNext()) {
                    Iterator it3 = ((List) it.next()).iterator();
                    while (it3.hasNext()) {
                    }
                }
                return new C30562f();
            default:
                return new C30570n(c0352d);
        }
    }
}
