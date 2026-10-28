.class public final Lb3/r;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Lb3/r;

.field public static final F:Lb3/r;

.field public static final x:Lb3/r;

.field public static final y:Lb3/r;

.field public static final z:Lb3/r;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lb3/r;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb3/r;-><init>(II)V

    sput-object v0, Lb3/r;->x:Lb3/r;

    new-instance v0, Lb3/r;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lb3/r;-><init>(II)V

    sput-object v0, Lb3/r;->y:Lb3/r;

    new-instance v0, Lb3/r;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lb3/r;-><init>(II)V

    sput-object v0, Lb3/r;->z:Lb3/r;

    new-instance v0, Lb3/r;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lb3/r;-><init>(II)V

    sput-object v0, Lb3/r;->E:Lb3/r;

    new-instance v0, Lb3/r;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lb3/r;-><init>(II)V

    sput-object v0, Lb3/r;->F:Lb3/r;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lb3/r;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb3/r;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lb3/l2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    invoke-static {p1}, Lb3/o0;->e(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lp1/p1;

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    check-cast p1, Lp1/p1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v0}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-static {p1, v0}, Lp1/x;->D(Lp1/p1;Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lw2/b;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_3
    check-cast p1, Landroid/content/res/Configuration;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
