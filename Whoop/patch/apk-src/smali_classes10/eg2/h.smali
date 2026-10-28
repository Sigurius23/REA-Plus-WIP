.class public final synthetic Leg2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


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

    .line 1
    iput p6, p0, Leg2/h;->w:I

    iput-object p1, p0, Leg2/h;->x:Ljava/lang/Object;

    iput-object p2, p0, Leg2/h;->y:Ljava/lang/Object;

    iput-object p3, p0, Leg2/h;->z:Ljava/lang/Object;

    iput-object p4, p0, Leg2/h;->E:Ljava/lang/Object;

    iput-object p5, p0, Leg2/h;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lrv2/h$b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Leg2/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leg2/h;->y:Ljava/lang/Object;

    iput-object p2, p0, Leg2/h;->z:Ljava/lang/Object;

    iput-object p3, p0, Leg2/h;->x:Ljava/lang/Object;

    iput-object p4, p0, Leg2/h;->E:Ljava/lang/Object;

    iput-object p5, p0, Leg2/h;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Leg2/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Leg2/h;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Leg2/h;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lrv2/h$b;

    iget-object v0, p0, Leg2/h;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Leg2/h;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lbc3/c0;

    iget-object v0, p0, Leg2/h;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lg1/y3;

    move-object v6, p1

    check-cast v6, Lbm/m;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v1 .. v9}, Lsv2/e;->G(Ljava/util/List;Lrv2/h$b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lbm/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Leg2/h;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lp31/l;

    iget-object v0, p0, Leg2/h;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lbc3/c0;

    iget-object v0, p0, Leg2/h;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ldp0/g;

    iget-object v0, p0, Leg2/h;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/m;

    iget-object v0, p0, Leg2/h;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lm91/u;

    move-object v6, p1

    check-cast v6, Lc0/o;

    move-object v7, p2

    check-cast v7, Lps2/c;

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v1 .. v9}, Lrs2/c;->d(Lp31/l;Lbc3/c0;Ldp0/g;Lc93/m;Lm91/u;Lc0/o;Lps2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Leg2/h;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Leg2/h;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Leg2/h;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    iget-object v0, p0, Leg2/h;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ldg2/b;

    iget-object v0, p0, Leg2/h;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lp1/c1;

    move-object v6, p1

    check-cast v6, Lc0/o;

    move-object v7, p2

    check-cast v7, Ljava/lang/String;

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v1 .. v9}, Leg2/i;->o(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Ldg2/b;Lp1/c1;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
