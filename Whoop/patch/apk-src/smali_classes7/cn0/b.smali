.class public abstract Lcn0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
        "domainState",
        "",
        "monthIndex",
        "Lg51/c;",
        "b",
        "(Lh91/b;I)Lg51/c;",
        "calendar-arch-mini_release"
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
.method public static synthetic a(Lcn0/a;Lkb1/e;)Lqy0/a;
    .locals 0

    invoke-static {p0, p1}, Lcn0/b;->c(Lcn0/a;Lkb1/e;)Lqy0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lh91/b;I)Lg51/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
            ">;I)",
            "Lg51/c;"
        }
    .end annotation

    const-string v0, "domainState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcn0/a;

    invoke-direct {v0}, Lcn0/a;-><init>()V

    new-instance v1, Lck1/c;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lck1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, p1, v1}, Lkb1/d;->a(Lh91/b;ILkotlin/jvm/functions/Function1;)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcn0/a;Lkb1/e;)Lqy0/a;
    .locals 1

    const-string v0, "dateArgs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcn0/d;->b(Lkb1/e;)Lkb1/e;

    move-result-object v0

    invoke-static {p1}, Lcn0/d;->a(Lkb1/e;)Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lcn0/a;->i(Lkb1/e;Lcom/whoop/navigation/models/GenericInteraction;)Ldn0/i;

    move-result-object p0

    return-object p0
.end method
