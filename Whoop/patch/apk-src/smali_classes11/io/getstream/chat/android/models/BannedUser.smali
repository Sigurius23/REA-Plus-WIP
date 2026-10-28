.class public final Lio/getstream/chat/android/models/BannedUser;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0019\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010!\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rH\u00c6\u0003JY\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010$\u001a\u00020\u000b2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\'H\u00d6\u0001J\t\u0010(\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/models/BannedUser;",
        "",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "bannedBy",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "createdAt",
        "Ljava/util/Date;",
        "expires",
        "shadow",
        "",
        "reason",
        "",
        "<init>",
        "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/String;)V",
        "getUser",
        "()Lio/getstream/chat/android/models/User;",
        "getBannedBy",
        "getChannel",
        "()Lio/getstream/chat/android/models/Channel;",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getExpires",
        "getShadow",
        "()Z",
        "getReason",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final bannedBy:Lio/getstream/chat/android/models/User;

.field private final channel:Lio/getstream/chat/android/models/Channel;

.field private final createdAt:Ljava/util/Date;

.field private final expires:Ljava/util/Date;

.field private final reason:Ljava/lang/String;

.field private final shadow:Z

.field private final user:Lio/getstream/chat/android/models/User;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/models/BannedUser;->user:Lio/getstream/chat/android/models/User;

    iput-object p2, p0, Lio/getstream/chat/android/models/BannedUser;->bannedBy:Lio/getstream/chat/android/models/User;

    iput-object p3, p0, Lio/getstream/chat/android/models/BannedUser;->channel:Lio/getstream/chat/android/models/Channel;

    iput-object p4, p0, Lio/getstream/chat/android/models/BannedUser;->createdAt:Ljava/util/Date;

    iput-object p5, p0, Lio/getstream/chat/android/models/BannedUser;->expires:Ljava/util/Date;

    iput-boolean p6, p0, Lio/getstream/chat/android/models/BannedUser;->shadow:Z

    iput-object p7, p0, Lio/getstream/chat/android/models/BannedUser;->reason:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/BannedUser;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/BannedUser;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/models/BannedUser;->user:Lio/getstream/chat/android/models/User;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/models/BannedUser;->bannedBy:Lio/getstream/chat/android/models/User;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/models/BannedUser;->channel:Lio/getstream/chat/android/models/Channel;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/models/BannedUser;->createdAt:Ljava/util/Date;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/models/BannedUser;->expires:Ljava/util/Date;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-boolean p6, p0, Lio/getstream/chat/android/models/BannedUser;->shadow:Z

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/models/BannedUser;->reason:Ljava/lang/String;

    :cond_6
    move p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/chat/android/models/BannedUser;->copy(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/String;)Lio/getstream/chat/android/models/BannedUser;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->bannedBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final component4()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component5()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->expires:Ljava/util/Date;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/BannedUser;->shadow:Z

    return v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/String;)Lio/getstream/chat/android/models/BannedUser;
    .locals 9

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/BannedUser;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/models/BannedUser;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Ljava/util/Date;ZLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/BannedUser;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/BannedUser;

    iget-object v1, p0, Lio/getstream/chat/android/models/BannedUser;->user:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/models/BannedUser;->user:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/BannedUser;->bannedBy:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/models/BannedUser;->bannedBy:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/BannedUser;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v3, p1, Lio/getstream/chat/android/models/BannedUser;->channel:Lio/getstream/chat/android/models/Channel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/models/BannedUser;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/BannedUser;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/models/BannedUser;->expires:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/BannedUser;->expires:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lio/getstream/chat/android/models/BannedUser;->shadow:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/BannedUser;->shadow:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/models/BannedUser;->reason:Ljava/lang/String;

    iget-object p1, p1, Lio/getstream/chat/android/models/BannedUser;->reason:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBannedBy()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->bannedBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final getChannel()Lio/getstream/chat/android/models/Channel;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->channel:Lio/getstream/chat/android/models/Channel;

    return-object v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getExpires()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->expires:Ljava/util/Date;

    return-object v0
.end method

.method public final getReason()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->reason:Ljava/lang/String;

    return-object v0
.end method

.method public final getShadow()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/BannedUser;->shadow:Z

    return v0
.end method

.method public final getUser()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->user:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->user:Lio/getstream/chat/android/models/User;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/BannedUser;->bannedBy:Lio/getstream/chat/android/models/User;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/BannedUser;->channel:Lio/getstream/chat/android/models/Channel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/BannedUser;->createdAt:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/BannedUser;->expires:Ljava/util/Date;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lio/getstream/chat/android/models/BannedUser;->shadow:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/models/BannedUser;->reason:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/models/BannedUser;->user:Lio/getstream/chat/android/models/User;

    iget-object v1, p0, Lio/getstream/chat/android/models/BannedUser;->bannedBy:Lio/getstream/chat/android/models/User;

    iget-object v2, p0, Lio/getstream/chat/android/models/BannedUser;->channel:Lio/getstream/chat/android/models/Channel;

    iget-object v3, p0, Lio/getstream/chat/android/models/BannedUser;->createdAt:Ljava/util/Date;

    iget-object v4, p0, Lio/getstream/chat/android/models/BannedUser;->expires:Ljava/util/Date;

    iget-boolean v5, p0, Lio/getstream/chat/android/models/BannedUser;->shadow:Z

    iget-object v6, p0, Lio/getstream/chat/android/models/BannedUser;->reason:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "BannedUser(user="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bannedBy="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", channel="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", createdAt="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", expires="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shadow="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", reason="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v6, v0, v7}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
