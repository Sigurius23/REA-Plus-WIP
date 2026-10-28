.class public final Lye/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/a;


# static fields
.field public static final synthetic b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final c:J

.field public static final d:Ljava/util/List;

.field public static final e:Ljava/util/List;


# instance fields
.field public volatile synthetic a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 v0, 0x4

    sget-object v1, Lkotlin/time/DurationUnit;->MINUTES:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    sput-wide v0, Lye/b;->c:J

    const-string v0, "RequestExpired"

    const-string v1, "RequestInTheFuture"

    const-string v2, "RequestTimeTooSkewed"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lye/b;->d:Ljava/util/List;

    const-string v0, "SignatureDoesNotMatch"

    const-string v1, "AuthFailure"

    const-string v2, "InvalidSignatureException"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lye/b;->e:Ljava/util/List;

    const-class v0, Ljava/lang/Object;

    const-string v1, "a"

    const-class v2, Lye/b;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lye/b;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lye/b;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lsf/e;Lsf/l;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    const-class v0, Lye/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p2, v0}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object p2

    iget-object v0, p0, Lye/b;->a:Ljava/lang/Object;

    check-cast v0, Lkotlin/time/Duration;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkotlin/time/Duration;->unbox-impl()J

    new-instance v1, Lvv1/c;

    const/16 v2, 0x1a

    invoke-direct {v1, v0, v2}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2, v1}, Log/g;->k(Lgm/r;Lvv1/c;)V

    invoke-virtual {p1}, Lsf/e;->a()Ldg/a;

    move-result-object p2

    invoke-static {}, Luf/i;->c()Lgf/a;

    move-result-object v1

    invoke-virtual {p2, v1, v0}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p1}, Lsf/e;->a()Ldg/a;

    move-result-object p2

    invoke-static {}, Luf/i;->d()Lgf/a;

    move-result-object v0

    sget-object v1, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lsf/e;->b()Lvf/a;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Lsf/a;Lq83/d;)Ljava/lang/Object;
    .locals 7

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    const-class v0, Lye/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {p2, v0}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object p2

    invoke-virtual {p1}, Lsf/a;->c()Lwf/a;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Ls30/b;->o(Lwf/a;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    :try_start_0
    sget-object v1, Lug/b;->x:Lt9/p;

    invoke-static {v0}, Lt9/p;->q(Ljava/lang/String;)Lug/b;

    move-result-object v0
    :try_end_0
    .catch Laws/smithy/kotlin/runtime/time/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Lsf/a;->b()Lvf/a;

    move-result-object v1

    invoke-interface {v1}, Lvf/a;->getHeaders()Lmf/h;

    move-result-object v1

    const-string v2, "Date"

    invoke-interface {v1, v2}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lt9/p;->q(Ljava/lang/String;)Lug/b;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lsf/a;->b()Lvf/a;

    move-result-object v1

    invoke-interface {v1}, Lvf/a;->getHeaders()Lmf/h;

    move-result-object v1

    const-string v2, "x-amz-date"

    invoke-interface {v1, v2}, Lgf/t;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Lt9/p;->p(Ljava/lang/String;)Lug/b;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lsf/a;->a()Ldg/a;

    move-result-object v1

    invoke-static {}, Luf/i;->d()Lgf/a;

    move-result-object v2

    invoke-static {v1, v2}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lug/b;

    :goto_0
    invoke-virtual {p1}, Lsf/a;->d()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    instance-of v3, v2, Laws/smithy/kotlin/runtime/SdkBaseException;

    if-eqz v3, :cond_2

    check-cast v2, Laws/smithy/kotlin/runtime/SdkBaseException;

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_3

    invoke-virtual {p1}, Lsf/a;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {v2}, Laws/smithy/kotlin/runtime/SdkBaseException;->a()Lte/c;

    move-result-object v3

    invoke-virtual {v3}, Lte/c;->a()Lgf/c;

    move-result-object v3

    sget-object v4, Lte/e;->e:Lgf/a;

    invoke-static {}, Ls2/d;->n()Lgf/a;

    move-result-object v4

    invoke-virtual {v3, v4}, Lgf/c;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_5

    sget-object v4, Lye/b;->d:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    sget-object v4, Lye/b;->e:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v1, v0}, Lug/c;->c(Lug/b;Lug/b;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lkotlin/time/Duration;->getAbsoluteValue-UwyO8pc(J)J

    move-result-wide v3

    sget-wide v5, Lye/b;->c:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/time/Duration;->compareTo-LRDsOJo(JJ)I

    move-result v3

    if-ltz v3, :cond_5

    :cond_4
    invoke-static {v1, v0}, Lug/c;->c(Lug/b;Lug/b;)J

    move-result-wide v3

    new-instance v5, Llf0/r1;

    invoke-direct {v5, v1, v3, v4, v0}, Llf0/r1;-><init>(Lug/b;JLug/b;)V

    invoke-static {p2, v5}, Log/g;->l(Log/g;Lc93/a;)V

    sget-object p2, Lye/b;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v3, v4}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v0

    invoke-virtual {p2, p0, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lsf/a;->a()Ldg/a;

    move-result-object p1

    invoke-static {}, Luf/i;->c()Lgf/a;

    move-result-object p2

    invoke-static {v3, v4}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    invoke-virtual {v2}, Laws/smithy/kotlin/runtime/SdkBaseException;->a()Lte/c;

    move-result-object p1

    invoke-virtual {p1}, Lte/c;->a()Lgf/c;

    move-result-object p1

    sget-object p2, Lte/c;->b:Lgf/a;

    invoke-static {}, Ls2/a;->x()Lgf/a;

    move-result-object p2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-virtual {p1}, Lsf/a;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception v1

    new-instance v2, Lyc2/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lyc2/a;-><init>(I)V

    invoke-virtual {p2, v1, v2}, Lgm/r;->u(Ljava/lang/Throwable;Lc93/a;)V

    new-instance v1, Lar0/a;

    const/16 v2, 0x15

    invoke-direct {v1, v0, v2}, Lar0/a;-><init>(Ljava/lang/String;I)V

    invoke-static {p2, v1}, Log/g;->l(Log/g;Lc93/a;)V

    invoke-virtual {p1}, Lsf/a;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance v0, Lyc2/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lyc2/a;-><init>(I)V

    invoke-static {p2, v0}, Log/g;->m(Log/g;Lc93/a;)V

    invoke-virtual {p1}, Lsf/a;->d()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
