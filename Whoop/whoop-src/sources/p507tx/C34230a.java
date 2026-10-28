package p507tx;

import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.C5576g;
import com.squareup.wire.InterfaceC5570a0;
import java.util.LinkedHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: tx.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C34230a extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143597w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34230a(int i13, int i14) {
        super(i13);
        this.f143597w = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f143597w) {
            case 0:
                AbstractC5579j builder = (AbstractC5579j) obj;
                AbstractC22676k.m65750j(builder, "builder");
                LinkedHashMap linkedHashMap = ((C5576g) builder).f22094e;
                throw null;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                AbstractC22676k.m65750j((Throwable) obj2, "<anonymous parameter 1>");
                return Boolean.valueOf(iIntValue > 3);
            default:
                ((Number) obj).intValue();
                long jLongValue = ((Number) obj2).longValue() + 250;
                if (jLongValue > 2000) {
                    jLongValue = 2000;
                }
                return Long.valueOf(jLongValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34230a(InterfaceC5570a0 interfaceC5570a0) {
        super(2);
        this.f143597w = 0;
    }
}
