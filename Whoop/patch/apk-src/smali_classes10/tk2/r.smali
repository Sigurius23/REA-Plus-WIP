.class public final Ltk2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Ltk2/r;",
        "",
        "<init>",
        "()V",
        "Ljava/time/Duration;",
        "active",
        "",
        "targetSeconds",
        "Ltk2/s;",
        "a",
        "(Ljava/time/Duration;Ljava/lang/Long;)Ltk2/s;",
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
.field public static final a:Ltk2/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltk2/r;

    invoke-direct {v0}, Ltk2/r;-><init>()V

    sput-object v0, Ltk2/r;->a:Ltk2/r;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/time/Duration;Ljava/lang/Long;)Ltk2/s;
    .locals 11

    const-string v0, "active"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/time/Duration;->ofSeconds(J)Ljava/time/Duration;

    move-result-object p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-virtual {p2}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v2

    long-to-double v2, v2

    div-double/2addr v0, v2

    double-to-float p1, v0

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Le93/b;->m(FFF)F

    move-result p1

    new-instance v0, Ltk2/s;

    sget-object v1, Ltk2/e;->a:Ltk2/e;

    invoke-virtual {v1, p2}, Ltk2/e;->a(Ljava/time/Duration;)Lcom/whoop/design/util/TextResource;

    move-result-object p2

    new-instance v1, Ltk2/n;

    const/16 v2, 0x3e8

    int-to-float v2, v2

    mul-float/2addr p1, v2

    invoke-static {p1}, Le93/b;->X(F)I

    move-result v2

    sget-object v4, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/16 v9, 0x78

    const/4 v10, 0x0

    const/16 v3, 0x3e8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Ltk2/n;-><init>(IILy81/f;Ly81/f;FIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p2, v1}, Ltk2/s;-><init>(Lcom/whoop/design/util/TextResource;Ltk2/n;)V

    return-object v0

    :cond_2
    :goto_1
    new-instance p1, Ltk2/s;

    const/4 p2, 0x3

    invoke-direct {p1, v0, v0, p2, v0}, Ltk2/s;-><init>(Lcom/whoop/design/util/TextResource;Ltk2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method
