.class public final synthetic Lg1/d0;
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

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Z

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJII)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lg1/d0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/d0;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lg1/d0;->G:Ljava/lang/Object;

    iput-object p3, p0, Lg1/d0;->H:Ljava/lang/Object;

    iput-object p4, p0, Lg1/d0;->I:Ljava/lang/Object;

    iput-object p5, p0, Lg1/d0;->J:Ljava/lang/Object;

    iput-boolean p6, p0, Lg1/d0;->y:Z

    iput-wide p7, p0, Lg1/d0;->z:J

    iput p9, p0, Lg1/d0;->E:I

    iput p10, p0, Lg1/d0;->F:I

    return-void
.end method

.method public synthetic constructor <init>(ZLc93/a;Landroidx/compose/ui/Modifier;JLf0/r1;Lc4/j0;Lkotlin/jvm/functions/Function3;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lg1/d0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lg1/d0;->y:Z

    iput-object p2, p0, Lg1/d0;->G:Ljava/lang/Object;

    iput-object p3, p0, Lg1/d0;->x:Landroidx/compose/ui/Modifier;

    iput-wide p4, p0, Lg1/d0;->z:J

    iput-object p6, p0, Lg1/d0;->H:Ljava/lang/Object;

    iput-object p7, p0, Lg1/d0;->I:Ljava/lang/Object;

    iput-object p8, p0, Lg1/d0;->J:Ljava/lang/Object;

    iput p9, p0, Lg1/d0;->E:I

    iput p10, p0, Lg1/d0;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lg1/d0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/d0;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    iget-object v0, p0, Lg1/d0;->H:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lg1/d0;->I:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lsz0/g1;

    iget-object v0, p0, Lg1/d0;->J:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lcom/whoop/design/util/TextResource;

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v1, p0, Lg1/d0;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v6, p0, Lg1/d0;->y:Z

    iget-wide v7, p0, Lg1/d0;->z:J

    iget v9, p0, Lg1/d0;->E:I

    iget v10, p0, Lg1/d0;->F:I

    invoke-static/range {v1 .. v12}, Lsz0/m1;->a(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lg1/d0;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lg1/d0;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lf0/r1;

    iget-object v0, p0, Lg1/d0;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lc4/j0;

    iget-object v0, p0, Lg1/d0;->J:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function3;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lg1/d0;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v10

    iget-boolean v1, p0, Lg1/d0;->y:Z

    iget-object v3, p0, Lg1/d0;->x:Landroidx/compose/ui/Modifier;

    iget-wide v4, p0, Lg1/d0;->z:J

    iget v11, p0, Lg1/d0;->F:I

    invoke-static/range {v1 .. v11}, Lg1/f0;->a(ZLc93/a;Landroidx/compose/ui/Modifier;JLf0/r1;Lc4/j0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
