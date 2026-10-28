.class public Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0014\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0016\u0018\u0000 \u00a9\u00012\u00020\u00012\u00020\u0002:\u0002\u00a9\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u001b\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\tB#\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0005\u0010\u000cB+\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0005\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00112\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0011H\u0014\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00112\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u001fH\u0014\u00a2\u0006\u0004\u0008 \u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0014\u00a2\u0006\u0004\u0008\"\u0010#J\u001f\u0010\'\u001a\u00020\u00112\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u0008\'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0016\u00a2\u0006\u0004\u0008,\u0010-J7\u00103\u001a\u00020\u00112\u0006\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0014\u00a2\u0006\u0004\u00083\u00104J\u0017\u00106\u001a\u00020+2\u0006\u00105\u001a\u00020)H\u0017\u00a2\u0006\u0004\u00086\u0010-J\u0017\u00109\u001a\u00020\u00112\u0006\u00108\u001a\u000207H\u0002\u00a2\u0006\u0004\u00089\u0010:J\u000f\u0010;\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008;\u0010\u001dJ\u000f\u0010<\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008<\u0010\u001dJ\u000f\u0010=\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008=\u0010\u001dJ\u0017\u0010?\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020>H\u0002\u00a2\u0006\u0004\u0008?\u0010@J\u0017\u0010B\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020AH\u0002\u00a2\u0006\u0004\u0008B\u0010CJ\u0017\u0010E\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020DH\u0002\u00a2\u0006\u0004\u0008E\u0010FJ\u000f\u0010G\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008G\u0010\u001dJ\u000f\u0010H\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008H\u0010\u001dJ\u000f\u0010I\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008I\u0010\u001dJ\u000f\u0010J\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008J\u0010\u001dR*\u0010L\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008L\u0010M\u001a\u0004\u0008N\u0010O\"\u0004\u0008P\u0010QR*\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008R\u0010M\u001a\u0004\u0008S\u0010O\"\u0004\u0008T\u0010QR*\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008U\u0010M\u001a\u0004\u0008V\u0010O\"\u0004\u0008W\u0010QR*\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008X\u0010M\u001a\u0004\u0008Y\u0010O\"\u0004\u0008Z\u0010QR*\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008[\u0010M\u001a\u0004\u0008\\\u0010O\"\u0004\u0008]\u0010QR*\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008^\u0010M\u001a\u0004\u0008_\u0010O\"\u0004\u0008`\u0010QR*\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008a\u0010M\u001a\u0004\u0008b\u0010O\"\u0004\u0008c\u0010QR*\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010K8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008d\u0010M\u001a\u0004\u0008e\u0010O\"\u0004\u0008f\u0010QR0\u0010i\u001a\u0010\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u0011\u0018\u00010g8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008i\u0010j\u001a\u0004\u0008k\u0010l\"\u0004\u0008m\u0010nR0\u0010o\u001a\u0010\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u0011\u0018\u00010g8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008o\u0010j\u001a\u0004\u0008p\u0010l\"\u0004\u0008q\u0010nR\u001b\u0010w\u001a\u00020r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008s\u0010t\u001a\u0004\u0008u\u0010vR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010zR\u0016\u0010{\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0016\u0010}\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008}\u0010|R\u0019\u0010\u007f\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0084\u0001\u0010\u0083\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0083\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0080\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0088\u0001\u0010\u0083\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u0083\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u0083\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u0080\u0001R\u0019\u0010\u008c\u0001\u001a\u0002078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001R,\u0010\u0099\u0001\u001a\u00030\u0097\u00012\u0008\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002@BX\u0082\u000e\u00a2\u0006\u0010\n\u0006\u0008\u0099\u0001\u0010\u009a\u0001\"\u0006\u0008\u009b\u0001\u0010\u009c\u0001R(\u0010\u009d\u0001\u001a\u00020\u000f8\u0004@\u0004X\u0084.\u00a2\u0006\u0017\n\u0006\u0008\u009d\u0001\u0010\u009e\u0001\u001a\u0006\u0008\u009f\u0001\u0010\u00a0\u0001\"\u0005\u0008\u00a1\u0001\u0010\u0013R*\u0010\u00a3\u0001\u001a\u00030\u00a2\u00018\u0004@\u0004X\u0084.\u00a2\u0006\u0018\n\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001\u001a\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001\"\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001\u00a8\u0006\u00aa\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "defStyleRes",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;",
        "messageComposerContext",
        "Ll83/a0;",
        "attachContext",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;",
        "state",
        "renderState",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V",
        "Landroid/content/res/Configuration;",
        "newConfig",
        "onConfigurationChanged",
        "(Landroid/content/res/Configuration;)V",
        "onAttachedToWindow",
        "()V",
        "onDetachedFromWindow",
        "Landroid/os/Parcelable;",
        "onRestoreInstanceState",
        "(Landroid/os/Parcelable;)V",
        "onSaveInstanceState",
        "()Landroid/os/Parcelable;",
        "Landroid/view/View;",
        "changedView",
        "visibility",
        "onVisibilityChanged",
        "(Landroid/view/View;I)V",
        "Landroid/view/MotionEvent;",
        "ev",
        "",
        "onInterceptTouchEvent",
        "(Landroid/view/MotionEvent;)Z",
        "changed",
        "left",
        "top",
        "right",
        "bottom",
        "onLayout",
        "(ZIIII)V",
        "event",
        "onTouchEvent",
        "",
        "milliseconds",
        "vibrateDevice",
        "(J)V",
        "resetUI",
        "renderIdle",
        "renderComplete",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;",
        "renderHold",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;",
        "renderLocked",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;",
        "renderOverview",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;)V",
        "showMicPopup",
        "showLockPopup",
        "showLockedPopup",
        "showHoldPopup",
        "Lkotlin/Function0;",
        "recordButtonHoldListener",
        "Lc93/a;",
        "getRecordButtonHoldListener",
        "()Lc93/a;",
        "setRecordButtonHoldListener",
        "(Lc93/a;)V",
        "recordButtonLockListener",
        "getRecordButtonLockListener",
        "setRecordButtonLockListener",
        "recordButtonCancelListener",
        "getRecordButtonCancelListener",
        "setRecordButtonCancelListener",
        "recordButtonReleaseListener",
        "getRecordButtonReleaseListener",
        "setRecordButtonReleaseListener",
        "playbackButtonClickListener",
        "getPlaybackButtonClickListener",
        "setPlaybackButtonClickListener",
        "stopButtonClickListener",
        "getStopButtonClickListener",
        "setStopButtonClickListener",
        "deleteButtonClickListener",
        "getDeleteButtonClickListener",
        "setDeleteButtonClickListener",
        "completeButtonClickListener",
        "getCompleteButtonClickListener",
        "setCompleteButtonClickListener",
        "Lkotlin/Function1;",
        "",
        "sliderDragStartListener",
        "Lkotlin/jvm/functions/Function1;",
        "getSliderDragStartListener",
        "()Lkotlin/jvm/functions/Function1;",
        "setSliderDragStartListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "sliderDragStopListener",
        "getSliderDragStopListener",
        "setSliderDragStopListener",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;",
        "parentWidth",
        "I",
        "centerContentHeight",
        "Landroid/widget/PopupWindow;",
        "lockPopup",
        "Landroid/widget/PopupWindow;",
        "Landroid/graphics/Rect;",
        "lockBaseRect",
        "Landroid/graphics/Rect;",
        "lockLastRect",
        "lockMoveRect",
        "micPopup",
        "micOrigRect",
        "micBaseRect",
        "micLastRect",
        "micMoveRect",
        "holdPopup",
        "holdStartTime",
        "J",
        "Landroid/os/Handler;",
        "holdHandler",
        "Landroid/os/Handler;",
        "",
        "baseTouch",
        "[F",
        "Lio/getstream/chat/android/ui/utils/PermissionChecker;",
        "permissionChecker",
        "Lio/getstream/chat/android/ui/utils/PermissionChecker;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
        "value",
        "_state",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;",
        "set_state",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V",
        "composerContext",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;",
        "getComposerContext",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;",
        "setComposerContext",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "getStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "setStyle",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V",
        "Companion",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final ANIM_DURATION_MS:J = 0x64L

