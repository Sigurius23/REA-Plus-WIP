.class public final Luc3/a;
.super Luc3/c;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Luc3/a;->c:I

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "the predefined string "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Luc3/c;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Luc3/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsc3/r;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Luc3/a;->c:I

    const-string v0, "setter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0, p2}, Luc3/c;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 4
    iput-object p1, p0, Luc3/a;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(IILjava/lang/Object;Ljava/lang/String;)Luc3/e;
    .locals 5

    iget v0, p0, Luc3/a;->c:I

    packed-switch v0, :pswitch_data_0

    sub-int v0, p2, p1

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    new-instance p1, Ld0/o2;

    const/16 p2, 0x8

    invoke-direct {p1, v1, p2}, Ld0/o2;-><init>(II)V

    goto :goto_1

    :cond_0
    const/16 v1, 0x9

    if-le v0, v1, :cond_1

    new-instance p1, Ld0/o2;

    const/16 p2, 0x9

    invoke-direct {p1, v1, p2}, Ld0/o2;-><init>(II)V

    goto :goto_1

    :cond_1
    iget-object v1, p0, Luc3/a;->d:Ljava/lang/Object;

    check-cast v1, Lsc3/r;

    new-instance v2, Lrc3/a;

    const/4 v3, 0x0

    :goto_0
    if-ge p1, p2, :cond_2

    invoke-virtual {p4, p1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    mul-int/lit8 v3, v3, 0xa

    add-int/lit8 v4, v4, -0x30

    add-int/2addr v3, v4

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    invoke-direct {v2, v3, v0}, Lrc3/a;-><init>(II)V

    invoke-virtual {v1, p3, v2}, Lsc3/r;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    const/4 p1, 0x0

    goto :goto_1

    :cond_3
    new-instance p2, Lf93/a;

    const/4 p3, 0x5

    invoke-direct {p2, p1, p3}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    move-object p1, p2

    :goto_1
    return-object p1

    :pswitch_0
    invoke-virtual {p4, p1, p2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Luc3/a;->d:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x0

    goto :goto_2

    :cond_4
    new-instance p1, Ldb/j0;

    const/16 p3, 0xc

    invoke-direct {p1, p2, p3}, Ldb/j0;-><init>(Ljava/lang/String;I)V

    :goto_2
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
