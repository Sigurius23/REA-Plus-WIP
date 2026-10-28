.class public final synthetic Ln0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Z

.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Ljava/util/ArrayList;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Ljava/util/ArrayList;Ljava/util/List;ZI)V
    .locals 0

    iput p5, p0, Ln0/m;->w:I

    iput-object p1, p0, Ln0/m;->x:Lp1/c1;

    iput-object p2, p0, Ln0/m;->y:Ljava/util/ArrayList;

    iput-object p3, p0, Ln0/m;->z:Ljava/lang/Object;

    iput-boolean p4, p0, Ln0/m;->E:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Ln0/m;->w:I

    check-cast p1, Ly2/i1;

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    iput-boolean v0, p1, Ly2/i1;->w:Z

    iget-object v0, p0, Ln0/m;->y:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget-boolean v4, p0, Ln0/m;->E:Z

    if-ge v3, v1, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0/p;

    invoke-virtual {v5, p1, v4}, Lo0/p;->l(Ly2/i1;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln0/m;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lo0/p;

    invoke-virtual {v5, p1, v4}, Lo0/p;->l(Ly2/i1;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    iput-boolean v2, p1, Ly2/i1;->w:Z

    iget-object p1, p0, Ln0/m;->x:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/4 v0, 0x1

    iput-boolean v0, p1, Ly2/i1;->w:Z

    iget-object v0, p0, Ln0/m;->y:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_3
    iget-boolean v4, p0, Ln0/m;->E:Z

    if-ge v3, v1, :cond_2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln0/o;

    invoke-virtual {v5, p1, v4}, Ln0/o;->p(Ly2/i1;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_2
    iget-object v0, p0, Ln0/m;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    move v3, v2

    :goto_4
    if-ge v3, v1, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln0/o;

    invoke-virtual {v5, p1, v4}, Ln0/o;->p(Ly2/i1;Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_3
    iput-boolean v2, p1, Ly2/i1;->w:Z

    iget-object p1, p0, Ln0/m;->x:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
