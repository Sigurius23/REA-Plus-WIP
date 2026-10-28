.class public final synthetic Lbr2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Lxq2/i;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lxq2/i;ZIII)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lbr2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbr2/d;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lbr2/d;->y:Lxq2/i;

    iput-boolean p3, p0, Lbr2/d;->z:Z

    iput p4, p0, Lbr2/d;->E:I

    iput p5, p0, Lbr2/d;->F:I

    iput p6, p0, Lbr2/d;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Lxq2/i;ILandroidx/compose/ui/Modifier;ZII)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lbr2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbr2/d;->y:Lxq2/i;

    iput p2, p0, Lbr2/d;->E:I

    iput-object p3, p0, Lbr2/d;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Lbr2/d;->z:Z

    iput p5, p0, Lbr2/d;->F:I

    iput p6, p0, Lbr2/d;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lbr2/d;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lbr2/d;->x:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lbr2/d;->y:Lxq2/i;

    iget-boolean v3, p0, Lbr2/d;->z:Z

    iget v4, p0, Lbr2/d;->E:I

    iget v5, p0, Lbr2/d;->F:I

    iget v6, p0, Lbr2/d;->G:I

    invoke-static/range {v1 .. v8}, Lbr2/e;->b(Landroidx/compose/ui/Modifier;Lxq2/i;ZIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lbr2/d;->x:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lbr2/d;->y:Lxq2/i;

    iget-boolean v2, p0, Lbr2/d;->z:Z

    iget v3, p0, Lbr2/d;->E:I

    iget v4, p0, Lbr2/d;->F:I

    iget v5, p0, Lbr2/d;->G:I

    invoke-static/range {v0 .. v7}, Lbr2/e;->e(Landroidx/compose/ui/Modifier;Lxq2/i;ZIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
