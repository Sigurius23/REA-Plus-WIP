.class public final Lwx1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lwx1/c;",
        "",
        "Lcom/whoop/membership/returns/domain/ReturnsApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lwx1/d;",
        "pdfHandler",
        "<init>",
        "(Lcom/whoop/membership/returns/domain/ReturnsApi;Ltr2/n;Lwx1/d;)V",
        "Lwx1/b;",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Lwx1/a;",
        "upstream",
        "c",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/membership/returns/domain/ReturnsApi;",
        "b",
        "Ltr2/n;",
        "Lwx1/d;",
        "membership_release"
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
.field private final a:Lcom/whoop/membership/returns/domain/ReturnsApi;

.field private final b:Ltr2/n;

.field private final c:Lwx1/d;


# direct methods
.method public constructor <init>(Lcom/whoop/membership/returns/domain/ReturnsApi;Ltr2/n;Lwx1/d;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pdfHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwx1/c;->a:Lcom/whoop/membership/returns/domain/ReturnsApi;

    iput-object p2, p0, Lwx1/c;->b:Ltr2/n;

    iput-object p3, p0, Lwx1/c;->c:Lwx1/d;

    return-void
.end method

.method public static final synthetic a(Lwx1/c;)Lcom/whoop/membership/returns/domain/ReturnsApi;
    .locals 0

    iget-object p0, p0, Lwx1/c;->a:Lcom/whoop/membership/returns/domain/ReturnsApi;

    return-object p0
.end method

.method public static final synthetic b(Lwx1/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lwx1/c;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lwx1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lwx1/c$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwx1/c$c;

    iget v1, v0, Lwx1/c$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwx1/c$c;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lwx1/c$c;

    invoke-direct {v0, p0, p1}, Lwx1/c$c;-><init>(Lwx1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lwx1/c$c;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lwx1/c$c;->z:I

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v10, :cond_1

    iget-object v0, v6, Lwx1/c$c;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lwx1/c;->b:Ltr2/n;

    new-instance v5, Lwx1/c$d;

    invoke-direct {v5, p0, v9}, Lwx1/c$d;-><init>(Lwx1/c;Lq83/d;)V

    iput p1, v6, Lwx1/c$c;->z:I

    const/4 v3, 0x0

    const-string v4, "Failed to load return details"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v1, p1, Lu02/a$c;

    if-eqz v1, :cond_6

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/membership/returns/domain/models/ReturnResponse;

    iget-object v1, p0, Lwx1/c;->c:Lwx1/d;

    iput-object v9, v6, Lwx1/c$c;->w:Ljava/lang/Object;

    iput v10, v6, Lwx1/c$c;->z:I

    invoke-static {p1, v1, v6}, Lcom/whoop/membership/returns/domain/models/ReturnDomainMapperKt;->toReturnDomainHolder(Lcom/whoop/membership/returns/domain/models/ReturnResponse;Lwx1/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_3
    return-object v0

    :cond_5
    :goto_4
    check-cast p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;

    new-instance v0, Lwx1/b$c;

    invoke-direct {v0, p1}, Lwx1/b$c;-><init>(Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;)V

    return-object v0

    :cond_6
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_7

    sget-object p1, Lwx1/b$a;->a:Lwx1/b$a;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final c(Lec3/l;)Lec3/l;
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

    new-instance v0, Lwx1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lwx1/c$a;-><init>(Lq83/d;Lwx1/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
