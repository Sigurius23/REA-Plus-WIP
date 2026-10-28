package io.getstream.chat.android.client.api.internal;

import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class ExtraDataValidator$Companion$reservedInMemberPredicate$1 extends C22672i implements Function1 {
    public ExtraDataValidator$Companion$reservedInMemberPredicate$1(Object obj) {
        super(1, 0, Set.class, obj, "contains", "contains(Ljava/lang/Object;)Z");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Boolean invoke(String p13) {
        AbstractC22676k.m65750j(p13, "p0");
        return Boolean.valueOf(((Set) this.receiver).contains(p13));
    }
}
