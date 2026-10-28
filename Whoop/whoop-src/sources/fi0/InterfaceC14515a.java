package fi0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: fi0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\tH&¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0011\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015Jw\u0010\u001a\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH&¢\u0006\u0004\b\u001a\u0010\u001bJc\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH&¢\u0006\u0004\b\u001c\u0010\u001dJO\u0010\u001e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0002H&¢\u0006\u0004\b$\u0010\u0004¨\u0006%À\u0006\u0003"}, m65681d2 = {"Lfi0/a;", "", "Ll83/a0;", "b", "()V", "", "screenName", "g", "(Ljava/lang/String;)V", "", "extraData", "e", "(Ljava/lang/String;Ljava/util/Map;)V", "category", "action", "label", "eventName", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "value", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "maximVersion", "nordicVersion", "strapGeneration", "otherProperties", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "force", "j", "(Z)V", "a", "analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC14515a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    static /* synthetic */ void m41418i(InterfaceC14515a interfaceC14515a, String str, String str2, String str3, String str4, String str5, Map map, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onEvent");
        }
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 16) != 0) {
            str5 = null;
        }
        if ((i13 & 32) != 0) {
            map = null;
        }
        interfaceC14515a.mo41422d(str, str2, str3, str4, str5, map);
    }

    /* JADX INFO: renamed from: a */
    void mo41419a();

    /* JADX INFO: renamed from: b */
    void mo41420b();

    /* JADX INFO: renamed from: c */
    void mo41421c(String eventName, String category, String maximVersion, String nordicVersion, String strapGeneration, String action, String label, String value, Map<String, ? extends Object> otherProperties);

    /* JADX INFO: renamed from: d */
    void mo41422d(String category, String action, String label, String eventName, String value, Map<String, ? extends Object> otherProperties);

    /* JADX INFO: renamed from: e */
    void mo41423e(String screenName, Map<String, ? extends Object> extraData);

    /* JADX INFO: renamed from: f */
    void mo41424f(String category, String action, String label, String eventName);

    /* JADX INFO: renamed from: g */
    void mo41425g(String screenName);

    /* JADX INFO: renamed from: h */
    void mo41426h(String category, String action, String label, String eventName, String value);

    /* JADX INFO: renamed from: j */
    void mo41427j(boolean force);

    /* JADX INFO: renamed from: k */
    void mo41428k(String category, String action, String label, String eventName, Map<String, ? extends Object> otherProperties);
}
