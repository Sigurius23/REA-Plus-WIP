.class public final Lkb1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001b\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lkb1/i;",
        "",
        "<init>",
        "()V",
        "Ljava/util/Locale;",
        "locale",
        "Ljava/time/DayOfWeek;",
        "b",
        "(Ljava/util/Locale;)Ljava/time/DayOfWeek;",
        "",
        "",
        "a",
        "(Ljava/util/Locale;)Ljava/util/List;",
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


# static fields
.field public static final a:Lkb1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkb1/i;

    invoke-direct {v0}, Lkb1/i;-><init>()V

    sput-object v0, Lkb1/i;->a:Lkb1/i;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Locale;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Locale;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lkb1/i;->b(Ljava/util/Locale;)Ljava/time/DayOfWeek;

    move-result-object v0

    new-instance v1, Li93/m;

    const-wide/16 v2, 0x6

    const-wide/16 v4, 0x0

    invoke-direct {v1, v4, v5, v2, v3}, Li93/m;-><init>(JJ)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Li93/k;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    move-object v3, v1

    check-cast v3, Li93/l;

    iget-boolean v4, v3, Li93/l;->y:Z

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Li93/l;->nextLong()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ljava/time/DayOfWeek;->plus(J)Ljava/time/DayOfWeek;

    move-result-object v3

    sget-object v4, Ljava/time/format/TextStyle;->SHORT:Ljava/time/format/TextStyle;

    invoke-virtual {v3, v4, p1}, Ljava/time/DayOfWeek;->getDisplayName(Ljava/time/format/TextStyle;Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "getDisplayName(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "toUpperCase(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public final b(Ljava/util/Locale;)Ljava/time/DayOfWeek;
    .locals 1

    const-string v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/time/temporal/WeekFields;->of(Ljava/util/Locale;)Ljava/time/temporal/WeekFields;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/temporal/WeekFields;->getFirstDayOfWeek()Ljava/time/DayOfWeek;

    move-result-object p1

    const-string v0, "getFirstDayOfWeek(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
