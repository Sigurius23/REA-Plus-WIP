.class public final Lkl1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lil1/m;",
        "Lkl1/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J#\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00162\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lkl1/c;",
        "Lod1/g;",
        "Lil1/m;",
        "Lkl1/e;",
        "Lcom/whoop/home/domain/HomeApi;",
        "homeApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/home/domain/HomeApi;Ltr2/n;)V",
        "",
        "monthOffset",
        "Ljava/time/LocalDate;",
        "requestDate",
        "",
        "e",
        "(ILjava/time/LocalDate;)Ljava/lang/String;",
        "Lil1/m$a;",
        "action",
        "Lcom/whoop/home/domain/models/CalendarResponse;",
        "d",
        "(Lil1/m$a;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/home/domain/HomeApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lkl1/e;",
        "initialAcc",
        "home_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/home/domain/HomeApi;

.field private final b:Ltr2/n;

.field private final c:Lkl1/e;


# direct methods
.method public constructor <init>(Lcom/whoop/home/domain/HomeApi;Ltr2/n;)V
    .locals 4

    const-string v0, "homeApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkl1/c;->a:Lcom/whoop/home/domain/HomeApi;

    iput-object p2, p0, Lkl1/c;->b:Ltr2/n;

    new-instance p1, Lkl1/e;

    sget-object p2, Lkl1/d$a;->a:Lkl1/d$a;

    new-instance v0, Lkl1/a;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v3}, Lkl1/a;-><init>(Ljava/util/Map;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, p2, v0}, Lkl1/e;-><init>(Lkl1/d;Lkl1/a;)V

    iput-object p1, p0, Lkl1/c;->c:Lkl1/e;

    return-void
.end method

.method public static final synthetic c(Lkl1/c;Lil1/m$a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lkl1/c;->d(Lil1/m$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lil1/m$a;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lil1/m$a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/home/domain/models/CalendarResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lkl1/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lkl1/c$a;

    iget v1, v0, Lkl1/c$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkl1/c$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkl1/c$a;

    invoke-direct {v0, p0, p2}, Lkl1/c$a;-><init>(Lkl1/c;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lkl1/c$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkl1/c$a;->E:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lkl1/c$a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lkl1/c$a;->w:Ljava/lang/Object;

    check-cast p1, Lil1/m$a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v5, p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    invoke-virtual {p1}, Lil1/m$a;->a()I

    move-result p2

    invoke-virtual {p1}, Lil1/m$a;->c()Ljava/time/LocalDate;

    move-result-object v2

    invoke-direct {p0, p2, v2}, Lkl1/c;->e(ILjava/time/LocalDate;)Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, Lkl1/c;->a:Lcom/whoop/home/domain/HomeApi;

    invoke-virtual {p1}, Lil1/m$a;->b()Lfm1/g;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object v4, v0, Lkl1/c$a;->w:Ljava/lang/Object;

    iput-object v4, v0, Lkl1/c$a;->x:Ljava/lang/Object;

    iput v3, v0, Lkl1/c$a;->E:I

    invoke-interface {v2, p1, p2, v0}, Lcom/whoop/home/domain/HomeApi;->getHomeCalendar(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lcom/whoop/home/domain/models/CalendarResponse;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p2

    :goto_2
    iget-object v7, p0, Lkl1/c;->b:Ltr2/n;

    const/16 v9, 0xa

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lw02/b;->b(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;ILjava/lang/Object;)Ljava/lang/String;

    return-object v4
.end method

.method private final e(ILjava/time/LocalDate;)Ljava/lang/String;
    .locals 2

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/time/LocalDate;->minusMonths(J)Ljava/time/LocalDate;

    move-result-object p1

    const-string p2, "yyyy-MM-dd"

    invoke-static {p2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/time/LocalDate;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 3
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

    new-instance v0, Lkl1/c$b;

    invoke-direct {v0, p1}, Lkl1/c$b;-><init>(Lec3/l;)V

    new-instance p1, Lkl1/c$c;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p0}, Lkl1/c$c;-><init>(Lq83/d;Lkl1/c;)V

    invoke-static {v0, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    iget-object v0, p0, Lkl1/c;->c:Lkl1/e;

    new-instance v2, Lkl1/c$e;

    invoke-direct {v2, v1}, Lkl1/c$e;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
