package jh1;

import androidx.core.app.NotificationCompat;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import fi0.InterfaceC14515a;
import java.util.Map;
import nh1.InterfaceC26720a;
import ny0.C27256h;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import q31.C29944b;
import q31.C29948f;

/* JADX INFO: renamed from: jh1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JK\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m65681d2 = {"Ljh1/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "source", "giftType", "numberOfTests", "", "analyticsProperties", "Ll83/a0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "g", "(Ljava/lang/String;)V", "e", "f", "Lnh1/a$l;", NotificationCompat.CATEGORY_EVENT, "d", "(Lnh1/a$l;)V", "Lnh1/a$a;", "c", "(Lnh1/a$a;)V", "Lfi0/a;", "Lec3/p1;", "Ljh1/a;", "b", "Lec3/p1;", "_analyticsContext", "gifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21697b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC13075p1 _analyticsContext;

    public C21697b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
        this._analyticsContext = AbstractC13091v.m36593c(new C21696a(null, null, null, null, 15, null));
    }

    /* JADX INFO: renamed from: a */
    private final void m61107a(String source, String giftType, String numberOfTests, Map<String, String> analyticsProperties) {
        C13045h2 c13045h2;
        Object value;
        C21696a c21696a;
        InterfaceC13075p1 interfaceC13075p1 = this._analyticsContext;
        do {
            c13045h2 = (C13045h2) interfaceC13075p1;
            value = c13045h2.getValue();
            c21696a = (C21696a) value;
        } while (!c13045h2.m36569i(value, c21696a.m61102a(source == null ? c21696a.getSource() : source, giftType == null ? c21696a.getGiftType() : giftType, numberOfTests == null ? c21696a.getNumberOfTests() : numberOfTests, analyticsProperties == null ? c21696a.m61103b() : analyticsProperties)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m61108b(C21697b c21697b, String str, String str2, String str3, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            map = null;
        }
        c21697b.m61107a(str, str2, str3, map);
    }

    /* JADX INFO: renamed from: d */
    private final void m61109d(InterfaceC26720a.l event) {
        InterfaceC25312u element = event.getElement();
        if (element instanceof C29948f) {
            Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            if (obj instanceof C29944b) {
                m61113c(new InterfaceC26720a.e(((C29944b) obj).getSegmentId()));
                return;
            }
            return;
        }
        if (element instanceof C27256h) {
            C21696a c21696a = (C21696a) ((C13045h2) this._analyticsContext).getValue();
            if (c21696a.getNumberOfTests().length() > 0) {
                m61113c(new InterfaceC26720a.f(c21696a.getNumberOfTests()));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m61110e(String numberOfTests) {
        C21696a c21696a = (C21696a) ((C13045h2) this._analyticsContext).getValue();
        if (c21696a.getSource().length() <= 0 || c21696a.getGiftType().length() <= 0) {
            return;
        }
        AbstractC21698c.m61114a(this.analytics, c21696a.getSource(), c21696a.getGiftType(), numberOfTests, c21696a.m61103b());
    }

    /* JADX INFO: renamed from: f */
    private final void m61111f(String numberOfTests) {
        C21696a c21696a = (C21696a) ((C13045h2) this._analyticsContext).getValue();
        if (c21696a.getSource().length() <= 0 || c21696a.getGiftType().length() <= 0) {
            return;
        }
        AbstractC21698c.m61115b(this.analytics, c21696a.getSource(), c21696a.getGiftType(), numberOfTests, c21696a.m61103b());
    }

    /* JADX INFO: renamed from: g */
    private final void m61112g(String numberOfTests) {
        C21696a c21696a = (C21696a) ((C13045h2) this._analyticsContext).getValue();
        if (c21696a.getSource().length() <= 0 || c21696a.getGiftType().length() <= 0) {
            return;
        }
        AbstractC21698c.m61117d(this.analytics, c21696a.getSource(), c21696a.getGiftType(), numberOfTests, c21696a.m61103b());
    }

    /* JADX INFO: renamed from: c */
    public final void m61113c(InterfaceC26720a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC26720a.k) {
            InterfaceC26720a.k kVar = (InterfaceC26720a.k) event;
            m61108b(this, kVar.getSource(), kVar.getGiftType(), null, null, 12, null);
            return;
        }
        if (event instanceof InterfaceC26720a.i) {
            InterfaceC26720a.i iVar = (InterfaceC26720a.i) event;
            m61108b(this, null, null, iVar.getNumberOfTests(), iVar.m79451a(), 3, null);
            m61112g(iVar.getNumberOfTests());
        } else if (event instanceof InterfaceC26720a.e) {
            InterfaceC26720a.e eVar = (InterfaceC26720a.e) event;
            m61108b(this, null, null, eVar.getNumberOfTests(), null, 11, null);
            m61110e(eVar.getNumberOfTests());
        } else if (event instanceof InterfaceC26720a.f) {
            m61111f(((InterfaceC26720a.f) event).getNumberOfTests());
        } else {
            if (!(event instanceof InterfaceC26720a.l)) {
                throw new NoWhenBranchMatchedException();
            }
            m61109d((InterfaceC26720a.l) event);
        }
    }
}
