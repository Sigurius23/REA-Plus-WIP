package io.getstream.chat.android.client.cdn.internal;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.cdn.CDN;
import io.getstream.chat.android.client.cdn.CDNRequest;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.client.cdn.internal.CDNDataSource$open$cdnRequest$1", m100430f = "CDNDataSourceFactory.kt", m100431l = {73}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lio/getstream/chat/android/client/cdn/CDNRequest;", "<anonymous>", "(Lbc3/c0;)Lio/getstream/chat/android/client/cdn/CDNRequest;"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class CDNDataSource$open$cdnRequest$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ CDNDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDNDataSource$open$cdnRequest$1(CDNDataSource cDNDataSource, String str, InterfaceC30057d<? super CDNDataSource$open$cdnRequest$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = cDNDataSource;
        this.$url = str;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new CDNDataSource$open$cdnRequest$1(this.this$0, this.$url, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super CDNRequest> interfaceC30057d) {
        return ((CDNDataSource$open$cdnRequest$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
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
        CDN cdn = this.this$0.cdn;
        String str = this.$url;
        this.label = 1;
        Object objFileRequest = cdn.fileRequest(str, this);
        return objFileRequest == enumC31071a ? enumC31071a : objFileRequest;
    }
}
