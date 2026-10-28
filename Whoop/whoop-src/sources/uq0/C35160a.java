package uq0;

import com.whoop.community.share.WidgetCollectionName;
import com.whoop.service.network.model.UserState;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: uq0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Luq0/a;", "", "<init>", "()V", "", "collectionName", "Lcom/whoop/community/share/WidgetCollectionName;", "a", "(Ljava/lang/String;)Lcom/whoop/community/share/WidgetCollectionName;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35160a {

    /* JADX INFO: renamed from: a */
    public static final C35160a f149232a = new C35160a();

    private C35160a() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final WidgetCollectionName m111267a(String collectionName) {
        if (collectionName != null) {
            switch (collectionName.hashCode()) {
                case -891993739:
                    if (collectionName.equals("strain")) {
                        return WidgetCollectionName.STRAIN;
                    }
                    break;
                case -799113323:
                    if (collectionName.equals("recovery")) {
                        return WidgetCollectionName.RECOVERY;
                    }
                    break;
                case -604400809:
                    if (collectionName.equals("overview_trend")) {
                        return WidgetCollectionName.OVERVIEW_TREND;
                    }
                    break;
                case -502400429:
                    if (collectionName.equals("strain_trend")) {
                        return WidgetCollectionName.STRAIN_TREND;
                    }
                    break;
                case 109522647:
                    if (collectionName.equals(UserState.States.SLEEP)) {
                        return WidgetCollectionName.SLEEP;
                    }
                    break;
                case 530115961:
                    if (collectionName.equals("overview")) {
                        return WidgetCollectionName.OVERVIEW;
                    }
                    break;
                case 972871221:
                    if (collectionName.equals("sleep_trend")) {
                        return WidgetCollectionName.SLEEP_TREND;
                    }
                    break;
                case 1006116979:
                    if (collectionName.equals("recovery_trend")) {
                        return WidgetCollectionName.RECOVERY_TREND;
                    }
                    break;
            }
        }
        return WidgetCollectionName.OVERVIEW;
    }
}
