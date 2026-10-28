.class final Lvr1/d$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvr1/d;->o(Lvr1/e;)Lec3/l;
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
        "Lvr1/b;",
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
    c = "com.whoop.journal.interactors.v2.calendar.JournalCalendarInteractor$preparationToInteractingState$1"
    f = "JournalCalendarInteractor.kt"
    l = {
        0x54,
        0x59,
        0x5d,
        0x74
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Lvr1/e;

.field final synthetic K:Lvr1/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvr1/e;Lvr1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr1/e;",
            "Lvr1/d;",
            "Lq83/d<",
            "-",
            "Lvr1/d$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvr1/d$j;->J:Lvr1/e;

    iput-object p2, p0, Lvr1/d$j;->K:Lvr1/d;

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

    new-instance v0, Lvr1/d$j;

    iget-object v1, p0, Lvr1/d$j;->J:Lvr1/e;

    iget-object v2, p0, Lvr1/d$j;->K:Lvr1/d;

    invoke-direct {v0, v1, v2, p2}, Lvr1/d$j;-><init>(Lvr1/e;Lvr1/d;Lq83/d;)V

    iput-object p1, v0, Lvr1/d$j;->I:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvr1/d$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvr1/d$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvr1/d$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvr1/d$j;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lvr1/d$j;->I:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvr1/d$j;->H:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lvr1/d$j;->F:Ljava/lang/Object;

    check-cast v0, Ljava/time/LocalDate;

    iget-object v0, p0, Lvr1/d$j;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lvr1/d$j;->z:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/DateTime;

    iget-object v0, p0, Lvr1/d$j;->y:Ljava/lang/Object;

    check-cast v0, Ljava/time/LocalDate;

    iget-object v0, p0, Lvr1/d$j;->x:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/LocalDate;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lvr1/d$j;->x:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/DateTime;

    :goto_0
    iget-object v0, p0, Lvr1/d$j;->w:Ljava/lang/Object;

    check-cast v0, Lvr1/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvr1/d$j;->J:Lvr1/e;

    invoke-virtual {p1}, Lvr1/e;->b()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lvr1/b$b;->a:Lvr1/b$b;

    iput-object v0, p0, Lvr1/d$j;->I:Ljava/lang/Object;

    iput v6, p0, Lvr1/d$j;->H:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_3

    :cond_4
    :goto_1
    iget-object p1, p0, Lvr1/d$j;->J:Lvr1/e;

    invoke-virtual {p1}, Lvr1/e;->a()Lvr1/c;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    instance-of v2, p1, Lvr1/c$a;

    const-string v7, "print(...)"

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v2, :cond_5

    iget-object v2, p0, Lvr1/d$j;->K:Lvr1/d;

    invoke-static {v2}, Lvr1/d;->g(Lvr1/d;)Lzr2/a;

    move-result-object v2

    invoke-interface {v2}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object v2

    check-cast p1, Lvr1/c$a;

    invoke-virtual {p1}, Lvr1/c$a;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Lorg/joda/time/DateTime;->minusMonths(I)Lorg/joda/time/DateTime;

    move-result-object v2

    new-instance v3, Lvr1/b$a;

    invoke-static {}, Lvr1/d;->f()Lvr1/d$a;

    move-result-object v4

    invoke-virtual {v4}, Lvr1/d$a;->a()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v4

    invoke-virtual {v4, v2}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lvr1/c$a;->a()I

    move-result p1

    invoke-direct {v3, v2, p1}, Lvr1/b$a;-><init>(Ljava/lang/String;I)V

    iput-object v9, p0, Lvr1/d$j;->I:Ljava/lang/Object;

    iput-object v9, p0, Lvr1/d$j;->w:Ljava/lang/Object;

    iput-object v9, p0, Lvr1/d$j;->x:Ljava/lang/Object;

    iput v8, p0, Lvr1/d$j;->G:I

    iput v5, p0, Lvr1/d$j;->H:I

    invoke-interface {v0, v3, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto/16 :goto_3

    :cond_5
    sget-object v2, Lvr1/c$b;->a:Lvr1/c$b;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object p1, p0, Lvr1/d$j;->K:Lvr1/d;

    invoke-static {p1}, Lvr1/d;->g(Lvr1/d;)Lzr2/a;

    move-result-object p1

    invoke-interface {p1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object p1

    new-instance v2, Lvr1/b$c;

    invoke-static {}, Lvr1/d;->f()Lvr1/d$a;

    move-result-object v3

    invoke-virtual {v3}, Lvr1/d$a;->a()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v3

    invoke-virtual {v3, p1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1, v8}, Lvr1/b$c;-><init>(Ljava/lang/String;I)V

    iput-object v9, p0, Lvr1/d$j;->I:Ljava/lang/Object;

    iput-object v9, p0, Lvr1/d$j;->w:Ljava/lang/Object;

    iput-object v9, p0, Lvr1/d$j;->x:Ljava/lang/Object;

    iput v8, p0, Lvr1/d$j;->G:I

    iput v4, p0, Lvr1/d$j;->H:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto/16 :goto_3

    :cond_6
    instance-of v2, p1, Lvr1/c$c;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lvr1/d$j;->K:Lvr1/d;

    invoke-static {v2}, Lvr1/d;->g(Lvr1/d;)Lzr2/a;

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

    :try_start_0
    invoke-static {}, Lvr1/d;->f()Lvr1/d$a;

    move-result-object v4

    invoke-virtual {v4}, Lvr1/d$a;->a()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v4

    move-object v5, p1

    check-cast v5, Lvr1/c$c;

    invoke-virtual {v5}, Lvr1/c$c;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lorg/joda/time/format/DateTimeFormatter;->parseDateTime(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v4

    move-object v5, p1

    check-cast v5, Lvr1/c$c;

    invoke-virtual {v5}, Lvr1/c$c;->a()Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ll83/k;

    invoke-direct {v7, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v4

    iget-object v5, p0, Lvr1/d$j;->K:Lvr1/d;

    invoke-static {v5}, Lvr1/d;->i(Lvr1/d;)Ltr2/n;

    move-result-object v5

    check-cast p1, Lvr1/c$c;

    invoke-virtual {p1}, Lvr1/c$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v7, "Failed to parse specificDate: "

    const-string v10, ", falling back to current date"

    invoke-static {v7, p1, v10}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v7, v8, [Lqr2/a$a;

    invoke-interface {v5, p1, v4, v7}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Lvr1/d$j;->K:Lvr1/d;

    invoke-static {p1}, Lvr1/d;->g(Lvr1/d;)Lzr2/a;

    move-result-object p1

    invoke-interface {p1}, Lzr2/a;->c()Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-static {}, Lvr1/d;->f()Lvr1/d$a;

    move-result-object v4

    invoke-virtual {v4}, Lvr1/d$a;->a()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v4

    invoke-virtual {v4, p1}, Lorg/joda/time/format/DateTimeFormatter;->print(Lorg/joda/time/ReadableInstant;)Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ll83/k;

    invoke-direct {v7, p1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    iget-object p1, v7, Ll83/k;->w:Ljava/lang/Object;

    check-cast p1, Lorg/joda/time/DateTime;

    iget-object v4, v7, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractDateTime;->getYear()I

    move-result v5

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractDateTime;->getMonthOfYear()I

    move-result v7

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractDateTime;->getDayOfMonth()I

    move-result p1

    invoke-static {v5, v7, p1}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object p1

    sget-object v5, Ljava/time/temporal/ChronoUnit;->MONTHS:Ljava/time/temporal/ChronoUnit;

    invoke-virtual {p1, v6}, Ljava/time/LocalDate;->withDayOfMonth(I)Ljava/time/LocalDate;

    move-result-object p1

    invoke-virtual {v2, v6}, Ljava/time/LocalDate;->withDayOfMonth(I)Ljava/time/LocalDate;

    move-result-object v2

    invoke-virtual {v5, p1, v2}, Ljava/time/temporal/ChronoUnit;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)J

    move-result-wide v5

    long-to-int p1, v5

    new-instance v2, Lvr1/b$c;

    invoke-direct {v2, v4, p1}, Lvr1/b$c;-><init>(Ljava/lang/String;I)V

    iput-object v9, p0, Lvr1/d$j;->I:Ljava/lang/Object;

    iput-object v9, p0, Lvr1/d$j;->w:Ljava/lang/Object;

    iput-object v9, p0, Lvr1/d$j;->x:Ljava/lang/Object;

    iput-object v9, p0, Lvr1/d$j;->y:Ljava/lang/Object;

    iput-object v9, p0, Lvr1/d$j;->z:Ljava/lang/Object;

    iput-object v9, p0, Lvr1/d$j;->E:Ljava/lang/Object;

    iput-object v9, p0, Lvr1/d$j;->F:Ljava/lang/Object;

    iput p1, p0, Lvr1/d$j;->G:I

    iput v3, p0, Lvr1/d$j;->H:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
