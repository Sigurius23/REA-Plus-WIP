.class public final Lqx1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lqx1/f;",
        "",
        "<init>",
        "()V",
        "Ltv1/c;",
        "result",
        "Lqx1/e;",
        "a",
        "(Ltv1/c;)Lqx1/e;",
        "membership_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltv1/c;)Lqx1/e;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "EnumValueOfIssue"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ltv1/c$b;

    if-eqz v0, :cond_0

    check-cast p1, Ltv1/c$b;

    invoke-static {p1}, Lqx1/g;->a(Ltv1/c$b;)Lqx1/e$c;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Ltv1/c$c;->a:Ltv1/c$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lqx1/e$b;->a:Lqx1/e$b;

    return-object p1

    :cond_1
    sget-object v0, Ltv1/c$a;->a:Ltv1/c$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lqx1/e$a;->a:Lqx1/e$a;

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
