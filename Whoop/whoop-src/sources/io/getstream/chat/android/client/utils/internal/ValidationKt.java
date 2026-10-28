package io.getstream.chat.android.client.utils.internal;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.regex.Pattern;
import n23.AbstractC26205h;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\"\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "cid", "validateCid", "(Ljava/lang/String;)Ljava/lang/String;", "Ln23/h;", "validateCidWithResult", "(Ljava/lang/String;)Ln23/h;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "cidPattern", "Ljava/util/regex/Pattern;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ValidationKt {
    private static final Pattern cidPattern = Pattern.compile("^([a-zA-z0-9]|!|-)+:([a-zA-z0-9]|!|-)+$");

    @InternalStreamChatApi
    public static final String validateCid(String cid) throws IllegalArgumentException {
        AbstractC22676k.m65750j(cid, "cid");
        if (cid.length() <= 0) {
            throw new IllegalArgumentException("cid can not be empty");
        }
        if (AbstractC39414r.m125890i0(cid)) {
            throw new IllegalArgumentException("cid can not be blank");
        }
        if (cidPattern.matcher(cid).matches()) {
            return cid;
        }
        throw new IllegalArgumentException("cid needs to be in the format channelType:channelId. For example, messaging:123");
    }

    @InternalStreamChatApi
    public static final AbstractC26205h validateCidWithResult(String cid) {
        AbstractC22676k.m65750j(cid, "cid");
        try {
            validateCid(cid);
            return new C26204g(cid);
        } catch (IllegalArgumentException e5) {
            return new C26203f(new C26201d("Cid is invalid: ".concat(cid), e5));
        }
    }
}
