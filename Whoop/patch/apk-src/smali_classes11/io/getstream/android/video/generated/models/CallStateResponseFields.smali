.class public final Lio/getstream/android/video/generated/models/CallStateResponseFields;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B;\u0012\u000e\u0008\u0003\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0008\u0003\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J?\u0010\u0016\u001a\u00020\u00002\u000e\u0008\u0003\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0003\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u0008\u0008\u0003\u0010\u0007\u001a\u00020\u00082\n\u0008\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000e\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/CallStateResponseFields;",
        "",
        "members",
        "",
        "Lio/getstream/android/video/generated/models/MemberResponse;",
        "ownCapabilities",
        "Lio/getstream/android/video/generated/models/OwnCapability;",
        "call",
        "Lio/getstream/android/video/generated/models/CallResponse;",
        "membership",
        "(Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V",
        "getCall",
        "()Lio/getstream/android/video/generated/models/CallResponse;",
        "getMembers",
        "()Ljava/util/List;",
        "getMembership",
        "()Lio/getstream/android/video/generated/models/MemberResponse;",
        "getOwnCapabilities",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final call:Lio/getstream/android/video/generated/models/CallResponse;

.field private final members:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final membership:Lio/getstream/android/video/generated/models/MemberResponse;

.field private final ownCapabilities:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/OwnCapability;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "members"
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "own_capabilities"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/CallResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/MemberResponse;
        .annotation runtime Lqx/q;
            name = "membership"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/android/video/generated/models/OwnCapability;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallResponse;",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ")V"
        }
    .end annotation

    const-string v0, "members"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->members:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->ownCapabilities:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->call:Lio/getstream/android/video/generated/models/CallResponse;

    .line 5
    iput-object p4, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    .line 6
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/CallStateResponseFields;-><init>(Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/android/video/generated/models/CallStateResponseFields;Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;ILjava/lang/Object;)Lio/getstream/android/video/generated/models/CallStateResponseFields;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->members:Ljava/util/List;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->ownCapabilities:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->call:Lio/getstream/android/video/generated/models/CallResponse;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/CallStateResponseFields;->copy(Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)Lio/getstream/android/video/generated/models/CallStateResponseFields;

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
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->members:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/OwnCapability;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->ownCapabilities:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lio/getstream/android/video/generated/models/CallResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->call:Lio/getstream/android/video/generated/models/CallResponse;

    return-object v0
.end method

.method public final component4()Lio/getstream/android/video/generated/models/MemberResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)Lio/getstream/android/video/generated/models/CallStateResponseFields;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "members"
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime Lqx/q;
            name = "own_capabilities"
        .end annotation
    .end param
    .param p3    # Lio/getstream/android/video/generated/models/CallResponse;
        .annotation runtime Lqx/q;
            name = "call"
        .end annotation
    .end param
    .param p4    # Lio/getstream/android/video/generated/models/MemberResponse;
        .annotation runtime Lqx/q;
            name = "membership"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/android/video/generated/models/OwnCapability;",
            ">;",
            "Lio/getstream/android/video/generated/models/CallResponse;",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ")",
            "Lio/getstream/android/video/generated/models/CallStateResponseFields;"
        }
    .end annotation

    const-string v0, "members"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/android/video/generated/models/CallStateResponseFields;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/getstream/android/video/generated/models/CallStateResponseFields;-><init>(Ljava/util/List;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/MemberResponse;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/android/video/generated/models/CallStateResponseFields;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/android/video/generated/models/CallStateResponseFields;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->members:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStateResponseFields;->members:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->ownCapabilities:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStateResponseFields;->ownCapabilities:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->call:Lio/getstream/android/video/generated/models/CallResponse;

    iget-object v3, p1, Lio/getstream/android/video/generated/models/CallStateResponseFields;->call:Lio/getstream/android/video/generated/models/CallResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    iget-object p1, p1, Lio/getstream/android/video/generated/models/CallStateResponseFields;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCall()Lio/getstream/android/video/generated/models/CallResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->call:Lio/getstream/android/video/generated/models/CallResponse;

    return-object v0
.end method

.method public final getMembers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/MemberResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->members:Ljava/util/List;

    return-object v0
.end method

.method public final getMembership()Lio/getstream/android/video/generated/models/MemberResponse;
    .locals 1

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    return-object v0
.end method

.method public final getOwnCapabilities()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/android/video/generated/models/OwnCapability;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->ownCapabilities:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->members:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->ownCapabilities:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->call:Lio/getstream/android/video/generated/models/CallResponse;

    invoke-static {v2, v0, v1}, Lc13/a;->b(Lio/getstream/android/video/generated/models/CallResponse;II)I

    move-result v0

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lio/getstream/android/video/generated/models/MemberResponse;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->members:Ljava/util/List;

    iget-object v1, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->ownCapabilities:Ljava/util/List;

    iget-object v2, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->call:Lio/getstream/android/video/generated/models/CallResponse;

    iget-object v3, p0, Lio/getstream/android/video/generated/models/CallStateResponseFields;->membership:Lio/getstream/android/video/generated/models/MemberResponse;

    const-string v4, ", ownCapabilities="

    const-string v5, ", call="

    const-string v6, "CallStateResponseFields(members="

    invoke-static {v6, v4, v0, v5, v1}, Ly00/t7;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", membership="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
