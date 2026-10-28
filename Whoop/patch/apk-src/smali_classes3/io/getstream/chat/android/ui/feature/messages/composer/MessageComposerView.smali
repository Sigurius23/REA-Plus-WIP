.class public final Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView$SuggestionPopupTouchListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001:\u0002\u00b7\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000cH\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J/\u0010\u001c\u001a\u00020\u000e\"\u000c\u0008\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u000e\"\u000c\u0008\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ/\u0010\u001f\u001a\u00020\u000e\"\u000c\u0008\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ/\u0010 \u001a\u00020\u000e\"\u000c\u0008\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\u0008 \u0010\u001dJ/\u0010!\u001a\u00020\u000e\"\u000c\u0008\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\u0008!\u0010\u001dJ/\u0010\"\u001a\u00020\u000e\"\u000c\u0008\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u00002\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\u0008\"\u0010\u001dJ#\u0010#\u001a\u00020\u000e\"\u000c\u0008\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0000\u00a2\u0006\u0004\u0008#\u0010$J#\u0010%\u001a\u00020\u000e\"\u000c\u0008\u0000\u0010\u0018*\u00020\u0016*\u00020\u00172\u0006\u0010\u0019\u001a\u00028\u0000\u00a2\u0006\u0004\u0008%\u0010$J\u000f\u0010&\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008&\u0010\'J\u001b\u0010(\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008(\u0010)J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008*\u0010\u0015J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008+\u0010\u0015J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008,\u0010\u0015J!\u0010-\u001a\u00028\u0000\"\u000c\u0008\u0000\u0010\u0018*\u00020\u0016*\u00020\u0017*\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\r\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u00080\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106R\u0016\u00108\u001a\u00020/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR(\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR.\u0010L\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008L\u0010M\u001a\u0004\u0008N\u0010O\"\u0004\u0008P\u0010QR4\u0010T\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020S0R\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008T\u0010M\u001a\u0004\u0008U\u0010O\"\u0004\u0008V\u0010QR.\u0010X\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008X\u0010M\u001a\u0004\u0008Y\u0010O\"\u0004\u0008Z\u0010QR.\u0010[\u001a\u000e\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008[\u0010M\u001a\u0004\u0008\\\u0010O\"\u0004\u0008]\u0010QR.\u0010_\u001a\u000e\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008_\u0010M\u001a\u0004\u0008`\u0010O\"\u0004\u0008a\u0010QR.\u0010c\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008c\u0010M\u001a\u0004\u0008d\u0010O\"\u0004\u0008e\u0010QR.\u0010f\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008f\u0010M\u001a\u0004\u0008g\u0010O\"\u0004\u0008h\u0010QR(\u0010i\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008i\u0010E\u001a\u0004\u0008j\u0010G\"\u0004\u0008k\u0010IR(\u0010l\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008l\u0010E\u001a\u0004\u0008m\u0010G\"\u0004\u0008n\u0010IR(\u0010o\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008o\u0010E\u001a\u0004\u0008p\u0010G\"\u0004\u0008q\u0010IR.\u0010t\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020s0J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008t\u0010M\u001a\u0004\u0008u\u0010O\"\u0004\u0008v\u0010QR(\u0010w\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008w\u0010E\u001a\u0004\u0008x\u0010G\"\u0004\u0008y\u0010IR\u0016\u0010z\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R.\u0010}\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020/0J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008}\u0010M\u001a\u0004\u0008~\u0010O\"\u0004\u0008\u007f\u0010QR,\u0010\u0080\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0080\u0001\u0010E\u001a\u0005\u0008\u0081\u0001\u0010G\"\u0005\u0008\u0082\u0001\u0010IR,\u0010\u0083\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0083\u0001\u0010E\u001a\u0005\u0008\u0084\u0001\u0010G\"\u0005\u0008\u0085\u0001\u0010IR,\u0010\u0086\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0086\u0001\u0010E\u001a\u0005\u0008\u0087\u0001\u0010G\"\u0005\u0008\u0088\u0001\u0010IR,\u0010\u0089\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0089\u0001\u0010E\u001a\u0005\u0008\u008a\u0001\u0010G\"\u0005\u0008\u008b\u0001\u0010IR,\u0010\u008c\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u008c\u0001\u0010E\u001a\u0005\u0008\u008d\u0001\u0010G\"\u0005\u0008\u008e\u0001\u0010IR,\u0010\u008f\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u008f\u0001\u0010E\u001a\u0005\u0008\u0090\u0001\u0010G\"\u0005\u0008\u0091\u0001\u0010IR,\u0010\u0092\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0092\u0001\u0010E\u001a\u0005\u0008\u0093\u0001\u0010G\"\u0005\u0008\u0094\u0001\u0010IR,\u0010\u0095\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000e0C8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0095\u0001\u0010E\u001a\u0005\u0008\u0096\u0001\u0010G\"\u0005\u0008\u0097\u0001\u0010IR3\u0010\u0099\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u0099\u0001\u0010M\u001a\u0005\u0008\u009a\u0001\u0010O\"\u0005\u0008\u009b\u0001\u0010QR3\u0010\u009c\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0098\u0001\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0015\n\u0005\u0008\u009c\u0001\u0010M\u001a\u0005\u0008\u009d\u0001\u0010O\"\u0005\u0008\u009e\u0001\u0010QR\u001c\u0010\u00a0\u0001\u001a\u0005\u0018\u00010\u009f\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R!\u0010\u00a2\u0001\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010R8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001R!\u0010\u00a4\u0001\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010R8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a4\u0001\u0010\u00a3\u0001R\u001f\u0010\u00a8\u0001\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u00a5\u0001\u00104\u001a\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R\u001b\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00a9\u0001\u0010\u00aa\u0001R\u001f\u0010\u00ad\u0001\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u00ab\u0001\u00104\u001a\u0006\u0008\u00ac\u0001\u0010\u00a7\u0001R\u001b\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00ae\u0001\u0010\u00aa\u0001R\u0018\u0010\u00b2\u0001\u001a\u00030\u00af\u00018@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001R\u0017\u0010\u00b4\u0001\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b3\u0001\u0010\u00a7\u0001R\u0017\u0010\u00b6\u0001\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00b5\u0001\u0010\u00a7\u0001\u00a8\u0006\u00b8\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
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
        "Landroid/os/Parcelable;",
        "state",
        "Ll83/a0;",
        "onRestoreInstanceState",
        "(Landroid/os/Parcelable;)V",
        "onSaveInstanceState",
        "()Landroid/os/Parcelable;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;",
        "renderState",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V",
        "Landroid/view/View;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
        "V",
        "contentView",
        "Landroid/widget/FrameLayout$LayoutParams;",
        "layoutParams",
        "setLeadingContent",
        "(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V",
        "setCenterContent",
        "setTrailingContent",
        "setFooterContent",
        "setHeaderContent",
        "setCenterOverlapContent",
        "setMentionSuggestionsContent",
        "(Landroid/view/View;)V",
        "setCommandSuggestionsContent",
        "onDetachedFromWindow",
        "()V",
        "init",
        "(Landroid/util/AttributeSet;)V",
        "renderSuggestion",
        "renderCommandsSuggestions",
        "renderMentionSuggestions",
        "attachContext",
        "(Landroid/view/View;)Landroid/view/View;",
        "",
        "arePollsEnabled",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)Z",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "arePollEnabled",
        "Z",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;",
        "messageComposerContext",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;",
        "validationErrorRenderer",
        "Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;",
        "Lkotlin/Function0;",
        "sendMessageButtonClickListener",
        "Lc93/a;",
        "getSendMessageButtonClickListener",
        "()Lc93/a;",
        "setSendMessageButtonClickListener",
        "(Lc93/a;)V",
        "Lkotlin/Function1;",
        "",
        "textInputChangeListener",
        "Lkotlin/jvm/functions/Function1;",
        "getTextInputChangeListener",
        "()Lkotlin/jvm/functions/Function1;",
        "setTextInputChangeListener",
        "(Lkotlin/jvm/functions/Function1;)V",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachmentSelectionListener",
        "getAttachmentSelectionListener",
        "setAttachmentSelectionListener",
        "Lio/getstream/chat/android/models/CreatePollParams;",
        "pollSubmissionListener",
        "getPollSubmissionListener",
        "setPollSubmissionListener",
        "attachmentRemovalListener",
        "getAttachmentRemovalListener",
        "setAttachmentRemovalListener",
        "Lio/getstream/chat/android/models/User;",
        "mentionSelectionListener",
        "getMentionSelectionListener",
        "setMentionSelectionListener",
        "Lio/getstream/chat/android/models/Command;",
        "commandSelectionListener",
        "getCommandSelectionListener",
        "setCommandSelectionListener",
        "alsoSendToChannelSelectionListener",
        "getAlsoSendToChannelSelectionListener",
        "setAlsoSendToChannelSelectionListener",
        "dismissActionClickListener",
        "getDismissActionClickListener",
        "setDismissActionClickListener",
        "commandsButtonClickListener",
        "getCommandsButtonClickListener",
        "setCommandsButtonClickListener",
        "dismissSuggestionsListener",
        "getDismissSuggestionsListener",
        "setDismissSuggestionsListener",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;",
        "attachmentsPickerDialogBuilder",
        "getAttachmentsPickerDialogBuilder",
        "setAttachmentsPickerDialogBuilder",
        "attachmentsButtonClickListener",
        "getAttachmentsButtonClickListener",
        "setAttachmentsButtonClickListener",
        "maxOffset",
        "I",
        "Landroid/view/MotionEvent;",
        "audioRecordButtonTouchListener",
        "getAudioRecordButtonTouchListener",
        "setAudioRecordButtonTouchListener",
        "audioRecordButtonHoldListener",
        "getAudioRecordButtonHoldListener",
        "setAudioRecordButtonHoldListener",
        "audioRecordButtonLockListener",
        "getAudioRecordButtonLockListener",
        "setAudioRecordButtonLockListener",
        "audioRecordButtonCancelListener",
        "getAudioRecordButtonCancelListener",
        "setAudioRecordButtonCancelListener",
        "audioRecordButtonReleaseListener",
        "getAudioRecordButtonReleaseListener",
        "setAudioRecordButtonReleaseListener",
        "audioDeleteButtonClickListener",
        "getAudioDeleteButtonClickListener",
        "setAudioDeleteButtonClickListener",
        "audioStopButtonClickListener",
        "getAudioStopButtonClickListener",
        "setAudioStopButtonClickListener",
        "audioPlaybackButtonClickListener",
        "getAudioPlaybackButtonClickListener",
        "setAudioPlaybackButtonClickListener",
        "audioCompleteButtonClickListener",
        "getAudioCompleteButtonClickListener",
        "setAudioCompleteButtonClickListener",
        "",
        "audioSliderDragStartListener",
        "getAudioSliderDragStartListener",
        "setAudioSliderDragStartListener",
        "audioSliderDragStopListener",
        "getAudioSliderDragStopListener",
        "setAudioSliderDragStopListener",
        "Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;",
        "suggestionsPopup",
        "Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;",
        "commandSuggestions",
        "Ljava/util/List;",
        "mentionSuggestions",
        "defaultMentionSuggestionsView$delegate",
        "getDefaultMentionSuggestionsView",
        "()Landroid/view/View;",
        "defaultMentionSuggestionsView",
        "mentionSuggestionsContentOverride",
        "Landroid/view/View;",
        "defaultCommandSuggestionsView$delegate",
        "getDefaultCommandSuggestionsView",
        "defaultCommandSuggestionsView",
        "commandSuggestionsContentOverride",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "getComposerStyle$stream_chat_android_ui_components_release",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "composerStyle",
        "getMentionSuggestionsContent",
        "mentionSuggestionsContent",
        "getCommandSuggestionsContent",
        "commandSuggestionsContent",
        "SuggestionPopupTouchListener",
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
.field public static final synthetic w:I


