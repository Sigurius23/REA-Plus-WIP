.class public final Lhb1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhb1/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J/\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "Lhb1/c;",
        "",
        "",
        "path",
        "Liy1/c;",
        "metricWriter",
        "<init>",
        "(Ljava/lang/String;Liy1/c;)V",
        "Ly3/a;",
        "constraints",
        "",
        "naturalHeightPx",
        "naturalWidthPx",
        "Ly3/c;",
        "density",
        "a",
        "(JIILy3/c;)Ljava/lang/String;",
        "direction",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;)V",
        "Ljava/lang/String;",
        "Liy1/c;",
        "",
        "c",
        "Z",
        "hasEmitted",
        "d",
        "design_release"
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
.field public static final d:Lhb1/c$a;

.field public static final e:I


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Liy1/c;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhb1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhb1/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhb1/c;->d:Lhb1/c$a;

    const/16 v0, 0x8

    sput v0, Lhb1/c;->e:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Liy1/c;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb1/c;->a:Ljava/lang/String;

    iput-object p2, p0, Lhb1/c;->b:Liy1/c;

    return-void
.end method


# virtual methods
.method public final a(JIILy3/c;)Ljava/lang/String;
    .locals 3

    const-string v0, "density"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ly3/a;->d(J)Z

    move-result v0

    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result v0

    invoke-interface {p5, v0}, Ly3/c;->e0(I)F

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {p1, p2}, Ly3/a;->e(J)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result p1

    invoke-interface {p5, p1}, Ly3/c;->e0(I)F

    move-result v1

    :cond_1
    invoke-interface {p5, p3}, Ly3/c;->e0(I)F

    move-result p1

    invoke-interface {p5, p4}, Ly3/c;->e0(I)F

    move-result p2

    sget-object p3, Lhb1/c;->d:Lhb1/c$a;

    invoke-virtual {p3, v0, v1, p1, p2}, Lhb1/c$a;->a(FFFF)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;)V
    .locals 9

    const-string v0, "direction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lhb1/c;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhb1/c;->c:Z

    iget-object v0, p0, Lhb1/c;->b:Liy1/c;

    new-instance v1, Ljy1/a;

    iget-object v2, p0, Lhb1/c;->a:Ljava/lang/String;

    const-string v3, "path:"

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "overflow_direction:"

    invoke-virtual {v3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "nested_bff.layout_overflow"

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Liy1/c;->b(Ljy1/a;)V

    return-void
.end method
