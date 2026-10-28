.class final Lxj2/e$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxj2/e;->n(Lxj2/c;)Lec3/l;
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
        "Lxj2/b;",
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
    c = "com.whoop.tiltgraph.domain.calendar.TiltGraphCalendarInteractor$preparationToInteractingState$1"
    f = "TiltGraphCalendarInteractor.kt"
    l = {
        0x55,
        0x5a,
        0x5e,
        0x6a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Lxj2/c;

.field final synthetic H:Lxj2/e;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lxj2/c;Lxj2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxj2/c;",
            "Lxj2/e;",
            "Lq83/d<",
            "-",
            "Lxj2/e$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxj2/e$j;->G:Lxj2/c;

    iput-object p2, p0, Lxj2/e$j;->H:Lxj2/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lxj2/e$j;

    iget-object v1, p0, Lxj2/e$j;->G:Lxj2/c;

    iget-object v2, p0, Lxj2/e$j;->H:Lxj2/e;

    invoke-direct {v0, v1, v2, p2}, Lxj2/e$j;-><init>(Lxj2/c;Lxj2/e;Lq83/d;)V

    iput-object p1, v0, Lxj2/e$j;->F:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lxj2/e$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lxj2/e$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lxj2/e$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lxj2/e$j;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lxj2/e$j;->F:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lxj2/e$j;->E:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lxj2/e$j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/time/LocalDate;

    iget-object v0, p0, Lxj2/e$j;->x:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/LocalDate;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lxj2/e$j;->x:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/DateTime;

    :goto_0
    iget-object v0, p0, Lxj2/e$j;->w:Ljava/lang/Object;

    check-cast v0, Lxj2/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lxj2/e$j;->G:Lxj2/c;

    invoke-virtual {p1}, Lxj2/c;->b()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lxj2/b$b;->a:Lxj2/b$b;

    iput-object v0, p0, Lxj2/e$j;->F:Ljava/lang/Object;

    iput v6, p0, Lxj2/e$j;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lxj2/e$j;->G:Lxj2/c;

    invoke-virtual {p1}, Lxj2/c;->a()Lxj2/d;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    instance-of v2, p1, Lxj2/d$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_5

    iget-object v2, p0, Lxj2/e$j;->H:Lxj2/e;

    invoke-static {v2}, Lxj2/e;->f(Lxj2/e;)Lzr2/a;

    move-result-object v2

    invoke-interface {v2}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v2

    check-cast p1, Lxj2/d$a;

    invoke-virtual {p1}, Lxj2/d$a;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Lorg/joda/time/DateTime;->minusMonths(I)Lorg/joda/time/DateTime;

    move-result-object v2

    new-instance v3, Lxj2/b$a;

    invoke-static {}, Lxj2/e;->d()Lxj2/e$a;

    move-result-object v4

    invoke-virtual {v4}, Lxj2/e$a;->b()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v4

    invoke-virtual {v4, v2}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "print(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lxj2/d$a;->a()I

    move-result p1

    invoke-direct {v3, v2, p1}, Lxj2/b$a;-><init>(Ljava/lang/String;I)V

    iput-object v8, p0, Lxj2/e$j;->F:Ljava/lang/Object;

    iput-object v8, p0, Lxj2/e$j;->w:Ljava/lang/Object;

    iput-object v8, p0, Lxj2/e$j;->x:Ljava/lang/Object;

    iput v7, p0, Lxj2/e$j;->z:I

    iput v5, p0, Lxj2/e$j;->E:I

    invoke-interface {v0, v3, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto/16 :goto_2

    :cond_5
    sget-object v2, Lxj2/d$b;->a:Lxj2/d$b;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object p1, p0, Lxj2/e$j;->H:Lxj2/e;

    invoke-static {p1}, Lxj2/e;->f(Lxj2/e;)Lzr2/a;

    move-result-object p1

    invoke-interface {p1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object p1

    new-instance v2, Lxj2/b$c;

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractDateTime;->getYear()I

    move-result v3

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractDateTime;->getMonthOfYear()I

    move-result v5

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractDateTime;->getDayOfMonth()I

    move-result p1

    invoke-static {v3, v5, p1}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object p1

    const-string v3, "of(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1, v7}, Lxj2/b$c;-><init>(Ljava/time/LocalDate;I)V

    iput-object v8, p0, Lxj2/e$j;->F:Ljava/lang/Object;

    iput-object v8, p0, Lxj2/e$j;->w:Ljava/lang/Object;

    iput-object v8, p0, Lxj2/e$j;->x:Ljava/lang/Object;

    iput v7, p0, Lxj2/e$j;->z:I

    iput v4, p0, Lxj2/e$j;->E:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_2

    :cond_6
    instance-of v2, p1, Lxj2/d$c;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lxj2/e$j;->H:Lxj2/e;

    invoke-static {v2}, Lxj2/e;->f(Lxj2/e;)Lzr2/a;

    move-result-object v2

    invoke-interface {v2}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->getYear()I

    move-result v4

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->getMonthOfYear()I

    move-result v5

    invoke-virtual {v2}, Lorg/joda/time/LocalDate;->getDayOfMonth()I

    move-result v2

    invoke-static {v4, v5, v2}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v2

    sget-object v4, Ljava/time/temporal/ChronoUnit;->MONTHS:Ljava/time/temporal/ChronoUnit;

    check-cast p1, Lxj2/d$c;

    invoke-virtual {p1}, Lxj2/d$c;->a()Ljava/time/LocalDate;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/time/LocalDate;->withDayOfMonth(I)Ljava/time/LocalDate;

    move-result-object v5

    invoke-virtual {v2, v6}, Ljava/time/LocalDate;->withDayOfMonth(I)Ljava/time/LocalDate;

    move-result-object v2

    invoke-virtual {v4, v5, v2}, Ljava/time/temporal/ChronoUnit;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)J

    move-result-wide v4

    long-to-int v2, v4

    new-instance v4, Lxj2/b$c;

    invoke-virtual {p1}, Lxj2/d$c;->a()Ljava/time/LocalDate;

    move-result-object p1

    invoke-direct {v4, p1, v2}, Lxj2/b$c;-><init>(Ljava/time/LocalDate;I)V

    iput-object v8, p0, Lxj2/e$j;->F:Ljava/lang/Object;

    iput-object v8, p0, Lxj2/e$j;->w:Ljava/lang/Object;

    iput-object v8, p0, Lxj2/e$j;->x:Ljava/lang/Object;

    iput-object v8, p0, Lxj2/e$j;->y:Ljava/lang/Object;

    iput v2, p0, Lxj2/e$j;->z:I

    iput v3, p0, Lxj2/e$j;->E:I

    invoke-interface {v0, v4, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
