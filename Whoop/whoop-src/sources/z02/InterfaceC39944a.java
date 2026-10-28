package z02;

import com.whoop.network.request.HttpTimeoutConfig;
import i63.AbstractC18157a;
import i63.AbstractC18158a0;
import i63.C18181t;
import i63.C18185x;
import i63.C18187z;
import io.getstream.chat.android.client.api.QueryParams;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import m83.C25272z;
import p014aj.C0928c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr2.AbstractC32943y;

/* JADX INFO: renamed from: z02.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\t¨\u0006\"À\u0006\u0003"}, m65681d2 = {"Lz02/a;", "T", "", "Lsr2/y;", "baseProvider", "", QueryParams.URL, "(Lsr2/y;)Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "path", "Li63/t;", "getMethod", "()Li63/t;", "method", "", "getParameters", "()Ljava/util/Map;", "parameters", "getBody", "()Ljava/lang/Object;", "body", "", "getHasBody", "()Z", "hasBody", "getHeaders", "headers", "Lcom/whoop/network/request/HttpTimeoutConfig;", "getHttpTimeoutConfig", "()Lcom/whoop/network/request/HttpTimeoutConfig;", "httpTimeoutConfig", "getTag", "tag", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC39944a<T> {
    T getBody();

    boolean getHasBody();

    default Map<String, String> getHeaders() {
        return C25272z.f99163w;
    }

    default HttpTimeoutConfig getHttpTimeoutConfig() {
        return null;
    }

    C18181t getMethod();

    default Map<String, String> getParameters() {
        return C25272z.f99163w;
    }

    String getPath();

    default String getTag() {
        return AbstractC22671h0.f89337a.getOrCreateKotlinClass(getClass()).getSimpleName();
    }

    default String url(AbstractC32943y baseProvider) {
        AbstractC22676k.m65750j(baseProvider, "baseProvider");
        String urlString = baseProvider.getApiBaseUrl();
        AbstractC22676k.m65750j(urlString, "urlString");
        C18187z c18187z = new C18187z();
        AbstractC18158a0.m52160b(c18187z, urlString);
        String[] strArr = {getPath()};
        ArrayList arrayList = new ArrayList(1);
        String str = strArr[0];
        Set set = AbstractC18157a.f70461a;
        AbstractC22676k.m65750j(str, "<this>");
        arrayList.add(AbstractC18157a.m52157g(str, false));
        c18187z.f70541h = arrayList;
        for (Map.Entry<String, String> entry : getParameters().entrySet()) {
            String name = entry.getKey();
            String value = entry.getValue();
            C0928c c0928c = c18187z.f70543j;
            c0928c.getClass();
            AbstractC22676k.m65750j(name, "name");
            AbstractC22676k.m65750j(value, "value");
            ((C18185x) c0928c.f3421x).m2422s0(AbstractC18157a.m52156f(name, false), AbstractC18157a.m52156f(value, true));
        }
        return c18187z.m52177c();
    }
}
