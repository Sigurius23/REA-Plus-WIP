package io.getstream.chat.android.p226ui.feature.messages.composer;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractC1329o1;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.C19383k;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.ChannelCapabilities;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.CreatePollParams;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.common.utils.extensions.C19616a;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageComposerBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.AttachmentsPickerDialogStyle;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.DefaultMessageComposerCenterContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.DefaultMessageComposerCommandSuggestionsContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.DefaultMessageComposerFooterContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.DefaultMessageComposerHeaderContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.DefaultMessageComposerLeadingContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.DefaultMessageComposerMentionSuggestionsContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.DefaultMessageComposerOverlappingContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.DefaultMessageComposerTrailingContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerCenterContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerCommandSuggestionsContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerFooterContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerHeaderContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerLeadingContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerMentionSuggestionsContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerTrailingContent;
import io.getstream.chat.android.p226ui.feature.messages.composer.internal.MessageComposerSuggestionsPopup;
import io.getstream.chat.android.p226ui.feature.messages.composer.internal.ValidationErrorRenderer;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import java.util.NoSuchElementException;
import l83.C23454a0;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p184h5.C16907r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002·\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001c\u001a\u00020\u000e\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u000e\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ/\u0010\u001f\u001a\u00020\u000e\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001f\u0010\u001dJ/\u0010 \u001a\u00020\u000e\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b \u0010\u001dJ/\u0010!\u001a\u00020\u000e\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b!\u0010\u001dJ/\u0010\"\u001a\u00020\u000e\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\"\u0010\u001dJ#\u0010#\u001a\u00020\u000e\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u000e\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u000eH\u0014¢\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u000e2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b*\u0010\u0015J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b+\u0010\u0015J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b,\u0010\u0015J!\u0010-\u001a\u00028\u0000\"\f\b\u0000\u0010\u0018*\u00020\u0016*\u00020\u0017*\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\r\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u00108\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR(\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR.\u0010L\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR4\u0010T\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0R\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010M\u001a\u0004\bU\u0010O\"\u0004\bV\u0010QR.\u0010X\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010M\u001a\u0004\bY\u0010O\"\u0004\bZ\u0010QR.\u0010[\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010M\u001a\u0004\b\\\u0010O\"\u0004\b]\u0010QR.\u0010_\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010M\u001a\u0004\b`\u0010O\"\u0004\ba\u0010QR.\u0010c\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010M\u001a\u0004\bd\u0010O\"\u0004\be\u0010QR.\u0010f\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010M\u001a\u0004\bg\u0010O\"\u0004\bh\u0010QR(\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010E\u001a\u0004\bj\u0010G\"\u0004\bk\u0010IR(\u0010l\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010E\u001a\u0004\bm\u0010G\"\u0004\bn\u0010IR(\u0010o\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010E\u001a\u0004\bp\u0010G\"\u0004\bq\u0010IR.\u0010t\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020s0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010M\u001a\u0004\bu\u0010O\"\u0004\bv\u0010QR(\u0010w\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010E\u001a\u0004\bx\u0010G\"\u0004\by\u0010IR\u0016\u0010z\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R.\u0010}\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020/0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u0010M\u001a\u0004\b~\u0010O\"\u0004\b\u007f\u0010QR,\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010E\u001a\u0005\b\u0081\u0001\u0010G\"\u0005\b\u0082\u0001\u0010IR,\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0083\u0001\u0010E\u001a\u0005\b\u0084\u0001\u0010G\"\u0005\b\u0085\u0001\u0010IR,\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010E\u001a\u0005\b\u0087\u0001\u0010G\"\u0005\b\u0088\u0001\u0010IR,\u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010E\u001a\u0005\b\u008a\u0001\u0010G\"\u0005\b\u008b\u0001\u0010IR,\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008c\u0001\u0010E\u001a\u0005\b\u008d\u0001\u0010G\"\u0005\b\u008e\u0001\u0010IR,\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010E\u001a\u0005\b\u0090\u0001\u0010G\"\u0005\b\u0091\u0001\u0010IR,\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010E\u001a\u0005\b\u0093\u0001\u0010G\"\u0005\b\u0094\u0001\u0010IR,\u0010\u0095\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010E\u001a\u0005\b\u0096\u0001\u0010G\"\u0005\b\u0097\u0001\u0010IR3\u0010\u0099\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010M\u001a\u0005\b\u009a\u0001\u0010O\"\u0005\b\u009b\u0001\u0010QR3\u0010\u009c\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010M\u001a\u0005\b\u009d\u0001\u0010O\"\u0005\b\u009e\u0001\u0010QR\u001c\u0010 \u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R!\u0010¢\u0001\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R!\u0010¤\u0001\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010£\u0001R\u001f\u0010¨\u0001\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¥\u0001\u00104\u001a\u0006\b¦\u0001\u0010§\u0001R\u001b\u0010©\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001f\u0010\u00ad\u0001\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b«\u0001\u00104\u001a\u0006\b¬\u0001\u0010§\u0001R\u001b\u0010®\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010ª\u0001R\u0018\u0010²\u0001\u001a\u00030¯\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u0017\u0010´\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010§\u0001R\u0017\u0010¶\u0001\u001a\u00020\u00168BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010§\u0001¨\u0006¸\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/os/Parcelable;", "state", "Ll83/a0;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onSaveInstanceState", "()Landroid/os/Parcelable;", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "renderState", "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V", "Landroid/view/View;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;", "V", "contentView", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "setLeadingContent", "(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V", "setCenterContent", "setTrailingContent", "setFooterContent", "setHeaderContent", "setCenterOverlapContent", "setMentionSuggestionsContent", "(Landroid/view/View;)V", "setCommandSuggestionsContent", "onDetachedFromWindow", "()V", "init", "(Landroid/util/AttributeSet;)V", "renderSuggestion", "renderCommandsSuggestions", "renderMentionSuggestions", "attachContext", "(Landroid/view/View;)Landroid/view/View;", "", "arePollsEnabled", "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)Z", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "arePollEnabled", "Z", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "messageComposerContext", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;", "validationErrorRenderer", "Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;", "Lkotlin/Function0;", "sendMessageButtonClickListener", "Lc93/a;", "getSendMessageButtonClickListener", "()Lc93/a;", "setSendMessageButtonClickListener", "(Lc93/a;)V", "Lkotlin/Function1;", "", "textInputChangeListener", "Lkotlin/jvm/functions/Function1;", "getTextInputChangeListener", "()Lkotlin/jvm/functions/Function1;", "setTextInputChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "", "Lio/getstream/chat/android/models/Attachment;", "attachmentSelectionListener", "getAttachmentSelectionListener", "setAttachmentSelectionListener", "Lio/getstream/chat/android/models/CreatePollParams;", "pollSubmissionListener", "getPollSubmissionListener", "setPollSubmissionListener", "attachmentRemovalListener", "getAttachmentRemovalListener", "setAttachmentRemovalListener", "Lio/getstream/chat/android/models/User;", "mentionSelectionListener", "getMentionSelectionListener", "setMentionSelectionListener", "Lio/getstream/chat/android/models/Command;", "commandSelectionListener", "getCommandSelectionListener", "setCommandSelectionListener", "alsoSendToChannelSelectionListener", "getAlsoSendToChannelSelectionListener", "setAlsoSendToChannelSelectionListener", "dismissActionClickListener", "getDismissActionClickListener", "setDismissActionClickListener", "commandsButtonClickListener", "getCommandsButtonClickListener", "setCommandsButtonClickListener", "dismissSuggestionsListener", "getDismissSuggestionsListener", "setDismissSuggestionsListener", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;", "attachmentsPickerDialogBuilder", "getAttachmentsPickerDialogBuilder", "setAttachmentsPickerDialogBuilder", "attachmentsButtonClickListener", "getAttachmentsButtonClickListener", "setAttachmentsButtonClickListener", "maxOffset", "I", "Landroid/view/MotionEvent;", "audioRecordButtonTouchListener", "getAudioRecordButtonTouchListener", "setAudioRecordButtonTouchListener", "audioRecordButtonHoldListener", "getAudioRecordButtonHoldListener", "setAudioRecordButtonHoldListener", "audioRecordButtonLockListener", "getAudioRecordButtonLockListener", "setAudioRecordButtonLockListener", "audioRecordButtonCancelListener", "getAudioRecordButtonCancelListener", "setAudioRecordButtonCancelListener", "audioRecordButtonReleaseListener", "getAudioRecordButtonReleaseListener", "setAudioRecordButtonReleaseListener", "audioDeleteButtonClickListener", "getAudioDeleteButtonClickListener", "setAudioDeleteButtonClickListener", "audioStopButtonClickListener", "getAudioStopButtonClickListener", "setAudioStopButtonClickListener", "audioPlaybackButtonClickListener", "getAudioPlaybackButtonClickListener", "setAudioPlaybackButtonClickListener", "audioCompleteButtonClickListener", "getAudioCompleteButtonClickListener", "setAudioCompleteButtonClickListener", "", "audioSliderDragStartListener", "getAudioSliderDragStartListener", "setAudioSliderDragStartListener", "audioSliderDragStopListener", "getAudioSliderDragStopListener", "setAudioSliderDragStopListener", "Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;", "suggestionsPopup", "Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;", "commandSuggestions", "Ljava/util/List;", "mentionSuggestions", "defaultMentionSuggestionsView$delegate", "getDefaultMentionSuggestionsView", "()Landroid/view/View;", "defaultMentionSuggestionsView", "mentionSuggestionsContentOverride", "Landroid/view/View;", "defaultCommandSuggestionsView$delegate", "getDefaultCommandSuggestionsView", "defaultCommandSuggestionsView", "commandSuggestionsContentOverride", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "getComposerStyle$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "composerStyle", "getMentionSuggestionsContent", "mentionSuggestionsContent", "getCommandSuggestionsContent", "commandSuggestionsContent", "SuggestionPopupTouchListener", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageComposerView extends ConstraintLayout {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f74523w = 0;
    private Function1 alsoSendToChannelSelectionListener;
    private boolean arePollEnabled;
    private Function1 attachmentRemovalListener;
    private Function1 attachmentSelectionListener;
    private InterfaceC4339a attachmentsButtonClickListener;
    private Function1 attachmentsPickerDialogBuilder;
    private InterfaceC4339a audioCompleteButtonClickListener;
    private InterfaceC4339a audioDeleteButtonClickListener;
    private InterfaceC4339a audioPlaybackButtonClickListener;
    private InterfaceC4339a audioRecordButtonCancelListener;
    private InterfaceC4339a audioRecordButtonHoldListener;
    private InterfaceC4339a audioRecordButtonLockListener;
    private InterfaceC4339a audioRecordButtonReleaseListener;
    private Function1 audioRecordButtonTouchListener;
    private Function1 audioSliderDragStartListener;
    private Function1 audioSliderDragStopListener;
    private InterfaceC4339a audioStopButtonClickListener;
    private StreamUiMessageComposerBinding binding;
    private Function1 commandSelectionListener;
    private List<Command> commandSuggestions;
    private View commandSuggestionsContentOverride;
    private InterfaceC4339a commandsButtonClickListener;

    /* JADX INFO: renamed from: defaultCommandSuggestionsView$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h defaultCommandSuggestionsView;

    /* JADX INFO: renamed from: defaultMentionSuggestionsView$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h defaultMentionSuggestionsView;
    private InterfaceC4339a dismissActionClickListener;
    private InterfaceC4339a dismissSuggestionsListener;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private int maxOffset;
    private Function1 mentionSelectionListener;
    private List<User> mentionSuggestions;
    private View mentionSuggestionsContentOverride;
    private MessageComposerContext messageComposerContext;
    private Function1 pollSubmissionListener;
    private InterfaceC4339a sendMessageButtonClickListener;
    private MessageComposerSuggestionsPopup suggestionsPopup;
    private Function1 textInputChangeListener;
    private ValidationErrorRenderer validationErrorRenderer;

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView$SuggestionPopupTouchListener;", "Landroid/view/View$OnTouchListener;", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V", "onTouch", "", "v", "Landroid/view/View;", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public final class SuggestionPopupTouchListener implements View.OnTouchListener {
        public SuggestionPopupTouchListener() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View v13, MotionEvent event) {
            MessageComposerSuggestionsPopup messageComposerSuggestionsPopup = MessageComposerView.this.suggestionsPopup;
            if (messageComposerSuggestionsPopup != null && event != null && event.getAction() == 4) {
                int[] iArr = new int[2];
                messageComposerSuggestionsPopup.getContentView().getLocationOnScreen(iArr);
                float x3 = event.getX();
                float y13 = event.getY();
                float f13 = iArr[0] + x3;
                float f14 = iArr[1] + y13;
                Rect rect = new Rect();
                StreamUiMessageComposerBinding streamUiMessageComposerBinding = MessageComposerView.this.binding;
                if (streamUiMessageComposerBinding == null) {
                    AbstractC22676k.m65757q("binding");
                    throw null;
                }
                streamUiMessageComposerBinding.leadingContent.getGlobalVisibleRect(rect);
                if (rect.contains((int) f13, (int) f14)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerView(Context context) {
        this(context, null);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: A */
    public static void m55185A(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonHoldListener.invoke();
    }

    /* JADX INFO: renamed from: B */
    public static void m55186B(MessageComposerView messageComposerView) {
        messageComposerView.commandsButtonClickListener.invoke();
    }

    /* JADX INFO: renamed from: E */
    public static void m55189E(MessageComposerView messageComposerView) {
        messageComposerView.dismissActionClickListener.invoke();
    }

    /* JADX INFO: renamed from: F */
    public static void m55190F(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonCancelListener.invoke();
    }

    /* JADX INFO: renamed from: J */
    public static void m55194J(MessageComposerView messageComposerView) {
        messageComposerView.audioPlaybackButtonClickListener.invoke();
    }

    /* JADX INFO: renamed from: L */
    public static void m55196L(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonLockListener.invoke();
    }

    /* JADX INFO: renamed from: M */
    public static void m55197M(MessageComposerView messageComposerView) {
        messageComposerView.audioStopButtonClickListener.invoke();
    }

    /* JADX INFO: renamed from: N */
    public static void m55198N(MessageComposerView messageComposerView) {
        messageComposerView.audioDeleteButtonClickListener.invoke();
    }

    /* JADX INFO: renamed from: O */
    public static void m55199O(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonCancelListener.invoke();
    }

    /* JADX INFO: renamed from: V */
    public static void m55206V(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonReleaseListener.invoke();
    }

    /* JADX INFO: renamed from: W */
    public static void m55207W(MessageComposerView messageComposerView) {
        messageComposerView.audioStopButtonClickListener.invoke();
    }

    /* JADX INFO: renamed from: Y */
    public static void m55209Y(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonHoldListener.invoke();
    }

    private final boolean arePollsEnabled(MessageComposerState state) {
        return (state.getMessageMode() instanceof MessageMode.Normal) && state.getPollsEnabled() && state.getOwnCapabilities().contains(ChannelCapabilities.SEND_POLL);
    }

    private final <V extends View & MessageComposerContent> V attachContext(V v13) {
        V v14 = v13;
        MessageComposerContext messageComposerContext = this.messageComposerContext;
        if (messageComposerContext != null) {
            v14.attachContext(messageComposerContext);
            return v13;
        }
        AbstractC22676k.m65757q("messageComposerContext");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 attachmentRemovalListener$lambda$4(Attachment it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 attachmentSelectionListener$lambda$2(List it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    public static final C23454a0 attachmentsButtonClickListener$lambda$17(MessageComposerView messageComposerView) {
        boolean z4;
        AbstractC1329o1 fragmentManager = ContextKt.getFragmentManager(messageComposerView.getContext());
        if (fragmentManager != null) {
            Function1 function1 = messageComposerView.attachmentsPickerDialogBuilder;
            MessageComposerContext messageComposerContext = messageComposerView.messageComposerContext;
            if (messageComposerContext == null) {
                AbstractC22676k.m65757q("messageComposerContext");
                throw null;
            }
            AttachmentsPickerDialogStyle attachmentsPickerDialogStyle = messageComposerContext.getStyle().getAttachmentsPickerDialogStyle();
            if (messageComposerView.arePollEnabled) {
                MessageComposerContext messageComposerContext2 = messageComposerView.messageComposerContext;
                if (messageComposerContext2 == null) {
                    AbstractC22676k.m65757q("messageComposerContext");
                    throw null;
                }
                if (messageComposerContext2.getStyle().getAttachmentsPickerDialogStyle().getPollAttachmentsTabEnabled()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            ((AttachmentsPickerDialogFragment) function1.invoke(attachmentsPickerDialogStyle.copy(((-1) & 1) != 0 ? attachmentsPickerDialogStyle.useDefaultSystemMediaPicker : false, ((-1) & 2) != 0 ? attachmentsPickerDialogStyle.saveAttachmentsOnDismiss : false, ((-1) & 4) != 0 ? attachmentsPickerDialogStyle.attachmentsPickerBackgroundColor : 0, ((-1) & 8) != 0 ? attachmentsPickerDialogStyle.allowAccessButtonTextStyle : null, ((-1) & 16) != 0 ? attachmentsPickerDialogStyle.submitAttachmentsButtonIconDrawable : null, ((-1) & 32) != 0 ? attachmentsPickerDialogStyle.attachmentTabToggleButtonStateList : null, ((-1) & 64) != 0 ? attachmentsPickerDialogStyle.mediaAttachmentsTabEnabled : false, ((-1) & 128) != 0 ? attachmentsPickerDialogStyle.mediaAttachmentsTabIconDrawable : null, ((-1) & 256) != 0 ? attachmentsPickerDialogStyle.allowAccessToMediaButtonText : null, ((-1) & 512) != 0 ? attachmentsPickerDialogStyle.allowAccessToMediaIconDrawable : null, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? attachmentsPickerDialogStyle.videoLengthTextVisible : false, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? attachmentsPickerDialogStyle.videoLengthTextStyle : null, ((-1) & 4096) != 0 ? attachmentsPickerDialogStyle.videoIconVisible : false, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? attachmentsPickerDialogStyle.videoIconDrawable : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? attachmentsPickerDialogStyle.videoIconDrawableTint : null, ((-1) & 32768) != 0 ? attachmentsPickerDialogStyle.mediaAttachmentNoMediaText : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? attachmentsPickerDialogStyle.mediaAttachmentNoMediaTextStyle : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? attachmentsPickerDialogStyle.fileAttachmentsTabEnabled : false, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? attachmentsPickerDialogStyle.fileAttachmentsTabIconDrawable : null, ((-1) & 524288) != 0 ? attachmentsPickerDialogStyle.allowAccessToFilesButtonText : null, ((-1) & 1048576) != 0 ? attachmentsPickerDialogStyle.allowAccessToFilesIconDrawable : null, ((-1) & 2097152) != 0 ? attachmentsPickerDialogStyle.allowAccessToAudioText : null, ((-1) & 4194304) != 0 ? attachmentsPickerDialogStyle.allowAccessToAudioTextStyle : null, ((-1) & 8388608) != 0 ? attachmentsPickerDialogStyle.allowAccessToAudioIconDrawable : null, ((-1) & 16777216) != 0 ? attachmentsPickerDialogStyle.allowAccessToVisualMediaText : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? attachmentsPickerDialogStyle.allowAccessToMoreVisualMediaText : null, ((-1) & 67108864) != 0 ? attachmentsPickerDialogStyle.allowAccessToVisualMediaTextStyle : null, ((-1) & 134217728) != 0 ? attachmentsPickerDialogStyle.allowAccessToVisualMediaIconDrawable : null, ((-1) & 268435456) != 0 ? attachmentsPickerDialogStyle.recentFilesText : null, ((-1) & 536870912) != 0 ? attachmentsPickerDialogStyle.recentFilesTextStyle : null, ((-1) & 1073741824) != 0 ? attachmentsPickerDialogStyle.fileManagerIconDrawable : null, ((-1) & Integer.MIN_VALUE) != 0 ? attachmentsPickerDialogStyle.fileAttachmentsNoFilesText : null, (32511 & 1) != 0 ? attachmentsPickerDialogStyle.fileAttachmentsNoFilesTextStyle : null, (32511 & 2) != 0 ? attachmentsPickerDialogStyle.fileAttachmentItemNameTextStyle : null, (32511 & 4) != 0 ? attachmentsPickerDialogStyle.fileAttachmentItemSizeTextStyle : null, (32511 & 8) != 0 ? attachmentsPickerDialogStyle.fileAttachmentItemCheckboxSelectedDrawable : null, (32511 & 16) != 0 ? attachmentsPickerDialogStyle.fileAttachmentItemCheckboxDeselectedDrawable : null, (32511 & 32) != 0 ? attachmentsPickerDialogStyle.fileAttachmentItemCheckboxTextColor : 0, (32511 & 64) != 0 ? attachmentsPickerDialogStyle.cameraAttachmentsTabEnabled : false, (32511 & 128) != 0 ? attachmentsPickerDialogStyle.cameraAttachmentsTabIconDrawable : null, (32511 & 256) != 0 ? attachmentsPickerDialogStyle.pollAttachmentsTabEnabled : z4, (32511 & 512) != 0 ? attachmentsPickerDialogStyle.pollAttachmentsTabIconDrawable : null, (32511 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? attachmentsPickerDialogStyle.allowAccessToCameraButtonText : null, (32511 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? attachmentsPickerDialogStyle.allowAccessToCameraIconDrawable : null, (32511 & 4096) != 0 ? attachmentsPickerDialogStyle.pickerMediaMode : null, (32511 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? attachmentsPickerDialogStyle.systemMediaPickerVisualMediaAllowMultiple : false, (32511 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? attachmentsPickerDialogStyle.systemMediaPickerVisualMediaType : null))).show(fragmentManager, AttachmentsPickerDialogFragment.TAG);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AttachmentsPickerDialogFragment attachmentsPickerDialogBuilder$lambda$15(MessageComposerView messageComposerView, AttachmentsPickerDialogStyle it) {
        AbstractC22676k.m65750j(it, "it");
        AttachmentsPickerDialogFragment attachmentsPickerDialogFragmentNewInstance$default = AttachmentsPickerDialogFragment.Companion.newInstance$default(AttachmentsPickerDialogFragment.INSTANCE, it, null, 2, null);
        attachmentsPickerDialogFragmentNewInstance$default.setAttachmentsSelectionListener(new C19710c(messageComposerView));
        attachmentsPickerDialogFragmentNewInstance$default.setPollSubmissionListener(new C19710c(messageComposerView));
        return attachmentsPickerDialogFragmentNewInstance$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachmentsPickerDialogBuilder$lambda$15$lambda$14$lambda$12(MessageComposerView messageComposerView, List attachments) {
        AbstractC22676k.m65750j(attachments, "attachments");
        messageComposerView.attachmentSelectionListener.invoke(attachments);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachmentsPickerDialogBuilder$lambda$15$lambda$14$lambda$13(MessageComposerView messageComposerView, CreatePollParams pollConfig) {
        AbstractC22676k.m65750j(pollConfig, "pollConfig");
        messageComposerView.pollSubmissionListener.invoke(pollConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean audioRecordButtonTouchListener$lambda$19(MessageComposerView messageComposerView, MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        C2345k logger = messageComposerView.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onMicBtnTouchListener] event(" + messageComposerView.maxOffset + "): " + event, null);
        }
        StreamUiMessageComposerBinding streamUiMessageComposerBinding = messageComposerView.binding;
        if (streamUiMessageComposerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout centerOverlapContent = streamUiMessageComposerBinding.centerOverlapContent;
        AbstractC22676k.m65749i(centerOverlapContent, "centerOverlapContent");
        C16907r0 c16907r0 = new C16907r0(centerOverlapContent);
        if (!c16907r0.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        ((View) c16907r0.next()).dispatchTouchEvent(event);
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m55212b0(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonReleaseListener.invoke();
    }

    /* JADX INFO: renamed from: c0 */
    public static void m55213c0(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonLockListener.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 commandSelectionListener$lambda$6(Command it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 commandsButtonClickListener$lambda$10(MessageComposerView messageComposerView) {
        C2345k logger = messageComposerView.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onCommandsButtonClick] no args", null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultMessageComposerCommandSuggestionsContent defaultCommandSuggestionsView_delegate$lambda$35(MessageComposerView messageComposerView) {
        Context context = messageComposerView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        DefaultMessageComposerCommandSuggestionsContent defaultMessageComposerCommandSuggestionsContent = new DefaultMessageComposerCommandSuggestionsContent(context);
        defaultMessageComposerCommandSuggestionsContent.setCommandSelectionListener(new C19709b(messageComposerView, 7));
        messageComposerView.attachContext(defaultMessageComposerCommandSuggestionsContent);
        return defaultMessageComposerCommandSuggestionsContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: defaultCommandSuggestionsView_delegate$lambda$35$lambda$34$lambda$33 */
    public static final C23454a0 m55215x50cf53c8(MessageComposerView messageComposerView, Command command) {
        AbstractC22676k.m65750j(command, "command");
        messageComposerView.commandSelectionListener.invoke(command);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultMessageComposerMentionSuggestionsContent defaultMentionSuggestionsView_delegate$lambda$32(MessageComposerView messageComposerView) {
        Context context = messageComposerView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        DefaultMessageComposerMentionSuggestionsContent defaultMessageComposerMentionSuggestionsContent = new DefaultMessageComposerMentionSuggestionsContent(context);
        defaultMessageComposerMentionSuggestionsContent.setMentionSelectionListener(new C19709b(messageComposerView, 6));
        messageComposerView.attachContext(defaultMessageComposerMentionSuggestionsContent);
        return defaultMessageComposerMentionSuggestionsContent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: defaultMentionSuggestionsView_delegate$lambda$32$lambda$31$lambda$30 */
    public static final C23454a0 m55216x2f1c0c5e(MessageComposerView messageComposerView, User user) {
        AbstractC22676k.m65750j(user, "user");
        messageComposerView.mentionSelectionListener.invoke(user);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m55217e0(MessageComposerView messageComposerView) {
        messageComposerView.audioPlaybackButtonClickListener.invoke();
    }

    /* JADX INFO: renamed from: g0 */
    public static void m55220g0(MessageComposerView messageComposerView) {
        messageComposerView.commandsButtonClickListener.invoke();
    }

    private final View getCommandSuggestionsContent() {
        View view = this.commandSuggestionsContentOverride;
        return view == null ? getDefaultCommandSuggestionsView() : view;
    }

    private final View getDefaultCommandSuggestionsView() {
        return (View) this.defaultCommandSuggestionsView.getValue();
    }

    private final View getDefaultMentionSuggestionsView() {
        return (View) this.defaultMentionSuggestionsView.getValue();
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final View getMentionSuggestionsContent() {
        View view = this.mentionSuggestionsContentOverride;
        return view == null ? getDefaultMentionSuggestionsView() : view;
    }

    private final void init(AttributeSet attrs) {
        this.binding = StreamUiMessageComposerBinding.inflate(ViewGroupKt.getStreamThemeInflater(this), this);
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.validationErrorRenderer = new ValidationErrorRenderer(context, this);
        MessageComposerViewStyle.Companion companion = MessageComposerViewStyle.INSTANCE;
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        MessageComposerViewStyle messageComposerViewStyleInvoke$stream_chat_android_ui_components_release = companion.invoke$stream_chat_android_ui_components_release(context2, attrs);
        StreamUiMessageComposerBinding streamUiMessageComposerBinding = this.binding;
        if (streamUiMessageComposerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        MessageComposerContext messageComposerContext = new MessageComposerContext(messageComposerViewStyleInvoke$stream_chat_android_ui_components_release, new MessageComposerViewKt.C196731(streamUiMessageComposerBinding));
        this.messageComposerContext = messageComposerContext;
        setBackgroundColor(messageComposerContext.getStyle().getBackgroundColor());
        StreamUiMessageComposerBinding streamUiMessageComposerBinding2 = this.binding;
        if (streamUiMessageComposerBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        View view = streamUiMessageComposerBinding2.separator;
        MessageComposerContext messageComposerContext2 = this.messageComposerContext;
        if (messageComposerContext2 == null) {
            AbstractC22676k.m65757q("messageComposerContext");
            throw null;
        }
        view.setBackground(messageComposerContext2.getStyle().getDividerBackgroundDrawable());
        Context context3 = getContext();
        AbstractC22676k.m65749i(context3, "getContext(...)");
        DefaultMessageComposerLeadingContent defaultMessageComposerLeadingContent = new DefaultMessageComposerLeadingContent(context3);
        defaultMessageComposerLeadingContent.setAttachmentsButtonClickListener(new C19674a(this, 11));
        defaultMessageComposerLeadingContent.setCommandsButtonClickListener(new C19674a(this, 19));
        setLeadingContent$default(this, defaultMessageComposerLeadingContent, null, 2, null);
        Context context4 = getContext();
        AbstractC22676k.m65749i(context4, "getContext(...)");
        DefaultMessageComposerCenterContent defaultMessageComposerCenterContent = new DefaultMessageComposerCenterContent(context4);
        defaultMessageComposerCenterContent.setTextInputChangeListener(new C19709b(this, 11));
        defaultMessageComposerCenterContent.setAttachmentRemovalListener(new C19709b(this, 12));
        setCenterContent$default(this, defaultMessageComposerCenterContent, null, 2, null);
        Context context5 = getContext();
        AbstractC22676k.m65749i(context5, "getContext(...)");
        DefaultMessageComposerTrailingContent defaultMessageComposerTrailingContent = new DefaultMessageComposerTrailingContent(context5);
        defaultMessageComposerTrailingContent.setSendMessageButtonClickListener(new C19674a(this, 21));
        defaultMessageComposerTrailingContent.setRecordAudioButtonTouchListener(new C19709b(this, 13));
        setTrailingContent$default(this, defaultMessageComposerTrailingContent, null, 2, null);
        Context context6 = getContext();
        AbstractC22676k.m65749i(context6, "getContext(...)");
        DefaultMessageComposerFooterContent defaultMessageComposerFooterContent = new DefaultMessageComposerFooterContent(context6);
        defaultMessageComposerFooterContent.setAlsoSendToChannelSelectionListener(new C19709b(this, 14));
        setFooterContent$default(this, defaultMessageComposerFooterContent, null, 2, null);
        Context context7 = getContext();
        AbstractC22676k.m65749i(context7, "getContext(...)");
        DefaultMessageComposerHeaderContent defaultMessageComposerHeaderContent = new DefaultMessageComposerHeaderContent(context7);
        defaultMessageComposerHeaderContent.setDismissActionClickListener(new C19674a(this, 22));
        setHeaderContent$default(this, defaultMessageComposerHeaderContent, null, 2, null);
        Context context8 = getContext();
        AbstractC22676k.m65749i(context8, "getContext(...)");
        DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent = new DefaultMessageComposerOverlappingContent(context8);
        defaultMessageComposerOverlappingContent.setRecordButtonHoldListener(new C19674a(this, 23));
        defaultMessageComposerOverlappingContent.setRecordButtonLockListener(new C19674a(this, 24));
        defaultMessageComposerOverlappingContent.setRecordButtonCancelListener(new C19674a(this, 13));
        defaultMessageComposerOverlappingContent.setRecordButtonReleaseListener(new C19674a(this, 14));
        defaultMessageComposerOverlappingContent.setDeleteButtonClickListener(new C19674a(this, 15));
        defaultMessageComposerOverlappingContent.setStopButtonClickListener(new C19674a(this, 16));
        defaultMessageComposerOverlappingContent.setPlaybackButtonClickListener(new C19674a(this, 17));
        defaultMessageComposerOverlappingContent.setCompleteButtonClickListener(new C19674a(this, 18));
        defaultMessageComposerOverlappingContent.setSliderDragStartListener(new C19709b(this, 9));
        defaultMessageComposerOverlappingContent.setSliderDragStopListener(new C19709b(this, 10));
        setCenterOverlapContent$default(this, defaultMessageComposerOverlappingContent, null, 2, null);
    }

    public static /* synthetic */ void init$default(MessageComposerView messageComposerView, AttributeSet attributeSet, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            attributeSet = null;
        }
        messageComposerView.init(attributeSet);
    }

    private static final C23454a0 init$lambda$38$lambda$36(MessageComposerView messageComposerView) {
        messageComposerView.attachmentsButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 init$lambda$38$lambda$37(MessageComposerView messageComposerView) {
        messageComposerView.commandsButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 init$lambda$41$lambda$39(MessageComposerView messageComposerView, String text) {
        AbstractC22676k.m65750j(text, "text");
        messageComposerView.textInputChangeListener.invoke(text);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 init$lambda$41$lambda$40(MessageComposerView messageComposerView, Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        messageComposerView.attachmentRemovalListener.invoke(attachment);
        return C23454a0.f92919a;
    }

    private static final C23454a0 init$lambda$44$lambda$42(MessageComposerView messageComposerView) {
        messageComposerView.sendMessageButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean init$lambda$44$lambda$43(MessageComposerView messageComposerView, MotionEvent event) {
        AbstractC22676k.m65750j(event, "event");
        return ((Boolean) messageComposerView.audioRecordButtonTouchListener.invoke(event)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 init$lambda$46$lambda$45(MessageComposerView messageComposerView, boolean z4) {
        messageComposerView.alsoSendToChannelSelectionListener.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    private static final C23454a0 init$lambda$48$lambda$47(MessageComposerView messageComposerView) {
        messageComposerView.dismissActionClickListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 init$lambda$59$lambda$49(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonHoldListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 init$lambda$59$lambda$50(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonLockListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 init$lambda$59$lambda$51(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonCancelListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 init$lambda$59$lambda$52(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonReleaseListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 init$lambda$59$lambda$53(MessageComposerView messageComposerView) {
        messageComposerView.audioDeleteButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 init$lambda$59$lambda$54(MessageComposerView messageComposerView) {
        messageComposerView.audioStopButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 init$lambda$59$lambda$55(MessageComposerView messageComposerView) {
        messageComposerView.audioPlaybackButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 init$lambda$59$lambda$56(MessageComposerView messageComposerView) {
        messageComposerView.audioCompleteButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 init$lambda$59$lambda$57(MessageComposerView messageComposerView, float f13) {
        messageComposerView.audioSliderDragStartListener.invoke(Float.valueOf(f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 init$lambda$59$lambda$58(MessageComposerView messageComposerView, float f13) {
        messageComposerView.audioSliderDragStopListener.invoke(Float.valueOf(f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static void m55223j(MessageComposerView messageComposerView) {
        messageComposerView.sendMessageButtonClickListener.invoke();
    }

    /* JADX INFO: renamed from: j0 */
    public static void m55224j0(MessageComposerView messageComposerView) {
        messageComposerView.audioCompleteButtonClickListener.invoke();
    }

    /* JADX INFO: renamed from: l */
    public static void m55227l(MessageComposerView messageComposerView) {
        messageComposerView.audioCompleteButtonClickListener.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 mentionSelectionListener$lambda$5(User it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 pollSubmissionListener$lambda$3(CreatePollParams it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static void m55233q(MessageComposerView messageComposerView) {
        messageComposerView.suggestionsPopup = null;
        messageComposerView.dismissSuggestionsListener.invoke();
    }

    /* JADX INFO: renamed from: r */
    public static void m55234r(MessageComposerView messageComposerView) {
        messageComposerView.attachmentsButtonClickListener.invoke();
    }

    private final void renderCommandsSuggestions(MessageComposerState state) {
        if (AbstractC22676k.m65745e(this.commandSuggestions, state.getCommandSuggestions())) {
            return;
        }
        MessageComposerContext messageComposerContext = this.messageComposerContext;
        if (messageComposerContext == null) {
            AbstractC22676k.m65757q("messageComposerContext");
            throw null;
        }
        if (messageComposerContext.getStyle().getMessageInputCommandsHandlingEnabled()) {
            KeyEvent.Callback commandSuggestionsContent = getCommandSuggestionsContent();
            MessageComposerContent messageComposerContent = commandSuggestionsContent instanceof MessageComposerContent ? (MessageComposerContent) commandSuggestionsContent : null;
            if (messageComposerContent != null) {
                messageComposerContent.renderState(state);
            }
            MessageComposerSuggestionsPopup messageComposerSuggestionsPopup = this.suggestionsPopup;
            if (messageComposerSuggestionsPopup == null) {
                messageComposerSuggestionsPopup = new MessageComposerSuggestionsPopup(getCommandSuggestionsContent(), this, new C19720d(this, 0));
                messageComposerSuggestionsPopup.setTouchInterceptor(new SuggestionPopupTouchListener());
                this.suggestionsPopup = messageComposerSuggestionsPopup;
            }
            messageComposerSuggestionsPopup.showOrUpdate();
        }
    }

    private static final void renderCommandsSuggestions$lambda$82(MessageComposerView messageComposerView) {
        messageComposerView.suggestionsPopup = null;
        messageComposerView.dismissSuggestionsListener.invoke();
    }

    private final void renderMentionSuggestions(MessageComposerState state) {
        if (AbstractC22676k.m65745e(this.mentionSuggestions, state.getMentionSuggestions())) {
            return;
        }
        MessageComposerContext messageComposerContext = this.messageComposerContext;
        if (messageComposerContext == null) {
            AbstractC22676k.m65757q("messageComposerContext");
            throw null;
        }
        if (messageComposerContext.getStyle().getMessageInputMentionsHandlingEnabled()) {
            KeyEvent.Callback mentionSuggestionsContent = getMentionSuggestionsContent();
            MessageComposerContent messageComposerContent = mentionSuggestionsContent instanceof MessageComposerContent ? (MessageComposerContent) mentionSuggestionsContent : null;
            if (messageComposerContent != null) {
                messageComposerContent.renderState(state);
            }
            MessageComposerSuggestionsPopup messageComposerSuggestionsPopup = this.suggestionsPopup;
            if (messageComposerSuggestionsPopup == null) {
                messageComposerSuggestionsPopup = new MessageComposerSuggestionsPopup(getMentionSuggestionsContent(), this, new C19720d(this, 1));
                this.suggestionsPopup = messageComposerSuggestionsPopup;
            }
            messageComposerSuggestionsPopup.showOrUpdate();
        }
    }

    private static final void renderMentionSuggestions$lambda$84(MessageComposerView messageComposerView) {
        messageComposerView.suggestionsPopup = null;
        messageComposerView.dismissSuggestionsListener.invoke();
    }

    private final void renderSuggestion(MessageComposerState state) {
        if (!state.getMentionSuggestions().isEmpty()) {
            renderMentionSuggestions(state);
        } else if (state.getCommandSuggestions().isEmpty()) {
            MessageComposerSuggestionsPopup messageComposerSuggestionsPopup = this.suggestionsPopup;
            if (messageComposerSuggestionsPopup != null) {
                messageComposerSuggestionsPopup.dismiss();
            }
        } else {
            renderCommandsSuggestions(state);
        }
        this.commandSuggestions = state.getCommandSuggestions();
        this.mentionSuggestions = state.getMentionSuggestions();
    }

    public static /* synthetic */ void setCenterContent$default(MessageComposerView messageComposerView, View view, FrameLayout.LayoutParams layoutParams, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        messageComposerView.setCenterContent(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setCenterContent$lambda$64(MessageComposerView messageComposerView, String it) {
        AbstractC22676k.m65750j(it, "it");
        messageComposerView.textInputChangeListener.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setCenterContent$lambda$65(MessageComposerView messageComposerView, Attachment it) {
        AbstractC22676k.m65750j(it, "it");
        messageComposerView.attachmentRemovalListener.invoke(it);
        return C23454a0.f92919a;
    }

    public static /* synthetic */ void setCenterOverlapContent$default(MessageComposerView messageComposerView, View view, FrameLayout.LayoutParams layoutParams, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        messageComposerView.setCenterOverlapContent(view, layoutParams);
    }

    private static final C23454a0 setCenterOverlapContent$lambda$70(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonHoldListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 setCenterOverlapContent$lambda$71(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonLockListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 setCenterOverlapContent$lambda$72(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonCancelListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 setCenterOverlapContent$lambda$73(MessageComposerView messageComposerView) {
        messageComposerView.audioRecordButtonReleaseListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 setCenterOverlapContent$lambda$74(MessageComposerView messageComposerView) {
        messageComposerView.audioDeleteButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 setCenterOverlapContent$lambda$75(MessageComposerView messageComposerView) {
        messageComposerView.audioStopButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 setCenterOverlapContent$lambda$76(MessageComposerView messageComposerView) {
        messageComposerView.audioPlaybackButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 setCenterOverlapContent$lambda$77(MessageComposerView messageComposerView) {
        messageComposerView.audioCompleteButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setCenterOverlapContent$lambda$78(MessageComposerView messageComposerView, float f13) {
        messageComposerView.audioSliderDragStartListener.invoke(Float.valueOf(f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setCenterOverlapContent$lambda$79(MessageComposerView messageComposerView, float f13) {
        messageComposerView.audioSliderDragStopListener.invoke(Float.valueOf(f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setCommandSuggestionsContent$lambda$81(MessageComposerView messageComposerView, Command it) {
        AbstractC22676k.m65750j(it, "it");
        messageComposerView.commandSelectionListener.invoke(it);
        return C23454a0.f92919a;
    }

    public static /* synthetic */ void setFooterContent$default(MessageComposerView messageComposerView, View view, FrameLayout.LayoutParams layoutParams, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        messageComposerView.setFooterContent(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setFooterContent$lambda$68(MessageComposerView messageComposerView, boolean z4) {
        messageComposerView.alsoSendToChannelSelectionListener.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    public static /* synthetic */ void setHeaderContent$default(MessageComposerView messageComposerView, View view, FrameLayout.LayoutParams layoutParams, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        }
        messageComposerView.setHeaderContent(view, layoutParams);
    }

    private static final C23454a0 setHeaderContent$lambda$69(MessageComposerView messageComposerView) {
        messageComposerView.dismissActionClickListener.invoke();
        return C23454a0.f92919a;
    }

    public static /* synthetic */ void setLeadingContent$default(MessageComposerView messageComposerView, View view, FrameLayout.LayoutParams layoutParams, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 80);
        }
        messageComposerView.setLeadingContent(view, layoutParams);
    }

    private static final C23454a0 setLeadingContent$lambda$62(MessageComposerView messageComposerView) {
        messageComposerView.attachmentsButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    private static final C23454a0 setLeadingContent$lambda$63(MessageComposerView messageComposerView) {
        messageComposerView.commandsButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setMentionSuggestionsContent$lambda$80(MessageComposerView messageComposerView, User it) {
        AbstractC22676k.m65750j(it, "it");
        messageComposerView.mentionSelectionListener.invoke(it);
        return C23454a0.f92919a;
    }

    public static /* synthetic */ void setTrailingContent$default(MessageComposerView messageComposerView, View view, FrameLayout.LayoutParams layoutParams, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 80);
        }
        messageComposerView.setTrailingContent(view, layoutParams);
    }

    private static final C23454a0 setTrailingContent$lambda$66(MessageComposerView messageComposerView) {
        messageComposerView.sendMessageButtonClickListener.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTrailingContent$lambda$67(MessageComposerView messageComposerView, MotionEvent it) {
        AbstractC22676k.m65750j(it, "it");
        return ((Boolean) messageComposerView.audioRecordButtonTouchListener.invoke(it)).booleanValue();
    }

    /* JADX INFO: renamed from: t */
    public static void m55236t(MessageComposerView messageComposerView) {
        messageComposerView.attachmentsButtonClickListener.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 textInputChangeListener$lambda$1(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static void m55237u(MessageComposerView messageComposerView) {
        messageComposerView.audioDeleteButtonClickListener.invoke();
    }

    /* JADX INFO: renamed from: v */
    public static void m55238v(MessageComposerView messageComposerView) {
        messageComposerView.sendMessageButtonClickListener.invoke();
    }

    /* JADX INFO: renamed from: w */
    public static void m55239w(MessageComposerView messageComposerView) {
        messageComposerView.dismissActionClickListener.invoke();
    }

    /* JADX INFO: renamed from: x */
    public static void m55240x(MessageComposerView messageComposerView) {
        messageComposerView.suggestionsPopup = null;
        messageComposerView.dismissSuggestionsListener.invoke();
    }

    public final Function1 getAlsoSendToChannelSelectionListener() {
        return this.alsoSendToChannelSelectionListener;
    }

    public final Function1 getAttachmentRemovalListener() {
        return this.attachmentRemovalListener;
    }

    public final Function1 getAttachmentSelectionListener() {
        return this.attachmentSelectionListener;
    }

    public final InterfaceC4339a getAttachmentsButtonClickListener() {
        return this.attachmentsButtonClickListener;
    }

    public final Function1 getAttachmentsPickerDialogBuilder() {
        return this.attachmentsPickerDialogBuilder;
    }

    public final InterfaceC4339a getAudioCompleteButtonClickListener() {
        return this.audioCompleteButtonClickListener;
    }

    public final InterfaceC4339a getAudioDeleteButtonClickListener() {
        return this.audioDeleteButtonClickListener;
    }

    public final InterfaceC4339a getAudioPlaybackButtonClickListener() {
        return this.audioPlaybackButtonClickListener;
    }

    public final InterfaceC4339a getAudioRecordButtonCancelListener() {
        return this.audioRecordButtonCancelListener;
    }

    public final InterfaceC4339a getAudioRecordButtonHoldListener() {
        return this.audioRecordButtonHoldListener;
    }

    public final InterfaceC4339a getAudioRecordButtonLockListener() {
        return this.audioRecordButtonLockListener;
    }

    public final InterfaceC4339a getAudioRecordButtonReleaseListener() {
        return this.audioRecordButtonReleaseListener;
    }

    public final Function1 getAudioRecordButtonTouchListener() {
        return this.audioRecordButtonTouchListener;
    }

    public final Function1 getAudioSliderDragStartListener() {
        return this.audioSliderDragStartListener;
    }

    public final Function1 getAudioSliderDragStopListener() {
        return this.audioSliderDragStopListener;
    }

    public final InterfaceC4339a getAudioStopButtonClickListener() {
        return this.audioStopButtonClickListener;
    }

    public final Function1 getCommandSelectionListener() {
        return this.commandSelectionListener;
    }

    public final InterfaceC4339a getCommandsButtonClickListener() {
        return this.commandsButtonClickListener;
    }

    public final MessageComposerViewStyle getComposerStyle$stream_chat_android_ui_components_release() {
        MessageComposerContext messageComposerContext = this.messageComposerContext;
        if (messageComposerContext != null) {
            return messageComposerContext.getStyle();
        }
        AbstractC22676k.m65757q("messageComposerContext");
        throw null;
    }

    public final InterfaceC4339a getDismissActionClickListener() {
        return this.dismissActionClickListener;
    }

    public final InterfaceC4339a getDismissSuggestionsListener() {
        return this.dismissSuggestionsListener;
    }

    public final Function1 getMentionSelectionListener() {
        return this.mentionSelectionListener;
    }

    public final Function1 getPollSubmissionListener() {
        return this.pollSubmissionListener;
    }

    public final InterfaceC4339a getSendMessageButtonClickListener() {
        return this.sendMessageButtonClickListener;
    }

    public final Function1 getTextInputChangeListener() {
        return this.textInputChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        MessageComposerSuggestionsPopup messageComposerSuggestionsPopup = this.suggestionsPopup;
        if (messageComposerSuggestionsPopup != null) {
            messageComposerSuggestionsPopup.dismiss();
        }
        ValidationErrorRenderer validationErrorRenderer = this.validationErrorRenderer;
        if (validationErrorRenderer == null) {
            AbstractC22676k.m65757q("validationErrorRenderer");
            throw null;
        }
        validationErrorRenderer.dismissValidationErrors();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onRestoreInstanceState] state: " + state, null);
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.WARN;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onSaveInstanceState] no args", null);
        }
        return super.onSaveInstanceState();
    }

    public final void renderState(MessageComposerState state) {
        AbstractC22676k.m65750j(state, "state");
        StreamUiMessageComposerBinding streamUiMessageComposerBinding = this.binding;
        if (streamUiMessageComposerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout trailingContent = streamUiMessageComposerBinding.trailingContent;
        AbstractC22676k.m65749i(trailingContent, "trailingContent");
        C16907r0 c16907r0 = new C16907r0(trailingContent);
        if (!c16907r0.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = c16907r0.next();
        MessageComposerContent messageComposerContent = next instanceof MessageComposerContent ? (MessageComposerContent) next : null;
        if (messageComposerContent != null) {
            messageComposerContent.renderState(state);
        }
        StreamUiMessageComposerBinding streamUiMessageComposerBinding2 = this.binding;
        if (streamUiMessageComposerBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout centerContent = streamUiMessageComposerBinding2.centerContent;
        AbstractC22676k.m65749i(centerContent, "centerContent");
        C16907r0 c16907r1 = new C16907r0(centerContent);
        if (!c16907r1.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next2 = c16907r1.next();
        MessageComposerContent messageComposerContent2 = next2 instanceof MessageComposerContent ? (MessageComposerContent) next2 : null;
        if (messageComposerContent2 != null) {
            messageComposerContent2.renderState(state);
        }
        StreamUiMessageComposerBinding streamUiMessageComposerBinding3 = this.binding;
        if (streamUiMessageComposerBinding3 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout centerOverlapContent = streamUiMessageComposerBinding3.centerOverlapContent;
        AbstractC22676k.m65749i(centerOverlapContent, "centerOverlapContent");
        C16907r0 c16907r2 = new C16907r0(centerOverlapContent);
        if (!c16907r2.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next3 = c16907r2.next();
        MessageComposerContent messageComposerContent3 = next3 instanceof MessageComposerContent ? (MessageComposerContent) next3 : null;
        if (messageComposerContent3 != null) {
            messageComposerContent3.renderState(state);
        }
        StreamUiMessageComposerBinding streamUiMessageComposerBinding4 = this.binding;
        if (streamUiMessageComposerBinding4 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout leadingContent = streamUiMessageComposerBinding4.leadingContent;
        AbstractC22676k.m65749i(leadingContent, "leadingContent");
        C16907r0 c16907r3 = new C16907r0(leadingContent);
        if (!c16907r3.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next4 = c16907r3.next();
        MessageComposerContent messageComposerContent4 = next4 instanceof MessageComposerContent ? (MessageComposerContent) next4 : null;
        if (messageComposerContent4 != null) {
            messageComposerContent4.renderState(state);
        }
        StreamUiMessageComposerBinding streamUiMessageComposerBinding5 = this.binding;
        if (streamUiMessageComposerBinding5 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout footerContent = streamUiMessageComposerBinding5.footerContent;
        AbstractC22676k.m65749i(footerContent, "footerContent");
        C16907r0 c16907r4 = new C16907r0(footerContent);
        if (!c16907r4.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next5 = c16907r4.next();
        MessageComposerContent messageComposerContent5 = next5 instanceof MessageComposerContent ? (MessageComposerContent) next5 : null;
        if (messageComposerContent5 != null) {
            messageComposerContent5.renderState(state);
        }
        StreamUiMessageComposerBinding streamUiMessageComposerBinding6 = this.binding;
        if (streamUiMessageComposerBinding6 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout headerContent = streamUiMessageComposerBinding6.headerContent;
        AbstractC22676k.m65749i(headerContent, "headerContent");
        C16907r0 c16907r5 = new C16907r0(headerContent);
        if (!c16907r5.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next6 = c16907r5.next();
        MessageComposerContent messageComposerContent6 = next6 instanceof MessageComposerContent ? (MessageComposerContent) next6 : null;
        if (messageComposerContent6 != null) {
            messageComposerContent6.renderState(state);
        }
        renderSuggestion(state);
        this.arePollEnabled = arePollsEnabled(state);
        ValidationErrorRenderer validationErrorRenderer = this.validationErrorRenderer;
        if (validationErrorRenderer != null) {
            validationErrorRenderer.renderValidationErrors(state.getValidationErrors());
        } else {
            AbstractC22676k.m65757q("validationErrorRenderer");
            throw null;
        }
    }

    public final void setAlsoSendToChannelSelectionListener(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.alsoSendToChannelSelectionListener = function1;
    }

    public final void setAttachmentRemovalListener(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.attachmentRemovalListener = function1;
    }

    public final void setAttachmentSelectionListener(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.attachmentSelectionListener = function1;
    }

    public final void setAttachmentsButtonClickListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.attachmentsButtonClickListener = interfaceC4339a;
    }

    public final void setAttachmentsPickerDialogBuilder(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.attachmentsPickerDialogBuilder = function1;
    }

    public final void setAudioCompleteButtonClickListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.audioCompleteButtonClickListener = interfaceC4339a;
    }

    public final void setAudioDeleteButtonClickListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.audioDeleteButtonClickListener = interfaceC4339a;
    }

    public final void setAudioPlaybackButtonClickListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.audioPlaybackButtonClickListener = interfaceC4339a;
    }

    public final void setAudioRecordButtonCancelListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.audioRecordButtonCancelListener = interfaceC4339a;
    }

    public final void setAudioRecordButtonHoldListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.audioRecordButtonHoldListener = interfaceC4339a;
    }

    public final void setAudioRecordButtonLockListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.audioRecordButtonLockListener = interfaceC4339a;
    }

    public final void setAudioRecordButtonReleaseListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.audioRecordButtonReleaseListener = interfaceC4339a;
    }

    public final void setAudioRecordButtonTouchListener(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.audioRecordButtonTouchListener = function1;
    }

    public final void setAudioSliderDragStartListener(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.audioSliderDragStartListener = function1;
    }

    public final void setAudioSliderDragStopListener(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.audioSliderDragStopListener = function1;
    }

    public final void setAudioStopButtonClickListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.audioStopButtonClickListener = interfaceC4339a;
    }

    public final <V extends View & MessageComposerContent> void setCenterContent(V contentView) {
        AbstractC22676k.m65750j(contentView, "contentView");
        setCenterContent$default(this, contentView, null, 2, null);
    }

    public final <V extends View & MessageComposerContent> void setCenterOverlapContent(V contentView) {
        AbstractC22676k.m65750j(contentView, "contentView");
        setCenterOverlapContent$default(this, contentView, null, 2, null);
    }

    public final void setCommandSelectionListener(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.commandSelectionListener = function1;
    }

    public final <V extends View & MessageComposerContent> void setCommandSuggestionsContent(V contentView) {
        AbstractC22676k.m65750j(contentView, "contentView");
        attachContext(contentView);
        this.commandSuggestionsContentOverride = contentView;
        if (contentView instanceof MessageComposerCommandSuggestionsContent) {
            MessageComposerCommandSuggestionsContent messageComposerCommandSuggestionsContent = (MessageComposerCommandSuggestionsContent) contentView;
            if (messageComposerCommandSuggestionsContent.getCommandSelectionListener() == null) {
                messageComposerCommandSuggestionsContent.setCommandSelectionListener(new C19709b(this, 15));
            }
        }
    }

    public final void setCommandsButtonClickListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.commandsButtonClickListener = interfaceC4339a;
    }

    public final void setDismissActionClickListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.dismissActionClickListener = interfaceC4339a;
    }

    public final void setDismissSuggestionsListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.dismissSuggestionsListener = interfaceC4339a;
    }

    public final <V extends View & MessageComposerContent> void setFooterContent(V contentView) {
        AbstractC22676k.m65750j(contentView, "contentView");
        setFooterContent$default(this, contentView, null, 2, null);
    }

    public final <V extends View & MessageComposerContent> void setHeaderContent(V contentView) {
        AbstractC22676k.m65750j(contentView, "contentView");
        setHeaderContent$default(this, contentView, null, 2, null);
    }

    public final <V extends View & MessageComposerContent> void setLeadingContent(V contentView) {
        AbstractC22676k.m65750j(contentView, "contentView");
        setLeadingContent$default(this, contentView, null, 2, null);
    }

    public final void setMentionSelectionListener(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.mentionSelectionListener = function1;
    }

    public final <V extends View & MessageComposerContent> void setMentionSuggestionsContent(V contentView) {
        AbstractC22676k.m65750j(contentView, "contentView");
        attachContext(contentView);
        this.mentionSuggestionsContentOverride = contentView;
        if (contentView instanceof MessageComposerMentionSuggestionsContent) {
            MessageComposerMentionSuggestionsContent messageComposerMentionSuggestionsContent = (MessageComposerMentionSuggestionsContent) contentView;
            if (messageComposerMentionSuggestionsContent.getMentionSelectionListener() == null) {
                messageComposerMentionSuggestionsContent.setMentionSelectionListener(new C19709b(this, 8));
            }
        }
    }

    public final void setPollSubmissionListener(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.pollSubmissionListener = function1;
    }

    public final void setSendMessageButtonClickListener(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.sendMessageButtonClickListener = interfaceC4339a;
    }

    public final void setTextInputChangeListener(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.textInputChangeListener = function1;
    }

    public final <V extends View & MessageComposerContent> void setTrailingContent(V contentView) {
        AbstractC22676k.m65750j(contentView, "contentView");
        setTrailingContent$default(this, contentView, null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageComposerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    public final <V extends View & MessageComposerContent> void setCenterContent(V contentView, FrameLayout.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(contentView, "contentView");
        AbstractC22676k.m65750j(layoutParams, "layoutParams");
        StreamUiMessageComposerBinding streamUiMessageComposerBinding = this.binding;
        if (streamUiMessageComposerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiMessageComposerBinding.centerContent.removeAllViews();
        StreamUiMessageComposerBinding streamUiMessageComposerBinding2 = this.binding;
        if (streamUiMessageComposerBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout frameLayout = streamUiMessageComposerBinding2.centerContent;
        attachContext(contentView);
        frameLayout.addView(contentView, layoutParams);
        if (contentView instanceof MessageComposerCenterContent) {
            MessageComposerCenterContent messageComposerCenterContent = (MessageComposerCenterContent) contentView;
            if (messageComposerCenterContent.getTextInputChangeListener() == null) {
                messageComposerCenterContent.setTextInputChangeListener(new C19709b(this, 0));
            }
            if (messageComposerCenterContent.getAttachmentRemovalListener() == null) {
                messageComposerCenterContent.setAttachmentRemovalListener(new C19709b(this, 1));
            }
        }
    }

    public final <V extends View & MessageComposerContent> void setCenterOverlapContent(V contentView, FrameLayout.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(contentView, "contentView");
        AbstractC22676k.m65750j(layoutParams, "layoutParams");
        StreamUiMessageComposerBinding streamUiMessageComposerBinding = this.binding;
        if (streamUiMessageComposerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiMessageComposerBinding.centerOverlapContent.removeAllViews();
        StreamUiMessageComposerBinding streamUiMessageComposerBinding2 = this.binding;
        if (streamUiMessageComposerBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout frameLayout = streamUiMessageComposerBinding2.centerOverlapContent;
        attachContext(contentView);
        frameLayout.addView(contentView, layoutParams);
        if (contentView instanceof MessageComposerOverlappingContent) {
            MessageComposerOverlappingContent messageComposerOverlappingContent = (MessageComposerOverlappingContent) contentView;
            if (messageComposerOverlappingContent.getRecordButtonHoldListener() == null) {
                messageComposerOverlappingContent.setRecordButtonHoldListener(new C19674a(this, 0));
            }
            if (messageComposerOverlappingContent.getRecordButtonLockListener() == null) {
                messageComposerOverlappingContent.setRecordButtonLockListener(new C19674a(this, 4));
            }
            if (messageComposerOverlappingContent.getRecordButtonCancelListener() == null) {
                messageComposerOverlappingContent.setRecordButtonCancelListener(new C19674a(this, 8));
            }
            if (messageComposerOverlappingContent.getRecordButtonReleaseListener() == null) {
                messageComposerOverlappingContent.setRecordButtonReleaseListener(new C19674a(this, 12));
            }
            if (messageComposerOverlappingContent.getDeleteButtonClickListener() == null) {
                messageComposerOverlappingContent.setDeleteButtonClickListener(new C19674a(this, 20));
            }
            if (messageComposerOverlappingContent.getStopButtonClickListener() == null) {
                messageComposerOverlappingContent.setStopButtonClickListener(new C19674a(this, 25));
            }
            if (messageComposerOverlappingContent.getPlaybackButtonClickListener() == null) {
                messageComposerOverlappingContent.setPlaybackButtonClickListener(new C19674a(this, 26));
            }
            if (messageComposerOverlappingContent.getCompleteButtonClickListener() == null) {
                messageComposerOverlappingContent.setCompleteButtonClickListener(new C19674a(this, 27));
            }
            if (messageComposerOverlappingContent.getSliderDragStartListener() == null) {
                messageComposerOverlappingContent.setSliderDragStartListener(new C19709b(this, 16));
            }
            if (messageComposerOverlappingContent.getSliderDragStopListener() == null) {
                messageComposerOverlappingContent.setSliderDragStopListener(new C19709b(this, 17));
            }
        }
    }

    public final <V extends View & MessageComposerContent> void setFooterContent(V contentView, FrameLayout.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(contentView, "contentView");
        AbstractC22676k.m65750j(layoutParams, "layoutParams");
        StreamUiMessageComposerBinding streamUiMessageComposerBinding = this.binding;
        if (streamUiMessageComposerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiMessageComposerBinding.footerContent.removeAllViews();
        StreamUiMessageComposerBinding streamUiMessageComposerBinding2 = this.binding;
        if (streamUiMessageComposerBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout frameLayout = streamUiMessageComposerBinding2.footerContent;
        attachContext(contentView);
        frameLayout.addView(contentView, layoutParams);
        if (contentView instanceof MessageComposerFooterContent) {
            MessageComposerFooterContent messageComposerFooterContent = (MessageComposerFooterContent) contentView;
            if (messageComposerFooterContent.getAlsoSendToChannelSelectionListener() == null) {
                messageComposerFooterContent.setAlsoSendToChannelSelectionListener(new C19709b(this, 2));
            }
        }
    }

    public final <V extends View & MessageComposerContent> void setHeaderContent(V contentView, FrameLayout.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(contentView, "contentView");
        AbstractC22676k.m65750j(layoutParams, "layoutParams");
        StreamUiMessageComposerBinding streamUiMessageComposerBinding = this.binding;
        if (streamUiMessageComposerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiMessageComposerBinding.headerContent.removeAllViews();
        StreamUiMessageComposerBinding streamUiMessageComposerBinding2 = this.binding;
        if (streamUiMessageComposerBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout frameLayout = streamUiMessageComposerBinding2.headerContent;
        attachContext(contentView);
        frameLayout.addView(contentView, layoutParams);
        if (contentView instanceof MessageComposerHeaderContent) {
            MessageComposerHeaderContent messageComposerHeaderContent = (MessageComposerHeaderContent) contentView;
            if (messageComposerHeaderContent.getDismissActionClickListener() == null) {
                messageComposerHeaderContent.setDismissActionClickListener(new C19674a(this, 10));
            }
        }
    }

    public final <V extends View & MessageComposerContent> void setLeadingContent(V contentView, FrameLayout.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(contentView, "contentView");
        AbstractC22676k.m65750j(layoutParams, "layoutParams");
        StreamUiMessageComposerBinding streamUiMessageComposerBinding = this.binding;
        if (streamUiMessageComposerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiMessageComposerBinding.leadingContent.removeAllViews();
        StreamUiMessageComposerBinding streamUiMessageComposerBinding2 = this.binding;
        if (streamUiMessageComposerBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout frameLayout = streamUiMessageComposerBinding2.leadingContent;
        attachContext(contentView);
        frameLayout.addView(contentView, layoutParams);
        if (contentView instanceof MessageComposerLeadingContent) {
            MessageComposerLeadingContent messageComposerLeadingContent = (MessageComposerLeadingContent) contentView;
            if (messageComposerLeadingContent.getAttachmentsButtonClickListener() == null) {
                messageComposerLeadingContent.setAttachmentsButtonClickListener(new C19674a(this, 1));
            }
            if (messageComposerLeadingContent.getCommandsButtonClickListener() == null) {
                messageComposerLeadingContent.setCommandsButtonClickListener(new C19674a(this, 2));
            }
        }
    }

    public final <V extends View & MessageComposerContent> void setTrailingContent(V contentView, FrameLayout.LayoutParams layoutParams) {
        AbstractC22676k.m65750j(contentView, "contentView");
        AbstractC22676k.m65750j(layoutParams, "layoutParams");
        StreamUiMessageComposerBinding streamUiMessageComposerBinding = this.binding;
        if (streamUiMessageComposerBinding == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        streamUiMessageComposerBinding.trailingContent.removeAllViews();
        StreamUiMessageComposerBinding streamUiMessageComposerBinding2 = this.binding;
        if (streamUiMessageComposerBinding2 == null) {
            AbstractC22676k.m65757q("binding");
            throw null;
        }
        FrameLayout frameLayout = streamUiMessageComposerBinding2.trailingContent;
        attachContext(contentView);
        frameLayout.addView(contentView, layoutParams);
        if (contentView instanceof MessageComposerTrailingContent) {
            MessageComposerTrailingContent messageComposerTrailingContent = (MessageComposerTrailingContent) contentView;
            if (messageComposerTrailingContent.getSendMessageButtonClickListener() == null) {
                messageComposerTrailingContent.setSendMessageButtonClickListener(new C19674a(this, 3));
            }
            if (messageComposerTrailingContent.getRecordAudioButtonTouchListener() == null) {
                messageComposerTrailingContent.setRecordAudioButtonTouchListener(new C19709b(this, 3));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageComposerView(Context context, AttributeSet attributeSet, int i13) {
        super(ContextKt.createStreamThemeWrapper(context), attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MsgComposerView");
        this.sendMessageButtonClickListener = new C19383k(22);
        this.textInputChangeListener = new C19616a(13);
        this.attachmentSelectionListener = new C19616a(15);
        this.pollSubmissionListener = new C19616a(16);
        this.attachmentRemovalListener = new C19616a(17);
        this.mentionSelectionListener = new C19616a(18);
        this.commandSelectionListener = new C19616a(19);
        this.alsoSendToChannelSelectionListener = new C19616a(20);
        this.dismissActionClickListener = new C19383k(22);
        this.commandsButtonClickListener = new C19674a(this, 9);
        this.dismissSuggestionsListener = new C19383k(22);
        this.attachmentsPickerDialogBuilder = new C19709b(this, 4);
        int i14 = 5;
        this.attachmentsButtonClickListener = new C19674a(this, i14);
        this.audioRecordButtonTouchListener = new C19709b(this, i14);
        int i15 = 22;
        this.audioRecordButtonHoldListener = new C19383k(i15);
        this.audioRecordButtonLockListener = new C19383k(i15);
        this.audioRecordButtonCancelListener = new C19383k(i15);
        this.audioRecordButtonReleaseListener = new C19383k(i15);
        this.audioDeleteButtonClickListener = new C19383k(i15);
        this.audioStopButtonClickListener = new C19383k(i15);
        this.audioPlaybackButtonClickListener = new C19383k(i15);
        this.audioCompleteButtonClickListener = new C19383k(i15);
        int i16 = 14;
        this.audioSliderDragStartListener = new C19616a(i16);
        this.audioSliderDragStopListener = new C19616a(i16);
        this.defaultMentionSuggestionsView = AbstractC30060g.m92088H(new C19674a(this, 6));
        this.defaultCommandSuggestionsView = AbstractC30060g.m92088H(new C19674a(this, 7));
        init(attributeSet);
    }
}
