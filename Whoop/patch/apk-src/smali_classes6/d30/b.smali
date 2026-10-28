.class public final synthetic Ld30/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld30/h;


# direct methods
.method public synthetic constructor <init>(Ld30/h;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ld30/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld30/b;->x:Ld30/h;

    return-void
.end method

.method public synthetic constructor <init>(Ld30/h;I)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput p2, p0, Ld30/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld30/b;->x:Ld30/h;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ld30/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Ld30/b;->x:Ld30/h;

    invoke-static {v0, p1, p2}, Lds/q;->f(Ld30/h;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/lang/String;

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly00/o4;

    iget-object v2, p0, Ld30/b;->x:Ld30/h;

    iget-object v2, v2, Ld30/h;->c:Ljava/lang/Object;

    check-cast v2, Lv00/c0;

    invoke-static {v1, v2, p2}, Lse/b;->e0(Ly00/o4;Lv00/c0;Ljava/lang/String;)Lh20/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
