.class public final Lkd1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq3/g0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lkd1/i;",
        "Lq3/g0;",
        "<init>",
        "()V",
        "Ll3/g;",
        "text",
        "Lq3/e0;",
        "a",
        "(Ll3/g;)Lq3/e0;",
        "design_release"
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


# virtual methods
.method public a(Ll3/g;)Lq3/e0;
    .locals 6

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v0, v1, :cond_0

    new-instance v0, Li93/j;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v1, v3}, Li93/h;-><init>(III)V

    invoke-static {p1, v0}, Lyb3/r;->C0(Ljava/lang/String;Li93/j;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, ""

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-ne v2, v3, :cond_1

    const-string v4, "/"

    invoke-static {v1, v4}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lkd1/i$a;

    invoke-direct {p1}, Lkd1/i$a;-><init>()V

    new-instance v0, Lq3/e0;

    new-instance v2, Ll3/g;

    invoke-direct {v2, v1}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v2, p1}, Lq3/e0;-><init>(Ll3/g;Lq3/r;)V

    return-object v0
.end method
