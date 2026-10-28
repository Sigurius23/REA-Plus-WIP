.class public final Llb3/p;
.super Llb3/y0;
.source "SourceFile"


# instance fields
.field public final b:Llb3/y0;

.field public final c:Llb3/y0;


# direct methods
.method public constructor <init>(Llb3/y0;Llb3/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/p;->b:Llb3/y0;

    iput-object p2, p0, Llb3/p;->c:Llb3/y0;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Llb3/p;->b:Llb3/y0;

    invoke-virtual {v0}, Llb3/y0;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Llb3/p;->c:Llb3/y0;

    invoke-virtual {v0}, Llb3/y0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Llb3/p;->b:Llb3/y0;

    invoke-virtual {v0}, Llb3/y0;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Llb3/p;->c:Llb3/y0;

    invoke-virtual {v0}, Llb3/y0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final c(Ls93/i;)Ls93/i;
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/p;->b:Llb3/y0;

    invoke-virtual {v0, p1}, Llb3/y0;->c(Ls93/i;)Ls93/i;

    move-result-object p1

    iget-object v0, p0, Llb3/p;->c:Llb3/y0;

    invoke-virtual {v0, p1}, Llb3/y0;->c(Ls93/i;)Ls93/i;

    move-result-object p1

    return-object p1
.end method

.method public final d(Llb3/y;)Llb3/u0;
    .locals 1

    iget-object v0, p0, Llb3/p;->b:Llb3/y0;

    invoke-virtual {v0, p1}, Llb3/y0;->d(Llb3/y;)Llb3/u0;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Llb3/p;->c:Llb3/y0;

    invoke-virtual {v0, p1}, Llb3/y0;->d(Llb3/y;)Llb3/u0;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final f(Llb3/y;Llb3/g1;)Llb3/y;
    .locals 1

    const-string v0, "topLevelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/p;->b:Llb3/y0;

    invoke-virtual {v0, p1, p2}, Llb3/y0;->f(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object p1

    iget-object v0, p0, Llb3/p;->c:Llb3/y0;

    invoke-virtual {v0, p1, p2}, Llb3/y0;->f(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object p1

    return-object p1
.end method
