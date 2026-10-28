.class public final Landroidx/databinding/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# instance fields
.field public final synthetic w:Landroidx/databinding/a0;


# direct methods
.method public constructor <init>(Landroidx/databinding/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/databinding/t;->w:Landroidx/databinding/a0;

    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 0

    iget-object p1, p0, Landroidx/databinding/t;->w:Landroidx/databinding/a0;

    invoke-static {p1}, Landroidx/databinding/a0;->access$100(Landroidx/databinding/a0;)Ljava/lang/Runnable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
