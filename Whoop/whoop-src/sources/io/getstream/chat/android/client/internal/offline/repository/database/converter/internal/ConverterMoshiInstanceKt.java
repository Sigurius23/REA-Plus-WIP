package io.getstream.chat.android.client.internal.offline.repository.database.converter.internal;

import io.getstream.chat.android.client.parser2.adapters.DateAdapter;
import j93.AbstractC21478l0;
import java.util.Date;
import p441qx.C30716i0;
import p441qx.C30722l0;
import p441qx.C30726n0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import sx.C33057c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0007\" \u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m65681d2 = {"Lqx/l0;", "moshi", "Lqx/l0;", "getMoshi", "()Lqx/l0;", "getMoshi$annotations", "()V", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ConverterMoshiInstanceKt {
    private static final C30722l0 moshi;

    static {
        C30716i0 c30716i0 = new C30716i0();
        c30716i0.m94392b(AbstractC21478l0.m60396B(AbstractC22671h0.m65691d(Date.class)), new DateAdapter());
        c30716i0.m94393c(new C33057c());
        c30716i0.m94393c(C30726n0.f126509d);
        moshi = new C30722l0(c30716i0);
    }

    public static final C30722l0 getMoshi() {
        return moshi;
    }

    public static /* synthetic */ void getMoshi$annotations() {
    }
}
