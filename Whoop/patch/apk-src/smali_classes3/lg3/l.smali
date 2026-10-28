.class public final Llg3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg3/f;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llg3/l;->w:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Llg3/q;Ljava/lang/CharSequence;I)I
    .locals 7

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p3, v0, :cond_1

    if-ltz p3, :cond_1

    const/4 v5, 0x0

    iget-object v4, p0, Llg3/l;->w:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-virtual/range {v1 .. v6}, Llg3/q;->l(Ljava/lang/CharSequence;ILjava/lang/CharSequence;II)Z

    move-result p1

    if-nez p1, :cond_0

    not-int p1, v3

    return p1

    :cond_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v3

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final b(Lab/h0;Ljava/lang/StringBuilder;)Z
    .locals 0

    iget-object p1, p0, Llg3/l;->w:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "\'\'"

    iget-object v1, p0, Llg3/l;->w:Ljava/lang/String;

    const-string v2, "\'"

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
