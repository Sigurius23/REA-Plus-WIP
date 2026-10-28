.class public abstract La63/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Li63/t;->b:Li63/t;

    sget-object v0, Li63/t;->b:Li63/t;

    sget-object v1, Li63/t;->g:Li63/t;

    filled-new-array {v0, v1}, [Li63/t;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, La63/y;->a:Ljava/util/Set;

    return-void
.end method

.method public static final a(Li63/v;)Z
    .locals 1

    iget p0, p0, Li63/v;->a:I

    sget-object v0, Li63/v;->c:Li63/v;

    iget v0, v0, Li63/v;->a:I

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Li63/v;->d:Li63/v;

    iget v0, v0, Li63/v;->a:I

    if-ne p0, v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Li63/v;->f:Li63/v;

    iget v0, v0, Li63/v;->a:I

    if-ne p0, v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Li63/v;->g:Li63/v;

    iget v0, v0, Li63/v;->a:I

    if-ne p0, v0, :cond_3

    goto :goto_0

    :cond_3
    sget-object v0, Li63/v;->e:Li63/v;

    iget v0, v0, Li63/v;->a:I

    if-ne p0, v0, :cond_4

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_4
    const/4 p0, 0x0

    return p0
.end method
