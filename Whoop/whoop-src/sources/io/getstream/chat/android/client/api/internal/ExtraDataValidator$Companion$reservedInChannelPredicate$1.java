package io.getstream.chat.android.client.api.internal;

import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* synthetic */ class ExtraDataValidator$Companion$reservedInChannelPredicate$1 extends C22672i implements Function1 {
    public ExtraDataValidator$Companion$reservedInChannelPredicate$1(Object obj) {
        super(1, 1, AbstractC25260n.class, obj, "contains", "contains([Ljava/lang/Object;Ljava/lang/Object;)Z");
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Boolean invoke(String p13) {
        AbstractC22676k.m65750j(p13, "p0");
        return Boolean.valueOf(AbstractC25260n.m74056a0((Object[]) this.receiver, p13));
    }
}
