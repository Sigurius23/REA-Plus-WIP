.class public final synthetic Lhy0/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:J

.field public final synthetic G:J

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lhy0/g;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/a;III)V
    .locals 0

    .line 1
    iput p12, p0, Lhy0/h2;->w:I

    iput-object p1, p0, Lhy0/h2;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lhy0/h2;->y:Ljava/lang/Object;

    iput-object p3, p0, Lhy0/h2;->z:Ljava/lang/Object;

    iput-object p4, p0, Lhy0/h2;->E:Ljava/lang/Object;

    iput-wide p5, p0, Lhy0/h2;->F:J

    iput-wide p7, p0, Lhy0/h2;->G:J

    iput-object p9, p0, Lhy0/h2;->H:Ljava/lang/Object;

    iput p10, p0, Lhy0/h2;->I:I

    iput p11, p0, Lhy0/h2;->J:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lc93/a;Landroidx/compose/ui/Modifier;Li2/a1;JJLg1/t1;Lx1/b;II)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lhy0/h2;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/h2;->y:Ljava/lang/Object;

    iput-object p2, p0, Lhy0/h2;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lhy0/h2;->z:Ljava/lang/Object;

    iput-wide p4, p0, Lhy0/h2;->F:J

    iput-wide p6, p0, Lhy0/h2;->G:J

    iput-object p8, p0, Lhy0/h2;->E:Ljava/lang/Object;

    iput-object p9, p0, Lhy0/h2;->H:Ljava/lang/Object;

    iput p10, p0, Lhy0/h2;->I:I

    iput p11, p0, Lhy0/h2;->J:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget v0, p0, Lhy0/h2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhy0/h2;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lc93/a;

    iget-object v0, p0, Lhy0/h2;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Li2/a1;

    iget-object v0, p0, Lhy0/h2;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lg1/t1;

    iget-object v0, p0, Lhy0/h2;->H:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lx1/b;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lhy0/h2;->I:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v11

    iget-object v2, p0, Lhy0/h2;->x:Landroidx/compose/ui/Modifier;

    iget-wide v4, p0, Lhy0/h2;->F:J

    iget-wide v6, p0, Lhy0/h2;->G:J

    iget v12, p0, Lhy0/h2;->J:I

    invoke-static/range {v1 .. v12}, Lg1/b3;->a(Lc93/a;Landroidx/compose/ui/Modifier;Li2/a1;JJLg1/t1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhy0/h2;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhy0/g;

    iget-object v0, p0, Lhy0/h2;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lhy0/h2;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Float;

    iget-object v0, p0, Lhy0/h2;->H:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lb91/a;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v1, p0, Lhy0/h2;->x:Landroidx/compose/ui/Modifier;

    iget-wide v5, p0, Lhy0/h2;->F:J

    iget-wide v7, p0, Lhy0/h2;->G:J

    iget v10, p0, Lhy0/h2;->I:I

    iget v11, p0, Lhy0/h2;->J:I

    invoke-static/range {v1 .. v13}, Lhy0/i2;->d(Landroidx/compose/ui/Modifier;Lhy0/g;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lhy0/h2;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhy0/g;

    iget-object v0, p0, Lhy0/h2;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lhy0/h2;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Float;

    iget-object v0, p0, Lhy0/h2;->H:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lb91/a;

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v1, p0, Lhy0/h2;->x:Landroidx/compose/ui/Modifier;

    iget-wide v5, p0, Lhy0/h2;->F:J

    iget-wide v7, p0, Lhy0/h2;->G:J

    iget v10, p0, Lhy0/h2;->I:I

    iget v11, p0, Lhy0/h2;->J:I

    invoke-static/range {v1 .. v13}, Lhy0/i2;->f(Landroidx/compose/ui/Modifier;Lhy0/g;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
