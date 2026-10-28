.class public final Lav2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lav2/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lav2/f;",
        "",
        "<init>",
        "()V",
        "Lzu2/a;",
        "Lav2/e;",
        "b",
        "(Lzu2/a;)Lav2/e;",
        "Lzu2/c;",
        "domainState",
        "a",
        "(Lzu2/c;)Lav2/e;",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lzu2/a;)Lav2/e;
    .locals 1

    sget-object v0, Lzu2/a$a;->a:Lzu2/a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Lav2/c;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lav2/c;-><init>(Z)V

    return-object p1

    :cond_0
    sget-object v0, Lzu2/a$b;->a:Lzu2/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p1, Lav2/e$a;

    sget v0, Lcu2/h;->h1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    invoke-direct {p1, v0}, Lav2/e$a;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_1
    sget-object v0, Lzu2/a$c;->a:Lzu2/a$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p1, Lav2/e$a;

    sget v0, Lcu2/h;->s1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    invoke-direct {p1, v0}, Lav2/e$a;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object p1

    :cond_2
    sget-object v0, Lzu2/a$d;->a:Lzu2/a$d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lav2/d;->a:Lav2/d;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final a(Lzu2/c;)Lav2/e;
    .locals 7

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lzu2/c;->d()Lzu2/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lzu2/c;->d()Lzu2/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lav2/f;->b(Lzu2/a;)Lav2/e;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lav2/e$b;

    invoke-virtual {p1}, Lzu2/c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lzu2/c;->f()Lzu2/f;

    move-result-object v2

    sget-object v3, Lzu2/f;->TooLong:Lzu2/f;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_1

    move v2, v5

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    invoke-virtual {p1}, Lzu2/c;->f()Lzu2/f;

    move-result-object v3

    sget-object v6, Lav2/f$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v6, v3

    if-ne v3, v5, :cond_2

    sget v3, Lcu2/h;->a2:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    :goto_1
    invoke-virtual {p1}, Lzu2/c;->f()Lzu2/f;

    move-result-object p1

    sget-object v6, Lzu2/f;->Valid:Lzu2/f;

    if-ne p1, v6, :cond_3

    move v4, v5

    :cond_3
    invoke-direct {v0, v1, v2, v3, v4}, Lav2/e$b;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Z)V

    return-object v0
.end method
