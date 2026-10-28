.class public final synthetic Lw12/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:I

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lz41/g;IFII)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lw12/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw12/e;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lw12/e;->G:Ljava/lang/Object;

    iput p3, p0, Lw12/e;->y:I

    iput p4, p0, Lw12/e;->z:F

    iput p5, p0, Lw12/e;->E:I

    iput p6, p0, Lw12/e;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/navigation/models/ChatHeaderMetadata;Landroidx/compose/ui/Modifier;IFII)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lw12/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw12/e;->G:Ljava/lang/Object;

    iput-object p2, p0, Lw12/e;->x:Landroidx/compose/ui/Modifier;

    iput p3, p0, Lw12/e;->y:I

    iput p4, p0, Lw12/e;->z:F

    iput p5, p0, Lw12/e;->E:I

    iput p6, p0, Lw12/e;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lw12/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw12/e;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lz41/g;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lw12/e;->x:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lw12/e;->y:I

    iget v4, p0, Lw12/e;->z:F

    iget v5, p0, Lw12/e;->E:I

    iget v6, p0, Lw12/e;->F:I

    invoke-static/range {v1 .. v8}, Lz41/j;->b(Landroidx/compose/ui/Modifier;Lz41/g;IFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lw12/e;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/navigation/models/ChatHeaderMetadata;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v2, p0, Lw12/e;->x:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lw12/e;->y:I

    iget v4, p0, Lw12/e;->z:F

    iget v5, p0, Lw12/e;->E:I

    iget v6, p0, Lw12/e;->F:I

    invoke-static/range {v1 .. v8}, Lw12/h;->e(Lcom/whoop/navigation/models/ChatHeaderMetadata;Landroidx/compose/ui/Modifier;IFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
