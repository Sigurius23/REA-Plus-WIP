.class public final Lio/getstream/video/android/model/f;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lio/getstream/video/android/model/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/video/android/model/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lio/getstream/video/android/model/f;->w:Lio/getstream/video/android/model/f;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lkotlinx/serialization/internal/ObjectSerializer;

    sget-object v1, Lio/getstream/video/android/model/UserType$Authenticated;->INSTANCE:Lio/getstream/video/android/model/UserType$Authenticated;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    const-string v3, "io.getstream.video.android.model.UserType.Authenticated"

    invoke-direct {v0, v3, v1, v2}, Lkotlinx/serialization/internal/ObjectSerializer;-><init>(Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
