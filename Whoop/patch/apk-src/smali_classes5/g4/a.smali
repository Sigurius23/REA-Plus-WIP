.class public final Lg4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:I

.field public d:F


# direct methods
.method public constructor <init>(Ljava/lang/String;F)V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    .line 7
    iput v0, p0, Lg4/a;->c:I

    .line 8
    iput-object p1, p0, Lg4/a;->a:Ljava/lang/String;

    const/16 p1, 0x385

    .line 9
    iput p1, p0, Lg4/a;->b:I

    .line 10
    iput p2, p0, Lg4/a;->d:F

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 2
    iput v0, p0, Lg4/a;->d:F

    .line 3
    iput-object p1, p0, Lg4/a;->a:Ljava/lang/String;

    const/16 p1, 0x386

    .line 4
    iput p1, p0, Lg4/a;->b:I

    .line 5
    iput p2, p0, Lg4/a;->c:I

    return-void
.end method


# virtual methods
.method public final a()Lg4/a;
    .locals 2

    new-instance v0, Lg4/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/high16 v1, -0x80000000

    iput v1, v0, Lg4/a;->c:I

    const/high16 v1, 0x7fc00000    # Float.NaN

    iput v1, v0, Lg4/a;->d:F

    iget-object v1, p0, Lg4/a;->a:Ljava/lang/String;

    iput-object v1, v0, Lg4/a;->a:Ljava/lang/String;

    iget v1, p0, Lg4/a;->b:I

    iput v1, v0, Lg4/a;->b:I

    iget v1, p0, Lg4/a;->c:I

    iput v1, v0, Lg4/a;->c:I

    iget v1, p0, Lg4/a;->d:F

    iput v1, v0, Lg4/a;->d:F

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg4/a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c(F)V
    .locals 0

    iput p1, p0, Lg4/a;->d:F

    return-void
.end method

.method public final d(I)V
    .locals 0

    iput p1, p0, Lg4/a;->c:I

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lg4/a;->a:Ljava/lang/String;

    const/16 v2, 0x3a

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lg4/a;->b:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "????"

    invoke-static {v0, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lg4/a;->c:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "00000000"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "#"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x8

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lg4/a;->d:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lg4/a;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
