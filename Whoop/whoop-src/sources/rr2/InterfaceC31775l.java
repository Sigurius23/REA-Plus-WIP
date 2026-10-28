package rr2;

import androidx.core.app.NotificationCompat;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.C20315e;
import io.sentry.protocol.C20481h0;
import java.util.LinkedHashMap;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rr2.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0011\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\fH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b!\u0010\"J+\u0010#\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b#\u0010$R\u0016\u0010(\u001a\u0004\u0018\u00010%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)À\u0006\u0003"}, m65681d2 = {"Lrr2/l;", "", "Lkotlin/Function1;", "Lio/sentry/b1;", "Ll83/a0;", "scopeCallback", "i", "(Lkotlin/jvm/functions/Function1;)V", "Lio/sentry/e;", "breadcrumb", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lio/sentry/e;)V", "", "from", "to", "", "additionalData", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "tag", "d", "(Ljava/lang/String;Ljava/util/Map;)V", "Lio/sentry/protocol/h0;", UserState.Sources.USER, "e", "(Lio/sentry/protocol/h0;)V", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;)V", "", "throwable", "g", "(Ljava/lang/Throwable;)V", "a", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", "", "f", "()Ljava/lang/Boolean;", "crashedLastRun", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC31775l {
    /* JADX INFO: renamed from: a */
    void mo98654a(Throwable throwable, Function1 scopeCallback);

    /* JADX INFO: renamed from: b */
    void mo98655b(String tag);

    /* JADX INFO: renamed from: c */
    void mo98656c(String tag, String value);

    /* JADX INFO: renamed from: d */
    default void mo98657d(String tag, Map<String, String> additionalData) {
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(additionalData, "additionalData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : additionalData.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        mo98661h(C20315e.m56468d("click", null, null, tag, linkedHashMap));
    }

    /* JADX INFO: renamed from: e */
    void mo98658e(C20481h0 user);

    /* JADX INFO: renamed from: f */
    Boolean mo98659f();

    /* JADX INFO: renamed from: g */
    void mo98660g(Throwable throwable);

    /* JADX INFO: renamed from: h */
    void mo98661h(C20315e breadcrumb);

    /* JADX INFO: renamed from: i */
    void mo98662i(Function1 scopeCallback);

    /* JADX INFO: renamed from: j */
    default void mo98663j(String from, String to3, Map<String, ? extends Object> additionalData) {
        AbstractC22676k.m65750j(to3, "to");
        AbstractC22676k.m65750j(additionalData, "additionalData");
        if (from == null) {
            from = "";
        }
        C20315e c20315e = new C20315e();
        c20315e.f76288G = NotificationCompat.CATEGORY_NAVIGATION;
        c20315e.f76286E = NotificationCompat.CATEGORY_NAVIGATION;
        c20315e.m56470c(from, "from");
        c20315e.m56470c(to3, "to");
        if (from.length() == 0) {
            c20315e.f76287F.remove("from");
        }
        for (Map.Entry<String, ? extends Object> entry : additionalData.entrySet()) {
            c20315e.m56470c(entry.getValue(), entry.getKey());
        }
        mo98661h(c20315e);
    }
}
