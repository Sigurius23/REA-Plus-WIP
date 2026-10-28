.class public final Llive/hms/video/signal/init/ServerConfiguration;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B?\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JK\u0010\u001c\u001a\u00020\u00002\u0010\u0008\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0004H\u00d6\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006#"
    }
    d2 = {
        "Llive/hms/video/signal/init/ServerConfiguration;",
        "",
        "enabledFlags",
        "",
        "",
        "networkHealth",
        "Llive/hms/video/signal/init/NetworkHealth;",
        "publishStats",
        "Llive/hms/video/signal/init/Stats;",
        "subscribeStats",
        "vb",
        "Llive/hms/video/signal/init/VB;",
        "<init>",
        "(Ljava/util/List;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/VB;)V",
        "getEnabledFlags",
        "()Ljava/util/List;",
        "getNetworkHealth",
        "()Llive/hms/video/signal/init/NetworkHealth;",
        "getPublishStats",
        "()Llive/hms/video/signal/init/Stats;",
        "getSubscribeStats",
        "getVb",
        "()Llive/hms/video/signal/init/VB;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final enabledFlags:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "enabledFlags"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final networkHealth:Llive/hms/video/signal/init/NetworkHealth;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "networkHealth"
    .end annotation
.end field

.field private final publishStats:Llive/hms/video/signal/init/Stats;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "publishStats"
    .end annotation
.end field

.field private final subscribeStats:Llive/hms/video/signal/init/Stats;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subscribeStats"
    .end annotation
.end field

.field private final vb:Llive/hms/video/signal/init/VB;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "vb"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/VB;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Llive/hms/video/signal/init/NetworkHealth;",
            "Llive/hms/video/signal/init/Stats;",
            "Llive/hms/video/signal/init/Stats;",
            "Llive/hms/video/signal/init/VB;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/signal/init/ServerConfiguration;->enabledFlags:Ljava/util/List;

    iput-object p2, p0, Llive/hms/video/signal/init/ServerConfiguration;->networkHealth:Llive/hms/video/signal/init/NetworkHealth;

    iput-object p3, p0, Llive/hms/video/signal/init/ServerConfiguration;->publishStats:Llive/hms/video/signal/init/Stats;

    iput-object p4, p0, Llive/hms/video/signal/init/ServerConfiguration;->subscribeStats:Llive/hms/video/signal/init/Stats;

    iput-object p5, p0, Llive/hms/video/signal/init/ServerConfiguration;->vb:Llive/hms/video/signal/init/VB;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/init/ServerConfiguration;Ljava/util/List;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/VB;ILjava/lang/Object;)Llive/hms/video/signal/init/ServerConfiguration;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Llive/hms/video/signal/init/ServerConfiguration;->enabledFlags:Ljava/util/List;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Llive/hms/video/signal/init/ServerConfiguration;->networkHealth:Llive/hms/video/signal/init/NetworkHealth;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Llive/hms/video/signal/init/ServerConfiguration;->publishStats:Llive/hms/video/signal/init/Stats;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Llive/hms/video/signal/init/ServerConfiguration;->subscribeStats:Llive/hms/video/signal/init/Stats;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Llive/hms/video/signal/init/ServerConfiguration;->vb:Llive/hms/video/signal/init/VB;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Llive/hms/video/signal/init/ServerConfiguration;->copy(Ljava/util/List;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/VB;)Llive/hms/video/signal/init/ServerConfiguration;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/init/ServerConfiguration;->enabledFlags:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Llive/hms/video/signal/init/NetworkHealth;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/ServerConfiguration;->networkHealth:Llive/hms/video/signal/init/NetworkHealth;

    return-object v0
.end method

.method public final component3()Llive/hms/video/signal/init/Stats;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/ServerConfiguration;->publishStats:Llive/hms/video/signal/init/Stats;

    return-object v0
.end method

.method public final component4()Llive/hms/video/signal/init/Stats;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/ServerConfiguration;->subscribeStats:Llive/hms/video/signal/init/Stats;

    return-object v0
.end method

