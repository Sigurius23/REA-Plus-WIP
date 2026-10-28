.class public final Lhc2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJA\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lhc2/a;",
        "",
        "Lfi0/a;",
        "baseAnalytics",
        "<init>",
        "(Lfi0/a;)V",
        "",
        "isCancelLayoutVisible",
        "isPauseLayoutVisible",
        "isResumeLayoutVisible",
        "",
        "a",
        "(ZZZ)Ljava/lang/String;",
        "isHeaderLoadingOrVisible",
        "isPauseInfoLoading",
        "source",
        "Ll83/a0;",
        "b",
        "(ZZZZZLjava/lang/String;)V",
        "Lfi0/a;",
        "settings_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "baseAnalytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhc2/a;->a:Lfi0/a;

    return-void
.end method

.method private final a(ZZZ)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    const-string p1, "Cancel Button Available"

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    if-eqz p2, :cond_1

    if-nez p3, :cond_1

    const-string p1, "Pause Button Available"

    return-object p1

    :cond_1
    if-nez p1, :cond_2

    if-nez p2, :cond_2

    if-eqz p3, :cond_2

    const-string p1, "Unpause Button Available"

    return-object p1

    :cond_2
    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    if-nez p3, :cond_3

    const-string p1, "Cancel and Pause Button Available"

    return-object p1

    :cond_3
    if-eqz p1, :cond_4

    if-nez p2, :cond_4

    if-eqz p3, :cond_4

    const-string p1, "Cancel and Unpause Button Available"

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final b(ZZZZZLjava/lang/String;)V
    .locals 9

    if-nez p1, :cond_2

    if-eqz p2, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lhc2/a;->a:Lfi0/a;

    invoke-direct {p0, p3, p4, p5}, Lhc2/a;->a(ZZZ)Ljava/lang/String;

    move-result-object v1

    if-eqz p6, :cond_1

    const-string p1, "source"

    invoke-static {p1, p6}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    :goto_0
    move-object v6, p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string v2, "Open"

    const/4 v3, 0x0

    const-string v4, "Settings - My Account"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    :cond_2
    :goto_2
    return-void
.end method
