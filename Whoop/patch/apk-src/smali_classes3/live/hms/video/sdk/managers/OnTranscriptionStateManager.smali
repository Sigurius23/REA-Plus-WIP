.class public final Llive/hms/video/sdk/managers/OnTranscriptionStateManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/IManager;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/managers/IManager<",
        "Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/OnTranscriptionStateManager;",
        "Llive/hms/video/sdk/managers/IManager;",
        "Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "<init>",
        "(Llive/hms/video/sdk/SDKStore;)V",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "room",
        "params",
        "Ll83/a0;",
        "addTranscriptionToRoom",
        "(Llive/hms/video/sdk/models/HMSRoom;Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;)V",
        "",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "manage",
        "(Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;)Ljava/util/List;",
        "Llive/hms/video/sdk/SDKStore;",
        "getStore",
        "()Llive/hms/video/sdk/SDKStore;",
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
.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKStore;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/OnTranscriptionStateManager;->store:Llive/hms/video/sdk/SDKStore;

    return-void
.end method

.method private final addTranscriptionToRoom(Llive/hms/video/sdk/models/HMSRoom;Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;)V
    .locals 4

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRoom;->get_transcriptions$lib_release()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Llive/hms/video/sdk/models/Transcriptions;

    invoke-virtual {v2}, Llive/hms/video/sdk/models/Transcriptions;->getMode()Llive/hms/video/sdk/models/TranscriptionsMode;

    move-result-object v2

    invoke-virtual {p2}, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;->getMode()Llive/hms/video/sdk/models/TranscriptionsMode;

    move-result-object v3

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Llive/hms/video/sdk/models/Transcriptions;

    if-nez v1, :cond_2

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRoom;->get_transcriptions$lib_release()Ljava/util/List;

    move-result-object p1

    new-instance v0, Llive/hms/video/sdk/models/Transcriptions;

    invoke-direct {v0}, Llive/hms/video/sdk/models/Transcriptions;-><init>()V

    invoke-virtual {v0, p2}, Llive/hms/video/sdk/models/Transcriptions;->update$lib_release(Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    invoke-virtual {v1, p2}, Llive/hms/video/sdk/models/Transcriptions;->update$lib_release(Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;)V

    return-void
.end method


# virtual methods
.method public getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/OnTranscriptionStateManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public bridge synthetic manage(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/OnTranscriptionStateManager;->manage(Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public manage(Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/OnTranscriptionStateManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/sdk/SDKStore;->get_room()Llive/hms/video/sdk/models/HMSRoom;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-direct {p0, v1, p1}, Llive/hms/video/sdk/managers/OnTranscriptionStateManager;->addTranscriptionToRoom(Llive/hms/video/sdk/models/HMSRoom;Llive/hms/video/sdk/models/HMSNotifications$OnTranscriptionUpdate;)V

    .line 5
    new-instance p1, Llive/hms/video/sdk/models/SDKUpdate$Room;

    sget-object v1, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->TRANSCRIPTIONS_UPDATED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-direct {p1, v1}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method
