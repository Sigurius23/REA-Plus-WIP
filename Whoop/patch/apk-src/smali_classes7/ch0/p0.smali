.class public final synthetic Lch0/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:I

.field public final synthetic G:Ll83/e;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll0/u;ZLf0/r1;Lc93/a;ILc93/a;III)V
    .locals 0

    .line 1
    iput p9, p0, Lch0/p0;->w:I

    iput-object p1, p0, Lch0/p0;->x:Ljava/lang/Object;

    iput-boolean p2, p0, Lch0/p0;->y:Z

    iput-object p3, p0, Lch0/p0;->z:Ljava/lang/Object;

    iput-object p4, p0, Lch0/p0;->E:Ljava/lang/Object;

    iput p5, p0, Lch0/p0;->F:I

    iput-object p6, p0, Lch0/p0;->G:Ll83/e;

    iput p7, p0, Lch0/p0;->H:I

    iput p8, p0, Lch0/p0;->I:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;ILjava/util/List;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lch0/p0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lch0/p0;->y:Z

    iput-object p2, p0, Lch0/p0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lch0/p0;->z:Ljava/lang/Object;

    iput p4, p0, Lch0/p0;->F:I

    iput-object p5, p0, Lch0/p0;->E:Ljava/lang/Object;

    iput-object p6, p0, Lch0/p0;->G:Ll83/e;

    iput p7, p0, Lch0/p0;->H:I

    iput p8, p0, Lch0/p0;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lch0/p0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/p0;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lch0/p0;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lch0/p0;->E:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/util/List;

    iget-object v0, p0, Lch0/p0;->G:Ll83/e;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-boolean v1, p0, Lch0/p0;->y:Z

    iget v4, p0, Lch0/p0;->F:I

    iget v7, p0, Lch0/p0;->H:I

    iget v8, p0, Lch0/p0;->I:I

    invoke-static/range {v1 .. v10}, Ltp0/e;->a(ZLkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;ILjava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lch0/p0;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lch0/p0;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lf0/r1;

    iget-object v0, p0, Lch0/p0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Lch0/p0;->G:Ll83/e;

    move-object v6, v0

    check-cast v6, Lc93/a;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-boolean v2, p0, Lch0/p0;->y:Z

    iget v5, p0, Lch0/p0;->F:I

    iget v7, p0, Lch0/p0;->H:I

    iget v8, p0, Lch0/p0;->I:I

    invoke-static/range {v1 .. v10}, Lch0/q0;->e(Ll0/u;ZLf0/r1;Lc93/a;ILc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lch0/p0;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ll0/u;

    iget-object v0, p0, Lch0/p0;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lf0/r1;

    iget-object v0, p0, Lch0/p0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    iget-object v0, p0, Lch0/p0;->G:Ll83/e;

    move-object v6, v0

    check-cast v6, Lc93/a;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-boolean v2, p0, Lch0/p0;->y:Z

    iget v5, p0, Lch0/p0;->F:I

    iget v7, p0, Lch0/p0;->H:I

    iget v8, p0, Lch0/p0;->I:I

    invoke-static/range {v1 .. v10}, Lch0/q0;->d(Ll0/u;ZLf0/r1;Lc93/a;ILc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
