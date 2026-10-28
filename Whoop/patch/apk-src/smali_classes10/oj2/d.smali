.class public final Loj2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Loj2/d;",
        "",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onEvent",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lc41/w;",
        "viewState",
        "a",
        "(Lc41/w;)V",
        "Lm91/u;",
        "b",
        "(Lm91/u;)V",
        "Lkotlin/jvm/functions/Function1;",
        "getOnEvent",
        "()Lkotlin/jvm/functions/Function1;",
        "stress_release"
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
.field private final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loj2/d;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method private final a(Lc41/w;)V
    .locals 3

    iget-object v0, p0, Loj2/d;->a:Lkotlin/jvm/functions/Function1;

    new-instance v1, Llj2/a$a;

    invoke-virtual {p1}, Lc41/w;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lc41/w;->b()Lcom/whoop/navigation/ActivityDetailType;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Llj2/a$a;-><init>(Ljava/lang/String;Lcom/whoop/navigation/ActivityDetailType;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Lm91/u;)V
    .locals 1

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lc41/w;

    if-eqz v0, :cond_0

    check-cast p1, Lc41/w;

    invoke-direct {p0, p1}, Loj2/d;->a(Lc41/w;)V

    :cond_0
    return-void
.end method
