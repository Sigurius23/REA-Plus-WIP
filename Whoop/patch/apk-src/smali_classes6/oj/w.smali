.class public final Loj/w;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/types/Nudge;

.field public final synthetic y:Loj/g;

.field public final synthetic z:Loj/g;


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/types/DebugStatus;Lcom/amplitude/android/engagement/types/Nudge;Loj/g;Loj/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Loj/w;->w:I

    .line 1
    iput-object p1, p0, Loj/w;->E:Ljava/lang/Object;

    iput-object p2, p0, Loj/w;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p3, p0, Loj/w;->y:Loj/g;

    iput-object p4, p0, Loj/w;->z:Loj/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Loj/g;Loj/g;I)V
    .locals 0

    const/4 p5, 0x1

    iput p5, p0, Loj/w;->w:I

    .line 2
    iput-object p1, p0, Loj/w;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p2, p0, Loj/w;->E:Ljava/lang/Object;

    iput-object p3, p0, Loj/w;->y:Loj/g;

    iput-object p4, p0, Loj/w;->z:Loj/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Loj/w;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Loj/w;->E:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lcom/amplitude/android/engagement/types/SimulationContext;

    const/16 p1, 0x49

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-object v1, p0, Loj/w;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v3, p0, Loj/w;->y:Loj/g;

    iget-object v4, p0, Loj/w;->z:Loj/g;

    invoke-static/range {v1 .. v6}, Lcom/squareup/wire/n;->g(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;Loj/g;Loj/g;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, Loj/w;->E:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/types/DebugStatus;

    and-int/lit8 p2, p2, 0xb

    const/4 v1, 0x2

    if-ne p2, v1, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_2

    :cond_1
    :goto_0
    move-object v6, p1

    check-cast v6, Lp1/q;

    const p1, 0x320534a

    invoke-virtual {v6, p1}, Lp1/q;->f0(I)V

    sget-object p1, Lcom/amplitude/android/engagement/types/DebugStatus;->INFO:Lcom/amplitude/android/engagement/types/DebugStatus;

    const/4 p2, 0x0

    iget-object v1, p0, Loj/w;->x:Lcom/amplitude/android/engagement/types/Nudge;

    if-ne v0, p1, :cond_3

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/Nudge;->getTriggerConfig()Lcom/amplitude/android/engagement/types/TriggerConfig;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, p2

    :goto_1
    instance-of v2, v2, Llj/o0;

    if-eqz v2, :cond_3

    new-instance v2, La3/z0;

    iget-object v3, p0, Loj/w;->y:Loj/g;

    const/16 v4, 0x15

    invoke-direct {v2, v4, v3, v1}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lce/w;->L()Lo2/e;

    move-result-object v3

    const/4 v5, 0x0

    const/16 v7, 0x180

    const-string v4, "Manually trigger event"

    invoke-static/range {v2 .. v7}, Lvp/c;->b(Lc93/a;Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_3
    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    if-ne v0, p1, :cond_5

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/Nudge;->getTriggerConfig()Lcom/amplitude/android/engagement/types/TriggerConfig;

    move-result-object p2

    :cond_4
    instance-of p1, p2, Llj/p0;

    if-eqz p1, :cond_5

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/Nudge;->getTriggerConfig()Lcom/amplitude/android/engagement/types/TriggerConfig;

    move-result-object p1

    check-cast p1, Llj/p0;

    iget-object p1, p1, Llj/p0;->a:Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/SimpleTriggerConfig;->getType()Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;

    move-result-object p1

    sget-object p2, Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;->NONE:Lcom/amplitude/android/engagement/types/SimpleNudgeTriggerType;

    if-ne p1, p2, :cond_5

    new-instance v2, La3/z0;

    iget-object p1, p0, Loj/w;->z:Loj/g;

    const/16 p2, 0x16

    invoke-direct {v2, p2, p1, v1}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lce/w;->L()Lo2/e;

    move-result-object v3

    const/4 v5, 0x0

    const/16 v7, 0x180

    const-string v4, "Manually trigger"

    invoke-static/range {v2 .. v7}, Lvp/c;->b(Lc93/a;Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
