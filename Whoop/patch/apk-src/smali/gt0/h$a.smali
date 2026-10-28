.class public final Lgt0/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgt0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0015\u0010\u0008\u001a\u00020\u0005*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0015\u0010\n\u001a\u00020\u0005*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\u0007R\u0015\u0010\u000c\u001a\u00020\u0005*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0007R\u0015\u0010\u000e\u001a\u00020\u0005*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0007R\u0015\u0010\u0010\u001a\u00020\u0005*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0007R\u0015\u0010\u0012\u001a\u00020\u0005*\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "Lgt0/h$a;",
        "",
        "<init>",
        "()V",
        "Lgt0/h;",
        "",
        "d",
        "(Lgt0/h;)Z",
        "isUpdateInProgress",
        "e",
        "isUpdateSuccessful",
        "a",
        "retryFwUpdate",
        "c",
        "isUpdateFailed",
        "f",
        "isUserAcceptanceRequired",
        "b",
        "isLocationPermissionRequired",
        "connectivity-core_release"
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
.field static final synthetic a:Lgt0/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgt0/h$a;

    invoke-direct {v0}, Lgt0/h$a;-><init>()V

    sput-object v0, Lgt0/h$a;->a:Lgt0/h$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgt0/h;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lgt0/h$b;

    if-eqz v0, :cond_0

    check-cast p1, Lgt0/h$b;

    invoke-virtual {p1}, Lgt0/h$b;->c()Lgt0/f;

    move-result-object v0

    sget-object v1, Lgt0/f$d;->b:Lgt0/f$d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lgt0/h$b;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lgt0/h;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lgt0/h$c;

    return p1
.end method

.method public final c(Lgt0/h;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lgt0/h$b;

    if-eqz v0, :cond_0

    check-cast p1, Lgt0/h$b;

    invoke-virtual {p1}, Lgt0/h$b;->c()Lgt0/f;

    move-result-object v0

    sget-object v1, Lgt0/f$d;->b:Lgt0/f$d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lgt0/h$b;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final d(Lgt0/h;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lgt0/h$g;

    if-eqz v0, :cond_0

    check-cast p1, Lgt0/h$g;

    invoke-virtual {p1}, Lgt0/h$g;->c()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final e(Lgt0/h;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgt0/h$e;->b:Lgt0/h$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f(Lgt0/h;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, Lgt0/h$d;

    return p1
.end method
