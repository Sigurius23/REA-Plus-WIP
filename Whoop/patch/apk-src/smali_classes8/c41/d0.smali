.class public final synthetic Lc41/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;Ljava/lang/Object;III)V
    .locals 0

    .line 1
    iput p6, p0, Lc41/d0;->w:I

    iput p1, p0, Lc41/d0;->x:F

    iput-object p2, p0, Lc41/d0;->F:Ljava/lang/Object;

    iput-object p3, p0, Lc41/d0;->y:Ljava/lang/Object;

    iput p4, p0, Lc41/d0;->z:I

    iput p5, p0, Lc41/d0;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILf11/h;Lf11/e;FI)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Lc41/d0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc41/d0;->z:I

    iput-object p2, p0, Lc41/d0;->F:Ljava/lang/Object;

    iput-object p3, p0, Lc41/d0;->y:Ljava/lang/Object;

    iput p4, p0, Lc41/d0;->x:F

    iput p5, p0, Lc41/d0;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lhy0/r1;FII)V
    .locals 1

    .line 3
    const/4 v0, 0x4

    iput v0, p0, Lc41/d0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/d0;->F:Ljava/lang/Object;

    iput-object p2, p0, Lc41/d0;->y:Ljava/lang/Object;

    iput p3, p0, Lc41/d0;->x:F

    iput p4, p0, Lc41/d0;->z:I

    iput p5, p0, Lc41/d0;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLandroidx/compose/ui/Modifier;III)V
    .locals 0

    .line 4
    iput p6, p0, Lc41/d0;->w:I

    iput-object p1, p0, Lc41/d0;->F:Ljava/lang/Object;

    iput p2, p0, Lc41/d0;->x:F

    iput-object p3, p0, Lc41/d0;->y:Ljava/lang/Object;

    iput p4, p0, Lc41/d0;->z:I

    iput p5, p0, Lc41/d0;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lc41/d0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc41/d0;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lc93/a;

    iget-object v0, p0, Lc41/d0;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v1, p0, Lc41/d0;->x:F

    iget v4, p0, Lc41/d0;->z:I

    iget v5, p0, Lc41/d0;->E:I

    invoke-static/range {v1 .. v7}, Lm22/s;->c(FLc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lc41/d0;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lc41/d0;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lhy0/r1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v3, p0, Lc41/d0;->x:F

    iget v4, p0, Lc41/d0;->z:I

    iget v5, p0, Lc41/d0;->E:I

    invoke-static/range {v1 .. v7}, Lhy0/q1;->d(Lcom/whoop/design/util/TextResource;Lhy0/r1;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lc41/d0;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lf11/h;

    iget-object v0, p0, Lc41/d0;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lf11/e;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v1, p0, Lc41/d0;->z:I

    iget v4, p0, Lc41/d0;->x:F

    iget v5, p0, Lc41/d0;->E:I

    invoke-static/range {v1 .. v7}, Lf11/d;->c(ILf11/h;Lf11/e;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lc41/d0;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    iget-object v0, p0, Lc41/d0;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v1, p0, Lc41/d0;->x:F

    iget v4, p0, Lc41/d0;->z:I

    iget v5, p0, Lc41/d0;->E:I

    invoke-static/range {v1 .. v7}, Lcz0/o;->f(FLjava/util/List;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lc41/d0;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkd1/o;

    iget-object v0, p0, Lc41/d0;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v2, p0, Lc41/d0;->x:F

    iget v4, p0, Lc41/d0;->z:I

    iget v5, p0, Lc41/d0;->E:I

    invoke-static/range {v1 .. v7}, Lc41/l4;->h(Lkd1/o;FLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lc41/d0;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgz0/m0;

    iget-object v0, p0, Lc41/d0;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v2, p0, Lc41/d0;->x:F

    iget v4, p0, Lc41/d0;->z:I

    iget v5, p0, Lc41/d0;->E:I

    invoke-static/range {v1 .. v7}, Lc41/e0;->d(Lgz0/m0;FLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
