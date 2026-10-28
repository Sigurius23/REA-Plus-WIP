.class public final Lkb1/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkb1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J3\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00010\n\"\u0004\u0008\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\t\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lkb1/e$a;",
        "",
        "<init>",
        "()V",
        "DateModel",
        "Lkb1/a;",
        "dateInfo",
        "",
        "day",
        "model",
        "Lkb1/e;",
        "a",
        "(Lkb1/a;ILjava/lang/Object;)Lkb1/e;",
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
    invoke-direct {p0}, Lkb1/e$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkb1/a;ILjava/lang/Object;)Lkb1/e;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<DateModel:",
            "Ljava/lang/Object;",
            ">(",
            "Lkb1/a;",
            "ITDateModel;)",
            "Lkb1/e<",
            "TDateModel;>;"
        }
    .end annotation

    const-string v0, "dateInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lkb1/a;->b(I)Ljava/time/LocalDate;

    move-result-object v8

    invoke-virtual {p1}, Lkb1/a;->d()Lh91/a;

    move-result-object v0

    invoke-virtual {v0}, Lh91/a;->b()Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Lkb1/b;->a(Ljava/util/Locale;)Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Ljava/text/NumberFormat;->getNumberInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v0

    invoke-virtual {p1, v8}, Lkb1/a;->a(Ljava/time/LocalDate;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkb1/a;->d()Lh91/a;

    move-result-object v1

    invoke-virtual {v1}, Lh91/a;->a()Ljava/time/LocalDate;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p1}, Lkb1/a;->d()Lh91/a;

    move-result-object v1

    invoke-virtual {v1}, Lh91/a;->d()Ljava/time/LocalDate;

    move-result-object v1

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {p1}, Lkb1/a;->d()Lh91/a;

    move-result-object p1

    invoke-virtual {p1}, Lh91/a;->a()Ljava/time/LocalDate;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/time/LocalDate;->compareTo(Ljava/time/chrono/ChronoLocalDate;)I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    :goto_0
    move v5, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    int-to-long v6, p2

    invoke-virtual {v0, v6, v7}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v7

    const-string p1, "format(...)"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkb1/e;

    move v6, p2

    move-object v9, p3

    invoke-direct/range {v1 .. v9}, Lkb1/e;-><init>(Ljava/lang/String;ZZZILjava/lang/String;Ljava/time/LocalDate;Ljava/lang/Object;)V

    return-object v1
.end method
