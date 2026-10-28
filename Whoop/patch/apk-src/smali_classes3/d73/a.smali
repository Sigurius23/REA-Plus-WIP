.class public final Ld73/a;
.super Lz63/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ld73/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lz63/d;)V
    .locals 6

    iget v0, p0, Ld73/a;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p1, Lz63/d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lz63/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const-class v4, La73/b;

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz63/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-nez v2, :cond_5

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz63/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v3, v2

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {p1, v3}, Lz63/d;->a(Lz63/a;)V

    move-object v2, v3

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Requested plugin is not added: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", plugins: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    check-cast v2, La73/b;

    new-instance p1, Li73/a;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iget-object v0, v2, La73/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lab/i0;)V
    .locals 2

    iget v0, p0, Ld73/a;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    new-instance v0, Lte3/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lte3/b;-><init>(I)V

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1, v0}, Lab/i0;->s(Ljava/lang/Iterable;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lg9/k;)V
    .locals 2

    iget v0, p0, Ld73/a;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    new-instance v0, Lb73/a;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lb73/a;-><init>(I)V

    const-class v1, Lte3/a;

    invoke-virtual {p1, v1, v0}, Lg9/k;->b(Ljava/lang/Class;Lz63/e;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(Lg9/k;)V
    .locals 2

    iget v0, p0, Ld73/a;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    new-instance v0, La73/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, La73/a;-><init>(I)V

    const-class v1, Lte3/a;

    invoke-virtual {p1, v1, v0}, Lg9/k;->a(Ljava/lang/Class;Lz63/b;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
