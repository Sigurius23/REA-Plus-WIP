.class public final synthetic Lm01/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/List;

.field public final synthetic y:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;Ljava/util/List;)V
    .locals 0

    iput p1, p0, Lm01/e;->w:I

    iput-object p2, p0, Lm01/e;->x:Ljava/util/List;

    iput-object p3, p0, Lm01/e;->y:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lm01/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly2/i1;

    iget-object v0, p0, Lm01/e;->x:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    move v3, v1

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v5, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ly2/j1;

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Ly3/j;

    iget-wide v6, v4, Ly3/j;->a:J

    invoke-static {p1, v5, v6, v7}, Ly2/i1;->k(Ly2/i1;Ly2/j1;J)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lm01/e;->y:Ljava/util/List;

    if-eqz v0, :cond_2

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll83/k;

    iget-object v4, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ly2/j1;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/j;

    iget-wide v5, v3, Ly3/j;->a:J

    goto :goto_2

    :cond_1
    const-wide/16 v5, 0x0

    :goto_2
    invoke-static {p1, v4, v5, v6}, Ly2/i1;->k(Ly2/i1;Ly2/j1;J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lm01/e;->y:Ljava/util/List;

    check-cast p1, Lk2/e;

    iget-object v1, p0, Lm01/e;->x:Ljava/util/List;

    invoke-static {v1, v0, p1}, Lm01/g;->a(Ljava/util/List;Ljava/util/List;Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
