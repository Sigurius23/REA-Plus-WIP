package io.getstream.chat.android.client.query.request;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.QueryChannelsResult;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import java.util.List;
import m83.C25271y;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.InterfaceC27474d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/client/query/request/ChannelFilterRequest;", "", "<init>", "()V", "Lio/getstream/chat/android/client/ChatClient;", "Lio/getstream/chat/android/models/FilterObject;", "filter", "", MapboxMap.QFE_OFFSET, MapboxMap.QFE_LIMIT, "", "Lio/getstream/chat/android/models/Channel;", "filterWithOffset", "(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/models/FilterObject;IILq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelFilterRequest {
    public static final ChannelFilterRequest INSTANCE = new ChannelFilterRequest();

    /* JADX INFO: renamed from: io.getstream.chat.android.client.query.request.ChannelFilterRequest$filterWithOffset$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.query.request.ChannelFilterRequest", m100430f = "ChannelFilterRequest.kt", m100431l = {48}, m100432m = "filterWithOffset")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C194201 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C194201(InterfaceC30057d<? super C194201> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelFilterRequest.this.filterWithOffset(null, null, 0, 0, this);
        }
    }

    private ChannelFilterRequest() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object filterWithOffset(ChatClient chatClient, FilterObject filterObject, int i13, int i14, InterfaceC30057d<? super List<Channel>> interfaceC30057d) {
        C194201 c194201;
        if (interfaceC30057d instanceof C194201) {
            c194201 = (C194201) interfaceC30057d;
            int i15 = c194201.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                c194201.label = i15 - Integer.MIN_VALUE;
            } else {
                c194201 = new C194201(interfaceC30057d);
            }
        } else {
            c194201 = new C194201(interfaceC30057d);
        }
        Object objAwait = c194201.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = c194201.label;
        if (i16 == 0) {
            AbstractC34132o.m107864I(objAwait);
            InterfaceC27474d interfaceC27474dQueryChannelsInternal = chatClient.queryChannelsInternal(new QueryChannelsRequest(filterObject, i13, i14, null, new Integer(0), new Integer(0), null, null, null, 456, null));
            c194201.L$0 = null;
            c194201.L$1 = null;
            c194201.L$2 = null;
            c194201.I$0 = i13;
            c194201.I$1 = i14;
            c194201.label = 1;
            objAwait = interfaceC27474dQueryChannelsInternal.await(c194201);
            if (objAwait == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objAwait);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objAwait;
        if (abstractC26205h instanceof C26204g) {
            return ((QueryChannelsResult) ((C26204g) abstractC26205h).f103919a).getChannels();
        }
        if (abstractC26205h instanceof C26203f) {
            return C25271y.f99162w;
        }
        throw new NoWhenBranchMatchedException();
    }
}
