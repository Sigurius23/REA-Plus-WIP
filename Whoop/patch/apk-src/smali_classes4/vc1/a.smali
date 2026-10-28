.class public final Lvc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lvc1/a;",
        "",
        "Lrr2/c;",
        "crashReporter",
        "<init>",
        "(Lrr2/c;)V",
        "Lm91/o;",
        "itemWrapper",
        "Ll83/a0;",
        "a",
        "(Lm91/o;)V",
        "Lrr2/c;",
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


# instance fields
.field private final a:Lrr2/c;


# direct methods
.method public constructor <init>(Lrr2/c;)V
    .locals 1

    const-string v0, "crashReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvc1/a;->a:Lrr2/c;

    return-void
.end method


# virtual methods
.method public final a(Lm91/o;)V
    .locals 5

    const-string v0, "itemWrapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvc1/a;->a:Lrr2/c;

    invoke-virtual {p1}, Lm91/o;->c()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    move-object v1, v2

    :cond_1
    new-instance v3, Ll83/k;

    const-string v4, "id"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lm91/o;->d()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, p1

    :cond_3
    :goto_0
    new-instance p1, Ll83/k;

    const-string v1, "event"

    invoke-direct {p1, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const-string v1, "design_item_tap"

    invoke-interface {v0, v1, p1}, Lrr2/c;->r(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
