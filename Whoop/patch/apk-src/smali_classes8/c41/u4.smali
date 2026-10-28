.class public final synthetic Lc41/u4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Z

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Laf3/w;Liz0/m;ZLkotlin/jvm/functions/Function1;IIIZII)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lc41/u4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/u4;->I:Ljava/lang/Object;

    iput-object p2, p0, Lc41/u4;->J:Ljava/lang/Object;

    iput-boolean p3, p0, Lc41/u4;->x:Z

    iput-object p4, p0, Lc41/u4;->K:Ljava/lang/Object;

    iput p5, p0, Lc41/u4;->y:I

    iput p6, p0, Lc41/u4;->z:I

    iput p7, p0, Lc41/u4;->E:I

    iput-boolean p8, p0, Lc41/u4;->F:Z

    iput p9, p0, Lc41/u4;->G:I

    iput p10, p0, Lc41/u4;->H:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;IIILy81/f;Ly81/f;ZZII)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lc41/u4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/u4;->I:Ljava/lang/Object;

    iput p2, p0, Lc41/u4;->y:I

    iput p3, p0, Lc41/u4;->z:I

    iput p4, p0, Lc41/u4;->E:I

    iput-object p5, p0, Lc41/u4;->J:Ljava/lang/Object;

    iput-object p6, p0, Lc41/u4;->K:Ljava/lang/Object;

    iput-boolean p7, p0, Lc41/u4;->x:Z

    iput-boolean p8, p0, Lc41/u4;->F:Z

    iput p9, p0, Lc41/u4;->G:I

    iput p10, p0, Lc41/u4;->H:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lc41/u4;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/u4;->I:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Laf3/w;

    iget-object v0, p0, Lc41/u4;->J:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Liz0/m;

    iget-object v0, p0, Lc41/u4;->K:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-boolean v3, p0, Lc41/u4;->x:Z

    iget v5, p0, Lc41/u4;->y:I

    iget v6, p0, Lc41/u4;->z:I

    iget v7, p0, Lc41/u4;->E:I

    iget-boolean v8, p0, Lc41/u4;->F:Z

    iget v9, p0, Lc41/u4;->G:I

    iget v10, p0, Lc41/u4;->H:I

    invoke-static/range {v1 .. v12}, Liz0/g;->q(Laf3/w;Liz0/m;ZLkotlin/jvm/functions/Function1;IIIZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc41/u4;->I:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lc41/u4;->J:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ly81/f;

    iget-object v0, p0, Lc41/u4;->K:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ly81/f;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget v2, p0, Lc41/u4;->y:I

    iget v3, p0, Lc41/u4;->z:I

    iget v4, p0, Lc41/u4;->E:I

    iget-boolean v7, p0, Lc41/u4;->x:Z

    iget-boolean v8, p0, Lc41/u4;->F:Z

    iget v9, p0, Lc41/u4;->G:I

    iget v10, p0, Lc41/u4;->H:I

    invoke-static/range {v1 .. v12}, Lc41/v4;->b(Landroidx/compose/ui/Modifier;IIILy81/f;Ly81/f;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
