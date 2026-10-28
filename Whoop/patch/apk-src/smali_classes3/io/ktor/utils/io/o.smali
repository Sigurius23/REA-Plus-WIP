.class public final Lio/ktor/utils/io/o;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# static fields
.field public static final w:Lio/ktor/utils/io/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/ktor/utils/io/o;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Lio/ktor/utils/io/o;->w:Lio/ktor/utils/io/o;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    new-instance v0, Lio/ktor/utils/io/m;

    sget-object v1, Lio/ktor/utils/io/internal/g;->c:Lio/ktor/utils/io/internal/f;

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lio/ktor/utils/io/m;-><init>(ZLx63/f;I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)Z

    return-object v0
.end method
