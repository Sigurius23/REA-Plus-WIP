.class public final synthetic Ldn0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ly81/e;

.field public final synthetic F:F

.field public final synthetic G:Lqy0/g;

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:Ly81/e;


# direct methods
.method public synthetic constructor <init>(FFLy81/e;Ly81/e;FLqy0/g;II)V
    .locals 0

    iput p8, p0, Ldn0/g;->w:I

    iput p1, p0, Ldn0/g;->x:F

    iput p2, p0, Ldn0/g;->y:F

    iput-object p3, p0, Ldn0/g;->z:Ly81/e;

    iput-object p4, p0, Ldn0/g;->E:Ly81/e;

    iput p5, p0, Ldn0/g;->F:F

    iput-object p6, p0, Ldn0/g;->G:Lqy0/g;

    iput p7, p0, Ldn0/g;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Ldn0/g;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v1, p0, Ldn0/g;->x:F

    iget v2, p0, Ldn0/g;->y:F

    iget-object v3, p0, Ldn0/g;->z:Ly81/e;

    iget-object v4, p0, Ldn0/g;->E:Ly81/e;

    iget v5, p0, Ldn0/g;->F:F

    iget-object v6, p0, Ldn0/g;->G:Lqy0/g;

    iget v7, p0, Ldn0/g;->H:I

    invoke-static/range {v1 .. v9}, Lxo1/b;->j(FFLy81/e;Ly81/e;FLqy0/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v0, p0, Ldn0/g;->x:F

    iget v1, p0, Ldn0/g;->y:F

    iget-object v2, p0, Ldn0/g;->z:Ly81/e;

    iget-object v3, p0, Ldn0/g;->E:Ly81/e;

    iget v4, p0, Ldn0/g;->F:F

    iget-object v5, p0, Ldn0/g;->G:Lqy0/g;

    iget v6, p0, Ldn0/g;->H:I

    invoke-static/range {v0 .. v8}, Lqy0/f;->c(FFLy81/e;Ly81/e;FLqy0/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v0, p0, Ldn0/g;->x:F

    iget v1, p0, Ldn0/g;->y:F

    iget-object v2, p0, Ldn0/g;->z:Ly81/e;

    iget-object v3, p0, Ldn0/g;->E:Ly81/e;

    iget v4, p0, Ldn0/g;->F:F

    iget-object v5, p0, Ldn0/g;->G:Lqy0/g;

    iget v6, p0, Ldn0/g;->H:I

    invoke-static/range {v0 .. v8}, Ldn0/h;->k(FFLy81/e;Ly81/e;FLqy0/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
