.class final Lc51/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc51/c;->C(Lc51/s;Lc51/p;FLkotlin/jvm/functions/Function1;Lc51/v;Landroidx/compose/runtime/Composer;II)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.amoeba.presentation.AmoebaAgeTextKt$AnimateOverTimeEffect$1$1"
    f = "AmoebaAgeText.kt"
    l = {
        0x99
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lc51/p;

.field final synthetic F:F

.field final synthetic G:Lc51/v;

.field final synthetic H:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lc51/s;


# direct methods
.method public constructor <init>(Lc51/s;Lc51/p;FLc51/v;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc51/s;",
            "Lc51/p;",
            "F",
            "Lc51/v;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lc51/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lc51/c$b;->z:Lc51/s;

    iput-object p2, p0, Lc51/c$b;->E:Lc51/p;

    iput p3, p0, Lc51/c$b;->F:F

    iput-object p4, p0, Lc51/c$b;->G:Lc51/v;

    iput-object p5, p0, Lc51/c$b;->H:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/c0;FLkotlin/jvm/functions/Function1;J)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lc51/c$b;->h(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/c0;FLkotlin/jvm/functions/Function1;J)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/c0;FLkotlin/jvm/functions/Function1;J)Ll83/a0;
    .locals 4

    iget-wide v0, p0, Lkotlin/jvm/internal/f0;->w:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iput-wide p4, p0, Lkotlin/jvm/internal/f0;->w:J

    :cond_0
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    iget-wide v0, p0, Lkotlin/jvm/internal/f0;->w:J

    sub-long/2addr p4, v0

    sget-object p0, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p4, p5, p0}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide p4

    sget-object p0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p4, p5, p0}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide p4

    iput-wide p4, p1, Lkotlin/jvm/internal/c0;->w:D

    float-to-double p0, p2

    div-double/2addr p4, p0

    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-interface {p3, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lc51/c$b;

    iget-object v1, p0, Lc51/c$b;->z:Lc51/s;

    iget-object v2, p0, Lc51/c$b;->E:Lc51/p;

    iget v3, p0, Lc51/c$b;->F:F

    iget-object v4, p0, Lc51/c$b;->G:Lc51/v;

    iget-object v5, p0, Lc51/c$b;->H:Lkotlin/jvm/functions/Function1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lc51/c$b;-><init>(Lc51/s;Lc51/p;FLc51/v;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lc51/c$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lc51/c$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lc51/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lc51/c$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lc51/c$b;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lc51/c$b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/c0;

    iget-object v3, p0, Lc51/c$b;->w:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/f0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lc51/c$b;->z:Lc51/s;

    invoke-virtual {p1}, Lc51/s;->p()Lc51/r;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lc51/r;->d()Lc51/p;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, Lc51/c$b;->E:Lc51/p;

    if-ne p1, v1, :cond_4

    new-instance p1, Lkotlin/jvm/internal/f0;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const-wide/16 v3, -0x1

    iput-wide v3, p1, Lkotlin/jvm/internal/f0;->w:J

    new-instance v1, Lkotlin/jvm/internal/c0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    iput-wide v3, v1, Lkotlin/jvm/internal/c0;->w:D

    move-object v3, p1

    :cond_3
    :goto_1
    iget-wide v4, v1, Lkotlin/jvm/internal/c0;->w:D

    iget p1, p0, Lc51/c$b;->F:F

    float-to-double v6, p1

    cmpg-double v4, v4, v6

    if-gez v4, :cond_4

    iget-object v4, p0, Lc51/c$b;->G:Lc51/v;

    iget-object v5, p0, Lc51/c$b;->H:Lkotlin/jvm/functions/Function1;

    new-instance v6, Lc51/d;

    invoke-direct {v6, v3, v1, p1, v5}, Lc51/d;-><init>(Lkotlin/jvm/internal/f0;Lkotlin/jvm/internal/c0;FLkotlin/jvm/functions/Function1;)V

    iput-object v3, p0, Lc51/c$b;->w:Ljava/lang/Object;

    iput-object v1, p0, Lc51/c$b;->x:Ljava/lang/Object;

    iput v2, p0, Lc51/c$b;->y:I

    invoke-interface {v4, v6, p0}, Lc51/v;->a(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
