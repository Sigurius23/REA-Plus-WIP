.class public final synthetic Lhy0/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FFLjava/util/List;Lkotlin/jvm/functions/Function3;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lhy0/q0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/q0;->x:Landroidx/compose/ui/Modifier;

    iput p2, p0, Lhy0/q0;->y:F

    iput p3, p0, Lhy0/q0;->z:F

    iput-object p4, p0, Lhy0/q0;->G:Ljava/lang/Object;

    iput-object p5, p0, Lhy0/q0;->H:Ljava/lang/Object;

    iput p6, p0, Lhy0/q0;->E:I

    iput p7, p0, Lhy0/q0;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ly81/f;FLcom/whoop/design/util/TextResource;FII)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lhy0/q0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/q0;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lhy0/q0;->G:Ljava/lang/Object;

    iput p3, p0, Lhy0/q0;->y:F

    iput-object p4, p0, Lhy0/q0;->H:Ljava/lang/Object;

    iput p5, p0, Lhy0/q0;->z:F

    iput p6, p0, Lhy0/q0;->E:I

    iput p7, p0, Lhy0/q0;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Ln2/a;FFLandroidx/compose/ui/Modifier;Ly2/k;II)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lhy0/q0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/q0;->G:Ljava/lang/Object;

    iput p2, p0, Lhy0/q0;->y:F

    iput p3, p0, Lhy0/q0;->z:F

    iput-object p4, p0, Lhy0/q0;->x:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lhy0/q0;->H:Ljava/lang/Object;

    iput p6, p0, Lhy0/q0;->E:I

    iput p7, p0, Lhy0/q0;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lhy0/q0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhy0/q0;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly81/f;

    iget-object v0, p0, Lhy0/q0;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lhy0/q0;->x:Landroidx/compose/ui/Modifier;

    iget v3, p0, Lhy0/q0;->y:F

    iget v5, p0, Lhy0/q0;->z:F

    iget v6, p0, Lhy0/q0;->E:I

    iget v7, p0, Lhy0/q0;->F:I

    invoke-static/range {v1 .. v9}, Ly11/n;->e(Landroidx/compose/ui/Modifier;Ly81/f;FLcom/whoop/design/util/TextResource;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhy0/q0;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    iget-object v0, p0, Lhy0/q0;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function3;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lhy0/q0;->x:Landroidx/compose/ui/Modifier;

    iget v2, p0, Lhy0/q0;->y:F

    iget v3, p0, Lhy0/q0;->z:F

    iget v6, p0, Lhy0/q0;->E:I

    iget v7, p0, Lhy0/q0;->F:I

    invoke-static/range {v1 .. v9}, Ll01/m;->z(Landroidx/compose/ui/Modifier;FFLjava/util/List;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lhy0/q0;->G:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ln2/a;

    iget-object v0, p0, Lhy0/q0;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ly2/k;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v2, p0, Lhy0/q0;->y:F

    iget v3, p0, Lhy0/q0;->z:F

    iget-object v4, p0, Lhy0/q0;->x:Landroidx/compose/ui/Modifier;

    iget v6, p0, Lhy0/q0;->E:I

    iget v7, p0, Lhy0/q0;->F:I

    invoke-static/range {v1 .. v9}, Lhy0/r0;->b(Ln2/a;FFLandroidx/compose/ui/Modifier;Ly2/k;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
