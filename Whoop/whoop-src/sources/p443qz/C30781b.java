package p443qz;

import ad3.AbstractC0767j;
import ad3.AbstractC0770m;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.PaymentAccount;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;

/* JADX INFO: renamed from: qz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C30781b extends AbstractC0767j {

    /* JADX INFO: renamed from: c */
    public static final C30781b f126769c = new C30781b(AbstractC22671h0.f89337a.getOrCreateKotlinClass(PaymentAccount.class));

    @Override // ad3.AbstractC0767j
    /* JADX INFO: renamed from: a */
    public final InterfaceC37137b mo1836a(JsonElement element) {
        AbstractC22676k.m65750j(element, "element");
        JsonElement jsonElement = (JsonElement) AbstractC0770m.m1847i(element).get((Object) "object");
        String content = jsonElement != null ? AbstractC0770m.m1848j(jsonElement).getContent() : null;
        return (AbstractC22676k.m65745e(content, FinancialConnectionsAccount.OBJECT_OLD) || AbstractC22676k.m65745e(content, FinancialConnectionsAccount.OBJECT_NEW)) ? FinancialConnectionsAccount.Companion.serializer() : BankAccount.Companion.serializer();
    }
}
