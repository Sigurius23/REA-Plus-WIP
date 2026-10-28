.class public final Llb3/x0;
.super Llb3/y0;
.source "SourceFile"


# instance fields
.field public final synthetic b:Llb3/y0;


# direct methods
.method public constructor <init>(Llb3/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/x0;->b:Llb3/y0;

    return-void
.end method


# virtual methods
.method public final c(Ls93/i;)Ls93/i;
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/x0;->b:Llb3/y0;

    invoke-virtual {v0, p1}, Llb3/y0;->c(Ls93/i;)Ls93/i;

    move-result-object p1

    return-object p1
.end method

.method public final d(Llb3/y;)Llb3/u0;
    .locals 1

    iget-object v0, p0, Llb3/x0;->b:Llb3/y0;

    invoke-virtual {v0, p1}, Llb3/y0;->d(Llb3/y;)Llb3/u0;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Llb3/x0;->b:Llb3/y0;

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

    iget-object v0, p0, Llb3/x0;->b:Llb3/y0;

    invoke-virtual {v0, p1, p2}, Llb3/y0;->f(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object p1

    return-object p1
.end method
