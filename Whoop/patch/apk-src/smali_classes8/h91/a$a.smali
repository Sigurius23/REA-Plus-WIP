.class public final Lh91/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh91/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JC\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lh91/a$a;",
        "",
        "<init>",
        "()V",
        "Ljava/util/Locale;",
        "locale",
        "Ljava/time/LocalDate;",
        "currentDate",
        "selectedDate",
        "monthDate",
        "",
        "Lk71/d;",
        "legendList",
        "Lh91/a;",
        "a",
        "(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;)Lh91/a;",
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
    invoke-direct {p0}, Lh91/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;)Lh91/a;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Locale;",
            "Ljava/time/LocalDate;",
            "Ljava/time/LocalDate;",
            "Ljava/time/LocalDate;",
            "Ljava/util/List<",
            "Lk71/d;",
            ">;)",
            "Lh91/a;"
        }
    .end annotation

    const-string v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedDate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "monthDate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legendList"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Lh91/c;->a(Ljava/time/LocalDate;)Ljava/time/LocalDate;

    move-result-object v5

    new-instance v1, Lh91/a;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lh91/a;-><init>(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;)V

    return-object v1
.end method
