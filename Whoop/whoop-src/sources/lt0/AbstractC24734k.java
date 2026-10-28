package lt0;

import mt0.C25932b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: lt0.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Llt0/k;", "", "Lmt0/b;", "framedPacket", "Llt0/c;", "packet", "<init>", "(Lmt0/b;Llt0/c;)V", "a", "Lmt0/b;", "()Lmt0/b;", "b", "Llt0/c;", "()Llt0/c;", "Llt0/h;", "Llt0/m;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24734k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C25932b framedPacket;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC24726c packet;

    public /* synthetic */ AbstractC24734k(C25932b c25932b, AbstractC24726c abstractC24726c, DefaultConstructorMarker defaultConstructorMarker) {
        this(c25932b, abstractC24726c);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C25932b getFramedPacket() {
        return this.framedPacket;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final AbstractC24726c getPacket() {
        return this.packet;
    }

    private AbstractC24734k(C25932b c25932b, AbstractC24726c abstractC24726c) {
        this.framedPacket = c25932b;
        this.packet = abstractC24726c;
    }
}
