.class public final Lkq2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u000c\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ!\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lkq2/a;",
        "",
        "Lfi0/a;",
        "baseAnalytics",
        "<init>",
        "(Lfi0/a;)V",
        "",
        "action",
        "screenName",
        "Ll83/a0;",
        "g",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "f",
        "d",
        "",
        "year",
        "c",
        "(I)V",
        "",
        "isCorrect",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V",
        "Lfi0/a;",
        "b",
        "Z",
        "wirAnalytics",
        "user-journey_release"
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

.field private b:Z


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "baseAnalytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkq2/a;->a:Lfi0/a;

    return-void
.end method

.method public static synthetic b(Lkq2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lkq2/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic e(Lkq2/a;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lkq2/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lkq2/a;->a:Lfi0/a;

    if-nez p2, :cond_0

    const-string p2, "Onboarding"

    :cond_0
    const/4 v1, 0x0

    const-string v2, "Onboarding Week In Review"

    invoke-interface {v0, p2, p1, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final g(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lkq2/a;->a:Lfi0/a;

    const-string v1, "Year in Review 2024"

    const-string v2, "Year in Review"

    invoke-interface {v0, p2, p1, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 7

    const-string v0, "screenName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lkq2/a;->a:Lfi0/a;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_0

    const-string p3, "Correct"

    goto :goto_0

    :cond_0
    const-string p3, "Incorrect"

    :goto_0
    move-object v6, p3

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    goto :goto_0

    :goto_1
    const-string v4, "Year in Review 2024"

    const-string v5, "Quiz"

    move-object v2, p1

    move-object v3, p2

    invoke-interface/range {v1 .. v6}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c(I)V
    .locals 1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lkq2/a;->b:Z

    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lkq2/a;->b:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lkq2/a;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-direct {p0, p1, p2}, Lkq2/a;->g(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
