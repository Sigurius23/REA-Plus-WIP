.class public final Lj5/b;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/inputmethod/InputConnection;Lhn/p;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lj5/b;->a:I

    .line 3
    iput-object p2, p0, Lj5/b;->b:Ljava/lang/Object;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    return-void
.end method

.method public constructor <init>(Lj6/b;Ls40/e1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj5/b;->a:I

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    .line 2
    iput-object p2, p0, Lj5/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 7

    iget v0, p0, Lj5/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/InputConnectionWrapper;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lj5/b;->b:Ljava/lang/Object;

    check-cast v0, Lhn/p;

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lhm/d;

    new-instance v2, Lhm/d;

    const/16 v3, 0x11

    invoke-direct {v2, p1, v3}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    const/16 v3, 0x12

    invoke-direct {v1, v2, v3}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    :goto_0
    iget-object v0, v0, Lhn/p;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/AppCompatEditText;

    and-int/lit8 v2, p2, 0x1

    if-eqz v2, :cond_2

    :try_start_0
    iget-object v2, v1, Lhm/d;->x:Ljava/lang/Object;

    check-cast v2, Lhm/d;

    iget-object v2, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v2, Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v2}, Landroid/view/inputmethod/InputContentInfo;->requestPermission()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, v1, Lhm/d;->x:Ljava/lang/Object;

    check-cast v2, Lhm/d;

    iget-object v2, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v2, Landroid/view/inputmethod/InputContentInfo;

    new-instance v3, Landroid/os/Bundle;

    if-nez p3, :cond_1

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    goto :goto_1

    :cond_1
    invoke-direct {v3, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    :goto_1
    const-string v4, "androidx.core.view.extra.INPUT_CONTENT_INFO"

    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "InputConnectionCompat"

    const-string v2, "Can\'t insert content from IME; requestPermission() failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_4

    :cond_2
    move-object v3, p3

    :goto_2
    new-instance v2, Landroid/content/ClipData;

    iget-object v1, v1, Lhm/d;->x:Ljava/lang/Object;

    check-cast v1, Lhm/d;

    iget-object v1, v1, Lhm/d;->x:Ljava/lang/Object;

    check-cast v1, Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v1}, Landroid/view/inputmethod/InputContentInfo;->getDescription()Landroid/content/ClipDescription;

    move-result-object v4

    new-instance v5, Landroid/content/ClipData$Item;

    invoke-virtual {v1}, Landroid/view/inputmethod/InputContentInfo;->getContentUri()Landroid/net/Uri;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/content/ClipData$Item;-><init>(Landroid/net/Uri;)V

    invoke-direct {v2, v4, v5}, Landroid/content/ClipData;-><init>(Landroid/content/ClipDescription;Landroid/content/ClipData$Item;)V

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1f

    const/4 v6, 0x2

    if-lt v4, v5, :cond_3

    new-instance v4, Lc9/m;

    invoke-direct {v4, v2, v6}, Lc9/m;-><init>(Landroid/content/ClipData;I)V

    goto :goto_3

    :cond_3
    new-instance v4, Lh5/d;

    invoke-direct {v4}, Lh5/d;-><init>()V

    iput-object v2, v4, Lh5/d;->b:Landroid/content/ClipData;

    iput v6, v4, Lh5/d;->c:I

    :goto_3
    invoke-virtual {v1}, Landroid/view/inputmethod/InputContentInfo;->getLinkUri()Landroid/net/Uri;

    move-result-object v1

    invoke-interface {v4, v1}, Lh5/c;->a(Landroid/net/Uri;)V

    invoke-interface {v4, v3}, Lh5/c;->setExtras(Landroid/os/Bundle;)V

    invoke-interface {v4}, Lh5/c;->build()Lh5/f;

    move-result-object v1

    invoke-static {v0, v1}, Lh5/p0;->j(Landroid/view/View;Lh5/f;)Lh5/f;

    move-result-object v0

    if-nez v0, :cond_4

    const/4 p1, 0x1

    goto :goto_5

    :cond_4
    :goto_4
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/InputConnectionWrapper;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    move-result p1

    :goto_5
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public deleteSurroundingText(II)Z
    .locals 2

    iget v0, p0, Lj5/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    move-result p1

    return p1

    :pswitch_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/view/inputmethod/InputConnectionWrapper;->getTextBeforeCursor(II)Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lj5/b;->b:Ljava/lang/Object;

    check-cast v0, Ls40/e1;

    if-eqz v0, :cond_0

    check-cast v0, Lq30/u0;

    invoke-virtual {v0}, Lq30/u0;->E()V

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;->deleteSurroundingText(II)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
