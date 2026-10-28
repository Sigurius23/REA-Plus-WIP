.class final Lnu2/f$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu2/f;->b(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "",
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
    c = "com.whoop.weightlifting.feature.active.activeworkout.domain.SetTimeInteractor$interact$2$1"
    f = "SetTimeInteractor.kt"
    l = {
        0x24,
        0x25
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lorg/joda/time/DateTime;

.field w:I

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lnu2/f;


# direct methods
.method public constructor <init>(Lnu2/f;Lorg/joda/time/DateTime;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu2/f;",
            "Lorg/joda/time/DateTime;",
            "Lq83/d<",
            "-",
            "Lnu2/f$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnu2/f$c;->z:Lnu2/f;

    iput-object p2, p0, Lnu2/f$c;->E:Lorg/joda/time/DateTime;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Lnu2/f$c;

    iget-object v1, p0, Lnu2/f$c;->z:Lnu2/f;

    iget-object v2, p0, Lnu2/f$c;->E:Lorg/joda/time/DateTime;

    invoke-direct {v0, v1, v2, p2}, Lnu2/f$c;-><init>(Lnu2/f;Lorg/joda/time/DateTime;Lq83/d;)V

    iput-object p1, v0, Lnu2/f$c;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lnu2/f$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnu2/f$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnu2/f$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lnu2/f$c;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lnu2/f$c;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lnu2/f$c;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v2, p0, Lnu2/f$c;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->x(Lq83/j;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lnu2/f$c;->z:Lnu2/f;

    invoke-static {p1}, Lnu2/f;->a(Lnu2/f;)Lzr2/a;

    move-result-object p1

    invoke-interface {p1}, Lzr2/a;->b()J

    move-result-wide v5

    iget-object p1, p0, Lnu2/f$c;->E:Lorg/joda/time/DateTime;

    invoke-virtual {p1}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v7

    sub-long/2addr v5, v7

    const/16 p1, 0x3e8

    int-to-long v7, p1

    div-long/2addr v5, v7

    long-to-int v2, v5

    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, v2}, Ljava/lang/Integer;-><init>(I)V

    iput-object v0, p0, Lnu2/f$c;->y:Ljava/lang/Object;

    iput v2, p0, Lnu2/f$c;->w:I

    iput v4, p0, Lnu2/f$c;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object p1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v4, p1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v5

    iput-object v0, p0, Lnu2/f$c;->y:Ljava/lang/Object;

    iput v2, p0, Lnu2/f$c;->w:I

    iput v3, p0, Lnu2/f$c;->x:I

    invoke-static {v5, v6, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    :goto_2
    return-object v1

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
