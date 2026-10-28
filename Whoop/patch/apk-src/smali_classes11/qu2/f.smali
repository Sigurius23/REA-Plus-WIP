.class public final synthetic Lqu2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lpu2/h$e;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lp1/c1;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:I

.field public final synthetic x:Ll0/y;

.field public final synthetic y:Lqu2/j;

.field public final synthetic z:Lin2/e;


# direct methods
.method public synthetic constructor <init>(Ll0/y;Lqu2/j;Lin2/e;Lpu2/h$e;Lkotlin/jvm/functions/Function1;Lp1/c1;III)V
    .locals 0

    iput p9, p0, Lqu2/f;->w:I

    iput-object p1, p0, Lqu2/f;->x:Ll0/y;

    iput-object p2, p0, Lqu2/f;->y:Lqu2/j;

    iput-object p3, p0, Lqu2/f;->z:Lin2/e;

    iput-object p4, p0, Lqu2/f;->E:Lpu2/h$e;

    iput-object p5, p0, Lqu2/f;->F:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lqu2/f;->G:Lp1/c1;

    iput p7, p0, Lqu2/f;->H:I

    iput p8, p0, Lqu2/f;->I:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lqu2/f;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v1, p0, Lqu2/f;->x:Ll0/y;

    iget-object v2, p0, Lqu2/f;->y:Lqu2/j;

    iget-object v3, p0, Lqu2/f;->z:Lin2/e;

    iget-object v4, p0, Lqu2/f;->E:Lpu2/h$e;

    iget-object v5, p0, Lqu2/f;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lqu2/f;->G:Lp1/c1;

    iget v7, p0, Lqu2/f;->H:I

    iget v8, p0, Lqu2/f;->I:I

    invoke-static/range {v1 .. v10}, Lqu2/h;->S(Ll0/y;Lqu2/j;Lin2/e;Lpu2/h$e;Lkotlin/jvm/functions/Function1;Lp1/c1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lqu2/f;->x:Ll0/y;

    iget-object v1, p0, Lqu2/f;->y:Lqu2/j;

    iget-object v2, p0, Lqu2/f;->z:Lin2/e;

    iget-object v3, p0, Lqu2/f;->E:Lpu2/h$e;

    iget-object v4, p0, Lqu2/f;->F:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lqu2/f;->G:Lp1/c1;

    iget v6, p0, Lqu2/f;->H:I

    iget v7, p0, Lqu2/f;->I:I

    invoke-static/range {v0 .. v9}, Lqu2/h;->k(Ll0/y;Lqu2/j;Lin2/e;Lpu2/h$e;Lkotlin/jvm/functions/Function1;Lp1/c1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
