.class public abstract Ljf2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lye2/a;",
        "Ljf2/c;",
        "a",
        "(Lye2/a;)Ljf2/c;",
        "sleep-coach_release"
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
.method public static final a(Lye2/a;)Ljf2/c;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljf2/c;

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p0}, Lye2/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p0}, Lye2/a;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v0, v1, v2}, Ljf2/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method
