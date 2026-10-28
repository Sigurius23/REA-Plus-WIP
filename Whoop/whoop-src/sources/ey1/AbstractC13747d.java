package ey1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ey1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\n¨\u0006\u000b"}, m65681d2 = {"Ley1/d;", "", "", "value", "<init>", "(Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ley1/d$a;", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13747d extends Throwable {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final String value;

    /* JADX INFO: renamed from: ey1.d$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ley1/d$a;", "Ley1/d;", "<init>", "()V", "metrics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC13747d {

        /* JADX INFO: renamed from: x */
        public static final a f49041x = new a();

        private a() {
            super("call_succeeded_but_command_result_failed", null);
        }
    }

    public /* synthetic */ AbstractC13747d(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    private AbstractC13747d(String str) {
        this.value = str;
    }
}
