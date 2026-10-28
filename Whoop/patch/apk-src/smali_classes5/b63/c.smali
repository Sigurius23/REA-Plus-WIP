.class public final Lb63/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La63/q;


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lb63/b;

    invoke-direct {v0}, Lb63/b;-><init>()V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lb63/f;

    iget-object v1, v0, Lb63/b;->b:Ljava/util/ArrayList;

    iget-object v0, v0, Lb63/b;->a:Ljava/util/Set;

    invoke-direct {p1, v1, v0}, Lb63/f;-><init>(Ljava/util/List;Ljava/util/Set;)V

    return-object p1
.end method

.method public final b(Ljava/lang/Object;Lv53/c;)V
    .locals 5

    check-cast p1, Lb63/f;

    const-string v0, "plugin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lv53/c;->E:Le63/f;

    sget-object v1, Le63/f;->i:Lhc3/x;

    new-instance v2, La63/c;

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-direct {v2, p1, v4, v3}, La63/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v0, v1, v2}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    iget-object p2, p2, Lv53/c;->F:Lf63/b;

    sget-object v0, Lf63/b;->l:Lhc3/x;

    new-instance v1, La63/j;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-direct {v1, p1, v3, v4, v2}, La63/j;-><init>(Ljava/lang/Object;ZLq83/d;I)V

    invoke-virtual {p2, v0, v1}, Lr63/d;->f(Lhc3/x;Lkotlin/jvm/functions/Function3;)V

    return-void
.end method

.method public final getKey()Lo63/a;
    .locals 1

    sget-object v0, Lb63/f;->d:Lo63/a;

    return-object v0
.end method
