.class public final Ln43/b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public synthetic w:Lt23/d3;

.field public synthetic x:Ljava/util/List;

.field public synthetic y:Ljava/util/List;

.field public synthetic z:Z


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lt23/d3;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ljava/util/List;

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    check-cast p5, Lq83/d;

    new-instance v0, Ln43/b;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p5}, Ls83/i;-><init>(ILq83/d;)V

    iput-object p1, v0, Ln43/b;->w:Lt23/d3;

    check-cast p2, Ljava/util/List;

    iput-object p2, v0, Ln43/b;->x:Ljava/util/List;

    check-cast p3, Ljava/util/List;

    iput-object p3, v0, Ln43/b;->y:Ljava/util/List;

    iput-boolean p4, v0, Ln43/b;->z:Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ln43/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ln43/b;->w:Lt23/d3;

    iget-object v0, p0, Ln43/b;->x:Ljava/util/List;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Ln43/b;->y:Ljava/util/List;

    check-cast v1, Ljava/util/List;

    iget-boolean v2, p0, Ln43/b;->z:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {p1, v0, v1, v2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
