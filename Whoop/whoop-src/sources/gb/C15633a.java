package gb;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1601k1;
import java.lang.ref.WeakReference;
import java.util.UUID;
import p634y1.InterfaceC39030c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C15633a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w */
    public final UUID f58673w;

    /* JADX INFO: renamed from: x */
    public WeakReference f58674x;

    public C15633a(C1601k1 c1601k1) {
        UUID uuidRandomUUID = (UUID) c1601k1.m5001b("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            c1601k1.m5004e(uuidRandomUUID, "SaveableStateHolder_BackStackEntryKey");
        }
        this.f58673w = uuidRandomUUID;
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public final void onCleared() {
        super.onCleared();
        WeakReference weakReference = this.f58674x;
        if (weakReference == null) {
            AbstractC22676k.m65757q("saveableStateHolderRef");
            throw null;
        }
        InterfaceC39030c interfaceC39030c = (InterfaceC39030c) weakReference.get();
        if (interfaceC39030c != null) {
            interfaceC39030c.mo86874a(this.f58673w);
        }
        WeakReference weakReference2 = this.f58674x;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            AbstractC22676k.m65757q("saveableStateHolderRef");
            throw null;
        }
    }
}
