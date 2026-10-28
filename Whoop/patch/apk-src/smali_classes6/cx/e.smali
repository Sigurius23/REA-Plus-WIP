.class public final synthetic Lcx/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcx/j;


# direct methods
.method public synthetic constructor <init>(Lcx/j;I)V
    .locals 0

    iput p2, p0, Lcx/e;->w:I

    iput-object p1, p0, Lcx/e;->x:Lcx/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lcx/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lj/a;

    iget-object p1, p0, Lcx/e;->x:Lcx/j;

    invoke-virtual {p1}, Lcx/j;->y()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcx/j;->y:Lcx/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    iget-object p1, p1, Lcx/j;->x:Lcx/k;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcx/k;->k:Ljava/util/LinkedHashSet;

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, v2}, Lcx/b;->n(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const-string p1, "pb"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    const-string p1, "task"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    return-void

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    new-instance v0, Lcx/i;

    const/4 v1, 0x1

    iget-object v2, p0, Lcx/e;->x:Lcx/j;

    invoke-direct {v0, v2, p1, v1}, Lcx/i;-><init>(Lcx/j;Ljava/lang/Boolean;I)V

    invoke-virtual {v2, v0}, Lcx/j;->A(Lc93/a;)V

    return-void

    :pswitch_1
    check-cast p1, Lj/a;

    new-instance p1, Lcx/g;

    const/4 v0, 0x5

    iget-object v1, p0, Lcx/e;->x:Lcx/j;

    invoke-direct {p1, v1, v0}, Lcx/g;-><init>(Lcx/j;I)V

    invoke-virtual {v1, p1}, Lcx/j;->A(Lc93/a;)V

    return-void

    :pswitch_2
    check-cast p1, Lj/a;

    new-instance p1, Lcx/g;

    const/4 v0, 0x3

    iget-object v1, p0, Lcx/e;->x:Lcx/j;

    invoke-direct {p1, v1, v0}, Lcx/g;-><init>(Lcx/j;I)V

    invoke-virtual {v1, p1}, Lcx/j;->A(Lc93/a;)V

    return-void

    :pswitch_3
    check-cast p1, Lj/a;

    new-instance p1, Lcx/g;

    const/4 v0, 0x4

    iget-object v1, p0, Lcx/e;->x:Lcx/j;

    invoke-direct {p1, v1, v0}, Lcx/g;-><init>(Lcx/j;I)V

    invoke-virtual {v1, p1}, Lcx/j;->A(Lc93/a;)V

    return-void

    :pswitch_4
    check-cast p1, Lj/a;

    new-instance p1, Lcx/g;

    const/4 v0, 0x7

    iget-object v1, p0, Lcx/e;->x:Lcx/j;

    invoke-direct {p1, v1, v0}, Lcx/g;-><init>(Lcx/j;I)V

    invoke-virtual {v1, p1}, Lcx/j;->A(Lc93/a;)V

    return-void

    :pswitch_5
    check-cast p1, Lj/a;

    new-instance p1, Lcx/g;

    const/4 v0, 0x6

    iget-object v1, p0, Lcx/e;->x:Lcx/j;

    invoke-direct {p1, v1, v0}, Lcx/g;-><init>(Lcx/j;I)V

    invoke-virtual {v1, p1}, Lcx/j;->A(Lc93/a;)V

    return-void

    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    new-instance v0, Lcx/i;

    const/4 v1, 0x0

    iget-object v2, p0, Lcx/e;->x:Lcx/j;

    invoke-direct {v0, v2, p1, v1}, Lcx/i;-><init>(Lcx/j;Ljava/lang/Boolean;I)V

    invoke-virtual {v2, v0}, Lcx/j;->A(Lc93/a;)V

    return-void

    :pswitch_7
    check-cast p1, Ljava/util/Map;

    new-instance v0, La3/z0;

    const/4 v1, 0x4

    iget-object v2, p0, Lcx/e;->x:Lcx/j;

    invoke-direct {v0, v1, v2, p1}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Lcx/j;->A(Lc93/a;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
