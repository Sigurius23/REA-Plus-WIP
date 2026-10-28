.class public final Lfa3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lya3/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final b(Lr93/b;Lr93/b;Lr93/e;)I
    .locals 1

    const-string p3, "superDescriptor"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "subDescriptor"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p3, p2, Lr93/n0;

    if-eqz p3, :cond_4

    instance-of p3, p1, Lr93/n0;

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    check-cast p2, Lr93/n0;

    invoke-interface {p2}, Lr93/k;->getName()Lva3/h;

    move-result-object p3

    check-cast p1, Lr93/n0;

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p2}, Lo73/a;->P(Lr93/n0;)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p1}, Lo73/a;->P(Lr93/n0;)Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    invoke-static {p2}, Lo73/a;->P(Lr93/n0;)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-static {p1}, Lo73/a;->P(Lr93/n0;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    const/4 p1, 0x2

    return p1

    :cond_4
    :goto_0
    const/4 p1, 0x3

    return p1
.end method
