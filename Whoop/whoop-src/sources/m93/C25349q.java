package m93;

import java.lang.reflect.Field;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C25349q extends AbstractC25350r {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f99374f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25349q(Field field, boolean z4, boolean z13, int i13) {
        super(field, z4, z13);
        this.f99374f = i13;
    }

    @Override // m93.AbstractC25350r, m93.AbstractC25357y
    /* JADX INFO: renamed from: c */
    public void mo74412c(Object[] args) {
        switch (this.f99374f) {
            case 1:
                AbstractC22676k.m65750j(args, "args");
                super.mo74412c(args);
                m74414d(AbstractC25260n.m74079t0(args));
                break;
            default:
                super.mo74412c(args);
                break;
        }
    }
}
