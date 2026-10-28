.class public final Ldv/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:D


# direct methods
.method public constructor <init>(ID)V
    .locals 0

    iput p1, p0, Ldv/a;->w:I

    iput-wide p2, p0, Ldv/a;->x:D

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lvu/a;

    const-string v0, "$this$rgba"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Ldv/a;->w:I

    shr-int/lit8 v1, v0, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-long v1, v1

    iget-object v3, p1, Lvu/a;->b:Ljava/util/ArrayList;

    new-instance v4, Lvu/d;

    invoke-direct {v4, v1, v2}, Lvu/d;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    shr-int/lit8 v1, v0, 0x8

    and-int/lit16 v1, v1, 0xff

    int-to-long v1, v1

    new-instance v4, Lvu/d;

    invoke-direct {v4, v1, v2}, Lvu/d;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    and-int/lit16 v0, v0, 0xff

    int-to-long v0, v0

    new-instance v2, Lvu/d;

    invoke-direct {v2, v0, v1}, Lvu/d;-><init>(J)V

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0}, Ljava/text/NumberFormat;->getNumberInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.text.DecimalFormat"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/text/DecimalFormat;

    const-string v1, "#.########"

    invoke-virtual {v0, v1}, Ljava/text/DecimalFormat;->applyPattern(Ljava/lang/String;)V

    iget-wide v1, p0, Ldv/a;->x:D

    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    const-string v1, "decimalFormat.format(alpha)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lvu/a;->c(D)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
