.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 T2\u00020\u0001:\u0002UTB\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bB+\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\'\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ9\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u001c\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\'\u0010\'\u001a\u00020&*\u00020\u001f2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020$0#H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002\u00a2\u0006\u0004\u0008*\u0010+J#\u0010/\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\t2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00110-\u00a2\u0006\u0004\u0008/\u00100J\u0017\u00103\u001a\u00020\u000e2\u0006\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\u00083\u00104J\u0015\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u000205\u00a2\u0006\u0004\u00087\u00108R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008@\u0010A\u001a\u0004\u0008B\u0010C\"\u0004\u0008D\u0010ER$\u0010G\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008G\u0010H\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010LR\u001b\u0010P\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008M\u0010;\u001a\u0004\u0008N\u0010OR\u0016\u0010R\u001a\u00020Q8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008R\u0010S\u00a8\u0006V"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;",
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
        "defStyleRes",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "Ll83/a0;",
        "showZero",
        "()V",
        "Lio/getstream/chat/android/models/Attachment;",
        "first",
        "showOne",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "second",
        "showTwo",
        "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)V",
        "third",
        "showThree",
        "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)V",
        "fourth",
        "andMoreCount",
        "showFour",
        "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;I)V",
        "Lkr/k;",
        "shapeAppearanceModel",
        "applyToMediaPreviews",
        "(Lkr/k;)V",
        "Lkotlin/Function1;",
        "Lkr/c;",
        "selector",
        "",
        "getCornerSize",
        "(Lkr/k;Lkotlin/jvm/functions/Function1;)F",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;",
        "createMediaAttachmentView",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;",
        "position",
        "",
        "attachments",
        "showAttachments",
        "(ILjava/util/List;)V",
        "Landroid/graphics/drawable/Drawable;",
        "background",
        "setBackground",
        "(Landroid/graphics/drawable/Drawable;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "data",
        "setupBackground",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "attachmentClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "getAttachmentClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "setAttachmentClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "attachmentLongClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "getAttachmentLongClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "setAttachmentLongClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V",
        "maxMediaAttachmentHeight$delegate",
        "getMaxMediaAttachmentHeight",
        "()I",
        "maxMediaAttachmentHeight",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;",
        "state",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;",
        "Companion",
        "State",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;

.field private static final MAX_HEIGHT_PERCENTAGE:D = 0.75

.field private static final MAX_PREVIEW_COUNT:I = 0x4

.field private static final MIN_HEIGHT_PX:I

.field private static final STROKE_WIDTH:F


# instance fields
.field private attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

.field private attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

.field private final logger$delegate:Ll83/h;

.field private final maxMediaAttachmentHeight$delegate:Ll83/h;

.field private state:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;

    const/16 v0, 0x5f

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->MIN_HEIGHT_PX:I

    const/4 v0, 0x2

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->STROKE_WIDTH:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    .line 2
    const-string p1, "MediaAttachGroupView"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->logger$delegate:Ll83/h;

    .line 3
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->maxMediaAttachmentHeight$delegate:Ll83/h;

    .line 4
    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->state:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    const-string p1, "MediaAttachGroupView"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->logger$delegate:Ll83/h;

    .line 7
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->maxMediaAttachmentHeight$delegate:Ll83/h;

    .line 8
    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->state:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    const-string p1, "MediaAttachGroupView"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->logger$delegate:Ll83/h;

    .line 12
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->maxMediaAttachmentHeight$delegate:Ll83/h;

    .line 13
    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->state:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 15
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 16
    const-string p1, "MediaAttachGroupView"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->logger$delegate:Ll83/h;

    .line 17
    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/h;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->maxMediaAttachmentHeight$delegate:Ll83/h;

    .line 18
    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->state:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;

    return-void
.end method

.method public static final synthetic access$getMIN_HEIGHT_PX$cp()I
    .locals 1

    sget v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->MIN_HEIGHT_PX:I

    return v0
.end method

