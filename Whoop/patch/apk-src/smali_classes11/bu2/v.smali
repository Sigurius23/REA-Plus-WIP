.class public final synthetic Lbu2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lbu2/v;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lbu2/v;->y:J

    iput-object p3, p0, Lbu2/v;->z:Ljava/lang/Object;

    iput-object p4, p0, Lbu2/v;->G:Ljava/lang/Object;

    iput-object p5, p0, Lbu2/v;->H:Ljava/lang/Object;

    iput-object p6, p0, Lbu2/v;->I:Ljava/lang/Object;

    iput-object p7, p0, Lbu2/v;->x:Landroidx/compose/ui/Modifier;

    iput p8, p0, Lbu2/v;->E:I

    iput p9, p0, Lbu2/v;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l;Lc93/a;III)V
    .locals 0

    .line 2
    iput p10, p0, Lbu2/v;->w:I

    iput-object p1, p0, Lbu2/v;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lbu2/v;->z:Ljava/lang/Object;

    iput-wide p3, p0, Lbu2/v;->y:J

    iput-object p5, p0, Lbu2/v;->G:Ljava/lang/Object;

    iput-object p6, p0, Lbu2/v;->H:Ljava/lang/Object;

    iput-object p7, p0, Lbu2/v;->I:Ljava/lang/Object;

    iput p8, p0, Lbu2/v;->E:I

    iput p9, p0, Lbu2/v;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    .line 3
    iput p10, p0, Lbu2/v;->w:I

    iput-object p1, p0, Lbu2/v;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lbu2/v;->G:Ljava/lang/Object;

    iput-wide p3, p0, Lbu2/v;->y:J

    iput-object p5, p0, Lbu2/v;->H:Ljava/lang/Object;

    iput-object p6, p0, Lbu2/v;->I:Ljava/lang/Object;

    iput-object p7, p0, Lbu2/v;->z:Ljava/lang/Object;

    iput p8, p0, Lbu2/v;->E:I

    iput p9, p0, Lbu2/v;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lbu2/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbu2/v;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lbu2/v;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ly11/r;

    iget-object v0, p0, Lbu2/v;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Li21/l$e;

    iget-object v0, p0, Lbu2/v;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/a;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lbu2/v;->x:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lbu2/v;->y:J

    iget v8, p0, Lbu2/v;->E:I

    iget v9, p0, Lbu2/v;->F:I

    invoke-static/range {v1 .. v11}, Li21/o;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$e;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbu2/v;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lbu2/v;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ly11/r;

    iget-object v0, p0, Lbu2/v;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Li21/l$d;

    iget-object v0, p0, Lbu2/v;->z:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lbu2/v;->x:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lbu2/v;->y:J

    iget v8, p0, Lbu2/v;->E:I

    iget v9, p0, Lbu2/v;->F:I

    invoke-static/range {v1 .. v11}, Li21/n;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbu2/v;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lbu2/v;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ly11/r;

    iget-object v0, p0, Lbu2/v;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Li21/l$c;

    iget-object v0, p0, Lbu2/v;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc93/a;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lbu2/v;->x:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lbu2/v;->y:J

    iget v8, p0, Lbu2/v;->E:I

    iget v9, p0, Lbu2/v;->F:I

    invoke-static/range {v1 .. v11}, Li21/e;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbu2/v;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lbu2/v;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ly11/r;

    iget-object v0, p0, Lbu2/v;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Li21/l$a;

    iget-object v0, p0, Lbu2/v;->z:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lbu2/v;->x:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lbu2/v;->y:J

    iget v8, p0, Lbu2/v;->E:I

    iget v9, p0, Lbu2/v;->F:I

    invoke-static/range {v1 .. v11}, Li21/c;->a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLy11/r;Li21/l$a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbu2/v;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbu2/v;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbu2/v;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lbu2/v;->I:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc93/m;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-wide v1, p0, Lbu2/v;->y:J

    iget-object v7, p0, Lbu2/v;->x:Landroidx/compose/ui/Modifier;

    iget v8, p0, Lbu2/v;->E:I

    iget v9, p0, Lbu2/v;->F:I

    invoke-static/range {v1 .. v11}, Lbu2/x;->d(JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
