.class public final synthetic Lsl0/f2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lzk0/i0;

.field public final synthetic F:Lsl0/b3;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Laf3/t;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Liz0/m;


# direct methods
.method public synthetic constructor <init>(Laf3/t;Landroidx/compose/ui/Modifier;Liz0/m;Lzk0/i0;Lsl0/b3;III)V
    .locals 0

    iput p8, p0, Lsl0/f2;->w:I

    iput-object p1, p0, Lsl0/f2;->x:Laf3/t;

    iput-object p2, p0, Lsl0/f2;->y:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lsl0/f2;->z:Liz0/m;

    iput-object p4, p0, Lsl0/f2;->E:Lzk0/i0;

    iput-object p5, p0, Lsl0/f2;->F:Lsl0/b3;

    iput p6, p0, Lsl0/f2;->G:I

    iput p7, p0, Lsl0/f2;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lsl0/f2;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lsl0/f2;->x:Laf3/t;

    iget-object v2, p0, Lsl0/f2;->y:Landroidx/compose/ui/Modifier;

    iget-object v3, p0, Lsl0/f2;->z:Liz0/m;

    iget-object v4, p0, Lsl0/f2;->E:Lzk0/i0;

    iget-object v5, p0, Lsl0/f2;->F:Lsl0/b3;

    iget v6, p0, Lsl0/f2;->G:I

    iget v7, p0, Lsl0/f2;->H:I

    invoke-static/range {v1 .. v9}, Lsl0/l2;->d(Laf3/t;Landroidx/compose/ui/Modifier;Liz0/m;Lzk0/i0;Lsl0/b3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lsl0/f2;->x:Laf3/t;

    iget-object v1, p0, Lsl0/f2;->y:Landroidx/compose/ui/Modifier;

    iget-object v2, p0, Lsl0/f2;->z:Liz0/m;

    iget-object v3, p0, Lsl0/f2;->E:Lzk0/i0;

    iget-object v4, p0, Lsl0/f2;->F:Lsl0/b3;

    iget v5, p0, Lsl0/f2;->G:I

    iget v6, p0, Lsl0/f2;->H:I

    invoke-static/range {v0 .. v8}, Lsl0/l2;->b(Laf3/t;Landroidx/compose/ui/Modifier;Liz0/m;Lzk0/i0;Lsl0/b3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
