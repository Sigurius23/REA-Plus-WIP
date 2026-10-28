.class public final synthetic Lb3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;


# instance fields
.field public final synthetic w:Landroidx/compose/ui/platform/AndroidComposeView;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/m;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    return-void
.end method


# virtual methods
.method public final onTouchModeChanged(Z)V
    .locals 2

    iget-object v0, p0, Lb3/m;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v0, v0, Landroidx/compose/ui/platform/AndroidComposeView;->P0:Lr2/c;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    :goto_0
    iget-object v0, v0, Lr2/c;->a:Lp1/k1;

    new-instance v1, Lr2/a;

    invoke-direct {v1, p1}, Lr2/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
