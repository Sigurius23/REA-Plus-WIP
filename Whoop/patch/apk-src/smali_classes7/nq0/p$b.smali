.class public final Lnq0/p$b;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnq0/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JO\u0010\u0010\u001a\u00020\r2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000c2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lnq0/p$b;",
        "Landroidx/recyclerview/widget/o2;",
        "Landroid/view/View;",
        "itemView",
        "<init>",
        "(Landroid/view/View;)V",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "user",
        "",
        "isTransfer",
        "Landroid/app/Activity;",
        "activity",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onRemove",
        "onTransfer",
        "c",
        "(Lcom/whoop/domain/model/teams/TeamUser;ZLandroid/app/Activity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
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


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    const-string v0, "itemView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lnq0/p$b;->e(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lnq0/p$b;->d(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V

    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c(Lcom/whoop/domain/model/teams/TeamUser;ZLandroid/app/Activity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/teams/TeamUser;",
            "Z",
            "Landroid/app/Activity;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRemove"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTransfer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v1, Lxp0/a0;->K3:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getFullName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getUserName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "@"

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v2, Lxp0/a0;->A3:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v1, Lxp0/a0;->W5:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget-object v1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v2, Lxp0/a0;->u7:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    xor-int/lit8 v2, p2, 0x1

    invoke-static {v0, v2}, Lse/h;->T(Landroid/view/View;Z)V

    invoke-static {v1, p2}, Lse/h;->T(Landroid/view/View;Z)V

    new-instance p2, Lnq0/q;

    const/4 v2, 0x0

    invoke-direct {p2, p4, p1, v2}, Lnq0/q;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUser;I)V

    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p2, Lnq0/q;

    const/4 p4, 0x1

    invoke-direct {p2, p5, p1, p4}, Lnq0/q;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/domain/model/teams/TeamUser;I)V

    invoke-virtual {v1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p4, Lxp0/a0;->B3:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const-string p4, "null cannot be cast to non-null type android.widget.ImageView"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/ImageView;

    iget-object p4, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p4

    sget p5, Lvu1/c;->n:I

    invoke-static {p4, p5}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getAvatarUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p3}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lml/g;

    move-result-object p4

    invoke-virtual {p4, p3}, Lml/g;->e(Landroid/app/Activity;)Lcom/bumptech/glide/h;

    move-result-object p3

    invoke-virtual {p3, p1}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object p1

    sget p3, Lvu1/c;->n:I

    invoke-virtual {p1, p3}, Lpl/a;->j(I)Lpl/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/f;

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    :cond_0
    return-void
.end method
