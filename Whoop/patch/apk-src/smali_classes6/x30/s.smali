.class public final synthetic Lx30/s;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Lx30/s;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lx30/s;

    const-string v4, "formatExpirationDateForAccessibility(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;"

    const/4 v5, 0x1

    const/4 v1, 0x1

    const-class v2, Lx30/s0;

    const-string v3, "formatExpirationDateForAccessibility"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/i;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v0, Lx30/s;->w:Lx30/s;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sget-object v1, Lm83/y;->w:Lm83/y;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const p1, 0x7f140ffa

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p1}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v3, 0x1

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x30

    if-eq v0, v4, :cond_2

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v4, 0x31

    if-eq v0, v4, :cond_2

    move v0, v3

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-le v4, v3, :cond_3

    const/4 v4, 0x2

    invoke-static {v4, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0xc

    if-le v4, v5, :cond_3

    move v4, v3

    goto :goto_1

    :cond_3
    move v4, v2

    :goto_1
    if-nez v0, :cond_5

    if-eqz v4, :cond_4

    goto :goto_2

    :cond_4
    move v0, v2

    goto :goto_3

    :cond_5
    :goto_2
    move v0, v3

    :goto_3
    xor-int/2addr v0, v3

    add-int/2addr v0, v3

    invoke-static {v0, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Li93/j;

    invoke-static {p1}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v6

    invoke-direct {v5, v0, v6, v3}, Li93/h;-><init>(III)V

    invoke-virtual {v5}, Li93/j;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, ""

    goto :goto_4

    :cond_6
    invoke-static {p1, v5}, Lyb3/r;->C0(Ljava/lang/String;Li93/j;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v4, :cond_b

    :try_start_0
    invoke-static {}, Lm/q;->d()Lb5/g;

    move-result-object v5

    invoke-virtual {v5, v2}, Lb5/g;->b(I)Ljava/util/Locale;

    move-result-object v5

    if-nez v5, :cond_7

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    :cond_7
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v7, "MM"

    invoke-direct {v6, v7, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4

    if-eqz v4, :cond_8

    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v7, "MMMM"

    invoke-direct {v6, v7, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v6, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    :cond_8
    const/4 v4, 0x0

    :goto_5
    if-nez v0, :cond_9

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v0

    const v2, 0x7f140ffc

    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    return-object p1

    :cond_9
    new-instance v5, Li93/j;

    const/16 v6, 0x9

    invoke-direct {v5, v2, v6, v3}, Li93/h;-><init>(III)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v5, v2}, Li93/j;->e(I)Z

    move-result v2

    if-eqz v2, :cond_a

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v0

    const v2, 0x7f140ffd

    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    return-object p1

    :cond_a
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit16 v0, v0, 0x7d0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    const v2, 0x7f140ff9

    invoke-static {v2, v0, v1}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object p1

    return-object p1

    :cond_b
    invoke-static {p1}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    invoke-static {p1}, Ls4/i;->i(Ljava/lang/String;)Lzy/d;

    move-result-object p1

    return-object p1
.end method
