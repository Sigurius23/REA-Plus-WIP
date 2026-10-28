.class public final Lio/getstream/chat/android/models/ReactionSortingByLastReactionAt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/models/ReactionSorting;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u00c6\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0016J\u0013\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/models/ReactionSortingByLastReactionAt;",
        "Lio/getstream/chat/android/models/ReactionSorting;",
        "<init>",
        "()V",
        "compare",
        "",
        "o1",
        "Lio/getstream/chat/android/models/ReactionGroup;",
        "o2",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "stream-chat-android-core"
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
.field public static final INSTANCE:Lio/getstream/chat/android/models/ReactionSortingByLastReactionAt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/models/ReactionSortingByLastReactionAt;

    invoke-direct {v0}, Lio/getstream/chat/android/models/ReactionSortingByLastReactionAt;-><init>()V

    sput-object v0, Lio/getstream/chat/android/models/ReactionSortingByLastReactionAt;->INSTANCE:Lio/getstream/chat/android/models/ReactionSortingByLastReactionAt;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lio/getstream/chat/android/models/ReactionGroup;Lio/getstream/chat/android/models/ReactionGroup;)I
    .locals 1

    const-string v0, "o1"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "o2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/ReactionGroup;->getLastReactionAt()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/ReactionGroup;->getLastReactionAt()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/models/ReactionGroup;

    check-cast p2, Lio/getstream/chat/android/models/ReactionGroup;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/models/ReactionSortingByLastReactionAt;->compare(Lio/getstream/chat/android/models/ReactionGroup;Lio/getstream/chat/android/models/ReactionGroup;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lio/getstream/chat/android/models/ReactionSortingByLastReactionAt;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x41a05c95

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ReactionSortingByLastReactionAt"

    return-object v0
.end method
