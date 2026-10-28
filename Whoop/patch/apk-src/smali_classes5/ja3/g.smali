.class public final Lja3/g;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lja3/i;


# direct methods
.method public synthetic constructor <init>(Lja3/i;I)V
    .locals 0

    iput p2, p0, Lja3/g;->w:I

    iput-object p1, p0, Lja3/g;->x:Lja3/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lja3/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lja3/g;->x:Lja3/i;

    invoke-static {v0}, Ljc/x;->u(Lr93/i;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lja3/g;->x:Lja3/i;

    iget-object v1, v0, Lja3/i;->H:Lx93/n;

    invoke-virtual {v1}, Lx93/n;->getTypeParameters()Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx93/b0;

    iget-object v5, v0, Lja3/i;->J:Lzt/q;

    iget-object v5, v5, Lzt/q;->y:Ljava/lang/Object;

    check-cast v5, Lia3/f;

    invoke-interface {v5, v4}, Lia3/f;->a(Lx93/b0;)Lr93/x0;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Parameter "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " surely belongs to class "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", so it must be resolved"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    return-object v3

    :pswitch_1
    iget-object v0, p0, Lja3/g;->x:Lja3/i;

    invoke-static {v0}, Lcb3/e;->f(Lr93/h;)Lva3/c;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v0, v0, Lja3/i;->G:Lzt/q;

    iget-object v0, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v0, v0, Lia3/a;->w:Loa3/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_2
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
