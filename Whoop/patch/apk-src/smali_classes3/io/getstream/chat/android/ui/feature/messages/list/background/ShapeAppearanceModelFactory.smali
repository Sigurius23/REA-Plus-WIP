.class public final Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "defaultCornerRadius",
        "differentCornerRadius",
        "",
        "isMine",
        "isBottomPosition",
        "Lkr/k;",
        "create",
        "(Landroid/content/Context;FFZZ)Lkr/k;",
        "Lkr/g;",
        "fileBackground",
        "(Landroid/content/Context;)Lkr/g;",
        "audioBackground",
        "CORNER_SIZE_FILE_PX",
        "F",
        "CORNER_SIZE_AUDIO_PX",
        "STROKE_WIDTH_PX",
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
.field private static final CORNER_SIZE_AUDIO_PX:F

.field private static final CORNER_SIZE_FILE_PX:F

.field public static final INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

.field private static final STROKE_WIDTH_PX:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

    const/16 v0, 0x10

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->CORNER_SIZE_FILE_PX:F

    const/16 v0, 0xe

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->CORNER_SIZE_AUDIO_PX:F

    const/4 v0, 0x1

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->STROKE_WIDTH_PX:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final audioBackground(Landroid/content/Context;)Lkr/g;
    .locals 13

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkr/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lkr/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lkr/i;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/e;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lkr/e;-><init>(I)V

    new-instance v5, Lkr/e;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lkr/e;-><init>(I)V

    new-instance v6, Lkr/e;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lkr/e;-><init>(I)V

    new-instance v7, Lkr/e;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/e;-><init>(I)V

    sget v8, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->CORNER_SIZE_AUDIO_PX:F

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v11, Lkr/a;

    invoke-direct {v11, v8}, Lkr/a;-><init>(F)V

    new-instance v12, Lkr/a;

    invoke-direct {v12, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/k;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iput-object v0, v8, Lkr/k;->a:Lse/a;

    iput-object v1, v8, Lkr/k;->b:Lse/a;

    iput-object v2, v8, Lkr/k;->c:Lse/a;

    iput-object v3, v8, Lkr/k;->d:Lse/a;

    iput-object v9, v8, Lkr/k;->e:Lkr/c;

    iput-object v10, v8, Lkr/k;->f:Lkr/c;

    iput-object v11, v8, Lkr/k;->g:Lkr/c;

    iput-object v12, v8, Lkr/k;->h:Lkr/c;

    iput-object v4, v8, Lkr/k;->i:Lkr/e;

    iput-object v5, v8, Lkr/k;->j:Lkr/e;

    iput-object v6, v8, Lkr/k;->k:Lkr/e;

    iput-object v7, v8, Lkr/k;->l:Lkr/e;

    new-instance v0, Lkr/g;

    invoke-direct {v0, v8}, Lkr/g;-><init>(Lkr/k;)V

    sget v1, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->STROKE_WIDTH_PX:F

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_whisper:I

    invoke-static {p1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v1}, Lkr/g;->s(F)V

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkr/g;->q(Landroid/content/res/ColorStateList;)V

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Lkr/g;->setTint(I)V

    return-object v0
.end method

.method public final create(Landroid/content/Context;FFZZ)Lkr/k;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkr/j;

    invoke-direct {v0}, Lkr/j;-><init>()V

    invoke-virtual {v0, p2}, Lkr/j;->b(F)V

    if-eqz p5, :cond_3

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    if-eqz p4, :cond_0

    invoke-virtual {v0, p3}, Lkr/j;->d(F)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    if-nez p4, :cond_1

    invoke-virtual {v0, p3}, Lkr/j;->c(F)V

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    if-eqz p4, :cond_2

    invoke-virtual {v0, p3}, Lkr/j;->c(F)V

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_3

    if-nez p4, :cond_3

    invoke-virtual {v0, p3}, Lkr/j;->d(F)V

    :cond_3
    :goto_0
    invoke-virtual {v0}, Lkr/j;->a()Lkr/k;

    move-result-object p1

    return-object p1
.end method

.method public final fileBackground(Landroid/content/Context;)Lkr/g;
    .locals 13

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkr/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lkr/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lkr/i;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/e;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lkr/e;-><init>(I)V

    new-instance v5, Lkr/e;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lkr/e;-><init>(I)V

    new-instance v6, Lkr/e;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lkr/e;-><init>(I)V

    new-instance v7, Lkr/e;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/e;-><init>(I)V

    sget v8, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->CORNER_SIZE_FILE_PX:F

    new-instance v9, Lkr/a;

    invoke-direct {v9, v8}, Lkr/a;-><init>(F)V

    new-instance v10, Lkr/a;

    invoke-direct {v10, v8}, Lkr/a;-><init>(F)V

    new-instance v11, Lkr/a;

    invoke-direct {v11, v8}, Lkr/a;-><init>(F)V

    new-instance v12, Lkr/a;

    invoke-direct {v12, v8}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/k;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    iput-object v0, v8, Lkr/k;->a:Lse/a;

    iput-object v1, v8, Lkr/k;->b:Lse/a;

    iput-object v2, v8, Lkr/k;->c:Lse/a;

    iput-object v3, v8, Lkr/k;->d:Lse/a;

    iput-object v9, v8, Lkr/k;->e:Lkr/c;

    iput-object v10, v8, Lkr/k;->f:Lkr/c;

    iput-object v11, v8, Lkr/k;->g:Lkr/c;

    iput-object v12, v8, Lkr/k;->h:Lkr/c;

    iput-object v4, v8, Lkr/k;->i:Lkr/e;

    iput-object v5, v8, Lkr/k;->j:Lkr/e;

    iput-object v6, v8, Lkr/k;->k:Lkr/e;

    iput-object v7, v8, Lkr/k;->l:Lkr/e;

    new-instance v0, Lkr/g;

    invoke-direct {v0, v8}, Lkr/g;-><init>(Lkr/k;)V

    sget v1, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->STROKE_WIDTH_PX:F

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_whisper:I

    invoke-static {p1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v1}, Lkr/g;->s(F)V

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkr/g;->q(Landroid/content/res/ColorStateList;)V

    sget v1, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {p1, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Lkr/g;->setTint(I)V

    return-object v0
.end method
