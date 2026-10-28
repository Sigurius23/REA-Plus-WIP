.class public final Lpp0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpp0/a$a;,
        Lpp0/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\u000f\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u000f\u001a\u00020\n*\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lpp0/a;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Ljs0/c;",
        "configurationRepository",
        "<init>",
        "(Lzr2/a;Ljs0/c;)V",
        "Lorg/joda/time/LocalDateTime;",
        "endTime",
        "",
        "b",
        "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;)Z",
        "",
        "maxDurationInHours",
        "a",
        "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;I)Z",
        "Lsp0/a;",
        "activityType",
        "c",
        "(Lsp0/a;)I",
        "startTime",
        "Lsp0/e;",
        "d",
        "(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lsp0/a;)Lsp0/e;",
        "Lzr2/a;",
        "getDateAndTimeProvider",
        "()Lzr2/a;",
        "Ljs0/c;",
        "getConfigurationRepository",
        "()Ljs0/c;",
        "add-activity_release"
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
.field private final a:Lzr2/a;

.field private final b:Ljs0/c;


# direct methods
.method public constructor <init>(Lzr2/a;Ljs0/c;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp0/a;->a:Lzr2/a;

    iput-object p2, p0, Lpp0/a;->b:Ljs0/c;

    return-void
.end method

.method private final a(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;I)Z
    .locals 4

    invoke-static {p2}, Lorg/joda/time/JodaTimeUtilKt;->millis(Lorg/joda/time/LocalDateTime;)J

    move-result-wide v0

    invoke-static {p1}, Lorg/joda/time/JodaTimeUtilKt;->millis(Lorg/joda/time/LocalDateTime;)J

    move-result-wide p1

    sub-long/2addr v0, p1

    int-to-long p1, p3

    const-wide/32 v2, 0x36ee80

    mul-long/2addr p1, v2

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final b(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;)Z
    .locals 4

    invoke-static {p1}, Lorg/joda/time/JodaTimeUtilKt;->millis(Lorg/joda/time/LocalDateTime;)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    invoke-static {p2}, Lorg/joda/time/JodaTimeUtilKt;->millis(Lorg/joda/time/LocalDateTime;)J

    move-result-wide p1

    div-long/2addr p1, v2

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final c(Lsp0/a;)I
    .locals 12

    sget-object v0, Lsp0/a;->SLEEP:Lsp0/a;

    const-string v1, "null cannot be cast to non-null type kotlin.Int"

    const-class v2, Ljava/lang/String;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v8, Ljava/lang/Integer;

    const/4 v9, 0x0

    if-ne p1, v0, :cond_9

    iget-object p1, p0, Lpp0/a;->b:Ljs0/c;

    sget-object v0, Lpp0/a$b;->a:Lpp0/a$b;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v0}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v11, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v11, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v11, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v9

    goto/16 :goto_0

    :cond_0
    invoke-virtual {v11, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    goto :goto_0

    :cond_1
    invoke-virtual {v11, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v9

    goto :goto_0

    :cond_2
    invoke-virtual {v11, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v9

    goto :goto_0

    :cond_3
    invoke-virtual {v11, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_6

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v9

    goto :goto_0

    :cond_4
    invoke-virtual {v11, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_0

    :cond_5
    move-object v9, v0

    :cond_6
    :goto_0
    if-nez v9, :cond_7

    goto :goto_1

    :cond_7
    move-object v0, v9

    :goto_1
    if-eqz v0, :cond_8

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_8
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    iget-object p1, p0, Lpp0/a;->b:Ljs0/c;

    sget-object v0, Lpp0/a$a;->a:Lpp0/a$a;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v0}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v11, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v11, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v11, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_10

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v9

    goto/16 :goto_2

    :cond_a
    invoke-virtual {v11, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_10

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    goto :goto_2

    :cond_b
    invoke-virtual {v11, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_10

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v9

    goto :goto_2

    :cond_c
    invoke-virtual {v11, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_10

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v9

    goto :goto_2

    :cond_d
    invoke-virtual {v11, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_10

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v9

    goto :goto_2

    :cond_e
    invoke-virtual {v11, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {p1, v10}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_2

    :cond_f
    move-object v9, v0

    :cond_10
    :goto_2
    if-nez v9, :cond_11

    goto :goto_3

    :cond_11
    move-object v0, v9

    :goto_3
    if-eqz v0, :cond_12

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_12
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final d(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Lsp0/a;)Lsp0/e;
    .locals 1

    const-string v0, "startTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTime"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpp0/a;->a:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->a()Lorg/joda/time/LocalDateTime;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/joda/time/base/AbstractPartial;->isAfter(Lorg/joda/time/ReadablePartial;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lpp0/a;->a:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->a()Lorg/joda/time/LocalDateTime;

    move-result-object v0

    invoke-virtual {p2, v0}, Lorg/joda/time/base/AbstractPartial;->isAfter(Lorg/joda/time/ReadablePartial;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1, p2}, Lorg/joda/time/base/AbstractPartial;->isAfter(Lorg/joda/time/ReadablePartial;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0, p1, p2}, Lpp0/a;->b(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    invoke-direct {p0, p3}, Lpp0/a;->c(Lsp0/a;)I

    move-result v0

    invoke-direct {p0, p1, p2, v0}, Lpp0/a;->a(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;I)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lsp0/e$a;

    invoke-direct {p0, p3}, Lpp0/a;->c(Lsp0/a;)I

    move-result p2

    invoke-direct {p1, p2}, Lsp0/e$a;-><init>(I)V

    return-object p1

    :cond_2
    sget-object p1, Lsp0/e$c;->a:Lsp0/e$c;

    return-object p1

    :cond_3
    :goto_0
    sget-object p1, Lsp0/e$d;->a:Lsp0/e$d;

    return-object p1

    :cond_4
    :goto_1
    sget-object p1, Lsp0/e$b;->a:Lsp0/e$b;

    return-object p1
.end method
