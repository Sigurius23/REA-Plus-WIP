.class public final Lym0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001b\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lym0/a;",
        "",
        "Lmm0/a;",
        "cache",
        "Lvm0/g;",
        "reporter",
        "<init>",
        "(Lmm0/a;Lvm0/g;)V",
        "",
        "uri",
        "Lym0/b;",
        "d",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "c",
        "(Ljava/lang/String;)Lec3/l;",
        "a",
        "Lmm0/a;",
        "b",
        "Lvm0/g;",
        "cache_release"
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
.field private final a:Lmm0/a;

.field private final b:Lvm0/g;


# direct methods
.method public constructor <init>(Lmm0/a;Lvm0/g;)V
    .locals 1

    const-string v0, "cache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lym0/a;->a:Lmm0/a;

    iput-object p2, p0, Lym0/a;->b:Lvm0/g;

    return-void
.end method

.method public static final synthetic a(Lym0/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lym0/a;->d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lym0/a;)Lvm0/g;
    .locals 0

    iget-object p0, p0, Lym0/a;->b:Lvm0/g;

    return-object p0
.end method

.method private final d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lym0/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lym0/a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lym0/a$b;

    iget v1, v0, Lym0/a$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lym0/a$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lym0/a$b;

    invoke-direct {v0, p0, p2}, Lym0/a$b;-><init>(Lym0/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lym0/a$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lym0/a$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lym0/a$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lym0/a;->a:Lmm0/a;

    iput-object p1, v0, Lym0/a$b;->w:Ljava/lang/Object;

    iput v3, v0, Lym0/a$b;->z:I

    invoke-interface {p2, p1, v0}, Lmm0/a;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lmm0/b;

    if-eqz p2, :cond_4

    new-instance p1, Lym0/b$a;

    invoke-direct {p1, p2}, Lym0/b$a;-><init>(Lmm0/b;)V

    return-object p1

    :cond_4
    new-instance p2, Lym0/b$b;

    invoke-direct {p2, p1}, Lym0/b$b;-><init>(Ljava/lang/String;)V

    return-object p2
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lym0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lym0/a$a;-><init>(Lym0/a;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method
