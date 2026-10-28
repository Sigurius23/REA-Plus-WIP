.class public final Lb63/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li63/e;


# static fields
.field public static final w:Lb63/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb63/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lb63/i;->w:Lb63/i;

    return-void
.end method


# virtual methods
.method public final a(Li63/d;)Z
    .locals 3

    sget-object v0, Li63/b;->a:Li63/d;

    invoke-virtual {p1, v0}, Li63/d;->f(Li63/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p1, Li63/j;->c:Ljava/util/Collection;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Li63/d;

    iget-object v1, p1, Li63/d;->d:Ljava/lang/String;

    iget-object p1, p1, Li63/d;->e:Ljava/lang/String;

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1, p1, v2}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move-object p1, v0

    :goto_0
    invoke-virtual {p1}, Li63/j;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "application/"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "+json"

    invoke-static {p1, v0, v1}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method
