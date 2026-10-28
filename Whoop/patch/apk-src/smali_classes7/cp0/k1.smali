.class public final synthetic Lcp0/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p6, p0, Lcp0/k1;->w:I

    iput-object p1, p0, Lcp0/k1;->x:Ljava/lang/Object;

    iput-object p2, p0, Lcp0/k1;->y:Ljava/lang/Object;

    iput-object p3, p0, Lcp0/k1;->z:Ljava/lang/Object;

    iput-object p4, p0, Lcp0/k1;->E:Ljava/lang/Object;

    iput-object p5, p0, Lcp0/k1;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lcp0/k1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/k1;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lnj2/b$a;

    iget-object v0, p0, Lcp0/k1;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Lcp0/k1;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lv41/f$a;

    iget-object v0, p0, Lcp0/k1;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lp1/c1;

    iget-object v0, p0, Lcp0/k1;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/lazy/a;

    move-object v7, p2

    check-cast v7, Lcom/whoop/stress/domain/model/StressCustomizationDrawerItem;

    move-object v8, p3

    check-cast v8, Lf31/a;

    move-object v9, p4

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p5

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v1 .. v10}, Lpj2/q;->E(Lnj2/b$a;Lbc3/c0;Lv41/f$a;Lp1/c1;Lp1/c1;Landroidx/compose/foundation/lazy/a;Lcom/whoop/stress/domain/model/StressCustomizationDrawerItem;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcp0/k1;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcp0/k1;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcp0/k1;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcp0/k1;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcp0/k1;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Lc93/a;

    move-object v7, p2

    check-cast v7, Lc93/a;

    move-object v8, p3

    check-cast v8, Lc93/a;

    move-object v9, p4

    check-cast v9, Ljava/lang/String;

    move-object/from16 p1, p5

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    invoke-static/range {v1 .. v10}, Lcp0/m1;->j(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
