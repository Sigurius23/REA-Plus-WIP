.class public final Lrb3/x;
.super Lrb3/n;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final d:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lrb3/x;->c:I

    .line 8
    const-string v0, "must have exactly 2 value parameters"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lrb3/n;-><init>(Ljava/lang/String;I)V

    const/4 v0, 0x2

    iput v0, p0, Lrb3/x;->d:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lrb3/x;->c:I

    .line 1
    const-string v0, "must have at least "

    const-string v1, " value parameter"

    .line 2
    invoke-static {p1, v0, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    if-le p1, v1, :cond_0

    .line 3
    const-string v1, "s"

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lrb3/n;-><init>(Ljava/lang/String;I)V

    iput p1, p0, Lrb3/x;->d:I

    return-void
.end method


# virtual methods
.method public final a(Lha3/e;)Z
    .locals 1

    iget v0, p0, Lrb3/x;->c:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget v0, p0, Lrb3/x;->d:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_0
    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget v0, p0, Lrb3/x;->d:I

    if-lt p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
