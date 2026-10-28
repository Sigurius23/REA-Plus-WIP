.class public final synthetic Lbm2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/t2;

.field public final synthetic z:Landroid/icu/text/NumberFormat;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lp1/t2;Landroid/icu/text/NumberFormat;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p6, p0, Lbm2/y;->w:I

    iput-object p1, p0, Lbm2/y;->x:Lp1/c1;

    iput-object p2, p0, Lbm2/y;->y:Lp1/t2;

    iput-object p3, p0, Lbm2/y;->z:Landroid/icu/text/NumberFormat;

    iput-object p4, p0, Lbm2/y;->E:Lp1/c1;

    iput-object p5, p0, Lbm2/y;->F:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lbm2/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v5, p0, Lbm2/y;->F:Lp1/c1;

    move-object v6, p1

    check-cast v6, Ljava/lang/Double;

    iget-object v1, p0, Lbm2/y;->x:Lp1/c1;

    iget-object v2, p0, Lbm2/y;->y:Lp1/t2;

    iget-object v3, p0, Lbm2/y;->z:Landroid/icu/text/NumberFormat;

    iget-object v4, p0, Lbm2/y;->E:Lp1/c1;

    invoke-static/range {v1 .. v6}, Lbm2/e0;->p(Lp1/c1;Lp1/t2;Landroid/icu/text/NumberFormat;Lp1/c1;Lp1/c1;Ljava/lang/Double;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v4, p0, Lbm2/y;->F:Lp1/c1;

    move-object v5, p1

    check-cast v5, Ljava/lang/Double;

    iget-object v0, p0, Lbm2/y;->x:Lp1/c1;

    iget-object v1, p0, Lbm2/y;->y:Lp1/t2;

    iget-object v2, p0, Lbm2/y;->z:Landroid/icu/text/NumberFormat;

    iget-object v3, p0, Lbm2/y;->E:Lp1/c1;

    invoke-static/range {v0 .. v5}, Lbm2/e0;->l(Lp1/c1;Lp1/t2;Landroid/icu/text/NumberFormat;Lp1/c1;Lp1/c1;Ljava/lang/Double;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v4, p0, Lbm2/y;->F:Lp1/c1;

    move-object v5, p1

    check-cast v5, Ljava/lang/Double;

    iget-object v0, p0, Lbm2/y;->x:Lp1/c1;

    iget-object v1, p0, Lbm2/y;->y:Lp1/t2;

    iget-object v2, p0, Lbm2/y;->z:Landroid/icu/text/NumberFormat;

    iget-object v3, p0, Lbm2/y;->E:Lp1/c1;

    invoke-static/range {v0 .. v5}, Lbm2/e0;->A(Lp1/c1;Lp1/t2;Landroid/icu/text/NumberFormat;Lp1/c1;Lp1/c1;Ljava/lang/Double;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
