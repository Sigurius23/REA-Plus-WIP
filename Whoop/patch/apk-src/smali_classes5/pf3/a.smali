.class public final Lpf3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lpf3/a;

.field public static b:Lnf3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpf3/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lpf3/a;->a:Lpf3/a;

    return-void
.end method


# virtual methods
.method public final a()Lnf3/a;
    .locals 2

    sget-object v0, Lpf3/a;->b:Lnf3/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
