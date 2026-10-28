.class final Ldt1/j$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldt1/j;->f(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Ldt1/c;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.labrador.feature.details.domain.LabradorDetailsLocalInteractor$updateSymptomsAndNotes$1"
    f = "LabradorDetailsLocalInteractor.kt"
    l = {
        0x56,
        0x58,
        0x5a,
        0x5b,
        0x5c,
        0x5f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/time/Instant;

.field final synthetic F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Ldt1/j;


# direct methods
.method public constructor <init>(Ldt1/j;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldt1/j;",
            "Ljava/time/Instant;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ldt1/j$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldt1/j$f;->z:Ldt1/j;

    iput-object p2, p0, Ldt1/j$f;->E:Ljava/time/Instant;

    iput-object p3, p0, Ldt1/j$f;->F:Ljava/util/List;

    iput-object p4, p0, Ldt1/j$f;->G:Ljava/lang/String;

    iput-object p5, p0, Ldt1/j$f;->H:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ldt1/j$f;

    iget-object v1, p0, Ldt1/j$f;->z:Ldt1/j;

    iget-object v2, p0, Ldt1/j$f;->E:Ljava/time/Instant;

    iget-object v3, p0, Ldt1/j$f;->F:Ljava/util/List;

    iget-object v4, p0, Ldt1/j$f;->G:Ljava/lang/String;

    iget-object v5, p0, Ldt1/j$f;->H:Ljava/lang/String;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ldt1/j$f;-><init>(Ldt1/j;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Ldt1/j$f;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ldt1/j$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ldt1/j$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ldt1/j$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ldt1/j$f;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Ldt1/j$f;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Ldt1/j$f;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Ldt1/j$f;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v2, p0, Ldt1/j$f;->w:Ljava/lang/Object;

    check-cast v2, Lqk1/a;

    :goto_0
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object v11, p0

    goto/16 :goto_5

    :pswitch_2
    iget-object v2, p0, Ldt1/j$f;->w:Ljava/lang/Object;

    check-cast v2, Lqk1/a;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v11, p0

    goto/16 :goto_4

    :pswitch_3
    iget-object v2, p0, Ldt1/j$f;->w:Ljava/lang/Object;

    check-cast v2, Lqk1/a;

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v11, p0

    goto :goto_3

    :pswitch_4
    iget-object v2, p0, Ldt1/j$f;->w:Ljava/lang/Object;

    check-cast v2, Lqk1/a;

    goto :goto_0

    :goto_1
    move-object v11, p0

    goto/16 :goto_7

    :pswitch_5
    :try_start_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object v11, p0

    goto :goto_2

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_4
    iget-object p1, p0, Ldt1/j$f;->z:Ldt1/j;

    invoke-static {p1}, Ldt1/j;->a(Ldt1/j;)Lqk1/b;

    move-result-object v6

    iget-object p1, p0, Ldt1/j$f;->E:Ljava/time/Instant;

    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v7

    iget-object v9, p0, Ldt1/j$f;->F:Ljava/util/List;

    iget-object v10, p0, Ldt1/j$f;->G:Ljava/lang/String;

    iput-object v0, p0, Ldt1/j$f;->y:Ljava/lang/Object;

    iput v4, p0, Ldt1/j$f;->x:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-object v11, p0

    :try_start_5
    invoke-interface/range {v6 .. v11}, Lqk1/b;->a(JLjava/util/List;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto/16 :goto_6

    :cond_0
    :goto_2
    check-cast p1, Lqk1/a;

    if-nez p1, :cond_1

    new-instance p1, Ldt1/c$l;

    iget-object v2, v11, Ldt1/j$f;->H:Ljava/lang/String;

    iget-object v4, v11, Ldt1/j$f;->E:Ljava/time/Instant;

    iget-object v6, v11, Ldt1/j$f;->F:Ljava/util/List;

    iget-object v7, v11, Ldt1/j$f;->G:Ljava/lang/String;

    invoke-direct {p1, v2, v4, v6, v7}, Ldt1/c$l;-><init>(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V

    iput-object v0, v11, Ldt1/j$f;->y:Ljava/lang/Object;

    iput-object v5, v11, Ldt1/j$f;->w:Ljava/lang/Object;

    iput v3, v11, Ldt1/j$f;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_6

    :cond_1
    sget-object v2, Ldt1/c$i;->a:Ldt1/c$i;

    iput-object v0, v11, Ldt1/j$f;->y:Ljava/lang/Object;

    iput-object p1, v11, Ldt1/j$f;->w:Ljava/lang/Object;

    const/4 v6, 0x3

    iput v6, v11, Ldt1/j$f;->x:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    goto :goto_6

    :cond_2
    move-object v2, p1

    :goto_3
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object p1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v4, p1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v6

    iput-object v0, v11, Ldt1/j$f;->y:Ljava/lang/Object;

    iput-object v2, v11, Ldt1/j$f;->w:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, v11, Ldt1/j$f;->x:I

    invoke-static {v6, v7, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_6

    :cond_3
    :goto_4
    new-instance p1, Ldt1/c$k;

    invoke-direct {p1, v2, v5, v3, v5}, Ldt1/c$k;-><init>(Lqk1/a;Ldt1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, v11, Ldt1/j$f;->y:Ljava/lang/Object;

    iput-object v5, v11, Ldt1/j$f;->w:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, v11, Ldt1/j$f;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    if-ne p1, v1, :cond_4

    goto :goto_6

    :catch_1
    :goto_5
    new-instance p1, Ldt1/c$l;

    iget-object v2, v11, Ldt1/j$f;->H:Ljava/lang/String;

    iget-object v3, v11, Ldt1/j$f;->E:Ljava/time/Instant;

    iget-object v4, v11, Ldt1/j$f;->F:Ljava/util/List;

    iget-object v6, v11, Ldt1/j$f;->G:Ljava/lang/String;

    invoke-direct {p1, v2, v3, v4, v6}, Ldt1/c$l;-><init>(Ljava/lang/String;Ljava/time/Instant;Ljava/util/List;Ljava/lang/String;)V

    iput-object v5, v11, Ldt1/j$f;->y:Ljava/lang/Object;

    iput-object v5, v11, Ldt1/j$f;->w:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v11, Ldt1/j$f;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_6
    return-object v1

    :cond_4
    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
