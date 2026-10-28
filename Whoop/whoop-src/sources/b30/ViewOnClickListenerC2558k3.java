package b30;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import com.google.android.material.datepicker.C5021o;
import com.stripe.android.paymentsheet.p055ui.PrimaryButton;
import com.whoop.android.R;
import com.whoop.p069ui.WhoopEditText;
import io.getstream.chat.android.p226ui.feature.channels.actions.internal.ChannelMembersAdapter;
import io.getstream.chat.android.p226ui.feature.gallery.internal.AttachmentGalleryImagePageFragment;
import io.getstream.chat.android.p226ui.feature.gallery.internal.AttachmentGalleryVideoPageFragment;
import io.getstream.chat.android.p226ui.feature.gallery.overview.internal.MediaAttachmentAdapter;
import io.getstream.chat.android.p226ui.feature.gallery.overview.internal.MediaAttachmentDialogFragment;
import io.getstream.chat.android.p226ui.feature.mentions.list.internal.MentionListItemMessageViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.camera.internal.CameraAttachmentFragment;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.FileAttachmentAdapter;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.MessageListScrollHelper;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.AllPollOptionsDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.PollCommentsDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.PollOptionVotesDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.PollResultsDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal.UserReactionAdapter;
import io.getstream.chat.android.p226ui.feature.threads.list.ThreadListView;
import io.getstream.chat.android.p226ui.feature.threads.list.adapter.viewholder.internal.ThreadItemViewHolder;
import io.sentry.android.core.AlertDialogC20134o1;
import jo.C21830s;
import p004a2.AbstractC0152a;
import p031b9.C2830f0;
import p087db.C11842c0;
import p087db.C11859l;
import p087db.C11865o;
import p087db.C11869q;
import p087db.C11882x;
import p361o9.C27669i;
import p361o9.C27670j;
import p516u8.InterfaceC34599j0;

