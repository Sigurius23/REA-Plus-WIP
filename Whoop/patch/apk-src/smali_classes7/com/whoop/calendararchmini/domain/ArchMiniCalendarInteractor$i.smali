.class final Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->x(ILan0/a;)Lec3/l;
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
    c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$loadPage$1"
    f = "ArchMiniCalendarInteractor.kt"
    l = {
        0x90,
        0x9a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Z

.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lan0/a;

.field final synthetic J:I

.field final synthetic K:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lan0/a;ILcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lan0/a;",
            "I",
            "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->I:Lan0/a;

    iput p2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->J:I

    iput-object p3, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->K:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lan0/a;I)Lan0/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->j(Lan0/a;I)Lan0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lan0/a;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->i(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lan0/a;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lan0/a;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->r(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lan0/a;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lan0/a;I)Lan0/a;
    .locals 15

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v13, 0xfef

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v14}, Lan0/a;->b(Lan0/a;ZZILjava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lh91/b;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lan0/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;

    iget-object v1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->I:Lan0/a;

    iget v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->J:I

    iget-object v3, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->K:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;-><init>(Lan0/a;ILcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->H:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 38

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->H:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->G:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->E:Ljava/lang/Object;

    check-cast v1, Lec3/l;

    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->z:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->y:Ljava/lang/Object;

    check-cast v1, Lan0/a;

    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/navigation/models/ApiRequest;

    iget-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->w:Ljava/lang/Object;

    check-cast v1, Lh91/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-boolean v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->F:Z

    iget-object v5, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->y:Ljava/lang/Object;

    check-cast v5, Lan0/a;

    iget-object v6, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->x:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/navigation/models/ApiRequest;

    iget-object v7, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->w:Ljava/lang/Object;

    check-cast v7, Lh91/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_0
    move v13, v3

    goto/16 :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->I:Lan0/a;

    invoke-virtual {v3}, Lan0/a;->d()Lh91/b;

    move-result-object v7

    const-string v3, "A page event arrived before the calendar loaded"

    if-eqz v7, :cond_7

    iget-object v6, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->I:Lan0/a;

    invoke-virtual {v6}, Lan0/a;->l()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v7}, Lh91/b;->e()Ljava/util/Map;

    move-result-object v3

    iget v8, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->J:I

    new-instance v9, Ljava/lang/Integer;

    invoke-direct {v9, v8}, Ljava/lang/Integer;-><init>(I)V

    invoke-interface {v3, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    iget-object v8, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->I:Lan0/a;

    iget v11, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->J:I

    const/16 v21, 0xfe3

    const/16 v22, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v8 .. v22}, Lan0/a;->b(Lan0/a;ZZILjava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lh91/b;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lan0/a;

    move-result-object v23

    if-eqz v3, :cond_3

    move-object/from16 v8, v23

    move-object v9, v8

    goto :goto_1

    :cond_3
    iget v8, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->J:I

    new-instance v9, Ljava/lang/Integer;

    invoke-direct {v9, v8}, Ljava/lang/Integer;-><init>(I)V

    const/16 v36, 0xff7

    const/16 v37, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    move-object/from16 v27, v9

    invoke-static/range {v23 .. v37}, Lan0/a;->b(Lan0/a;ZZILjava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lh91/b;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lan0/a;

    move-result-object v8

    move-object/from16 v9, v23

    :goto_1
    iput-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->H:Ljava/lang/Object;

    iput-object v7, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->w:Ljava/lang/Object;

    iput-object v6, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->x:Ljava/lang/Object;

    iput-object v9, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->y:Ljava/lang/Object;

    iput-boolean v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->F:Z

    iput v5, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->G:I

    invoke-interface {v1, v8, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v5, v9

    goto/16 :goto_0

    :goto_2
    iget v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->J:I

    invoke-virtual {v7, v3}, Lh91/b;->m(I)Lh91/a;

    move-result-object v3

    invoke-virtual {v3}, Lh91/a;->c()Ljava/time/LocalDate;

    move-result-object v3

    invoke-virtual {v3}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v12

    const-string v3, "toString(...)"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->K:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v9, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->I:Lan0/a;

    invoke-virtual {v9}, Lan0/a;->c()Lcom/whoop/navigation/CachePolicyModel;

    move-result-object v9

    invoke-virtual {v7}, Lh91/b;->k()Ljava/time/LocalDate;

    move-result-object v7

    invoke-virtual {v7}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v6, v9, v12, v7}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->c(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object v11

    iget-object v10, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->K:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->J:I

    new-instance v14, Lcom/whoop/calendararchmini/domain/d;

    invoke-direct {v14, v10, v3, v5}, Lcom/whoop/calendararchmini/domain/d;-><init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;ILan0/a;)V

    new-instance v15, Lcom/whoop/calendararchmini/domain/e;

    invoke-direct {v15, v5, v3}, Lcom/whoop/calendararchmini/domain/e;-><init>(Lan0/a;I)V

    invoke-static/range {v10 .. v15}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->q(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lec3/l;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lc93/a;)Lec3/l;

    move-result-object v3

    const/4 v5, 0x0

    iput-object v5, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->H:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->w:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->x:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->y:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->z:Ljava/lang/Object;

    iput-object v5, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->E:Ljava/lang/Object;

    iput-boolean v13, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->F:Z

    iput v4, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->G:I

    invoke-static {v1, v3, v0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    :goto_3
    return-object v2

    :cond_5
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