.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent$Companion;

.field private static final HOLD_TIMEOUT_MS:J = 0x3e8L

.field private static final VIBRATE_MS:J = 0x64L


# instance fields
.field private _state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

.field private final baseTouch:[F

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

.field private centerContentHeight:I

.field private completeButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field protected composerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

.field private deleteButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final holdHandler:Landroid/os/Handler;

.field private holdPopup:Landroid/widget/PopupWindow;

.field private holdStartTime:J

.field private final lockBaseRect:Landroid/graphics/Rect;

.field private final lockLastRect:Landroid/graphics/Rect;

.field private final lockMoveRect:Landroid/graphics/Rect;

.field private lockPopup:Landroid/widget/PopupWindow;

.field private final logger$delegate:Ll83/h;

.field private final micBaseRect:Landroid/graphics/Rect;

.field private final micLastRect:Landroid/graphics/Rect;

.field private final micMoveRect:Landroid/graphics/Rect;

.field private final micOrigRect:Landroid/graphics/Rect;

.field private micPopup:Landroid/widget/PopupWindow;

.field private parentWidth:I

.field private final permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

.field private playbackButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private recordButtonCancelListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private recordButtonHoldListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private recordButtonLockListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private recordButtonReleaseListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private sliderDragStartListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private sliderDragStopListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private stopButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field protected style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    .line 2
    const-string p1, "OverlappingContent"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->logger$delegate:Ll83/h;

    const p1, 0x7fffffff

    .line 3
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    .line 4
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    .line 5
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    .line 6
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockLastRect:Landroid/graphics/Rect;

    .line 7
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockMoveRect:Landroid/graphics/Rect;

    .line 8
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micOrigRect:Landroid/graphics/Rect;

    .line 9
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    .line 10
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    .line 11
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micMoveRect:Landroid/graphics/Rect;

    .line 12
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdHandler:Landroid/os/Handler;

    const/4 p1, 0x2

    .line 13
    new-array p1, p1, [F

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->baseTouch:[F

    .line 14
    new-instance p1, Lio/getstream/chat/android/ui/utils/PermissionChecker;

    .line 15
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    .line 17
    sget-object p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    .line 18
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object p1

    .line 19
    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    .line 20
    sget-object v1, Lb23/g;->z:Lb23/g;

    .line 21
    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    .line 22
    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 23
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 24
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    const-string v3, "<init> state: "

    .line 25
    invoke-static {v3, v0}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    .line 26
    invoke-interface {p1, v1, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 28
    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    .line 29
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingDelete:Landroid/widget/ImageView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 30
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingStop:Landroid/widget/ImageView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingComplete:Landroid/widget/ImageView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setOnSliderDragStart(Lkotlin/jvm/functions/Function1;)V

    .line 34
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setOnSliderDragStop(Lkotlin/jvm/functions/Function1;)V

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_message_composer_center_content_height:I

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    .line 36
    invoke-static {}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->displayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    .line 37
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->renderIdle()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    const-string p1, "OverlappingContent"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->logger$delegate:Ll83/h;

    const p1, 0x7fffffff

    .line 44
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    .line 45
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    .line 46
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    .line 47
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockLastRect:Landroid/graphics/Rect;

    .line 48
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockMoveRect:Landroid/graphics/Rect;

    .line 49
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micOrigRect:Landroid/graphics/Rect;

    .line 50
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    .line 51
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    .line 52
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micMoveRect:Landroid/graphics/Rect;

    .line 53
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdHandler:Landroid/os/Handler;

    const/4 p1, 0x2

    .line 54
    new-array p1, p1, [F

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->baseTouch:[F

    .line 55
    new-instance p1, Lio/getstream/chat/android/ui/utils/PermissionChecker;

    .line 56
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    .line 58
    sget-object p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    .line 59
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object p1

    .line 60
    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    .line 61
    sget-object v0, Lb23/g;->z:Lb23/g;

    .line 62
    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    .line 63
    invoke-interface {p2, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 64
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 65
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    const-string v2, "<init> state: "

    .line 66
    invoke-static {v2, p2}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    .line 67
    invoke-interface {p1, v0, v1, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 69
    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    .line 70
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingDelete:Landroid/widget/ImageView;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingStop:Landroid/widget/ImageView;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingComplete:Landroid/widget/ImageView;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 74
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setOnSliderDragStart(Lkotlin/jvm/functions/Function1;)V

    .line 75
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setOnSliderDragStop(Lkotlin/jvm/functions/Function1;)V

    .line 76
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_message_composer_center_content_height:I

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    .line 77
    invoke-static {}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->displayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    .line 78
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->renderIdle()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 84
    const-string p1, "OverlappingContent"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->logger$delegate:Ll83/h;

    const p1, 0x7fffffff

    .line 85
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    .line 86
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    .line 87
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    .line 88
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockLastRect:Landroid/graphics/Rect;

    .line 89
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockMoveRect:Landroid/graphics/Rect;

    .line 90
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micOrigRect:Landroid/graphics/Rect;

    .line 91
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    .line 92
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    .line 93
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micMoveRect:Landroid/graphics/Rect;

    .line 94
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdHandler:Landroid/os/Handler;

    const/4 p1, 0x2

    .line 95
    new-array p1, p1, [F

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->baseTouch:[F

    .line 96
    new-instance p1, Lio/getstream/chat/android/ui/utils/PermissionChecker;

    .line 97
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    .line 99
    sget-object p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    .line 100
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object p1

    .line 101
    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    .line 102
    sget-object p3, Lb23/g;->z:Lb23/g;

    .line 103
    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    .line 104
    invoke-interface {p2, p3, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 105
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 106
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    const-string v1, "<init> state: "

    .line 107
    invoke-static {v1, p2}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    .line 108
    invoke-interface {p1, p3, v0, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 110
    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    .line 111
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingDelete:Landroid/widget/ImageView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v0, 0x0

    invoke-direct {p3, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingStop:Landroid/widget/ImageView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v0, 0x1

    invoke-direct {p3, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingComplete:Landroid/widget/ImageView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v0, 0x2

    invoke-direct {p3, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 v0, 0x3

    invoke-direct {p3, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;

    const/4 v0, 0x0

    invoke-direct {p3, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setOnSliderDragStart(Lkotlin/jvm/functions/Function1;)V

    .line 116
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setOnSliderDragStop(Lkotlin/jvm/functions/Function1;)V

    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_message_composer_center_content_height:I

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    .line 118
    invoke-static {}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->displayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    .line 119
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->renderIdle()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 125
    const-string p1, "OverlappingContent"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->logger$delegate:Ll83/h;

    const p1, 0x7fffffff

    .line 126
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    .line 127
    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    .line 128
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    .line 129
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockLastRect:Landroid/graphics/Rect;

    .line 130
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockMoveRect:Landroid/graphics/Rect;

    .line 131
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micOrigRect:Landroid/graphics/Rect;

    .line 132
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    .line 133
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    .line 134
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micMoveRect:Landroid/graphics/Rect;

    .line 135
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdHandler:Landroid/os/Handler;

    const/4 p1, 0x2

    .line 136
    new-array p1, p1, [F

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->baseTouch:[F

    .line 137
    new-instance p1, Lio/getstream/chat/android/ui/utils/PermissionChecker;

    .line 138
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 139
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    .line 140
    sget-object p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    .line 141
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object p1

    .line 142
    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    .line 143
    sget-object p3, Lb23/g;->z:Lb23/g;

    .line 144
    iget-object p4, p1, Lb23/k;->a:Ljava/lang/String;

    .line 145
    invoke-interface {p2, p3, p4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 146
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 147
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    const-string v0, "<init> state: "

    .line 148
    invoke-static {v0, p2}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    .line 149
    invoke-interface {p1, p3, p4, p2, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 150
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    .line 151
    invoke-static {p1, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    .line 152
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingDelete:Landroid/widget/ImageView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 153
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingStop:Landroid/widget/ImageView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 p4, 0x1

    invoke-direct {p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 154
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingComplete:Landroid/widget/ImageView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 p4, 0x2

    invoke-direct {p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;

    const/4 p4, 0x3

    invoke-direct {p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/composer/content/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 156
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setOnSliderDragStart(Lkotlin/jvm/functions/Function1;)V

    .line 157
    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/ui/feature/messages/composer/content/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;I)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setOnSliderDragStop(Lkotlin/jvm/functions/Function1;)V

    .line 158
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "getContext(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_message_composer_center_content_height:I

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    .line 159
    invoke-static {}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->displayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    .line 160
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->renderIdle()V

    return-void
.end method

.method private static final _init_$lambda$2(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getDeleteButtonClickListener()Lc93/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final _init_$lambda$3(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStopButtonClickListener()Lc93/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final _init_$lambda$4(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getCompleteButtonClickListener()Lc93/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final _init_$lambda$5(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getPlaybackButtonClickListener()Lc93/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private static final _init_$lambda$6(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;F)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getSliderDragStartListener()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _init_$lambda$7(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;F)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getSliderDragStopListener()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static f(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getPlaybackButtonClickListener()Lc93/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public static synthetic j(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;F)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_init_$lambda$7(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;F)Ll83/a0;

    return-void
.end method

.method public static k(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStopButtonClickListener()Lc93/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static synthetic l(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;F)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_init_$lambda$6(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;F)Ll83/a0;

    return-void
.end method

.method public static m(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getCompleteButtonClickListener()Lc93/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static n(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getDeleteButtonClickListener()Lc93/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static synthetic o(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->showHoldPopup$lambda$62(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;)V

    return-void
.end method

.method private final renderComplete()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->z:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[renderComplete] state: "

    invoke-static {v2, v0}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->resetUI()V

    return-void
.end method

.method private final renderHold(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[renderHold] no args"

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdPopup:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    iput-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdPopup:Landroid/widget/PopupWindow;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->horizontalGuideline:Landroidx/constraintlayout/widget/Guideline;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/widget/Guideline;->setGuidelinePercent(F)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingSlider:Landroid/widget/TextView;

    const-string v2, "recordingSlider"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_mic:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    const-string v2, "recordingPlayback"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_red:I

    invoke-static {v1, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;->access$setImageColorRes(Landroid/widget/ImageView;I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusable(Z)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    const-string v2, "recordingWaveform"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setSliderVisible(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingStop:Landroid/widget/ImageView;

    const-string v1, "recordingStop"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingDelete:Landroid/widget/ImageView;

    const-string v1, "recordingDelete"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingComplete:Landroid/widget/ImageView;

    const-string v1, "recordingComplete"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingTimer:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;->getDurationInMs()I

    move-result p1

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;->access$formatMillis(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final renderIdle()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->z:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[renderIdle] state: "

    invoke-static {v2, v0}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->resetUI()V

    return-void
.end method

.method private final renderLocked(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;)V
    .locals 8

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->getWaveform()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "[renderLocked] waveform: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", windowToken: "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    mul-int/lit8 v2, v2, 0x2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->horizontalGuideline:Landroidx/constraintlayout/widget/Guideline;

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/widget/Guideline;->setGuidelinePercent(F)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingSlider:Landroid/widget/TextView;

    const-string v2, "recordingSlider"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingDelete:Landroid/widget/ImageView;

    const-string v2, "recordingDelete"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingStop:Landroid/widget/ImageView;

    const-string v2, "recordingStop"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingComplete:Landroid/widget/ImageView;

    const-string v2, "recordingComplete"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingTimer:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->getDurationInMs()I

    move-result v2

    invoke-static {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;->access$formatMillis(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    const-string v2, "recordingWaveform"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;->getWaveform()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setWaveform(Ljava/util/List;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setSliderVisible(Z)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micPopup:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    iput-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micPopup:Landroid/widget/PopupWindow;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of p1, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->showLockedPopup()V

    return-void
.end method

.method private final renderOverview(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;)V
    .locals 6

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->isPlaying()Z

    move-result v1

    const-string v5, "[renderOverview] state.isPlaying: "

    invoke-static {v5, v1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    mul-int/lit8 v2, v2, 0x2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->horizontalGuideline:Landroidx/constraintlayout/widget/Guideline;

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/widget/Guideline;->setGuidelinePercent(F)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->isPlaying()Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_pause:I

    goto :goto_0

    :cond_1
    sget v2, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_play:I

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    const-string v2, "recordingPlayback"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v1, v5}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;->access$setImageColorRes(Landroid/widget/ImageView;I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/view/View;->setClickable(Z)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    invoke-virtual {v1, v3}, Landroid/view/View;->setFocusable(Z)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingSlider:Landroid/widget/TextView;

    const-string v2, "recordingSlider"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingTimer:Landroid/widget/TextView;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;->access$formatMillis(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    const-string v5, "recordingWaveform"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getWaveform()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setWaveform(Ljava/util/List;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getWaveform()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v1, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setWaveform(Ljava/util/List;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    invoke-virtual {v1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setSliderVisible(Z)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;->getPlayingProgress()F

    move-result p1

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setProgress(F)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingDelete:Landroid/widget/ImageView;

    const-string v1, "recordingDelete"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingStop:Landroid/widget/ImageView;

    const-string v1, "recordingStop"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingComplete:Landroid/widget/ImageView;

    const-string v1, "recordingComplete"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micPopup:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_2
    iput-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micPopup:Landroid/widget/PopupWindow;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    iput-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    return-void
.end method

.method private final resetUI()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[resetUI] no args"

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->clearData()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingSlider:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingSlider:Landroid/widget/TextView;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockLastRect:Landroid/graphics/Rect;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    iput-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micPopup:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_2
    iput-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micPopup:Landroid/widget/PopupWindow;

    return-void
.end method

.method private final set_state(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[setState] state: "

    invoke-static {v1, p1}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    return-void
.end method

.method private final showHoldPopup()V
    .locals 11

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_composer_default_center_overlap_floating_hold:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$id;->holdToRecordText:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingHoldToRecordText()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingSendOnComplete()Z

    move-result v4

    if-eqz v4, :cond_1

    sget v4, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_hold_to_record_send:I

    goto :goto_0

    :cond_1
    sget v4, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_composer_hold_to_record_save:I

    :goto_0
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingHoldToRecordTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v3

    invoke-static {v1, v3}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingHoldToRecordBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingHoldToRecordBackgroundDrawableTint()Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lio/getstream/chat/android/ui/utils/extensions/DrawableKt;->applyTint(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v0, v1, v3}, Landroid/view/View;->measure(II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    const/4 v7, 0x0

    if-eqz v4, :cond_2

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    iget v8, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    const-string v9, "[showHoldPopup] holdContent.h: "

    const-string v10, " - "

    invoke-static {v4, v8, v9, v10}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v6, v5, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdPopup:Landroid/widget/PopupWindow;

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    new-instance v3, Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v7}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    const/4 v0, -0x1

    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v3, v1}, Landroid/widget/PopupWindow;->setHeight(I)V

    new-instance v0, Landroid/transition/Fade;

    invoke-direct {v0, v4}, Landroid/transition/Fade;-><init>(I)V

    const-wide/16 v5, 0x64

    invoke-virtual {v0, v5, v6}, Landroid/transition/Transition;->setDuration(J)Landroid/transition/Transition;

    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setEnterTransition(Landroid/transition/Transition;)V

    new-instance v0, Landroid/transition/Fade;

    const/4 v8, 0x2

    invoke-direct {v0, v8}, Landroid/transition/Fade;-><init>(I)V

    invoke-virtual {v0, v5, v6}, Landroid/transition/Transition;->setDuration(J)Landroid/transition/Transition;

    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setExitTransition(Landroid/transition/Transition;)V

    new-array v0, v8, [I

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->getRoot()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/view/View;->getLocationInWindow([I)V

    aget v0, v0, v4

    sub-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    const v4, 0x800033

    invoke-virtual {v3, v1, v4, v2, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iput-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdPopup:Landroid/widget/PopupWindow;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdHandler:Landroid/os/Handler;

    invoke-virtual {v0, v7}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdHandler:Landroid/os/Handler;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/g;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/g;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final showHoldPopup$lambda$62(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[showHoldPopup] delayed cancellation"

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdPopup:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_1
    iput-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdPopup:Landroid/widget/PopupWindow;

    return-void
.end method

.method private final showLockPopup()V
    .locals 7

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[showLockPopup] rejected (windowToken is null)"

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[showLockPopup] micBaseRect: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v2, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_composer_default_center_overlap_floating_lock:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.widget.ImageView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingFloatingLockIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingFloatingLockIconDrawableTint()Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/DrawableKt;->applyTint(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Landroid/view/View;->measure(II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    new-instance v5, Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x1

    invoke-virtual {v5, v1}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    invoke-virtual {v5, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    invoke-virtual {v5, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v5, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v3, v3, v2, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    sub-int/2addr v0, v1

    const/16 v1, 0x10

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v2, v1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v1, v0, v2}, Landroid/graphics/Rect;->offset(II)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockLastRect:Landroid/graphics/Rect;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockMoveRect:Landroid/graphics/Rect;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->top:I

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->getRoot()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v1, v1, Landroid/graphics/Rect;->top:I

    const v3, 0x800033

    invoke-virtual {v5, v0, v3, v2, v1}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iput-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    return-void
.end method

.method private final showLockedPopup()V
    .locals 7

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[showLockedPopup] rejected (windowToken is null)"

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[showLockedPopup] micBaseRect: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v2, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_composer_default_center_overlap_floating_locked:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.widget.ImageView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingFloatingLockedIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingFloatingLockedIconDrawableTint()Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/DrawableKt;->applyTint(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Landroid/view/View;->measure(II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    new-instance v5, Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v1, 0x1

    invoke-virtual {v5, v1}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    invoke-virtual {v5, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    invoke-virtual {v5, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v5, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    const/16 v0, 0x10

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    neg-int v0, v0

    const v2, 0x800055

    invoke-virtual {v5, v1, v3, v0, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    iput-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    return-void
.end method

.method private final showMicPopup()V
    .locals 7

    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[showMicPopup] rejected (windowToken is null)"

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micOrigRect:Landroid/graphics/Rect;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[showMicPopup] micOrigRect: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v4, v3, v2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v2, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_composer_default_center_overlap_floating_mic:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.widget.ImageView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingFloatingButtonIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingFloatingButtonIconDrawableTint()Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/DrawableKt;->applyTint(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingFloatingButtonBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingFloatingButtonBackgroundDrawableTint()Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/DrawableKt;->applyTint(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    invoke-virtual {v0, v2, v4}, Landroid/view/View;->measure(II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micPopup:Landroid/widget/PopupWindow;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_3
    new-instance v5, Landroid/widget/PopupWindow;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v5, v3}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    invoke-virtual {v5, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    invoke-virtual {v5, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v5, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v3, v3, v2, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micOrigRect:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micOrigRect:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/Rect;->centerY()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v2, v0, v1}, Landroid/graphics/Rect;->offset(II)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micMoveRect:Landroid/graphics/Rect;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    div-int/lit8 v2, v2, 0x3

    add-int/2addr v2, v1

    iput v2, v0, Landroid/graphics/Rect;->left:I

    goto :goto_0

    :cond_4
    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    div-int/lit8 v2, v2, 0x3

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->left:I

    :goto_0
    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->top:I

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->getRoot()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v1, v1, Landroid/graphics/Rect;->top:I

    const v3, 0x800033

    invoke-virtual {v5, v0, v3, v2, v1}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    iput-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micPopup:Landroid/widget/PopupWindow;

    return-void
.end method

.method private final vibrateDevice(J)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "vibrator_manager"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Llive/hms/video/factories/c;->j(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {v0}, Llive/hms/video/factories/c;->g(Ljava/lang/Object;)Landroid/os/VibratorManager;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/os/VibratorManager;->getDefaultVibrator()Landroid/os/Vibrator;

    move-result-object v2

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Landroid/os/Vibrator;

    invoke-static {v0, v1}, Ls4/c;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Vibrator;

    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/4 v0, -0x1

    invoke-static {p1, p2, v0}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final attachContext(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V
    .locals 2

    const-string v0, "messageComposerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setComposerContext(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setStyle(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingSlider:Landroid/widget/TextView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingSlideToCancelText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingSlider:Landroid/widget/TextView;

    const-string v0, "recordingSlider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingSlideToCancelTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {p1, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingSlider:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingSlideToCancelStartDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setLayoutDirection(I)Z

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingSlideToCancelStartDrawableTint()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/utils/extensions/DrawableKt;->applyTint(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/utils/extensions/TextViewKt;->setStartDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAudioRecordingWaveformColor()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;->setWaveformColor(I)V

    :cond_0
    return-void
.end method

.method public final findViewByKey(Ljava/lang/String;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->findViewByKey(Ljava/lang/String;)Landroid/view/View;

    const/4 p1, 0x0

    return-object p1
.end method

.method public getCompleteButtonClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->completeButtonClickListener:Lc93/a;

    return-object v0
.end method

.method public final getComposerContext()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->composerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "composerContext"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getDeleteButtonClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->deleteButtonClickListener:Lc93/a;

    return-object v0
.end method

.method public getPlaybackButtonClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->playbackButtonClickListener:Lc93/a;

    return-object v0
.end method

.method public getRecordButtonCancelListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->recordButtonCancelListener:Lc93/a;

    return-object v0
.end method

.method public getRecordButtonHoldListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->recordButtonHoldListener:Lc93/a;

    return-object v0
.end method

.method public getRecordButtonLockListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->recordButtonLockListener:Lc93/a;

    return-object v0
.end method

.method public getRecordButtonReleaseListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->recordButtonReleaseListener:Lc93/a;

    return-object v0
.end method

.method public getSliderDragStartListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->sliderDragStartListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getSliderDragStopListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->sliderDragStopListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getStopButtonClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->stopButtonClickListener:Lc93/a;

    return-object v0
.end method

.method public final getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final onAttachedToWindow()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onAttachedToWindow] no args"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onAttachedToWindow] newConfig: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onDetachedFromWindow] no args"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->renderIdle()V

    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    if-nez v0, :cond_1

    instance-of p1, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    sget-object p3, Lb23/g;->y:Lb23/g;

    iget-object p4, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p2, p3, p4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p5

    const-string v0, "[onLayout] w: "

    const-string v1, ", h: "

    invoke-static {p2, p5, v0, v1}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 p5, 0x0

    invoke-interface {p1, p3, p4, p2, p5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onRestoreInstanceState] state: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[onSaveInstanceState] no args"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 16
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "event"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    const/4 v4, 0x0

    const/4 v6, 0x0

    if-nez v3, :cond_0

    instance-of v5, v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    if-nez v5, :cond_0

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v7, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_17

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v3, "[onTouchEvent] rejected ACTION_DOWN (state is not Idle): "

    invoke-static {v3, v2}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v7, v5, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v6

    :cond_0
    const/4 v5, 0x3

    const/4 v7, 0x1

    if-eq v3, v7, :cond_2

    if-ne v3, v5, :cond_1

    goto :goto_0

    :cond_1
    move v8, v6

    goto :goto_1

    :cond_2
    :goto_0
    move v8, v7

    :goto_1
    iget-object v9, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micPopup:Landroid/widget/PopupWindow;

    if-nez v9, :cond_3

    iget-object v9, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    if-eqz v9, :cond_4

    :cond_3
    iget-object v9, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    instance-of v9, v9, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    if-eqz v9, :cond_4

    move v9, v7

    goto :goto_2

    :cond_4
    move v9, v6

    :goto_2
    if-eqz v8, :cond_5

    if-eqz v9, :cond_5

    move v8, v7

    goto :goto_3

    :cond_5
    move v8, v6

    :goto_3
    if-eqz v3, :cond_6

    instance-of v10, v2, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    if-nez v10, :cond_6

    if-nez v8, :cond_6

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v5, v0, Lb23/k;->c:Lb23/e;

    iget-object v7, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v5, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_17

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-static {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;->access$actionToString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v9, "[onTouchEvent] rejected "

    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " (state is not Hold): "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v8, v7, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v6

    :cond_6
    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v8

    iget-object v10, v8, Lb23/k;->c:Lb23/e;

    iget-object v11, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v12, Lb23/g;->x:Lb23/g;

    invoke-interface {v10, v12, v11}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_7

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v13, "[onTouchEvent] state: "

    invoke-direct {v10, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", event: "

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v8, v12, v11, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawX()F

    move-result v2

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    const-wide/16 v10, 0x64

    if-eqz v3, :cond_1c

    if-eq v3, v7, :cond_18

    const/4 v8, 0x2

    if-eq v3, v8, :cond_b

    if-eq v3, v5, :cond_8

    goto/16 :goto_8

    :cond_8
    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[onTouchEvent] ACTION_CANCEL"

    invoke-interface {v0, v5, v3, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    if-eqz v9, :cond_a

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->resetUI()V

    :cond_a
    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getRecordButtonCancelListener()Lc93/a;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return v7

    :cond_b
    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->baseTouch:[F

    aget v5, v3, v6

    sub-float/2addr v2, v5

    float-to-int v2, v2

    aget v3, v3, v7

    sub-float/2addr v0, v3

    float-to-int v0, v0

    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v3

    if-eqz v3, :cond_16

    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_5

    :cond_c
    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micPopup:Landroid/widget/PopupWindow;

    if-eqz v3, :cond_15

    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    if-nez v3, :cond_d

    goto/16 :goto_4

    :cond_d
    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v8, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->z:Lb23/g;

    invoke-interface {v5, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v5, "[onTouchEvent] ACTION_MOVE: offsetX: "

    const-string v10, ", offsetY: "

    invoke-static {v2, v0, v5, v10}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v9, v8, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_e
    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    iget v5, v3, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v5

    iget v3, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v0

    iget-object v8, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    iget-object v9, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micMoveRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->left:I

    invoke-static {v5, v9}, Ljava/lang/Math;->min(II)I

    move-result v5

    iget-object v9, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->left:I

    iget-object v10, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micMoveRect:Landroid/graphics/Rect;

    iget v10, v10, Landroid/graphics/Rect;->left:I

    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v2, v5, v9}, Le93/b;->n(III)I

    move-result v2

    iput v2, v8, Landroid/graphics/Rect;->left:I

    iget-object v2, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    iget-object v5, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micMoveRect:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->top:I

    iget-object v8, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->top:I

    invoke-static {v3, v5, v8}, Le93/b;->n(III)I

    move-result v3

    iput v3, v2, Landroid/graphics/Rect;->top:I

    iget-object v2, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micPopup:Landroid/widget/PopupWindow;

    const/4 v3, -0x1

    if-eqz v2, :cond_f

    iget-object v5, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    iget v8, v5, Landroid/graphics/Rect;->left:I

    iget v5, v5, Landroid/graphics/Rect;->top:I

    invoke-virtual {v2, v8, v5, v3, v3}, Landroid/widget/PopupWindow;->update(IIII)V

    :cond_f
    iget-object v2, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockBaseRect:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v2

    iget-object v5, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockLastRect:Landroid/graphics/Rect;

    iget-object v8, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockMoveRect:Landroid/graphics/Rect;

    iget v8, v8, Landroid/graphics/Rect;->top:I

    invoke-static {v0, v8, v2}, Le93/b;->n(III)I

    move-result v0

    iput v0, v5, Landroid/graphics/Rect;->top:I

    iget-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockPopup:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_10

    iget-object v2, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->lockLastRect:Landroid/graphics/Rect;

    iget v5, v2, Landroid/graphics/Rect;->left:I

    iget v2, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0, v5, v2, v3, v3}, Landroid/widget/PopupWindow;->update(IIII)V

    :cond_10
    iget-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    iget v0, v0, Landroid/graphics/Rect;->left:I

    iget-object v2, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micMoveRect:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    iget-object v2, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v0

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v5, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->E:Lb23/g;

    invoke-interface {v3, v8, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_11

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    iget-object v9, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    iget v9, v9, Landroid/graphics/Rect;->left:I

    sub-int/2addr v3, v9

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "[onMove] progress: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v10, ", diff: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v8, v5, v3, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_11
    iget-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingSlider:Landroid/widget/TextView;

    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    iget-object v5, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micBaseRect:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->left:I

    int-to-float v5, v5

    sub-float/2addr v3, v5

    invoke-virtual {v0, v3}, Landroid/view/View;->setTranslationX(F)V

    iget-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingSlider:Landroid/widget/TextView;

    int-to-float v3, v7

    const/high16 v5, 0x3fc00000    # 1.5f

    mul-float/2addr v2, v5

    sub-float/2addr v3, v2

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micMoveRect:Landroid/graphics/Rect;

    iget v5, v3, Landroid/graphics/Rect;->left:I

    if-ne v2, v5, :cond_13

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v8, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_12

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v2, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micLastRect:Landroid/graphics/Rect;

    iget-object v5, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micMoveRect:Landroid/graphics/Rect;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v9, "[onMove] cancelled; micLastRect: "

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", micMoveRect: "

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v8, v3, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_12
    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->renderIdle()V

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getRecordButtonCancelListener()Lc93/a;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return v6

    :cond_13
    iget v0, v0, Landroid/graphics/Rect;->top:I

    iget v2, v3, Landroid/graphics/Rect;->top:I

    if-ne v0, v2, :cond_23

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v8, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[onMove] locked"

    invoke-interface {v0, v8, v3, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_14
    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getRecordButtonLockListener()Lc93/a;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return v6

    :cond_15
    :goto_4
    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v12, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_17

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[onTouchEvent] ACTION_MOVE rejected (no popups 2)"

    invoke-interface {v0, v12, v3, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v6

    :cond_16
    :goto_5
    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v12, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_17

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v2, "[onTouchEvent] ACTION_MOVE rejected (no popups 1)"

    invoke-interface {v0, v12, v3, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_17
    return v6

    :cond_18
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v5, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdStartTime:J

    sub-long/2addr v2, v5

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v5, v0, Lb23/k;->c:Lb23/e;

    iget-object v6, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v8, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_19

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v5, "[onTouchEvent] ACTION_UP ("

    const-string v12, ")"

    invoke-static {v2, v3, v5, v12}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v8, v6, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_19
    invoke-direct {v1, v10, v11}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->vibrateDevice(J)V

    const-wide/16 v4, 0x3e8

    cmp-long v0, v2, v4

    if-lez v0, :cond_1a

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getRecordButtonReleaseListener()Lc93/a;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return v7

    :cond_1a
    if-eqz v9, :cond_1b

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->resetUI()V

    :cond_1b
    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->showHoldPopup()V

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getRecordButtonCancelListener()Lc93/a;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return v7

    :cond_1c
    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v8, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->z:Lb23/g;

    invoke-interface {v5, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1d

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v5, "[onTouchEvent] ACTION_DOWN"

    invoke-interface {v3, v9, v8, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1d
    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const-string v8, "getContext(...)"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->isGrantedAudioRecordPermission(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_1e

    iget-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->permissionChecker:Lio/getstream/chat/android/ui/utils/PermissionChecker;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/ui/utils/PermissionChecker;->checkAudioRecordPermissions$default(Lio/getstream/chat/android/ui/utils/PermissionChecker;Landroid/view/View;Lc93/a;Lc93/a;ILjava/lang/Object;)V

    return v6

    :cond_1e
    iget v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getComposerContext()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getContent()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;

    move-result-object v5

    invoke-interface {v5}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;->asView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->parentWidth:I

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v5, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_message_composer_center_content_height:I

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    iput v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getComposerContext()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getContent()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;

    move-result-object v3

    invoke-static {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainerKt;->findRecordAudioButton(Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_21

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getComposerContext()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getContent()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;

    move-result-object v3

    invoke-interface {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;->getTrailing()Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    move-result-object v3

    if-eqz v3, :cond_1f

    invoke-static {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentKt;->asView(Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_1f

    sget v5, Lio/getstream/chat/android/ui/R$id;->recordAudioButton:I

    invoke-virtual {v3, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    goto :goto_6

    :cond_1f
    move-object v3, v4

    :goto_6
    if-eqz v3, :cond_20

    goto :goto_7

    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "recordAudioButton not found"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    :goto_7
    iget-object v5, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->micOrigRect:Landroid/graphics/Rect;

    invoke-static {v3, v5}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContentKt;->access$getRectInWindow(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v8, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->E:Lb23/g;

    invoke-interface {v5, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_22

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    iget v5, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->centerContentHeight:I

    invoke-static {}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->displayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v12

    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    invoke-static {}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->displayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v13

    iget v13, v13, Landroid/util/DisplayMetrics;->widthPixels:I

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "[onTouchEvent] centerContentHeight: "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", "

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v9, v8, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_22
    iget-object v3, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->baseTouch:[F

    aput v2, v3, v6

    aput v0, v3, v7

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iput-wide v2, v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->holdStartTime:J

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->showMicPopup()V

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->showLockPopup()V

    invoke-direct {v1, v10, v11}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->vibrateDevice(J)V

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getRecordButtonHoldListener()Lc93/a;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_23
    :goto_8
    return v7
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 4

    const-string v0, "changedView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    const/4 p1, 0x0

    if-nez p2, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v1, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    const-string v3, "[onVisibilityChanged] VISIBLE; state: "

    invoke-static {v3, v0}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v2, v1, v0, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v1, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->_state:Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    const-string v3, "[onVisibilityChanged] NOT_VISIBLE; state: "

    invoke-static {v3, v0}, Lhc3/i;->d(Ljava/lang/String;Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v2, v1, v0, p1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public final renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V
    .locals 7

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getRecording()Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    move-result-object p1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-interface {v4}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "[renderState] measuredHeight: "

    const-string v6, ", recordingState: "

    invoke-static {v1, v5, v6, v4}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->renderHold(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Hold;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->renderLocked(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Locked;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->renderOverview(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Overview;)V

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Complete;

    if-eqz v0, :cond_4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->renderComplete()V

    goto :goto_0

    :cond_4
    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->renderIdle()V

    :goto_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->set_state(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public setCompleteButtonClickListener(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->completeButtonClickListener:Lc93/a;

    return-void
.end method

.method public final setComposerContext(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->composerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    return-void
.end method

.method public setDeleteButtonClickListener(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->deleteButtonClickListener:Lc93/a;

    return-void
.end method

.method public setPlaybackButtonClickListener(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->playbackButtonClickListener:Lc93/a;

    return-void
.end method

.method public setRecordButtonCancelListener(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->recordButtonCancelListener:Lc93/a;

    return-void
.end method

.method public setRecordButtonHoldListener(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->recordButtonHoldListener:Lc93/a;

    return-void
.end method

.method public setRecordButtonLockListener(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->recordButtonLockListener:Lc93/a;

    return-void
.end method

.method public setRecordButtonReleaseListener(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->recordButtonReleaseListener:Lc93/a;

    return-void
.end method

.method public setSliderDragStartListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->sliderDragStartListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public setSliderDragStopListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->sliderDragStopListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public setStopButtonClickListener(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->stopButtonClickListener:Lc93/a;

    return-void
.end method

.method public final setStyle(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    return-void
.end method
