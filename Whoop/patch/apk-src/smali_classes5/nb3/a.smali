.class public final Lnb3/a;
.super Lu93/l;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lva3/h;)V
    .locals 15

    sget-object v0, Lnb3/l;->a:Lnb3/l;

    sget-object v2, Lnb3/l;->b:Lnb3/e;

    sget-object v4, Lr93/a0;->z:Lr93/a0;

    sget-object v5, Lr93/f;->w:Lr93/f;

    sget-object v7, Lkb3/k;->e:Lkb3/b;

    sget-object v6, Lm83/y;->w:Lm83/y;

    move-object v1, p0

    move-object/from16 v3, p1

    invoke-direct/range {v1 .. v7}, Lu93/l;-><init>(Lr93/k;Lva3/h;Lr93/a0;Lr93/f;Ljava/util/Collection;Lkb3/n;)V

    new-instance v8, Lu93/j;

    const/4 v10, 0x0

    const/4 v13, 0x1

    sget-object v11, Ls93/g;->a:Ls93/f;

    const/4 v12, 0x1

    sget-object v14, Lr93/s0;->q:Lr93/v0;

    move-object v9, p0

    invoke-direct/range {v8 .. v14}, Lu93/j;-><init>(Lr93/e;Lr93/j;Ls93/i;ZILr93/s0;)V

    move-object v0, v8

    sget-object v2, Lr93/q;->e:Lr93/p;

    invoke-virtual {v0, v6, v2}, Lu93/j;->X0(Ljava/util/List;Lr93/r;)V

    sget-object v2, Lnb3/h;->F:Lnb3/h;

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v3

    iget-object v3, v3, Lva3/h;->w:Ljava/lang/String;

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, ""

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lnb3/l;->b(Lnb3/h;[Ljava/lang/String;)Lnb3/g;

    move-result-object v10

    new-instance v8, Lnb3/i;

    sget-object v11, Lnb3/k;->V:Lnb3/k;

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v11, v3}, Lnb3/l;->d(Lnb3/k;[Ljava/lang/String;)Lnb3/j;

    move-result-object v9

    new-array v14, v2, [Ljava/lang/String;

    const/4 v13, 0x0

    move-object v12, v6

    invoke-direct/range {v8 .. v14}, Lnb3/i;-><init>(Llb3/q0;Lnb3/g;Lnb3/k;Ljava/util/List;Z[Ljava/lang/String;)V

    iput-object v8, v0, Lu93/x;->H:Llb3/y;

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {p0, v10, v2, v0}, Lu93/l;->X(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Ljava/util/Set;Lu93/j;)V

    return-void
.end method


# virtual methods
.method public final G(Llb3/a1;)Lr93/e;
    .locals 1

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final b(Llb3/y0;Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 2

    sget-object p2, Lnb3/h;->F:Lnb3/h;

    invoke-virtual {p0}, Lu93/b;->getName()Lva3/h;

    move-result-object v0

    iget-object v0, v0, Lva3/h;->w:Ljava/lang/String;

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lnb3/l;->b(Lnb3/h;[Ljava/lang/String;)Lnb3/g;

    move-result-object p1

    return-object p1
.end method

.method public final d(Llb3/a1;)Lr93/l;
    .locals 1

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lu93/b;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "asString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
