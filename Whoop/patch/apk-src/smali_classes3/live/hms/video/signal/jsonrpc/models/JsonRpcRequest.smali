.class public final Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0080\u0008\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B\u0019\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\nB!\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\r\u00a8\u0006\u001f"
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;",
        "",
        "id",
        "",
        "method",
        "params",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V",
        "Llive/hms/video/signal/HMSSignalMethod;",
        "(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V",
        "(Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V",
        "getId",
        "()Ljava/lang/String;",
        "getMethod",
        "getParams",
        "()Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "version",
        "getVersion",
        "toJson",
        "component1",
        "component2",
        "component3",
        "copy",
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
.field public static final Companion:Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest$Companion;


# instance fields
.field private final id:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private final method:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "method"
    .end annotation
.end field

.field private final params:Llive/hms/video/signal/jsonrpc/models/HMSParams;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "params"
    .end annotation
.end field

.field private final version:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "jsonrpc"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->Companion:Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->method:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    .line 5
    const-string p1, "2.0"

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->version:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p2}, Llive/hms/video/signal/HMSSignalMethod;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V

    return-void
.end method

.method public constructor <init>(Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V
    .locals 1

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const-string v0, ""

    invoke-virtual {p1}, Llive/hms/video/signal/HMSSignalMethod;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1, p2}, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/jsonrpc/models/HMSParams;ILjava/lang/Object;)Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->method:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->copy(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/jsonrpc/models/HMSParams;)Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->method:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Llive/hms/video/signal/jsonrpc/models/HMSParams;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/jsonrpc/models/HMSParams;)Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/signal/jsonrpc/models/HMSParams;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->id:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->method:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->method:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    iget-object p1, p1, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getMethod()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->method:Ljava/lang/String;

    return-object v0
.end method

.method public final getParams()Llive/hms/video/signal/jsonrpc/models/HMSParams;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->method:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toJson()Ljava/lang/String;
    .locals 3

    new-instance v0, Lcom/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/google/gson/JsonObject;-><init>()V

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->id:Ljava/lang/String;

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "id"

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->id:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v1, "method"

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->method:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    invoke-static {v1}, Llive/hms/video/utils/ExtensionUtilsKt;->toJsonObject(Ljava/lang/Object;)Lcom/google/gson/JsonObject;

    move-result-object v1

    const-string v2, "params"

    invoke-virtual {v0, v2, v1}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    const-string v1, "jsonrpc"

    const-string v2, "2.0"

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/JsonObject;->addProperty(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Llive/hms/video/utils/ExtensionUtilsKt;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JsonRpcRequest(id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->method:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", params="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/models/JsonRpcRequest;->params:Llive/hms/video/signal/jsonrpc/models/HMSParams;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
