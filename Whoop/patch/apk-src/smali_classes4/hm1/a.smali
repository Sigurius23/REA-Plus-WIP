.class public final Lhm1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lhm1/a;",
        "",
        "<init>",
        "()V",
        "Lbm1/c;",
        "streaksDomainState",
        "Lem1/l;",
        "homeDialogViewState",
        "",
        "makePermissionsCheck",
        "isJournalShowing",
        "areAutopopsComplete",
        "a",
        "(Lbm1/c;Lem1/l;ZZZ)Z",
        "home_release"
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
.method public final a(Lbm1/c;Lem1/l;ZZZ)Z
    .locals 2

    const-string v0, "streaksDomainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "homeDialogViewState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    invoke-virtual {p2}, Lem1/l;->n()Z

    move-result p2

    if-nez p2, :cond_0

    if-eqz p5, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    instance-of p3, p1, Lbm1/c$d;

    if-eqz p3, :cond_1

    check-cast p1, Lbm1/c$d;

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lbm1/c$d;->d()Z

    move-result p1

    goto :goto_2

    :cond_2
    move p1, v1

    :goto_2
    if-eqz p2, :cond_3

    if-nez p1, :cond_3

    return v0

    :cond_3
    return v1
.end method
