.class public final synthetic Lbr2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;Landroidx/compose/ui/Modifier;III)V
    .locals 0

    .line 1
    iput p7, p0, Lbr2/g;->w:I

    iput-wide p1, p0, Lbr2/g;->x:J

    iput-object p3, p0, Lbr2/g;->F:Ljava/lang/Object;

    iput-object p4, p0, Lbr2/g;->y:Landroidx/compose/ui/Modifier;

    iput p5, p0, Lbr2/g;->z:I

    iput p6, p0, Lbr2/g;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/Enum;JIII)V
    .locals 0

    .line 2
    iput p7, p0, Lbr2/g;->w:I

    iput-object p1, p0, Lbr2/g;->y:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lbr2/g;->F:Ljava/lang/Object;

    iput-wide p3, p0, Lbr2/g;->x:J

    iput p5, p0, Lbr2/g;->z:I

    iput p6, p0, Lbr2/g;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lbr2/c;Landroidx/compose/ui/Modifier;JII)V
    .locals 1

    .line 3
    const/4 v0, 0x0

    iput v0, p0, Lbr2/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbr2/g;->F:Ljava/lang/Object;

    iput-object p2, p0, Lbr2/g;->y:Landroidx/compose/ui/Modifier;

    iput-wide p3, p0, Lbr2/g;->x:J

    iput p5, p0, Lbr2/g;->z:I

    iput p6, p0, Lbr2/g;->E:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;JLandroidx/compose/ui/Modifier;III)V
    .locals 0

    .line 4
    iput p7, p0, Lbr2/g;->w:I

    iput-object p1, p0, Lbr2/g;->F:Ljava/lang/Object;

    iput-wide p2, p0, Lbr2/g;->x:J

    iput-object p4, p0, Lbr2/g;->y:Landroidx/compose/ui/Modifier;

    iput p5, p0, Lbr2/g;->z:I

    iput p6, p0, Lbr2/g;->E:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lbr2/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbr2/g;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzy0/d;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lbr2/g;->y:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lbr2/g;->x:J

    iget v5, p0, Lbr2/g;->z:I

    iget v6, p0, Lbr2/g;->E:I

    invoke-static/range {v1 .. v8}, Lzy0/c;->a(Landroidx/compose/ui/Modifier;Lzy0/d;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbr2/g;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lbr2/g;->E:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget-wide v1, p0, Lbr2/g;->x:J

    iget-object v4, p0, Lbr2/g;->y:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lbr2/g;->z:I

    invoke-static/range {v1 .. v7}, Ls9/f;->c(JLc93/a;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbr2/g;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Li2/a1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-wide v1, p0, Lbr2/g;->x:J

    iget-object v4, p0, Lbr2/g;->y:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lbr2/g;->z:I

    iget v6, p0, Lbr2/g;->E:I

    invoke-static/range {v1 .. v8}, Lqk2/b;->c(JLi2/a1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbr2/g;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lok2/d;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-wide v2, p0, Lbr2/g;->x:J

    iget-object v4, p0, Lbr2/g;->y:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lbr2/g;->z:I

    iget v6, p0, Lbr2/g;->E:I

    invoke-static/range {v1 .. v8}, Lqk2/b;->h(Lok2/d;JLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lbr2/g;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lmz0/a;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lbr2/g;->y:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lbr2/g;->x:J

    iget v5, p0, Lbr2/g;->z:I

    iget v6, p0, Lbr2/g;->E:I

    invoke-static/range {v1 .. v8}, Lmz0/b;->b(Landroidx/compose/ui/Modifier;Lmz0/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lbr2/g;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lgz0/m0;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-wide v2, p0, Lbr2/g;->x:J

    iget-object v4, p0, Lbr2/g;->y:Landroidx/compose/ui/Modifier;

    iget v5, p0, Lbr2/g;->z:I

    iget v6, p0, Lbr2/g;->E:I

    invoke-static/range {v1 .. v8}, Lcw2/d;->a(Lgz0/m0;JLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lbr2/g;->F:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lbr2/c;

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v2, p0, Lbr2/g;->y:Landroidx/compose/ui/Modifier;

    iget-wide v3, p0, Lbr2/g;->x:J

    iget v5, p0, Lbr2/g;->z:I

    iget v6, p0, Lbr2/g;->E:I

    invoke-static/range {v1 .. v8}, Lbr2/h;->c(Lbr2/c;Landroidx/compose/ui/Modifier;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
