.class public final Ltk2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\'\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001f\u0010\u001a\u00a8\u0006 "
    }
    d2 = {
        "Ltk2/b;",
        "",
        "<init>",
        "()V",
        "",
        "meters",
        "Lcom/whoop/domain/model/UnitSystem;",
        "unitSystem",
        "b",
        "(DLcom/whoop/domain/model/UnitSystem;)D",
        "",
        "d",
        "(Lcom/whoop/domain/model/UnitSystem;)I",
        "secondsPerDisplayUnit",
        "",
        "g",
        "(D)Ljava/lang/String;",
        "f",
        "(DLcom/whoop/domain/model/UnitSystem;)Ljava/lang/String;",
        "",
        "activeSeconds",
        "distanceMeters",
        "e",
        "(JDLcom/whoop/domain/model/UnitSystem;)Ljava/lang/String;",
        "Lcom/whoop/design/util/TextResource;",
        "i",
        "(Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource;",
        "targetMeters",
        "h",
        "(DLcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource;",
        "a",
        "c",
        "track-activity_release"
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
.field public static final a:Ltk2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltk2/b;

    invoke-direct {v0}, Ltk2/b;-><init>()V

    sput-object v0, Ltk2/b;->a:Ltk2/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(DLcom/whoop/domain/model/UnitSystem;)D
    .locals 2

    invoke-static {p3}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p3

    if-eqz p3, :cond_0

    const-wide v0, 0x409925604189374cL    # 1609.344

    :goto_0
    div-double/2addr p1, v0

    return-wide p1

    :cond_0
    const-wide v0, 0x408f400000000000L    # 1000.0

    goto :goto_0
.end method

.method private final d(Lcom/whoop/domain/model/UnitSystem;)I
    .locals 0

    invoke-static {p1}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lkk2/d;->q:I

    return p1

    :cond_0
    sget p1, Lkk2/d;->p:I

    return p1
.end method

.method private final g(D)Ljava/lang/String;
    .locals 1

    invoke-static {p1, p2}, Le93/b;->W(D)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    div-int/lit8 p2, p1, 0x3c

    rem-int/lit8 p1, p1, 0x3c

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {v0, p1}, Lyb3/r;->n0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ":"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a(Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource;
    .locals 4

    const-string v0, "unitSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v1, Lkk2/d;->z:I

    invoke-direct {p0, p1}, Ltk2/b;->d(Lcom/whoop/domain/model/UnitSystem;)I

    move-result p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->j(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource$d$c;

    move-result-object p1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/whoop/design/util/TextResource$d;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    return-object v0
.end method

.method public final c(Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource;
    .locals 4

    const-string v0, "unitSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v1, Lkk2/d;->B:I

    invoke-direct {p0, p1}, Ltk2/b;->d(Lcom/whoop/domain/model/UnitSystem;)I

    move-result p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->j(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource$d$c;

    move-result-object p1

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/whoop/design/util/TextResource$d;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    return-object v0
.end method

.method public final e(JDLcom/whoop/domain/model/UnitSystem;)Ljava/lang/String;
    .locals 4

    const-string v0, "unitSystem"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmpg-double v2, p3, v0

    const/4 v3, 0x0

    if-gtz v2, :cond_0

    return-object v3

    :cond_0
    invoke-direct {p0, p3, p4, p5}, Ltk2/b;->b(DLcom/whoop/domain/model/UnitSystem;)D

    move-result-wide p3

    cmpg-double p5, p3, v0

    if-gtz p5, :cond_1

    return-object v3

    :cond_1
    long-to-double p1, p1

    div-double/2addr p1, p3

    invoke-direct {p0, p1, p2}, Ltk2/b;->g(D)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final f(DLcom/whoop/domain/model/UnitSystem;)Ljava/lang/String;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DefaultLocale"
        }
    .end annotation

    const-string v0, "unitSystem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Ltk2/b;->b(DLcom/whoop/domain/model/UnitSystem;)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%.2f"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(DLcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource;
    .locals 3

    const-string v0, "unitSystem"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    invoke-static {p3}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget v1, Lkk2/d;->l:I

    goto :goto_0

    :cond_0
    sget v1, Lkk2/d;->m:I

    :goto_0
    new-instance v2, Lcom/whoop/design/util/TextResource$d$a;

    invoke-virtual {p0, p1, p2, p3}, Ltk2/b;->f(DLcom/whoop/domain/model/UnitSystem;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/whoop/design/util/TextResource$d$a;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x1

    new-array p1, p1, [Lcom/whoop/design/util/TextResource$d;

    const/4 p2, 0x0

    aput-object v2, p1, p2

    invoke-direct {v0, v1, p1}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    return-object v0
.end method

.method public final i(Lcom/whoop/domain/model/UnitSystem;)Lcom/whoop/design/util/TextResource;
    .locals 3

    const-string v0, "unitSystem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    invoke-static {p1}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lkk2/d;->n:I

    goto :goto_0

    :cond_0
    sget p1, Lkk2/d;->o:I

    :goto_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p1, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
