.class public interface abstract Lsj2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008f\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002Je\u0010\r\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000c2\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\t\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u001e\u0008\u0002\u0010\u000b\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012\u00c0\u0006\u0003"
    }
    d2 = {
        "Lsj2/b;",
        "R",
        "",
        "",
        "tag",
        "Lsj2/a;",
        "priority",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "action",
        "Ll83/a0;",
        "onCancel",
        "Lbc3/i0;",
        "c",
        "(Ljava/lang/String;Lsj2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lbc3/i0;",
        "",
        "a",
        "(Lsj2/a;)I",
        "essentials_release"
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
.method public static synthetic b(Lsj2/b;Ljava/lang/String;Lsj2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lbc3/i0;
    .locals 0

    if-nez p6, :cond_2

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    sget-object p2, Lsj2/a$c;->a:Lsj2/a$c;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    new-instance p4, Lsj2/b$a;

    const/4 p5, 0x0

    invoke-direct {p4, p5}, Lsj2/b$a;-><init>(Lq83/d;)V

    :cond_1
    invoke-interface {p0, p1, p2, p3, p4}, Lsj2/b;->c(Ljava/lang/String;Lsj2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lbc3/i0;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: submit"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract a(Lsj2/a;)I
.end method

.method public abstract c(Ljava/lang/String;Lsj2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lbc3/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lsj2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lbc3/i0;"
        }
    .end annotation
.end method
