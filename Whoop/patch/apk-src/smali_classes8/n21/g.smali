.class public final synthetic Ln21/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IIJLandroidx/compose/ui/Modifier;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput v0, p0, Ln21/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p3, p0, Ln21/g;->y:J

    iput-object p5, p0, Ln21/g;->x:Landroidx/compose/ui/Modifier;

    iput p1, p0, Ln21/g;->z:I

    iput p2, p0, Ln21/g;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;JIII)V
    .locals 0

    .line 2
    iput p6, p0, Ln21/g;->w:I

    iput-object p1, p0, Ln21/g;->x:Landroidx/compose/ui/Modifier;

    iput-wide p2, p0, Ln21/g;->y:J

    iput p4, p0, Ln21/g;->z:I

    iput p5, p0, Ln21/g;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ln21/g;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-wide v1, p0, Ln21/g;->y:J

    iget-object v3, p0, Ln21/g;->x:Landroidx/compose/ui/Modifier;

    iget v4, p0, Ln21/g;->z:I

    iget v5, p0, Ln21/g;->E:I

    invoke-static/range {v1 .. v7}, Lqk2/b;->g(JLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ln21/g;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v3

    iget-wide v0, p0, Ln21/g;->y:J

    iget-object v2, p0, Ln21/g;->x:Landroidx/compose/ui/Modifier;

    iget v5, p0, Ln21/g;->E:I

    invoke-static/range {v0 .. v5}, Lds/q;->e(JLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-wide v0, p0, Ln21/g;->y:J

    iget-object v2, p0, Ln21/g;->x:Landroidx/compose/ui/Modifier;

    iget v3, p0, Ln21/g;->z:I

    iget v4, p0, Ln21/g;->E:I

    invoke-static/range {v0 .. v6}, Ln21/h;->j(JLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-wide v0, p0, Ln21/g;->y:J

    iget-object v2, p0, Ln21/g;->x:Landroidx/compose/ui/Modifier;

    iget v3, p0, Ln21/g;->z:I

    iget v4, p0, Ln21/g;->E:I

    invoke-static/range {v0 .. v6}, Ln21/h;->i(JLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
