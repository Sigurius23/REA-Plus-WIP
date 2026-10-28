.class public final Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000c\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;",
        "",
        "Lu02/c;",
        "apiClient",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lu02/c;Ltr2/n;)V",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "Lcom/whoop/network/request/GetApiRequest;",
        "d",
        "(Lcom/whoop/navigation/models/ApiRequest;)Lcom/whoop/network/request/GetApiRequest;",
        "request",
        "Lu02/a;",
        "Lcom/whoop/archv2/model/template/PaginatedListResponse;",
        "c",
        "(Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lu02/c;",
        "b",
        "Ltr2/n;",
        "arch-v2_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lu02/c;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lu02/c;Ltr2/n;)V
    .locals 1

    const-string v0, "apiClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;->a:Lu02/c;

    .line 3
    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lu02/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "GenericLoadMoreInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;-><init>(Lu02/c;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;)Lu02/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;->a:Lu02/c;

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;Lcom/whoop/navigation/models/ApiRequest;)Lcom/whoop/network/request/GetApiRequest;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;->d(Lcom/whoop/navigation/models/ApiRequest;)Lcom/whoop/network/request/GetApiRequest;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lcom/whoop/navigation/models/ApiRequest;)Lcom/whoop/network/request/GetApiRequest;
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object p1

    new-instance v0, Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor$toGetApiRequest$1;

    invoke-direct {v0, p1}, Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor$toGetApiRequest$1;-><init>(La12/a;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/models/ApiRequest;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "Lcom/whoop/archv2/model/template/PaginatedListResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;->b:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Failed to load more at path "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor$a;

    const/4 v2, 0x0

    invoke-direct {v4, p0, p1, v2}, Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor$a;-><init>(Lcom/whoop/archv2/feature/domain/GenericLoadMoreInteractor;Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p2

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
