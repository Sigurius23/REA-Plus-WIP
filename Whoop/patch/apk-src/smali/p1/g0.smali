.class public final Lp1/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/z1;


# instance fields
.field public final w:Lkotlin/jvm/functions/Function1;

.field public x:Lp1/h0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/g0;->w:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lp1/g0;->w:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lp1/x;->b:Lp1/i0;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/h0;

    iput-object v0, p0, Lp1/g0;->x:Lp1/h0;

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lp1/g0;->x:Lp1/h0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lp1/h0;->dispose()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lp1/g0;->x:Lp1/h0;

    return-void
.end method
