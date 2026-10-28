.class public final synthetic Ldn0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Ly81/e;

.field public final synthetic y:F

.field public final synthetic z:Lqy0/g;


# direct methods
.method public synthetic constructor <init>(Ly81/e;FLqy0/g;II)V
    .locals 0

    iput p5, p0, Ldn0/b;->w:I

    iput-object p1, p0, Ldn0/b;->x:Ly81/e;

    iput p2, p0, Ldn0/b;->y:F

    iput-object p3, p0, Ldn0/b;->z:Lqy0/g;

    iput p4, p0, Ldn0/b;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ldn0/b;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Ldn0/b;->x:Ly81/e;

    iget v2, p0, Ldn0/b;->y:F

    iget-object v3, p0, Ldn0/b;->z:Lqy0/g;

    iget v4, p0, Ldn0/b;->E:I

    invoke-static/range {v1 .. v6}, Lxo1/b;->h(Ly81/e;FLqy0/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Ldn0/b;->x:Ly81/e;

    iget v1, p0, Ldn0/b;->y:F

    iget-object v2, p0, Ldn0/b;->z:Lqy0/g;

    iget v3, p0, Ldn0/b;->E:I

    invoke-static/range {v0 .. v5}, Lqy0/f;->f(Ly81/e;FLqy0/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Ldn0/b;->x:Ly81/e;

    iget v1, p0, Ldn0/b;->y:F

    iget-object v2, p0, Ldn0/b;->z:Lqy0/g;

    iget v3, p0, Ldn0/b;->E:I

    invoke-static/range {v0 .. v5}, Ldn0/h;->c(Ly81/e;FLqy0/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
