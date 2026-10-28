package a32;

import androidx.core.app.NotificationCompat;
import com.whoop.metrics.domain.models.MetricPostType;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jy1.C22047a;
import live.hms.video.media.tracks.HMSTrackSource;
import n83.C26460c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: a32.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ)\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u000bJ/\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"La32/c;", "", "<init>", "()V", "", HMSTrackSource.SCREEN, "Ljy1/a;", "b", "(Ljava/lang/String;)Ljy1/a;", "paymentMethodType", "a", "(Ljava/lang/String;Ljava/lang/String;)Ljy1/a;", "", "success", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Z)Ljy1/a;", "g", NotificationCompat.CATEGORY_STATUS, "errorType", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljy1/a;", "endpoint", "d", "", "statusCode", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Ljy1/a;", "", "latencyMs", "f", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljy1/a;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0348c {

    /* JADX INFO: renamed from: a */
    public static final C0348c f1219a = new C0348c();

    private C0348c() {
    }

    /* JADX INFO: renamed from: a */
    public final C22047a m901a(String screen, String paymentMethodType) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(paymentMethodType, "paymentMethodType");
        return new C22047a(0, "mobile.payment.paymentMethodSelected", null, AbstractC37056f.m118959K("screen:".concat(screen), "payment_method_type:".concat(paymentMethodType)), MetricPostType.COUNT, 5, null);
    }

    /* JADX INFO: renamed from: b */
    public final C22047a m902b(String screen) {
        AbstractC22676k.m65750j(screen, "screen");
        return new C22047a(0, "mobile.payment.paymentOptionsOpen", null, AbstractC37056f.m118958J("screen:".concat(screen)), MetricPostType.COUNT, 5, null);
    }

    /* JADX INFO: renamed from: c */
    public final C22047a m903c(String screen, String endpoint, String errorType, Integer statusCode) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(endpoint, "endpoint");
        AbstractC22676k.m65750j(errorType, "errorType");
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.add("endpoint:".concat(endpoint));
        c26460cM119000x.add("error_type:".concat(errorType));
        if (statusCode != null) {
            c26460cM119000x.add("status_code:" + statusCode.intValue());
        }
        c26460cM119000x.add("screen:".concat(screen));
        return new C22047a(0, "mobile.payment.update.api.error", null, AbstractC37056f.m118988k(c26460cM119000x), MetricPostType.COUNT, 5, null);
    }

    /* JADX INFO: renamed from: d */
    public final C22047a m904d(String screen, String endpoint) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(endpoint, "endpoint");
        return new C22047a(0, "mobile.payment.update.api.success", null, AbstractC37056f.m118959K("endpoint:".concat(endpoint), "screen:".concat(screen)), MetricPostType.COUNT, 5, null);
    }

    /* JADX INFO: renamed from: e */
    public final C22047a m905e(String screen, String status, String errorType) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(status, "status");
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.add("screen:".concat(screen));
        c26460cM119000x.add("status:".concat(status));
        if (errorType != null) {
            c26460cM119000x.add("error_type:".concat(errorType));
        }
        return new C22047a(0, "mobile.payment.setupIntent.clientTerminal", null, AbstractC37056f.m118988k(c26460cM119000x), MetricPostType.COUNT, 5, null);
    }

    /* JADX INFO: renamed from: f */
    public final C22047a m906f(String screen, String status, long latencyMs, String errorType) {
        AbstractC22676k.m65750j(screen, "screen");
        AbstractC22676k.m65750j(status, "status");
        Double dValueOf = Double.valueOf(latencyMs);
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.add("screen:".concat(screen));
        c26460cM119000x.add("status:".concat(status));
        if (errorType != null) {
            c26460cM119000x.add("error_type:".concat(errorType));
        }
        return new C22047a(0, "mobile.payment.setupIntent.clientTerminal", dValueOf, AbstractC37056f.m118988k(c26460cM119000x), MetricPostType.HISTOGRAM, 1, null);
    }

    /* JADX INFO: renamed from: g */
    public final C22047a m907g(String screen) {
        AbstractC22676k.m65750j(screen, "screen");
        return new C22047a(0, "mobile.payment.setupIntent.confirmAttempt", null, AbstractC37056f.m118958J("screen:".concat(screen)), MetricPostType.COUNT, 5, null);
    }

    /* JADX INFO: renamed from: h */
    public final C22047a m908h(String screen, boolean success) {
        AbstractC22676k.m65750j(screen, "screen");
        return new C22047a(0, "mobile.payment.setupIntent.created", null, AbstractC37056f.m118959K("screen:".concat(screen), "status:".concat(success ? "success" : "failure")), MetricPostType.COUNT, 5, null);
    }
}
