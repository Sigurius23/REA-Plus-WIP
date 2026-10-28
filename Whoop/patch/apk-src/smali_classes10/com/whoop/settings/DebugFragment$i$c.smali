.class public final Lcom/whoop/settings/DebugFragment$i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/DebugFragment$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:[Lec3/l;

.field final synthetic x:Lt83/a;

.field final synthetic y:Lcom/whoop/settings/DebugFragment;


# direct methods
.method public constructor <init>([Lec3/l;Lt83/a;Lcom/whoop/settings/DebugFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/settings/DebugFragment$i$c;->w:[Lec3/l;

    iput-object p2, p0, Lcom/whoop/settings/DebugFragment$i$c;->x:Lt83/a;

    iput-object p3, p0, Lcom/whoop/settings/DebugFragment$i$c;->y:Lcom/whoop/settings/DebugFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/whoop/settings/DebugFragment$i$c;->w:[Lec3/l;

    new-instance v1, Lcom/whoop/settings/DebugFragment$i$c$a;

    invoke-direct {v1, v0}, Lcom/whoop/settings/DebugFragment$i$c$a;-><init>([Lec3/l;)V

    new-instance v2, Lcom/whoop/settings/DebugFragment$i$c$b;

    iget-object v3, p0, Lcom/whoop/settings/DebugFragment$i$c;->x:Lt83/a;

    iget-object v4, p0, Lcom/whoop/settings/DebugFragment$i$c;->y:Lcom/whoop/settings/DebugFragment;

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, Lcom/whoop/settings/DebugFragment$i$c$b;-><init>(Lq83/d;Lt83/a;Lcom/whoop/settings/DebugFragment;)V

    invoke-static {v1, p1, v2, p2, v0}, Lfc3/b;->a(Lc93/a;Lec3/m;Lkotlin/jvm/functions/Function3;Lq83/d;[Lec3/l;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
