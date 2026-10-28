.class public abstract Llb1/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;",
        "Ln11/b;",
        "f",
        "(Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;)Ln11/b;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "exerciseRecordHeaderMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/e1;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/l1;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/l1;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;)Ln11/b;
    .locals 0

    invoke-static {p0}, Llb1/l1;->d(Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;)Ln11/b;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/e1;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Llb1/e1;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/l1$a;

    invoke-direct {v2, v0}, Llb1/l1$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;)Ln11/b;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/l1;->f(Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;)Ln11/b;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/l1;->a:Llb1/y0;

    return-object v0
.end method

.method public static final f(Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;)Ln11/b;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;->getAchievementIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move-object v5, v1

    :goto_1
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v1

    :goto_2
    new-instance v2, Ln11/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;->getRecordTitle()Lcom/whoop/design/models/items/ExerciseRecordMetricModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/items/ExerciseRecordMetricModel;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;->getRecordTitle()Lcom/whoop/design/models/items/ExerciseRecordMetricModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/design/models/items/ExerciseRecordMetricModel;->getUnit()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ln11/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;->getRecordSubtitle()Lcom/whoop/design/models/items/ExerciseRecordMetricModel;

    move-result-object v3

    if-eqz v3, :cond_3

    new-instance v1, Ln11/c;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/ExerciseRecordMetricModel;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/whoop/design/models/items/ExerciseRecordMetricModel;->getUnit()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v4, v3}, Ln11/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ExerciseRecordHeaderModel;->getRecordDate()Ljava/lang/String;

    move-result-object p0

    new-instance v3, Ln11/b;

    invoke-direct {v3, v0, v2, v1, p0}, Ln11/b;-><init>(Ljava/lang/Integer;Ln11/c;Ln11/c;Ljava/lang/String;)V

    return-object v3
.end method
