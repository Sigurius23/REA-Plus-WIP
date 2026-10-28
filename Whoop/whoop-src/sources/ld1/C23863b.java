package ld1;

import androidx.core.app.NotificationCompat;
import ec3.InterfaceC13058l;
import p007a6.C0456u;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ld1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\u0006R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m65681d2 = {"Lld1/b;", "VS", "VE", "Lld1/c;", "value", "<init>", "(Ljava/lang/Object;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "g", "Lec3/l;", "x", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23863b<VS, VE> extends AbstractC23864c<VS, VE> {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    public C23863b(VS vs3) {
        super(null, 1, null);
        this.viewState = new C0456u(vs3, 1);
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: g */
    public void mo1216g(VE event) {
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }
}
