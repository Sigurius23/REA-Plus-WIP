package io.getstream.chat.android.p226ui.common.feature.channel.info;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Member;
import java.util.List;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$2$1$3", m100430f = "ChannelInfoViewController.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"", "Lio/getstream/chat/android/models/Member;", "it", "Ll83/a0;", "<anonymous>", "(Ljava/util/List;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
public final class ChannelInfoViewController$2$1$3 extends AbstractC32275i implements InterfaceC4351m {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelInfoViewController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelInfoViewController$2$1$3(ChannelInfoViewController channelInfoViewController, InterfaceC30057d<? super ChannelInfoViewController$2$1$3> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.this$0 = channelInfoViewController;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        ChannelInfoViewController$2$1$3 channelInfoViewController$2$1$3 = new ChannelInfoViewController$2$1$3(this.this$0, interfaceC30057d);
        channelInfoViewController$2$1$3.L$0 = obj;
        return channelInfoViewController$2$1$3;
    }

    @Override // c93.InterfaceC4351m
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((List<Member>) obj, (InterfaceC30057d<? super C23454a0>) obj2);
        return C23454a0.f92919a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
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
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(list.size(), "[onMembers] size: "), null);
        }
        return C23454a0.f92919a;
    }

    public final Object invoke(List<Member> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        ChannelInfoViewController$2$1$3 channelInfoViewController$2$1$3 = (ChannelInfoViewController$2$1$3) create(list, interfaceC30057d);
        C23454a0 c23454a0 = C23454a0.f92919a;
        channelInfoViewController$2$1$3.invokeSuspend(c23454a0);
        return c23454a0;
    }
}
