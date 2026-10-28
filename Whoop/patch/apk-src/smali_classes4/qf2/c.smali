.class public final Lqf2/c;
.super Lhj0/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqf2/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0010\u0008\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJT\u0010\u0013\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\n2<\u0010\u0012\u001a8\u0008\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000bH\u0086@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R&\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000c\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R.\u0010\u001f\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u000c8\u0006@BX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u0012\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006!"
    }
    d2 = {
        "Lqf2/c;",
        "Lhj0/n;",
        "Lrr2/c;",
        "crashReporter",
        "Lin2/d;",
        "dispatcherFactory",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lrr2/c;Lin2/d;Ltr2/n;)V",
        "T",
        "Lkotlin/Function3;",
        "Lqf2/d;",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "Lcom/whoop/smart/alarm/data/repository/SetLwtTo;",
        "Lq83/d;",
        "",
        "block",
        "g",
        "(Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lkotlin/jvm/functions/Function1;",
        "mutator",
        "value",
        "b",
        "Lqf2/d;",
        "getLwtState",
        "()Lqf2/d;",
        "getLwtState$annotations",
        "()V",
        "lwtState",
        "c",
        "smart-alarm_release"
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
.field public static final c:Lqf2/c$a;

.field public static final d:I

.field private static final e:Lmc3/a;


# instance fields
.field private final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private b:Lqf2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqf2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqf2/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lqf2/c;->c:Lqf2/c$a;

    const/16 v0, 0x8

    sput v0, Lqf2/c;->d:I

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    sput-object v0, Lqf2/c;->e:Lmc3/a;

    return-void
.end method

.method public constructor <init>(Lrr2/c;Lin2/d;Ltr2/n;)V
    .locals 1

    const-string v0, "crashReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p1, p2}, Lhj0/n;-><init>(Ltr2/n;Lrr2/c;Lin2/d;)V

    new-instance p1, La6/i;

    const/16 p2, 0x1d

    invoke-direct {p1, p0, p2}, La6/i;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lqf2/c;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static synthetic e(Lqf2/c;Lqf2/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lqf2/c;->f(Lqf2/c;Lqf2/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lqf2/c;Lqf2/d;)Ll83/a0;
    .locals 0

    iput-object p1, p0, Lqf2/c;->b:Lqf2/d;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final g(Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function3;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lqf2/c$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lqf2/c$b;

    iget v1, v0, Lqf2/c$b;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lqf2/c$b;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lqf2/c$b;

    invoke-direct {v0, p0, p2}, Lqf2/c$b;-><init>(Lqf2/c;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lqf2/c$b;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lqf2/c$b;->G:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lqf2/c$b;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lqf2/c$b;->w:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function3;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lqf2/c$b;->y:I

    iget-object v2, v0, Lqf2/c$b;->x:Ljava/lang/Object;

    check-cast v2, Lmc3/a;

    iget-object v5, v0, Lqf2/c$b;->w:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/functions/Function3;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v2

    move v2, p1

    move-object p1, v5

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lqf2/c;->e:Lmc3/a;

    iput-object p1, v0, Lqf2/c$b;->w:Ljava/lang/Object;

    iput-object p2, v0, Lqf2/c$b;->x:Ljava/lang/Object;

    iput v3, v0, Lqf2/c$b;->y:I

    iput v5, v0, Lqf2/c$b;->G:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_1
    :try_start_1
    iget-object v5, p0, Lqf2/c;->b:Lqf2/d;

    iget-object v7, p0, Lqf2/c;->a:Lkotlin/jvm/functions/Function1;

    iput-object v6, v0, Lqf2/c$b;->w:Ljava/lang/Object;

    iput-object p2, v0, Lqf2/c$b;->x:Ljava/lang/Object;

    iput v2, v0, Lqf2/c$b;->y:I

    iput v3, v0, Lqf2/c$b;->z:I

    iput v4, v0, Lqf2/c$b;->G:I

    invoke-interface {p1, v5, v7, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_3
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p2

    :catchall_1
    move-exception p1

    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_4
    invoke-interface {p1, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method
