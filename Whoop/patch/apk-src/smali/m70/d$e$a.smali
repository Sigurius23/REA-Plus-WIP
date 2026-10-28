.class public final Lm70/d$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm70/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic x:Lm70/d;


# direct methods
.method public constructor <init>(Lec3/m;Lm70/d;)V
    .locals 0

    iput-object p2, p0, Lm70/d$e$a;->x:Lm70/d;

    iput-object p1, p0, Lm70/d$e$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lm70/d$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lm70/d$e$a$a;

    iget v1, v0, Lm70/d$e$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm70/d$e$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm70/d$e$a$a;

    invoke-direct {v0, p0, p2}, Lm70/d$e$a$a;-><init>(Lm70/d$e$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lm70/d$e$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm70/d$e$a$a;->x:I

    const-wide/16 v3, 0x3e8

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget p1, v0, Lm70/d$e$a$a;->I:I

    iget-object v2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v3, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    check-cast v3, Lm70/a;

    iget-object v3, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    check-cast v3, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_1
    iget p1, v0, Lm70/d$e$a$a;->I:I

    iget-object v2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v6, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    check-cast v6, Lm70/a;

    iget-object v7, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget p1, v0, Lm70/d$e$a$a;->I:I

    iget-object v2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v3, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    check-cast v3, Lm70/a;

    iget-object v3, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    check-cast v3, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3
    iget p1, v0, Lm70/d$e$a$a;->I:I

    iget-object v2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v6, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    check-cast v6, Lm70/a;

    iget-object v7, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    iget-object p1, v0, Lm70/d$e$a$a;->H:Ljava/lang/Object;

    check-cast p1, Lm70/b;

    :pswitch_5
    iget-object p1, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    check-cast p1, Lm70/a;

    iget-object p1, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_6
    iget p1, v0, Lm70/d$e$a$a;->I:I

    iget-object v2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v3, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    check-cast v3, Lm70/a;

    iget-object v3, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    check-cast v3, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_7
    iget p1, v0, Lm70/d$e$a$a;->I:I

    iget-object v2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v6, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    check-cast v6, Lm70/a;

    iget-object v7, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    check-cast v7, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_8
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lm70/d$e$a;->w:Lec3/m;

    move-object v6, p1

    check-cast v6, Lm70/a;

    instance-of p1, v6, Lm70/a$a;

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    sget-object p1, Lm70/b$b;->a:Lm70/b$b;

    iput-object v5, v0, Lm70/d$e$a$a;->z:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    iput-object p2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    iput v2, v0, Lm70/d$e$a$a;->I:I

    const/4 v7, 0x1

    iput v7, v0, Lm70/d$e$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_7

    :cond_1
    move p1, v2

    move-object v2, p2

    :goto_1
    new-instance p2, Lm70/d$f;

    iget-object v7, p0, Lm70/d$e$a;->x:Lm70/d;

    invoke-direct {p2, v7, v6, v5}, Lm70/d$f;-><init>(Lm70/d;Lm70/a;Lq83/d;)V

    iput-object v5, v0, Lm70/d$e$a$a;->z:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    iput p1, v0, Lm70/d$e$a$a;->I:I

    const/4 v6, 0x2

    iput v6, v0, Lm70/d$e$a$a;->x:I

    invoke-static {v3, v4, p2, v0}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_2

    goto/16 :goto_7

    :cond_2
    :goto_2
    check-cast p2, Lm70/b;

    iput-object v5, v0, Lm70/d$e$a$a;->z:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->H:Ljava/lang/Object;

    iput p1, v0, Lm70/d$e$a$a;->I:I

    const/4 p1, 0x3

    iput p1, v0, Lm70/d$e$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto/16 :goto_7

    :cond_3
    instance-of p1, v6, Lm70/a$d;

    if-eqz p1, :cond_6

    sget-object p1, Lm70/b$b;->a:Lm70/b$b;

    iput-object v5, v0, Lm70/d$e$a$a;->z:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    iput-object p2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    iput v2, v0, Lm70/d$e$a$a;->I:I

    const/4 v7, 0x4

    iput v7, v0, Lm70/d$e$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_7

    :cond_4
    move p1, v2

    move-object v2, p2

    :goto_3
    new-instance p2, Lm70/d$g;

    iget-object v7, p0, Lm70/d$e$a;->x:Lm70/d;

    invoke-direct {p2, v7, v6, v5}, Lm70/d$g;-><init>(Lm70/d;Lm70/a;Lq83/d;)V

    iput-object v5, v0, Lm70/d$e$a$a;->z:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    iput p1, v0, Lm70/d$e$a$a;->I:I

    const/4 v6, 0x5

    iput v6, v0, Lm70/d$e$a$a;->x:I

    invoke-static {v3, v4, p2, v0}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto/16 :goto_7

    :cond_5
    :goto_4
    check-cast p2, Lm70/b;

    iput-object v5, v0, Lm70/d$e$a$a;->z:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->H:Ljava/lang/Object;

    iput p1, v0, Lm70/d$e$a$a;->I:I

    const/4 p1, 0x6

    iput p1, v0, Lm70/d$e$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_7

    :cond_6
    instance-of p1, v6, Lm70/a$c;

    if-eqz p1, :cond_9

    sget-object p1, Lm70/b$b;->a:Lm70/b$b;

    iput-object v5, v0, Lm70/d$e$a$a;->z:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    iput-object p2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    iput v2, v0, Lm70/d$e$a$a;->I:I

    const/4 v7, 0x7

    iput v7, v0, Lm70/d$e$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_7

    :cond_7
    move p1, v2

    move-object v2, p2

    :goto_5
    new-instance p2, Lm70/d$h;

    iget-object v7, p0, Lm70/d$e$a;->x:Lm70/d;

    invoke-direct {p2, v7, v6, v5}, Lm70/d$h;-><init>(Lm70/d;Lm70/a;Lq83/d;)V

    iput-object v5, v0, Lm70/d$e$a$a;->z:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    iput p1, v0, Lm70/d$e$a$a;->I:I

    const/16 v6, 0x8

    iput v6, v0, Lm70/d$e$a$a;->x:I

    invoke-static {v3, v4, p2, v0}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    goto :goto_7

    :cond_8
    :goto_6
    check-cast p2, Lm70/b;

    iput-object v5, v0, Lm70/d$e$a$a;->z:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->H:Ljava/lang/Object;

    iput p1, v0, Lm70/d$e$a$a;->I:I

    const/16 p1, 0x9

    iput p1, v0, Lm70/d$e$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_7

    :cond_9
    instance-of p1, v6, Lm70/a$b;

    if-eqz p1, :cond_b

    sget-object p1, Lm70/b$a;->a:Lm70/b$a;

    iput-object v5, v0, Lm70/d$e$a$a;->z:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Lm70/d$e$a$a;->G:Ljava/lang/Object;

    iput v2, v0, Lm70/d$e$a$a;->I:I

    const/16 v2, 0xa

    iput v2, v0, Lm70/d$e$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_7
    return-object v1

    :cond_a
    :goto_8
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
