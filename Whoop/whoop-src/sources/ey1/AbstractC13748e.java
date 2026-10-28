package ey1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ey1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m65681d2 = {"Ley1/e;", "", "", "errorDescription", "<init>", "(Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "b", "Ley1/e$a;", "Ley1/e$b;", "Ley1/e$c;", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13748e extends Throwable {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String errorDescription;

    /* JADX INFO: renamed from: ey1.e$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ley1/e$a;", "Ley1/e;", "<init>", "()V", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC13748e {

        /* JADX INFO: renamed from: x */
        public static final a f49043x = new a();

        private a() {
            super("could_not_disable_strap", null);
        }
    }

    /* JADX INFO: renamed from: ey1.e$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ley1/e$b;", "Ley1/e;", "<init>", "()V", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC13748e {

        /* JADX INFO: renamed from: x */
        public static final b f49044x = new b();

        private b() {
            super("failed_to_sync_timezone", null);
        }
    }

    /* JADX INFO: renamed from: ey1.e$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ley1/e$c;", "Ley1/e;", "<init>", "()V", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC13748e {

        /* JADX INFO: renamed from: x */
        public static final c f49045x = new c();

        private c() {
            super("failed_to_update_strap_to_new_alarm_preferences", null);
        }
    }

    public /* synthetic */ AbstractC13748e(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    private AbstractC13748e(String str) {
        this.errorDescription = str;
    }
}
