package io.getstream.chat.android.p226ui.common.images.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bi.AbstractC3270h;
import bi.C3279q;
import c93.InterfaceC4339a;
import fi.C14499e;
import fi.C14503i;
import fi.InterfaceC14506l;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.cdn.CDN;
import io.getstream.chat.android.client.cdn.CDNRequest;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import java.util.List;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import n83.C26463f;
import p088dc.AbstractC11895b;
import p461rh.AbstractC31426o;
import p505ts.AbstractC34132o;
import p615xh.C38304k;
import p615xh.InterfaceC38301h;
import p615xh.InterfaceC38302i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/images/internal/CDNImageInterceptor;", "Lxh/i;", "Lkotlin/Function0;", "Lio/getstream/chat/android/client/cdn/CDN;", "cdn", "<init>", "(Lc93/a;)V", "Lxh/h;", "chain", "Lfi/l;", "intercept", "(Lxh/h;Lq83/d;)Ljava/lang/Object;", "Lc93/a;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CDNImageInterceptor implements InterfaceC38302i {
    public static final int $stable = 8;
    private final InterfaceC4339a cdn;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.images.internal.CDNImageInterceptor$intercept$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.images.internal.CDNImageInterceptor", m100430f = "CDNImageInterceptor.kt", m100431l = {51, 58, 62, 67, 84}, m100432m = "intercept")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C196031 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C196031(InterfaceC30057d<? super C196031> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CDNImageInterceptor.this.intercept(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CDNImageInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CDN _init_$lambda$0() {
        ChatClient.Companion companion = ChatClient.INSTANCE;
        if (companion.isInitialized()) {
            return companion.instance().getCdn();
        }
        return null;
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:66:0x018c  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p615xh.InterfaceC38302i
    public final Object intercept(InterfaceC38301h interfaceC38301h, InterfaceC30057d<? super InterfaceC14506l> interfaceC30057d) throws Throwable {
        C196031 c196031;
        String string;
        C14503i c14503i;
        Exception e5;
        String str;
        InterfaceC38301h interfaceC38301h2;
        C2345k logger;
        InterfaceC2339e interfaceC2339e;
        String str2;
        EnumC2341g enumC2341g;
        Object objM122695c;
        if (interfaceC30057d instanceof C196031) {
            c196031 = (C196031) interfaceC30057d;
            int i13 = c196031.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c196031.label = i13 - Integer.MIN_VALUE;
            } else {
                c196031 = new C196031(interfaceC30057d);
            }
        } else {
            c196031 = new C196031(interfaceC30057d);
        }
        Object objM8705K = c196031.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c196031.label;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        str = (String) c196031.L$3;
                        c14503i = (C14503i) c196031.L$2;
                        interfaceC38301h2 = (InterfaceC38301h) c196031.L$0;
                        try {
                            AbstractC34132o.m107864I(objM8705K);
                            string = str;
                            interfaceC38301h = interfaceC38301h2;
                        } catch (Exception e13) {
                            e5 = e13;
                            logger = getLogger();
                            interfaceC2339e = logger.f9275c;
                            str2 = logger.f9273a;
                            enumC2341g = EnumC2341g.ERROR;
                            if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                                logger.f9274b.log(enumC2341g, str2, AbstractC11895b.m31996o("[intercept] CDN.imageRequest() failed for url: ", str, ". Falling back to original request."), e5);
                            }
                            c196031.L$0 = null;
                            c196031.L$1 = null;
                            c196031.L$2 = null;
                            c196031.L$3 = null;
                            c196031.L$4 = null;
                            c196031.label = 4;
                            objM122695c = ((C38304k) interfaceC38301h2).m122695c(c196031);
                            if (objM122695c == enumC31071a) {
                                return objM122695c;
                            }
                        }
                    } else if (i14 == 4) {
                    } else {
                        if (i14 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                }
            }
            AbstractC34132o.m107864I(objM8705K);
            return objM8705K;
        }
        AbstractC34132o.m107864I(objM8705K);
        CDN cdn = (CDN) this.cdn.invoke();
        if (cdn == null) {
            c196031.L$0 = null;
            c196031.label = 1;
            Object objM122695c2 = ((C38304k) interfaceC38301h).m122695c(c196031);
            if (objM122695c2 != enumC31071a) {
                return objM122695c2;
            }
        } else {
            C38304k c38304k = (C38304k) interfaceC38301h;
            C14503i c14503i2 = c38304k.f164156d;
            string = c14503i2.f52969b.toString();
            if (AbstractC39421y.m125930O(string, "http://", true) || AbstractC39421y.m125930O(string, "https://", true)) {
                try {
                    C22365e c22365e = AbstractC3050q0.f12077a;
                    ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                    CDNImageInterceptor$intercept$cdnRequest$1 cDNImageInterceptor$intercept$cdnRequest$1 = new CDNImageInterceptor$intercept$cdnRequest$1(cdn, string, null);
                    c196031.L$0 = interfaceC38301h;
                    c196031.L$1 = null;
                    c196031.L$2 = c14503i2;
                    c196031.L$3 = string;
                    c196031.label = 3;
                    objM8705K = AbstractC3006f0.m8705K(executorC22364d, cDNImageInterceptor$intercept$cdnRequest$1, c196031);
                    if (objM8705K != enumC31071a) {
                        c14503i = c14503i2;
                    }
                } catch (Exception e14) {
                    e5 = e14;
                    interfaceC38301h2 = interfaceC38301h;
                    str = string;
                    logger = getLogger();
                    interfaceC2339e = logger.f9275c;
                    str2 = logger.f9273a;
                    enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                        logger.f9274b.log(enumC2341g, str2, AbstractC11895b.m31996o("[intercept] CDN.imageRequest() failed for url: ", str, ". Falling back to original request."), e5);
                    }
                    c196031.L$0 = null;
                    c196031.L$1 = null;
                    c196031.L$2 = null;
                    c196031.L$3 = null;
                    c196031.L$4 = null;
                    c196031.label = 4;
                    objM122695c = ((C38304k) interfaceC38301h2).m122695c(c196031);
                    if (objM122695c == enumC31071a) {
                        return objM122695c;
                    }
                }
            } else {
                c196031.L$0 = null;
                c196031.L$1 = null;
                c196031.L$2 = null;
                c196031.L$3 = null;
                c196031.label = 2;
                Object objM122695c3 = c38304k.m122695c(c196031);
                if (objM122695c3 != enumC31071a) {
                    return objM122695c3;
                }
            }
        }
        CDNRequest cDNRequest = (CDNRequest) objM8705K;
        C3279q c3279q = (C3279q) AbstractC31426o.m96741e(c14503i, AbstractC3270h.f12770b);
        C26463f c26463f = new C26463f();
        for (Map.Entry entry : c3279q.f12805a.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) AbstractC25265s.m74114R0((List) entry.getValue());
            if (str4 != null) {
                c26463f.put(str3, str4);
            }
        }
        Map<String, String> headers = cDNRequest.getHeaders();
        if (headers != null) {
            c26463f.putAll(headers);
        }
        C3279q networkHeaders = CoilStreamImageLoaderKt.toNetworkHeaders(c26463f.m78380b());
        C14499e c14499e = new C14499e(c14503i, c14503i.f52968a);
        c14499e.f52935c = cDNRequest.getUrl();
        c14499e.m41409b().m96731a(AbstractC3270h.f12770b, networkHeaders);
        C14503i c14503iM41408a = c14499e.m41408a();
        C38304k c38304k2 = (C38304k) interfaceC38301h;
        int i15 = c38304k2.f164155c;
        if (i15 > 0) {
            c38304k2.m122694a(c14503iM41408a, (InterfaceC38302i) c38304k2.f164154b.get(i15 - 1));
        }
        C38304k c38304kM122693b = C38304k.m122693b(c38304k2, 0, c14503iM41408a, 5);
        c196031.L$0 = null;
        c196031.L$1 = null;
        c196031.L$2 = null;
        c196031.L$3 = null;
        c196031.L$4 = null;
        c196031.L$5 = null;
        c196031.L$6 = null;
        c196031.L$7 = null;
        c196031.label = 5;
        Object objM122695c4 = c38304kM122693b.m122695c(c196031);
        return objM122695c4 == enumC31071a ? enumC31071a : objM122695c4;
    }

    public CDNImageInterceptor(InterfaceC4339a cdn) {
        AbstractC22676k.m65750j(cdn, "cdn");
        this.cdn = cdn;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:CDNImageInterceptor");
    }

    public /* synthetic */ CDNImageInterceptor(InterfaceC4339a interfaceC4339a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C19383k(18) : interfaceC4339a);
    }
}
