.class public abstract Lkb1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a1\u0010\t\u001a\u00020\u00082\u0010\u0010\u0003\u001a\u000c\u0012\u0004\u0012\u00020\u00010\u0000j\u0002`\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "domainState",
        "",
        "monthIndex",
        "",
        "isMCICalendarColorsOn",
        "Lg51/c;",
        "b",
        "(Lh91/b;IZ)Lg51/c;",
        "design-models_release"
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
.method public static synthetic a(Lkb1/f;Lkb1/e;)Lqy0/a;
    .locals 0

    invoke-static {p0, p1}, Lkb1/h;->d(Lkb1/f;Lkb1/e;)Lqy0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lh91/b;IZ)Lg51/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;IZ)",
            "Lg51/c;"
        }
    .end annotation

    const-string v0, "domainState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkb1/f;

    invoke-direct {v0, p2}, Lkb1/f;-><init>(Z)V

    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v1, 0xc

    invoke-direct {p2, v0, v1}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, p1, p2}, Lkb1/d;->a(Lh91/b;ILkotlin/jvm/functions/Function1;)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lh91/b;IZILjava/lang/Object;)Lg51/c;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lkb1/h;->b(Lh91/b;IZ)Lg51/c;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkb1/f;Lkb1/e;)Lqy0/a;
    .locals 1

    const-string v0, "dateArgs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lkb1/f;->m(Lkb1/e;)Lqy0/h;

    move-result-object p0

    return-object p0
.end method
