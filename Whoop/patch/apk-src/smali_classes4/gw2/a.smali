.class public final Lgw2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lgw2/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Ll83/a0;",
        "c",
        "()V",
        "",
        "unlocked",
        "",
        "value",
        "a",
        "(ZLjava/lang/String;)V",
        "b",
        "(Ljava/lang/String;)V",
        "Lfi0/a;",
        "what-to-expect_release"
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

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgw2/a;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a(ZLjava/lang/String;)V
    .locals 7

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lgw2/a;->a:Lfi0/a;

    if-eqz p1, :cond_0

    const-string p1, "tap_unlocked_milestone"

    :goto_0
    move-object v3, p1

    goto :goto_1

    :cond_0
    const-string p1, "tap_locked_milestone"

    goto :goto_0

    :goto_1
    const-string v4, "milestone"

    const-string v5, "Onboarding"

    const-string v2, "what_to_expect"

    move-object v6, p2

    invoke-interface/range {v1 .. v6}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 7

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lgw2/a;->a:Lfi0/a;

    const-string v4, "feature"

    const-string v5, "Onboarding"

    const-string v2, "what_to_expect"

    const-string v3, "tap_more_to_explore"

    move-object v6, p1

    invoke-interface/range {v1 .. v6}, Lfi0/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c()V
    .locals 9

    iget-object v0, p0, Lgw2/a;->a:Lfi0/a;

    const-string v1, "Screen name"

    const-string v2, "Onboarding \u2013 What to Expect"

    invoke-static {v1, v2}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x14

    const/4 v8, 0x0

    const-string v1, "what_to_expect"

    const-string v2, "view_what_to_expect"

    const/4 v3, 0x0

    const-string v4, "Onboarding"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method
