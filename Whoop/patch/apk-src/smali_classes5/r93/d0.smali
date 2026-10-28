.class public final Lr93/d0;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Lzt/q;


# direct methods
.method public synthetic constructor <init>(Lzt/q;I)V
    .locals 0

    iput p2, p0, Lr93/d0;->w:I

    iput-object p1, p0, Lr93/d0;->x:Lzt/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lr93/d0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr93/e0;

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lr93/e0;->a()Lva3/c;

    move-result-object v0

    invoke-virtual {p1}, Lr93/e0;->b()Ljava/util/List;

    move-result-object p1

    iget-boolean v1, v0, Lva3/c;->c:Z

    if-nez v1, :cond_2

    invoke-virtual {v0}, Lva3/c;->e()Lva3/c;

    move-result-object v1

    iget-object v2, p0, Lr93/d0;->x:Lzt/q;

    if-eqz v1, :cond_0

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    const/4 v4, 0x1

    invoke-static {v3, v4}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lzt/q;->t(Lva3/c;Ljava/util/List;)Lr93/e;

    move-result-object v1

    :goto_0
    move-object v5, v1

    goto :goto_1

    :cond_0
    iget-object v1, v2, Lzt/q;->z:Ljava/lang/Object;

    check-cast v1, Lkb3/e;

    iget-object v3, v0, Lva3/c;->a:Lva3/e;

    invoke-virtual {v1, v3}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/g;

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, Lva3/c;->g()Z

    move-result v7

    new-instance v3, Lr93/f0;

    iget-object v1, v2, Lzt/q;->x:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lkb3/k;

    invoke-virtual {v0}, Lva3/c;->f()Lva3/h;

    move-result-object v6

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_2
    move v8, p1

    goto :goto_3

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    invoke-direct/range {v3 .. v8}, Lr93/f0;-><init>(Lkb3/k;Lr93/g;Lva3/h;ZI)V

    return-object v3

    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unresolved local class: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    check-cast p1, Lva3/e;

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu93/q;

    iget-object v1, p0, Lr93/d0;->x:Lzt/q;

    iget-object v1, v1, Lzt/q;->y:Ljava/lang/Object;

    check-cast v1, Lr93/b0;

    invoke-direct {v0, v1, p1}, Lu93/q;-><init>(Lr93/b0;Lva3/e;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
