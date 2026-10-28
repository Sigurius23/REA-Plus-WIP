.class public final synthetic Lhy0/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lhy0/p0;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lhy0/p0;ZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p6, p0, Lhy0/l0;->w:I

    iput-object p1, p0, Lhy0/l0;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lhy0/l0;->y:Lhy0/p0;

    iput-boolean p3, p0, Lhy0/l0;->z:Z

    iput-object p4, p0, Lhy0/l0;->E:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lhy0/l0;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lhy0/l0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lhy0/l0;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lhy0/l0;->y:Lhy0/p0;

    iget-boolean v3, p0, Lhy0/l0;->z:Z

    iget-object v4, p0, Lhy0/l0;->E:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lhy0/l0;->F:I

    invoke-static/range {v1 .. v7}, Lhy0/n0;->b(Landroidx/compose/ui/Modifier;Lhy0/p0;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lhy0/l0;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lhy0/l0;->y:Lhy0/p0;

    iget-boolean v2, p0, Lhy0/l0;->z:Z

    iget-object v3, p0, Lhy0/l0;->E:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lhy0/l0;->F:I

    invoke-static/range {v0 .. v6}, Lhy0/n0;->d(Landroidx/compose/ui/Modifier;Lhy0/p0;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
