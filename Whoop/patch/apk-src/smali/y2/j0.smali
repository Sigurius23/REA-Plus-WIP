.class public final Ly2/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/s0;


# instance fields
.field public final synthetic a:Ly2/s0;

.field public final synthetic b:Ly2/n0;

.field public final synthetic c:I

.field public final synthetic d:Ly2/s0;


# direct methods
.method public constructor <init>(Ly2/s0;Ly2/n0;ILy2/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ly2/j0;->b:Ly2/n0;

    iput p3, p0, Ly2/j0;->c:I

    iput-object p4, p0, Ly2/j0;->d:Ly2/s0;

    iput-object p1, p0, Ly2/j0;->a:Ly2/s0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Ly2/j0;->a:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final b()V
    .locals 2

    iget v0, p0, Ly2/j0;->c:I

    iget-object v1, p0, Ly2/j0;->b:Ly2/n0;

    iput v0, v1, Ly2/n0;->z:I

    iget-object v0, p0, Ly2/j0;->d:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->b()V

    iget v0, v1, Ly2/n0;->z:I

    invoke-virtual {v1, v0}, Ly2/n0;->c(I)V

    return-void
.end method

.method public final c()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Ly2/j0;->a:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget-object v0, p0, Ly2/j0;->a:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->getHeight()I

    move-result v0

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget-object v0, p0, Ly2/j0;->a:Ly2/s0;

    invoke-interface {v0}, Ly2/s0;->getWidth()I

    move-result v0

    return v0
.end method
