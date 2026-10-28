.class public final Lcom/whoop/archv2/feature/domain/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lpi0/a;",
        "Lcom/whoop/archv2/feature/domain/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/archv2/feature/domain/l;",
        "Lod1/g;",
        "Lpi0/a;",
        "Lcom/whoop/archv2/feature/domain/f;",
        "Lu02/c;",
        "apiClient",
        "",
        "requestName",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lu02/c;Ljava/lang/String;Ltr2/n;)V",
        "Lcom/whoop/network/request/GetApiRequest;",
        "request",
        "Lec3/l;",
        "g",
        "(Lcom/whoop/network/request/GetApiRequest;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lu02/c;",
        "b",
        "Ljava/lang/String;",
        "c",
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

.field private final b:Ljava/lang/String;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lu02/c;Ljava/lang/String;Ltr2/n;)V
    .locals 1

    const-string v0, "apiClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/archv2/feature/domain/l;->a:Lu02/c;

    .line 3
    iput-object p2, p0, Lcom/whoop/archv2/feature/domain/l;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/whoop/archv2/feature/domain/l;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lu02/c;Ljava/lang/String;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "GenericScreenFetchNoCacheInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/archv2/feature/domain/l;-><init>(Lu02/c;Ljava/lang/String;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lcom/whoop/archv2/feature/domain/l;Lcom/whoop/network/request/GetApiRequest;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/archv2/feature/domain/l;->g(Lcom/whoop/network/request/GetApiRequest;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/archv2/feature/domain/l;)Lu02/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/archv2/feature/domain/l;->a:Lu02/c;

    return-object p0
.end method

.method public static final synthetic e(Lcom/whoop/archv2/feature/domain/l;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/archv2/feature/domain/l;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Lcom/whoop/archv2/feature/domain/l;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/whoop/archv2/feature/domain/l;->b:Ljava/lang/String;

    return-object p0
.end method

.method private final g(Lcom/whoop/network/request/GetApiRequest;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/network/request/GetApiRequest;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/archv2/feature/domain/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/archv2/feature/domain/l$a;-><init>(Lcom/whoop/archv2/feature/domain/l;Lcom/whoop/network/request/GetApiRequest;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/archv2/feature/domain/l$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/whoop/archv2/feature/domain/l$b;-><init>(Lq83/d;Lcom/whoop/archv2/feature/domain/l;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lcom/whoop/archv2/feature/domain/l$c;

    invoke-direct {v0, v1}, Lcom/whoop/archv2/feature/domain/l$c;-><init>(Lq83/d;)V

    new-instance v1, Lec3/a0;

    invoke-direct {v1, v0, p1}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    return-object v1
.end method
