.class public final Lck2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lck2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001#B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\u0004\u0018\u0001`\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012*\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lck2/a;",
        "",
        "<init>",
        "()V",
        "Lwj2/b$c;",
        "domainResult",
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "calendarState",
        "Lbk2/g;",
        "h",
        "(Lwj2/b$c;Lh91/b;)Lbk2/g;",
        "Lcom/whoop/design/models/items/graph/ZoomableGraphModel;",
        "graphModel",
        "Lt81/r;",
        "e",
        "(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;)Lt81/r;",
        "",
        "Lj71/b;",
        "c",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lh71/k;",
        "b",
        "(Lh71/k;)Lh71/k;",
        "Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;",
        "tiltGraphDatePickerModel",
        "Li11/f;",
        "g",
        "(Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;)Li11/f;",
        "Lyj2/a;",
        "combinedDomainState",
        "f",
        "(Lyj2/a;)Lbk2/g;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "designItemReducer",
        "tilt-graph_release"
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
.field public static final b:Lck2/a$a;

.field public static final c:I

.field private static final d:Lh2/c;


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lck2/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lck2/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lck2/a;->b:Lck2/a$a;

    sget v0, Ljb1/a;->c:I

    sput v0, Lck2/a;->c:I

    new-instance v0, Lh2/c;

    const/4 v1, 0x0

    const v2, 0x3e4ccccd    # 0.2f

    invoke-direct {v0, v1, v2, v1, v1}, Lh2/c;-><init>(FFFF)V

    sput-object v0, Lck2/a;->d:Lh2/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcj2/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lcj2/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    iput-object v0, p0, Lck2/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lck2/a;->d(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lh71/k;)Lh71/k;
    .locals 9

    sget-object v2, Lck2/a;->d:Lh2/c;

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Lh71/k;->b(Lh71/k;Lg61/b;Lh2/c;Lj61/g;ZZZILjava/lang/Object;)Lh71/k;

    move-result-object p1

    return-object p1
.end method

.method private final c(Ljava/util/List;)Ljava/util/List;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lj71/b;",
            ">;)",
            "Ljava/util/List<",
            "Lj71/b;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj71/b;

    instance-of v4, v3, Lj71/b$i;

    if-eqz v4, :cond_1

    move-object v5, v3

    check-cast v5, Lj71/b$i;

    invoke-virtual {v5}, Lj71/b$i;->h()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ly61/a;

    sget-object v13, Ly81/f;->WHITE_50:Ly81/f;

    const/16 v19, 0x7df

    const/16 v20, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v7 .. v20}, Ly61/a;->b(Ly61/a;Lcom/whoop/design/util/TextResource;Ljava/util/List;FLu61/d;Lkd1/o;Ly81/f;La71/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgz0/m0;ILjava/lang/Object;)Ly61/a;

    move-result-object v4

    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    const/16 v11, 0x1e

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lj71/b$i;->f(Lj71/b$i;Ljava/util/List;Lx61/a;Ljava/lang/String;ZZILjava/lang/Object;)Lj71/b$i;

    move-result-object v3

    goto :goto_2

    :cond_1
    instance-of v4, v3, Lj71/b$d;

    if-eqz v4, :cond_2

    move-object v5, v3

    check-cast v5, Lj71/b$d;

    const/16 v12, 0x37

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, -0x42333333    # -0.1f

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lj71/b$d;->f(Lj71/b$d;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FZZILjava/lang/Object;)Lj71/b$d;

    move-result-object v3

    :cond_2
    :goto_2
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method private static final d(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final e(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;)Lt81/r;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lck2/a;->a:Ljb1/a;

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    instance-of v2, v1, Lt81/r;

    if-nez v2, :cond_0

    const/4 v1, 0x0

    return-object v1

    :cond_0
    move-object v2, v1

    check-cast v2, Lt81/r;

    invoke-virtual {v2}, Lt81/r;->i()Lh71/k;

    move-result-object v1

    invoke-direct {v0, v1}, Lck2/a;->b(Lh71/k;)Lh71/k;

    move-result-object v3

    invoke-virtual {v2}, Lt81/r;->j()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lck2/a;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    const/16 v17, 0x1ffa

    const/16 v18, 0x0

    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v2 .. v18}, Lt81/r;->b(Lt81/r;Lh71/k;Lh2/c;Ljava/util/List;JLcom/whoop/design/util/TextResource;FLt81/s;Lt81/e;ZLd61/a;Ljava/lang/String;Lh71/l;Ljava/lang/Object;ILjava/lang/Object;)Lt81/r;

    move-result-object v1

    return-object v1
