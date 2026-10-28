package lu2;

import ad3.AbstractC0757c;
import ad3.C0764g;
import cd3.C4455g;
import l83.C23454a0;
import lc0.C23821c;
import org.joda.time.DateTime;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: lu2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m65681d2 = {"Llu2/d;", "", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "Lad3/c;", "a", "Lad3/c;", "b", "()Lad3/c;", "json", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24754d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json;

    public C24754d(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.json = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C23821c(dateAndTimeProvider, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m72485c(InterfaceC41070a interfaceC41070a, C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2774a = true;
        Json.f2776c = true;
        C4455g c4455g = new C4455g();
        c4455g.mo2325k(AbstractC22671h0.f89337a.getOrCreateKotlinClass(DateTime.class), new C24752b(interfaceC41070a));
        Json.f2788o = c4455g.m13953r();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC0757c getJson() {
        return this.json;
    }
}
