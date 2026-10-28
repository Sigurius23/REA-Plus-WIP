package com.mapbox.common.movement;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p503tp.C34026b;
import p529uo.AbstractC35135w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: com.mapbox.common.movement.GoogleActivityRecognition$Companion$TRANSITION_API_MONITORING_TYPES$2 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "Ltp/b;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
public final class C5453xff25772 extends AbstractC22680m implements InterfaceC4339a {
    public static final C5453xff25772 INSTANCE = new C5453xff25772();

    public C5453xff25772() {
        super(0);
    }

    @Override // c93.InterfaceC4339a
    public final List<C34026b> invoke() {
        List listM118959K = AbstractC37056f.m118959K(0, 2, 8, 7, 1, 3);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        Iterator it = listM118959K.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            C34026b.m107622b(0);
            AbstractC35135w.m111096h("Activity type not set.", iIntValue != -1);
            arrayList.add(new C34026b(iIntValue, 0));
        }
        return arrayList;
    }
}
