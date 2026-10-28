.class public final Lcom/whoop/realtime/presentation/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/realtime/presentation/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/realtime/presentation/e$a;",
        "",
        "<init>",
        "()V",
        "Landroid/widget/ImageView;",
        "imageView",
        "Llm2/b;",
        "activity",
        "Ll83/a0;",
        "a",
        "(Landroid/widget/ImageView;Llm2/b;)V",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/e$a;-><init>()V

    return-void
.end method

.method private static final b(Landroid/content/Context;Landroid/widget/ImageView;)V
    .locals 1

    invoke-static {p0}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lcom/bumptech/glide/g;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/g;-><init>(Landroid/view/View;)V

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/h;->k(Lql/i;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/ImageView;Llm2/b;)V
    .locals 2

    const-string v0, "imageView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez p2, :cond_0

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/e$a;->b(Landroid/content/Context;Landroid/widget/ImageView;)V

    return-void

    :cond_0
    instance-of v1, p2, Llm2/d;

    if-eqz v1, :cond_3

    check-cast p2, Llm2/d;

    invoke-virtual {p2}, Llm2/d;->k()Lcom/whoop/service/network/model/Sport;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/whoop/service/network/model/Sport;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/service/network/model/Sport;->getIconUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object p2

    new-instance v0, Lpl/d;

    invoke-direct {v0}, Lpl/a;-><init>()V

    sget-object v1, Lzk/k;->d:Lzk/k;

    invoke-virtual {v0, v1}, Lpl/a;->d(Lzk/k;)Lpl/a;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object p2

    const/high16 v0, -0x80000000

    invoke-virtual {p2, v0, v0}, Lpl/a;->i(II)Lpl/a;

    move-result-object p2

    check-cast p2, Lcom/bumptech/glide/f;

    invoke-virtual {p2}, Lpl/a;->e()Lpl/a;

    move-result-object p2

    check-cast p2, Lcom/bumptech/glide/f;

    invoke-virtual {p2, p1}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    return-void

    :cond_2
    :goto_0
    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/e$a;->b(Landroid/content/Context;Landroid/widget/ImageView;)V

    return-void

    :cond_3
    instance-of v1, p2, Llm2/c;

    if-eqz v1, :cond_5

    check-cast p2, Llm2/c;

    invoke-virtual {p2}, Llm2/c;->s()Z

    move-result p2

    invoke-static {v0}, Lcom/bumptech/glide/b;->e(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/bumptech/glide/g;

    invoke-direct {v1, p1}, Lcom/bumptech/glide/g;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->k(Lql/i;)V

    if-eqz p2, :cond_4

    sget p2, Lk52/c;->h:I

    goto :goto_1

    :cond_4
    sget p2, Lvu1/c;->l:I

    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_5
    return-void
.end method
