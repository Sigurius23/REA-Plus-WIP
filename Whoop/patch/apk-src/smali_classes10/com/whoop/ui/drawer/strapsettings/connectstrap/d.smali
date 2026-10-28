.class public final Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;
.super Llx/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llx/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;",
        "Llx/a;",
        "Lqm2/s;",
        "Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;",
        "<init>",
        "()V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "itemType",
        "h0",
        "(Landroid/view/ViewGroup;I)Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;",
        "viewHolder",
        "scanResult",
        "position",
        "Ll83/a0;",
        "g0",
        "(Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;Lqm2/s;I)V",
        "a",
        "app_prodStandardRelease"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Llx/a;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic L(Llx/d;Ljava/lang/Object;I)V
    .locals 0

    check-cast p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;

    check-cast p2, Lqm2/s;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;->g0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;Lqm2/s;I)V

    return-void
.end method

.method public bridge synthetic M(Landroid/view/ViewGroup;I)Llx/d;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;->h0(Landroid/view/ViewGroup;I)Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge c0(Lqm2/s;)Z
    .locals 0

    invoke-super {p0, p1}, Llx/a;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lqm2/s;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lqm2/s;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;->c0(Lqm2/s;)Z

    move-result p1

    return p1
.end method

.method public bridge d0()I
    .locals 1

    invoke-super {p0}, Llx/a;->size()I

    move-result v0

    return v0
.end method

.method public bridge e0(Lqm2/s;)I
    .locals 0

    invoke-super {p0, p1}, Llx/a;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge f0(Lqm2/s;)I
    .locals 0

    invoke-super {p0, p1}, Llx/a;->lastIndexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public g0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;Lqm2/s;I)V
    .locals 1

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "scanResult"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;->a()Landroid/widget/TextView;

    move-result-object p3

    invoke-virtual {p2}, Lqm2/s;->c()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    const-string p2, ""

    :cond_0
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Llx/d;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lhi0/j;->o1:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string p1, "getString(...)"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public h0(Landroid/view/ViewGroup;I)Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;
    .locals 1

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;

    sget v0, Lhi0/f;->o:I

    invoke-virtual {p0, p1, v0}, Lmx/c;->z(Landroid/view/ViewGroup;I)Landroid/view/View;

    move-result-object p1

    const-string v0, "inflateView(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d$a;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public bridge i0(Lqm2/s;)Z
    .locals 0

    invoke-super {p0, p1}, Llx/a;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge indexOf(Ljava/lang/Object;)I
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lqm2/s;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    check-cast p1, Lqm2/s;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;->e0(Lqm2/s;)I

    move-result p1

    return p1
.end method

.method public final bridge lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lqm2/s;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    check-cast p1, Lqm2/s;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;->f0(Lqm2/s;)I

    move-result p1

    return p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lqm2/s;

    :goto_0
    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lqm2/s;

    invoke-virtual {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;->i0(Lqm2/s;)Z

    move-result p1

    return p1
.end method

.method public final bridge size()I
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/d;->d0()I

    move-result v0

    return v0
.end method
