package g72;

import c13.AbstractC3855a;
import com.whoop.sage.onboarding.domain.models.ManualBloodPressureReadingInput;
import j72.EnumC21402g;
import java.util.List;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: g72.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004¢\u0006\u0004\b\n\u0010\u000bJL\u0010\f\u001a\u00020\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, m65681d2 = {"Lg72/f;", "", "", "Lj72/g;", "", "", "answers", "Lcom/whoop/sage/onboarding/domain/models/ManualBloodPressureReadingInput;", "manualBloodPressureReadings", "screensCheckboxed", "<init>", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "a", "(Ljava/util/Map;Ljava/util/List;Ljava/util/List;)Lg72/f;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C15552f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Map<EnumC21402g, List<String>> answers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<ManualBloodPressureReadingInput> manualBloodPressureReadings;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<EnumC21402g> screensCheckboxed;

    /* JADX WARN: Multi-variable type inference failed */
    public C15552f(Map<EnumC21402g, ? extends List<String>> answers, List<ManualBloodPressureReadingInput> manualBloodPressureReadings, List<? extends EnumC21402g> screensCheckboxed) {
        AbstractC22676k.m65750j(answers, "answers");
        AbstractC22676k.m65750j(manualBloodPressureReadings, "manualBloodPressureReadings");
        AbstractC22676k.m65750j(screensCheckboxed, "screensCheckboxed");
        this.answers = answers;
        this.manualBloodPressureReadings = manualBloodPressureReadings;
        this.screensCheckboxed = screensCheckboxed;
    }

    /* JADX INFO: renamed from: a */
    public final C15552f m43784a(Map<EnumC21402g, ? extends List<String>> answers, List<ManualBloodPressureReadingInput> manualBloodPressureReadings, List<? extends EnumC21402g> screensCheckboxed) {
        AbstractC22676k.m65750j(answers, "answers");
        AbstractC22676k.m65750j(manualBloodPressureReadings, "manualBloodPressureReadings");
        AbstractC22676k.m65750j(screensCheckboxed, "screensCheckboxed");
        return new C15552f(answers, manualBloodPressureReadings, screensCheckboxed);
    }

    /* JADX INFO: renamed from: b */
    public final Map<EnumC21402g, List<String>> m43785b() {
        return this.answers;
    }

    /* JADX INFO: renamed from: c */
    public final List<ManualBloodPressureReadingInput> m43786c() {
        return this.manualBloodPressureReadings;
    }

    /* JADX INFO: renamed from: d */
    public final List<EnumC21402g> m43787d() {
        return this.screensCheckboxed;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15552f)) {
            return false;
        }
        C15552f c15552f = (C15552f) other;
        return AbstractC22676k.m65745e(this.answers, c15552f.answers) && AbstractC22676k.m65745e(this.manualBloodPressureReadings, c15552f.manualBloodPressureReadings) && AbstractC22676k.m65745e(this.screensCheckboxed, c15552f.screensCheckboxed);
    }

    public int hashCode() {
        return this.screensCheckboxed.hashCode() + AbstractC11895b.m31983b(this.answers.hashCode() * 31, 31, this.manualBloodPressureReadings);
    }

    public String toString() {
        Map<EnumC21402g, List<String>> map = this.answers;
        List<ManualBloodPressureReadingInput> list = this.manualBloodPressureReadings;
        List<EnumC21402g> list2 = this.screensCheckboxed;
        StringBuilder sb4 = new StringBuilder("SageOnboardingSaveData(answers=");
        sb4.append(map);
        sb4.append(", manualBloodPressureReadings=");
        sb4.append(list);
        sb4.append(", screensCheckboxed=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C15552f(Map map, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        map = (i13 & 1) != 0 ? C25272z.f99163w : map;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(map, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2);
    }
}
