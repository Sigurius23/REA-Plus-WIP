.class public final synthetic Lc41/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lc41/p0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/p0;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc41/p0;->F:Ljava/lang/Object;

    iput-wide p3, p0, Lc41/p0;->y:J

    iput-object p5, p0, Lc41/p0;->G:Ljava/lang/Object;

    iput-object p6, p0, Lc41/p0;->H:Ljava/lang/Object;

    iput p7, p0, Lc41/p0;->z:I

    iput p8, p0, Lc41/p0;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lq81/b;Landroidx/lifecycle/g0;Lb91/a;JII)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lc41/p0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/p0;->x:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lc41/p0;->F:Ljava/lang/Object;

    iput-object p3, p0, Lc41/p0;->G:Ljava/lang/Object;

    iput-object p4, p0, Lc41/p0;->H:Ljava/lang/Object;

    iput-wide p5, p0, Lc41/p0;->y:J

    iput p7, p0, Lc41/p0;->z:I

    iput p8, p0, Lc41/p0;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Lok2/j;JLb91/a;Lb91/a;Landroidx/compose/ui/Modifier;II)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Lc41/p0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/p0;->F:Ljava/lang/Object;

    iput-wide p2, p0, Lc41/p0;->y:J

    iput-object p4, p0, Lc41/p0;->G:Ljava/lang/Object;

    iput-object p5, p0, Lc41/p0;->H:Ljava/lang/Object;

    iput-object p6, p0, Lc41/p0;->x:Landroidx/compose/ui/Modifier;

    iput p7, p0, Lc41/p0;->z:I

    iput p8, p0, Lc41/p0;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lc41/p0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/p0;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lok2/j;

    iget-object v0, p0, Lc41/p0;->G:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lb91/a;

    iget-object v0, p0, Lc41/p0;->H:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lb91/a;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-wide v2, p0, Lc41/p0;->y:J

    iget-object v6, p0, Lc41/p0;->x:Landroidx/compose/ui/Modifier;

    iget v7, p0, Lc41/p0;->z:I

    iget v8, p0, Lc41/p0;->E:I

    invoke-static/range {v1 .. v10}, Lqk2/b;->f(Lok2/j;JLb91/a;Lb91/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc41/p0;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lq81/b;

    iget-object v0, p0, Lc41/p0;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/lifecycle/g0;

    iget-object v0, p0, Lc41/p0;->H:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lb91/a;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v1, p0, Lc41/p0;->x:Landroidx/compose/ui/Modifier;

    iget-wide v5, p0, Lc41/p0;->y:J

    iget v7, p0, Lc41/p0;->z:I

    iget v8, p0, Lc41/p0;->E:I

    invoke-static/range {v1 .. v10}, Lq81/a;->d(Landroidx/compose/ui/Modifier;Lq81/b;Landroidx/lifecycle/g0;Lb91/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lc41/p0;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc41/u0;

    iget-object v0, p0, Lc41/p0;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lf0/t;

    iget-object v0, p0, Lc41/p0;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lc93/a;

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v1, p0, Lc41/p0;->x:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lc41/p0;->y:J

    iget v7, p0, Lc41/p0;->z:I

    iget v8, p0, Lc41/p0;->E:I

    invoke-static/range {v1 .. v10}, Lc41/q0;->i(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
