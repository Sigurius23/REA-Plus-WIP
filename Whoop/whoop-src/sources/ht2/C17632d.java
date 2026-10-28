package ht2;

import android.webkit.WebView;
import androidx.compose.p018ui.Modifier;
import androidx.health.platform.client.proto.C1533u;
import if0.AbstractC18452c;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.events.ChatEvent;
import io.getstream.chat.android.client.internal.offline.repository.domain.channel.internal.ChannelDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.MessageDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollDao_Impl;
import io.getstream.chat.android.client.internal.offline.repository.domain.threads.internal.ThreadDao_Impl;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.MessageComposerController;
import io.getstream.chat.android.p226ui.feature.messages.ChannelActivity;
import io.getstream.chat.android.p226ui.feature.messages.ChannelFragment;
import j93.AbstractC21478l0;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m41.AbstractC25053e;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18030l;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p294l3.C23254g;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p574w6.AbstractC36852c;
import p574w6.C36850a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.Function0;
import qy0.AbstractC30773f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ht2.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C17632d implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68382w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f68383x;

    public /* synthetic */ C17632d(String str, int i13) {
        this.f68382w = i13;
        this.f68383x = str;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        int i13 = this.f68382w;
        boolean z4 = false;
        C23454a0 c23454a0 = C23454a0.f92919a;
        String str = this.f68383x;
        switch (i13) {
            case 0:
                return AbstractC17633e.m50218Z(str, (Modifier) obj);
            case 1:
                return AbstractC18452c.m53189u(str, (WebView) obj);
            case 2:
                return ChatClient.m54521d(str, (List) obj);
            case 3:
                return Boolean.valueOf(ChatClient.subscribeForSingle$lambda$51(str, (ChatEvent) obj));
            case 4:
                ChannelDao_Impl.delete$lambda$10("DELETE from stream_chat_channel_state WHERE cid = ?", str, (InterfaceC33687a) obj);
                return c23454a0;
            case 5:
                MessageDao_Impl.deleteDraftMessage$lambda$25("DELETE FROM stream_chat_draft_message_entity WHERE id = ?", str, (InterfaceC33687a) obj);
                return c23454a0;
            case 6:
                MessageDao_Impl.deleteMessages$lambda$28("DELETE from stream_chat_message WHERE cid = ?", str, (InterfaceC33687a) obj);
                return c23454a0;
            case 7:
                PollDao_Impl.deletePoll$lambda$2("DELETE FROM stream_chat_poll WHERE id = ?", str, (InterfaceC33687a) obj);
                return c23454a0;
            case 8:
                ThreadDao_Impl.deleteThreads$lambda$4("DELETE from stream_chat_thread WHERE cid=?", str, (InterfaceC33687a) obj);
                return c23454a0;
            case 9:
                return MessageComposerController.enrichPreview$lambda$73(str, (Attachment) obj);
            case 10:
                ChannelActivity.createChannelFragment$lambda$1(str, (ChannelFragment.Builder) obj);
                return c23454a0;
            case 11:
                AbstractC18041w.m51806e(str, (InterfaceC18044z) obj);
                return c23454a0;
            case 12:
                InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj;
                AbstractC18041w.m51807f(interfaceC18044z, 0);
                AbstractC18041w.m51806e(str, interfaceC18044z);
                return c23454a0;
            case 13:
                InterfaceC18044z interfaceC18044z2 = (InterfaceC18044z) obj;
                AbstractC18041w.m51813l(interfaceC18044z2, new C23254g(str));
                AbstractC18041w.m51810i(interfaceC18044z2, 0);
                return c23454a0;
            case 14:
                InterfaceC18044z interfaceC18044z3 = (InterfaceC18044z) obj;
                AbstractC18041w.m51813l(interfaceC18044z3, new C23254g(str));
                AbstractC18041w.m51810i(interfaceC18044z3, 0);
                return c23454a0;
            case 15:
                AbstractC18041w.m51808g(str, (InterfaceC18044z) obj);
                return c23454a0;
            case 16:
                InterfaceC18044z interfaceC18044z4 = (InterfaceC18044z) obj;
                AbstractC18041w.m51807f(interfaceC18044z4, 0);
                AbstractC18041w.m51806e(str, interfaceC18044z4);
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC18041w.m51808g(str, (InterfaceC18044z) obj);
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                InterfaceC18044z interfaceC18044z5 = (InterfaceC18044z) obj;
                AbstractC18041w.m51808g(str, interfaceC18044z5);
                C18043y c18043y = AbstractC18039u.f70052s;
                InterfaceC21493z interfaceC21493z = AbstractC18041w.f70062a[10];
                c18043y.m51817a(interfaceC18044z5, Float.valueOf(0.0f));
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Function0.m72260g(str, (InterfaceC18044z) obj);
            case 20:
                return Function0.m72262i(str, (InterfaceC18044z) obj);
            case 21:
                InterfaceC18044z interfaceC18044z6 = (InterfaceC18044z) obj;
                AbstractC18041w.m51807f(interfaceC18044z6, 1);
                AbstractC18041w.m51808g(str, interfaceC18044z6);
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                ((C18030l) ((InterfaceC18044z) obj)).m51772e(AbstractC18039u.f70029K, str);
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC25053e.m73494C(str, (InterfaceC18044z) obj);
            case 24:
                ((C36850a) obj).f157625a.put(AbstractC36852c.f157627a, AbstractC37056f.m118958J(str));
                return c23454a0;
            case 25:
                InterfaceC33687a _connection = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    interfaceC33689cMo68212g1.mo5354L(1, str);
                    if (interfaceC33689cMo68212g1.mo5355e1()) {
                        z4 = ((int) interfaceC33689cMo68212g1.getLong(0)) != 0;
                    }
                    return Boolean.valueOf(z4);
                } finally {
                    interfaceC33689cMo68212g1.close();
                }
            case 26:
                InterfaceC33687a _connection2 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection2, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g2 = _connection2.mo68212g1("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    interfaceC33689cMo68212g2.mo5354L(1, str);
                    if (interfaceC33689cMo68212g2.mo5355e1()) {
                        z4 = ((int) interfaceC33689cMo68212g2.getLong(0)) != 0;
                    }
                    return Boolean.valueOf(z4);
                } finally {
                    interfaceC33689cMo68212g2.close();
                }
            case 27:
                InterfaceC33687a _connection3 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection3, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g3 = _connection3.mo68212g1("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    interfaceC33689cMo68212g3.mo5354L(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC33689cMo68212g3.mo5355e1()) {
                        arrayList.add(interfaceC33689cMo68212g3.mo5353J0(0));
                    }
                    interfaceC33689cMo68212g3.close();
                    return arrayList;
                } catch (Throwable th3) {
                    interfaceC33689cMo68212g3.close();
                    throw th3;
                }
            case 28:
                InterfaceC33687a _connection4 = (InterfaceC33687a) obj;
                AbstractC22676k.m65750j(_connection4, "_connection");
                InterfaceC33689c interfaceC33689cMo68212g4 = _connection4.mo68212g1("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    interfaceC33689cMo68212g4.mo5354L(1, str);
                    interfaceC33689cMo68212g4.mo5355e1();
                    return Integer.valueOf(AbstractC21478l0.m60402H(_connection4));
                } finally {
                    interfaceC33689cMo68212g4.close();
                }
            default:
                return AbstractC30773f.m94551y(str, (InterfaceC18044z) obj);
        }
    }
}
