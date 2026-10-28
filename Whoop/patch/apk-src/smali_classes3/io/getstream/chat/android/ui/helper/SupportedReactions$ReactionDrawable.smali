.class public final Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/helper/SupportedReactions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ReactionDrawable"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;",
        "",
        "inactiveDrawable",
        "Landroid/graphics/drawable/Drawable;",
        "activeDrawable",
        "<init>",
        "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V",
        "getDrawable",
        "isActive",
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


# instance fields
.field private final activeDrawable:Landroid/graphics/drawable/Drawable;

.field private final inactiveDrawable:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const-string v0, "inactiveDrawable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeDrawable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;->inactiveDrawable:Landroid/graphics/drawable/Drawable;

    iput-object p2, p0, Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;->activeDrawable:Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public final getDrawable(Z)Landroid/graphics/drawable/Drawable;
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;->activeDrawable:Landroid/graphics/drawable/Drawable;

    return-object p1

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;->inactiveDrawable:Landroid/graphics/drawable/Drawable;

    return-object p1
.end method
