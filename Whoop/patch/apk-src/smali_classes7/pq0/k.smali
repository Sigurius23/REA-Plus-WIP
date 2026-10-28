.class public final Lpq0/k;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpq0/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Lpq0/k;",
        "Landroidx/recyclerview/widget/o2;",
        "Leq0/u3;",
        "widgetItemViewBinding",
        "<init>",
        "(Leq0/u3;)V",
        "Lcom/whoop/domain/model/teams/Widget;",
        "widget",
        "Ll83/k;",
        "",
        "authHeader",
        "Lcom/whoop/data/local/prefs/PreferenceHelper;",
        "preferenceHelper",
        "Ll83/a0;",
        "a",
        "(Lcom/whoop/domain/model/teams/Widget;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V",
        "Leq0/u3;",
        "Lzb/d;",
        "b",
        "Lzb/d;",
        "progress",
        "c",
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
.field private static final c:Lpq0/k$a;

.field public static final d:I


# instance fields
.field private final a:Leq0/u3;

.field private final b:Lzb/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpq0/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpq0/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lpq0/k;->c:Lpq0/k$a;

    const/16 v0, 0x8

    sput v0, Lpq0/k;->d:I

    return-void
.end method

.method public constructor <init>(Leq0/u3;)V
    .locals 3

    const-string v0, "widgetItemViewBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lpq0/k;->a:Leq0/u3;

    new-instance p1, Lzb/d;

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lzb/d;-><init>(Landroid/content/Context;)V

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-virtual {p1, v0}, Lzb/d;->b(F)V

    const/high16 v0, 0x42200000    # 40.0f

    iget-object v1, p1, Lzb/d;->w:Lzb/c;

    iput v0, v1, Lzb/c;->n:F

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lvu1/a;->c0:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    move-result v1

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, v0}, Lzb/d;->setColorFilter(Landroid/graphics/ColorFilter;)V

    invoke-virtual {p1}, Lzb/d;->start()V

    iput-object p1, p0, Lpq0/k;->b:Lzb/d;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/domain/model/teams/Widget;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/teams/Widget;",
            "Ll83/k;",
            "Lcom/whoop/data/local/prefs/PreferenceHelper;",
            ")V"
        }
    .end annotation

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preferenceHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/o2;->setIsRecyclable(Z)V

    iget-object v0, p0, Lpq0/k;->a:Leq0/u3;

    iget-object v1, v0, Leq0/u3;->a:Landroid/widget/ImageView;

    iget-object v2, p0, Lpq0/k;->b:Lzb/d;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/h;->j()Lcom/bumptech/glide/f;

    move-result-object v1

    sget-object v2, Liq0/q;->a:Liq0/q;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Widget;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1, p2, p3}, Liq0/q;->b(Ljava/lang/String;Ll83/k;Lcom/whoop/data/local/prefs/PreferenceHelper;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v1, Lcom/bumptech/glide/f;->Y:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, v1, Lcom/bumptech/glide/f;->a0:Z

    new-instance p1, Lpq0/k$b;

    invoke-direct {p1, v0}, Lpq0/k$b;-><init>(Leq0/u3;)V

    invoke-virtual {v1, p1}, Lcom/bumptech/glide/f;->z(Lql/i;)V

    return-void
.end method
