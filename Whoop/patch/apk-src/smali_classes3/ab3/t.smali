.class public final Lab3/t;
.super Lab3/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lva3/c;I)V
    .locals 1

    new-instance v0, Lab3/f;

    invoke-direct {v0, p1, p2}, Lab3/f;-><init>(Lva3/c;I)V

    new-instance p1, Lab3/r;

    invoke-direct {p1, v0}, Lab3/r;-><init>(Lab3/f;)V

    invoke-direct {p0, p1}, Lab3/g;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Lr93/b0;)Llb3/y;
    .locals 8

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Llb3/k0;->y:Llb3/k0;

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lo93/m;->Q:Lva3/f;

    invoke-virtual {v2}, Lva3/f;->i()Lva3/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo93/h;->j(Lva3/e;)Lr93/e;

    move-result-object v1

    new-instance v2, Llb3/v0;

    iget-object v3, p0, Lab3/g;->a:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lab3/s;

    instance-of v5, v4, Lab3/q;

    if-eqz v5, :cond_0

    check-cast v3, Lab3/q;

    iget-object p1, v3, Lab3/q;->a:Llb3/y;

    goto :goto_1

    :cond_0
    instance-of v4, v4, Lab3/r;

    if-eqz v4, :cond_3

    check-cast v3, Lab3/r;

    iget-object v3, v3, Lab3/r;->a:Lab3/f;

    iget-object v4, v3, Lab3/f;->a:Lva3/c;

    iget v3, v3, Lab3/f;->b:I

    invoke-static {p1, v4}, Lhg3/i;->L(Lr93/b0;Lva3/c;)Lr93/e;

    move-result-object v5

    if-nez v5, :cond_1

    sget-object p1, Lnb3/k;->z:Lnb3/k;

    invoke-virtual {v4}, Lva3/c;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v4, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-interface {v5}, Lr93/e;->i()Llb3/c0;

    move-result-object v4

    const-string v5, "getDefaultType(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Lio/sentry/config/a;->U(Llb3/y;)Llb3/f1;

    move-result-object v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object v6

    sget-object v7, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v6, v4}, Lo93/h;->h(Llb3/y;)Llb3/c0;

    move-result-object v4

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    move-object p1, v4

    :goto_1
    invoke-direct {v2, p1}, Llb3/v0;-><init>(Llb3/y;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1}, Llb3/o;->h(Llb3/k0;Lr93/e;Ljava/util/List;)Llb3/c0;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
