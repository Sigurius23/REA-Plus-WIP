.class public final Ls02/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls02/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Ls02/a;",
        "",
        "Liy1/c;",
        "metricWriter",
        "Lfy1/g;",
        "nanoClock",
        "<init>",
        "(Liy1/c;Lfy1/g;)V",
        "",
        "path",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;)V",
        "Lhb1/g;",
        "viewState",
        "b",
        "(Lhb1/g;)V",
        "Liy1/c;",
        "Lfy1/g;",
        "c",
        "Ljava/lang/String;",
        "",
        "d",
        "J",
        "startNano",
        "",
        "e",
        "Z",
        "hasEmitted",
        "f",
        "nested-bff-arch-mini_release"
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
.field public static final f:Ls02/a$a;

.field public static final g:I


# instance fields
.field private final a:Liy1/c;

.field private final b:Lfy1/g;

.field private c:Ljava/lang/String;

.field private d:J

.field private e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls02/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls02/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ls02/a;->f:Ls02/a$a;

    const/16 v0, 0x8

    sput v0, Ls02/a;->g:I

    return-void
.end method

.method public constructor <init>(Liy1/c;Lfy1/g;)V
    .locals 1

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nanoClock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls02/a;->a:Liy1/c;

    iput-object p2, p0, Ls02/a;->b:Lfy1/g;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls02/a;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    iput-object p1, p0, Ls02/a;->c:Ljava/lang/String;

    iget-object p1, p0, Ls02/a;->b:Lfy1/g;

    invoke-interface {p1}, Lfy1/g;->a()J

    move-result-wide v0

    iput-wide v0, p0, Ls02/a;->d:J

    :cond_0
    return-void
.end method

.method public final b(Lhb1/g;)V
    .locals 13

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ls02/a;->e:Z

    if-nez v0, :cond_3

    instance-of v0, p1, Lhb1/g$d;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ls02/a;->c:Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Ls02/a;->e:Z

    iget-object v1, p0, Ls02/a;->b:Lfy1/g;

    invoke-interface {v1}, Lfy1/g;->a()J

    move-result-wide v1

    iget-wide v3, p0, Ls02/a;->d:J

    sub-long/2addr v1, v3

    long-to-double v1, v1

    const-wide v3, 0x412e848000000000L    # 1000000.0

    div-double/2addr v1, v3

    check-cast p1, Lhb1/g$d;

    invoke-virtual {p1}, Lhb1/g$d;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhb1/d;

    invoke-virtual {v5}, Lhb1/d;->a()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_0

    :cond_2
    iget-object v3, p0, Ls02/a;->a:Liy1/c;

    new-instance v5, Ljy1/a;

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    const-string v1, "path:"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lhb1/g$d;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const-string v1, "section_count:"

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "item_count:"

    invoke-static {v4, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, p1, v1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/16 v11, 0x11

    const/4 v12, 0x0

    const/4 v6, 0x0

    const-string v7, "nested_bff.render_duration"

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v12}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v5}, Liy1/c;->b(Ljy1/a;)V

    :cond_3
    :goto_1
    return-void
.end method
