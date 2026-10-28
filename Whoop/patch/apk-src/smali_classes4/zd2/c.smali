.class public final Lzd2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lzd2/c;",
        "",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/shepherd/domain/ShepherdApi;Ltr2/n;)V",
        "Lzd2/b;",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Lzd2/a;",
        "upstream",
        "d",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "b",
        "Ltr2/n;",
        "shepherd_release"
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
.field private final a:Lcom/whoop/shepherd/domain/ShepherdApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/shepherd/domain/ShepherdApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd2/c;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    iput-object p2, p0, Lzd2/c;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lzd2/c;)Lcom/whoop/shepherd/domain/ShepherdApi;
    .locals 0

    iget-object p0, p0, Lzd2/c;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    return-object p0
.end method

.method public static final synthetic b(Lzd2/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lzd2/c;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lzd2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lzd2/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lzd2/c$a;

    iget v1, v0, Lzd2/c$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzd2/c$a;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lzd2/c$a;

    invoke-direct {v0, p0, p1}, Lzd2/c$a;-><init>(Lzd2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lzd2/c$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lzd2/c$a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lzd2/c;->b:Ltr2/n;

    new-instance v5, Lzd2/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lzd2/c$b;-><init>(Lzd2/c;Lq83/d;)V

    iput p1, v6, Lzd2/c$a;->y:I

    const-string v4, "Failed to fetch Shepherd registration screen"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$b;

    if-eqz v0, :cond_4

    sget-object p1, Lzd2/b$a;->a:Lzd2/b$a;

    return-object p1

    :cond_4
    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_5

    new-instance v0, Lzd2/b$b;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;

    invoke-direct {v0, p1}, Lzd2/b$b;-><init>(Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;)V

    return-object v0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final d(Lec3/l;)Lec3/l;
    .locals 3
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

    sget-object v0, Lzd2/b$c;->a:Lzd2/b$c;

    new-instance v1, Lzd2/c$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lzd2/c$c;-><init>(Lzd2/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
