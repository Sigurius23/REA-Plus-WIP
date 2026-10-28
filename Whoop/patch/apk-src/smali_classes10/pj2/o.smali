.class public final synthetic Lpj2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lnj2/b;Lnj2/b;Lp1/c1;Lp1/c1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lg1/y3;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lpj2/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj2/o;->G:Ljava/lang/Object;

    iput-object p2, p0, Lpj2/o;->H:Ljava/lang/Object;

    iput-object p3, p0, Lpj2/o;->x:Lp1/c1;

    iput-object p4, p0, Lpj2/o;->y:Lp1/c1;

    iput-object p5, p0, Lpj2/o;->I:Ljava/lang/Object;

    iput-object p6, p0, Lpj2/o;->J:Ljava/lang/Object;

    iput-object p7, p0, Lpj2/o;->z:Lp1/c1;

    iput-object p8, p0, Lpj2/o;->K:Ljava/lang/Object;

    iput-object p9, p0, Lpj2/o;->E:Lp1/c1;

    iput-object p10, p0, Lpj2/o;->F:Lp1/c1;

    return-void
.end method

.method public synthetic constructor <init>(Ltp1/j;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lpj2/o;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj2/o;->G:Ljava/lang/Object;

    iput-object p2, p0, Lpj2/o;->x:Lp1/c1;

    iput-object p3, p0, Lpj2/o;->y:Lp1/c1;

    iput-object p4, p0, Lpj2/o;->z:Lp1/c1;

    iput-object p5, p0, Lpj2/o;->E:Lp1/c1;

    iput-object p6, p0, Lpj2/o;->F:Lp1/c1;

    iput-object p7, p0, Lpj2/o;->H:Ljava/lang/Object;

    iput-object p8, p0, Lpj2/o;->I:Ljava/lang/Object;

    iput-object p9, p0, Lpj2/o;->J:Ljava/lang/Object;

    iput-object p10, p0, Lpj2/o;->K:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lpj2/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpj2/o;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltp1/j;

    iget-object v0, p0, Lpj2/o;->H:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lpj2/o;->I:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lpj2/o;->J:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lp1/c1;

    iget-object v0, p0, Lpj2/o;->K:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lp1/c1;

    move-object v11, p1

    check-cast v11, Ll0/y;

    move-object/from16 v12, p2

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p3

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v2, p0, Lpj2/o;->x:Lp1/c1;

    iget-object v3, p0, Lpj2/o;->y:Lp1/c1;

    iget-object v4, p0, Lpj2/o;->z:Lp1/c1;

    iget-object v5, p0, Lpj2/o;->E:Lp1/c1;

    iget-object v6, p0, Lpj2/o;->F:Lp1/c1;

    invoke-static/range {v1 .. v13}, Lvp1/h;->j(Ltp1/j;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lpj2/o;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnj2/b;

    iget-object v0, p0, Lpj2/o;->H:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lnj2/b;

    iget-object v0, p0, Lpj2/o;->I:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lbc3/c0;

    iget-object v0, p0, Lpj2/o;->J:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lv41/f$a;

    iget-object v0, p0, Lpj2/o;->K:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lg1/y3;

    move-object v11, p1

    check-cast v11, Ll0/y;

    move-object/from16 v12, p2

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p3

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v3, p0, Lpj2/o;->x:Lp1/c1;

    iget-object v4, p0, Lpj2/o;->y:Lp1/c1;

    iget-object v7, p0, Lpj2/o;->z:Lp1/c1;

    iget-object v9, p0, Lpj2/o;->E:Lp1/c1;

    iget-object v10, p0, Lpj2/o;->F:Lp1/c1;

    invoke-static/range {v1 .. v13}, Lpj2/q;->y(Lnj2/b;Lnj2/b;Lp1/c1;Lp1/c1;Lbc3/c0;Lv41/f$a;Lp1/c1;Lg1/y3;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
