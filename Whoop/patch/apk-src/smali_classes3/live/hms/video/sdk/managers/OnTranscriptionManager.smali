.class public final Llive/hms/video/sdk/managers/OnTranscriptionManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/IManager;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/managers/IManager<",
        "Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R#\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/OnTranscriptionManager;",
        "Llive/hms/video/sdk/managers/IManager;",
        "Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "Lkotlin/Function1;",
        "Llive/hms/video/sdk/transcripts/HmsTranscripts;",
        "Ll83/a0;",
        "onTranscript",
        "<init>",
        "(Llive/hms/video/sdk/SDKStore;Lkotlin/jvm/functions/Function1;)V",
        "params",
        "",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "manage",
        "(Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;)Ljava/util/List;",
        "Llive/hms/video/sdk/SDKStore;",
        "getStore",
        "()Llive/hms/video/sdk/SDKStore;",
        "Lkotlin/jvm/functions/Function1;",
        "getOnTranscript",
        "()Lkotlin/jvm/functions/Function1;",
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
.field private final onTranscript:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKStore;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKStore;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTranscript"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/OnTranscriptionManager;->store:Llive/hms/video/sdk/SDKStore;

    iput-object p2, p0, Llive/hms/video/sdk/managers/OnTranscriptionManager;->onTranscript:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final getOnTranscript()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/managers/OnTranscriptionManager;->onTranscript:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/OnTranscriptionManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public bridge synthetic manage(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/OnTranscriptionManager;->manage(Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public manage(Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {v0}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$OnBroadcast;->getInfo()Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$BroadcastInfo;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-class v1, Llive/hms/video/sdk/transcripts/HmsTranscripts;

    invoke-virtual {v0, p1, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/transcripts/HmsTranscripts;

    .line 3
    invoke-virtual {p1}, Llive/hms/video/sdk/transcripts/HmsTranscripts;->getTranscripts()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/transcripts/HmsTranscript;

    .line 5
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTranscriptionManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {v1, v2}, Llive/hms/video/sdk/transcripts/HmsTranscript;->setStore$lib_release(Llive/hms/video/sdk/SDKStore;)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Llive/hms/video/sdk/managers/OnTranscriptionManager;->onTranscript:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method
