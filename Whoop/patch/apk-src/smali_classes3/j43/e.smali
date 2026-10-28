.class public abstract Lj43/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj43/c;

.field public static final b:Lj43/c;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Ll83/k;

    const-string v1, "ALL_CALL_TYPES"

    const-class v2, Lio/getstream/video/android/core/notifications/internal/service/CallService;

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v6

    new-instance v9, Ld43/a;

    invoke-direct {v9}, Ld43/a;-><init>()V

    new-instance v3, Lj43/c;

    const/4 v4, 0x1

    const/4 v5, 0x2

    const-class v7, Lio/getstream/video/android/core/notifications/internal/service/CallService;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v9}, Lj43/c;-><init>(ZILjava/util/Map;Ljava/lang/Class;ZLd43/a;)V

    sput-object v3, Lj43/e;->a:Lj43/c;

    new-instance v4, Lj43/c;

    const/4 v9, 0x0

    const/16 v10, 0x36

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-class v7, Lj43/f;

    invoke-direct/range {v4 .. v10}, Lj43/c;-><init>(ZILjava/lang/Class;ZLd43/a;I)V

    sput-object v4, Lj43/e;->b:Lj43/c;

    new-instance v0, Ll83/k;

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    new-instance v0, Ld43/c;

    invoke-direct {v0}, Ld43/c;-><init>()V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    new-instance v0, Ld43/c;

    invoke-direct {v0}, Ld43/c;-><init>()V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    new-instance v0, Ld43/c;

    invoke-direct {v0}, Ld43/c;-><init>()V

    return-void
.end method
