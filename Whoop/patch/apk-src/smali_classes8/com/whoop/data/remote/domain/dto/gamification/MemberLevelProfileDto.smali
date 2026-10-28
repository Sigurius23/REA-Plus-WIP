.class public final Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001BM\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u00c6\u0003Jb\u0010 \u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0014\u0010\"\u001a\u00020#2\u0008\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010%\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010&\u001a\u00020\tH\u00d6\u0081\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0012\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0016\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;",
        "",
        "id",
        "",
        "userId",
        "memberExperience",
        "memberLevelDto",
        "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;",
        "nextLevelMiniBadge",
        "",
        "createdDateTime",
        "updatedDateTime",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getId",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getUserId",
        "getMemberExperience",
        "getMemberLevelDto",
        "()Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;",
        "getNextLevelMiniBadge",
        "()Ljava/lang/String;",
        "getCreatedDateTime",
        "getUpdatedDateTime",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final createdDateTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "created_at"
    .end annotation
.end field

.field private final id:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final memberExperience:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "experience"
    .end annotation
.end field

.field private final memberLevelDto:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "progression_level"
    .end annotation
.end field

.field private final nextLevelMiniBadge:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "next_level_mini_badge"
    .end annotation
.end field

.field private final updatedDateTime:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field

.field private final userId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->id:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->userId:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberExperience:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberLevelDto:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->nextLevelMiniBadge:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->createdDateTime:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->updatedDateTime:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->id:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->userId:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberExperience:Ljava/lang/Integer;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberLevelDto:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->nextLevelMiniBadge:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->createdDateTime:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->updatedDateTime:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component4()Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberLevelDto:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->nextLevelMiniBadge:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->createdDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->updatedDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;
    .locals 8

    new-instance v0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->id:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->id:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->userId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->userId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberExperience:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberExperience:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberLevelDto:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberLevelDto:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->nextLevelMiniBadge:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->nextLevelMiniBadge:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->createdDateTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->createdDateTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->updatedDateTime:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->updatedDateTime:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCreatedDateTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->createdDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->id:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMemberExperience()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberExperience:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getMemberLevelDto()Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberLevelDto:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    return-object v0
.end method

.method public final getNextLevelMiniBadge()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->nextLevelMiniBadge:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedDateTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->updatedDateTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->id:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->userId:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberExperience:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberLevelDto:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->nextLevelMiniBadge:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->createdDateTime:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->updatedDateTime:Ljava/lang/String;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->id:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->userId:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberExperience:Ljava/lang/Integer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->memberLevelDto:Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->nextLevelMiniBadge:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->createdDateTime:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelProfileDto;->updatedDateTime:Ljava/lang/String;

    const-string v7, ", userId="

    const-string v8, ", memberExperience="

    const-string v9, "MemberLevelProfileDto(id="

    invoke-static {v9, v0, v7, v1, v8}, Lvl/b;->l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", memberLevelDto="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", nextLevelMiniBadge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createdDateTime="

    const-string v2, ", updatedDateTime="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v6, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
