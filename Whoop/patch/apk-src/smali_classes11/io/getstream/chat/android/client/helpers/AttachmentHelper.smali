.class public final Lio/getstream/chat/android/client/helpers/AttachmentHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/helpers/AttachmentHelper$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/client/helpers/AttachmentHelper;",
        "",
        "timeProvider",
        "Lio/getstream/chat/android/client/utils/TimeProvider;",
        "<init>",
        "(Lio/getstream/chat/android/client/utils/TimeProvider;)V",
        "hasValidImageUrl",
        "",
        "attachment",
        "Lio/getstream/chat/android/models/Attachment;",
        "hasStreamImageUrl",
        "Companion",
        "stream-chat-android-client_release"
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
.field private static final Companion:Lio/getstream/chat/android/client/helpers/AttachmentHelper$Companion;

.field private static final QUERY_KEY_NAME_EXPIRES:Ljava/lang/String; = "Expires"

.field private static final STREAM_CDN_HOST_PATTERN:Lyb3/p;


# instance fields
.field private final timeProvider:Lio/getstream/chat/android/client/utils/TimeProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/getstream/chat/android/client/helpers/AttachmentHelper$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/helpers/AttachmentHelper;->Companion:Lio/getstream/chat/android/client/helpers/AttachmentHelper$Companion;

    new-instance v0, Lyb3/p;

    sget-object v1, Lyb3/q;->x:Lyb3/q;

    const/4 v1, 0x0

    const-string v2, "stream-chat-+.+\\.imgix.net$|.+\\.stream-io-cdn.com$"

    invoke-direct {v0, v2, v1}, Lyb3/p;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/getstream/chat/android/client/helpers/AttachmentHelper;->STREAM_CDN_HOST_PATTERN:Lyb3/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/client/helpers/AttachmentHelper;-><init>(Lio/getstream/chat/android/client/utils/TimeProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/utils/TimeProvider;)V
    .locals 1

    const-string v0, "timeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/helpers/AttachmentHelper;->timeProvider:Lio/getstream/chat/android/client/utils/TimeProvider;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/utils/TimeProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    sget-object p1, Lio/getstream/chat/android/client/utils/TimeProvider;->INSTANCE:Lio/getstream/chat/android/client/utils/TimeProvider;

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/helpers/AttachmentHelper;-><init>(Lio/getstream/chat/android/client/utils/TimeProvider;)V

    return-void
.end method


# virtual methods
.method public final hasStreamImageUrl(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 3

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lcom/iterable/iterableapi/v;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lcom/iterable/iterableapi/v;-><init>(I)V

    invoke-virtual {v1, v0, p1}, Lcom/iterable/iterableapi/v;->d(Lud3/e0;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    if-eqz v0, :cond_0

    iget-object p1, v0, Lud3/e0;->d:Ljava/lang/String;

    if-eqz p1, :cond_0

    sget-object v0, Lio/getstream/chat/android/client/helpers/AttachmentHelper;->STREAM_CDN_HOST_PATTERN:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hasValidImageUrl(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 8

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_b

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lcom/iterable/iterableapi/v;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lcom/iterable/iterableapi/v;-><init>(I)V

    invoke-virtual {v2, v1, p1}, Lcom/iterable/iterableapi/v;->d(Lud3/e0;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-object p1, p1, Lud3/e0;->g:Ljava/util/List;

    const/4 v2, 0x2

    if-nez p1, :cond_1

    sget-object v3, Lm83/a0;->w:Lm83/a0;

    goto :goto_2

    :cond_1
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    div-int/2addr v4, v2

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v3, v4, v5}, Ljava/util/LinkedHashSet;-><init>(IF)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v0, v4}, Le93/b;->i0(II)Li93/j;

    move-result-object v4

    invoke-static {v2, v4}, Le93/b;->d0(ILi93/j;)Li93/h;

    move-result-object v4

    iget v5, v4, Li93/h;->w:I

    iget v6, v4, Li93/h;->x:I

    iget v4, v4, Li93/h;->y:I

    if-lez v4, :cond_2

    if-le v5, v6, :cond_3

    :cond_2
    if-gez v4, :cond_4

    if-gt v6, v5, :cond_4

    :cond_3
    :goto_1
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v7}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    if-eq v5, v6, :cond_4

    add-int/2addr v5, v4

    goto :goto_1

    :cond_4
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v3

    const-string v4, "unmodifiableSet(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    const-string v4, "Expires"

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    const/4 v5, 0x1

    if-nez v3, :cond_5

    goto :goto_5

    :cond_5
    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v0, v3}, Le93/b;->i0(II)Li93/j;

    move-result-object v3

    invoke-static {v2, v3}, Le93/b;->d0(ILi93/j;)Li93/h;

    move-result-object v2

    iget v3, v2, Li93/h;->w:I

    iget v6, v2, Li93/h;->x:I

    iget v2, v2, Li93/h;->y:I

    if-lez v2, :cond_7

    if-le v3, v6, :cond_8

    :cond_7
    if-gez v2, :cond_a

    if-gt v6, v3, :cond_a

    :cond_8
    :goto_3
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    add-int/2addr v3, v5

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    goto :goto_4

    :cond_9
    if-eq v3, v6, :cond_a

    add-int/2addr v3, v2

    goto :goto_3

    :cond_a
    :goto_4
    if-eqz v1, :cond_b

    invoke-static {v1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object p1, p0, Lio/getstream/chat/android/client/helpers/AttachmentHelper;->timeProvider:Lio/getstream/chat/android/client/utils/TimeProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/utils/TimeProvider;->provideCurrentTimeInSeconds()J

    move-result-wide v3

    cmp-long p1, v1, v3

    if-lez p1, :cond_b

    :goto_5
    return v5

    :cond_b
    :goto_6
    return v0
.end method
