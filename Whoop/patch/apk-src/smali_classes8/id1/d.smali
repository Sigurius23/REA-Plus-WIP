.class public abstract Lid1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lid1/b;",
        "Lg91/a;",
        "a",
        "(Lid1/b;)Lg91/a;",
        "design-showcase_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lid1/b;)Lg91/a;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lid1/b$a;

    if-eqz v0, :cond_0

    new-instance v0, Lg91/a$a;

    check-cast p0, Lid1/b$a;

    invoke-virtual {p0}, Lid1/b$a;->a()Ljava/lang/Object;

    move-result-object p0

    invoke-direct {v0, p0}, Lg91/a$a;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Lid1/b$b;

    if-eqz v0, :cond_1

    new-instance v0, Lg91/a$b;

    check-cast p0, Lid1/b$b;

    invoke-virtual {p0}, Lid1/b$b;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lg91/a$b;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
