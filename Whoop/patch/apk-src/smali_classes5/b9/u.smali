.class public final synthetic Lb9/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/g;
.implements Lx8/f;


# instance fields
.field public final synthetic w:Lb9/f0;


# direct methods
.method public synthetic constructor <init>(Lb9/f0;)V
    .locals 0

    iput-object p1, p0, Lb9/u;->w:Lb9/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lu8/n;)V
    .locals 2

    check-cast p1, Lu8/h0;

    iget-object v0, p0, Lb9/u;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->G:Lb9/f0;

    new-instance v1, Lu8/g0;

    invoke-direct {v1, p2}, Lu8/g0;-><init>(Lu8/n;)V

    invoke-interface {p1, v0, v1}, Lu8/h0;->onEvents(Lu8/j0;Lu8/g0;)V

    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lu8/h0;

    iget-object v0, p0, Lb9/u;->w:Lb9/f0;

    iget-object v0, v0, Lb9/f0;->p0:Lu8/f0;

    invoke-interface {p1, v0}, Lu8/h0;->onAvailableCommandsChanged(Lu8/f0;)V

    return-void
.end method
