.class public final Lw00/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv00/o0;


# static fields
.field public static final b:Lw00/d;

.field public static final c:Lw00/d;

.field public static final d:Lw00/d;

.field public static final e:Lw00/d;

.field public static final f:Lw00/d;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lw00/d;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw00/d;-><init>(I)V

    sput-object v0, Lw00/d;->b:Lw00/d;

    new-instance v0, Lw00/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lw00/d;-><init>(I)V

    sput-object v0, Lw00/d;->c:Lw00/d;

    new-instance v0, Lw00/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lw00/d;-><init>(I)V

    sput-object v0, Lw00/d;->d:Lw00/d;

    new-instance v0, Lw00/d;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lw00/d;-><init>(I)V

    sput-object v0, Lw00/d;->e:Lw00/d;

    new-instance v0, Lw00/d;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lw00/d;-><init>(I)V

    sput-object v0, Lw00/d;->f:Lw00/d;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lw00/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;
    .locals 1

    iget v0, p0, Lw00/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;
    .locals 1

    iget v0, p0, Lw00/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1, p2, p3}, Ls9/f;->z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1, p2, p3}, Ls9/f;->z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p0, p1, p2, p3}, Ls9/f;->z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p0, p1, p2, p3}, Ls9/f;->z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p0, p1, p2, p3}, Ls9/f;->z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lq20/c;)Lt00/a;
    .locals 1

    iget v0, p0, Lw00/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lw00/d;->f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lu00/f;

    move-result-object p1

    invoke-virtual {p1, p3}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lw00/d;->f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lu00/f;

    move-result-object p1

    invoke-virtual {p1, p3}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2}, Lw00/d;->f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lu00/f;

    move-result-object p1

    invoke-virtual {p1, p3}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2}, Lw00/d;->f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lu00/f;

    move-result-object p1

    invoke-virtual {p1, p3}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2}, Lw00/d;->f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lu00/f;

    move-result-object p1

    invoke-virtual {p1, p3}, Lu00/f;->a(Lq20/c;)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;)Lu00/f;
    .locals 11

    iget v0, p0, Lw00/d;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lu00/f;

    sget-object v2, Lw00/q0;->a:Lw00/q0;

    const/4 v9, 0x0

    const/16 v10, 0xe0

    const v4, 0x7f1410b5

    const v5, 0x7f08083b

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p2

    invoke-direct/range {v1 .. v10}, Lu00/f;-><init>(Lv00/b0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;IILjava/lang/Integer;ZLzy/b;Ljava/lang/Integer;I)V

    return-object v1

    :pswitch_0
    sget-object p1, Lw00/h0;->b:Ly00/f4;

    iget-object v1, p1, Ly00/f4;->w:Ljava/lang/String;

    new-instance v0, Lu00/f;

    const/4 v6, 0x0

    const/16 v7, 0x302

    const/4 v2, 0x0

    const v3, 0x7f1410ad

    const v4, 0x7f08082e

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lu00/f;-><init>(Ljava/lang/String;Ljava/lang/String;IIZLzy/b;I)V

    return-object v0

    :pswitch_1
    move-object v3, p2

    new-instance v1, Lu00/f;

    sget-object v2, Lw00/a0;->a:Lw00/a0;

    const/4 v9, 0x0

    const/16 v10, 0xe0

    const v4, 0x7f1410a6

    const v5, 0x7f080827

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lu00/f;-><init>(Lv00/b0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;IILjava/lang/Integer;ZLzy/b;Ljava/lang/Integer;I)V

    return-object v1

    :pswitch_2
    move-object v3, p2

    sget-object v2, Lw00/h;->a:Lw00/h;

    new-instance v1, Lu00/f;

    const p1, 0x7f080819

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v10, 0x40

    const v4, 0x7f141099

    const v5, 0x7f080818

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lu00/f;-><init>(Lv00/b0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;IILjava/lang/Integer;ZLzy/b;Ljava/lang/Integer;I)V

    return-object v1

    :pswitch_3
    move-object v3, p2

    new-instance v1, Lu00/f;

    sget-object v2, Lw00/c;->a:Lw00/c;

    iget-object p1, p1, Lv00/c0;->w:Ly00/c8;

    invoke-static {p1}, Luf/c0;->P(Ly00/c8;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "GBP"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const p2, 0x7f1410a1

    :goto_0
    move v4, p2

    goto :goto_1

    :cond_0
    const p2, 0x7f141095

    goto :goto_0

    :goto_1
    invoke-static {p1}, Luf/c0;->P(Ly00/c8;)Ljava/lang/String;

    move-result-object p2

    const-string v5, "USD"

    invoke-virtual {v5, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const p2, 0x7f080820

    goto :goto_2

    :cond_1
    const p2, 0x7f080812

    :goto_2
    invoke-static {p1}, Luf/c0;->P(Ly00/c8;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const p1, 0x7f140fe5

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    :goto_3
    move-object v8, p1

    goto :goto_4

    :cond_2
    invoke-static {p1}, Luf/c0;->P(Ly00/c8;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    const p1, 0x7f140fe3

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    goto :goto_3

    :cond_3
    const p1, 0x7f140fb1

    invoke-static {p1}, Ls4/i;->h(I)Lzy/b;

    move-result-object p1

    goto :goto_3

    :goto_4
    const/4 v9, 0x0

    const/16 v10, 0xa0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p2

    invoke-direct/range {v1 .. v10}, Lu00/f;-><init>(Lv00/b0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;IILjava/lang/Integer;ZLzy/b;Ljava/lang/Integer;I)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lv00/b0;Ljava/util/List;)Z
    .locals 1

    iget v0, p0, Lw00/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1, p2}, Ls9/f;->r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z

    move-result p1

    return p1

    :pswitch_0
    invoke-static {p0, p1, p2}, Ls9/f;->r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z

    move-result p1

    return p1

    :pswitch_1
    invoke-static {p0, p1, p2}, Ls9/f;->r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z

    move-result p1

    return p1

    :pswitch_2
    invoke-static {p0, p1, p2}, Ls9/f;->r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z

    move-result p1

    return p1

    :pswitch_3
    invoke-static {p0, p1, p2}, Ls9/f;->r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;
    .locals 1

    iget v0, p0, Lw00/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;Lv00/m0;)Ljava/util/List;
    .locals 4

    iget v0, p0, Lw00/d;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lw00/q0;->b:Ly00/f4;

    iget-object v0, v0, Ly00/f4;->w:Ljava/lang/String;

    const-string v1, "code"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lv00/c0;->w:Ly00/c8;

    iget-object v2, p1, Lv00/c0;->S:Lv00/i0;

    iget-object v3, p1, Lv00/c0;->P:Lv00/p;

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v0, v2, v1, v3}, Ls4/b;->q(Ljava/lang/String;Lv00/i0;Ly00/c8;Z)Z

    move-result v0

    invoke-static {p1, p2, p3}, Ls93/h;->f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;)Ljava/util/ArrayList;

    move-result-object p2

    if-eqz v0, :cond_3

    invoke-static {p2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-static {p2}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg40/i1;

    instance-of p3, p3, Lx30/e1;

    if-eqz p3, :cond_1

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p3

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg40/i1;

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    invoke-static {p2, p1, p4}, Ls4/b;->b(Ljava/util/AbstractList;Lv00/c0;Lv00/m0;)V

    if-eqz p3, :cond_2

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-static {p2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    :cond_3
    return-object p2

    :pswitch_0
    invoke-virtual {p0, p1, p2, p3}, Lw00/d;->k(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2, p3}, Lw00/d;->k(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2, p3}, Lw00/d;->k(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p0, p1, p2, p3}, Lw00/d;->k(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public k(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;)Ljava/util/ArrayList;
    .locals 3

    iget v0, p0, Lw00/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2, p3}, Ls93/h;->f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/SharedDataSpec;->getFields()Ljava/util/ArrayList;

    move-result-object p2

    sget-object v0, Lw00/a0;->b:Ly00/f4;

    iget-object v1, v0, Ly00/f4;->w:Ljava/lang/String;

    invoke-virtual {p1, v1}, Lv00/c0;->x(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getName$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->access$getEmail$cp()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    filled-new-array {v1, v2}, [Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, Lm83/y;->w:Lm83/y;

    :goto_0
    iget-object v2, p1, Lv00/c0;->Z:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/i3;

    if-nez v0, :cond_1

    sget-object v0, Lh20/i3;->w:Lh20/i3;

    :cond_1
    invoke-virtual {p3, p1, p2, v1, v0}, Lty/c;->v(Lv00/c0;Ljava/util/ArrayList;Ljava/util/List;Lh20/i3;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1, p2, p3}, Ls93/h;->f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1, p2, p3}, Ls93/h;->f(Lv00/c0;Lcom/stripe/android/ui/core/elements/SharedDataSpec;Lty/c;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
