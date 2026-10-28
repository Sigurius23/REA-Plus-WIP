.class public final Lc4/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;I)V
    .locals 0

    iput p2, p0, Lc4/g;->w:I

    iput-object p1, p0, Lc4/g;->x:Ljava/util/ArrayList;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lc4/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly2/i1;

    iget-object v0, p0, Lc4/g;->x:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/j1;

    invoke-static {v4, v2, v2, p1}, Ly2/i1;->o(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ly2/i1;

    iget-object v0, p0, Lc4/g;->x:Ljava/util/ArrayList;

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    if-ltz v1, :cond_1

    const/4 v2, 0x0

    move v3, v2

    :goto_1
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/j1;

    invoke-static {v4, v2, v2, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    if-eq v3, v1, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ly2/i1;

    iget-object v0, p0, Lc4/g;->x:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_2
    if-ge v3, v1, :cond_2

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/j1;

    invoke-static {v4, v2, v2, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
