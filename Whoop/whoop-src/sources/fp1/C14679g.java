package fp1;

import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fp1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lfp1/g;", "", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "currentScreen", "", "visitedScreens", "<init>", "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "b", "Ljava/util/List;", "()Ljava/util/List;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14679g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HormonalScreenId currentScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<HormonalScreenId> visitedScreens;

    /* JADX WARN: Multi-variable type inference failed */
    public C14679g(HormonalScreenId currentScreen, List<? extends HormonalScreenId> visitedScreens) {
        AbstractC22676k.m65750j(currentScreen, "currentScreen");
        AbstractC22676k.m65750j(visitedScreens, "visitedScreens");
        this.currentScreen = currentScreen;
        this.visitedScreens = visitedScreens;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final HormonalScreenId getCurrentScreen() {
        return this.currentScreen;
    }

    /* JADX INFO: renamed from: b */
    public final List<HormonalScreenId> m41990b() {
        return this.visitedScreens;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14679g)) {
            return false;
        }
        C14679g c14679g = (C14679g) other;
        return this.currentScreen == c14679g.currentScreen && AbstractC22676k.m65745e(this.visitedScreens, c14679g.visitedScreens);
    }

    public int hashCode() {
        return this.visitedScreens.hashCode() + (this.currentScreen.hashCode() * 31);
    }

    public String toString() {
        return "PostPartumProgressResult(currentScreen=" + this.currentScreen + ", visitedScreens=" + this.visitedScreens + ")";
    }
}
