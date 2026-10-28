.class public final Lcom/amplitude/android/engagement/types/m0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lcom/amplitude/android/engagement/types/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/amplitude/android/engagement/types/m0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lcom/amplitude/android/engagement/types/m0;->w:Lcom/amplitude/android/engagement/types/m0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    new-instance v0, Lwc3/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/amplitude/android/engagement/types/Marker;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lcom/amplitude/android/engagement/types/BeaconMarker;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-class v4, Lcom/amplitude/android/engagement/types/IconMarker;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-class v5, Lcom/amplitude/android/engagement/types/ImageMarker;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v5, 0x3

    move-object v6, v3

    new-array v3, v5, [Lj93/d;

    const/4 v7, 0x0

    aput-object v6, v3, v7

    const/4 v6, 0x1

    aput-object v4, v3, v6

    const/4 v4, 0x2

    aput-object v1, v3, v4

    new-array v1, v5, [Lwc3/c;

    sget-object v5, Lcom/amplitude/android/engagement/types/BeaconMarker$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/BeaconMarker$$serializer;

    aput-object v5, v1, v7

    sget-object v5, Lcom/amplitude/android/engagement/types/IconMarker$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/IconMarker$$serializer;

    aput-object v5, v1, v6

    sget-object v5, Lcom/amplitude/android/engagement/types/ImageMarker$$serializer;->INSTANCE:Lcom/amplitude/android/engagement/types/ImageMarker$$serializer;

    aput-object v5, v1, v4

    new-array v5, v7, [Ljava/lang/annotation/Annotation;

    move-object v4, v1

    const-string v1, "com.amplitude.android.engagement.types.Marker"

    invoke-direct/range {v0 .. v5}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
