.class public abstract Lhb3/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/c;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;

.field public final y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lhb3/a0;->w:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb3/a0;->x:Ljava/lang/Object;

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    iput-object v0, p0, Lhb3/a0;->y:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, Lhb3/a0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsa3/f;Lsa3/h;Lr93/s0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lhb3/a0;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhb3/a0;->x:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lhb3/a0;->y:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Lhb3/a0;->z:Ljava/lang/Object;

    return-void
.end method

.method public static c(Ljava/util/ArrayList;III)V
    .locals 2

    if-le p1, p2, :cond_0

    move v0, p2

    goto :goto_0

    :cond_0
    sub-int v0, p2, p3

    :goto_0
    const/4 v1, 0x1

    if-ne p3, v1, :cond_3

    add-int/lit8 p3, p2, 0x1

    if-eq p1, p3, :cond_2

    add-int/lit8 p3, p2, -0x1

    if-ne p1, p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_3
    add-int/2addr p3, p1

    invoke-virtual {p0, p1, p3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-virtual {p0, v0, p2}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lhb3/a0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lhb3/a0;->x:Ljava/lang/Object;

    iput-object v0, p0, Lhb3/a0;->z:Ljava/lang/Object;

    invoke-virtual {p0}, Lhb3/a0;->j()V

    return-void
.end method

.method public abstract b()Lva3/e;
.end method

.method public i()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhb3/a0;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public abstract j()V
.end method

.method public l(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lhb3/a0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lhb3/a0;->z:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p1, p0, Lhb3/a0;->z:Ljava/lang/Object;

    return-void
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, Lhb3/a0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lhb3/a0;->z:Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lhb3/a0;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lhb3/a0;->b()Lva3/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
