.class public final Llb3/l;
.super Llb3/m;
.source "SourceFile"

# interfaces
.implements Llb3/j;
.implements Lob3/e;


# instance fields
.field public final x:Llb3/c0;

.field public final y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Llb3/c0;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/l;->x:Llb3/c0;

    iput-boolean p2, p0, Llb3/l;->y:Z

    return-void
.end method


# virtual methods
.method public final E()Z
    .locals 1

    iget-object v0, p0, Llb3/l;->x:Llb3/c0;

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v0, v0, Lr93/x0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final k0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l(Llb3/y;)Llb3/f1;
    .locals 1

    const-string v0, "replacement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llb3/y;->p0()Llb3/f1;

    move-result-object p1

    iget-boolean v0, p0, Llb3/l;->y:Z

    invoke-static {p1, v0}, Llb3/o;->f(Llb3/f1;Z)Llb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llb3/l;->x:Llb3/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " & Any"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u0(Z)Llb3/c0;
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Llb3/l;->x:Llb3/c0;

    invoke-virtual {v0, p1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0
.end method

.method public final v0(Llb3/k0;)Llb3/c0;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb3/l;

    iget-object v1, p0, Llb3/l;->x:Llb3/c0;

    invoke-virtual {v1, p1}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object p1

    iget-boolean v1, p0, Llb3/l;->y:Z

    invoke-direct {v0, p1, v1}, Llb3/l;-><init>(Llb3/c0;Z)V

    return-object v0
.end method

.method public final w0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Llb3/l;->x:Llb3/c0;

    return-object v0
.end method

.method public final y0(Llb3/c0;)Llb3/m;
    .locals 2

    new-instance v0, Llb3/l;

    iget-boolean v1, p0, Llb3/l;->y:Z

    invoke-direct {v0, p1, v1}, Llb3/l;-><init>(Llb3/c0;Z)V

    return-object v0
.end method
