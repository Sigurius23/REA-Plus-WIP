.class public final Lor2/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lor2/r1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\nR$\u0010\u0011\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u00088V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000e\u0010\n\"\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lor2/s1;",
        "Lor2/r1;",
        "Landroid/content/Context;",
        "applicationContext",
        "<init>",
        "(Landroid/content/Context;)V",
        "a",
        "Landroid/content/Context;",
        "Lb5/g;",
        "c",
        "()Lb5/g;",
        "localeList",
        "systemLocaleList",
        "value",
        "b",
        "d",
        "(Lb5/g;)V",
        "appSpecificLocalList",
        "core_release"
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
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/s1;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Lb5/g;
    .locals 2

    iget-object v0, p0, Lor2/s1;->a:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/app/LocaleManagerCompat;->getSystemLocales(Landroid/content/Context;)Lb5/g;

    move-result-object v0

    const-string v1, "getSystemLocales(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public b()Lb5/g;
    .locals 2

    invoke-static {}, Lm/q;->d()Lb5/g;

    move-result-object v0

    const-string v1, "getApplicationLocales(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public c()Lb5/g;
    .locals 1

    sget-object v0, Lb5/g;->b:Lb5/g;

    invoke-static {}, Landroid/os/LocaleList;->getAdjustedDefault()Landroid/os/LocaleList;

    move-result-object v0

    invoke-static {v0}, Lb5/g;->f(Landroid/os/LocaleList;)Lb5/g;

    move-result-object v0

    return-object v0
.end method

.method public d(Lb5/g;)V
    .locals 2

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm/q;->w:Landroidx/room/u1;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {}, Lm/q;->e()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lb5/g;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm/o;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object p1

    invoke-static {v0, p1}, Lm/p;->b(Ljava/lang/Object;Landroid/os/LocaleList;)V

    return-void

    :cond_0
    sget-object v0, Lm/q;->y:Lb5/g;

    invoke-virtual {p1, v0}, Lb5/g;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lm/q;->H:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sput-object p1, Lm/q;->y:Lb5/g;

    invoke-static {}, Lm/q;->c()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    return-void
.end method
