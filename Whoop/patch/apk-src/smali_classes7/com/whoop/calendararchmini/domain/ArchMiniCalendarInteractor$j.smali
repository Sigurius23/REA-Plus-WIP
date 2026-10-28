.class final Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->C(Lec3/l;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lc93/a;)Lec3/l;
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
    c = "com.whoop.calendararchmini.domain.ArchMiniCalendarInteractor$toDomainStates$1"
    f = "ArchMiniCalendarInteractor.kt"
    l = {
        0xbf
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field final synthetic F:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic G:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

.field final synthetic H:Ljava/lang/String;

.field final synthetic I:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZLec3/l;Lkotlin/jvm/functions/Function1;Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Ljava/lang/String;Lc93/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lec3/l;",
            "Lkotlin/jvm/functions/Function1;",
            "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->z:Z

    iput-object p2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->E:Lec3/l;

    iput-object p3, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->F:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->G:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iput-object p5, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->H:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->I:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;

    iget-boolean v1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->z:Z

    iget-object v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->E:Lec3/l;

    iget-object v3, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->F:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->G:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v5, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->H:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->I:Lc93/a;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;-><init>(ZLec3/l;Lkotlin/jvm/functions/Function1;Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Ljava/lang/String;Lc93/a;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lec3/m;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->x:I

    const/4 v8, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v8, :cond_0

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v2, Lkotlin/jvm/internal/b0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-boolean p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->z:Z

    iput-boolean p1, v2, Lkotlin/jvm/internal/b0;->w:Z

    iget-object p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->E:Lec3/l;

    new-instance v1, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;

    iget-object v4, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->F:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->G:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v6, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->H:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->I:Lc93/a;

    invoke-direct/range {v1 .. v7}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j$a;-><init>(Lkotlin/jvm/internal/b0;Lec3/m;Lkotlin/jvm/functions/Function1;Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Ljava/lang/String;Lc93/a;)V

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->y:Ljava/lang/Object;

    iput-object v2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->w:Ljava/lang/Object;

    iput v8, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;->x:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