.end method

.method private final g(Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;)Li11/f;
    .locals 14

    invoke-virtual {p1}, Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;->getCurrentDateRangeDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;->getPreviousDateTime()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    move v4, v2

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;->getNextDateTime()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    move v6, v2

    goto :goto_1

    :cond_1
    move v6, v1

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;->getPreviousDateTime()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_2

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, v0

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;->getNextDateTime()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    move-object v7, v1

    goto :goto_3

    :cond_3
    move-object v7, p1

    :goto_3
    new-instance v1, Li11/f;

    const/16 v12, 0x3c1

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Li11/f;-><init>(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final h(Lwj2/b$c;Lh91/b;)Lbk2/g;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwj2/b$c;",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;)",
            "Lbk2/g;"
        }
    .end annotation

    new-instance v0, Lbk2/g$c;

    new-instance v1, Lbk2/c;

    invoke-virtual {p1}, Lwj2/b$c;->a()Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;->getDatePicker()Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;

    move-result-object v2

    invoke-direct {p0, v2}, Lck2/a;->g(Lcom/whoop/tiltgraph/domain/models/TiltGraphDatePickerModel;)Li11/f;

    move-result-object v3

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->c()I

    move-result v4

    invoke-virtual {p1}, Lwj2/b$c;->a()Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p1}, Lwj2/b$c;->a()Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;->getLastUpdatedTimestamp()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, p2

    invoke-direct/range {v1 .. v9}, Lbk2/c;-><init>(Lh91/b;Li11/f;ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1}, Lwj2/b$c;->a()Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;->getGraph()Lcom/whoop/design/models/items/graph/ZoomableGraphModel;

    move-result-object p1

    invoke-direct {p0, p1}, Lck2/a;->e(Lcom/whoop/design/models/items/graph/ZoomableGraphModel;)Lt81/r;

    move-result-object p1

    sget-object p2, Lck2/a;->d:Lh2/c;

    invoke-direct {v0, v1, p1, p2}, Lbk2/g$c;-><init>(Lbk2/c;Lm91/u;Lh2/c;)V

    return-object v0
.end method


# virtual methods
.method public final f(Lyj2/a;)Lbk2/g;
    .locals 2

    const-string v0, "combinedDomainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lyj2/a;->b()Lwj2/b;

    move-result-object v0

    instance-of v1, v0, Lwj2/b$a;

    if-eqz v1, :cond_0

    new-instance v0, Lbk2/g$a;

    invoke-virtual {p1}, Lyj2/a;->b()Lwj2/b;

    move-result-object p1

    check-cast p1, Lwj2/b$a;

    invoke-virtual {p1}, Lwj2/b$a;->a()Ljava/time/LocalDate;

    move-result-object p1

    invoke-direct {v0, p1}, Lbk2/g$a;-><init>(Ljava/time/LocalDate;)V

    return-object v0

    :cond_0
    sget-object v1, Lwj2/b$b;->a:Lwj2/b$b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, Lbk2/g$b;->a:Lbk2/g$b;

    return-object p1

    :cond_1
    instance-of v0, v0, Lwj2/b$c;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lyj2/a;->b()Lwj2/b;

    move-result-object v0

    check-cast v0, Lwj2/b$c;

    invoke-virtual {p1}, Lyj2/a;->a()Lh91/b;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lck2/a;->h(Lwj2/b$c;Lh91/b;)Lbk2/g;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
