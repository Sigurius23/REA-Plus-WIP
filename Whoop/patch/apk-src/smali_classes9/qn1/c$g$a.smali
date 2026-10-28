.class public final Lqn1/c$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqn1/c$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Lqn1/c$g$a;->w:Lec3/m;

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

    instance-of v0, p2, Lqn1/c$g$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lqn1/c$g$a$a;

    iget v1, v0, Lqn1/c$g$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqn1/c$g$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqn1/c$g$a$a;

    invoke-direct {v0, p0, p2}, Lqn1/c$g$a$a;-><init>(Lqn1/c$g$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lqn1/c$g$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lqn1/c$g$a$a;->x:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget p1, v0, Lqn1/c$g$a$a;->H:I

    iget-object v2, v0, Lqn1/c$g$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v2, v0, Lqn1/c$g$a$a;->F:Ljava/lang/Object;

    check-cast v2, Lqn1/d;

    iget-object v2, v0, Lqn1/c$g$a$a;->E:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_1
    iget-object p1, v0, Lqn1/c$g$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lqn1/c$g$a$a;->F:Ljava/lang/Object;

    check-cast p1, Lqn1/d;

    iget-object p1, v0, Lqn1/c$g$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget p1, v0, Lqn1/c$g$a$a;->H:I

    iget-object v2, v0, Lqn1/c$g$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v5, v0, Lqn1/c$g$a$a;->F:Ljava/lang/Object;

    check-cast v5, Lqn1/d;

    iget-object v5, v0, Lqn1/c$g$a$a;->E:Ljava/lang/Object;

    check-cast v5, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_3
    iget p1, v0, Lqn1/c$g$a$a;->H:I

    iget-object v2, v0, Lqn1/c$g$a$a;->G:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v5, v0, Lqn1/c$g$a$a;->F:Ljava/lang/Object;

    check-cast v5, Lqn1/d;

    iget-object v5, v0, Lqn1/c$g$a$a;->E:Ljava/lang/Object;

    check-cast v5, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lqn1/c$g$a;->w:Lec3/m;

    check-cast p1, Lqn1/d;

    instance-of v2, p1, Lqn1/d$c;

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    iput-object v4, v0, Lqn1/c$g$a$a;->z:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->F:Ljava/lang/Object;

    iput-object p2, v0, Lqn1/c$g$a$a;->G:Ljava/lang/Object;

    iput v5, v0, Lqn1/c$g$a$a;->H:I

    iput v3, v0, Lqn1/c$g$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_4

    :cond_1
    move-object v2, p2

    move p1, v5

    :goto_1
    iput-object v4, v0, Lqn1/c$g$a$a;->z:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lqn1/c$g$a$a;->G:Ljava/lang/Object;

    iput p1, v0, Lqn1/c$g$a$a;->H:I

    const/4 p2, 0x2

    iput p2, v0, Lqn1/c$g$a$a;->x:I

    const-wide/16 v5, 0x7d0

    invoke-static {v5, v6, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_2

    goto :goto_4

    :cond_2
    :goto_2
    new-instance p2, Lqn1/d$d;

    invoke-direct {p2, v4, v3, v4}, Lqn1/d$d;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v4, v0, Lqn1/c$g$a$a;->z:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->G:Ljava/lang/Object;

    iput p1, v0, Lqn1/c$g$a$a;->H:I

    const/4 p1, 0x3

    iput p1, v0, Lqn1/c$g$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_3
    instance-of v2, p1, Lqn1/d$e;

    if-eqz v2, :cond_5

    iput-object v4, v0, Lqn1/c$g$a$a;->z:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->G:Ljava/lang/Object;

    iput v5, v0, Lqn1/c$g$a$a;->H:I

    const/4 v2, 0x4

    iput v2, v0, Lqn1/c$g$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_4

    :cond_4
    move p1, v5

    :goto_3
    iput-object v4, v0, Lqn1/c$g$a$a;->z:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->G:Ljava/lang/Object;

    iput p1, v0, Lqn1/c$g$a$a;->H:I

    const/4 p1, 0x5

    iput p1, v0, Lqn1/c$g$a$a;->x:I

    const-wide/16 p1, 0x1f4

    invoke-static {p1, p2, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_5
    iput-object v4, v0, Lqn1/c$g$a$a;->z:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->E:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->F:Ljava/lang/Object;

    iput-object v4, v0, Lqn1/c$g$a$a;->G:Ljava/lang/Object;

    iput v5, v0, Lqn1/c$g$a$a;->H:I

    const/4 v2, 0x6

    iput v2, v0, Lqn1/c$g$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_4
    return-object v1

    :cond_6
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
