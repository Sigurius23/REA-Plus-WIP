.class public final synthetic Ll1/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:F

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;FJIII)V
    .locals 0

    iput p7, p0, Ll1/n1;->w:I

    iput-object p1, p0, Ll1/n1;->x:Landroidx/compose/ui/Modifier;

    iput p2, p0, Ll1/n1;->y:F

    iput-wide p3, p0, Ll1/n1;->z:J

    iput p5, p0, Ll1/n1;->E:I

    iput p6, p0, Ll1/n1;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ll1/n1;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ll1/n1;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget-object v1, p0, Ll1/n1;->x:Landroidx/compose/ui/Modifier;

    iget-wide v2, p0, Ll1/n1;->z:J

    iget v4, p0, Ll1/n1;->y:F

    iget v7, p0, Ll1/n1;->F:I

    invoke-static/range {v1 .. v7}, Ll1/k3;->c(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;I)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Ll1/n1;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v4

    iget-object v0, p0, Ll1/n1;->x:Landroidx/compose/ui/Modifier;

    iget-wide v1, p0, Ll1/n1;->z:J

    iget v3, p0, Ll1/n1;->y:F

    iget v6, p0, Ll1/n1;->F:I

    invoke-static/range {v0 .. v6}, Ll1/k3;->d(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
