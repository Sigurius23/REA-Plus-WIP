.class public final Lsh2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh2/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ6\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lsh2/b;",
        "Lsh2/a;",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ltr2/n;)V",
        "Lvk0/e;",
        "Lsh2/c;",
        "c",
        "(Lvk0/e;)Lsh2/c;",
        "",
        "cause",
        "b",
        "(Ljava/lang/Throwable;)Lsh2/c;",
        "Ljk0/d;",
        "strap",
        "",
        "certificate",
        "Lsj2/a;",
        "priority",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onExecuteStart",
        "a",
        "(Ljk0/d;[BLsj2/a;Lc93/a;Lq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "strap-auth_release"
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
.field private final a:Ltr2/n;


# direct methods
.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsh2/b;->a:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "CertificateTransferApi"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lsh2/b;-><init>(Ltr2/n;)V

    return-void
.end method

.method private final b(Ljava/lang/Throwable;)Lsh2/c;
    .locals 3

    iget-object v0, p0, Lsh2/b;->a:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Certificate transfer task did not complete"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lsh2/c$a;

    sget-object v0, Lsh2/c$b;->INTERRUPTED:Lsh2/c$b;

    invoke-direct {p1, v0}, Lsh2/c$a;-><init>(Lsh2/c$b;)V

    return-object p1
.end method

.method private final c(Lvk0/e;)Lsh2/c;
    .locals 2

    instance-of v0, p1, Lvk0/e$b;

    if-eqz v0, :cond_0

    sget-object p1, Lsh2/c$d;->a:Lsh2/c$d;

    return-object p1

    :cond_0
    instance-of v0, p1, Lvk0/e$a;

    if-eqz v0, :cond_4

    check-cast p1, Lvk0/e$a;

    invoke-virtual {p1}, Lvk0/e$a;->a()Ljava/lang/Exception;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/strapauth/certificatetransfer/CertificateTransferException;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/whoop/strapauth/certificatetransfer/CertificateTransferException;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/strapauth/certificatetransfer/CertificateTransferException;->a()Lsh2/c;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lvk0/e$a;->a()Ljava/lang/Exception;

    move-result-object p1

    invoke-direct {p0, p1}, Lsh2/b;->b(Ljava/lang/Throwable;)Lsh2/c;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public a(Ljk0/d;[BLsj2/a;Lc93/a;Lq83/d;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljk0/d;",
            "[B",
            "Lsj2/a;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lsh2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lsh2/b$a;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lsh2/b$a;

    iget v2, v1, Lsh2/b$a;->I:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lsh2/b$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v1, Lsh2/b$a;

    invoke-direct {v1, p0, v0}, Lsh2/b$a;-><init>(Lsh2/b;Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lsh2/b$a;->G:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lsh2/b$a;->I:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lsh2/b$a;->F:Ljava/lang/Object;

    check-cast p1, Lsh2/b;

    iget-object v2, v1, Lsh2/b$a;->E:Ljava/lang/Object;

    check-cast v2, Lsh2/e;

    iget-object v2, v1, Lsh2/b$a;->z:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    iget-object v2, v1, Lsh2/b$a;->y:Ljava/lang/Object;

    check-cast v2, Lsj2/a;

    iget-object v2, v1, Lsh2/b$a;->x:Ljava/lang/Object;

    check-cast v2, [B

    iget-object v2, v1, Lsh2/b$a;->w:Ljava/lang/Object;

    check-cast v2, Ljk0/d;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v6, p2

    array-length v0, v6

    if-eqz v0, :cond_6

    new-instance v5, Lsh2/e;

    const/16 v12, 0x3c

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v7, p4

    invoke-direct/range {v5 .. v13}, Lsh2/e;-><init>([BLc93/a;Ltr2/n;Ljava/lang/String;Lec3/p1;Lec3/p1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p3

    :try_start_1
    invoke-interface {p1, v5, v0}, Ljk0/d;->u(Lvk0/j;Lsj2/a;)Lbc3/i0;

    move-result-object p1

    const/4 v0, 0x0

    iput-object v0, v1, Lsh2/b$a;->w:Ljava/lang/Object;

    iput-object v0, v1, Lsh2/b$a;->x:Ljava/lang/Object;

    iput-object v0, v1, Lsh2/b$a;->y:Ljava/lang/Object;

    iput-object v0, v1, Lsh2/b$a;->z:Ljava/lang/Object;

    iput-object v0, v1, Lsh2/b$a;->E:Ljava/lang/Object;

    iput-object p0, v1, Lsh2/b$a;->F:Ljava/lang/Object;

    iput v4, v1, Lsh2/b$a;->I:I

    invoke-interface {p1, v1}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_3

    return-object v2

    :cond_3
    move-object p1, p0

    :goto_1
    check-cast v0, Lvk0/e;

    invoke-direct {p1, v0}, Lsh2/b;->c(Lvk0/e;)Lsh2/c;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    instance-of v0, p1, Lcom/whoop/taskexecutor/TaskInterruptedException;

    if-nez v0, :cond_5

    instance-of v0, p1, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v0, p0, Lsh2/b;->a:Ltr2/n;

    const-string v1, "Certificate transfer failed with an unexpected error"

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance p1, Lsh2/c$a;

    sget-object v0, Lsh2/c$b;->UNKNOWN:Lsh2/c$b;

    invoke-direct {p1, v0}, Lsh2/c$a;-><init>(Lsh2/c$b;)V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-direct {p0, p1}, Lsh2/b;->b(Ljava/lang/Throwable;)Lsh2/c;

    move-result-object p1

    :goto_4
    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Certificate must not be empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
