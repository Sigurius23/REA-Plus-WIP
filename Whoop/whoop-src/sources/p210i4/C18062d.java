package p210i4;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: renamed from: i4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18062d extends AbstractC18060b {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    @Override // p210i4.AbstractC18060b, p210i4.AbstractC18061c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18062d) || Objects.equals(m51906c(), ((C18062d) obj).m51906c())) {
            return super.equals(obj);
        }
        return false;
    }
}
