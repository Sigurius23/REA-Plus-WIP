package p042c2;

import android.app.Notification;
import android.view.ViewStructure;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import d33.C11602h1;
import io.getstream.video.android.core.notifications.internal.service.CallService;
import java.nio.ByteBuffer;
import l83.C23454a0;
import p114eb.C12982q;
import p550vd.AbstractC35902e;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: c2.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C3872q extends AbstractC22680m implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15847w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f15848x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3872q(Object obj, int i13) {
        super(4);
        this.f15847w = i13;
        this.f15848x = obj;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f15847w) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                ((ViewStructure) this.f15848x).setDimens(iIntValue, iIntValue2, 0, 0, ((Number) obj3).intValue() - iIntValue, ((Number) obj4).intValue() - iIntValue2);
                break;
            case 1:
                ((Number) obj).intValue();
                ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                ByteBuffer sampleData = (ByteBuffer) obj4;
                AbstractC22676k.m65750j(sampleData, "sampleData");
                ((C11602h1) this.f15848x).f37440b.getClass();
                break;
            case 2:
                int iIntValue3 = ((Number) obj4).intValue();
                ((C37816b) this.f15848x).invoke((C12982q) obj2, (Composer) obj3, Integer.valueOf((iIntValue3 >> 3) & 14));
                break;
            default:
                int iIntValue4 = ((Number) obj).intValue();
                Notification notification = (Notification) obj2;
                String trigger = (String) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                AbstractC22676k.m65750j(notification, "notification");
                AbstractC22676k.m65750j(trigger, "trigger");
                AbstractC35902e.m113965g0((CallService) this.f15848x, iIntValue4, notification, trigger, iIntValue5);
                break;
        }
        return C23454a0.f92919a;
    }
}
