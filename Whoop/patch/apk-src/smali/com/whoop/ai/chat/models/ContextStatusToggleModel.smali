.class public final Lcom/whoop/ai/chat/models/ContextStatusToggleModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ai/chat/models/ContextStatusToggleModel$$serializer;,
        Lcom/whoop/ai/chat/models/ContextStatusToggleModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u000256B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBM\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!JB\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010*\u001a\u00020)2\u0008\u0010(\u001a\u0004\u0018\u00010\'H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010,\u001a\u0004\u0008.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010/\u001a\u0004\u00080\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00081\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00102\u001a\u0004\u00083\u0010!\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/ai/chat/models/ContextStatusToggleModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "currentState",
        "Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;",
        "activeState",
        "inactiveState",
        "Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;",
        "errorState",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$bot_release",
        "(Lcom/whoop/ai/chat/models/ContextStatusToggleModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;",
        "component4",
        "component5",
        "()Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;)Lcom/whoop/ai/chat/models/ContextStatusToggleModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "getCurrentState",
        "Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;",
        "getActiveState",
        "getInactiveState",
        "Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;",
        "getErrorState",
        "Companion",
        "$serializer",
        "a",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/ai/chat/models/ContextStatusToggleModel$a;


# instance fields
.field private final activeState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

.field private final currentState:Ljava/lang/String;

.field private final errorState:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

.field private final id:Ljava/lang/String;

.field private final inactiveState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->Companion:Lcom/whoop/ai/chat/models/ContextStatusToggleModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/ai/chat/models/ContextStatusToggleModel$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/ContextStatusToggleModel$$serializer;

    invoke-virtual {p7}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->currentState:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->activeState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    iput-object p5, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->inactiveState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    iput-object p6, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->errorState:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inactiveState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->currentState:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->activeState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->inactiveState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->errorState:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/ai/chat/models/ContextStatusToggleModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;ILjava/lang/Object;)Lcom/whoop/ai/chat/models/ContextStatusToggleModel;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->currentState:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->activeState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->inactiveState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->errorState:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;)Lcom/whoop/ai/chat/models/ContextStatusToggleModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$bot_release(Lcom/whoop/ai/chat/models/ContextStatusToggleModel;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->currentState:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel$$serializer;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->activeState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->inactiveState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel$$serializer;->INSTANCE:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel$$serializer;

    iget-object p0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->errorState:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->currentState:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->activeState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->inactiveState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->errorState:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;)Lcom/whoop/ai/chat/models/ContextStatusToggleModel;
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inactiveState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->currentState:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->currentState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->activeState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->activeState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->inactiveState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    iget-object v3, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->inactiveState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->errorState:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

    iget-object p1, p1, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->errorState:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getActiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->activeState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    return-object v0
.end method

.method public final getCurrentState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->currentState:Ljava/lang/String;

    return-object v0
.end method

.method public final getErrorState()Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->errorState:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInactiveState()Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->inactiveState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->currentState:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->activeState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->inactiveState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    invoke-virtual {v0}, Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->errorState:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

    invoke-virtual {v1}, Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->currentState:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->activeState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    iget-object v3, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->inactiveState:Lcom/whoop/ai/chat/models/ContextStatusToggleStateModel;

    iget-object v4, p0, Lcom/whoop/ai/chat/models/ContextStatusToggleModel;->errorState:Lcom/whoop/ai/chat/models/ContextStatusToggleErrorStateModel;

    const-string v5, ", currentState="

    const-string v6, ", activeState="

    const-string v7, "ContextStatusToggleModel(id="

    invoke-static {v7, v0, v5, v1, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inactiveState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errorState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