# instance fields
.field private alsoSendToChannelSelectionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private arePollEnabled:Z

.field private attachmentRemovalListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private attachmentSelectionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private attachmentsButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private attachmentsPickerDialogBuilder:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private audioCompleteButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioDeleteButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioPlaybackButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioRecordButtonCancelListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioRecordButtonHoldListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioRecordButtonLockListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioRecordButtonReleaseListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private audioRecordButtonTouchListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private audioSliderDragStartListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private audioSliderDragStopListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private audioStopButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

.field private commandSelectionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private commandSuggestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Command;",
            ">;"
        }
    .end annotation
.end field

.field private commandSuggestionsContentOverride:Landroid/view/View;

.field private commandsButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final defaultCommandSuggestionsView$delegate:Ll83/h;

.field private final defaultMentionSuggestionsView$delegate:Ll83/h;

.field private dismissActionClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private dismissSuggestionsListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private maxOffset:I

.field private mentionSelectionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private mentionSuggestions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;"
        }
    .end annotation
.end field

.field private mentionSuggestionsContentOverride:Landroid/view/View;

.field private messageComposerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

.field private pollSubmissionListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private sendMessageButtonClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

.field private textInputChangeListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private validationErrorRenderer:Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    const-string p1, "Chat:MsgComposerView"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->logger$delegate:Ll83/h;

    .line 6
    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x16

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->sendMessageButtonClickListener:Lc93/a;

    .line 7
    new-instance p1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 p3, 0xd

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->textInputChangeListener:Lkotlin/jvm/functions/Function1;

    .line 8
    new-instance p1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 p3, 0xf

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentSelectionListener:Lkotlin/jvm/functions/Function1;

    .line 9
    new-instance p1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 p3, 0x10

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->pollSubmissionListener:Lkotlin/jvm/functions/Function1;

    .line 10
    new-instance p1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 p3, 0x11

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    .line 11
    new-instance p1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 p3, 0x12

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->mentionSelectionListener:Lkotlin/jvm/functions/Function1;

    .line 12
    new-instance p1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 p3, 0x13

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    .line 13
    new-instance p1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 p3, 0x14

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->alsoSendToChannelSelectionListener:Lkotlin/jvm/functions/Function1;

    .line 14
    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x16

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissActionClickListener:Lc93/a;

    .line 15
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 p3, 0x9

    invoke-direct {p1, p0, p3}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandsButtonClickListener:Lc93/a;

    .line 16
    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x16

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissSuggestionsListener:Lc93/a;

    .line 17
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/4 p3, 0x4

    invoke-direct {p1, p0, p3}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsPickerDialogBuilder:Lkotlin/jvm/functions/Function1;

    .line 18
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/4 p3, 0x5

    invoke-direct {p1, p0, p3}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsButtonClickListener:Lc93/a;

    .line 19
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    invoke-direct {p1, p0, p3}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonTouchListener:Lkotlin/jvm/functions/Function1;

    .line 20
    new-instance p1, Lio/getstream/chat/android/client/k;

    const/16 p3, 0x16

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonHoldListener:Lc93/a;

    .line 21
    new-instance p1, Lio/getstream/chat/android/client/k;

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonLockListener:Lc93/a;

    .line 22
    new-instance p1, Lio/getstream/chat/android/client/k;

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonCancelListener:Lc93/a;

    .line 23
    new-instance p1, Lio/getstream/chat/android/client/k;

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonReleaseListener:Lc93/a;

    .line 24
    new-instance p1, Lio/getstream/chat/android/client/k;

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioDeleteButtonClickListener:Lc93/a;

    .line 25
    new-instance p1, Lio/getstream/chat/android/client/k;

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioStopButtonClickListener:Lc93/a;

    .line 26
    new-instance p1, Lio/getstream/chat/android/client/k;

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioPlaybackButtonClickListener:Lc93/a;

    .line 27
    new-instance p1, Lio/getstream/chat/android/client/k;

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/k;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioCompleteButtonClickListener:Lc93/a;

    .line 28
    new-instance p1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 p3, 0xe

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioSliderDragStartListener:Lkotlin/jvm/functions/Function1;

    .line 29
    new-instance p1, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioSliderDragStopListener:Lkotlin/jvm/functions/Function1;

    .line 30
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/4 p3, 0x6

    invoke-direct {p1, p0, p3}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->defaultMentionSuggestionsView$delegate:Ll83/h;

    .line 31
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/4 p3, 0x7

    invoke-direct {p1, p0, p3}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->defaultCommandSuggestionsView$delegate:Ll83/h;

    .line 32
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static A(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonHoldListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static B(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandsButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic C(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->defaultMentionSuggestionsView_delegate$lambda$32$lambda$31$lambda$30(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/User;)Ll83/a0;

    return-void
.end method

.method public static synthetic D(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/User;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setMentionSuggestionsContent$lambda$80(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/User;)Ll83/a0;

    return-void
.end method

.method public static E(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissActionClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static F(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonCancelListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic G(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->init$lambda$41$lambda$40(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Attachment;)Ll83/a0;

    return-void
.end method

.method public static synthetic H(Lio/getstream/chat/android/models/CreatePollParams;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->pollSubmissionListener$lambda$3(Lio/getstream/chat/android/models/CreatePollParams;)Ll83/a0;

    return-void
.end method

.method public static synthetic I(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCommandSuggestionsContent;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->defaultCommandSuggestionsView_delegate$lambda$35(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCommandSuggestionsContent;

    move-result-object p0

    return-object p0
.end method

.method public static J(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioPlaybackButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic K(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->init$lambda$59$lambda$57(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)Ll83/a0;

    return-void
.end method

.method public static L(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonLockListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static M(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioStopButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static N(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioDeleteButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static O(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonCancelListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic P(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/CreatePollParams;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsPickerDialogBuilder$lambda$15$lambda$14$lambda$13(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/CreatePollParams;)V

    return-void
.end method

.method public static synthetic Q(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setCenterOverlapContent$lambda$79(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)Ll83/a0;

    return-void
.end method

.method public static synthetic R(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Command;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setCommandSuggestionsContent$lambda$81(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Command;)Ll83/a0;

    return-void
.end method

.method public static synthetic S(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonTouchListener$lambda$19(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)Z

    return-void
.end method

.method public static synthetic T(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->init$lambda$44$lambda$43(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic U(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Z)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setFooterContent$lambda$68(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Z)Ll83/a0;

    return-void
.end method

.method public static V(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonReleaseListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static W(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioStopButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic X(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->init$lambda$59$lambda$58(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)Ll83/a0;

    return-void
.end method

.method public static Y(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonHoldListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic Z(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setCenterContent$lambda$64(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/lang/String;)Ll83/a0;

    return-void
.end method

.method public static synthetic a0(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->textInputChangeListener$lambda$1(Ljava/lang/String;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    return-object p0
.end method

.method public static final synthetic access$getSuggestionsPopup$p(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    return-object p0
.end method

.method private static final alsoSendToChannelSelectionListener$lambda$7(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final arePollsEnabled(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)Z
    .locals 1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getMessageMode()Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$Normal;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getPollsEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getOwnCapabilities()Ljava/util/Set;

    move-result-object p1

    const-string v0, "send-poll"

    invoke-interface {p1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final attachContext(Landroid/view/View;)Landroid/view/View;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;)TV;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->messageComposerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->attachContext(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V

    return-object p1

    :cond_0
    const-string p1, "messageComposerContext"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method private static final attachmentRemovalListener$lambda$4(Lio/getstream/chat/android/models/Attachment;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final attachmentSelectionListener$lambda$2(Ljava/util/List;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final attachmentsButtonClickListener$lambda$17(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 57

    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getFragmentManager(Landroid/content/Context;)Landroidx/fragment/app/o1;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v2, v0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsPickerDialogBuilder:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->messageComposerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    const/4 v4, 0x0

    const-string v5, "messageComposerContext"

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAttachmentsPickerDialogStyle()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    move-result-object v6

    iget-boolean v3, v0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->arePollEnabled:Z

    if-eqz v3, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->messageComposerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getAttachmentsPickerDialogStyle()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getPollAttachmentsTabEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    move/from16 v47, v0

    goto :goto_1

    :cond_0
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/16 v55, 0x7eff

    const/16 v56, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, -0x1

    invoke-static/range {v6 .. v56}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->copy$default(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;ZZILio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;ZLio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Lio/getstream/chat/android/ui/font/TextStyle;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;IZLandroid/graphics/drawable/Drawable;ZLandroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/PickerMediaMode;ZLio/getstream/chat/android/ui/common/permissions/VisualMediaType;IILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    move-result-object v0

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    const-string v2, "attachment_dialog_fragment"

    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_3
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final attachmentsPickerDialogBuilder$lambda$15(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$Companion;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$Companion;->newInstance$default(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$Companion;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;Ljava/util/List;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/c;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/c;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->setAttachmentsSelectionListener(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$AttachmentsSelectionListener;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/c;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/c;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;->setPollSubmissionListener(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment$PollSubmissionListener;)V

    return-object p1
.end method

.method private static final attachmentsPickerDialogBuilder$lambda$15$lambda$14$lambda$12(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/util/List;)V
    .locals 1

    const-string v0, "attachments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentSelectionListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final attachmentsPickerDialogBuilder$lambda$15$lambda$14$lambda$13(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/CreatePollParams;)V
    .locals 1

    const-string v0, "pollConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->pollSubmissionListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final audioCompleteButtonClickListener$lambda$27()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final audioDeleteButtonClickListener$lambda$24()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final audioPlaybackButtonClickListener$lambda$26()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final audioRecordButtonCancelListener$lambda$22()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final audioRecordButtonHoldListener$lambda$20()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final audioRecordButtonLockListener$lambda$21()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final audioRecordButtonReleaseListener$lambda$23()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final audioRecordButtonTouchListener$lambda$19(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)Z
    .locals 7

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->maxOffset:I

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[onMicBtnTouchListener] event("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "): "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz p0, :cond_2

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->centerOverlapContent:Landroid/widget/FrameLayout;

    const-string v0, "centerOverlapContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lh5/r0;

    invoke-direct {v0, p0}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v0}, Lh5/r0;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {v0}, Lh5/r0;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p0, 0x1

    return p0

    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Sequence is empty."

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4
.end method

.method private static final audioSliderDragStartListener$lambda$28(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final audioSliderDragStopListener$lambda$29(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final audioStopButtonClickListener$lambda$25()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static b0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonReleaseListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static c0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonLockListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final commandSelectionListener$lambda$6(Lio/getstream/chat/android/models/Command;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final commandsButtonClickListener$lambda$10(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getLogger()Lb23/k;

    move-result-object p0

    iget-object v0, p0, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->y:Lb23/g;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    const-string v0, "[onCommandsButtonClick] no args"

    const/4 v3, 0x0

    invoke-interface {p0, v1, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic d0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setTrailingContent$lambda$67(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final defaultCommandSuggestionsView_delegate$lambda$35(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCommandSuggestionsContent;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCommandSuggestionsContent;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCommandSuggestionsContent;-><init>(Landroid/content/Context;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/4 v2, 0x7

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCommandSuggestionsContent;->setCommandSelectionListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachContext(Landroid/view/View;)Landroid/view/View;

    return-object v0
.end method

.method private static final defaultCommandSuggestionsView_delegate$lambda$35$lambda$34$lambda$33(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Command;)Ll83/a0;
    .locals 1

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final defaultMentionSuggestionsView_delegate$lambda$32(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerMentionSuggestionsContent;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerMentionSuggestionsContent;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerMentionSuggestionsContent;-><init>(Landroid/content/Context;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerMentionSuggestionsContent;->setMentionSelectionListener(Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachContext(Landroid/view/View;)Landroid/view/View;

    return-object v0
.end method

.method private static final defaultMentionSuggestionsView_delegate$lambda$32$lambda$31$lambda$30(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/User;)Ll83/a0;
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->mentionSelectionListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final dismissActionClickListener$lambda$8()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final dismissSuggestionsListener$lambda$11()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static e0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioPlaybackButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsPickerDialogBuilder$lambda$15$lambda$14$lambda$12(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic f0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Command;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->defaultCommandSuggestionsView_delegate$lambda$35$lambda$34$lambda$33(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Command;)Ll83/a0;

    return-void
.end method

.method public static g0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandsButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final getCommandSuggestionsContent()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandSuggestionsContentOverride:Landroid/view/View;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getDefaultCommandSuggestionsView()Landroid/view/View;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private final getDefaultCommandSuggestionsView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->defaultCommandSuggestionsView$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getDefaultMentionSuggestionsView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->defaultMentionSuggestionsView$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getMentionSuggestionsContent()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->mentionSuggestionsContentOverride:Landroid/view/View;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getDefaultMentionSuggestionsView()Landroid/view/View;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public static synthetic h0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setCenterContent$lambda$65(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Attachment;)Ll83/a0;

    return-void
.end method

.method public static synthetic i0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Z)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->init$lambda$46$lambda$45(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Z)Ll83/a0;

    return-void
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 6

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;-><init>(Landroid/content/Context;Landroid/view/View;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->validationErrorRenderer:Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle$Companion;->invoke$stream_chat_android_ui_components_release(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object p1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    const-string v3, "binding"

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;

    invoke-direct {v5, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewKt$asContentContainer$1;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;)V

    invoke-direct {v0, p1, v5}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContentContainer;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->messageComposerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getBackgroundColor()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->separator:Landroid/view/View;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->messageComposerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getDividerBackgroundDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;-><init>(Landroid/content/Context;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v1, 0xb

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;->setAttachmentsButtonClickListener(Lc93/a;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v1, 0x13

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerLeadingContent;->setCommandsButtonClickListener(Lc93/a;)V

    const/4 v0, 0x2

    invoke-static {p0, p1, v4, v0, v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setLeadingContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;-><init>(Landroid/content/Context;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/16 v3, 0xb

    invoke-direct {v1, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->setTextInputChangeListener(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/16 v3, 0xc

    invoke-direct {v1, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerCenterContent;->setAttachmentRemovalListener(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0, p1, v4, v0, v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setCenterContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerTrailingContent;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerTrailingContent;-><init>(Landroid/content/Context;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v3, 0x15

    invoke-direct {v1, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerTrailingContent;->setSendMessageButtonClickListener(Lc93/a;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/16 v3, 0xd

    invoke-direct {v1, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerTrailingContent;->setRecordAudioButtonTouchListener(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0, p1, v4, v0, v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setTrailingContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerFooterContent;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerFooterContent;-><init>(Landroid/content/Context;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/16 v3, 0xe

    invoke-direct {v1, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerFooterContent;->setAlsoSendToChannelSelectionListener(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0, p1, v4, v0, v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setFooterContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;-><init>(Landroid/content/Context;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v3, 0x16

    invoke-direct {v1, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->setDismissActionClickListener(Lc93/a;)V

    invoke-static {p0, p1, v4, v0, v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setHeaderContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;-><init>(Landroid/content/Context;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v2, 0x17

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setRecordButtonHoldListener(Lc93/a;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v2, 0x18

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setRecordButtonLockListener(Lc93/a;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v2, 0xd

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setRecordButtonCancelListener(Lc93/a;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v2, 0xe

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setRecordButtonReleaseListener(Lc93/a;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v2, 0xf

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setDeleteButtonClickListener(Lc93/a;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v2, 0x10

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setStopButtonClickListener(Lc93/a;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v2, 0x11

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setPlaybackButtonClickListener(Lc93/a;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v2, 0x12

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setCompleteButtonClickListener(Lc93/a;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/16 v2, 0x9

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setSliderDragStartListener(Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/16 v2, 0xa

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerOverlappingContent;->setSliderDragStopListener(Lkotlin/jvm/functions/Function1;)V

    invoke-static {p0, p1, v4, v0, v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setCenterOverlapContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    return-void

    :cond_0
    const-string p1, "messageComposerContext"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v4
.end method

.method public static synthetic init$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/util/AttributeSet;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private static final init$lambda$38$lambda$36(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$38$lambda$37(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandsButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$41$lambda$39(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->textInputChangeListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$41$lambda$40(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Attachment;)Ll83/a0;
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$44$lambda$42(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->sendMessageButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$44$lambda$43(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonTouchListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final init$lambda$46$lambda$45(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Z)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->alsoSendToChannelSelectionListener:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$48$lambda$47(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissActionClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$59$lambda$49(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonHoldListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$59$lambda$50(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonLockListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$59$lambda$51(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonCancelListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$59$lambda$52(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonReleaseListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$59$lambda$53(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioDeleteButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$59$lambda$54(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioStopButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$59$lambda$55(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioPlaybackButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$59$lambda$56(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioCompleteButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$59$lambda$57(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioSliderDragStartListener:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final init$lambda$59$lambda$58(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioSliderDragStopListener:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static j(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->sendMessageButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static j0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioCompleteButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic k(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsPickerDialogBuilder$lambda$15(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogFragment;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Lio/getstream/chat/android/models/Command;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandSelectionListener$lambda$6(Lio/getstream/chat/android/models/Command;)Ll83/a0;

    return-void
.end method

.method public static l(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioCompleteButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic l0(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->init$lambda$41$lambda$39(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/lang/String;)Ll83/a0;

    return-void
.end method

.method public static synthetic m(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandsButtonClickListener$lambda$10(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;

    return-void
.end method

.method private static final mentionSelectionListener$lambda$5(Lio/getstream/chat/android/models/User;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic n(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsButtonClickListener$lambda$17(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;

    return-void
.end method

.method public static synthetic o(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setCenterOverlapContent$lambda$78(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)Ll83/a0;

    return-void
.end method

.method public static synthetic p(Ljava/util/List;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentSelectionListener$lambda$2(Ljava/util/List;)Ll83/a0;

    return-void
.end method

.method private static final pollSubmissionListener$lambda$3(Lio/getstream/chat/android/models/CreatePollParams;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static q(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissSuggestionsListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static r(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final renderCommandsSuggestions(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandSuggestions:Ljava/util/List;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getCommandSuggestions()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->messageComposerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputCommandsHandlingEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getCommandSuggestionsContent()Landroid/view/View;

    move-result-object v0

    instance-of v2, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v2, :cond_2

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    :cond_2
    if-eqz v1, :cond_3

    invoke-interface {v1, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    if-nez p1, :cond_4

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getCommandSuggestionsContent()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-direct {p1, v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;-><init>(Landroid/view/View;Landroid/view/View;Landroid/widget/PopupWindow$OnDismissListener;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView$SuggestionPopupTouchListener;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView$SuggestionPopupTouchListener;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V

    invoke-virtual {p1, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    :cond_4
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;->showOrUpdate()V

    return-void

    :cond_5
    const-string p1, "messageComposerContext"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final renderCommandsSuggestions$lambda$82(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissSuggestionsListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final renderMentionSuggestions(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->mentionSuggestions:Ljava/util/List;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getMentionSuggestions()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->messageComposerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputMentionsHandlingEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getMentionSuggestionsContent()Landroid/view/View;

    move-result-object v0

    instance-of v2, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v2, :cond_2

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    :cond_2
    if-eqz v1, :cond_3

    invoke-interface {v1, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    if-nez p1, :cond_4

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getMentionSuggestionsContent()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/d;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-direct {p1, v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;-><init>(Landroid/view/View;Landroid/view/View;Landroid/widget/PopupWindow$OnDismissListener;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    :cond_4
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;->showOrUpdate()V

    return-void

    :cond_5
    const-string p1, "messageComposerContext"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final renderMentionSuggestions$lambda$84(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissSuggestionsListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final renderSuggestion(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V
    .locals 1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getMentionSuggestions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->renderMentionSuggestions(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getCommandSuggestions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->renderCommandsSuggestions(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getCommandSuggestions()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandSuggestions:Ljava/util/List;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getMentionSuggestions()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->mentionSuggestions:Ljava/util/List;

    return-void
.end method

.method public static synthetic s(Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentRemovalListener$lambda$4(Lio/getstream/chat/android/models/Attachment;)Ll83/a0;

    return-void
.end method

.method private static final sendMessageButtonClickListener$lambda$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic setCenterContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p3, -0x1

    const/4 p4, -0x2

    invoke-direct {p2, p3, p4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setCenterContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    return-void
.end method

.method private static final setCenterContent$lambda$64(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->textInputChangeListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setCenterContent$lambda$65(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Attachment;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic setCenterOverlapContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p3, -0x1

    const/4 p4, -0x2

    invoke-direct {p2, p3, p4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setCenterOverlapContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    return-void
.end method

.method private static final setCenterOverlapContent$lambda$70(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonHoldListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setCenterOverlapContent$lambda$71(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonLockListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setCenterOverlapContent$lambda$72(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonCancelListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setCenterOverlapContent$lambda$73(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonReleaseListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setCenterOverlapContent$lambda$74(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioDeleteButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setCenterOverlapContent$lambda$75(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioStopButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setCenterOverlapContent$lambda$76(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioPlaybackButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setCenterOverlapContent$lambda$77(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioCompleteButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setCenterOverlapContent$lambda$78(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioSliderDragStartListener:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setCenterOverlapContent$lambda$79(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;F)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioSliderDragStopListener:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setCommandSuggestionsContent$lambda$81(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/Command;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic setFooterContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p3, -0x1

    const/4 p4, -0x2

    invoke-direct {p2, p3, p4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setFooterContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    return-void
.end method

.method private static final setFooterContent$lambda$68(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Z)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->alsoSendToChannelSelectionListener:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic setHeaderContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p3, -0x1

    const/4 p4, -0x2

    invoke-direct {p2, p3, p4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setHeaderContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    return-void
.end method

.method private static final setHeaderContent$lambda$69(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissActionClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic setLeadingContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 p3, 0x50

    const/4 p4, -0x2

    invoke-direct {p2, p4, p4, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setLeadingContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    return-void
.end method

.method private static final setLeadingContent$lambda$62(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setLeadingContent$lambda$63(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandsButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setMentionSuggestionsContent$lambda$80(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Lio/getstream/chat/android/models/User;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->mentionSelectionListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic setTrailingContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    const/16 p3, 0x50

    const/4 p4, -0x2

    invoke-direct {p2, p4, p4, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setTrailingContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V

    return-void
.end method

.method private static final setTrailingContent$lambda$66(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->sendMessageButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final setTrailingContent$lambda$67(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonTouchListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static t(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final textInputChangeListener$lambda$1(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static u(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioDeleteButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static v(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->sendMessageButtonClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static w(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissActionClickListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static x(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissSuggestionsListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic y(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerMentionSuggestionsContent;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->defaultMentionSuggestionsView_delegate$lambda$32(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerMentionSuggestionsContent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lio/getstream/chat/android/models/User;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->mentionSelectionListener$lambda$5(Lio/getstream/chat/android/models/User;)Ll83/a0;

    return-void
.end method


# virtual methods
.method public final getAlsoSendToChannelSelectionListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->alsoSendToChannelSelectionListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getAttachmentRemovalListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getAttachmentSelectionListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentSelectionListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getAttachmentsButtonClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsButtonClickListener:Lc93/a;

    return-object v0
.end method

.method public final getAttachmentsPickerDialogBuilder()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsPickerDialogBuilder:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getAudioCompleteButtonClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioCompleteButtonClickListener:Lc93/a;

    return-object v0
.end method

.method public final getAudioDeleteButtonClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioDeleteButtonClickListener:Lc93/a;

    return-object v0
.end method

.method public final getAudioPlaybackButtonClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioPlaybackButtonClickListener:Lc93/a;

    return-object v0
.end method

.method public final getAudioRecordButtonCancelListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonCancelListener:Lc93/a;

    return-object v0
.end method

.method public final getAudioRecordButtonHoldListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonHoldListener:Lc93/a;

    return-object v0
.end method

.method public final getAudioRecordButtonLockListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonLockListener:Lc93/a;

    return-object v0
.end method

.method public final getAudioRecordButtonReleaseListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonReleaseListener:Lc93/a;

    return-object v0
.end method

.method public final getAudioRecordButtonTouchListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonTouchListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getAudioSliderDragStartListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioSliderDragStartListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getAudioSliderDragStopListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioSliderDragStopListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getAudioStopButtonClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioStopButtonClickListener:Lc93/a;

    return-object v0
.end method

.method public final getCommandSelectionListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getCommandsButtonClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandsButtonClickListener:Lc93/a;

    return-object v0
.end method

.method public final getComposerStyle$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->messageComposerContext:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "messageComposerContext"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getDismissActionClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissActionClickListener:Lc93/a;

    return-object v0
.end method

.method public final getDismissSuggestionsListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissSuggestionsListener:Lc93/a;

    return-object v0
.end method

.method public final getMentionSelectionListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->mentionSelectionListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getPollSubmissionListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->pollSubmissionListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getSendMessageButtonClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->sendMessageButtonClickListener:Lc93/a;

    return-object v0
.end method

.method public final getTextInputChangeListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->textInputChangeListener:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->suggestionsPopup:Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->validationErrorRenderer:Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->dismissValidationErrors()V

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void

    :cond_1
    const-string v0, "validationErrorRenderer"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getLogger()Lb23/k;

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

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->getLogger()Lb23/k;

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

.method public final renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V
    .locals 5

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    const-string v1, "binding"

    const/4 v2, 0x0

    if-eqz v0, :cond_18

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->trailingContent:Landroid/widget/FrameLayout;

    const-string v3, "trailingContent"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lh5/r0;

    invoke-direct {v3, v0}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v3}, Lh5/r0;->hasNext()Z

    move-result v0

    const-string v4, "Sequence is empty."

    if-eqz v0, :cond_17

    invoke-virtual {v3}, Lh5/r0;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v3, :cond_0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz v0, :cond_16

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->centerContent:Landroid/widget/FrameLayout;

    const-string v3, "centerContent"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lh5/r0;

    invoke-direct {v3, v0}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v3}, Lh5/r0;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual {v3}, Lh5/r0;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v3, :cond_2

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    goto :goto_1

    :cond_2
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz v0, :cond_14

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->centerOverlapContent:Landroid/widget/FrameLayout;

    const-string v3, "centerOverlapContent"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lh5/r0;

    invoke-direct {v3, v0}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v3}, Lh5/r0;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual {v3}, Lh5/r0;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v3, :cond_4

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    goto :goto_2

    :cond_4
    move-object v0, v2

    :goto_2
    if-eqz v0, :cond_5

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    :cond_5
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz v0, :cond_12

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->leadingContent:Landroid/widget/FrameLayout;

    const-string v3, "leadingContent"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lh5/r0;

    invoke-direct {v3, v0}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v3}, Lh5/r0;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {v3}, Lh5/r0;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v3, :cond_6

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    goto :goto_3

    :cond_6
    move-object v0, v2

    :goto_3
    if-eqz v0, :cond_7

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    :cond_7
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz v0, :cond_10

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->footerContent:Landroid/widget/FrameLayout;

    const-string v3, "footerContent"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lh5/r0;

    invoke-direct {v3, v0}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v3}, Lh5/r0;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v3}, Lh5/r0;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v3, :cond_8

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    goto :goto_4

    :cond_8
    move-object v0, v2

    :goto_4
    if-eqz v0, :cond_9

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    :cond_9
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz v0, :cond_e

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->headerContent:Landroid/widget/FrameLayout;

    const-string v1, "headerContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh5/r0;

    invoke-direct {v1, v0}, Lh5/r0;-><init>(Landroid/view/ViewGroup;)V

    invoke-virtual {v1}, Lh5/r0;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {v1}, Lh5/r0;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    if-eqz v1, :cond_a

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;

    goto :goto_5

    :cond_a
    move-object v0, v2

    :goto_5
    if-eqz v0, :cond_b

    invoke-interface {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    :cond_b
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->renderSuggestion(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->arePollsEnabled(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)Z

    move-result v0

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->arePollEnabled:Z

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->validationErrorRenderer:Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getValidationErrors()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/internal/ValidationErrorRenderer;->renderValidationErrors(Ljava/util/List;)V

    return-void

    :cond_c
    const-string p1, "validationErrorRenderer"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_d
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_f
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_11
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_13
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_15
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_16
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_17
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, v4}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final setAlsoSendToChannelSelectionListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->alsoSendToChannelSelectionListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setAttachmentRemovalListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setAttachmentSelectionListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentSelectionListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setAttachmentsButtonClickListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsButtonClickListener:Lc93/a;

    return-void
.end method

.method public final setAttachmentsPickerDialogBuilder(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachmentsPickerDialogBuilder:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setAudioCompleteButtonClickListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioCompleteButtonClickListener:Lc93/a;

    return-void
.end method

.method public final setAudioDeleteButtonClickListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioDeleteButtonClickListener:Lc93/a;

    return-void
.end method

.method public final setAudioPlaybackButtonClickListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioPlaybackButtonClickListener:Lc93/a;

    return-void
.end method

.method public final setAudioRecordButtonCancelListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonCancelListener:Lc93/a;

    return-void
.end method

.method public final setAudioRecordButtonHoldListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonHoldListener:Lc93/a;

    return-void
.end method

.method public final setAudioRecordButtonLockListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonLockListener:Lc93/a;

    return-void
.end method

.method public final setAudioRecordButtonReleaseListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonReleaseListener:Lc93/a;

    return-void
.end method

.method public final setAudioRecordButtonTouchListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioRecordButtonTouchListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setAudioSliderDragStartListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioSliderDragStartListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setAudioSliderDragStopListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioSliderDragStopListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setAudioStopButtonClickListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->audioStopButtonClickListener:Lc93/a;

    return-void
.end method

.method public final setCenterContent(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;)V"
        }
    .end annotation

    .line 1
    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setCenterContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    return-void
.end method

.method public final setCenterContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            ")V"
        }
    .end annotation

    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_3

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->centerContent:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->centerContent:Landroid/widget/FrameLayout;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachContext(Landroid/view/View;)Landroid/view/View;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    instance-of p2, p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;

    if-eqz p2, :cond_1

    .line 5
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;->getTextInputChangeListener()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-nez p2, :cond_0

    .line 6
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;->setTextInputChangeListener(Lkotlin/jvm/functions/Function1;)V

    .line 7
    :cond_0
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;->getAttachmentRemovalListener()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-nez p2, :cond_1

    .line 8
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCenterContent;->setAttachmentRemovalListener(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void

    .line 9
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    .line 10
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final setCenterOverlapContent(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;)V"
        }
    .end annotation

    .line 1
    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setCenterOverlapContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    return-void
.end method

.method public final setCenterOverlapContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            ")V"
        }
    .end annotation

    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_b

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->centerOverlapContent:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz v0, :cond_a

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->centerOverlapContent:Landroid/widget/FrameLayout;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachContext(Landroid/view/View;)Landroid/view/View;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    instance-of p2, p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;

    if-eqz p2, :cond_9

    .line 5
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->getRecordButtonHoldListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_0

    .line 6
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->setRecordButtonHoldListener(Lc93/a;)V

    .line 7
    :cond_0
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->getRecordButtonLockListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_1

    .line 8
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/4 v0, 0x4

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->setRecordButtonLockListener(Lc93/a;)V

    .line 9
    :cond_1
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->getRecordButtonCancelListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_2

    .line 10
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v0, 0x8

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->setRecordButtonCancelListener(Lc93/a;)V

    .line 11
    :cond_2
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->getRecordButtonReleaseListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_3

    .line 12
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v0, 0xc

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->setRecordButtonReleaseListener(Lc93/a;)V

    .line 13
    :cond_3
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->getDeleteButtonClickListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_4

    .line 14
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v0, 0x14

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->setDeleteButtonClickListener(Lc93/a;)V

    .line 15
    :cond_4
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->getStopButtonClickListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_5

    .line 16
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v0, 0x19

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->setStopButtonClickListener(Lc93/a;)V

    .line 17
    :cond_5
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->getPlaybackButtonClickListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_6

    .line 18
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v0, 0x1a

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->setPlaybackButtonClickListener(Lc93/a;)V

    .line 19
    :cond_6
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->getCompleteButtonClickListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_7

    .line 20
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v0, 0x1b

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->setCompleteButtonClickListener(Lc93/a;)V

    .line 21
    :cond_7
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->getSliderDragStartListener()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-nez p2, :cond_8

    .line 22
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/16 v0, 0x10

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->setSliderDragStartListener(Lkotlin/jvm/functions/Function1;)V

    .line 23
    :cond_8
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->getSliderDragStopListener()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-nez p2, :cond_9

    .line 24
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/16 v0, 0x11

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerOverlappingContent;->setSliderDragStopListener(Lkotlin/jvm/functions/Function1;)V

    :cond_9
    return-void

    .line 25
    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    .line 26
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final setCommandSelectionListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandSelectionListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setCommandSuggestionsContent(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;)V"
        }
    .end annotation

    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachContext(Landroid/view/View;)Landroid/view/View;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandSuggestionsContentOverride:Landroid/view/View;

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCommandSuggestionsContent;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCommandSuggestionsContent;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCommandSuggestionsContent;->getCommandSelectionListener()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/16 v1, 0xf

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerCommandSuggestionsContent;->setCommandSelectionListener(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public final setCommandsButtonClickListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->commandsButtonClickListener:Lc93/a;

    return-void
.end method

.method public final setDismissActionClickListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissActionClickListener:Lc93/a;

    return-void
.end method

.method public final setDismissSuggestionsListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->dismissSuggestionsListener:Lc93/a;

    return-void
.end method

.method public final setFooterContent(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;)V"
        }
    .end annotation

    .line 1
    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setFooterContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    return-void
.end method

.method public final setFooterContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            ")V"
        }
    .end annotation

    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->footerContent:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->footerContent:Landroid/widget/FrameLayout;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachContext(Landroid/view/View;)Landroid/view/View;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    instance-of p2, p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerFooterContent;

    if-eqz p2, :cond_0

    .line 5
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerFooterContent;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerFooterContent;->getAlsoSendToChannelSelectionListener()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-nez p2, :cond_0

    .line 6
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerFooterContent;->setAlsoSendToChannelSelectionListener(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void

    .line 7
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    .line 8
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final setHeaderContent(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;)V"
        }
    .end annotation

    .line 1
    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setHeaderContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    return-void
.end method

.method public final setHeaderContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            ")V"
        }
    .end annotation

    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->headerContent:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->headerContent:Landroid/widget/FrameLayout;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachContext(Landroid/view/View;)Landroid/view/View;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    instance-of p2, p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerHeaderContent;

    if-eqz p2, :cond_0

    .line 5
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerHeaderContent;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerHeaderContent;->getDismissActionClickListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_0

    .line 6
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/16 v0, 0xa

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerHeaderContent;->setDismissActionClickListener(Lc93/a;)V

    :cond_0
    return-void

    .line 7
    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    .line 8
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final setLeadingContent(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;)V"
        }
    .end annotation

    .line 1
    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setLeadingContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    return-void
.end method

.method public final setLeadingContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            ")V"
        }
    .end annotation

    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_3

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->leadingContent:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->leadingContent:Landroid/widget/FrameLayout;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachContext(Landroid/view/View;)Landroid/view/View;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    instance-of p2, p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerLeadingContent;

    if-eqz p2, :cond_1

    .line 5
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerLeadingContent;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerLeadingContent;->getAttachmentsButtonClickListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_0

    .line 6
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerLeadingContent;->setAttachmentsButtonClickListener(Lc93/a;)V

    .line 7
    :cond_0
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerLeadingContent;->getCommandsButtonClickListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_1

    .line 8
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerLeadingContent;->setCommandsButtonClickListener(Lc93/a;)V

    :cond_1
    return-void

    .line 9
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    .line 10
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public final setMentionSelectionListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->mentionSelectionListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setMentionSuggestionsContent(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;)V"
        }
    .end annotation

    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachContext(Landroid/view/View;)Landroid/view/View;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->mentionSuggestionsContentOverride:Landroid/view/View;

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerMentionSuggestionsContent;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerMentionSuggestionsContent;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerMentionSuggestionsContent;->getMentionSelectionListener()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerMentionSuggestionsContent;->setMentionSelectionListener(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public final setPollSubmissionListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->pollSubmissionListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setSendMessageButtonClickListener(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->sendMessageButtonClickListener:Lc93/a;

    return-void
.end method

.method public final setTextInputChangeListener(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->textInputChangeListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final setTrailingContent(Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;)V"
        }
    .end annotation

    .line 1
    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->setTrailingContent$default(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;ILjava/lang/Object;)V

    return-void
.end method

.method public final setTrailingContent(Landroid/view/View;Landroid/widget/FrameLayout$LayoutParams;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Landroid/view/View;",
            ":",
            "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;",
            ">(TV;",
            "Landroid/widget/FrameLayout$LayoutParams;",
            ")V"
        }
    .end annotation

    const-string v0, "contentView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_3

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->trailingContent:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->trailingContent:Landroid/widget/FrameLayout;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->attachContext(Landroid/view/View;)Landroid/view/View;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    instance-of p2, p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent;

    if-eqz p2, :cond_1

    .line 5
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent;->getSendMessageButtonClickListener()Lc93/a;

    move-result-object p2

    if-nez p2, :cond_0

    .line 6
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/a;

    const/4 v0, 0x3

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent;->setSendMessageButtonClickListener(Lc93/a;)V

    .line 7
    :cond_0
    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent;->getRecordAudioButtonTouchListener()Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-nez p2, :cond_1

    .line 8
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/composer/b;

    const/4 v0, 0x3

    invoke-direct {p2, p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;I)V

    invoke-interface {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerTrailingContent;->setRecordAudioButtonTouchListener(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void

    .line 9
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    .line 10
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method