.method private final applyToMediaPreviews(Lkr/k;)V
    .locals 6

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$applyToMediaPreviews$topLeftCorner$1;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$applyToMediaPreviews$topLeftCorner$1;

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->getCornerSize(Lkr/k;Lkotlin/jvm/functions/Function1;)F

    move-result v0

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$applyToMediaPreviews$topRightCorner$1;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$applyToMediaPreviews$topRightCorner$1;

    invoke-direct {p0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->getCornerSize(Lkr/k;Lkotlin/jvm/functions/Function1;)F

    move-result v1

    sget-object v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$applyToMediaPreviews$bottomRightCorner$1;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$applyToMediaPreviews$bottomRightCorner$1;

    invoke-direct {p0, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->getCornerSize(Lkr/k;Lkotlin/jvm/functions/Function1;)F

    move-result v2

    sget-object v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$applyToMediaPreviews$bottomLeftCorner$1;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$applyToMediaPreviews$bottomLeftCorner$1;

    invoke-direct {p0, p1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->getCornerSize(Lkr/k;Lkotlin/jvm/functions/Function1;)F

    move-result p1

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->state:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;

    instance-of v4, v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$OneView;

    if-eqz v4, :cond_0

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$OneView;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$OneView;->getView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v3

    invoke-virtual {v3, v0, v1, v2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setMediaPreviewShapeByCorners(FFFF)V

    return-void

    :cond_0
    instance-of v4, v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$TwoViews;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$TwoViews;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$TwoViews;->getViewOne()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v4

    invoke-virtual {v4, v0, v5, v5, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setMediaPreviewShapeByCorners(FFFF)V

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$TwoViews;->getViewTwo()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object p1

    invoke-virtual {p1, v5, v1, v2, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setMediaPreviewShapeByCorners(FFFF)V

    return-void

    :cond_1
    instance-of v4, v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;

    if-eqz v4, :cond_2

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->getViewOne()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v4

    invoke-virtual {v4, v0, v5, v5, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setMediaPreviewShapeByCorners(FFFF)V

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->getViewTwo()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object p1

    invoke-virtual {p1, v5, v1, v5, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setMediaPreviewShapeByCorners(FFFF)V

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;->getViewThree()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object p1

    invoke-virtual {p1, v5, v5, v2, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setMediaPreviewShapeByCorners(FFFF)V

    return-void

    :cond_2
    instance-of v4, v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$FourViews;

    if-eqz v4, :cond_3

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$FourViews;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$FourViews;->getViewOne()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v4

    invoke-virtual {v4, v0, v5, v5, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setMediaPreviewShapeByCorners(FFFF)V

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$FourViews;->getViewTwo()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v0

    invoke-virtual {v0, v5, v1, v5, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setMediaPreviewShapeByCorners(FFFF)V

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$FourViews;->getViewThree()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v0

    invoke-virtual {v0, v5, v5, v5, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setMediaPreviewShapeByCorners(FFFF)V

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$FourViews;->getViewFour()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object p1

    invoke-virtual {p1, v5, v5, v2, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setMediaPreviewShapeByCorners(FFFF)V

    :cond_3
    return-void
.end method

.method private final createMediaAttachmentView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->setId(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setAttachmentClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setAttachmentLongClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V

    return-object v0
.end method

.method public static synthetic f()I
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->maxMediaAttachmentHeight_delegate$lambda$0()I

    move-result v0

    return v0
.end method

.method private final getCornerSize(Lkr/k;Lkotlin/jvm/functions/Function1;)F
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkr/k;",
            "Lkotlin/jvm/functions/Function1;",
            ")F"
        }
    .end annotation

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lkr/a;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    check-cast p1, Lkr/a;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iget p1, p1, Lkr/a;->a:F

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    sget v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->STROKE_WIDTH:F

    sub-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    cmpl-float v1, v1, p2

    if-ltz v1, :cond_2

    move-object v0, p1

    :cond_2
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    if-nez v0, :cond_3

    move-object v0, p1

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getMaxMediaAttachmentHeight()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->maxMediaAttachmentHeight$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method private static final maxMediaAttachmentHeight_delegate$lambda$0()I
    .locals 4

    invoke-static {}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->displayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method private final showFour(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;I)V
    .locals 9

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->createMediaAttachmentView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->createMediaAttachmentView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->createMediaAttachmentView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->createMediaAttachmentView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v3

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$FourViews;

    invoke-direct {v4, v0, v1, v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$FourViews;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V

    iput-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->state:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;

    new-instance v4, Landroidx/constraintlayout/widget/p;

    invoke-direct {v4}, Landroidx/constraintlayout/widget/p;-><init>()V

    sget-object v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;

    const/4 v6, 0x1

    invoke-static {v5, v4, v0, v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;->access$setupMinHeight(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V

    invoke-static {v5, v4, v1, v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;->access$setupMinHeight(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V

    invoke-static {v5, v4, v2, v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;->access$setupMinHeight(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V

    invoke-static {v5, v4, v3, v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;->access$setupMinHeight(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V

    const/4 v5, 0x2

    new-array v7, v5, [Landroid/view/View;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    aput-object v1, v7, v6

    invoke-static {v4, v7}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->horizontalChainInParent(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V

    new-array v7, v5, [Landroid/view/View;

    aput-object v2, v7, v8

    aput-object v3, v7, v6

    invoke-static {v4, v7}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->horizontalChainInParent(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V

    new-array v7, v5, [Landroid/view/View;

    aput-object v0, v7, v8

    aput-object v2, v7, v6

    invoke-static {v4, v7}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->verticalChainInParent(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V

    new-array v7, v5, [Landroid/view/View;

    aput-object v1, v7, v8

    aput-object v3, v7, v6

    invoke-static {v4, v7}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->verticalChainInParent(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V

    invoke-virtual {v4, p0}, Landroidx/constraintlayout/widget/p;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    const/4 v4, 0x0

    invoke-static {v0, p1, v8, v5, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;IILjava/lang/Object;)V

    invoke-static {v1, p2, v8, v5, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;IILjava/lang/Object;)V

    invoke-static {v2, p3, v8, v5, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;IILjava/lang/Object;)V

    invoke-virtual {v3, p4, p5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment(Lio/getstream/chat/android/models/Attachment;I)V

    return-void
.end method

.method public static synthetic showFour$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;IILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->showFour(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;I)V

    return-void
.end method

.method private final showOne(Lio/getstream/chat/android/models/Attachment;)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->createMediaAttachmentView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$OneView;

    invoke-direct {v1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$OneView;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V

    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->state:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;

    new-instance v1, Landroidx/constraintlayout/widget/p;

    invoke-direct {v1}, Landroidx/constraintlayout/widget/p;-><init>()V

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->getMaxMediaAttachmentHeight()I

    move-result v3

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/widget/p;->j(I)Landroidx/constraintlayout/widget/k;

    move-result-object v2

    iget-object v2, v2, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    iput v3, v2, Landroidx/constraintlayout/widget/l;->a0:I

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/widget/p;->j(I)Landroidx/constraintlayout/widget/k;

    move-result-object v2

    iget-object v2, v2, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    const/4 v3, -0x1

    iput v3, v2, Landroidx/constraintlayout/widget/l;->b:I

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    const/4 v2, 0x2

    invoke-static {v1, v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    const/4 v2, 0x3

    invoke-static {v1, v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    const/4 v2, 0x4

    invoke-static {v1, v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getOriginalWidth()Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getOriginalHeight()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    :cond_1
    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v3

    invoke-virtual {v1, v3}, Landroidx/constraintlayout/widget/p;->j(I)Landroidx/constraintlayout/widget/k;

    move-result-object v3

    iget-object v3, v3, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    iput-object v2, v3, Landroidx/constraintlayout/widget/l;->y:Ljava/lang/String;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroidx/constraintlayout/widget/p;->j(I)Landroidx/constraintlayout/widget/k;

    move-result-object v2

    iget-object v2, v2, Landroidx/constraintlayout/widget/k;->d:Landroidx/constraintlayout/widget/l;

    const-string v3, "1"

    iput-object v3, v2, Landroidx/constraintlayout/widget/l;->y:Ljava/lang/String;

    :goto_1
    invoke-virtual {v1, p0}, Landroidx/constraintlayout/widget/p;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment(Lio/getstream/chat/android/models/Attachment;I)V

    return-void
.end method

.method private final showThree(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)V
    .locals 9

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->createMediaAttachmentView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->createMediaAttachmentView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->createMediaAttachmentView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;

    invoke-direct {v3, v0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$ThreeViews;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V

    iput-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->state:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;

    new-instance v3, Landroidx/constraintlayout/widget/p;

    invoke-direct {v3}, Landroidx/constraintlayout/widget/p;-><init>()V

    sget-object v4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;

    const/4 v5, 0x1

    invoke-static {v4, v3, v1, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;->access$setupMinHeight(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V

    invoke-static {v4, v3, v2, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;->access$setupMinHeight(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V

    const/4 v4, 0x2

    new-array v6, v4, [Landroid/view/View;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    aput-object v1, v6, v5

    invoke-static {v3, v6}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->horizontalChainInParent(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V

    new-array v6, v4, [Landroid/view/View;

    aput-object v0, v6, v7

    aput-object v2, v6, v5

    invoke-static {v3, v6}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->horizontalChainInParent(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V

    new-array v6, v4, [Landroid/view/View;

    aput-object v1, v6, v7

    aput-object v2, v6, v5

    invoke-static {v3, v6}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->verticalChainInParent(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v5

    const/4 v6, 0x3

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v3, v5, v6, v8, v6}, Landroidx/constraintlayout/widget/p;->f(IIII)V

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v5

    const/4 v6, 0x4

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v3, v5, v6, v8, v6}, Landroidx/constraintlayout/widget/p;->f(IIII)V

    invoke-virtual {v3, p0}, Landroidx/constraintlayout/widget/p;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    const/4 v3, 0x0

    invoke-static {v0, p1, v7, v4, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;IILjava/lang/Object;)V

    invoke-static {v1, p2, v7, v4, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;IILjava/lang/Object;)V

    invoke-static {v2, p3, v7, v4, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;IILjava/lang/Object;)V

    return-void
.end method

.method private final showTwo(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)V
    .locals 7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->createMediaAttachmentView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->createMediaAttachmentView()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$TwoViews;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$TwoViews;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V

    iput-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->state:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;

    new-instance v2, Landroidx/constraintlayout/widget/p;

    invoke-direct {v2}, Landroidx/constraintlayout/widget/p;-><init>()V

    sget-object v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;

    const/4 v4, 0x0

    invoke-static {v3, v2, v0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;->access$setupMinHeight(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V

    invoke-static {v3, v2, v1, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;->access$setupMinHeight(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$Companion;Landroidx/constraintlayout/widget/p;Landroid/view/View;Z)V

    const/4 v3, 0x3

    invoke-static {v2, v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    invoke-static {v2, v1, v3}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    const/4 v3, 0x4

    invoke-static {v2, v0, v3}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    invoke-static {v2, v1, v3}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    const/4 v3, 0x2

    new-array v5, v3, [Landroid/view/View;

    aput-object v0, v5, v4

    const/4 v6, 0x1

    aput-object v1, v5, v6

    invoke-static {v2, v5}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->horizontalChainInParent(Landroidx/constraintlayout/widget/p;[Landroid/view/View;)V

    invoke-virtual {v2, p0}, Landroidx/constraintlayout/widget/p;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    const/4 v2, 0x0

    invoke-static {v0, p1, v4, v3, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;IILjava/lang/Object;)V

    invoke-static {v1, p2, v4, v3, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;IILjava/lang/Object;)V

    return-void
.end method

.method private final showZero()V
    .locals 1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State$Empty;

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->state:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView$State;

    return-void
.end method


# virtual methods
.method public final getAttachmentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    return-object v0
.end method

.method public final getAttachmentLongClickListener()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    return-object v0
.end method

.method public final setAttachmentClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    return-void
.end method

.method public final setAttachmentLongClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    return-void
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const-string v0, "background"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    instance-of v0, p1, Lkr/g;

    if-eqz v0, :cond_0

    check-cast p1, Lkr/g;

    iget-object p1, p1, Lkr/g;->w:Lkr/f;

    iget-object p1, p1, Lkr/f;->a:Lkr/k;

    const-string v0, "getShapeAppearanceModel(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->applyToMediaPreviews(Lkr/k;)V

    :cond_0
    return-void
.end method

.method public final setupBackground(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 7

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v0, "getContext(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator$Companion;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;->access$getDEFAULT_CORNER_RADIUS$cp()F

    move-result v3

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v5

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/MessageItemKt;->isBottomPosition(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z

    move-result v6

    const/4 v4, 0x0

    invoke-virtual/range {v1 .. v6}, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->create(Landroid/content/Context;FFZZ)Lkr/k;

    move-result-object p1

    new-instance v0, Lkr/g;

    invoke-direct {v0, p1}, Lkr/g;-><init>(Lkr/k;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_transparent:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Lkr/g;->setTint(I)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final showAttachments(ILjava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Attachment;",
            ">;)V"
        }
    .end annotation

    const-string v0, "attachments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v2}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->hasLink(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->getLogger()Lb23/k;

    move-result-object p2

    iget-object v1, p2, Lb23/k;->c:Lb23/e;

    iget-object v2, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const-string v5, "[showAttachments] #"

    const-string v6, "; attachments.size: "

    invoke-static {p1, v1, v5, v6}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v3, v2, p1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-eqz p1, :cond_7

    const/4 p2, 0x1

    if-eq p1, p2, :cond_6

    const/4 v1, 0x2

    if-eq p1, v1, :cond_5

    const/4 v2, 0x3

    if-eq p1, v2, :cond_4

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v7, p1

    check-cast v7, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v9, p1

    check-cast v9, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 v10, p1, -0x4

    move-object v5, p0

    invoke-direct/range {v5 .. v10}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->showFour(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;I)V

    goto :goto_1

    :cond_4
    move-object v5, p0

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Attachment;

    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->showThree(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)V

    goto :goto_1

    :cond_5
    move-object v5, p0

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Attachment;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->showTwo(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/models/Attachment;)V

    goto :goto_1

    :cond_6
    move-object v5, p0

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->showOne(Lio/getstream/chat/android/models/Attachment;)V

    goto :goto_1

    :cond_7
    move-object v5, p0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->showZero()V

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    instance-of p2, p1, Lkr/g;

    if-eqz p2, :cond_8

    move-object v4, p1

    check-cast v4, Lkr/g;

    :cond_8
    if-eqz v4, :cond_9

    iget-object p1, v4, Lkr/g;->w:Lkr/f;

    iget-object p1, p1, Lkr/f;->a:Lkr/k;

    if-eqz p1, :cond_9

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentsGroupView;->applyToMediaPreviews(Lkr/k;)V

    :cond_9
    return-void
.end method
