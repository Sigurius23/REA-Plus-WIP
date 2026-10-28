package a03;

import fi0.InterfaceC14515a;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: a03.b */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Ja\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"La03/b;", "", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "", "eventName", "category", "action", "label", "value", "", "otherProperties", "Ll83/a0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "source", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "Lfi0/a;", "b", "whoop-status_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0099b {

    /* JADX INFO: renamed from: c */
    public static final int f313c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    public C0099b(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: a */
    private final void m268a(String eventName, String category, String action, String label, String value, Map<String, ? extends Object> otherProperties) {
        this.baseAnalytics.mo41422d(category, action, label, eventName, value, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m269b(C0099b c0099b, String str, String str2, String str3, String str4, String str5, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            str4 = null;
        }
        if ((i13 & 16) != 0) {
            str5 = null;
        }
        if ((i13 & 32) != 0) {
            map = null;
        }
        c0099b.m268a(str, str2, str3, str4, str5, map);
    }

    /* JADX INFO: renamed from: c */
    public final void m270c(String source, String action) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(action, "action");
        m269b(this, "Server Alert", null, action, "Maintenance", null, AbstractC31061c.m95645u("Source", source), 18, null);
    }
}
