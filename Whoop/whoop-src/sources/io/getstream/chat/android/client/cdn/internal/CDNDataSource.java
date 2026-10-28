package io.getstream.chat.android.client.cdn.internal;

import android.net.Uri;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bb.C2916c;
import bc3.AbstractC3006f0;
import com.mapbox.maps.MapboxMap;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.cdn.CDN;
import io.getstream.chat.android.client.cdn.CDNRequest;
import java.util.List;
import java.util.Map;
import l83.InterfaceC23462h;
import n83.C26463f;
import p088dc.AbstractC11895b;
import p674z8.C40171g;
import p674z8.InterfaceC40170f;
import p674z8.InterfaceC40178n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import va3.AbstractC35849g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001b0\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;", "Lz8/f;", "Lio/getstream/chat/android/client/cdn/CDN;", "cdn", "upstream", "<init>", "(Lio/getstream/chat/android/client/cdn/CDN;Lz8/f;)V", "Lz8/g;", "dataSpec", "", ProfileAnalyticsKt.OPEN, "(Lz8/g;)J", "", "buffer", "", MapboxMap.QFE_OFFSET, "length", "read", "([BII)I", "Ll83/a0;", "close", "()V", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "", "", "", "getResponseHeaders", "()Ljava/util/Map;", "Lz8/n;", "transferListener", "addTransferListener", "(Lz8/n;)V", "Lio/getstream/chat/android/client/cdn/CDN;", "Lz8/f;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
final class CDNDataSource implements InterfaceC40170f {
    private final CDN cdn;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC40170f upstream;

    public CDNDataSource(CDN cdn, InterfaceC40170f upstream) {
        AbstractC22676k.m65750j(cdn, "cdn");
        AbstractC22676k.m65750j(upstream, "upstream");
        this.cdn = cdn;
        this.upstream = upstream;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:CDNDataSource");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // p674z8.InterfaceC40170f
    public final void addTransferListener(InterfaceC40178n transferListener) {
        AbstractC22676k.m65750j(transferListener, "transferListener");
        this.upstream.addTransferListener(transferListener);
    }

    @Override // p674z8.InterfaceC40170f
    public final void close() {
        this.upstream.close();
    }

    @Override // p674z8.InterfaceC40170f
    public final Map<String, List<String>> getResponseHeaders() {
        Map<String, List<String>> responseHeaders = this.upstream.getResponseHeaders();
        AbstractC22676k.m65749i(responseHeaders, "getResponseHeaders(...)");
        return responseHeaders;
    }

    @Override // p674z8.InterfaceC40170f
    public final Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // p674z8.InterfaceC40170f
    public final long open(C40171g dataSpec) {
        CDNRequest cDNRequest;
        AbstractC22676k.m65750j(dataSpec, "dataSpec");
        Uri uri = dataSpec.f173343a;
        String scheme = uri.getScheme();
        if (!AbstractC22676k.m65745e(scheme, "http") && !AbstractC22676k.m65745e(scheme, "https")) {
            return this.upstream.open(dataSpec);
        }
        String string = uri.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        try {
            cDNRequest = (CDNRequest) AbstractC3006f0.m8699E(C30064k.f122676w, new CDNDataSource$open$cdnRequest$1(this, string, null));
        } catch (Exception e5) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11895b.m31996o("[open] CDN.fileRequest() failed for url: ", string, ". Falling back to original request."), e5);
            }
            cDNRequest = new CDNRequest(string, null, 2, null);
        }
        C26463f c26463f = new C26463f();
        Map httpRequestHeaders = dataSpec.f173346d;
        AbstractC22676k.m65749i(httpRequestHeaders, "httpRequestHeaders");
        c26463f.putAll(httpRequestHeaders);
        Map<String, String> headers = cDNRequest.getHeaders();
        if (headers != null) {
            c26463f.putAll(headers);
        }
        C26463f c26463fM78380b = c26463f.m78380b();
        dataSpec.getClass();
        C2916c c2916c = new C2916c();
        c2916c.f11724f = dataSpec.f173343a;
        c2916c.f11720b = dataSpec.f173344b;
        c2916c.f11725g = dataSpec.f173345c;
        c2916c.f11726h = dataSpec.f173346d;
        c2916c.f11721c = dataSpec.f173347e;
        c2916c.f11723e = dataSpec.f173348f;
        c2916c.f11727i = dataSpec.f173349g;
        c2916c.f11722d = dataSpec.f173350h;
        c2916c.f11724f = Uri.parse(cDNRequest.getUrl());
        c2916c.f11726h = c26463fM78380b;
        AbstractC35849g.m113809k((Uri) c2916c.f11724f, "The uri must be set.");
        return this.upstream.open(new C40171g((Uri) c2916c.f11724f, c2916c.f11720b, (byte[]) c2916c.f11725g, (Map) c2916c.f11726h, c2916c.f11721c, c2916c.f11723e, (String) c2916c.f11727i, c2916c.f11722d));
    }

    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] buffer, int offset, int length) {
        AbstractC22676k.m65750j(buffer, "buffer");
        return this.upstream.read(buffer, offset, length);
    }
}
