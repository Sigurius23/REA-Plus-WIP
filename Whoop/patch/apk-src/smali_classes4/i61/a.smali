.class public final Li61/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Li61/a;",
        "",
        "<init>",
        "()V",
        "Lj61/h;",
        "state",
        "",
        "axisScale",
        "Li61/b;",
        "a",
        "(Lj61/h;F)Li61/b;",
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
.method public final a(Lj61/h;F)Li61/b;
    .locals 6

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lj61/h;->n()Lg61/b;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg61/b;->j()Lg61/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    sget-object v2, Lg61/d;->TIME_MARKER:Lg61/d;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v0, v2, :cond_3

    invoke-virtual {p1}, Lj61/h;->n()Lg61/b;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lg61/b;->j()Lg61/d;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    sget-object v5, Lg61/d;->TIME_MARKER_WITHOUT_BULB:Lg61/d;

    if-ne v0, v5, :cond_2

    goto :goto_2

    :cond_2
    move v0, v4

    goto :goto_3

    :cond_3
    :goto_2
    move v0, v3

    :goto_3
    invoke-virtual {p1}, Lj61/h;->g()Lg61/b;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lg61/b;->j()Lg61/d;

    move-result-object v5

    goto :goto_4

    :cond_4
    move-object v5, v1

    :goto_4
    if-eq v5, v2, :cond_7

    invoke-virtual {p1}, Lj61/h;->g()Lg61/b;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lg61/b;->j()Lg61/d;

    move-result-object v1

    :cond_5
    sget-object v2, Lg61/d;->TIME_MARKER_WITHOUT_BULB:Lg61/d;

    if-ne v1, v2, :cond_6

    goto :goto_5

    :cond_6
    move v3, v4

    :cond_7
    :goto_5
    if-nez v0, :cond_9

    if-eqz v3, :cond_8

    goto :goto_6

    :cond_8
    new-instance v0, Li61/c;

    invoke-direct {v0, p1, p2}, Li61/c;-><init>(Lj61/h;F)V

    return-object v0

    :cond_9
    :goto_6
    new-instance v0, Li61/d;

    invoke-direct {v0, p1, p2}, Li61/d;-><init>(Lj61/h;F)V

    return-object v0
.end method
