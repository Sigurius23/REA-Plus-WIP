.class public final Lx61/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx61/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J-\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0016\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lx61/c;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lx61/e;",
        "textResourceCharacterCounter",
        "<init>",
        "(Landroid/content/Context;Lx61/e;)V",
        "Ly61/a;",
        "firstLabel",
        "secondLabel",
        "",
        "parentWidth",
        "fontScale",
        "",
        "b",
        "(Ly61/a;Ly61/a;FF)Z",
        "",
        "a",
        "(Ly61/a;Ly61/a;F)D",
        "previousGroup",
        "nextGroup",
        "c",
        "Landroid/content/Context;",
        "Lx61/e;",
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
.field public static final c:Lx61/c$a;

.field public static final d:I


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lx61/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx61/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lx61/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lx61/c;->c:Lx61/c$a;

    const/16 v0, 0x8

    sput v0, Lx61/c;->d:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lx61/e;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textResourceCharacterCounter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lx61/c;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lx61/c;->b:Lx61/e;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lx61/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    new-instance p2, Lx61/e;

    invoke-direct {p2, p1}, Lx61/e;-><init>(Landroid/content/Context;)V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lx61/c;-><init>(Landroid/content/Context;Lx61/e;)V

    return-void
.end method

.method private final a(Ly61/a;Ly61/a;F)D
    .locals 2

    iget-object v0, p0, Lx61/c;->b:Lx61/e;

    invoke-virtual {p1}, Ly61/a;->k()Lu61/d;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lu61/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    invoke-virtual {v0, p1}, Lx61/e;->a(Lcom/whoop/design/util/TextResource;)I

    move-result p1

    iget-object v0, p0, Lx61/c;->b:Lx61/e;

    invoke-virtual {p2}, Ly61/a;->k()Lu61/d;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lu61/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Lx61/e;->a(Lcom/whoop/design/util/TextResource;)I

    move-result p2

    add-int/2addr p2, p1

    int-to-double p1, p2

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    div-double/2addr p1, v0

    const/16 v0, 0xa

    int-to-double v0, v0

    mul-double/2addr p1, v0

    float-to-double v0, p3

    mul-double/2addr p1, v0

    const/16 p3, 0x64

    int-to-double v0, p3

    add-double/2addr p1, v0

    return-wide p1
.end method

.method private final b(Ly61/a;Ly61/a;FF)Z
    .locals 2

    invoke-virtual {p1}, Ly61/a;->l()F

    move-result v0

    invoke-virtual {p2}, Ly61/a;->l()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    mul-float/2addr v0, p3

    invoke-direct {p0, p1, p2, p4}, Lx61/c;->a(Ly61/a;Ly61/a;F)D

    move-result-wide p1

    float-to-double p3, v0

    cmpg-double p1, p3, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final c(Ly61/a;Ly61/a;FF)Z
    .locals 1

    const-string v0, "previousGroup"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nextGroup"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lx61/c;->b(Ly61/a;Ly61/a;FF)Z

    move-result p1

    return p1
.end method
