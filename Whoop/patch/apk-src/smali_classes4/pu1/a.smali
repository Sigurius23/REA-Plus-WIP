.class public final Lpu1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lpu1/a;",
        "",
        "Llu1/a;",
        "analytics",
        "<init>",
        "(Llu1/a;)V",
        "Lqu1/c;",
        "actionEvent",
        "a",
        "(Lqu1/c;)Lqu1/c;",
        "Llu1/a;",
        "last-night-sleep_release"
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
.field private final a:Llu1/a;


# direct methods
.method public constructor <init>(Llu1/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpu1/a;->a:Llu1/a;

    return-void
.end method


# virtual methods
.method public final a(Lqu1/c;)Lqu1/c;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lqu1/c$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpu1/a;->a:Llu1/a;

    move-object v1, p1

    check-cast v1, Lqu1/c$a;

    invoke-virtual {v0, v1}, Llu1/a;->b(Lqu1/c$a;)V

    :cond_0
    return-object p1
.end method
