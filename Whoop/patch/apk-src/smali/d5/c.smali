.class public final Ld5/c;
.super Laj/d;
.source "SourceFile"


# instance fields
.field public final x:Ld5/b;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V
    .locals 1

    invoke-direct {p0, p1}, Laj/d;-><init>(Ljava/lang/Object;)V

    new-instance v0, Ld5/b;

    invoke-direct {v0, p0, p1}, Ld5/b;-><init>(Ld5/c;Lcom/whoop/ui/home/redesign/view/MainActivity;)V

    iput-object v0, p0, Ld5/c;->x:Ld5/b;

    return-void
.end method


# virtual methods
.method public final p()V
    .locals 3

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const-string v2, "activity.theme"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0, v1, v2}, Laj/d;->A(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Ld5/c;->x:Ld5/b;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    return-void
.end method
