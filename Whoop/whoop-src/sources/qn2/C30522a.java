package qn2;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import io2.C20762h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import wn2.EnumC37425c;
import wn2.InterfaceC37427e;
import wn2.InterfaceC37431i;

/* JADX INFO: renamed from: qn2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u00020\u0006*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001c"}, m65681d2 = {"Lqn2/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "action", "Lwn2/i$c;", "sheet", "Ll83/a0;", "e", "(Ljava/lang/String;Lwn2/i$c;)V", "", "properties", "d", "(Ljava/lang/String;Ljava/util/Map;)V", "c", "(Lwn2/i$c;)V", "Lwn2/e;", NotificationCompat.CATEGORY_EVENT, "b", "(Lwn2/e;Lwn2/i$c;)V", "a", "Lfi0/a;", "Lwn2/c;", "(Lwn2/c;)Ljava/lang/String;", "clickAction", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30522a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: qn2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f125518a;

        static {
            int[] iArr = new int[EnumC37425c.values().length];
            try {
                iArr[EnumC37425c.SHIPPING_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37425c.PAYMENT_METHOD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f125518a = iArr;
        }
    }

    public C30522a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final String m93537a(EnumC37425c enumC37425c) {
        int i13 = a.f125518a[enumC37425c.ordinal()];
        if (i13 == 1) {
            return "click_shipping_address";
        }
        if (i13 == 2) {
            return "click_payment_method";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: d */
    private final void m93538d(String action, Map<String, ? extends Object> properties) {
        InterfaceC14515a.m41418i(this.analytics, null, action, null, "Universal Buy Now", null, properties, 21, null);
    }

    /* JADX INFO: renamed from: e */
    private final void m93539e(String action, InterfaceC37431i.c sheet) {
        List<InterfaceC25312u> listM119833b = sheet.m119833b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM119833b) {
            if (obj instanceof C20762h) {
                arrayList.add(obj);
            }
        }
        C20762h c20762h = (C20762h) AbstractC25265s.m74100H0(arrayList);
        m93538d(action, AbstractC25247g0.m73990Y(new C23465k("subtotal", sheet.getAnalyticsSubtotalValue()), new C23465k("checkout_enabled", String.valueOf(c20762h != null ? c20762h.getIsEnabled() : false))));
    }

    /* JADX INFO: renamed from: b */
    public final void m93540b(InterfaceC37427e event, InterfaceC37431i.c sheet) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC37427e.f) {
            if (sheet != null) {
                m93538d("place_order", AbstractC31061c.m95645u("subtotal", sheet.getAnalyticsSubtotalValue()));
                return;
            }
            return;
        }
        if (event instanceof InterfaceC37427e.j) {
            if (sheet != null) {
                m93539e("click_view_full_checkout", sheet);
            }
        } else if (event instanceof InterfaceC37427e.c) {
            if (sheet != null) {
                m93539e(m93537a(((InterfaceC37427e.c) event).getRow()), sheet);
            }
        } else if (!event.equals(InterfaceC37427e.g.f160185a) && !event.equals(InterfaceC37427e.b.f160178a) && !event.equals(InterfaceC37427e.a.f160177a) && !(event instanceof InterfaceC37427e.e) && !(event instanceof InterfaceC37427e.h)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m93541c(InterfaceC37431i.c sheet) {
        AbstractC22676k.m65750j(sheet, "sheet");
        m93539e(ProfileAnalyticsKt.VIEW, sheet);
    }
}
