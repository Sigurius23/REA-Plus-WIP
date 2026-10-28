.class public final Lv52/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lv52/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/recommendationtile/domain/e;",
        "state",
        "Li31/d;",
        "a",
        "(Lcom/whoop/recommendationtile/domain/e;)Li31/d;",
        "recommendation-tile-arch-mini_release"
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
.method public final a(Lcom/whoop/recommendationtile/domain/e;)Li31/d;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li31/d;

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/e;->d()Li31/g;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/recommendationtile/domain/e;->e()Z

    move-result p1

    invoke-direct {v0, v1, p1}, Li31/d;-><init>(Li31/g;Z)V

    return-object v0
.end method
