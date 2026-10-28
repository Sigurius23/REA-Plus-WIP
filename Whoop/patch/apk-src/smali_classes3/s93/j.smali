.class public final Ls93/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls93/i;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls93/j;->w:I

    iput-object p1, p0, Ls93/j;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lva3/e;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ls93/j;->w:I

    const-string v0, "fqNameToMatch"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls93/j;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([Ls93/i;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ls93/j;->w:I

    .line 2
    invoke-static {p1}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Ls93/j;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final J(Lva3/e;)Z
    .locals 2

    iget v0, p0, Ls93/j;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1}, Ls93/h;->p(Ls93/i;Lva3/e;)Z

    move-result p1

    return p1

    :pswitch_0
    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls93/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v0

    iget-object v0, v0, Lm83/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls93/i;

    invoke-interface {v1, p1}, Ls93/i;->J(Lva3/e;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_1
    invoke-static {p0, p1}, Ls93/h;->p(Ls93/i;Lva3/e;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final T(Lva3/e;)Ls93/b;
    .locals 3

    iget v0, p0, Ls93/j;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls93/j;->x:Ljava/lang/Object;

    check-cast v0, Lva3/e;

    invoke-virtual {p1, v0}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lna3/c;->a:Lna3/c;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_0
    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls93/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v0

    new-instance v1, Lr93/h0;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lr93/h0;-><init>(Lva3/e;I)V

    invoke-static {v0, v1}, Lxb3/k;->B(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p1

    invoke-static {p1}, Lxb3/k;->s(Lxb3/i;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ls93/b;

    return-object p1

    :pswitch_1
    invoke-static {p0, p1}, Ls93/h;->n(Ls93/i;Lva3/e;)Ls93/b;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final isEmpty()Z
    .locals 3

    iget v0, p0, Ls93/j;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    iget-object v0, p0, Ls93/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls93/i;

    invoke-interface {v1}, Ls93/i;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v2, 0x0

    :cond_2
    :goto_0
    return v2

    :pswitch_1
    iget-object v0, p0, Ls93/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget v0, p0, Ls93/j;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lm83/x;->w:Lm83/x;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ls93/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v0

    sget-object v1, Ls93/m;->w:Ls93/m;

    invoke-static {v0, v1}, Lxb3/k;->t(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object v0

    new-instance v1, Lxb3/e;

    invoke-direct {v1, v0}, Lxb3/e;-><init>(Lxb3/g;)V

    return-object v1

    :pswitch_1
    iget-object v0, p0, Ls93/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ls93/j;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ls93/j;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
