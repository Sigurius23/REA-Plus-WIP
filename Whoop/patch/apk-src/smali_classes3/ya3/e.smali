.class public final Lya3/e;
.super Lu93/j;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lr93/e;)V
    .locals 7

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    sget-object v3, Ls93/g;->a:Ls93/f;

    sget-object v6, Lr93/s0;->q:Lr93/v0;

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lu93/j;-><init>(Lr93/e;Lr93/j;Ls93/i;ZILr93/s0;)V

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sget v2, Lya3/f;->a:I

    invoke-interface {v1}, Lr93/e;->getKind()Lr93/f;

    move-result-object v2

    sget-object v3, Lr93/f;->y:Lr93/f;

    const/4 v4, 0x0

    if-eq v2, v3, :cond_6

    invoke-virtual {v2}, Lr93/f;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lya3/f;->o(Lr93/i;)Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v1, Lr93/q;->a:Lr93/p;

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 p1, 0x33

    invoke-static {p1}, Lya3/f;->a(I)V

    throw v4

    :cond_2
    invoke-static {v1}, Lya3/f;->j(Lr93/k;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lr93/q;->j:Lr93/p;

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const/16 p1, 0x34

    invoke-static {p1}, Lya3/f;->a(I)V

    throw v4

    :cond_4
    sget-object v1, Lr93/q;->e:Lr93/p;

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    const/16 p1, 0x35

    invoke-static {p1}, Lya3/f;->a(I)V

    throw v4

    :cond_6
    :goto_0
    sget-object v1, Lr93/q;->a:Lr93/p;

    if-eqz v1, :cond_7

    :goto_1
    invoke-virtual {p0, p1, v1}, Lu93/j;->X0(Ljava/util/List;Lr93/r;)V

    return-void

    :cond_7
    const/16 p1, 0x31

    invoke-static {p1}, Lya3/f;->a(I)V

    throw v4
.end method
