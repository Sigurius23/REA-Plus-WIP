.class public final Lh91/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh91/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJw\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0016\"\u0004\u0008\u0001\u0010\n2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u000f0\u000e2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u000e\u0008\u0002\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000f2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lh91/b$a;",
        "",
        "<init>",
        "()V",
        "Ljava/time/LocalDate;",
        "selectedDate",
        "latestMonthDate",
        "",
        "c",
        "(Ljava/time/LocalDate;Ljava/time/LocalDate;)I",
        "DateModel",
        "Ljava/util/Locale;",
        "locale",
        "currentDate",
        "",
        "",
        "dateModelsByMonth",
        "",
        "isLoading",
        "Lk71/d;",
        "legendList",
        "futureOffset",
        "Lh91/b;",
        "a",
        "(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;ZLjava/util/List;I)Lh91/b;",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lh91/b$a;-><init>()V

    return-void
.end method

.method public static synthetic b(Lh91/b$a;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;ZLjava/util/List;IILjava/lang/Object;)Lh91/b;
    .locals 1

    and-int/lit8 p10, p9, 0x20

    const/4 v0, 0x0

    if-eqz p10, :cond_0

    move p6, v0

    :cond_0
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_1

    sget-object p7, Lm83/y;->w:Lm83/y;

    :cond_1
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_2

    move p8, v0

    :cond_2
    invoke-virtual/range {p0 .. p8}, Lh91/b$a;->a(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;ZLjava/util/List;I)Lh91/b;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/time/LocalDate;Ljava/time/LocalDate;)I
    .locals 2

    sget-object v0, Ljava/time/temporal/ChronoUnit;->MONTHS:Ljava/time/temporal/ChronoUnit;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/time/LocalDate;->withDayOfMonth(I)Ljava/time/LocalDate;

    move-result-object p1

    invoke-virtual {p2, v1}, Ljava/time/LocalDate;->withDayOfMonth(I)Ljava/time/LocalDate;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/time/temporal/ChronoUnit;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)J

    move-result-wide p1

    long-to-int p1, p1

    return p1
.end method


# virtual methods
.method public final a(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;ZLjava/util/List;I)Lh91/b;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<DateModel:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Locale;",
            "Ljava/time/LocalDate;",
            "Ljava/time/LocalDate;",
            "Ljava/time/LocalDate;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "+",
            "Ljava/util/List<",
            "+TDateModel;>;>;Z",
            "Ljava/util/List<",
            "Lk71/d;",
            ">;I)",
            "Lh91/b<",
            "TDateModel;>;"
        }
    .end annotation

    const-string v1, "locale"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "currentDate"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "selectedDate"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "latestMonthDate"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "dateModelsByMonth"

    move-object v5, p5

    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "legendList"

    move-object/from16 v8, p7

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh91/b;

    invoke-static {p4}, Lh91/c;->a(Ljava/time/LocalDate;)Ljava/time/LocalDate;

    move-result-object v4

    invoke-direct {p0, p3, p4}, Lh91/b$a;->c(Ljava/time/LocalDate;Ljava/time/LocalDate;)I

    move-result v6

    move-object v2, p2

    move-object v3, p3

    move/from16 v7, p6

    move/from16 v9, p8

    move-object v0, v1

    move-object v1, p1

    invoke-direct/range {v0 .. v9}, Lh91/b;-><init>(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;IZLjava/util/List;I)V

    return-object v0
.end method
