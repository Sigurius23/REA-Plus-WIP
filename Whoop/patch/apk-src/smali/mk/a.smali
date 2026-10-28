.class public final Lmk/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkk/e;


# instance fields
.field public E:Llk/g;

.field public final w:Lwe/o;

.field public x:Lgj/d;

.field public final y:Z

.field public z:Lkk/b;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwe/o;

    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwe/o;-><init>(IZ)V

    iput-object v0, p0, Lmk/a;->w:Lwe/o;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmk/a;->y:Z

    return-void
.end method


# virtual methods
.method public final a(Ljk/a;)Ljk/a;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Lgj/d;)V
    .locals 14

    iput-object p1, p0, Lmk/a;->x:Lgj/d;

    iget-object v0, p0, Lmk/a;->w:Lwe/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Lwe/o;->x:Ljava/lang/Object;

    new-instance v1, Lkk/b;

    invoke-direct {v1, p1}, Lkk/b;-><init>(Lgj/d;)V

    iput-object v1, p0, Lmk/a;->z:Lkk/b;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lkk/b;->i:Z

    iget-object v2, v1, Lkk/b;->a:Lgj/d;

    iget-object v3, v2, Lgj/d;->f:Lbc3/z;

    new-instance v4, Lkk/a;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lkk/a;-><init>(Lkk/b;Lq83/d;)V

    iget-object v6, v1, Lkk/b;->f:Lbc3/c0;

    const/4 v7, 0x2

    invoke-static {v6, v3, v5, v4, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v2, v2, Lgj/d;->e:Lbc3/z;

    new-instance v3, La6/f;

    invoke-direct {v3, v1, v5}, La6/f;-><init>(Lkk/b;Lq83/d;)V

    invoke-static {v6, v2, v5, v3, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v8, Llk/g;

    invoke-virtual {p1}, Lgj/d;->d()Lik/b;

    move-result-object v9

    iget-object v11, p1, Lgj/d;->k:Lfk/a;

    iget-object v12, p1, Lgj/d;->a:Lgj/g;

    move-object v13, p0

    move-object v10, p1

    invoke-direct/range {v8 .. v13}, Llk/g;-><init>(Lik/b;Lgj/d;Lfk/a;Lgj/g;Lmk/a;)V

    iput-object v8, v13, Lmk/a;->E:Llk/g;

    new-instance p1, Lck/c;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Lck/c;-><init>(I)V

    invoke-virtual {p0}, Lmk/a;->d()Lgj/d;

    invoke-virtual {v0, p1}, Lwe/o;->f(Lkk/e;)V

    return-void
.end method

.method public final c(Ljk/a;)V
    .locals 5

    iget-object v0, p1, Ljk/a;->a:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p1, Ljk/a;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lmk/a;->d()Lgj/d;

    move-result-object v0

    iget-object v0, v0, Lgj/d;->k:Lfk/a;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Event is invalid for missing information like userId and deviceId. Dropping event: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljk/a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lfk/a;->warn(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lmk/a;->d()Lgj/d;

    move-result-object v0

    iget-object v0, v0, Lgj/d;->c:Lbc3/c0;

    invoke-virtual {p0}, Lmk/a;->d()Lgj/d;

    move-result-object v1

    iget-object v1, v1, Lgj/d;->f:Lbc3/z;

    new-instance v2, La6/c;

    const/16 v3, 0x19

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4, v3}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x2

    invoke-static {v0, v1, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final d()Lgj/d;
    .locals 1

    iget-object v0, p0, Lmk/a;->x:Lgj/d;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "amplitude"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getType()Lkk/d;
    .locals 1

    sget-object v0, Lkk/d;->y:Lkk/d;

    return-object v0
.end method
