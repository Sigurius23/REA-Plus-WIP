.class public final Lpj/r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Lp1/c1;

.field public final synthetic G:Lcom/amplitude/android/engagement/types/Nudge;

.field public final synthetic H:Landroid/content/Context;

.field public final synthetic I:Luj/m;

.field public final synthetic J:Lp1/c1;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Landroid/graphics/Rect;

.field public final synthetic z:Lcom/amplitude/android/engagement/a;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Rect;Lcom/amplitude/android/engagement/a;Lp1/c1;Lp1/c1;Lcom/amplitude/android/engagement/types/Nudge;Landroid/content/Context;Luj/m;Lp1/c1;Lq83/d;I)V
    .locals 0

    iput p10, p0, Lpj/r;->w:I

    iput-object p1, p0, Lpj/r;->y:Landroid/graphics/Rect;

    iput-object p2, p0, Lpj/r;->z:Lcom/amplitude/android/engagement/a;

    iput-object p3, p0, Lpj/r;->E:Lp1/c1;

    iput-object p4, p0, Lpj/r;->F:Lp1/c1;

    iput-object p5, p0, Lpj/r;->G:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p6, p0, Lpj/r;->H:Landroid/content/Context;

    iput-object p7, p0, Lpj/r;->I:Luj/m;

    iput-object p8, p0, Lpj/r;->J:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 12

    iget p1, p0, Lpj/r;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lpj/r;

    iget-object v8, p0, Lpj/r;->J:Lp1/c1;

    const/4 v10, 0x1

    iget-object v1, p0, Lpj/r;->y:Landroid/graphics/Rect;

    iget-object v2, p0, Lpj/r;->z:Lcom/amplitude/android/engagement/a;

    iget-object v3, p0, Lpj/r;->E:Lp1/c1;

    iget-object v4, p0, Lpj/r;->F:Lp1/c1;

    iget-object v5, p0, Lpj/r;->G:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v6, p0, Lpj/r;->H:Landroid/content/Context;

    iget-object v7, p0, Lpj/r;->I:Luj/m;

    move-object v9, p2

    invoke-direct/range {v0 .. v10}, Lpj/r;-><init>(Landroid/graphics/Rect;Lcom/amplitude/android/engagement/a;Lp1/c1;Lp1/c1;Lcom/amplitude/android/engagement/types/Nudge;Landroid/content/Context;Luj/m;Lp1/c1;Lq83/d;I)V

    return-object v0

    :pswitch_0
    move-object v9, p2

    new-instance v1, Lpj/r;

    move-object v10, v9

    iget-object v9, p0, Lpj/r;->J:Lp1/c1;

    const/4 v11, 0x0

    iget-object v2, p0, Lpj/r;->y:Landroid/graphics/Rect;

    iget-object v3, p0, Lpj/r;->z:Lcom/amplitude/android/engagement/a;

    iget-object v4, p0, Lpj/r;->E:Lp1/c1;

    iget-object v5, p0, Lpj/r;->F:Lp1/c1;

    iget-object v6, p0, Lpj/r;->G:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v7, p0, Lpj/r;->H:Landroid/content/Context;

    iget-object v8, p0, Lpj/r;->I:Luj/m;

    invoke-direct/range {v1 .. v11}, Lpj/r;-><init>(Landroid/graphics/Rect;Lcom/amplitude/android/engagement/a;Lp1/c1;Lp1/c1;Lcom/amplitude/android/engagement/types/Nudge;Landroid/content/Context;Luj/m;Lp1/c1;Lq83/d;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpj/r;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lpj/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpj/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpj/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lpj/r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpj/r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpj/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lpj/r;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpj/r;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Lpj/r;->x:I

    new-instance v3, Lpj/v;

    const/4 v12, 0x0

    iget-object v4, p0, Lpj/r;->y:Landroid/graphics/Rect;

    iget-object v5, p0, Lpj/r;->z:Lcom/amplitude/android/engagement/a;

    iget-object v6, p0, Lpj/r;->E:Lp1/c1;

    iget-object v7, p0, Lpj/r;->F:Lp1/c1;

    iget-object v8, p0, Lpj/r;->G:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v9, p0, Lpj/r;->H:Landroid/content/Context;

    iget-object v10, p0, Lpj/r;->I:Luj/m;

    iget-object v11, p0, Lpj/r;->J:Lp1/c1;

    invoke-direct/range {v3 .. v12}, Lpj/v;-><init>(Landroid/graphics/Rect;Lcom/amplitude/android/engagement/a;Lp1/c1;Lp1/c1;Lcom/amplitude/android/engagement/types/Nudge;Landroid/content/Context;Luj/m;Lp1/c1;Lq83/d;)V

    invoke-static {v3, p0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v0, v2

    :goto_2
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpj/r;->x:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_5

    if-ne v1, v3, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, p0, Lpj/r;->x:I

    new-instance v3, Lpj/v;

    const/4 v12, 0x0

    iget-object v4, p0, Lpj/r;->y:Landroid/graphics/Rect;

    iget-object v5, p0, Lpj/r;->z:Lcom/amplitude/android/engagement/a;

    iget-object v6, p0, Lpj/r;->E:Lp1/c1;

    iget-object v7, p0, Lpj/r;->F:Lp1/c1;

    iget-object v8, p0, Lpj/r;->G:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v9, p0, Lpj/r;->H:Landroid/content/Context;

    iget-object v10, p0, Lpj/r;->I:Luj/m;

    iget-object v11, p0, Lpj/r;->J:Lp1/c1;

    invoke-direct/range {v3 .. v12}, Lpj/v;-><init>(Landroid/graphics/Rect;Lcom/amplitude/android/engagement/a;Lp1/c1;Lp1/c1;Lcom/amplitude/android/engagement/types/Nudge;Landroid/content/Context;Luj/m;Lp1/c1;Lq83/d;)V

    invoke-static {v3, p0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_3

    :cond_6
    move-object p1, v2

    :goto_3
    if-ne p1, v0, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    move-object v0, v2

    :goto_5
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
