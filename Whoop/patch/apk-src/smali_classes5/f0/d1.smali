.class public final Lf0/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf0/h1;


# static fields
.field public static final b:Lf0/d1;

.field public static final c:Lf0/d1;

.field public static final d:Lf0/d1;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lf0/d1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf0/d1;-><init>(I)V

    sput-object v0, Lf0/d1;->b:Lf0/d1;

    new-instance v0, Lf0/d1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lf0/d1;-><init>(I)V

    sput-object v0, Lf0/d1;->c:Lf0/d1;

    new-instance v0, Lf0/d1;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lf0/d1;-><init>(I)V

    sput-object v0, Lf0/d1;->d:Lf0/d1;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lf0/d1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Ly3/c;)Le10/k0;
    .locals 1

    iget p2, p0, Lf0/d1;->a:I

    packed-switch p2, :pswitch_data_0

    new-instance p2, Lf0/i1;

    new-instance v0, Landroid/widget/Magnifier;

    invoke-direct {v0, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    const/16 p1, 0xc

    invoke-direct {p2, v0, p1}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    return-object p2

    :pswitch_0
    new-instance p2, Le10/k0;

    new-instance v0, Landroid/widget/Magnifier;

    invoke-direct {v0, p1}, Landroid/widget/Magnifier;-><init>(Landroid/view/View;)V

    const/16 p1, 0xc

    invoke-direct {p2, v0, p1}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public b()Z
    .locals 1

    iget v0, p0, Lf0/d1;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
