.class public abstract Landroidx/fragment/app/x0;
.super Landroidx/fragment/app/u0;
.source "SourceFile"


# instance fields
.field public final w:Landroidx/fragment/app/r0;

.field public final x:Landroidx/fragment/app/r0;

.field public final y:Landroid/os/Handler;

.field public final z:Landroidx/fragment/app/p1;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/r0;)V
    .locals 1

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/x0;->w:Landroidx/fragment/app/r0;

    iput-object p1, p0, Landroidx/fragment/app/x0;->x:Landroidx/fragment/app/r0;

    iput-object v0, p0, Landroidx/fragment/app/x0;->y:Landroid/os/Handler;

    new-instance p1, Landroidx/fragment/app/p1;

    invoke-direct {p1}, Landroidx/fragment/app/o1;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/x0;->z:Landroidx/fragment/app/p1;

    return-void
.end method
