.class final Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->w(Lib1/a;)Lec3/l;
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
        "Lan0/a;",
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
    c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$load$1"
    f = "ArchMiniCalendarInteractor.kt"
    l = {
        0x60,
        0x64,
        0x70
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

.field final synthetic J:Lib1/a;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;",
            "Lib1/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->I:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iput-object p2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->J:Lib1/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(I)Lan0/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->j(I)Lan0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Ljava/time/LocalDate;Ljava/time/LocalDate;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->i(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Ljava/time/LocalDate;Ljava/time/LocalDate;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Ljava/time/LocalDate;Ljava/time/LocalDate;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;
    .locals 1

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v0, p3

    move-object p3, p2

    move-object p2, p5

    move p5, p4

    move-object p4, v0

    invoke-static/range {p0 .. p5}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->m(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/time/LocalDate;Ljava/time/LocalDate;I)Lan0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final j(I)Lan0/a;
    .locals 15

    new-instance v0, Lan0/a;

    const/16 v13, 0xff8

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v3, p0

    invoke-direct/range {v0 .. v14}, Lan0/a;-><init>(ZZILjava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lh91/b;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
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

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;

    iget-object v1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->I:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->J:Lib1/a;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;-><init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->H:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->H:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->G:I

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_0

    if-ne v3, v5, :cond_1

    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->E:Ljava/lang/Object;

    check-cast v1, Lec3/l;

    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    :cond_0
    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->x:Ljava/lang/Object;

    check-cast v1, Ljava/time/LocalDate;

    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->w:Ljava/lang/Object;

    check-cast v1, Ljava/time/LocalDate;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->F:I

    iget-object v7, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->x:Ljava/lang/Object;

    check-cast v7, Ljava/time/LocalDate;

    iget-object v8, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->w:Ljava/lang/Object;

    check-cast v8, Ljava/time/LocalDate;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v20, v3

    move-object/from16 v19, v7

    :goto_0
    move-object/from16 v18, v8

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->I:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    invoke-static {v3}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->e(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Ljava/time/Clock;

    move-result-object v3

    invoke-static {v3}, Ljava/time/LocalDate;->now(Ljava/time/Clock;)Ljava/time/LocalDate;

    move-result-object v8

    iget-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->I:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v9, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->J:Lib1/a;

    invoke-virtual {v9}, Lib1/a;->g()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->o(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v3

    if-nez v3, :cond_4

    move-object v3, v8

    :cond_4
    iget-object v9, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->I:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v10, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->J:Lib1/a;

    invoke-virtual {v10}, Lib1/a;->c()I

    move-result v10

    invoke-static {v9, v3, v8, v10}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->n(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Ljava/time/LocalDate;Ljava/time/LocalDate;I)I

    move-result v14

    new-instance v11, Lan0/a;

    const/16 v24, 0xffa

    const/16 v25, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v11 .. v25}, Lan0/a;-><init>(ZZILjava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lh91/b;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->H:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->w:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->x:Ljava/lang/Object;

    iput v14, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->F:I

    iput v7, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->G:I

    invoke-interface {v1, v11, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_5

    goto/16 :goto_2

    :cond_5
    move-object/from16 v19, v3

    move/from16 v20, v14

    goto :goto_0

    :goto_1
    iget-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->J:Lib1/a;

    invoke-virtual {v3}, Lib1/a;->b()Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    move-result-object v17

    const/4 v3, 0x0

    if-eqz v17, :cond_6

    iget-object v15, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->I:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v5, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->J:Lib1/a;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object/from16 v16, v5

    invoke-static/range {v15 .. v20}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->m(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/time/LocalDate;Ljava/time/LocalDate;I)Lan0/a;

    move-result-object v5

    move/from16 v14, v20

    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->H:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->w:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->x:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->y:Ljava/lang/Object;

    iput v14, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->F:I

    iput v6, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->G:I

    invoke-interface {v1, v5, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    goto :goto_2

    :cond_6
    move/from16 v14, v20

    iget-object v6, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->J:Lib1/a;

    invoke-virtual {v6}, Lib1/a;->g()Ljava/lang/String;

    move-result-object v9

    iget-object v6, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->I:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v7, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->J:Lib1/a;

    invoke-virtual {v7}, Lib1/a;->f()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v7

    iget-object v8, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->J:Lib1/a;

    invoke-virtual {v8}, Lib1/a;->a()Lcom/whoop/navigation/CachePolicyModel;

    move-result-object v8

    invoke-static {v6, v7, v8, v9, v9}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->c(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object v8

    iget-object v7, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->I:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v6, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->J:Lib1/a;

    new-instance v15, Lcom/whoop/calendararchmini/domain/b;

    move-object/from16 v17, v6

    move-object/from16 v16, v7

    invoke-direct/range {v15 .. v20}, Lcom/whoop/calendararchmini/domain/b;-><init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Ljava/time/LocalDate;Ljava/time/LocalDate;I)V

    new-instance v12, Lcom/whoop/calendararchmini/domain/c;

    invoke-direct {v12, v14}, Lcom/whoop/calendararchmini/domain/c;-><init>(I)V

    const/4 v10, 0x0

    move-object v11, v15

    invoke-static/range {v7 .. v12}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->q(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lec3/l;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lc93/a;)Lec3/l;

    move-result-object v6

    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->H:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->w:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->x:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->y:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->z:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->E:Ljava/lang/Object;

    iput v14, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->F:I

    iput v5, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->G:I

    invoke-static {v1, v6, v0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    :goto_2
    return-object v2

    :cond_7
    return-object v4
.end method
