.class public final Lg1/n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;FLq83/d;I)V
    .locals 0

    iput p4, p0, Lg1/n;->w:I

    iput-object p1, p0, Lg1/n;->G:Ljava/lang/Object;

    iput p2, p0, Lg1/n;->z:F

    const/4 p1, 0x4

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lg1/n;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lm1/f;

    check-cast p2, Lm1/b0;

    check-cast p4, Lq83/d;

    new-instance v0, Lg1/n;

    iget-object v1, p0, Lg1/n;->G:Ljava/lang/Object;

    check-cast v1, Lm1/g;

    iget v2, p0, Lg1/n;->z:F

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, p4, v3}, Lg1/n;-><init>(Ljava/lang/Object;FLq83/d;I)V

    iput-object p1, v0, Lg1/n;->E:Ljava/lang/Object;

    iput-object p2, v0, Lg1/n;->F:Ljava/lang/Object;

    iput-object p3, v0, Lg1/n;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lg1/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lg1/w;

    check-cast p2, Lg1/k3;

    check-cast p4, Lq83/d;

    new-instance v0, Lg1/n;

    iget-object v1, p0, Lg1/n;->G:Ljava/lang/Object;

    check-cast v1, Lg1/a0;

    iget v2, p0, Lg1/n;->z:F

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p4, v3}, Lg1/n;-><init>(Ljava/lang/Object;FLq83/d;I)V

    iput-object p1, v0, Lg1/n;->E:Ljava/lang/Object;

    iput-object p2, v0, Lg1/n;->F:Ljava/lang/Object;

    iput-object p3, v0, Lg1/n;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lg1/n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lg1/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/n;->G:Ljava/lang/Object;

    check-cast v0, Lm1/g;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lg1/n;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/n;->E:Ljava/lang/Object;

    check-cast p1, Lm1/f;

    iget-object v2, p0, Lg1/n;->F:Ljava/lang/Object;

    check-cast v2, Lm1/b0;

    iget-object v4, p0, Lg1/n;->y:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v2, Lkotlin/jvm/internal/d0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v4, v0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v4}, Lp1/g1;->x()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    :goto_0
    move v5, v4

    goto :goto_1

    :cond_2
    iget-object v4, v0, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v4}, Lp1/g1;->x()F

    move-result v4

    goto :goto_0

    :goto_1
    iput v5, v2, Lkotlin/jvm/internal/d0;->w:F

    iget-object v0, v0, Lm1/g;->c:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    iget-object v0, v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->x:Ljava/lang/Object;

    check-cast v0, Ll1/w3;

    iget-object v8, v0, Ll1/w3;->d:Ld0/l;

    new-instance v9, Ll1/u3;

    const/4 v0, 0x1

    invoke-direct {v9, p1, v2, v0}, Ll1/u3;-><init>(Lm1/f;Lkotlin/jvm/internal/d0;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lg1/n;->E:Ljava/lang/Object;

    iput-object p1, p0, Lg1/n;->F:Ljava/lang/Object;

    iput v3, p0, Lg1/n;->x:I

    iget v7, p0, Lg1/n;->z:F

    move-object v10, p0

    invoke-static/range {v5 .. v10}, Ld0/f;->c(FFFLd0/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, v10

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_3
    :goto_2
    move-object v7, p0

    :cond_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v1

    :pswitch_0
    move-object v7, p0

    iget-object v0, v7, Lg1/n;->G:Ljava/lang/Object;

    check-cast v0, Lg1/a0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v7, Lg1/n;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_6

    if-ne v2, v3, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v7, Lg1/n;->E:Ljava/lang/Object;

    check-cast p1, Lg1/w;

    iget-object v2, v7, Lg1/n;->F:Ljava/lang/Object;

    check-cast v2, Lg1/k3;

    iget-object v4, v7, Lg1/n;->y:Ljava/lang/Object;

    invoke-virtual {v2, v4}, Lg1/k3;->d(Ljava/lang/Object;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_8

    new-instance v4, Lkotlin/jvm/internal/d0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v5, v0, Lg1/a0;->j:Lp1/g1;

    invoke-virtual {v5}, Lp1/g1;->x()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-eqz v5, :cond_7

    const/4 v5, 0x0

    goto :goto_4

    :cond_7
    iget-object v5, v0, Lg1/a0;->j:Lp1/g1;

    invoke-virtual {v5}, Lp1/g1;->x()F

    move-result v5

    :goto_4
    iput v5, v4, Lkotlin/jvm/internal/d0;->w:F

    iget-object v0, v0, Lg1/a0;->c:Ld0/l;

    new-instance v6, Lf01/f;

    const/16 v8, 0xd

    invoke-direct {v6, v8, p1, v4}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, v7, Lg1/n;->E:Ljava/lang/Object;

    iput-object p1, v7, Lg1/n;->F:Ljava/lang/Object;

    iput v3, v7, Lg1/n;->x:I

    iget v4, v7, Lg1/n;->z:F

    move v3, v2

    move v2, v5

    move-object v5, v0

    invoke-static/range {v2 .. v7}, Ld0/f;->c(FFFLd0/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_6

    :cond_8
    :goto_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_6
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
