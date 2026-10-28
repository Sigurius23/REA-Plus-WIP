.class public final synthetic Lsl0/t1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZIII)V
    .locals 0

    .line 1
    iput p6, p0, Lsl0/t1;->w:I

    iput-object p1, p0, Lsl0/t1;->E:Ljava/lang/Object;

    iput-object p2, p0, Lsl0/t1;->F:Ljava/lang/Object;

    iput-boolean p3, p0, Lsl0/t1;->x:Z

    iput p4, p0, Lsl0/t1;->y:I

    iput p5, p0, Lsl0/t1;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;III)V
    .locals 0

    .line 2
    iput p6, p0, Lsl0/t1;->w:I

    iput-object p1, p0, Lsl0/t1;->E:Ljava/lang/Object;

    iput-boolean p2, p0, Lsl0/t1;->x:Z

    iput-object p3, p0, Lsl0/t1;->F:Ljava/lang/Object;

    iput p4, p0, Lsl0/t1;->y:I

    iput p5, p0, Lsl0/t1;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLg40/z1;ILandroidx/compose/ui/Modifier;I)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Lsl0/t1;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lsl0/t1;->x:Z

    iput-object p2, p0, Lsl0/t1;->E:Ljava/lang/Object;

    iput p3, p0, Lsl0/t1;->y:I

    iput-object p4, p0, Lsl0/t1;->F:Ljava/lang/Object;

    iput p5, p0, Lsl0/t1;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lsl0/t1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lm91/u;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lsl0/t1;->x:Z

    iget v4, p0, Lsl0/t1;->y:I

    iget v5, p0, Lsl0/t1;->z:I

    invoke-static/range {v1 .. v7}, Lzk2/v;->a(Lm91/u;ZLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lyu2/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lsl0/t1;->x:Z

    iget v4, p0, Lsl0/t1;->y:I

    iget v5, p0, Lsl0/t1;->z:I

    invoke-static/range {v1 .. v7}, Lyu2/e;->c(Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;Lyu2/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwt2/k$c;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lsl0/t1;->x:Z

    iget v4, p0, Lsl0/t1;->y:I

    iget v5, p0, Lsl0/t1;->z:I

    invoke-static/range {v1 .. v7}, Lyt2/k;->g(Lwt2/k$c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lyl0/c;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lsl0/t1;->x:Z

    iget v4, p0, Lsl0/t1;->y:I

    iget v5, p0, Lsl0/t1;->z:I

    invoke-static/range {v1 .. v7}, Lyl0/b;->g(Lyl0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltk2/a;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lsl0/t1;->x:Z

    iget v4, p0, Lsl0/t1;->y:I

    iget v5, p0, Lsl0/t1;->z:I

    invoke-static/range {v1 .. v7}, Lyk2/l;->u(Ltk2/a;ZLandroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lxq2/r0;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lsl0/t1;->x:Z

    iget v4, p0, Lsl0/t1;->y:I

    iget v5, p0, Lsl0/t1;->z:I

    invoke-static/range {v1 .. v7}, Lxq2/q0;->l(Landroidx/compose/ui/Modifier;Lxq2/r0;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lsl0/t1;->x:Z

    iget v4, p0, Lsl0/t1;->y:I

    iget v5, p0, Lsl0/t1;->z:I

    invoke-static/range {v1 .. v7}, Lwo1/i0;->a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lsl0/t1;->x:Z

    iget v4, p0, Lsl0/t1;->y:I

    iget v5, p0, Lsl0/t1;->z:I

    invoke-static/range {v1 .. v7}, Lwo1/f;->b(Landroidx/compose/ui/Modifier;Ljava/util/List;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltp1/b;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lsl0/t1;->x:Z

    iget v4, p0, Lsl0/t1;->y:I

    iget v5, p0, Lsl0/t1;->z:I

    invoke-static/range {v1 .. v7}, Lvp1/h;->C(Ltp1/b;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltp1/g;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v2, p0, Lsl0/t1;->x:Z

    iget v4, p0, Lsl0/t1;->y:I

    iget v5, p0, Lsl0/t1;->z:I

    invoke-static/range {v1 .. v7}, Lvp1/h;->t(Ltp1/g;ZLc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lg40/z1;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lsl0/t1;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-boolean v1, p0, Lsl0/t1;->x:Z

    iget v3, p0, Lsl0/t1;->y:I

    invoke-static/range {v1 .. v6}, Ls9/f;->i(ZLg40/z1;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lsl0/t1;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lsl0/v1;

    iget-object v0, p0, Lsl0/t1;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lsl0/t1;->x:Z

    iget v4, p0, Lsl0/t1;->y:I

    iget v5, p0, Lsl0/t1;->z:I

    invoke-static/range {v1 .. v7}, Lsl0/u1;->b(Lsl0/v1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
