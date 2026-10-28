.class public final Lw33/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lw33/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw33/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lw33/a;->w:Lw33/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    new-instance v0, Lwc3/g;

    const-class v1, Lio/getstream/video/android/core/filter/FilterObject;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v1, 0x0

    new-array v3, v1, [Lj93/d;

    new-array v4, v1, [Lwc3/c;

    new-array v5, v1, [Ljava/lang/annotation/Annotation;

    const-string v1, "io.getstream.video.android.core.filter.FilterObject"

    invoke-direct/range {v0 .. v5}, Lwc3/g;-><init>(Ljava/lang/String;Lj93/d;[Lj93/d;[Lwc3/c;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
