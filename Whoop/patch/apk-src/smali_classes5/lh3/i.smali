.class public final Llh3/i;
.super Llh3/k;
.source "SourceFile"


# static fields
.field public static final y:[Ljava/lang/Object;


# instance fields
.field public final x:Llh3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Llh3/i;->y:[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Llh3/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lxg3/g;-><init>(Lxg3/e;)V

    iput-object p1, p0, Llh3/i;->x:Llh3/d;

    return-void
.end method


# virtual methods
.method public final onCompleted()V
    .locals 1

    iget-object v0, p0, Llh3/i;->x:Llh3/d;

    invoke-virtual {v0}, Llh3/d;->onCompleted()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Llh3/i;->x:Llh3/d;

    invoke-virtual {v0, p1}, Llh3/d;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Llh3/i;->x:Llh3/d;

    invoke-virtual {v0, p1}, Llh3/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method
