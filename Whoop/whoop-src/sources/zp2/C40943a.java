package zp2;

import ih0.AbstractC18489d0;
import java.util.List;
import kz0.C22920a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zp2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, m65681d2 = {"Lzp2/a;", "", "", "Lkz0/a;", "sections", "", "currentSectionIndex", "currentStepInSection", "<init>", "(Ljava/util/List;II)V", "a", "(Ljava/util/List;II)Lzp2/a;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "I", "getCurrentStepInSection", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40943a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<C22920a> sections;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int currentSectionIndex;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int currentStepInSection;

    public C40943a(List<C22920a> sections, int i13, int i14) {
        AbstractC22676k.m65750j(sections, "sections");
        this.sections = sections;
        this.currentSectionIndex = i13;
        this.currentStepInSection = i14;
    }

    /* JADX INFO: renamed from: a */
    public final C40943a m132857a(List<C22920a> sections, int currentSectionIndex, int currentStepInSection) {
        AbstractC22676k.m65750j(sections, "sections");
        return new C40943a(sections, currentSectionIndex, currentStepInSection);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCurrentSectionIndex() {
        return this.currentSectionIndex;
    }

    /* JADX INFO: renamed from: c */
    public final List<C22920a> m132859c() {
        return this.sections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40943a)) {
            return false;
        }
        C40943a c40943a = (C40943a) other;
        return AbstractC22676k.m65745e(this.sections, c40943a.sections) && this.currentSectionIndex == c40943a.currentSectionIndex && this.currentStepInSection == c40943a.currentStepInSection;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentStepInSection) + AbstractC11266d.m30448b(this.currentSectionIndex, this.sections.hashCode() * 31, 31);
    }

    public String toString() {
        List<C22920a> list = this.sections;
        int i13 = this.currentSectionIndex;
        int i14 = this.currentStepInSection;
        StringBuilder sb4 = new StringBuilder("SectionProgressState(sections=");
        sb4.append(list);
        sb4.append(", currentSectionIndex=");
        sb4.append(i13);
        sb4.append(", currentStepInSection=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }
}
