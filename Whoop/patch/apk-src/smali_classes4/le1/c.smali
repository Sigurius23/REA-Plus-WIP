.class public final Lle1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lle1/c;",
        "",
        "Ltr2/n;",
        "logger",
        "Lcom/whoop/education/domain/EducationApi;",
        "api",
        "",
        "timeZone",
        "<init>",
        "(Ltr2/n;Lcom/whoop/education/domain/EducationApi;Ljava/lang/String;)V",
        "Lle1/b;",
        "d",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Lle1/a;",
        "upstream",
        "e",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ltr2/n;",
        "b",
        "Lcom/whoop/education/domain/EducationApi;",
        "c",
        "Ljava/lang/String;",
        "education_release"
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
.field private final a:Ltr2/n;

.field private final b:Lcom/whoop/education/domain/EducationApi;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ltr2/n;Lcom/whoop/education/domain/EducationApi;Ljava/lang/String;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "api"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeZone"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lle1/c;->a:Ltr2/n;

    iput-object p2, p0, Lle1/c;->b:Lcom/whoop/education/domain/EducationApi;

    iput-object p3, p0, Lle1/c;->c:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a(Lle1/c;)Lcom/whoop/education/domain/EducationApi;
    .locals 0

    iget-object p0, p0, Lle1/c;->b:Lcom/whoop/education/domain/EducationApi;

    return-object p0
.end method

.method public static final synthetic b(Lle1/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lle1/c;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lle1/c;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lle1/c;->c:Ljava/lang/String;

    return-object p0
.end method

.method private final d(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lle1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lle1/c$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lle1/c$a;

    iget v1, v0, Lle1/c$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lle1/c$a;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lle1/c$a;

    invoke-direct {v0, p0, p1}, Lle1/c$a;-><init>(Lle1/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Lle1/c$a;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lle1/c$a;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Lle1/c;->a:Ltr2/n;

    new-instance v5, Lle1/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, v3}, Lle1/c$b;-><init>(Lle1/c;Lq83/d;)V

    iput p1, v6, Lle1/c$a;->y:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_4

    new-instance v0, Lle1/b$b;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/items/ArticleTileCarouselModel;

    invoke-direct {v0, p1}, Lle1/b$b;-><init>(Lcom/whoop/design/models/items/ArticleTileCarouselModel;)V

    return-object v0

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Lle1/b$a;->a:Lle1/b$a;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final e(Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lle1/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lle1/c$c;-><init>(Lq83/d;Lle1/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
