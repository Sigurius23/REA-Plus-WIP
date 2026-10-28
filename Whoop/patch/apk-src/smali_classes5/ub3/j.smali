.class public abstract Lub3/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljc/a;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    sput-object v0, Lub3/j;->a:Ljc/a;

    return-void
.end method

.method public static final a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static final b(Ljava/util/ArrayList;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/util/ArrayList;->trimToSize()V

    return-object p0

    :cond_0
    invoke-static {p0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static c()Lub3/h;
    .locals 2

    new-instance v0, Lub3/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lub3/h;-><init>(I)V

    return-object v0
.end method

.method public static final d(Ljava/lang/Throwable;)Z
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.intellij.openapi.progress.ProcessCanceledException"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0
.end method

.method public static e(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p0, Lub3/i;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, Lub3/i;

    iget-object p0, p0, Lub3/i;->a:Ljava/lang/Throwable;

    throw p0
.end method
