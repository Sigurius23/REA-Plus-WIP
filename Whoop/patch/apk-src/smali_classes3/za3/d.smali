.class public final Lza3/d;
.super Llb3/y0;
.source "SourceFile"


# instance fields
.field public final b:Llb3/y0;


# direct methods
.method public constructor <init>(Llb3/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza3/d;->b:Llb3/y0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lza3/d;->b:Llb3/y0;

    invoke-virtual {v0}, Llb3/y0;->a()Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final c(Ls93/i;)Ls93/i;
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lza3/d;->b:Llb3/y0;

    invoke-virtual {v0, p1}, Llb3/y0;->c(Ls93/i;)Ls93/i;

    move-result-object p1

    return-object p1
.end method

.method public final d(Llb3/y;)Llb3/u0;
    .locals 3

    iget-object v0, p0, Lza3/d;->b:Llb3/y0;

    invoke-virtual {v0, p1}, Llb3/y0;->d(Llb3/y;)Llb3/u0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Llb3/y;->i0()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object p1

    instance-of v2, p1, Lr93/x0;

    if-eqz v2, :cond_0

    move-object v1, p1

    check-cast v1, Lr93/x0;

    :cond_0
    invoke-static {v0, v1}, Lva3/b;->c(Llb3/u0;Lr93/x0;)Llb3/u0;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lza3/d;->b:Llb3/y0;

    invoke-virtual {v0}, Llb3/y0;->e()Z

    move-result v0

    return v0
.end method

.method public final f(Llb3/y;Llb3/g1;)Llb3/y;
    .locals 1

    const-string v0, "topLevelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lza3/d;->b:Llb3/y0;

    invoke-virtual {v0, p1, p2}, Llb3/y0;->f(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object p1

    return-object p1
.end method
