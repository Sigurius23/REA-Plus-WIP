.class public final Ldu1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Ldu1/a;",
        "",
        "Leb/a0;",
        "fragmentNavController",
        "Lss1/a;",
        "analytics",
        "<init>",
        "(Leb/a0;Lss1/a;)V",
        "Ldu1/b;",
        "navEvent",
        "Ll83/a0;",
        "a",
        "(Ldu1/b;)V",
        "Leb/a0;",
        "b",
        "Lss1/a;",
        "labrador_release"
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

.field private final b:Lss1/a;


# direct methods
.method public constructor <init>(Leb/a0;Lss1/a;)V
    .locals 1

    const-string v0, "fragmentNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldu1/a;->a:Leb/a0;

    iput-object p2, p0, Ldu1/a;->b:Lss1/a;

    return-void
.end method


# virtual methods
.method public final a(Ldu1/b;)V
    .locals 5

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ldu1/b$a;->a:Ldu1/b$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ldu1/a;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Ldu1/b$f;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ldu1/a;->b:Lss1/a;

    check-cast p1, Ldu1/b$f;

    invoke-virtual {p1}, Ldu1/b$f;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lss1/a;->m(Ljava/lang/String;)V

    invoke-virtual {p1}, Ldu1/b$f;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "android-app://com.whoop/labradorReading?selectedWrist="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Ldu1/a;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Ldu1/a;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_1
    sget-object v0, Ldu1/b$e;->a:Ldu1/b$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "android-app://com.whoop/labradorDeviceLocationFragment"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Ldu1/a;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Ldu1/a;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_2
    instance-of v0, p1, Ldu1/b$g;

    if-eqz v0, :cond_3

    iget-object v0, p0, Ldu1/a;->b:Lss1/a;

    invoke-virtual {v0}, Lss1/a;->i()V

    check-cast p1, Ldu1/b$g;

    invoke-virtual {p1}, Ldu1/b$g;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "android-app://com.whoop/onboardingStoriesFragmentRedesign/ECG_EDUCATION?entryPoint="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Ldu1/a;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_3
    instance-of v0, p1, Ldu1/b$d;

    if-eqz v0, :cond_4

    check-cast p1, Ldu1/b$d;

    invoke-virtual {p1}, Ldu1/b$d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ldu1/b$d;->b()Z

    move-result v1

    invoke-virtual {p1}, Ldu1/b$d;->c()Z

    move-result p1

    const-string v2, "&showSaveButton="

    const-string v3, "&isNewReading="

    const-string v4, "android-app://com.whoop/labradorDetailsFragment?id="

    invoke-static {v4, v0, v2, v3, v1}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Ldu1/a;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Ldu1/a;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_4
    instance-of v0, p1, Ldu1/b$c;

    if-eqz v0, :cond_5

    const-string p1, "android-app://com.whoop/labradorAboutFragment"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Ldu1/a;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_5
    instance-of p1, p1, Ldu1/b$b;

    if-eqz p1, :cond_6

    iget-object p1, p0, Ldu1/a;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
