.class public final synthetic Lat2/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Lys2/e$k;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lys2/e$k;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p5, p0, Lat2/f0;->w:I

    iput-object p1, p0, Lat2/f0;->x:Lys2/e$k;

    iput-object p2, p0, Lat2/f0;->y:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lat2/f0;->z:I

    iput p4, p0, Lat2/f0;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lat2/f0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lat2/f0;->x:Lys2/e$k;

    iget-object v2, p0, Lat2/f0;->y:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lat2/f0;->z:I

    iget v4, p0, Lat2/f0;->E:I

    invoke-static/range {v1 .. v6}, Lat2/g0;->f(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lat2/f0;->x:Lys2/e$k;

    iget-object v1, p0, Lat2/f0;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lat2/f0;->z:I

    iget v3, p0, Lat2/f0;->E:I

    invoke-static/range {v0 .. v5}, Lat2/g0;->b(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lat2/f0;->x:Lys2/e$k;

    iget-object v1, p0, Lat2/f0;->y:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lat2/f0;->z:I

    iget v3, p0, Lat2/f0;->E:I

    invoke-static/range {v0 .. v5}, Lat2/g0;->j(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
