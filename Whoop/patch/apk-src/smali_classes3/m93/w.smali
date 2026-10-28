.class public final Lm93/w;
.super Lm93/x;
.source "SourceFile"


# instance fields
.field public final synthetic f:I


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;I)V
    .locals 1

    iput p2, p0, Lm93/w;->f:I

    packed-switch p2, :pswitch_data_0

    const-string p2, "method"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x6

    invoke-direct {p0, p1, p2, v0}, Lm93/x;-><init>(Ljava/lang/reflect/Method;ZI)V

    return-void

    :pswitch_0
    const-string p2, "method"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    const/4 v0, 0x6

    invoke-direct {p0, p1, p2, v0}, Lm93/x;-><init>(Ljava/lang/reflect/Method;ZI)V

    return-void

    :pswitch_1
    const-string p2, "method"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lm93/x;-><init>(Ljava/lang/reflect/Method;ZI)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lm93/w;->f:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm93/y;->c([Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lm93/x;->e([Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm93/y;->c([Ljava/lang/Object;)V

    invoke-static {p1}, Lm83/n;->t0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lm93/y;->d(Ljava/lang/Object;)V

    array-length v0, p1

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    goto :goto_0

    :cond_0
    array-length v0, p1

    invoke-static {v1, v0, p1}, Lm83/n;->m0(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lm93/x;->e([Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lm93/y;->c([Ljava/lang/Object;)V

    const/4 v0, 0x0

    aget-object v1, p1, v0

    array-length v2, p1

    const/4 v3, 0x1

    if-gt v2, v3, :cond_1

    new-array p1, v0, [Ljava/lang/Object;

    goto :goto_1

    :cond_1
    array-length v0, p1

    invoke-static {v3, v0, p1}, Lm83/n;->m0(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-virtual {p0, p1, v1}, Lm93/x;->e([Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
