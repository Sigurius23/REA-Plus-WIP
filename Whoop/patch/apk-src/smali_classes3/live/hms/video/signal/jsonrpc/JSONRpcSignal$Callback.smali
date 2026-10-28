.class final Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/jsonrpc/JSONRpcSignal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Callback"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0082\u0008\u0018\u00002\u00020\u0001B%\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0016\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u001c\u001a\u0004\u0008\u001d\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u000f\u00a8\u0006 "
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;",
        "",
        "Lbc3/s;",
        "",
        "deferred",
        "message",
        "Llive/hms/video/signal/HMSSignalMethod;",
        "method",
        "<init>",
        "(Lbc3/s;Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;)V",
        "component1",
        "()Lbc3/s;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Llive/hms/video/signal/HMSSignalMethod;",
        "copy",
        "(Lbc3/s;Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;)Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lbc3/s;",
        "getDeferred",
        "Ljava/lang/String;",
        "getMessage",
        "Llive/hms/video/signal/HMSSignalMethod;",
        "getMethod",
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
.field private final deferred:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field

.field private final message:Ljava/lang/String;

.field private final method:Llive/hms/video/signal/HMSSignalMethod;


# direct methods
.method public constructor <init>(Lbc3/s;Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/s;",
            "Ljava/lang/String;",
            "Llive/hms/video/signal/HMSSignalMethod;",
            ")V"
        }
    .end annotation

    const-string v0, "deferred"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->deferred:Lbc3/s;

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->message:Ljava/lang/String;

    iput-object p3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->method:Llive/hms/video/signal/HMSSignalMethod;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;Lbc3/s;Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;ILjava/lang/Object;)Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->deferred:Lbc3/s;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->message:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->method:Llive/hms/video/signal/HMSSignalMethod;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->copy(Lbc3/s;Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;)Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lbc3/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc3/s;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->deferred:Lbc3/s;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Llive/hms/video/signal/HMSSignalMethod;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->method:Llive/hms/video/signal/HMSSignalMethod;

    return-object v0
.end method

.method public final copy(Lbc3/s;Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;)Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/s;",
            "Ljava/lang/String;",
            "Llive/hms/video/signal/HMSSignalMethod;",
            ")",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;"
        }
    .end annotation

    const-string v0, "deferred"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;-><init>(Lbc3/s;Ljava/lang/String;Llive/hms/video/signal/HMSSignalMethod;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->deferred:Lbc3/s;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->deferred:Lbc3/s;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->message:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->message:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->method:Llive/hms/video/signal/HMSSignalMethod;

    iget-object p1, p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->method:Llive/hms/video/signal/HMSSignalMethod;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDeferred()Lbc3/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc3/s;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->deferred:Lbc3/s;

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getMethod()Llive/hms/video/signal/HMSSignalMethod;
    .locals 1

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->method:Llive/hms/video/signal/HMSSignalMethod;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->deferred:Lbc3/s;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->message:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->method:Llive/hms/video/signal/HMSSignalMethod;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Callback(deferred="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->deferred:Lbc3/s;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$Callback;->method:Llive/hms/video/signal/HMSSignalMethod;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
