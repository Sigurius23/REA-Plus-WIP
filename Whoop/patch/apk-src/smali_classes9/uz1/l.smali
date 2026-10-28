.class public final synthetic Luz1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Luz1/o;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Luz1/o;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p6, p0, Luz1/l;->w:I

    iput-object p1, p0, Luz1/l;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Luz1/l;->y:Luz1/o;

    iput-object p3, p0, Luz1/l;->z:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Luz1/l;->E:I

    iput p5, p0, Luz1/l;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Luz1/l;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Luz1/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Luz1/l;->y:Luz1/o;

    iget-object v3, p0, Luz1/l;->z:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Luz1/l;->E:I

    iget v5, p0, Luz1/l;->F:I

    invoke-static/range {v1 .. v7}, Luz1/n;->h(Landroidx/compose/ui/Modifier;Luz1/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Luz1/l;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Luz1/l;->y:Luz1/o;

    iget-object v2, p0, Luz1/l;->z:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Luz1/l;->E:I

    iget v4, p0, Luz1/l;->F:I

    invoke-static/range {v0 .. v6}, Luz1/n;->g(Landroidx/compose/ui/Modifier;Luz1/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
