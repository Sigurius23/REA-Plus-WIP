.class public final Lvr1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvr1/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lvr1/c;",
        "Lh91/b<",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0007\u0018\u0000 02\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u00050\u0001:\u0001&B1\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ!\u0010!\u001a\u000c\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0006\u0010 \u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J1\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u00050\u00182\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/\u00a8\u00061"
    }
    d2 = {
        "Lvr1/d;",
        "Lod1/g;",
        "Lvr1/c;",
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Ljava/util/Locale;",
        "locale",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;Ltr2/n;Lzr2/a;Ljava/util/Locale;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lvr1/e;",
        "ongoingPreparationAccumulator",
        "currentAction",
        "l",
        "(Lvr1/e;Lvr1/c;)Lvr1/e;",
        "accumulator",
        "Lec3/l;",
        "Lvr1/b;",
        "o",
        "(Lvr1/e;)Lec3/l;",
        "Lvr1/a;",
        "state",
        "n",
        "(Lvr1/a;Lvr1/b;Lq83/d;)Ljava/lang/Object;",
        "data",
        "m",
        "(Lvr1/a;)Lh91/b;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lzr2/a;",
        "d",
        "Ljava/util/Locale;",
        "e",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "f",
        "journal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final f:Lvr1/d$a;

.field public static final g:I

.field private static final h:Lorg/joda/time/format/DateTimeFormatter;


# instance fields
.field private final a:Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;

.field private final b:Ltr2/n;

.field private final c:Lzr2/a;

.field private final d:Ljava/util/Locale;

.field private final e:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvr1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvr1/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvr1/d;->f:Lvr1/d$a;

    const/16 v0, 0x8

    sput v0, Lvr1/d;->g:I

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "forPattern(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lvr1/d;->h:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;Ltr2/n;Lzr2/a;Ljava/util/Locale;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvr1/d;->a:Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;

    .line 3
    iput-object p2, p0, Lvr1/d;->b:Ltr2/n;

    .line 4
    iput-object p3, p0, Lvr1/d;->c:Lzr2/a;

    .line 5
    iput-object p4, p0, Lvr1/d;->d:Ljava/util/Locale;

    .line 6
    iput-object p5, p0, Lvr1/d;->e:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;Ltr2/n;Lzr2/a;Ljava/util/Locale;Lcom/whoop/data/repositories/FeatureFlagChecker;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    .line 7
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p4

    const-string p6, "getDefault(...)"

    invoke-static {p4, p6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lvr1/d;-><init>(Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;Ltr2/n;Lzr2/a;Ljava/util/Locale;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-void
.end method

.method public static final synthetic c(Lvr1/d;Lvr1/e;Lvr1/c;)Lvr1/e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lvr1/d;->l(Lvr1/e;Lvr1/c;)Lvr1/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lvr1/d;Lvr1/a;)Lh91/b;
    .locals 0

    invoke-direct {p0, p1}, Lvr1/d;->m(Lvr1/a;)Lh91/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lvr1/d;)Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;
    .locals 0

    iget-object p0, p0, Lvr1/d;->a:Lcom/whoop/journal/interactors/v2/calendar/JournalCalendarApi;

    return-object p0
.end method

.method public static final synthetic f()Lvr1/d$a;
    .locals 1

    sget-object v0, Lvr1/d;->f:Lvr1/d$a;

    return-object v0
.end method

.method public static final synthetic g(Lvr1/d;)Lzr2/a;
    .locals 0

    iget-object p0, p0, Lvr1/d;->c:Lzr2/a;

    return-object p0
.end method

.method public static final synthetic h()Lorg/joda/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lvr1/d;->h:Lorg/joda/time/format/DateTimeFormatter;

    return-object v0
.end method

.method public static final synthetic i(Lvr1/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lvr1/d;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic j(Lvr1/d;Lvr1/a;Lvr1/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lvr1/d;->n(Lvr1/a;Lvr1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lvr1/d;Lvr1/e;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lvr1/d;->o(Lvr1/e;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final l(Lvr1/e;Lvr1/c;)Lvr1/e;
    .locals 5

    instance-of v0, p2, Lvr1/c$a;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Lvr1/c$a;

    invoke-virtual {v0}, Lvr1/c$a;->a()I

    move-result v0

    invoke-virtual {p1}, Lvr1/e;->c()Ljava/util/Set;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v0, Lvr1/e;

    invoke-virtual {p1}, Lvr1/e;->c()Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p1, p2, v1}, Lvr1/e;-><init>(Ljava/util/Set;Lvr1/c;Z)V

    return-object v0

    :cond_0
    new-instance v1, Lvr1/e;

    invoke-virtual {p1}, Lvr1/e;->c()Ljava/util/Set;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0, p1}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-direct {v1, p1, p2, v2}, Lvr1/e;-><init>(Ljava/util/Set;Lvr1/c;Z)V

    return-object v1

    :cond_1
    sget-object v0, Lvr1/c$b;->a:Lvr1/c$b;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p1, Lvr1/e;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p1, v0, p2, v2}, Lvr1/e;-><init>(Ljava/util/Set;Lvr1/c;Z)V

    return-object p1

    :cond_2
    instance-of v0, p2, Lvr1/c$c;

    if-eqz v0, :cond_3

    new-instance v0, Lvr1/e;

    invoke-virtual {p1}, Lvr1/e;->c()Ljava/util/Set;

    move-result-object p1

    invoke-direct {v0, p1, p2, v2}, Lvr1/e;-><init>(Ljava/util/Set;Lvr1/c;Z)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final m(Lvr1/a;)Lh91/b;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr1/a;",
            ")",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvr1/d;->c:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/LocalDate;->getYear()I

    move-result v1

    invoke-virtual {v0}, Lorg/joda/time/LocalDate;->getMonthOfYear()I

    move-result v2

    invoke-virtual {v0}, Lorg/joda/time/LocalDate;->getDayOfMonth()I

    move-result v0

    invoke-static {v1, v2, v0}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v5

    sget-object v3, Lh91/b;->j:Lh91/b$a;

    iget-object v4, p0, Lvr1/d;->d:Ljava/util/Locale;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lvr1/a;->d()Ljava/time/LocalDate;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v6, v5

    goto :goto_0

    :cond_0
    move-object v6, v0

    :goto_0
    invoke-virtual {p1}, Lvr1/a;->c()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {p1}, Lvr1/a;->e()Z

    move-result v9

    const/16 v12, 0xc0

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, v5

    invoke-static/range {v3 .. v13}, Lh91/b$a;->b(Lh91/b$a;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;ZLjava/util/List;IILjava/lang/Object;)Lh91/b;

    move-result-object p1

    return-object p1
.end method

.method private final n(Lvr1/a;Lvr1/b;Lq83/d;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr1/a;",
            "Lvr1/b;",
            "Lq83/d<",
            "-",
            "Lvr1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    instance-of v3, v2, Lvr1/d$g;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lvr1/d$g;

    iget v4, v3, Lvr1/d$g;->E:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lvr1/d$g;->E:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lvr1/d$g;

    invoke-direct {v3, v0, v2}, Lvr1/d$g;-><init>(Lvr1/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lvr1/d$g;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lvr1/d$g;->E:I

    const/16 v12, 0xa

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v1, v9, Lvr1/d$g;->x:Ljava/lang/Object;

    check-cast v1, Lvr1/b;

    iget-object v3, v9, Lvr1/d$g;->w:Ljava/lang/Object;

    check-cast v3, Lvr1/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v3

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v9, Lvr1/d$g;->x:Ljava/lang/Object;

    check-cast v1, Lvr1/b;

    iget-object v3, v9, Lvr1/d$g;->w:Ljava/lang/Object;

    check-cast v3, Lvr1/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v3

    goto :goto_2

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v2, Lvr1/b$b;->a:Lvr1/b$b;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lvr1/a;->b(Lvr1/a;Ljava/util/Map;Ljava/time/LocalDate;ZILjava/lang/Object;)Lvr1/a;

    move-result-object v1

    return-object v1

    :cond_4
    move-object/from16 v2, p1

    instance-of v4, v1, Lvr1/b$c;

    const/4 v7, 0x0

    if-eqz v4, :cond_a

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v5, v0, Lvr1/d;->b:Ltr2/n;

    new-instance v8, Lvr1/d$h;

    invoke-direct {v8, v0, v1, v7}, Lvr1/d$h;-><init>(Lvr1/d;Lvr1/b;Lq83/d;)V

    iput-object v2, v9, Lvr1/d$g;->w:Ljava/lang/Object;

    iput-object v1, v9, Lvr1/d$g;->x:Ljava/lang/Object;

    iput v6, v9, Lvr1/d$g;->E:I

    const/4 v6, 0x0

    const-string v7, "InteractingState.RefreshSpecificDate"

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object v5, v2

    move-object v2, v4

    :goto_2
    check-cast v2, Lu02/a;

    instance-of v3, v2, Lu02/a$b$a;

    if-eqz v3, :cond_6

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lvr1/a;->b(Lvr1/a;Ljava/util/Map;Ljava/time/LocalDate;ZILjava/lang/Object;)Lvr1/a;

    move-result-object v1

    return-object v1

    :cond_6
    instance-of v3, v2, Lu02/a$b$b;

    if-eqz v3, :cond_7

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lvr1/a;->b(Lvr1/a;Ljava/util/Map;Ljava/time/LocalDate;ZILjava/lang/Object;)Lvr1/a;

    move-result-object v1

    return-object v1

    :cond_7
    instance-of v3, v2, Lu02/a$c;

    if-eqz v3, :cond_9

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/journal/interactors/v2/calendar/JournalCalendar;

    invoke-virtual {v2}, Lcom/whoop/journal/interactors/v2/calendar/JournalCalendar;->getDaysOfMonth()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/calendar/CalendarDateModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/calendar/CalendarDateModel;->getDayState()Lcom/whoop/design/models/calendar/CalendarDayState;

    move-result-object v10

    invoke-virtual {v4}, Lcom/whoop/design/models/calendar/CalendarDateModel;->getCycleId()Ljava/lang/Long;

    move-result-object v9

    new-instance v6, Lcom/whoop/design/models/calendar/CalendarDateModel;

    const/16 v18, 0x7f3

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v6 .. v19}, Lcom/whoop/design/models/calendar/CalendarDateModel;-><init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-virtual {v5}, Lvr1/a;->c()Ljava/util/Map;

    move-result-object v2

    check-cast v1, Lvr1/b$c;

    invoke-virtual {v1}, Lvr1/b$c;->a()I

    move-result v4

    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v4}, Ljava/lang/Integer;-><init>(I)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v6, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v2, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v1}, Lvr1/b$c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDate;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v5, v2, v1, v3}, Lvr1/a;->a(Ljava/util/Map;Ljava/time/LocalDate;Z)Lvr1/a;

    move-result-object v1

    return-object v1

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_a
    instance-of v4, v1, Lvr1/b$a;

    if-eqz v4, :cond_11

    invoke-virtual {v2}, Lvr1/a;->c()Ljava/util/Map;

    move-result-object v4

    move-object v6, v1

    check-cast v6, Lvr1/b$a;

    invoke-virtual {v6}, Lvr1/b$a;->a()I

    move-result v6

    new-instance v8, Ljava/lang/Integer;

    invoke-direct {v8, v6}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v4, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lvr1/a;->b(Lvr1/a;Ljava/util/Map;Ljava/time/LocalDate;ZILjava/lang/Object;)Lvr1/a;

    move-result-object v1

    return-object v1

    :cond_b
    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v6, v0, Lvr1/d;->b:Ltr2/n;

    new-instance v8, Lvr1/d$i;

    invoke-direct {v8, v0, v1, v7}, Lvr1/d$i;-><init>(Lvr1/d;Lvr1/b;Lq83/d;)V

    iput-object v2, v9, Lvr1/d$g;->w:Ljava/lang/Object;

    iput-object v1, v9, Lvr1/d$g;->x:Ljava/lang/Object;

    iput v5, v9, Lvr1/d$g;->E:I

    move-object v5, v6

    const/4 v6, 0x0

    const-string v7, "InteractingState.CalendarPaged"

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_c

    :goto_4
    return-object v3

    :cond_c
    move-object v5, v2

    move-object v2, v4

    :goto_5
    check-cast v2, Lu02/a;

    instance-of v3, v2, Lu02/a$b$a;

    if-eqz v3, :cond_d

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lvr1/a;->b(Lvr1/a;Ljava/util/Map;Ljava/time/LocalDate;ZILjava/lang/Object;)Lvr1/a;

    move-result-object v1

    return-object v1

    :cond_d
    instance-of v3, v2, Lu02/a$b$b;

    if-eqz v3, :cond_e

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lvr1/a;->b(Lvr1/a;Ljava/util/Map;Ljava/time/LocalDate;ZILjava/lang/Object;)Lvr1/a;

    move-result-object v1

    return-object v1

    :cond_e
    instance-of v3, v2, Lu02/a$c;

    if-eqz v3, :cond_10

    check-cast v2, Lu02/a$c;

    invoke-virtual {v2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/journal/interactors/v2/calendar/JournalCalendar;

    invoke-virtual {v2}, Lcom/whoop/journal/interactors/v2/calendar/JournalCalendar;->getDaysOfMonth()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/calendar/CalendarDateModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/calendar/CalendarDateModel;->getDayState()Lcom/whoop/design/models/calendar/CalendarDayState;

    move-result-object v10

    invoke-virtual {v4}, Lcom/whoop/design/models/calendar/CalendarDateModel;->getCycleId()Ljava/lang/Long;

    move-result-object v9

    new-instance v6, Lcom/whoop/design/models/calendar/CalendarDateModel;

    const/16 v18, 0x7f3

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v6 .. v19}, Lcom/whoop/design/models/calendar/CalendarDateModel;-><init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_f
    invoke-virtual {v5}, Lvr1/a;->c()Ljava/util/Map;

    move-result-object v2

    check-cast v1, Lvr1/b$a;

    invoke-virtual {v1}, Lvr1/b$a;->a()I

    move-result v1

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v2, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v6

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lvr1/a;->b(Lvr1/a;Ljava/util/Map;Ljava/time/LocalDate;ZILjava/lang/Object;)Lvr1/a;

    move-result-object v1

    return-object v1

    :cond_10
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_11
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final o(Lvr1/e;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr1/e;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lvr1/d$j;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lvr1/d$j;-><init>(Lvr1/e;Lvr1/d;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvr1/e;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lvr1/e;-><init>(Ljava/util/Set;Lvr1/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lvr1/d$e;

    invoke-direct {v0, p0, v2}, Lvr1/d$e;-><init>(Lvr1/d;Lq83/d;)V

    new-instance v3, Lec3/l1;

    invoke-direct {v3, v1, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lvr1/d$b;

    invoke-direct {p1, v3}, Lvr1/d$b;-><init>(Lec3/l;)V

    new-instance v0, Lvr1/d$c;

    invoke-direct {v0, v2, p0}, Lvr1/d$c;-><init>(Lq83/d;Lvr1/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v3, Lvr1/a;

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct/range {v3 .. v8}, Lvr1/a;-><init>(Ljava/util/Map;Ljava/time/LocalDate;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lvr1/d$f;

    invoke-direct {v0, p0, v2}, Lvr1/d$f;-><init>(Lvr1/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v3, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    invoke-static {v1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Lvr1/d$d;

    invoke-direct {v0, p1, p0}, Lvr1/d$d;-><init>(Lec3/l;Lvr1/d;)V

    return-object v0
.end method
