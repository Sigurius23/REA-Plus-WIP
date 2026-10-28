.class public abstract Luo1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0003\u001a\u000c\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "domainState",
        "",
        "monthIndex",
        "Lg51/c;",
        "b",
        "(Lh91/b;I)Lg51/c;",
        "hormonal-insights_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Luo1/a;Lkb1/e;)Lqy0/a;
    .locals 0

    invoke-static {p0, p1}, Luo1/c;->c(Luo1/a;Lkb1/e;)Lqy0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lh91/b;I)Lg51/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;I)",
            "Lg51/c;"
        }
    .end annotation

    const-string v0, "domainState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Luo1/a;

    invoke-direct {v0}, Luo1/a;-><init>()V

    new-instance v1, Luo1/b;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, p1, v1}, Lkb1/d;->a(Lh91/b;ILkotlin/jvm/functions/Function1;)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Luo1/a;Lkb1/e;)Lqy0/a;
    .locals 1

    const-string v0, "dateArgs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Luo1/a;->i(Lkb1/e;)Lxo1/c;

    move-result-object p0

    return-object p0
.end method
