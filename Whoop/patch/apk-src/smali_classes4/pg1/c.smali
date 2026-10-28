.class public final Lpg1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lno/nordicsemi/android/dfu/DfuLogListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J+\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lpg1/c;",
        "Lno/nordicsemi/android/dfu/DfuLogListener;",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ltr2/n;)V",
        "",
        "deviceAddress",
        "",
        "level",
        "message",
        "Ll83/a0;",
        "onLogEvent",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "a",
        "Ltr2/n;",
        "getLogger",
        "()Ltr2/n;",
        "firmware-update-service_release"
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
.field private final a:Ltr2/n;


# direct methods
.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg1/c;->a:Ltr2/n;

    return-void
.end method


# virtual methods
.method public onLogEvent(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const/4 p1, 0x0

    if-eqz p2, :cond_5

    const/4 v0, 0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x5

    if-eq p2, v0, :cond_3

    const/16 v0, 0xa

    if-eq p2, v0, :cond_2

    const/16 v0, 0xf

    if-eq p2, v0, :cond_1

    const/16 v0, 0x14

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_6

    iget-object p2, p0, Lpg1/c;->a:Ltr2/n;

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {p2, p3, p1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    if-eqz p3, :cond_6

    iget-object p2, p0, Lpg1/c;->a:Ltr2/n;

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {p2, p3, p1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_2
    if-eqz p3, :cond_6

    iget-object p2, p0, Lpg1/c;->a:Ltr2/n;

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {p2, p3, p1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_3
    if-eqz p3, :cond_6

    iget-object p2, p0, Lpg1/c;->a:Ltr2/n;

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {p2, p3, p1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_4
    if-eqz p3, :cond_6

    iget-object p2, p0, Lpg1/c;->a:Ltr2/n;

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {p2, p3, p1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_5
    if-eqz p3, :cond_6

    iget-object p2, p0, Lpg1/c;->a:Ltr2/n;

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {p2, p3, p1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_6
    :goto_0
    return-void
.end method
