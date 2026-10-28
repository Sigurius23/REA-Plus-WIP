.class public final Ly2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ly2/o;

.field public final c:Ly2/o;

.field public final d:Ly2/o;

.field public final e:Ly2/o;

.field public final f:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Ly2/p;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/p;->f:Ljava/io/Serializable;

    .line 2
    new-instance p1, Ly2/o;

    const/4 v1, 0x0

    .line 3
    invoke-direct {p1, v0, v1}, Ly2/o;-><init>(ILc93/m;)V

    .line 4
    iput-object p1, p0, Ly2/p;->b:Ly2/o;

    .line 5
    new-instance p1, Ly2/o;

    const/4 v0, 0x0

    .line 6
    invoke-direct {p1, v0, v1}, Ly2/o;-><init>(ILc93/m;)V

    .line 7
    iput-object p1, p0, Ly2/p;->c:Ly2/o;

    .line 8
    new-instance p1, Ly2/o;

    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, v0, v1}, Ly2/o;-><init>(ILc93/m;)V

    .line 10
    iput-object p1, p0, Ly2/p;->d:Ly2/o;

    .line 11
    new-instance p1, Ly2/o;

    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, v0, v1}, Ly2/o;-><init>(ILc93/m;)V

    .line 13
    iput-object p1, p0, Ly2/p;->e:Ly2/o;

    return-void
.end method

.method public constructor <init>([Ly2/p;)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Ly2/p;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/p;->f:Ljava/io/Serializable;

    .line 15
    array-length p1, p1

    new-array v0, p1, [Ly2/o;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p1, :cond_0

    iget-object v3, p0, Ly2/p;->f:Ljava/io/Serializable;

    check-cast v3, [Ly2/p;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Ly2/p;->b()Ly2/o;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ly2/z1;

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2}, Ly2/z1;-><init>([Ly2/o;I)V

    .line 17
    new-instance v0, Ly2/o;

    const/4 v2, 0x1

    .line 18
    invoke-direct {v0, v2, p1}, Ly2/o;-><init>(ILc93/m;)V

    .line 19
    iput-object v0, p0, Ly2/p;->b:Ly2/o;

    .line 20
    iget-object p1, p0, Ly2/p;->f:Ljava/io/Serializable;

    check-cast p1, [Ly2/p;

    array-length p1, p1

    new-array v0, p1, [Ly2/o;

    move v2, v1

    :goto_1
    if-ge v2, p1, :cond_1

    iget-object v3, p0, Ly2/p;->f:Ljava/io/Serializable;

    check-cast v3, [Ly2/p;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Ly2/p;->d()Ly2/o;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 21
    :cond_1
    new-instance p1, Ly2/o;

    new-instance v2, Ly2/n;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Ly2/n;-><init>([Ly2/o;I)V

    const/4 v0, 0x0

    .line 22
    invoke-direct {p1, v0, v2}, Ly2/o;-><init>(ILc93/m;)V

    .line 23
    iput-object p1, p0, Ly2/p;->c:Ly2/o;

    .line 24
    iget-object p1, p0, Ly2/p;->f:Ljava/io/Serializable;

    check-cast p1, [Ly2/p;

    array-length p1, p1

    new-array v0, p1, [Ly2/o;

    move v2, v1

    :goto_2
    if-ge v2, p1, :cond_2

    iget-object v3, p0, Ly2/p;->f:Ljava/io/Serializable;

    check-cast v3, [Ly2/p;

    aget-object v3, v3, v2

    invoke-virtual {v3}, Ly2/p;->c()Ly2/o;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 25
    :cond_2
    new-instance p1, Ly2/z1;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v2}, Ly2/z1;-><init>([Ly2/o;I)V

    .line 26
    new-instance v0, Ly2/o;

    .line 27
    invoke-direct {v0, v2, p1}, Ly2/o;-><init>(ILc93/m;)V

    .line 28
    iput-object v0, p0, Ly2/p;->d:Ly2/o;

    .line 29
    iget-object p1, p0, Ly2/p;->f:Ljava/io/Serializable;

    check-cast p1, [Ly2/p;

    array-length p1, p1

    new-array v0, p1, [Ly2/o;

    :goto_3
    if-ge v1, p1, :cond_3

    iget-object v2, p0, Ly2/p;->f:Ljava/io/Serializable;

    check-cast v2, [Ly2/p;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ly2/p;->a()Ly2/o;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 30
    :cond_3
    new-instance p1, Ly2/o;

    new-instance v1, Ly2/n;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Ly2/n;-><init>([Ly2/o;I)V

    const/4 v0, 0x0

    .line 31
    invoke-direct {p1, v0, v1}, Ly2/o;-><init>(ILc93/m;)V

    .line 32
    iput-object p1, p0, Ly2/p;->e:Ly2/o;

    return-void
.end method


# virtual methods
.method public final a()Ly2/o;
    .locals 1

    iget v0, p0, Ly2/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly2/p;->e:Ly2/o;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ly2/p;->e:Ly2/o;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ly2/o;
    .locals 1

    iget v0, p0, Ly2/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly2/p;->b:Ly2/o;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ly2/p;->b:Ly2/o;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Ly2/o;
    .locals 1

    iget v0, p0, Ly2/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly2/p;->d:Ly2/o;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ly2/p;->d:Ly2/o;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Ly2/o;
    .locals 1

    iget v0, p0, Ly2/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly2/p;->c:Ly2/o;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ly2/p;->c:Ly2/o;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Ly2/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly2/p;->f:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, "RectRulers("

    const/16 v2, 0x29

    invoke-static {v2, v1, v0}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Ly2/p;->f:Ljava/io/Serializable;

    move-object v1, v0

    check-cast v1, [Ly2/p;

    const/4 v5, 0x0

    const/16 v6, 0x39

    const/4 v2, 0x0

    const-string v3, "innermostOf("

    const-string v4, ")"

    invoke-static/range {v1 .. v6}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
