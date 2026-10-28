package com.stripe.android.link;

import android.content.Context;
import android.content.Intent;
import b00.C2179a;
import p267k.AbstractC22081b;
import p599wz.C37718g0;
import p599wz.C37729k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u00.C34377e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0002¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/link/LinkActivityContract;", "Lk/b;", "Lwz/k;", "Lwz/q;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class LinkActivityContract extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final NativeLinkActivityContract f22197a;

    /* JADX INFO: renamed from: b */
    public final WebLinkActivityContract f22198b;

    /* JADX INFO: renamed from: c */
    public final C34377e f22199c;

    public LinkActivityContract(NativeLinkActivityContract nativeLinkActivityContract, WebLinkActivityContract webLinkActivityContract, C34377e linkGateFactory) {
        AbstractC22676k.m65750j(nativeLinkActivityContract, "nativeLinkActivityContract");
        AbstractC22676k.m65750j(webLinkActivityContract, "webLinkActivityContract");
        AbstractC22676k.m65750j(linkGateFactory, "linkGateFactory");
        this.f22197a = nativeLinkActivityContract;
        this.f22198b = webLinkActivityContract;
        this.f22199c = linkGateFactory;
    }

    @Override // p267k.AbstractC22081b
    public final Intent createIntent(Context context, Object obj) {
        C37729k input = (C37729k) obj;
        AbstractC22676k.m65750j(input, "input");
        C37718g0 configuration = input.f161671a;
        this.f22199c.getClass();
        AbstractC22676k.m65750j(configuration, "configuration");
        return new C2179a(configuration).m6861b() ? this.f22197a.createIntent(context, input) : this.f22198b.createIntent(context, input);
    }

    @Override // p267k.AbstractC22081b
    public final Object parseResult(int i13, Intent intent) {
        return i13 == 73563 ? this.f22197a.parseResult(i13, intent) : this.f22198b.parseResult(i13, intent);
    }
}
