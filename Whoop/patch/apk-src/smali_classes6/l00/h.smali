.class public final Ll00/h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:I

.field public final synthetic x:Ll00/i;

.field public final synthetic y:Z


# direct methods
.method public constructor <init>(Ll00/i;ZLq83/d;)V
    .locals 0

    iput-object p1, p0, Ll00/h;->x:Ll00/i;

    iput-boolean p2, p0, Ll00/h;->y:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance p1, Ll00/h;

    iget-object v0, p0, Ll00/h;->x:Ll00/i;

    iget-boolean v1, p0, Ll00/h;->y:Z

    invoke-direct {p1, v0, v1, p2}, Ll00/h;-><init>(Ll00/i;ZLq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ll00/h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll00/h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll00/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Ll00/h;->x:Ll00/i;

    iget-object v1, v0, Ll00/i;->z:Lec3/h2;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ll00/h;->w:I

    const/4 v4, 0x0

    iget-boolean v5, p0, Ll00/h;->y:Z

    const/4 v6, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v6, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ll00/j;

    invoke-static {v3, v4}, Ll00/j;->a(Ll00/j;Lzy/c;)Ll00/j;

    move-result-object v3

    invoke-virtual {v1, p1, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, v0, Ll00/i;->x:Lxz/x;

    iput v6, p0, Ll00/h;->w:I

    invoke-virtual {p1, v5, p0}, Lxz/x;->m(ZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_4

    check-cast p1, Ll83/a0;

    iget-object p1, v0, Ll00/i;->y:Lkotlin/jvm/functions/Function1;

    new-instance v6, Lwz/n;

    new-instance v7, Lwz/d;

    iget-object v0, v0, Ll00/i;->w:Ld00/l;

    invoke-direct {v7, v0, v4}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const/4 v11, 0x6

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    invoke-interface {p1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ll00/j;

    invoke-static {v3}, Lx30/s0;->H(Ljava/lang/Throwable;)Lzy/c;

    move-result-object v2

    invoke-static {v0, v2}, Ll00/j;->a(Ll00/j;Lzy/c;)Ll00/j;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
