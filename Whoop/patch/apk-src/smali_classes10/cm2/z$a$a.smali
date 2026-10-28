.class final Lcm2/z$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcm2/z$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lcm2/z;

.field final synthetic x:Lbc3/c0;


# direct methods
.method public constructor <init>(Lcm2/z;Lbc3/c0;)V
    .locals 0

    iput-object p1, p0, Lcm2/z$a$a;->w:Lcm2/z;

    iput-object p2, p0, Lcm2/z$a$a;->x:Lbc3/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvl2/t;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvl2/t;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Lvl2/t$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcm2/z$a$a;->w:Lcm2/z;

    invoke-static {p1}, Lcm2/z;->p(Lcm2/z;)Lm83/m;

    move-result-object p1

    invoke-virtual {p1}, Lm83/m;->q()Ljava/lang/Object;

    return-object v0

    :cond_0
    instance-of p2, p1, Lvl2/t$c;

    if-eqz p2, :cond_7

    iget-object p2, p0, Lcm2/z$a$a;->w:Lcm2/z;

    invoke-static {p2}, Lcm2/z;->p(Lcm2/z;)Lm83/m;

    move-result-object p2

    invoke-virtual {p2}, Lm83/m;->q()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcm2/z$b;

    if-nez p2, :cond_1

    goto/16 :goto_1

    :cond_1
    invoke-virtual {p2}, Lcm2/z$b;->a()Lcm2/d;

    move-result-object v1

    invoke-virtual {p2}, Lcm2/z$b;->b()Lvl2/a;

    move-result-object v2

    invoke-virtual {p2}, Lcm2/z$b;->c()Ljava/lang/String;

    move-result-object p2

    sget-object v3, Lcm2/d;->NONE:Lcm2/d;

    if-ne v1, v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcm2/z$a$a;->w:Lcm2/z;

    check-cast p1, Lvl2/t$c;

    invoke-static {v3, p1, v2}, Lcm2/z;->r(Lcm2/z;Lvl2/t$c;Lvl2/a;)Lcom/whoop/trends/data/model/TimeSegmentDtoV3;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/trends/data/model/TimeSegmentDtoV3;->getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/DateSelectorModel;->getPrevDateTime()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    :try_start_0
    invoke-static {}, Lorg/joda/time/format/ISODateTimeFormat;->dateTimeParser()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v3

    invoke-virtual {v3}, Lorg/joda/time/format/DateTimeFormatter;->withZoneUTC()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v3

    invoke-virtual {v3, v2}, Lorg/joda/time/format/DateTimeFormatter;->parseDateTime(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lorg/joda/time/DateTime;->plusDays(I)Lorg/joda/time/DateTime;

    move-result-object v2

    const-string v3, "yyyy-MM-dd"

    invoke-virtual {v2, v3}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :goto_0
    instance-of v3, v2, Ll83/m;

    if-eqz v3, :cond_5

    const/4 v2, 0x0

    :cond_5
    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_6

    goto :goto_1

    :cond_6
    iget-object v3, p0, Lcm2/z$a$a;->w:Lcm2/z;

    invoke-static {v3, p2}, Lcm2/z;->q(Lcm2/z;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object v3, p0, Lcm2/z$a$a;->w:Lcm2/z;

    invoke-static {v3}, Lcm2/z;->g(Lcm2/z;)Ldc3/l;

    move-result-object v3

    new-instance v4, Lcm2/w$a;

    invoke-virtual {p1}, Lvl2/t$c;->h()Lor2/h0;

    move-result-object p1

    invoke-virtual {p1}, Lor2/h0;->getTrendName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, v1, v2, p2, p1}, Lcm2/w$a;-><init>(Lcm2/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_7
    sget-object p2, Lvl2/t$b;->a:Lvl2/t$b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    :goto_1
    return-object v0

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvl2/t;

    invoke-virtual {p0, p1, p2}, Lcm2/z$a$a;->b(Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
