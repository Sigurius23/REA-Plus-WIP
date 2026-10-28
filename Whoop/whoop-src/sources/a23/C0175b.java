package a23;

import androidx.lifecycle.AbstractC1637w1;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl;
import io.getstream.chat.android.p226ui.viewmodel.channel.ChannelInfoMemberViewModel;
import j93.InterfaceC21493z;
import l83.C23454a0;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p500tb.InterfaceC33687a;
import p698au1.AbstractC2063h;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a23.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0175b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f564w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f565x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f566y;

    public /* synthetic */ C0175b(String str, String str2, int i13) {
        this.f564w = i13;
        this.f565x = str;
        this.f566y = str2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i13 = this.f564w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        String str = this.f566y;
        String str2 = this.f565x;
        switch (i13) {
            case 0:
                return ChannelInfoMemberViewModel._init_$lambda$0(str2, str, (AbstractC1637w1) obj);
            case 1:
                return AbstractC2063h.m6500h(str2, str, (InterfaceC18044z) obj);
            case 2:
                InterfaceC18044z semantics = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics, "$this$semantics");
                AbstractC18041w.m51812k(str2, semantics);
                C18043y c18043y = AbstractC18039u.f70035b;
                InterfaceC21493z interfaceC21493z = AbstractC18041w.f70062a[0];
                c18043y.m51817a(semantics, str);
                return c23454a0;
            case 3:
                InterfaceC18044z semantics2 = (InterfaceC18044z) obj;
                AbstractC22676k.m65750j(semantics2, "$this$semantics");
                if (str2 != null) {
                    str = str2;
                }
                InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                ((C18030l) semantics2).m51772e(AbstractC18039u.f70029K, str);
                return c23454a0;
            case 4:
                MessageDao_Impl.deleteMessage$lambda$27("DELETE from stream_chat_message WHERE cid = ? AND id = ?", str2, str, (InterfaceC33687a) obj);
                return c23454a0;
            default:
                AbstractC18041w.m51806e(str2 + ", " + str, (InterfaceC18044z) obj);
                return c23454a0;
        }
    }
}
