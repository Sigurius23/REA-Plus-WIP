.class public final Lpr2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpr2/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0012\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u001dR \u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010 \u001a\u0004\u0008\u0019\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lpr2/c;",
        "Lpr2/b;",
        "Lcom/whoop/util/avatar/AvatarApi;",
        "avatarApi",
        "Lz92/a;",
        "userInfoAccessor",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/util/avatar/AvatarApi;Lz92/a;Ltr2/n;)V",
        "",
        "firstName",
        "lastName",
        "Lpr2/d;",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "e",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "imageData",
        "b",
        "([BLq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/util/avatar/AvatarApi;",
        "Lz92/a;",
        "c",
        "Ltr2/n;",
        "Lec3/p1;",
        "Lpr2/e;",
        "Lec3/p1;",
        "_avatarUploadState",
        "Lec3/f2;",
        "Lec3/f2;",
        "()Lec3/f2;",
        "avatarUploadState",
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
.field private final a:Lcom/whoop/util/avatar/AvatarApi;

.field private final b:Lz92/a;

.field private final c:Ltr2/n;

.field private final d:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final e:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/util/avatar/AvatarApi;Lz92/a;Ltr2/n;)V
    .locals 1

    const-string v0, "avatarApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userInfoAccessor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpr2/c;->a:Lcom/whoop/util/avatar/AvatarApi;

    iput-object p2, p0, Lpr2/c;->b:Lz92/a;

    iput-object p3, p0, Lpr2/c;->c:Ltr2/n;

    sget-object p1, Lpr2/e$c;->a:Lpr2/e$c;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lpr2/c;->d:Lec3/p1;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lpr2/c;->e:Lec3/f2;

    return-void
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpr2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lpr2/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lpr2/c$a;

    iget v1, v0, Lpr2/c$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lpr2/c$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lpr2/c$a;

    invoke-direct {v0, p0, p1}, Lpr2/c$a;-><init>(Lpr2/c;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lpr2/c$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lpr2/c$a;->F:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v5, :cond_1

    iget-object v1, v0, Lpr2/c$a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lpr2/c$a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Lpr2/c$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/domain/model/User;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lpr2/c;->c:Ltr2/n;

    const-string v2, "Starting avatar deletion for current user"

    new-array v6, v4, [Lqr2/a$a;

    invoke-interface {p1, v2, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lpr2/c;->b:Lz92/a;

    iput v3, v0, Lpr2/c$a;->F:I

    invoke-interface {p1, v0}, Lz92/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lcom/whoop/domain/model/User;

    const/4 v2, 0x0

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getFirstName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getLastName()Ljava/lang/String;

    move-result-object p1

    iget-object v6, p0, Lpr2/c;->c:Ltr2/n;

    const-string v7, "Retrieved current user name: "

    const-string v8, " "

    invoke-static {v7, v3, v8, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v6, v7, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object v2, v0, Lpr2/c$a;->w:Ljava/lang/Object;

    iput-object v2, v0, Lpr2/c$a;->x:Ljava/lang/Object;

    iput-object v2, v0, Lpr2/c$a;->y:Ljava/lang/Object;

    iput v5, v0, Lpr2/c$a;->F:I

    invoke-virtual {p0, v3, p1, v0}, Lpr2/c;->e(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1

    :cond_6
    iget-object p1, p0, Lpr2/c;->c:Ltr2/n;

    new-array v0, v4, [Lqr2/a$a;

    const-string v1, "Cannot delete avatar: no current user session"

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lpr2/d$a;

    invoke-direct {p1, v1, v2, v5, v2}, Lpr2/d$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public b([BLq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lq83/d<",
            "-",
            "Lpr2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "Avatar upload failed: "

    instance-of v1, p2, Lpr2/c$c;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lpr2/c$c;

    iget v2, v1, Lpr2/c$c;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lpr2/c$c;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lpr2/c$c;

    invoke-direct {v1, p0, p2}, Lpr2/c$c;-><init>(Lpr2/c;Lq83/d;)V

    :goto_0
    iget-object p2, v1, Lpr2/c$c;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lpr2/c$c;->z:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lpr2/c$c;->w:Ljava/lang/Object;

    check-cast p1, [B

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lpr2/c;->c:Ltr2/n;

    array-length v3, p1

    const-string v7, "Starting avatar upload, size: "

    const-string v8, " bytes"

    invoke-static {v3, v7, v8}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v7, v6, [Lqr2/a$a;

    invoke-interface {p2, v3, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lpr2/c;->d:Lec3/p1;

    sget-object v3, Lpr2/e$e;->a:Lpr2/e$e;

    check-cast p2, Lec3/h2;

    invoke-virtual {p2, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    :try_start_1
    sget-object p2, Lpr2/f;->a:Lpr2/f;

    iget-object v3, p0, Lpr2/c;->a:Lcom/whoop/util/avatar/AvatarApi;

    iput-object v5, v1, Lpr2/c$c;->w:Ljava/lang/Object;

    iput v4, v1, Lpr2/c$c;->z:I

    invoke-virtual {p2, v3, p1, v1}, Lpr2/f;->g(Lcom/whoop/util/avatar/AvatarApi;[BLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    check-cast p2, Lpr2/d;

    instance-of p1, p2, Lpr2/d$b;

    if-eqz p1, :cond_4

    const-string p1, "Avatar upload successful"

    iget-object p2, p0, Lpr2/c;->c:Ltr2/n;

    new-array v0, v6, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lpr2/c;->d:Lec3/p1;

    new-instance v0, Lpr2/e$d;

    invoke-direct {v0, p1}, Lpr2/e$d;-><init>(Ljava/lang/String;)V

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v5, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance p2, Lpr2/d$b;

    invoke-direct {p2, p1}, Lpr2/d$b;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_4
    instance-of p1, p2, Lpr2/d$a;

    if-eqz p1, :cond_6

    move-object p1, p2

    check-cast p1, Lpr2/d$a;

    invoke-virtual {p1}, Lpr2/d$a;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    move-object v0, p2

    check-cast v0, Lpr2/d$a;

    invoke-virtual {v0}, Lpr2/d$a;->b()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, p0, Lpr2/c;->c:Ltr2/n;

    new-array v2, v6, [Lqr2/a$a;

    invoke-interface {v1, p1, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lpr2/c;->c:Ltr2/n;

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_2
    iget-object v0, p0, Lpr2/c;->d:Lec3/p1;

    new-instance v1, Lpr2/e$a;

    move-object v2, p2

    check-cast v2, Lpr2/d$a;

    invoke-virtual {v2}, Lpr2/d$a;->b()Ljava/lang/Throwable;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lpr2/e$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v5, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v0, Lpr2/d$a;

    check-cast p2, Lpr2/d$a;

    invoke-virtual {p2}, Lpr2/d$a;->b()Ljava/lang/Throwable;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lpr2/d$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_3
    iget-object p2, p0, Lpr2/c;->c:Ltr2/n;

    new-array v0, v6, [Lqr2/a$a;

    const-string v1, "Unexpected error during avatar upload"

    invoke-interface {p2, v1, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p2, p0, Lpr2/c;->d:Lec3/p1;

    new-instance v0, Lpr2/e$a;

    invoke-direct {v0, v1, p1}, Lpr2/e$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v5, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance p2, Lpr2/d$a;

    invoke-direct {p2, v1, p1}, Lpr2/d$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p2
.end method

.method public c()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lpr2/c;->e:Lec3/f2;

    return-object v0
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpr2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "Avatar upload failed: "

    instance-of v1, p3, Lpr2/c$b;

    if-eqz v1, :cond_0

    move-object v1, p3

    check-cast v1, Lpr2/c$b;

    iget v2, v1, Lpr2/c$b;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lpr2/c$b;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, Lpr2/c$b;

    invoke-direct {v1, p0, p3}, Lpr2/c$b;-><init>(Lpr2/c;Lq83/d;)V

    :goto_0
    iget-object p3, v1, Lpr2/c$b;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lpr2/c$b;->E:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lpr2/c$b;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v1, Lpr2/c$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lpr2/c;->c:Ltr2/n;

    invoke-static {p1}, Lyb3/r;->b0(Ljava/lang/String;)Ljava/lang/Character;

    move-result-object v3

    const/16 v7, 0x3f

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    move-result v3

    goto :goto_1

    :cond_3
    move v3, v7

    :goto_1
    invoke-static {p2}, Lyb3/r;->b0(Ljava/lang/String;)Ljava/lang/Character;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Ljava/lang/Character;->charValue()C

    move-result v7

    :cond_4
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Starting avatar generation and upload for user: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v7, v6, [Lqr2/a$a;

    invoke-interface {p3, v3, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p3, p0, Lpr2/c;->d:Lec3/p1;

    sget-object v3, Lpr2/e$b;->a:Lpr2/e$b;

    check-cast p3, Lec3/h2;

    invoke-virtual {p3, v3}, Lec3/h2;->j(Ljava/lang/Object;)V

    :try_start_1
    sget-object p3, Lpr2/f;->a:Lpr2/f;

    iget-object v3, p0, Lpr2/c;->a:Lcom/whoop/util/avatar/AvatarApi;

    iput-object v5, v1, Lpr2/c$b;->w:Ljava/lang/Object;

    iput-object v5, v1, Lpr2/c$b;->x:Ljava/lang/Object;

    iput v4, v1, Lpr2/c$b;->E:I

    invoke-virtual {p3, v3, p1, p2, v1}, Lpr2/f;->d(Lcom/whoop/util/avatar/AvatarApi;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v2, :cond_5

    return-object v2

    :cond_5
    :goto_2
    check-cast p3, Lpr2/d;

    instance-of p1, p3, Lpr2/d$b;

    if-eqz p1, :cond_6

    const-string p1, "Avatar upload successful"

    iget-object p2, p0, Lpr2/c;->c:Ltr2/n;

    new-array p3, v6, [Lqr2/a$a;

    invoke-interface {p2, p1, p3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lpr2/c;->d:Lec3/p1;

    new-instance p3, Lpr2/e$d;

    invoke-direct {p3, p1}, Lpr2/e$d;-><init>(Ljava/lang/String;)V

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v5, p3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance p2, Lpr2/d$b;

    invoke-direct {p2, p1}, Lpr2/d$b;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_6
    instance-of p1, p3, Lpr2/d$a;

    if-eqz p1, :cond_8

    move-object p1, p3

    check-cast p1, Lpr2/d$a;

    invoke-virtual {p1}, Lpr2/d$a;->a()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    move-object p2, p3

    check-cast p2, Lpr2/d$a;

    invoke-virtual {p2}, Lpr2/d$a;->b()Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_7

    iget-object v0, p0, Lpr2/c;->c:Ltr2/n;

    new-array v1, v6, [Lqr2/a$a;

    invoke-interface {v0, p1, p2, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_3

    :cond_7
    iget-object p2, p0, Lpr2/c;->c:Ltr2/n;

    new-array v0, v6, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_3
    iget-object p2, p0, Lpr2/c;->d:Lec3/p1;

    new-instance v0, Lpr2/e$a;

    move-object v1, p3

    check-cast v1, Lpr2/d$a;

    invoke-virtual {v1}, Lpr2/d$a;->b()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lpr2/e$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v5, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance p2, Lpr2/d$a;

    check-cast p3, Lpr2/d$a;

    invoke-virtual {p3}, Lpr2/d$a;->b()Ljava/lang/Throwable;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lpr2/d$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p2

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_4
    iget-object p2, p0, Lpr2/c;->c:Ltr2/n;

    new-array p3, v6, [Lqr2/a$a;

    const-string v0, "Unexpected error during avatar generation/upload"

    invoke-interface {p2, v0, p1, p3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p2, p0, Lpr2/c;->d:Lec3/p1;

    new-instance p3, Lpr2/e$a;

    invoke-direct {p3, v0, p1}, Lpr2/e$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2, v5, p3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance p2, Lpr2/d$a;

    invoke-direct {p2, v0, p1}, Lpr2/d$a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object p2
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpr2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lpr2/c;->c:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Starting avatar deletion with initials for user."

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0, p1, p2, p3}, Lpr2/c;->d(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
