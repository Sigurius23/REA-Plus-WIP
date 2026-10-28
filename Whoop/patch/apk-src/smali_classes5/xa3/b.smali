.class public final Lxa3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxa3/c;


# static fields
.field public static final b:Lxa3/b;

.field public static final c:Lxa3/b;

.field public static final d:Lxa3/b;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lxa3/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lxa3/b;-><init>(I)V

    sput-object v0, Lxa3/b;->b:Lxa3/b;

    new-instance v0, Lxa3/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lxa3/b;-><init>(I)V

    sput-object v0, Lxa3/b;->c:Lxa3/b;

    new-instance v0, Lxa3/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lxa3/b;-><init>(I)V

    sput-object v0, Lxa3/b;->d:Lxa3/b;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lxa3/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lr93/h;)Ljava/lang/String;
    .locals 2

    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lv63/b;->h(Lva3/h;)Ljava/lang/String;

    move-result-object v0

    instance-of v1, p0, Lr93/x0;

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object p0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, p0, Lr93/e;

    if-eqz v1, :cond_1

    check-cast p0, Lr93/h;

    invoke-static {p0}, Lxa3/b;->b(Lr93/h;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    instance-of v1, p0, Lr93/g0;

    if-eqz v1, :cond_2

    check-cast p0, Lr93/g0;

    check-cast p0, Lu93/g0;

    iget-object p0, p0, Lu93/g0;->F:Lva3/e;

    iget-object p0, p0, Lva3/e;->a:Lva3/f;

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lva3/f;->f(Lva3/f;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lv63/b;->j(Ljava/util/List;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_3

    const-string v1, ""

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const/16 v1, 0x2e

    invoke-static {v1, p0, v0}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_1
    return-object v0
.end method


# virtual methods
.method public final a(Lr93/h;Lxa3/i;)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lxa3/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lxa3/b;->b(Lr93/h;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    instance-of v0, p1, Lr93/x0;

    if-eqz v0, :cond_0

    check-cast p1, Lr93/x0;

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object p1

    const-string v0, "getName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lxa3/i;->O(Lva3/h;Z)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object p1

    instance-of p2, p1, Lr93/e;

    if-nez p2, :cond_1

    new-instance p1, Lm83/i0;

    invoke-direct {p1, v0}, Lm83/i0;-><init>(Ljava/util/ArrayList;)V

    invoke-static {p1}, Lv63/b;->j(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_1
    instance-of v0, p1, Lr93/x0;

    if-eqz v0, :cond_2

    check-cast p1, Lr93/x0;

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object p1

    const-string v0, "getName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Lxa3/i;->O(Lva3/h;Z)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object p1

    const-string v0, "getFqName(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lva3/f;->f(Lva3/f;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lv63/b;->j(Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
