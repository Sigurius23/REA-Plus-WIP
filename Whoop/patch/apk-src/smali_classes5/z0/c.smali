.class public final synthetic Lz0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lz0/c;->a:I

    iput-object p2, p0, Lz0/c;->b:Ljava/lang/Object;

    iput-object p3, p0, Lz0/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 3

    iget p1, p0, Lz0/c;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Lz0/c;->b:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    iget-object v0, p0, Lz0/c;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/textclassifier/TextClassification;

    invoke-virtual {v0}, Landroid/view/textclassifier/TextClassification;->getText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Landroid/view/textclassifier/TextClassification;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const/high16 v2, 0xc000000

    invoke-static {p1, v1, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_1

    invoke-static {p1}, Lb3/g1;->q(Landroid/app/PendingIntent;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/app/PendingIntent;->send()V

    :goto_1
    const/4 p1, 0x1

    return p1

    :pswitch_0
    iget-object p1, p0, Lz0/c;->b:Ljava/lang/Object;

    check-cast p1, Lx0/d;

    iget-object v0, p0, Lz0/c;->c:Ljava/lang/Object;

    check-cast v0, Lz0/d;

    iget-object p1, p1, Lx0/d;->d:Lkotlin/jvm/functions/Function1;

    iget-object v0, v0, Lz0/d;->a:Lz0/e;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
