.class public final Llive/hms/video/sdk/models/HMSHLSStreamingState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\"\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u000bH\u00c6\u0003JL\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u001c\u0008\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\'\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006#"
    }
    d2 = {
        "Llive/hms/video/sdk/models/HMSHLSStreamingState;",
        "",
        "running",
        "",
        "variants",
        "Lkotlin/collections/ArrayList;",
        "Llive/hms/video/sdk/models/HMSHLSVariant;",
        "Ljava/util/ArrayList;",
        "error",
        "Llive/hms/video/error/HMSException;",
        "state",
        "Llive/hms/video/sdk/models/enums/HMSStreamingState;",
        "<init>",
        "(ZLjava/util/ArrayList;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSStreamingState;)V",
        "getRunning",
        "()Z",
        "getVariants",
        "()Ljava/util/ArrayList;",
        "Ljava/util/ArrayList;",
        "getError",
        "()Llive/hms/video/error/HMSException;",
        "getState",
        "()Llive/hms/video/sdk/models/enums/HMSStreamingState;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(ZLjava/util/ArrayList;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSStreamingState;)Llive/hms/video/sdk/models/HMSHLSStreamingState;",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final error:Llive/hms/video/error/HMSException;

.field private final running:Z

.field private final state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

.field private final variants:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSHLSVariant;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLjava/util/ArrayList;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSStreamingState;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSHLSVariant;",
            ">;",
            "Llive/hms/video/error/HMSException;",
            "Llive/hms/video/sdk/models/enums/HMSStreamingState;",
            ")V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->running:Z

    iput-object p2, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->variants:Ljava/util/ArrayList;

    iput-object p3, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->error:Llive/hms/video/error/HMSException;

    iput-object p4, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/HMSHLSStreamingState;ZLjava/util/ArrayList;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSStreamingState;ILjava/lang/Object;)Llive/hms/video/sdk/models/HMSHLSStreamingState;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->running:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->variants:Ljava/util/ArrayList;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->error:Llive/hms/video/error/HMSException;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/HMSHLSStreamingState;->copy(ZLjava/util/ArrayList;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSStreamingState;)Llive/hms/video/sdk/models/HMSHLSStreamingState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->running:Z

    return v0
.end method

.method public final component2()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSHLSVariant;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->variants:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final component3()Llive/hms/video/error/HMSException;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->error:Llive/hms/video/error/HMSException;

    return-object v0
.end method

.method public final component4()Llive/hms/video/sdk/models/enums/HMSStreamingState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-object v0
.end method

.method public final copy(ZLjava/util/ArrayList;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSStreamingState;)Llive/hms/video/sdk/models/HMSHLSStreamingState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSHLSVariant;",
            ">;",
            "Llive/hms/video/error/HMSException;",
            "Llive/hms/video/sdk/models/enums/HMSStreamingState;",
            ")",
            "Llive/hms/video/sdk/models/HMSHLSStreamingState;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/models/HMSHLSStreamingState;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/HMSHLSStreamingState;-><init>(ZLjava/util/ArrayList;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSStreamingState;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/HMSHLSStreamingState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/HMSHLSStreamingState;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->running:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/HMSHLSStreamingState;->running:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->variants:Ljava/util/ArrayList;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSHLSStreamingState;->variants:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->error:Llive/hms/video/error/HMSException;

    iget-object v3, p1, Llive/hms/video/sdk/models/HMSHLSStreamingState;->error:Llive/hms/video/error/HMSException;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    iget-object p1, p1, Llive/hms/video/sdk/models/HMSHLSStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getError()Llive/hms/video/error/HMSException;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->error:Llive/hms/video/error/HMSException;

    return-object v0
.end method

.method public final getRunning()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->running:Z

    return v0
.end method

.method public final getState()Llive/hms/video/sdk/models/enums/HMSStreamingState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    return-object v0
.end method

.method public final getVariants()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSHLSVariant;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->variants:Ljava/util/ArrayList;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->running:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->variants:Ljava/util/ArrayList;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->error:Llive/hms/video/error/HMSException;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSHLSStreamingState(running="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->running:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", variants="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->variants:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->error:Llive/hms/video/error/HMSException;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/HMSHLSStreamingState;->state:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
