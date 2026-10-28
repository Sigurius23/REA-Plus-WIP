.class public final synthetic Lpt2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lbc3/c0;

.field public final synthetic G:Lv41/f$a;

.field public final synthetic H:Lot2/m$i;

.field public final synthetic I:Lp1/c1;

.field public final synthetic J:Lp1/c1;

.field public final synthetic w:Lm91/u;

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lm91/u;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lot2/m$i;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpt2/s;->w:Lm91/u;

    iput p2, p0, Lpt2/s;->x:I

    iput p3, p0, Lpt2/s;->y:I

    iput-object p4, p0, Lpt2/s;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lpt2/s;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lpt2/s;->F:Lbc3/c0;

    iput-object p7, p0, Lpt2/s;->G:Lv41/f$a;

    iput-object p8, p0, Lpt2/s;->H:Lot2/m$i;

    iput-object p9, p0, Lpt2/s;->I:Lp1/c1;

    iput-object p10, p0, Lpt2/s;->J:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v10, p1

    check-cast v10, Landroidx/compose/foundation/lazy/a;

    move-object v11, p2

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p3

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Lpt2/s;->w:Lm91/u;

    iget v1, p0, Lpt2/s;->x:I

    iget v2, p0, Lpt2/s;->y:I

    iget-object v3, p0, Lpt2/s;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lpt2/s;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lpt2/s;->F:Lbc3/c0;

    iget-object v6, p0, Lpt2/s;->G:Lv41/f$a;

    iget-object v7, p0, Lpt2/s;->H:Lot2/m$i;

    iget-object v8, p0, Lpt2/s;->I:Lp1/c1;

    iget-object v9, p0, Lpt2/s;->J:Lp1/c1;

    invoke-static/range {v0 .. v12}, Lpt2/v;->K(Lm91/u;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lv41/f$a;Lot2/m$i;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
