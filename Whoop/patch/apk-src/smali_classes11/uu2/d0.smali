.class public final synthetic Luu2/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lgu2/a;

.field public final synthetic y:Lgu2/a;

.field public final synthetic z:Landroidx/compose/ui/Modifier;


# direct methods
.method public synthetic constructor <init>(Lgu2/a;Lgu2/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    iput p6, p0, Luu2/d0;->w:I

    iput-object p1, p0, Luu2/d0;->x:Lgu2/a;

    iput-object p2, p0, Luu2/d0;->y:Lgu2/a;

    iput-object p3, p0, Luu2/d0;->z:Landroidx/compose/ui/Modifier;

    iput-object p4, p0, Luu2/d0;->E:Landroidx/compose/ui/Modifier;

    iput p5, p0, Luu2/d0;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Luu2/d0;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Luu2/d0;->x:Lgu2/a;

    iget-object v2, p0, Luu2/d0;->y:Lgu2/a;

    iget-object v3, p0, Luu2/d0;->z:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Luu2/d0;->E:Landroidx/compose/ui/Modifier;

    iget v5, p0, Luu2/d0;->F:I

    invoke-static/range {v1 .. v7}, Luu2/e0;->c(Lgu2/a;Lgu2/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Luu2/d0;->x:Lgu2/a;

    iget-object v1, p0, Luu2/d0;->y:Lgu2/a;

    iget-object v2, p0, Luu2/d0;->z:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Luu2/d0;->E:Landroidx/compose/ui/Modifier;

    iget v4, p0, Luu2/d0;->F:I

    invoke-static/range {v0 .. v6}, Luu2/e0;->b(Lgu2/a;Lgu2/a;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
