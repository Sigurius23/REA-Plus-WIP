package fm1;

import c13.AbstractC3855a;
import java.util.List;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fm1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, m65681d2 = {"Lfm1/f;", "", "Lfm1/g;", "pillarType", "", "pillarDisplayName", "", "Lfm1/a;", "componentItems", "<init>", "(Lfm1/g;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfm1/g;", "c", "()Lfm1/g;", "b", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14602f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC14603g pillarType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String pillarDisplayName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<C14597a> componentItems;

    public C14602f(EnumC14603g pillarType, String pillarDisplayName, List<C14597a> componentItems) {
        AbstractC22676k.m65750j(pillarType, "pillarType");
        AbstractC22676k.m65750j(pillarDisplayName, "pillarDisplayName");
        AbstractC22676k.m65750j(componentItems, "componentItems");
        this.pillarType = pillarType;
        this.pillarDisplayName = pillarDisplayName;
        this.componentItems = componentItems;
    }

    /* JADX INFO: renamed from: a */
    public final List<C14597a> m41787a() {
        return this.componentItems;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPillarDisplayName() {
        return this.pillarDisplayName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final EnumC14603g getPillarType() {
        return this.pillarType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14602f)) {
            return false;
        }
        C14602f c14602f = (C14602f) other;
        return this.pillarType == c14602f.pillarType && AbstractC22676k.m65745e(this.pillarDisplayName, c14602f.pillarDisplayName) && AbstractC22676k.m65745e(this.componentItems, c14602f.componentItems);
    }

    public int hashCode() {
        return this.componentItems.hashCode() + AbstractC11266d.m30450d(this.pillarType.hashCode() * 31, 31, this.pillarDisplayName);
    }

    public String toString() {
        EnumC14603g enumC14603g = this.pillarType;
        String str = this.pillarDisplayName;
        List<C14597a> list = this.componentItems;
        StringBuilder sb4 = new StringBuilder("PillarContent(pillarType=");
        sb4.append(enumC14603g);
        sb4.append(", pillarDisplayName=");
        sb4.append(str);
        sb4.append(", componentItems=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }
}
