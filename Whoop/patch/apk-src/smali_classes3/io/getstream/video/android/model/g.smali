.class public final Lio/getstream/video/android/model/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lio/getstream/video/android/model/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/video/android/model/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lio/getstream/video/android/model/g;->w:Lio/getstream/video/android/model/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    new-instance v0, Lwc3/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lio/getstream/video/android/model/UserType;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v3, Lio/getstream/video/android/model/UserType$Anonymous;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-class v4, Lio/getstream/video/android/model/UserType$Authenticated;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const-class v5, Lio/getstream/video/android/model/UserType$Guest;

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

    new-instance v1, Lkotlinx/serialization/internal/ObjectSerializer;

    sget-object v8, Lio/getstream/video/android/model/UserType$Anonymous;->INSTANCE:Lio/getstream/video/android/model/UserType$Anonymous;

    new-array v9, v7, [Ljava/lang/annotation/Annotation;

    const-string v10, "io.getstream.video.android.model.UserType.Anonymous"

    invoke-direct {v1, v10, v8, v9}, Lkotlinx/serialization/internal/ObjectSerializer;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    new-instance v8, Lkotlinx/serialization/internal/ObjectSerializer;

    sget-object v9, Lio/getstream/video/android/model/UserType$Authenticated;->INSTANCE:Lio/getstream/video/android/model/UserType$Authenticated;

    new-array v10, v7, [Ljava/lang/annotation/Annotation;

    const-string v11, "io.getstream.video.android.model.UserType.Authenticated"

    invoke-direct {v8, v11, v9, v10}, Lkotlinx/serialization/internal/ObjectSerializer;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    new-instance v9, Lkotlinx/serialization/internal/ObjectSerializer;

    sget-object v10, Lio/getstream/video/android/model/UserType$Guest;->INSTANCE:Lio/getstream/video/android/model/UserType$Guest;

    new-array v11, v7, [Ljava/lang/annotation/Annotation;

    const-string v12, "io.getstream.video.android.model.UserType.Guest"

    invoke-direct {v9, v12, v10, v11}, Lkotlinx/serialization/internal/ObjectSerializer;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    new-array v5, v5, [Lwc3/c;

    aput-object v1, v5, v7

    aput-object v8, v5, v6

    aput-object v9, v5, v4

    new-array v1, v7, [Ljava/lang/annotation/Annotation;

    move-object v4, v5

    move-object v5, v1

    const-string v1, "io.getstream.video.android.model.UserType"

    invoke-direct/range {v0 .. v5}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
