.class public final Landroidx/databinding/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewStub$OnInflateListener;


# instance fields
.field public final synthetic a:Landroidx/databinding/c0;


# direct methods
.method public constructor <init>(Landroidx/databinding/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/databinding/b0;->a:Landroidx/databinding/c0;

    return-void
.end method


# virtual methods
.method public final onInflate(Landroid/view/ViewStub;Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Landroidx/databinding/b0;->a:Landroidx/databinding/c0;

    iput-object p2, v0, Landroidx/databinding/c0;->c:Landroid/view/View;

    iget-object v1, v0, Landroidx/databinding/c0;->e:Landroidx/databinding/a0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/ViewStub;->getLayoutResource()I

    move-result v1

    sget-object v2, Landroidx/databinding/g;->a:Landroidx/databinding/DataBinderMapperImpl;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p2, v1}, Landroidx/databinding/MergedDataBinderMapper;->getDataBinder(Landroidx/databinding/f;Landroid/view/View;I)Landroidx/databinding/a0;

    move-result-object v1

    iput-object v1, v0, Landroidx/databinding/c0;->b:Landroidx/databinding/a0;

    iput-object v3, v0, Landroidx/databinding/c0;->a:Landroid/view/ViewStub;

    iget-object v1, v0, Landroidx/databinding/c0;->d:Landroid/view/ViewStub$OnInflateListener;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1, p2}, Landroid/view/ViewStub$OnInflateListener;->onInflate(Landroid/view/ViewStub;Landroid/view/View;)V

    iput-object v3, v0, Landroidx/databinding/c0;->d:Landroid/view/ViewStub$OnInflateListener;

    :cond_0
    iget-object p1, v0, Landroidx/databinding/c0;->e:Landroidx/databinding/a0;

    invoke-virtual {p1}, Landroidx/databinding/a0;->invalidateAll()V

    iget-object p1, v0, Landroidx/databinding/c0;->e:Landroidx/databinding/a0;

    invoke-virtual {p1}, Landroidx/databinding/a0;->forceExecuteBindings()V

    return-void
.end method
