.class public final Lwb0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JQ\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J3\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lwb0/b;",
        "",
        "<init>",
        "()V",
        "",
        "inputValue",
        "",
        "numericValue",
        "minValue",
        "maxValue",
        "initialValue",
        "",
        "isIncluded",
        "invalidFormatMessage",
        "outOfRangeMessage",
        "Lwb0/a;",
        "b",
        "(Ljava/lang/String;Ljava/lang/Double;DDLjava/lang/Double;ZLjava/lang/String;Ljava/lang/String;)Lwb0/a;",
        "",
        "Lwb0/c;",
        "categoricalOptions",
        "selectedCategoricalValue",
        "a",
        "(Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;",
        "advanced-labs_release"
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
.field public static final a:Lwb0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwb0/b;

    invoke-direct {v0}, Lwb0/b;-><init>()V

    sput-object v0, Lwb0/b;->a:Lwb0/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lwb0/c;",
            ">;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            ")",
            "Ljava/lang/Double;"
        }
    .end annotation

    if-eqz p1, :cond_0

    return-object p2

    :cond_0
    return-object p3
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Double;DDLjava/lang/Double;ZLjava/lang/String;Ljava/lang/String;)Lwb0/a;
    .locals 7

    move-object/from16 v0, p9

    move-object/from16 v1, p10

    const-string v2, "inputValue"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "invalidFormatMessage"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "outOfRangeMessage"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_2

    :cond_1
    :goto_0
    move v2, v4

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    cmpg-double v2, v5, p3

    if-ltz v2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    cmpl-double v2, v5, p5

    if-lez v2, :cond_3

    goto :goto_0

    :cond_3
    move v2, v3

    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_4

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    goto :goto_3

    :cond_4
    if-nez p2, :cond_5

    new-instance p3, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {p3, v0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    cmpg-double p3, v5, p3

    if-ltz p3, :cond_7

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p3

    cmpl-double p3, p3, p5

    if-lez p3, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    goto :goto_3

    :cond_7
    :goto_2
    new-instance p3, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {p3, v1}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    :goto_3
    if-nez p7, :cond_9

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    if-lez p4, :cond_8

    goto :goto_4

    :cond_8
    move v3, v4

    goto :goto_4

    :cond_9
    invoke-virtual {p7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p4

    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_a

    if-nez p8, :cond_8

    :cond_a
    :goto_4
    new-instance p4, Lwb0/a;

    move-object p5, p2

    move-object p7, p3

    move-object p3, p4

    move p6, v2

    move p8, v3

    move-object p4, p1

    invoke-direct/range {p3 .. p8}, Lwb0/a;-><init>(Ljava/lang/String;Ljava/lang/Double;ZLcom/whoop/design/util/TextResource;Z)V

    return-object p3
.end method
