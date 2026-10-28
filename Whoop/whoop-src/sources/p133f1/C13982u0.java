package p133f1;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;
import java.util.Map;
import lb3.AbstractC23811y;
import p002a0.C0029i0;
import p005a3.C0230n0;
import p209i3.C18034p;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: f1.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13982u0 implements Comparator {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49882w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f49883x;

    public /* synthetic */ C13982u0(Object obj, int i13) {
        this.f49882w = i13;
        this.f49883x = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f49882w) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                C0029i0 c0029i0 = (C0029i0) this.f49883x;
                return AbstractC30060g.m92127q(Integer.valueOf(c0029i0.m73c(jLongValue)), Integer.valueOf(c0029i0.m73c(((Number) obj2).longValue())));
            case 1:
                int iCompare = ((Comparator) this.f49883x).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return C0230n0.f756r0.compare(((C18034p) obj).f69988c, ((C18034p) obj2).f69988c);
            case 2:
                int iCompare2 = ((C13982u0) this.f49883x).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : AbstractC30060g.m92127q(Integer.valueOf(((C18034p) obj).f69992g), Integer.valueOf(((C18034p) obj2).f69992g));
            case 3:
                AbstractC23811y abstractC23811y = (AbstractC23811y) obj;
                Function1 function1 = (Function1) this.f49883x;
                AbstractC22676k.m65747g(abstractC23811y);
                String string = function1.invoke(abstractC23811y).toString();
                AbstractC23811y abstractC23811y2 = (AbstractC23811y) obj2;
                AbstractC22676k.m65747g(abstractC23811y2);
                return AbstractC30060g.m92127q(string, function1.invoke(abstractC23811y2).toString());
            case 4:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f49883x;
                int iCompareTo = Boolean.valueOf(materialButton.f20842O).compareTo(Boolean.valueOf(materialButton2.f20842O));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton2)));
            default:
                Map map = (Map) this.f49883x;
                return AbstractC30060g.m92127q((Integer) map.get((String) obj), (Integer) map.get((String) obj2));
        }
    }

    public C13982u0(Comparator comparator) {
        this.f49882w = 1;
        this.f49883x = comparator;
    }
}
