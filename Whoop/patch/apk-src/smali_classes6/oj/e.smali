.class public final Loj/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/types/Nudge;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Loj/e;->w:I

    iput-object p1, p0, Loj/e;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p2, p0, Loj/e;->y:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Loj/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance p2, Loj/e;

    iget-object v0, p0, Loj/e;->y:Lp1/c1;

    const/4 v1, 0x0

    iget-object v2, p0, Loj/e;->x:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-direct {p2, v2, v0, v1}, Loj/e;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lp1/c1;I)V

    const v0, -0x4e1c6e9

    invoke-static {v0, p1, p2}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, Lx43/j;->k(Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    iget-object p2, p0, Loj/e;->x:Lcom/amplitude/android/engagement/types/Nudge;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/Nudge;->getType()Lcom/amplitude/android/engagement/types/NudgeType;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    const-string v1, "SURVEY"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, "Survey"

    goto :goto_4

    :cond_5
    const-string v0, "Guide"

    :goto_4
    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/Nudge;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    :cond_6
    const-string v1, "No nudge available"

    :cond_7
    const/4 v2, 0x0

    invoke-static {v0, v1, p1, v2}, Lx43/j;->l(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p1, v2}, Lx43/j;->j(Landroidx/compose/runtime/Composer;I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Loj/e;->y:Lp1/c1;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/amplitude/android/engagement/types/SimulationContext;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/SimulationContext;->getCurrentStepIndex()I

    move-result v3

    goto :goto_5

    :cond_8
    move v3, v2

    :goto_5
    const/4 v4, 0x1

    add-int/2addr v3, v4

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x2f

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_9

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/Nudge;->getSteps()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    :cond_9
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Step"

    const/4 v3, 0x6

    invoke-static {v0, p2, p1, v3}, Lx43/j;->l(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p1, v2}, Lx43/j;->j(Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/amplitude/android/engagement/types/SimulationContext;

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/SimulationContext;->getEndUser()Lcom/amplitude/android/engagement/types/EndUser;

    move-result-object p2

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/EndUser;->getUserId()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_b

    :cond_a
    const-string p2, "No user"

    :cond_b
    const-string v0, "User"

    invoke-static {v0, p2, p1, v3}, Lx43/j;->l(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {p1, v2}, Lx43/j;->j(Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/amplitude/android/engagement/types/SimulationContext;

    if-eqz p2, :cond_c

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/SimulationContext;->getScreen()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_d

    :cond_c
    const-string p2, "No screen detected"

    :cond_d
    const-string v0, "Screen"

    invoke-static {v0, p2, p1, v3}, Lx43/j;->l(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
