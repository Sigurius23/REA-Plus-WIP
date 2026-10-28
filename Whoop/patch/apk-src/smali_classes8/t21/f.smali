.class public final synthetic Lt21/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lt21/d;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;III)V
    .locals 0

    iput p7, p0, Lt21/f;->w:I

    iput-object p1, p0, Lt21/f;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lt21/f;->y:Lt21/d;

    iput-object p3, p0, Lt21/f;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lt21/f;->E:Lc93/a;

    iput p5, p0, Lt21/f;->F:I

    iput p6, p0, Lt21/f;->G:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lt21/f;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lt21/f;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lt21/f;->y:Lt21/d;

    iget-object v3, p0, Lt21/f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lt21/f;->E:Lc93/a;

    iget v5, p0, Lt21/f;->F:I

    iget v6, p0, Lt21/f;->G:I

    invoke-static/range {v1 .. v8}, Lt21/g;->c(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lt21/f;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lt21/f;->y:Lt21/d;

    iget-object v2, p0, Lt21/f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lt21/f;->E:Lc93/a;

    iget v4, p0, Lt21/f;->F:I

    iget v5, p0, Lt21/f;->G:I

    invoke-static/range {v0 .. v7}, Lt21/g;->k(Landroidx/compose/ui/Modifier;Lt21/d;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
