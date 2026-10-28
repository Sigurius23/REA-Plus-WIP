.class public final Lug1/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/c;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lec3/l;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1",
        "Lec3/l;",
        "Lec3/m;",
        "collector",
        "Ll83/a0;",
        "collect",
        "(Lec3/m;Lq83/d;)Ljava/lang/Object;",
        "kotlinx-coroutines-core"
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
.field final synthetic w:Lec3/l;

.field final synthetic x:Lug1/c;


# direct methods
.method public constructor <init>(Lec3/l;Lug1/c;)V
    .locals 0

    iput-object p1, p0, Lug1/c$e;->w:Lec3/l;

    iput-object p2, p0, Lug1/c$e;->x:Lug1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lug1/c$e;->w:Lec3/l;

    new-instance v1, Lug1/c$e$a;

    iget-object v2, p0, Lug1/c$e;->x:Lug1/c;

    invoke-direct {v1, p1, v2}, Lug1/c$e$a;-><init>(Lec3/m;Lug1/c;)V

    invoke-interface {v0, v1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
