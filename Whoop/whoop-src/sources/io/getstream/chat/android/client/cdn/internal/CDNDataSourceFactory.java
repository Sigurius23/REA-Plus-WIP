package io.getstream.chat.android.client.cdn.internal;

import ce3.C4497a0;
import io.getstream.chat.android.client.cdn.CDN;
import p674z8.InterfaceC40169e;
import p674z8.InterfaceC40170f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/client/cdn/internal/CDNDataSourceFactory;", "Lz8/e;", "Lio/getstream/chat/android/client/cdn/CDN;", "cdn", "upstreamFactory", "<init>", "(Lio/getstream/chat/android/client/cdn/CDN;Lz8/e;)V", "Lz8/f;", "createDataSource", "()Lz8/f;", "Lio/getstream/chat/android/client/cdn/CDN;", "Lz8/e;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CDNDataSourceFactory implements InterfaceC40169e {
    private final CDN cdn;
    private final InterfaceC40169e upstreamFactory;

    public CDNDataSourceFactory(CDN cdn, InterfaceC40169e upstreamFactory) {
        AbstractC22676k.m65750j(cdn, "cdn");
        AbstractC22676k.m65750j(upstreamFactory, "upstreamFactory");
        this.cdn = cdn;
        this.upstreamFactory = upstreamFactory;
    }

    @Override // p674z8.InterfaceC40169e
    public final InterfaceC40170f createDataSource() {
        return new CDNDataSource(this.cdn, this.upstreamFactory.createDataSource());
    }

    public /* synthetic */ CDNDataSourceFactory(CDN cdn, InterfaceC40169e interfaceC40169e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(cdn, (i13 & 2) != 0 ? new C4497a0(3) : interfaceC40169e);
    }
}
