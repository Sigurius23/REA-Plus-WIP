.class public final Ln92/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iterable/iterableapi/f2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln92/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u000fB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Ln92/h;",
        "Lcom/iterable/iterableapi/f2;",
        "Liy1/c;",
        "metricWriter",
        "Lcom/whoop/domain/model/WhoopUriParser;",
        "whoopUriParser",
        "Lj92/t;",
        "topPrivateDomainHelper",
        "<init>",
        "(Liy1/c;Lcom/whoop/domain/model/WhoopUriParser;Lj92/t;)V",
        "Landroid/net/Uri;",
        "uri",
        "Lcom/iterable/iterableapi/d;",
        "actionContext",
        "",
        "a",
        "(Landroid/net/Uri;Lcom/iterable/iterableapi/d;)Z",
        "Liy1/c;",
        "b",
        "Lcom/whoop/domain/model/WhoopUriParser;",
        "c",
        "Lj92/t;",
        "d",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Ln92/h$a;

.field public static final e:I


# instance fields
.field private final a:Liy1/c;

.field private final b:Lcom/whoop/domain/model/WhoopUriParser;

.field private final c:Lj92/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln92/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln92/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ln92/h;->d:Ln92/h$a;

    const/16 v0, 0x8

    sput v0, Ln92/h;->e:I

    return-void
.end method

.method public constructor <init>(Liy1/c;Lcom/whoop/domain/model/WhoopUriParser;Lj92/t;)V
    .locals 1

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopUriParser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topPrivateDomainHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln92/h;->a:Liy1/c;

    .line 3
    iput-object p2, p0, Ln92/h;->b:Lcom/whoop/domain/model/WhoopUriParser;

    .line 4
    iput-object p3, p0, Ln92/h;->c:Lj92/t;

    return-void
.end method

.method public synthetic constructor <init>(Liy1/c;Lcom/whoop/domain/model/WhoopUriParser;Lj92/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    sget-object p2, Lcom/whoop/domain/model/WhoopUriParser;->Companion:Lcom/whoop/domain/model/WhoopUriParser$Companion;

    invoke-virtual {p2}, Lcom/whoop/domain/model/WhoopUriParser$Companion;->parser()Lcom/whoop/domain/model/WhoopUriParser;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 6
    new-instance p3, Lj92/t;

    invoke-direct {p3}, Lj92/t;-><init>()V

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ln92/h;-><init>(Liy1/c;Lcom/whoop/domain/model/WhoopUriParser;Lj92/t;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;Lcom/iterable/iterableapi/d;)Z
    .locals 9

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln92/b;->q:Ln92/b$a;

    invoke-virtual {v0, p2}, Ln92/b$a;->b(Lcom/iterable/iterableapi/d;)Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ln92/h;->d:Ln92/h$a;

    iget-object v1, p0, Ln92/h;->c:Lj92/t;

    iget-object v2, p0, Ln92/h;->b:Lcom/whoop/domain/model/WhoopUriParser;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Ln92/h$a;->a(Lj92/t;Lcom/whoop/domain/model/WhoopUriParser;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljy1/a;

    const-string v2, "medium:"

    invoke-static {v2, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v2, "scheme:"

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "intent:"

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {p2, p1, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "iterable.message.url.click"

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Ln92/h;->a:Liy1/c;

    invoke-interface {p1, v1}, Liy1/c;->b(Ljy1/a;)V

    const/4 p1, 0x0

    return p1
.end method
