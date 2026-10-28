.class public final Llive/hms/video/sdk/models/FrameworkInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0008H\u00c6\u0003J5\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00082\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0010\u00a8\u0006\u001b"
    }
    d2 = {
        "Llive/hms/video/sdk/models/FrameworkInfo;",
        "",
        "framework",
        "Llive/hms/video/events/AgentType;",
        "frameworkSdkVersion",
        "",
        "frameworkVersion",
        "isPrebuilt",
        "",
        "<init>",
        "(Llive/hms/video/events/AgentType;Ljava/lang/String;Ljava/lang/String;Z)V",
        "getFramework",
        "()Llive/hms/video/events/AgentType;",
        "getFrameworkSdkVersion",
        "()Ljava/lang/String;",
        "getFrameworkVersion",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
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
.field private final framework:Llive/hms/video/events/AgentType;

.field private final frameworkSdkVersion:Ljava/lang/String;

.field private final frameworkVersion:Ljava/lang/String;

.field private final isPrebuilt:Z


# direct methods
.method public constructor <init>(Llive/hms/video/events/AgentType;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "framework"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->framework:Llive/hms/video/events/AgentType;

    .line 3
    iput-object p2, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkSdkVersion:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkVersion:Ljava/lang/String;

    .line 5
    iput-boolean p4, p0, Llive/hms/video/sdk/models/FrameworkInfo;->isPrebuilt:Z

    return-void
.end method

.method public synthetic constructor <init>(Llive/hms/video/events/AgentType;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    move-object p3, v0

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/FrameworkInfo;-><init>(Llive/hms/video/events/AgentType;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/FrameworkInfo;Llive/hms/video/events/AgentType;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Llive/hms/video/sdk/models/FrameworkInfo;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->framework:Llive/hms/video/events/AgentType;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkSdkVersion:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkVersion:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Llive/hms/video/sdk/models/FrameworkInfo;->isPrebuilt:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/FrameworkInfo;->copy(Llive/hms/video/events/AgentType;Ljava/lang/String;Ljava/lang/String;Z)Llive/hms/video/sdk/models/FrameworkInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/events/AgentType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/FrameworkInfo;->framework:Llive/hms/video/events/AgentType;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkSdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/FrameworkInfo;->isPrebuilt:Z

    return v0
.end method

.method public final copy(Llive/hms/video/events/AgentType;Ljava/lang/String;Ljava/lang/String;Z)Llive/hms/video/sdk/models/FrameworkInfo;
    .locals 1

    const-string v0, "framework"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/models/FrameworkInfo;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/FrameworkInfo;-><init>(Llive/hms/video/events/AgentType;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/FrameworkInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/FrameworkInfo;

    iget-object v1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->framework:Llive/hms/video/events/AgentType;

    iget-object v3, p1, Llive/hms/video/sdk/models/FrameworkInfo;->framework:Llive/hms/video/events/AgentType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkSdkVersion:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkSdkVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkVersion:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkVersion:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->isPrebuilt:Z

    iget-boolean p1, p1, Llive/hms/video/sdk/models/FrameworkInfo;->isPrebuilt:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getFramework()Llive/hms/video/events/AgentType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/FrameworkInfo;->framework:Llive/hms/video/events/AgentType;

    return-object v0
.end method

.method public final getFrameworkSdkVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkSdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getFrameworkVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/FrameworkInfo;->framework:Llive/hms/video/events/AgentType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkSdkVersion:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkVersion:Ljava/lang/String;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->isPrebuilt:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isPrebuilt()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/FrameworkInfo;->isPrebuilt:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FrameworkInfo(framework="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->framework:Llive/hms/video/events/AgentType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", frameworkSdkVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkSdkVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", frameworkVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->frameworkVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isPrebuilt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/FrameworkInfo;->isPrebuilt:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
