.class public final Lfa2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfa2/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J;\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lfa2/c;",
        "",
        "Lfi0/a;",
        "analytics",
        "Lor2/y;",
        "externalLinkNavigator",
        "<init>",
        "(Lfi0/a;Lor2/y;)V",
        "Lcom/whoop/settings/about/a;",
        "event",
        "Landroid/app/Activity;",
        "activity",
        "",
        "eventName",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onNavigate",
        "a",
        "(Lcom/whoop/settings/about/a;Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V",
        "Lfi0/a;",
        "b",
        "Lor2/y;",
        "c",
        "settings_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Lfa2/c$a;

.field public static final d:I


# instance fields
.field private final a:Lfi0/a;

.field private final b:Lor2/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfa2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfa2/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfa2/c;->c:Lfa2/c$a;

    const/16 v0, 0x8

    sput v0, Lfa2/c;->d:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;Lor2/y;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalLinkNavigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfa2/c;->a:Lfi0/a;

    iput-object p2, p0, Lfa2/c;->b:Lor2/y;

    return-void
.end method

.method public static synthetic b(Lfa2/c;Lcom/whoop/settings/about/a;Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const-string p3, "Settings - About"

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lfa2/c;->a(Lcom/whoop/settings/about/a;Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/settings/about/a;Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/about/a;",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/settings/about/a$f;

    const-string v1, "Navigate Terms of Use"

    const-string v2, "Help"

    const/4 v3, 0x0

    const-string v4, "Open"

    if-eqz v0, :cond_0

    iget-object p1, p0, Lfa2/c;->a:Lfi0/a;

    const-string p4, "Terms of Use"

    invoke-interface {p1, p4, v4, v3, p3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lfa2/c;->a:Lfi0/a;

    invoke-interface {p1, v2, v4, v3, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lfa2/c;->b:Lor2/y;

    invoke-virtual {p1, p2}, Lor2/y;->v(Landroid/app/Activity;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/whoop/settings/about/a$c;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lfa2/c;->a:Lfi0/a;

    const-string p4, "Privacy Policy"

    invoke-interface {p1, p4, v4, v3, p3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lfa2/c;->a:Lfi0/a;

    invoke-interface {p1, v2, v4, v3, v1}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lfa2/c;->b:Lor2/y;

    invoke-virtual {p1, p2}, Lor2/y;->r(Landroid/app/Activity;)V

    return-void

    :cond_1
    instance-of v0, p1, Lcom/whoop/settings/about/a$a;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lfa2/c;->a:Lfi0/a;

    const-string p2, "Open Source Licenses"

    invoke-interface {p1, p2, v4, v3, p3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "android-app://com.whoop/settings/opensourcelicenses"

    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    instance-of v0, p1, Lcom/whoop/settings/about/a$b;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lfa2/c;->a:Lfi0/a;

    const-string p4, "Patents"

    invoke-interface {p1, p4, v4, v3, p3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lfa2/c;->b:Lor2/y;

    invoke-virtual {p1, p2}, Lor2/y;->p(Landroid/app/Activity;)V

    return-void

    :cond_3
    instance-of v0, p1, Lcom/whoop/settings/about/a$d;

    if-eqz v0, :cond_4

    iget-object p1, p0, Lfa2/c;->a:Lfi0/a;

    const-string p2, "Regulatory Labels"

    invoke-interface {p1, p2, v4, v3, p3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "android-app://com.whoop/settings/regulatorylabels"

    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    instance-of p1, p1, Lcom/whoop/settings/about/a$e;

    if-eqz p1, :cond_5

    iget-object p1, p0, Lfa2/c;->a:Lfi0/a;

    const-string p4, "Safety & Regulatory"

    invoke-interface {p1, p4, v4, v3, p3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lfa2/c;->b:Lor2/y;

    invoke-virtual {p1, p2}, Lor2/y;->t(Landroid/app/Activity;)V

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
