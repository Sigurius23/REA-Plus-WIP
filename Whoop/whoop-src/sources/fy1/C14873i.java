package fy1;

import com.whoop.metrics.common.ScreenState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fy1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lfy1/i;", "Lfy1/l;", "<init>", "()V", "", "screenTag", "Lcom/whoop/metrics/common/ScreenState;", "state", "Ll83/a0;", "a", "(Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;)V", "", "durationNanos", "b", "(Ljava/lang/String;J)V", "metrics-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14873i implements InterfaceC14876l {

    /* JADX INFO: renamed from: a */
    public static final C14873i f55508a = new C14873i();

    /* JADX INFO: renamed from: b */
    public static final int f55509b = 0;

    private C14873i() {
    }

    @Override // fy1.InterfaceC14876l
    /* JADX INFO: renamed from: a */
    public void mo42900a(String screenTag, ScreenState state) {
        AbstractC22676k.m65750j(screenTag, "screenTag");
        AbstractC22676k.m65750j(state, "state");
    }

    @Override // fy1.InterfaceC14876l
    /* JADX INFO: renamed from: b */
    public void mo42901b(String screenTag, long durationNanos) {
        AbstractC22676k.m65750j(screenTag, "screenTag");
    }
}
