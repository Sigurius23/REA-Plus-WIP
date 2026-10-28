package ug2;

import a12.AbstractC0142b;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ug2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lug2/a;", "", "<init>", "()V", "", "path", "Lcom/whoop/design/item/DesignItemInteraction;", "a", "(Ljava/lang/String;)Lcom/whoop/design/item/DesignItemInteraction;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34948a {

    /* JADX INFO: renamed from: a */
    public static final C34948a f147897a = new C34948a();

    private C34948a() {
    }

    /* JADX INFO: renamed from: a */
    public final DesignItemInteraction m110399a(String path) {
        AbstractC22676k.m65750j(path, "path");
        return new DesignItemInteraction(null, new AnalyticEventModel("Track Activity", "", (String) null, "target_load_error", AbstractC0142b.m360e(path).m354b().get("activityType"), (String) null, (Map) null, 100, (DefaultConstructorMarker) null));
    }
}