/* JADX INFO: renamed from: b30.k3 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ViewOnClickListenerC2558k3 implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9936w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9937x;

    public /* synthetic */ ViewOnClickListenerC2558k3(Object obj, int i13) {
        this.f9936w = i13;
        this.f9937x = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f9936w;
        Object obj = this.f9937x;
        switch (i13) {
            case 0:
                int i14 = PrimaryButton.f22398O;
                ((C2598p3) obj).f10108c.invoke();
                return;
            case 1:
                ((C5021o) obj).m15752z();
                throw null;
            case 2:
                ((WhoopEditText) obj).m26672T(view);
                return;
            case 3:
                C11882x c11882x = (C11882x) obj;
                c11882x.m31856k(!c11882x.f38791K0);
                return;
            case 4:
                C11882x c11882x2 = ((C11859l) obj).f38690e;
                InterfaceC34599j0 interfaceC34599j0 = c11882x2.f38789J0;
                if (interfaceC34599j0 == null || !((AbstractC0152a) interfaceC34599j0).m367A(29)) {
                    return;
                }
                C27670j c27670jM8111k0 = ((C2830f0) c11882x2.f38789J0).m8111k0();
                InterfaceC34599j0 interfaceC34599j1 = c11882x2.f38789J0;
                c27670jM8111k0.getClass();
                C27669i c27669i = new C27669i(c27670jM8111k0);
                c27669i.m109413a(1);
                c27669i.m83663d(1);
                ((C2830f0) interfaceC34599j1).m8083D0(new C27670j(c27669i));
                c11882x2.f38780F.f38748c[1] = c11882x2.getResources().getString(R.string.exo_track_selection_auto);
                c11882x2.f38790K.dismiss();
                return;
            case 5:
                C11869q c11869q = (C11869q) obj;
                C11882x c11882x3 = c11869q.f38745d;
                int bindingAdapterPosition = c11869q.getBindingAdapterPosition();
                View view2 = c11882x3.f38820c0;
                if (bindingAdapterPosition == 0) {
                    C11865o c11865o = c11882x3.f38782G;
                    view2.getClass();
                    c11882x3.m31849d(c11865o, view2);
                    return;
                } else {
                    if (bindingAdapterPosition != 1) {
                        c11882x3.f38790K.dismiss();
                        return;
                    }
                    C11859l c11859l = c11882x3.f38786I;
                    view2.getClass();
                    c11882x3.m31849d(c11859l, view2);
                    return;
                }
            case 6:
                C11882x c11882x4 = ((C11859l) obj).f38690e;
                InterfaceC34599j0 interfaceC34599j2 = c11882x4.f38789J0;
                if (interfaceC34599j2 == null || !((AbstractC0152a) interfaceC34599j2).m367A(29)) {
                    return;
                }
                C27670j c27670jM8111k1 = ((C2830f0) c11882x4.f38789J0).m8111k0();
                InterfaceC34599j0 interfaceC34599j3 = c11882x4.f38789J0;
                c27670jM8111k1.getClass();
                C27669i c27669i2 = new C27669i(c27670jM8111k1);
                c27669i2.m109413a(3);
                c27669i2.f145824r = -3;
                c27669i2.mo83662c(new String[0]);
                c27669i2.f145823q = false;
                ((C2830f0) interfaceC34599j3).m8083D0(new C27670j(c27669i2));
                c11882x4.f38790K.dismiss();
                return;
            case 7:
                C11842c0 c11842c0 = (C11842c0) obj;
                c11842c0.m31794i();
                if (view.getId() == R.id.exo_overflow_show) {
                    c11842c0.f38609q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        c11842c0.f38610r.start();
                        return;
                    }
                    return;
                }
            case 8:
                ChannelMembersAdapter.ChannelMemberViewHolder.m55098a((ChannelMembersAdapter.ChannelMemberViewHolder) obj, view);
                return;
            case 9:
                AttachmentGalleryImagePageFragment.m55154A((AttachmentGalleryImagePageFragment) obj, view);
                return;
            case 10:
                AttachmentGalleryVideoPageFragment.setupOnPlayButtonClickedListener$lambda$10((AttachmentGalleryVideoPageFragment) obj, view);
                return;
            case 11:
                MediaAttachmentAdapter.MediaAttachmentViewHolder.m55170b((MediaAttachmentAdapter.MediaAttachmentViewHolder) obj, view);
                return;
            case 12:
                ((MediaAttachmentDialogFragment) obj).dismiss();
                return;
            case 13:
                MentionListItemMessageViewHolder._init_$lambda$0((MentionListItemMessageViewHolder) obj, view);
                return;
            case 14:
                AttachmentsPickerDialogFragment.setupAttachButton$lambda$0((AttachmentsPickerDialogFragment) obj, view);
                return;
            case 15:
                CameraAttachmentFragment.m55246z((CameraAttachmentFragment) obj);
                return;
            case 16:
                FileAttachmentAdapter.FileAttachmentViewHolder.m55247a((FileAttachmentAdapter.FileAttachmentViewHolder) obj, view);
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentAdapter.AddMoreViewHolder.m55258a((io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentAdapter.AddMoreViewHolder) obj, view);
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentAdapter.MediaAttachmentViewHolder.m55259a((io.getstream.chat.android.ui.feature.messages.composer.attachment.picker.factory.media.internal.MediaAttachmentAdapter.MediaAttachmentViewHolder) obj, view);
                return;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                MediaAttachmentFragment.m55261y((MediaAttachmentFragment) obj);
                return;
            case 20:
                MessageListScrollHelper.m55608c((MessageListScrollHelper) obj, view);
                return;
            case 21:
                ((AllPollOptionsDialogFragment) obj).dismiss();
                return;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((PollCommentsDialogFragment) obj).dismiss();
                return;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                PollOptionVotesDialogFragment.Companion companion = PollOptionVotesDialogFragment.INSTANCE;
                ((PollOptionVotesDialogFragment) obj).dismiss();
                return;
            case 24:
                PollResultsDialogFragment.Companion companion2 = PollResultsDialogFragment.INSTANCE;
                ((PollResultsDialogFragment) obj).dismiss();
                return;
            case 25:
                UserReactionAdapter.UserReactionViewHolder._init_$lambda$0((UserReactionAdapter.UserReactionViewHolder) obj, view);
                return;
            case 26:
                int i15 = ThreadListView.f74826w;
                ((ThreadListView.UnreadThreadsBannerClickListener) obj).onUnreadThreadsBannerClick();
                return;
            case 27:
                ThreadItemViewHolder._init_$lambda$0((ThreadItemViewHolder) obj, view);
                return;
            case 28:
                ((AlertDialogC20134o1) obj).cancel();
                return;
            default:
                C21830s.m61756a((C21830s) obj);
                return;
        }
    }
}
