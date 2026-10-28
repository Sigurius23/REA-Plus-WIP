.class public final Lgl2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgl2/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJU\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000c\u001a\u00020\u00082\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00082\u0018\u0008\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J-\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008 \u0010\u001fJ\r\u0010!\u001a\u00020\u0012\u00a2\u0006\u0004\u0008!\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lgl2/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lsz0/v1;",
        "zoneValueType",
        "",
        "id",
        "h",
        "(Lsz0/v1;Ljava/lang/String;)Ljava/lang/String;",
        "eventName",
        "category",
        "action",
        "label",
        "",
        "otherProperties",
        "Ll83/a0;",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V",
        "a",
        "()V",
        "i",
        "j",
        "value",
        "",
        "outOfRange",
        "c",
        "(Lsz0/v1;Ljava/lang/String;Ljava/lang/String;Z)V",
        "g",
        "(Ljava/lang/String;)V",
        "b",
        "f",
        "Lfi0/a;",
        "training_release"
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
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgl2/a;->a:Lfi0/a;

    return-void
.end method

.method private final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lgl2/a;->a:Lfi0/a;

    move-object v4, p1

    move-object v1, p2

    move-object v2, p3

    move-object v3, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic e(Lgl2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move-object p5, v0

    :cond_3
    invoke-direct/range {p0 .. p5}, Lgl2/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final h(Lsz0/v1;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    sget-object v0, Lgl2/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-ne p1, v0, :cond_3

    sget-object p1, Ljl2/a;->ZONE_1:Ljl2/a;

    invoke-static {}, Ljl2/a;->values()[Ljl2/a;

    move-result-object v0

    array-length v3, v0

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v4, v0, v2

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v1, v4

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    move-object p1, v1

    :goto_2
    invoke-static {p1}, Lgl2/b;->a(Ljl2/a;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    sget-object p1, Ljl2/a;->ZONE_1:Ljl2/a;

    invoke-static {}, Ljl2/a;->values()[Ljl2/a;

    move-result-object v0

    array-length v3, v0

    :goto_3
    if-ge v2, v3, :cond_6

    aget-object v4, v0, v2

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move-object v1, v4

    goto :goto_4

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    if-nez v1, :cond_7

    goto :goto_5

    :cond_7
    move-object p1, v1

    :goto_5
    invoke-static {p1}, Lgl2/b;->b(Ljl2/a;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a()V
    .locals 8

    const/16 v6, 0x14

    const/4 v7, 0x0

    const-string v1, "Heart Rate Settings"

    const-string v2, "max_hr"

    const/4 v3, 0x0

    const-string v4, "error"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lgl2/a;->e(Lgl2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 9

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x12

    const/4 v8, 0x0

    const-string v2, "Heart Rate Settings"

    const/4 v3, 0x0

    const-string v4, "tapped_information_icon"

    const/4 v6, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-static/range {v1 .. v8}, Lgl2/a;->e(Lgl2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public final c(Lsz0/v1;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 7

    const-string v0, "zoneValueType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lgl2/a;->h(Lsz0/v1;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    new-instance p3, Ll83/k;

    const-string p4, "out_of_range"

    invoke-direct {p3, p4, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p1, p3}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const-string v2, "Heart Rate Settings"

    const-string v3, "hr_zones"

    const-string v4, "customize_zone"

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lgl2/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Lgl2/a;->a:Lfi0/a;

    const-string v1, "HrSettingsScreen"

    invoke-interface {v0, v1}, Lfi0/a;->g(Ljava/lang/String;)V

    return-void
.end method

.method public final g(Ljava/lang/String;)V
    .locals 9

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string v2, "Heart Rate Settings"

    const-string v3, "hr_zones"

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v5, p1

    invoke-static/range {v1 .. v8}, Lgl2/a;->e(Lgl2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public final i()V
    .locals 8

    const/16 v6, 0x18

    const/4 v7, 0x0

    const-string v1, "Heart Rate Settings"

    const-string v2, "hr_zones"

    const-string v3, "default_off"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lgl2/a;->e(Lgl2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method public final j()V
    .locals 8

    const/16 v6, 0x18

    const/4 v7, 0x0

    const-string v1, "Heart Rate Settings"

    const-string v2, "hr_zones"

    const-string v3, "default_on"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lgl2/a;->e(Lgl2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method
