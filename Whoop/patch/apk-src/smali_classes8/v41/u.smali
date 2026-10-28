.class public final synthetic Lv41/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FFZLkotlin/jvm/functions/Function1;Lc93/m;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lv41/u;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv41/u;->H:Ljava/lang/Object;

    iput p2, p0, Lv41/u;->x:F

    iput p3, p0, Lv41/u;->z:F

    iput-boolean p4, p0, Lv41/u;->y:Z

    iput-object p5, p0, Lv41/u;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lv41/u;->I:Ljava/lang/Object;

    iput p7, p0, Lv41/u;->F:I

    iput p8, p0, Lv41/u;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lv41/u;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv41/u;->H:Ljava/lang/Object;

    iput p2, p0, Lv41/u;->x:F

    iput-object p3, p0, Lv41/u;->I:Ljava/lang/Object;

    iput-boolean p4, p0, Lv41/u;->y:Z

    iput p5, p0, Lv41/u;->z:F

    iput-object p6, p0, Lv41/u;->E:Lkotlin/jvm/functions/Function1;

    iput p7, p0, Lv41/u;->F:I

    iput p8, p0, Lv41/u;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lv41/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lv41/u;->H:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lz51/s;

    iget-object v0, p0, Lv41/u;->I:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v2, p0, Lv41/u;->x:F

    iget-boolean v4, p0, Lv41/u;->y:Z

    iget v5, p0, Lv41/u;->z:F

    iget-object v6, p0, Lv41/u;->E:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lv41/u;->F:I

    iget v8, p0, Lv41/u;->G:I

    invoke-static/range {v1 .. v10}, Lz51/o;->e(Lz51/s;FLcom/whoop/design/util/TextResource;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lv41/u;->H:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lv41/u;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc93/m;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget v2, p0, Lv41/u;->x:F

    iget v3, p0, Lv41/u;->z:F

    iget-boolean v4, p0, Lv41/u;->y:Z

    iget-object v5, p0, Lv41/u;->E:Lkotlin/jvm/functions/Function1;

    iget v7, p0, Lv41/u;->F:I

    iget v8, p0, Lv41/u;->G:I

    invoke-static/range {v1 .. v10}, Lv41/d0;->a(Landroidx/compose/ui/Modifier;FFZLkotlin/jvm/functions/Function1;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
