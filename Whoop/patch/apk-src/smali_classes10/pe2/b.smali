.class public final Lpe2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpe2/b;",
        "",
        "Leb/a0;",
        "fragmentNavController",
        "Lfi0/a;",
        "analytics",
        "Lj02/o0;",
        "navigator",
        "<init>",
        "(Leb/a0;Lfi0/a;Lj02/o0;)V",
        "Lpe2/a;",
        "navEvent",
        "Ll83/a0;",
        "a",
        "(Lpe2/a;)V",
        "Leb/a0;",
        "b",
        "Lfi0/a;",
        "c",
        "Lj02/o0;",
        "shepherd_release"
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
.field private final a:Leb/a0;

.field private final b:Lfi0/a;

.field private final c:Lj02/o0;


# direct methods
.method public constructor <init>(Leb/a0;Lfi0/a;Lj02/o0;)V
    .locals 1

    const-string v0, "fragmentNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpe2/b;->a:Leb/a0;

    iput-object p2, p0, Lpe2/b;->b:Lfi0/a;

    iput-object p3, p0, Lpe2/b;->c:Lj02/o0;

    return-void
.end method


# virtual methods
.method public final a(Lpe2/a;)V
    .locals 8

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpe2/a$m;->a:Lpe2/a$m;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lpe2/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    sget-object v0, Lpe2/a$l;->a:Lpe2/a$l;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lpe2/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_1
    instance-of v0, p1, Lpe2/a$k;

    if-eqz v0, :cond_2

    check-cast p1, Lpe2/a$k;

    invoke-virtual {p1}, Lpe2/a$k;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "android-app://com.whoop/shepherdOnboarding?entryPoint="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Lpe2/b;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_2
    instance-of v0, p1, Lpe2/a$j;

    if-eqz v0, :cond_3

    check-cast p1, Lpe2/a$j;

    invoke-virtual {p1}, Lpe2/a$j;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "android-app://com.whoop/shepherdTermsOfUse?entryPoint="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Lpe2/b;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Lpe2/b;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_3
    instance-of v0, p1, Lpe2/a$f;

    if-eqz v0, :cond_4

    check-cast p1, Lpe2/a$f;

    invoke-virtual {p1}, Lpe2/a$f;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpe2/a$f;->a()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lpe2/b;->c:Lj02/o0;

    new-instance v0, Lj02/m0$l3;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lj02/m0$l3;-><init>(Ljava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_4
    instance-of v0, p1, Lpe2/a$a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lpe2/b;->c:Lj02/o0;

    check-cast p1, Lpe2/a$a;

    invoke-virtual {p1}, Lpe2/a$a;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_5
    instance-of v0, p1, Lpe2/a$b;

    if-eqz v0, :cond_6

    check-cast p1, Lpe2/a$b;

    invoke-virtual {p1}, Lpe2/a$b;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "android-app://com.whoop/shepherdDetails?date="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Lpe2/b;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_6
    sget-object v0, Lpe2/a$h;->a:Lpe2/a$h;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string p1, "android-app://com.whoop/settings/shepherdNotificationHistoryFragment"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Lpe2/b;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_7
    sget-object v0, Lpe2/a$i;->a:Lpe2/a$i;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const-string p1, "android-app://com.whoop/settings/shepherdToggleSettingsFragment"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Lpe2/b;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_8
    instance-of v0, p1, Lpe2/a$d;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lpe2/b;->c:Lj02/o0;

    check-cast p1, Lpe2/a$d;

    invoke-virtual {p1}, Lpe2/a$d;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_9
    instance-of v0, p1, Lpe2/a$e;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lpe2/b;->c:Lj02/o0;

    new-instance v1, Lj02/m0$w1;

    check-cast p1, Lpe2/a$e;

    invoke-virtual {p1}, Lpe2/a$e;->a()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v2, "ARRHYTHMIA_INAPP"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lj02/m0$w1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_a
    instance-of v0, p1, Lpe2/a$c;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lpe2/b;->c:Lj02/o0;

    check-cast p1, Lpe2/a$c;

    invoke-virtual {p1}, Lpe2/a$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_b
    instance-of v0, p1, Lpe2/a$g;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lpe2/b;->c:Lj02/o0;

    check-cast p1, Lpe2/a$g;

    invoke-virtual {p1}, Lpe2/a$g;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
