package ey1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ey1.j */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\b\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, m65681d2 = {"Ley1/j;", "", "", "value", "<init>", "(Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "d", "Ley1/j$a;", "Ley1/j$b;", "Ley1/j$c;", "Ley1/j$d;", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13753j extends Throwable {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: ey1.j$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ley1/j$a;", "Ley1/j;", "<init>", "()V", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC13753j {

        /* JADX INFO: renamed from: x */
        public static final a f49047x = new a();

        private a() {
            super("command_failed_according_to_strap", null);
        }
    }

    /* JADX INFO: renamed from: ey1.j$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ley1/j$b;", "Ley1/j;", "<init>", "()V", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC13753j {

        /* JADX INFO: renamed from: x */
        public static final b f49048x = new b();

        private b() {
            super("ran_Alarm_but_failed_to_add_id_to_DB", null);
        }
    }

    /* JADX INFO: renamed from: ey1.j$c */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ley1/j$c;", "Ley1/j;", "<init>", "()V", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC13753j {

        /* JADX INFO: renamed from: x */
        public static final c f49049x = new c();

        private c() {
            super("poll_call_failed", null);
        }
    }

    /* JADX INFO: renamed from: ey1.j$d */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ley1/j$d;", "Ley1/j;", "<init>", "()V", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC13753j {

        /* JADX INFO: renamed from: x */
        public static final d f49050x = new d();

        private d() {
            super("retriggering_smart_alarm", null);
        }
    }

    public /* synthetic */ AbstractC13753j(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    private AbstractC13753j(String str) {
        this.value = str;
    }
}
