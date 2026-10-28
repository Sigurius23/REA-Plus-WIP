.class final Lx41/h$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx41/h;->h(Lw41/z$a;Leu/g;ILkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraKt$animateLiveMapRouteBounds$2"
    f = "LiveMapCamera.kt"
    l = {
        0x59
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field w:I

.field final synthetic x:Leu/g;

.field final synthetic y:Lcom/google/android/gms/maps/model/LatLngBounds;

.field final synthetic z:I


# direct methods
.method public constructor <init>(Leu/g;Lcom/google/android/gms/maps/model/LatLngBounds;ILkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/g;",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            "I",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lx41/h$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx41/h$e;->x:Leu/g;

    iput-object p2, p0, Lx41/h$e;->y:Lcom/google/android/gms/maps/model/LatLngBounds;

    iput p3, p0, Lx41/h$e;->z:I

    iput-object p4, p0, Lx41/h$e;->E:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx41/h$e;

    iget-object v1, p0, Lx41/h$e;->x:Leu/g;

    iget-object v2, p0, Lx41/h$e;->y:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget v3, p0, Lx41/h$e;->z:I

    iget-object v4, p0, Lx41/h$e;->E:Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lx41/h$e;-><init>(Leu/g;Lcom/google/android/gms/maps/model/LatLngBounds;ILkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lx41/h$e;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lx41/h$e;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx41/h$e;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lx41/h$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx41/h$e;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lx41/h$e;->x:Leu/g;

    iget-object v1, p0, Lx41/h$e;->y:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget v3, p0, Lx41/h$e;->z:I

    invoke-static {v1, v3}, Ls30/e;->l(Lcom/google/android/gms/maps/model/LatLngBounds;I)Lup/a;

    move-result-object v1

    iput v2, p0, Lx41/h$e;->w:I

    const/16 v2, 0x12c

    invoke-virtual {p1, v1, v2, p0}, Leu/g;->b(Lup/a;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lx41/h$e;->E:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lx41/h$e;->y:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
