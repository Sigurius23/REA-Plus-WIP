.class public final Ly1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/z1;


# instance fields
.field public E:[Ljava/lang/Object;

.field public F:Ly1/e;

.field public final G:Lm83/p;

.field public w:Ly1/j;

.field public x:Ly1/f;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ly1/j;Ly1/f;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/b;->w:Ly1/j;

    iput-object p2, p0, Ly1/b;->x:Ly1/f;

    iput-object p3, p0, Ly1/b;->y:Ljava/lang/String;

    iput-object p4, p0, Ly1/b;->z:Ljava/lang/Object;

    iput-object p5, p0, Ly1/b;->E:[Ljava/lang/Object;

    new-instance p1, Lm83/p;

    const/16 p2, 0x19

    invoke-direct {p1, p0, p2}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Ly1/b;->G:Lm83/p;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    invoke-virtual {p0}, Ly1/b;->b()V

    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Ly1/b;->x:Ly1/f;

    iget-object v1, p0, Ly1/b;->F:Ly1/e;

    if-nez v1, :cond_4

    if-eqz v0, :cond_3

    iget-object v1, p0, Ly1/b;->G:Lm83/p;

    invoke-virtual {v1}, Lm83/p;->invoke()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v0, v2}, Ly1/f;->d(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    instance-of v1, v2, Lz1/n;

    if-eqz v1, :cond_1

    check-cast v2, Lz1/n;

    invoke-interface {v2}, Lz1/n;->h()Lp1/o2;

    move-result-object v1

    sget-object v3, Lp1/v0;->y:Lp1/v0;

    if-eq v1, v3, :cond_0

    invoke-interface {v2}, Lz1/n;->h()Lp1/o2;

    move-result-object v1

    sget-object v3, Lp1/v0;->F:Lp1/v0;

    if-eq v1, v3, :cond_0

    invoke-interface {v2}, Lz1/n;->h()Lp1/o2;

    move-result-object v1

    sget-object v3, Lp1/v0;->z:Lp1/v0;

    if-eq v1, v3, :cond_0

    const-string v1, "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver"

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "MutableState containing "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable()."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static {v2}, Ly1/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, p0, Ly1/b;->y:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ly1/f;->b(Lc93/a;Ljava/lang/String;)Ly1/e;

    move-result-object v0

    iput-object v0, p0, Ly1/b;->F:Ly1/e;

    :cond_3
    return-void

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "entry("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ly1/b;->F:Ly1/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ") is not null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Ly1/b;->F:Ly1/e;

    if-eqz v0, :cond_0

    check-cast v0, Ls/m2;

    invoke-virtual {v0}, Ls/m2;->u()V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Ly1/b;->F:Ly1/e;

    if-eqz v0, :cond_0

    check-cast v0, Ls/m2;

    invoke-virtual {v0}, Ls/m2;->u()V

    :cond_0
    return-void
.end method
