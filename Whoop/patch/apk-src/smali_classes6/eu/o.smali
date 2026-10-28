.class public final Leu/o;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final E:Leu/o;

.field public static final F:Leu/o;

.field public static final x:Leu/o;

.field public static final y:Leu/o;

.field public static final z:Leu/o;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Leu/o;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leu/o;-><init>(II)V

    sput-object v0, Leu/o;->x:Leu/o;

    new-instance v0, Leu/o;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Leu/o;-><init>(II)V

    sput-object v0, Leu/o;->y:Leu/o;

    new-instance v0, Leu/o;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Leu/o;-><init>(II)V

    sput-object v0, Leu/o;->z:Leu/o;

    new-instance v0, Leu/o;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Leu/o;-><init>(II)V

    sput-object v0, Leu/o;->E:Leu/o;

    new-instance v0, Leu/o;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Leu/o;-><init>(II)V

    sput-object v0, Leu/o;->F:Leu/o;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Leu/o;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Leu/o;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :pswitch_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    new-instance v0, Lcom/google/android/gms/maps/GoogleMapOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/GoogleMapOptions;-><init>()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
