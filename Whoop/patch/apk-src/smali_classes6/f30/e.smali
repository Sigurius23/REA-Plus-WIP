.class public final Lf30/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lb10/z0;

.field public final b:Lk83/a;

.field public final c:Lf30/f;

.field public final d:Lbc3/z;

.field public e:Lbc3/c2;

.field public final f:Lec3/h2;

.field public final g:Lec3/h2;


# direct methods
.method public constructor <init>(Lb10/z0;Lb10/c;Lf30/f;Lbc3/z;)V
    .locals 1

    const-string v0, "paymentConfigProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf30/e;->a:Lb10/z0;

    iput-object p2, p0, Lf30/e;->b:Lk83/a;

    iput-object p3, p0, Lf30/e;->c:Lf30/f;

    iput-object p4, p0, Lf30/e;->d:Lbc3/z;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lf30/e;->f:Lec3/h2;

    iput-object p1, p0, Lf30/e;->g:Lec3/h2;

    return-void
.end method


# virtual methods
.method public final a(Ls83/c;)Ljava/lang/Enum;
    .locals 8

    instance-of v0, p1, Lf30/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf30/c;

    iget v1, v0, Lf30/c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf30/c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf30/c;

    invoke-direct {v0, p0, p1}, Lf30/c;-><init>(Lf30/e;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lf30/c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf30/c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf30/e;->b:Lk83/a;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lux/y;

    iget-object v2, p0, Lf30/e;->c:Lf30/f;

    iget-object v2, v2, Lf30/f;->a:Ljava/lang/String;

    new-instance v4, Lyy/f;

    new-instance v5, Lf30/a;

    const/4 v6, 0x0

    invoke-direct {v5, p1, v6}, Lf30/a;-><init>(Lux/y;I)V

    new-instance v6, Lf30/a;

    const/4 v7, 0x1

    invoke-direct {v6, p1, v7}, Lf30/a;-><init>(Lux/y;I)V

    invoke-direct {v4, v5, v6}, Lyy/f;-><init>(Lc93/a;Lc93/a;)V

    iput v3, v0, Lf30/c;->y:I

    sget-object p1, Lm83/y;->w:Lm83/y;

    iget-object v3, p0, Lf30/e;->a:Lb10/z0;

    invoke-virtual {v3, v2, v4, p1, v0}, Lb10/z0;->Q(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    instance-of v0, p1, Ll83/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object p1, v1

    :cond_4
    check-cast p1, Ly00/l3;

    if-eqz p1, :cond_5

    iget-object p1, p1, Ly00/l3;->Q:Lcom/stripe/android/model/StripeIntent$Status;

    return-object p1

    :cond_5
    return-object v1
.end method

.method public final b(Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p1, Lf30/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf30/d;

    iget v1, v0, Lf30/d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf30/d;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf30/d;

    invoke-direct {v0, p0, p1}, Lf30/d;-><init>(Lf30/e;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lf30/d;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf30/d;->E:I

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lf30/d;->w:Lf30/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object v2, v0, Lf30/d;->x:Lec3/h2;

    iget-object v8, v0, Lf30/d;->w:Lf30/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf30/e;->g:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/model/StripeIntent$Status;

    if-nez p1, :cond_5

    const/4 p1, -0x1

    goto :goto_1

    :cond_5
    sget-object v2, Lf30/b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    :goto_1
    packed-switch p1, :pswitch_data_0

    :pswitch_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_1
    iput-object p0, v0, Lf30/d;->w:Lf30/e;

    iget-object v2, p0, Lf30/e;->f:Lec3/h2;

    iput-object v2, v0, Lf30/d;->x:Lec3/h2;

    iput v7, v0, Lf30/d;->E:I

    invoke-virtual {p0, v0}, Lf30/e;->a(Ls83/c;)Ljava/lang/Enum;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    move-object v8, p0

    :goto_2
    invoke-virtual {v2, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object p1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v7, p1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v9

    iput-object v8, v0, Lf30/d;->w:Lf30/e;

    iput-object v3, v0, Lf30/d;->x:Lec3/h2;

    iput v6, v0, Lf30/d;->E:I

    invoke-static {v9, v10, v0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v2, v8

    :goto_3
    iput-object v3, v0, Lf30/d;->w:Lf30/e;

    iput v5, v0, Lf30/d;->E:I

    invoke-virtual {v2, v0}, Lf30/e;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    :pswitch_2
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
