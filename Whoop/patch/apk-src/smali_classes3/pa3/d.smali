.class public final Lpa3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loa3/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lpa3/f;


# direct methods
.method public synthetic constructor <init>(Lpa3/f;I)V
    .locals 0

    iput p2, p0, Lpa3/d;->w:I

    iput-object p1, p0, Lpa3/d;->x:Lpa3/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Lva3/h;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method private final b(Lva3/h;Lab3/f;)V
    .locals 0

    return-void
.end method

.method private final c(Lva3/h;Lab3/f;)V
    .locals 0

    return-void
.end method

.method private final d()V
    .locals 0

    return-void
.end method

.method private final e()V
    .locals 0

    return-void
.end method

.method private final f(Lva3/h;Lva3/c;Lva3/h;)V
    .locals 0

    return-void
.end method

.method private final g(Lva3/h;Lva3/c;Lva3/h;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final l()V
    .locals 1

    iget v0, p0, Lpa3/d;->w:I

    return-void
.end method

.method public final m(Lva3/h;)Loa3/o;
    .locals 1

    iget v0, p0, Lpa3/d;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "data"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "filePartClassNames"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "strings"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lpa3/e;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lpa3/e;-><init>(Loa3/n;I)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    new-instance p1, Lpa3/e;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lpa3/e;-><init>(Loa3/n;I)V

    :goto_1
    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "b"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lpa3/e;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lpa3/e;-><init>(Loa3/n;I)V

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lva3/h;Lab3/f;)V
    .locals 0

    iget p1, p0, Lpa3/d;->w:I

    return-void
.end method

.method public final p(Lva3/h;Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lpa3/d;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "version"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lpa3/d;->x:Lpa3/f;

    if-eqz v0, :cond_0

    instance-of p1, p2, [I

    if-eqz p1, :cond_2

    check-cast p2, [I

    iput-object p2, v1, Lpa3/f;->w:[I

    goto :goto_1

    :cond_0
    const-string v0, "multifileClassName"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    instance-of p1, p2, Ljava/lang/String;

    if-eqz p1, :cond_1

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    iput-object p2, v1, Lpa3/f;->x:Ljava/lang/String;

    :cond_2
    :goto_1
    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Lva3/h;Lva3/c;Lva3/h;)V
    .locals 0

    iget p1, p0, Lpa3/d;->w:I

    return-void
.end method

.method public final s(Lva3/c;Lva3/h;)Loa3/n;
    .locals 0

    iget p1, p0, Lpa3/d;->w:I

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    const/4 p1, 0x0

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
