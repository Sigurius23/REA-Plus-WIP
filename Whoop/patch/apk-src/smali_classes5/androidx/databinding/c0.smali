.class public final Landroidx/databinding/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/view/ViewStub;

.field public b:Landroidx/databinding/a0;

.field public c:Landroid/view/View;

.field public d:Landroid/view/ViewStub$OnInflateListener;

.field public e:Landroidx/databinding/a0;


# direct methods
.method public constructor <init>(Landroid/view/ViewStub;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/databinding/b0;

    invoke-direct {v0, p0}, Landroidx/databinding/b0;-><init>(Landroidx/databinding/c0;)V

    iput-object p1, p0, Landroidx/databinding/c0;->a:Landroid/view/ViewStub;

    invoke-virtual {p1, v0}, Landroid/view/ViewStub;->setOnInflateListener(Landroid/view/ViewStub$OnInflateListener;)V

    return-void
.end method
