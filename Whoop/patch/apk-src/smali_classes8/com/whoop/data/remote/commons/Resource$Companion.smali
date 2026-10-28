.class public final Lcom/whoop/data/remote/commons/Resource$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/remote/commons/Resource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\u0008\u0001\u0010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u0001H\u0006\u00a2\u0006\u0002\u0010\u0008JC\u0010\t\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\u0008\u0001\u0010\u00062\u0006\u0010\n\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u00062\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010J!\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\u0008\u0001\u0010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u0001H\u0006\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/data/remote/commons/Resource$Companion;",
        "",
        "<init>",
        "()V",
        "success",
        "Lcom/whoop/data/remote/commons/Resource;",
        "T",
        "data",
        "(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;",
        "error",
        "errorMessage",
        "",
        "errorCode",
        "",
        "exception",
        "Lcom/whoop/network/exception/DomainException;",
        "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;)Lcom/whoop/data/remote/commons/Resource;",
        "loading",
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
    invoke-direct {p0}, Lcom/whoop/data/remote/commons/Resource$Companion;-><init>()V

    return-void
.end method

.method public static synthetic error$default(Lcom/whoop/data/remote/commons/Resource$Companion;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;ILjava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/data/remote/commons/Resource$Companion;->error(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;)Lcom/whoop/data/remote/commons/Resource;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final error(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Lcom/whoop/network/exception/DomainException;)Lcom/whoop/data/remote/commons/Resource;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "TT;",
            "Lcom/whoop/network/exception/DomainException;",
            ")",
            "Lcom/whoop/data/remote/commons/Resource<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "errorMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/commons/Resource;

    sget-object v2, Lcom/whoop/data/remote/commons/Status;->ERROR:Lcom/whoop/data/remote/commons/Status;

    move-object v4, p1

    move-object v5, p2

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/whoop/data/remote/commons/Resource;-><init>(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;)V

    return-object v1
.end method

.method public final loading(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/whoop/data/remote/commons/Resource<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/data/remote/commons/Resource;

    sget-object v1, Lcom/whoop/data/remote/commons/Status;->LOADING:Lcom/whoop/data/remote/commons/Status;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Lcom/whoop/data/remote/commons/Resource;-><init>(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final success(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/Resource;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lcom/whoop/data/remote/commons/Resource<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/data/remote/commons/Resource;

    sget-object v1, Lcom/whoop/data/remote/commons/Status;->SUCCESS:Lcom/whoop/data/remote/commons/Status;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-direct/range {v0 .. v7}, Lcom/whoop/data/remote/commons/Resource;-><init>(Lcom/whoop/data/remote/commons/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/network/exception/DomainException;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
