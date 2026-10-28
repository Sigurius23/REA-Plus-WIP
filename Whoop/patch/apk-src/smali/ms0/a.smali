.class public final Lms0/a;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lms0/a;",
        "Landroidx/lifecycle/w1;",
        "Lfi0/a;",
        "baseAnalytics",
        "<init>",
        "(Lfi0/a;)V",
        "Ll83/a0;",
        "j",
        "()V",
        "l",
        "Lns0/a;",
        "event",
        "g",
        "(Lns0/a;)V",
        "w",
        "Lfi0/a;",
        "connectivity-common-ui_release"
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
.field private final w:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "baseAnalytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lms0/a;->w:Lfi0/a;

    return-void
.end method

.method private final j()V
    .locals 9

    iget-object v0, p0, Lms0/a;->w:Lfi0/a;

    const-string v1, "source"

    const-string v2, "take off whoop screen"

    invoke-static {v1, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string v1, "Connectivity"

    const-string v2, "need help?"

    const/4 v3, 0x0

    const-string v4, "Pairing: Open KB Article"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final l()V
    .locals 9

    iget-object v0, p0, Lms0/a;->w:Lfi0/a;

    const-string v1, "source"

    const-string v2, "take off whoop screen"

    invoke-static {v1, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string v1, "Connectivity"

    const-string v2, "next"

    const/4 v3, 0x0

    const-string v4, "Pairing: CTA"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final g(Lns0/a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lns0/a$a;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lms0/a;->j()V

    return-void

    :cond_0
    instance-of p1, p1, Lns0/a$b;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lms0/a;->l()V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
