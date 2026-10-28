.class public final Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;
.super Llive/hms/video/signal/jsonrpc/models/HMSParams;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/jsonrpc/models/HMSParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Event"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/signal/jsonrpc/models/HMSParams$Event$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0080\u0008\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012$\u0008\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0005\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J*\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0015\u001a\u00020\tH\u00c6\u0003JH\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032$\u0008\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR4\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0007j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u001f"
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "name",
        "",
        "properties",
        "Lkotlin/collections/HashMap;",
        "",
        "Ljava/util/HashMap;",
        "timestamp",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/util/HashMap;J)V",
        "getName",
        "()Ljava/lang/String;",
        "getProperties",
        "()Ljava/util/HashMap;",
        "Ljava/util/HashMap;",
        "getTimestamp",
        "()J",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/String;Ljava/util/HashMap;J)Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "Companion",
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


# static fields
.field public static final Companion:Llive/hms/video/signal/jsonrpc/models/HMSParams$Event$Companion;


# instance fields
.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final properties:Ljava/util/HashMap;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "info"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final timestamp:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "timestamp"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->Companion:Llive/hms/video/signal/jsonrpc/models/HMSParams$Event$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/HashMap;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;J)V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Llive/hms/video/signal/jsonrpc/models/HMSParams;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->name:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->properties:Ljava/util/HashMap;

    .line 6
    iput-wide p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->timestamp:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/HashMap;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    .line 1
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;-><init>(Ljava/lang/String;Ljava/util/HashMap;J)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;Ljava/lang/String;Ljava/util/HashMap;JILjava/lang/Object;)Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->name:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->properties:Ljava/util/HashMap;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-wide p3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->timestamp:J

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->copy(Ljava/lang/String;Ljava/util/HashMap;J)Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->properties:Ljava/util/HashMap;

    return-object v0
.end method

.method public final component3()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->timestamp:J

    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/HashMap;J)Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;J)",
            "Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "properties"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;-><init>(Ljava/lang/String;Ljava/util/HashMap;J)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->name:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->properties:Ljava/util/HashMap;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->properties:Ljava/util/HashMap;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->timestamp:J

    iget-wide v5, p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->timestamp:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getProperties()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->properties:Ljava/util/HashMap;

    return-object v0
.end method

.method public final getTimestamp()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->timestamp:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->properties:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->timestamp:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Event(name="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", properties="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->properties:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Event;->timestamp:J

    const/16 v3, 0x29

    invoke-static {v0, v1, v2, v3}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
