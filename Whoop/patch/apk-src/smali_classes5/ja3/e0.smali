.class public abstract Lja3/e0;
.super Lja3/a0;
.source "SourceFile"


# virtual methods
.method public g(Ljava/util/ArrayList;Lva3/h;)V
    .locals 0

    const-string p1, "name"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final i()Lr93/q0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l(Lx93/w;Ljava/util/ArrayList;Llb3/y;Ljava/util/List;)Lja3/z;
    .locals 7

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "valueParameters"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lja3/z;

    const/4 v5, 0x0

    sget-object v6, Lm83/y;->w:Lm83/y;

    const/4 v2, 0x0

    move-object v4, p2

    move-object v1, p3

    move-object v3, p4

    invoke-direct/range {v0 .. v6}, Lja3/z;-><init>(Llb3/y;Llb3/y;Ljava/util/List;Ljava/util/List;ZLjava/util/List;)V

    return-object v0
.end method
