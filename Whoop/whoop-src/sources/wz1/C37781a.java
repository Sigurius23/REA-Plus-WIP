package wz1;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import h02.C16569e0;
import h02.C16581k0;
import h02.C16593q0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001b\u0010\u000bJ\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u000bJ\u001f\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u000bJ'\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b!\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"¨\u0006#"}, m65681d2 = {"Lwz1/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "productName", "price", "Ll83/a0;", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "", "isOpen", "c", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "imagePosition", "d", "(Ljava/lang/String;Ljava/lang/String;I)V", "", "j", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "source", "analyticsProperties", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "g", "a", "b", "itemEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "e", "Lfi0/a;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37781a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C37781a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: c */
    private final void m121235c(String productName, String price, boolean isOpen) {
        this.analytics.mo41422d("Product Description Page", "Click", "Whoop Your Way Price Breakdown", "In app WHOOP Store", isOpen ? ProfileAnalyticsKt.OPEN : "close", m121238j(productName, price));
    }

    /* JADX INFO: renamed from: d */
    private final void m121236d(String productName, String price, int imagePosition) {
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(m121238j(productName, price));
        linkedHashMapM74003l0.put("Image Position", Integer.valueOf(imagePosition));
        this.analytics.mo41428k("Product Description Page", "Click", "Product Image", "In app WHOOP Store", linkedHashMapM74003l0);
    }

    /* JADX INFO: renamed from: f */
    private final void m121237f(String productName, String price) {
        this.analytics.mo41428k("Product Description Page", "Click", "Size Chart", "In app WHOOP Store", m121238j(productName, price));
    }

    /* JADX INFO: renamed from: j */
    private final Map<String, Object> m121238j(String productName, String price) {
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("Product Name", productName));
        if (price != null) {
            linkedHashMapM73993b0.put("Price", price);
        }
        return linkedHashMapM73993b0;
    }

    /* JADX INFO: renamed from: a */
    public final void m121239a(String productName, String price) {
        AbstractC22676k.m65750j(productName, "productName");
        this.analytics.mo41428k("Product Description Page", "Click", "Add To Cart", "In app WHOOP Store", m121238j(productName, price));
    }

    /* JADX INFO: renamed from: b */
    public final void m121240b(String productName, String price) {
        AbstractC22676k.m65750j(productName, "productName");
        this.analytics.mo41428k("Product Description Page", "Click", "Buy Now", "In app WHOOP Store", m121238j(productName, price));
    }

    /* JADX INFO: renamed from: e */
    public final void m121241e(String productName, String price) {
        AbstractC22676k.m65750j(productName, "productName");
        this.analytics.mo41428k("Product Description Page", "Click", "Shopping Cart", "In app WHOOP Store", m121238j(productName, price));
    }

    /* JADX INFO: renamed from: g */
    public final void m121242g(String productName, String price) {
        AbstractC22676k.m65750j(productName, "productName");
        InterfaceC14515a.m41418i(this.analytics, "Product Description Page", "Dismiss Product Description Page", null, "In app WHOOP Store", null, m121238j(productName, price), 20, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m121243h(Object itemEvent, String productName, String price) {
        AbstractC22676k.m65750j(itemEvent, "itemEvent");
        AbstractC22676k.m65750j(productName, "productName");
        if (itemEvent instanceof C16581k0) {
            m121237f(productName, price);
        } else if (itemEvent instanceof C16569e0) {
            m121236d(productName, price, ((C16569e0) itemEvent).getIndex());
        } else if (itemEvent instanceof C16593q0) {
            m121235c(productName, price, ((C16593q0) itemEvent).getIsOpen());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m121244i(String productName, String price, String source, Map<String, String> analyticsProperties) {
        AbstractC22676k.m65750j(productName, "productName");
        AbstractC22676k.m65750j(analyticsProperties, "analyticsProperties");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(analyticsProperties);
        linkedHashMap.put("Product Name", productName);
        if (price != null) {
            linkedHashMap.put("Price", price);
        }
        if (source != null) {
            linkedHashMap.put("source", source);
        }
        InterfaceC14515a.m41418i(this.analytics, "Product Description Page", "View Product Description Page", null, "In app WHOOP Store", null, linkedHashMap, 20, null);
    }
}
