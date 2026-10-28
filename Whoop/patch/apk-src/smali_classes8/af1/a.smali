.class public final Laf1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00062\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J1\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0016\u0010\u0017JE\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Laf1/a;",
        "",
        "<init>",
        "()V",
        "",
        "segmentLabel",
        "",
        "segmentIndex",
        "c",
        "(Ljava/lang/String;I)Ljava/lang/String;",
        "graphSegmentIndex",
        "Lo51/f;",
        "segmentController",
        "scrubValue",
        "exerciseName",
        "exerciseType",
        "Lef1/a$a$c;",
        "b",
        "(ILo51/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef1/a$a$c;",
        "selectedIndex",
        "newIndex",
        "Lef1/a$a$a;",
        "d",
        "(Lo51/f;Ljava/lang/Integer;ILjava/lang/String;)Lef1/a$a$a;",
        "Li11/f;",
        "dateSelectorState",
        "pressedDateRaw",
        "primaryMetricValue",
        "Lef1/a$a$b;",
        "a",
        "(Li11/f;Lo51/f;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lef1/a$a$b;",
        "exercise-progress-mini-arch_release"
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
.field public static final a:Laf1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Laf1/a;

    invoke-direct {v0}, Laf1/a;-><init>()V

    sput-object v0, Laf1/a;->a:Laf1/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Li11/f;Lo51/f;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lef1/a$a$b;
    .locals 10

    const-string v0, "dateSelectorState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryMetricValue"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseName"

    move-object/from16 v5, p6

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p4, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p4, Ljava/lang/String;

    move-object v7, p4

    goto :goto_0

    :cond_0
    move-object v7, v1

    :goto_0
    if-nez v7, :cond_1

    return-object v1

    :cond_1
    const/4 p4, 0x0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lo51/f;->a()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_2
    move v0, p4

    :goto_1
    invoke-static {v0, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    :cond_3
    if-eqz p3, :cond_4

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p4

    :cond_4
    invoke-virtual {p0, v1, p4}, Laf1/a;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {p1, v7}, Laf1/c;->b(Li11/f;Ljava/lang/String;)Ll83/k;

    move-result-object p2

    new-instance v1, Lef1/a$a$b;

    iget-object p3, p2, Ll83/k;->w:Ljava/lang/Object;

    move-object v3, p3

    check-cast v3, Ljava/lang/String;

    iget-object p2, p2, Ll83/k;->x:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1}, Li11/f;->f()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Li11/f;->i()Ljava/lang/String;

    move-result-object v9

    move-object v2, p5

    invoke-direct/range {v1 .. v9}, Lef1/a$a$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final b(ILo51/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef1/a$a$c;
    .locals 1

    const-string v0, "scrubValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lef1/a$a$c;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lo51/f;->a()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {p1, p2}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p0, p2, p1}, Laf1/a;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p3, p1, p4, p5}, Lef1/a$a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c(Ljava/lang/String;I)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    const-string v0, "Month"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    const-string v1, "6 Months"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "6 Month"

    if-nez v1, :cond_6

    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    if-nez p2, :cond_3

    return-object v0

    :cond_3
    const/4 v1, 0x1

    if-ne p2, v1, :cond_4

    return-object v2

    :cond_4
    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_5

    return-object v0

    :cond_5
    return-object p1

    :cond_6
    :goto_0
    return-object v2
.end method

.method public final d(Lo51/f;Ljava/lang/Integer;ILjava/lang/String;)Lef1/a$a$a;
    .locals 1

    const-string v0, "segmentController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exerciseName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lo51/f;->b()I

    move-result p2

    :goto_0
    if-ne p3, p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lo51/f;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p3, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p3}, Laf1/a;->c(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lef1/a$a$a;

    invoke-direct {p2, p1, p4}, Lef1/a$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method
