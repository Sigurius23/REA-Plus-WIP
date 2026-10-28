package io.sentry.android.replay;

import java.util.Locale;
import java.util.Map;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import yb3.AbstractC39414r;
import yb3.C39410n;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: io.sentry.android.replay.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20183c extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C20183c f75817x;

    /* JADX INFO: renamed from: y */
    public static final C20183c f75818y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75819w;

    static {
        int i13 = 1;
        f75817x = new C20183c(i13, 0);
        f75818y = new C20183c(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20183c(int i13, int i14) {
        super(i13);
        this.f75819w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f75819w) {
            case 0:
                InterfaceC39407k it = (InterfaceC39407k) obj;
                AbstractC22676k.m65750j(it, "it");
                String upperCase = String.valueOf(AbstractC39414r.m125891j0(((C39410n) it).m125845c())).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                return upperCase;
            default:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC22676k.m65750j(entry, "<name for destructuring parameter 0>");
                return AbstractC11895b.m31992k('=', (String) entry.getKey(), (String) entry.getValue());
        }
    }
}
