.class public final synthetic Lch0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lbc3/c0;

.field public final synthetic F:Lg1/y3;

.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;I)V
    .locals 0

    iput p6, p0, Lch0/e0;->w:I

    iput-object p1, p0, Lch0/e0;->x:Lp1/c1;

    iput-object p2, p0, Lch0/e0;->y:Lp1/c1;

    iput-object p3, p0, Lch0/e0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lch0/e0;->E:Lbc3/c0;

    iput-object p5, p0, Lch0/e0;->F:Lg1/y3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lch0/e0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Ll0/y;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lch0/e0;->x:Lp1/c1;

    iget-object v2, p0, Lch0/e0;->y:Lp1/c1;

    iget-object v3, p0, Lch0/e0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lch0/e0;->E:Lbc3/c0;

    iget-object v5, p0, Lch0/e0;->F:Lg1/y3;

    invoke-static/range {v1 .. v8}, Lch0/m0;->d(Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Ll0/v;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lch0/e0;->x:Lp1/c1;

    iget-object v1, p0, Lch0/e0;->y:Lp1/c1;

    iget-object v2, p0, Lch0/e0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lch0/e0;->E:Lbc3/c0;

    iget-object v4, p0, Lch0/e0;->F:Lg1/y3;

    invoke-static/range {v0 .. v7}, Lch0/m0;->v(Lp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
