package p015ak;

import fk.InterfaceC14544a;
import java.util.ArrayList;
import p550vd.AbstractC35902e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: ak.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C0936d extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C0936d f3434w = new C0936d(1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC14544a logger = (InterfaceC14544a) obj;
        AbstractC22676k.m65750j(logger, "logger");
        ArrayList arrayList = new ArrayList();
        if (AbstractC35902e.m113940H("androidx.compose.ui.node.Owner", null) && AbstractC35902e.m113940H("com.amplitude.android.internal.locators.ComposeViewTargetLocator", null)) {
            arrayList.add(new C0934b(logger));
        }
        arrayList.add(new C0933a());
        return arrayList;
    }
}
