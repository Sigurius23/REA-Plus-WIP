.class final Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$fetchUncached$1$result$1"
    f = "ArchMiniCalendarInteractor.kt"
    l = {
        0xf6,
        0x13e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/network/request/GetApiRequest;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcom/whoop/network/request/GetApiRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;",
            "Lcom/whoop/network/request/GetApiRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iput-object p2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->E:Lcom/whoop/network/request/GetApiRequest;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;

    iget-object v1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->E:Lcom/whoop/network/request/GetApiRequest;

    invoke-direct {v0, v1, v2, p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;-><init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcom/whoop/network/request/GetApiRequest;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->w:Ljava/lang/Object;

    check-cast v0, Lf63/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    invoke-static {p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->d(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Lu02/c;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->E:Lcom/whoop/network/request/GetApiRequest;

    const-class v4, Ll83/a0;

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object v5

    invoke-static {v5}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v6

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v4, v5, v6}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v4

    iput v3, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->y:I

    invoke-virtual {p1, v1, v4, p0}, Lu02/c;->d(Lz02/a;Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lf63/c;

    invoke-virtual {p1}, Lf63/c;->a()Lw53/b;

    move-result-object p1

    const-class v1, [B

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v3

    invoke-static {v3}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v4

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v1, v3, v4}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->w:Ljava/lang/Object;

    const/4 v3, 0x0

    iput v3, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->x:I

    iput v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->y:I

    invoke-virtual {p1, v1, p0}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    if-eqz p1, :cond_5

    check-cast p1, [B

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d$a;->z:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    invoke-static {v0}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->f(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Lad3/c;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->Companion:Lcom/whoop/design/models/calendar/archmini/CalendarContentModel$Companion;

    invoke-virtual {v1}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel$Companion;->serializer()Lwc3/c;

    move-result-object v1

    check-cast v1, Lwc3/b;

    invoke-static {p1}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.ByteArray"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