.method public final component5()Llive/hms/video/signal/init/VB;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/ServerConfiguration;->vb:Llive/hms/video/signal/init/VB;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/VB;)Llive/hms/video/signal/init/ServerConfiguration;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Llive/hms/video/signal/init/NetworkHealth;",
            "Llive/hms/video/signal/init/Stats;",
            "Llive/hms/video/signal/init/Stats;",
            "Llive/hms/video/signal/init/VB;",
            ")",
            "Llive/hms/video/signal/init/ServerConfiguration;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/signal/init/ServerConfiguration;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/init/ServerConfiguration;-><init>(Ljava/util/List;Llive/hms/video/signal/init/NetworkHealth;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/Stats;Llive/hms/video/signal/init/VB;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/init/ServerConfiguration;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/init/ServerConfiguration;

    iget-object v1, p0, Llive/hms/video/signal/init/ServerConfiguration;->enabledFlags:Ljava/util/List;

    iget-object v3, p1, Llive/hms/video/signal/init/ServerConfiguration;->enabledFlags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/signal/init/ServerConfiguration;->networkHealth:Llive/hms/video/signal/init/NetworkHealth;

    iget-object v3, p1, Llive/hms/video/signal/init/ServerConfiguration;->networkHealth:Llive/hms/video/signal/init/NetworkHealth;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/signal/init/ServerConfiguration;->publishStats:Llive/hms/video/signal/init/Stats;

    iget-object v3, p1, Llive/hms/video/signal/init/ServerConfiguration;->publishStats:Llive/hms/video/signal/init/Stats;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/signal/init/ServerConfiguration;->subscribeStats:Llive/hms/video/signal/init/Stats;

    iget-object v3, p1, Llive/hms/video/signal/init/ServerConfiguration;->subscribeStats:Llive/hms/video/signal/init/Stats;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/signal/init/ServerConfiguration;->vb:Llive/hms/video/signal/init/VB;

    iget-object p1, p1, Llive/hms/video/signal/init/ServerConfiguration;->vb:Llive/hms/video/signal/init/VB;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getEnabledFlags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/init/ServerConfiguration;->enabledFlags:Ljava/util/List;

    return-object v0
.end method

.method public final getNetworkHealth()Llive/hms/video/signal/init/NetworkHealth;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/ServerConfiguration;->networkHealth:Llive/hms/video/signal/init/NetworkHealth;

    return-object v0
.end method

.method public final getPublishStats()Llive/hms/video/signal/init/Stats;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/ServerConfiguration;->publishStats:Llive/hms/video/signal/init/Stats;

    return-object v0
.end method

.method public final getSubscribeStats()Llive/hms/video/signal/init/Stats;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/ServerConfiguration;->subscribeStats:Llive/hms/video/signal/init/Stats;

    return-object v0
.end method

.method public final getVb()Llive/hms/video/signal/init/VB;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/init/ServerConfiguration;->vb:Llive/hms/video/signal/init/VB;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/signal/init/ServerConfiguration;->enabledFlags:Ljava/util/List;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/ServerConfiguration;->networkHealth:Llive/hms/video/signal/init/NetworkHealth;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Llive/hms/video/signal/init/NetworkHealth;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/ServerConfiguration;->publishStats:Llive/hms/video/signal/init/Stats;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Llive/hms/video/signal/init/Stats;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/ServerConfiguration;->subscribeStats:Llive/hms/video/signal/init/Stats;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Llive/hms/video/signal/init/Stats;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/signal/init/ServerConfiguration;->vb:Llive/hms/video/signal/init/VB;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Llive/hms/video/signal/init/VB;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ServerConfiguration(enabledFlags="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/init/ServerConfiguration;->enabledFlags:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", networkHealth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/ServerConfiguration;->networkHealth:Llive/hms/video/signal/init/NetworkHealth;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", publishStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/ServerConfiguration;->publishStats:Llive/hms/video/signal/init/Stats;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subscribeStats="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/ServerConfiguration;->subscribeStats:Llive/hms/video/signal/init/Stats;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", vb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/init/ServerConfiguration;->vb:Llive/hms/video/signal/init/VB;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
