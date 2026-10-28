.class public final Lj92/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj92/n$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Lj92/n;",
        "Lud3/g0;",
        "Lj92/m;",
        "rateLimitingHelper",
        "<init>",
        "(Lj92/m;)V",
        "Lud3/o0;",
        "request",
        "Lud3/x0;",
        "a",
        "(Lud3/o0;)Lud3/x0;",
        "Lud3/f0;",
        "chain",
        "intercept",
        "(Lud3/f0;)Lud3/x0;",
        "w",
        "Lj92/m;",
        "Ltr2/n;",
        "x",
        "Ltr2/n;",
        "log",
        "y",
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


# static fields
.field public static final y:Lj92/n$a;

.field private static final z:Lud3/a1;


# instance fields
.field private final w:Lj92/m;

.field private final x:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj92/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj92/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lj92/n;->y:Lj92/n$a;

    sget-object v0, Lud3/a1;->x:Lud3/z0;

    const-string v0, "API calls rate limited by the server."

    invoke-static {v0, v1}, Ldt/b;->k(Ljava/lang/String;Lud3/h0;)Lud3/z0;

    move-result-object v0

    sput-object v0, Lj92/n;->z:Lud3/a1;

    return-void
.end method

.method public constructor <init>(Lj92/m;)V
    .locals 1

    const-string v0, "rateLimitingHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj92/n;->w:Lj92/m;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "RateLimitingInterceptor"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lj92/n;->x:Ltr2/n;

    return-void
.end method

.method private final a(Lud3/o0;)Lud3/x0;
    .locals 20

    sget-object v0, Lud3/a1;->x:Lud3/z0;

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    const-string v1, "request"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lud3/m0;->z:Lud3/m0;

    sget-object v9, Lj92/n;->z:Lud3/a1;

    const-string v1, "body"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v8

    new-instance v2, Lud3/x0;

    const-string v5, "API calls rate limited by the server."

    const/16 v6, 0x1ad

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    sget-object v19, Lud3/d1;->A:Lud3/t;

    invoke-direct/range {v2 .. v19}, Lud3/x0;-><init>(Lud3/o0;Lud3/m0;Ljava/lang/String;ILud3/c0;Lud3/d0;Lud3/a1;Lne3/o0;Lud3/x0;Lud3/x0;Lud3/x0;JJLzd3/g;Lud3/d1;)V

    return-object v2
.end method


# virtual methods
.method public intercept(Lud3/f0;)Lud3/x0;
    .locals 9

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    iget-object v1, p0, Lj92/n;->w:Lj92/m;

    invoke-virtual {v1}, Lj92/m;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lj92/n;->a(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1, v0}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    iget-object v0, p1, Lud3/x0;->F:Lud3/d0;

    iget v1, p1, Lud3/x0;->z:I

    const/16 v2, 0x1ad

    if-ne v1, v2, :cond_8

    sget-object v1, Lor2/b;->w:Lor2/b;

    invoke-virtual {v1}, Lor2/b;->a()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    invoke-virtual {v1}, Lor2/b;->b()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget-object v3, p0, Lj92/n;->x:Ltr2/n;

    invoke-virtual {v0}, Lud3/d0;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    new-array v6, v5, [Lqr2/a$a;

    invoke-interface {v3, v4, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v0}, Lud3/d0;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v3, ""

    :cond_1
    :goto_0
    move-object v4, v0

    check-cast v4, La0/i1;

    invoke-virtual {v4}, La0/i1;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v4}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v6, v4, Ll83/k;->w:Ljava/lang/Object;

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    const v8, 0xdfcb82f

    if-eq v7, v8, :cond_5

    const v8, 0x46cf5a74

    if-eq v7, v8, :cond_4

    const v8, 0x47222c08

    if-eq v7, v8, :cond_2

    goto :goto_0

    :cond_2
    const-string v7, "X-RateLimit-Reset"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_0

    :cond_3
    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    goto :goto_0

    :cond_4
    const-string v7, "X-RateLimit-Limit"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move-object v3, v4

    check-cast v3, Ljava/lang/String;

    goto :goto_0

    :cond_5
    const-string v7, "X-RateLimit-Remaining"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_0

    :cond_6
    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    goto :goto_0

    :cond_7
    new-instance v0, Lj92/o;

    invoke-direct {v0, v3, v2, v1}, Lj92/o;-><init>(Ljava/lang/String;II)V

    iget-object v1, p0, Lj92/n;->x:Ltr2/n;

    invoke-virtual {v0}, Lj92/o;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v5, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lj92/n;->x:Ltr2/n;

    const-string v2, "Setting Rate limited to true"

    new-array v3, v5, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lj92/n;->w:Lj92/m;

    invoke-virtual {v0}, Lj92/o;->a()I

    move-result v0

    invoke-virtual {v1, v0}, Lj92/m;->b(I)V

    sget-object v0, Lor2/b;->w:Lor2/b;

    invoke-virtual {v0}, Lor2/b;->c()V

    :cond_8
    return-object p1
.end method
