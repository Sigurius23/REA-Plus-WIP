.class public Lcom/whoop/ui/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcr/c;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lcr/c;

    iput-object p1, p0, Lcom/whoop/ui/p;->a:Lcr/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/p;->a:Lcr/c;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcr/c;->i(Z)V

    :cond_0
    return-void
.end method

.method public b(IIII)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/p;->a:Lcr/c;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lcr/c;->g:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    if-ne v2, p1, :cond_0

    iget v2, v1, Landroid/graphics/Rect;->top:I

    if-ne v2, p2, :cond_0

    iget v2, v1, Landroid/graphics/Rect;->right:I

    if-ne v2, p3, :cond_0

    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    if-ne v2, p4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    const/4 p1, 0x1

    iput-boolean p1, v0, Lcr/c;->S:Z

    :cond_1
    :goto_0
    return-void
.end method
