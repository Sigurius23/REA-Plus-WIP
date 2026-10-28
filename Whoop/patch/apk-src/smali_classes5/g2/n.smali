.class public final Lg2/n;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final x:Lg2/n;

.field public static final y:Lg2/n;

.field public static final z:Lg2/n;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Lg2/n;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg2/n;-><init>(II)V

    sput-object v0, Lg2/n;->x:Lg2/n;

    new-instance v0, Lg2/n;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lg2/n;-><init>(II)V

    sput-object v0, Lg2/n;->y:Lg2/n;

    new-instance v0, Lg2/n;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lg2/n;-><init>(II)V

    sput-object v0, Lg2/n;->z:Lg2/n;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Lg2/n;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg2/n;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lg2/x;

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Lg2/x;->b1(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lg2/x;

    const/4 v0, 0x7

    invoke-virtual {p1, v0}, Lg2/x;->b1(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lg2/a;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Lg2/a;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
