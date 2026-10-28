package h02;

import a00.C0072g;
import android.app.Activity;
import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import bf.InterfaceC3186a;
import c93.InterfaceC4339a;
import com.whoop.advancedlabs.multiconsentscreen.view.MultiConsentFragment;
import com.whoop.advancedlabsjoin.feature.updatetests.view.UpdateTestsFragment;
import com.whoop.gifting.feature.gifted.view.GiftedFragment;
import com.whoop.settings.debug.AiChatJournalEntryWidgetDebugFragment;
import com.whoop.settings.debug.AiChatTalkTextCardDebugFragment;
import com.whoop.settings.debug.QnaFormDebugFragment;
import com.whoop.settings.email.EditEmailFragment;
import gd0.AbstractC15713c;
import h20.C16686k4;
import h20.C16689l1;
import h20.C16775z3;
import h20.C16776z4;
import h40.C16838d;
import hj0.AbstractC17356o;
import hk0.AbstractC17378m;
import i20.AbstractC17960l1;
import i20.C17954j1;
import i20.C17982v0;
import i31.AbstractC18053h;
import i31.C18052g;
import ia2.C18294b;
import id0.AbstractC18409c;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;
import io.getstream.chat.android.client.internal.state.event.handler.internal.EventHandlerSequential;
import io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal.QueryChannelsMutableState;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.feature.channels.actions.internal.ChannelActionsDialogFragment;
import io.getstream.chat.android.p226ui.feature.gallery.overview.internal.MediaAttachmentAdapter;
import io.getstream.chat.android.p226ui.feature.mentions.list.MentionListView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;
import w30.C36784a;

/* JADX INFO: renamed from: h02.n0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16587n0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63843w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f63844x;

    public /* synthetic */ C16587n0(Object obj, int i13) {
        this.f63843w = i13;
        this.f63844x = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ec3.f2, java.lang.Object] */
    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f63843w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f63844x;
        switch (i13) {
            case 0:
                return AbstractC16589o0.m47077i((C16591p0) obj);
            case 1:
                return ((Context) ((C0072g) obj).f223x).getSharedPreferences("DefaultPrefsRepository", 0);
            case 2:
                Set set = ((C16689l1) obj).f64187F;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    arrayList.add(upperCase);
                }
                return AbstractC25265s.m74103I1(arrayList);
            case 3:
                ((C16686k4) obj).f64165i0.mo36564a(new C16775z3(true));
                return c23454a0;
            case 4:
                C35459c0 c35459c0 = (C35459c0) ((C16776z4) obj).f64482a.getValue();
                return Boolean.valueOf((c35459c0 != null ? c35459c0.f150965H : null) instanceof C36784a);
            case 5:
                Boolean bool = (Boolean) ((C16838d) obj).f64708b.getValue();
                bool.getClass();
                return bool;
            case 6:
                return AiChatJournalEntryWidgetDebugFragment.m25358B((AiChatJournalEntryWidgetDebugFragment) obj);
            case 7:
                return AiChatTalkTextCardDebugFragment.m25364D((AiChatTalkTextCardDebugFragment) obj);
            case 8:
                return QnaFormDebugFragment.m25369B((QnaFormDebugFragment) obj);
            case 9:
                return AbstractC17356o.m49134r((AbstractC17356o) obj);
            case 10:
                return AbstractC17378m.m49205c0((ByteBuffer) obj);
            case 11:
                C17982v0 c17982v0 = (C17982v0) obj;
                c17982v0.f69815I.mo43573s("");
                c17982v0.f69819z.m36570j(null);
                return c23454a0;
            case 12:
                AbstractC17960l1.m51584k(((C17954j1) obj).f69757x);
                return c23454a0;
            case 13:
                return AbstractC18053h.m51862k((C18052g) obj);
            case 14:
                return C18294b.m52683t((Activity) obj);
            case 15:
                return EditEmailFragment.m25373B((EditEmailFragment) obj);
            case 16:
                return MultiConsentFragment.m17495J((MultiConsentFragment) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Integer.valueOf(AbstractC18409c.m52986y((AbstractC15713c.e) obj));
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return "Business metric '" + ((InterfaceC3186a) obj).mo9168a() + "' will be skipped due to length being > 2. This is likely a bug. Please raise an issue at https://github.com/awslabs/aws-sdk-kotlin/issues/new/choose";
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return UpdateTestsFragment.m17720C((UpdateTestsFragment) obj);
            case 20:
                return GiftedFragment.m21452C((GiftedFragment) obj);
            case 21:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.ConnectUserIdentifier((User) obj));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ChatClient.Companion companion2 = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.QueryChannelsIdentifier((QueryChannelsRequest) obj));
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ChatClient.Companion companion3 = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.UpdateMessageIdentifier((Message) obj));
            case 24:
                return EventHandlerSequential.m54783d((EventHandlerSequential) obj);
            case 25:
                return QueryChannelsMutableState.m54864a((QueryChannelsMutableState) obj);
            case 26:
                return ((ChatClient) obj).getMessageReceiptManager();
            case 27:
                return ChannelActionsDialogFragment.m55094A((ChannelActionsDialogFragment) obj);
            case 28:
                MediaAttachmentAdapter.MediaAttachmentViewHolder.loadImage$lambda$1((MediaAttachmentAdapter.MediaAttachmentViewHolder) obj);
                return c23454a0;
            default:
                MentionListView.scrollListener$lambda$0((MentionListView) obj);
                return c23454a0;
        }
    }
}
