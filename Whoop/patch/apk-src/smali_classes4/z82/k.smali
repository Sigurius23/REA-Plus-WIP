.class public final Lz82/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz82/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lz82/k;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Ljk0/a;",
        "strapBodyStatus",
        "",
        "experimentVariant",
        "experimentName",
        "Ll83/a0;",
        "c",
        "(Ljk0/a;Ljava/lang/String;Ljava/lang/String;)V",
        "b",
        "a",
        "()V",
        "Lfi0/a;",
        "core_release"
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

    iput-object p1, p0, Lz82/k;->a:Lfi0/a;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lz82/k;->a:Lfi0/a;

    const-string v1, "Arrhythmia"

    const-string v2, "Push Notification"

    const-string v3, "Arrhythmia Notification"

    const-string v4, "Send"

    invoke-interface {v0, v3, v4, v1, v2}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Ljk0/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v0, "experimentName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_5

    const/4 v0, -0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lz82/k$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    if-eq p1, v0, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    const-string p1, "off_body"

    goto :goto_2

    :cond_3
    const-string p1, "on_body"

    goto :goto_2

    :cond_4
    :goto_1
    const-string p1, "unknown"

    :goto_2
    new-instance v0, Ll83/k;

    const-string v1, "strap_body_status"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p1, "_"

    invoke-static {p2, p1, p3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string p3, "variant_name"

    invoke-direct {p2, p3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object p1

    :goto_3
    move-object v5, p1

    goto :goto_4

    :cond_5
    const/4 p1, 0x0

    goto :goto_3

    :goto_4
    iget-object v0, p0, Lz82/k;->a:Lfi0/a;

    const-string v3, "Sleep Need"

    const-string v4, "Push Notification"

    const-string v1, "Sleep Coach"

    const-string v2, "Send"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final c(Ljk0/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    const-string v0, "experimentName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_5

    const/4 v0, -0x1

    if-nez p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    sget-object v1, Lz82/k$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    if-eq p1, v0, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    const-string p1, "off_body"

    goto :goto_2

    :cond_3
    const-string p1, "on_body"

    goto :goto_2

    :cond_4
    :goto_1
    const-string p1, "unknown"

    :goto_2
    new-instance v0, Ll83/k;

    const-string v1, "strap_body_status"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string p1, "_"

    invoke-static {p2, p1, p3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ll83/k;

    const-string p3, "variant_name"

    invoke-direct {p2, p3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object p1

    :goto_3
    move-object v5, p1

    goto :goto_4

    :cond_5
    const/4 p1, 0x0

    goto :goto_3

    :goto_4
    iget-object v0, p0, Lz82/k;->a:Lfi0/a;

    const-string v3, "Stress Monitor"

    const-string v4, "Push Notification"

    const-string v1, "Stress Monitor EoD Notifications"

    const-string v2, "Send"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
