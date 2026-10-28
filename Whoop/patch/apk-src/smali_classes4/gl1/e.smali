.class public final Lgl1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lgl1/e;",
        "",
        "Lfi0/a;",
        "baseAnalytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lfm1/h;",
        "previousStreakState",
        "currentStreakState",
        "",
        "a",
        "(Lfm1/h;Lfm1/h;)Ljava/lang/String;",
        "Ll83/a0;",
        "b",
        "(Lfm1/h;Lfm1/h;)V",
        "c",
        "()V",
        "Lfi0/a;",
        "home_release"
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

    iput-object p1, p0, Lgl1/e;->a:Lfi0/a;

    return-void
.end method

.method private final a(Lfm1/h;Lfm1/h;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lfm1/h;->ACTIVE:Lfm1/h;

    if-ne p1, v0, :cond_0

    if-ne p2, v0, :cond_0

    const-string p1, "iterate up"

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    sget-object v1, Lfm1/h;->PENDING:Lfm1/h;

    if-ne p2, v1, :cond_1

    const-string p1, "healthy to at risk"

    return-object p1

    :cond_1
    sget-object v1, Lfm1/h;->PENDING:Lfm1/h;

    if-ne p1, v1, :cond_2

    if-ne p2, v0, :cond_2

    const-string p1, "at risk to healthy"

    return-object p1

    :cond_2
    if-ne p1, v0, :cond_3

    sget-object p1, Lfm1/h;->BROKEN:Lfm1/h;

    if-ne p2, p1, :cond_3

    const-string p1, "reset"

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final b(Lfm1/h;Lfm1/h;)V
    .locals 8

    const-string v0, "previousStreakState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentStreakState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lgl1/e;->a:Lfi0/a;

    invoke-direct {p0, p1, p2}, Lgl1/e;->a(Lfm1/h;Lfm1/h;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Streaks"

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-string v3, "animation fires"

    sget-object v7, Lm83/z;->w:Lm83/z;

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final c()V
    .locals 7

    iget-object v0, p0, Lgl1/e;->a:Lfi0/a;

    const-string v1, "source"

    const-string v2, "home screen"

    invoke-static {v1, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const-string v4, "Streaks"

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-string v2, "click streak icon"

    const/4 v3, 0x0

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
