.class public final Lam2/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0007\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\rR \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u000b\u001a\u0004\u0008\n\u0010\r\u00a8\u0006\u0010"
    }
    d2 = {
        "Lam2/e0;",
        "",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "Lor2/h0;",
        "graphKey",
        "a",
        "(Landroidx/compose/ui/Modifier;Lor2/h0;)Landroidx/compose/ui/Modifier;",
        "",
        "b",
        "Ljava/util/List;",
        "c",
        "()Ljava/util/List;",
        "TWO_KEY_METRIC_GRAPH_KEYS",
        "THREE_KEY_METRIC_GRAPH_KEYS",
        "trends_release"
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
.field public static final a:Lam2/e0;

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lor2/h0;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lor2/h0;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lam2/e0;

    invoke-direct {v0}, Lam2/e0;-><init>()V

    sput-object v0, Lam2/e0;->a:Lam2/e0;

    sget-object v0, Lor2/h0;->RESTORATIVE_SLEEP:Lor2/h0;

    sget-object v1, Lor2/h0;->HOURS_V_NEED:Lor2/h0;

    sget-object v2, Lor2/h0;->BODY_COMPOSITION:Lor2/h0;

    filled-new-array {v0, v1, v2}, [Lor2/h0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lam2/e0;->b:Ljava/util/List;

    sget-object v0, Lor2/h0;->STRESS:Lor2/h0;

    sget-object v1, Lor2/h0;->STRESS_DURING_NON_STRAIN:Lor2/h0;

    sget-object v2, Lor2/h0;->STRESS_DURING_SLEEP:Lor2/h0;

    filled-new-array {v0, v1, v2}, [Lor2/h0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lam2/e0;->c:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Lam2/e0;->d:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/Modifier;Lor2/h0;)Landroidx/compose/ui/Modifier;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graphKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lam2/e0;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const/16 p2, 0xc8

    int-to-float p2, p2

    invoke-static {v1, v3, p2, v2}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v0, Lam2/e0;->b:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/16 p2, 0xa0

    int-to-float p2, p2

    invoke-static {v1, v3, p2, v2}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {p1, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lor2/h0;",
            ">;"
        }
    .end annotation

    sget-object v0, Lam2/e0;->c:Ljava/util/List;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lor2/h0;",
            ">;"
        }
    .end annotation

    sget-object v0, Lam2/e0;->b:Ljava/util/List;

    return-object v0
.end method
