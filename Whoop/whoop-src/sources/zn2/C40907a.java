package zn2;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import eo2.EnumC13389i;
import eo2.InterfaceC13383c;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: zn2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001f¨\u0006 "}, m65681d2 = {"Lzn2/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "productLabel", "", "newQuantity", "subtotal", "Ll83/a0;", "e", "(Ljava/lang/String;ILjava/lang/String;)V", "d", "action", "g", "(Ljava/lang/String;Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "", "i", "(Ljava/lang/String;)Ljava/util/Map;", "f", "(Ljava/lang/String;)V", "b", "c", "Leo2/c$h;", NotificationCompat.CATEGORY_EVENT, "a", "(Leo2/c$h;Ljava/lang/String;)V", "Lfi0/a;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40907a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: zn2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f176316a;

        static {
            int[] iArr = new int[EnumC13389i.values().length];
            try {
                iArr[EnumC13389i.INCREMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13389i.DECREMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f176316a = iArr;
        }
    }

    public C40907a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: d */
    private final void m132590d(String productLabel, int newQuantity, String subtotal) {
        m132593h("click_minus", productLabel, newQuantity, subtotal);
    }

    /* JADX INFO: renamed from: e */
    private final void m132591e(String productLabel, int newQuantity, String subtotal) {
        m132593h("click_plus", productLabel, newQuantity, subtotal);
    }

    /* JADX INFO: renamed from: g */
    private final void m132592g(String action, String subtotal) {
        InterfaceC14515a.m41418i(this.analytics, "Universal Cart", action, null, "Universal Cart", null, m132594i(subtotal), 20, null);
    }

    /* JADX INFO: renamed from: h */
    private final void m132593h(String action, String productLabel, int newQuantity, String subtotal) {
        this.analytics.mo41422d("Universal Cart", action, productLabel, "Universal Cart", String.valueOf(newQuantity), m132594i(subtotal));
    }

    /* JADX INFO: renamed from: i */
    private final Map<String, Object> m132594i(String subtotal) {
        return subtotal != null ? AbstractC31061c.m95645u("subtotal", subtotal) : C25272z.f99163w;
    }

    /* JADX INFO: renamed from: a */
    public final void m132595a(InterfaceC13383c.h event, String subtotal) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof InterfaceC13383c.g)) {
            if (event instanceof InterfaceC13383c.f) {
                m132590d(((InterfaceC13383c.f) event).getProductLabel(), 0, subtotal);
                return;
            } else {
                if (!(event instanceof InterfaceC13383c.e) && !(event instanceof InterfaceC13383c.b) && !(event instanceof InterfaceC13383c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        InterfaceC13383c.g gVar = (InterfaceC13383c.g) event;
        int i13 = a.f176316a[gVar.getDirection().ordinal()];
        if (i13 == 1) {
            m132591e(gVar.getProductLabel(), gVar.getQuantity(), subtotal);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m132590d(gVar.getProductLabel(), gVar.getQuantity(), subtotal);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m132596b(String subtotal) {
        m132592g("click_checkout", subtotal);
    }

    /* JADX INFO: renamed from: c */
    public final void m132597c(String subtotal) {
        m132592g("click_keep_shopping", subtotal);
    }

    /* JADX INFO: renamed from: f */
    public final void m132598f(String subtotal) {
        m132592g(ProfileAnalyticsKt.VIEW, subtotal);
    }
}
