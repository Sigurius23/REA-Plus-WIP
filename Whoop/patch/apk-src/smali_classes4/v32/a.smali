.class public final Lv32/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\u0008J\r\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u0008J\r\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u0008J\r\u0010\u000c\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\u0008J\r\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u0008J\r\u0010\u000e\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000e\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lv32/a;",
        "",
        "Lz82/b;",
        "analyticsManager",
        "<init>",
        "(Lz82/b;)V",
        "Ll83/a0;",
        "a",
        "()V",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "Lz82/b;",
        "getAnalyticsManager",
        "()Lz82/b;",
        "pregnancy_release"
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
.field private final a:Lz82/b;


# direct methods
.method public constructor <init>(Lz82/b;)V
    .locals 1

    const-string v0, "analyticsManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv32/a;->a:Lz82/b;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lv32/a;->a:Lz82/b;

    const-string v1, ""

    const-string v2, "PREGNANCY_STORY - Completed Onboarding"

    const-string v3, "Feature Onboarding"

    invoke-interface {v0, v3, v1, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Lv32/a;->a:Lz82/b;

    const-string v1, "Enter Setup"

    const-string v2, ""

    const-string v3, "Pregnancy Coaching"

    invoke-interface {v0, v3, v1, v2, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lv32/a;->a:Lz82/b;

    const-string v1, "Exit Setup"

    const-string v2, ""

    const-string v3, "Pregnancy Coaching"

    invoke-interface {v0, v3, v1, v2, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lv32/a;->a:Lz82/b;

    const-string v1, "Disable - Share Feedback"

    const-string v2, ""

    const-string v3, "Pregnancy Coaching"

    invoke-interface {v0, v3, v1, v2, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, Lv32/a;->a:Lz82/b;

    const-string v1, "View"

    const-string v2, ""

    const-string v3, "Pregnancy Coaching"

    invoke-interface {v0, v3, v1, v2, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final f()V
    .locals 5

    iget-object v0, p0, Lv32/a;->a:Lz82/b;

    const-string v1, ""

    const-string v2, "PREGNANCY_IN_APP - Onboarding"

    const-string v3, "Pregnancy Coaching"

    const-string v4, "View"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final g()V
    .locals 5

    iget-object v0, p0, Lv32/a;->a:Lz82/b;

    const-string v1, ""

    const-string v2, "PREGNANCY_STORY - Viewed Onboarding Screen"

    const-string v3, "Feature Onboarding"

    const-string v4, "View"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
