package mp0;

import com.whoop.design.util.TextResource;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mp0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lmp0/a;", "", "", "isAlarmEnabled", "Lmp0/m;", "loadingStates", "Ll83/k;", "Lcom/whoop/design/util/TextResource;", "pairOfTitleAndDescription", "<init>", "(ZLmp0/m;Ll83/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lmp0/m;", "()Lmp0/m;", "Ll83/k;", "()Ll83/k;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C25814a {

    /* JADX INFO: renamed from: d */
    public static final int f101565d = TextResource.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isAlarmEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EnumC25840m loadingStates;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C23465k pairOfTitleAndDescription;

    public C25814a(boolean z4, EnumC25840m loadingStates, C23465k c23465k) {
        AbstractC22676k.m65750j(loadingStates, "loadingStates");
        this.isAlarmEnabled = z4;
        this.loadingStates = loadingStates;
        this.pairOfTitleAndDescription = c23465k;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC25840m getLoadingStates() {
        return this.loadingStates;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C23465k getPairOfTitleAndDescription() {
        return this.pairOfTitleAndDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsAlarmEnabled() {
        return this.isAlarmEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C25814a)) {
            return false;
        }
        C25814a c25814a = (C25814a) other;
        return this.isAlarmEnabled == c25814a.isAlarmEnabled && this.loadingStates == c25814a.loadingStates && AbstractC22676k.m65745e(this.pairOfTitleAndDescription, c25814a.pairOfTitleAndDescription);
    }

    public int hashCode() {
        int iHashCode = (this.loadingStates.hashCode() + (Boolean.hashCode(this.isAlarmEnabled) * 31)) * 31;
        C23465k c23465k = this.pairOfTitleAndDescription;
        return iHashCode + (c23465k == null ? 0 : c23465k.hashCode());
    }

    public String toString() {
        return "AlarmLoadingViewState(isAlarmEnabled=" + this.isAlarmEnabled + ", loadingStates=" + this.loadingStates + ", pairOfTitleAndDescription=" + this.pairOfTitleAndDescription + ")";
    }
}
