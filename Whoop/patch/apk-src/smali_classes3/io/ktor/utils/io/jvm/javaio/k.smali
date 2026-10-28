.class public final Lio/ktor/utils/io/jvm/javaio/k;
.super Lbc3/z;
.source "SourceFile"


# static fields
.field public static final w:Lio/ktor/utils/io/jvm/javaio/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/ktor/utils/io/jvm/javaio/k;

    invoke-direct {v0}, Lbc3/z;-><init>()V

    sput-object v0, Lio/ktor/utils/io/jvm/javaio/k;->w:Lio/ktor/utils/io/jvm/javaio/k;

    return-void
.end method


# virtual methods
.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "block"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final isDispatchNeeded(Lq83/j;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method
