package io.getstream.chat.android.client.cdn.internal;

import ae3.C0801i;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.cdn.CDN;
import io.getstream.chat.android.client.cdn.CDNRequest;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/client/cdn/internal/CDNOkHttpInterceptor;", "Lud3/g0;", "Lio/getstream/chat/android/client/cdn/CDN;", "cdn", "<init>", "(Lio/getstream/chat/android/client/cdn/CDN;)V", "Lud3/f0;", "chain", "Lud3/x0;", "intercept", "(Lud3/f0;)Lud3/x0;", "Lio/getstream/chat/android/client/cdn/CDN;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CDNOkHttpInterceptor implements InterfaceC34816g0 {
    private final CDN cdn;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.cdn.internal.CDNOkHttpInterceptor$intercept$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.cdn.internal.CDNOkHttpInterceptor$intercept$1", m100430f = "CDNOkHttpInterceptor.kt", m100431l = {37}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lio/getstream/chat/android/client/cdn/CDNRequest;", "<anonymous>", "(Lbc3/c0;)Lio/getstream/chat/android/client/cdn/CDNRequest;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190801 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $originalUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190801(String str, InterfaceC30057d<? super C190801> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$originalUrl = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return CDNOkHttpInterceptor.this.new C190801(this.$originalUrl, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super CDNRequest> interfaceC30057d) {
            return ((C190801) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            CDN cdn = CDNOkHttpInterceptor.this.cdn;
            String str = this.$originalUrl;
            this.label = 1;
            Object objFileRequest = cdn.fileRequest(str, this);
            return objFileRequest == enumC31071a ? enumC31071a : objFileRequest;
        }
    }

    public CDNOkHttpInterceptor(CDN cdn) {
        AbstractC22676k.m65750j(cdn, "cdn");
        this.cdn = cdn;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:CDNOkHttpInterceptor");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    @Override // ud3.InterfaceC34816g0
    public final C34850x0 intercept(InterfaceC34813f0 chain) {
        CDNRequest cDNRequest;
        AbstractC22676k.m65750j(chain, "chain");
        C0801i c0801i = (C0801i) chain;
        C34832o0 c34832o0 = c0801i.f2955e;
        String str = c34832o0.f146712a.f146570i;
        try {
            cDNRequest = (CDNRequest) AbstractC3006f0.m8699E(C30064k.f122676w, new C190801(str, null));
        } catch (Exception e5) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
                logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11895b.m31996o("[intercept] CDN.fileRequest() failed for url: ", str, ". Falling back to original request."), e5);
            }
            cDNRequest = new CDNRequest(str, null, 2, null);
        }
        String url = cDNRequest.getUrl();
        Map<String, String> mapComponent2 = cDNRequest.component2();
        C34830n0 c34830n0M109907b = c34832o0.m109907b();
        c34830n0M109907b.m109905f(url);
        if (mapComponent2 != null) {
            for (Map.Entry<String, String> entry : mapComponent2.entrySet()) {
                c34830n0M109907b.m109902c(entry.getKey(), entry.getValue());
            }
        }
        return c0801i.m1939b(new C34832o0(c34830n0M109907b));
    }
}
