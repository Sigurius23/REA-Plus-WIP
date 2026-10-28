.class public final Ly2/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/s0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Ly2/h0;

.field public final synthetic f:Ly2/n0;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Ly2/h0;Ly2/n0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly2/g0;->a:I

    iput p2, p0, Ly2/g0;->b:I

    iput-object p3, p0, Ly2/g0;->c:Ljava/util/Map;

    iput-object p4, p0, Ly2/g0;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ly2/g0;->e:Ly2/h0;

    iput-object p6, p0, Ly2/g0;->f:Ly2/n0;

    iput-object p7, p0, Ly2/g0;->g:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Ly2/g0;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Ly2/g0;->f:Ly2/n0;

    iget-object v0, v0, Ly2/n0;->w:La3/n0;

    iget-object v1, p0, Ly2/g0;->e:Ly2/h0;

    invoke-virtual {v1}, Ly2/h0;->A()Z

    move-result v1

    iget-object v2, p0, Ly2/g0;->g:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_0

    iget-object v1, v0, La3/n0;->e0:La3/l1;

    iget-object v1, v1, La3/l1;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/ui/node/a;

    iget-object v1, v1, Landroidx/compose/ui/node/a;->q0:La3/w;

    if-eqz v1, :cond_0

    iget-object v0, v1, La3/w0;->L:Ly2/o0;

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    iget-object v0, v0, La3/w0;->L:Ly2/o0;

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Ly2/g0;->d:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Ly2/g0;->b:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Ly2/g0;->a:I

    return v0
.end method
