.class public final synthetic Lbm2/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lbm2/x0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm2/x0;->y:Ljava/util/List;

    iput-object p2, p0, Lbm2/x0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lbm2/x0;->x:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lbm2/x0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm2/x0;->x:Lp1/c1;

    iput-object p2, p0, Lbm2/x0;->y:Ljava/util/List;

    iput-object p3, p0, Lbm2/x0;->z:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lbm2/x0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Lc0/i0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lbm2/x0;->x:Lp1/c1;

    iget-object v2, p0, Lbm2/x0;->y:Ljava/util/List;

    iget-object v3, p0, Lbm2/x0;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v6}, Lcom/whoop/startactivity/goals/a;->c(Lp1/c1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Ll0/y;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lbm2/x0;->y:Ljava/util/List;

    iget-object v1, p0, Lbm2/x0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lbm2/x0;->x:Lp1/c1;

    invoke-static/range {v0 .. v5}, Lbm2/z0;->x(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
