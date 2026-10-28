.class public final Lyh0/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyh0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lyh0/c$a;",
        "",
        "<init>",
        "()V",
        "",
        "yearsDifference",
        "Lyh0/d;",
        "b",
        "(F)Lyh0/d;",
        "debugChronologicalAge",
        "F",
        "a",
        "()F",
        "amoeba_release"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lyh0/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    invoke-static {}, Lyh0/c;->a()F

    move-result v0

    return v0
.end method

.method public final b(F)Lyh0/d;
    .locals 5

    new-instance v0, Lyh0/d;

    invoke-virtual {p0}, Lyh0/c$a;->a()F

    move-result v1

    add-float/2addr v1, p1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2, v1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const v4, 0x3dcccccd    # 0.1f

    invoke-static {v3, v4}, Lor2/a1;->f(FF)F

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    cmpl-float p1, p1, v3

    if-lez p1, :cond_0

    const-string p1, "older"

    goto :goto_0

    :cond_0
    const-string p1, "younger"

    :goto_0
    const-string v3, " years "

    invoke-static {v2, v3, p1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "WHOOP AGE"

    invoke-direct {v0, v1, v2, p1}, Lyh0/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
