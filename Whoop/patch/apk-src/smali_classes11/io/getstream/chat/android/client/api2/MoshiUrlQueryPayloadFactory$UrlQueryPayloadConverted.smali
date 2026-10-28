.class final Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory$UrlQueryPayloadConverted;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UrlQueryPayloadConverted"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpg3/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory$UrlQueryPayloadConverted;",
        "Lpg3/n;",
        "",
        "",
        "Lqx/l0;",
        "moshi",
        "Ljava/lang/reflect/Type;",
        "type",
        "<init>",
        "(Lqx/l0;Ljava/lang/reflect/Type;)V",
        "value",
        "convert",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "Lqx/l0;",
        "Ljava/lang/reflect/Type;",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final moshi:Lqx/l0;

.field private final type:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Lqx/l0;Ljava/lang/reflect/Type;)V
    .locals 1

    const-string v0, "moshi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory$UrlQueryPayloadConverted;->moshi:Lqx/l0;

    iput-object p2, p0, Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory$UrlQueryPayloadConverted;->type:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public final bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory$UrlQueryPayloadConverted;->convert(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final convert(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory$UrlQueryPayloadConverted;->moshi:Lqx/l0;

    iget-object v1, p0, Lio/getstream/chat/android/client/api2/MoshiUrlQueryPayloadFactory$UrlQueryPayloadConverted;->type:Ljava/lang/reflect/Type;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    sget-object v2, Lrx/f;->a:Ljava/util/Set;

    invoke-virtual {v0, v1, v2}, Lqx/l0;->b(Ljava/lang/reflect/Type;Ljava/util/Set;)Lcom/squareup/moshi/JsonAdapter;

    move-result-object v0

    .line 4
    invoke-virtual {v0, p1}, Lcom/squareup/moshi/JsonAdapter;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toJson(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
