.class public final Lc9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/c;
.implements Lh5/e;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lc9/m;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lc9/g;->d()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    iput-object v0, p0, Lc9/m;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc9/m;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-static {p1, p2}, Lh3/h;->b(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, Lc9/m;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lc9/m;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    iput-object p1, p0, Lc9/m;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lc9/m;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-virtual {v0, p1}, Landroid/view/ContentInfo$Builder;->setLinkUri(Landroid/net/Uri;)Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public b()Landroid/view/ContentInfo;
    .locals 1

    iget-object v0, p0, Lc9/m;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    return-object v0
.end method

.method public build()Lh5/f;
    .locals 3

    new-instance v0, Lh5/f;

    new-instance v1, Lc9/m;

    iget-object v2, p0, Lc9/m;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/ContentInfo$Builder;

    invoke-virtual {v2}, Landroid/view/ContentInfo$Builder;->build()Landroid/view/ContentInfo;

    move-result-object v2

    invoke-direct {v1, v2}, Lc9/m;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, Lh5/f;-><init>(Lh5/e;)V

    return-object v0
.end method

.method public c()Landroid/content/ClipData;
    .locals 1

    iget-object v0, p0, Lc9/m;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-virtual {v0}, Landroid/view/ContentInfo;->getClip()Landroid/content/ClipData;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lc9/m;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-virtual {v0}, Landroid/view/ContentInfo;->getFlags()I

    move-result v0

    return v0
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Lc9/m;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-virtual {v0, p1}, Landroid/view/ContentInfo$Builder;->setFlags(I)Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public f(Landroid/media/metrics/LogSessionId;)V
    .locals 2

    iget-object v0, p0, Lc9/m;->b:Ljava/lang/Object;

    check-cast v0, Landroid/media/metrics/LogSessionId;

    invoke-static {}, Lc9/g;->d()Landroid/media/metrics/LogSessionId;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/media/metrics/LogSessionId;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lva3/g;->i(Z)V

    iput-object p1, p0, Lc9/m;->b:Ljava/lang/Object;

    return-void
.end method

.method public getSource()I
    .locals 1

    iget-object v0, p0, Lc9/m;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-virtual {v0}, Landroid/view/ContentInfo;->getSource()I

    move-result v0

    return v0
.end method

.method public setExtras(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lc9/m;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-virtual {v0, p1}, Landroid/view/ContentInfo$Builder;->setExtras(Landroid/os/Bundle;)Landroid/view/ContentInfo$Builder;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lc9/m;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContentInfoCompat{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lc9/m;->b:Ljava/lang/Object;

    check-cast v1, Landroid/view/ContentInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
