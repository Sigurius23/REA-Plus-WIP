.class final Lx41/g$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx41/g;->i(Lw41/z$a;ZZZLeu/g;ILcom/google/android/gms/maps/model/LatLngBounds;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.organism.activitymap.live.LiveMapCameraEffectsKt$LiveMapFollowEffect$1$1"
    f = "LiveMapCameraEffects.kt"
    l = {
        0x72,
        0x80,
        0x8d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Z

.field final synthetic G:Lw41/z$a;

.field final synthetic H:Leu/g;

.field final synthetic I:I

.field final synthetic J:Z

.field final synthetic K:Lcom/google/android/gms/maps/model/LatLngBounds;

.field final synthetic L:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(ZZLw41/z$a;Leu/g;IZLcom/google/android/gms/maps/model/LatLngBounds;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lw41/z$a;",
            "Leu/g;",
            "IZ",
            "Lcom/google/android/gms/maps/model/LatLngBounds;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lx41/g$c;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lx41/g$c;->E:Z

    iput-boolean p2, p0, Lx41/g$c;->F:Z

    iput-object p3, p0, Lx41/g$c;->G:Lw41/z$a;

    iput-object p4, p0, Lx41/g$c;->H:Leu/g;

    iput p5, p0, Lx41/g$c;->I:I

    iput-boolean p6, p0, Lx41/g$c;->J:Z

    iput-object p7, p0, Lx41/g$c;->K:Lcom/google/android/gms/maps/model/LatLngBounds;

    iput-object p8, p0, Lx41/g$c;->L:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lx41/g$c;

    iget-boolean v1, p0, Lx41/g$c;->E:Z

    iget-boolean v2, p0, Lx41/g$c;->F:Z

    iget-object v3, p0, Lx41/g$c;->G:Lw41/z$a;

    iget-object v4, p0, Lx41/g$c;->H:Leu/g;

    iget v5, p0, Lx41/g$c;->I:I

    iget-boolean v6, p0, Lx41/g$c;->J:Z

    iget-object v7, p0, Lx41/g$c;->K:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v8, p0, Lx41/g$c;->L:Lkotlin/jvm/functions/Function1;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lx41/g$c;-><init>(ZZLw41/z$a;Leu/g;IZLcom/google/android/gms/maps/model/LatLngBounds;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lx41/g$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lx41/g$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lx41/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lx41/g$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lx41/g$c;->z:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lx41/g$c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v0, p0, Lx41/g$c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, p0

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lx41/g$c;->x:Ljava/lang/Object;

    check-cast v0, Lw41/w;

    iget-object v0, p0, Lx41/g$c;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, p0

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, p0

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lx41/g$c;->E:Z

    if-nez p1, :cond_4

    return-object v5

    :cond_4
    iget-boolean p1, p0, Lx41/g$c;->F:Z

    if-eqz p1, :cond_6

    iget-object v6, p0, Lx41/g$c;->G:Lw41/z$a;

    iget-object v7, p0, Lx41/g$c;->H:Leu/g;

    iget v8, p0, Lx41/g$c;->I:I

    iget-boolean v9, p0, Lx41/g$c;->J:Z

    iget-object v10, p0, Lx41/g$c;->K:Lcom/google/android/gms/maps/model/LatLngBounds;

    iget-object v11, p0, Lx41/g$c;->L:Lkotlin/jvm/functions/Function1;

    iput v3, p0, Lx41/g$c;->z:I

    move-object v12, p0

    invoke-static/range {v6 .. v12}, Lx41/c;->a(Lw41/z$a;Leu/g;IZLcom/google/android/gms/maps/model/LatLngBounds;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_0
    return-object v5

    :cond_6
    move-object v12, p0

    iget-object p1, v12, Lx41/g$c;->G:Lw41/z$a;

    invoke-static {p1}, Lw41/p;->b(Lw41/z$a;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v1, 0x0

    if-ge p1, v4, :cond_8

    iget-object p1, v12, Lx41/g$c;->G:Lw41/z$a;

    invoke-virtual {p1}, Lw41/z$a;->c()Lw41/w;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object v2, v12, Lx41/g$c;->H:Leu/g;

    new-instance v3, Lx41/g$c$a;

    invoke-direct {v3, v2, p1, v1}, Lx41/g$c$a;-><init>(Leu/g;Lw41/w;Lq83/d;)V

    iput-object v1, v12, Lx41/g$c;->w:Ljava/lang/Object;

    iput-object v1, v12, Lx41/g$c;->x:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v12, Lx41/g$c;->y:I

    iput v4, v12, Lx41/g$c;->z:I

    invoke-static {v3, p0}, Lw41/c;->d(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_2

    :cond_7
    :goto_1
    return-object v5

    :cond_8
    iget-object p1, v12, Lx41/g$c;->G:Lw41/z$a;

    invoke-static {p1}, Lx41/b;->a(Lw41/z$a;)Lcom/google/android/gms/maps/model/LatLngBounds;

    move-result-object p1

    iget-object v3, v12, Lx41/g$c;->K:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {p1, v3}, Lx41/b;->b(Lcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/LatLngBounds;)Z

    move-result p1

    if-nez p1, :cond_9

    return-object v5

    :cond_9
    iget-object p1, v12, Lx41/g$c;->G:Lw41/z$a;

    iget-object v3, v12, Lx41/g$c;->H:Leu/g;

    iget v4, v12, Lx41/g$c;->I:I

    iget-object v6, v12, Lx41/g$c;->L:Lkotlin/jvm/functions/Function1;

    iput-object v1, v12, Lx41/g$c;->w:Ljava/lang/Object;

    iput-object v1, v12, Lx41/g$c;->x:Ljava/lang/Object;

    iput v2, v12, Lx41/g$c;->z:I

    invoke-static {p1, v3, v4, v6, p0}, Lx41/h;->h(Lw41/z$a;Leu/g;ILkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    :goto_2
    return-object v0

    :cond_a
    :goto_3
    return-object v5
.end method
