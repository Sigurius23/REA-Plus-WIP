.class public final Leu/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final E:Leu/c;

.field public static final F:Leu/c;

.field public static final G:Leu/c;

.field public static final H:Leu/c;

.field public static final I:Leu/c;

.field public static final J:Leu/c;

.field public static final K:Leu/c;

.field public static final L:Leu/c;

.field public static final M:Leu/c;

.field public static final N:Leu/c;

.field public static final O:Leu/c;

.field public static final P:Leu/c;

.field public static final x:Leu/c;

.field public static final y:Leu/c;

.field public static final z:Leu/c;


# instance fields
.field public final synthetic w:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    new-instance v0, Leu/c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->x:Leu/c;

    new-instance v0, Leu/c;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->y:Leu/c;

    new-instance v0, Leu/c;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->z:Leu/c;

    new-instance v0, Leu/c;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->E:Leu/c;

    new-instance v0, Leu/c;

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->F:Leu/c;

    new-instance v0, Leu/c;

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->G:Leu/c;

    new-instance v0, Leu/c;

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->H:Leu/c;

    new-instance v0, Leu/c;

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->I:Leu/c;

    new-instance v0, Leu/c;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->J:Leu/c;

    new-instance v0, Leu/c;

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->K:Leu/c;

    new-instance v0, Leu/c;

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->L:Leu/c;

    new-instance v0, Leu/c;

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->M:Leu/c;

    new-instance v0, Leu/c;

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->N:Leu/c;

    new-instance v0, Leu/c;

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->O:Leu/c;

    new-instance v0, Leu/c;

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Leu/c;-><init>(II)V

    sput-object v0, Leu/c;->P:Leu/c;

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    iput p2, p0, Leu/c;->w:I

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Leu/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lwp/l;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leu/j0;

    invoke-direct {v0, p1}, Leu/j0;-><init>(Lcom/google/android/gms/maps/model/LatLng;)V

    return-object v0

    :pswitch_1
    check-cast p1, Lwp/h;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Lwp/h;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Lwp/h;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Lwp/h;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_5
    check-cast p1, Lwp/k;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Landroid/location/Location;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_9
    check-cast p1, Lwp/k;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_a
    check-cast p1, Landroid/location/Location;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    check-cast p1, Lcom/google/android/gms/maps/model/CameraPosition;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leu/g;

    invoke-direct {v0, p1}, Leu/g;-><init>(Lcom/google/android/gms/maps/model/CameraPosition;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
