.class public final Lmq0/g;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmq0/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ3\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0018\u00a8\u0006\u001b"
    }
    d2 = {
        "Lmq0/g;",
        "Landroidx/recyclerview/widget/o2;",
        "Leq0/l0;",
        "dataWidgetItemViewBinding",
        "Lkotlin/Function1;",
        "Liq0/t;",
        "Ll83/a0;",
        "widgetOnClickListener",
        "<init>",
        "(Leq0/l0;Lkotlin/jvm/functions/Function1;)V",
        "Lbq0/c;",
        "dataWidgetImage",
        "Ll83/k;",
        "",
        "authHeader",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "c",
        "(Lbq0/c;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V",
        "a",
        "Leq0/l0;",
        "b",
        "Lkotlin/jvm/functions/Function1;",
        "Lzb/d;",
        "Lzb/d;",
        "progress",
        "d",
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


# static fields
.field private static final d:Lmq0/g$a;

.field public static final e:I


# instance fields
.field private final a:Leq0/l0;

.field private final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final c:Lzb/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmq0/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmq0/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmq0/g;->d:Lmq0/g$a;

    const/16 v0, 0x8

    sput v0, Lmq0/g;->e:I

    return-void
.end method

.method public constructor <init>(Leq0/l0;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leq0/l0;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "dataWidgetItemViewBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "widgetOnClickListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lmq0/g;->a:Leq0/l0;

    iput-object p2, p0, Lmq0/g;->b:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lzb/d;

    iget-object p2, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Lzb/d;-><init>(Landroid/content/Context;)V

    const/high16 p2, 0x40a00000    # 5.0f

    invoke-virtual {p1, p2}, Lzb/d;->b(F)V

    const/high16 p2, 0x41f00000    # 30.0f

    iget-object v0, p1, Lzb/d;->w:Lzb/c;

    iput p2, v0, Lzb/c;->n:F

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    new-instance p2, Landroid/graphics/PorterDuffColorFilter;

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->c0:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v0

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p2, v0, v1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, p2}, Lzb/d;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-virtual {p1}, Lzb/d;->start()V

    iput-object p1, p0, Lmq0/g;->c:Lzb/d;

    return-void
.end method

.method public static final synthetic a(Lmq0/g;)Leq0/l0;
    .locals 0

    iget-object p0, p0, Lmq0/g;->a:Leq0/l0;

    return-object p0
.end method

.method public static final synthetic b(Lmq0/g;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lmq0/g;->b:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method


# virtual methods
.method public final c(Lbq0/c;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbq0/c;",
            "Ll83/k;",
            "Lcom/whoop/data/local/prefs/PreferenceHelper;",
            ")V"
        }
    .end annotation

    const-string v0, "dataWidgetImage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferenceHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lmq0/g;->a:Leq0/l0;

    iget-object v1, v0, Leq0/l0;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lbq0/c;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, v0, Leq0/l0;->a:Landroid/widget/ImageView;

    iget-object v2, p0, Lmq0/g;->c:Lzb/d;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/h;->j()Lcom/bumptech/glide/f;

    move-result-object v1

    sget-object v2, Liq0/q;->a:Liq0/q;

    invoke-virtual {p1}, Lbq0/c;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, p2, p3}, Liq0/q;->b(Ljava/lang/String;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v1, Lcom/bumptech/glide/f;->Y:Ljava/lang/Object;

    const/4 p2, 0x1

    iput-boolean p2, v1, Lcom/bumptech/glide/f;->a0:Z

    new-instance p2, Lmq0/g$b;

    invoke-direct {p2, v0, p1, p0}, Lmq0/g$b;-><init>(Leq0/l0;Lbq0/c;Lmq0/g;)V

    invoke-virtual {v1, p2}, Lcom/bumptech/glide/f;->z(Lql/i;)V

    return-void
.end method
