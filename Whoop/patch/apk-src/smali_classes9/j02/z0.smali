.class public final Lj02/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm02/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lj02/z0;",
        "Lm02/b;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Lm02/c;",
        "params",
        "",
        "a",
        "(Landroid/content/Context;Lm02/c;)Z",
        "app_prodStandardRelease"
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
.method public a(Landroid/content/Context;Lm02/c;)Z
    .locals 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lm02/c;->b()J

    move-result-wide v2

    invoke-virtual {p2}, Lm02/c;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lm02/c;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lm02/c;->f()Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {p2}, Lm02/c;->e()I

    move-result v7

    invoke-virtual {p2}, Lm02/c;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {p2}, Lm02/c;->h()Z

    move-result v9

    invoke-virtual {p2}, Lm02/c;->a()I

    move-result v10

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lcom/whoop/whooplive/selfie/SelfieActivity;->i1(Landroid/content/Context;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;ILjava/lang/Long;ZI)Lcom/whoop/whooplive/selfie/SelfieActivity$g;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/q;->m()V

    const/4 p1, 0x1

    return p1
.end method
