.class final synthetic Llive/hms/video/sdk/SDKDelegate$join$2$1;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate$join$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "changeSessionMetadata(Ljava/lang/String;Lcom/google/gson/JsonElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v2, 0x0

    const/4 v1, 0x3

    const-class v3, Llive/hms/video/transport/ITransport;

    const-string v5, "changeSessionMetadata"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/google/gson/JsonElement;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/SDKDelegate$join$2$1;->invoke(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/gson/JsonElement;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sessionstore/SetSessionMetadataResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/transport/ITransport;

    invoke-interface {v0, p1, p2, p3}, Llive/hms/video/transport/ITransport;->changeSessionMetadata(Ljava/lang/String;Lcom/google/gson/JsonElement;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
