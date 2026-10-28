.class public final Lh0/g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public synthetic w:Lh0/a;

.field public synthetic x:Lh0/h1;

.field public synthetic y:Ljava/lang/Object;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lh0/a;

    check-cast p2, Lh0/h1;

    check-cast p4, Lq83/d;

    new-instance v0, Lh0/g;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p4}, Ls83/i;-><init>(ILq83/d;)V

    iput-object p1, v0, Lh0/g;->w:Lh0/a;

    iput-object p2, v0, Lh0/g;->x:Lh0/h1;

    iput-object p3, v0, Lh0/g;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lh0/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/g;->w:Lh0/a;

    iget-object v0, p0, Lh0/g;->x:Lh0/h1;

    iget-object v1, p0, Lh0/g;->y:Ljava/lang/Object;

    check-cast v0, Lh0/x;

    invoke-virtual {v0, v1}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1, v0}, Lh0/a;->a(Lh0/a;F)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
