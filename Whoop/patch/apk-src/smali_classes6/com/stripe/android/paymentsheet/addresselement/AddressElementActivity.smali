.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;
.super Lg/l;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;",
        "Lg/l;",
        "<init>",
        "()V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic z:I


# instance fields
.field public final w:Li20/o;

.field public final x:Landroidx/lifecycle/y1;

.field public final y:Ll83/p;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lg/l;-><init>()V

    new-instance v0, Li20/o;

    new-instance v1, Li20/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Li20/c;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V

    new-instance v2, Li20/c;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Li20/c;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V

    invoke-direct {v0, v1, v2}, Li20/o;-><init>(Li20/c;Li20/c;)V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->w:Li20/o;

    new-instance v0, Li20/c;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Li20/c;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, Li20/p;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Li20/g;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Li20/g;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V

    new-instance v4, Li20/g;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Li20/g;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->x:Landroidx/lifecycle/y1;

    new-instance v0, Li20/c;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Li20/c;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->y:Ll83/p;

    return-void
.end method

.method public static final n(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Li20/p;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->x:Landroidx/lifecycle/y1;

    invoke-virtual {p0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li20/p;

    return-object p0
.end method


# virtual methods
.method public final finish()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    invoke-static {p0}, Lb3/g1;->c(Landroid/app/Activity;)V

    return-void
.end method

.method public final m(Lh40/k;Leb/u0;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v8, p3

    check-cast v8, Lp1/q;

    const p3, 0x43cf1d15

    invoke-virtual {v8, p3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p3, v0

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x100

    goto :goto_2

    :cond_2
    const/16 v0, 0x80

    :goto_2
    or-int/2addr p3, v0

    and-int/lit16 p3, p3, 0x93

    const/16 v0, 0x92

    if-ne p3, v0, :cond_4

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_4

    :cond_4
    :goto_3
    new-instance p3, Lg1/f;

    const/4 v0, 0x4

    invoke-direct {p3, p1, p0, p2, v0}, Lg1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v0, -0x5bc99a41

    invoke-static {v0, v8, p3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/high16 v9, 0xc00000

    const/16 v10, 0x7f

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v10}, Ld40/r;->a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_4
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_5

    new-instance v0, La01/d;

    const/16 v5, 0x18

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lg/l;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->y:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li20/h;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->finish()V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lpf/c;->V(Landroid/view/Window;Z)V

    iget-object p1, p1, Li20/h;->x:Li20/s;

    if-eqz p1, :cond_1

    iget-object p1, p1, Li20/s;->w:Lh20/h1;

    if-eqz p1, :cond_1

    invoke-static {p1}, Luf/c0;->f0(Lh20/h1;)V

    :cond_1
    new-instance p1, Lay/n;

    const/4 v0, 0x5

    invoke-direct {p1, p0, v0}, Lay/n;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lx1/b;

    const/4 v1, 0x1

    const v2, 0x7468f458

    invoke-direct {v0, p1, v1, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, v0}, Lh/f;->a(Lg/l;Lx1/b;)V

    return-void
.end method
