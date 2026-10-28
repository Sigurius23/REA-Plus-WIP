.class public final Lfa3/o;
.super Lr93/o;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lr93/m1;I)V
    .locals 0

    iput p2, p0, Lfa3/o;->b:I

    invoke-direct {p0, p1}, Lr93/o;-><init>(Lr93/m1;)V

    return-void
.end method


# virtual methods
.method public final a(Lfb3/d;Lr93/n;Lr93/k;)Z
    .locals 2

    iget v0, p0, Lfa3/o;->b:I

    packed-switch v0, :pswitch_data_0

    if-eqz p3, :cond_0

    invoke-static {p1, p2, p3}, Lfa3/p;->b(Lfb3/d;Lr93/n;Lr93/k;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x1

    const-string v0, "from"

    aput-object v0, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "isVisible"

    aput-object p3, p1, p2

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    if-eqz p3, :cond_1

    invoke-static {p1, p2, p3}, Lfa3/p;->b(Lfb3/d;Lr93/n;Lr93/k;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x1

    const-string v0, "from"

    aput-object v0, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "isVisible"

    aput-object p3, p1, p2

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_1
    if-eqz p3, :cond_2

    invoke-static {p2, p3}, Lfa3/p;->c(Lr93/n;Lr93/k;)Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const/4 p3, 0x2

    const/4 v0, 0x1

    const-string v1, "from"

    aput-object v1, p1, p2

    const-string p2, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1"

    aput-object p2, p1, v0

    const-string p2, "isVisible"

    aput-object p2, p1, p3

    const-string p2, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
