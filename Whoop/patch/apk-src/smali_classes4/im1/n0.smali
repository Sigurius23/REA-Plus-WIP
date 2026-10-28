.class public final synthetic Lim1/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lem1/v;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lbm/t;Ljava/util/List;Lfm1/c;Lem1/v;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lim1/n0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim1/n0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lim1/n0;->z:Ljava/lang/Object;

    iput-object p3, p0, Lim1/n0;->E:Ljava/lang/Object;

    iput-object p4, p0, Lim1/n0;->x:Lem1/v;

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lem1/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lim1/n0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim1/n0;->y:Ljava/lang/Object;

    iput-object p2, p0, Lim1/n0;->x:Lem1/v;

    iput-object p3, p0, Lim1/n0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lim1/n0;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lim1/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lim1/n0;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbm/t;

    iget-object v0, p0, Lim1/n0;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lfm1/c;

    move-object v5, p1

    check-cast v5, Lc0/i0;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v2, p0, Lim1/n0;->z:Ljava/lang/Object;

    iget-object v4, p0, Lim1/n0;->x:Lem1/v;

    invoke-static/range {v1 .. v7}, Lim1/a1;->b(Lbm/t;Ljava/util/List;Lfm1/c;Lem1/v;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lim1/n0;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp1/c1;

    iget-object v0, p0, Lim1/n0;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lim1/n0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Lc0/i0;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v2, p0, Lim1/n0;->x:Lem1/v;

    invoke-static/range {v1 .. v7}, Lim1/t0;->O(Lp1/c1;Lem1/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
