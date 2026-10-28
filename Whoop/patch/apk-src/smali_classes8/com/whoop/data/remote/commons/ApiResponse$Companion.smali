.class public final Lcom/whoop/data/remote/commons/ApiResponse$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/remote/commons/ApiResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\u0008\u0001\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u001f\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\t\"\u0004\u0008\u0001\u0010\u00062\u0006\u0010\n\u001a\u0002H\u0006\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/data/remote/commons/ApiResponse$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/whoop/data/remote/commons/ApiErrorResponse;",
        "T",
        "error",
        "",
        "Lcom/whoop/data/remote/commons/ApiResponse;",
        "data",
        "(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/ApiResponse;",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/data/remote/commons/ApiResponse$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Throwable;)Lcom/whoop/data/remote/commons/ApiErrorResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Throwable;",
            ")",
            "Lcom/whoop/data/remote/commons/ApiErrorResponse<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lcom/whoop/data/remote/commons/ApiErrorResponse;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "unknown error"

    :cond_0
    invoke-direct {v0, p1}, Lcom/whoop/data/remote/commons/ApiErrorResponse;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final create(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/ApiResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/whoop/data/remote/commons/ApiResponse<",
            "TT;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/whoop/data/remote/commons/ApiSuccessResponse;

    invoke-direct {v0, p1}, Lcom/whoop/data/remote/commons/ApiSuccessResponse;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
