.class public final Lf2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/c;


# instance fields
.field public w:Lf2/b;

.field public x:Lf2/g;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lf2/i;->w:Lf2/i;

    iput-object v0, p0, Lf2/d;->w:Lf2/b;

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function1;)Lf2/g;
    .locals 1

    new-instance v0, Lf2/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lf2/g;->a:Lkotlin/jvm/functions/Function1;

    iput-object v0, p0, Lf2/d;->x:Lf2/g;

    return-object v0
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, Lf2/d;->w:Lf2/b;

    invoke-interface {v0}, Lf2/b;->getDensity()Ly3/c;

    move-result-object v0

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    return v0
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, Lf2/d;->w:Lf2/b;

    invoke-interface {v0}, Lf2/b;->getDensity()Ly3/c;

    move-result-object v0

    invoke-interface {v0}, Ly3/c;->m0()F

    move-result v0

    return v0
.end method
