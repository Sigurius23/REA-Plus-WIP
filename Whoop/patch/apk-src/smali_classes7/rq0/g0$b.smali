.class public final Lrq0/g0$b;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrq0/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lrq0/g0$b;",
        "Landroidx/recyclerview/widget/o2;",
        "Landroid/view/View;",
        "itemView",
        "<init>",
        "(Landroid/view/View;)V",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "user",
        "",
        "isTransfer",
        "Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;",
        "activity",
        "",
        "position",
        "Ll83/a0;",
        "c",
        "(Lcom/whoop/domain/model/teams/TeamUser;ZLcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;I)V",
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

.method public static synthetic a(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lrq0/g0$b;->e(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lrq0/g0$b;->d(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V

    return-void
.end method

.method private static final d(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->a0(Lcom/whoop/domain/model/teams/TeamUser;)V

    return-void
.end method

.method private static final e(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->d0(Lcom/whoop/domain/model/teams/TeamUser;)V

    return-void
.end method


# virtual methods
.method public final c(Lcom/whoop/domain/model/teams/TeamUser;ZLcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;I)V
    .locals 3

    const-string p4, "activity"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object p4, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v0, Lxp0/a0;->K3:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getFullName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p4, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v0, Lxp0/a0;->A3:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getUserName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "@"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p4, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v0, Lxp0/a0;->W5:I

    invoke-virtual {p4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/ImageView;

    iget-object v0, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget v1, Lxp0/a0;->u7:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    xor-int/lit8 v1, p2, 0x1

    invoke-static {p4, v1}, Lse/h;->T(Landroid/view/View;Z)V

    invoke-static {v0, p2}, Lse/h;->T(Landroid/view/View;Z)V

    new-instance p2, Lrq0/h0;

    const/4 v1, 0x0

    invoke-direct {p2, p3, p1, v1}, Lrq0/h0;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;I)V

    invoke-virtual {p4, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p2, Lrq0/h0;

    const/4 p4, 0x1

    invoke-direct {p2, p3, p1, p4}, Lrq0/h0;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;I)V

    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    sget p4, Lxp0/a0;->B3:I

    invoke-virtual {p2, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const-string p4, "null cannot be cast to non-null type android.widget.ImageView"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/ImageView;

    sget p4, Lvu1/c;->n:I

    invoke-virtual {p3, p4}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p4

    invoke-virtual {p2, p4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/TeamUser;->getAvatarUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p3}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lml/g;

    move-result-object p4

    invoke-virtual {p4, p3}, Lml/g;->h(Landroidx/fragment/app/r0;)Lcom/bumptech/glide/h;

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
