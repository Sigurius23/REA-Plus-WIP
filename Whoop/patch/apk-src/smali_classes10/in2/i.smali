.class public abstract Lin2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001b\u0010\u0008\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u0003*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001d\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\n2\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u0003*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000f\u0010\u000c\u001a\u001d\u0010\u0010\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0005\u001a\u001b\u0010\u0011\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0011\u0010\t\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroid/content/Context;",
        "",
        "messageId",
        "Ll83/a0;",
        "c",
        "(Landroid/content/Context;I)V",
        "",
        "message",
        "d",
        "(Landroid/content/Context;Ljava/lang/CharSequence;)V",
        "Landroidx/fragment/app/m0;",
        "b",
        "(Landroidx/fragment/app/m0;Ljava/lang/CharSequence;)Ll83/a0;",
        "a",
        "(Landroidx/fragment/app/m0;I)Ll83/a0;",
        "e",
        "f",
        "g",
        "core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Landroidx/fragment/app/m0;I)Ll83/a0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lin2/i;->c(Landroid/content/Context;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(Landroidx/fragment/app/m0;Ljava/lang/CharSequence;)Ll83/a0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lin2/i;->d(Landroid/content/Context;Ljava/lang/CharSequence;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final c(Landroid/content/Context;I)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public static final d(Landroid/content/Context;Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method

.method public static final e(Landroidx/fragment/app/m0;Ljava/lang/CharSequence;)Ll83/a0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lin2/i;->g(Landroid/content/Context;Ljava/lang/CharSequence;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final f(Landroid/content/Context;I)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method

.method public static final g(Landroid/content/Context;Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method
