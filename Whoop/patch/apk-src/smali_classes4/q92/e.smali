.class public final Lq92/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\'\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lq92/e;",
        "",
        "La6/g;",
        "Lf6/f;",
        "dataStore",
        "Lbc3/c0;",
        "scope",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(La6/g;Lbc3/c0;Ltr2/n;)V",
        "",
        "c",
        "()Ljava/lang/String;",
        "signature",
        "Ll83/a0;",
        "d",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "La6/g;",
        "Ltr2/n;",
        "Lec3/f2;",
        "Lec3/f2;",
        "signatureState",
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


# instance fields
.field private final a:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final b:Ltr2/n;

.field private final c:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La6/g;Lbc3/c0;Ltr2/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La6/g;",
            "Lbc3/c0;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq92/e;->a:La6/g;

    .line 3
    iput-object p3, p0, Lq92/e;->b:Ltr2/n;

    .line 4
    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    .line 5
    new-instance p3, Lq92/e$e;

    const/4 v0, 0x0

    invoke-direct {p3, p0, v0}, Lq92/e$e;-><init>(Lq92/e;Lq83/d;)V

    .line 6
    new-instance v1, Lec3/a0;

    invoke-direct {v1, p1, p3}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    .line 7
    new-instance p1, Lq92/e$f;

    invoke-direct {p1, v1}, Lq92/e$f;-><init>(Lec3/l;)V

    .line 8
    sget-object p3, Lec3/z1;->a:Lec3/b2;

    invoke-static {p1, p2, p3, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lq92/e;->c:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(La6/g;Lbc3/c0;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 9
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "StrapSignatureDataStoreHelper"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 10
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lq92/e;-><init>(La6/g;Lbc3/c0;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lq92/e;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lq92/e;->b:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lq92/e$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lq92/e$a;

    iget v1, v0, Lq92/e$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq92/e$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq92/e$a;

    invoke-direct {v0, p0, p1}, Lq92/e$a;-><init>(Lq92/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lq92/e$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq92/e$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lq92/e;->a:La6/g;

    new-instance v2, Lq92/e$b;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Lq92/e$b;-><init>(Lq83/d;)V

    iput v3, v0, Lq92/e$a;->y:I

    invoke-static {p1, v2, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    iget-object v0, p0, Lq92/e;->b:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "[StrapSignatureDataStoreHelper] Failed to clear strap signature"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_3
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    throw p1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq92/e;->c:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lq92/e$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lq92/e$c;

    iget v1, v0, Lq92/e$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq92/e$c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq92/e$c;

    invoke-direct {v0, p0, p2}, Lq92/e$c;-><init>(Lq92/e;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lq92/e$c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq92/e$c;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lq92/e$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lq92/e;->a:La6/g;

    new-instance v2, Lq92/e$d;

    const/4 v4, 0x0

    invoke-direct {v2, p1, v4}, Lq92/e$d;-><init>(Ljava/lang/String;Lq83/d;)V

    iput-object v4, v0, Lq92/e$c;->w:Ljava/lang/Object;

    iput v3, v0, Lq92/e$c;->z:I

    invoke-static {p2, v2, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    iget-object p2, p0, Lq92/e;->b:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "[StrapSignatureDataStoreHelper] Failed to save strap signature"

    invoke-interface {p2, v1, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_3
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->o(Lq83/j;)V

    throw p1
.end method
