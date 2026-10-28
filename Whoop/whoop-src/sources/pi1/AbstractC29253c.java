package pi1;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: pi1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0001\t¨\u0006\n"}, m65681d2 = {"Lpi1/c;", "", "Lpi1/e;", "data", "<init>", "(Lpi1/e;)V", "a", "Lpi1/e;", "()Lpi1/e;", "Lpi1/c$a;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29253c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C29255e data;

    /* JADX INFO: renamed from: pi1.c$a */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lpi1/c$a;", "Lpi1/c;", "", "source", "<init>", "(Ljava/lang/String;)V", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC29253c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String source) {
            super(new C29255e(ProfileAnalyticsKt.VIEW, "Heart Screener", null, null, null, AbstractC31061c.m95645u("source", source), "Heart Screener", 28, null), null);
            AbstractC22676k.m65750j(source, "source");
        }
    }

    public /* synthetic */ AbstractC29253c(C29255e c29255e, DefaultConstructorMarker defaultConstructorMarker) {
        this(c29255e);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C29255e getData() {
        return this.data;
    }

    private AbstractC29253c(C29255e c29255e) {
        this.data = c29255e;
    }
}
