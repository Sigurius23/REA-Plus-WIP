.class public final Lio/getstream/chat/android/models/ReactionGroup$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/ReactionGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0008J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/models/ReactionGroup$Builder;",
        "",
        "<init>",
        "()V",
        "reactionGroup",
        "Lio/getstream/chat/android/models/ReactionGroup;",
        "(Lio/getstream/chat/android/models/ReactionGroup;)V",
        "type",
        "",
        "count",
        "",
        "sumScore",
        "firstReactionAt",
        "Ljava/util/Date;",
        "lastReactionAt",
        "build",
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


# instance fields
.field private count:I

.field private firstReactionAt:Ljava/util/Date;

.field private lastReactionAt:Ljava/util/Date;

.field private sumScore:I

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string v0, ""

    iput-object v0, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->type:Ljava/lang/String;

    .line 3
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->firstReactionAt:Ljava/util/Date;

    .line 4
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->lastReactionAt:Ljava/util/Date;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/ReactionGroup;)V
    .locals 1

    const-string v0, "reactionGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Lio/getstream/chat/android/models/ReactionGroup$Builder;-><init>()V

    .line 6
    invoke-virtual {p1}, Lio/getstream/chat/android/models/ReactionGroup;->getType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->type:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lio/getstream/chat/android/models/ReactionGroup;->getCount()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->count:I

    .line 8
    invoke-virtual {p1}, Lio/getstream/chat/android/models/ReactionGroup;->getSumScore()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->sumScore:I

    .line 9
    invoke-virtual {p1}, Lio/getstream/chat/android/models/ReactionGroup;->getFirstReactionAt()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->firstReactionAt:Ljava/util/Date;

    .line 10
    invoke-virtual {p1}, Lio/getstream/chat/android/models/ReactionGroup;->getLastReactionAt()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->lastReactionAt:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/models/ReactionGroup;
    .locals 6

    new-instance v0, Lio/getstream/chat/android/models/ReactionGroup;

    iget-object v1, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->type:Ljava/lang/String;

    iget v2, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->count:I

    iget v3, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->sumScore:I

    iget-object v4, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->firstReactionAt:Ljava/util/Date;

    iget-object v5, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->lastReactionAt:Ljava/util/Date;

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/models/ReactionGroup;-><init>(Ljava/lang/String;IILjava/util/Date;Ljava/util/Date;)V

    return-object v0
.end method

.method public final count(I)Lio/getstream/chat/android/models/ReactionGroup$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->count:I

    return-object p0
.end method

.method public final firstReactionAt(Ljava/util/Date;)Lio/getstream/chat/android/models/ReactionGroup$Builder;
    .locals 1

    const-string v0, "firstReactionAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->firstReactionAt:Ljava/util/Date;

    return-object p0
.end method

.method public final lastReactionAt(Ljava/util/Date;)Lio/getstream/chat/android/models/ReactionGroup$Builder;
    .locals 1

    const-string v0, "lastReactionAt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->lastReactionAt:Ljava/util/Date;

    return-object p0
.end method

.method public final sumScore(I)Lio/getstream/chat/android/models/ReactionGroup$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->sumScore:I

    return-object p0
.end method

.method public final type(Ljava/lang/String;)Lio/getstream/chat/android/models/ReactionGroup$Builder;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/ReactionGroup$Builder;->type:Ljava/lang/String;

    return-object p0
.end method
