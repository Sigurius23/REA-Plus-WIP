.class public abstract Landroidx/lifecycle/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroidx/lifecycle/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/c;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/c;

    invoke-direct {v0}, Landroidx/lifecycle/c;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/x;->a:Landroidx/lifecycle/c;

    return-void
.end method


# virtual methods
.method public abstract a(Landroidx/lifecycle/f0;)V
.end method

.method public abstract b()Landroidx/lifecycle/w;
.end method

.method public final c()Landroidx/lifecycle/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/c;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/lifecycle/x;->a:Landroidx/lifecycle/c;

    return-object v0
.end method

.method public abstract d(Landroidx/lifecycle/f0;)V
.end method
