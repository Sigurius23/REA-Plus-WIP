package zj0;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: zj0.i */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\u0082\u0001\u0002\f\r¨\u0006\u000eÀ\u0006\u0003"}, m65681d2 = {"Lzj0/i;", "", "", "q", "()J", "writePage", "e", "trimPage", "t", "totalPages", "D", "pagesBehind", "Lzj0/q;", "Lzj0/i0;", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC40730i {
    /* JADX INFO: renamed from: D */
    default long mo132202D() {
        if (mo132204q() >= mo132203e()) {
            return mo132204q() - mo132203e();
        }
        return (mo132205t() - mo132203e()) + mo132204q();
    }

    /* JADX INFO: renamed from: e */
    long mo132203e();

    /* JADX INFO: renamed from: q */
    long mo132204q();

    /* JADX INFO: renamed from: t */
    long mo132205t();
}
