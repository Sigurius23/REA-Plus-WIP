package ti1;

import java.util.List;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ti1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B!\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\r¨\u0006\u001a"}, m65681d2 = {"Lti1/b;", "", "", "Lti1/e;", "tabs", "", "initialTabIndex", "<init>", "(Ljava/util/List;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "b", "I", "getInitialTabIndex", "c", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C33850b {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    public static final int f141760d = 8;

    /* JADX INFO: renamed from: e */
    private static final C33850b f141761e;

    /* JADX INFO: renamed from: f */
    private static final C33850b f141762f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<EnumC33853e> tabs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int initialTabIndex;

    /* JADX INFO: renamed from: ti1.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lti1/b$a;", "", "<init>", "()V", "Lti1/b;", "LegacyMonitorOnly", "Lti1/b;", "a", "()Lti1/b;", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C33850b m107051a() {
            return C33850b.f141762f;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i13 = 0;
        f141761e = new C33850b(AbstractC37056f.m118958J(EnumC33853e.LastNight), i13, 2, 0 == true ? 1 : 0);
        f141762f = new C33850b(0 == true ? 1 : 0, i13, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33850b(List<? extends EnumC33853e> tabs, int i13) {
        AbstractC22676k.m65750j(tabs, "tabs");
        this.tabs = tabs;
        this.initialTabIndex = i13;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C33850b)) {
            return false;
        }
        C33850b c33850b = (C33850b) other;
        return AbstractC22676k.m65745e(this.tabs, c33850b.tabs) && this.initialTabIndex == c33850b.initialTabIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.initialTabIndex) + (this.tabs.hashCode() * 31);
    }

    public String toString() {
        return "HealthMonitorWrapperViewState(tabs=" + this.tabs + ", initialTabIndex=" + this.initialTabIndex + ")";
    }

    public /* synthetic */ C33850b(List list, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? C25271y.f99162w : list, (i14 & 2) != 0 ? 0 : i13);
    }
}
