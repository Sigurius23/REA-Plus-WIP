.class public final Lwu0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lwu0/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "Lq92/h;",
        "whoopStrapSharedPrefs",
        "<init>",
        "(Lfi0/a;Lq92/h;)V",
        "",
        "label",
        "value",
        "strapGen",
        "",
        "isOnBody",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "Lfi0/a;",
        "Ljava/lang/String;",
        "maximVersion",
        "c",
        "nordicVersion",
        "connectivity-notifications_release"
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

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lfi0/a;Lq92/h;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapSharedPrefs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwu0/a;->a:Lfi0/a;

    invoke-virtual {p2}, Lq92/h;->d()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lwu0/a;->b:Ljava/lang/String;

    invoke-virtual {p2}, Lq92/h;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lwu0/a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lwu0/a;->a:Lfi0/a;

    iget-object v4, p0, Lwu0/a;->b:Ljava/lang/String;

    iget-object v5, p0, Lwu0/a;->c:Ljava/lang/String;

    const-string v7, "Sent"

    const/4 v10, 0x0

    const-string v2, "Local Notification"

    const-string v3, "Off-body"

    move-object v8, p1

    move-object v9, p2

    move-object v6, p3

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 11

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lwu0/a;->a:Lfi0/a;

    if-eqz p4, :cond_0

    const-string p4, "On-body"

    :goto_0
    move-object v3, p4

    goto :goto_1

    :cond_0
    const-string p4, "Off-body"

    goto :goto_0

    :goto_1
    iget-object v4, p0, Lwu0/a;->b:Ljava/lang/String;

    iget-object v5, p0, Lwu0/a;->c:Ljava/lang/String;

    const-string v7, "Triggered"

    const/4 v10, 0x0

    const-string v2, "Local Notification"

    move-object v8, p1

    move-object v9, p2

    move-object v6, p3

    invoke-interface/range {v1 .. v10}, Lfi0/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
