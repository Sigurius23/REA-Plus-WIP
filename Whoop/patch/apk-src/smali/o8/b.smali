.class public abstract Lo8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroidx/lifecycle/g0;)Lo8/f;
    .locals 2

    new-instance v0, Lo8/f;

    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/f2;

    invoke-interface {v1}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo8/f;-><init>(Landroidx/lifecycle/g0;Landroidx/lifecycle/e2;)V

    return-object v0
.end method


# virtual methods
.method public abstract b(ILo8/a;)Lro/d;
.end method
