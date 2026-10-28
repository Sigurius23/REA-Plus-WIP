.class public final synthetic Lmy0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic F:F

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;III)V
    .locals 0

    .line 1
    iput p9, p0, Lmy0/a;->w:I

    iput-object p1, p0, Lmy0/a;->x:Ljava/lang/Object;

    iput p2, p0, Lmy0/a;->y:F

    iput p3, p0, Lmy0/a;->z:F

    iput-object p4, p0, Lmy0/a;->E:Landroidx/compose/ui/Modifier;

    iput p5, p0, Lmy0/a;->F:F

    iput-object p6, p0, Lmy0/a;->G:Ljava/lang/Object;

    iput p7, p0, Lmy0/a;->H:I

    iput p8, p0, Lmy0/a;->I:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltk2/q;Landroidx/compose/ui/Modifier;FFLw41/f;FII)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lmy0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmy0/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Lmy0/a;->E:Landroidx/compose/ui/Modifier;

    iput p3, p0, Lmy0/a;->y:F

    iput p4, p0, Lmy0/a;->z:F

    iput-object p5, p0, Lmy0/a;->G:Ljava/lang/Object;

    iput p6, p0, Lmy0/a;->F:F

    iput p7, p0, Lmy0/a;->H:I

    iput p8, p0, Lmy0/a;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lmy0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmy0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltk2/q;

    iget-object v0, p0, Lmy0/a;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lw41/f;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v2, p0, Lmy0/a;->E:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lmy0/a;->y:F

    iget v4, p0, Lmy0/a;->z:F

    iget v6, p0, Lmy0/a;->F:F

    iget v7, p0, Lmy0/a;->H:I

    iget v8, p0, Lmy0/a;->I:I

    invoke-static/range {v1 .. v10}, Lyk2/n;->b(Ltk2/q;Landroidx/compose/ui/Modifier;FFLw41/f;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmy0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lmy0/a;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Li2/x;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v2, p0, Lmy0/a;->y:F

    iget v3, p0, Lmy0/a;->z:F

    iget-object v4, p0, Lmy0/a;->E:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lmy0/a;->F:F

    iget v7, p0, Lmy0/a;->H:I

    iget v8, p0, Lmy0/a;->I:I

    invoke-static/range {v1 .. v10}, Lmy0/b;->a(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmy0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Lmy0/a;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Li2/x;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v2, p0, Lmy0/a;->y:F

    iget v3, p0, Lmy0/a;->z:F

    iget-object v4, p0, Lmy0/a;->E:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lmy0/a;->F:F

    iget v7, p0, Lmy0/a;->H:I

    iget v8, p0, Lmy0/a;->I:I

    invoke-static/range {v1 .. v10}, Lmy0/b;->b(Ljava/util/List;FFLandroidx/compose/ui/Modifier;FLi2/x;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
