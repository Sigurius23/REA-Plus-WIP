.class public final Lzu0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lus0/a;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzu0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001HB?\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001d\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008#\u0010\u001dJ \u0010%\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u001fH\u0082@\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u001a\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00150:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R \u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020?0>8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0016\u0010F\u001a\u0004\u0018\u00010C8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010E\u00a8\u0006I"
    }
    d2 = {
        "Lzu0/a;",
        "Lus0/a;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lbc3/c0;",
        "coroutineScope",
        "La6/g;",
        "Lf6/f;",
        "dataStorePreferences",
        "Ljava/time/Clock;",
        "clock",
        "Liy1/c;",
        "metricWriter",
        "Lci2/b;",
        "whoopStrapProvider",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lbc3/c0;La6/g;Ljava/time/Clock;Liy1/c;Lci2/b;Ltr2/n;)V",
        "Ll83/a0;",
        "t",
        "()V",
        "Lus0/b;",
        "event",
        "o",
        "(Lus0/b;Lq83/d;)Ljava/lang/Object;",
        "",
        "v",
        "(Lus0/b;)Z",
        "l",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lf6/d;",
        "",
        "j",
        "(Lus0/b;)Lf6/d;",
        "r",
        "u",
        "count",
        "p",
        "(Lus0/b;ILq83/d;)Ljava/lang/Object;",
        "q",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "m",
        "(Lus0/b;)V",
        "w",
        "Lbc3/c0;",
        "x",
        "La6/g;",
        "y",
        "Ljava/time/Clock;",
        "z",
        "Liy1/c;",
        "E",
        "Lci2/b;",
        "F",
        "Ltr2/n;",
        "Lec3/o1;",
        "G",
        "Lec3/o1;",
        "logFlow",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "",
        "H",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "lastReportedMinute",
        "Lcom/whoop/domain/model/WhoopStrapInfo;",
        "n",
        "()Lcom/whoop/domain/model/WhoopStrapInfo;",
        "strapInfo",
        "I",
        "a",
        "connectivity-analytics_release"
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
.field public static final I:Lzu0/a$a;

.field private static final J:Lf6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/d;"
        }
    .end annotation
.end field


# instance fields
.field private final E:Lci2/b;

.field private final F:Ltr2/n;

.field private final G:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final H:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lus0/b;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final w:Lbc3/c0;

.field private final x:La6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La6/g;"
        }
    .end annotation
.end field

.field private final y:Ljava/time/Clock;

