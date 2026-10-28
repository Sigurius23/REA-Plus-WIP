.class public final Lpj/c0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

.field public final synthetic F:J

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Lp1/c1;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Lmj/p;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lmj/p;Ljava/lang/String;Lcom/amplitude/android/engagement/types/TooltipFormFactor;JIILp1/c1;Lq83/d;I)V
    .locals 0

    iput p10, p0, Lpj/c0;->w:I

    iput-object p1, p0, Lpj/c0;->y:Lmj/p;

    iput-object p2, p0, Lpj/c0;->z:Ljava/lang/String;

    iput-object p3, p0, Lpj/c0;->E:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    iput-wide p4, p0, Lpj/c0;->F:J

    iput p6, p0, Lpj/c0;->G:I

    iput p7, p0, Lpj/c0;->H:I

    iput-object p8, p0, Lpj/c0;->I:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 12

    iget p1, p0, Lpj/c0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lpj/c0;

    iget-object v8, p0, Lpj/c0;->I:Lp1/c1;

    const/4 v10, 0x1

    iget-object v1, p0, Lpj/c0;->y:Lmj/p;

    iget-object v2, p0, Lpj/c0;->z:Ljava/lang/String;

    iget-object v3, p0, Lpj/c0;->E:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    iget-wide v4, p0, Lpj/c0;->F:J

    iget v6, p0, Lpj/c0;->G:I

    iget v7, p0, Lpj/c0;->H:I

    move-object v9, p2

    invoke-direct/range {v0 .. v10}, Lpj/c0;-><init>(Lmj/p;Ljava/lang/String;Lcom/amplitude/android/engagement/types/TooltipFormFactor;JIILp1/c1;Lq83/d;I)V

    return-object v0

    :pswitch_0
    move-object v9, p2

    new-instance v1, Lpj/c0;

    move-object v10, v9

    iget-object v9, p0, Lpj/c0;->I:Lp1/c1;

    const/4 v11, 0x0

    iget-object v2, p0, Lpj/c0;->y:Lmj/p;

    iget-object v3, p0, Lpj/c0;->z:Ljava/lang/String;

    iget-object v4, p0, Lpj/c0;->E:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    iget-wide v5, p0, Lpj/c0;->F:J

    iget v7, p0, Lpj/c0;->G:I

    iget v8, p0, Lpj/c0;->H:I

    invoke-direct/range {v1 .. v11}, Lpj/c0;-><init>(Lmj/p;Ljava/lang/String;Lcom/amplitude/android/engagement/types/TooltipFormFactor;JIILp1/c1;Lq83/d;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpj/c0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lpj/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpj/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpj/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lpj/c0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lpj/c0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lpj/c0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lpj/c0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpj/c0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, p0, Lpj/c0;->x:I

    iget-object v1, p0, Lpj/c0;->y:Lmj/p;

    iget-object v2, p0, Lpj/c0;->z:Ljava/lang/String;

    iget-object v3, p0, Lpj/c0;->E:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    iget-wide v4, p0, Lpj/c0;->F:J

    iget v6, p0, Lpj/c0;->G:I

    iget v7, p0, Lpj/c0;->H:I

    iget-object v8, p0, Lpj/c0;->I:Lp1/c1;

    move-object v9, p0

    invoke-static/range {v1 .. v9}, Lx43/j;->m(Lmj/p;Ljava/lang/String;Lcom/amplitude/android/engagement/types/TooltipFormFactor;JIILp1/c1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v0

    :pswitch_0
    move-object v9, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v9, Lpj/c0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v2, v9, Lpj/c0;->x:I

    iget-object v1, v9, Lpj/c0;->y:Lmj/p;

    iget-object v2, v9, Lpj/c0;->z:Ljava/lang/String;

    iget-object v3, v9, Lpj/c0;->E:Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    iget-wide v4, v9, Lpj/c0;->F:J

    iget v6, v9, Lpj/c0;->G:I

    iget v7, v9, Lpj/c0;->H:I

    iget-object v8, v9, Lpj/c0;->I:Lp1/c1;

    invoke-static/range {v1 .. v9}, Lx43/j;->m(Lmj/p;Ljava/lang/String;Lcom/amplitude/android/engagement/types/TooltipFormFactor;JIILp1/c1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
