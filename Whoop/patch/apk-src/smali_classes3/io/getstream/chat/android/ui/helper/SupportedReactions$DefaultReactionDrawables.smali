.class final Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/helper/SupportedReactions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultReactionDrawables"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0001\u0010\r\u001a\u00020\u000eH\u0002\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;",
        "",
        "<init>",
        "()V",
        "loveDrawable",
        "Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;",
        "context",
        "Landroid/content/Context;",
        "thumbsUpDrawable",
        "thumbsDownDrawable",
        "lolDrawable",
        "wutDrawable",
        "createTintedReactionDrawable",
        "drawableResId",
        "",
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
.field public static final INSTANCE:Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->INSTANCE:Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final createTintedReactionDrawable(Landroid/content/Context;I)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDrawableCompat(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey:I

    invoke-static {p1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/DrawableKt;->applyTint(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {p1, p2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget v2, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {p1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/utils/extensions/DrawableKt;->applyTint(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-object v0
.end method


# virtual methods
.method public final lolDrawable(Landroid/content/Context;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_reaction_lol:I

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->createTintedReactionDrawable(Landroid/content/Context;I)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object p1

    return-object p1
.end method

.method public final loveDrawable(Landroid/content/Context;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_reaction_love:I

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->createTintedReactionDrawable(Landroid/content/Context;I)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object p1

    return-object p1
.end method

.method public final thumbsDownDrawable(Landroid/content/Context;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_reaction_thumbs_down:I

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->createTintedReactionDrawable(Landroid/content/Context;I)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object p1

    return-object p1
.end method

.method public final thumbsUpDrawable(Landroid/content/Context;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_reaction_thumbs_up:I

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->createTintedReactionDrawable(Landroid/content/Context;I)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object p1

    return-object p1
.end method

.method public final wutDrawable(Landroid/content/Context;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_ic_reaction_wut:I

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->createTintedReactionDrawable(Landroid/content/Context;I)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object p1

    return-object p1
.end method
