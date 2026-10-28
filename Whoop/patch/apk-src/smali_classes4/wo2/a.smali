.class public final Lwo2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lwo2/a;",
        "",
        "Luo2/a;",
        "analytics",
        "<init>",
        "(Luo2/a;)V",
        "Lxo2/a;",
        "actionEvent",
        "a",
        "(Lxo2/a;)Lxo2/a;",
        "Luo2/a;",
        "universal-checkout_release"
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
.field private final a:Luo2/a;


# direct methods
.method public constructor <init>(Luo2/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo2/a;->a:Luo2/a;

    return-void
.end method


# virtual methods
.method public final a(Lxo2/a;)Lxo2/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lxo2/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwo2/a;->a:Luo2/a;

    move-object v1, p1

    check-cast v1, Lxo2/a$a;

    invoke-virtual {v0, v1}, Luo2/a;->a(Lxo2/a$a;)V

    :cond_0
    return-object p1
.end method
