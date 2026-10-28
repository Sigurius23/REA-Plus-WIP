package kp0;

import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: kp0.o */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u001b\b\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m65681d2 = {"Lkp0/o;", "", "", "value", "Lcom/whoop/design/util/TextResource;", "textResource", "<init>", "(Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "x", "Lcom/whoop/design/util/TextResource;", "b", "()Lcom/whoop/design/util/TextResource;", "Lkp0/d;", "Lkp0/k;", "Lkp0/l;", "Lkp0/m;", "Lkp0/q;", "Lkp0/r;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22748o {

    /* JADX INFO: renamed from: y */
    public static final int f89480y = TextResource.$stable;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Integer value;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final TextResource textResource;

    public /* synthetic */ AbstractC22748o(Integer num, TextResource textResource, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, textResource);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextResource getTextResource() {
        return this.textResource;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public Integer getValue() {
        return this.value;
    }

    private AbstractC22748o(Integer num, TextResource textResource) {
        this.value = num;
        this.textResource = textResource;
    }
}
