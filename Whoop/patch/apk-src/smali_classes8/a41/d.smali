.class public final synthetic La41/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/lifecycle/g0;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:Lq0/y;


# direct methods
.method public synthetic constructor <init>(ZILq0/y;Landroidx/lifecycle/g0;II)V
    .locals 0

    iput p6, p0, La41/d;->w:I

    iput-boolean p1, p0, La41/d;->x:Z

    iput p2, p0, La41/d;->y:I

    iput-object p3, p0, La41/d;->z:Lq0/y;

    iput-object p4, p0, La41/d;->E:Landroidx/lifecycle/g0;

    iput p5, p0, La41/d;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, La41/d;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v1, p0, La41/d;->x:Z

    iget v2, p0, La41/d;->y:I

    iget-object v3, p0, La41/d;->z:Lq0/y;

    iget-object v4, p0, La41/d;->E:Landroidx/lifecycle/g0;

    iget v5, p0, La41/d;->F:I

    invoke-static/range {v1 .. v7}, La41/l;->c(ZILq0/y;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v0, p0, La41/d;->x:Z

    iget v1, p0, La41/d;->y:I

    iget-object v2, p0, La41/d;->z:Lq0/y;

    iget-object v3, p0, La41/d;->E:Landroidx/lifecycle/g0;

    iget v4, p0, La41/d;->F:I

    invoke-static/range {v0 .. v6}, La41/l;->b(ZILq0/y;Landroidx/lifecycle/g0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
