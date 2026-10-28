package f20;

import android.content.Context;
import com.stripe.android.financialconnections.FinancialConnectionsSheetKt;
import h32.C16829b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f20.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14024c {
    /* JADX INFO: renamed from: a */
    public static final Function1 m39913a(EnumC14023b enumC14023b, Context context) {
        AbstractC22676k.m65750j(context, "context");
        int iOrdinal = enumC14023b.ordinal();
        if (iOrdinal == 0) {
            return FinancialConnectionsSheetKt.intentBuilder(context);
        }
        if (iOrdinal == 1) {
            return new C16829b(context, 3);
        }
        throw new NoWhenBranchMatchedException();
    }
}
