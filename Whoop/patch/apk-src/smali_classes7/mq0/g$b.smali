.class public final Lmq0/g$b;
.super Lql/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq0/g;->c(Lbq0/c;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lql/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0005\u001a\u000c\u0012\u0006\u0008\u0000\u0012\u00020\u0002\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000e\u001a\u00020\u00062\u0008\u0010\r\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000c\u00a8\u0006\u000f"
    }
    d2 = {
        "mq0/g$b",
        "Lql/c;",
        "Landroid/graphics/Bitmap;",
        "resource",
        "Lrl/c;",
        "transition",
        "Ll83/a0;",
        "j",
        "(Landroid/graphics/Bitmap;Lrl/c;)V",
        "Landroid/graphics/drawable/Drawable;",
        "errorDrawable",
        "g",
        "(Landroid/graphics/drawable/Drawable;)V",
        "placeholder",
        "e",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lbq0/c;

.field final synthetic F:Lmq0/g;

.field final synthetic z:Leq0/l0;


# direct methods
.method public constructor <init>(Leq0/l0;Lbq0/c;Lmq0/g;)V
    .locals 0

    iput-object p1, p0, Lmq0/g$b;->z:Leq0/l0;

    iput-object p2, p0, Lmq0/g$b;->E:Lbq0/c;

    iput-object p3, p0, Lmq0/g$b;->F:Lmq0/g;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lql/c;-><init>(I)V

    return-void
.end method

.method public static synthetic i(Lmq0/g;Lbq0/c;Landroid/graphics/Bitmap;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmq0/g$b;->k(Lmq0/g;Lbq0/c;Landroid/graphics/Bitmap;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lmq0/g;Lbq0/c;Landroid/graphics/Bitmap;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmq0/g;->b(Lmq0/g;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    new-instance p3, Liq0/t;

    invoke-virtual {p1}, Lbq0/c;->f()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Liq0/t;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;Lrl/c;)V
    .locals 0

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lmq0/g$b;->j(Landroid/graphics/Bitmap;Lrl/c;)V

    return-void
.end method

.method public e(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public g(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object p1, p0, Lmq0/g$b;->z:Leq0/l0;

    iget-object p1, p1, Leq0/l0;->a:Landroid/widget/ImageView;

    sget v0, Lxp0/z;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public j(Landroid/graphics/Bitmap;Lrl/c;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lrl/c;",
            ")V"
        }
    .end annotation

    const-string p2, "resource"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lmq0/g$b;->z:Leq0/l0;

    iget-object p2, p2, Leq0/l0;->a:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    iget-object p2, p0, Lmq0/g$b;->E:Lbq0/c;

    invoke-virtual {p2}, Lbq0/c;->b()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lmq0/g$b;->F:Lmq0/g;

    invoke-static {p2}, Lmq0/g;->a(Lmq0/g;)Leq0/l0;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p2

    const-string v0, "getRoot(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmq0/g$b;->F:Lmq0/g;

    iget-object v1, p0, Lmq0/g$b;->E:Lbq0/c;

    new-instance v2, Ljs2/h;

    const/16 v3, 0x16

    invoke-direct {v2, v0, v1, p1, v3}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p2, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method
