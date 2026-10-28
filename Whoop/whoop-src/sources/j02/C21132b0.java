package j02;

import ad3.AbstractC0757c;
import ad3.C0764g;
import android.os.Bundle;
import com.whoop.analytics.MetricEventModel;
import java.net.URLDecoder;
import l83.C23454a0;
import or2.AbstractC28188o1;
import p505ts.AbstractC34132o;
import p710im1.C18689p0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j02.b0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lj02/b0;", "", "Lad3/c;", "json", "<init>", "(Lad3/c;)V", "Landroid/os/Bundle;", "arguments", "Lcom/whoop/analytics/MetricEventModel;", "c", "(Landroid/os/Bundle;)Lcom/whoop/analytics/MetricEventModel;", "a", "Lad3/c;", "b", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21132b0 {

    /* JADX INFO: renamed from: c */
    public static final int f80197c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC0757c json;

    public C21132b0(AbstractC0757c json) {
        AbstractC22676k.m65750j(json, "json");
        this.json = json;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m58966b(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2776c = true;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final MetricEventModel m58967c(Bundle arguments) {
        String string;
        String strM85315e;
        if (arguments != null && (string = arguments.getString("metricEvents")) != null && (strM85315e = AbstractC28188o1.m85315e(string)) != null) {
            try {
                String strDecode = URLDecoder.decode(strM85315e, "UTF-8");
                if (strDecode != null) {
                    AbstractC0757c abstractC0757c = this.json;
                    abstractC0757c.getClass();
                    return (MetricEventModel) abstractC0757c.m1831b(MetricEventModel.INSTANCE.serializer(), strDecode);
                }
            } catch (IllegalArgumentException | Exception unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C21132b0(AbstractC0757c abstractC0757c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            abstractC0757c = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C18689p0(20));
        }
        this(abstractC0757c);
    }
}
