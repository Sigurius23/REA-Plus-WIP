package com.stripe.android.link;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import b10.EnumC2228d;
import p098dt.AbstractC12350b;
import p267k.AbstractC22081b;
import p537ux.C35362x;
import p537ux.C35363y;
import p599wz.AbstractC37747q;
import p599wz.C37702b;
import p599wz.C37718g0;
import p599wz.C37719g1;
import p599wz.C37729k;
import p599wz.C37735m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/link/NativeLinkActivityContract;", "Lk/b;", "Lwz/k;", "Lwz/q;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class NativeLinkActivityContract extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final String f22203a;

    /* JADX INFO: renamed from: b */
    public final EnumC2228d f22204b;

    public NativeLinkActivityContract(String paymentElementCallbackIdentifier, EnumC2228d requestSurface) {
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        AbstractC22676k.m65750j(requestSurface, "requestSurface");
        this.f22203a = paymentElementCallbackIdentifier;
        this.f22204b = requestSurface;
    }

    @Override // p267k.AbstractC22081b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Intent createIntent(Context context, C37729k input) {
        AbstractC22676k.m65750j(input, "input");
        C35363y c35363y = C35363y.f150632y;
        if (c35363y == null) {
            SharedPreferences sharedPreferences = new C35362x(context).f150631a;
            String string = sharedPreferences.getString("key_publishable_key", null);
            c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
            if (c35363y == null) {
                throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
            }
            C35363y.f150632y = c35363y;
        }
        int i13 = LinkActivity.f22192E;
        C37718g0 c37718g0 = input.f161671a;
        C35459c0 c35459c0 = input.f161672b;
        String str = c35363y.f150634x;
        Intent intentPutExtra = new Intent(context, (Class<?>) LinkActivity.class).putExtra("native_link_args", new C37719g1(c37718g0, c35459c0, this.f22204b, c35363y.f150633w, str, input.f161673c, input.f161674d, this.f22203a, input.f161675e));
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC37747q parseResult(int i13, Intent intent) {
        Bundle extras;
        C37702b c37702b = C37702b.f161559w;
        if (i13 != 0 && i13 == 73563) {
            AbstractC37747q abstractC37747q = (intent == null || (extras = intent.getExtras()) == null) ? null : (AbstractC37747q) AbstractC12350b.m34600u(extras, AbstractC37747q.class, "com.stripe.android.link.LinkActivityContract.extra_result");
            return abstractC37747q == null ? new C37735m(c37702b) : abstractC37747q;
        }
        return new C37735m(c37702b);
    }
}