.field private final z:Liy1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzu0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzu0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzu0/a;->I:Lzu0/a$a;

    const-string v0, "last-generated-report-date"

    invoke-static {v0}, Lge3/g;->I(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    sput-object v0, Lzu0/a;->J:Lf6/d;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;La6/g;Ljava/time/Clock;Liy1/c;Lci2/b;Ltr2/n;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "La6/g;",
            "Ljava/time/Clock;",
            "Liy1/c;",
            "Lci2/b;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const-string v0, "coroutineScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataStorePreferences"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzu0/a;->w:Lbc3/c0;

    iput-object p2, p0, Lzu0/a;->x:La6/g;

    iput-object p3, p0, Lzu0/a;->y:Ljava/time/Clock;

    iput-object p4, p0, Lzu0/a;->z:Liy1/c;

    iput-object p5, p0, Lzu0/a;->E:Lci2/b;

    iput-object p6, p0, Lzu0/a;->F:Ltr2/n;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const/4 p3, 0x0

    invoke-static {p3, p3, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lzu0/a;->G:Lec3/o1;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lzu0/a;->H:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static final synthetic a(Lzu0/a;Lus0/b;)Lf6/d;
    .locals 0

    invoke-direct {p0, p1}, Lzu0/a;->j(Lus0/b;)Lf6/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lzu0/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lzu0/a;->l(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c()Lf6/d;
    .locals 1

    sget-object v0, Lzu0/a;->J:Lf6/d;

    return-object v0
.end method

.method public static final synthetic d(Lzu0/a;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Lzu0/a;->G:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic e(Lzu0/a;Lus0/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzu0/a;->o(Lus0/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lzu0/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lzu0/a;->r(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lzu0/a;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lzu0/a;->u(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final j(Lus0/b;)Lf6/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lus0/b;",
            ")",
            "Lf6/d;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "background-usage-event-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lge3/g;->C(Ljava/lang/String;)Lf6/d;

    move-result-object p1

    return-object p1
.end method

.method private final l(Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lzu0/a$b;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lzu0/a$b;

    iget v3, v2, Lzu0/a$b;->M:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lzu0/a$b;->M:I

    goto :goto_0

    :cond_0
    new-instance v2, Lzu0/a$b;

    invoke-direct {v2, v0, v1}, Lzu0/a$b;-><init>(Lzu0/a;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lzu0/a$b;->K:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lzu0/a$b;->M:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    if-eqz v4, :cond_6

    if-eq v4, v10, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v2, v2, Lzu0/a$b;->w:Ljava/lang/Object;

    check-cast v2, Lf6/f;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lzu0/a$b;->w:Ljava/lang/Object;

    check-cast v4, Lf6/f;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    iget v4, v2, Lzu0/a$b;->J:I

    iget v9, v2, Lzu0/a$b;->H:I

    iget v13, v2, Lzu0/a$b;->G:I

    iget v14, v2, Lzu0/a$b;->F:I

    iget-object v15, v2, Lzu0/a$b;->E:Ljava/lang/Object;

    check-cast v15, Lf6/d;

    iget-object v15, v2, Lzu0/a$b;->z:Ljava/lang/Object;

    check-cast v15, Lus0/b;

    iget-object v6, v2, Lzu0/a$b;->y:Ljava/lang/Object;

    check-cast v6, Lus0/b;

    iget-object v6, v2, Lzu0/a$b;->x:Ljava/lang/Object;

    check-cast v6, [Lus0/b;

    iget-object v7, v2, Lzu0/a$b;->w:Ljava/lang/Object;

    check-cast v7, Lf6/f;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v10, v2, Lzu0/a$b;->M:I

    invoke-direct {v0, v2}, Lzu0/a;->r(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    goto/16 :goto_7

    :cond_7
    :goto_1
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_8

    return-object v5

    :cond_8
    iget-object v1, v0, Lzu0/a;->x:La6/g;

    invoke-interface {v1}, La6/g;->getData()Lec3/l;

    move-result-object v1

    iput v9, v2, Lzu0/a$b;->M:I

    invoke-static {v1, v2}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto/16 :goto_7

    :cond_9
    :goto_2
    check-cast v1, Lf6/f;

    invoke-static {}, Lus0/b;->values()[Lus0/b;

    move-result-object v4

    array-length v6, v4

    move-object v7, v1

    move v9, v6

    move v13, v11

    move v14, v13

    move-object v6, v4

    :goto_3
    if-ge v13, v9, :cond_c

    aget-object v15, v6, v13

    invoke-direct {v0, v15}, Lzu0/a;->j(Lus0/b;)Lf6/d;

    move-result-object v1

    invoke-virtual {v7, v1}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move v4, v1

    goto :goto_4

    :cond_a
    move v4, v11

    :goto_4
    iput-object v7, v2, Lzu0/a$b;->w:Ljava/lang/Object;

    iput-object v6, v2, Lzu0/a$b;->x:Ljava/lang/Object;

    iput-object v12, v2, Lzu0/a$b;->y:Ljava/lang/Object;

    iput-object v15, v2, Lzu0/a$b;->z:Ljava/lang/Object;

    iput-object v12, v2, Lzu0/a$b;->E:Ljava/lang/Object;

    iput v14, v2, Lzu0/a$b;->F:I

    iput v13, v2, Lzu0/a$b;->G:I

    iput v9, v2, Lzu0/a$b;->H:I

    iput v11, v2, Lzu0/a$b;->I:I

    iput v4, v2, Lzu0/a$b;->J:I

    iput v8, v2, Lzu0/a$b;->M:I

    invoke-direct {v0, v15, v4, v2}, Lzu0/a;->p(Lus0/b;ILq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    goto :goto_7

    :cond_b
    :goto_5
    iget-object v1, v0, Lzu0/a;->F:Ltr2/n;

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    const-string v8, "Reported event: "

    move/from16 v16, v10

    const-string v10, " with count: "

    invoke-static {v4, v8, v15, v10}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-array v8, v11, [Lqr2/a$a;

    invoke-interface {v1, v4, v8}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    add-int/lit8 v13, v13, 0x1

    move/from16 v10, v16

    const/4 v8, 0x3

    goto :goto_3

    :cond_c
    iput-object v12, v2, Lzu0/a$b;->w:Ljava/lang/Object;

    iput-object v12, v2, Lzu0/a$b;->x:Ljava/lang/Object;

    iput-object v12, v2, Lzu0/a$b;->y:Ljava/lang/Object;

    iput-object v12, v2, Lzu0/a$b;->z:Ljava/lang/Object;

    iput-object v12, v2, Lzu0/a$b;->E:Ljava/lang/Object;

    const/4 v1, 0x4

    iput v1, v2, Lzu0/a$b;->M:I

    invoke-direct {v0, v2}, Lzu0/a;->q(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_d

    goto :goto_7

    :cond_d
    :goto_6
    iput-object v12, v2, Lzu0/a$b;->w:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, v2, Lzu0/a$b;->M:I

    invoke-direct {v0, v2}, Lzu0/a;->u(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_e

    :goto_7
    return-object v3

    :cond_e
    :goto_8
    iget-object v1, v0, Lzu0/a;->F:Ltr2/n;

    const-string v2, "Generated daily background usage report and reset counts."

    new-array v3, v11, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v5
.end method

.method private final n()Lcom/whoop/domain/model/WhoopStrapInfo;
    .locals 1

    iget-object v0, p0, Lzu0/a;->E:Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final o(Lus0/b;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lus0/b;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lzu0/a$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lzu0/a$d;

    iget v1, v0, Lzu0/a$d;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzu0/a$d;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzu0/a$d;

    invoke-direct {v0, p0, p2}, Lzu0/a$d;-><init>(Lzu0/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lzu0/a$d;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lzu0/a$d;->G:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lzu0/a$d;->x:Ljava/lang/Object;

    check-cast p1, Lf6/d;

    iget-object p1, v0, Lzu0/a$d;->w:Ljava/lang/Object;

    check-cast p1, Lus0/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lzu0/a$d;->x:Ljava/lang/Object;

    check-cast p1, Lf6/d;

    iget-object p1, v0, Lzu0/a$d;->w:Ljava/lang/Object;

    check-cast p1, Lus0/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lzu0/a;->v(Lus0/b;)Z

    move-result p2

    if-eqz p2, :cond_4

    return-object v3

    :cond_4
    invoke-direct {p0, p1}, Lzu0/a;->j(Lus0/b;)Lf6/d;

    move-result-object p2

    iget-object v2, p0, Lzu0/a;->x:La6/g;

    new-instance v7, Lzu0/a$e;

    invoke-direct {v7, p2, v6}, Lzu0/a$e;-><init>(Lf6/d;Lq83/d;)V

    iput-object p1, v0, Lzu0/a$d;->w:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$d;->x:Ljava/lang/Object;

    iput v5, v0, Lzu0/a$d;->G:I

    invoke-static {v2, v7, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object p2, p0, Lzu0/a;->y:Ljava/time/Clock;

    invoke-static {p2}, Ljava/time/Instant;->now(Ljava/time/Clock;)Ljava/time/Instant;

    move-result-object p2

    invoke-virtual {p2}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v7

    const-wide/32 v9, 0xea60

    div-long v9, v7, v9

    iget-object p2, p0, Lzu0/a;->H:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v2, Ljava/lang/Long;

    invoke-direct {v2, v9, v10}, Ljava/lang/Long;-><init>(J)V

    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$d;->w:Ljava/lang/Object;

    iput-object v6, v0, Lzu0/a$d;->x:Ljava/lang/Object;

    iput-wide v7, v0, Lzu0/a$d;->y:J

    iput-wide v9, v0, Lzu0/a$d;->z:J

    iput v4, v0, Lzu0/a$d;->G:I

    invoke-direct {p0, v0}, Lzu0/a;->l(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    return-object v3
.end method

.method private final p(Lus0/b;ILq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lus0/b;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lzu0/a;->n()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    const-string v1, "unknown"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getWhoopDeviceType()Lst0/v;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lst0/v;->getCodeName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "toLowerCase(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-direct {p0}, Lzu0/a;->n()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/domain/model/WhoopStrapInfo;->getMaximVersion()Loh2/b;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v2}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :cond_2
    :goto_1
    iget-object v2, p0, Lzu0/a;->z:Liy1/c;

    new-instance v3, Ljy1/a;

    int-to-double v4, p2

    new-instance v6, Ljava/lang/Double;

    invoke-direct {v6, v4, v5}, Ljava/lang/Double;-><init>(D)V

    invoke-virtual {p1}, Lus0/b;->getAnalyticsName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "event:"

    invoke-static {p2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "strap_device:"

    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "firmware_version:"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {p1, p2, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    sget-object v8, Lcom/whoop/metrics/domain/models/MetricPostType;->DISTRIBUTION:Lcom/whoop/metrics/domain/models/MetricPostType;

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v4, 0x0

    const-string v5, "background_minutes_usage_over_24_hours_distribution"

    invoke-direct/range {v3 .. v10}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v3, p3}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final q(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lzu0/a;->x:La6/g;

    new-instance v1, Lzu0/a$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lzu0/a$f;-><init>(Lzu0/a;Lq83/d;)V

    invoke-static {v0, v1, p1}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final r(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lzu0/a$g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lzu0/a$g;

    iget v1, v0, Lzu0/a$g;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzu0/a$g;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzu0/a$g;

    invoke-direct {v0, p0, p1}, Lzu0/a$g;-><init>(Lzu0/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lzu0/a$g;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lzu0/a$g;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lzu0/a$g;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Long;

    iget-object v0, v0, Lzu0/a$g;->w:Ljava/lang/Object;

    check-cast v0, Lf6/f;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzu0/a;->x:La6/g;

    invoke-interface {p1}, La6/g;->getData()Lec3/l;

    move-result-object p1

    iput v4, v0, Lzu0/a$g;->E:I

    invoke-static {p1, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lf6/f;

    sget-object v2, Lzu0/a;->J:Lf6/d;

    invoke-virtual {p1, v2}, Lf6/f;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-nez p1, :cond_6

    const/4 p1, 0x0

    iput-object p1, v0, Lzu0/a$g;->w:Ljava/lang/Object;

    iput-object p1, v0, Lzu0/a$g;->x:Ljava/lang/Object;

    iput v3, v0, Lzu0/a$g;->E:I

    invoke-direct {p0, v0}, Lzu0/a;->u(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_6
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object p1

    sget-object v0, Ljava/time/ZoneOffset;->UTC:Ljava/time/ZoneOffset;

    invoke-virtual {p1, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object p1

    iget-object v1, p0, Lzu0/a;->y:Ljava/time/Clock;

    invoke-static {v1}, Ljava/time/Instant;->now(Ljava/time/Clock;)Ljava/time/Instant;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/time/LocalDate;->isAfter(Ljava/time/chrono/ChronoLocalDate;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final t()V
    .locals 2

    iget-object v0, p0, Lzu0/a;->G:Lec3/o1;

    new-instance v1, Lzu0/a$h;

    invoke-direct {v1, v0, p0}, Lzu0/a$h;-><init>(Lec3/l;Lzu0/a;)V

    iget-object v0, p0, Lzu0/a;->w:Lbc3/c0;

    invoke-static {v1, v0}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method private final u(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lzu0/a$i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lzu0/a$i;

    iget v1, v0, Lzu0/a$i;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzu0/a$i;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzu0/a$i;

    invoke-direct {v0, p0, p1}, Lzu0/a$i;-><init>(Lzu0/a;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lzu0/a$i;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lzu0/a$i;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide v0, v0, Lzu0/a$i;->w:J

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lzu0/a;->y:Ljava/time/Clock;

    invoke-static {p1}, Ljava/time/Instant;->now(Ljava/time/Clock;)Ljava/time/Instant;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v4

    iget-object p1, p0, Lzu0/a;->x:La6/g;

    new-instance v2, Lzu0/a$j;

    const/4 v6, 0x0

    invoke-direct {v2, v4, v5, v6}, Lzu0/a$j;-><init>(JLq83/d;)V

    iput-wide v4, v0, Lzu0/a$i;->w:J

    iput v3, v0, Lzu0/a$i;->z:I

    invoke-static {p1, v2, v0}, Lhg3/i;->G(La6/g;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-wide v0, v4

    :goto_1
    iget-object p1, p0, Lzu0/a;->F:Ltr2/n;

    const-string v2, "Updated last generated report date to: "

    invoke-static {v0, v1, v2}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final v(Lus0/b;)Z
    .locals 5

    iget-object v0, p0, Lzu0/a;->y:Ljava/time/Clock;

    invoke-static {v0}, Ljava/time/Instant;->now(Ljava/time/Clock;)Ljava/time/Instant;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    iget-object v2, p0, Lzu0/a;->H:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long p1, v0, v3

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v2
.end method


# virtual methods
.method public m(Lus0/b;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzu0/a;->w:Lbc3/c0;

    new-instance v1, Lzu0/a$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lzu0/a$c;-><init>(Lzu0/a;Lus0/b;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lzu0/a;->t()V

    iget-object p1, p0, Lzu0/a;->F:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Started"

    invoke-interface {p1, v1, v0}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method
