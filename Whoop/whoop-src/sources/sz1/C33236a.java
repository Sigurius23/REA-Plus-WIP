package sz1;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.ProductDescriptionPageScreenModel;
import oz1.C28498a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import tz1.C34286h;
import tz1.C34287i;
import tz1.C34288j;
import tz1.C34290l;
import tz1.InterfaceC34282d;

/* JADX INFO: renamed from: sz1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lsz1/a;", "", "Loz1/a;", "analytics", "<init>", "(Loz1/a;)V", "Ltz1/d;", "", "source", "d", "(Ltz1/d;Ljava/lang/String;)Ltz1/d;", "Ltz1/d$h;", NotificationCompat.CATEGORY_EVENT, "a", "(Ltz1/d$h;)Ltz1/d;", "b", "(Ljava/lang/Object;Ljava/lang/String;)Ltz1/d;", "Loz1/a;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33236a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28498a analytics;

    public C33236a(C28498a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final InterfaceC34282d m105435a(InterfaceC34282d.h event) {
        C9598e c9598eM108599b;
        Object objM108580b = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (objM108580b instanceof C9598e) {
            return new InterfaceC34282d.c((C9598e) objM108580b);
        }
        if (objM108580b instanceof C34286h) {
            C9598e c9598eM108594b = ((C34286h) objM108580b).getDestination();
            if (c9598eM108594b != null) {
                return new InterfaceC34282d.c(c9598eM108594b);
            }
            return null;
        }
        if (objM108580b instanceof C34290l) {
            return new InterfaceC34282d.c(((C34290l) objM108580b).getDestination());
        }
        if (objM108580b instanceof C34287i) {
            C9598e c9598eM108597b = ((C34287i) objM108580b).getDestination();
            if (c9598eM108597b != null) {
                return new InterfaceC34282d.c(c9598eM108597b);
            }
            return null;
        }
        if (!(objM108580b instanceof C34288j) || (c9598eM108599b = ((C34288j) objM108580b).getDestination()) == null) {
            return null;
        }
        return new InterfaceC34282d.c(c9598eM108599b);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC34282d m105436c(C33236a c33236a, Object obj, String str, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        return c33236a.m105438b(obj, str);
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC34282d m105437d(InterfaceC34282d interfaceC34282d, String str) {
        if (str == null || !(interfaceC34282d instanceof InterfaceC34282d.c)) {
            return interfaceC34282d;
        }
        InterfaceC34282d.c cVar = (InterfaceC34282d.c) interfaceC34282d;
        NavigationScreenModel parameters = cVar.getNavAction().getParameters();
        if (!(parameters instanceof ProductDescriptionPageScreenModel)) {
            return interfaceC34282d;
        }
        C9598e c9598eM108573b = cVar.getNavAction();
        ProductDescriptionPageScreenModel productDescriptionPageScreenModel = (ProductDescriptionPageScreenModel) parameters;
        String source = productDescriptionPageScreenModel.getSource();
        return cVar.m108572a(C9598e.m23127b(c9598eM108573b, null, ProductDescriptionPageScreenModel.copy$default(productDescriptionPageScreenModel, null, null, source == null ? str : source, 3, null), null, 5, null));
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC34282d m105438b(Object event, String source) {
        InterfaceC34282d interfaceC34282dM105435a;
        InterfaceC34282d.c cVar;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC34282d.a) {
            this.analytics.m86809k((InterfaceC34282d.a) event, source);
        }
        if (event instanceof InterfaceC34282d.h) {
            interfaceC34282dM105435a = m105435a((InterfaceC34282d.h) event);
        } else {
            if (event instanceof InterfaceC34282d.f) {
                cVar = new InterfaceC34282d.c(((InterfaceC34282d.f) event).getDestination());
            } else if (event instanceof InterfaceC34282d) {
                interfaceC34282dM105435a = (InterfaceC34282d) event;
            } else if (event instanceof C9598e) {
                cVar = new InterfaceC34282d.c((C9598e) event);
            } else {
                interfaceC34282dM105435a = null;
            }
            interfaceC34282dM105435a = cVar;
        }
        return m105437d(interfaceC34282dM105435a, source);
    }
}
