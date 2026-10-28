.class public final Lb4/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lb4/c;

.field public static final x:Lb4/c;

.field public static final y:Lb4/c;

.field public static final z:Lb4/c;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lb4/c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb4/c;-><init>(II)V

    sput-object v0, Lb4/c;->x:Lb4/c;

    new-instance v0, Lb4/c;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lb4/c;-><init>(II)V

    sput-object v0, Lb4/c;->y:Lb4/c;

    new-instance v0, Lb4/c;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lb4/c;-><init>(II)V

    sput-object v0, Lb4/c;->z:Lb4/c;

    new-instance v0, Lb4/c;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lb4/c;-><init>(II)V

    sput-object v0, Lb4/c;->E:Lb4/c;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lb4/c;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb4/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/view/View;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Li3/z;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Ly2/i1;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Lb4/l;

    invoke-virtual {p1}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object p1, p1, Lb4/l;->Q:Lb4/k;

    new-instance v1, Lb4/a;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lb4/a;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
