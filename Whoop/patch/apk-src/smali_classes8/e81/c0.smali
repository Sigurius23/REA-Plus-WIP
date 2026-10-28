.class public final synthetic Le81/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ll83/e;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FFFLcom/whoop/design/models/items/DateSelectorModel;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Le81/c0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le81/c0;->x:Landroidx/compose/ui/Modifier;

    iput p2, p0, Le81/c0;->y:F

    iput p3, p0, Le81/c0;->z:F

    iput p4, p0, Le81/c0;->E:F

    iput-object p5, p0, Le81/c0;->G:Ljava/lang/Object;

    iput-object p6, p0, Le81/c0;->H:Ll83/e;

    iput p7, p0, Le81/c0;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/util/List;FFFLc93/a;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Le81/c0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le81/c0;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Le81/c0;->G:Ljava/lang/Object;

    iput p3, p0, Le81/c0;->y:F

    iput p4, p0, Le81/c0;->z:F

    iput p5, p0, Le81/c0;->E:F

    iput-object p6, p0, Le81/c0;->H:Ll83/e;

    iput p7, p0, Le81/c0;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Le81/c0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le81/c0;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/whoop/design/models/items/DateSelectorModel;

    iget-object v0, p0, Le81/c0;->H:Ll83/e;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Le81/c0;->x:Landroidx/compose/ui/Modifier;

    iget v2, p0, Le81/c0;->y:F

    iget v3, p0, Le81/c0;->z:F

    iget v4, p0, Le81/c0;->E:F

    iget v7, p0, Le81/c0;->F:I

    invoke-static/range {v1 .. v9}, Lkk1/g;->v(Landroidx/compose/ui/Modifier;FFFLcom/whoop/design/models/items/DateSelectorModel;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Le81/c0;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Le81/c0;->H:Ll83/e;

    move-object v6, v0

    check-cast v6, Lc93/a;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Le81/c0;->x:Landroidx/compose/ui/Modifier;

    iget v3, p0, Le81/c0;->y:F

    iget v4, p0, Le81/c0;->z:F

    iget v5, p0, Le81/c0;->E:F

    iget v7, p0, Le81/c0;->F:I

    invoke-static/range {v1 .. v9}, Le81/d0;->c(Landroidx/compose/ui/Modifier;Ljava/util/List;FFFLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
