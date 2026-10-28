package com.stripe.android.stripe3ds2.transactions;

import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r30.EnumC30904i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "o73/a", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ChallengeResponseParseException extends Exception {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22419z = 0;

    /* JADX INFO: renamed from: w */
    public final int f22420w;

    /* JADX INFO: renamed from: x */
    public final String f22421x;

    /* JADX INFO: renamed from: y */
    public final String f22422y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeResponseParseException(EnumC30904i enumC30904i, String detail) {
        this(enumC30904i.f127453w, enumC30904i.f127454x, detail);
        AbstractC22676k.m65750j(detail, "detail");
    }

    public ChallengeResponseParseException(int i13, String description, String detail) {
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(detail, "detail");
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i13);
        AbstractC11266d.m30444B(sb4, " - ", description, " (", detail);
        sb4.append(")");
        super(sb4.toString());
        this.f22420w = i13;
        this.f22421x = description;
        this.f22422y = detail;
    }
}
