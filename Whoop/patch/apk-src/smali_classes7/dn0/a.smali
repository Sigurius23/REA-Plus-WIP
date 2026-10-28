.class public final synthetic Ldn0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:F

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;FFLkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Ldn0/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldn0/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Ldn0/a;->y:Ljava/lang/Object;

    iput p3, p0, Ldn0/a;->E:F

    iput p4, p0, Ldn0/a;->F:F

    iput-object p5, p0, Ldn0/a;->z:Ljava/lang/Object;

    iput p6, p0, Ldn0/a;->G:I

    return-void
.end method

.method public synthetic constructor <init>(Ly81/e;Ly81/e;Ly81/e;FFII)V
    .locals 0

    .line 2
    iput p7, p0, Ldn0/a;->w:I

    iput-object p1, p0, Ldn0/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Ldn0/a;->y:Ljava/lang/Object;

    iput-object p3, p0, Ldn0/a;->z:Ljava/lang/Object;

    iput p4, p0, Ldn0/a;->E:F

    iput p5, p0, Ldn0/a;->F:F

    iput p6, p0, Ldn0/a;->G:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ldn0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldn0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/List;

    iget-object v0, p0, Ldn0/a;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Ldn0/a;->z:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v3, p0, Ldn0/a;->E:F

    iget v4, p0, Ldn0/a;->F:F

    iget v6, p0, Ldn0/a;->G:I

    invoke-static/range {v1 .. v8}, Lzq0/m;->b(Ljava/util/List;Ljava/util/List;FFLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ldn0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly81/e;

    iget-object v0, p0, Ldn0/a;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly81/e;

    iget-object v0, p0, Ldn0/a;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ly81/e;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v4, p0, Ldn0/a;->E:F

    iget v5, p0, Ldn0/a;->F:F

    iget v6, p0, Ldn0/a;->G:I

    invoke-static/range {v1 .. v8}, Lxo1/b;->g(Ly81/e;Ly81/e;Ly81/e;FFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ldn0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly81/e;

    iget-object v0, p0, Ldn0/a;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly81/e;

    iget-object v0, p0, Ldn0/a;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ly81/e;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v4, p0, Ldn0/a;->E:F

    iget v5, p0, Ldn0/a;->F:F

    iget v6, p0, Ldn0/a;->G:I

    invoke-static/range {v1 .. v8}, Lqy0/f;->j(Ly81/e;Ly81/e;Ly81/e;FFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ldn0/a;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ly81/e;

    iget-object v0, p0, Ldn0/a;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ly81/e;

    iget-object v0, p0, Ldn0/a;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ly81/e;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v4, p0, Ldn0/a;->E:F

    iget v5, p0, Ldn0/a;->F:F

    iget v6, p0, Ldn0/a;->G:I

    invoke-static/range {v1 .. v8}, Ldn0/h;->j(Ly81/e;Ly81/e;Ly81/e;FFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
