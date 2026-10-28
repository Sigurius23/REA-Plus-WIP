.class public final Lyg3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lyg3/a;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyg3/a;

    invoke-direct {v0}, Lyg3/a;-><init>()V

    sput-object v0, Lyg3/a;->b:Lyg3/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lyg3/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method
