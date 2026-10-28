.class public final Lcom/whoop/realtime/presentation/d;
.super Lo52/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/presentation/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000cB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/d;",
        "Lo52/a;",
        "Landroid/view/View;",
        "itemView",
        "Lkotlin/Function1;",
        "Lcom/whoop/realtime/presentation/c$a;",
        "Ll83/a0;",
        "onClick",
        "<init>",
        "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V",
        "Lcom/whoop/realtime/presentation/c;",
        "item",
        "a",
        "(Lcom/whoop/realtime/presentation/c;)V",
        "Lkotlin/jvm/functions/Function1;",
        "b",
        "realtime-activity_release"
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
.field public static final b:Lcom/whoop/realtime/presentation/d$a;

.field public static final c:I

.field private static final d:I

.field private static final e:I


# instance fields
.field private final a:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/realtime/presentation/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/realtime/presentation/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/realtime/presentation/d;->b:Lcom/whoop/realtime/presentation/d$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/realtime/presentation/d;->c:I

    sget v0, Lk52/b;->b:I

    sput v0, Lcom/whoop/realtime/presentation/d;->d:I

    sget v0, Lvu1/a;->b:I

    sput v0, Lcom/whoop/realtime/presentation/d;->e:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lo52/a;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/whoop/realtime/presentation/d;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static synthetic b(Lcom/whoop/realtime/presentation/d;Lcom/whoop/realtime/presentation/c;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/presentation/d;->c(Lcom/whoop/realtime/presentation/d;Lcom/whoop/realtime/presentation/c;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/whoop/realtime/presentation/d;Lcom/whoop/realtime/presentation/c;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/whoop/realtime/presentation/d;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/whoop/realtime/presentation/c;)V
    .locals 5

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/realtime/presentation/c$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lnq0/m;

    const/4 v2, 0x6

    invoke-direct {v1, v2, p0, p1}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    check-cast p1, Lcom/whoop/realtime/presentation/c$a;

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/c$a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/whoop/realtime/presentation/d;->e:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/whoop/realtime/presentation/d;->d:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    move-result v0

    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v2, Lk52/d;->e0:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    sget-object v2, Lcom/whoop/realtime/presentation/e;->a:Lcom/whoop/realtime/presentation/e$a;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/c$a;->c()Llm2/b;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/whoop/realtime/presentation/e$a;->a(Landroid/widget/ImageView;Llm2/b;)V

    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    invoke-static {v2, v3, v4}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setColorFilter(I)V

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x437f0000    # 255.0f

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v2, Lk52/d;->f0:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/c$a;->c()Llm2/b;

    move-result-object v2

    invoke-interface {v2, v1}, Llm2/b;->i(Landroid/widget/TextView;)V

    invoke-virtual {p1}, Lcom/whoop/realtime/presentation/c$a;->c()Llm2/b;

    move-result-object p1

    invoke-interface {p1}, Llm2/b;->b()Ljava/lang/String;

    move-result-object p1

    const-string v2, "getNameKey(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "US"

    const-string v4, "toLowerCase(...)"

    invoke-static {v2, v3, p1, v2, v4}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
