.class public final synthetic Lrq2/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;Ll83/e;Z)V
    .locals 0

    .line 1
    iput p2, p0, Lrq2/w;->w:I

    iput-object p3, p0, Lrq2/w;->E:Ljava/lang/Object;

    iput-object p4, p0, Lrq2/w;->F:Ljava/lang/Object;

    iput-boolean p6, p0, Lrq2/w;->x:Z

    iput-object p5, p0, Lrq2/w;->y:Ljava/lang/Object;

    iput p1, p0, Lrq2/w;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLx30/k;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;I)V
    .locals 1

    .line 2
    const/16 v0, 0xc

    iput v0, p0, Lrq2/w;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lrq2/w;->x:Z

    iput-object p2, p0, Lrq2/w;->E:Ljava/lang/Object;

    iput-object p3, p0, Lrq2/w;->F:Ljava/lang/Object;

    iput-object p4, p0, Lrq2/w;->y:Ljava/lang/Object;

    iput p5, p0, Lrq2/w;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lrq2/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lzq2/l;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lzq2/f;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lzq2/l;->c(Lzq2/l;Lzq2/f;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lyo0/g;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/m;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lyo0/e;->t(Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingHighlightID;Lyo0/g;ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lx30/k;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, p0, Lrq2/w;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-boolean v1, p0, Lrq2/w;->x:Z

    invoke-static/range {v1 .. v6}, Lrj/j;->a(ZLx30/k;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lwq2/a;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Llr2/b;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lwq2/a;->b(Lwq2/a;Llr2/b;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lw41/w;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/m;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lw41/a;->d(Landroidx/compose/ui/Modifier;Lw41/w;ZLc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvq2/b;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lvq2/c;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lvq2/b;->b(Lvq2/b;Lvq2/c;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lso1/h;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ltp1/a;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lvp1/h;->a(Lso1/h;Ltp1/a;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Luq2/e;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Luq2/d;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Luq2/e;->b(Luq2/e;Luq2/d;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltq2/f;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ltq2/g;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Ltq2/f;->b(Ltq2/f;Ltq2/g;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc93/a;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lsz0/r1;->b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lsq2/c;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lsq2/d;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lsq2/c;->b(Lsq2/c;Lsq2/d;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lrq2/o0;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lrq2/p0;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lrq2/o0;->b(Lrq2/o0;Lrq2/p0;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lrq2/j0;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lrq2/k0;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lrq2/j0;->b(Lrq2/j0;Lrq2/k0;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lrq2/d0;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lrq2/e0;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lrq2/d0;->b(Lrq2/d0;Lrq2/e0;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lrq2/w;->E:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lrq2/x;

    iget-object v0, p0, Lrq2/w;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lrq2/y;

    iget-object v0, p0, Lrq2/w;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-boolean v3, p0, Lrq2/w;->x:Z

    iget v5, p0, Lrq2/w;->z:I

    invoke-static/range {v1 .. v7}, Lrq2/x;->b(Lrq2/x;Lrq2/y;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
