package io.getstream.chat.android.p226ui.common.feature.channel.info;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import c93.InterfaceC4351m;
import io.getstream.chat.android.models.ChannelData;
import java.util.Set;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$2$1$2", m100430f = "ChannelInfoViewController.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/models/ChannelData;", "it", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/models/ChannelData;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChannelInfoViewController$2$1$2 extends AbstractC32275i implements InterfaceC4351m {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelInfoViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelInfoViewController$2$1$2(ChannelInfoViewController channelInfoViewController, InterfaceC30057d<? super ChannelInfoViewController$2$1$2> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = channelInfoViewController;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        ChannelInfoViewController$2$1$2 channelInfoViewController$2$1$2 = new ChannelInfoViewController$2$1$2(this.this$0, interfaceC30057d);
        channelInfoViewController$2$1$2.L$0 = obj;
        return channelInfoViewController$2$1$2;
    }

    public final Object invoke(ChannelData channelData, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ChannelInfoViewController$2$1$2 channelInfoViewController$2$1$2 = (ChannelInfoViewController$2$1$2) create(channelData, interfaceC30057d);
        C23454a0 c23454a0 = C23454a0.f92919a;
        channelInfoViewController$2$1$2.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        ChannelData channelData = (ChannelData) this.L$0;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        C2345k logger = this.this$0.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            String cid = channelData.getCid();
            String name = channelData.getName();
            Set<String> ownCapabilities = channelData.getOwnCapabilities();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("[onChannelData] cid: ", cid, ", name: ", name, ", capabilities: ");
            sbM32001t.append(ownCapabilities);
            interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
        }
        return C23454a0.f92919a;
    }

    @Override // c93.InterfaceC4351m
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ChannelData) obj, (InterfaceC30057d<? super C23454a0>) obj2);
        return C23454a0.f92919a;
    }
}
