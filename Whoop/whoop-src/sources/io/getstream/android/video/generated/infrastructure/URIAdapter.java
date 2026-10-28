package io.getstream.android.video.generated.infrastructure;

import java.net.URI;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/android/video/generated/infrastructure/URIAdapter;", "", "()V", "fromJson", "Ljava/net/URI;", "s", "", "toJson", "uri", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class URIAdapter {
    @InterfaceC30729p
    public final URI fromJson(String s13) {
        AbstractC22676k.m65750j(s13, "s");
        URI uriCreate = URI.create(s13);
        AbstractC22676k.m65749i(uriCreate, "create(...)");
        return uriCreate;
    }

    @InterfaceC30738t0
    public final String toJson(URI uri) {
        AbstractC22676k.m65750j(uri, "uri");
        String string = uri.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
