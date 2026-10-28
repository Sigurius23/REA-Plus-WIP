package io.getstream.chat.android.client.extensions.internal;

import io.getstream.chat.android.client.utils.internal.ValidationKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import l83.C23465k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Ll83/k;", "", "toCid", "(Ll83/k;)Ljava/lang/String;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PairKt {
    @InternalStreamChatApi
    public static final String toCid(C23465k c23465k) throws IllegalArgumentException {
        AbstractC22676k.m65750j(c23465k, "<this>");
        String str = c23465k.f92937w + ":" + c23465k.f92938x;
        ValidationKt.validateCid(str);
        return str;
    }
}
