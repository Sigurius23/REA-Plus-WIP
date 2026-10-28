.class public final Lxv/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lxv/e;

.field public static final y:Lxv/e;

.field public static final z:Lxv/e;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lxv/e;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxv/e;-><init>(II)V

    sput-object v0, Lxv/e;->x:Lxv/e;

    new-instance v0, Lxv/e;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lxv/e;-><init>(II)V

    sput-object v0, Lxv/e;->y:Lxv/e;

    new-instance v0, Lxv/e;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lxv/e;-><init>(II)V

    sput-object v0, Lxv/e;->z:Lxv/e;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lxv/e;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxv/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lyv/a;

    const-string v0, "$this$ScaleBarSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroid/content/Context;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxv/f;

    invoke-direct {v0, p1}, Lxv/f;-><init>(Landroid/content/Context;)V

    return-object v0

    :pswitch_1
    check-cast p1, Lyv/a;

    const-string v0, "$this$ScaleBarSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
