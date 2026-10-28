.class public final Loc3/a;
.super Lq83/a;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/CoroutineExceptionHandler;


# static fields
.field public static final w:Loc3/a;

.field public static final x:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Loc3/a;

    sget-object v1, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {v0, v1}, Lq83/a;-><init>(Lq83/i;)V

    sput-object v0, Loc3/a;->w:Loc3/a;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Loc3/a;->x:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Loc3/a;

    if-nez v0, :cond_1

    instance-of p1, p1, Loc3/b;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final handleException(Lq83/j;Ljava/lang/Throwable;)V
    .locals 0

    sget-object p1, Loc3/a;->x:Ljava/lang/Object;

    monitor-enter p1

    monitor-exit p1

    return-void
.end method
