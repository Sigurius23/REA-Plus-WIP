package t22;

import com.whoop.metrics.domain.models.MetricPostType;
import jy1.C22047a;
import n83.C26460c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: t22.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lt22/d;", "", "<init>", "()V", "Ljy1/a;", "b", "()Ljy1/a;", "", "errorType", "", "statusCode", "a", "(Ljava/lang/String;Ljava/lang/Integer;)Ljy1/a;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33354d {

    /* JADX INFO: renamed from: a */
    public static final C33354d f139173a = new C33354d();

    private C33354d() {
    }

    /* JADX INFO: renamed from: a */
    public final C22047a m105785a(String errorType, Integer statusCode) {
        AbstractC22676k.m65750j(errorType, "errorType");
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.add("endpoint:bff_screen");
        c26460cM119000x.add("error_type:".concat(errorType));
        if (statusCode != null) {
            c26460cM119000x.add("status_code:" + statusCode.intValue());
        }
        return new C22047a(0, "mobile.payment.update.api.error", null, AbstractC37056f.m118988k(c26460cM119000x), MetricPostType.COUNT, 5, null);
    }

    /* JADX INFO: renamed from: b */
    public final C22047a m105786b() {
        return new C22047a(0, "mobile.payment.update.api.success", null, AbstractC37056f.m118958J("endpoint:bff_screen"), MetricPostType.COUNT, 5, null);
    }
}
