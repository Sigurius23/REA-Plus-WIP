package io.sentry.android.replay;

import c93.InterfaceC4339a;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.protocol.C20501v;
import java.io.File;
import java.io.IOException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: io.sentry.android.replay.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20210i extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75917w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20212k f75918x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20210i(C20212k c20212k, int i13) {
        super(0);
        this.f75917w = i13;
        this.f75918x = c20212k;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() throws IOException {
        switch (this.f75917w) {
            case 0:
                C20212k c20212k = this.f75918x;
                if (c20212k.m56137i() == null) {
                    return null;
                }
                File file = new File(c20212k.m56137i(), ".ongoing_segment");
                if (!file.exists()) {
                    file.createNewFile();
                }
                return file;
            default:
                C20212k c20212k2 = this.f75918x;
                C20513q6 options = c20212k2.f75930w;
                C20501v replayId = c20212k2.f75931x;
                AbstractC22676k.m65750j(options, "options");
                AbstractC22676k.m65750j(replayId, "replayId");
                String cacheDirPath = options.getCacheDirPath();
                if (cacheDirPath == null || cacheDirPath.length() == 0) {
                    options.getLogger().mo16066m(EnumC20436n5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                    return null;
                }
                String cacheDirPath2 = options.getCacheDirPath();
                AbstractC22676k.m65747g(cacheDirPath2);
                File file2 = new File(cacheDirPath2, "replay_" + replayId);
                file2.mkdirs();
                return file2;
        }
    }
}
