.class public final Lo93/k;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lu93/e0;


# direct methods
.method public synthetic constructor <init>(Lu93/e0;I)V
    .locals 0

    iput p2, p0, Lo93/k;->w:I

    iput-object p1, p0, Lo93/k;->x:Lu93/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lo93/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo93/k;->x:Lu93/e0;

    iget-object v1, v0, Lu93/e0;->H:Lu93/d0;

    if-eqz v1, :cond_3

    iget-object v1, v1, Lu93/d0;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-boolean v2, v0, Lu93/e0;->J:Z

    if-eqz v2, :cond_2

    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu93/e0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu93/e0;

    iget-object v3, v3, Lu93/e0;->I:Lr93/j0;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "CompositeProvider@ModuleDescriptor for "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lu93/m;

    invoke-direct {v1, v2, v0}, Lu93/m;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object v1

    :cond_2
    invoke-static {v0}, Lr93/y;->c(Lu93/e0;)V

    const/4 v0, 0x0

    throw v0

    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Dependencies of module "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    iget-object v0, v0, Lva3/h;->w:Ljava/lang/String;

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " were not set before querying module content"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :pswitch_0
    new-instance v0, Lq93/i;

    iget-object v1, p0, Lo93/k;->x:Lu93/e0;

    invoke-direct {v0, v1}, Lq93/i;-><init>(Lu93/e0;)V

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lo93/k;->x:Lu93/e0;

    sget-object v1, Lo93/n;->i:Lva3/e;

    invoke-virtual {v0, v1}, Lu93/e0;->F(Lva3/e;)Lr93/k0;

    move-result-object v0

    check-cast v0, Lu93/a0;

    iget-object v0, v0, Lu93/a0;->H:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
