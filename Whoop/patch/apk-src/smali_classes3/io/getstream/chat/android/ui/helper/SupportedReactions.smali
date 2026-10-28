.class public final Lio/getstream/chat/android/ui/helper/SupportedReactions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;,
        Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionTypes;,
        Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/helper/SupportedReactions;",
        "",
        "context",
        "Landroid/content/Context;",
        "reactions",
        "",
        "",
        "Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;",
        "<init>",
        "(Landroid/content/Context;Ljava/util/Map;)V",
        "getReactions",
        "()Ljava/util/Map;",
        "types",
        "",
        "getTypes",
        "()Ljava/util/List;",
        "isReactionTypeSupported",
        "",
        "type",
        "isReactionTypeSupported$stream_chat_android_ui_components_release",
        "getReactionDrawable",
        "ReactionDrawable",
        "DefaultReactionTypes",
        "DefaultReactionDrawables",
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
.field private final reactions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;",
            ">;"
        }
    .end annotation
.end field

.field private final types:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "reactions"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lio/getstream/chat/android/ui/helper/SupportedReactions;->reactions:Ljava/util/Map;

    .line 3
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/helper/SupportedReactions;->types:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->INSTANCE:Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->loveDrawable(Landroid/content/Context;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object p3

    .line 5
    new-instance p4, Ll83/k;

    const-string v0, "love"

    invoke-direct {p4, v0, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->thumbsUpDrawable(Landroid/content/Context;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object p3

    .line 7
    new-instance v0, Ll83/k;

    const-string v1, "like"

    invoke-direct {v0, v1, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->thumbsDownDrawable(Landroid/content/Context;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object p3

    .line 9
    new-instance v1, Ll83/k;

    const-string v2, "sad"

    invoke-direct {v1, v2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->lolDrawable(Landroid/content/Context;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object p3

    .line 11
    new-instance v2, Ll83/k;

    const-string v3, "haha"

    invoke-direct {v2, v3, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;->wutDrawable(Landroid/content/Context;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    move-result-object p2

    .line 13
    new-instance p3, Ll83/k;

    const-string v3, "wow"

    invoke-direct {p3, v3, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 14
    filled-new-array {p4, v0, v1, v2, p3}, [Ll83/k;

    move-result-object p2

    .line 15
    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p2

    .line 16
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/helper/SupportedReactions;-><init>(Landroid/content/Context;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final getReactionDrawable(Ljava/lang/String;)Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/helper/SupportedReactions;->reactions:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;

    return-object p1
.end method

.method public final getReactions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/helper/SupportedReactions;->reactions:Ljava/util/Map;

    return-object v0
.end method

.method public final getTypes()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/helper/SupportedReactions;->types:Ljava/util/List;

    return-object v0
.end method

.method public final isReactionTypeSupported$stream_chat_android_ui_components_release(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/helper/SupportedReactions;->reactions:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
