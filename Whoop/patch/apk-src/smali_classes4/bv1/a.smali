.class public final Lbv1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J/\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0019\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lbv1/a;",
        "",
        "Lxu1/a;",
        "analytics",
        "<init>",
        "(Lxu1/a;)V",
        "Lcv1/a$f;",
        "event",
        "Lcv1/a;",
        "a",
        "(Lcv1/a$f;)Lcv1/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "b",
        "(Lcom/whoop/navigation/e;)Lcv1/a;",
        "",
        "source",
        "offerId",
        "Ll83/a0;",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lcv1/a$i;",
        "selectedCardId",
        "d",
        "(Lcv1/a$i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "actionEvent",
        "c",
        "(Lcv1/a;)Lcv1/a;",
        "Lxu1/a;",
        "limited-time-offer_release"
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
.field private final a:Lxu1/a;


# direct methods
.method public constructor <init>(Lxu1/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbv1/a;->a:Lxu1/a;

    return-void
.end method

.method private final a(Lcv1/a$f;)Lcv1/a;
    .locals 1

    invoke-virtual {p1}, Lcv1/a$f;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lm91/u;

    if-eqz v0, :cond_0

    new-instance v0, Lcv1/a$b;

    check-cast p1, Lm91/u;

    invoke-direct {v0, p1}, Lcv1/a$b;-><init>(Lm91/u;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Lbv1/a;->b(Lcom/whoop/navigation/e;)Lcv1/a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Li01/b;

    if-eqz v0, :cond_2

    new-instance v0, Lcv1/a$d;

    check-cast p1, Li01/b;

    invoke-virtual {p1}, Li01/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcv1/a$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lcom/whoop/navigation/e;)Lcv1/a;
    .locals 1

    new-instance v0, Lcv1/a$c;

    invoke-direct {v0, p1}, Lcv1/a$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lcv1/a;)Lcv1/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcv1/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbv1/a;->a:Lxu1/a;

    move-object v1, p1

    check-cast v1, Lcv1/a$a;

    invoke-virtual {v0, v1}, Lxu1/a;->b(Lcv1/a$a;)V

    :cond_0
    instance-of v0, p1, Lcv1/a$f;

    if-eqz v0, :cond_1

    check-cast p1, Lcv1/a$f;

    invoke-direct {p0, p1}, Lbv1/a;->a(Lcv1/a$f;)Lcv1/a;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public final d(Lcv1/a$i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lcv1/a$e;

    if-eqz p1, :cond_0

    const-string p1, "close"

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lxu1/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iget-object p2, p0, Lbv1/a;->a:Lxu1/a;

    new-instance v0, Lcv1/a$g;

    invoke-direct {v0, p3, p4, p1}, Lcv1/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lxu1/a;->b(Lcv1/a$a;)V

    return-void
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbv1/a;->a:Lxu1/a;

    invoke-virtual {v0, p1, p2}, Lxu1/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
