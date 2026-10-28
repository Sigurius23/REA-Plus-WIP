.class public final Lxe3/h;
.super Lcf3/a;
.source "SourceFile"


# instance fields
.field public final a:Laf3/i;

.field public b:Ljava/lang/String;

.field public final c:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>(IIC)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Laf3/i;

    invoke-direct {v0}, Laf3/t;-><init>()V

    iput-object v0, p0, Lxe3/h;->a:Laf3/i;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v1, p0, Lxe3/h;->c:Ljava/lang/StringBuilder;

    iput-char p3, v0, Laf3/i;->g:C

    iput p1, v0, Laf3/i;->h:I

    iput p2, v0, Laf3/i;->i:I

    return-void
.end method


# virtual methods
.method public final a(Lbf3/d;)V
    .locals 1

    iget-object p1, p1, Lbf3/d;->a:Ljava/lang/CharSequence;

    iget-object v0, p0, Lxe3/h;->b:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lxe3/h;->b:Ljava/lang/String;

    return-void

    :cond_0
    iget-object v0, p0, Lxe3/h;->c:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lxe3/h;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lze3/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lxe3/h;->a:Laf3/i;

    iput-object v0, v1, Laf3/i;->j:Ljava/lang/String;

    iget-object v0, p0, Lxe3/h;->c:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Laf3/i;->k:Ljava/lang/String;

    return-void
.end method

.method public final f()Laf3/a;
    .locals 1

    iget-object v0, p0, Lxe3/h;->a:Laf3/i;

    return-object v0
.end method

.method public final i(Lxe3/g;)Lha/h;
    .locals 8

    iget v0, p1, Lxe3/g;->f:I

    iget v1, p1, Lxe3/g;->c:I

    iget-object v2, p1, Lxe3/g;->a:Lbf3/d;

    iget-object v2, v2, Lbf3/d;->a:Ljava/lang/CharSequence;

    iget p1, p1, Lxe3/g;->h:I

    const/4 v3, 0x4

    iget-object v4, p0, Lxe3/h;->a:Laf3/i;

    if-ge p1, v3, :cond_3

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ge v0, p1, :cond_3

    invoke-interface {v2, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    iget-char v3, v4, Laf3/i;->g:C

    if-ne p1, v3, :cond_3

    iget p1, v4, Laf3/i;->h:I

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    move v6, v0

    :goto_0
    if-ge v6, v5, :cond_1

    invoke-interface {v2, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    if-eq v7, v3, :cond_0

    move v5, v6

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    sub-int/2addr v5, v0

    if-ge v5, p1, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v0, v5

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-static {v2, v0, p1}, Ls3/d;->r(Ljava/lang/CharSequence;II)I

    move-result p1

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ne p1, v0, :cond_3

    new-instance p1, Lha/h;

    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-direct {p1, v0, v0, v1}, Lha/h;-><init>(IIZ)V

    return-object p1

    :cond_3
    :goto_2
    iget p1, v4, Laf3/i;->i:I

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_3
    if-lez p1, :cond_4

    if-ge v1, v0, :cond_4

    invoke-interface {v2, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x20

    if-ne v3, v4, :cond_4

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p1, p1, -0x1

    goto :goto_3

    :cond_4
    invoke-static {v1}, Lha/h;->a(I)Lha/h;

    move-result-object p1

    return-object p1
.end method
