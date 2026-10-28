.class public final Lyl0/h$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyl0/h$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Lyl0/h$b$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7
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

    instance-of v0, p2, Lyl0/h$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lyl0/h$b$a$a;

    iget v1, v0, Lyl0/h$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyl0/h$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyl0/h$b$a$a;

    invoke-direct {v0, p0, p2}, Lyl0/h$b$a$a;-><init>(Lyl0/h$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lyl0/h$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyl0/h$b$a$a;->x:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget p1, v0, Lyl0/h$b$a$a;->H:I

    iget-object v2, v0, Lyl0/h$b$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lyl0/h$b$a$a;->F:Ljava/lang/Object;

    check-cast v4, Lyl0/f;

    iget-object v4, v0, Lyl0/h$b$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_1
    iget-object p1, v0, Lyl0/h$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lyl0/h$b$a$a;->F:Ljava/lang/Object;

    check-cast p1, Lyl0/f;

    iget-object p1, v0, Lyl0/h$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lyl0/h$b$a;->w:Lec3/m;

    check-cast p1, Lyl0/f;

    instance-of p2, p1, Lyl0/f$e;

    const/4 v4, 0x0

    if-eqz p2, :cond_1

    new-instance p2, Lyl0/h$a$f;

    check-cast p1, Lyl0/f$e;

    invoke-virtual {p1}, Lyl0/f$e;->a()Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p2, p1}, Lyl0/h$a$f;-><init>(Ljava/lang/Boolean;)V

    iput-object v3, v0, Lyl0/h$b$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lyl0/h$b$a$a;->H:I

    const/4 p1, 0x1

    iput p1, v0, Lyl0/h$b$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto/16 :goto_2

    :cond_1
    instance-of p2, p1, Lyl0/f$f;

    if-eqz p2, :cond_2

    new-instance p2, Lyl0/h$a$g;

    check-cast p1, Lyl0/f$f;

    invoke-virtual {p1}, Lyl0/f$f;->a()D

    move-result-wide v5

    invoke-direct {p2, v5, v6}, Lyl0/h$a$g;-><init>(D)V

    iput-object v3, v0, Lyl0/h$b$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lyl0/h$b$a$a;->H:I

    const/4 p1, 0x2

    iput p1, v0, Lyl0/h$b$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto/16 :goto_2

    :cond_2
    instance-of p2, p1, Lyl0/f$g;

    if-eqz p2, :cond_3

    new-instance p2, Lyl0/h$a$h;

    check-cast p1, Lyl0/f$g;

    invoke-virtual {p1}, Lyl0/f$g;->a()J

    move-result-wide v5

    invoke-direct {p2, v5, v6}, Lyl0/h$a$h;-><init>(J)V

    iput-object v3, v0, Lyl0/h$b$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lyl0/h$b$a$a;->H:I

    const/4 p1, 0x3

    iput p1, v0, Lyl0/h$b$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto/16 :goto_2

    :cond_3
    instance-of p2, p1, Lyl0/f$h;

    if-eqz p2, :cond_4

    sget-object p1, Lyl0/h$a$i;->a:Lyl0/h$a$i;

    iput-object v3, v0, Lyl0/h$b$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lyl0/h$b$a$a;->H:I

    const/4 p2, 0x4

    iput p2, v0, Lyl0/h$b$a$a;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto/16 :goto_2

    :cond_4
    instance-of p2, p1, Lyl0/f$d;

    if-eqz p2, :cond_5

    sget-object p1, Lyl0/h$a$e;->a:Lyl0/h$a$e;

    iput-object v3, v0, Lyl0/h$b$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lyl0/h$b$a$a;->H:I

    const/4 p2, 0x5

    iput p2, v0, Lyl0/h$b$a$a;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_2

    :cond_5
    instance-of p2, p1, Lyl0/f$c;

    if-eqz p2, :cond_7

    sget-object p1, Lyl0/h$a$d;->a:Lyl0/h$a$d;

    iput-object v3, v0, Lyl0/h$b$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lyl0/h$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lyl0/h$b$a$a;->H:I

    const/4 p2, 0x6

    iput p2, v0, Lyl0/h$b$a$a;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    move p1, v4

    :goto_1
    sget-object p2, Lyl0/h$a$c;->a:Lyl0/h$a$c;

    iput-object v3, v0, Lyl0/h$b$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->G:Ljava/lang/Object;

    iput p1, v0, Lyl0/h$b$a$a;->H:I

    const/4 p1, 0x7

    iput p1, v0, Lyl0/h$b$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_2

    :cond_7
    instance-of p2, p1, Lyl0/f$b;

    if-eqz p2, :cond_8

    sget-object p1, Lyl0/h$a$b;->a:Lyl0/h$a$b;

    iput-object v3, v0, Lyl0/h$b$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lyl0/h$b$a$a;->H:I

    const/16 p2, 0x8

    iput p2, v0, Lyl0/h$b$a$a;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_2

    :cond_8
    instance-of p1, p1, Lyl0/f$a;

    if-eqz p1, :cond_a

    sget-object p1, Lyl0/h$a$a;->a:Lyl0/h$a$a;

    iput-object v3, v0, Lyl0/h$b$a$a;->z:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->E:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->F:Ljava/lang/Object;

    iput-object v3, v0, Lyl0/h$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lyl0/h$b$a$a;->H:I

    const/16 p2, 0x9

    iput p2, v0, Lyl0/h$b$a$a;->x:I

    invoke-interface {v2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_2
    return-object v1

    :cond_9
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
