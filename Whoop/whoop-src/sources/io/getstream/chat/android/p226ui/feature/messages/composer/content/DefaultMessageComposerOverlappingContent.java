package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.transition.Fade;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import hc3.AbstractC17176i;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.common.state.messages.composer.MessageComposerState;
import io.getstream.chat.android.p226ui.common.state.messages.composer.RecordingState;
import io.getstream.chat.android.p226ui.databinding.StreamUiMessageComposerDefaultCenterOverlapContentBinding;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerContext;
import io.getstream.chat.android.p226ui.feature.messages.composer.MessageComposerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.WaveformView;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.PermissionChecker;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.DrawableKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.TextViewKt;
import l83.C23454a0;
import l83.InterfaceC23462h;
import live.hms.video.factories.C24148c;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 ©\u00012\u00020\u00012\u00020\u0002:\u0002©\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\nH\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J7\u00103\u001a\u00020\u00112\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0014¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020+2\u0006\u00105\u001a\u00020)H\u0017¢\u0006\u0004\b6\u0010-J\u0017\u00109\u001a\u00020\u00112\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010\u001dJ\u000f\u0010<\u001a\u00020\u0011H\u0002¢\u0006\u0004\b<\u0010\u001dJ\u000f\u0010=\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010\u001dJ\u0017\u0010?\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020AH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0011H\u0002¢\u0006\u0004\bG\u0010\u001dJ\u000f\u0010H\u001a\u00020\u0011H\u0002¢\u0006\u0004\bH\u0010\u001dJ\u000f\u0010I\u001a\u00020\u0011H\u0002¢\u0006\u0004\bI\u0010\u001dJ\u000f\u0010J\u001a\u00020\u0011H\u0002¢\u0006\u0004\bJ\u0010\u001dR*\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR*\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010M\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR*\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bU\u0010M\u001a\u0004\bV\u0010O\"\u0004\bW\u0010QR*\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010M\u001a\u0004\bY\u0010O\"\u0004\bZ\u0010QR*\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010M\u001a\u0004\b\\\u0010O\"\u0004\b]\u0010QR*\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010M\u001a\u0004\b_\u0010O\"\u0004\b`\u0010QR*\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010M\u001a\u0004\bb\u0010O\"\u0004\bc\u0010QR*\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bd\u0010M\u001a\u0004\be\u0010O\"\u0004\bf\u0010QR0\u0010i\u001a\u0010\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u0011\u0018\u00010g8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR0\u0010o\u001a\u0010\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u0011\u0018\u00010g8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010j\u001a\u0004\bp\u0010l\"\u0004\bq\u0010nR\u001b\u0010w\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010{\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010|R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0080\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0083\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0083\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0083\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0080\u0001R\u0019\u0010\u008c\u0001\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R,\u0010\u0099\u0001\u001a\u00030\u0097\u00012\b\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R(\u0010\u009d\u0001\u001a\u00020\u000f8\u0004@\u0004X\u0084.¢\u0006\u0017\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0005\b¡\u0001\u0010\u0013R*\u0010£\u0001\u001a\u00030¢\u00018\u0004@\u0004X\u0084.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001¨\u0006ª\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "messageComposerContext", "Ll83/a0;", "attachContext", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;", "state", "renderState", "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/os/Parcelable;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "onSaveInstanceState", "()Landroid/os/Parcelable;", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "(Landroid/view/View;I)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "", "milliseconds", "vibrateDevice", "(J)V", "resetUI", "renderIdle", "renderComplete", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;", "renderHold", "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;", "renderLocked", "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;)V", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;", "renderOverview", "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;)V", "showMicPopup", "showLockPopup", "showLockedPopup", "showHoldPopup", "Lkotlin/Function0;", "recordButtonHoldListener", "Lc93/a;", "getRecordButtonHoldListener", "()Lc93/a;", "setRecordButtonHoldListener", "(Lc93/a;)V", "recordButtonLockListener", "getRecordButtonLockListener", "setRecordButtonLockListener", "recordButtonCancelListener", "getRecordButtonCancelListener", "setRecordButtonCancelListener", "recordButtonReleaseListener", "getRecordButtonReleaseListener", "setRecordButtonReleaseListener", "playbackButtonClickListener", "getPlaybackButtonClickListener", "setPlaybackButtonClickListener", "stopButtonClickListener", "getStopButtonClickListener", "setStopButtonClickListener", "deleteButtonClickListener", "getDeleteButtonClickListener", "setDeleteButtonClickListener", "completeButtonClickListener", "getCompleteButtonClickListener", "setCompleteButtonClickListener", "Lkotlin/Function1;", "", "sliderDragStartListener", "Lkotlin/jvm/functions/Function1;", "getSliderDragStartListener", "()Lkotlin/jvm/functions/Function1;", "setSliderDragStartListener", "(Lkotlin/jvm/functions/Function1;)V", "sliderDragStopListener", "getSliderDragStopListener", "setSliderDragStopListener", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;", "binding", "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;", "parentWidth", "I", "centerContentHeight", "Landroid/widget/PopupWindow;", "lockPopup", "Landroid/widget/PopupWindow;", "Landroid/graphics/Rect;", "lockBaseRect", "Landroid/graphics/Rect;", "lockLastRect", "lockMoveRect", "micPopup", "micOrigRect", "micBaseRect", "micLastRect", "micMoveRect", "holdPopup", "holdStartTime", "J", "Landroid/os/Handler;", "holdHandler", "Landroid/os/Handler;", "", "baseTouch", "[F", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "permissionChecker", "Lio/getstream/chat/android/ui/utils/PermissionChecker;", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;", "value", "_state", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;", "set_state", "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V", "composerContext", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "getComposerContext", "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;", "setComposerContext", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "style", "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;", "setStyle", "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class DefaultMessageComposerOverlappingContent extends ConstraintLayout implements MessageComposerOverlappingContent {
    private static final long ANIM_DURATION_MS = 100;
    private static final long HOLD_TIMEOUT_MS = 1000;
    private static final long VIBRATE_MS = 100;
    private RecordingState _state;
    private final float[] baseTouch;
    private final StreamUiMessageComposerDefaultCenterOverlapContentBinding binding;
    private int centerContentHeight;
    private InterfaceC4339a completeButtonClickListener;
    protected MessageComposerContext composerContext;
    private InterfaceC4339a deleteButtonClickListener;
    private final Handler holdHandler;
    private PopupWindow holdPopup;
    private long holdStartTime;
    private final Rect lockBaseRect;
    private final Rect lockLastRect;
    private final Rect lockMoveRect;
    private PopupWindow lockPopup;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final Rect micBaseRect;
    private final Rect micLastRect;
    private final Rect micMoveRect;
    private final Rect micOrigRect;
    private PopupWindow micPopup;
    private int parentWidth;
    private final PermissionChecker permissionChecker;
    private InterfaceC4339a playbackButtonClickListener;
    private InterfaceC4339a recordButtonCancelListener;
    private InterfaceC4339a recordButtonHoldListener;
    private InterfaceC4339a recordButtonLockListener;
    private InterfaceC4339a recordButtonReleaseListener;
    private Function1 sliderDragStartListener;
    private Function1 sliderDragStopListener;
    private InterfaceC4339a stopButtonClickListener;
    protected MessageComposerViewStyle style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerOverlappingContent(Context context) {
        super(context);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "OverlappingContent");
        this.parentWidth = Integer.MAX_VALUE;
        this.centerContentHeight = Integer.MAX_VALUE;
        this.lockBaseRect = new Rect();
        this.lockLastRect = new Rect();
        this.lockMoveRect = new Rect();
        this.micOrigRect = new Rect();
        this.micBaseRect = new Rect();
        this.micLastRect = new Rect();
        this.micMoveRect = new Rect();
        this.holdHandler = new Handler(Looper.getMainLooper());
        this.baseTouch = new float[2];
        this.permissionChecker = new PermissionChecker();
        this._state = RecordingState.Idle.INSTANCE;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("<init> state: ", this._state), null);
        }
        StreamUiMessageComposerDefaultCenterOverlapContentBinding streamUiMessageComposerDefaultCenterOverlapContentBindingInflate = StreamUiMessageComposerDefaultCenterOverlapContentBinding.inflate(LayoutInflater.from(getContext()), this);
        this.binding = streamUiMessageComposerDefaultCenterOverlapContentBindingInflate;
        final int i13 = 0;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingDelete.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i14 = 1;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingStop.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i15 = 2;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingComplete.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i16 = 3;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingPlayback.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i17 = 0;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingWaveform.setOnSliderDragStart(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74580x;

            {
                this.f74580x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i18 = i17;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i18) {
                    case 0:
                        DefaultMessageComposerOverlappingContent._init_$lambda$6(this.f74580x, fFloatValue);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent._init_$lambda$7(this.f74580x, fFloatValue);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
        final int i18 = 1;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingWaveform.setOnSliderDragStop(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74580x;

            {
                this.f74580x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i19 = i18;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i19) {
                    case 0:
                        DefaultMessageComposerOverlappingContent._init_$lambda$6(this.f74580x, fFloatValue);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent._init_$lambda$7(this.f74580x, fFloatValue);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.centerContentHeight = ContextKt.getDimension(context2, C19469R.dimen.stream_ui_message_composer_center_content_height);
        this.parentWidth = IntKt.displayMetrics().widthPixels;
        renderIdle();
    }

    private static final void _init_$lambda$2(DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent, View view) {
        InterfaceC4339a deleteButtonClickListener = defaultMessageComposerOverlappingContent.getDeleteButtonClickListener();
        if (deleteButtonClickListener != null) {
            deleteButtonClickListener.invoke();
        }
    }

    private static final void _init_$lambda$3(DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent, View view) {
        InterfaceC4339a stopButtonClickListener = defaultMessageComposerOverlappingContent.getStopButtonClickListener();
        if (stopButtonClickListener != null) {
            stopButtonClickListener.invoke();
        }
    }

    private static final void _init_$lambda$4(DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent, View view) {
        InterfaceC4339a completeButtonClickListener = defaultMessageComposerOverlappingContent.getCompleteButtonClickListener();
        if (completeButtonClickListener != null) {
            completeButtonClickListener.invoke();
        }
    }

    private static final void _init_$lambda$5(DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent, View view) {
        InterfaceC4339a playbackButtonClickListener = defaultMessageComposerOverlappingContent.getPlaybackButtonClickListener();
        if (playbackButtonClickListener != null) {
            playbackButtonClickListener.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 _init_$lambda$6(DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent, float f13) {
        Function1 sliderDragStartListener = defaultMessageComposerOverlappingContent.getSliderDragStartListener();
        if (sliderDragStartListener != null) {
            sliderDragStartListener.invoke(Float.valueOf(f13));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 _init_$lambda$7(DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent, float f13) {
        Function1 sliderDragStopListener = defaultMessageComposerOverlappingContent.getSliderDragStopListener();
        if (sliderDragStopListener != null) {
            sliderDragStopListener.invoke(Float.valueOf(f13));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static void m55297f(DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent, View view) {
        InterfaceC4339a playbackButtonClickListener = defaultMessageComposerOverlappingContent.getPlaybackButtonClickListener();
        if (playbackButtonClickListener != null) {
            playbackButtonClickListener.invoke();
        }
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: renamed from: k */
    public static void m55299k(DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent, View view) {
        InterfaceC4339a stopButtonClickListener = defaultMessageComposerOverlappingContent.getStopButtonClickListener();
        if (stopButtonClickListener != null) {
            stopButtonClickListener.invoke();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m55301m(DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent, View view) {
        InterfaceC4339a completeButtonClickListener = defaultMessageComposerOverlappingContent.getCompleteButtonClickListener();
        if (completeButtonClickListener != null) {
            completeButtonClickListener.invoke();
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m55302n(DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent, View view) {
        InterfaceC4339a deleteButtonClickListener = defaultMessageComposerOverlappingContent.getDeleteButtonClickListener();
        if (deleteButtonClickListener != null) {
            deleteButtonClickListener.invoke();
        }
    }

    private final void renderComplete() {
        RecordingState recordingState = this._state;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[renderComplete] state: ", recordingState), null);
        }
        resetUI();
    }

    private final void renderHold(RecordingState.Hold state) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[renderHold] no args", null);
        }
        PopupWindow popupWindow = this.holdPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.holdPopup = null;
        setVisibility(0);
        this.binding.horizontalGuideline.setGuidelinePercent(1.0f);
        getLayoutParams().height = this.centerContentHeight;
        TextView recordingSlider = this.binding.recordingSlider;
        AbstractC22676k.m65749i(recordingSlider, "recordingSlider");
        recordingSlider.setVisibility(0);
        this.binding.recordingPlayback.setImageResource(C19469R.drawable.stream_ui_ic_mic);
        ImageView recordingPlayback = this.binding.recordingPlayback;
        AbstractC22676k.m65749i(recordingPlayback, "recordingPlayback");
        DefaultMessageComposerOverlappingContentKt.setImageColorRes(recordingPlayback, C19469R.color.stream_ui_accent_red);
        ImageView recordingPlayback2 = this.binding.recordingPlayback;
        AbstractC22676k.m65749i(recordingPlayback2, "recordingPlayback");
        recordingPlayback2.setVisibility(0);
        this.binding.recordingPlayback.setClickable(false);
        this.binding.recordingPlayback.setFocusable(false);
        WaveformView recordingWaveform = this.binding.recordingWaveform;
        AbstractC22676k.m65749i(recordingWaveform, "recordingWaveform");
        recordingWaveform.setVisibility(8);
        this.binding.recordingWaveform.setSliderVisible(false);
        ImageView recordingStop = this.binding.recordingStop;
        AbstractC22676k.m65749i(recordingStop, "recordingStop");
        recordingStop.setVisibility(8);
        ImageView recordingDelete = this.binding.recordingDelete;
        AbstractC22676k.m65749i(recordingDelete, "recordingDelete");
        recordingDelete.setVisibility(8);
        ImageView recordingComplete = this.binding.recordingComplete;
        AbstractC22676k.m65749i(recordingComplete, "recordingComplete");
        recordingComplete.setVisibility(8);
        this.binding.recordingTimer.setText(DefaultMessageComposerOverlappingContentKt.formatMillis(state.getDurationInMs()));
    }

    private final void renderIdle() {
        RecordingState recordingState = this._state;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[renderIdle] state: ", recordingState), null);
        }
        setVisibility(8);
        resetUI();
    }

    private final void renderLocked(RecordingState.Locked state) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[renderLocked] waveform: " + state.getWaveform().size() + ", windowToken: " + getWindowToken(), null);
        }
        setVisibility(0);
        getLayoutParams().height = this.centerContentHeight * 2;
        this.binding.horizontalGuideline.setGuidelinePercent(0.5f);
        TextView recordingSlider = this.binding.recordingSlider;
        AbstractC22676k.m65749i(recordingSlider, "recordingSlider");
        recordingSlider.setVisibility(8);
        ImageView recordingDelete = this.binding.recordingDelete;
        AbstractC22676k.m65749i(recordingDelete, "recordingDelete");
        recordingDelete.setVisibility(0);
        ImageView recordingStop = this.binding.recordingStop;
        AbstractC22676k.m65749i(recordingStop, "recordingStop");
        recordingStop.setVisibility(0);
        ImageView recordingComplete = this.binding.recordingComplete;
        AbstractC22676k.m65749i(recordingComplete, "recordingComplete");
        recordingComplete.setVisibility(0);
        this.binding.recordingTimer.setText(DefaultMessageComposerOverlappingContentKt.formatMillis(state.getDurationInMs()));
        WaveformView recordingWaveform = this.binding.recordingWaveform;
        AbstractC22676k.m65749i(recordingWaveform, "recordingWaveform");
        recordingWaveform.setVisibility(0);
        this.binding.recordingWaveform.setWaveform(state.getWaveform());
        this.binding.recordingWaveform.setSliderVisible(false);
        PopupWindow popupWindow = this.micPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.micPopup = null;
        if (!(this._state instanceof RecordingState.Locked) || this.lockPopup == null) {
            showLockedPopup();
        }
    }

    private final void renderOverview(RecordingState.Overview state) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30462p("[renderOverview] state.isPlaying: ", state.isPlaying()), null);
        }
        setVisibility(0);
        getLayoutParams().height = this.centerContentHeight * 2;
        this.binding.horizontalGuideline.setGuidelinePercent(0.5f);
        this.binding.recordingPlayback.setImageResource(state.isPlaying() ? C19469R.drawable.stream_ui_ic_pause : C19469R.drawable.stream_ui_ic_play);
        ImageView recordingPlayback = this.binding.recordingPlayback;
        AbstractC22676k.m65749i(recordingPlayback, "recordingPlayback");
        DefaultMessageComposerOverlappingContentKt.setImageColorRes(recordingPlayback, C19469R.color.stream_ui_accent_blue);
        this.binding.recordingPlayback.setClickable(true);
        this.binding.recordingPlayback.setFocusable(true);
        ImageView recordingPlayback2 = this.binding.recordingPlayback;
        AbstractC22676k.m65749i(recordingPlayback2, "recordingPlayback");
        recordingPlayback2.setVisibility(0);
        TextView recordingSlider = this.binding.recordingSlider;
        AbstractC22676k.m65749i(recordingSlider, "recordingSlider");
        recordingSlider.setVisibility(8);
        this.binding.recordingTimer.setText(DefaultMessageComposerOverlappingContentKt.formatMillis(0));
        WaveformView recordingWaveform = this.binding.recordingWaveform;
        AbstractC22676k.m65749i(recordingWaveform, "recordingWaveform");
        recordingWaveform.setVisibility(0);
        this.binding.recordingWaveform.setWaveform(state.getWaveform());
        this.binding.recordingWaveform.setWaveform(state.getWaveform());
        this.binding.recordingWaveform.setSliderVisible(true);
        this.binding.recordingWaveform.setProgress(state.getPlayingProgress());
        ImageView recordingDelete = this.binding.recordingDelete;
        AbstractC22676k.m65749i(recordingDelete, "recordingDelete");
        recordingDelete.setVisibility(0);
        ImageView recordingStop = this.binding.recordingStop;
        AbstractC22676k.m65749i(recordingStop, "recordingStop");
        recordingStop.setVisibility(8);
        ImageView recordingComplete = this.binding.recordingComplete;
        AbstractC22676k.m65749i(recordingComplete, "recordingComplete");
        recordingComplete.setVisibility(0);
        PopupWindow popupWindow = this.micPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.micPopup = null;
        PopupWindow popupWindow2 = this.lockPopup;
        if (popupWindow2 != null) {
            popupWindow2.dismiss();
        }
        this.lockPopup = null;
    }

    private final void resetUI() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[resetUI] no args", null);
        }
        this.binding.recordingWaveform.clearData();
        this.binding.recordingSlider.setTranslationX(0.0f);
        this.binding.recordingSlider.setAlpha(1.0f);
        this.micLastRect.set(this.micBaseRect);
        this.lockLastRect.set(this.lockBaseRect);
        PopupWindow popupWindow = this.lockPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.lockPopup = null;
        PopupWindow popupWindow2 = this.micPopup;
        if (popupWindow2 != null) {
            popupWindow2.dismiss();
        }
        this.micPopup = null;
    }

    private final void set_state(RecordingState recordingState) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[setState] state: ", recordingState), null);
        }
        this._state = recordingState;
    }

    private final void showHoldPopup() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(C19469R.layout.stream_ui_message_composer_default_center_overlap_floating_hold, (ViewGroup) this, false);
        TextView textView = (TextView) viewInflate.findViewById(C19469R.id.holdToRecordText);
        String audioRecordingHoldToRecordText = getStyle().getAudioRecordingHoldToRecordText();
        if (audioRecordingHoldToRecordText == null) {
            audioRecordingHoldToRecordText = textView.getContext().getString(getStyle().getAudioRecordingSendOnComplete() ? C19469R.string.stream_ui_message_composer_hold_to_record_send : C19469R.string.stream_ui_message_composer_hold_to_record_save);
            AbstractC22676k.m65749i(audioRecordingHoldToRecordText, "getString(...)");
        }
        textView.setText(audioRecordingHoldToRecordText);
        TextStyleKt.setTextStyle(textView, getStyle().getAudioRecordingHoldToRecordTextStyle());
        textView.setBackground(DrawableKt.applyTint(getStyle().getAudioRecordingHoldToRecordBackgroundDrawable(), getStyle().getAudioRecordingHoldToRecordBackgroundDrawableTint()));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iMax = Math.max(viewInflate.getMeasuredHeight(), viewInflate.getLayoutParams().height);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8294g(viewInflate.getMeasuredHeight(), viewInflate.getLayoutParams().height, "[showHoldPopup] holdContent.h: ", " - "), null);
        }
        PopupWindow popupWindow = this.holdPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        PopupWindow popupWindow2 = new PopupWindow(getContext());
        popupWindow2.setBackgroundDrawable(null);
        popupWindow2.setClippingEnabled(true);
        popupWindow2.setContentView(viewInflate);
        popupWindow2.setWidth(-1);
        popupWindow2.setHeight(iMax);
        Fade fade = new Fade(1);
        fade.setDuration(100L);
        popupWindow2.setEnterTransition(fade);
        Fade fade2 = new Fade(2);
        fade2.setDuration(100L);
        popupWindow2.setExitTransition(fade2);
        int[] iArr = new int[2];
        this.binding.getRoot().getLocationInWindow(iArr);
        popupWindow2.showAtLocation(this.binding.getRoot(), 8388659, 0, iArr[1] - iMax);
        this.holdPopup = popupWindow2;
        this.holdHandler.removeCallbacksAndMessages(null);
        this.holdHandler.postDelayed(new Runnable() { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.g
            @Override // java.lang.Runnable
            public final void run() {
                DefaultMessageComposerOverlappingContent.showHoldPopup$lambda$62(this.f74581w);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showHoldPopup$lambda$62(DefaultMessageComposerOverlappingContent defaultMessageComposerOverlappingContent) {
        C2345k logger = defaultMessageComposerOverlappingContent.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[showHoldPopup] delayed cancellation", null);
        }
        PopupWindow popupWindow = defaultMessageComposerOverlappingContent.holdPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        defaultMessageComposerOverlappingContent.holdPopup = null;
    }

    private final void showLockPopup() {
        if (getWindowToken() == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[showLockPopup] rejected (windowToken is null)", null);
                return;
            }
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, "[showLockPopup] micBaseRect: " + this.micBaseRect, null);
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(C19469R.layout.stream_ui_message_composer_default_center_overlap_floating_lock, (ViewGroup) this, false);
        AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) viewInflate).setImageDrawable(DrawableKt.applyTint(getStyle().getAudioRecordingFloatingLockIconDrawable(), getStyle().getAudioRecordingFloatingLockIconDrawableTint()));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iMax = Math.max(viewInflate.getMeasuredWidth(), viewInflate.getLayoutParams().width);
        int iMax2 = Math.max(viewInflate.getMeasuredHeight(), viewInflate.getLayoutParams().height);
        PopupWindow popupWindow = this.lockPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        PopupWindow popupWindow2 = new PopupWindow(getContext());
        popupWindow2.setBackgroundDrawable(null);
        popupWindow2.setClippingEnabled(true);
        popupWindow2.setContentView(viewInflate);
        popupWindow2.setWidth(iMax);
        popupWindow2.setHeight(iMax2);
        this.lockBaseRect.set(0, 0, iMax, iMax2);
        this.lockBaseRect.offset(this.micBaseRect.centerX() - this.lockBaseRect.centerX(), (this.micBaseRect.top - this.lockBaseRect.height()) - IntKt.dpToPx(16));
        this.lockLastRect.set(this.lockBaseRect);
        Rect rect = this.lockMoveRect;
        rect.set(this.lockBaseRect);
        rect.top -= this.centerContentHeight * 2;
        View root = this.binding.getRoot();
        Rect rect2 = this.lockBaseRect;
        popupWindow2.showAtLocation(root, 8388659, rect2.left, rect2.top);
        this.lockPopup = popupWindow2;
    }

    private final void showLockedPopup() {
        if (getWindowToken() == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[showLockedPopup] rejected (windowToken is null)", null);
                return;
            }
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, "[showLockedPopup] micBaseRect: " + this.micBaseRect, null);
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(C19469R.layout.f74084x9440f87a, (ViewGroup) this, false);
        AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) viewInflate).setImageDrawable(DrawableKt.applyTint(getStyle().getAudioRecordingFloatingLockedIconDrawable(), getStyle().getAudioRecordingFloatingLockedIconDrawableTint()));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iMax = Math.max(viewInflate.getMeasuredWidth(), viewInflate.getLayoutParams().width);
        int iMax2 = Math.max(viewInflate.getMeasuredHeight(), viewInflate.getLayoutParams().height);
        PopupWindow popupWindow = this.lockPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        PopupWindow popupWindow2 = new PopupWindow(getContext());
        popupWindow2.setBackgroundDrawable(null);
        popupWindow2.setClippingEnabled(true);
        popupWindow2.setContentView(viewInflate);
        popupWindow2.setWidth(iMax);
        popupWindow2.setHeight(iMax2);
        popupWindow2.showAsDropDown(this.binding.getRoot(), 0, -IntKt.dpToPx(16), 8388693);
        this.lockPopup = popupWindow2;
    }

    private final void showMicPopup() {
        if (getWindowToken() == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[showMicPopup] rejected (windowToken is null)", null);
                return;
            }
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, "[showMicPopup] micOrigRect: " + this.micOrigRect, null);
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(C19469R.layout.stream_ui_message_composer_default_center_overlap_floating_mic, (ViewGroup) this, false);
        AbstractC22676k.m65748h(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewInflate;
        imageView.setImageDrawable(DrawableKt.applyTint(getStyle().getAudioRecordingFloatingButtonIconDrawable(), getStyle().getAudioRecordingFloatingButtonIconDrawableTint()));
        imageView.setBackground(DrawableKt.applyTint(getStyle().getAudioRecordingFloatingButtonBackgroundDrawable(), getStyle().getAudioRecordingFloatingButtonBackgroundDrawableTint()));
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int iMax = Math.max(viewInflate.getMeasuredWidth(), viewInflate.getLayoutParams().width);
        int iMax2 = Math.max(viewInflate.getMeasuredHeight(), viewInflate.getLayoutParams().height);
        PopupWindow popupWindow = this.micPopup;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        PopupWindow popupWindow2 = new PopupWindow(getContext());
        popupWindow2.setBackgroundDrawable(null);
        popupWindow2.setClippingEnabled(false);
        popupWindow2.setContentView(viewInflate);
        popupWindow2.setWidth(iMax);
        popupWindow2.setHeight(iMax2);
        this.micBaseRect.set(0, 0, iMax, iMax2);
        this.micBaseRect.offset(this.micOrigRect.centerX() - this.micBaseRect.centerX(), this.micOrigRect.centerY() - this.micBaseRect.centerY());
        this.micLastRect.set(this.micBaseRect);
        Rect rect = this.micMoveRect;
        rect.set(this.micBaseRect);
        Context context = getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        if (ContextKt.isRtlLayout(context)) {
            rect.left = (this.parentWidth / 3) + rect.left;
        } else {
            rect.left -= this.parentWidth / 3;
        }
        rect.top -= this.centerContentHeight * 2;
        View root = this.binding.getRoot();
        Rect rect2 = this.micBaseRect;
        popupWindow2.showAtLocation(root, 8388659, rect2.left, rect2.top);
        this.micPopup = popupWindow2;
    }

    private final void vibrateDevice(long milliseconds) {
        Vibrator defaultVibrator;
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = getContext().getSystemService("vibrator_manager");
            defaultVibrator = null;
            VibratorManager vibratorManagerM71061g = C24148c.m71064j(systemService) ? C24148c.m71061g(systemService) : null;
            if (vibratorManagerM71061g != null) {
                defaultVibrator = vibratorManagerM71061g.getDefaultVibrator();
            }
        } else {
            defaultVibrator = (Vibrator) AbstractC32122c.getSystemService(getContext(), Vibrator.class);
        }
        if (defaultVibrator == null || !defaultVibrator.hasVibrator()) {
            return;
        }
        defaultVibrator.vibrate(VibrationEffect.createOneShot(milliseconds, -1));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final void attachContext(MessageComposerContext messageComposerContext) {
        AbstractC22676k.m65750j(messageComposerContext, "messageComposerContext");
        setComposerContext(messageComposerContext);
        setStyle(messageComposerContext.getStyle());
        this.binding.recordingSlider.setText(getStyle().getAudioRecordingSlideToCancelText());
        TextView recordingSlider = this.binding.recordingSlider;
        AbstractC22676k.m65749i(recordingSlider, "recordingSlider");
        TextStyleKt.setTextStyle(recordingSlider, getStyle().getAudioRecordingSlideToCancelTextStyle());
        TextView recordingSlider2 = this.binding.recordingSlider;
        AbstractC22676k.m65749i(recordingSlider2, "recordingSlider");
        Drawable audioRecordingSlideToCancelStartDrawable = getStyle().getAudioRecordingSlideToCancelStartDrawable();
        audioRecordingSlideToCancelStartDrawable.setLayoutDirection(getResources().getConfiguration().getLayoutDirection());
        TextViewKt.setStartDrawable(recordingSlider2, DrawableKt.applyTint(audioRecordingSlideToCancelStartDrawable, getStyle().getAudioRecordingSlideToCancelStartDrawableTint()));
        Integer audioRecordingWaveformColor = getStyle().getAudioRecordingWaveformColor();
        if (audioRecordingWaveformColor != null) {
            this.binding.recordingWaveform.setWaveformColor(audioRecordingWaveformColor.intValue());
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final View findViewByKey(String str) {
        super.findViewByKey(str);
        return null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public InterfaceC4339a getCompleteButtonClickListener() {
        return this.completeButtonClickListener;
    }

    public final MessageComposerContext getComposerContext() {
        MessageComposerContext messageComposerContext = this.composerContext;
        if (messageComposerContext != null) {
            return messageComposerContext;
        }
        AbstractC22676k.m65757q("composerContext");
        throw null;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public InterfaceC4339a getDeleteButtonClickListener() {
        return this.deleteButtonClickListener;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public InterfaceC4339a getPlaybackButtonClickListener() {
        return this.playbackButtonClickListener;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public InterfaceC4339a getRecordButtonCancelListener() {
        return this.recordButtonCancelListener;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public InterfaceC4339a getRecordButtonHoldListener() {
        return this.recordButtonHoldListener;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public InterfaceC4339a getRecordButtonLockListener() {
        return this.recordButtonLockListener;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public InterfaceC4339a getRecordButtonReleaseListener() {
        return this.recordButtonReleaseListener;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public Function1 getSliderDragStartListener() {
        return this.sliderDragStartListener;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public Function1 getSliderDragStopListener() {
        return this.sliderDragStopListener;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public InterfaceC4339a getStopButtonClickListener() {
        return this.stopButtonClickListener;
    }

    public final MessageComposerViewStyle getStyle() {
        MessageComposerViewStyle messageComposerViewStyle = this.style;
        if (messageComposerViewStyle != null) {
            return messageComposerViewStyle;
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onAttachedToWindow] no args", null);
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onAttachedToWindow] newConfig: " + newConfig, null);
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[onDetachedFromWindow] no args", null);
        }
        super.onDetachedFromWindow();
        renderIdle();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev3) {
        AbstractC22676k.m65750j(ev3, "ev");
        RecordingState recordingState = this._state;
        return (recordingState instanceof RecordingState.Idle) || (recordingState instanceof RecordingState.Hold);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC2875y.m8294g(getWidth(), getHeight(), "[onLayout] w: ", ", h: "), null);
        }
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

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent event) {
        View viewAsView;
        AbstractC22676k.m65750j(event, "event");
        RecordingState recordingState = this._state;
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0 || (recordingState instanceof RecordingState.Idle)) {
            boolean z4 = actionMasked == 1 || actionMasked == 3;
            boolean z13 = !(this.micPopup == null && this.lockPopup == null) && (this._state instanceof RecordingState.Idle);
            boolean z14 = z4 && z13;
            if (actionMasked == 0 || (recordingState instanceof RecordingState.Hold) || z14) {
                C2345k logger = getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[onTouchEvent] state: " + recordingState + ", event: " + event, null);
                }
                float rawX = event.getRawX();
                float rawY = event.getRawY();
                if (actionMasked == 0) {
                    C2345k logger2 = getLogger();
                    InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                    String str2 = logger2.f9273a;
                    EnumC2341g enumC2341g2 = EnumC2341g.INFO;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                        logger2.f9274b.log(enumC2341g2, str2, "[onTouchEvent] ACTION_DOWN", null);
                    }
                    PermissionChecker permissionChecker = this.permissionChecker;
                    Context context = getContext();
                    AbstractC22676k.m65749i(context, "getContext(...)");
                    if (!permissionChecker.isGrantedAudioRecordPermission(context)) {
                        PermissionChecker.checkAudioRecordPermissions$default(this.permissionChecker, this, null, null, 6, null);
                        return false;
                    }
                    this.parentWidth = Math.min(this.parentWidth, getComposerContext().getContent().asView().getWidth());
                    Context context2 = getContext();
                    AbstractC22676k.m65749i(context2, "getContext(...)");
                    this.centerContentHeight = ContextKt.getDimension(context2, C19469R.dimen.stream_ui_message_composer_center_content_height);
                    View viewFindRecordAudioButton = MessageComposerContentContainerKt.findRecordAudioButton(getComposerContext().getContent());
                    if (viewFindRecordAudioButton == null) {
                        MessageComposerContent trailing = getComposerContext().getContent().getTrailing();
                        viewFindRecordAudioButton = (trailing == null || (viewAsView = MessageComposerContentKt.asView(trailing)) == null) ? null : viewAsView.findViewById(C19469R.id.recordAudioButton);
                        if (viewFindRecordAudioButton == null) {
                            throw new IllegalStateException("recordAudioButton not found");
                        }
                    }
                    DefaultMessageComposerOverlappingContentKt.getRectInWindow(viewFindRecordAudioButton, this.micOrigRect);
                    C2345k logger3 = getLogger();
                    InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
                    String str3 = logger3.f9273a;
                    EnumC2341g enumC2341g3 = EnumC2341g.WARN;
                    if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                        logger3.f9274b.log(enumC2341g3, str3, "[onTouchEvent] centerContentHeight: " + this.centerContentHeight + ", " + IntKt.displayMetrics().density + ", " + IntKt.displayMetrics().widthPixels, null);
                    }
                    float[] fArr = this.baseTouch;
                    fArr[0] = rawX;
                    fArr[1] = rawY;
                    this.holdStartTime = SystemClock.elapsedRealtime();
                    showMicPopup();
                    showLockPopup();
                    vibrateDevice(100L);
                    InterfaceC4339a recordButtonHoldListener = getRecordButtonHoldListener();
                    if (recordButtonHoldListener != null) {
                        recordButtonHoldListener.invoke();
                    }
                } else if (actionMasked == 1) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - this.holdStartTime;
                    C2345k logger4 = getLogger();
                    InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
                    String str4 = logger4.f9273a;
                    EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
                    if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
                        logger4.f9274b.log(enumC2341g4, str4, AbstractC31061c.m95636l(jElapsedRealtime, "[onTouchEvent] ACTION_UP (", ")"), null);
                    }
                    vibrateDevice(100L);
                    if (jElapsedRealtime > 1000) {
                        InterfaceC4339a recordButtonReleaseListener = getRecordButtonReleaseListener();
                        if (recordButtonReleaseListener != null) {
                            recordButtonReleaseListener.invoke();
                            return true;
                        }
                    } else {
                        if (z13) {
                            resetUI();
                        }
                        showHoldPopup();
                        InterfaceC4339a recordButtonCancelListener = getRecordButtonCancelListener();
                        if (recordButtonCancelListener != null) {
                            recordButtonCancelListener.invoke();
                            return true;
                        }
                    }
                } else if (actionMasked == 2) {
                    float[] fArr2 = this.baseTouch;
                    int i13 = (int) (rawX - fArr2[0]);
                    int i14 = (int) (rawY - fArr2[1]);
                    if (this.micBaseRect.width() == 0 || this.lockBaseRect.width() == 0) {
                        C2345k logger5 = getLogger();
                        InterfaceC2339e interfaceC2339e5 = logger5.f9275c;
                        String str5 = logger5.f9273a;
                        if (interfaceC2339e5.isLoggable(enumC2341g, str5)) {
                            logger5.f9274b.log(enumC2341g, str5, "[onTouchEvent] ACTION_MOVE rejected (no popups 1)", null);
                        }
                    } else if (this.micPopup == null || this.lockPopup == null) {
                        C2345k logger6 = getLogger();
                        InterfaceC2339e interfaceC2339e6 = logger6.f9275c;
                        String str6 = logger6.f9273a;
                        if (interfaceC2339e6.isLoggable(enumC2341g, str6)) {
                            logger6.f9274b.log(enumC2341g, str6, "[onTouchEvent] ACTION_MOVE rejected (no popups 2)", null);
                            return false;
                        }
                    } else {
                        C2345k logger7 = getLogger();
                        InterfaceC2339e interfaceC2339e7 = logger7.f9275c;
                        String str7 = logger7.f9273a;
                        EnumC2341g enumC2341g5 = EnumC2341g.INFO;
                        if (interfaceC2339e7.isLoggable(enumC2341g5, str7)) {
                            logger7.f9274b.log(enumC2341g5, str7, AbstractC2875y.m8294g(i13, i14, "[onTouchEvent] ACTION_MOVE: offsetX: ", ", offsetY: "), null);
                        }
                        Rect rect = this.micBaseRect;
                        int i15 = rect.left;
                        int i16 = rect.top + i14;
                        this.micLastRect.left = AbstractC12889b.m36284n(i13 + i15, Math.min(i15, this.micMoveRect.left), Math.max(this.micBaseRect.left, this.micMoveRect.left));
                        this.micLastRect.top = AbstractC12889b.m36284n(i16, this.micMoveRect.top, this.micBaseRect.top);
                        PopupWindow popupWindow = this.micPopup;
                        if (popupWindow != null) {
                            Rect rect2 = this.micLastRect;
                            popupWindow.update(rect2.left, rect2.top, -1, -1);
                        }
                        int i17 = this.lockBaseRect.top;
                        this.lockLastRect.top = AbstractC12889b.m36284n(i14 + i17, this.lockMoveRect.top, i17);
                        PopupWindow popupWindow2 = this.lockPopup;
                        if (popupWindow2 != null) {
                            Rect rect3 = this.lockLastRect;
                            popupWindow2.update(rect3.left, rect3.top, -1, -1);
                        }
                        float fAbs = Math.abs(this.micBaseRect.left - this.micLastRect.left) / Math.abs(this.micBaseRect.left - this.micMoveRect.left);
                        C2345k logger8 = getLogger();
                        InterfaceC2339e interfaceC2339e8 = logger8.f9275c;
                        String str8 = logger8.f9273a;
                        EnumC2341g enumC2341g6 = EnumC2341g.WARN;
                        if (interfaceC2339e8.isLoggable(enumC2341g6, str8)) {
                            logger8.f9274b.log(enumC2341g6, str8, "[onMove] progress: " + fAbs + ", diff: " + (this.micLastRect.left - this.micBaseRect.left), null);
                        }
                        this.binding.recordingSlider.setTranslationX(this.micLastRect.left - this.micBaseRect.left);
                        this.binding.recordingSlider.setAlpha(1 - (fAbs * 1.5f));
                        Rect rect4 = this.micLastRect;
                        int i18 = rect4.left;
                        Rect rect5 = this.micMoveRect;
                        if (i18 == rect5.left) {
                            C2345k logger9 = getLogger();
                            InterfaceC2339e interfaceC2339e9 = logger9.f9275c;
                            String str9 = logger9.f9273a;
                            if (interfaceC2339e9.isLoggable(enumC2341g6, str9)) {
                                logger9.f9274b.log(enumC2341g6, str9, "[onMove] cancelled; micLastRect: " + this.micLastRect + ", micMoveRect: " + this.micMoveRect, null);
                            }
                            renderIdle();
                            InterfaceC4339a recordButtonCancelListener2 = getRecordButtonCancelListener();
                            if (recordButtonCancelListener2 != null) {
                                recordButtonCancelListener2.invoke();
                                return false;
                            }
                        } else if (rect4.top == rect5.top) {
                            C2345k logger10 = getLogger();
                            InterfaceC2339e interfaceC2339e10 = logger10.f9275c;
                            String str10 = logger10.f9273a;
                            if (interfaceC2339e10.isLoggable(enumC2341g6, str10)) {
                                logger10.f9274b.log(enumC2341g6, str10, "[onMove] locked", null);
                            }
                            InterfaceC4339a recordButtonLockListener = getRecordButtonLockListener();
                            if (recordButtonLockListener != null) {
                                recordButtonLockListener.invoke();
                                return false;
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    C2345k logger11 = getLogger();
                    InterfaceC2339e interfaceC2339e11 = logger11.f9275c;
                    String str11 = logger11.f9273a;
                    EnumC2341g enumC2341g7 = EnumC2341g.DEBUG;
                    if (interfaceC2339e11.isLoggable(enumC2341g7, str11)) {
                        logger11.f9274b.log(enumC2341g7, str11, "[onTouchEvent] ACTION_CANCEL", null);
                    }
                    if (z13) {
                        resetUI();
                    }
                    InterfaceC4339a recordButtonCancelListener3 = getRecordButtonCancelListener();
                    if (recordButtonCancelListener3 != null) {
                        recordButtonCancelListener3.invoke();
                        return true;
                    }
                }
                return true;
            }
            C2345k logger12 = getLogger();
            InterfaceC2339e interfaceC2339e12 = logger12.f9275c;
            String str12 = logger12.f9273a;
            EnumC2341g enumC2341g8 = EnumC2341g.WARN;
            if (interfaceC2339e12.isLoggable(enumC2341g8, str12)) {
                logger12.f9274b.log(enumC2341g8, str12, "[onTouchEvent] rejected " + DefaultMessageComposerOverlappingContentKt.actionToString(actionMasked) + " (state is not Hold): " + recordingState, null);
                return false;
            }
        } else {
            C2345k logger13 = getLogger();
            InterfaceC2339e interfaceC2339e13 = logger13.f9275c;
            String str13 = logger13.f9273a;
            EnumC2341g enumC2341g9 = EnumC2341g.WARN;
            if (interfaceC2339e13.isLoggable(enumC2341g9, str13)) {
                logger13.f9274b.log(enumC2341g9, str13, AbstractC17176i.m48502d("[onTouchEvent] rejected ACTION_DOWN (state is not Idle): ", recordingState), null);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View changedView, int visibility) {
        AbstractC22676k.m65750j(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == 0) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[onVisibilityChanged] VISIBLE; state: ", this._state), null);
                return;
            }
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, AbstractC17176i.m48502d("[onVisibilityChanged] NOT_VISIBLE; state: ", this._state), null);
        }
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerContent
    public final void renderState(MessageComposerState state) {
        AbstractC22676k.m65750j(state, "state");
        RecordingState recording = state.getRecording();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC11266d.m30456j(getMeasuredHeight(), "[renderState] measuredHeight: ", ", recordingState: ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(recording.getClass()).getSimpleName()), null);
        }
        if (recording instanceof RecordingState.Hold) {
            renderHold((RecordingState.Hold) recording);
        } else if (recording instanceof RecordingState.Locked) {
            renderLocked((RecordingState.Locked) recording);
        } else if (recording instanceof RecordingState.Overview) {
            renderOverview((RecordingState.Overview) recording);
        } else if (recording instanceof RecordingState.Complete) {
            renderComplete();
        } else {
            if (!(recording instanceof RecordingState.Idle)) {
                throw new NoWhenBranchMatchedException();
            }
            renderIdle();
        }
        set_state(recording);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public void setCompleteButtonClickListener(InterfaceC4339a interfaceC4339a) {
        this.completeButtonClickListener = interfaceC4339a;
    }

    public final void setComposerContext(MessageComposerContext messageComposerContext) {
        AbstractC22676k.m65750j(messageComposerContext, "<set-?>");
        this.composerContext = messageComposerContext;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public void setDeleteButtonClickListener(InterfaceC4339a interfaceC4339a) {
        this.deleteButtonClickListener = interfaceC4339a;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public void setPlaybackButtonClickListener(InterfaceC4339a interfaceC4339a) {
        this.playbackButtonClickListener = interfaceC4339a;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public void setRecordButtonCancelListener(InterfaceC4339a interfaceC4339a) {
        this.recordButtonCancelListener = interfaceC4339a;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public void setRecordButtonHoldListener(InterfaceC4339a interfaceC4339a) {
        this.recordButtonHoldListener = interfaceC4339a;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public void setRecordButtonLockListener(InterfaceC4339a interfaceC4339a) {
        this.recordButtonLockListener = interfaceC4339a;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public void setRecordButtonReleaseListener(InterfaceC4339a interfaceC4339a) {
        this.recordButtonReleaseListener = interfaceC4339a;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public void setSliderDragStartListener(Function1 function1) {
        this.sliderDragStartListener = function1;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public void setSliderDragStopListener(Function1 function1) {
        this.sliderDragStopListener = function1;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.composer.content.MessageComposerOverlappingContent
    public void setStopButtonClickListener(InterfaceC4339a interfaceC4339a) {
        this.stopButtonClickListener = interfaceC4339a;
    }

    public final void setStyle(MessageComposerViewStyle messageComposerViewStyle) {
        AbstractC22676k.m65750j(messageComposerViewStyle, "<set-?>");
        this.style = messageComposerViewStyle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerOverlappingContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "OverlappingContent");
        this.parentWidth = Integer.MAX_VALUE;
        this.centerContentHeight = Integer.MAX_VALUE;
        this.lockBaseRect = new Rect();
        this.lockLastRect = new Rect();
        this.lockMoveRect = new Rect();
        this.micOrigRect = new Rect();
        this.micBaseRect = new Rect();
        this.micLastRect = new Rect();
        this.micMoveRect = new Rect();
        this.holdHandler = new Handler(Looper.getMainLooper());
        this.baseTouch = new float[2];
        this.permissionChecker = new PermissionChecker();
        this._state = RecordingState.Idle.INSTANCE;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("<init> state: ", this._state), null);
        }
        StreamUiMessageComposerDefaultCenterOverlapContentBinding streamUiMessageComposerDefaultCenterOverlapContentBindingInflate = StreamUiMessageComposerDefaultCenterOverlapContentBinding.inflate(LayoutInflater.from(getContext()), this);
        this.binding = streamUiMessageComposerDefaultCenterOverlapContentBindingInflate;
        final int i13 = 0;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingDelete.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i14 = 1;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingStop.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i15 = 2;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingComplete.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i16 = 3;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingPlayback.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i17 = 0;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingWaveform.setOnSliderDragStart(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74580x;

            {
                this.f74580x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i19 = i17;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i19) {
                    case 0:
                        DefaultMessageComposerOverlappingContent._init_$lambda$6(this.f74580x, fFloatValue);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent._init_$lambda$7(this.f74580x, fFloatValue);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
        final int i18 = 1;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingWaveform.setOnSliderDragStop(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74580x;

            {
                this.f74580x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i19 = i18;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i19) {
                    case 0:
                        DefaultMessageComposerOverlappingContent._init_$lambda$6(this.f74580x, fFloatValue);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent._init_$lambda$7(this.f74580x, fFloatValue);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.centerContentHeight = ContextKt.getDimension(context2, C19469R.dimen.stream_ui_message_composer_center_content_height);
        this.parentWidth = IntKt.displayMetrics().widthPixels;
        renderIdle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerOverlappingContent(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "OverlappingContent");
        this.parentWidth = Integer.MAX_VALUE;
        this.centerContentHeight = Integer.MAX_VALUE;
        this.lockBaseRect = new Rect();
        this.lockLastRect = new Rect();
        this.lockMoveRect = new Rect();
        this.micOrigRect = new Rect();
        this.micBaseRect = new Rect();
        this.micLastRect = new Rect();
        this.micMoveRect = new Rect();
        this.holdHandler = new Handler(Looper.getMainLooper());
        this.baseTouch = new float[2];
        this.permissionChecker = new PermissionChecker();
        this._state = RecordingState.Idle.INSTANCE;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("<init> state: ", this._state), null);
        }
        StreamUiMessageComposerDefaultCenterOverlapContentBinding streamUiMessageComposerDefaultCenterOverlapContentBindingInflate = StreamUiMessageComposerDefaultCenterOverlapContentBinding.inflate(LayoutInflater.from(getContext()), this);
        this.binding = streamUiMessageComposerDefaultCenterOverlapContentBindingInflate;
        final int i14 = 0;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingDelete.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i15 = 1;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingStop.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i16 = 2;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingComplete.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i17 = 3;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingPlayback.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i18 = 0;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingWaveform.setOnSliderDragStart(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74580x;

            {
                this.f74580x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i19 = i18;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i19) {
                    case 0:
                        DefaultMessageComposerOverlappingContent._init_$lambda$6(this.f74580x, fFloatValue);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent._init_$lambda$7(this.f74580x, fFloatValue);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
        final int i19 = 1;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingWaveform.setOnSliderDragStop(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74580x;

            {
                this.f74580x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i110 = i19;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i110) {
                    case 0:
                        DefaultMessageComposerOverlappingContent._init_$lambda$6(this.f74580x, fFloatValue);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent._init_$lambda$7(this.f74580x, fFloatValue);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.centerContentHeight = ContextKt.getDimension(context2, C19469R.dimen.stream_ui_message_composer_center_content_height);
        this.parentWidth = IntKt.displayMetrics().widthPixels;
        renderIdle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultMessageComposerOverlappingContent(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        AbstractC22676k.m65750j(context, "context");
        this.logger = AbstractC1772c1.m5382S(this, "OverlappingContent");
        this.parentWidth = Integer.MAX_VALUE;
        this.centerContentHeight = Integer.MAX_VALUE;
        this.lockBaseRect = new Rect();
        this.lockLastRect = new Rect();
        this.lockMoveRect = new Rect();
        this.micOrigRect = new Rect();
        this.micBaseRect = new Rect();
        this.micLastRect = new Rect();
        this.micMoveRect = new Rect();
        this.holdHandler = new Handler(Looper.getMainLooper());
        this.baseTouch = new float[2];
        this.permissionChecker = new PermissionChecker();
        this._state = RecordingState.Idle.INSTANCE;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("<init> state: ", this._state), null);
        }
        StreamUiMessageComposerDefaultCenterOverlapContentBinding streamUiMessageComposerDefaultCenterOverlapContentBindingInflate = StreamUiMessageComposerDefaultCenterOverlapContentBinding.inflate(LayoutInflater.from(getContext()), this);
        this.binding = streamUiMessageComposerDefaultCenterOverlapContentBindingInflate;
        final int i15 = 0;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingDelete.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i16 = 1;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingStop.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i17 = 2;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingComplete.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i18 = 3;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingPlayback.setOnClickListener(new View.OnClickListener(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.e

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74578x;

            {
                this.f74578x = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        DefaultMessageComposerOverlappingContent.m55302n(this.f74578x, view);
                        break;
                    case 1:
                        DefaultMessageComposerOverlappingContent.m55299k(this.f74578x, view);
                        break;
                    case 2:
                        DefaultMessageComposerOverlappingContent.m55301m(this.f74578x, view);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent.m55297f(this.f74578x, view);
                        break;
                }
            }
        });
        final int i19 = 0;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingWaveform.setOnSliderDragStart(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74580x;

            {
                this.f74580x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i110 = i19;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i110) {
                    case 0:
                        DefaultMessageComposerOverlappingContent._init_$lambda$6(this.f74580x, fFloatValue);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent._init_$lambda$7(this.f74580x, fFloatValue);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
        final int i24 = 1;
        streamUiMessageComposerDefaultCenterOverlapContentBindingInflate.recordingWaveform.setOnSliderDragStop(new Function1(this) { // from class: io.getstream.chat.android.ui.feature.messages.composer.content.f

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ DefaultMessageComposerOverlappingContent f74580x;

            {
                this.f74580x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i110 = i24;
                float fFloatValue = ((Float) obj).floatValue();
                switch (i110) {
                    case 0:
                        DefaultMessageComposerOverlappingContent._init_$lambda$6(this.f74580x, fFloatValue);
                        break;
                    default:
                        DefaultMessageComposerOverlappingContent._init_$lambda$7(this.f74580x, fFloatValue);
                        break;
                }
                return C23454a0.f92919a;
            }
        });
        Context context2 = getContext();
        AbstractC22676k.m65749i(context2, "getContext(...)");
        this.centerContentHeight = ContextKt.getDimension(context2, C19469R.dimen.stream_ui_message_composer_center_content_height);
        this.parentWidth = IntKt.displayMetrics().widthPixels;
        renderIdle();
    }
}
