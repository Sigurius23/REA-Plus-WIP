.class public final synthetic Lxq2/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lxq2/f0;

.field public final synthetic H:Lbc3/c0;

.field public final synthetic I:I

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IIIILkotlin/jvm/functions/Function1;Lxq2/f0;Lbc3/c0;II)V
    .locals 0

    iput p10, p0, Lxq2/w0;->w:I

    iput-object p1, p0, Lxq2/w0;->J:Ljava/lang/Object;

    iput p2, p0, Lxq2/w0;->x:I

    iput p3, p0, Lxq2/w0;->y:I

    iput p4, p0, Lxq2/w0;->z:I

    iput p5, p0, Lxq2/w0;->E:I

    iput-object p6, p0, Lxq2/w0;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lxq2/w0;->G:Lxq2/f0;

    iput-object p8, p0, Lxq2/w0;->H:Lbc3/c0;

    iput p9, p0, Lxq2/w0;->I:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lxq2/w0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxq2/w0;->J:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lmq2/b;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v2, p0, Lxq2/w0;->x:I

    iget v3, p0, Lxq2/w0;->y:I

    iget v4, p0, Lxq2/w0;->z:I

    iget v5, p0, Lxq2/w0;->E:I

    iget-object v6, p0, Lxq2/w0;->F:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lxq2/w0;->G:Lxq2/f0;

    iget-object v8, p0, Lxq2/w0;->H:Lbc3/c0;

    iget v9, p0, Lxq2/w0;->I:I

    invoke-static/range {v1 .. v11}, Lxq2/c1;->o(Lmq2/b;IIIILkotlin/jvm/functions/Function1;Lxq2/f0;Lbc3/c0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxq2/w0;->J:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/lang/Integer;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v2, p0, Lxq2/w0;->x:I

    iget v3, p0, Lxq2/w0;->y:I

    iget v4, p0, Lxq2/w0;->z:I

    iget v5, p0, Lxq2/w0;->E:I

    iget-object v6, p0, Lxq2/w0;->F:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lxq2/w0;->G:Lxq2/f0;

    iget-object v8, p0, Lxq2/w0;->H:Lbc3/c0;

    iget v9, p0, Lxq2/w0;->I:I

    invoke-static/range {v1 .. v11}, Lxq2/c1;->g(Ljava/lang/Integer;IIIILkotlin/jvm/functions/Function1;Lxq2/f0;Lbc3/c0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
