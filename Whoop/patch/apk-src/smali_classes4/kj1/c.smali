.class public final Lkj1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lkj1/c;",
        "",
        "Lpj1/b;",
        "healthConnectRepository",
        "Lhj1/a;",
        "analyticsHelper",
        "<init>",
        "(Lpj1/b;Lhj1/a;)V",
        "Lkj1/b;",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "d",
        "()Lkj1/b;",
        "Lec3/l;",
        "Lkj1/a;",
        "upstream",
        "e",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lpj1/b;",
        "b",
        "Lhj1/a;",
        "health-connect_release"
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
.field private final a:Lpj1/b;

.field private final b:Lhj1/a;


# direct methods
.method public constructor <init>(Lpj1/b;Lhj1/a;)V
    .locals 1

    const-string v0, "healthConnectRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkj1/c;->a:Lpj1/b;

    iput-object p2, p0, Lkj1/c;->b:Lhj1/a;

    return-void
.end method

.method public static final synthetic a(Lkj1/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lkj1/c;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lkj1/c;)Lkj1/b;
    .locals 0

    invoke-direct {p0}, Lkj1/c;->d()Lkj1/b;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lkj1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lkj1/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lkj1/c$a;

    iget v1, v0, Lkj1/c$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkj1/c$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkj1/c$a;

    invoke-direct {v0, p0, p1}, Lkj1/c$a;-><init>(Lkj1/c;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lkj1/c$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkj1/c$a;->F:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean v1, v0, Lkj1/c$a;->y:Z

    iget-object v0, v0, Lkj1/c$a;->w:Ljava/lang/Object;

    check-cast v0, Lpj1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lkj1/c$a;->x:I

    iget-object v4, v0, Lkj1/c$a;->w:Ljava/lang/Object;

    check-cast v4, Lpj1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget v2, v0, Lkj1/c$a;->x:I

    iget-object v5, v0, Lkj1/c$a;->w:Ljava/lang/Object;

    check-cast v5, Lpj1/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lkj1/c;->a:Lpj1/b;

    iput-object p1, v0, Lkj1/c$a;->w:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lkj1/c$a;->x:I

    iput v5, v0, Lkj1/c$a;->F:I

    invoke-virtual {p1, v0}, Lpj1/b;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_5

    goto :goto_3

    :cond_5
    move-object v7, v5

    move-object v5, p1

    move-object p1, v7

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const-string v6, "Settings"

    if-eqz p1, :cond_8

    iget-object p1, p0, Lkj1/c;->b:Lhj1/a;

    invoke-virtual {p1, v6}, Lhj1/a;->d(Ljava/lang/String;)V

    iput-object v5, v0, Lkj1/c$a;->w:Ljava/lang/Object;

    iput v2, v0, Lkj1/c$a;->x:I

    iput v4, v0, Lkj1/c$a;->F:I

    invoke-virtual {v5, v0}, Lpj1/b;->r(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object v4, v5

    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v5, 0x0

    iput-object v5, v0, Lkj1/c$a;->w:Ljava/lang/Object;

    iput v2, v0, Lkj1/c$a;->x:I

    iput-boolean p1, v0, Lkj1/c$a;->y:Z

    iput v3, v0, Lkj1/c$a;->F:I

    invoke-virtual {v4, v0}, Lpj1/b;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move v1, p1

    move-object p1, v0

    :goto_4
    check-cast p1, Ljava/util/Set;

    new-instance v0, Lkj1/b$a;

    invoke-direct {v0, v1, p1}, Lkj1/b$a;-><init>(ZLjava/util/Set;)V

    return-object v0

    :cond_8
    iget-object p1, p0, Lkj1/c;->b:Lhj1/a;

    invoke-virtual {p1, v6}, Lhj1/a;->e(Ljava/lang/String;)V

    sget-object p1, Lkj1/b$d;->a:Lkj1/b$d;

    return-object p1
.end method

.method private final d()Lkj1/b;
    .locals 2

    iget-object v0, p0, Lkj1/c;->a:Lpj1/b;

    invoke-virtual {v0}, Lpj1/b;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lkj1/b$d;->a:Lkj1/b$d;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lpj1/b;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lkj1/b$e;->a:Lkj1/b$e;

    return-object v0

    :cond_1
    sget-object v0, Lkj1/b$f;->a:Lkj1/b$f;

    return-object v0
.end method


# virtual methods
.method public final e(Lec3/l;)Lec3/l;
    .locals 1
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

    new-instance v0, Lkj1/c$b;

    invoke-direct {v0, p1, p0}, Lkj1/c$b;-><init>(Lec3/l;Lkj1/c;)V

    return-object v0
.end method
